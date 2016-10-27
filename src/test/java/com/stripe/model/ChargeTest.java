package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ChargeTest extends BaseStripeTest {
    @Test
    public void testDeserialize() throws StripeException, IOException {
        String json = resource("charge.json");
        Charge charge = APIResource.GSON.fromJson(json, Charge.class);
        assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", charge.getId());
        assertEquals(1477429167, (long) charge.getCreated());
    }
}
