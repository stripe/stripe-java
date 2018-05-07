package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;

import java.io.IOException;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IssuerFraudRecordTest extends BaseStripeTest {
  @Before
  public void mockStripeResponseGetter() {
    APIResource.setStripeResponseGetter(networkMock);
  }

  @After
  public void unmockStripeResponseGetter() {
    /* This needs to be done because tests aren't isolated in Java */
    APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

  @Test
  public void testDeserialize() throws IOException {
    String json = resource("issuer_fraud_record.json");
    IssuerFraudRecord ifr = APIResource.GSON.fromJson(json, IssuerFraudRecord.class);
    assertEquals("issfr_123", ifr.getId());
    assertEquals("issuer_fraud_record", ifr.getObject());
    assertEquals(1525167901, ifr.getCreated().longValue());
    assertEquals(1501718400, ifr.getPostDate().longValue());
    assertEquals("ch_123", ifr.getCharge());
    assertEquals("misc", ifr.getFraudType());
    assertTrue(ifr.getLivemode());
  }

  @Test
  public void testDeserializeExpandCharge() throws IOException {
    String expandedJson = resource("issuer_fraud_record_expansion.json");
    Class<IssuerFraudRecord> klass = IssuerFraudRecord.class;
    IssuerFraudRecord expandedIfr = APIResource.GSON.fromJson(expandedJson, klass);

    Charge charge = expandedIfr.getChargeObject();
    assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", expandedIfr.getCharge());
    assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", charge.getId());
    assertEquals(1061, charge.getAmount().longValue());
  }

  @Test
  public void testRetrieve() throws StripeException {
    IssuerFraudRecord.retrieve("issfr_123");
    verifyGet(IssuerFraudRecord.class, "https://api.stripe.com/v1/issuer_fraud_records/issfr_123");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testList() throws StripeException {
    IssuerFraudRecord.list(Collections.<String, Object>emptyMap());

    verifyGet(IssuerFraudRecordCollection.class, "https://api.stripe.com/v1/issuer_fraud_records");
    verifyNoMoreInteractions(networkMock);
  }
}
