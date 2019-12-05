package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OrderItem extends StripeObject {
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the total amount for the line item.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /**
   * Description of the line item, meant to be displayable to the user (e.g., `"Express shipping"`).
   */
  @SerializedName("description")
  String description;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `order_item`.
   */
  @SerializedName("object")
  String object;

  /**
   * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to
   * a SKU).
   */
  @SerializedName("parent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Sku> parent;

  /**
   * A positive integer representing the number of instances of `parent` that are included in this
   * order item. Applicable/present only if `type` is `sku`.
   */
  @SerializedName("quantity")
  Long quantity;

  /** The type of line item. One of `sku`, `tax`, `shipping`, or `discount`. */
  @SerializedName("type")
  String type;

  /** Get id of expandable `parent` object. */
  public String getParent() {
    return (this.parent != null) ? this.parent.getId() : null;
  }

  public void setParent(String id) {
    this.parent = ApiResource.setExpandableFieldId(id, this.parent);
  }

  /** Get expanded `parent`. */
  public Sku getParentObject() {
    return (this.parent != null) ? this.parent.getExpanded() : null;
  }

  public void setParentObject(Sku expandableObject) {
    this.parent = new ExpandableField<Sku>(expandableObject.getId(), expandableObject);
  }
}
