package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MerchantData extends StripeObject {
  /**
   * A categorization of the seller's type of business. See our [merchant categories
   * guide](https://stripe.com/docs/issuing/merchant-categories) for a list of possible values.
   */
  @SerializedName("category")
  String category;

  /** City where the seller is located. */
  @SerializedName("city")
  String city;

  /** Country where the seller is located. */
  @SerializedName("country")
  String country;

  /** Name of the seller. */
  @SerializedName("name")
  String name;

  /** Identifier assigned to the seller by the card brand. */
  @SerializedName("network_id")
  String networkId;

  /** Postal code where the seller is located. */
  @SerializedName("postal_code")
  String postalCode;

  /** State where the seller is located. */
  @SerializedName("state")
  String state;

  /** The url an online purchase was made from. */
  @SerializedName("url")
  String url;
}
