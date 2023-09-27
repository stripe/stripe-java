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
public class PaymentIntentApplyCustomerBalanceParams extends ApiRequestParams {
  /**
   * Amount that you intend to apply to this PaymentIntent from the customer’s cash balance.
   *
   * <p>A positive integer representing how much to charge in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> (for example,
   * 100 cents to charge 1 USD or 100 to charge 100 JPY, a zero-decimal currency).
   *
   * <p>The maximum amount is the amount of the PaymentIntent.
   *
   * <p>When you omit the amount, it defaults to the remaining amount requested on the
   * PaymentIntent.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

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

  private PaymentIntentApplyCustomerBalanceParams(
      Long amount, String currency, List<String> expand, Map<String, Object> extraParams) {
    this.amount = amount;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentApplyCustomerBalanceParams build() {
      return new PaymentIntentApplyCustomerBalanceParams(
          this.amount, this.currency, this.expand, this.extraParams);
    }

    /**
     * Amount that you intend to apply to this PaymentIntent from the customer’s cash balance.
     *
     * <p>A positive integer representing how much to charge in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> (for
     * example, 100 cents to charge 1 USD or 100 to charge 100 JPY, a zero-decimal currency).
     *
     * <p>The maximum amount is the amount of the PaymentIntent.
     *
     * <p>When you omit the amount, it defaults to the remaining amount requested on the
     * PaymentIntent.
     */
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

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentApplyCustomerBalanceParams#expand} for the field documentation.
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
     * PaymentIntentApplyCustomerBalanceParams#expand} for the field documentation.
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
     * PaymentIntentApplyCustomerBalanceParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentApplyCustomerBalanceParams#extraParams} for the field documentation.
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
