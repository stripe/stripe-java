package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

public class Customer extends APIResource implements MetadataStore<Customer>, HasId {
  String id;
  String object;
  Long accountBalance;
  String businessVatId;
  Long created;
  String currency;
  ExpandableField<ExternalAccount> defaultSource;
  Boolean deleted;
  Boolean delinquent;
  String description;
  Discount discount;
  String email;
  Boolean livemode;
  Map<String, String> metadata;
  ShippingDetails shipping;
  ExternalAccountCollection sources;
  CustomerSubscriptionCollection subscriptions;

  @Deprecated
  CustomerCardCollection cards;
  @Deprecated
  String defaultCard;
  @Deprecated
  NextRecurringCharge nextRecurringCharge;
  @Deprecated
  Subscription subscription;
  @Deprecated
  Long trialEnd;

  @Override
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(Long accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getBusinessVatId() {
    return businessVatId;
  }

  public void setBusinessVatId(String businessVatId) {
    this.businessVatId = businessVatId;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getDefaultSource() {
    return (this.defaultSource != null) ? this.defaultSource.getId() : null;
  }

  public void setDefaultSource(String defaultSourceID) {
    this.defaultSource = setExpandableFieldID(defaultSourceID, this.defaultSource);
  }

  public ExternalAccount getDefaultSourceObject() {
    return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
  }

  public void setDefaultSourceObject(ExternalAccount c) {
    this.defaultSource = new ExpandableField<ExternalAccount>(c.getId(), c);
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public Boolean getDelinquent() {
    return delinquent;
  }

  public void setDelinquent(Boolean delinquent) {
    this.delinquent = delinquent;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  @Override
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public ShippingDetails getShipping() {
    return shipping;
  }

  public void setShipping(ShippingDetails shipping) {
    this.shipping = shipping;
  }

  public ExternalAccountCollection getSources() {
    return sources;
  }

  public void setSources(ExternalAccountCollection sources) {
    this.sources = sources;
  }

  public CustomerSubscriptionCollection getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(CustomerSubscriptionCollection subscriptions) {
    this.subscriptions = subscriptions;
  }

  /**
   * Returns the {@code cards} attribute.
   *
   * @return the {@code cards} attribute
   * @deprecated Prefer using the {@code sources} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  public CustomerCardCollection getCards() {
    return cards;
  }

  /**
   * Returns the {@code default_card} attribute.
   *
   * @return the {@code default_card} attribute
   * @deprecated Prefer using the {@code default_source} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  public String getDefaultCard() {
    return defaultCard;
  }

  @Deprecated
  public void setDefaultCard(String defaultCard) {
    this.defaultCard = defaultCard;
  }

  /**
   * Returns the {@code next_recurring_charge} attribute.
   *
   * @return the {@code next_recurring_charge} attribute
   * @deprecated Prefer using the {@link Invoice#upcoming} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2012-03-25">API version 2012-03-25</a>
   */
  @Deprecated
  public NextRecurringCharge getNextRecurringCharge() {
    return nextRecurringCharge;
  }

  @Deprecated
  public void setNextRecurringCharge(NextRecurringCharge nextRecurringCharge) {
    this.nextRecurringCharge = nextRecurringCharge;
  }

  /**
   * Returns the {@code subscription} attribute.
   *
   * @return the {@code subscription} attribute
   * @deprecated Prefer using the {@code subscriptions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-01-31">API version 2014-01-31</a>
   */
  @Deprecated
  public Subscription getSubscription() {
    return subscription;
  }

  @Deprecated
  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  /**
   * Returns the {@code trial_end} attribute.
   *
   * @return the {@code trial_end} attribute
   * @deprecated Prefer using the {@code subscriptions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-01-31">API version 2014-01-31</a>
   */
  @Deprecated
  public Long getTrialEnd() {
    return trialEnd;
  }

  @Deprecated
  public void setTrialEnd(Long trialEnd) {
    this.trialEnd = trialEnd;
  }

  public static Customer create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static Customer create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Customer create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Customer.class), params, Customer.class, options);
  }

  public static Customer retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static Customer retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Customer retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Customer.class, id), null, Customer.class,
        options);
  }

  public static Customer retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Customer.class, id), params, Customer.class,
        options);
  }

  @Override
  public Customer update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Customer update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Override
  public Customer update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Customer.class, this.id), params,
        Customer.class, options);
  }

  public DeletedCustomer delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  @Deprecated
  public DeletedCustomer delete(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public DeletedCustomer delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Customer.class, this.id), null,
        DeletedCustomer.class, options);
  }

  @Deprecated
  public Card createCard(String token, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Card createCard(String token) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, (RequestOptions) null);
  }

  public Card createCard(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, (RequestOptions) null);
  }

  /**
   * Adds a card to the customer using a card token.
   *
   * @param token card token ({@code "tok_..."})
   * @param options request options
   * @return the new card object
   * @deprecated Prefer using the {@code customer.getSources().create(params)} method instead.
   */
  @Deprecated
  public Card createCard(String token, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    Map<String, Object> postParams = new HashMap<String, Object>();
    postParams.put("card", token);

    return createCard(postParams, options);
  }

  @Deprecated
  public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public Card createCard(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException,InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.POST, String.format("%s/cards",
        instanceURL(Customer.class, this.id)), params, Card.class, options);
  }

  @Deprecated
  public BankAccount createBankAccount(String token) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createBankAccount(token, null);
  }

  /**
   * Adds a bank account to the customer using a bank account token.
   *
   * @param token bank account token ({@code "btok_..."})
   * @param options request options
   * @return the new bank account object
   * @deprecated Prefer using the {@code customer.getSources().create(params)} method instead.
   */
  @Deprecated
  public BankAccount createBankAccount(String token, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    Map<String, Object> postParams = new HashMap<String, Object>();
    postParams.put("bank_account", token);
    return createBankAccount(postParams, options);
  }

  @Deprecated
  public BankAccount createBankAccount(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createBankAccount(params, null);
  }

  @Deprecated
  public BankAccount createBankAccount(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/bank_accounts",
        instanceURL(Customer.class, this.id)), params, BankAccount.class, options);
  }

  public Subscription createSubscription(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createSubscription(params, (RequestOptions) null);
  }

  @Deprecated
  public Subscription createSubscription(Map<String, Object> params, String apiKey)
      throws AuthenticationException,InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Subscription createSubscription(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException,InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.POST, String.format("%s/subscriptions",
        instanceURL(Customer.class, this.id)), params, Subscription.class, options);
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  public Subscription updateSubscription(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return updateSubscription(params, (RequestOptions) null);
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  @Deprecated
  public Subscription updateSubscription(Map<String, Object> params,
                       String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return updateSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  public Subscription updateSubscription(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.POST, String.format("%s/subscription",
        instanceURL(Customer.class, this.id)), params, Subscription.class, options);
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  public Subscription cancelSubscription() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return cancelSubscription(null, (RequestOptions) null);
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  public Subscription cancelSubscription(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancelSubscription(params, (RequestOptions) null);
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  @Deprecated
  public Subscription cancelSubscription(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancelSubscription(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Subscription cancelSubscription(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancelSubscription(null, options);
  }

  /**
   * 1/2014: Legacy (from before multiple subscriptions per customer).
   */
  @Deprecated
  public Subscription cancelSubscription(Map<String, Object> params,
                       String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return cancelSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Subscription cancelSubscription(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, String.format("%s/subscription",
        instanceURL(Customer.class, this.id)), params, Subscription.class, options);
  }

  public void deleteDiscount() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    deleteDiscount((RequestOptions) null);
  }

  @Deprecated
  public void deleteDiscount(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    deleteDiscount(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public void deleteDiscount(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    request(RequestMethod.DELETE, String.format("%s/discount",
        instanceURL(Customer.class, this.id)), null, Discount.class, options);
  }

  public static CustomerCollection list(Map<String, Object> params)
      throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, null);
  }

  public static CustomerCollection list(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Customer.class), params, CustomerCollection.class, options);
  }

  @Deprecated
  public static CustomerCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static CustomerCollection all(Map<String, Object> params,
                     String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static CustomerCollection all(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }
}
