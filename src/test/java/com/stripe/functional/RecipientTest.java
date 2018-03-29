package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Card;
import com.stripe.model.DeletedCard;
import com.stripe.model.DeletedRecipient;
import com.stripe.model.Recipient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class RecipientTest extends BaseStripeFunctionalTest {
  // Recipient Tests:
  @Test
  public void testRecipientCreate() throws StripeException {
    Recipient recipient = Recipient.create(defaultRecipientParams);
    assertEquals(recipient.getActiveAccount().getLast4(), "6789");
    assertTrue(recipient instanceof Recipient);
  }

  @Test
  public void testRecipientRetrieve() throws StripeException {
    Recipient createdRecipient = Recipient.create(defaultRecipientParams);
    Recipient retrievedRecipient = Recipient.retrieve(createdRecipient.getId());
    assertEquals(createdRecipient.getCreated(), retrievedRecipient.getCreated());
    assertEquals(createdRecipient.getId(), retrievedRecipient.getId());
    assertEquals(createdRecipient.getActiveAccount().getValidated(),
        retrievedRecipient.getActiveAccount().getValidated());
  }

  @Test
  public void testRecipientList() throws StripeException {
    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("count", 1);
    List<Recipient> recipients = Recipient.all(listParams).getData();
    assertEquals(recipients.size(), 1);
  }

  @Test
  public void testRecipientUpdate() throws StripeException {
    Recipient createdRecipient = Recipient.create(defaultRecipientParams);
    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("description", "Updated Description");
    Recipient updatedRecipient = createdRecipient.update(updateParams);
    assertEquals(updatedRecipient.getDescription(), "Updated Description");
  }

  @Test
  public void testRecipientCardAddition() throws StripeException {
    Recipient createdRecipient = Recipient.create(defaultRecipientParams);
    final String originalDefaultCard = createdRecipient.getDefaultCard();

    Map<String, Object> creationParams = new HashMap<String, Object>();
    creationParams.put("card", "tok_visa_debit");
    final Card addedCard = createdRecipient.createCard(creationParams);

    createdRecipient.createCard("tok_visa_debit");

    Recipient updatedRecipient = Recipient.retrieve(createdRecipient.getId());
    assertEquals((Integer) 3, (Integer) updatedRecipient.getCards().getData().size());
    assertEquals(updatedRecipient.getDefaultCard(), originalDefaultCard);

    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("default_card", addedCard.getId());
    Recipient recipientAfterDefaultCardUpdate = updatedRecipient.update(updateParams);
    assertEquals((Integer) recipientAfterDefaultCardUpdate.getCards().getData().size(),
        (Integer) 3);
    assertEquals(recipientAfterDefaultCardUpdate.getDefaultCard(), addedCard.getId());

    assertEquals(recipientAfterDefaultCardUpdate.getCards().retrieve(originalDefaultCard).getId(),
        originalDefaultCard);
    assertEquals(recipientAfterDefaultCardUpdate.getCards().retrieve(addedCard.getId()).getId(),
        addedCard.getId());
  }

  @Test
  public void testRecipientCardUpdate() throws StripeException {
    Recipient recipient = Recipient.create(defaultRecipientParams);
    Card originalCard = recipient.getCards().getData().get(0);
    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("name", "J Bindings Debitholder, Jr.");
    Card updatedCard = originalCard.update(updateParams);
    assertEquals(updatedCard.getName(), "J Bindings Debitholder, Jr.");
  }

  @Test
  public void testRecipientCardDelete() throws StripeException {
    Recipient recipient = Recipient.create(defaultRecipientParams);
    Map<String, Object> creationParams = new HashMap<String, Object>();
    creationParams.put("card", "tok_visa_debit");
    recipient.createCard(creationParams);

    Card card = recipient.getCards().getData().get(0);
    DeletedCard deletedCard = card.delete();
    Recipient retrievedRecipient = Recipient.retrieve(recipient.getId());

    assertTrue(deletedCard.getDeleted());
    assertEquals(deletedCard.getId(), card.getId());
    for (Card retrievedCard : retrievedRecipient.getCards().getData()) {
      assertFalse("Card was not actually deleted: " + card.getId(),
          card.getId().equals(retrievedCard.getId()));
    }
  }

  @Test
  public void testRecipientDelete() throws StripeException {
    Recipient createdRecipient = Recipient.create(defaultRecipientParams);
    DeletedRecipient deletedRecipient = createdRecipient.delete();
    Recipient deletedRetrievedRecipient = Recipient.retrieve(createdRecipient.getId());
    assertTrue(deletedRecipient.getDeleted());
    assertEquals(deletedRecipient.getId(), createdRecipient.getId());
    assertTrue(deletedRetrievedRecipient.getDeleted());
  }

  @Test
  public void testRecipientMetadata() throws StripeException {
    testMetadata(Recipient.create(defaultRecipientParams));
  }
}
