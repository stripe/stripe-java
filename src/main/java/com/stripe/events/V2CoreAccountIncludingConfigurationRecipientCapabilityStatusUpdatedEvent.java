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
public final class V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent
    extends Event {
  /** Data for the v2.core.account[configuration.recipient].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Open Enum. The capability which had its status updated.
     *
     * <p>One of {@code bank_accounts.instant}, {@code bank_accounts.local}, {@code
     * bank_accounts.wire}, {@code cards}, {@code crypto_wallets_v2}, {@code
     * stripe_balance.payouts}, {@code stripe_balance.stripe_transfers}, or {@code
     * stripe.transfers}.
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
