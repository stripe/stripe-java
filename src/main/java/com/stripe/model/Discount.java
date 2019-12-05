package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Discount extends StripeObject {
  @SerializedName("coupon")
  Coupon coupon;

  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * If the coupon has a duration of `repeating`, the date that this discount will end. If the
   * coupon has a duration of `once` or `forever`, this attribute will be null.
   */
  @SerializedName("end")
  Long end;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `discount`.
   */
  @SerializedName("object")
  String object;

  /** Date that the coupon was applied. */
  @SerializedName("start")
  Long start;

  /**
   * The subscription that this coupon is applied to, if it is applied to a particular subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }
}
