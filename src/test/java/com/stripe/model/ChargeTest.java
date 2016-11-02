package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChargeTest extends BaseStripeTest {
	Charge basicCharge;
	Charge expandedCharge;

	@Before
	public void deserializeCharges() throws IOException {
		String json = resource("charge.json");
		basicCharge = APIResource.GSON.fromJson(json, Charge.class);
		String expandedJson = resource("charge_expansions.json");
		expandedCharge = APIResource.GSON.fromJson(expandedJson, Charge.class);
	}

	@Test
	public void testDeserialize() throws IOException {
		assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", basicCharge.getId());
		assertEquals(1477429167, (long) basicCharge.getCreated());
	}

	@Test
	public void testDeserializeWithExpansions() throws IOException {
		assertEquals("ch_198c152iMoKf4jyWWYvyqjTX", expandedCharge.getId());
		assertEquals(1477429167, (long) expandedCharge.getCreated());
	}

	@Test
	public void testDeserializeExpandApplication() throws IOException {
		Application application = expandedCharge.getApplicationObject();
		assertEquals(expandedCharge.getApplication(), "ca_4UNPzRJlp7joZhEYfqkhc02MYvNFHJEX");
		assertEquals(application.getId(), "ca_4UNPzRJlp7joZhEYfqkhc02MYvNFHJEX");
		assertEquals(application.getName(), "My Application");
		//Setters:
		expandedCharge.setApplication("newidhere");
		assertEquals(expandedCharge.getApplication(), "newidhere");
		Application newApplication = new Application();
		expandedCharge.setApplicationObject(newApplication);
		assertEquals(expandedCharge.getApplicationObject(), newApplication);
	}

	@Test
	public void testDeserializeExpandApplicationFee() throws IOException {
		ApplicationFee appFee = expandedCharge.getApplicationFeeObject();
		assertEquals(expandedCharge.getApplicationFee(), "fee_9RV1Zcr87rvr68");
		assertEquals(appFee.getId(), "fee_9RV1Zcr87rvr68");
		assertEquals((long) appFee.getAmount(), 111);
		//Setters:
		expandedCharge.setApplicationFee("newidhere");
		assertEquals(expandedCharge.getApplicationFee(), "newidhere");
		ApplicationFee newAppFee = new ApplicationFee();
		expandedCharge.setApplicationFeeObject(newAppFee);
		assertEquals(expandedCharge.getApplicationFeeObject(), newAppFee);
	}

	@Test
	public void testDeserializeExpandBalanceTransaction() throws IOException {
		BalanceTransaction bt = expandedCharge.getBalanceTransactionObject();
		assertEquals(expandedCharge.getBalanceTransaction(), "txn_18tjj22eZvKYlo2CeFxM3FxI");
		assertEquals(bt.getId(), "txn_18tjj22eZvKYlo2CeFxM3FxI");
		assertEquals((long) bt.getAmount(), 316);
		//Setters:
		expandedCharge.setBalanceTransaction("newidhere");
		assertEquals(expandedCharge.getBalanceTransaction(), "newidhere");
		BalanceTransaction newBT = new BalanceTransaction();
		expandedCharge.setBalanceTransactionObject(newBT);
		assertEquals(expandedCharge.getBalanceTransactionObject(), newBT);
	}

	@Test
	public void testDeserializeExpandCustomer() throws IOException {
		Customer customer = expandedCharge.getCustomerObject();
		assertEquals(expandedCharge.getCustomer(), "cus_7K0ztY0WclKUdF");
		assertEquals(customer.getId(), "cus_7K0ztY0WclKUdF");
		assertEquals((long) customer.getCreated(), 1447103608);
		//Setters:
		expandedCharge.setCustomer("newidhere");
		assertEquals(expandedCharge.getCustomer(), "newidhere");
		Customer newCustomer = new Customer();
		expandedCharge.setCustomerObject(newCustomer);
		assertEquals(expandedCharge.getCustomerObject(), newCustomer);
	}

	@Test
	public void testDeserializeExpandDestination() throws IOException {
		Account destination = expandedCharge.getDestinationObject();
		assertEquals(expandedCharge.getDestination(), "acct_102wRO2iMoKf4jyz");
		assertEquals(destination.getId(), "acct_102wRO2iMoKf4jyz");
		assertEquals(destination.getBusinessName(), "RiskyBusiness");
		assertTrue(destination.getManaged());
		//Setters:
		expandedCharge.setDestination("newidhere");
		assertEquals(expandedCharge.getDestination(), "newidhere");
		Account newDestination = new Account();
		expandedCharge.setDestinationObject(newDestination);
		assertEquals(expandedCharge.getDestinationObject(), newDestination);
	}

	@Test
	public void testDeserializeExpandInvoice() throws IOException {
		Invoice invoice = expandedCharge.getInvoiceObject();
		assertEquals(expandedCharge.getInvoice(), "in_199Llh2eZvKYlo2CMA8qc7Ng");
		assertEquals(invoice.getId(), "in_199Llh2eZvKYlo2CMA8qc7Ng");
		assertEquals((long) invoice.getAmountDue(), 999);
		//Setters:
		expandedCharge.setInvoice("newidhere");
		assertEquals(expandedCharge.getInvoice(), "newidhere");
		Invoice newInvoice = new Invoice();
		expandedCharge.setInvoiceObject(newInvoice);
		assertEquals(expandedCharge.getInvoiceObject(), newInvoice);
	}

	@Test
	public void testDeserializeExpandOrder() throws IOException {
		Order order = expandedCharge.getOrderObject();
		assertEquals(expandedCharge.getOrder(), "or_199IRC2eZvKYlo2CPfFd4CB6");
		assertEquals(order.getId(), "or_199IRC2eZvKYlo2CPfFd4CB6");
		assertEquals((long) order.getAmount(), 1500);
		//Setters:
		expandedCharge.setOrder("newidhere");
		assertEquals(expandedCharge.getOrder(), "newidhere");
		Order newOrder = new Order();
		expandedCharge.setOrderObject(newOrder);
		assertEquals(expandedCharge.getOrderObject(), newOrder);
	}

	@Test
	public void testDeserializeExpandSourceTransfer() throws IOException {
		Transfer sourceTransfer = expandedCharge.getSourceTransferObject();
		assertEquals(expandedCharge.getSourceTransfer(), "tr_199IPs2eZvKYlo2C9hMneg1R");
		assertEquals(sourceTransfer.getId(), "tr_199IPs2eZvKYlo2C9hMneg1R");
		assertEquals((long) sourceTransfer.getAmount(), 400);
		//Setters:
		expandedCharge.setSourceTransfer("newidhere");
		assertEquals(expandedCharge.getSourceTransfer(), "newidhere");
		Transfer newST = new Transfer();
		expandedCharge.setSourceTransferObject(newST);
		assertEquals(expandedCharge.getSourceTransferObject(), newST);
	}

	@Test
	public void testDeserializeExpandTransfer() throws IOException {
		Transfer transfer = expandedCharge.getTransferObject();
		assertEquals(expandedCharge.getTransfer(), "tr_199IPs2eZvKYlo2C9hMneg1R");
		assertEquals(transfer.getId(), "tr_199IPs2eZvKYlo2C9hMneg1R");
		assertEquals((long) transfer.getAmount(), 400);
		//Setters:
		expandedCharge.setTransfer("newidhere");
		assertEquals(expandedCharge.getTransfer(), "newidhere");
		Transfer newTransfer = new Transfer();
		expandedCharge.setTransferObject(newTransfer);
		assertEquals(expandedCharge.getTransferObject(), newTransfer);
	}

	@Test
	public void testDeserializeReview() throws IOException {
		Review review = expandedCharge.getReviewObject();
		assertEquals(expandedCharge.getReview(), "prv_197BDeCKM4Inl33zU8jDaYKE");
		assertEquals(review.getId(), "prv_197BDeCKM4Inl33zU8jDaYKE");
		assertEquals((long) review.getCreated(), 1477087830);
		//Setters:
		expandedCharge.setReview("newidhere");
		assertEquals(expandedCharge.getReview(), "newidhere");
		Review newReview = new Review();
		expandedCharge.setReviewObject(newReview);
		assertEquals(expandedCharge.getReviewObject(), newReview);
	}
}
