// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.tax.RegistrationCreateParams;
import com.stripe.param.tax.RegistrationListParams;
import com.stripe.param.tax.RegistrationUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax {@code Registration} lets us know that your business is registered to collect tax on
 * payments within a region, enabling you to <a href="https://stripe.com/docs/tax">automatically
 * collect tax</a>.
 *
 * <p>Stripe will not register on your behalf with the relevant authorities when you create a Tax
 * {@code Registration} object. For more information on how to register to collect tax, see <a
 * href="https://stripe.com/docs/tax/registering">our guide</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Registration extends ApiResource implements HasId {
  /** Time at which the registration becomes active. Measured in seconds since the Unix epoch. */
  @SerializedName("active_from")
  Long activeFrom;

  /**
   * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
   * alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * If set, the registration stops being active at this time. If not set, the registration will be
   * active indefinitely. Measured in seconds since the Unix epoch.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.registration}.
   */
  @SerializedName("object")
  String object;

  /** State, county, province, or region. */
  @SerializedName("state")
  String state;

  /**
   * The status of the registration. This field is present for convenience and can be deduced from
   * {@code active_from} and {@code expires_at}.
   *
   * <p>One of {@code active}, {@code expired}, or {@code scheduled}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the registration. See <a href="https://stripe.com/docs/tax/registering">our
   * guide</a> for more information about registration types.
   *
   * <p>One of {@code domestic_small_seller}, {@code simplified}, {@code standard}, {@code
   * vat_oss_non_union}, or {@code vat_oss_union}.
   */
  @SerializedName("type")
  String type;

  /** Creates a new Tax <code>Registration</code> object. */
  public static Registration create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Tax <code>Registration</code> object. */
  public static Registration create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/registrations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Registration.class, options);
  }

  /** Creates a new Tax <code>Registration</code> object. */
  public static Registration create(RegistrationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Tax <code>Registration</code> object. */
  public static Registration create(RegistrationCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/registrations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Registration.class, options);
  }

  /** Returns a list of Tax <code>Registration</code> objects. */
  public static RegistrationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Tax <code>Registration</code> objects. */
  public static RegistrationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/registrations");
    return ApiResource.requestCollection(url, params, RegistrationCollection.class, options);
  }

  /** Returns a list of Tax <code>Registration</code> objects. */
  public static RegistrationCollection list(RegistrationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Tax <code>Registration</code> objects. */
  public static RegistrationCollection list(RegistrationListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/registrations");
    return ApiResource.requestCollection(url, params, RegistrationCollection.class, options);
  }

  /**
   * Updates an existing Tax <code>Registration</code> object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting <code>expires_at</code>.
   */
  public Registration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing Tax <code>Registration</code> object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting <code>expires_at</code>.
   */
  public Registration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Registration.class, options);
  }

  /**
   * Updates an existing Tax <code>Registration</code> object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting <code>expires_at</code>.
   */
  public Registration update(RegistrationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing Tax <code>Registration</code> object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting <code>expires_at</code>.
   */
  public Registration update(RegistrationUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Registration.class, options);
  }
}
