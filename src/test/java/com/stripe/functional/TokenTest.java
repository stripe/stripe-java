package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Token;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TokenTest extends BaseStripeFunctionalTest {
    @Test
    public void testTokenCreate() throws StripeException {
        Token token = Token.create(defaultTokenParams);
        assertFalse(token.getUsed());
    }

    @Test
    public void testTokenRetrieve() throws StripeException {
        Token createdToken = Token.create(defaultTokenParams);
        Token retrievedToken = Token.retrieve(createdToken.getId());
        assertEquals(createdToken.getId(), retrievedToken.getId());
    }

    @Test
    public void testTokenUse() throws StripeException {
        Token createdToken = Token.create(defaultTokenParams);
        Map<String, Object> chargeWithTokenParams = new HashMap<String, Object>();
        chargeWithTokenParams.put("amount", 199);
        chargeWithTokenParams.put("currency", "usd");
        chargeWithTokenParams.put("card", createdToken.getId());
        Charge.create(chargeWithTokenParams);
        Token retrievedToken = Token.retrieve(createdToken.getId());
        assertTrue(retrievedToken.getUsed());
    }

    @Test
    public void testTokenCreatePerCallAPIKey() throws StripeException {
        Token token = Token.create(defaultTokenParams, Stripe.apiKey);
        assertFalse(token.getUsed());
    }

    @Test
    public void testTokenRetrievePerCallAPIKey() throws StripeException {
        Token createdToken = Token.create(defaultTokenParams, Stripe.apiKey);
        Token retrievedToken = Token.retrieve(createdToken.getId(),
                Stripe.apiKey);
        assertEquals(createdToken.getId(), retrievedToken.getId());
    }

    @Test
    public void testTokenUsePerCallAPIKey() throws StripeException {
        Token createdToken = Token.create(defaultTokenParams, Stripe.apiKey);
        Map<String, Object> chargeWithTokenParams = new HashMap<String, Object>();
        chargeWithTokenParams.put("amount", 199);
        chargeWithTokenParams.put("currency", "usd");
        chargeWithTokenParams.put("card", createdToken.getId());
        Charge.create(chargeWithTokenParams, Stripe.apiKey);
        Token retrievedToken = Token.retrieve(createdToken.getId(),
                Stripe.apiKey);
        assertTrue(retrievedToken.getUsed());
    }
}
