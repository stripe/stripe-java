// File generated from our OpenAPI spec
package com.stripe.model.sharedpayment;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A SharedPaymentIssuedToken is a limited-use reference to a PaymentMethod that can be created with
 * a secret key. When shared with another Stripe account (Seller), it enables that account to either
 * process a payment on Stripe against a PaymentMethod that your Stripe account owns, or to forward
 * a usable credential created against the originalPaymentMethod to then process the payment
 * off-Stripe.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuedToken extends StripeObject implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** ID of an existing Customer. */
  @SerializedName("customer")
  String customer;

  /** Time at which this SharedPaymentIssuedToken was deactivated. */
  @SerializedName("deactivated_at")
  Long deactivatedAt;

  /**
   * The reason why the SharedPaymentIssuedToken has been deactivated.
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
   * If present, describes the action required to make this {@code SharedPaymentIssuedToken} usable
   * for payments. Present when the token is in {@code requires_action} state.
   */
  @SerializedName("next_action")
  NextAction nextAction;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code shared_payment.issued_token}.
   */
  @SerializedName("object")
  String object;

  /** ID of an existing PaymentMethod. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * If the customer does not exit their browser while authenticating, they will be redirected to
   * this specified URL after completion.
   */
  @SerializedName("return_url")
  String returnUrl;

  /** Risk details of the SharedPaymentIssuedToken. */
  @SerializedName("risk_details")
  RiskDetails riskDetails;

  /** Seller details of the SharedPaymentIssuedToken, including network_id and external_id. */
  @SerializedName("seller_details")
  SellerDetails sellerDetails;

  /**
   * Indicates that you intend to save the PaymentMethod of this SharedPaymentToken to a customer
   * later.
   *
   * <p>Equal to {@code on_session}.
   */
  @SerializedName("setup_future_usage")
  String setupFutureUsage;

  /** Metadata about the SharedPaymentIssuedToken. */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  /**
   * Status of this SharedPaymentIssuedToken, one of {@code active}, {@code requires_action}, or
   * {@code deactivated}.
   */
  @SerializedName("status")
  String status;

  /** Usage details of the SharedPaymentIssuedToken. */
  @SerializedName("usage_details")
  UsageDetails usageDetails;

  /** Usage limits of the SharedPaymentIssuedToken. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  /**
   * For more details about NextAction, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    /**
     * Specifies the type of next action required. Determines which child attribute contains action
     * details.
     *
     * <p>Equal to {@code use_stripe_sdk}.
     */
    @SerializedName("type")
    String type;

    /**
     * Contains details for handling the next action using Stripe.js, iOS, or Android SDKs. Present
     * when {@code next_action.type} is {@code use_stripe_sdk}.
     */
    @SerializedName("use_stripe_sdk")
    UseStripeSdk useStripeSdk;

    /**
     * For more details about UseStripeSdk, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UseStripeSdk extends StripeObject {
      /**
       * A base64-encoded string used by Stripe.js and the iOS and Android client SDKs to handle the
       * next action. Its content is subject to change.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about RiskDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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

  /**
   * For more details about SellerDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SellerDetails extends StripeObject {
    /**
     * A unique id within a network that identifies a logical seller. This should usually be the
     * merchant id on the seller platform.
     */
    @SerializedName("external_id")
    String externalId;

    /**
     * The unique and logical string that identifies the seller platform that this SharedToken is
     * being created for.
     */
    @SerializedName("network_business_profile")
    String networkBusinessProfile;
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
}
