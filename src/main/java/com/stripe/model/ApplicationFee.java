package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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

  /** Amount earned, in %s. */
  @SerializedName("amount")
  Long amount;

  /**
   * Amount in %s refunded (can be less than the amount attribute on the fee if a partial refund was
   * issued).
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
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `application_fee`.
   */
  @SerializedName("object")
  String object;

  /**
   * ID of the corresponding charge on the platform account, if this fee was the result of a charge
   * using the `destination` parameter.
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

  /** Get id of expandable `account` object. */
  public String getAccount() {
    return (this.account != null) ? this.account.getId() : null;
  }

  public void setAccount(String id) {
    this.account = ApiResource.setExpandableFieldId(id, this.account);
  }

  /** Get expanded `account`. */
  public Account getAccountObject() {
    return (this.account != null) ? this.account.getExpanded() : null;
  }

  public void setAccountObject(Account expandableObject) {
    this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `application` object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded `application`. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `balanceTransaction` object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded `balanceTransaction`. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `charge` object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded `charge`. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `originatingTransaction` object. */
  public String getOriginatingTransaction() {
    return (this.originatingTransaction != null) ? this.originatingTransaction.getId() : null;
  }

  public void setOriginatingTransaction(String id) {
    this.originatingTransaction = ApiResource.setExpandableFieldId(id, this.originatingTransaction);
  }

  /** Get expanded `originatingTransaction`. */
  public Charge getOriginatingTransactionObject() {
    return (this.originatingTransaction != null) ? this.originatingTransaction.getExpanded() : null;
  }

  public void setOriginatingTransactionObject(Charge expandableObject) {
    this.originatingTransaction =
        new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/application_fees");
    return ApiResource.requestCollection(url, params, ApplicationFeeCollection.class, options);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/application_fees");
    return ApiResource.requestCollection(url, params, ApplicationFeeCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/application_fees/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ApplicationFee.class, options);
  }

  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public static ApplicationFee retrieve(
      String id, ApplicationFeeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/application_fees/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ApplicationFee.class, options);
  }
}
