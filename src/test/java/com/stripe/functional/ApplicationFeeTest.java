package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplicationFee;
import com.stripe.model.ApplicationFeeCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ApplicationFeeTest extends BaseStripeTest {
  public static final String FEE_ID = "fee_123";

  @Test
  public void testRetrieve() throws StripeException {
    final ApplicationFee fee = ApplicationFee.retrieve(FEE_ID);

    assertNotNull(fee);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/application_fees/%s", FEE_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final ApplicationFeeCollection fees = ApplicationFee.list(params);

    assertNotNull(fees);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/application_fees"),
        params
    );
  }
}
