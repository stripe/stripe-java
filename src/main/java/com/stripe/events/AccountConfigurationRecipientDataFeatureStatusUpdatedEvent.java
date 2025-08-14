// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Account;
import com.stripe.model.v2.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class AccountConfigurationRecipientDataFeatureStatusUpdatedEvent extends Event {
  /** Data for the account.configuration_recipient_data.feature_status_updated event. */
  @SerializedName("data")
  AccountConfigurationRecipientDataFeatureStatusUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Closed Enum. The recipient_data feature which had its status updated.
     *
     * <p>One of {@code bank_accounts.local}, {@code bank_accounts.wire}, or {@code cards}.
     */
    @SerializedName("feature_name")
    String featureName;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Account fetchRelatedObject() throws StripeException {
    return (Account) super.fetchRelatedObject(this.relatedObject);
  }
}
