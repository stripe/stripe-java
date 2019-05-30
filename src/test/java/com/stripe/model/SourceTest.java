package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class SourceTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/sources/src_123");
    final Source source = ApiResource.GSON.fromJson(data, Source.class);
    assertNotNull(source);
    assertNotNull(source.getId());
    assertEquals("source", source.getObject());
  }
}
