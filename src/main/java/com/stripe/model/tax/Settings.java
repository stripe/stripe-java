// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
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
 * <p>Related guide: <a href="https://stripe.com/docs/tax/settings-api">Using the Settings API</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Settings extends ApiResource {
  @SerializedName("defaults")
  Defaults defaults;

  /** The place where your business is located. */
  @SerializedName("head_office")
  HeadOffice headOffice;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.settings}.
   */
  @SerializedName("object")
  String object;

  /**
   * The {@code active} status indicates you have all required settings to calculate tax. A status
   * can transition out of {@code active} when new required settings are introduced.
   *
   * <p>One of {@code active}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Retrieves Tax {@code Settings} for a merchant. */
  public static Settings retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves Tax {@code Settings} for a merchant. */
  public static Settings retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieves Tax {@code Settings} for a merchant. */
  public static Settings retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/settings";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Settings.class);
  }

  /** Retrieves Tax {@code Settings} for a merchant. */
  public static Settings retrieve(SettingsRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/settings";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Settings.class);
  }

  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public static Settings update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public static Settings update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/settings";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Settings.class);
  }

  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public static Settings update(SettingsUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public static Settings update(SettingsUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/settings";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Settings.class);
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
  public static class HeadOffice extends StripeObject {
    @SerializedName("address")
    Address address;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("active")
    Active active;

    @SerializedName("pending")
    Pending pending;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Active extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pending extends StripeObject {
      /**
       * The list of missing fields that are required to perform calculations. It includes the entry
       * {@code head_office} when the status is {@code pending}. It is recommended to set the
       * optional values even if they aren't listed as required for calculating taxes. Calculations
       * can fail if missing fields aren't explicitly provided on every call.
       */
      @SerializedName("missing_fields")
      List<String> missingFields;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(defaults, responseGetter);
    trySetResponseGetter(headOffice, responseGetter);
    trySetResponseGetter(statusDetails, responseGetter);
  }
}
