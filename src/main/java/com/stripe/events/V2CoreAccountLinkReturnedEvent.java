// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2CoreAccountLinkReturnedEvent extends Event {
  /** Data for the v2.core.account_link.returned event. */
  @SerializedName("data")
  V2CoreAccountLinkReturnedEvent.EventData data;

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
}
