// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreHealthAuthorizationRateDropFiringEvent extends Event {
  /** Data for the v2.core.health.authorization_rate_drop.firing event. */
  @SerializedName("data")
  V2CoreHealthAuthorizationRateDropFiringEvent.EventData data;

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
      List<V2CoreHealthAuthorizationRateDropFiringEvent.EventData.Impact.Dimension> dimensions;
      /**
       * The type of the payment method.
       *
       * <p>One of {@code acss_debit}, {@code affirm}, {@code afterpay_clearpay}, {@code alipay},
       * {@code alma}, {@code amazon_pay}, {@code apple_pay}, {@code au_becs_debit}, {@code
       * bacs_debit}, {@code bancontact}, {@code blik}, {@code boleto}, {@code card}, {@code
       * card_present}, {@code cartes_bancaires}, {@code cashapp}, {@code dummy_passthrough_card},
       * {@code eps}, {@code fpx}, {@code giropay}, {@code grabpay}, {@code ideal}, {@code
       * interac_present}, {@code kakao_pay}, {@code klarna}, {@code konbini}, {@code link}, {@code
       * mobilepay}, {@code multibanco}, {@code naver_pay}, {@code oxxo}, {@code p24}, {@code
       * paper_check}, {@code paynow}, {@code paypal}, {@code payto}, {@code pay_by_bank}, {@code
       * pix}, {@code promptpay}, {@code revolut_pay}, {@code sepa_debit}, {@code sofort}, {@code
       * swish}, {@code twint}, {@code upi}, {@code wechat_pay}, or {@code zip}.
       */
      @SerializedName("payment_method_type")
      String paymentMethodType;
      /** The previous authorization rate percentage. */
      @SerializedName("previous_percentage")
      BigDecimal previousPercentage;

      public static final class Dimension {
        /** The issuer dimension. */
        @SerializedName("issuer")
        String issuer;
        /**
         * The type of the dimension.
         *
         * <p>Equal to {@code issuer}.
         */
        @SerializedName("type")
        String type;
      }
    }
  }
}
