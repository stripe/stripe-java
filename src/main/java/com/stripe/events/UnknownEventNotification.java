package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.core.EventNotification;
import lombok.Getter;

/**
 * Represents a valid EventNotification that the SDK doesn't have a type for. May have a
 * `relatedObject` property.
 */
@Getter
public class UnknownEventNotification extends EventNotification {
  /** [Optional] Object containing the reference to API resource relevant to the event. */
  @SerializedName("related_object")
  public RelatedObject relatedObject;

  /**
   * Will make the API call to fetch a related object, if possible. The returned object will have
   * the correct type at runtime, but type information about it isn't known at compile time.
   */
  public StripeObject fetchRelatedObject() throws StripeException {
    return super.fetchRelatedObject(this.relatedObject);
  }

  /**
   * Will make the API call to fetch a related object, if possible. The returned object will have
   * the correct type at runtime, but type information about it isn't known at compile time.
   */
  @Override
  public Event fetchEvent() throws StripeException {
    return super.fetchEvent();
  }
}
