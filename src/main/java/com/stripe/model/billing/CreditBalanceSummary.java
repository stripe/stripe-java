// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.CreditBalanceSummaryRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Indicates the credit balance for credits granted to a customer. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditBalanceSummary extends ApiResource {
  /**
   * The credit balances. One entry per credit grant currency. If a customer only has credit grants
   * in a single currency, then this will have a single balance entry.
   */
  @SerializedName("balances")
  List<CreditBalanceSummary.Balance> balances;

  /** The customer the balance is for. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.credit_balance_summary}.
   */
  @SerializedName("object")
  String object;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves the credit balance summary for a customer. */
  public static CreditBalanceSummary retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the credit balance summary for a customer. */
  public static CreditBalanceSummary retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieves the credit balance summary for a customer. */
  public static CreditBalanceSummary retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_balance_summary";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditBalanceSummary.class);
  }

  /** Retrieves the credit balance summary for a customer. */
  public static CreditBalanceSummary retrieve(
      CreditBalanceSummaryRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/credit_balance_summary";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditBalanceSummary.class);
  }

  /**
   * For more details about Balance, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance extends StripeObject {
    @SerializedName("available_balance")
    AvailableBalance availableBalance;

    @SerializedName("ledger_balance")
    LedgerBalance ledgerBalance;

    /**
     * For more details about AvailableBalance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AvailableBalance extends StripeObject {
      /** The monetary amount. */
      @SerializedName("monetary")
      Monetary monetary;

      /**
       * The type of this amount. We currently only support {@code monetary} credits.
       *
       * <p>Equal to {@code monetary}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Monetary, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Monetary extends StripeObject {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /** A positive integer representing the amount. */
        @SerializedName("value")
        Long value;
      }
    }

    /**
     * For more details about LedgerBalance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LedgerBalance extends StripeObject {
      /** The monetary amount. */
      @SerializedName("monetary")
      Monetary monetary;

      /**
       * The type of this amount. We currently only support {@code monetary} credits.
       *
       * <p>Equal to {@code monetary}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Monetary, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Monetary extends StripeObject {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /** A positive integer representing the amount. */
        @SerializedName("value")
        Long value;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customer, responseGetter);
  }
}
