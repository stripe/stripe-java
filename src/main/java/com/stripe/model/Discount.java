// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A discount represents the actual application of a <a
 * href="https://api.stripe.com#coupons">coupon</a> or <a
 * href="https://api.stripe.com#promotion_codes">promotion code</a>. It contains information about
 * when the discount began, when it will end, and what it is applied to.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/billing/subscriptions/discounts">Applying
 * discounts to subscriptions</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Discount extends StripeObject implements HasId {
  /**
   * The Checkout session that this coupon is applied to, if it is applied to a particular session
   * in payment mode. Will not be present for subscription mode.
   */
  @SerializedName("checkout_session")
  String checkoutSession;

  /** The ID of the customer associated with this discount. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The ID of the account representing the customer associated with this discount. */
  @SerializedName("customer_account")
  String customerAccount;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * If the coupon has a duration of {@code repeating}, the date that this discount will end. If the
   * coupon has a duration of {@code once} or {@code forever}, this attribute will be null.
   */
  @SerializedName("end")
  Long end;

  /**
   * The ID of the discount object. Discounts cannot be fetched by ID. Use {@code
   * expand[]=discounts} in API calls to expand discount IDs in an array.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The invoice that the discount's coupon was applied to, if it was applied directly to a
   * particular invoice.
   */
  @SerializedName("invoice")
  String invoice;

  /**
   * The invoice item {@code id} (or invoice line item {@code id} for invoice line items of
   * type='subscription') that the discount's coupon was applied to, if it was applied directly to a
   * particular invoice item or invoice line item.
   */
  @SerializedName("invoice_item")
  String invoiceItem;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code discount}.
   */
  @SerializedName("object")
  String object;

  /** The promotion code applied to create this discount. */
  @SerializedName("promotion_code")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PromotionCode> promotionCode;

  /**
   * The subscription schedule that this coupon is applied to, if it is applied to a particular
   * subscription schedule.
   */
  @SerializedName("schedule")
  String schedule;

  @SerializedName("source")
  Source source;

  /** Date that the coupon was applied. */
  @SerializedName("start")
  Long start;

  /**
   * The subscription that this coupon is applied to, if it is applied to a particular subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * The subscription item that this coupon is applied to, if it is applied to a particular
   * subscription item.
   */
  @SerializedName("subscription_item")
  String subscriptionItem;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code promotionCode} object. */
  public String getPromotionCode() {
    return (this.promotionCode != null) ? this.promotionCode.getId() : null;
  }

  public void setPromotionCode(String id) {
    this.promotionCode = ApiResource.setExpandableFieldId(id, this.promotionCode);
  }

  /** Get expanded {@code promotionCode}. */
  public PromotionCode getPromotionCodeObject() {
    return (this.promotionCode != null) ? this.promotionCode.getExpanded() : null;
  }

  public void setPromotionCodeObject(PromotionCode expandableObject) {
    this.promotionCode =
        new ExpandableField<PromotionCode>(expandableObject.getId(), expandableObject);
  }

  /**
   * For more details about Source, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Source extends StripeObject {
    /** The coupon that was redeemed to create this discount. */
    @SerializedName("coupon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Coupon> coupon;

    /**
     * The source type of the discount.
     *
     * <p>Equal to {@code coupon}.
     */
    @SerializedName("type")
    String type;

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
  }
}
