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

/**
 * Recipients are deprecated. All tests have been removed; the Java APIs will
 * eventually be removed as well.
 */
public class RecipientTest extends BaseStripeFunctionalTest {
  @Test
  public void testRecipientList() throws StripeException {
    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("count", 1);
    List<Recipient> recipients = Recipient.all(listParams).getData();
    assertEquals(recipients.size(), 1);
  }
}
