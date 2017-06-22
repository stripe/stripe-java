package com.stripe.model;

import com.stripe.BaseStripeStubTest;
import com.stripe.net.APIResource;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class PlanTest extends BaseStripeStubTest {
	@Test
	public void testDeserialize() throws Exception {
		String data = getFixture("/v1/plans/gold");
		Plan object = APIResource.GSON.fromJson(data, Plan.class);
		assertNotNull(object);
		assertNotNull(object.getId());
	}
}
