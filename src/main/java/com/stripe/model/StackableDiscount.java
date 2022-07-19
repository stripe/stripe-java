// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StackableDiscount extends StripeObject {
  /** ID of the coupon to create a new discount for. */
  @SerializedName("coupon")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Coupon> coupon;

  /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
  @SerializedName("discount")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Discount> discount;

  /** Get ID of expandable {@code coupon} object. */
  public String getCoupon() {
    return (this.coupon != null) ? this.coupon.getId() : null;
  }

  public void setCoupon(String id) {
    this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
  }

  /** Get expanded {@code coupon}. */
  public Coupon getCouponObject() {
    return (this.coupon != null) ? this.coupon.getExpanded() : null;
  }

  public void setCouponObject(Coupon expandableObject) {
    this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code discount} object. */
  public String getDiscount() {
    return (this.discount != null) ? this.discount.getId() : null;
  }

  public void setDiscount(String id) {
    this.discount = ApiResource.setExpandableFieldId(id, this.discount);
  }

  /** Get expanded {@code discount}. */
  public Discount getDiscountObject() {
    return (this.discount != null) ? this.discount.getExpanded() : null;
  }

  public void setDiscountObject(Discount expandableObject) {
    this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
  }
}
