// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.core.AccountPerson;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountPersonCreatedEvent extends Event {
  /** Data for the v2.core.account_person.created event. */
  @SerializedName("data")
  V2CoreAccountPersonCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the v2 account. */
    @SerializedName("account_id")
    String accountId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public AccountPerson fetchRelatedObject() throws StripeException {
    return (AccountPerson) super.fetchRelatedObject(this.relatedObject);
  }
}
