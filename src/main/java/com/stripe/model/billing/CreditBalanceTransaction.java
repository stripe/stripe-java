// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Invoice;
import com.stripe.model.StripeObject;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.CreditBalanceTransactionListParams;
import com.stripe.param.billing.CreditBalanceTransactionRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A credit balance transaction is a resource representing a transaction (either a credit or a
 * debit) against an existing credit grant.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditBalanceTransaction extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Credit details for this balance transaction. Only present if type is {@code credit}. */
  @SerializedName("credit")
  Credit credit;

  /** The credit grant associated with this balance transaction. */
  @SerializedName("credit_grant")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<CreditGrant> creditGrant;

  /** Debit details for this balance transaction. Only present if type is {@code debit}. */
  @SerializedName("debit")
  Debit debit;

  /** The effective time of this balance transaction. */
  @SerializedName("effective_at")
  Long effectiveAt;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.credit_balance_transaction}.
   */
  @SerializedName("object")
  String object;

  /** ID of the test clock this credit balance transaction belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  /**
   * The type of balance transaction (credit or debit).
   *
   * <p>One of {@code credit}, or {@code debit}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code creditGrant} object. */
  public String getCreditGrant() {
    return (this.creditGrant != null) ? this.creditGrant.getId() : null;
  }

  public void setCreditGrant(String id) {
    this.creditGrant = ApiResource.setExpandableFieldId(id, this.creditGrant);
  }

  /** Get expanded {@code creditGrant}. */
  public CreditGrant getCreditGrantObject() {
    return (this.creditGrant != null) ? this.creditGrant.getExpanded() : null;
  }

  public void setCreditGrantObject(CreditGrant expandableObject) {
    this.creditGrant = new ExpandableField<CreditGrant>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code testClock} object. */
  public String getTestClock() {
    return (this.testClock != null) ? this.testClock.getId() : null;
  }

  public void setTestClock(String id) {
    this.testClock = ApiResource.setExpandableFieldId(id, this.testClock);
  }

  /** Get expanded {@code testClock}. */
  public TestClock getTestClockObject() {
    return (this.testClock != null) ? this.testClock.getExpanded() : null;
  }

  public void setTestClockObject(TestClock expandableObject) {
    this.testClock = new ExpandableField<TestClock>(expandableObject.getId(), expandableObject);
  }

  /** Retrieve a list of credit balance transactions. */
  public static CreditBalanceTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of credit balance transactions. */
  public static CreditBalanceTransactionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/credit_balance_transactions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditBalanceTransactionCollection.class);
  }

  /** Retrieve a list of credit balance transactions. */
  public static CreditBalanceTransactionCollection list(CreditBalanceTransactionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of credit balance transactions. */
  public static CreditBalanceTransactionCollection list(
      CreditBalanceTransactionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/credit_balance_transactions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditBalanceTransactionCollection.class);
  }

  /** Retrieves a credit balance transaction. */
  public static CreditBalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a credit balance transaction. */
  public static CreditBalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a credit balance transaction. */
  public static CreditBalanceTransaction retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/billing/credit_balance_transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditBalanceTransaction.class);
  }

  /** Retrieves a credit balance transaction. */
  public static CreditBalanceTransaction retrieve(
      String id, CreditBalanceTransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_balance_transactions/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditBalanceTransaction.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Credit extends StripeObject {
    @SerializedName("amount")
    Amount amount;

    /**
     * The type of credit transaction.
     *
     * <p>Equal to {@code credits_granted}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Debit extends StripeObject {
    @SerializedName("amount")
    Amount amount;

    /**
     * Details of how the credits were applied to an invoice. Only present if {@code type} is {@code
     * credits_applied}.
     */
    @SerializedName("credits_applied")
    CreditsApplied creditsApplied;

    /**
     * The type of debit transaction.
     *
     * <p>One of {@code credits_applied}, {@code credits_expired}, or {@code credits_voided}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CreditsApplied extends StripeObject {
      /** The invoice to which the credits were applied. */
      @SerializedName("invoice")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Invoice> invoice;

      /** The invoice line item to which the credits were applied. */
      @SerializedName("invoice_line_item")
      String invoiceLineItem;

      /** Get ID of expandable {@code invoice} object. */
      public String getInvoice() {
        return (this.invoice != null) ? this.invoice.getId() : null;
      }

      public void setInvoice(String id) {
        this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
      }

      /** Get expanded {@code invoice}. */
      public Invoice getInvoiceObject() {
        return (this.invoice != null) ? this.invoice.getExpanded() : null;
      }

      public void setInvoiceObject(Invoice expandableObject) {
        this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(credit, responseGetter);
    trySetResponseGetter(creditGrant, responseGetter);
    trySetResponseGetter(debit, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
  }
}
