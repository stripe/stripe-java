package com.stripe.model;

import com.stripe.BaseStripeStubTest;
import com.stripe.net.APIResource;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class ChargeOutcomeTest extends BaseStripeStubTest {
	@Test
	public void testDeserialize() throws Exception {
		String chargeData = getFixture("/v1/charges/ch_123");
		String data = getDataAt(chargeData, "outcome");
		ChargeOutcome object = APIResource.GSON.fromJson(data, ChargeOutcome.class);
		assertNotNull(object);
		assertNotNull(object.getNetworkStatus());
	}

	@Test
	public void testDeserializeWithExpansions() throws Exception {
		// Specify expansions manually because it's a nested resource
		String[] expansions = { "outcome.rule" };
		String chargeData = getFixture("/v1/charges/ch_123", expansions);
		String data = getDataAt(chargeData, "outcome");
		ChargeOutcome object = APIResource.GSON.fromJson(data, ChargeOutcome.class);
		assertNotNull(object);
		assertNotNull(object.getRule());
	}
}
