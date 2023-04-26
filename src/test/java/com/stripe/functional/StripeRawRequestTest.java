package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.net.ApiResource;
import com.stripe.net.RawRequestOptions;
import com.stripe.net.StripeResponse;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class StripeRawRequestTest extends BaseStripeTest {
  @Test
  public void testEncoding() throws StripeException {
    final RawRequestOptions options = RawRequestOptions.builder().build();
    assertEquals(Stripe.API_VERSION, options.getStripeVersion());

    Map<String, Object> params = new HashMap<>();
    params.put("description", "test customer");

    StripeResponse response =
        Stripe.rawRequest(ApiResource.RequestMethod.POST, "/v1/customers", params, options);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    Customer customer = (Customer) Stripe.deserialize(response.body());
    assertNotNull(customer);
    assertTrue(customer.getId().startsWith("cus_"));
    assertEquals("test customer", customer.getDescription());
  }
}
