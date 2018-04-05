package com.stripe.model;

public class ChargeOutcomeRule extends StripeObject implements HasId {
  protected String action;
  protected String id;
  protected String predicate;

  public String getAction() {
    return action;
  }

  @Override
  public String getId() {
    return id;
  }

  public String getPredicate() {
    return predicate;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }
}
