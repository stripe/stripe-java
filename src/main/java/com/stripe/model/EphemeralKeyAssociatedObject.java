package com.stripe.model;

public class EphemeralKeyAssociatedObject extends StripeObject implements HasId {
  String type;
  String id;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
