package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Coupon;
import com.stripe.model.CouponCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class CouponTest extends BaseStripeTest {
  public static final String COUPON_ID = "COUPON_ID";

  private Coupon getCouponFixture() throws StripeException {
    final Coupon coupon = Coupon.retrieve(COUPON_ID);
    resetNetworkSpy();
    return coupon;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("percent_off", 25);
    params.put("duration", "forever");

    final Coupon coupon = Coupon.create(params);

    assertNotNull(coupon);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/coupons"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Coupon coupon = Coupon.retrieve(COUPON_ID);

    assertNotNull(coupon);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/coupons/%s", COUPON_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Coupon coupon = getCouponFixture();

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Coupon updatedCoupon = coupon.update(params);

    assertNotNull(updatedCoupon);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/coupons/%s", coupon.getId()), params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final CouponCollection coupons = Coupon.list(params);

    assertNotNull(coupons);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/coupons"));
  }

  @Test
  public void testDelete() throws StripeException {
    final Coupon coupon = getCouponFixture();

    final Coupon deletedCoupon = coupon.delete();

    assertNotNull(deletedCoupon);
    assertTrue(deletedCoupon.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE, String.format("/v1/coupons/%s", coupon.getId()));
  }
}
