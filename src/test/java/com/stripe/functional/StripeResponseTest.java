package com.stripe.functional;

import static org.hamcrest.CoreMatchers.instanceOf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponse;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

public class StripeResponseTest extends BaseStripeTest {
  @Test
  public void testResponseIncluded() throws StripeException {
    final String idempotencyKey = UUID.randomUUID().toString();
    final RequestOptions requestOptions = RequestOptions.builder()
        .setIdempotencyKey(idempotencyKey)
        .build();
    final Customer customer = Customer.create(null, requestOptions);
    final Customer retrievedCustomer = Customer.retrieve(customer.getId(), requestOptions);
    final StripeResponse response = retrievedCustomer.getLastResponse();
    assertThat(response, instanceOf(StripeResponse.class));
    assertEquals(200, response.code());
    assertEquals(idempotencyKey, response.idempotencyKey());
    assertTrue(response.requestId().startsWith("req_"));
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testResponseIncludedList() throws StripeException {
    final CustomerCollection customers = Customer.list(new HashMap<String, Object>());
    final StripeResponse response = customers.getLastResponse();
    assertThat(response, instanceOf(StripeResponse.class));
    assertEquals(200, response.code());
    assertTrue(response.requestId().startsWith("req_"));
    assertTrue(response.body().length() > 0);
  }
}
