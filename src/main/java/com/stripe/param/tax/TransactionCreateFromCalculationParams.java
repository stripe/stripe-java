// File generated from our OpenAPI spec
package com.stripe.param.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class TransactionCreateFromCalculationParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Tax Calculation ID to be used as input when creating the
   * transaction.
   */
  @SerializedName("calculation")
  String calculation;

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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The Unix timestamp representing when the tax liability is assumed or reduced, which determines
   * the liability posting period and handling in tax liability reports. The timestamp must fall
   * within the {@code tax_date} and the current time, unless the {@code tax_date} is scheduled in
   * advance. Defaults to the current time.
   */
  @SerializedName("posted_at")
  Long postedAt;

  /**
   * <strong>Required.</strong> A custom order or sale identifier, such as 'myOrder_123'. Must be
   * unique across all transactions, including reversals.
   */
  @SerializedName("reference")
  String reference;

  private TransactionCreateFromCalculationParams(
      String calculation,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Long postedAt,
      String reference) {
    this.calculation = calculation;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.postedAt = postedAt;
    this.reference = reference;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String calculation;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Long postedAt;

    private String reference;

    /** Finalize and obtain parameter instance from this builder. */
    public TransactionCreateFromCalculationParams build() {
      return new TransactionCreateFromCalculationParams(
          this.calculation,
          this.expand,
          this.extraParams,
          this.metadata,
          this.postedAt,
          this.reference);
    }

    /**
     * <strong>Required.</strong> Tax Calculation ID to be used as input when creating the
     * transaction.
     */
    public Builder setCalculation(String calculation) {
      this.calculation = calculation;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateFromCalculationParams#expand} for the field documentation.
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
     * TransactionCreateFromCalculationParams#expand} for the field documentation.
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
     * TransactionCreateFromCalculationParams#extraParams} for the field documentation.
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
     * See {@link TransactionCreateFromCalculationParams#extraParams} for the field documentation.
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
     * TransactionCreateFromCalculationParams#metadata} for the field documentation.
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
     * See {@link TransactionCreateFromCalculationParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The Unix timestamp representing when the tax liability is assumed or reduced, which
     * determines the liability posting period and handling in tax liability reports. The timestamp
     * must fall within the {@code tax_date} and the current time, unless the {@code tax_date} is
     * scheduled in advance. Defaults to the current time.
     */
    public Builder setPostedAt(Long postedAt) {
      this.postedAt = postedAt;
      return this;
    }

    /**
     * <strong>Required.</strong> A custom order or sale identifier, such as 'myOrder_123'. Must be
     * unique across all transactions, including reversals.
     */
    public Builder setReference(String reference) {
      this.reference = reference;
      return this;
    }
  }
}
