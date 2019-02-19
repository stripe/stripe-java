package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Account extends ApiResource implements HasId, MetadataStore<Account> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  BusinessProfile businessProfile;
  String businessType;
  Capabilities capabilities;
  Boolean chargesEnabled;
  Company company;
  String country;
  Long created;
  String defaultCurrency;
  Boolean deleted;
  Boolean detailsSubmitted;
  String email;
  ExternalAccountCollection externalAccounts;
  Person individual;
  LoginLinkCollection loginLinks;
  Map<String, String> metadata;
  Boolean payoutsEnabled;
  Requirements requirements;
  Settings settings;
  TosAcceptance tosAcceptance;
  String type;

  /**
   * The {@code business_logo_large} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String businessLogoLarge;

  /**
   * The {@code business_logo} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String businessLogo;

  /**
   * The {@code business_name} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String businessName;

  /**
   * The {@code business_primary_color} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String businessPrimaryColor;

  /**
   * The {@code business_url} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String businessUrl;

  /**
   * The {@code currencies_supported} attribute.
   *
   * @deprecated Prefer using the {@link CountrySpec#getSupportedPaymentCurrencies()} method
   *     instead.
   * @see <a href="https://stripe.com/docs/upgrades#2016-03-07">API version 2016-03-07</a>
   */
  @Deprecated
  List<String> currenciesSupported;

  /**
   * The {@code decline_charge_on} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  DeclineChargeOn declineChargeOn;

  /**
   * The {@code debit_negative_balances} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  Boolean debitNegativeBalances;

  /**
   * The {@code keys} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  Keys keys;

  /**
   * The {@code legal_entity} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  LegalEntity legalEntity;

  /**
   * The {@code managed} attribute.
   *
   * @deprecated Prefer using the {@link #type} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2017-05-25">API version 2017-05-25</a>
   */
  @Deprecated
  Boolean managed;

  /**
   * The {@code mcc} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String mcc;

  /**
   * The {@code payout_schedule} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  PayoutSchedule payoutSchedule;

  /**
   * The {@code payout_statement_descriptor} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String payoutStatementDescriptor;

  /**
   * The {@code product_description} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String productDescription;

  /**
   * The {@code statement_descriptor} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String statementDescriptor;

  /**
   * The {@code support_address} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  Address supportAddress;

  /**
   * The {@code support_email} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String supportEmail;

  /**
   * The {@code support_phone} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String supportPhone;

  /**
   * The {@code support_url} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  String supportUrl;

  /**
   * The {@code transfers_enabled} attribute.
   *
   * @deprecated Prefer using the {@link #payoutsEnabled} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2017-04-06">API version 2017-04-06</a>
   */
  @Deprecated
  Boolean transfersEnabled;

  /**
   * The {@code transfer_schedule} attribute.
   *
   * @deprecated Prefer using the {@link #payoutSchedule} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2017-04-06">API version 2017-04-06</a>
   */
  @Deprecated
  TransferSchedule transferSchedule;

  /**
   * The {@code verification} attribute.
   *
   * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
   */
  @Deprecated
  Verification verification;

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
  public Account delete() throws StripeException {
    return delete(null, (RequestOptions) null);
  }

  /**
   * Delete an account.
   */
  public Account delete(RequestOptions options) throws StripeException {
    return delete(null, options);
  }

  /**
   * Delete an account.
   */
  public Account delete(Map<String, Object> params) throws StripeException {
    return delete(params, null);
  }

  /**
   * Delete an account.
   */
  public Account delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Account.class, this.id), params,
        Account.class, options);
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

  // <editor-fold desc="persons">
  /**
   * List an account's persons.
   */
  public PersonCollection persons()
      throws StripeException {
    return persons(null, null);
  }

  /**
   * List an account's persons.
   */
  public PersonCollection persons(Map<String, Object> params)
      throws StripeException {
    return persons(params, null);
  }

  /**
   * List an account's persons.
   */
  public PersonCollection persons(Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = instanceUrl(Account.class, this.getId()) + "/persons";
    return requestCollection(url, params, PersonCollection.class, options);
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
    return retrieve(id, null, options);
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
  public static class BusinessProfile extends StripeObject {
    String mcc;
    String name;
    String productDescription;
    Address supportAddress;
    String supportEmail;
    String supportPhone;
    String supportUrl;
    String url;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Capabilities extends StripeObject {
    String cardPayments;
    String legacyPayments;
    String platformPayments;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Company extends StripeObject {
    Address address;
    Person.JapanAddress addressKana;
    Person.JapanAddress addressKanji;
    Boolean directorsProvided;
    String name;
    String nameKana;
    String nameKanji;
    Boolean ownersProvided;
    String phone;
    Boolean taxIdProvided;
    String taxIdRegistrar;
    Boolean vatIdProvided;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsBranding extends StripeObject {
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> icon;
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> logo;
    String primaryColor;

    // <editor-fold desc="icon">
    public String getIcon() {
      return (this.icon != null) ? this.icon.getId() : null;
    }

    public void setIcon(String iconId) {
      this.icon = setExpandableFieldId(iconId, this.icon);
    }

    public File getIconObject() {
      return (this.icon != null) ? this.icon.getExpanded() : null;
    }

    public void setIconObject(File c) {
      this.icon = new ExpandableField<>(c.getId(), c);
    }
    // </editor-fold>

    // <editor-fold desc="logo">
    public String getLogo() {
      return (this.logo != null) ? this.logo.getId() : null;
    }

    public void setLogo(String logoId) {
      this.logo = setExpandableFieldId(logoId, this.logo);
    }

    public File getLogoObject() {
      return (this.logo != null) ? this.logo.getExpanded() : null;
    }

    public void setLogoObject(File c) {
      this.logo = new ExpandableField<>(c.getId(), c);
    }
    // </editor-fold>
  }

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
  public static class PayoutSchedule extends StripeObject {
    Long delayDays;
    String interval;
    Long monthlyAnchor;
    String weeklyAnchor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    Long currentDeadline;
    List<String> currentlyDue;
    String disabledReason;
    List<String> eventuallyDue;
    List<String> pastDue;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsCardPayments extends StripeObject {
    DeclineChargeOn declineOn;
    String statementDescriptorPrefix;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsDashboard extends StripeObject {
    String displayName;
    String timezone;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsPayments extends StripeObject {
    String statementDescriptor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsPayouts extends StripeObject {
    Boolean debitNegativeBalances;
    PayoutSchedule schedule;
    String statementDescriptor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    SettingsBranding branding;
    SettingsCardPayments cardPayments;
    SettingsDashboard dashboard;
    SettingsPayments payments;
    SettingsPayouts payouts;
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
  @Deprecated
  public static class Keys extends StripeObject {
    String publishable;
    String secret;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  @Deprecated
  public static class TransferSchedule extends StripeObject {
    Long delayDays;
    String interval;
    Long monthlyAnchor;
    String weeklyAnchor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  @Deprecated
  public static class Verification extends StripeObject {
    Boolean contacted;
    String disabledReason;
    Long dueBy;
    List<String> fieldsNeeded;
  }
}
