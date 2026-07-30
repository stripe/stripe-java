// File generated from our OpenAPI spec
package com.stripe.param.terminal;

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
public class ReaderActivateGiftCardParams extends ApiRequestParams {
  /** The initial balance to set on the gift card. */
  @SerializedName("balance")
  Balance balance;

  /** <strong>Required.</strong> The brand of the gift card. */
  @SerializedName("brand")
  Brand brand;

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

  /** The Stripe account ID to process the gift card operation on behalf of. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  private ReaderActivateGiftCardParams(
      Balance balance,
      Brand brand,
      List<String> expand,
      Map<String, Object> extraParams,
      String onBehalfOf) {
    this.balance = balance;
    this.brand = brand;
    this.expand = expand;
    this.extraParams = extraParams;
    this.onBehalfOf = onBehalfOf;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Balance balance;

    private Brand brand;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String onBehalfOf;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderActivateGiftCardParams build() {
      return new ReaderActivateGiftCardParams(
          this.balance, this.brand, this.expand, this.extraParams, this.onBehalfOf);
    }

    /** The initial balance to set on the gift card. */
    public Builder setBalance(ReaderActivateGiftCardParams.Balance balance) {
      this.balance = balance;
      return this;
    }

    /** <strong>Required.</strong> The brand of the gift card. */
    public Builder setBrand(ReaderActivateGiftCardParams.Brand brand) {
      this.brand = brand;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderActivateGiftCardParams#expand} for the field documentation.
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
     * ReaderActivateGiftCardParams#expand} for the field documentation.
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
     * ReaderActivateGiftCardParams#extraParams} for the field documentation.
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
     * See {@link ReaderActivateGiftCardParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The Stripe account ID to process the gift card operation on behalf of. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance {
    /**
     * <strong>Required.</strong> The initial balance amount to be loaded when activating the gift
     * card, in the smallest currency unit
     */
    @SerializedName("amount")
    Long amount;

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Balance(Long amount, String currency, Map<String, Object> extraParams) {
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderActivateGiftCardParams.Balance build() {
        return new ReaderActivateGiftCardParams.Balance(
            this.amount, this.currency, this.extraParams);
      }

      /**
       * <strong>Required.</strong> The initial balance amount to be loaded when activating the gift
       * card, in the smallest currency unit
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderActivateGiftCardParams.Balance#extraParams} for the field documentation.
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
       * See {@link ReaderActivateGiftCardParams.Balance#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum Brand implements ApiRequestParams.EnumParam {
    @SerializedName("svs")
    SVS("svs");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Brand(String value) {
      this.value = value;
    }
  }
}
