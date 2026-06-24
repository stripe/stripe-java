// File generated from our OpenAPI spec
package com.stripe.model.v2.core.health;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An alert history entry representing a state transition of a health alert. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AlertHistoryEntry extends StripeObject implements HasId {
  /** Populated when type is api_error. */
  @SerializedName("api_error")
  ApiError apiError;

  /** Populated when type is api_latency. */
  @SerializedName("api_latency")
  ApiLatency apiLatency;

  /** The time at which this transition occurred. */
  @SerializedName("at")
  Instant at;

  /** Populated when type is authorization_rate_drop. */
  @SerializedName("authorization_rate_drop")
  AuthorizationRateDrop authorizationRateDrop;

  /** Populated when type is elements_error. */
  @SerializedName("elements_error")
  ElementsError elementsError;

  /** Populated when type is event_generation_failure. */
  @SerializedName("event_generation_failure")
  EventGenerationFailure eventGenerationFailure;

  /** Populated when type is fraud_rate. */
  @SerializedName("fraud_rate")
  FraudRate fraudRate;

  /** Unique identifier for the alert history entry. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Populated when type is invoice_count_dropped. */
  @SerializedName("invoice_count_dropped")
  InvoiceCountDropped invoiceCountDropped;

  /** Populated when type is issuing_authorization_request_errors. */
  @SerializedName("issuing_authorization_request_errors")
  IssuingAuthorizationRequestErrors issuingAuthorizationRequestErrors;

  /** Populated when type is issuing_authorization_request_timeout. */
  @SerializedName("issuing_authorization_request_timeout")
  IssuingAuthorizationRequestTimeout issuingAuthorizationRequestTimeout;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Populated when type is meter_event_summaries_delayed. */
  @SerializedName("meter_event_summaries_delayed")
  MeterEventSummariesDelayed meterEventSummariesDelayed;

  /** Populated when type is metronome_notification_latency. */
  @SerializedName("metronome_notification_latency")
  MetronomeNotificationLatency metronomeNotificationLatency;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.health.alert_history_entry}.
   */
  @SerializedName("object")
  String object;

  /** Populated when type is payment_method_error. */
  @SerializedName("payment_method_error")
  PaymentMethodError paymentMethodError;

  /** Populated when type is sepa_debit_delayed. */
  @SerializedName("sepa_debit_delayed")
  SepaDebitDelayed sepaDebitDelayed;

  /** Populated when type is traffic_volume_drop. */
  @SerializedName("traffic_volume_drop")
  TrafficVolumeDrop trafficVolumeDrop;

  /**
   * The type of transition that occurred.
   *
   * <p>One of {@code impact_updated}, {@code opened}, or {@code resolved}.
   */
  @SerializedName("transition")
  String transition;

  /**
   * The type of the alert. Determines which sub-hash field is populated.
   *
   * <p>One of {@code api_error}, {@code api_latency}, {@code authorization_rate_drop}, {@code
   * elements_error}, {@code event_generation_failure}, {@code fraud_rate}, {@code
   * invoice_count_dropped}, {@code issuing_authorization_request_errors}, {@code
   * issuing_authorization_request_timeout}, {@code meter_event_summaries_delayed}, {@code
   * metronome_notification_latency}, {@code payment_method_error}, {@code sepa_debit_delayed},
   * {@code traffic_volume_drop}, or {@code webhook_latency}.
   */
  @SerializedName("type")
  String type;

  /** Populated when type is webhook_latency. */
  @SerializedName("webhook_latency")
  WebhookLatency webhookLatency;

  /** Populated when type is api_error. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApiError extends StripeObject {
    /** The canonical path. */
    @SerializedName("canonical_path")
    String canonicalPath;

    /** The error code. */
    @SerializedName("error_code")
    String errorCode;

    /**
     * The HTTP method.
     *
     * <p>One of {@code DELETE}, {@code GET}, {@code POST}, or {@code PUT}.
     */
    @SerializedName("http_method")
    String httpMethod;

    /** The HTTP status. */
    @SerializedName("http_status")
    String httpStatus;

    /** The number of impacted requests. */
    @SerializedName("impacted_requests")
    Long impactedRequests;

    /** The percentage of impacted requests. */
    @SerializedName("impacted_requests_percentage")
    BigDecimal impactedRequestsPercentage;

    /** The top impacted connected accounts (only for platforms). */
    @SerializedName("top_impacted_accounts")
    List<AlertHistoryEntry.ApiError.TopImpactedAccount> topImpactedAccounts;

    /**
     * For more details about TopImpactedAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TopImpactedAccount extends StripeObject {
      /** The account ID of the impacted connected account. */
      @SerializedName("account")
      String account;

      /** The number of impacted requests. */
      @SerializedName("impacted_requests")
      Long impactedRequests;

      /** The percentage of impacted requests. */
      @SerializedName("impacted_requests_percentage")
      BigDecimal impactedRequestsPercentage;
    }
  }

  /** Populated when type is api_latency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApiLatency extends StripeObject {
    /** The canonical path. */
    @SerializedName("canonical_path")
    String canonicalPath;

    /**
     * The HTTP method.
     *
     * <p>One of {@code DELETE}, {@code GET}, {@code POST}, or {@code PUT}.
     */
    @SerializedName("http_method")
    String httpMethod;

    /** The HTTP status. */
    @SerializedName("http_status")
    String httpStatus;

    /** The number of impacted requests. */
    @SerializedName("impacted_requests")
    Long impactedRequests;

    /** The percentage of impacted requests. */
    @SerializedName("impacted_requests_percentage")
    BigDecimal impactedRequestsPercentage;

    /** The top impacted connected accounts (only for platforms). */
    @SerializedName("top_impacted_accounts")
    List<AlertHistoryEntry.ApiLatency.TopImpactedAccount> topImpactedAccounts;

    /**
     * For more details about TopImpactedAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TopImpactedAccount extends StripeObject {
      /** The account ID of the impacted connected account. */
      @SerializedName("account")
      String account;

      /** The number of impacted requests. */
      @SerializedName("impacted_requests")
      Long impactedRequests;

      /** The percentage of impacted requests. */
      @SerializedName("impacted_requests_percentage")
      BigDecimal impactedRequestsPercentage;
    }
  }

  /** Populated when type is authorization_rate_drop. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationRateDrop extends StripeObject {
    /**
     * The type of the charge.
     *
     * <p>One of {@code money_moving}, or {@code validation}.
     */
    @SerializedName("charge_type")
    String chargeType;

    /** The current authorization rate percentage. */
    @SerializedName("current_percentage")
    BigDecimal currentPercentage;

    /** Dimensions that describe what subset of payments are impacted. */
    @SerializedName("dimensions")
    List<AlertHistoryEntry.AuthorizationRateDrop.Dimension> dimensions;

    /**
     * The type of the payment method.
     *
     * <p>One of {@code acss_debit}, {@code affirm}, {@code afterpay_clearpay}, {@code alipay},
     * {@code alma}, {@code amazon_pay}, {@code apple_pay}, {@code au_becs_debit}, {@code
     * bacs_debit}, {@code bancontact}, {@code billie}, {@code blik}, {@code boleto}, {@code card},
     * {@code card_present}, {@code cartes_bancaires}, {@code cashapp}, {@code crypto}, {@code
     * dummy_passthrough_card}, {@code eps}, {@code fpx}, {@code giropay}, {@code grabpay}, {@code
     * ideal}, {@code interac_present}, {@code kakao_pay}, {@code klarna}, {@code konbini}, {@code
     * kriya}, {@code kr_card}, {@code link}, {@code mb_way}, {@code mobilepay}, {@code mondu},
     * {@code multibanco}, {@code naver_pay}, {@code ng_bank}, {@code ng_bank_transfer}, {@code
     * ng_card}, {@code ng_market}, {@code ng_ussd}, {@code ng_wallet}, {@code oxxo}, {@code p24},
     * {@code paper_check}, {@code payco}, {@code paynow}, {@code paypal}, {@code paypay}, {@code
     * payto}, {@code pay_by_bank}, {@code pix}, {@code promptpay}, {@code rechnung}, {@code
     * revolut_pay}, {@code samsung_pay}, {@code satispay}, {@code scalapay}, {@code sepa_debit},
     * {@code sequra}, {@code sofort}, {@code sunbit}, {@code swish}, {@code twint}, {@code upi},
     * {@code us_bank_account}, {@code vipps}, {@code wechat_pay}, or {@code zip}.
     */
    @SerializedName("payment_method_type")
    String paymentMethodType;

    /** The previous authorization rate percentage. */
    @SerializedName("previous_percentage")
    BigDecimal previousPercentage;

    /**
     * For more details about Dimension, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dimension extends StripeObject {
      /** Populated when type is issuer. */
      @SerializedName("issuer")
      String issuer;

      /**
       * The type of the dimension. Determines which field in dimension_details is populated.
       *
       * <p>Equal to {@code issuer}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /** Populated when type is elements_error. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ElementsError extends StripeObject {
    /**
     * The type of the element.
     *
     * <p>One of {@code expressCheckout}, or {@code payment}.
     */
    @SerializedName("element_type")
    String elementType;

    /** The number of impacted sessions. */
    @SerializedName("impacted_sessions")
    Long impactedSessions;
  }

  /** Populated when type is event_generation_failure. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EventGenerationFailure extends StripeObject {
    /**
     * The context the event should have been generated for. Only present when the account is a
     * connected account.
     */
    @SerializedName("context")
    String context;

    /** The type of event that Stripe failed to generate. */
    @SerializedName("event_type")
    String eventType;

    /** The related object details. */
    @SerializedName("related_object")
    RelatedObject relatedObject;

    /** The related object details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RelatedObject extends StripeObject implements HasId {
      /** The ID of the related object (e.g., &quot;pi_...&quot;). */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The type of the related object (e.g., &quot;payment_intent&quot;). */
      @SerializedName("type")
      String type;

      /** The API URL for the related object (e.g., &quot;/v1/payment_intents/pi_...&quot;). */
      @SerializedName("url")
      String url;
    }
  }

  /** Populated when type is fraud_rate. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudRate extends StripeObject {
    /**
     * Fraud attack type.
     *
     * <p>One of {@code spike}, or {@code sustained_attack}.
     */
    @SerializedName("attack_type")
    String attackType;

    /** The number of impacted requests which are detected. */
    @SerializedName("impacted_requests")
    Long impactedRequests;

    /** Estimated aggregated amount for the impacted requests. */
    @SerializedName("realized_fraud_amount")
    Amount realizedFraudAmount;
  }

  /** Populated when type is invoice_count_dropped. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceCountDropped extends StripeObject {
    /** The observed number of invoices within the time window. */
    @SerializedName("observed_count")
    BigDecimal observedCount;

    /** The expected threshold number of invoices within the time window. */
    @SerializedName("threshold_count")
    BigDecimal thresholdCount;

    /** The size of the observation time window. */
    @SerializedName("time_window")
    String timeWindow;
  }

  /** Populated when type is issuing_authorization_request_errors. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IssuingAuthorizationRequestErrors extends StripeObject {
    /** Estimated aggregated amount for the approved requests. */
    @SerializedName("approved_amount")
    Amount approvedAmount;

    /** The number of approved requests which are impacted. */
    @SerializedName("approved_impacted_requests")
    Long approvedImpactedRequests;

    /** Estimated aggregated amount for the declined requests. */
    @SerializedName("declined_amount")
    Amount declinedAmount;

    /** The number of declined requests which are impacted. */
    @SerializedName("declined_impacted_requests")
    Long declinedImpactedRequests;
  }

  /** Populated when type is issuing_authorization_request_timeout. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IssuingAuthorizationRequestTimeout extends StripeObject {
    /** Estimated aggregated amount for the approved requests. */
    @SerializedName("approved_amount")
    Amount approvedAmount;

    /** The number of approved requests which are impacted. */
    @SerializedName("approved_impacted_requests")
    Long approvedImpactedRequests;

    /** Estimated aggregated amount for the declined requests. */
    @SerializedName("declined_amount")
    Amount declinedAmount;

    /** The number of declined requests which are impacted. */
    @SerializedName("declined_impacted_requests")
    Long declinedImpactedRequests;
  }

  /** Populated when type is meter_event_summaries_delayed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MeterEventSummariesDelayed extends StripeObject {
    /**
     * The ingestion method.
     *
     * <p>Equal to {@code import_sets}.
     */
    @SerializedName("ingestion_method")
    String ingestionMethod;
  }

  /** Populated when type is metronome_notification_latency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MetronomeNotificationLatency extends StripeObject {
    /**
     * The impacted Metronome billing pipeline.
     *
     * <p>One of {@code configuration_triggered}, {@code high_cardinality_usage_triggered}, {@code
     * standard_usage_triggered}, or {@code time_triggered}.
     */
    @SerializedName("pipeline")
    String pipeline;
  }

  /** Populated when type is payment_method_error. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodError extends StripeObject {
    /** The returned error code. */
    @SerializedName("error_code")
    String errorCode;

    /** The number of impacted requests. */
    @SerializedName("impacted_requests")
    Long impactedRequests;

    /** The percentage of impacted requests. */
    @SerializedName("impacted_requests_percentage")
    BigDecimal impactedRequestsPercentage;

    /**
     * The type of the payment method.
     *
     * <p>One of {@code acss_debit}, {@code affirm}, {@code afterpay_clearpay}, {@code alipay},
     * {@code alma}, {@code amazon_pay}, {@code apple_pay}, {@code au_becs_debit}, {@code
     * bacs_debit}, {@code bancontact}, {@code billie}, {@code blik}, {@code boleto}, {@code card},
     * {@code card_present}, {@code cartes_bancaires}, {@code cashapp}, {@code crypto}, {@code
     * dummy_passthrough_card}, {@code eps}, {@code fpx}, {@code giropay}, {@code grabpay}, {@code
     * ideal}, {@code interac_present}, {@code kakao_pay}, {@code klarna}, {@code konbini}, {@code
     * kriya}, {@code kr_card}, {@code link}, {@code mb_way}, {@code mobilepay}, {@code mondu},
     * {@code multibanco}, {@code naver_pay}, {@code ng_bank}, {@code ng_bank_transfer}, {@code
     * ng_card}, {@code ng_market}, {@code ng_ussd}, {@code ng_wallet}, {@code oxxo}, {@code p24},
     * {@code paper_check}, {@code payco}, {@code paynow}, {@code paypal}, {@code paypay}, {@code
     * payto}, {@code pay_by_bank}, {@code pix}, {@code promptpay}, {@code rechnung}, {@code
     * revolut_pay}, {@code samsung_pay}, {@code satispay}, {@code scalapay}, {@code sepa_debit},
     * {@code sequra}, {@code sofort}, {@code sunbit}, {@code swish}, {@code twint}, {@code upi},
     * {@code us_bank_account}, {@code vipps}, {@code wechat_pay}, or {@code zip}.
     */
    @SerializedName("payment_method_type")
    String paymentMethodType;

    /** The top impacted connected accounts (only for platforms). */
    @SerializedName("top_impacted_accounts")
    List<AlertHistoryEntry.PaymentMethodError.TopImpactedAccount> topImpactedAccounts;

    /**
     * For more details about TopImpactedAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TopImpactedAccount extends StripeObject {
      /** The account ID of the impacted connected account. */
      @SerializedName("account")
      String account;

      /** The number of impacted requests. */
      @SerializedName("impacted_requests")
      Long impactedRequests;

      /** The percentage of impacted requests. */
      @SerializedName("impacted_requests_percentage")
      BigDecimal impactedRequestsPercentage;
    }
  }

  /** Populated when type is sepa_debit_delayed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebitDelayed extends StripeObject {
    /** The number of impacted payments. */
    @SerializedName("impacted_payments")
    Long impactedPayments;

    /** The percentage of impacted payments. */
    @SerializedName("impacted_payments_percentage")
    BigDecimal impactedPaymentsPercentage;
  }

  /** Populated when type is traffic_volume_drop. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TrafficVolumeDrop extends StripeObject {
    /** The total volume of payment requests within the latest observation time window. */
    @SerializedName("actual_traffic")
    Long actualTraffic;

    /** The canonical path. */
    @SerializedName("canonical_path")
    String canonicalPath;

    /** The expected volume of payment requests within the latest observation time window. */
    @SerializedName("expected_traffic")
    Long expectedTraffic;

    /** The size of the observation time window. */
    @SerializedName("time_window")
    String timeWindow;
  }

  /** Populated when type is webhook_latency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WebhookLatency extends StripeObject {
    /** The number of impacted requests. */
    @SerializedName("impacted_requests")
    Long impactedRequests;
  }
}
