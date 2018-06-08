package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.model.Card;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.model.DeletedCustomer;
import com.stripe.model.Subscription;
import com.stripe.net.APIResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class CustomerTest extends BaseStripeTest {
  public static final String CUSTOMER_ID = "cus_123";

  private Customer getCustomerFixture() throws StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    resetNetworkSpy();
    return customer;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();

    final Customer customer = Customer.create(params);

    assertNotNull(customer);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    assertNotNull(customer);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/customers/%s", CUSTOMER_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Customer customer = getCustomerFixture();

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Customer updatedCustomer = customer.update(params);

    assertNotNull(updatedCustomer);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s", customer.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final CustomerCollection customers = Customer.list(params);

    assertNotNull(customers);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/customers"),
        params
    );
  }

  @Test
  public void testDelete() throws StripeException {
    final Customer customer = getCustomerFixture();

    final DeletedCustomer deletedCustomer = customer.delete();

    assertNotNull(deletedCustomer);
    verifyRequest(
        APIResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s", customer.getId())
    );
  }

  @Test
  public void testCreateCard() throws IOException, StripeException {
    final Customer customer = getCustomerFixture();

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("source", "tok_123");

    // stripe-mock returns a BankAccount instance instead of a Card so we stub the request
    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s/cards", customer.getId()),
        params,
        Card.class,
        getResourceAsString("/api_fixtures/card.json")
    );

    final Card card = customer.createCard(params);

    assertNotNull(card);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s/cards", customer.getId()),
        params
    );
  }

  @Test
  @SuppressWarnings("deprecation")
  public void testCreateBankAccount() throws IOException, StripeException {
    final Customer customer = getCustomerFixture();

    Map<String, Object> params = new HashMap<String, Object>();
    params.put("source", "btok_123");

    BankAccount bankAccount = customer.createBankAccount(params);

    assertNotNull(bankAccount);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s/bank_accounts", customer.getId()),
        params
    );
  }

  @Test
  public void testCreateSubscription() throws StripeException {
    final Customer customer = getCustomerFixture();

    final Map<String, Object> item = new HashMap<String, Object>();
    item.put("plan", "silver-plan_123-898");
    final List<Object> items = new LinkedList<Object>();
    items.add(item);
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("items", items);

    final Subscription subscription = customer.createSubscription(params);

    assertNotNull(subscription);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s/subscriptions", customer.getId()),
        params
    );
  }

  @Test
  public void testUpdateSubscription() throws IOException, StripeException {
    final Customer customer = getCustomerFixture();

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("plan", "plan_1");

    // stripe-mock does not support /v1/customers/%s/subscription endpoint, so we stub the request
    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s/subscription", customer.getId()),
        params,
        Subscription.class,
        getResourceAsString("/api_fixtures/subscription.json")
    );

    Subscription subscription = customer.updateSubscription(params);

    assertNotNull(subscription);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/customers/%s/subscription", customer.getId()),
        params
    );
  }

  @Test
  public void testCancelSubscription() throws IOException, StripeException {
    final Customer customer = getCustomerFixture();

    // stripe-mock does not support /v1/customers/%s/subscription endpoint, so we stub the request
    stubRequest(
        APIResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/subscription", customer.getId()),
        null,
        Subscription.class,
        getResourceAsString("/api_fixtures/subscription.json")
    );

    Subscription subscription = customer.cancelSubscription();

    assertNotNull(subscription);
    verifyRequest(
        APIResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/subscription", customer.getId())
    );
  }

  @Test
  public void testDeleteDiscount() throws IOException, StripeException {
    final Customer customer = getCustomerFixture();

    // stripe-mock does not support /v1/customers/%s/discount endpoint, so we stub the request
    stubRequest(
        APIResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/discount", customer.getId()),
        null,
        void.class,
        null
    );

    customer.deleteDiscount();

    verifyRequest(
        APIResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/discount", customer.getId())
    );
  }
}
