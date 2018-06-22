package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.IssuerFraudRecord;
import com.stripe.model.IssuerFraudRecordCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class IssuerFraudRecordTest extends BaseStripeTest {
  public static final String RECORD_ID = "issfr_123";

  @Test
  public void testRetrieve() throws IOException, StripeException {
    // stripe-mock does not support the /v1/issuer_fraud_records endpoint, so we stub the request
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuer_fraud_records/%s", RECORD_ID),
        IssuerFraudRecord.class,
        getResourceAsString("/api_fixtures/issuer_fraud_record.json")
    );
    final IssuerFraudRecord record = IssuerFraudRecord.retrieve(RECORD_ID);

    assertNotNull(record);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuer_fraud_records/%s", RECORD_ID)
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    // stripe-mock does not support the /v1/issuer_fraud_records endpoint, so we stub the request
    stubRequest(
        ApiResource.RequestMethod.GET,
        "/v1/issuer_fraud_records",
        params,
        IssuerFraudRecordCollection.class,
        getResourceAsString("/api_fixtures/issuer_fraud_record_list.json")
    );
    final IssuerFraudRecordCollection records = IssuerFraudRecord.list(params);

    assertNotNull(records);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/issuer_fraud_records",
        params
    );
  }
}
