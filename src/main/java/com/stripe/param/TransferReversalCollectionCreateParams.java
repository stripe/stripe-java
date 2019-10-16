package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TransferReversalCollectionCreateParams extends ApiRequestParams {
  /**
   * A positive integer in %s representing how much of this transfer to reverse. Can only reverse up
   * to the unreversed amount remaining of the transfer. Partial transfer reversals are only allowed
   * for transfers to Stripe Accounts. Defaults to the entire transfer amount.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * An arbitrary string which you can attach to a reversal object. It is displayed alongside the
   * reversal in the Dashboard. This will be unset if you POST an empty value.
   */
  @SerializedName("description")
  String description;

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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Boolean indicating whether the application fee should be refunded when reversing this transfer.
   * If a full transfer reversal is given, the full application fee will be refunded. Otherwise, the
   * application fee will be refunded with an amount proportional to the amount of the transfer
   * reversed.
   */
  @SerializedName("refund_application_fee")
  Boolean refundApplicationFee;

  private TransferReversalCollectionCreateParams(
      Long amount,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Boolean refundApplicationFee) {
    this.amount = amount;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.refundApplicationFee = refundApplicationFee;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Boolean refundApplicationFee;

    /** Finalize and obtain parameter instance from this builder. */
    public TransferReversalCollectionCreateParams build() {
      return new TransferReversalCollectionCreateParams(
          this.amount,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.refundApplicationFee);
    }

    /**
     * A positive integer in %s representing how much of this transfer to reverse. Can only reverse
     * up to the unreversed amount remaining of the transfer. Partial transfer reversals are only
     * allowed for transfers to Stripe Accounts. Defaults to the entire transfer amount.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a reversal object. It is displayed alongside the
     * reversal in the Dashboard. This will be unset if you POST an empty value.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransferReversalCollectionCreateParams#expand} for the field documentation.
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
     * TransferReversalCollectionCreateParams#expand} for the field documentation.
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
     * TransferReversalCollectionCreateParams#extraParams} for the field documentation.
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
     * See {@link TransferReversalCollectionCreateParams#extraParams} for the field documentation.
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
     * TransferReversalCollectionCreateParams#metadata} for the field documentation.
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
     * See {@link TransferReversalCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Boolean indicating whether the application fee should be refunded when reversing this
     * transfer. If a full transfer reversal is given, the full application fee will be refunded.
     * Otherwise, the application fee will be refunded with an amount proportional to the amount of
     * the transfer reversed.
     */
    public Builder setRefundApplicationFee(Boolean refundApplicationFee) {
      this.refundApplicationFee = refundApplicationFee;
      return this;
    }
  }
}
