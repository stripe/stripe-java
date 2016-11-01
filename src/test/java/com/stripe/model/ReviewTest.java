package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest extends BaseStripeTest {
	@Test
	public void testDeserialize() throws StripeException, IOException {
		String json = resource("review.json");
		Review review = APIResource.GSON.fromJson(json, Review.class);

		assertEquals("prv_197BDeCKM4Inl33zU8jDaYKE", review.getId());
		assertEquals("ch_197BDeCKM4Inl33zIrGBGdR2", review.getCharge());
		assertEquals(1477087830, (long) review.getCreated());
		assertEquals(false, review.getLivemode());
		assertEquals(true, review.getOpen());
		assertEquals("rule", review.getReason());
	}
}