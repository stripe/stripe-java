package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TransferCreateParams extends ApiRequestParams {
  /** A positive integer in %s representing how much to transfer. */
  @SerializedName("amount")
  Long amount;

  /** 3-letter [ISO code for currency](https://stripe.com/docs/payouts). */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The ID of a connected Stripe account. <a href="/docs/connect/charges-transfers">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("destination")
  String destination;

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
   * You can use this parameter to transfer funds from a charge before they are added to your
   * available balance. A pending balance will transfer immediately but the funds will not become
   * available until the original charge becomes available. [See the Connect
   * documentation](https://stripe.com/docs/connect/charges-transfers#transfer-availability) for
   * details.
   */
  @SerializedName("source_transaction")
  String sourceTransaction;

  /**
   * The source balance to use for this transfer. One of `bank_account` or `card`. For most users,
   * this will default to `card`.
   */
  @SerializedName("source_type")
  SourceType sourceType;

  /**
   * A string that identifies this transaction as part of a group. See the [Connect
   * documentation](https://stripe.com/docs/connect/charges-transfers#grouping-transactions) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private TransferCreateParams(
      Long amount,
      String currency,
      String description,
      String destination,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String sourceTransaction,
      SourceType sourceType,
      String transferGroup) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.destination = destination;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.sourceTransaction = sourceTransaction;
    this.sourceType = sourceType;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private String destination;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String sourceTransaction;

    private SourceType sourceType;

    private String transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public TransferCreateParams build() {
      return new TransferCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.destination,
          this.expand,
          this.extraParams,
          this.metadata,
          this.sourceTransaction,
          this.sourceType,
          this.transferGroup);
    }

    /** A positive integer in %s representing how much to transfer. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** 3-letter [ISO code for currency](https://stripe.com/docs/payouts). */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The ID of a connected Stripe account. <a href="/docs/connect/charges-transfers">See the
     * Connect documentation</a> for details.
     */
    public Builder setDestination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransferCreateParams#expand} for the field documentation.
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
     * TransferCreateParams#expand} for the field documentation.
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
     * TransferCreateParams#extraParams} for the field documentation.
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
     * See {@link TransferCreateParams#extraParams} for the field documentation.
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
     * TransferCreateParams#metadata} for the field documentation.
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
     * See {@link TransferCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * You can use this parameter to transfer funds from a charge before they are added to your
     * available balance. A pending balance will transfer immediately but the funds will not become
     * available until the original charge becomes available. [See the Connect
     * documentation](https://stripe.com/docs/connect/charges-transfers#transfer-availability) for
     * details.
     */
    public Builder setSourceTransaction(String sourceTransaction) {
      this.sourceTransaction = sourceTransaction;
      return this;
    }

    /**
     * The source balance to use for this transfer. One of `bank_account` or `card`. For most users,
     * this will default to `card`.
     */
    public Builder setSourceType(SourceType sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. See the [Connect
     * documentation](https://stripe.com/docs/connect/charges-transfers#grouping-transactions) for
     * details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  public enum SourceType implements ApiRequestParams.EnumParam {
    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account"),

    @SerializedName("card")
    CARD("card");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SourceType(String value) {
      this.value = value;
    }
  }
}
