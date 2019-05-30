package com.stripe.model;

// This class is meant to be used for expandable fields in the Stripe API.
// For example, ExpandableField<BalanceTransaction> in Charge.
// The class should always contain a String id, and may have a null or type T expandedObject.
// More info here: https://stripe.com/docs/api#expanding_objects
public class ExpandableField<T extends HasId> {
  private String id;
  private T expandedObject;

  public ExpandableField(String id, T expandedObject) {
    this.id = id;
    this.expandedObject = expandedObject;
  }

  public boolean isExpanded() {
    return expandedObject != null;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public T getExpanded() {
    return expandedObject;
  }

  public void setExpanded(T expandedObject) {
    this.expandedObject = expandedObject;
  }
}
