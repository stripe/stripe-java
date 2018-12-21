package com.stripe.model;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExternalAccountDeserializationTest extends BaseStripeTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testDeserializeBankAccount() throws Exception {
    final String data = getResourceAsString("/api_fixtures/bank_account.json");
    final ExternalAccount externalAccount = ApiResource.GSON.fromJson(data, ExternalAccount.class);
    assertNotNull(externalAccount);
    assertTrue("External account should be a bank account",
        externalAccount instanceof BankAccount);
    BankAccount bankAccount = (BankAccount) externalAccount;
    assertEquals(bankAccount.getObject(), "bank_account");
  }

  @Test
  public void testDeserializeCard() throws Exception {
    final String data = getResourceAsString("/api_fixtures/card.json");
    final ExternalAccount externalAccount = ApiResource.GSON.fromJson(data, ExternalAccount.class);
    assertNotNull(externalAccount);
    assertTrue("External account should be a card", externalAccount instanceof Card);
    Card card = (Card) externalAccount;
    assertEquals(card.getObject(), "card");
  }

  @Test
  public void testUnknownSubTypeThrowingUnsupportedOperation() throws StripeException {
    final ExternalAccount externalAccount = ApiResource.GSON.fromJson(
        "    {\n"
            + "      \"id\": \"bar_123\",\n"
            + "      \"object\": \"unknown_bar\"\n"
            + "    }",
        ExternalAccount.class
    );
    assertNotNull(externalAccount);
    assertTrue("External account should be an unknown subtype",
        externalAccount instanceof ExternalAccountTypeAdapterFactory.UnknownSubType);
    thrown.expectMessage(
        "Unknown subtype of ExternalAccount with id: bar_123, object: unknown_bar, does not "
            + "implement method: delete. Please contact support@stripe.com for assistance.");
    thrown.expect(UnsupportedOperationException.class);
    externalAccount.delete();
  }

  @Test
  public void testDeserializeCollection() throws Exception {
    final String data = getResourceAsString(
        "/api_fixtures/external_account_collection.json");
    final ExternalAccountCollection externalAccountCollection =
        ApiResource.GSON.fromJson(data, ExternalAccountCollection.class);

    assertNotNull(externalAccountCollection);
    final List<ExternalAccount> externalAccounts = externalAccountCollection.getData();
    assertNotNull(externalAccounts);

    for (ExternalAccount externalAccount : externalAccounts) {
      String btId = externalAccount.getId();

      if (btId.equals("card_123")) {
        Card card = (Card) externalAccount;
        assertEquals("card", card.getObject());
      } else if (btId.equals("ba_123")) {
        BankAccount bankAccount = (BankAccount) externalAccount;
        assertEquals("bank_account", bankAccount.getObject());
      } else {
        ExternalAccountTypeAdapterFactory.UnknownSubType unknownSubType =
            (ExternalAccountTypeAdapterFactory.UnknownSubType) externalAccount;
        assertEquals("unknown_bar", unknownSubType.getObject());
        assertEquals("bar_123", unknownSubType.getId());
      }
    }
  }
}

