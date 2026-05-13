// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.moneymanagement.FinancialAccountStatement;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2MoneyManagementFinancialAccountStatementRestatedEvent extends Event {
  /** Data for the v2.money_management.financial_account_statement.restated event. */
  @SerializedName("data")
  V2MoneyManagementFinancialAccountStatementRestatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The ID of the Financial Account this statement belongs to. */
    @SerializedName("financial_account")
    String financialAccount;
    /** The ID of the new statement that replaces the original. */
    @SerializedName("restatement_id")
    String restatementId;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public FinancialAccountStatement fetchRelatedObject() throws StripeException {
    return (FinancialAccountStatement) super.fetchRelatedObject(this.relatedObject);
  }
}
