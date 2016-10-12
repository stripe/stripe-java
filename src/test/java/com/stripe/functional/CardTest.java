package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CardTest extends BaseStripeFunctionalTest {
    @Test
    public void testCardMetadata() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        Map<String, Object> creationParams = new HashMap<String, Object>();
        creationParams.put("card", defaultCardParams);
        testMetadata(customer.createCard(creationParams));
    }
}
