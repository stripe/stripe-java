// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Account;
import com.stripe.model.v2.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class AccountConfigurationRecipientDataAccountLinkCompletedEvent extends Event {
  /** Data for the account.configuration_recipient_data.account_link_completed event. */
  @SerializedName("data")
  AccountConfigurationRecipientDataAccountLinkCompletedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /**
     * Closed Enum. The use case type of the account link that has been completed.
     *
     * <p>One of {@code account_onboarding}, or {@code account_update}.
     */
    @SerializedName("use_case")
    String useCase;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Account fetchRelatedObject() throws StripeException {
    return (Account) super.fetchRelatedObject(this.relatedObject);
  }
}
