package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionCollection;
import com.stripe.model.Charge;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class BalanceTransactionTest extends BaseStripeFunctionalTest {
    @Test
    public void testBalanceTransactionRetrieval() throws StripeException {
        Charge.create(defaultChargeParams);
        BalanceTransactionCollection balanceTransactions = BalanceTransaction.all(null);
        assertFalse(balanceTransactions.getData().isEmpty());
        BalanceTransaction first = balanceTransactions.getData().get(0);
        assertNotNull(first.getStatus());

        HashMap<String, Object> fetchParams = new HashMap<String, Object>();
        fetchParams.put("count", 2);
        assertEquals(BalanceTransaction.all(fetchParams).getData().size(), 2);

        BalanceTransaction retrieved = BalanceTransaction.retrieve(first.getId());
        assertEquals(retrieved.getId(), first.getId());
        assertEquals(retrieved.getSource(), first.getSource());
    }
}
