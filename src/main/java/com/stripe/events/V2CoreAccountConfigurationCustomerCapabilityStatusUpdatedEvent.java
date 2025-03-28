// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountConfigurationCustomerCapabilityStatusUpdatedEvent extends Event {
  /** Data for the v2.core.account[configuration.customer].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountConfigurationCustomerCapabilityStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Open Enum. The capability which had its status updated.
     *
     * <p>Equal to {@code automatic_indirect_tax}.
     */
    @SerializedName("updated_capability")
    String updatedCapability;
  }
}
