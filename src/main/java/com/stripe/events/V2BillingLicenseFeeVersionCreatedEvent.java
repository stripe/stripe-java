// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.billing.LicenseFeeVersion;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingLicenseFeeVersionCreatedEvent extends Event {
  /** Data for the v2.billing.license_fee_version.created event. */
  @SerializedName("data")
  V2BillingLicenseFeeVersionCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the LicenseFee that the LicenseFeeVersion belongs to. */
    @SerializedName("license_fee_id")
    String licenseFeeId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public LicenseFeeVersion fetchRelatedObject() throws StripeException {
    return (LicenseFeeVersion) super.fetchRelatedObject(this.relatedObject);
  }
}
