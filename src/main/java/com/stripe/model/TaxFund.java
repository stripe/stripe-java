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
import com.stripe.param.TaxFundListParams;
import com.stripe.param.TaxFundRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A TaxFund object represents a single tax float sweep event — funds moved between a merchant's
 * payments balance and their tax fund financial account for Stripe Tax obligations.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxFund extends ApiResource implements HasId {
  /** Amount swept, in the smallest currency unit. Always positive. */
  @SerializedName("amount")
  Long amount;

  /** Associated billing or tax documents for this sweep. */
  @SerializedName("context")
  Context context;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Where funds moved to. */
  @SerializedName("destination")
  Destination destination;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax_fund}.
   */
  @SerializedName("object")
  String object;

  /** Where funds moved from. */
  @SerializedName("source")
  Source source;

  /** What caused the sweep. */
  @SerializedName("trigger")
  Trigger trigger;

  /** Returns a list of tax funds in reverse chronological order. */
  public static TaxFundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax funds in reverse chronological order. */
  public static TaxFundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_funds";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TaxFundCollection.class);
  }

  /** Returns a list of tax funds in reverse chronological order. */
  public static TaxFundCollection list(TaxFundListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax funds in reverse chronological order. */
  public static TaxFundCollection list(TaxFundListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_funds";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxFundCollection.class);
  }

  /** Retrieves a tax fund object by its ID. */
  public static TaxFund retrieve(String taxFund) throws StripeException {
    return retrieve(taxFund, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a tax fund object by its ID. */
  public static TaxFund retrieve(String taxFund, RequestOptions options) throws StripeException {
    return retrieve(taxFund, (Map<String, Object>) null, options);
  }

  /** Retrieves a tax fund object by its ID. */
  public static TaxFund retrieve(String taxFund, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_funds/%s", ApiResource.urlEncodeId(taxFund));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TaxFund.class);
  }

  /** Retrieves a tax fund object by its ID. */
  public static TaxFund retrieve(
      String taxFund, TaxFundRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax_funds/%s", ApiResource.urlEncodeId(taxFund));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxFund.class);
  }

  /** Associated billing or tax documents for this sweep. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Context extends StripeObject {
    @SerializedName("checkout_session")
    String checkoutSession;

    @SerializedName("credit_note")
    String creditNote;

    @SerializedName("invoice")
    String invoice;

    @SerializedName("payment_intent")
    String paymentIntent;

    @SerializedName("refund")
    String refund;

    @SerializedName("tax_transaction")
    String taxTransaction;
  }

  /** Where funds moved to. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Destination extends StripeObject {
    /** Details about the payments balance side of the sweep. */
    @SerializedName("payments_balance")
    PaymentsBalance paymentsBalance;

    /** Details about the tax fund financial account side of the sweep. */
    @SerializedName("tax_fund_account")
    TaxFundAccount taxFundAccount;

    @SerializedName("type")
    String type;

    /** Details about the payments balance side of the sweep. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentsBalance extends StripeObject {
      @SerializedName("balance_transaction")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;

      /** Get ID of expandable {@code balanceTransaction} object. */
      public String getBalanceTransaction() {
        return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
      }

      public void setBalanceTransaction(String id) {
        this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
      }

      /** Get expanded {@code balanceTransaction}. */
      public BalanceTransaction getBalanceTransactionObject() {
        return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
      }

      public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
        this.balanceTransaction =
            new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
      }
    }

    /** Details about the tax fund financial account side of the sweep. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxFundAccount extends StripeObject {
      @SerializedName("financial_account")
      String financialAccount;

      @SerializedName("transaction")
      String transaction;
    }
  }

  /** Where funds moved from. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Source extends StripeObject {
    /** Details about the payments balance side of the sweep. */
    @SerializedName("payments_balance")
    PaymentsBalance paymentsBalance;

    /** Details about the tax fund financial account side of the sweep. */
    @SerializedName("tax_fund_account")
    TaxFundAccount taxFundAccount;

    @SerializedName("type")
    String type;

    /** Details about the payments balance side of the sweep. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentsBalance extends StripeObject {
      @SerializedName("balance_transaction")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;

      /** Get ID of expandable {@code balanceTransaction} object. */
      public String getBalanceTransaction() {
        return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
      }

      public void setBalanceTransaction(String id) {
        this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
      }

      /** Get expanded {@code balanceTransaction}. */
      public BalanceTransaction getBalanceTransactionObject() {
        return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
      }

      public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
        this.balanceTransaction =
            new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
      }
    }

    /** Details about the tax fund financial account side of the sweep. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxFundAccount extends StripeObject {
      @SerializedName("financial_account")
      String financialAccount;

      @SerializedName("transaction")
      String transaction;
    }
  }

  /** What caused the sweep. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Trigger extends StripeObject {
    @SerializedName("balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<BalanceTransaction> balanceTransaction;

    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code balanceTransaction} object. */
    public String getBalanceTransaction() {
      return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
    }

    public void setBalanceTransaction(String id) {
      this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
    }

    /** Get expanded {@code balanceTransaction}. */
    public BalanceTransaction getBalanceTransactionObject() {
      return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
    }

    public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
      this.balanceTransaction =
          new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(context, responseGetter);
    trySetResponseGetter(destination, responseGetter);
    trySetResponseGetter(source, responseGetter);
    trySetResponseGetter(trigger, responseGetter);
  }
}
