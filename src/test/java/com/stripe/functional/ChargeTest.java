package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.ChargeCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ChargeTest extends BaseStripeTest {
  public static final String CHARGE_ID = "ch_123";

  private Charge getChargeFixture() throws StripeException {
    final Charge charge = Charge.retrieve(CHARGE_ID);
    resetNetworkSpy();
    return charge;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("amount", 100);
    params.put("currency", "usd");
    params.put("source", "src_123");

    final Charge charge = Charge.create(params);

    assertNotNull(charge);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/charges",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Charge charge = Charge.retrieve(CHARGE_ID);

    assertNotNull(charge);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/charges/%s", CHARGE_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Charge charge = getChargeFixture();

    final Map<String, Object> metadata = new HashMap<>();
    metadata.put("foo", "bar");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Charge updatedCharge = charge.update(params);

    assertNotNull(updatedCharge);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/charges/%s", charge.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final ChargeCollection charges = Charge.list(params);

    assertNotNull(charges);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/charges",
        params
    );
  }

  @Test
  public void testMarkFaudulent() throws StripeException {
    final Charge charge = getChargeFixture();
    Map<String, Object> params = new HashMap<>();
    Map<String, Object> userReport = new HashMap<>();
    params.put("fraud_details", userReport);
    userReport.put("user_report", "fraudulent");

    final Charge fraudulentCharge = charge.update(params);

    assertNotNull(fraudulentCharge);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/charges/%s", charge.getId()),
        ImmutableMap.of("fraud_details",
          (Object)ImmutableMap.of("user_report", (Object)"fraudulent"))
    );
  }

  @Test
  public void testMarkSafe() throws StripeException {
    final Charge charge = getChargeFixture();
    Map<String, Object> params = new HashMap<>();
    Map<String, Object> userReport = new HashMap<>();
    params.put("fraud_details", userReport);
    userReport.put("user_report", "safe");

    final Charge safeCharge = charge.update(params);

    assertNotNull(safeCharge);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/charges/%s", charge.getId()),
        ImmutableMap.of("fraud_details",
          (Object)ImmutableMap.of("user_report", (Object)"safe"))
    );
  }
}
