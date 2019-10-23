package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TaxIdCollectionCreateParams extends ApiRequestParams {
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
   * Type of the tax ID, one of `au_abn`, `ch_vat`, `eu_vat`, `in_gst`, `mx_rfc`, `no_vat`,
   * `nz_gst`, or `za_vat`.
   */
  @SerializedName("type")
  Type type;

  /** Value of the tax ID. */
  @SerializedName("value")
  String value;

  private TaxIdCollectionCreateParams(
      List<String> expand, Map<String, Object> extraParams, Type type, String value) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.type = type;
    this.value = value;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Type type;

    private String value;

    /** Finalize and obtain parameter instance from this builder. */
    public TaxIdCollectionCreateParams build() {
      return new TaxIdCollectionCreateParams(this.expand, this.extraParams, this.type, this.value);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TaxIdCollectionCreateParams#expand} for the field documentation.
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
     * TaxIdCollectionCreateParams#expand} for the field documentation.
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
     * TaxIdCollectionCreateParams#extraParams} for the field documentation.
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
     * See {@link TaxIdCollectionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Type of the tax ID, one of `au_abn`, `ch_vat`, `eu_vat`, `in_gst`, `mx_rfc`, `no_vat`,
     * `nz_gst`, or `za_vat`.
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }

    /** Value of the tax ID. */
    public Builder setValue(String value) {
      this.value = value;
      return this;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("au_abn")
    AU_ABN("au_abn"),

    @SerializedName("ch_vat")
    CH_VAT("ch_vat"),

    @SerializedName("eu_vat")
    EU_VAT("eu_vat"),

    @SerializedName("in_gst")
    IN_GST("in_gst"),

    @SerializedName("mx_rfc")
    MX_RFC("mx_rfc"),

    @SerializedName("no_vat")
    NO_VAT("no_vat"),

    @SerializedName("nz_gst")
    NZ_GST("nz_gst"),

    @SerializedName("za_vat")
    ZA_VAT("za_vat");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
