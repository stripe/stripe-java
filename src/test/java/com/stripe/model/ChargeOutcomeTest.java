package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChargeOutcomeTest extends BaseStripeTest {
	@Test
	public void testDeserialize() throws StripeException, IOException {
		String json = resource("charge_outcome.json");
		ChargeOutcome outcome = APIResource.GSON.fromJson(json, ChargeOutcome.class);

		assertEquals("approved_by_network", outcome.getNetworkStatus());
		assertEquals(null, outcome.getReason());
		assertEquals("Payment complete.", outcome.getSellerMessage());
		assertEquals("authorized", outcome.getType());
	}
}
