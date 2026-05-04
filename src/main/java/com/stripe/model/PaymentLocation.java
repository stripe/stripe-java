// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLocationCreateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Payment Location represents a physical location where payments take place. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentLocation extends ApiResource implements HasId {
  @SerializedName("address")
  Address address;

  /** Identification numbers associated with the location. */
  @SerializedName("business_registration")
  BusinessRegistration businessRegistration;

  /**
   * The capability settings for the location. Only applicable for locations with requested Payment
   * Location Capabilities.
   */
  @SerializedName("capability_settings")
  CapabilitySettings capabilitySettings;

  /** The display name of the location. */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_location}.
   */
  @SerializedName("object")
  String object;

  /** Create a Payment Location. */
  public static PaymentLocation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a Payment Location. */
  public static PaymentLocation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_locations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentLocation.class);
  }

  /** Create a Payment Location. */
  public static PaymentLocation create(PaymentLocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a Payment Location. */
  public static PaymentLocation create(PaymentLocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_locations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentLocation.class);
  }

  /**
   * For more details about BusinessRegistration, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BusinessRegistration extends StripeObject {
    /**
     * 14-digit SIRET (Système d'identification du répertoire des établissements) number for the
     * location.
     */
    @SerializedName("siret")
    String siret;
  }

  /**
   * For more details about CapabilitySettings, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CapabilitySettings extends StripeObject {
    /** Settings for Conecs French meal voucher capability. */
    @SerializedName("fr_meal_vouchers_conecs_payments")
    FrMealVouchersConecsPayments frMealVouchersConecsPayments;

    /**
     * For more details about FrMealVouchersConecsPayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FrMealVouchersConecsPayments extends StripeObject {
      /** Supported meal voucher issuers. */
      @SerializedName("supported_issuers")
      SupportedIssuers supportedIssuers;

      /**
       * For more details about SupportedIssuers, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SupportedIssuers extends StripeObject {
        /** Supported meal voucher issuers for card payments. */
        @SerializedName("card")
        List<String> card;

        /** Supported meal voucher issuers for card present payments. */
        @SerializedName("card_present")
        List<String> cardPresent;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(address, responseGetter);
    trySetResponseGetter(businessRegistration, responseGetter);
    trySetResponseGetter(capabilitySettings, responseGetter);
  }
}
