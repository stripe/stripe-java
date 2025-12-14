// File generated from our OpenAPI spec
package com.stripe.param.sharedpayment;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class GrantedTokenCreateParams extends ApiRequestParams {
  /**
   * The Customer that the SharedPaymentGrantedToken belongs to. Should match the Customer that the
   * PaymentMethod is attached to if any.
   */
  @SerializedName("customer")
  String customer;

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
   * <strong>Required.</strong> The PaymentMethod that is going to be shared by the
   * SharedPaymentGrantedToken.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to the SharedPaymentGrantedToken.
   */
  @SerializedName("shared_metadata")
  Object sharedMetadata;

  /** <strong>Required.</strong> Limits on how this SharedPaymentGrantedToken can be used. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  private GrantedTokenCreateParams(
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentMethod,
      Object sharedMetadata,
      UsageLimits usageLimits) {
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentMethod = paymentMethod;
    this.sharedMetadata = sharedMetadata;
    this.usageLimits = usageLimits;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentMethod;

    private Object sharedMetadata;

    private UsageLimits usageLimits;

    /** Finalize and obtain parameter instance from this builder. */
    public GrantedTokenCreateParams build() {
      return new GrantedTokenCreateParams(
          this.customer,
          this.expand,
          this.extraParams,
          this.paymentMethod,
          this.sharedMetadata,
          this.usageLimits);
    }

    /**
     * The Customer that the SharedPaymentGrantedToken belongs to. Should match the Customer that
     * the PaymentMethod is attached to if any.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * GrantedTokenCreateParams#expand} for the field documentation.
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
     * GrantedTokenCreateParams#expand} for the field documentation.
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
     * GrantedTokenCreateParams#extraParams} for the field documentation.
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
     * See {@link GrantedTokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The PaymentMethod that is going to be shared by the
     * SharedPaymentGrantedToken.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Add a key/value pair to `sharedMetadata` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * GrantedTokenCreateParams#sharedMetadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putSharedMetadata(String key, String value) {
      if (this.sharedMetadata == null || this.sharedMetadata instanceof EmptyParam) {
        this.sharedMetadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.sharedMetadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `sharedMetadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link GrantedTokenCreateParams#sharedMetadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllSharedMetadata(Map<String, String> map) {
      if (this.sharedMetadata == null || this.sharedMetadata instanceof EmptyParam) {
        this.sharedMetadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.sharedMetadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to the SharedPaymentGrantedToken.
     */
    public Builder setSharedMetadata(EmptyParam sharedMetadata) {
      this.sharedMetadata = sharedMetadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to the SharedPaymentGrantedToken.
     */
    public Builder setSharedMetadata(Map<String, String> sharedMetadata) {
      this.sharedMetadata = sharedMetadata;
      return this;
    }

    /** <strong>Required.</strong> Limits on how this SharedPaymentGrantedToken can be used. */
    public Builder setUsageLimits(GrantedTokenCreateParams.UsageLimits usageLimits) {
      this.usageLimits = usageLimits;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageLimits {
    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * <strong>Required.</strong> Time at which this SharedPaymentToken expires and can no longer be
     * used to confirm a PaymentIntent.
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

    /** <strong>Required.</strong> Max amount that can be captured using this SharedPaymentToken */
    @SerializedName("max_amount")
    Long maxAmount;

    private UsageLimits(
        String currency, Long expiresAt, Map<String, Object> extraParams, Long maxAmount) {
      this.currency = currency;
      this.expiresAt = expiresAt;
      this.extraParams = extraParams;
      this.maxAmount = maxAmount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Long expiresAt;

      private Map<String, Object> extraParams;

      private Long maxAmount;

      /** Finalize and obtain parameter instance from this builder. */
      public GrantedTokenCreateParams.UsageLimits build() {
        return new GrantedTokenCreateParams.UsageLimits(
            this.currency, this.expiresAt, this.extraParams, this.maxAmount);
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
       * <strong>Required.</strong> Time at which this SharedPaymentToken expires and can no longer
       * be used to confirm a PaymentIntent.
       */
      public Builder setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * GrantedTokenCreateParams.UsageLimits#extraParams} for the field documentation.
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
       * See {@link GrantedTokenCreateParams.UsageLimits#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Max amount that can be captured using this SharedPaymentToken
       */
      public Builder setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
        return this;
      }
    }
  }
}
