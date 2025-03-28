// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountConfigurationRecipientCapabilityStatusUpdatedEvent extends Event {
  /** Data for the v2.core.account[configuration.recipient].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountConfigurationRecipientCapabilityStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Open Enum. The capability which had its status updated.
     *
     * <p>One of {@code bank_accounts.local}, {@code bank_accounts.local_uk}, {@code
     * bank_accounts.wire}, {@code bank_accounts.wire_uk}, {@code cards}, {@code cards_uk}, {@code
     * crypto_wallets_v2}, {@code stripe_balance.stripe_transfers}, or {@code stripe.transfers}.
     */
    @SerializedName("updated_capability")
    String updatedCapability;
  }
}
