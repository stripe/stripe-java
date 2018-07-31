package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.CouponCollection;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class StripeCollectionTest extends BaseStripeTest {
  @Test
  public void testSerialize() throws Exception {
    final String data = getFixture("/v1/coupons");
    final CouponCollection collection = ApiResource.GSON.fromJson(data, CouponCollection.class);
    assertNotNull(collection);
    assertEquals("list", collection.getObject());
  }
}
