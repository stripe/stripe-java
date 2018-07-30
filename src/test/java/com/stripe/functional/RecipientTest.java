package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Recipient;
import com.stripe.model.RecipientCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Recipients are deprecated. All tests have been removed; the Java APIs will
 * eventually be removed as well.
 */
public class RecipientTest extends BaseStripeTest {
  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    RecipientCollection recipients = Recipient.list(params);

    assertNotNull(recipients);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/recipients")
    );
  }
}
