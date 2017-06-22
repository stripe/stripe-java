package com.stripe.model;

import com.stripe.BaseStripeStubTest;
import com.stripe.net.APIResource;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class SubscriptionTest extends BaseStripeStubTest {
	@Test
	public void testDeserialize() throws Exception {
		String data = getFixture("/v1/subscriptions/sub_123");
		Subscription object = APIResource.GSON.fromJson(data, Subscription.class);
		assertNotNull(object);
		assertNotNull(object.getId());
	}

	@Test
	public void testDeserializeWithExpansions() throws Exception {
		String[] expansions = { "*" };
		String data = getFixture("/v1/subscriptions/sub_123", expansions);
		Subscription object = APIResource.GSON.fromJson(data, Subscription.class);
		assertNotNull(object);
		assertNotNull(object.getCustomer());
	}
}
