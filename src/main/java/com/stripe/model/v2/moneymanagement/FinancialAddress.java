// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A FinancialAddress contains information needed to transfer money to a Financial Account. A
 * Financial Account can have more than one Financial Address.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddress extends StripeObject implements HasId {
  /** Bank account details for this FinancialAddress. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  /** The creation timestamp of the FinancialAddress. */
  @SerializedName("created")
  Instant created;

  @SerializedName("crypto_wallet")
  CryptoWallet cryptoWallet;

  /** The ID of the FinancialAccount this FinancialAddress corresponds to. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The ID of the FinancialAddress. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.financial_address}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("settlement_currency")
  String settlementCurrency;

  /**
   * Closed Enum. The status of the FinancialAddress.
   *
   * <p>One of {@code active}, {@code archived}, {@code failed}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * Open Enum. The type of FinancialAddress.
   *
   * <p>One of {@code bank_account}, or {@code crypto_wallet}.
   */
  @SerializedName("type")
  String type;

  /** Bank account details for this FinancialAddress. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankAccount extends StripeObject {
    /** ABA bank account details (US). */
    @SerializedName("aba")
    Aba aba;

    @SerializedName("clabe")
    Clabe clabe;

    /** The country of the bank account. */
    @SerializedName("country")
    String country;

    @SerializedName("cpa")
    Cpa cpa;

    /** Open Enum. The currency of the bank account. */
    @SerializedName("currency")
    String currency;

    /** IBAN bank account details. */
    @SerializedName("iban")
    Iban iban;

    /** Sort code bank account details (UK). */
    @SerializedName("sort_code")
    SortCode sortCode;

    /**
     * Open Enum. The type of bank account details.
     *
     * <p>One of {@code aba}, {@code clabe}, {@code cpa}, {@code iban}, or {@code sort_code}.
     */
    @SerializedName("type")
    String type;

    /** ABA bank account details (US). */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Aba extends StripeObject {
      /** The address of the account holder. */
      @SerializedName("account_holder_address")
      AccountHolderAddress accountHolderAddress;

      /** The name of the account holder. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The full account number. */
      @SerializedName("account_number")
      String accountNumber;

      /** The name of the bank. */
      @SerializedName("bank_name")
      String bankName;

      /** The last four digits of the account number. */
      @SerializedName("last4")
      String last4;

      /** The ABA routing number. */
      @SerializedName("routing_number")
      String routingNumber;

      /** The address of the account holder. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AccountHolderAddress extends StripeObject {
        /** City. */
        @SerializedName("city")
        String city;

        /** Country. */
        @SerializedName("country")
        String country;

        /** Address line 1. */
        @SerializedName("line1")
        String line1;

        /** Address line 2. */
        @SerializedName("line2")
        String line2;

        /** Postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State or province. */
        @SerializedName("state")
        String state;

        /** Town or suburb. */
        @SerializedName("town")
        String town;
      }
    }

    /**
     * For more details about Clabe, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Clabe extends StripeObject {
      @SerializedName("account_holder_name")
      String accountHolderName;

      @SerializedName("clabe")
      String clabe;
    }

    /**
     * For more details about Cpa, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cpa extends StripeObject {
      @SerializedName("account_holder_name")
      String accountHolderName;

      @SerializedName("account_number")
      String accountNumber;

      @SerializedName("bank_name")
      String bankName;

      @SerializedName("institution_number")
      String institutionNumber;

      @SerializedName("last4")
      String last4;

      @SerializedName("transit_number")
      String transitNumber;
    }

    /** IBAN bank account details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Iban extends StripeObject {
      /** The name of the account holder. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The name of the bank. */
      @SerializedName("bank_name")
      String bankName;

      /** The country of the bank account. */
      @SerializedName("country")
      String country;

      /** The full IBAN. */
      @SerializedName("iban")
      String iban;

      /** The last four digits of the IBAN. */
      @SerializedName("last4")
      String last4;
    }

    /** Sort code bank account details (UK). */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SortCode extends StripeObject {
      /** The name of the account holder. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The full account number. */
      @SerializedName("account_number")
      String accountNumber;

      /** The last four digits of the account number. */
      @SerializedName("last4")
      String last4;

      /** The sort code. */
      @SerializedName("sort_code")
      String sortCode;
    }
  }

  /**
   * For more details about CryptoWallet, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoWallet extends StripeObject {
    @SerializedName("address")
    String address;

    @SerializedName("memo")
    String memo;

    @SerializedName("network")
    String network;
  }
}
