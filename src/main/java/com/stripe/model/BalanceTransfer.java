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
import com.stripe.param.BalanceTransferCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Balance transfers represent funds moving between balance types on your Stripe account. They
 * currently support moving funds between your Stripe balance and your <a
 * href="https://docs.stripe.com/issuing">Issuing</a> balance and between your <a
 * href="https://docs.stripe.com/connect/funds-segregation">Allocated Funds</a> balance and your
 * Stripe balance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceTransfer extends ApiResource implements HasId {
  /** A positive integer representing how much was transferred in the smallest currency unit. */
  @SerializedName("amount")
  Long amount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The balance that funds were transferred to. */
  @SerializedName("destination_balance")
  DestinationBalance destinationBalance;

  /**
   * A <a href="https://docs.stripe.com/treasury/moving-money/regulatory-receipts">hosted
   * transaction receipt</a> URL that is provided when money movement is considered regulated under
   * Stripe's money transmission licenses.
   */
  @SerializedName("hosted_regulatory_receipt_url")
  String hostedRegulatoryReceiptUrl;

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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code balance_transfer}.
   */
  @SerializedName("object")
  String object;

  /**
   * The balance that funds were transferred from. One of {@code card}, {@code fpx}, or {@code
   * bank_account}.
   */
  @SerializedName("source_balance")
  SourceBalance sourceBalance;

  /**
   * Creates a balance transfer. For Issuing use cases, funds will be debited immediately from the
   * source balance and credited to the destination balance immediately (if your account is based in
   * the US) or next-business-day (if your account is based in the EU). For Segregated Separate
   * Charges and Transfers use cases, funds will be debited immediately from the source balance and
   * credited immediately to the destination balance.
   */
  public static BalanceTransfer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a balance transfer. For Issuing use cases, funds will be debited immediately from the
   * source balance and credited to the destination balance immediately (if your account is based in
   * the US) or next-business-day (if your account is based in the EU). For Segregated Separate
   * Charges and Transfers use cases, funds will be debited immediately from the source balance and
   * credited immediately to the destination balance.
   */
  public static BalanceTransfer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_transfers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, BalanceTransfer.class);
  }

  /**
   * Creates a balance transfer. For Issuing use cases, funds will be debited immediately from the
   * source balance and credited to the destination balance immediately (if your account is based in
   * the US) or next-business-day (if your account is based in the EU). For Segregated Separate
   * Charges and Transfers use cases, funds will be debited immediately from the source balance and
   * credited immediately to the destination balance.
   */
  public static BalanceTransfer create(BalanceTransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a balance transfer. For Issuing use cases, funds will be debited immediately from the
   * source balance and credited to the destination balance immediately (if your account is based in
   * the US) or next-business-day (if your account is based in the EU). For Segregated Separate
   * Charges and Transfers use cases, funds will be debited immediately from the source balance and
   * credited immediately to the destination balance.
   */
  public static BalanceTransfer create(BalanceTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_transfers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BalanceTransfer.class);
  }

  /**
   * For more details about DestinationBalance, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DestinationBalance extends StripeObject {
    @SerializedName("issuing")
    Issuing issuing;

    @SerializedName("payments")
    Payments payments;

    /**
     * Destination balance type to adjust for the Balance Transfer. One of {@code payments}, {@code
     * issuing}, or {@code allocated_funds}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Issuing, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Issuing extends StripeObject {
      /** Identifier for the balance_transaction that increased the destination balance. */
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

    /**
     * For more details about Payments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments extends StripeObject {
      /** Identifier for the balance_transaction that increased the destination balance. */
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
  }

  /**
   * For more details about SourceBalance, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SourceBalance extends StripeObject {
    @SerializedName("issuing")
    Issuing issuing;

    @SerializedName("payments")
    Payments payments;

    /**
     * Source balance type to adjust for the Balance Transfer. One of {@code payments}, {@code
     * issuing}, or {@code allocated_funds}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Issuing, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Issuing extends StripeObject {
      /** Identifier for the balance_transaction that decreased the source balance. */
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

    /**
     * For more details about Payments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments extends StripeObject {
      /** Identifier for the balance_transaction that decreased the source balance. */
      @SerializedName("balance_transaction")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;

      /**
       * The payments balance type that this BalanceTransfer pulled funds from. One of {@code card},
       * {@code fpx}, or {@code bank_account}.
       */
      @SerializedName("source_type")
      String sourceType;

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
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(destinationBalance, responseGetter);
    trySetResponseGetter(sourceBalance, responseGetter);
  }
}
