// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PayoutCreateParams extends ApiRequestParams {
  /** A positive integer in cents representing how much to payout. */
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

  /**
   * The ID of a bank account or a card to send the payout to. If no destination is supplied, the
   * default external account for the specified currency will be used.
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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The method used to send this payout, which can be {@code standard} or {@code instant}. {@code
   * instant} is only supported for payouts to debit cards. (See <a
   * href="https://stripe.com/blog/instant-payouts-for-marketplaces">Instant payouts for
   * marketplaces for more information</a>.)
   */
  @SerializedName("method")
  Method method;

  /**
   * The balance type of your Stripe balance to draw this payout from. Balances for different
   * payment sources are kept separately. You can find the amounts with the balances API. One of
   * {@code bank_account}, {@code card}, or {@code fpx}.
   */
  @SerializedName("source_type")
  SourceType sourceType;

  /**
   * A string to be displayed on the recipient's bank or card statement. This may be at most 22
   * characters. Attempting to use a {@code statement_descriptor} longer than 22 characters will
   * return an error. Note: Most banks will truncate this information and/or display it
   * inconsistently. Some may not display it at all.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private PayoutCreateParams(
      Long amount,
      String currency,
      String description,
      String destination,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Method method,
      SourceType sourceType,
      String statementDescriptor) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.destination = destination;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.method = method;
    this.sourceType = sourceType;
    this.statementDescriptor = statementDescriptor;
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

    private Method method;

    private SourceType sourceType;

    private String statementDescriptor;

    /** Finalize and obtain parameter instance from this builder. */
    public PayoutCreateParams build() {
      return new PayoutCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.destination,
          this.expand,
          this.extraParams,
          this.metadata,
          this.method,
          this.sourceType,
          this.statementDescriptor);
    }

    /** A positive integer in cents representing how much to payout. */
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
     * The ID of a bank account or a card to send the payout to. If no destination is supplied, the
     * default external account for the specified currency will be used.
     */
    public Builder setDestination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PayoutCreateParams#expand} for the field documentation.
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
     * PayoutCreateParams#expand} for the field documentation.
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
     * PayoutCreateParams#extraParams} for the field documentation.
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
     * See {@link PayoutCreateParams#extraParams} for the field documentation.
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
     * PayoutCreateParams#metadata} for the field documentation.
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
     * See {@link PayoutCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The method used to send this payout, which can be {@code standard} or {@code instant}. {@code
     * instant} is only supported for payouts to debit cards. (See <a
     * href="https://stripe.com/blog/instant-payouts-for-marketplaces">Instant payouts for
     * marketplaces for more information</a>.)
     */
    public Builder setMethod(Method method) {
      this.method = method;
      return this;
    }

    /**
     * The balance type of your Stripe balance to draw this payout from. Balances for different
     * payment sources are kept separately. You can find the amounts with the balances API. One of
     * {@code bank_account}, {@code card}, or {@code fpx}.
     */
    public Builder setSourceType(SourceType sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * A string to be displayed on the recipient's bank or card statement. This may be at most 22
     * characters. Attempting to use a {@code statement_descriptor} longer than 22 characters will
     * return an error. Note: Most banks will truncate this information and/or display it
     * inconsistently. Some may not display it at all.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  public enum Method implements ApiRequestParams.EnumParam {
    @SerializedName("instant")
    INSTANT("instant"),

    @SerializedName("standard")
    STANDARD("standard");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Method(String value) {
      this.value = value;
    }
  }

  public enum SourceType implements ApiRequestParams.EnumParam {
    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("fpx")
    FPX("fpx");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SourceType(String value) {
      this.value = value;
    }
  }
}
