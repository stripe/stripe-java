package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.OrderReturn;
import com.stripe.model.OrderReturnCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class OrderReturnTest extends BaseStripeTest {
  public static final String RETURN_ID = "orret_123";

  @Test
  public void testRetrieve() throws StripeException {
    final OrderReturn orderReturn = OrderReturn.retrieve(RETURN_ID);

    assertNotNull(orderReturn);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/order_returns/%s", RETURN_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final OrderReturnCollection orderReturns = OrderReturn.list(params);

    assertNotNull(orderReturns);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/order_returns",
        params
    );
  }
}
