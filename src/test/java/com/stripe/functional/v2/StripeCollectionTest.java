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
            String.format("{\"data\": [%s], \"next_page_url\": null}", String.join(",", objs)));
      } else {
        jsonPages.add(
            String.format(
                "{\"data\": [%s], \"next_page_url\": \"/v2/pageable_models/page_%d\"}",
                String.join(",", objs), i));
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
    // used for requests on the first page only
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    final Map<String, Object> nextPageParams = new HashMap<>();

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
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/pageable_models/page_1",
        nextPageParams,
        null);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/pageable_models/page_2",
        nextPageParams,
        null);
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagingIterableWithRequestOptions() throws Exception {
    setUpMockPages("1,2", "3,4", "5");

    final RequestOptions requestOptions =
        RequestOptions.builder().setApiKey("custom_api_key").build();

    final StripeCollection<PageableModel> collection =
        new PageableService(BaseStripeTest.networkSpy).list(null, null);

    final List<PageableModel> models = new ArrayList<>();
    for (PageableModel model : collection.autoPagingIterable(requestOptions)) {
      models.add(model);
    }

    // no params needed or wanted with the nextPageUrl
    final Map<String, Object> nextPageParams = new HashMap<>();

    assertEquals(5, models.size());

    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/pageable_models", null, null);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/pageable_models/page_1",
        nextPageParams,
        requestOptions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/pageable_models/page_2",
        nextPageParams,
        requestOptions);

    verifyNoMoreInteractions(networkSpy);
  }
}
