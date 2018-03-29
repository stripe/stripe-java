package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Token;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TokenTest extends BaseStripeFunctionalTest {
  private Map<String, Object> getTokenParams() {
    Map<String, Object> cardParams = new HashMap<String, Object>();
    cardParams.put("number", "4242424242424242"); // Test token creation so needs PAN.
    cardParams.put("exp_month", 12);
    cardParams.put("exp_year", getYear());
    cardParams.put("cvc", "123");
    Map<String, Object> tokenParams = new HashMap<String, Object>();
    tokenParams.put("card", cardParams);

    return tokenParams;
  }

  @Test
  public void testTokenCreate() throws StripeException {
    Token token = Token.create(getTokenParams());
    assertFalse(token.getUsed());
  }

  @Test
  public void testTokenRetrieve() throws StripeException {
    Token createdToken = Token.create(getTokenParams());
    Token retrievedToken = Token.retrieve(createdToken.getId());
    assertEquals(createdToken.getId(), retrievedToken.getId());
  }

  @Test
  public void testTokenUse() throws StripeException {
    Token createdToken = Token.create(getTokenParams());
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
    Token token = Token.create(getTokenParams(), Stripe.apiKey);
    assertFalse(token.getUsed());
  }

  @Test
  public void testTokenRetrievePerCallAPIKey() throws StripeException {
    Token createdToken = Token.create(getTokenParams(), Stripe.apiKey);
    Token retrievedToken = Token.retrieve(createdToken.getId(),
        Stripe.apiKey);
    assertEquals(createdToken.getId(), retrievedToken.getId());
  }

  @Test
  public void testTokenUsePerCallAPIKey() throws StripeException {
    Token createdToken = Token.create(getTokenParams(), Stripe.apiKey);
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
