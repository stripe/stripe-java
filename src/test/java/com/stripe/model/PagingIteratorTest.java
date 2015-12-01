package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PagingIteratorTest extends BaseStripeTest {
	@Before
	public void mockStripeResponseGetter() {
		APIResource.setStripeResponseGetter(networkMock);
	}

	@After
	public void unmockStripeResponseGetter() {
		/* This needs to be done because tests aren't isolated in Java */
		APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
	}

	@Test
	public void testAutoPagination() throws IOException, StripeException {
		final List<String> pages = new ArrayList<String>();
		pages.add(resource("pageable_model_page_0.json"));
		pages.add(resource("pageable_model_page_1.json"));
		pages.add(resource("pageable_model_page_2.json"));

		when(networkMock.request(
			Mockito.any(APIResource.RequestMethod.class),
			Mockito.anyString(),
			Mockito.<Map<String, Object>>any(),
			Mockito.<Class<PageableModelCollection>>any(),
			Mockito.any(APIResource.RequestType.class),
			Mockito.any(RequestOptions.class))
		).thenAnswer(new Answer() {
			private int count = 0;

			// essentially all we're doing here is returning the first page of
			// results on the first request and the second page of results on
			// the second
			public Object answer(InvocationOnMock invocation) {
				if (count >= pages.size()) {
					throw new RuntimeException("Page out of bounds");
				}

				return APIResource.GSON.fromJson(pages.get(count++), PageableModelCollection.class);
			}
		});

		// set some arbitrary parameters so that we can verify that they're
		// used for requests on BOTH pages
		Map<String, Object> page0Params = new HashMap<String, Object>();
		page0Params.put("foo", "bar");

		Map<String, Object> page1Params = new HashMap<String, Object>();
		page1Params.put("foo", "bar");
		page1Params.put("starting_after", "pm_124");

		Map<String, Object> page2Params = new HashMap<String, Object>();
		page2Params.put("foo", "bar");
		page2Params.put("starting_after", "pm_126");

		RequestOptions options = (new RequestOptionsBuilder()).setApiKey("sk_paging_key").build();
		PageableModelCollection collection = PageableModel.list(page0Params, options);

		List<PageableModel> models = new ArrayList<PageableModel>();
		for (PageableModel model : collection.autoPagingIterable()) {
			models.add(model);
		}

		assertEquals(5, models.size());
		assertEquals("pm_123", models.get(0).getId());
		assertEquals("pm_124", models.get(1).getId());
		assertEquals("pm_125", models.get(2).getId());
		assertEquals("pm_126", models.get(3).getId());
		assertEquals("pm_127", models.get(4).getId());

		verifyGet(PageableModelCollection.class, "https://api.stripe.com/v1/pageablemodels",
			page0Params, options);
		verifyGet(PageableModelCollection.class, "https://api.stripe.com/v1/pageablemodels",
			page1Params, options);
		verifyGet(PageableModelCollection.class, "https://api.stripe.com/v1/pageablemodels",
			page2Params, options);
		verifyNoMoreInteractions(networkMock);
	}
}

/**
 * The most simple possible model. Handy for eliminating other variables while
 * we test some of the nitty gritty of pagination.
 */
class PageableModel extends APIResource implements HasId {
	String id;

	public static PageableModelCollection list(Map<String, Object> params,
			RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(PageableModel.class), params,
			PageableModelCollection.class, options);
	}

	public String getId() {
		return id;
	}
}

class PageableModelCollection extends StripeCollection<PageableModel> {
}
