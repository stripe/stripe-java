package com.stripe.model;

import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentFlowsPaymentIntentResourceTransferData extends ApiResource {
  /**
   * The account (if any) the payment will be attributed to for tax reporting, and where funds from
   * the payment will be transferred to upon payment success.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> destination;

  /** Get id of expandable `destination` object. */
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String id) {
    this.destination = ApiResource.setExpandableFieldId(id, this.destination);
  }

  /** Get expanded `destination`. */
  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account expandableObject) {
    this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }
}
