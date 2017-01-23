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
		assertEquals("normal", outcome.getRiskLevel());
		assertEquals(null, outcome.getReason());
		assertEquals("Payment complete.", outcome.getSellerMessage());
		assertEquals("authorized", outcome.getType());
	}

	public void testDeserializeWithRule() throws StripeException, IOException {
		String json = resource("charge_outcome_with_rule.json");
		ChargeOutcome outcome = APIResource.GSON.fromJson(json, ChargeOutcome.class);

		assertEquals("approved_by_network", outcome.getNetworkStatus());
		assertEquals("elevated", outcome.getRiskLevel());
		assertEquals("elevated_risk_level", outcome.getReason());
		assertEquals("Stripe evaluated this charge as having elevated risk, and placed it in your manual review queue.", outcome.getSellerMessage());
		assertEquals("manual_review", outcome.getType());

		ChargeOutcomeRule rule = outcome.getRule();
		assertEquals("manual_review", rule.getAction());
		assertEquals(":risk_level: = 'elevated'", rule.getPredicate());
	}
}
