// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.billing.BillSetting;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingBillSettingUpdatedEvent extends Event {
  /** Data for the v2.billing.bill_setting.updated event. */
  @SerializedName("data")
  V2BillingBillSettingUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Timestamp of when the object was updated. */
    @SerializedName("updated")
    Instant updated;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public BillSetting fetchRelatedObject() throws StripeException {
    return (BillSetting) super.fetchRelatedObject(this.relatedObject);
  }
}
