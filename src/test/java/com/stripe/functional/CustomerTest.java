package com.stripe.functional;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest extends BaseStripeFunctionalTest {

    static Customer createDefaultCustomerWithDefaultBitcoinReceiver()
            throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        Map<String, Object> createParams = new HashMap<String, Object>();
        createParams.put("source", receiver.getId());
        customer.getSources().create(createParams);
        return customer;
    }

    @Test
    public void testCustomerCreate() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);
        assertEquals(customer.getDescription(), "J Bindings Customer");
        List<Card> customerCards = customer.getCards().getData();
        assertEquals(1, customerCards.size());
        assertEquals("4242", customerCards.get(0).getLast4());
    }

    @Test
    public void testCustomerCreateWithShippingDetails() throws StripeException {
        ShippingDetails shippingDetails = new ShippingDetails();
        shippingDetails.setName("name");
        shippingDetails.setPhone("123-456-7890");
        Address address = new Address()
                .setCity("Washington")
                .setCountry("USA")
                .setLine1("1600 Pennsylvania Ave.")
                .setLine2("line 2 address")
                .setPostalCode("20500")
                .setState("D.C.");
        shippingDetails.setAddress(address);

        Map<String, Object> params = ImmutableMap.<String, Object>builder()
                .putAll(defaultCustomerParams)
                .put("shipping", ImmutableMap.builder().put("address", ImmutableMap.builder().put("line1", address.getLine1()).put("line2", address.getLine2()).put("city", address.getCity()).put("country", address.getCountry()).put("postal_code", address.getPostalCode()).put("state", address.getState()).build()).put("name", shippingDetails.getName()).put("phone", shippingDetails.getPhone()).build())
                .build();

        Customer customer = Customer.create(params);
        assertEquals(customer.getShipping(), shippingDetails);
    }

    @Test
    public void testCustomerRetrieve() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams);
        Customer retrievedCustomer = Customer.retrieve(createdCustomer.getId());
        assertEquals(createdCustomer.getCreated(),
                retrievedCustomer.getCreated());
        assertEquals(createdCustomer.getId(), retrievedCustomer.getId());
    }

    @Test
    public void testCustomerList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Customer> Customers = Customer.all(listParams).getData();
        assertEquals(Customers.size(), 1);
    }

    @Test
    public void testCustomerUpdate() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "Updated Description");
        Customer updatedCustomer = createdCustomer.update(updateParams);
        assertEquals(updatedCustomer.getDescription(), "Updated Description");
    }

    @Test(expected=InvalidRequestException.class)
    public void testCustomerUpdateToBlank() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "");
        createdCustomer.update(updateParams);
    }

    @Test
    public void testCustomerUpdateToNull() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", null);
        Customer updatedCustomer = createdCustomer.update(updateParams);
        assertEquals(updatedCustomer.getDescription(), null);
    }

    @Test
    public void testCustomerSourceList() throws StripeException {
        Customer customer = createDefaultCustomerWithDefaultBitcoinReceiver();

        HashMap<String, Object> listParams = new HashMap<String, Object>();
        List<ExternalAccount> customerSourceList = customer.getSources().all(listParams).getData();

        assertEquals(2, customerSourceList.size());
        assert(customerSourceList.get(0) instanceof Card);
        assertEquals("4242", ((Card) customerSourceList.get(0)).getLast4());
        assert(customerSourceList.get(1) instanceof BitcoinReceiver);
        assertEquals(true, ((BitcoinReceiver) customerSourceList.get(1)).getFilled());
    }

    @Test
    public void testCustomerSourceRetrieveCard() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        ExternalAccountCollection customerSources = customer.getSources();
        String paymentSourceId = customerSources.getData().get(0).getId();
        ExternalAccount paymentSource = customerSources.retrieve(paymentSourceId);
        assertNotNull(paymentSource);
        assertEquals(paymentSourceId, paymentSource.getId());
    }

    @Test
    public void testCustomerSourceRetrieveBitcoinReceiver() throws StripeException {
        Customer customer = Customer.create(new HashMap<String, Object>());
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        ExternalAccountCollection customerSources = customer.getSources();
        Map<String, Object> createParams = new HashMap<String, Object>();
        createParams.put("source", receiver.getId());
        customerSources.create(createParams);
        customerSources = customerSources.all(new HashMap<String, Object>());
        String paymentSourceId = customerSources.getData().get(0).getId();
        ExternalAccount paymentSource = customerSources.retrieve(paymentSourceId);
        assertNotNull(paymentSource);
        assertEquals(paymentSourceId, paymentSource.getId());
        assertTrue(paymentSource instanceof BitcoinReceiver);
        assertTrue(((BitcoinReceiver) paymentSource).getFilled());
    }

    @Test
    public void testCustomerCreateWithSource() throws StripeException {
        HashMap<String, Object> customerCreationParams = new HashMap<String, Object>();
        customerCreationParams.put("source", defaultSourceParams);
        Customer customer = Customer.create(customerCreationParams);
        assertNotNull(customer);
        assertNotNull(customer.getId());
        assertNotNull(customer.getSources());
        assert(customer.getSources().getData().get(0) instanceof Card);
        assertNotNull(customer.getDefaultSource());
        ExternalAccount card = customer.getSources().retrieve(customer.getDefaultSource());
        assertEquals(card.getId(), customer.getDefaultSource());
    }

    @Test
    public void testCustomerCreateSourceWithCardHash() throws StripeException {
        Customer customer = Customer.create(new HashMap<String, Object>());
        ExternalAccountCollection customerSources = customer.getSources();
        HashMap<String, Object> createParams = new HashMap<String, Object>();
        createParams.put("source", defaultSourceParams);
        ExternalAccount paymentSource = customerSources.create(createParams);
        assertNotNull(paymentSource);
        assertNotNull(paymentSource.getId());
        assert(paymentSource instanceof Card);
    }

    @Test
    public void testCustomerCreateSourceWithBitcoinReceiverToken() throws StripeException {
        Customer customer = Customer.create(new HashMap<String, Object>());
        ExternalAccountCollection customerSources = customer.getSources();
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        HashMap<String, Object> createParams = new HashMap<String, Object>();
        createParams.put("source", receiver.getId());
        ExternalAccount paymentSource = customerSources.create(createParams);
        assertNotNull(paymentSource);
        assertNotNull(paymentSource.getId());
        assert(paymentSource instanceof BitcoinReceiver);
    }

    @Test
    public void testCustomerSourceUpdate() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        ExternalAccountCollection customerSources = customer.getSources();
        ExternalAccount paymentSource = customerSources.getData().get(0);
        assert(paymentSource instanceof Card);
        Card card = (Card) paymentSource;

        HashMap<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("address_line1", "some address details");
        Card updatedCard = card.update(updateParams);
        assertEquals("some address details", updatedCard.getAddressLine1());
    }

    @Test
    public void testCustomerSourceDelete() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        ExternalAccountCollection customerSources = customer.getSources();
        ExternalAccount paymentSource = customerSources.getData().get(0);
        paymentSource.delete();
        HashMap<String, Object> listParams = new HashMap<String, Object>();
        assertEquals(0, customerSources.all(listParams).getData().size());
    }

    @Test
    public void testCustomerCardAddition() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams, supportedRequestOptions);
        String originalDefaultCard = createdCustomer.getDefaultCard();

        Map<String, Object> creationParams = new HashMap<String, Object>();
        creationParams.put("card", defaultCardParams);
        Card addedCard = createdCustomer.createCard(creationParams);

        Token token = Token.create(defaultTokenParams);
        createdCustomer.createCard(token.getId());

        Customer updatedCustomer = Customer.retrieve(createdCustomer.getId(), supportedRequestOptions);
        assertEquals((Integer) updatedCustomer.getCards().getData().size(), (Integer) 3);
        assertEquals(updatedCustomer.getDefaultCard(), originalDefaultCard);

        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("default_card", addedCard.getId());
        Customer customerAfterDefaultCardUpdate = updatedCustomer.update(updateParams, supportedRequestOptions);
        assertEquals((Integer) customerAfterDefaultCardUpdate.getCards().getData().size(), (Integer) 3);
        assertEquals(customerAfterDefaultCardUpdate.getDefaultCard(), addedCard.getId());

        assertEquals(customerAfterDefaultCardUpdate.getCards().retrieve(originalDefaultCard).getId(), originalDefaultCard);
        assertEquals(customerAfterDefaultCardUpdate.getCards().retrieve(addedCard.getId()).getId(), addedCard.getId());
    }

    @Test
    public void testCreateCardThroughCollection() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams, supportedRequestOptions);

        Map<String, Object> creationParams = new HashMap<String, Object>();
        creationParams.put("card", defaultCardParams);
        Card addedCard = createdCustomer.getCards().create(creationParams);

        assertEquals(createdCustomer.getId(), addedCard.getCustomer());

        Customer updatedCustomer = Customer.retrieve(createdCustomer.getId(), supportedRequestOptions);
        assertEquals((Integer) updatedCustomer.getCards().getData().size(), (Integer) 2);
    }


    @Test
    public void testCustomerCardUpdate() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);
        Card originalCard = customer.getCards().getData().get(0);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("name", "J Bindings Cardholder, Jr.");
        Card updatedCard = originalCard.update(updateParams);
        assertEquals(updatedCard.getName(), "J Bindings Cardholder, Jr.");
    }

    @Test
    public void testCustomerCardDelete() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);
        Map<String, Object> creationParams = new HashMap<String, Object>();
        creationParams.put("card", defaultCardParams);
        customer.createCard(creationParams);

        Card card = customer.getCards().getData().get(0);
        DeletedCard deletedCard = card.delete();
        Customer retrievedCustomer = Customer.retrieve(customer.getId(), supportedRequestOptions);

        assertTrue(deletedCard.getDeleted());
        assertEquals(deletedCard.getId(), card.getId());
        for(Card retrievedCard : retrievedCustomer.getCards().getData()) {
            assertFalse("Card was not actually deleted: " + card.getId(), card.getId().equals(retrievedCard.getId()));
        }
    }

    @Test
    public void testCustomerBankAccountAddition() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams, supportedRequestOptions);
        String originalDefaultCard = createdCustomer.getDefaultCard();

        Map<String, Object> creationParams = new HashMap<String, Object>();
        creationParams.put("bank_account", defaultBankAccountParams);
        BankAccount addedBankAccount = createdCustomer.createBankAccount(creationParams);

        Token token = Token.create(defaultTokenParams);
        createdCustomer.createCard(token.getId());

        Customer updatedCustomer = Customer.retrieve(createdCustomer.getId(), supportedRequestOptions);
        assertEquals((Integer) updatedCustomer.getSources().getData().size(), (Integer) 3);
        assertEquals(updatedCustomer.getDefaultCard(), originalDefaultCard);

        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("default_source", addedBankAccount.getId());
        Customer customerAfterDefaultSourceUpdate = updatedCustomer.update(updateParams, supportedRequestOptions);
        assertEquals((Integer) customerAfterDefaultSourceUpdate.getSources().getData().size(), (Integer) 3);
        assertEquals(customerAfterDefaultSourceUpdate.getDefaultSource(), addedBankAccount.getId());
    }

    @Test
    public void testCustomerBankAccountDelete() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);

        Map<String, Object> creationParams = new HashMap<String, Object>();
        creationParams.put("bank_account", defaultBankAccountParams);
        BankAccount addedBankAccount = customer.createBankAccount(creationParams);

        DeletedBankAccount deletedBankAccount = addedBankAccount.delete();
        Customer retrievedCustomer = Customer.retrieve(customer.getId(), supportedRequestOptions);

        assertTrue(deletedBankAccount.getDeleted());
        assertEquals(deletedBankAccount.getId(), addedBankAccount.getId());
        for(ExternalAccount retrievedSource : retrievedCustomer.getSources().getData()) {
            assertFalse("Card was not actually deleted: " + addedBankAccount.getId(),
                    addedBankAccount.getId().equals(retrievedSource.getId()));
        }
    }

    @Test
    public void testCustomerDelete() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams);
        DeletedCustomer deletedCustomer = createdCustomer.delete();
        Customer deletedRetrievedCustomer = Customer.retrieve(createdCustomer
                .getId());
        assertTrue(deletedCustomer.getDeleted());
        assertEquals(deletedCustomer.getId(), createdCustomer.getId());
        assertTrue(deletedRetrievedCustomer.getDeleted());
    }

    @Test
    public void testCustomerCreatePerCallAPIKey() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams,
                supportedRequestOptions);
        assertEquals(customer.getDescription(), "J Bindings Customer");
        List<Card> customerCards = customer.getCards().getData();
        assertEquals(1, customerCards.size());
        assertEquals("4242", customerCards.get(0).getLast4());
    }

    @Test
    public void testCustomerCreateWithPlanPerCallAPIKey()
            throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
        Customer customer = createDefaultCustomerWithPlan(plan);
        assertEquals(customer.getSubscriptions().getData().get(0).getPlan().getId(), plan.getId());
    }

    @Test
    public void testCustomerRetrievePerCallAPIKey() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        Customer retrievedCustomer = Customer.retrieve(createdCustomer.getId());
        assertEquals(createdCustomer.getCreated(),
                retrievedCustomer.getCreated());
        assertEquals(createdCustomer.getId(), retrievedCustomer.getId());
    }

    @Test
    public void testCustomerListPerCallAPIKey() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Customer> Customers = Customer.all(listParams, Stripe.apiKey)
                .getData();
        assertEquals(Customers.size(), 1);
    }

    @Test
    public void testCustomerUpdatePerCallAPIKey() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "Updated Description");
        Customer updatedCustomer = createdCustomer.update(updateParams,
                Stripe.apiKey);
        assertEquals(updatedCustomer.getDescription(), "Updated Description");
    }

    @Test
    public void testCustomerDeletePerCallAPIKey() throws StripeException {
        Customer createdCustomer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        DeletedCustomer deletedCustomer = createdCustomer.delete(Stripe.apiKey);
        Customer deletedRetrievedCustomer = Customer.retrieve(
                createdCustomer.getId(), Stripe.apiKey);
        assertTrue(deletedCustomer.getDeleted());
        assertEquals(deletedCustomer.getId(), createdCustomer.getId());
        assertTrue(deletedRetrievedCustomer.getDeleted());
    }

    @Test
    public void testCustomerMetadata() throws StripeException {
        testMetadata(Customer.create(defaultCustomerParams));
    }
}
