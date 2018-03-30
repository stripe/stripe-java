package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApplicationFee extends APIResource implements HasId {
  String id;
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

  public void setAccount(String accountID) {
    this.account = setExpandableFieldID(accountID, this.account);
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

  public void setApplication(String applicationID) {
    this.application = setExpandableFieldID(applicationID, this.application);
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

  public void setBalanceTransaction(String balanceTransactionID) {
    this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
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

  public void setCharge(String chargeID) {
    this.charge = setExpandableFieldID(chargeID, this.charge);
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

  public void setOriginatingTransaction(String originatingTransactionID) {
    this.originatingTransaction
        = setExpandableFieldID(originatingTransactionID, this.originatingTransaction);
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
    if (refunds.getURL() == null) {
      // TODO replace with subresourceURL
      refunds.setURL(String.format("/v1/application_fees/%s/refunds", getId()));
    }

    return refunds;
  }

  public static ApplicationFee retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static ApplicationFee retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static ApplicationFee retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(ApplicationFee.class, id), null,
        ApplicationFee.class, options);
  }

  public static ApplicationFeeCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static ApplicationFeeCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(ApplicationFee.class), params, ApplicationFeeCollection.class,
        options);
  }

  @Deprecated
  public static ApplicationFeeCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static ApplicationFeeCollection all(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static ApplicationFeeCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, options);
  }


  public ApplicationFee refund() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(null, (RequestOptions) null);
  }

  public ApplicationFee refund(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return this.refund(params, (RequestOptions) null);
  }

  @Deprecated
  public ApplicationFee refund(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return this.refund(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public ApplicationFee refund(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return refund(null, options);
  }

  @Deprecated
  public ApplicationFee refund(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return refund(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public ApplicationFee refund(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/refund",
        instanceURL(ApplicationFee.class, this.getId())), params, ApplicationFee.class, options);
  }
}
