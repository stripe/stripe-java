package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class OrderPayParams extends ApiRequestParams {
  @SerializedName("application_fee")
  Long applicationFee;

  /**
   * The ID of an existing customer that will be charged for this order. If no customer was attached
   * to the order at creation, either `source` or `customer` is required. Otherwise, the specified
   * customer will be charged instead of the one attached to the order.
   */
  @SerializedName("customer")
  String customer;

  /**
   * The email address of the customer placing the order. Required if not previously specified for
   * the order.
   */
  @SerializedName("email")
  String email;

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

  /**
   * A set of key-value pairs that you can attach to an order object. Limited to 500 characters.
   * Metadata can be useful for storing additional information about the order in a structured
   * format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * A [Token](https://stripe.com/docs/api#tokens)'s or a
   * [Source](https://stripe.com/docs/api#sources)'s ID, as returned by
   * [Elements](https://stripe.com/docs/elements). If no customer was attached to the order at
   * creation, either `source` or `customer is required. Otherwise, the specified source will be
   * charged intead of the customer attached to the order.
   */
  @SerializedName("source")
  String source;

  private OrderPayParams(
      Long applicationFee,
      String customer,
      String email,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String source) {
    this.applicationFee = applicationFee;
    this.customer = customer;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.source = source;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long applicationFee;

    private String customer;

    private String email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String source;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderPayParams build() {
      return new OrderPayParams(
          this.applicationFee,
          this.customer,
          this.email,
          this.expand,
          this.extraParams,
          this.metadata,
          this.source);
    }

    public Builder setApplicationFee(Long applicationFee) {
      this.applicationFee = applicationFee;
      return this;
    }

    /**
     * The ID of an existing customer that will be charged for this order. If no customer was
     * attached to the order at creation, either `source` or `customer` is required. Otherwise, the
     * specified customer will be charged instead of the one attached to the order.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The email address of the customer placing the order. Required if not previously specified for
     * the order.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderPayParams#expand} for the field documentation.
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
     * OrderPayParams#expand} for the field documentation.
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
     * OrderPayParams#extraParams} for the field documentation.
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
     * See {@link OrderPayParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OrderPayParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link OrderPayParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * A [Token](https://stripe.com/docs/api#tokens)'s or a
     * [Source](https://stripe.com/docs/api#sources)'s ID, as returned by
     * [Elements](https://stripe.com/docs/elements). If no customer was attached to the order at
     * creation, either `source` or `customer is required. Otherwise, the specified source will be
     * charged intead of the customer attached to the order.
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }
  }
}
