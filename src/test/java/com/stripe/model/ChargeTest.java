package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChargeTest extends BaseStripeTest {
    @Test
    public void testDeserialize() throws StripeException, IOException {
        String json = resource("charge.json");
        Charge charge = APIResource.GSON.fromJson(json, Charge.class);
        assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", charge.getId());
        assertEquals(1477429167, (long) charge.getCreated());
    }

    @Test
    public void testDeserializeExpanded() throws StripeException, IOException {
        String json = resource("charge_expansions.json");
        Charge charge = APIResource.GSON.fromJson(json, Charge.class);
        assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", charge.getId());
        assertEquals(1477429167, (long) charge.getCreated());
        //AppFee
        ApplicationFee appFee = charge.getApplicationFeeObject();
        assertEquals(charge.getApplicationFee(), "fee_9RV1Zcr87rvr68");
        assertEquals(appFee.getId(), "fee_9RV1Zcr87rvr68");
        assertEquals((long) appFee.getAmount(), 111);
        //BalanceTransaction
        BalanceTransaction bt = charge.getBalanceTransactionObject();
        assertEquals(charge.getBalanceTransaction(), "txn_18tjj22eZvKYlo2CeFxM3FxI");
        assertEquals(bt.getId(), "txn_18tjj22eZvKYlo2CeFxM3FxI");
        assertEquals((long) bt.getAmount(), 316);
        //Customer
        Customer customer = charge.getCustomerObject();
        assertEquals(charge.getCustomer(), "cus_7K0ztY0WclKUdF");
        assertEquals(customer.getId(), "cus_7K0ztY0WclKUdF");
        assertEquals((long) customer.getCreated(), 1447103608);
        //Destination
        Account destination = charge.getDestinationObject();
        assertEquals(charge.getDestination(), "acct_102wRO2iMoKf4jyz");
        assertEquals(destination.getId(), "acct_102wRO2iMoKf4jyz");
        assertEquals(destination.getBusinessName(), "RiskyBusiness");
        assertTrue(destination.getManaged());
        //Invoice
        Invoice invoice = charge.getInvoiceObject();
        assertEquals(charge.getInvoice(), "in_199Llh2eZvKYlo2CMA8qc7Ng");
        assertEquals(invoice.getId(), "in_199Llh2eZvKYlo2CMA8qc7Ng");
        assertEquals((long) invoice.getAmountDue(), 999);
        //Order
        Order order = charge.getOrderObject();
        assertEquals(charge.getOrder(), "or_199IRC2eZvKYlo2CPfFd4CB6");
        assertEquals(order.getId(), "or_199IRC2eZvKYlo2CPfFd4CB6");
        assertEquals((long) order.getAmount(), 1500);
        //SourceTransfer
        Transfer sourceTransfer = charge.getSourceTransferObject();
        assertEquals(charge.getSourceTransfer(), "tr_199IPs2eZvKYlo2C9hMneg1R");
        assertEquals(sourceTransfer.getId(), "tr_199IPs2eZvKYlo2C9hMneg1R");
        assertEquals((long) sourceTransfer.getAmount(), 400);
        //Transfer
        Transfer transfer = charge.getTransferObject();
        assertEquals(charge.getTransfer(), "tr_199IPs2eZvKYlo2C9hMneg1R");
        assertEquals(transfer.getId(), "tr_199IPs2eZvKYlo2C9hMneg1R");
        assertEquals((long) transfer.getAmount(), 400);
    }
}
