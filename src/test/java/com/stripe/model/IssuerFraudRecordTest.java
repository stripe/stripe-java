package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class IssuerFraudRecordTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/issuer_fraud_records/issfr_123");
    final IssuerFraudRecord record = ApiResource.GSON.fromJson(data, IssuerFraudRecord.class);
    assertNotNull(record);
    assertNotNull(record.getId());
    assertEquals("issuer_fraud_record", record.getObject());
    assertNull(record.getChargeObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "charge",
    };
    final String data = getFixture("/v1/issuer_fraud_records/issfr_123", expansions);
    final IssuerFraudRecord record = ApiResource.GSON.fromJson(data, IssuerFraudRecord.class);
    assertNotNull(record);
    assertNotNull(record.getId());
    final Charge charge = record.getChargeObject();
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals(record.getCharge(), charge.getId());
  }
}
