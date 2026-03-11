// File generated from our OpenAPI spec
package com.stripe.param.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SessionApproveParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the customer's attempt to pay to approve. */
  @SerializedName("attempt")
  String attempt;

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
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
   * payment} mode.
   */
  @SerializedName("payment_intent_data")
  PaymentIntentData paymentIntentData;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. This parameter is allowed and required if and only if you did
   * not set the return URL during Checkout Session creation or in {@code checkout.confirm()} in
   * Stripe.js.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * A subset of parameters to be passed to subscription creation for Checkout Sessions in {@code
   * subscription} mode.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  private SessionApproveParams(
      String attempt,
      List<String> expand,
      Map<String, Object> extraParams,
      PaymentIntentData paymentIntentData,
      String returnUrl,
      SubscriptionData subscriptionData) {
    this.attempt = attempt;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentIntentData = paymentIntentData;
    this.returnUrl = returnUrl;
    this.subscriptionData = subscriptionData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String attempt;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private PaymentIntentData paymentIntentData;

    private String returnUrl;

    private SubscriptionData subscriptionData;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionApproveParams build() {
      return new SessionApproveParams(
          this.attempt,
          this.expand,
          this.extraParams,
          this.paymentIntentData,
          this.returnUrl,
          this.subscriptionData);
    }

    /** <strong>Required.</strong> The ID of the customer's attempt to pay to approve. */
    public Builder setAttempt(String attempt) {
      this.attempt = attempt;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionApproveParams#expand} for the field documentation.
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
     * SessionApproveParams#expand} for the field documentation.
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
     * SessionApproveParams#extraParams} for the field documentation.
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
     * See {@link SessionApproveParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
     * payment} mode.
     */
    public Builder setPaymentIntentData(SessionApproveParams.PaymentIntentData paymentIntentData) {
      this.paymentIntentData = paymentIntentData;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. This parameter is allowed and required if and only if you
     * did not set the return URL during Checkout Session creation or in {@code checkout.confirm()}
     * in Stripe.js.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * A subset of parameters to be passed to subscription creation for Checkout Sessions in {@code
     * subscription} mode.
     */
    public Builder setSubscriptionData(SessionApproveParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentIntentData {
    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. The amount of the
     * application fee collected will be capped at the total amount captured. For more information,
     * see the PaymentIntents <a href="https://docs.stripe.com/payments/connected-accounts">use case
     * for connected accounts</a>.
     */
    @SerializedName("application_fee_amount")
    Long applicationFeeAmount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PaymentIntentData(Long applicationFeeAmount, Map<String, Object> extraParams) {
      this.applicationFeeAmount = applicationFeeAmount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long applicationFeeAmount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionApproveParams.PaymentIntentData build() {
        return new SessionApproveParams.PaymentIntentData(
            this.applicationFeeAmount, this.extraParams);
      }

      /**
       * The amount of the application fee (if any) that will be requested to be applied to the
       * payment and transferred to the application owner's Stripe account. The amount of the
       * application fee collected will be capped at the total amount captured. For more
       * information, see the PaymentIntents <a
       * href="https://docs.stripe.com/payments/connected-accounts">use case for connected
       * accounts</a>.
       */
      public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
        this.applicationFeeAmount = applicationFeeAmount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionApproveParams.PaymentIntentData#extraParams} for the field documentation.
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
       * See {@link SessionApproveParams.PaymentIntentData#extraParams} for the field documentation.
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionData {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. To use an application fee percent, the request must be made on behalf
     * of another account, using the {@code Stripe-Account} header or an OAuth key. For more
     * information, see the application fees <a
     * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private SubscriptionData(BigDecimal applicationFeePercent, Map<String, Object> extraParams) {
      this.applicationFeePercent = applicationFeePercent;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionApproveParams.SubscriptionData build() {
        return new SessionApproveParams.SubscriptionData(
            this.applicationFeePercent, this.extraParams);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * application owner's Stripe account. To use an application fee percent, the request must be
       * made on behalf of another account, using the {@code Stripe-Account} header or an OAuth key.
       * For more information, see the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionApproveParams.SubscriptionData#extraParams} for the field documentation.
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
       * See {@link SessionApproveParams.SubscriptionData#extraParams} for the field documentation.
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
}
