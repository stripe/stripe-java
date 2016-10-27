package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChargeTest extends BaseStripeTest {
    @Test
    public void testDeserializeReviewStr() throws StripeException, IOException {
        String json = resource("charge_with_review_str.json");
        Charge charge = APIResource.GSON.fromJson(json, Charge.class);
        assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", charge.getId());
        assertEquals(1477429167, (long) charge.getCreated());
        assertEquals("prv_197BDeCKM4Inl33zU8jDaYKE", charge.getReview());
        assertEquals("prv_197BDeCKM4Inl33zU8jDaYKE", charge.getReviewExpandable().getID());
        assertFalse(charge.getReviewExpandable().isExpanded());
    }

    @Test
    public void testDeserializeReviewExpanded() throws StripeException, IOException {
        String json = resource("charge_with_review.json");
        Charge charge = APIResource.GSON.fromJson(json, Charge.class);
        assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", charge.getId());
        assertEquals(1477429167, (long) charge.getCreated());
        assertEquals("prv_197BDeCKM4Inl33zU8jDaYKE", charge.getReview());

        // Expansion checks:
        assertTrue(charge.getReviewExpandable().isExpanded());
        assertEquals("prv_197BDeCKM4Inl33zU8jDaYKE", charge.getReviewExpandable().getID());
        Review r = charge.getReviewExpandable().getExpanded();
        assertEquals(1477087830, (long) r.getCreated());
        assertEquals(r.getLivemode(), false);
    }
}
