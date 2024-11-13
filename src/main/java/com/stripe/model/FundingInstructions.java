// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Each customer has a <a
 * href="https://stripe.com/docs/api/customers/object#customer_object-balance">{@code balance}</a>
 * that is automatically applied to future invoices and payments using the {@code customer_balance}
 * payment method. Customers can fund this balance by initiating a bank transfer to any account in
 * the {@code financial_addresses} field. Related guide: <a
 * href="https://stripe.com/docs/payments/customer-balance/funding-instructions">Customer balance
 * funding instructions</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FundingInstructions extends StripeObject {
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The {@code funding_type} of the returned instructions
   *
   * <p>Equal to {@code bank_transfer}.
   */
  @SerializedName("funding_type")
  String fundingType;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code funding_instructions}.
   */
  @SerializedName("object")
  String object;

  /**
   * For more details about BankTransfer, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer extends StripeObject {
    /** The country of the bank account to fund. */
    @SerializedName("country")
    String country;

    /** A list of financial addresses that can be used to fund a particular balance. */
    @SerializedName("financial_addresses")
    List<FundingInstructions.BankTransfer.FinancialAddress> financialAddresses;

    /**
     * The bank_transfer type
     *
     * <p>One of {@code eu_bank_transfer}, or {@code jp_bank_transfer}.
     */
    @SerializedName("type")
    String type;

    /** FinancialAddresses contain identifying information that resolves to a FinancialAccount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAddress extends StripeObject {
      /** ABA Records contain U.S. bank account details per the ABA format. */
      @SerializedName("aba")
      Aba aba;

      /** Iban Records contain E.U. bank account details per the SEPA format. */
      @SerializedName("iban")
      Iban iban;

      /** Sort Code Records contain U.K. bank account details per the sort code format. */
      @SerializedName("sort_code")
      SortCode sortCode;

      /** SPEI Records contain Mexico bank account details per the SPEI format. */
      @SerializedName("spei")
      Spei spei;

      /** The payment networks supported by this FinancialAddress. */
      @SerializedName("supported_networks")
      List<String> supportedNetworks;

      /** SWIFT Records contain U.S. bank account details per the SWIFT format. */
      @SerializedName("swift")
      Swift swift;

      /**
       * The type of financial address
       *
       * <p>One of {@code aba}, {@code iban}, {@code sort_code}, {@code spei}, {@code swift}, or
       * {@code zengin}.
       */
      @SerializedName("type")
      String type;

      /** Zengin Records contain Japan bank account details per the Zengin format. */
      @SerializedName("zengin")
      Zengin zengin;

      /** ABA Records contain U.S. bank account details per the ABA format. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Aba extends StripeObject {
        @SerializedName("account_holder_address")
        Address accountHolderAddress;

        /** The account holder name. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The ABA account number. */
        @SerializedName("account_number")
        String accountNumber;

        /** The account type. */
        @SerializedName("account_type")
        String accountType;

        @SerializedName("bank_address")
        Address bankAddress;

        /** The bank name. */
        @SerializedName("bank_name")
        String bankName;

        /** The ABA routing number. */
        @SerializedName("routing_number")
        String routingNumber;
      }

      /** Iban Records contain E.U. bank account details per the SEPA format. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Iban extends StripeObject {
        @SerializedName("account_holder_address")
        Address accountHolderAddress;

        /** The name of the person or business that owns the bank account. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        @SerializedName("bank_address")
        Address bankAddress;

        /** The BIC/SWIFT code of the account. */
        @SerializedName("bic")
        String bic;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /** The IBAN of the account. */
        @SerializedName("iban")
        String iban;
      }

      /** Sort Code Records contain U.K. bank account details per the sort code format. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SortCode extends StripeObject {
        /** The name of the person or business that owns the bank account. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The account number. */
        @SerializedName("account_number")
        String accountNumber;

        /** The six-digit sort code. */
        @SerializedName("sort_code")
        String sortCode;
      }

      /** SPEI Records contain Mexico bank account details per the SPEI format. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Spei extends StripeObject {
        /** The three-digit bank code. */
        @SerializedName("bank_code")
        String bankCode;

        /** The short banking institution name. */
        @SerializedName("bank_name")
        String bankName;

        /** The CLABE number. */
        @SerializedName("clabe")
        String clabe;
      }

      /** SWIFT Records contain U.S. bank account details per the SWIFT format. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Swift extends StripeObject {
        @SerializedName("account_holder_address")
        Address accountHolderAddress;

        /** The account holder name. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The account number. */
        @SerializedName("account_number")
        String accountNumber;

        /** The account type. */
        @SerializedName("account_type")
        String accountType;

        @SerializedName("bank_address")
        Address bankAddress;

        /** The bank name. */
        @SerializedName("bank_name")
        String bankName;

        /** The SWIFT code. */
        @SerializedName("swift_code")
        String swiftCode;
      }

      /** Zengin Records contain Japan bank account details per the Zengin format. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Zengin extends StripeObject {
        @SerializedName("account_holder_address")
        Address accountHolderAddress;

        /** The account holder name. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The account number. */
        @SerializedName("account_number")
        String accountNumber;

        /** The bank account type. In Japan, this can only be {@code futsu} or {@code toza}. */
        @SerializedName("account_type")
        String accountType;

        @SerializedName("bank_address")
        Address bankAddress;

        /** The bank code of the account. */
        @SerializedName("bank_code")
        String bankCode;

        /** The bank name of the account. */
        @SerializedName("bank_name")
        String bankName;

        /** The branch code of the account. */
        @SerializedName("branch_code")
        String branchCode;

        /** The branch name of the account. */
        @SerializedName("branch_name")
        String branchName;
      }
    }
  }
}
