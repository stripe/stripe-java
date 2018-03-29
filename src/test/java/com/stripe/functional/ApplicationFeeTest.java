package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplicationFee;
import com.stripe.model.ApplicationFeeCollection;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ApplicationFeeTest extends BaseStripeFunctionalTest {
  @Test
  public void testApplicationFeeList() throws StripeException {
    Map<String, Object> listParams = new HashMap<String, Object>();
    ApplicationFeeCollection fees = ApplicationFee.list(listParams);
    assertEquals("/v1/application_fees", fees.getURL());
  }
}
