package com.stripe.functional.v2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.google.gson.reflect.TypeToken;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeSearchResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.HttpHeaders;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class StripeSearchResultTest extends BaseStripeTest {
  private static class SearchableModel extends ApiResource {
    String id;
  }

  private static class SearchService extends ApiService {
    SearchService(StripeResponseGetter getter) {
      super(getter);
    }

    StripeSearchResult<SearchableModel> searchRequest(ApiRequest request) throws StripeException {
      return this.requestV2Search(
          request, new TypeToken<StripeSearchResult<SearchableModel>>() {}.getType());
    }

    StripeSearchResult<SearchableModel> search(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      return this.requestV2Search(
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              "/v2/widgets/search",
              params,
              options),
          new TypeToken<StripeSearchResult<SearchableModel>>() {}.getType());
    }
  }

  @Test
  public void searchHelperPreparesOneRequestAndPreservesMetadata() throws Exception {
    for (String path :
        Arrays.asList(
            "/v2/widgets/search",
            "/v2/widgets/search?page=2&limit=2",
            "/v2/widgets/search?page=2")) {
      StripeResponseGetter getter = Mockito.mock(StripeResponseGetter.class);
      SearchService service = new SearchService(getter);
      Map<String, Object> params = new HashMap<>();
      params.put("limit", 9L);
      params.put("query", "widgets");
      RequestOptions options = RequestOptions.builder().setStripeContext("ctx_123").build();
      ApiRequest original =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options)
              .addUsage("original_usage");
      service.searchRequest(original);
      ArgumentCaptor<ApiRequest> captured = ArgumentCaptor.forClass(ApiRequest.class);
      Mockito.verify(getter, Mockito.times(1)).request(captured.capture(), Mockito.any());
      ApiRequest prepared = captured.getValue();
      assertEquals(path.contains("?") ? path : path + "?limit=9", prepared.getPath());
      assertEquals(Collections.singletonMap("query", "widgets"), prepared.getParams());
      assertEquals(BaseAddress.API, prepared.getBaseAddress());
      assertEquals(original.getMethod(), prepared.getMethod());
      assertEquals(options, prepared.getOptions());
      assertEquals(Arrays.asList("original_usage", "stripe_client"), prepared.getUsage());
      assertEquals(9L, params.get("limit"));
      assertEquals(path, original.getPath());
      verifyNoMoreInteractions(getter);
    }
  }

  @Test
  public void searchHelperSupportsAbsentParamsAndLimit() throws Exception {
    for (Map<String, Object> params :
        Arrays.<Map<String, Object>>asList(null, Collections.singletonMap("query", "widgets"))) {
      StripeResponseGetter getter = Mockito.mock(StripeResponseGetter.class);
      new SearchService(getter)
          .searchRequest(
              new ApiRequest(
                  BaseAddress.API,
                  ApiResource.RequestMethod.POST,
                  "/v2/widgets/search",
                  params,
                  null));
      ArgumentCaptor<ApiRequest> captured = ArgumentCaptor.forClass(ApiRequest.class);
      Mockito.verify(getter).request(captured.capture(), Mockito.any());
      assertEquals("/v2/widgets/search", captured.getValue().getPath());
      assertEquals(params, captured.getValue().getParams());
      verifyNoMoreInteractions(getter);
    }
  }

  @Test
  public void ordinaryCustomSearchRequestKeepsLimitInBody() {
    Map<String, Object> params = Collections.singletonMap("limit", 2L);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            "/v2/data/operations/search",
            params,
            null);
    assertEquals("/v2/data/operations/search", request.getPath());
    assertEquals(params, request.getParams());
    assertEquals(params, request.addUsage("stripe_client").getParams());
  }

  @Test
  public void autoPagingReplaysOriginalPostBodyAcrossEmptyPages() throws Exception {
    List<String> pages =
        new ArrayList<>(
            Arrays.asList(
                "{\"object\":\"v2.search_result\",\"data\":[{\"id\":\"one\"}],\"next_page_url\":\"/v2/widgets/search?page=2&limit=2\",\"total_count\":2}",
                "{\"object\":\"v2.search_result\",\"data\":[],\"next_page_url\":\"/v2/widgets/search?page=3&limit=2\",\"total_count\":2}",
                "{\"object\":\"v2.search_result\",\"data\":[{\"id\":\"two\"}],\"next_page_url\":null,\"total_count\":2}"));
    Mockito.doAnswer(
            invocation ->
                new StripeResponse(200, HttpHeaders.of(Collections.emptyMap()), pages.remove(0)))
        .when(httpClientSpy)
        .request(Mockito.<StripeRequest>any());

    Map<String, Object> params = new HashMap<>();
    params.put("query", "widgets");
    params.put("sort", Arrays.asList("name", "-created"));
    params.put("limit", 2L);
    params.put("future", Collections.singletonMap("enabled", true));
    RequestOptions options = RequestOptions.builder().setStripeContext("ctx_123").build();

    StripeSearchResult<SearchableModel> result =
        new SearchService(BaseStripeTest.networkSpy).search(params, options);
    List<String> ids = new ArrayList<>();
    for (SearchableModel model : result.autoPagingIterable()) {
      ids.add(model.id);
    }

    assertEquals(Arrays.asList("one", "two"), ids);
    assertEquals(2L, result.getTotalCount());
    Map<String, Object> requestBody = new HashMap<>(params);
    requestBody.remove("limit");
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/widgets/search?limit=2",
        requestBody,
        null);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/widgets/search?page=2&limit=2",
        requestBody,
        options);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/widgets/search?page=3&limit=2",
        requestBody,
        options);
    verifyNoMoreInteractions(networkSpy);
  }
}
