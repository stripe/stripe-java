package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BitcoinTest extends BaseStripeFunctionalTest {
    @Test
    public void testBitcoinReceiverCreate() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        assertNotNull(receiver.getId());
    }

    @Test
    public void testBitcoinReceiverRetrieve() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        BitcoinReceiver retrievedReceiver = BitcoinReceiver.retrieve(receiver.getId());
        assertEquals(receiver.getId(), retrievedReceiver.getId());
        List<BitcoinTransaction> transactions = retrievedReceiver.getTransactions().getData();
        assertNotNull(transactions);
        assertEquals(1, transactions.size());
    }

    @Test
    public void testBitcoinReceiverList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<BitcoinReceiver> receivers = BitcoinReceiver.all(listParams).getData();
        assertEquals(receivers.size(), 1);
    }

    @Test
    public void testBitcoinReceiverUpdate() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "some new details");
        receiver = receiver.update(updateParams);
        assertEquals("some new details", receiver.getDescription());
    }

    @Test
    public void testBitcoinReceiverUpdateWithCustomer() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("source", receiver.getId());
        Customer customer = Customer.create(customerParams);
        receiver.setCustomer(customer.getId());

        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "some new details");
        receiver = receiver.update(updateParams);
        assertEquals("some new details", receiver.getDescription());
    }

    @Test
    public void testBitcoinReceiverDeleteWithCustomer() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("source", receiver.getId());
        Customer customer = Customer.create(customerParams);
        receiver.setCustomer(customer.getId());

        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("source", receiver.getId());
        chargeParams.put("currency", receiver.getCurrency());
        chargeParams.put("amount", receiver.getAmount());
        Charge charge = Charge.create(chargeParams);

        DeletedBitcoinReceiver deletedReceiver = receiver.delete();
        assertTrue(deletedReceiver.getDeleted());
    }

    @Test
    public void testBitcoinTransactionList() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<BitcoinTransaction> transactions = receiver.getTransactions().all(listParams).getData();
        assertEquals(transactions.size(), 1);
    }

    @Test
    public void testChargeCreationSourceAsBitcoinReceiver() throws StripeException {
        BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("source", receiver.getId());
        chargeParams.put("amount", 100);
        chargeParams.put("currency", "usd");
        Charge charge = Charge.create(chargeParams);
        assertEquals(receiver.getId(), charge.getSource().getId());
        assertTrue(charge.getSource() instanceof BitcoinReceiver);
    }
}
