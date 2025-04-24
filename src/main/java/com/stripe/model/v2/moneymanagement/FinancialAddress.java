// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

  /**
   * Open Enum. The currency the FinancialAddress supports.
   *
   * <p>One of {@code aed}, {@code afn}, {@code all}, {@code amd}, {@code ang}, {@code aoa}, {@code
   * ars}, {@code aud}, {@code awg}, {@code azn}, {@code bam}, {@code bbd}, {@code bdt}, {@code
   * bgn}, {@code bhd}, {@code bif}, {@code bmd}, {@code bnd}, {@code bob}, {@code bov}, {@code
   * brl}, {@code bsd}, {@code btn}, {@code bwp}, {@code byn}, {@code byr}, {@code bzd}, {@code
   * cad}, {@code cdf}, {@code che}, {@code chf}, {@code chw}, {@code clf}, {@code clp}, {@code
   * cny}, {@code cop}, {@code cou}, {@code crc}, {@code cuc}, {@code cup}, {@code cve}, {@code
   * czk}, {@code djf}, {@code dkk}, {@code dop}, {@code dzd}, {@code eek}, {@code egp}, {@code
   * ern}, {@code etb}, {@code eur}, {@code fjd}, {@code fkp}, {@code gbp}, {@code gel}, {@code
   * ghc}, {@code ghs}, {@code gip}, {@code gmd}, {@code gnf}, {@code gtq}, {@code gyd}, {@code
   * hkd}, {@code hnl}, {@code hrk}, {@code htg}, {@code huf}, {@code idr}, {@code ils}, {@code
   * inr}, {@code iqd}, {@code irr}, {@code isk}, {@code jmd}, {@code jod}, {@code jpy}, {@code
   * kes}, {@code kgs}, {@code khr}, {@code kmf}, {@code kpw}, {@code krw}, {@code kwd}, {@code
   * kyd}, {@code kzt}, {@code lak}, {@code lbp}, {@code lkr}, {@code lrd}, {@code lsl}, {@code
   * ltl}, {@code lvl}, {@code lyd}, {@code mad}, {@code mdl}, {@code mga}, {@code mkd}, {@code
   * mmk}, {@code mnt}, {@code mop}, {@code mro}, {@code mru}, {@code mur}, {@code mvr}, {@code
   * mwk}, {@code mxn}, {@code mxv}, {@code myr}, {@code mzn}, {@code nad}, {@code ngn}, {@code
   * nio}, {@code nok}, {@code npr}, {@code nzd}, {@code omr}, {@code pab}, {@code pen}, {@code
   * pgk}, {@code php}, {@code pkr}, {@code pln}, {@code pyg}, {@code qar}, {@code ron}, {@code
   * rsd}, {@code rub}, {@code rwf}, {@code sar}, {@code sbd}, {@code scr}, {@code sdg}, {@code
   * sek}, {@code sgd}, {@code shp}, {@code sle}, {@code sll}, {@code sos}, {@code srd}, {@code
   * ssp}, {@code std}, {@code stn}, {@code svc}, {@code syp}, {@code szl}, {@code thb}, {@code
   * tjs}, {@code tmt}, {@code tnd}, {@code top}, {@code try}, {@code ttd}, {@code twd}, {@code
   * tzs}, {@code uah}, {@code ugx}, {@code usd}, {@code usdb}, {@code usdc}, {@code usn}, {@code
   * uyi}, {@code uyu}, {@code uzs}, {@code vef}, {@code ves}, {@code vnd}, {@code vuv}, {@code
   * wst}, {@code xaf}, {@code xcd}, {@code xcg}, {@code xof}, {@code xpf}, {@code yer}, {@code
   * zar}, {@code zmk}, {@code zmw}, {@code zwd}, {@code zwg}, or {@code zwl}.
   */
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

  /**
   * Closed Enum. An enum representing the status of the FinancialAddress. This indicates whether or
   * not the FinancialAddress can be used for any money movement flows.
   *
   * <p>One of {@code active}, {@code archived}, {@code failed}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * For more details about Credentials, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
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
     * Open Enum. The type of Credentials that are provisioned for the FinancialAddress.
     *
     * <p>One of {@code gb_bank_account}, or {@code us_bank_account}.
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
     * For more details about GbBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
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
     * For more details about UsBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
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
