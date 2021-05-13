package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Coupon;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import com.stripe.param.CouponCreateParams;
import com.stripe.param.CouponListParams;
import com.stripe.param.CouponRetrieveParams;
import com.stripe.param.CouponUpdateParams;
import com.stripe.util.StringUtils;
import java.lang.reflect.Type;

public class CouponService extends Service<Coupon> {
  public CouponService(StripeClient client) {
    super(client);
  }

  /**
   * You can create coupons easily via the
   * <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of
   * the Stripe dashboard. Coupon creation is also accessible via the API if you
   * need to create coupons on the fly.
   *
   * <p>
   * A coupon has either a <code>percent_off</code> or an <code>amount_off</code>
   * and <code>
   * currency</code>. If you set an <code>amount_off</code>, that amount will be
   * subtracted from any invoice’s subtotal. For example, an invoice with a
   * subtotal of 100 will have a final total of 0 if a coupon with an
   * <code>amount_off</code> of 200 is applied to it and an invoice with a
   * subtotal of 300 will have a final total of 100 if a coupon with an
   * <code>amount_off</code> of 200 is applied to it.
   *
   * @param params the request parameters
   * @return the created coupon
   * @throws StripeException if the request fails
   */
  public Coupon create(CouponCreateParams params) throws StripeException {
    return this.create(params, null);
  }

  /**
   * You can create coupons easily via the
   * <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of
   * the Stripe dashboard. Coupon creation is also accessible via the API if you
   * need to create coupons on the fly.
   *
   * <p>
   * A coupon has either a <code>percent_off</code> or an <code>amount_off</code>
   * and <code>
   * currency</code>. If you set an <code>amount_off</code>, that amount will be
   * subtracted from any invoice’s subtotal. For example, an invoice with a
   * subtotal of 100 will have a final total of 0 if a coupon with an
   * <code>amount_off</code> of 200 is applied to it and an invoice with a
   * subtotal of 300 will have a final total of 100 if a coupon with an
   * <code>amount_off</code> of 200 is applied to it.
   *
   * @param params  the request parameters
   * @param options the special options for the request
   * @return the created coupon
   * @throws StripeException if the request fails
   */
  public Coupon create(CouponCreateParams params, RequestOptions options) throws StripeException {
    return this.request(Coupon.class, ApiResource.RequestMethod.POST, "/v1/coupons", params, options);
  }

  /**
   * You can delete coupons via the
   * <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of
   * the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers
   * can’t redeem the coupon. You can also delete coupons via the API.
   *
   * @param id the ID of the coupon to delete
   * @return the deleted coupon
   * @throws StripeException if the request fails
   */
  public Coupon delete(String id) throws StripeException {
    return this.delete(id, null);
  }

  // TODO we should have a CouponDeleteParams class even if there are no
  // parameters
  /**
   * You can delete coupons via the
   * <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of
   * the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers
   * can’t redeem the coupon. You can also delete coupons via the API.
   *
   * @param id      the ID of the coupon to delete
   * @param options the special options for the request
   * @return the deleted coupon
   * @throws StripeException if the request fails
   */
  public Coupon delete(String id, RequestOptions options) throws StripeException {
    return this.request(Coupon.class, ApiResource.RequestMethod.DELETE,
        String.format("/v1/coupons/%s", StringUtils.urlEncode(id)), null, options);
  }

  /**
   * Returns a list of your coupons.
   *
   * @return the list of coupons
   * @throws StripeException if the request fails
   */
  public StripeCollection<Coupon> list() throws StripeException {
    return this.list(null, null);
  }

  /**
   * Returns a list of your coupons.
   *
   * @param params the request parameters
   * @return the list of coupons
   * @throws StripeException if the request fails
   */
  public StripeCollection<Coupon> list(CouponListParams params) throws StripeException {
    return this.list(params, null);
  }

  /**
   * Returns a list of your coupons.
   *
   * @param params  the request parameters
   * @param options the special options for the request
   * @return the list of coupons
   * @throws StripeException if the request fails
   */
  public StripeCollection<Coupon> list(CouponListParams params, RequestOptions options) throws StripeException {
    Type type = new TypeToken<StripeCollection<Coupon>>() {
    }.getType();
    return this.request(type, ApiResource.RequestMethod.GET, "/v1/coupons", params, options);
  }

  /**
   * Retrieves the coupon with the given ID.
   *
   * @param id the ID of the coupon to retrieve
   * @return the retrieved coupon
   * @throws StripeException if the request fails
   */
  public Coupon retrieve(String id) throws StripeException {
    return this.retrieve(id, null, null);
  }

  /**
   * Retrieves the coupon with the given ID.
   *
   * @param id     the ID of the coupon to retrieve
   * @param params the request parameters
   * @return the retrieved coupon
   * @throws StripeException if the request fails
   */
  public Coupon retrieve(String id, CouponRetrieveParams params) throws StripeException {
    return this.retrieve(id, params, null);
  }

  /**
   * Retrieves the coupon with the given ID.
   *
   * @param id      the ID of the coupon to retrieve
   * @param params  the request parameters
   * @param options the special options for the request
   * @return the retrieved coupon
   * @throws StripeException if the request fails
   */
  public Coupon retrieve(String id, CouponRetrieveParams params, RequestOptions options) throws StripeException {
    return this.request(Coupon.class, ApiResource.RequestMethod.GET,
        String.format("/v1/coupons/%s", StringUtils.urlEncode(id)), params, options);
  }

  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration,
   * amount_off) are, by design, not editable.
   *
   * @param id     the ID of the coupon to update
   * @param params the request parameters
   * @return the updated coupon
   * @throws StripeException if the request fails
   */
  public Coupon update(String id, CouponUpdateParams params) throws StripeException {
    return this.update(id, params, null);
  }

  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration,
   * amount_off) are, by design, not editable.
   *
   * @param id      the ID of the coupon to update
   * @param params  the request parameters
   * @param options the special options for the request
   * @return the updated coupon
   * @throws StripeException if the request fails
   */
  public Coupon update(String id, CouponUpdateParams params, RequestOptions options) throws StripeException {
    return this.request(Coupon.class, ApiResource.RequestMethod.POST,
        String.format("/v1/coupons/%s", StringUtils.urlEncode(id)), params, options);
  }
}
