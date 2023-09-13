package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ExternalAccountDeserializationTest extends BaseStripeTest {
  @Test
  public void testDeserializeBankAccount() throws Exception {
    final String data = getResourceAsString("/api_fixtures/bank_account.json");
    final ExternalAccount externalAccount = ApiResource.GSON.fromJson(data, ExternalAccount.class);
    assertNotNull(externalAccount);
    assertTrue(externalAccount instanceof BankAccount, "External account should be a bank account");
    BankAccount bankAccount = (BankAccount) externalAccount;
    assertEquals(bankAccount.getObject(), "bank_account");
  }

  @Test
  public void testDeserializeCard() throws Exception {
    final String data = getResourceAsString("/api_fixtures/card.json");
    final ExternalAccount externalAccount = ApiResource.GSON.fromJson(data, ExternalAccount.class);
    assertNotNull(externalAccount);
    assertTrue(externalAccount instanceof Card, "External account should be a card");
    Card card = (Card) externalAccount;
    assertEquals(card.getObject(), "card");
  }

  @Test
  public void testUnknownSubTypeThrowingUnsupportedOperation() throws StripeException {
    final ExternalAccount externalAccount =
        ApiResource.GSON.fromJson(
            "    {\n"
                + "      \"id\": \"bar_123\",\n"
                + "      \"object\": \"unknown_bar\"\n"
                + "    }",
            ExternalAccount.class);
    assertNotNull(externalAccount);
    assertTrue(
        externalAccount instanceof ExternalAccountTypeAdapterFactory.UnknownSubType,
        "External account should be an unknown subtype");

    Throwable exception =
        assertThrows(
            UnsupportedOperationException.class,
            () -> {
              externalAccount.delete();
            });
    assertEquals(
        "Unknown subtype of ExternalAccount with id: bar_123, object: unknown_bar, does not "
            + "implement method: delete. Please contact support@stripe.com for assistance.",
        exception.getMessage());
  }

  @Test
  public void testDeserializeCollection() throws Exception {
    final String data = getResourceAsString("/api_fixtures/external_account_collection.json");
    final ExternalAccountCollection externalAccountCollection =
        ApiResource.GSON.fromJson(data, ExternalAccountCollection.class);

    assertNotNull(externalAccountCollection);
    final List<ExternalAccount> externalAccounts = externalAccountCollection.getData();
    assertNotNull(externalAccounts);

    for (ExternalAccount externalAccount : externalAccounts) {
      String eaId = externalAccount.getId();

      if ("card_123".equals(eaId)) {
        Card card = (Card) externalAccount;
        assertEquals("card", card.getObject());
      } else if ("ba_123".equals(eaId)) {
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
