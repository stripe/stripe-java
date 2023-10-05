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
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import com.stripe.param.SubscriptionSearchParams;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class SearchPagingIteratorTest extends BaseStripeTest {
  private static class SearchableModel extends ApiResource implements HasId {
    String id;

    public static SearchableModelCollection search(
        Map<String, Object> params, RequestOptions options) throws StripeException {
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              RequestMethod.GET,
              "/v1/searchable_models",
              params,
              SearchableModelCollection.class,
              options,
              ApiMode.V1);
    }

    @Override
    public String getId() {
      return id;
    }

    public SearchableModel delete() throws StripeException {
      return getResponseGetter()
          .request(
              BaseAddress.API,
              RequestMethod.DELETE,
              String.format("/v1/searchable_models/%s", getId()),
              (Map<String, Object>) null,
              SearchableModel.class,
              null,
              ApiMode.V1);
    }
  }

  private static class SearchableModelCollection extends StripeSearchResult<SearchableModel> {}

  /** Sets the mock page fixtures. */
  @BeforeEach
  public void setUpMockPages() throws IOException, StripeException {
    final List<String> pages = new ArrayList<>();
    pages.add(getResourceAsString("/model_fixtures/searchable_model_page_0.json"));
    pages.add(getResourceAsString("/model_fixtures/searchable_model_page_1.json"));
    pages.add(getResourceAsString("/model_fixtures/searchable_model_page_2.json"));

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
        .request(Mockito.any());
  }

  @Test
  public void testAutoPagination() throws StripeException {
    // set some arbitrary parameters so that we can verify that they're
    // used for requests on ALL pages
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("query", "query 1");

    final Map<String, Object> page1Params = new HashMap<>();
    page1Params.put("query", "query 1");
    page1Params.put("page", "page1");

    final Map<String, Object> page2Params = new HashMap<>();
    page2Params.put("query", "query 1");
    page2Params.put("page", "page2");

    final SearchableModelCollection collection = SearchableModel.search(page0Params, null);

    final List<SearchableModel> models = new ArrayList<>();
    for (SearchableModel model : collection.autoPagingIterable()) {
      models.add(model);
    }

    assertEquals(5, collection.getTotalCount());
    assertEquals(5, models.size());
    assertEquals("pm_123", models.get(0).getId());
    assertEquals("pm_124", models.get(1).getId());
    assertEquals("pm_125", models.get(2).getId());
    assertEquals("pm_126", models.get(3).getId());
    assertEquals("pm_127", models.get(4).getId());

    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/searchable_models", page0Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/searchable_models", page1Params, null);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/searchable_models", page2Params, null);
    Mockito.verify(networkSpy).validateRequestOptions(Mockito.<RequestOptions>any());
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPaginationWithParams() throws StripeException {
    // set some arbitrary parameters so that we can verify that the
    // parameters passed to autoPagingIterable() override the initial
    // collection parameters
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("query", "query 1");

    final Map<String, Object> autoPagingParams = new HashMap<>();
    autoPagingParams.put("query", "query2");

    final Map<String, Object> page1Params = new HashMap<>();
    page1Params.put("query", "query2");
    page1Params.put("page", "page1");

    final Map<String, Object> page2Params = new HashMap<>();
    page2Params.put("query", "query2");
    page2Params.put("page", "page2");

    final RequestOptions options = new RequestOptionsBuilder().setApiKey("sk_paging_key").build();
    final SearchableModelCollection collection = SearchableModel.search(page0Params, options);

    final List<SearchableModel> models = new ArrayList<>();
    for (SearchableModel model : collection.autoPagingIterable(autoPagingParams)) {
      models.add(model);
    }

    assertEquals(5, models.size());
    assertEquals("pm_123", models.get(0).getId());
    assertEquals("pm_124", models.get(1).getId());
    assertEquals("pm_125", models.get(2).getId());
    assertEquals("pm_126", models.get(3).getId());
    assertEquals("pm_127", models.get(4).getId());

    // First request made using a static method
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/searchable_models",
        page0Params,
        options);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/searchable_models",
        page1Params,
        options);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/searchable_models",
        page2Params,
        options);
    Mockito.verify(networkSpy).validateRequestOptions(Mockito.<RequestOptions>any());
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPaginationWithoutApiKey() throws StripeException {

    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("query", "query 1");

    final SearchableModelCollection collection = SearchableModel.search(page0Params, null);

    Stripe.apiKey = null;
    assertThrows(
        ApiKeyMissingException.class,
        () -> {
          collection.autoPagingIterable();
        });
  }

  @Test
  public void testPropagatesResponseGetter() throws Exception {
    Mockito.doAnswer((Answer<SearchableModel>) invocation -> new SearchableModel())
        .when(networkSpy)
        .request(
            Mockito.<BaseAddress>any(),
            Mockito.eq(ApiResource.RequestMethod.DELETE),
            Mockito.anyString(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<Class<SearchableModel>>any(),
            Mockito.<RequestOptions>any(),
            Mockito.<ApiMode>any());

    final String data = getResourceAsString("/model_fixtures/searchable_model_page_0.json");
    SearchableModelCollection collection =
        ApiResource.GSON.fromJson(data, SearchableModelCollection.class);

    collection.setResponseGetter(networkSpy);

    SearchableModel model = collection.getData().get(1);

    model.delete();

    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/searchable_models/%s", model.getId()),
        null,
        null);
  }

  @Test
  public void testAutoPaginationRequestOptionsPropagation() throws StripeException {
    final Map<String, Object> page0Params = new HashMap<>();
    page0Params.put("foo", "bar");

    Stripe.apiKey = null;
    final SearchableModelCollection collection =
        SearchableModel.search(
            page0Params, RequestOptions.builder().setApiKey("sk_test_xyz").build());
    assertEquals(collection.getRequestOptions().getApiKey(), "sk_test_xyz");
    final List<SearchableModel> models = new ArrayList<>();

    for (SearchableModel model : collection.autoPagingIterable()) {
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
            "{\"object\": \"search_result\", \"url\": \"/v1/subscriptions/search\", \"data\": [{\"object\": \"subscription\", \"id\": \"1\"}], \"has_more\": true, \"next_page\": "
                + "\"/v1/subscriptions/search?page=2\"}");
    StripeResponse secondResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"search_result\", \"url\": \"/v1/subscriptions\", \"data\": [{\"object\": \"subscription\", \"id\": \"2\"}], \"has_more\": false}");

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
    for (final Subscription sub :
        mockClient
            .subscriptions()
            .search(SubscriptionSearchParams.builder().build())
            .autoPagingIterable()) {
      assertInstanceOf(Subscription.class, sub);
      seen.add(sub.getId());
    }
    assertEquals(2, seen.size());
  }
}
