package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class BalanceTransactionTest extends BaseStripeTest {
  public static final String RESOURCE_ID = "bt_123";

  @Test
  public void testRetrieve() throws StripeException {
    final BalanceTransaction balanceTransaction = BalanceTransaction.retrieve(RESOURCE_ID);

    assertNotNull(balanceTransaction);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/balance_transactions/%s", RESOURCE_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final BalanceTransactionCollection balanceTransactions = BalanceTransaction.list(params);

    assertNotNull(balanceTransactions);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/balance_transactions"), params);
  }
}
