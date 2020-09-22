// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AlipayAccount extends StripeObject implements PaymentSource {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The ID of the customer associated with this Alipay Account. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * Uniquely identifies the account and will be the same across all Alipay account objects that are
   * linked to the same Alipay account.
   */
  @SerializedName("fingerprint")
  String fingerprint;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code alipay_account}.
   */
  @SerializedName("object")
  String object;

  /**
   * If the Alipay account object is not reusable, the exact amount that you can create a charge
   * for.
   */
  @SerializedName("payment_amount")
  Long paymentAmount;

  /**
   * If the Alipay account object is not reusable, the exact currency that you can create a charge
   * for.
   */
  @SerializedName("payment_currency")
  String paymentCurrency;

  /**
   * True if you can create multiple payments using this account. If the account is reusable, then
   * you can freely choose the amount of each payment.
   */
  @SerializedName("reusable")
  Boolean reusable;

  /** Whether this Alipay account object has ever been used for a payment. */
  @SerializedName("used")
  Boolean used;

  /** The username for the Alipay account. */
  @SerializedName("username")
  String username;

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
}
