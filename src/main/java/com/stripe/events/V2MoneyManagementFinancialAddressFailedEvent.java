// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.model.v2.moneymanagement.FinancialAddress;
import lombok.Getter;

@Getter
public final class V2MoneyManagementFinancialAddressFailedEvent extends Event {
  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public FinancialAddress fetchRelatedObject() throws StripeException {
    return (FinancialAddress) super.fetchRelatedObject(this.relatedObject);
  }
}
