package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.IssuerFraudRecord;
import com.stripe.net.ApiResource;

import java.io.IOException;

import org.junit.Test;

public class IssuerFraudRecordTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws IOException {
    final String json = getResourceAsString("/api_fixtures/issuer_fraud_record.json");
    final IssuerFraudRecord record = ApiResource.GSON.fromJson(json, IssuerFraudRecord.class);
    assertNotNull(record);
    assertNotNull(record.getId());
    assertEquals("issuer_fraud_record", record.getObject());
    assertNull(record.getChargeObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws IOException {
    final String json = getResourceAsString("/api_fixtures/issuer_fraud_record_expansions.json");
    final IssuerFraudRecord record = ApiResource.GSON.fromJson(json, IssuerFraudRecord.class);
    assertNotNull(record);
    assertNotNull(record.getId());
    final Charge charge = record.getChargeObject();
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals(record.getCharge(), charge.getId());
  }
}
