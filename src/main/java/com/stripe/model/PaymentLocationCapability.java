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
import com.stripe.param.PaymentLocationCapabilityListParams;
import com.stripe.param.PaymentLocationCapabilityRetrieveParams;
import com.stripe.param.PaymentLocationCapabilityUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A {@code payment_location} capability represents a capability for a Stripe account at a payment
 * location.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentLocationCapability extends ApiResource implements HasId {
  /** The account that the capability enables functionality for. */
  @SerializedName("account")
  String account;

  /**
   * The identifier for the capability.
   *
   * <p>Equal to {@code fr_meal_vouchers_conecs_payments}.
   */
  @SerializedName("capability")
  String capability;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The payment location that the capability enables functionality for. */
  @SerializedName("location")
  String location;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_location_capability}.
   */
  @SerializedName("object")
  String object;

  /** Whether the capability has been requested. */
  @SerializedName("requested")
  Boolean requested;

  /** Time when the capability was requested. Measured in seconds since the Unix epoch. */
  @SerializedName("requested_at")
  Long requestedAt;

  @SerializedName("requirements")
  Requirements requirements;

  /**
   * The status of the capability.
   *
   * <p>One of {@code active}, {@code inactive}, {@code pending}, or {@code unrequested}.
   */
  @SerializedName("status")
  String status;

  /** List all payment location capabilities associated with the payment location. */
  public static PaymentLocationCapabilityCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all payment location capabilities associated with the payment location. */
  public static PaymentLocationCapabilityCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_location_capabilities";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentLocationCapabilityCollection.class);
  }

  /** List all payment location capabilities associated with the payment location. */
  public static PaymentLocationCapabilityCollection list(PaymentLocationCapabilityListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all payment location capabilities associated with the payment location. */
  public static PaymentLocationCapabilityCollection list(
      PaymentLocationCapabilityListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_location_capabilities";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentLocationCapabilityCollection.class);
  }

  /** Retrieves a {@code payment_location} capability. */
  public static PaymentLocationCapability retrieve(String capability) throws StripeException {
    return retrieve(capability, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code payment_location} capability. */
  public static PaymentLocationCapability retrieve(String capability, RequestOptions options)
      throws StripeException {
    return retrieve(capability, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code payment_location} capability. */
  public static PaymentLocationCapability retrieve(
      String capability, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_location_capabilities/%s", ApiResource.urlEncodeId(capability));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentLocationCapability.class);
  }

  /** Retrieves a {@code payment_location} capability. */
  public static PaymentLocationCapability retrieve(
      String capability, PaymentLocationCapabilityRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_location_capabilities/%s", ApiResource.urlEncodeId(capability));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentLocationCapability.class);
  }

  /**
   * Updates a {@code payment_location} capability. Request or remove a {@code payment_location}
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code payment_location} capability. Request or remove a {@code payment_location}
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_location_capabilities/%s", ApiResource.urlEncodeId(this.getCapability()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentLocationCapability.class);
  }

  /**
   * Updates a {@code payment_location} capability. Request or remove a {@code payment_location}
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(PaymentLocationCapabilityUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code payment_location} capability. Request or remove a {@code payment_location}
   * capability by updating its {@code requested} parameter.
   */
  public PaymentLocationCapability update(
      PaymentLocationCapabilityUpdateParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_location_capabilities/%s", ApiResource.urlEncodeId(this.getCapability()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentLocationCapability.class);
  }

  @Override
  public String getId() {
    return this.capability;
  }

  /**
   * For more details about Requirements, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /** Fields that need to be collected to keep the capability enabled. */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * Description of why the capability is disabled.
     *
     * <p>One of {@code account.capability_required}, {@code pending.onboarding}, {@code
     * pending.review}, {@code rejected.other}, {@code rejected.unsupported_business}, or {@code
     * requirements.fields_needed}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<PaymentLocationCapability.Requirements.Errors> errors;

    /**
     * For more details about Errors, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code information_missing}, or {@code invalid_value_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * An informative message that indicates the error type and provides additional details about
       * the error.
       */
      @SerializedName("reason")
      String reason;

      /**
       * The specific user onboarding requirement field (in the requirements hash) that needs to be
       * resolved.
       */
      @SerializedName("requirement")
      String requirement;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(requirements, responseGetter);
  }
}
