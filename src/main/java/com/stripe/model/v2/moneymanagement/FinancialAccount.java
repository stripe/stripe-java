// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A FinancialAccount represents a balance and can be the source or destination of money movement.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccount extends StripeObject implements HasId {
  /**
   * The FinancialAccount's balance, split into {@code available}, {@code inbound_pending}, and
   * {@code outbound_pending} balances. Each balance is a hash keyed by lowercase currency codes,
   * with an amount for each currency.
   */
  @SerializedName("balance")
  Balance balance;

  /**
   * Open Enum. The country where the LegalEntity associated with the FinancialAccount is based,
   * represented as a two-letter country code.
   */
  @SerializedName("country")
  String country;

  /**
   * Time at which the object was created. Represented as an RFC 3339 timestamp in UTC with
   * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /**
   * A descriptive name for the FinancialAccount, up to 50 characters long. This name appears in the
   * Stripe Dashboard and embedded components.
   */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.financial_account}.
   */
  @SerializedName("object")
  String object;

  /**
   * If the FinancialAccount's {@code type} is {@code other}, this hash identifies its actual type.
   * Upgrade your API version to see that type in {@code type}.
   */
  @SerializedName("other")
  Other other;

  /**
   * Closed Enum. An enum representing the status of the FinancialAccount. This indicates whether or
   * not the FinancialAccount can be used for any money movement flows.
   *
   * <p>One of {@code closed}, {@code open}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * If the FinancialAccount's {@code type} is {@code storage}, this hash contains details specific
   * to that type.
   */
  @SerializedName("storage")
  Storage storage;

  /**
   * Closed Enum. The type of the FinancialAccount. Details specific to the type appear in the
   * matching hash. For example, a {@code storage} FinancialAccount includes a {@code storage} hash.
   *
   * <p>One of {@code other}, or {@code storage}.
   */
  @SerializedName("type")
  String type;

  /**
   * The FinancialAccount's balance, split into {@code available}, {@code inbound_pending}, and
   * {@code outbound_pending} balances. Each balance is a hash keyed by lowercase currency codes,
   * with an amount for each currency.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance extends StripeObject {
    /** Balance available for money movement. */
    @SerializedName("available")
    Map<String, Amount> available;

    /**
     * Balance of inbound funds that aren't yet available for money movement and will later move to
     * the {@code available} balance.
     */
    @SerializedName("inbound_pending")
    Map<String, Amount> inboundPending;

    /** Balance of funds being used for pending outbound money movements. */
    @SerializedName("outbound_pending")
    Map<String, Amount> outboundPending;
  }

  /**
   * If the FinancialAccount's {@code type} is {@code other}, this hash identifies its actual type.
   * Upgrade your API version to see that type in {@code type}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Other extends StripeObject {
    /**
     * The FinancialAccount's actual type, represented as a string. Upgrade your API version to see
     * this value in {@code financial_account.type}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * If the FinancialAccount's {@code type} is {@code storage}, this hash contains details specific
   * to that type.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Storage extends StripeObject {
    /** Array of eligibility objects, segmented by bank name and deposit insurance scheme. */
    @SerializedName("deposit_insurance_eligibility")
    List<FinancialAccount.Storage.DepositInsuranceEligibility> depositInsuranceEligibility;

    /** The currencies that this FinancialAccount can hold. */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;

    /**
     * For more details about DepositInsuranceEligibility, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DepositInsuranceEligibility extends StripeObject {
      /**
       * The bank where funds are stored.
       *
       * <p>Equal to {@code fifth_third}.
       */
      @SerializedName("bank_name")
      String bankName;

      /** Currencies eligible for deposit insurance at this bank under this scheme. */
      @SerializedName("currencies")
      List<String> currencies;

      /**
       * The deposit insurance scheme.
       *
       * <p>One of {@code fdic}, or {@code fdic_passthrough}.
       */
      @SerializedName("type")
      String type;
    }
  }
}
