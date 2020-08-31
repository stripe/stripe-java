package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class TaxRateTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/tax_rates/txr_123");
    final TaxRate taxRate = ApiResource.GSON.fromJson(data, TaxRate.class);
    assertNotNull(taxRate);
    assertNotNull(taxRate.getId());
    assertEquals("tax_rate", taxRate.getObject());
  }

  @Test
  @SuppressWarnings("BigDecimalEquals")
  public void testDeserializeBigDecimal() {
    final String data = "{\"object\": \"tax_rate\", \"percentage\": 0.3}";
    final TaxRate taxRate = ApiResource.GSON.fromJson(data, TaxRate.class);
    assertNotNull(taxRate);
    assertNotNull(taxRate.getPercentage());
    assertTrue(taxRate.getPercentage().equals(new BigDecimal("0.3")));
  }
}
