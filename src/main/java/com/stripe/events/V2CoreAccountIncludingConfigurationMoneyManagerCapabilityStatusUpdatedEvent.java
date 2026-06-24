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
public final class V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent
    extends Event {
  /** Data for the v2.core.account[configuration.money_manager].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Open Enum. The capability which had its status updated.
     *
     * <p>One of {@code business_storage.inbound.cad}, {@code business_storage.inbound.eur}, {@code
     * business_storage.inbound.gbp}, {@code business_storage.inbound.usd}, {@code
     * business_storage.inbound.usdc}, {@code business_storage.outbound.cad}, {@code
     * business_storage.outbound.eur}, {@code business_storage.outbound.gbp}, {@code
     * business_storage.outbound.usd}, {@code business_storage.outbound.usdc}, {@code
     * consumer_storage.inbound.usd}, {@code consumer_storage.inbound.usdc}, {@code
     * consumer_storage.outbound.usd}, {@code consumer_storage.outbound.usdc}, {@code
     * inbound_transfers.bank_accounts}, {@code outbound_payments.bank_accounts}, {@code
     * outbound_payments.cards}, {@code outbound_payments.crypto_wallets}, {@code
     * outbound_payments.financial_accounts}, {@code outbound_payments.paper_checks}, {@code
     * outbound_transfers.bank_accounts}, {@code outbound_transfers.crypto_wallets}, {@code
     * outbound_transfers.financial_accounts}, {@code received_credits.bank_accounts}, {@code
     * received_credits.crypto_wallets}, or {@code received_debits.bank_accounts}.
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
