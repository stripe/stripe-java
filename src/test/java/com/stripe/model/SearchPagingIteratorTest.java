package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
      return requestSearchResult(
          classUrl(SearchableModel.class), params, SearchableModelCollection.class, options);
    }

    @Override
    public String getId() {
      return id;
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
            new Answer<SearchableModelCollection>() {
              private int count = 0;

              // essentially all we're doing here is returning the first page of
              // results on the first request and the second page of results on
              // the second
              @Override
              public SearchableModelCollection answer(InvocationOnMock invocation) {
                if (count >= pages.size()) {
                  throw new RuntimeException("Page out of bounds");
                }

                return ApiResource.GSON.fromJson(
                    pages.get(count++), SearchableModelCollection.class);
              }
            })
        .when(networkSpy)
        .request(
            Mockito.any(ApiResource.RequestMethod.class),
            Mockito.anyString(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<Class<SearchableModelCollection>>any(),
            Mockito.<RequestOptions>any());
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

    verifyRequest(ApiResource.RequestMethod.GET, "/v1/searchable_models", page0Params);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/searchable_models", page1Params);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/searchable_models", page2Params);
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

    verifyRequest(ApiResource.RequestMethod.GET, "/v1/searchable_models", page0Params, options);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/searchable_models", page1Params, options);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/searchable_models", page2Params, options);
    verifyNoMoreInteractions(networkSpy);
  }
}
