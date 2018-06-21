package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ExchangeRate;
import com.stripe.model.ExchangeRateCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ExchangeRateTest extends BaseStripeTest {
  public static final String CURRENCY = "usd";

  @Test
  public void testRetrieve() throws StripeException {
    final ExchangeRate rate = ExchangeRate.retrieve(CURRENCY);

    assertNotNull(rate);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/exchange_rates/usd")
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final ExchangeRateCollection rates = ExchangeRate.list(params);

    assertNotNull(rates);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/exchange_rates")
    );
  }
}
