package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CardTest extends BaseStripeFunctionalTest {
  @Test
  public void testCardMetadata() throws StripeException {
    Customer customer = Customer.create(defaultCustomerParams);
    Map<String, Object> creationParams = new HashMap<String, Object>();
    creationParams.put("source", "tok_visa");
    testMetadata(customer.createCard(creationParams));
  }
}
