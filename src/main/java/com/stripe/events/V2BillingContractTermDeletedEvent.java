// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.ContractTerm;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2BillingContractTermDeletedEvent extends Event {
  /** Data for the v2.billing.contract_term.deleted event. */
  @SerializedName("data")
  V2BillingContractTermDeletedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The Contract containing this term. */
    @SerializedName("contract")
    String contract;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public ContractTerm fetchRelatedObject() throws StripeException {
    return (ContractTerm) super.fetchRelatedObject(this.relatedObject);
  }
}
