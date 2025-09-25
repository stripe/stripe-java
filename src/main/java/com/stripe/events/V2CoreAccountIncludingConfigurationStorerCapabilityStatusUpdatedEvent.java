// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.core.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent
    extends Event {
  /** Data for the v2.core.account[configuration.storer].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Open Enum. The capability which had its status updated.
     *
     * <p>One of {@code financial_addressses.bank_accounts}, {@code
     * financial_addressses.crypto_wallets}, {@code holds_currencies.eur}, {@code
     * holds_currencies.gbp}, {@code holds_currencies.usd}, {@code holds_currencies.usdc}, {@code
     * inbound_transfers.bank_accounts}, {@code outbound_payments.bank_accounts}, {@code
     * outbound_payments.cards}, {@code outbound_payments.crypto_wallets}, {@code
     * outbound_payments.financial_accounts}, {@code outbound_transfers.bank_accounts}, {@code
     * outbound_transfers.crypto_wallets}, or {@code outbound_transfers.financial_accounts}.
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
