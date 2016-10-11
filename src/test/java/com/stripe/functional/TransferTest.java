package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Transfer;
import com.stripe.model.TransferTransactionCollection;
import com.stripe.net.RequestOptions;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TransferTest extends BaseStripeFunctionalTest {
    static Map<String, Object> getDefaultAccountParams() {
        Map<String, Object> defaultAccountParams = new HashMap<String, Object>();
        // TODO: make defaultAccountParams the default for a given currency?
        HashMap<String, Object> externalAccount = new HashMap<String, Object>();
        externalAccount.putAll(defaultBankAccountParams);
        externalAccount.put("object", "bank_account");

        defaultAccountParams.put("external_account", externalAccount);
        defaultAccountParams.put("email", getUniqueEmail());
        return defaultAccountParams;
    }

    static Map<String, Object> getTransferParams() throws StripeException {
        Map<String, Object> params = new HashMap<String, Object>();
        Account destination = Account.create(getDefaultAccountParams());
        params.put("amount", 100);
        params.put("currency", "usd");
        params.put("destination", destination.getId());
        return params;
    }

    @Test
    public void testTransferCreate() throws StripeException {
        Transfer createdTransfer = Transfer.create(getTransferParams());
        assertEquals("paid", createdTransfer.getStatus());
    }

    @Test
    public void testTransferCancel() throws StripeException {
        Transfer created = Transfer.create(getTransferParams());
        try {
            // we expect an InvalidRequestException here (caught by JUnit),
            // because in test mode, transfers are automatically sent.
            created.cancel(RequestOptions.getDefault());
            Assert.fail();
        } catch (InvalidRequestException ire) {
            // do nothing
        }

    }

    @Test
    public void testTransferRetrieve() throws StripeException {
        Transfer createdTransfer = Transfer.create(getTransferParams());
        Transfer retrievedTransfer = Transfer.retrieve(createdTransfer.getId());
        assertEquals(createdTransfer.getDate(), retrievedTransfer.getDate());
        assertEquals(createdTransfer.getId(), retrievedTransfer.getId());
    }

    @Test
    public void testTransferDestinationLoadedCorrectly() throws StripeException {
        Map<String, Object> transferParams = getTransferParams();
        Transfer created = Transfer.create(transferParams);
        assertEquals(transferParams.get("destination"), created.getDestination());
    }

    @Test
    public void testTransferList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Transfer> transfers = Transfer.all(listParams).getData();
        assertEquals(transfers.size(), 1);
    }

    @Test
    public void testTransferTransactions() throws StripeException {
        Map<String, Object> transferParams = getTransferParams();
        Transfer transfer = Transfer.create(transferParams);
        HashMap<String, Object> params = new HashMap<String, Object>();
        TransferTransactionCollection transactions = transfer.transactions(params, supportedRequestOptions);
        // Test that requestOptions and requestParams are the same in returned transactions:
        assertEquals(supportedRequestOptions, transactions.getRequestOptions());
        assertEquals(params, transactions.getRequestParams());
    }

    @Test
    public void testTransferMetadata() throws StripeException {
        testMetadata(Transfer.create(getTransferParams()));
    }
}
