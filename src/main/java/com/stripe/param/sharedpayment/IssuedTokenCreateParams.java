// File generated from our OpenAPI spec
package com.stripe.param.sharedpayment;

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
public class IssuedTokenCreateParams extends ApiRequestParams {
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
   * SharedPaymentIssuedToken.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * If the customer does not exit their browser while authenticating, they will be redirected to
   * this specified URL after completion.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * <strong>Required.</strong> Seller details of the SharedPaymentIssuedToken, including network_id
   * and external_id.
   */
  @SerializedName("seller_details")
  SellerDetails sellerDetails;

  /**
   * Indicates that you intend to save the PaymentMethod of this SharedPaymentToken to a customer
   * later.
   */
  @SerializedName("setup_future_usage")
  SetupFutureUsage setupFutureUsage;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to the SharedPaymentIssuedToken. The values here are visible by default with the party that you
   * share this SharedPaymentIssuedToken with.
   */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  /** <strong>Required.</strong> Limits on how this SharedPaymentToken can be used. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  private IssuedTokenCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentMethod,
      String returnUrl,
      SellerDetails sellerDetails,
      SetupFutureUsage setupFutureUsage,
      Map<String, String> sharedMetadata,
      UsageLimits usageLimits) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentMethod = paymentMethod;
    this.returnUrl = returnUrl;
    this.sellerDetails = sellerDetails;
    this.setupFutureUsage = setupFutureUsage;
    this.sharedMetadata = sharedMetadata;
    this.usageLimits = usageLimits;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentMethod;

    private String returnUrl;

    private SellerDetails sellerDetails;

    private SetupFutureUsage setupFutureUsage;

    private Map<String, String> sharedMetadata;

    private UsageLimits usageLimits;

    /** Finalize and obtain parameter instance from this builder. */
    public IssuedTokenCreateParams build() {
      return new IssuedTokenCreateParams(
          this.expand,
          this.extraParams,
          this.paymentMethod,
          this.returnUrl,
          this.sellerDetails,
          this.setupFutureUsage,
          this.sharedMetadata,
          this.usageLimits);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * IssuedTokenCreateParams#expand} for the field documentation.
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
     * IssuedTokenCreateParams#expand} for the field documentation.
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
     * IssuedTokenCreateParams#extraParams} for the field documentation.
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
     * See {@link IssuedTokenCreateParams#extraParams} for the field documentation.
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
     * SharedPaymentIssuedToken.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * If the customer does not exit their browser while authenticating, they will be redirected to
     * this specified URL after completion.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * <strong>Required.</strong> Seller details of the SharedPaymentIssuedToken, including
     * network_id and external_id.
     */
    public Builder setSellerDetails(IssuedTokenCreateParams.SellerDetails sellerDetails) {
      this.sellerDetails = sellerDetails;
      return this;
    }

    /**
     * Indicates that you intend to save the PaymentMethod of this SharedPaymentToken to a customer
     * later.
     */
    public Builder setSetupFutureUsage(IssuedTokenCreateParams.SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /**
     * Add a key/value pair to `sharedMetadata` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * IssuedTokenCreateParams#sharedMetadata} for the field documentation.
     */
    public Builder putSharedMetadata(String key, String value) {
      if (this.sharedMetadata == null) {
        this.sharedMetadata = new HashMap<>();
      }
      this.sharedMetadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `sharedMetadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link IssuedTokenCreateParams#sharedMetadata} for the field documentation.
     */
    public Builder putAllSharedMetadata(Map<String, String> map) {
      if (this.sharedMetadata == null) {
        this.sharedMetadata = new HashMap<>();
      }
      this.sharedMetadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Limits on how this SharedPaymentToken can be used. */
    public Builder setUsageLimits(IssuedTokenCreateParams.UsageLimits usageLimits) {
      this.usageLimits = usageLimits;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SellerDetails {
    /**
     * A unique id within a network that identifies a logical seller, usually this would be the
     * unique merchant id.
     */
    @SerializedName("external_id")
    String externalId;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A string that identifies the network that this SharedToken is being created for. */
    @SerializedName("network_business_profile")
    String networkBusinessProfile;

    private SellerDetails(
        String externalId, Map<String, Object> extraParams, String networkBusinessProfile) {
      this.externalId = externalId;
      this.extraParams = extraParams;
      this.networkBusinessProfile = networkBusinessProfile;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String externalId;

      private Map<String, Object> extraParams;

      private String networkBusinessProfile;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuedTokenCreateParams.SellerDetails build() {
        return new IssuedTokenCreateParams.SellerDetails(
            this.externalId, this.extraParams, this.networkBusinessProfile);
      }

      /**
       * A unique id within a network that identifies a logical seller, usually this would be the
       * unique merchant id.
       */
      public Builder setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuedTokenCreateParams.SellerDetails#extraParams} for the field documentation.
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
       * See {@link IssuedTokenCreateParams.SellerDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A string that identifies the network that this SharedToken is being created for. */
      public Builder setNetworkBusinessProfile(String networkBusinessProfile) {
        this.networkBusinessProfile = networkBusinessProfile;
        return this;
      }
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
     * Time at which this SharedPaymentToken expires and can no longer be used to confirm a
     * PaymentIntent.
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
      public IssuedTokenCreateParams.UsageLimits build() {
        return new IssuedTokenCreateParams.UsageLimits(
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
       * Time at which this SharedPaymentToken expires and can no longer be used to confirm a
       * PaymentIntent.
       */
      public Builder setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuedTokenCreateParams.UsageLimits#extraParams} for the field documentation.
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
       * See {@link IssuedTokenCreateParams.UsageLimits#extraParams} for the field documentation.
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

  public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
    @SerializedName("on_session")
    ON_SESSION("on_session");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SetupFutureUsage(String value) {
      this.value = value;
    }
  }
}
