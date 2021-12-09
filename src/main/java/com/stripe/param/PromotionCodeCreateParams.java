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
public class PromotionCodeCreateParams extends ApiRequestParams {
  /** Whether the promotion code is currently active. */
  @SerializedName("active")
  Boolean active;

  /**
   * The customer-facing code. Regardless of case, this code must be unique across all active
   * promotion codes for a specific customer. If left blank, we will generate one automatically.
   */
  @SerializedName("code")
  String code;

  /** The coupon for this promotion code. */
  @SerializedName("coupon")
  String coupon;

  /**
   * The customer that this promotion code can be used by. If not set, the promotion code can be
   * used by all customers.
   */
  @SerializedName("customer")
  String customer;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * The timestamp at which this promotion code will expire. If the coupon has specified a {@code
   * redeems_by}, then this value cannot be after the coupon's {@code redeems_by}.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A positive integer specifying the number of times the promotion code can be redeemed. If the
   * coupon has specified a {@code max_redemptions}, then this value cannot be greater than the
   * coupon's {@code max_redemptions}.
   */
  @SerializedName("max_redemptions")
  Long maxRedemptions;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Settings that restrict the redemption of the promotion code. */
  @SerializedName("restrictions")
  Restrictions restrictions;

  private PromotionCodeCreateParams(
      Boolean active,
      String code,
      String coupon,
      String customer,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      Long maxRedemptions,
      Map<String, String> metadata,
      Restrictions restrictions) {
    this.active = active;
    this.code = code;
    this.coupon = coupon;
    this.customer = customer;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.maxRedemptions = maxRedemptions;
    this.metadata = metadata;
    this.restrictions = restrictions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private String code;

    private String coupon;

    private String customer;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private Long maxRedemptions;

    private Map<String, String> metadata;

    private Restrictions restrictions;

    /** Finalize and obtain parameter instance from this builder. */
    public PromotionCodeCreateParams build() {
      return new PromotionCodeCreateParams(
          this.active,
          this.code,
          this.coupon,
          this.customer,
          this.expand,
          this.expiresAt,
          this.extraParams,
          this.maxRedemptions,
          this.metadata,
          this.restrictions);
    }

    /** Whether the promotion code is currently active. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * The customer-facing code. Regardless of case, this code must be unique across all active
     * promotion codes for a specific customer. If left blank, we will generate one automatically.
     */
    public Builder setCode(String code) {
      this.code = code;
      return this;
    }

    /** The coupon for this promotion code. */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * The customer that this promotion code can be used by. If not set, the promotion code can be
     * used by all customers.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PromotionCodeCreateParams#expand} for the field documentation.
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
     * PromotionCodeCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * The timestamp at which this promotion code will expire. If the coupon has specified a {@code
     * redeems_by}, then this value cannot be after the coupon's {@code redeems_by}.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PromotionCodeCreateParams#extraParams} for the field documentation.
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
     * See {@link PromotionCodeCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A positive integer specifying the number of times the promotion code can be redeemed. If the
     * coupon has specified a {@code max_redemptions}, then this value cannot be greater than the
     * coupon's {@code max_redemptions}.
     */
    public Builder setMaxRedemptions(Long maxRedemptions) {
      this.maxRedemptions = maxRedemptions;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PromotionCodeCreateParams#metadata} for the field documentation.
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
     * See {@link PromotionCodeCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Settings that restrict the redemption of the promotion code. */
    public Builder setRestrictions(Restrictions restrictions) {
      this.restrictions = restrictions;
      return this;
    }
  }

  @Getter
  public static class Restrictions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A Boolean indicating if the Promotion Code should only be redeemed for Customers without any
     * successful payments or invoices.
     */
    @SerializedName("first_time_transaction")
    Boolean firstTimeTransaction;

    /**
     * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be
     * $100 or more to work).
     */
    @SerializedName("minimum_amount")
    Long minimumAmount;

    /** Three-letter <a href="https://stripe.com/docs/currencies">ISO code</a> for minimum_amount */
    @SerializedName("minimum_amount_currency")
    String minimumAmountCurrency;

    private Restrictions(
        Map<String, Object> extraParams,
        Boolean firstTimeTransaction,
        Long minimumAmount,
        String minimumAmountCurrency) {
      this.extraParams = extraParams;
      this.firstTimeTransaction = firstTimeTransaction;
      this.minimumAmount = minimumAmount;
      this.minimumAmountCurrency = minimumAmountCurrency;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Boolean firstTimeTransaction;

      private Long minimumAmount;

      private String minimumAmountCurrency;

      /** Finalize and obtain parameter instance from this builder. */
      public Restrictions build() {
        return new Restrictions(
            this.extraParams,
            this.firstTimeTransaction,
            this.minimumAmount,
            this.minimumAmountCurrency);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PromotionCodeCreateParams.Restrictions#extraParams} for the field documentation.
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
       * See {@link PromotionCodeCreateParams.Restrictions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A Boolean indicating if the Promotion Code should only be redeemed for Customers without
       * any successful payments or invoices.
       */
      public Builder setFirstTimeTransaction(Boolean firstTimeTransaction) {
        this.firstTimeTransaction = firstTimeTransaction;
        return this;
      }

      /**
       * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must
       * be $100 or more to work).
       */
      public Builder setMinimumAmount(Long minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
      }

      /**
       * Three-letter <a href="https://stripe.com/docs/currencies">ISO code</a> for minimum_amount
       */
      public Builder setMinimumAmountCurrency(String minimumAmountCurrency) {
        this.minimumAmountCurrency = minimumAmountCurrency;
        return this;
      }
    }
  }
}
