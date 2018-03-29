package com.stripe.functional;

import static org.hamcrest.CoreMatchers.instanceOf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponse;

import java.util.HashMap;

import org.junit.Test;

public class StripeResponseTest extends BaseStripeFunctionalTest {
  @Test
  public void testResponseIncluded() throws
      AuthenticationException,
      InvalidRequestException,
      APIException,
      APIConnectionException,
      CardException {
    String idempotencyKey = Long.toString(System.currentTimeMillis());
    RequestOptions requestOptions = RequestOptions.builder()
        .setStripeVersion(Stripe.apiVersion)
        .setIdempotencyKey(idempotencyKey)
        .build();
    Customer cus = Customer.create(defaultCustomerParams, requestOptions);
    cus = Customer.retrieve(cus.getId(), requestOptions);
    StripeResponse resp = cus.getLastResponse();
    assertThat(resp, instanceOf(StripeResponse.class));
    assertEquals(200, resp.code());
    assertEquals(idempotencyKey, resp.idempotencyKey());
    assertTrue(resp.requestId().startsWith("req_"));
    assertTrue(resp.body().length() > 0);
  }
  @Test
  public void testResponseIncludedList() throws
      AuthenticationException,
      InvalidRequestException,
      APIException,
      APIConnectionException,
      CardException {
    CustomerCollection cusCollection = Customer.list(new HashMap<String, Object>());
    StripeResponse resp = cusCollection.getLastResponse();
    assertThat(resp, instanceOf(StripeResponse.class));
    assertEquals(200, resp.code());
    assertTrue(resp.requestId().startsWith("req_"));
    assertTrue(resp.body().length() > 0);
  }
}
