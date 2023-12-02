package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.ApiKeyMissingException;
import com.stripe.exception.StripeException;
import com.stripe.net.*;
import com.stripe.net.ApiMode;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class PagingIteratorTest extends BaseStripeTest {
  /**
   * The most simple possible model. Handy for eliminating other variables while we test some of the
   * nitty gritty of pagination.
   */
  private static class PageableModel extends ApiResource implements HasId {
    String id;

    public static PageableModelCollection list(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              RequestMethod.GET,
              "/v1/pageable_models",
              params,
              PageableModelCollection.class,
              options,
              ApiMode.V1);
    }

    @Override
    public String getId() {
      return id;
    }

    public PageableModel delete() throws StripeException {
      return getResponseGetter()
          .request(
              BaseAddress.API,
              RequestMethod.DELETE,
              String.format("/v1/pageable_models/%s", getId()),
              (Map<String, Object>) null,
              PageableModel.class,
              null,
              ApiMode.V1);
    }
  }

  private static class PageableModelCollection extends StripeCollection<PageableModel> {}

  /**
   * A model with a property that is a PageableModelCollection.
   *
   * <p>It's worth testing this case too, as there are some differences between autopaginating on a
   * collection on an object vs. autopagination on a collection that is the result of a list
   * request.
   */
  private static class ReferencesPageableModel extends ApiResource implements HasId {
    String id;

    @Getter PageableModelCollection pages;

    public static ReferencesPageableModel retrieve(RequestOptions options) throws StripeException {
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.GET,
              "/v1/references_pageable_models",
              new HashMap<String, Object>(),
              ReferencesPageableModel.class,
              options,
              ApiMode.V1);
    }

    @Override
    public String getId() {
      return id;
    }

    @Override
    public void setResponseGetter(StripeResponseGetter srg) {
      super.setResponseGetter(srg);

      trySetResponseGetter(pages, srg);
    }
  }

  /** Sets the mock page fixtures. */
  @BeforeEach
  public void setUpMockPages() throws IOException, StripeException {
    final List<String> pages;
    pages = new ArrayList<>();
    pages.add(getResourceAsString("/model_fixtures/pageable_model_page_0.json"));
    pages.add(getResourceAsString("/model_fixtures/pageable_model_page_1.json"));
    pages.add(getResourceAsString("/model_fixtures/pageable_model_page_2.json"));

    Mockito.doAnswer(
            new Answer<StripeResponse>() {
              private int count = 0;

              // essentially all we're doing here is returning the first page of
              // results on the first request and the second page of results on
              // the second
              @Override
              public StripeResponse answer(InvocationOnMock invocation) {
                if (count >= pages.size()) {
                  throw new RuntimeException("Page out of bounds");
                }

                return new StripeResponse(
                    200, HttpHeaders.of(Collections.emptyMap()), pages.get(count++));
              }
            })
        .when(httpClientSpy)
        .request(Mockito.<StripeRequest>any());
  }

  @Test
  void testAutoPaginationFromReferencedCollection() throws StripeException, IOException {
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        200,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"id\": \"xyz\", \"pages\": {\"data\": [{\"id\": \"pm_121\"}, {\"id\": \"pm_122\"}], \"url\": \"/v1/pageable_models\", \"has_more\": true}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    Stripe.apiKey = null;
    ReferencesPageableModel model =
        ReferencesPageableModel.retrieve(RequestOptions.builder().setApiKey("sk_test_xyz").build());

    // The RequestOptions DOES NOT flow from a request
    // to collection properties on the response
    assertEquals(model.getPages().getRequestOptions(), null);
    setUpMockPages();

    final List<PageableModel> models = new ArrayList<>();
    for (PageableModel m :
        model
            .getPages()
            .autoPagingIterable(
                new HashMap<String, Object>(),
                RequestOptions.builder().setApiKey("sk_test_abc").build())) {
      models.add(m);
    }
    assertEquals(7, models.size());
    assertEquals("pm_121", models.get(0).getId());
    assertEquals("pm_122", models.get(1).getId());
    assertEquals("pm_123", models.get(2).getId());
    assertEquals("pm_124", models.get(3).getId());
    assertEquals("pm_125", models.get(4).getId());
    assertEquals("pm_126", models.get(5).getId());
    assertEquals("pm_127", models.get(6).getId());

    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("starting_after", "pm_122");

    final Map<String, Object> page1Params = new HashMap<>();
    page1Params.put("starting_after", "pm_124");

    final Map<String, Object> page2Params = new HashMap<>();
    page2Params.put("starting_after", "pm_126");

    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/references_pageable_models",
        null,
        null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/pageable_models", page0Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/pageable_models", page1Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/pageable_models", page2Params, null);
    Mockito.verify(networkSpy).validateRequestOptions(Mockito.<RequestOptions>any());
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPagination() throws StripeException {
    // set some arbitrary parameters so that we can verify that they're
    // used for requests on ALL pages
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    final Map<String, Object> page1Params = new HashMap<>();
    page1Params.put("foo", "bar");
    page1Params.put("starting_after", "pm_124");

    final Map<String, Object> page2Params = new HashMap<>();
    page2Params.put("foo", "bar");
    page2Params.put("starting_after", "pm_126");

    final RequestOptions ro = RequestOptions.builder().build();

    final PageableModelCollection collection = PageableModel.list(page0Params, ro);

    // RequestOptions DO flow from a list method to the
    // collection that is the response.
    assertEquals(collection.getRequestOptions(), ro);

    final List<PageableModel> models = new ArrayList<>();
    for (PageableModel model : collection.autoPagingIterable()) {
      models.add(model);
    }

    assertEquals(5, models.size());
    assertEquals("pm_123", models.get(0).getId());
    assertEquals("pm_124", models.get(1).getId());
    assertEquals("pm_125", models.get(2).getId());
    assertEquals("pm_126", models.get(3).getId());
    assertEquals("pm_127", models.get(4).getId());

    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/pageable_models", page0Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/pageable_models", page1Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/pageable_models", page2Params, null);

    Mockito.verify(networkSpy).validateRequestOptions(Mockito.<RequestOptions>any());
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPaginationWithParams() throws StripeException {
    // set some arbitrary parameters so that we can verify that the
    // parameters passed to autoPagingIterable() override the initial
    // collection parameters
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    final Map<String, Object> autoPagingParams = new HashMap<>();
    autoPagingParams.put("foo", "baz");

    final Map<String, Object> page1Params = new HashMap<>();
    page1Params.put("foo", "baz");
    page1Params.put("starting_after", "pm_124");

    final Map<String, Object> page2Params = new HashMap<>();
    page2Params.put("foo", "baz");
    page2Params.put("starting_after", "pm_126");

    final RequestOptions options = new RequestOptionsBuilder().setApiKey("sk_paging_key").build();
    final PageableModelCollection collection = PageableModel.list(page0Params, options);

    final List<PageableModel> models = new ArrayList<>();
    for (PageableModel model : collection.autoPagingIterable(autoPagingParams)) {
      models.add(model);
    }

    assertEquals(5, models.size());
    assertEquals("pm_123", models.get(0).getId());
    assertEquals("pm_124", models.get(1).getId());
    assertEquals("pm_125", models.get(2).getId());
    assertEquals("pm_126", models.get(3).getId());
    assertEquals("pm_127", models.get(4).getId());

    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page0Params,
        options);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page1Params,
        options);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page2Params,
        options);
    Mockito.verify(networkSpy).validateRequestOptions(Mockito.<RequestOptions>any());
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  void testAutoPaginationWithoutApiKey() throws StripeException {
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    final PageableModelCollection collection = PageableModel.list(page0Params, null);

    Stripe.apiKey = null;
    assertThrows(
        ApiKeyMissingException.class,
        () -> {
          collection.autoPagingIterable();
        });
  }

  @Test
  public void testPropagatesResponseGetter() throws Exception {
    Mockito.doAnswer((Answer<PageableModel>) invocation -> new PageableModel())
        .when(networkSpy)
        .request(
            Mockito.<ApiRequest>argThat(
                (req) -> {
                  return req.getMethod() == ApiResource.RequestMethod.GET;
                }),
            Mockito.<Class<PageableModelCollection>>any());

    final String data = getResourceAsString("/model_fixtures/pageable_model_page_0.json");
    PageableModelCollection collection =
        ApiResource.GSON.fromJson(data, PageableModelCollection.class);

    collection.setResponseGetter(networkSpy);

    PageableModel model = collection.getData().get(1);

    model.delete();

    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/pageable_models/%s", model.getId()),
        null,
        null);
  }

  @Test
  public void testAutoPaginationRequestOptionsPropagation() throws StripeException {
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    Stripe.apiKey = null;
    final PageableModelCollection collection =
        PageableModel.list(page0Params, RequestOptions.builder().setApiKey("sk_test_xyz").build());
    assertEquals(collection.getRequestOptions().getApiKey(), "sk_test_xyz");
    final List<PageableModel> models = new ArrayList<>();

    for (PageableModel model : collection.autoPagingIterable()) {
      models.add(model);
    }

    assertEquals(5, models.size());
    assertEquals("pm_123", models.get(0).getId());
    assertEquals("pm_124", models.get(1).getId());
    assertEquals("pm_125", models.get(2).getId());
    assertEquals("pm_126", models.get(3).getId());
    assertEquals("pm_127", models.get(4).getId());
  }

  @Test
  public void testPaginationWithStripeClient() throws StripeException {
    StripeResponse firstResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"list\", \"url\": \"/v1/subscriptions\", \"data\": [{\"object\": \"subscription\", \"id\": \"1\"}], \"has_more\": true}");
    StripeResponse secondResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"list\", \"url\": \"/v1/subscriptions\", \"data\": [{\"object\": \"subscription\", \"id\": \"2\"}], \"has_more\": false}");

    AtomicInteger count = new AtomicInteger(0);
    Mockito.doAnswer(
            new Answer<StripeResponse>() {
              public StripeResponse answer(InvocationOnMock invocation) {
                if (count.getAndIncrement() == 0) {
                  return firstResponse;
                }
                return secondResponse;
              }
            })
        .when(httpClientSpy)
        .requestWithRetries(Mockito.<StripeRequest>any());
    List<String> seen = new ArrayList<String>();
    for (final Subscription sub : mockClient.subscriptions().list().autoPagingIterable()) {
      assertInstanceOf(Subscription.class, sub);
      seen.add(sub.getId());
    }
    assertEquals(2, seen.size());
  }
}
