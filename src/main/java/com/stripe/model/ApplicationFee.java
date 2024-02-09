// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ApplicationFeeFeeRefundsParams;
import com.stripe.param.ApplicationFeeListParams;
import com.stripe.param.ApplicationFeeRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApplicationFee extends ApiResource implements BalanceTransactionSource {
  /** ID of the Stripe account this fee was taken from. */
  @SerializedName("account")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  /** Amount earned, in cents (or local equivalent). */
  @SerializedName("amount")
  Long amount;

  /**
   * Amount in cents (or local equivalent) refunded (can be less than the amount attribute on the
   * fee if a partial refund was issued).
   */
  @SerializedName("amount_refunded")
  Long amountRefunded;

  /** ID of the Connect application that earned the fee. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * Balance transaction that describes the impact of this collected application fee on your account
   * balance (not including refunds).
   */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** ID of the charge that the application fee was taken from. */
  @SerializedName("charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

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
   * <p>Equal to {@code application_fee}.
   */
  @SerializedName("object")
  String object;

  /**
   * ID of the corresponding charge on the platform account, if this fee was the result of a charge
   * using the {@code destination} parameter.
   */
  @SerializedName("originating_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> originatingTransaction;

  /**
   * Whether the fee has been fully refunded. If the fee is only partially refunded, this attribute
   * will still be false.
   */
  @SerializedName("refunded")
  Boolean refunded;

  /** A list of refunds that have been applied to the fee. */
  @SerializedName("refunds")
  FeeRefundCollection refunds;

  /** Get ID of expandable {@code account} object. */
  public String getAccount() {
    return (this.account != null) ? this.account.getId() : null;
  }

  public void setAccount(String id) {
    this.account = ApiResource.setExpandableFieldId(id, this.account);
  }

  /** Get expanded {@code account}. */
  public Account getAccountObject() {
    return (this.account != null) ? this.account.getExpanded() : null;
  }

  public void setAccountObject(Account expandableObject) {
    this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

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

  /** Get ID of expandable {@code charge} object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded {@code charge}. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code originatingTransaction} object. */
  public String getOriginatingTransaction() {
    return (this.originatingTransaction != null) ? this.originatingTransaction.getId() : null;
  }

  public void setOriginatingTransaction(String id) {
    this.originatingTransaction = ApiResource.setExpandableFieldId(id, this.originatingTransaction);
  }

  /** Get expanded {@code originatingTransaction}. */
  public Charge getOriginatingTransactionObject() {
    return (this.originatingTransaction != null) ? this.originatingTransaction.getExpanded() : null;
  }

  public void setOriginatingTransactionObject(Charge expandableObject) {
    this.originatingTransaction =
        new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection feeRefunds(Map<String, Object> params) throws StripeException {
    return feeRefunds(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection feeRefunds(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/application_fees/%s/refunds", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, FeeRefundCollection.class);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection feeRefunds(ApplicationFeeFeeRefundsParams params)
      throws StripeException {
    return feeRefunds(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection feeRefunds(
      ApplicationFeeFeeRefundsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/application_fees/%s/refunds", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FeeRefundCollection.class);
  }

  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public static ApplicationFeeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public static ApplicationFeeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/application_fees";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ApplicationFeeCollection.class);
  }

  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public static ApplicationFeeCollection list(ApplicationFeeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public static ApplicationFeeCollection list(
      ApplicationFeeListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/application_fees";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ApplicationFeeCollection.class);
  }

  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public static ApplicationFee retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public static ApplicationFee retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public static ApplicationFee retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/application_fees/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ApplicationFee.class);
  }

  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public static ApplicationFee retrieve(
      String id, ApplicationFeeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/application_fees/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ApplicationFee.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(account, responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(balanceTransaction, responseGetter);
    trySetResponseGetter(charge, responseGetter);
    trySetResponseGetter(originatingTransaction, responseGetter);
    trySetResponseGetter(refunds, responseGetter);
  }
}
