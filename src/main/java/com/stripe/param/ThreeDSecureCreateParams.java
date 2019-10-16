package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ThreeDSecureCreateParams extends ApiRequestParams {
  /** Amount of the charge that you will create when authentication completes. */
  @SerializedName("amount")
  Long amount;

  /** The ID of a card token, or the ID of a card belonging to the given customer. */
  @SerializedName("card")
  String card;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

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

  /** The URL that the cardholder's browser will be returned to when authentication completes. */
  @SerializedName("return_url")
  String returnUrl;

  private ThreeDSecureCreateParams(
      Long amount,
      String card,
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String returnUrl) {
    this.amount = amount;
    this.card = card;
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.returnUrl = returnUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String card;

    private String currency;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String returnUrl;

    /** Finalize and obtain parameter instance from this builder. */
    public ThreeDSecureCreateParams build() {
      return new ThreeDSecureCreateParams(
          this.amount,
          this.card,
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.returnUrl);
    }

    /** Amount of the charge that you will create when authentication completes. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** The ID of a card token, or the ID of a card belonging to the given customer. */
    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ThreeDSecureCreateParams#expand} for the field documentation.
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
     * ThreeDSecureCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ThreeDSecureCreateParams#extraParams} for the field documentation.
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
     * See {@link ThreeDSecureCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The URL that the cardholder's browser will be returned to when authentication completes. */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }
  }
}
