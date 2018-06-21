package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Token;
import com.stripe.net.ApiResource;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TokenTest extends BaseStripeTest {
  public static final String TOKEN_ID = "tok_123";

  @Test
  public void testCreate() throws StripeException {
    final Calendar now = Calendar.getInstance();
    final Map<String, Object> card = new HashMap<String, Object>();
    card.put("number", "4242424242424242");
    card.put("exp_month", now.get(Calendar.MONTH));
    card.put("exp_year", now.get(Calendar.YEAR) + 1);
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("card", card);

    final Token token = Token.create(params);

    assertNotNull(token);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/tokens",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Token token = Token.retrieve(TOKEN_ID);

    assertNotNull(token);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/tokens/%s", TOKEN_ID)
    );
  }
}
