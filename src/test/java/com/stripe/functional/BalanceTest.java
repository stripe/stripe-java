package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalanceTest extends BaseStripeFunctionalTest {
    @Test
    public void testBalanceRetrieve() throws StripeException {
        Balance retrievedBalance = Balance.retrieve();
        assertEquals(false, retrievedBalance.getLivemode());
        assertEquals(1, retrievedBalance.getPending().size());
        assertEquals(1, retrievedBalance.getAvailable().size());
    }
}
