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
public final class V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEvent
    extends Event {
  /** Data for the v2.core.account[configuration.customer].capability_status_updated event. */
  @SerializedName("data")
  V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEvent.EventData data;

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

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Account fetchRelatedObject() throws StripeException {
    return (Account) super.fetchRelatedObject(this.relatedObject);
  }
}
