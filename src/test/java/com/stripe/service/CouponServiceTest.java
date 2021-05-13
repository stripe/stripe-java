package com.stripe.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.Coupon;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.CouponCreateParams;
import com.stripe.param.CouponCreateParams.Duration;
import com.stripe.param.CouponListParams;
import com.stripe.param.CouponUpdateParams;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class CouponServiceTest extends BaseServiceTest {
  @Test
  public void testCreate() throws StripeException {
    CouponCreateParams params =
        CouponCreateParams.builder()
            .setPercentOff(BigDecimal.valueOf(25))
            .setDuration(Duration.FOREVER)
            .build();
    Coupon coupon = this.client.coupons().create(params);
    assertNotNull(coupon);
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/coupons");
  }

  @Test
  public void testDelete() throws StripeException {
    Coupon coupon = this.client.coupons().delete("mycoupon");
    assertNotNull(coupon);
    this.verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/coupons/mycoupon");
  }

  @Test
  public void testList() throws StripeException {
    CouponListParams params = CouponListParams.builder().setLimit(1L).build();
    StripeCollection<Coupon> coupons = this.client.coupons().list(params);
    assertNotNull(coupons);
    assertNotNull(coupons.getData());
    assertEquals(1, coupons.getData().size());
    Coupon coupon = coupons.getData().get(0);
    assertNotNull(coupon);
    assertEquals("coupon", coupon.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/coupons");
  }

  @Test
  public void testRetrieve() throws StripeException {
    Coupon coupon = this.client.coupons().retrieve("mycoupon");
    assertNotNull(coupon);
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/coupons/mycoupon");
  }

  @Test
  public void testUpdate() throws StripeException {
    CouponUpdateParams params = CouponUpdateParams.builder().putMetadata("key", "value").build();
    Coupon coupon = this.client.coupons().update("mycoupon", params);
    assertNotNull(coupon);
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/coupons/mycoupon");
  }
}
