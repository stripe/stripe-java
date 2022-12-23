package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.ApiKeyMissingException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
      return requestCollection(
          String.format("%s/v1/pageable_models", Stripe.getApiBase()),
          params,
          PageableModelCollection.class,
          options);
    }

    @Override
    public String getId() {
      return id;
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
      return request(
          ApiResource.RequestMethod.GET,
          String.format("%s/v1/references_pageable_models", Stripe.getApiBase()),
          new HashMap<String, Object>(),
          ReferencesPageableModel.class,
          options);
    }

    @Override
    public String getId() {
      return id;
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
            new Answer<PageableModelCollection>() {
              private int count = 0;

              // essentially all we're doing here is returning the first page of
              // results on the first request and the second page of results on
              // the second
              @Override
              public PageableModelCollection answer(InvocationOnMock invocation) {
                if (count >= pages.size()) {
                  throw new RuntimeException("Page out of bounds");
                }

                return ApiResource.GSON.fromJson(pages.get(count++), PageableModelCollection.class);
              }
            })
        .when(networkSpy)
        .request(
            Mockito.any(ApiResource.RequestMethod.class),
            Mockito.anyString(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<Class<PageableModelCollection>>any(),
            Mockito.<RequestOptions>any());
  }

  @Test
  void testAutoPaginationFromReferencedCollection() throws StripeException, IOException {
    Mockito.doAnswer(
            new Answer<ReferencesPageableModel>() {
              @Override
              public ReferencesPageableModel answer(InvocationOnMock invocation) throws Exception {
                return ApiResource.GSON.fromJson(
                    "{\"id\": \"xyz\", \"pages\": {\"data\": [{\"id\": \"pm_121\"}, {\"id\": \"pm_122\"}], \"url\": \"/v1/pageable_models\", \"has_more\": true}}",
                    ReferencesPageableModel.class);
              }
            })
        .when(networkSpy)
        .request(
            Mockito.any(ApiResource.RequestMethod.class),
            Mockito.anyString(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<Class<ReferencesPageableModel>>any(),
            Mockito.<RequestOptions>any());
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

    verifyRequest(ApiResource.RequestMethod.GET, "/v1/references_pageable_models");
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page0Params);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page1Params);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page2Params);
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

    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page0Params);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page1Params);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page2Params);
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

    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page0Params, options);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page1Params, options);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/pageable_models", page2Params, options);
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
}
