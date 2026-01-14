// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Account;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent
    extends Event {
  /** Data for the v2.core.account[configuration.merchant].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Open Enum. The capability which had its status updated.
     *
     * <p>One of {@code ach_debit_payments}, {@code acss_debit_payments}, {@code affirm_payments},
     * {@code afterpay_clearpay_payments}, {@code alma_payments}, {@code amazon_pay_payments},
     * {@code au_becs_debit_payments}, {@code bacs_debit_payments}, {@code bancontact_payments},
     * {@code blik_payments}, {@code boleto_payments}, {@code card_payments}, {@code
     * cartes_bancaires_payments}, {@code cashapp_payments}, {@code eps_payments}, {@code
     * fpx_payments}, {@code gb_bank_transfer_payments}, {@code grabpay_payments}, {@code
     * ideal_payments}, {@code jcb_payments}, {@code jp_bank_transfer_payments}, {@code
     * kakao_pay_payments}, {@code klarna_payments}, {@code konbini_payments}, {@code
     * kr_card_payments}, {@code link_payments}, {@code mobilepay_payments}, {@code
     * multibanco_payments}, {@code mx_bank_transfer_payments}, {@code naver_pay_payments}, {@code
     * oxxo_payments}, {@code p24_payments}, {@code payco_payments}, {@code paynow_payments}, {@code
     * stripe_balance.payouts}, {@code pay_by_bank_payments}, {@code promptpay_payments}, {@code
     * revolut_pay_payments}, {@code samsung_pay_payments}, {@code sepa_bank_transfer_payments},
     * {@code sepa_debit_payments}, {@code swish_payments}, {@code twint_payments}, {@code
     * us_bank_transfer_payments}, or {@code zip_payments}.
     */
    @SerializedName("updated_capability")
    String updatedCapability;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Account fetchRelatedObject() throws StripeException {
    return (Account) super.fetchRelatedObject(this.relatedObject);
  }
}
