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

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Customer extends APIResource implements MetadataStore<Customer>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long accountBalance;
  String businessVatId;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<ExternalAccount> defaultSource;
  Boolean deleted;
  Boolean delinquent;
  String description;
  Discount discount;
  String email;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  ShippingDetails shipping;
  ExternalAccountCollection sources;
  CustomerSubscriptionCollection subscriptions;

  /**
   * The {@code cards} attribute.
   *
   * @return the {@code cards} attribute
   * @deprecated Prefer using the {@link #sources} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  CustomerCardCollection cards;

  /**
   * The {@code default_card} attribute.
   *
   * @return the {@code default_card} attribute
   * @deprecated Prefer using the {@link #defaultSource} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  String defaultCard;

  /**
   * The {@code next_recurring_charge} attribute.
   *
   * @return the {@code next_recurring_charge} attribute
   * @deprecated Prefer using the {@link Invoice#upcoming} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2012-03-25">API version 2012-03-25</a>
   */
  @Deprecated
  NextRecurringCharge nextRecurringCharge;

  /**
   * The {@code subscription} attribute.
   *
   * @return the {@code subscription} attribute
   * @deprecated Prefer using the {@link #subscriptions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-01-31">API version 2014-01-31</a>
   */
  @Deprecated
  Subscription subscription;

  /**
   * The {@code trial_end} attribute.
   *
   * @return the {@code trial_end} attribute
   * @deprecated Prefer using the {@link #subscriptions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-01-31">API version 2014-01-31</a>
   */
  @Deprecated
  Long trialEnd;

  // <editor-fold desc="defaultSource">
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
  // </editor-fold>

  // <editor-fold desc="all">
  /**
   * List all customers.
   *
   * @deprecated Use the {@link #list(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static CustomerCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all customers.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static CustomerCollection all(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }

  /**
   * List all customers.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static CustomerCollection all(Map<String, Object> params,
                     String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="cancelSubscription">
  /**
   * Cancel the customer's subscription.
   *
   * @deprecated Use the {@link Subscription#cancel(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription cancelSubscription() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return cancelSubscription(null, (RequestOptions) null);
  }

  /**
   * Cancel the customer's subscription.
   *
   * @deprecated Use the {@link Subscription#cancel(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription cancelSubscription(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancelSubscription(null, options);
  }

  /**
   * Cancel the customer's subscription.
   *
   * @deprecated Use the {@link Subscription#cancel(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription cancelSubscription(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancelSubscription(RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Cancel the customer's subscription.
   *
   * @deprecated Use the {@link Subscription#cancel(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription cancelSubscription(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancelSubscription(params, (RequestOptions) null);
  }

  /**
   * Cancel the customer's subscription.
   *
   * @deprecated Use the {@link Subscription#cancel(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription cancelSubscription(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, String.format("%s/subscription",
        instanceURL(Customer.class, this.id)), params, Subscription.class, options);
  }

  /**
   * Cancel the customer's subscription.
   *
   * @deprecated Use the {@link Subscription#cancel(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription cancelSubscription(Map<String, Object> params,
                       String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return cancelSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a customer.
   */
  public static Customer create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a customer.
   */
  public static Customer create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Customer.class), params, Customer.class, options);
  }

  /**
   * Create a customer.
   *
   * @deprecated Use the {@link #create(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static Customer create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="createBankAccount">
  /**
   * Create a bank account.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public BankAccount createBankAccount(String token) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createBankAccount(token, null);
  }

  /**
   * Create a bank account.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public BankAccount createBankAccount(String token, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    Map<String, Object> postParams = new HashMap<String, Object>();
    postParams.put("bank_account", token);
    return createBankAccount(postParams, options);
  }

  /**
   * Create a bank account.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public BankAccount createBankAccount(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createBankAccount(params, null);
  }

  /**
   * Create a bank account.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public BankAccount createBankAccount(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/bank_accounts",
        instanceURL(Customer.class, this.id)), params, BankAccount.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="createCard">
  /**
   * Create a card.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(String token) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, (RequestOptions) null);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(String token, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    Map<String, Object> postParams = new HashMap<String, Object>();
    postParams.put("card", token);

    return createCard(postParams, options);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(String token, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, (RequestOptions) null);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException,InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.POST, String.format("%s/cards",
        instanceURL(Customer.class, this.id)), params, Card.class, options);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getSources()} and
   *     {@link ExternalAccountCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="createSubscription">
  /**
   * Create a subscription.
   *
   * @deprecated Use the {@link Subscription#create(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription createSubscription(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createSubscription(params, (RequestOptions) null);
  }

  /**
   * Create a subscription.
   *
   * @deprecated Use the {@link Subscription#create(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription createSubscription(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException,InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.POST, String.format("%s/subscriptions",
        instanceURL(Customer.class, this.id)), params, Subscription.class, options);
  }

  /**
   * Create a subscription.
   *
   * @deprecated Use the {@link Subscription#create(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription createSubscription(Map<String, Object> params, String apiKey)
      throws AuthenticationException,InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a customer.
   */
  public DeletedCustomer delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a customer.
   */
  public DeletedCustomer delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Customer.class, this.id), null,
        DeletedCustomer.class, options);
  }

  /**
   * Delete a customer.
   *
   * @deprecated Use the {@link #delete(RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public DeletedCustomer delete(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="deleteDiscount">
  /**
   * Delete a customer discount.
   */
  public void deleteDiscount() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    deleteDiscount((RequestOptions) null);
  }

  /**
   * Delete a customer discount.
   */
  public void deleteDiscount(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    request(RequestMethod.DELETE, String.format("%s/discount",
        instanceURL(Customer.class, this.id)), null, Discount.class, options);
  }

  /**
   * Delete a customer discount.
   *
   * @deprecated Use the {@link #deleteDiscount(RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public void deleteDiscount(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    deleteDiscount(RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all customers.
   */
  public static CustomerCollection list(Map<String, Object> params)
      throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, null);
  }

  /**
   * List all customers.
   */
  public static CustomerCollection list(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Customer.class), params, CustomerCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a customer.
   */
  public static Customer retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a customer.
   */
  public static Customer retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Customer.class, id), null, Customer.class,
        options);
  }

  /**
   * Retrieve a customer.
   *
   * @deprecated Use the {@link #retrieve(String, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static Customer retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Retrieve a customer.
   */
  public static Customer retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Customer.class, id), params, Customer.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a customer.
   */
  @Override
  public Customer update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a customer.
   */
  @Override
  public Customer update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Customer.class, this.id), params,
        Customer.class, options);
  }

  /**
   * Update a customer.
   *
   * @deprecated Use the {@link #update(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Customer update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="updateSubscription">
  /**
   * Update a subscription.
   *
   * @deprecated Use the {@link Subscription#update(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription updateSubscription(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return updateSubscription(params, (RequestOptions) null);
  }

  /**
   * Update a subscription.
   *
   * @deprecated Use the {@link Subscription#update(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription updateSubscription(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.POST, String.format("%s/subscription",
        instanceURL(Customer.class, this.id)), params, Subscription.class, options);
  }

  /**
   * Update a subscription.
   *
   * @deprecated Use the {@link Subscription#update(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Subscription updateSubscription(Map<String, Object> params,
                       String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return updateSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>
}
