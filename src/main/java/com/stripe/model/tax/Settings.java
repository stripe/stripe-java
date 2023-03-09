// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.tax.SettingsRetrieveParams;
import com.stripe.param.tax.SettingsUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can use Tax {@code Settings} to manage configurations used by Stripe Tax calculations.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/tax/connect/settings">Account settings</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Settings extends ApiResource {
  @SerializedName("defaults")
  Defaults defaults;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The places where your business is located. */
  @SerializedName("locations")
  List<Settings.Location> locations;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.settings}.
   */
  @SerializedName("object")
  String object;

  /** Retrieves Tax <code>Settings</code> for a merchant. */
  public static Settings retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves Tax <code>Settings</code> for a merchant. */
  public static Settings retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieves Tax <code>Settings</code> for a merchant. */
  public static Settings retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/settings");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Settings.class, options);
  }

  /** Retrieves Tax <code>Settings</code> for a merchant. */
  public static Settings retrieve(SettingsRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/settings");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Settings.class, options);
  }

  /**
   * Updates Tax <code>Settings</code> parameters used in tax calculations. All parameters are
   * editable but none can be removed once set.
   */
  public static Settings update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates Tax <code>Settings</code> parameters used in tax calculations. All parameters are
   * editable but none can be removed once set.
   */
  public static Settings update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/settings");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Settings.class, options);
  }

  /**
   * Updates Tax <code>Settings</code> parameters used in tax calculations. All parameters are
   * editable but none can be removed once set.
   */
  public static Settings update(SettingsUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates Tax <code>Settings</code> parameters used in tax calculations. All parameters are
   * editable but none can be removed once set.
   */
  public static Settings update(SettingsUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/settings");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Settings.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Defaults extends StripeObject {
    /**
     * Default <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#tax-behavior">tax
     * behavior</a> used to specify whether the price is considered inclusive of taxes or exclusive
     * of taxes. If the item's price has a tax behavior set, it will take precedence over the
     * default tax behavior.
     *
     * <p>One of {@code exclusive}, {@code inclusive}, or {@code inferred_by_currency}.
     */
    @SerializedName("tax_behavior")
    String taxBehavior;

    /**
     * Default <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> used to classify
     * your products and prices.
     */
    @SerializedName("tax_code")
    String taxCode;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Location extends StripeObject {
    @SerializedName("address")
    Address address;

    /**
     * The role of this location address.
     *
     * <p>Equal to {@code head_office}.
     */
    @SerializedName("role")
    String role;
  }
}
