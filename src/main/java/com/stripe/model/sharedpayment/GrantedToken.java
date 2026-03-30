// File generated from our OpenAPI spec
package com.stripe.model.sharedpayment;

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
import com.stripe.param.sharedpayment.GrantedTokenCreateParams;
import com.stripe.param.sharedpayment.GrantedTokenRetrieveParams;
import com.stripe.param.sharedpayment.GrantedTokenRevokeParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * SharedPaymentGrantedToken is the view-only resource of a SharedPaymentIssuedToken, which is a
 * limited-use reference to a PaymentMethod. When another Stripe merchant shares a
 * SharedPaymentIssuedToken with you, you can view attributes of the shared token using the
 * SharedPaymentGrantedToken API, and use it with a PaymentIntent.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GrantedToken extends ApiResource implements HasId {
  /** Details about the agent that issued this SharedPaymentGrantedToken. */
  @SerializedName("agent_details")
  AgentDetails agentDetails;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Time at which this SharedPaymentGrantedToken expires and can no longer be used to confirm a
   * PaymentIntent.
   */
  @SerializedName("deactivated_at")
  Long deactivatedAt;

  /**
   * The reason why the SharedPaymentGrantedToken has been deactivated.
   *
   * <p>One of {@code consumed}, {@code expired}, {@code resolved}, or {@code revoked}.
   */
  @SerializedName("deactivated_reason")
  String deactivatedReason;

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
   * <p>Equal to {@code shared_payment.granted_token}.
   */
  @SerializedName("object")
  String object;

  /** Risk details of the SharedPaymentGrantedToken. */
  @SerializedName("risk_details")
  RiskDetails riskDetails;

  /** Metadata about the SharedPaymentGrantedToken. */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  /** Some details about how the SharedPaymentGrantedToken has been used already. */
  @SerializedName("usage_details")
  UsageDetails usageDetails;

  /** Limits on how this SharedPaymentGrantedToken can be used. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(String sharedPaymentGrantedToken) throws StripeException {
    return retrieve(sharedPaymentGrantedToken, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(String sharedPaymentGrantedToken, RequestOptions options)
      throws StripeException {
    return retrieve(sharedPaymentGrantedToken, (Map<String, Object>) null, options);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(
      String sharedPaymentGrantedToken, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/granted_tokens/%s",
            ApiResource.urlEncodeId(sharedPaymentGrantedToken));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, GrantedToken.class);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(
      String sharedPaymentGrantedToken, GrantedTokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/granted_tokens/%s",
            ApiResource.urlEncodeId(sharedPaymentGrantedToken));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, GrantedToken.class);
  }

  /**
   * For more details about AgentDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AgentDetails extends StripeObject {
    /** The Stripe Profile ID of the agent that issued this SharedPaymentGrantedToken. */
    @SerializedName("network_business_profile")
    String networkBusinessProfile;
  }

  /** Risk details of the SharedPaymentGrantedToken. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskDetails extends StripeObject {
    /**
     * Risk insights for this token, including scores and recommended actions for each risk type.
     */
    @SerializedName("insights")
    Insights insights;

    /**
     * Risk insights for this token, including scores and recommended actions for each risk type.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Insights extends StripeObject {
      /** Bot risk insight (score: Float, recommended_action). */
      @SerializedName("bot")
      Bot bot;

      /** Card issuer decline risk insight (score: Float, recommended_action). */
      @SerializedName("card_issuer_decline")
      CardIssuerDecline cardIssuerDecline;

      /** Card testing risk insight (score: Float, recommended_action). */
      @SerializedName("card_testing")
      CardTesting cardTesting;

      /** Fraudulent dispute risk insight (score: Integer, recommended_action). */
      @SerializedName("fraudulent_dispute")
      FraudulentDispute fraudulentDispute;

      /** Stolen card risk insight (score: Integer, recommended_action). */
      @SerializedName("stolen_card")
      StolenCard stolenCard;

      /** Risk insight with a float score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Bot extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight (float). */
        @SerializedName("score")
        BigDecimal score;
      }

      /** Risk insight with a float score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CardIssuerDecline extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight (float). */
        @SerializedName("score")
        BigDecimal score;
      }

      /** Risk insight with a float score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CardTesting extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight (float). */
        @SerializedName("score")
        BigDecimal score;
      }

      /** Risk insight with an integer score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FraudulentDispute extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight (integer). */
        @SerializedName("score")
        Long score;
      }

      /** Risk insight with an integer score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StolenCard extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight (integer). */
        @SerializedName("score")
        Long score;
      }
    }
  }

  /** Some details on how the SharedPaymentGrantedToken has been used so far. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageDetails extends StripeObject {
    /** The total amount captured using this SharedPaymentToken. */
    @SerializedName("amount_captured")
    AmountCaptured amountCaptured;

    /** A representation of an amount of money, consisting of an amount and a currency. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountCaptured extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /** Integer value of the amount in the smallest currency unit. */
      @SerializedName("value")
      Long value;
    }
  }

  /** Limits on how this SharedPaymentGrantedToken can be used. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageLimits extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Time at which this SharedPaymentToken expires and can no longer be used to confirm a
     * PaymentIntent.
     */
    @SerializedName("expires_at")
    Long expiresAt;

    /** Max amount that can be captured using this SharedPaymentToken. */
    @SerializedName("max_amount")
    Long maxAmount;

    /**
     * The recurring interval at which the shared payment token's amount usage restrictions reset.
     *
     * <p>One of {@code month}, {@code week}, or {@code year}.
     */
    @SerializedName("recurring_interval")
    String recurringInterval;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final GrantedToken resource;

    private TestHelpers(GrantedToken resource) {
      this.resource = resource;
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(Map<String, Object> params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/shared_payment/granted_tokens";
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return getGlobalResponseGetter().request(request, GrantedToken.class);
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(GrantedTokenCreateParams params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(GrantedTokenCreateParams params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/shared_payment/granted_tokens";
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return getGlobalResponseGetter().request(request, GrantedToken.class);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke() throws StripeException {
      return revoke((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(RequestOptions options) throws StripeException {
      return revoke((Map<String, Object>) null, options);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(Map<String, Object> params) throws StripeException {
      return revoke(params, (RequestOptions) null);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/shared_payment/granted_tokens/%s/revoke",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, GrantedToken.class);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(GrantedTokenRevokeParams params) throws StripeException {
      return revoke(params, (RequestOptions) null);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(GrantedTokenRevokeParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/shared_payment/granted_tokens/%s/revoke",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, GrantedToken.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(agentDetails, responseGetter);
    trySetResponseGetter(riskDetails, responseGetter);
    trySetResponseGetter(usageDetails, responseGetter);
    trySetResponseGetter(usageLimits, responseGetter);
  }
}
