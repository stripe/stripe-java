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
  /** The creation timestamp of the FinancialAddress. */
  @SerializedName("created")
  Instant created;

  /**
   * Object indicates the type of credentials that have been allocated and attached to the
   * FinancialAddress. It contains all necessary banking details with which to perform money
   * movements with the FinancialAddress. This field is only available for FinancialAddresses with
   * an active status.
   */
  @SerializedName("credentials")
  Credentials credentials;

  /** Open Enum. The currency the FinancialAddress supports. */
  @SerializedName("currency")
  String currency;

  /** A ID of the FinancialAccount this FinancialAddress corresponds to. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The ID of a FinancialAddress. */
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

  /** Open Enum. The currency the FinancialAddress settles into the FinancialAccount. */
  @SerializedName("settlement_currency")
  String settlementCurrency;

  /**
   * Closed Enum. An enum representing the status of the FinancialAddress. This indicates whether or
   * not the FinancialAddress can be used for any money movement flows.
   *
   * <p>One of {@code active}, {@code archived}, {@code failed}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * Object indicates the type of credentials that have been allocated and attached to the
   * FinancialAddress. It contains all necessary banking details with which to perform money
   * movements with the FinancialAddress. This field is only available for FinancialAddresses with
   * an active status.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Credentials extends StripeObject {
    /**
     * The credentials of the UK Bank Account for the FinancialAddress. This contains unique banking
     * details such as the sort code, account number, etc. of a UK bank account.
     */
    @SerializedName("gb_bank_account")
    GbBankAccount gbBankAccount;

    /**
     * The credentials of the SEPA Bank Account for the FinancialAddress. This contains unique
     * banking details such as the IBAN, BIC, etc. of a SEPA bank account.
     */
    @SerializedName("sepa_bank_account")
    SepaBankAccount sepaBankAccount;

    /**
     * Open Enum. The type of Credentials that are provisioned for the FinancialAddress.
     *
     * <p>One of {@code gb_bank_account}, {@code sepa_bank_account}, or {@code us_bank_account}.
     */
    @SerializedName("type")
    String type;

    /**
     * The credentials of the US Bank Account for the FinancialAddress. This contains unique banking
     * details such as the routing number, account number, etc. of a US bank account.
     */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * The credentials of the UK Bank Account for the FinancialAddress. This contains unique banking
     * details such as the sort code, account number, etc. of a UK bank account.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GbBankAccount extends StripeObject {
      /** The account holder name to be used during bank transference. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The account number of the UK Bank Account. */
      @SerializedName("account_number")
      String accountNumber;

      /**
       * The last four digits of the UK Bank Account number. This will always be returned. To view
       * the full account number when retrieving or listing FinancialAddresses, use the {@code
       * include} request parameter.
       */
      @SerializedName("last4")
      String last4;

      /** The sort code of the UK Bank Account. */
      @SerializedName("sort_code")
      String sortCode;
    }

    /**
     * The credentials of the SEPA Bank Account for the FinancialAddress. This contains unique
     * banking details such as the IBAN, BIC, etc. of a SEPA bank account.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaBankAccount extends StripeObject {
      /** The account holder name to be used during bank transfers. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The name of the Bank. */
      @SerializedName("bank_name")
      String bankName;

      /** The BIC of the SEPA Bank Account. */
      @SerializedName("bic")
      String bic;

      /** The originating country of the SEPA Bank account. */
      @SerializedName("country")
      String country;

      /** The IBAN of the SEPA Bank Account. */
      @SerializedName("iban")
      String iban;

      /**
       * The last four digits of the SEPA Bank Account number. This will always be returned. To view
       * the full account number when retrieving or listing FinancialAddresses, use the {@code
       * include} request parameter.
       */
      @SerializedName("last4")
      String last4;
    }

    /**
     * The credentials of the US Bank Account for the FinancialAddress. This contains unique banking
     * details such as the routing number, account number, etc. of a US bank account.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /** The account number of the US Bank Account. */
      @SerializedName("account_number")
      String accountNumber;

      /** The name of the Bank. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * The last four digits of the US Bank Account number. This will always be returned. To view
       * the full account number when retrieving or listing FinancialAddresses, use the {@code
       * include} request parameter.
       */
      @SerializedName("last4")
      String last4;

      /** The routing number of the US Bank Account. */
      @SerializedName("routing_number")
      String routingNumber;

      /** The swift code of the bank or financial institution. */
      @SerializedName("swift_code")
      String swiftCode;
    }
  }
}
