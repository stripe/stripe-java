package com.stripe.functional.v2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.google.common.base.Splitter;
import com.google.gson.reflect.TypeToken;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiResource.RequestMethod;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.HttpHeaders;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class StripeCollectionTest extends BaseStripeTest {
  private static class PageableModel extends ApiResource {
    String id;

    public String getId() {
      return id;
    }
  }

  private static class PageableService extends ApiService {
    public PageableService(StripeResponseGetter g) {
      super(g);
    }

    public StripeCollection<PageableModel> list(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      return this.getResponseGetter()
          .request(
              new ApiRequest(
                  BaseAddress.API, RequestMethod.GET, "/v2/pageable_models", params, options),
              new TypeToken<StripeCollection<PageableModel>>() {}.getType());
    }
  }

  List<String> calculateJsonPages(String... pages) {
    final List<String> jsonPages = new ArrayList<>();
    int i = 0;
    Integer nextPage = 0;
    for (final String page : pages) {
      nextPage = i++;
      if (i == pages.length) {
        nextPage = null;
      }
      List<String> objs = new ArrayList<>();
      if (!page.equals("")) {
        for (final String id : Splitter.on(',').split(page)) {
          objs.add(String.format("{\"id\": \"%s\"}", id));
        }
      }

      if (nextPage == null) {
        jsonPages.add(
            String.format("{\"data\": [%s], \"next_page\": null}", String.join(",", objs)));
      } else {
        jsonPages.add(
            String.format(
                "{\"data\": [%s], \"next_page\": \"page_%d\"}", String.join(",", objs), i));
      }
    }
    return jsonPages;
  }

  /** Sets the mock page fixtures. */
  public void setUpMockPages(String... pages) throws IOException, StripeException {
    final List<String> jsonPages = calculateJsonPages(pages);
    Mockito.doAnswer(
            new Answer<StripeResponse>() {
              private int count = 0;

              @Override
              public StripeResponse answer(InvocationOnMock invocation) {
                if (count >= pages.length) {
                  throw new RuntimeException("Page out of bounds");
                }

                return new StripeResponse(
                    200, HttpHeaders.of(Collections.emptyMap()), jsonPages.get(count++));
              }
            })
        .when(httpClientSpy)
        .request(Mockito.<StripeRequest>any());
  }

  @Test
  public void testAutoPagingIterableEmpty() throws Exception {
    setUpMockPages("");

    final Map<String, Object> params = new HashMap<>();
    final RequestOptions requestOptions = RequestOptions.builder().build();

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(params, requestOptions);
    final List<PageableModel> models = new ArrayList<>();
    System.out.println(collection);

    for (PageableModel model : collection.autoPagingIterable()) {
      models.add(model);
    }

    assertEquals(0, models.size());
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params, null);
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagingIterableSinglePage() throws Exception {
    setUpMockPages("1,2,3");

    final Map<String, Object> params = new HashMap<>();
    final RequestOptions requestOptions = RequestOptions.builder().build();

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(params, requestOptions);
    final List<PageableModel> models = new ArrayList<>();

    for (PageableModel model : collection.autoPagingIterable()) {
      models.add(model);
    }

    assertEquals(3, models.size());
    assertEquals("1", models.get(0).getId());
    assertEquals("2", models.get(1).getId());
    assertEquals("3", models.get(2).getId());
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params, null);
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagingIterableMultiplePages() throws Exception {
    setUpMockPages("1,2", "3,4", "5");
    // set some arbitrary parameters so that we can verify that they're
    // used for requests on ALL pages
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    final Map<String, Object> page1Params = new HashMap<>();
    page1Params.put("foo", "bar");
    page1Params.put("page", "page_1");

    final Map<String, Object> page2Params = new HashMap<>();
    page2Params.put("foo", "bar");
    page2Params.put("page", "page_2");

    final RequestOptions ro = RequestOptions.builder().build();

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(page0Params, ro);

    final List<PageableModel> models = new ArrayList<>();
    for (PageableModel model : collection.autoPagingIterable()) {
      models.add(model);
    }

    assertEquals(5, models.size());
    assertEquals("1", models.get(0).getId());
    assertEquals("2", models.get(1).getId());
    assertEquals("3", models.get(2).getId());
    assertEquals("4", models.get(3).getId());
    assertEquals("5", models.get(4).getId());

    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", page0Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", page1Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", page2Params, null);
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagingIterableWithParams() throws Exception {
    setUpMockPages("1,2", "3,4", "5");

    final Map<String, Object> params0 = new HashMap<>();
    params0.put("this_one", "goes_away");

    final Map<String, Object> params = new HashMap<>();
    params.put("custom_param", "value");

    final Map<String, Object> params2 = new HashMap<>();
    params2.putAll(params);
    params2.put("page", "page_1");

    final Map<String, Object> params3 = new HashMap<>();
    params3.putAll(params);
    params3.put("page", "page_2");

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(params0, null);
    final List<PageableModel> models = new ArrayList<>();

    for (PageableModel model : collection.autoPagingIterable(params)) {
      models.add(model);
    }

    assertEquals(5, models.size());
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params0, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params2, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params3, null);
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagingIterableWithRequestOptions() throws Exception {
    setUpMockPages("1,2", "3,4", "5");

    final RequestOptions requestOptions =
        RequestOptions.builder().setApiKey("custom_api_key").build();

    Map<String, Object> params2 = new HashMap<>();
    params2.put("page", "page_1");

    Map<String, Object> params3 = new HashMap<>();
    params3.put("page", "page_2");

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(null, null);

    final List<PageableModel> models = new ArrayList<>();
    for (PageableModel model : collection.autoPagingIterable(null, requestOptions)) {
      models.add(model);
    }

    assertEquals(5, models.size());

    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", null, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params2, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params3, null);

    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagingIterableWithParamsAndRequestOptions() throws Exception {
    setUpMockPages("1,2", "3,4", "5");

    final Map<String, Object> params0 = new HashMap<>();
    params0.put("this_param", "only_on_initial_request");

    final Map<String, Object> params = new HashMap<>();
    params.put("custom_param", "value");

    Map<String, Object> params2 = new HashMap<>();
    params2.putAll(params);
    params2.put("page", "page_1");

    Map<String, Object> params3 = new HashMap<>();
    params3.putAll(params);
    params3.put("page", "page_2");

    final RequestOptions requestOptions =
        RequestOptions.builder().setApiKey("custom_api_key").build();

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(params0, null);
    final List<PageableModel> models = new ArrayList<>();

    for (PageableModel model : collection.autoPagingIterable(params, requestOptions)) {
      models.add(model);
    }

    assertEquals(5, models.size());
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params0, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params2, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", params3, null);

    verifyNoMoreInteractions(networkSpy);
  }
}
