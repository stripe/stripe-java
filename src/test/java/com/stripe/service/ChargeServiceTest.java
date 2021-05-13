
package com.stripe.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.ChargeCollection;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.ChargeCreateParams;
import com.stripe.param.ChargeListParams;
import com.stripe.param.ChargeUpdateParams;
import org.junit.jupiter.api.Test;

public class ChargeServiceTest extends BaseServiceTest {
  @Test
  public void testCapture() throws StripeException {
    Charge charge = this.client.charges().capture("ch_123");
    assertNotNull(charge);
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/charges/ch_123/capture");
  }

  @Test
  public void testCreate() throws StripeException {
    ChargeCreateParams params = ChargeCreateParams.builder().setAmount(123L).setCurrency("usd").setSource("tok_visa")
        .build();
    Charge charge = this.client.charges().create(params);
    assertNotNull(charge);
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/charges");
  }

  @Test
  public void testList() throws StripeException {
    ChargeListParams params = ChargeListParams.builder().setLimit(1L).build();
    StripeCollection<Charge> charges = this.client.charges().list(params);
    assertNotNull(charges);
    assertNotNull(charges.getData());
    assertEquals(1, charges.getData().size());
    Charge charge = charges.getData().get(0);
    assertNotNull(charge);
    assertEquals("charge", charge.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/charges");
  }

  @Test
  public void testRetrieve() throws StripeException {
    Charge charge = this.client.charges().retrieve("ch_123");
    assertNotNull(charge);
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/charges/ch_123");
  }

  @Test
  public void testUpdate() throws StripeException {
    ChargeUpdateParams params = ChargeUpdateParams.builder().putMetadata("key", "value").build();
    Charge charge = this.client.charges().update("ch_123", params);
    assertNotNull(charge);
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/charges/ch_123");
  }

  // Test that request methods are disabled.

  @Test
  public void testRequestMethodsDisabled_update() throws StripeException {
    Charge charge = this.client.charges().capture("ch_123");
    ChargeUpdateParams params = ChargeUpdateParams.builder().build();
    assertThrows(UnsupportedOperationException.class, () -> {
      charge.update(params);
    });
  }

  @Test
  public void testRequestMethodsDisabled_listIterator() throws StripeException {
    ChargeCollection collection = this.client.charges().list();
    assertThrows(UnsupportedOperationException.class, () -> {
      collection.autoPagingIterable();
    });
  }

}
