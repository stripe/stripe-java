// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TopupCreateParams extends ApiRequestParams {
  /** A positive integer representing how much to transfer. */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * The ID of a source to transfer funds from. For most users, this should be left unspecified
   * which will use the bank account that was set up in the dashboard for the specified currency. In
   * test mode, this can be a test bank token (see <a
   * href="https://stripe.com/docs/connect/testing#testing-top-ups">Testing Top-ups</a>).
   */
  @SerializedName("source")
  String source;

  /**
   * Extra information about a top-up for the source's bank statement. Limited to 15 ASCII
   * characters.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /** A string that identifies this top-up as part of a group. */
  @SerializedName("transfer_group")
  String transferGroup;

  private TopupCreateParams(
      Long amount,
      String currency,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      String source,
      String statementDescriptor,
      String transferGroup) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.source = source;
    this.statementDescriptor = statementDescriptor;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private String source;

    private String statementDescriptor;

    private String transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public TopupCreateParams build() {
      return new TopupCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.source,
          this.statementDescriptor,
          this.transferGroup);
    }

    /** A positive integer representing how much to transfer. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
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
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TopupCreateParams#expand} for the field documentation.
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
     * TopupCreateParams#expand} for the field documentation.
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
     * TopupCreateParams#extraParams} for the field documentation.
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
     * See {@link TopupCreateParams#extraParams} for the field documentation.
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
     * TopupCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link TopupCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * The ID of a source to transfer funds from. For most users, this should be left unspecified
     * which will use the bank account that was set up in the dashboard for the specified currency.
     * In test mode, this can be a test bank token (see <a
     * href="https://stripe.com/docs/connect/testing#testing-top-ups">Testing Top-ups</a>).
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * Extra information about a top-up for the source's bank statement. Limited to 15 ASCII
     * characters.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /** A string that identifies this top-up as part of a group. */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }
}
