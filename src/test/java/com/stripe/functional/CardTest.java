package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Card;
import com.stripe.model.Customer;
import com.stripe.model.PaymentSource;
import com.stripe.model.PaymentSourceCollection;
import com.stripe.net.ApiResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class CardTest extends BaseStripeTest {
  public static final String CUSTOMER_ID = "cus_123";
  public static final String CARD_ID = "card_123";

  private Card getCardFixture(Customer customer) throws IOException {
    // stripe-mock doesn't handle cards very well just yet, so use a local fixture
    final Card card =
        ApiResource.GSON.fromJson(getResourceAsString("/api_fixtures/card.json"), Card.class);
    card.setCustomer(customer.getId());

    return card;
  }

  @Test
  public void testCreate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final Map<String, Object> params = new HashMap<>();
    params.put("source", "btok_123");

    // stripe-mock returns a BankAccount instance instead of a Card
    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        Card.class,
        getResourceAsString("/api_fixtures/card.json"));

    final Card card = (Card) customer.getSources().create(params);

    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params);
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
        getResourceAsString("/api_fixtures/card.json"));

    final Card card = (Card) customer.getSources().retrieve(CARD_ID);

    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), CARD_ID));
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final Card card = getCardFixture(customer);

    final Map<String, Object> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Card updatedCard = card.update(params);

    assertNotNull(updatedCard);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), card.getId()),
        params);
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final Map<String, Object> params = new HashMap<>();
    params.put("object", "card");
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final Card stubbedCard = getCardFixture(customer);
    final PaymentSourceCollection stubbedCollection = new PaymentSourceCollection();
    final List<PaymentSource> stubbedData = new ArrayList<PaymentSource>();
    stubbedData.add(stubbedCard);
    stubbedCollection.setData(stubbedData);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        PaymentSourceCollection.class,
        stubbedCollection.toJson());

    final PaymentSourceCollection sources = customer.getSources().list(params);

    assertNotNull(sources);
    assertEquals(1, sources.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/customers/%s/sources", customer.getId()));

    final Card card = (Card) sources.getData().get(0);
    assertNotNull(card);
  }

  @Test
  public void testDelete() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final Card card = getCardFixture(customer);
    final String deleteCardData =
        String.format("{\"id\": \"%s\", \"object\": \"card\", \"deleted\": true}", card.getId());

    stubRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), card.getId()),
        null,
        Card.class,
        deleteCardData);
    final Card deletedCard = card.delete();

    assertNotNull(deletedCard);
    assertTrue(deletedCard.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), card.getId()));
  }
}
