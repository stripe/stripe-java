package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Coupon;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class CouponTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/coupons/COUPON_ID");
    final Coupon resource = ApiResource.GSON.fromJson(data, Coupon.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
