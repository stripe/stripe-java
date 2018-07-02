package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Account extends ApiResource implements HasId, MetadataStore<Account> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String businessLogo;
  String businessName;
  String businessPrimaryColor;
  String businessUrl;
  Boolean chargesEnabled;
  String country;
  Boolean debitNegativeBalances;
  DeclineChargeOn declineChargeOn;
  String defaultCurrency;
  Boolean detailsSubmitted;
  String displayName;
  LoginLinkCollection loginLinks;
  String email;
  ExternalAccountCollection externalAccounts;
  Keys keys;
  LegalEntity legalEntity;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  Boolean payoutsEnabled;
  PayoutSchedule payoutSchedule;
  String productDescription;
  String statementDescriptor;
  String supportEmail;
  String supportPhone;
  String supportUrl;
  String timezone;
  TosAcceptance tosAcceptance;
  TransferSchedule transferSchedule;
  Boolean transfersEnabled;
  String type;
  Verification verification;

  /**
   * The {@code managed} attribute.
   *
   * @deprecated Prefer using the {@link #type} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2017-05-25">API version 2017-05-25</a>
   */
  @Deprecated
  Boolean managed;

  /**
   * The {@code currencies_supported} attribute.
   *
   * @deprecated Prefer using the {@link CountrySpec#getSupportedPaymentCurrencies()} method
   *     instead.
   * @see <a href="https://stripe.com/docs/upgrades#2016-03-07">API version 2016-03-07</a>
   */
  @Deprecated
  List<String> currenciesSupported;

  // <editor-fold desc="create">
  /**
   * Create an account.
   */
  public static Account create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create an account.
   */
  public static Account create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Account.class), params, Account.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an account.
   */
  public DeletedAccount delete() throws StripeException {
    return delete(null, (RequestOptions) null);
  }

  /**
   * Delete an account.
   */
  public DeletedAccount delete(RequestOptions options) throws StripeException {
    return delete(null, options);
  }

  /**
   * Delete an account.
   */
  public DeletedAccount delete(Map<String, Object> params) throws StripeException {
    return delete(params, null);
  }

  /**
   * Delete an account.
   */
  public DeletedAccount delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Account.class, this.id), params,
        DeletedAccount.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all connected accounts.
   */
  public static AccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all connected accounts.
   */
  public static AccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Account.class), params, AccountCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="reject">
  /**
   * Reject an account.
   */
  public Account reject(Map<String, Object> params) throws StripeException {
    return reject(params, null);
  }

  /**
   * Reject an account.
   */
  public Account reject(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, String.format("%s/reject",
        instanceUrl(Account.class, this.getId())), params, Account.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve account details.
   */
  public static Account retrieve() throws StripeException {
    return retrieve((RequestOptions) null);
  }

  /**
   * Retrieve account details.
   */
  public static Account retrieve(RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, singleClassUrl(Account.class), null, Account.class, options);
  }

  /**
   * Retrieve account details.
   *
   * @param apiKeyOrAccountId If the parameter looks like an API key (starts with "sk_"), retrieve
   *     the account resource with no ID parameter set. Otherwise, use the String parameter as the
   *     account ID.
   * @deprecated This method will only accept account IDs in the next major version. If you call
   *     this method with API keys, use the {@link #retrieve(RequestOptions)} method instead.
   */
  @Deprecated
  public static Account retrieve(String apiKeyOrAccountId) throws StripeException {
    if (null == apiKeyOrAccountId || apiKeyOrAccountId.startsWith("sk_")) {
      return retrieve(RequestOptions.builder().setApiKey(apiKeyOrAccountId).build());
    } else {
      return retrieve(apiKeyOrAccountId, null);
    }
  }

  /**
   * Retrieve account details.
   */
  public static Account retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Account.class, id), null, Account.class, options);
  }

  /**
   * Retrieve account details.
   */
  public static Account retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Account.class, id), params, Account.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an account.
   */
  @Override
  public Account update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update an account.
   */
  @Override
  public Account update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Account.class, this.id), params, Account.class,
        options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeclineChargeOn extends StripeObject {
    Boolean avsFailure;
    Boolean cvcFailure;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Keys extends StripeObject {
    String publishable;
    String secret;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PayoutSchedule extends StripeObject {
    Long delayDays;
    String interval;
    Long monthlyAnchor;
    String weeklyAnchor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TosAcceptance extends StripeObject {
    Long date;
    String ip;
    String userAgent;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferSchedule extends StripeObject {
    Long delayDays;
    String interval;
    Long monthlyAnchor;
    String weeklyAnchor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    Boolean contacted;
    String disabledReason;
    Long dueBy;
    List<String> fieldsNeeded;
  }
}
