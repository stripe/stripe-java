// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A customer's payment method and its usage limits. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentProfile extends StripeObject {
  /** Last 4 digits of the card on the payment method. */
  @SerializedName("card_last4")
  String cardLast4;

  /** Whether the payment method is in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.payment_profile}.
   */
  @SerializedName("object")
  String object;

  /**
   * Owner of the payment method.
   *
   * <p>Equal to {@code platform}.
   */
  @SerializedName("payment_method_owner")
  String paymentMethodOwner;

  /** Providers the payment method is shared with, and their usage limits. */
  @SerializedName("providers")
  List<PaymentProfile.Provider> providers;

  /** Deprecated: use providers instead. */
  @SerializedName("shared_with_providers")
  List<String> sharedWithProviders;

  /** Usage limit applied to the payment method. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  /**
   * For more details about Provider, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Provider extends StripeObject {
    /** Provider the payment method is shared with. */
    @SerializedName("provider")
    String provider;

    /** Usage limit applied to the payment method for this provider. */
    @SerializedName("usage_limits")
    UsageLimits usageLimits;

    /** Usage limit applied to the payment method for this provider. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsageLimits extends StripeObject {
      /** Three-letter ISO currency code for {@code max_amount}. */
      @SerializedName("currency")
      String currency;

      /** Maximum amount that can be charged per recurring interval. */
      @SerializedName("max_amount")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long maxAmount;

      /**
       * Interval over which {@code max_amount} applies.
       *
       * <p>One of {@code month}, {@code week}, or {@code year}.
       */
      @SerializedName("recurring_interval")
      String recurringInterval;
    }
  }

  /** Usage limit applied to the payment method. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageLimits extends StripeObject {
    /** Three-letter ISO currency code for {@code max_amount}. */
    @SerializedName("currency")
    String currency;

    /** Maximum amount that can be charged per recurring interval. */
    @SerializedName("max_amount")
    @JsonAdapter(StringInt64TypeAdapter.class)
    Long maxAmount;

    /**
     * Interval over which {@code max_amount} applies.
     *
     * <p>One of {@code month}, {@code week}, or {@code year}.
     */
    @SerializedName("recurring_interval")
    String recurringInterval;
  }
}
