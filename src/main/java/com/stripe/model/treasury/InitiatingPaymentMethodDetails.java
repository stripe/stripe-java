// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InitiatingPaymentMethodDetails extends StripeObject {
  /**
   * Set when {@code type} is {@code balance}.
   *
   * <p>Equal to {@code payments}.
   */
  @SerializedName("balance")
  String balance;

  @SerializedName("billing_details")
  BillingDetails billingDetails;

  @SerializedName("financial_account")
  FinancialAccount financialAccount;

  /**
   * Set when {@code type} is {@code issuing_card}. This is an <a
   * href="https://stripe.com/docs/api#issuing_cards">Issuing Card</a> ID.
   */
  @SerializedName("issuing_card")
  String issuingCard;

  /**
   * Polymorphic type matching the originating money movement's source. This can be an external
   * account, a Stripe balance, or a FinancialAccount.
   *
   * <p>One of {@code balance}, {@code financial_account}, {@code issuing_card}, {@code stripe}, or
   * {@code us_bank_account}.
   */
  @SerializedName("type")
  String type;

  @SerializedName("us_bank_account")
  USBankAccount usBankAccount;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FinancialAccount extends StripeObject implements HasId {
    /** The FinancialAccount ID. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The rails the ReceivedCredit was sent over. A FinancialAccount can only send funds over
     * {@code stripe}.
     *
     * <p>Equal to {@code stripe}.
     */
    @SerializedName("network")
    String network;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class USBankAccount extends StripeObject {
    /** Bank name. */
    @SerializedName("bank_name")
    String bankName;

    /** The last four digits of the bank account number. */
    @SerializedName("last4")
    String last4;

    /** The routing number for the bank account. */
    @SerializedName("routing_number")
    String routingNumber;
  }
}
