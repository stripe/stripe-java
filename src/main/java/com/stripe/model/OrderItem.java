package com.stripe.model;

import com.stripe.net.APIResource;

public class OrderItem extends APIResource {
  String object;
  Long amount;
  String currency;
  String description;
  ExpandableField<HasId> parent;
  Integer quantity;
  String type;

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getParent() {
    return (this.parent != null) ? this.parent.getId() : null;
  }

  public void setParent(String parentID) {
    this.parent = setExpandableFieldID(parentID, this.parent);
  }

  public HasId getParentObject() {
    return (this.parent != null) ? this.parent.getExpanded() : null;
  }

  public void setParentObject(HasId o) {
    this.parent = new ExpandableField<HasId>(o.getId(), o);
  }

  public HasId getParentObjectAs() {
    return (this.parent != null) ? this.parent.getExpanded() : null;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
