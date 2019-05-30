package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.IssuerFraudRecord;
import com.stripe.model.IssuerFraudRecordCollection;
import com.stripe.net.ApiResource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class IssuerFraudRecordTest extends BaseStripeTest {
  public static final String RECORD_ID = "issfr_123";

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final IssuerFraudRecord record = IssuerFraudRecord.retrieve(RECORD_ID);

    assertNotNull(record);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/issuer_fraud_records/%s", RECORD_ID));
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final IssuerFraudRecordCollection records = IssuerFraudRecord.list(params);

    assertNotNull(records);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuer_fraud_records", params);
  }
}
