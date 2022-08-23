// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CashBalanceRetrieveParams;
import com.stripe.param.CashBalanceUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A customer's {@code Cash balance} represents real funds. Customers can add funds to their cash
 * balance by sending a bank transfer. These funds can be used for payment and can eventually be
 * paid out to your bank account.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CashBalance extends ApiResource {
  /**
   * A hash of all cash balances available to this customer. You cannot delete a customer with any
   * cash balances, even if the balance is 0. Amounts are represented in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("available")
  Map<String, Long> available;

  /** The ID of the customer whose cash balance this object represents. */
  @SerializedName("customer")
  String customer;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code cash_balance}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("settings")
  BalanceSettings settings;

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(String customer) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(String customer, RequestOptions options)
      throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, options);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CashBalance.class, options);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(
      String customer, CashBalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CashBalance.class, options);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(this.getCustomer())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CashBalance.class, options);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(CashBalanceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(CashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(this.getCustomer())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CashBalance.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliedToPaymentTransaction extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/payment_intents/object">Payment Intent</a> that
     * funds were applied to.
     */
    @SerializedName("payment_intent")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentIntent> paymentIntent;

    /** Get ID of expandable {@code paymentIntent} object. */
    public String getPaymentIntent() {
      return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
    }

    public void setPaymentIntent(String id) {
      this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
    }

    /** Get expanded {@code paymentIntent}. */
    public PaymentIntent getPaymentIntentObject() {
      return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
    }

    public void setPaymentIntentObject(PaymentIntent expandableObject) {
      this.paymentIntent =
          new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceSettings extends StripeObject {
    /**
     * The configuration for how funds that land in the customer cash balance are reconciled.
     *
     * <p>One of {@code automatic}, or {@code manual}.
     */
    @SerializedName("reconciliation_mode")
    String reconciliationMode;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FundedTransaction extends StripeObject {
    @SerializedName("bank_transfer")
    BankTransfer bankTransfer;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankTransfer extends StripeObject {
      @SerializedName("eu_bank_transfer")
      EuBankTransfer euBankTransfer;

      /** The user-supplied reference field on the bank transfer. */
      @SerializedName("reference")
      String reference;

      /**
       * The funding method type used to fund the customer balance. Permitted values include: {@code
       * eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, or {@code
       * mx_bank_transfer}.
       *
       * <p>One of {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, or
       * {@code mx_bank_transfer}.
       */
      @SerializedName("type")
      String type;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EuBankTransfer extends StripeObject {
        /** The BIC of the bank of the sender of the funding. */
        @SerializedName("bic")
        String bic;

        /** The last 4 digits of the IBAN of the sender of the funding. */
        @SerializedName("iban_last4")
        String ibanLast4;

        /** The full name of the sender, as supplied by the sending bank. */
        @SerializedName("sender_name")
        String senderName;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RefundedFromPaymentTransaction extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/refunds/object">Refund</a> that moved these funds
     * into the customer's cash balance.
     */
    @SerializedName("refund")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Refund> refund;

    /** Get ID of expandable {@code refund} object. */
    public String getRefund() {
      return (this.refund != null) ? this.refund.getId() : null;
    }

    public void setRefund(String id) {
      this.refund = ApiResource.setExpandableFieldId(id, this.refund);
    }

    /** Get expanded {@code refund}. */
    public Refund getRefundObject() {
      return (this.refund != null) ? this.refund.getExpanded() : null;
    }

    public void setRefundObject(Refund expandableObject) {
      this.refund = new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UnappliedFromPaymentTransaction extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/payment_intents/object">Payment Intent</a> that
     * funds were unapplied from.
     */
    @SerializedName("payment_intent")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentIntent> paymentIntent;

    /** Get ID of expandable {@code paymentIntent} object. */
    public String getPaymentIntent() {
      return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
    }

    public void setPaymentIntent(String id) {
      this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
    }

    /** Get expanded {@code paymentIntent}. */
    public PaymentIntent getPaymentIntentObject() {
      return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
    }

    public void setPaymentIntentObject(PaymentIntent expandableObject) {
      this.paymentIntent =
          new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
    }
  }
}
