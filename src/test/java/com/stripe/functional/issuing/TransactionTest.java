package com.stripe.functional.issuing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Transaction;
import com.stripe.model.issuing.TransactionCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class TransactionTest extends BaseStripeTest {
  public static final String TRANSACTION_ID = "ipi_123";

  @Test
  public void testRetrieve() throws StripeException {
    final Transaction transaction = Transaction.retrieve(TRANSACTION_ID);

    assertNotNull(transaction);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/transactions/%s", TRANSACTION_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Transaction transaction = Transaction.retrieve(TRANSACTION_ID);

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Transaction updatedTransaction = transaction.update(params);

    assertNotNull(updatedTransaction);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/transactions/%s", transaction.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    TransactionCollection transactions = Transaction.list(params);

    assertNotNull(transactions);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/issuing/transactions"), params);
  }
}
