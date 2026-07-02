// File generated from our OpenAPI spec
package com.stripe.model.crypto;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.crypto.CustomerRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This object represents a crypto onramp customer. Use it to get their kyc status and payment
 * methods.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Customer extends ApiResource implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The KYC region determined by the customer's address country.
   *
   * <p>One of {@code eu}, or {@code us}.
   */
  @SerializedName("kyc_region")
  String kycRegion;

  /** List of KYC tiers and their verification status. */
  @SerializedName("kyc_tiers")
  List<Customer.KycTier> kycTiers;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code crypto.customer}.
   */
  @SerializedName("object")
  String object;

  /** The set of KYC Fields provided for this customers. */
  @SerializedName("provided_fields")
  List<String> providedFields;

  /** List of verifications and their outcome. */
  @SerializedName("verifications")
  List<Customer.Verification> verifications;

  /** Retrieves the details of a Crypto Customer. */
  public static Customer retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Crypto Customer. */
  public static Customer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Crypto Customer. */
  public static Customer retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/customers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Customer.class);
  }

  /** Retrieves the details of a Crypto Customer. */
  public static Customer retrieve(String id, CustomerRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/customers/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Customer.class);
  }

  /**
   * For more details about KycTier, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class KycTier extends StripeObject {
    /**
     * The KYC tier level (e.g., l0, l1, l2).
     *
     * <p>One of {@code l0}, {@code l1}, or {@code l2}.
     */
    @SerializedName("tier")
    String tier;

    /** List of errors associated with this KYC tier verification. */
    @SerializedName("verification_errors")
    List<String> verificationErrors;

    /**
     * The verification status for this KYC tier.
     *
     * <p>One of {@code not_available}, {@code not_started}, {@code pending}, {@code rejected}, or
     * {@code verified}.
     */
    @SerializedName("verification_status")
    String verificationStatus;
  }

  /**
   * For more details about Verification, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    /** List of errors associated with the verification. */
    @SerializedName("errors")
    List<String> errors;

    /**
     * Type of verification.
     *
     * <p>One of {@code id_document_verified}, {@code kyc_verified}, or {@code phone_verified}.
     */
    @SerializedName("name")
    String name;

    /**
     * Outcome of the verification.
     *
     * <p>One of {@code not_available}, {@code not_started}, {@code pending}, {@code rejected}, or
     * {@code verified}.
     */
    @SerializedName("status")
    String status;
  }
}
