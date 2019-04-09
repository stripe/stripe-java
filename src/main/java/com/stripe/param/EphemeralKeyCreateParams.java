package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;

public class EphemeralKeyCreateParams extends ApiRequestParams {
  /** The ID of the Customer you'd like to modify using the resulting ephemeral key. */
  @SerializedName("customer")
  String customer;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** The ID of the Issuing Card you'd like to access using the resulting ephemeral key. */
  @SerializedName("issuing_card")
  String issuingCard;

  private EphemeralKeyCreateParams(String customer, List<String> expand, String issuingCard) {
    this.customer = customer;
    this.expand = expand;
    this.issuingCard = issuingCard;
  }

  public static Builder builder() {
    return new com.stripe.param.EphemeralKeyCreateParams.Builder();
  }

  public static class Builder {
    private String customer;

    private List<String> expand;

    private String issuingCard;

    /** Finalize and obtain parameter instance from this builder. */
    public EphemeralKeyCreateParams build() {
      return new EphemeralKeyCreateParams(this.customer, this.expand, this.issuingCard);
    }

    /** The ID of the Customer you'd like to modify using the resulting ephemeral key. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EphemeralKeyCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EphemeralKeyCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** The ID of the Issuing Card you'd like to access using the resulting ephemeral key. */
    public Builder setIssuingCard(String issuingCard) {
      this.issuingCard = issuingCard;
      return this;
    }
  }
}
