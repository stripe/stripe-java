package com.stripe.param.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class ValueListCreateParams extends ApiRequestParams {
  /** The name of the value list for use in rules. */
  @SerializedName("alias")
  String alias;

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
   * Type of the items in the value list. One of `card_fingerprint`, `card_bin`, `email`,
   * `ip_address`, `country`, `string`, or `case_sensitive_string`. Use `string` if the item type is
   * unknown or mixed.
   */
  @SerializedName("item_type")
  ItemType itemType;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The human-readable name of the value list. */
  @SerializedName("name")
  String name;

  private ValueListCreateParams(
      String alias,
      List<String> expand,
      Map<String, Object> extraParams,
      ItemType itemType,
      Map<String, String> metadata,
      String name) {
    this.alias = alias;
    this.expand = expand;
    this.extraParams = extraParams;
    this.itemType = itemType;
    this.metadata = metadata;
    this.name = name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String alias;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private ItemType itemType;

    private Map<String, String> metadata;

    private String name;

    /** Finalize and obtain parameter instance from this builder. */
    public ValueListCreateParams build() {
      return new ValueListCreateParams(
          this.alias, this.expand, this.extraParams, this.itemType, this.metadata, this.name);
    }

    /** The name of the value list for use in rules. */
    public Builder setAlias(String alias) {
      this.alias = alias;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ValueListCreateParams#expand} for the field documentation.
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
     * ValueListCreateParams#expand} for the field documentation.
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
     * ValueListCreateParams#extraParams} for the field documentation.
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
     * See {@link ValueListCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Type of the items in the value list. One of `card_fingerprint`, `card_bin`, `email`,
     * `ip_address`, `country`, `string`, or `case_sensitive_string`. Use `string` if the item type
     * is unknown or mixed.
     */
    public Builder setItemType(ItemType itemType) {
      this.itemType = itemType;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ValueListCreateParams#metadata} for the field documentation.
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
     * See {@link ValueListCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The human-readable name of the value list. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }
  }

  public enum ItemType implements ApiRequestParams.EnumParam {
    @SerializedName("card_bin")
    CARD_BIN("card_bin"),

    @SerializedName("card_fingerprint")
    CARD_FINGERPRINT("card_fingerprint"),

    @SerializedName("case_sensitive_string")
    CASE_SENSITIVE_STRING("case_sensitive_string"),

    @SerializedName("country")
    COUNTRY("country"),

    @SerializedName("email")
    EMAIL("email"),

    @SerializedName("ip_address")
    IP_ADDRESS("ip_address"),

    @SerializedName("string")
    STRING("string");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ItemType(String value) {
      this.value = value;
    }
  }
}
