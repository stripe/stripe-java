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
import org.mockito.Mockito;

public class StripeSearchResultTest extends BaseStripeTest {
  private static class SearchableModel extends ApiResource {
    String id;
  }

  private static class SearchService extends ApiService {
    SearchService(StripeResponseGetter getter) {
      super(getter);
    }

    StripeSearchResult<SearchableModel> search(
        Map<String, Object> params, RequestOptions options) throws StripeException {
      return this.getResponseGetter()
          .request(
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
  public void autoPagingReplaysOriginalPostBodyAcrossEmptyPages() throws Exception {
    List<String> pages =
        new ArrayList<>(Arrays.asList(
            "{\"object\":\"v2.search_result\",\"data\":[{\"id\":\"one\"}],\"next_page_url\":\"/v2/widgets/search?page=2\",\"total_count\":2}",
            "{\"object\":\"v2.search_result\",\"data\":[],\"next_page_url\":\"/v2/widgets/search?page=3\",\"total_count\":2}",
            "{\"object\":\"v2.search_result\",\"data\":[{\"id\":\"two\"}],\"next_page_url\":null,\"total_count\":2}"));
    Mockito.doAnswer(
            invocation ->
                new StripeResponse(
                    200, HttpHeaders.of(Collections.emptyMap()), pages.remove(0)))
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
