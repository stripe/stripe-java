// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer extends StripeObject {
    /** The country of the bank account to fund. */
    @SerializedName("country")
    String country;

    /** A list of financial addresses that can be used to fund a particular balance. */
    @SerializedName("financial_addresses")
    List<FundingInstructions.BankTransfer.FinancialAddresses> financialAddresses;

    /**
     * The bank_transfer type
     *
     * <p>One of {@code eu_bank_transfer}, or {@code jp_bank_transfer}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAddresses extends StripeObject {
      /** The payment networks supported by this FinancialAddress. */
      @SerializedName("supported_networks")
      List<String> supportedNetworks;

      /**
       * The type of financial address
       *
       * <p>One of {@code iban}, or {@code zengin}.
       */
      @SerializedName("type")
      String type;

      /** Zengin Records contain Japan bank account details per the Zengin format. */
      @SerializedName("zengin")
      Zengin zengin;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Zengin extends StripeObject {
        /** The account holder name. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The account number. */
        @SerializedName("account_number")
        String accountNumber;

        /** The bank account type. In Japan, this can only be {@code futsu} or {@code toza}. */
        @SerializedName("account_type")
        String accountType;

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
