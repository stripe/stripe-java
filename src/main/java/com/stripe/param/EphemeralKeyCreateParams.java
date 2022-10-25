package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EphemeralKeyCreateParams extends ApiRequestParams {
  /** The ID of the Customer you'd like to modify using the resulting ephemeral key. */
  @SerializedName("customer")
  String customer;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The ID of the Issuing Card you'd like to access using the resulting ephemeral key. */
  @SerializedName("issuing_card")
  String issuingCard;

  @SerializedName("stripe-version")
  String stripeVersion;

  private EphemeralKeyCreateParams(
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String issuingCard,
      String stripeVersion) {
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.issuingCard = issuingCard;
    this.stripeVersion = stripeVersion;
  }

  public static Builder builder() {
    return new com.stripe.param.EphemeralKeyCreateParams.Builder();
  }

  public static class Builder {
    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String issuingCard;

    private String stripeVersion;

    /** Finalize and obtain parameter instance from this builder. */
    public EphemeralKeyCreateParams build() {
      return new EphemeralKeyCreateParams(
          this.customer, this.expand, this.extraParams, this.issuingCard, this.stripeVersion);
    }

    /** The ID of the Customer you'd like to modify using the resulting ephemeral key. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * EphemeralKeyCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link EphemeralKeyCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
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

    /** The ID of the Issuing Card you'd like to access using the resulting ephemeral key. */
    public Builder setStripeVersion(String stripeVersion) {
      this.stripeVersion = stripeVersion;
      return this;
    }
  }
}
