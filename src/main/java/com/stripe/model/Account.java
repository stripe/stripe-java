package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Account extends APIResource implements HasId, MetadataStore<Account> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String businessLogo;
  String businessName;
  String businessPrimaryColor;
  @SerializedName("business_url")
  String businessURL;
  Boolean chargesEnabled;
  String country;
  Boolean debitNegativeBalances;
  AccountDeclineChargeOn declineChargeOn;
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
  AccountPayoutSchedule payoutSchedule;
  String productDescription;
  String statementDescriptor;
  String supportEmail;
  String supportPhone;
  @SerializedName("support_url")
  String supportURL;
  String timezone;
  AccountTosAcceptance tosAcceptance;
  AccountTransferSchedule transferSchedule;
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
  public static Account create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create an account.
   */
  public static Account create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Account.class), params, Account.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an account.
   */
  public DeletedAccount delete()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(null, (RequestOptions) null);
  }

  /**
   * Delete an account.
   */
  public DeletedAccount delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(null, options);
  }

  /**
   * Delete an account.
   */
  public DeletedAccount delete(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(params, null);
  }

  /**
   * Delete an account.
   */
  public DeletedAccount delete(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Account.class, this.id), params,
        DeletedAccount.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all connected accounts.
   */
  public static AccountCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all connected accounts.
   */
  public static AccountCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Account.class), params, AccountCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="reject">
  /**
   * Reject an account.
   */
  public Account reject(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return reject(params, null);
  }

  /**
   * Reject an account.
   */
  public Account reject(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/reject",
        instanceURL(Account.class, this.getId())), params, Account.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve account details.
   */
  public static Account retrieve()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve((RequestOptions) null);
  }

  /**
   * Retrieve account details.
   */
  public static Account retrieve(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, singleClassURL(Account.class), null, Account.class, options);
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
  public static Account retrieve(String apiKeyOrAccountId)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    if (null == apiKeyOrAccountId || apiKeyOrAccountId.startsWith("sk_")) {
      return retrieve(RequestOptions.builder().setApiKey(apiKeyOrAccountId).build());
    } else {
      return retrieve(apiKeyOrAccountId, null);
    }
  }

  /**
   * Retrieve account details.
   */
  public static Account retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Account.class, id), null, Account.class, options);
  }

  /**
   * Retrieve account details.
   */
  public static Account retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Account.class, id), params, Account.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an account.
   */
  @Override
  public Account update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update an account.
   */
  @Override
  public Account update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Account.class, this.id), params, Account.class,
        options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    Boolean contacted;
    String disabledReason;
    Long dueBy;
    List<String> fieldsNeeded;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Keys extends StripeObject {
    String publishable;
    String secret;
  }
}
