package com.stripe.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.LineItemCollection;
import com.stripe.model.PaymentSourceCollection;
import com.stripe.model.PaymentSource;
import com.stripe.net.ApiResource;
import com.stripe.param.PaymentSourceCollectionListParams;

import org.junit.jupiter.api.Test;

public class CustomerServiceTest extends BaseServiceTest {

  @Test
  public void testListSources() throws StripeException {
    PaymentSourceCollection sources = this.client.customers().listSources(
      "acct_123",
      PaymentSourceCollectionListParams.builder().setLimit(5L).build()
    );

    assertNotNull(sources);
    assertEquals("list", sources.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers/acct_123/sources");
  }

  @Test
  public void testRetrieveSource() throws StripeException {
    PaymentSource source = this.client.customers().retrieveSource(
      "acct_123",
      "card_123");

    assertNotNull(source);
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers/acct_123/sources/card_123");
  }
}
