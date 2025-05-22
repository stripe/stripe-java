// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BalanceRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This is an object representing your Stripe balance. You can retrieve it to see the balance
 * currently on your Stripe account.
 *
 * <p>You can also retrieve the balance history, which contains a list of <a
 * href="https://stripe.com/docs/reporting/balance-transaction-types">transactions</a> that
 * contributed to the balance (charges, payouts, and so forth).
 *
 * <p>The available and pending amounts for each currency are broken down further by payment source
 * types.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/connect/account-balances">Understanding
 * Connect account balances</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Balance extends ApiResource {
  /**
   * Available funds that you can transfer or pay out automatically by Stripe or explicitly through
   * the <a href="https://stripe.com/docs/api#transfers">Transfers API</a> or <a
   * href="https://stripe.com/docs/api#payouts">Payouts API</a>. You can find the available balance
   * for each currency and payment type in the {@code source_types} property.
   */
  @SerializedName("available")
  List<Balance.Available> available;

  /**
   * Funds held due to negative balances on connected accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts. You can find the connect reserve
   * balance for each currency and payment type in the {@code source_types} property.
   */
  @SerializedName("connect_reserved")
  List<Balance.ConnectReserved> connectReserved;

  /** Funds that you can pay out using Instant Payouts. */
  @SerializedName("instant_available")
  List<Balance.InstantAvailable> instantAvailable;

  @SerializedName("issuing")
  Issuing issuing;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code balance}.
   */
  @SerializedName("object")
  String object;

  /**
   * Funds that aren't available in the balance yet. You can find the pending balance for each
   * currency and each payment type in the {@code source_types} property.
   */
  @SerializedName("pending")
  List<Balance.Pending> pending;

  @SerializedName("refund_and_dispute_prefunding")
  RefundAndDisputePrefunding refundAndDisputePrefunding;

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Balance.class);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve(BalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Balance.class);
  }

  /**
   * For more details about Available, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Available extends StripeObject {
    /** Balance amount. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    @SerializedName("source_types")
    SourceTypes sourceTypes;

    /**
     * For more details about SourceTypes, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceTypes extends StripeObject {
      /**
       * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
       * payments</a>.
       */
      @SerializedName("bank_account")
      Long bankAccount;

      /**
       * Amount coming from most payment methods, including cards as well as <a
       * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
       */
      @SerializedName("card")
      Long card;

      /**
       * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
       * payment method.
       */
      @SerializedName("fpx")
      Long fpx;
    }
  }

  /**
   * For more details about ConnectReserved, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ConnectReserved extends StripeObject {
    /** Balance amount. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    @SerializedName("source_types")
    SourceTypes sourceTypes;

    /**
     * For more details about SourceTypes, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceTypes extends StripeObject {
      /**
       * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
       * payments</a>.
       */
      @SerializedName("bank_account")
      Long bankAccount;

      /**
       * Amount coming from most payment methods, including cards as well as <a
       * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
       */
      @SerializedName("card")
      Long card;

      /**
       * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
       * payment method.
       */
      @SerializedName("fpx")
      Long fpx;
    }
  }

  /**
   * For more details about InstantAvailable, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InstantAvailable extends StripeObject {
    /** Balance amount. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /** Breakdown of balance by destination. */
    @SerializedName("net_available")
    List<Balance.InstantAvailable.NetAvailable> netAvailable;

    @SerializedName("source_types")
    SourceTypes sourceTypes;

    /**
     * For more details about NetAvailable, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NetAvailable extends StripeObject {
      /** Net balance amount, subtracting fees from platform-set pricing. */
      @SerializedName("amount")
      Long amount;

      /** ID of the external account for this net balance (not expandable). */
      @SerializedName("destination")
      String destination;

      @SerializedName("source_types")
      SourceTypes sourceTypes;

      /**
       * For more details about SourceTypes, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SourceTypes extends StripeObject {
        /**
         * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
         * payments</a>.
         */
        @SerializedName("bank_account")
        Long bankAccount;

        /**
         * Amount coming from most payment methods, including cards as well as <a
         * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
         */
        @SerializedName("card")
        Long card;

        /**
         * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
         * payment method.
         */
        @SerializedName("fpx")
        Long fpx;
      }
    }

    /**
     * For more details about SourceTypes, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceTypes extends StripeObject {
      /**
       * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
       * payments</a>.
       */
      @SerializedName("bank_account")
      Long bankAccount;

      /**
       * Amount coming from most payment methods, including cards as well as <a
       * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
       */
      @SerializedName("card")
      Long card;

      /**
       * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
       * payment method.
       */
      @SerializedName("fpx")
      Long fpx;
    }
  }

  /**
   * For more details about Issuing, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Issuing extends StripeObject {
    /** Funds that are available for use. */
    @SerializedName("available")
    List<Balance.Issuing.Available> available;

    /**
     * For more details about Available, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Available extends StripeObject {
      /** Balance amount. */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      @SerializedName("source_types")
      SourceTypes sourceTypes;

      /**
       * For more details about SourceTypes, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SourceTypes extends StripeObject {
        /**
         * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
         * payments</a>.
         */
        @SerializedName("bank_account")
        Long bankAccount;

        /**
         * Amount coming from most payment methods, including cards as well as <a
         * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
         */
        @SerializedName("card")
        Long card;

        /**
         * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
         * payment method.
         */
        @SerializedName("fpx")
        Long fpx;
      }
    }
  }

  /**
   * For more details about Pending, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pending extends StripeObject {
    /** Balance amount. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    @SerializedName("source_types")
    SourceTypes sourceTypes;

    /**
     * For more details about SourceTypes, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceTypes extends StripeObject {
      /**
       * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
       * payments</a>.
       */
      @SerializedName("bank_account")
      Long bankAccount;

      /**
       * Amount coming from most payment methods, including cards as well as <a
       * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
       */
      @SerializedName("card")
      Long card;

      /**
       * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
       * payment method.
       */
      @SerializedName("fpx")
      Long fpx;
    }
  }

  /**
   * For more details about RefundAndDisputePrefunding, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RefundAndDisputePrefunding extends StripeObject {
    /** Funds that are available for use. */
    @SerializedName("available")
    List<Balance.RefundAndDisputePrefunding.Available> available;

    /** Funds that are pending. */
    @SerializedName("pending")
    List<Balance.RefundAndDisputePrefunding.Pending> pending;

    /**
     * For more details about Available, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Available extends StripeObject {
      /** Balance amount. */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      @SerializedName("source_types")
      SourceTypes sourceTypes;

      /**
       * For more details about SourceTypes, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SourceTypes extends StripeObject {
        /**
         * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
         * payments</a>.
         */
        @SerializedName("bank_account")
        Long bankAccount;

        /**
         * Amount coming from most payment methods, including cards as well as <a
         * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
         */
        @SerializedName("card")
        Long card;

        /**
         * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
         * payment method.
         */
        @SerializedName("fpx")
        Long fpx;
      }
    }

    /**
     * For more details about Pending, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pending extends StripeObject {
      /** Balance amount. */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      @SerializedName("source_types")
      SourceTypes sourceTypes;

      /**
       * For more details about SourceTypes, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SourceTypes extends StripeObject {
        /**
         * Amount coming from <a href="https://docs.stripe.com/ach-deprecated">legacy US ACH
         * payments</a>.
         */
        @SerializedName("bank_account")
        Long bankAccount;

        /**
         * Amount coming from most payment methods, including cards as well as <a
         * href="https://docs.stripe.com/payments/bank-debits">non-legacy bank debits</a>.
         */
        @SerializedName("card")
        Long card;

        /**
         * Amount coming from <a href="https://docs.stripe.com/payments/fpx">FPX</a>, a Malaysian
         * payment method.
         */
        @SerializedName("fpx")
        Long fpx;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(issuing, responseGetter);
    trySetResponseGetter(refundAndDisputePrefunding, responseGetter);
  }
}
