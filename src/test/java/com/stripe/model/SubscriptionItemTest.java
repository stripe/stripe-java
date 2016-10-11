package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.SubscriptionItem;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import org.junit.After;
import org.junit.Before;
import junit.framework.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class SubscriptionItemTest extends BaseStripeTest {

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
	public void testRetrieve() throws StripeException {
		SubscriptionItem.retrieve("test_item");

		verifyGet(SubscriptionItem.class, "https://api.stripe.com/v1/subscription_items/test_item");
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testList() throws StripeException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("limit", 3);
		params.put("subscription", "test_sub");

		SubscriptionItem.list(params);

		verifyGet(SubscriptionItemCollection.class, "https://api.stripe.com/v1/subscription_items", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testUpdate() throws StripeException {
		SubscriptionItem item = new SubscriptionItem();
		item.setId("test_item");

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("plan", "gold");

		item.update(params);

		verifyPost(SubscriptionItem.class, "https://api.stripe.com/v1/subscription_items/test_item", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testCreate() throws StripeException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("subscription", "sub_8OgUootyH2faMz");
		params.put("plan", "gold");
		params.put("quantity", 2);

		SubscriptionItem item = SubscriptionItem.create(params);

		verifyPost(SubscriptionItem.class, "https://api.stripe.com/v1/subscription_items", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testDelete() throws StripeException {
		SubscriptionItem item = new SubscriptionItem();
		item.setId("test_item");

		item.delete();

		verifyDelete(DeletedSubscriptionItem.class, "https://api.stripe.com/v1/subscription_items/test_item");
		verifyNoMoreInteractions(networkMock);
	}
}