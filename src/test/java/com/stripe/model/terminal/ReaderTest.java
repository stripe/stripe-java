package com.stripe.model.terminal;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ReaderTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/terminal/readers/rdr_123");
    final Reader reader = ApiResource.GSON.fromJson(data, Reader.class);

    assertNotNull(reader);
  }
}
