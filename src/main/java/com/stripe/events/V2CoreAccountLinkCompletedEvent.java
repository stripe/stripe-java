// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.core.AccountLink;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountLinkCompletedEvent extends Event {
  /** Data for the v2.core.account_link.completed event. */
  @SerializedName("data")
  V2CoreAccountLinkCompletedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the v2 account. */
    @SerializedName("account_id")
    String accountId;
    /** Configurations on the Account that was onboarded via the account link. */
    @SerializedName("configurations")
    List<String> configurations;
    /**
     * Open Enum. The use case type of the account link that has been completed.
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
  public AccountLink fetchRelatedObject() throws StripeException {
    return (AccountLink) super.fetchRelatedObject(this.relatedObject);
  }
}
