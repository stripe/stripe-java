package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Card;
import com.stripe.model.Customer;
import com.stripe.model.DeletedCard;
import com.stripe.model.ExternalAccount;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CardTest extends BaseStripeTest {
  public static final String CUSTOMER_ID = "cus_123";
  public static final String CARD_ID = "card_123";

  private Card getCardFixture(Customer customer) throws IOException, StripeException {
    // stripe-mock doesn't handle cards very well just yet, so use a local fixture
    final Card card = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/card.json"), Card.class);
    card.setCustomer(customer.getId());

    return card;
  }

  @Test
  public void testCreate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("source", "btok_123");

    // stripe-mock returns a BankAccount instance instead of a Card
    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        Card.class,
        getResourceAsString("/api_fixtures/card.json")
    );

    final Card card = (Card) customer.getSources().create(params);

    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params
    );
  }

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    // stripe-mock returns a BankAccount instance instead of a Card
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), CARD_ID),
        null,
        Card.class,
        getResourceAsString("/api_fixtures/card.json")
    );

    final Card card = (Card) customer.getSources().retrieve(CARD_ID);

    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), CARD_ID)
    );
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final Card card = getCardFixture(customer);

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Card updatedCard = card.update(params);

    assertNotNull(updatedCard);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), card.getId()),
        params
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("object", "card");
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final Card stubbedCard = getCardFixture(customer);
    final ExternalAccountCollection stubbedCollection = new ExternalAccountCollection();
    final List<ExternalAccount> stubbedData = new ArrayList<ExternalAccount>();
    stubbedData.add(stubbedCard);
    stubbedCollection.setData(stubbedData);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        ExternalAccountCollection.class,
        stubbedCollection.toJson()
    );

    final ExternalAccountCollection externalAccounts = customer.getSources().list(params);

    assertNotNull(externalAccounts);
    assertEquals(1, externalAccounts.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", customer.getId())
    );

    final Card card = (Card) externalAccounts.getData().get(0);
    assertNotNull(card);
  }

  @Test
  public void testDelete() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final Card card = getCardFixture(customer);

    final DeletedCard deletedCard = card.delete();

    assertNotNull(deletedCard);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), card.getId())
    );
  }
}
