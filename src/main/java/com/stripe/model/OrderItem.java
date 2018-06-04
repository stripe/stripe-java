package com.stripe.model;

import com.stripe.net.APIResource;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OrderItem extends APIResource {
  String object;
  Long amount;
  String currency;
  String description;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<HasId> parent;
  Integer quantity;
  String type;

  // <editor-fold desc="parent">
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

  public <O extends HasId> O getParentObjectAs() {
    return (this.parent != null) ? (O) this.parent.getExpanded() : null;
  }
  // </editor-fold>
}
