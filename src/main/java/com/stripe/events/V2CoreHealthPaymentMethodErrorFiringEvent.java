// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthPaymentMethodErrorFiringEvent extends Event {
  /** Data for the v2.core.health.payment_method_error.firing event. */
  @SerializedName("data")
  V2CoreHealthPaymentMethodErrorFiringEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The alert ID. */
    @SerializedName("alert_id")
    String alertId;
    /** The grouping key for the alert. */
    @SerializedName("grouping_key")
    String groupingKey;
    /** The user impact. */
    @SerializedName("impact")
    Impact impact;
    /** The time when impact on the user experience was first detected. */
    @SerializedName("started_at")
    Instant startedAt;
    /** A short description of the alert. */
    @SerializedName("summary")
    String summary;

    public static final class Impact {
      /** The returned error code. */
      @SerializedName("error_code")
      String errorCode;
      /** The number of impacted requests. */
      @SerializedName("impacted_requests")
      Long impactedRequests;
      /**
       * The type of the payment method.
       *
       * <p>One of {@code acss_debit}, {@code affirm}, {@code afterpay_clearpay}, {@code alipay},
       * {@code alma}, {@code amazon_pay}, {@code apple_pay}, {@code au_becs_debit}, {@code
       * bacs_debit}, {@code bancontact}, {@code billie}, {@code blik}, {@code boleto}, {@code
       * card}, {@code card_present}, {@code cartes_bancaires}, {@code cashapp}, {@code crypto},
       * {@code dummy_passthrough_card}, {@code eps}, {@code fpx}, {@code giropay}, {@code grabpay},
       * {@code ideal}, {@code interac_present}, {@code kakao_pay}, {@code klarna}, {@code konbini},
       * {@code kriya}, {@code kr_card}, {@code link}, {@code mb_way}, {@code mobilepay}, {@code
       * mondu}, {@code multibanco}, {@code naver_pay}, {@code ng_bank}, {@code ng_bank_transfer},
       * {@code ng_card}, {@code ng_market}, {@code ng_ussd}, {@code ng_wallet}, {@code oxxo},
       * {@code p24}, {@code paper_check}, {@code payco}, {@code paynow}, {@code paypal}, {@code
       * paypay}, {@code payto}, {@code pay_by_bank}, {@code pix}, {@code promptpay}, {@code
       * rechnung}, {@code revolut_pay}, {@code samsung_pay}, {@code satispay}, {@code scalapay},
       * {@code sepa_debit}, {@code sequra}, {@code sofort}, {@code sunbit}, {@code swish}, {@code
       * twint}, {@code upi}, {@code us_bank_account}, {@code vipps}, {@code wechat_pay}, or {@code
       * zip}.
       */
      @SerializedName("payment_method_type")
      String paymentMethodType;
    }
  }
}
