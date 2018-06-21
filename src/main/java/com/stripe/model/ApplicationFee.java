package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApplicationFee extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> account;
  Long amount;
  Long amountRefunded;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Application> application;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String currency;
  Boolean livemode;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<Charge> originatingTransaction;
  Boolean refunded;
  @Getter(AccessLevel.NONE) FeeRefundCollection refunds;

  /**
   * The {@code user} attribute.
   *
   * @return the {@code user} attribute
   * @deprecated Prefer using the {@link #account} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2013-12-03">API version 2013-12-03</a>
   */
  @Deprecated
  String user;

  // <editor-fold desc="account">
  public String getAccount() {
    return (this.account != null) ? this.account.getId() : null;
  }

  public void setAccount(String accountId) {
    this.account = setExpandableFieldId(accountId, this.account);
  }

  public Account getAccountObject() {
    return (this.account != null) ? this.account.getExpanded() : null;
  }

  public void setAccountObject(Account c) {
    this.account = new ExpandableField<Account>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="application">
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String applicationId) {
    this.application = setExpandableFieldId(applicationId, this.application);
  }

  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application c) {
    this.application = new ExpandableField<Application>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionId) {
    this.balanceTransaction = setExpandableFieldId(balanceTransactionId, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="charge">
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeId) {
    this.charge = setExpandableFieldId(chargeId, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge c) {
    this.charge = new ExpandableField<Charge>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="originatingTransaction">
  public String getOriginatingTransaction() {
    return (this.originatingTransaction != null) ? this.originatingTransaction.getId() : null;
  }

  public void setOriginatingTransaction(String originatingTransactionId) {
    this.originatingTransaction
        = setExpandableFieldId(originatingTransactionId, this.originatingTransaction);
  }

  public Charge getOriginatingTransactionObject() {
    return (this.originatingTransaction != null) ? this.originatingTransaction.getExpanded() : null;
  }

  public void setOriginatingTransactionObject(Charge c) {
    this.originatingTransaction = new ExpandableField<Charge>(c.getId(), c);
  }
  // </editor-fold>

  /**
   * Returns the {@code refunds} list.
   *
   * @return the {@code refunds} list
   */
  public FeeRefundCollection getRefunds() {
    // API versions 2014-07-26 and earlier render charge refunds as an array
    // instead of an object, meaning there is no sublist URL.
    if (refunds.getUrl() == null) {
      // TODO replace with subresourceUrl
      refunds.setUrl(String.format("/v1/application_fees/%s/refunds", getId()));
    }

    return refunds;
  }

  // <editor-fold desc="list">
  /**
   * List all application fees.
   */
  public static ApplicationFeeCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all application fees.
   */
  public static ApplicationFeeCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return requestCollection(classUrl(ApplicationFee.class), params, ApplicationFeeCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an application fee.
   */
  public static ApplicationFee retrieve(String id) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an application fee.
   */
  public static ApplicationFee retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(ApplicationFee.class, id), null,
        ApplicationFee.class, options);
  }
  // </editor-fold>
}
