package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class PagingIteratorTest extends BaseStripeTest {
  /**
   * The most simple possible model. Handy for eliminating other variables while
   * we test some of the nitty gritty of pagination.
   */
  private static class PageableModel extends ApiResource implements HasId {
    String id;

    public static PageableModelCollection list(Map<String, Object> params,
        RequestOptions options)
        throws AuthenticationException, InvalidRequestException,
        ApiConnectionException, CardException, ApiException {
      return requestCollection(classUrl(PageableModel.class), params,
          PageableModelCollection.class, options);
    }

    @Override
    public String getId() {
      return id;
    }
  }

  private static class PageableModelCollection extends StripeCollection<PageableModel> {
  }

  /**
   * Sets the mock page fixtures.
   */
  @Before
  public void setUpMockPages() throws IOException, StripeException {
    final List<String> pages = new ArrayList<String>();
    pages.add(getResourceAsString("/model_fixtures/pageable_model_page_0.json"));
    pages.add(getResourceAsString("/model_fixtures/pageable_model_page_1.json"));
    pages.add(getResourceAsString("/model_fixtures/pageable_model_page_2.json"));

    Mockito
        .doAnswer(new Answer<PageableModelCollection>() {
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
        .when(networkSpy).request(
          Mockito.any(ApiResource.RequestMethod.class),
          Mockito.anyString(),
          Mockito.<Map<String, Object>>any(),
          Mockito.<Class<PageableModelCollection>>any(),
          Mockito.any(ApiResource.RequestType.class),
          Mockito.<RequestOptions>any()
      );
  }

  @Test
  public void testAutoPagination() throws IOException, StripeException {
    // set some arbitrary parameters so that we can verify that they're
    // used for requests on ALL pages
    final Map<String, Object> page0Params = new HashMap<String, Object>();
    page0Params.put("foo", "bar");

    final Map<String, Object> page1Params = new HashMap<String, Object>();
    page1Params.put("foo", "bar");
    page1Params.put("starting_after", "pm_124");

    final Map<String, Object> page2Params = new HashMap<String, Object>();
    page2Params.put("foo", "bar");
    page2Params.put("starting_after", "pm_126");

    final PageableModelCollection collection = PageableModel.list(page0Params, null);

    final List<PageableModel> models = new ArrayList<PageableModel>();
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
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page0Params
    );
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page1Params
    );
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page2Params
    );
    verifyNoMoreInteractions(networkSpy);
  }

  @Test
  public void testAutoPaginationWithParams() throws IOException, StripeException {
    // set some arbitrary parameters so that we can verify that the
    // parameters passed to autoPagingIterable() override the initial
    // collection parameters
    final Map<String, Object> page0Params = new HashMap<String, Object>();
    page0Params.put("foo", "bar");

    final Map<String, Object> autoPagingParams = new HashMap<String, Object>();
    autoPagingParams.put("foo", "baz");

    final Map<String, Object> page1Params = new HashMap<String, Object>();
    page1Params.put("foo", "baz");
    page1Params.put("starting_after", "pm_124");

    final Map<String, Object> page2Params = new HashMap<String, Object>();
    page2Params.put("foo", "baz");
    page2Params.put("starting_after", "pm_126");

    final RequestOptions options = (new RequestOptionsBuilder()).setApiKey("sk_paging_key").build();
    final PageableModelCollection collection = PageableModel.list(page0Params, options);

    final List<PageableModel> models = new ArrayList<PageableModel>();
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
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page0Params,
        null,
        options
    );
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page1Params,
        null,
        options
    );
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/pageable_models",
        page2Params,
        null,
        options
    );
    verifyNoMoreInteractions(networkSpy);
  }
}
