// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.IssuingAuthorizationEvaluationCreateParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Authorization Evaluations represent fraud risk assessments for Issuing card authorizations. They
 * include fraud risk signals and contextual details about the authorization.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingAuthorizationEvaluation extends ApiResource implements HasId {
  /** Details about the authorization transaction. */
  @SerializedName("authorization_details")
  AuthorizationDetails authorizationDetails;

  /** Details about the card used in the authorization. */
  @SerializedName("card_details")
  CardDetails cardDetails;

  /** Details about the cardholder. */
  @SerializedName("cardholder_details")
  CardholderDetails cardholderDetails;

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

  /** Details about the merchant where the authorization occurred. */
  @SerializedName("merchant_details")
  MerchantDetails merchantDetails;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Details about the card network processing. */
  @SerializedName("network_details")
  NetworkDetails networkDetails;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.issuing_authorization_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** Collection of fraud risk signals for this authorization evaluation. */
  @SerializedName("signals")
  Signals signals;

  /** Details about the token, if a tokenized payment method was used. */
  @SerializedName("token_details")
  TokenDetails tokenDetails;

  /** Details about verification checks performed. */
  @SerializedName("verification_details")
  VerificationDetails verificationDetails;

  /** Request a fraud risk assessment from Stripe for an Issuing card authorization. */
  public static IssuingAuthorizationEvaluation create(Map<String, Object> params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Request a fraud risk assessment from Stripe for an Issuing card authorization. */
  public static IssuingAuthorizationEvaluation create(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/issuing_authorization_evaluations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, IssuingAuthorizationEvaluation.class);
  }

  /** Request a fraud risk assessment from Stripe for an Issuing card authorization. */
  public static IssuingAuthorizationEvaluation create(
      IssuingAuthorizationEvaluationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Request a fraud risk assessment from Stripe for an Issuing card authorization. */
  public static IssuingAuthorizationEvaluation create(
      IssuingAuthorizationEvaluationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/issuing_authorization_evaluations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, IssuingAuthorizationEvaluation.class);
  }

  /** Details about the authorization transaction. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationDetails extends StripeObject {
    /** The authorization amount in the smallest currency unit. */
    @SerializedName("amount")
    Long amount;

    /**
     * The method used for authorization.
     *
     * <p>One of {@code chip}, {@code contactless}, {@code keyed_in}, {@code online}, or {@code
     * swipe}.
     */
    @SerializedName("authorization_method")
    String authorizationMethod;

    /** Three-letter ISO currency code in lowercase. */
    @SerializedName("currency")
    String currency;

    /**
     * The card entry mode.
     *
     * <p>One of {@code contactless}, {@code contactless_magstripe}, {@code credential_on_file},
     * {@code integrated_circuit_card}, {@code magstripe}, {@code magstripe_no_cvv}, {@code manual},
     * {@code other}, or {@code unknown}.
     */
    @SerializedName("entry_mode")
    String entryMode;

    /** The raw code for the card entry mode. */
    @SerializedName("entry_mode_raw_code")
    String entryModeRawCode;

    /** The time when the authorization was initiated. */
    @SerializedName("initiated_at")
    Long initiatedAt;

    /**
     * The point of sale condition.
     *
     * <p>One of {@code account_verification}, {@code card_not_present}, {@code card_present},
     * {@code e_commerce}, {@code key_entered_pos}, {@code missing}, {@code moto}, {@code other},
     * {@code pin_entered}, or {@code recurring}.
     */
    @SerializedName("point_of_sale_condition")
    String pointOfSaleCondition;

    /** The raw code for the point of sale condition. */
    @SerializedName("point_of_sale_condition_raw_code")
    String pointOfSaleConditionRawCode;

    /** External reference for the authorization. */
    @SerializedName("reference")
    String reference;
  }

  /** Details about the card used in the authorization. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardDetails extends StripeObject {
    /** The Bank Identification Number (BIN) of the card. */
    @SerializedName("bin")
    String bin;

    /** The country code associated with the card BIN. */
    @SerializedName("bin_country")
    String binCountry;

    /**
     * The type of card (physical or virtual).
     *
     * <p>One of {@code physical}, or {@code virtual}.
     */
    @SerializedName("card_type")
    String cardType;

    /** The time when the card was created. */
    @SerializedName("created_at")
    Long createdAt;

    /** The last 4 digits of the card number. */
    @SerializedName("last4")
    String last4;

    /** External reference for the card. */
    @SerializedName("reference")
    String reference;
  }

  /** Details about the cardholder. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardholderDetails extends StripeObject {
    /** The time when the cardholder was created. */
    @SerializedName("created_at")
    Long createdAt;

    /** External reference for the cardholder. */
    @SerializedName("reference")
    String reference;
  }

  /** Details about the merchant where the authorization occurred. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantDetails extends StripeObject {
    /** The merchant category code (MCC). */
    @SerializedName("category_code")
    String categoryCode;

    /** The merchant country code. */
    @SerializedName("country")
    String country;

    /** The merchant name. */
    @SerializedName("name")
    String name;

    /** The merchant identifier from the card network. */
    @SerializedName("network_id")
    String networkId;

    /** The terminal identifier. */
    @SerializedName("terminal_id")
    String terminalId;
  }

  /** Details about the card network processing. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkDetails extends StripeObject {
    /** The acquiring institution identifier. */
    @SerializedName("acquiring_institution_id")
    String acquiringInstitutionId;

    /**
     * The card network that processed the authorization.
     *
     * <p>One of {@code cirrus}, {@code interlink}, {@code maestro}, {@code mastercard}, {@code
     * other}, {@code plus}, or {@code visa}.
     */
    @SerializedName("routed_network")
    String routedNetwork;
  }

  /** Collection of fraud risk signals for this authorization evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Signals extends StripeObject {
    /** A fraud risk signal with status, error, and data fields. */
    @SerializedName("fraud_risk")
    FraudRisk fraudRisk;

    /** A fraud risk signal with status, error, and data fields. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FraudRisk extends StripeObject {
      /** Signal evaluation data, including score and level. */
      @SerializedName("data")
      Data data;

      /** Details of an error that prevented reporting this signal. */
      @SerializedName("error")
      Map<String, String> error;

      /**
       * The status of this signal.
       *
       * <p>One of {@code error}, or {@code success}.
       */
      @SerializedName("status")
      String status;

      /** The signal's data payload, available upon a successful signal evaluation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Data extends StripeObject {
        /** The time when this signal was evaluated. */
        @SerializedName("evaluated_at")
        Long evaluatedAt;

        /**
         * Risk level, based on the score.
         *
         * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
         * not_assessed}, or {@code unknown}.
         */
        @SerializedName("level")
        String level;

        /**
         * Fraud risk score for this evaluation. Score in the range [0,100], formatted as a 2
         * decimal float, with higher scores indicating a higher likelihood of fraud.
         */
        @SerializedName("score")
        BigDecimal score;
      }
    }
  }

  /** Details about the token, if a tokenized payment method was used. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TokenDetails extends StripeObject {
    /** The time when the token was created. */
    @SerializedName("created_at")
    Long createdAt;

    /** External reference for the token. */
    @SerializedName("reference")
    String reference;

    /**
     * The wallet provider, if applicable.
     *
     * <p>One of {@code apple_pay}, {@code google_pay}, or {@code samsung_pay}.
     */
    @SerializedName("wallet")
    String wallet;
  }

  /** Details about verification checks performed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationDetails extends StripeObject {
    /**
     * The result of the 3D Secure verification.
     *
     * <p>One of {@code attempt_acknowledged}, {@code authenticated}, {@code exempted}, {@code
     * failed}, or {@code required}.
     */
    @SerializedName("three_d_secure_result")
    String threeDSecureResult;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(authorizationDetails, responseGetter);
    trySetResponseGetter(cardDetails, responseGetter);
    trySetResponseGetter(cardholderDetails, responseGetter);
    trySetResponseGetter(merchantDetails, responseGetter);
    trySetResponseGetter(networkDetails, responseGetter);
    trySetResponseGetter(signals, responseGetter);
    trySetResponseGetter(tokenDetails, responseGetter);
    trySetResponseGetter(verificationDetails, responseGetter);
  }
}
