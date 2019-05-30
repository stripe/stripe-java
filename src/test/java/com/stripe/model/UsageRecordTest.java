package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class UsageRecordTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/usage_record.json");
    final UsageRecord record = ApiResource.GSON.fromJson(data, UsageRecord.class);
    assertNotNull(record);
    assertNotNull(record.getId());
    assertEquals("usage_record", record.getObject());
  }
}
