package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CouponCreateParams extends ApiRequestParams {
  /**
   * A positive integer representing the amount to subtract from an invoice total (required if
   * `percent_off` is not passed).
   */
  @SerializedName("amount_off")
  Long amountOff;

  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of the
   * `amount_off` parameter (required if `amount_off` is passed).
   */
  @SerializedName("currency")
  String currency;

  /**
   * Specifies how long the discount will be in effect. Can be `forever`, `once`, or `repeating`.
   */
  @SerializedName("duration")
  Duration duration;

  /**
   * Required only if `duration` is `repeating`, in which case it must be a positive integer that
   * specifies the number of months the discount will be in effect.
   */
  @SerializedName("duration_in_months")
  Long durationInMonths;

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
   * Unique string of your choice that will be used to identify this coupon when applying it to a
   * customer. This is often a specific code you'll give to your customer to use when signing up
   * (e.g., `FALL25OFF`). If you don't want to specify a particular code, you can leave the ID blank
   * and we'll generate a random code for you.
   */
  @SerializedName("id")
  String id;

  /**
   * A positive integer specifying the number of times the coupon can be redeemed before it's no
   * longer valid. For example, you might have a 50% off coupon that the first 20 readers of your
   * blog can use.
   */
  @SerializedName("max_redemptions")
  Long maxRedemptions;

  /**
   * A set of key-value pairs that you can attach to a coupon object. It can be useful for storing
   * additional information about the coupon in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default
   * the `id` is shown if `name` is not set.
   */
  @SerializedName("name")
  String name;

  /**
   * A positive float larger than 0, and smaller or equal to 100, that represents the discount the
   * coupon will apply (required if `amount_off` is not passed).
   */
  @SerializedName("percent_off")
  BigDecimal percentOff;

  /**
   * Unix timestamp specifying the last time at which the coupon can be redeemed. After the
   * redeem_by date, the coupon can no longer be applied to new customers.
   */
  @SerializedName("redeem_by")
  Long redeemBy;

  private CouponCreateParams(
      Long amountOff,
      String currency,
      Duration duration,
      Long durationInMonths,
      List<String> expand,
      Map<String, Object> extraParams,
      String id,
      Long maxRedemptions,
      Map<String, String> metadata,
      String name,
      BigDecimal percentOff,
      Long redeemBy) {
    this.amountOff = amountOff;
    this.currency = currency;
    this.duration = duration;
    this.durationInMonths = durationInMonths;
    this.expand = expand;
    this.extraParams = extraParams;
    this.id = id;
    this.maxRedemptions = maxRedemptions;
    this.metadata = metadata;
    this.name = name;
    this.percentOff = percentOff;
    this.redeemBy = redeemBy;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amountOff;

    private String currency;

    private Duration duration;

    private Long durationInMonths;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String id;

    private Long maxRedemptions;

    private Map<String, String> metadata;

    private String name;

    private BigDecimal percentOff;

    private Long redeemBy;

    /** Finalize and obtain parameter instance from this builder. */
    public CouponCreateParams build() {
      return new CouponCreateParams(
          this.amountOff,
          this.currency,
          this.duration,
          this.durationInMonths,
          this.expand,
          this.extraParams,
          this.id,
          this.maxRedemptions,
          this.metadata,
          this.name,
          this.percentOff,
          this.redeemBy);
    }

    /**
     * A positive integer representing the amount to subtract from an invoice total (required if
     * `percent_off` is not passed).
     */
    public Builder setAmountOff(Long amountOff) {
      this.amountOff = amountOff;
      return this;
    }

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of the
     * `amount_off` parameter (required if `amount_off` is passed).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Specifies how long the discount will be in effect. Can be `forever`, `once`, or `repeating`.
     */
    public Builder setDuration(Duration duration) {
      this.duration = duration;
      return this;
    }

    /**
     * Required only if `duration` is `repeating`, in which case it must be a positive integer that
     * specifies the number of months the discount will be in effect.
     */
    public Builder setDurationInMonths(Long durationInMonths) {
      this.durationInMonths = durationInMonths;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CouponCreateParams#expand} for the field documentation.
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
     * CouponCreateParams#expand} for the field documentation.
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
     * CouponCreateParams#extraParams} for the field documentation.
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
     * See {@link CouponCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Unique string of your choice that will be used to identify this coupon when applying it to a
     * customer. This is often a specific code you'll give to your customer to use when signing up
     * (e.g., `FALL25OFF`). If you don't want to specify a particular code, you can leave the ID
     * blank and we'll generate a random code for you.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /**
     * A positive integer specifying the number of times the coupon can be redeemed before it's no
     * longer valid. For example, you might have a 50% off coupon that the first 20 readers of your
     * blog can use.
     */
    public Builder setMaxRedemptions(Long maxRedemptions) {
      this.maxRedemptions = maxRedemptions;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CouponCreateParams#metadata} for the field documentation.
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
     * See {@link CouponCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default
     * the `id` is shown if `name` is not set.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * A positive float larger than 0, and smaller or equal to 100, that represents the discount the
     * coupon will apply (required if `amount_off` is not passed).
     */
    public Builder setPercentOff(BigDecimal percentOff) {
      this.percentOff = percentOff;
      return this;
    }

    /**
     * Unix timestamp specifying the last time at which the coupon can be redeemed. After the
     * redeem_by date, the coupon can no longer be applied to new customers.
     */
    public Builder setRedeemBy(Long redeemBy) {
      this.redeemBy = redeemBy;
      return this;
    }
  }

  public enum Duration implements ApiRequestParams.EnumParam {
    @SerializedName("forever")
    FOREVER("forever"),

    @SerializedName("once")
    ONCE("once"),

    @SerializedName("repeating")
    REPEATING("repeating");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Duration(String value) {
      this.value = value;
    }
  }
}
