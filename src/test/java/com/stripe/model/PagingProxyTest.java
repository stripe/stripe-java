package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PagingProxyTest extends BaseStripeTest {
	@Test
	public void testAutoPagingIterable() throws IOException, StripeException {
		String pageJSON = resource("pageable_model_page_0.json");
		PageableModelCollection page = APIResource.GSON.fromJson(pageJSON, PageableModelCollection.class);

		PagingProxy<PageableModel> pagingProxy = new PagingProxy<PageableModel>(page);

		Map<String, Object> params = new HashMap<String, Object>();
		RequestOptions options = (new RequestOptionsBuilder()).setApiKey("sk_paging_key").build();

		Iterable<PageableModel> iterable = pagingProxy.autoPagingIterable(params, options);

		// The iterator itself is pretty well tested, but make sure that we end
		// up with expected parameters and options on our page object, which is
		// the job of proxy to set.
		assertEquals(params, page.getRequestParams());
		assertEquals(options, page.getRequestOptions());
	}
}
