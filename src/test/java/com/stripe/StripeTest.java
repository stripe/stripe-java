package com.stripe;

import com.google.common.collect.ImmutableMap;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.AccountCollection;
import com.stripe.model.Address;
import com.stripe.model.AlipayAccount;
import com.stripe.model.ApplicationFee;
import com.stripe.model.Balance;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionCollection;
import com.stripe.model.BankAccount;
import com.stripe.model.BitcoinReceiver;
import com.stripe.model.BitcoinTransaction;
import com.stripe.model.Card;
import com.stripe.model.Charge;
import com.stripe.model.ChargeRefundCollection;
import com.stripe.model.CountrySpec;
import com.stripe.model.CountrySpecCollection;
import com.stripe.model.Coupon;
import com.stripe.model.Customer;
import com.stripe.model.CustomerSubscriptionCollection;
import com.stripe.model.SubscriptionCollection;
import com.stripe.model.DeletedBankAccount;
import com.stripe.model.DeletedBitcoinReceiver;
import com.stripe.model.DeletedCard;
import com.stripe.model.DeletedCoupon;
import com.stripe.model.DeletedCustomer;
import com.stripe.model.DeletedInvoiceItem;
import com.stripe.model.DeletedPlan;
import com.stripe.model.DeletedProduct;
import com.stripe.model.DeletedRecipient;
import com.stripe.model.DeletedSKU;
import com.stripe.model.Dispute;
import com.stripe.model.Event;
import com.stripe.model.EvidenceDetails;
import com.stripe.model.EvidenceSubObject;
import com.stripe.model.ExternalAccount;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.model.FileUpload;
import com.stripe.model.FraudDetails;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceItem;
import com.stripe.model.InvoiceLineItemCollection;
import com.stripe.model.MetadataStore;
import com.stripe.model.Order;
import com.stripe.model.OrderReturn;
import com.stripe.model.OrderItem;
import com.stripe.model.Plan;
import com.stripe.model.Product;
import com.stripe.model.Recipient;
import com.stripe.model.Refund;
import com.stripe.model.SKU;
import com.stripe.model.ShippingDetails;
import com.stripe.model.Subscription;
import com.stripe.model.Token;
import com.stripe.model.Transfer;
import com.stripe.model.VerificationFields;

import com.stripe.net.RequestOptions;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import java.net.URISyntaxException;
import java.net.URL;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StripeTest {
	static Map<String, Object> defaultCardParams = new HashMap<String, Object>();
	static Map<String, Object> defaultSourceParams = new HashMap<String, Object>();
	static Map<String, Object> defaultDebitCardParams = new HashMap<String, Object>();
	static Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
	static Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
	static Map<String, Object> defaultPlanParams = new HashMap<String, Object>();
	static Map<String, Object> defaultCouponParams = new HashMap<String, Object>();
	static Map<String, Object> defaultTokenParams = new HashMap<String, Object>();
	static Map<String, Object> defaultDebitTokenParams = new HashMap<String, Object>();
	static Map<String, Object> defaultBankAccountParams = new HashMap<String, Object>();
	static Map<String, Object> defaultRecipientParams = new HashMap<String, Object>();
	static Map<String, Object> defaultBitcoinReceiverParams = new HashMap<String, Object>();
	static Map<String, Object> defaultAlipayTokenParams = new HashMap<String, Object>();
	static Map<String, Object> defaultManagedAccountParams = new HashMap<String, Object>();
	static RequestOptions supportedRequestOptions;

	static String getYear() {
		Date date = new Date(); //Get current date
  		Calendar calendar = new GregorianCalendar();
  		calendar.setTime(date);
   		return calendar.get(Calendar.YEAR) + 1 +"";
	}


	static String getUniqueEmail() {
		return String.format("test+bindings-%s@stripe.com", UUID.randomUUID().toString().substring(24));
	}

	static String getUniquePlanId() {
		return String.format("MY-J-PLAN-%s", UUID.randomUUID().toString().substring(24));
	}

	static String getUniqueCouponId() {
		return String.format("MY-J-COUPON-%s", UUID.randomUUID().toString().substring(24));
	}

	static Map<String, Object> getUniquePlanParams() {
		Map<String, Object> uniqueParams = new HashMap<String, Object>();
		uniqueParams.putAll(defaultPlanParams);
		uniqueParams.put("id", getUniquePlanId());
		return uniqueParams;
	}

	static Map<String, Object> getUniqueCouponParams() {
		Map<String, Object> uniqueParams = new HashMap<String, Object>();
		uniqueParams.putAll(defaultCouponParams);
		uniqueParams.put("id", getUniqueCouponId());
		return uniqueParams;
	}

	static Map<String, Object> getInvoiceItemParams() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
			Customer customer = Customer.create(defaultCustomerParams);
		params.put("amount", 100);
		params.put("currency", "usd");
		params.put("customer", customer.getId());
		return params;
	}

	static Map<String, Object> getTransferParams() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
		Account destination = Account.create(getDefaultAccountParams());
		params.put("amount", 100);
		params.put("currency", "usd");
		params.put("destination", destination.getId());
		return params;
	}

	static InvoiceItem createDefaultInvoiceItem(Customer customer)
			throws StripeException {
		Map<String, Object> invoiceItemParams = new HashMap<String, Object>();
		invoiceItemParams.put("amount", 100);
		invoiceItemParams.put("currency", "usd");
		invoiceItemParams.put("customer", customer.getId());
		return InvoiceItem.create(invoiceItemParams);
	}

	static Customer createDefaultCustomerWithPlan(Plan plan)
			throws StripeException {
		Map<String, Object> customerWithPlanParams = new HashMap<String, Object>();
		customerWithPlanParams.putAll(defaultCustomerParams);
		customerWithPlanParams.put("plan", plan.getId());
		return Customer.create(customerWithPlanParams);
	}

	static Recipient createDefaultRecipient()
			throws StripeException {
		Map<String, Object> recipientParams = new HashMap<String, Object>();
		recipientParams.putAll(defaultRecipientParams);
		return Recipient.create(recipientParams);
	}

	static Customer createDefaultCustomerWithDefaultBitcoinReceiver()
			throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
		Map<String, Object> createParams = new HashMap<String, Object>();
		createParams.put("source", receiver.getId());
		customer.getSources().create(createParams);
		return customer;
	}

	static Map<String, Object> getSubscriptionParams() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Map<String, Object> subscriptionParams = new HashMap<String, Object>();
		subscriptionParams.put("plan", plan.getId());
		return subscriptionParams;
	}

	@Before
	public void before() {
		Stripe.apiVersion = null;
	}

	@BeforeClass
	public static void setUp() {
		Stripe.apiKey = "tGN0bIwXnHdwOa85VABjPdSn8nWY7G7I"; // stripe public
									// test key

		supportedRequestOptions = RequestOptions.builder().setStripeVersion("2015-02-16").build();

		defaultCardParams.put("number", "4242424242424242");
		defaultCardParams.put("exp_month", 12);
		defaultCardParams.put("exp_year", getYear());
		defaultCardParams.put("cvc", "123");
		defaultCardParams.put("name", "J Bindings Cardholder");
		defaultCardParams.put("address_line1", "140 2nd Street");
		defaultCardParams.put("address_line2", "4th Floor");
		defaultCardParams.put("address_city", "San Francisco");
		defaultCardParams.put("address_zip", "94105");
		defaultCardParams.put("address_state", "CA");
		defaultCardParams.put("address_country", "USA");

		defaultSourceParams = new HashMap<String, Object>(defaultCardParams);
		defaultSourceParams.put("object", "card");

		defaultDebitCardParams.put("number", "4000056655665556");
		defaultDebitCardParams.put("exp_month", 12);
		defaultDebitCardParams.put("exp_year", getYear());
		defaultDebitCardParams.put("cvc", "123");
		defaultDebitCardParams.put("name", "J Bindings Debitholder");
		defaultDebitCardParams.put("address_line1", "140 2nd Street");
		defaultDebitCardParams.put("address_line2", "4th Floor");
		defaultDebitCardParams.put("address_city", "San Francisco");
		defaultDebitCardParams.put("address_zip", "94105");
		defaultDebitCardParams.put("address_state", "CA");
		defaultDebitCardParams.put("address_country", "USA");

		defaultChargeParams.put("amount", 100);
		defaultChargeParams.put("currency", "usd");
		defaultChargeParams.put("card", defaultCardParams);

		defaultTokenParams.put("card", defaultCardParams);
		defaultDebitTokenParams.put("card", defaultDebitCardParams);

		defaultCustomerParams.put("card", defaultCardParams);
		defaultCustomerParams.put("description", "J Bindings Customer");

		defaultPlanParams.put("amount", 100);
		defaultPlanParams.put("currency", "usd");
		defaultPlanParams.put("interval", "month");
		defaultPlanParams.put("interval_count", 2);
		defaultPlanParams.put("name", "J Bindings Plan");

		defaultCouponParams.put("duration", "once");
		defaultCouponParams.put("percent_off", 10);

		defaultBankAccountParams.put("country", "US");
		defaultBankAccountParams.put("routing_number", "110000000");
		defaultBankAccountParams.put("account_number", "000123456789");
		defaultBankAccountParams.put("account_holder_name", "Test Holder");
		defaultBankAccountParams.put("account_holder_type", "individual");

		defaultRecipientParams.put("name", "J Test");
		defaultRecipientParams.put("type", "individual");
		defaultRecipientParams.put("tax_id", "000000000");
		defaultRecipientParams.put("bank_account", defaultBankAccountParams);
		defaultRecipientParams.put("card", defaultDebitCardParams);

		defaultBitcoinReceiverParams.put("amount", 100);
		defaultBitcoinReceiverParams.put("currency", "usd");
		defaultBitcoinReceiverParams.put("description", "some details");
		defaultBitcoinReceiverParams.put("email", "do+fill_now@stripe.com");

		Map<String, Object> alipayParams = new HashMap<String, Object>();
		alipayParams.put("reusable", true);
		alipayParams.put("alipay_username", "stripe+alipay");
		defaultAlipayTokenParams.put("alipay_account", alipayParams);
		defaultAlipayTokenParams.put("email", "alipay+account@stripe.com");

		defaultManagedAccountParams.put("managed", true);
		defaultManagedAccountParams.put("country", "US");
		defaultManagedAccountParams.put("default_currency", "usd");
	}

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

	@Test
	public void testAPIBase() throws StripeException {
		assertEquals("https://api.stripe.com", Stripe.getApiBase());
	}

	@Test
	public void testAccountRetrieve() throws StripeException {
		Account retrievedAccount = Account.retrieve();
		assertTrue(Pattern.matches("\\A.*@stripe.com\\z", retrievedAccount.getEmail()));
	}

	@Test
	public void testBalanceRetrieve() throws StripeException {
		Balance retrievedBalance = Balance.retrieve();
		assertEquals(false, retrievedBalance.getLivemode());
		assertEquals(1, retrievedBalance.getPending().size());
		assertEquals(1, retrievedBalance.getAvailable().size());
	}

	@Test
	public void testChargeCreate() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		assertFalse(createdCharge.getRefunded());
	}

	@Test
	public void testChargeCreateWithStatementDescriptor() throws StripeException {
		Map<String, Object> chargeWithStatementDescriptorParams = new HashMap<String, Object>();
		chargeWithStatementDescriptorParams.putAll(defaultChargeParams);
		chargeWithStatementDescriptorParams.put("description", "hahaha1234");
		chargeWithStatementDescriptorParams.put("statement_descriptor", "Stripe");

		Charge createdCharge = Charge.create(chargeWithStatementDescriptorParams);
		assertEquals("Stripe", createdCharge.getStatementDescriptor());
	}

	@Test
	public void testChargeCreateWithShippingDetails() throws StripeException {
		ShippingDetails shippingDetails = new ShippingDetails();
		shippingDetails.setName("name");
		shippingDetails.setPhone("123-456-7890");
		Address address = new Address()
				.setCity("Washington")
				.setCountry("USA")
				.setLine1("1600 Pennsylvania Ave.")
				.setLine2("line 2 address")
				.setPostalCode("20500")
				.setState("D.C.");
		shippingDetails.setAddress(address);

		Map<String, Object> params = ImmutableMap.<String, Object>builder()
				.putAll(defaultChargeParams)
				.put("shipping", ImmutableMap.builder().put("address", ImmutableMap.builder().put("line1", address.getLine1()).put("line2", address.getLine2()).put("city", address.getCity()).put("country", address.getCountry()).put("postal_code", address.getPostalCode()).put("state", address.getState()).build()).put("name", shippingDetails.getName()).put("phone", shippingDetails.getPhone()).build())
				.build();
		Charge createdCharge = Charge.create(params);
		assertEquals(createdCharge.getShipping(), shippingDetails);
	}

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

	@Test
	public void testChargeRetrieve() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge retrievedCharge = Charge.retrieve(createdCharge.getId());
		assertEquals(createdCharge.getCreated(), retrievedCharge.getCreated());
		assertEquals(createdCharge.getId(), retrievedCharge.getId());
		assertNotNull(retrievedCharge.getSource());
		assertEquals("card", retrievedCharge.getSource().getObject());
		Card card = (Card) retrievedCharge.getSource();
		assertEquals(defaultCardParams.get("address_city"), card.getAddressCity());
	}

	@Test
	public void testChargeRetrieveNullId() throws StripeException {
		try {
			Charge.retrieve(null);
			assertTrue(false);
		}
		catch (InvalidRequestException e) {
			String requestId = e.getRequestId();
			assertFalse(requestId == null);
			assertFalse(requestId.equals(""));
			assertTrue(e.toString().contains(requestId));
			assertTrue(404 == e.getStatusCode());
		}
	}

	@Test
	public void testChargeRefund() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge refundedCharge = createdCharge.refund();
		assertTrue(refundedCharge.getRefunded());
		ChargeRefundCollection refunds = refundedCharge.getRefunds();
		assertTrue(refunds.getData() instanceof List);
		assertEquals(1, refunds.getData().size());
		assertTrue(refunds.getData().get(0) instanceof Refund);
	}

	@Test
	public void testChargeRefundUpdateApiKey() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		ChargeRefundCollection refunds = createdCharge.refund().getRefunds();
		Refund refund = refunds.getData().get(0);

		Map<String, String> metadata = new HashMap<String, String>();
		metadata.put("foo", "bar");

		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("metadata", metadata);
		refund = refund.update(updateParams, Stripe.apiKey);

		assertEquals("bar", refund.getMetadata().get("foo"));
	}

	@Test
	public void testChargeRefundCreate() throws StripeException {
		Charge ch = Charge.create(defaultChargeParams);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("amount", 10);
		ChargeRefundCollection refunds = ch.getRefunds();
		Refund created = refunds.create(params);
		Refund retrieved = ch.getRefunds().retrieve(created.getId());
		assertEquals(created.getId(), retrieved.getId());
	}

	@Test
	public void testChargeRefundCreateApiKey() throws StripeException {
		Charge ch = Charge.create(defaultChargeParams);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("amount", 10);
		Refund created = ch.getRefunds().create(params, Stripe.apiKey);
		Refund retrieved = ch.getRefunds().retrieve(created.getId(), Stripe.apiKey);
		assertEquals(created.getId(), retrieved.getId());
	}

	@Test
	public void testChargeRefundListAndRetrieve()
			throws StripeException {
		Charge ch = Charge.create(defaultChargeParams);
		ch = ch.refund();
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Refund created = ch.getRefunds().all(listParams).getData().get(0);
		Refund retrieved = ch.getRefunds().retrieve(created.getId());
		assertEquals(created.getId(), retrieved.getId());
	}


	@Test
	public void testChargeRefundListAndRetrievePerCallAPIKey()
			throws StripeException {
		Charge ch = Charge.create(defaultChargeParams);
		ch = ch.refund();
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Refund created = ch.getRefunds().all(listParams,
				Stripe.apiKey).getData().get(0);
		Refund retrieved = ch.getRefunds().retrieve(created.getId(), Stripe.apiKey);
		assertEquals(created.getId(), retrieved.getId());
	}


	@Test
	public void testChargeCapture() throws StripeException {
		Map<String, Object> options = new HashMap<String, Object>(defaultChargeParams);
		options.put("capture", false);

		Charge created = Charge.create(options);
		assertFalse(created.getCaptured());

		Charge captured = created.capture();
		assertTrue(captured.getCaptured());
	}

	@Test
	public void testChargePartialRefund() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Map<String, Object> refundParams = new HashMap<String, Object>();
		final Integer REFUND_AMOUNT = 50;
		refundParams.put("amount", REFUND_AMOUNT);
		Charge refundedCharge = createdCharge.refund(refundParams);
		assertFalse(refundedCharge.getRefunded());
		assertEquals(refundedCharge.getAmountRefunded(), REFUND_AMOUNT);
	}

	@Test
	public void testChargeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Charge> charges = Charge.all(listParams).getData();
		assertEquals(charges.size(), 1);
	}

	@Test(expected = CardException.class)
	public void testInvalidCard() throws StripeException {
		Map<String, Object> invalidChargeParams = new HashMap<String, Object>();
		invalidChargeParams.putAll(defaultChargeParams);
		Map<String, Object> invalidCardParams = new HashMap<String, Object>();
		invalidCardParams.put("number", "4242424242424241");
		invalidCardParams.put("exp_month", 12);
		invalidCardParams.put("exp_year", getYear());
		invalidChargeParams.put("card", invalidCardParams);
		Charge.create(invalidChargeParams);
	}

	@Test
	public void testDeclinedCard() throws StripeException {
		Map<String, Object> declinedChargeParams = new HashMap<String, Object>();
		declinedChargeParams.putAll(defaultChargeParams);
		Map<String, Object> declinedCardParams = new HashMap<String, Object>();
		declinedCardParams.put("number", "4000000000000002");
		declinedCardParams.put("exp_month", 12);
		declinedCardParams.put("exp_year", getYear());
		declinedChargeParams.put("card", declinedCardParams);

		try {
			Charge.create(declinedChargeParams);
		}
		catch (CardException e) {
			assertEquals("card_declined", e.getCode());
			assertNotNull(e.getCharge());
		}
	}

	@Test
	public void testInvalidAddressZipTest() throws StripeException {
		Map<String, Object> invalidChargeParams = new HashMap<String, Object>();
		invalidChargeParams.putAll(defaultChargeParams);
		Map<String, Object> invalidCardParams = new HashMap<String, Object>();
		// See https://stripe.com/docs/testing
		invalidCardParams.put("number", "4000000000000036");
		invalidCardParams.put("address_zip", "94024");
		invalidCardParams.put("address_line1", "42 Foo Street");
		invalidCardParams.put("exp_month", 12);
		invalidCardParams.put("exp_year", getYear());
		invalidChargeParams.put("card", invalidCardParams);
		Charge charge = Charge.create(invalidChargeParams, supportedRequestOptions);
		assertEquals(charge.getPaid(), true);
		assertEquals(charge.getCard().getAddressZipCheck(), "fail");
		assertEquals(charge.getCard().getAddressLine1Check(), "pass");
	}

	@Test
	public void testInvalidAddressLine1Test() throws StripeException {
		Map<String, Object> invalidChargeParams = new HashMap<String, Object>();
		invalidChargeParams.putAll(defaultChargeParams);
		Map<String, Object> invalidCardParams = new HashMap<String, Object>();
		// See https://stripe.com/docs/testing
		invalidCardParams.put("number", "4000000000000028");
		invalidCardParams.put("address_zip", "94024");
		invalidCardParams.put("address_line1", "42 Foo Street");
		invalidCardParams.put("exp_month", 12);
		invalidCardParams.put("exp_year", getYear());
		invalidChargeParams.put("card", invalidCardParams);
		Charge charge = Charge.create(invalidChargeParams, supportedRequestOptions);
		assertEquals(charge.getPaid(), true);
		assertEquals(charge.getCard().getAddressZipCheck(), "pass");
		assertEquals(charge.getCard().getAddressLine1Check(), "fail");
	}

	@Test
	public void testDisputedCharge() throws StripeException, InterruptedException {
		int chargeValueCents = 100;
		Charge disputedCharge = createDisputedCharge(chargeValueCents);
		Dispute dispute = disputedCharge.getDispute();
		assertNotNull(dispute);
		assertFalse(dispute.getIsChargeRefundable());
		assertEquals(1, dispute.getBalanceTransactions().size());
		assertEquals(-chargeValueCents, dispute.getBalanceTransactions().get(0).getAmount().intValue());
	}

	@Test
	public void testRetrieveDispute() throws StripeException, InterruptedException {
		int chargeValueCents = 100;
		Charge disputedCharge = createDisputedCharge(chargeValueCents);
		Dispute dispute = disputedCharge.getDispute();
		Dispute retrievedDispute = Dispute.retrieve(dispute.getId());
		assertEquals(dispute.getId(), retrievedDispute.getId());
	}

	@Test
	public void testDisputeList() throws StripeException, InterruptedException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 3);
		List<Dispute> disputes = Dispute.all(listParams).getData();

		assertEquals(3, disputes.size());
	}

	@Test
	public void testUpdateDispute() throws StripeException, InterruptedException {
		int chargeValueCents = 100;
		Charge disputedCharge = createDisputedCharge(chargeValueCents);

		Dispute initialDispute = disputedCharge.getDispute();
		EvidenceSubObject emptyEvidence = new EvidenceSubObject();
		assertEquals(emptyEvidence, initialDispute.getEvidenceSubObject());
		assertEquals(new HashMap<String, String>(), initialDispute.getMetadata());

		Map<String, Object> params = new HashMap<String, Object>();
		Map<String, Object> evidence = new HashMap<String, Object>();
		Map<String, String> metadata = new HashMap<String, String>();

		evidence.put("product_description", "my productDescription");
		evidence.put("customer_name", "my customerName");
		evidence.put("uncategorized_text", "my uncategorizedText");

		metadata.put("some_info", "about the dispute");
		metadata.put("a_little_more", "12345");

		params.put("evidence", evidence);
		params.put("metadata", metadata);

		Dispute updatedDispute = initialDispute.update(params);
		assertNotNull(updatedDispute);

		EvidenceSubObject evidenceSubObject = updatedDispute.getEvidenceSubObject();
		assertEquals(evidence.get("product_description"), evidenceSubObject.getProductDescription());
		assertEquals(evidence.get("customer_name"), evidenceSubObject.getCustomerName());
		assertEquals(evidence.get("uncategorized_text"), evidenceSubObject.getUncategorizedText());

		// Ensure this didn't get stored in the deprecated evidence field.
		assertNull(updatedDispute.getEvidence());

		Map<String, String> disputeMetadata = updatedDispute.getMetadata();
		assertNotNull(disputeMetadata);
		assertEquals(metadata, disputeMetadata);
	}

	@Test
	public void testCloseDispute() throws StripeException, InterruptedException {
		int chargeValueCents = 100;
		Charge disputedCharge = createDisputedCharge(chargeValueCents);
		Dispute dispute = disputedCharge.getDispute();
		assertEquals("needs_response", dispute.getStatus());

		Dispute closedDispute = dispute.close();
		assertEquals(dispute.getId(), closedDispute.getId());
		assertEquals("lost", closedDispute.getStatus());
	}

	@Test
	public void testFraudDetails() throws StripeException, InterruptedException {
		Charge charge = Charge.create(defaultChargeParams);
		FraudDetails expected = new FraudDetails();
		assertEquals(expected, charge.getFraudDetails());
		Charge refundedCharge = charge.refund();
		assertEquals(expected, refundedCharge.getFraudDetails());
		Charge updatedCharge = charge.update(ImmutableMap.<String, Object>of("fraud_details", ImmutableMap.of("user_report", "fraudulent")));
		FraudDetails expectedReported = new FraudDetails();
		expectedReported.setUserReport("fraudulent");
		assertEquals(expectedReported, updatedCharge.getFraudDetails());

		Charge nowSafe = updatedCharge.markSafe(null);
		expectedReported.setUserReport("safe");
		assertEquals(expectedReported, nowSafe.getFraudDetails());

		Charge nowFraudulent = nowSafe.markFraudulent(null);
		expectedReported.setUserReport("fraudulent");
		assertEquals(expectedReported, nowFraudulent.getFraudDetails());
	}

	@Test
	public void testCreateFileUpload() throws StripeException,
			InterruptedException, URISyntaxException {
		URL url = getClass().getResource("minimal.pdf");
		File file = new File(url.getPath());
		Map<String, Object> fileUploadParams = new HashMap<String, Object>();
		fileUploadParams.put("purpose", "dispute_evidence");
		fileUploadParams.put("file", file);

		FileUpload fileUpload = FileUpload.create(fileUploadParams);
		assertEquals(file.length(), fileUpload.getSize().longValue());
		assertEquals("pdf", fileUpload.getType());

		FileUpload retrievedUpload = FileUpload.retrieve(fileUpload.getId());
		assertEquals(fileUpload.getId(), retrievedUpload.getId());
		assertEquals(file.length(), retrievedUpload.getSize().longValue());
		assertEquals("pdf", retrievedUpload.getType());
	}

	@Test
	public void testFileUploadList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("limit", 1);
		List<FileUpload> uploads = FileUpload.all(listParams).getData();
		assertEquals(uploads.size(), 1);
	}

	@Test
	public void testSubmitOldStyleEvidence() throws StripeException, InterruptedException {
		int chargeValueCents = 100;
		Stripe.apiVersion = "2014-11-20";
		Charge disputedCharge = createDisputedCharge(chargeValueCents);

		String myEvidence = "Here's evidence showing this charge is legitimate.";
		Dispute initialDispute = disputedCharge.getDispute();
		assertNull(initialDispute.getEvidence());
		assertNull(initialDispute.getEvidenceSubObject());
		Map<String, Object> disputeParams = ImmutableMap.<String, Object>of("evidence", myEvidence);

		Dispute updatedDispute = disputedCharge.updateDispute(disputeParams);
		assertNotNull(updatedDispute);
		assertEquals(myEvidence, updatedDispute.getEvidence());
		assertNull(updatedDispute.getEvidenceSubObject());
	}

	@Test
	public void testSubmitEvidence() throws StripeException, InterruptedException {
		int chargeValueCents = 100;
		Charge disputedCharge = createDisputedCharge(chargeValueCents);

		Dispute initialDispute = disputedCharge.getDispute();
		assertNull(initialDispute.getEvidence());
		EvidenceSubObject emptyEvidence = new EvidenceSubObject();
		assertEquals(emptyEvidence, initialDispute.getEvidenceSubObject());
		assertEquals(0, initialDispute.getEvidenceDetails().getSubmissionCount().intValue());

		Map<String, Object> evidenceHashParams = new HashMap<String, Object>();
		// TODO: assert on all param types
		evidenceHashParams.put("product_description", "my productDescription");
		evidenceHashParams.put("customer_name", "my customerName");
		evidenceHashParams.put("uncategorized_text", "my uncategorizedText");
		Map<String, Object> providedEvidenceParams = ImmutableMap.<String, Object>of("evidence", evidenceHashParams);

		Dispute updatedDispute = disputedCharge.updateDispute(providedEvidenceParams);
		assertNotNull(updatedDispute);
		EvidenceSubObject evidenceSubObject = updatedDispute.getEvidenceSubObject();
		assertNotSame(emptyEvidence, evidenceSubObject);
		assertEquals(1, updatedDispute.getEvidenceDetails().getSubmissionCount().intValue());
		assertNull(updatedDispute.getEvidence());

		assertEquals("my productDescription", evidenceSubObject.getProductDescription());
		assertEquals("my customerName", evidenceSubObject.getCustomerName());
		assertEquals("my uncategorizedText", evidenceSubObject.getUncategorizedText());

		EvidenceDetails evidenceDetails = updatedDispute.getEvidenceDetails();
		assertNotNull(evidenceDetails);
		assertEquals(1, evidenceDetails.getSubmissionCount().intValue());
	}

	private Charge createDisputedCharge(int chargeValueCents) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException, InterruptedException {
		Map<String, Object> chargeParams = new HashMap<String, Object>();
		chargeParams.putAll(defaultChargeParams);
		chargeParams.put("amount", chargeValueCents);
		Map<String, Object> testModeDisputeCardParams = new HashMap<String, Object>();
		testModeDisputeCardParams.put("number", "4000000000000259");
		testModeDisputeCardParams.put("exp_month", 12);
		testModeDisputeCardParams.put("exp_year", getYear());
		chargeParams.put("card", testModeDisputeCardParams);
		Charge charge = Charge.create(chargeParams);

		// This test relies on the server asynchronously marking the charge as disputed.
		// TODO: find a more reliable way to do this instead of sleeping
		Thread.sleep(10000);
		return Charge.retrieve(charge.getId());
	}

	@Test
	public void testCustomerCreate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);
		assertEquals(customer.getDescription(), "J Bindings Customer");
		List<Card> customerCards = customer.getCards().getData();
		assertEquals(1, customerCards.size());
		assertEquals("4242", customerCards.get(0).getLast4());
	}

	@Test
	public void testCustomerCreateWithShippingDetails() throws StripeException {
		ShippingDetails shippingDetails = new ShippingDetails();
		shippingDetails.setName("name");
		shippingDetails.setPhone("123-456-7890");
		Address address = new Address()
				.setCity("Washington")
				.setCountry("USA")
				.setLine1("1600 Pennsylvania Ave.")
				.setLine2("line 2 address")
				.setPostalCode("20500")
				.setState("D.C.");
		shippingDetails.setAddress(address);

		Map<String, Object> params = ImmutableMap.<String, Object>builder()
				.putAll(defaultCustomerParams)
				.put("shipping", ImmutableMap.builder().put("address", ImmutableMap.builder().put("line1", address.getLine1()).put("line2", address.getLine2()).put("city", address.getCity()).put("country", address.getCountry()).put("postal_code", address.getPostalCode()).put("state", address.getState()).build()).put("name", shippingDetails.getName()).put("phone", shippingDetails.getPhone()).build())
				.build();

		Customer customer = Customer.create(params);
		assertEquals(customer.getShipping(), shippingDetails);
	}

	@Test
	public void testCustomerRetrieve() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		Customer retrievedCustomer = Customer.retrieve(createdCustomer.getId());
		assertEquals(createdCustomer.getCreated(),
				retrievedCustomer.getCreated());
		assertEquals(createdCustomer.getId(), retrievedCustomer.getId());
	}

	@Test
	public void testCustomerList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Customer> Customers = Customer.all(listParams).getData();
		assertEquals(Customers.size(), 1);
	}

	@Test
	public void testCustomerUpdate() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "Updated Description");
		Customer updatedCustomer = createdCustomer.update(updateParams);
		assertEquals(updatedCustomer.getDescription(), "Updated Description");
	}

	@Test(expected=InvalidRequestException.class)
	public void testCustomerUpdateToBlank() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "");
		createdCustomer.update(updateParams);
	}

	@Test
	public void testCustomerUpdateToNull() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", null);
		Customer updatedCustomer = createdCustomer.update(updateParams);
		assertEquals(updatedCustomer.getDescription(), null);
	}

	@Test
	public void testCustomerSourceList() throws StripeException {
		Customer customer = createDefaultCustomerWithDefaultBitcoinReceiver();

		HashMap<String, Object> listParams = new HashMap<String, Object>();
		List<ExternalAccount> customerSourceList = customer.getSources().all(listParams).getData();

		assertEquals(2, customerSourceList.size());
		assert(customerSourceList.get(0) instanceof Card);
		assertEquals("4242", ((Card) customerSourceList.get(0)).getLast4());
		assert(customerSourceList.get(1) instanceof BitcoinReceiver);
		assertEquals(true, ((BitcoinReceiver) customerSourceList.get(1)).getFilled());
	}

	@Test
	public void testCustomerSourceRetrieveCard() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		ExternalAccountCollection customerSources = customer.getSources();
		String paymentSourceId = customerSources.getData().get(0).getId();
		ExternalAccount paymentSource = customerSources.retrieve(paymentSourceId);
		assertNotNull(paymentSource);
		assertEquals(paymentSourceId, paymentSource.getId());
	}

	@Test
	public void testCustomerSourceRetrieveBitcoinReceiver() throws StripeException {
		Customer customer = Customer.create(new HashMap<String, Object>());
		BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
		ExternalAccountCollection customerSources = customer.getSources();
		Map<String, Object> createParams = new HashMap<String, Object>();
		createParams.put("source", receiver.getId());
		customerSources.create(createParams);
		customerSources = customerSources.all(new HashMap<String, Object>());
		String paymentSourceId = customerSources.getData().get(0).getId();
		ExternalAccount paymentSource = customerSources.retrieve(paymentSourceId);
		assertNotNull(paymentSource);
		assertEquals(paymentSourceId, paymentSource.getId());
		assertTrue(paymentSource instanceof BitcoinReceiver);
		assertTrue(((BitcoinReceiver) paymentSource).getFilled());
	}

	@Test
	public void testCustomerCreateWithSource() throws StripeException {
		HashMap<String, Object> customerCreationParams = new HashMap<String, Object>();
		customerCreationParams.put("source", defaultSourceParams);
		Customer customer = Customer.create(customerCreationParams);
		assertNotNull(customer);
		assertNotNull(customer.getId());
		assertNotNull(customer.getSources());
		assert(customer.getSources().getData().get(0) instanceof Card);
		assertNotNull(customer.getDefaultSource());
		ExternalAccount card = customer.getSources().retrieve(customer.getDefaultSource());
		assertEquals(card.getId(), customer.getDefaultSource());
	}

	@Test
	public void testCustomerCreateSourceWithCardHash() throws StripeException {
		Customer customer = Customer.create(new HashMap<String, Object>());
		ExternalAccountCollection customerSources = customer.getSources();
		HashMap<String, Object> createParams = new HashMap<String, Object>();
		createParams.put("source", defaultSourceParams);
		ExternalAccount paymentSource = customerSources.create(createParams);
		assertNotNull(paymentSource);
		assertNotNull(paymentSource.getId());
		assert(paymentSource instanceof Card);
	}

	@Test
	public void testCustomerCreateSourceWithBitcoinReceiverToken() throws StripeException {
		Customer customer = Customer.create(new HashMap<String, Object>());
		ExternalAccountCollection customerSources = customer.getSources();
		BitcoinReceiver receiver = BitcoinReceiver.create(defaultBitcoinReceiverParams);
		HashMap<String, Object> createParams = new HashMap<String, Object>();
		createParams.put("source", receiver.getId());
		ExternalAccount paymentSource = customerSources.create(createParams);
		assertNotNull(paymentSource);
		assertNotNull(paymentSource.getId());
		assert(paymentSource instanceof BitcoinReceiver);
	}

	@Test
	public void testCustomerSourceUpdate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		ExternalAccountCollection customerSources = customer.getSources();
		ExternalAccount paymentSource = customerSources.getData().get(0);
		assert(paymentSource instanceof Card);
		Card card = (Card) paymentSource;

		HashMap<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("address_line1", "some address details");
		Card updatedCard = card.update(updateParams);
		assertEquals("some address details", updatedCard.getAddressLine1());
	}

	@Test
	public void testCustomerSourceDelete() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		ExternalAccountCollection customerSources = customer.getSources();
		ExternalAccount paymentSource = customerSources.getData().get(0);
		paymentSource.delete();
		HashMap<String, Object> listParams = new HashMap<String, Object>();
		assertEquals(0, customerSources.all(listParams).getData().size());
	}

	@Test
	public void testCustomerCardAddition() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams, supportedRequestOptions);
		String originalDefaultCard = createdCustomer.getDefaultCard();

		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("card", defaultCardParams);
		Card addedCard = createdCustomer.createCard(creationParams);

		Token token = Token.create(defaultTokenParams);
		createdCustomer.createCard(token.getId());

		Customer updatedCustomer = Customer.retrieve(createdCustomer.getId(), supportedRequestOptions);
		assertEquals((Integer) updatedCustomer.getCards().getData().size(), (Integer) 3);
		assertEquals(updatedCustomer.getDefaultCard(), originalDefaultCard);

		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("default_card", addedCard.getId());
		Customer customerAfterDefaultCardUpdate = updatedCustomer.update(updateParams, supportedRequestOptions);
		assertEquals((Integer) customerAfterDefaultCardUpdate.getCards().getData().size(), (Integer) 3);
		assertEquals(customerAfterDefaultCardUpdate.getDefaultCard(), addedCard.getId());

		assertEquals(customerAfterDefaultCardUpdate.getCards().retrieve(originalDefaultCard).getId(), originalDefaultCard);
		assertEquals(customerAfterDefaultCardUpdate.getCards().retrieve(addedCard.getId()).getId(), addedCard.getId());
	}

	@Test
	public void testCreateCardThroughCollection() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams, supportedRequestOptions);

		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("card", defaultCardParams);
		Card addedCard = createdCustomer.getCards().create(creationParams);

		assertEquals(createdCustomer.getId(), addedCard.getCustomer());

		Customer updatedCustomer = Customer.retrieve(createdCustomer.getId(), supportedRequestOptions);
		assertEquals((Integer) updatedCustomer.getCards().getData().size(), (Integer) 2);
	}


	@Test
	public void testCustomerCardUpdate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);
		Card originalCard = customer.getCards().getData().get(0);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("name", "J Bindings Cardholder, Jr.");
		Card updatedCard = originalCard.update(updateParams);
		assertEquals(updatedCard.getName(), "J Bindings Cardholder, Jr.");
	}

	@Test
	public void testCustomerCardDelete() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);
		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("card", defaultCardParams);
		customer.createCard(creationParams);

		Card card = customer.getCards().getData().get(0);
		DeletedCard deletedCard = card.delete();
		Customer retrievedCustomer = Customer.retrieve(customer.getId(), supportedRequestOptions);

		assertTrue(deletedCard.getDeleted());
		assertEquals(deletedCard.getId(), card.getId());
		for(Card retrievedCard : retrievedCustomer.getCards().getData()) {
				assertFalse("Card was not actually deleted: " + card.getId(), card.getId().equals(retrievedCard.getId()));
		}
	}

	@Test
	public void testCustomerBankAccountAddition() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams, supportedRequestOptions);
		String originalDefaultCard = createdCustomer.getDefaultCard();

		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("bank_account", defaultBankAccountParams);
		BankAccount addedBankAccount = createdCustomer.createBankAccount(creationParams);

		Token token = Token.create(defaultTokenParams);
		createdCustomer.createCard(token.getId());

		Customer updatedCustomer = Customer.retrieve(createdCustomer.getId(), supportedRequestOptions);
		assertEquals((Integer) updatedCustomer.getSources().getData().size(), (Integer) 3);
		assertEquals(updatedCustomer.getDefaultCard(), originalDefaultCard);

		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("default_source", addedBankAccount.getId());
		Customer customerAfterDefaultSourceUpdate = updatedCustomer.update(updateParams, supportedRequestOptions);
		assertEquals((Integer) customerAfterDefaultSourceUpdate.getSources().getData().size(), (Integer) 3);
		assertEquals(customerAfterDefaultSourceUpdate.getDefaultSource(), addedBankAccount.getId());
	}

	@Test
	public void testCustomerBankAccountDelete() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams, supportedRequestOptions);

		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("bank_account", defaultBankAccountParams);
		BankAccount addedBankAccount = customer.createBankAccount(creationParams);

		DeletedBankAccount deletedBankAccount = addedBankAccount.delete();
		Customer retrievedCustomer = Customer.retrieve(customer.getId(), supportedRequestOptions);

		assertTrue(deletedBankAccount.getDeleted());
		assertEquals(deletedBankAccount.getId(), addedBankAccount.getId());
		for(ExternalAccount retrievedSource : retrievedCustomer.getSources().getData()) {
			assertFalse("Card was not actually deleted: " + addedBankAccount.getId(),
					addedBankAccount.getId().equals(retrievedSource.getId()));
		}
	}

	@Test
	public void testCustomerDelete() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		DeletedCustomer deletedCustomer = createdCustomer.delete();
		Customer deletedRetrievedCustomer = Customer.retrieve(createdCustomer
				.getId());
		assertTrue(deletedCustomer.getDeleted());
		assertEquals(deletedCustomer.getId(), createdCustomer.getId());
		assertTrue(deletedRetrievedCustomer.getDeleted());
	}

	@Test
	public void testPlanCreate() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		assertEquals(plan.getInterval(), "month");
		assertEquals(plan.getIntervalCount(), (Integer) 2);
	}

	@Test
	public void testPlanCreateWithStatementDescriptor() throws StripeException {
		Map<String, Object> planParamsWithStatementDescriptor = getUniquePlanParams();
		planParamsWithStatementDescriptor.put("statement_descriptor", "Stripe");
		Plan plan = Plan.create(planParamsWithStatementDescriptor);
		assertEquals(plan.getStatementDescriptor(), "Stripe");
	}

	@Test
	public void testPlanUpdate() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams());
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("name", "Updated Plan Name");
		Plan updatedplan = createdPlan.update(updateParams);
		assertEquals(updatedplan.getName(), "Updated Plan Name");
	}

	@Test
	public void testPlanRetrieve() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams());
		Plan retrievedPlan = Plan.retrieve(createdPlan.getId());
		assertEquals(createdPlan.getId(), retrievedPlan.getId());
	}

	@Test
	public void testPlanList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Plan> Plans = Plan.all(listParams).getData();
		assertEquals(Plans.size(), 1);
	}

	@Test
	public void testPlanDelete() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams());
		DeletedPlan deletedPlan = createdPlan.delete();
		assertTrue(deletedPlan.getDeleted());
		assertEquals(deletedPlan.getId(), createdPlan.getId());
	}

	@Test
	public void testCustomerCreateWithPlan() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscriptions().getData().get(0).getPlan().getId(), plan.getId());
	}

	@Test
	public void testUpdateSubscription() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = Customer.create(defaultCustomerParams);
		Map<String, Object> subscriptionParams = new HashMap<String, Object>();
		subscriptionParams.put("plan", plan.getId());
		Subscription sub = customer.updateSubscription(subscriptionParams);
		assertEquals(sub.getPlan().getId(), plan.getId());
		assertEquals(sub.getCustomer(), customer.getId());
	}

	@Test
	public void testCancelSubscription() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscriptions().getData().get(0).getStatus(), "active");
		Subscription canceledSubscription = customer.cancelSubscription();
		assertEquals(canceledSubscription.getStatus(), "canceled");
	}

	@Test
	public void testCancelSubscriptionAtPeriodEnd() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscriptions().getData().get(0).getStatus(), "active");
		Map<String, Object> cancelParams = new HashMap<String, Object>();
		cancelParams.put("at_period_end", true);
		Subscription canceledSubscription = customer
				.cancelSubscription(cancelParams);
		assertEquals(canceledSubscription.getStatus(), "active");
		assertEquals(canceledSubscription.getCancelAtPeriodEnd(), true);
	}

	@Test
	public void testNewStyleSubscriptionAPI() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Plan plan2 = Plan.create(getUniquePlanParams());
		Customer customer = Customer.create(defaultCustomerParams);

		// Create
		Map<String, Object> subCreateParams = new HashMap<String, Object>();
		subCreateParams.put("plan", plan.getId());
		Subscription sub = customer.createSubscription(subCreateParams);
		assertEquals(plan.getId(), sub.getPlan().getId());
		customer = Customer.retrieve(customer.getId());
		assertEquals(1, customer.getSubscriptions().getData().size());
		assertEquals(sub.getId(), customer.getSubscriptions().getData().get(0).getId());

		// Retrieve
		Subscription retrievedSub = customer.getSubscriptions().retrieve(sub.getId());
		assertEquals(sub.getId(), retrievedSub.getId());

		// List
		CustomerSubscriptionCollection list = customer.getSubscriptions().all(null);
		assertEquals(1, list.getData().size());
		assertEquals(sub.getId(), list.getData().get(0).getId());

		// Update
		Map<String, Object> subUpdateParams = new HashMap<String, Object>();
		subUpdateParams.put("plan", plan2.getId());
		sub = sub.update(subUpdateParams);
		assertEquals(plan2.getId(), sub.getPlan().getId());

		// Cancel
		sub = sub.cancel(null);
		assertNotNull(sub.getCanceledAt());
	}

	@Test
	public void testTopLevelSubscriptionAPI() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Plan plan2 = Plan.create(getUniquePlanParams());
		Customer customer = Customer.create(defaultCustomerParams);

		// Create
		Map<String, Object> subCreateParams = new HashMap<String, Object>();
		subCreateParams.put("plan", plan.getId());
		subCreateParams.put("customer", customer.getId());
		Subscription sub = Subscription.create(subCreateParams);
		assertEquals(plan.getId(), sub.getPlan().getId());
		assertEquals(customer.getId(), sub.getCustomer());

		customer = Customer.retrieve(customer.getId());
		assertEquals(1, customer.getSubscriptions().getData().size());
		assertEquals(sub.getId(), customer.getSubscriptions().getData().get(0).getId());

		// Retrieve
		Subscription retrievedSub = Subscription.retrieve(sub.getId());
		assertEquals(sub.getId(), retrievedSub.getId());

		// List
		Map<String, Object> subAllParams = new HashMap<String, Object>();
		subAllParams.put("plan", plan.getId());
		subAllParams.put("customer", customer.getId());
		SubscriptionCollection list = Subscription.all(subAllParams);
		assertEquals(1, list.getData().size());
		assertEquals(sub.getId(), list.getData().get(0).getId());
		assertEquals(customer.getId(), list.getData().get(0).getCustomer());
		assertEquals(plan.getId(), list.getData().get(0).getPlan().getId());

		// Update
		Map<String, Object> subUpdateParams = new HashMap<String, Object>();
		subUpdateParams.put("plan", plan2.getId());
		sub = sub.update(subUpdateParams);
		assertEquals(plan2.getId(), sub.getPlan().getId());

		// Cancel
		sub = sub.cancel(null);
		assertNotNull(sub.getCanceledAt());
	}


	@Test
	public void testCreateSubscriptionThroughCollection() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = Customer.create(defaultCustomerParams);

		// Create
		Map<String, Object> subCreateParams = new HashMap<String, Object>();
		subCreateParams.put("plan", plan.getId());

		Subscription sub = customer.getSubscriptions().create(subCreateParams);
		assertEquals(plan.getId(), sub.getPlan().getId());

		// Verify
		customer = Customer.retrieve(customer.getId());
		assertEquals(1, customer.getSubscriptions().getData().size());
		assertEquals(sub.getId(), customer.getSubscriptions().getData().get(0).getId());
	}

	@Test
	public void testInvoiceItemCreate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem invoiceItem = createDefaultInvoiceItem(customer);
		assertTrue(invoiceItem.getAmount() == 100);
	}

	@Test
	public void testInvoiceItemRetrieve() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		InvoiceItem retrievedInvoiceItem = InvoiceItem
				.retrieve(createdInvoiceItem.getId());
		assertEquals(createdInvoiceItem.getId(), retrievedInvoiceItem.getId());
	}

	@Test
	public void testInvoiceItemList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<InvoiceItem> InvoiceItems = InvoiceItem.all(listParams).getData();
		assertEquals(InvoiceItems.size(), 1);
	}

	@Test
	public void testInvoiceItemUpdate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "Updated Description");
		updateParams.put("amount", 200);
		InvoiceItem updatedInvoiceItem = createdInvoiceItem
				.update(updateParams);
		assertTrue(updatedInvoiceItem.getAmount() == 200);
		assertEquals(updatedInvoiceItem.getDescription(), "Updated Description");
	}

	@Test
	public void testInvoiceItemDelete() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		DeletedInvoiceItem deletedInvoiceItem = createdInvoiceItem.delete();
		assertTrue(deletedInvoiceItem.getDeleted());
		assertEquals(deletedInvoiceItem.getId(), createdInvoiceItem.getId());
	}

	@Test
	public void testInvoiceListAndRetrieve() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		createDefaultCustomerWithPlan(plan);
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Invoice createdInvoice = Invoice.all(listParams).getData().get(0);
		Invoice retrievedInvoice = Invoice.retrieve(createdInvoice.getId());
		assertEquals(createdInvoice.getId(), retrievedInvoice.getId());

		InvoiceLineItemCollection lines = retrievedInvoice.getLines().all(
				listParams);
		assertNotNull(lines);
	}

	@Test
	public void testInvoiceRetrieveForCustomer() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("customer", customer.getId());
		listParams.put("count", 1);
		Invoice invoice = Invoice.all(listParams).getData().get(0);
		assertEquals(invoice.getCustomer(), customer.getId());
	}

	@Test
	public void testInvoiceCreate() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		Map<String, Object> invoiceItem = ImmutableMap.<String, Object>builder()
				.put("customer", customer.getId())
				.put("amount", 100)
				.put("currency", "usd")
				.put("description", "my item")
				.build();
		InvoiceItem createdItem = InvoiceItem.create(invoiceItem);
		assertEquals("my item", createdItem.getDescription());
		Invoice invoice = Invoice.create(ImmutableMap.<String, Object>builder()
				.put("description", "my invoice")
				.put("customer", customer.getId())
				.build());
		assertEquals("my invoice", invoice.getDescription());
	}

	@Test
	public void testUpcomingInvoice() throws Exception {
		Customer customer = Customer.create(defaultCustomerParams);
		createDefaultInvoiceItem(customer);
		Map<String, Object> upcomingParams = new HashMap<String, Object>();
		upcomingParams.put("customer", customer.getId());
		Invoice upcomingInvoice = Invoice.upcoming(upcomingParams);
		assertFalse(upcomingInvoice.getAttempted());
	}

	@Test
	public void testUpcomingInvoiceLines() throws Exception {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem item = createDefaultInvoiceItem(customer);
		Map<String, Object> upcomingParams = new HashMap<String, Object>();
		upcomingParams.put("customer", customer.getId());
		Invoice upcomingInvoice = Invoice.upcoming(upcomingParams);
		assertFalse(upcomingInvoice.getAttempted());

		InvoiceLineItemCollection lines = upcomingInvoice.getLines().all(null);
		assertFalse(lines.getData().isEmpty());
		assertEquals(item.getId(), lines.getData().get(0).getId());

		Map<String, Object> fetchParams = new HashMap<String, Object>();
		fetchParams.put("starting_after", item.getId());
		InvoiceLineItemCollection linesAfterFirst = upcomingInvoice.getLines().all(fetchParams);
		assertTrue(linesAfterFirst.getData().isEmpty());
	}

	@Test
	public void testTokenCreate() throws StripeException {
		Token token = Token.create(defaultTokenParams);
		assertFalse(token.getUsed());
	}

	@Test
	public void testTokenRetrieve() throws StripeException {
		Token createdToken = Token.create(defaultTokenParams);
		Token retrievedToken = Token.retrieve(createdToken.getId());
		assertEquals(createdToken.getId(), retrievedToken.getId());
	}

	@Test
	public void testTokenUse() throws StripeException {
		Token createdToken = Token.create(defaultTokenParams);
		Map<String, Object> chargeWithTokenParams = new HashMap<String, Object>();
		chargeWithTokenParams.put("amount", 199);
		chargeWithTokenParams.put("currency", "usd");
		chargeWithTokenParams.put("card", createdToken.getId());
		Charge.create(chargeWithTokenParams);
		Token retrievedToken = Token.retrieve(createdToken.getId());
		assertTrue(retrievedToken.getUsed());
	}

	@Test
	public void testCouponCreate() throws StripeException {
		Coupon coupon = Coupon.create(getUniqueCouponParams());
		assertEquals(coupon.getDuration(), "once");
	}

	@Test
	public void testCouponUpdate() throws StripeException {
		Coupon createdCoupon = Coupon.create(getUniqueCouponParams());
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("metadata[message]", "This month is on us!");
		Coupon updatedCoupon = createdCoupon.update(updateParams);
		assertEquals(updatedCoupon.getMetadata().get("message"), "This month is on us!");
	}

	@Test
	public void testCouponRetrieve() throws StripeException {
		Coupon createdCoupon = Coupon.create(getUniqueCouponParams());
		Coupon retrievedCoupon = Coupon.retrieve(createdCoupon.getId());
		assertEquals(createdCoupon.getId(), retrievedCoupon.getId());
	}

	@Test
	public void testCouponList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Coupon> Coupons = Coupon.all(listParams).getData();
		assertEquals(Coupons.size(), 1);
	}

	@Test
	public void testCouponDelete() throws StripeException {
		Coupon createdCoupon = Coupon.create(getUniqueCouponParams());
		DeletedCoupon deletedCoupon = createdCoupon.delete();
		assertTrue(deletedCoupon.getDeleted());
		assertEquals(deletedCoupon.getId(), createdCoupon.getId());
	}

	@Test
	public void testCustomerCreateWithCoupon() throws StripeException {
		Coupon coupon = Coupon.create(getUniqueCouponParams());
		Map<String, Object> customerWithCouponParams = new HashMap<String, Object>();
		customerWithCouponParams.put("coupon", coupon.getId());
		Customer customer = Customer.create(customerWithCouponParams);
		assertEquals(customer.getDiscount().getCoupon().getId(), coupon.getId());

		customer.deleteDiscount();
		assertNull(Customer.retrieve(customer.getId()).getDiscount());
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
		assertEquals(createdRecipient.getActiveAccount().getValidated(), retrievedRecipient.getActiveAccount().getValidated());
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
		String originalDefaultCard = createdRecipient.getDefaultCard();

		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("card", defaultDebitCardParams);
		Card addedCard = createdRecipient.createCard(creationParams);

		Token token = Token.create(defaultDebitTokenParams);
		createdRecipient.createCard(token.getId());

		Recipient updatedRecipient = Recipient.retrieve(createdRecipient.getId());
		assertEquals((Integer) 3, (Integer) updatedRecipient.getCards().getData().size());
		assertEquals(updatedRecipient.getDefaultCard(), originalDefaultCard);

		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("default_card", addedCard.getId());
		Recipient recipientAfterDefaultCardUpdate = updatedRecipient.update(updateParams);
		assertEquals((Integer) recipientAfterDefaultCardUpdate.getCards().getData().size(), (Integer) 3);
		assertEquals(recipientAfterDefaultCardUpdate.getDefaultCard(), addedCard.getId());

		assertEquals(recipientAfterDefaultCardUpdate.getCards().retrieve(originalDefaultCard).getId(), originalDefaultCard);
		assertEquals(recipientAfterDefaultCardUpdate.getCards().retrieve(addedCard.getId()).getId(), addedCard.getId());
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
		creationParams.put("card", defaultDebitCardParams);
		recipient.createCard(creationParams);

		Card card = recipient.getCards().getData().get(0);
		DeletedCard deletedCard = card.delete();
		Recipient retrievedRecipient = Recipient.retrieve(recipient.getId());

		assertTrue(deletedCard.getDeleted());
		assertEquals(deletedCard.getId(), card.getId());
		for(Card retrievedCard : retrievedRecipient.getCards().getData()) {
				assertFalse("Card was not actually deleted: " + card.getId(), card.getId().equals(retrievedCard.getId()));
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
	public void testApplicationFeeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 0);
		List<ApplicationFee> fees = ApplicationFee.all(listParams).getData();
		assertEquals(fees.size(), 0);
	}

	@Test
	public void testEventRetrieve() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Event event = Event.all(listParams).getData().get(0);
		Event retrievedEvent = Event.retrieve(event.getId());
		assertEquals(event.getId(), retrievedEvent.getId());
	}

	@Test
	public void testEventList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Event> events = Event.all(listParams).getData();
		assertEquals(events.size(), 1);
	}

	/**
	 * Ensure the provided parameter for API key is actually being used. All
	 * other PerCallAPIKey methods assume this part works.
	 *
	 * @throws StripeException
	 */
	@Test
	public void testPerCallAPIUsage() throws StripeException {
		Charge createdCharge = Charge
				.create(defaultChargeParams, Stripe.apiKey);
		assertFalse(createdCharge.getRefunded());
		try {
			Charge.create(defaultChargeParams, "INVALID_KEY_HERE");
			fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void testChargeCreatePerCallAPIKey() throws StripeException {
		Charge createdCharge = Charge
				.create(defaultChargeParams, Stripe.apiKey);
		assertFalse(createdCharge.getRefunded());
	}

	@Test
	public void testChargeRetrievePerCallAPIKey() throws StripeException {
		Charge createdCharge = Charge
				.create(defaultChargeParams, Stripe.apiKey);
		Charge retrievedCharge = Charge.retrieve(createdCharge.getId(),
				Stripe.apiKey);
		assertEquals(createdCharge.getCreated(), retrievedCharge.getCreated());
		assertEquals(createdCharge.getId(), retrievedCharge.getId());
	}

	@Test
	public void testChargeRefundPerCallAPIKey() throws StripeException {
		Charge createdCharge = Charge
				.create(defaultChargeParams, Stripe.apiKey);
		Charge refundedCharge = createdCharge.refund(Stripe.apiKey);
		assertTrue(refundedCharge.getRefunded());
	}

	@Test
	public void testChargePartialRefundPerCallAPIKey() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Map<String, Object> refundParams = new HashMap<String, Object>();
		final Integer REFUND_AMOUNT = 50;
		refundParams.put("amount", REFUND_AMOUNT);
		Charge refundedCharge = createdCharge.refund(refundParams,
				Stripe.apiKey);
		assertFalse(refundedCharge.getRefunded());
		assertEquals(refundedCharge.getAmountRefunded(), REFUND_AMOUNT);
	}

	@Test
	public void testChargeListPerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Charge> charges = Charge.all(listParams, Stripe.apiKey).getData();
		assertEquals(charges.size(), 1);
	}

	@Test(expected = CardException.class)
	public void testInvalidCardPerCallAPIKey() throws StripeException {
		Map<String, Object> invalidChargeParams = new HashMap<String, Object>();
		invalidChargeParams.putAll(defaultChargeParams);
		Map<String, Object> invalidCardParams = new HashMap<String, Object>();
		invalidCardParams.put("number", "4242424242424241");
		invalidCardParams.put("exp_month", 12);
		invalidCardParams.put("exp_year", getYear());
		invalidChargeParams.put("card", invalidCardParams);
		Charge.create(invalidChargeParams, Stripe.apiKey);
	}

	@Test
	public void testCustomerCreatePerCallAPIKey() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams,
				supportedRequestOptions);
		assertEquals(customer.getDescription(), "J Bindings Customer");
		List<Card> customerCards = customer.getCards().getData();
		assertEquals(1, customerCards.size());
		assertEquals("4242", customerCards.get(0).getLast4());
	}

	@Test
	public void testCustomerRetrievePerCallAPIKey() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		Customer retrievedCustomer = Customer.retrieve(createdCustomer.getId());
		assertEquals(createdCustomer.getCreated(),
				retrievedCustomer.getCreated());
		assertEquals(createdCustomer.getId(), retrievedCustomer.getId());
	}

	@Test
	public void testCustomerListPerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Customer> Customers = Customer.all(listParams, Stripe.apiKey)
				.getData();
		assertEquals(Customers.size(), 1);
	}

	@Test
	public void testCustomerUpdatePerCallAPIKey() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "Updated Description");
		Customer updatedCustomer = createdCustomer.update(updateParams,
				Stripe.apiKey);
		assertEquals(updatedCustomer.getDescription(), "Updated Description");
	}

	@Test
	public void testCustomerDeletePerCallAPIKey() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		DeletedCustomer deletedCustomer = createdCustomer.delete(Stripe.apiKey);
		Customer deletedRetrievedCustomer = Customer.retrieve(
				createdCustomer.getId(), Stripe.apiKey);
		assertTrue(deletedCustomer.getDeleted());
		assertEquals(deletedCustomer.getId(), createdCustomer.getId());
		assertTrue(deletedRetrievedCustomer.getDeleted());
	}

	@Test
	public void testPlanCreatePerCallAPIKey() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		assertEquals(plan.getInterval(), "month");
	}

	@Test
	public void testPlanUpdatePerCallAPIKey() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("name", "Updated Plan Name");
		Plan updatedplan = createdPlan.update(updateParams, Stripe.apiKey);
		assertEquals(updatedplan.getName(), "Updated Plan Name");
	}

	@Test
	public void testPlanRetrievePerCallAPIKey() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Plan retrievedPlan = Plan.retrieve(createdPlan.getId(), Stripe.apiKey);
		assertEquals(createdPlan.getId(), retrievedPlan.getId());
	}

	@Test
	public void testPlanListPerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Plan> Plans = Plan.all(listParams, Stripe.apiKey).getData();
		assertEquals(Plans.size(), 1);
	}

	@Test
	public void testPlanDeletePerCallAPIKey() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		DeletedPlan deletedPlan = createdPlan.delete(Stripe.apiKey);
		assertTrue(deletedPlan.getDeleted());
		assertEquals(deletedPlan.getId(), createdPlan.getId());
	}

	@Test
	public void testCustomerCreateWithPlanPerCallAPIKey()
			throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscriptions().getData().get(0).getPlan().getId(), plan.getId());
	}

	@Test
	public void testUpdateSubscriptionPerCallAPIKey() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		Map<String, Object> subscriptionParams = new HashMap<String, Object>();
		subscriptionParams.put("plan", plan.getId());
		Subscription sub = customer.updateSubscription(subscriptionParams,
				Stripe.apiKey);
		assertEquals(sub.getPlan().getId(), plan.getId());
		assertEquals(sub.getCustomer(), customer.getId());
	}

	@Test
	public void testCancelSubscriptionPerCallAPIKey() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscriptions().getData().get(0).getStatus(), "active");
		Subscription canceledSubscription = customer
				.cancelSubscription(Stripe.apiKey);
		assertEquals(canceledSubscription.getStatus(), "canceled");
	}

	@Test
	public void testCancelSubscriptionAtPeriodEndPerCallAPIKey()
			throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscriptions().getData().get(0).getStatus(), "active");
		Map<String, Object> cancelParams = new HashMap<String, Object>();
		cancelParams.put("at_period_end", true);
		Subscription canceledSubscription = customer.cancelSubscription(
				cancelParams, Stripe.apiKey);
		assertEquals(canceledSubscription.getStatus(), "active");
		assertEquals(canceledSubscription.getCancelAtPeriodEnd(), true);
	}

	@Test
	public void testInvoiceItemCreatePerCallAPIKey() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		InvoiceItem invoiceItem = createDefaultInvoiceItem(customer);
		assertTrue(invoiceItem.getAmount() == 100);
	}

	@Test
	public void testInvoiceItemRetrievePerCallAPIKey() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		InvoiceItem retrievedInvoiceItem = InvoiceItem.retrieve(
				createdInvoiceItem.getId(), Stripe.apiKey);
		assertEquals(createdInvoiceItem.getId(), retrievedInvoiceItem.getId());
	}

	@Test
	public void testInvoiceItemListPerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<InvoiceItem> InvoiceItems = InvoiceItem.all(listParams,
				Stripe.apiKey).getData();
		assertEquals(InvoiceItems.size(), 1);
	}

	@Test
	public void testInvoiceItemUpdatePerCallAPIKey() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "Updated Description");
		updateParams.put("amount", 200);
		InvoiceItem updatedInvoiceItem = createdInvoiceItem.update(
				updateParams, Stripe.apiKey);
		assertTrue(updatedInvoiceItem.getAmount() == 200);
		assertEquals(updatedInvoiceItem.getDescription(), "Updated Description");
	}

	@Test
	public void testInvoiceItemDeletePerCallAPIKey() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		DeletedInvoiceItem deletedInvoiceItem = createdInvoiceItem
				.delete(Stripe.apiKey);
		assertTrue(deletedInvoiceItem.getDeleted());
		assertEquals(deletedInvoiceItem.getId(), createdInvoiceItem.getId());
	}

	@Test
	public void testInvoiceListAndRetrievePerCallAPIKey()
			throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		createDefaultCustomerWithPlan(plan);
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Invoice createdInvoice = Invoice.all(listParams, Stripe.apiKey)
				.getData().get(0);
		Invoice retrievedInvoice = Invoice.retrieve(createdInvoice.getId(),
				Stripe.apiKey);
		assertEquals(createdInvoice.getId(), retrievedInvoice.getId());
	}

	@Test
	public void testInvoiceRetrieveForCustomerPerCallAPIKey()
			throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Customer customer = createDefaultCustomerWithPlan(plan);
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("customer", customer.getId());
		listParams.put("count", 1);
		Invoice invoice = Invoice.all(listParams, Stripe.apiKey).getData()
				.get(0);
		assertEquals(invoice.getCustomer(), customer.getId());
	}

	@Test
	public void testUpcomingInvoicePerCallAPIKey() throws Exception {
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		createDefaultInvoiceItem(customer);
		Map<String, Object> upcomingParams = new HashMap<String, Object>();
		upcomingParams.put("customer", customer.getId());
		Invoice upcomingInvoice = Invoice.upcoming(upcomingParams,
				Stripe.apiKey);
		assertFalse(upcomingInvoice.getAttempted());
	}

	@Test
	public void testTokenCreatePerCallAPIKey() throws StripeException {
		Token token = Token.create(defaultTokenParams, Stripe.apiKey);
		assertFalse(token.getUsed());
	}

	@Test
	public void testTokenRetrievePerCallAPIKey() throws StripeException {
		Token createdToken = Token.create(defaultTokenParams, Stripe.apiKey);
		Token retrievedToken = Token.retrieve(createdToken.getId(),
				Stripe.apiKey);
		assertEquals(createdToken.getId(), retrievedToken.getId());
	}

	@Test
	public void testTokenUsePerCallAPIKey() throws StripeException {
		Token createdToken = Token.create(defaultTokenParams, Stripe.apiKey);
		Map<String, Object> chargeWithTokenParams = new HashMap<String, Object>();
		chargeWithTokenParams.put("amount", 199);
		chargeWithTokenParams.put("currency", "usd");
		chargeWithTokenParams.put("card", createdToken.getId());
		Charge.create(chargeWithTokenParams, Stripe.apiKey);
		Token retrievedToken = Token.retrieve(createdToken.getId(),
				Stripe.apiKey);
		assertTrue(retrievedToken.getUsed());
	}

	@Test
	public void testCouponCreatePerCallAPIKey() throws StripeException {
		Coupon coupon = Coupon.create(getUniqueCouponParams(), Stripe.apiKey);
		assertEquals(coupon.getDuration(), "once");
	}

	@Test
	public void testCouponRetrievePerCallAPIKey() throws StripeException {
		Coupon createdCoupon = Coupon.create(getUniqueCouponParams(),
				Stripe.apiKey);
		Coupon retrievedCoupon = Coupon.retrieve(createdCoupon.getId(),
				Stripe.apiKey);
		assertEquals(createdCoupon.getId(), retrievedCoupon.getId());
	}

	@Test
	public void testCouponListPerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Coupon> Coupons = Coupon.all(listParams, Stripe.apiKey).getData();
		assertEquals(Coupons.size(), 1);
	}

	@Test
	public void testCouponDeletePerCallAPIKey() throws StripeException {
		Coupon createdCoupon = Coupon.create(getUniqueCouponParams(),
				Stripe.apiKey);
		DeletedCoupon deletedCoupon = createdCoupon.delete(Stripe.apiKey);
		assertTrue(deletedCoupon.getDeleted());
		assertEquals(deletedCoupon.getId(), createdCoupon.getId());
	}

	@Test
	public void testCustomerCreateWithCouponPerCallAPIKey()
			throws StripeException {
		Coupon coupon = Coupon.create(getUniqueCouponParams(), Stripe.apiKey);
		Map<String, Object> customerWithCouponParams = new HashMap<String, Object>();
		customerWithCouponParams.put("coupon", coupon.getId());
		Customer customer = Customer.create(customerWithCouponParams,
				Stripe.apiKey);
		assertEquals(customer.getDiscount().getCoupon().getId(), coupon.getId());

		customer.deleteDiscount();
		assertNull(Customer.retrieve(customer.getId()).getDiscount());
	}

	@Test
	public void testEventRetrievePerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Event event = Event.all(listParams, Stripe.apiKey).getData().get(0);
		Event retrievedEvent = Event.retrieve(event.getId());
		assertEquals(event.getId(), retrievedEvent.getId());
	}

	@Test
	public void testEventListPerCallAPIKey() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Event> events = Event.all(listParams, Stripe.apiKey).getData();
		assertEquals(events.size(), 1);
	}

	private void testMetadata(MetadataStore<?> object) throws StripeException {
		assertTrue(object.getMetadata().isEmpty());

		Map<String, String> initialMetadata = new HashMap<String, String>();
		initialMetadata.put("foo", "bar");
		initialMetadata.put("baz", "qux");
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("metadata", initialMetadata);
		object = object.update(updateParams);
		assertFalse(object.getMetadata().isEmpty());
		assertEquals("bar", object.getMetadata().get("foo"));
		assertEquals("qux", object.getMetadata().get("baz"));

		// Test update single key
		Map<String, String> metadataUpdate = new HashMap<String, String>();
		metadataUpdate.put("foo", "new-bar");
		updateParams = new HashMap<String, Object>();
		updateParams.put("metadata", metadataUpdate);
		object = object.update(updateParams);
		assertFalse(object.getMetadata().isEmpty());
		assertEquals("new-bar", object.getMetadata().get("foo"));
		assertEquals("qux", object.getMetadata().get("baz"));

		// Test delete single key
		metadataUpdate = new HashMap<String, String>();
		metadataUpdate.put("foo", null);
		updateParams = new HashMap<String, Object>();
		updateParams.put("metadata", metadataUpdate);
		object = object.update(updateParams);
		assertFalse(object.getMetadata().isEmpty());
		assertFalse(object.getMetadata().containsKey("foo"));
		assertEquals("qux", object.getMetadata().get("baz"));

		// Test delete all keys
		updateParams = new HashMap<String, Object>();
		updateParams.put("metadata", null);
		object = object.update(updateParams);
		assertTrue(object.getMetadata().isEmpty());
	}

	@Test
	public void testIdempotentRequestSent() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
		RequestOptions options = RequestOptions.builder()
				.setIdempotencyKey(UUID.randomUUID().toString())
				.build();

		Charge firstCharge = Charge.create(defaultChargeParams, options);
		Charge secondCharge = Charge.create(defaultChargeParams, options);

		assertEquals(firstCharge.getId(), secondCharge.getId());
	}

	@Test
	public void testNotIdempotentWhenUnset() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
		RequestOptions options = RequestOptions.builder().build();

		Charge firstCharge = Charge.create(defaultChargeParams, options);
		Charge secondCharge = Charge.create(defaultChargeParams, options);

		assertNotSame(firstCharge.getId(), secondCharge.getId());
	}

	@Test
	public void testClearingIdempotentcyActuallyWorks() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
		RequestOptions options = RequestOptions.builder()
				.setIdempotencyKey(UUID.randomUUID().toString())
				.clearIdempotencyKey()
				.build();

		Charge firstCharge = Charge.create(defaultChargeParams, options);
		Charge secondCharge = Charge.create(defaultChargeParams, options);

		assertNotSame(firstCharge.getId(), secondCharge.getId());
	}

	@Test
	public void testDefaultOptionsHaveUnsetIdempotentRequest() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
		RequestOptions options = RequestOptions.getDefault();

		Charge firstCharge = Charge.create(defaultChargeParams, options);
		Charge secondCharge = Charge.create(defaultChargeParams, options);

		assertNotSame(firstCharge.getId(), secondCharge.getId());
	}

	@Test
	public void testCardMetadata() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("card", defaultCardParams);
		testMetadata(customer.createCard(creationParams));
	}

	@Test
	public void testChargeMetadata() throws StripeException {
		testMetadata(Charge.create(defaultChargeParams));
	}

	@Test
	public void testCustomerMetadata() throws StripeException {
		testMetadata(Customer.create(defaultCustomerParams));
	}

	@Test
	public void testTransferMetadata() throws StripeException {
		testMetadata(Transfer.create(getTransferParams()));
	}

	@Test
	public void testRecipientMetadata() throws StripeException {
		testMetadata(Recipient.create(defaultRecipientParams));
	}

	@Test
	public void testPlanMetadata() throws StripeException {
		testMetadata(Plan.create(getUniquePlanParams()));
	}

	@Test
	public void testInvoiceItemMetadata() throws StripeException {
		testMetadata(InvoiceItem.create(getInvoiceItemParams()));
	}

	@Test
	public void testInvoiceMetadata() throws StripeException {
		InvoiceItem invItem = InvoiceItem.create(getInvoiceItemParams());
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("customer", invItem.getCustomer());
		testMetadata(Invoice.create(params));
	}

	@Test
	public void testSubscriptionMetadata() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		testMetadata(customer.createSubscription(getSubscriptionParams()));
	}

	@Test
	public void testRefundMetadata() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge refundedCharge = createdCharge.refund();
		testMetadata(refundedCharge.getRefunds().getData().get(0));
	}

	@Test
	public void testCouponMetadata() throws StripeException {
		testMetadata(Coupon.create(getUniqueCouponParams()));
	}

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

	@Test
	public void testChargeCreationSourceAsCard() throws StripeException {
		Map<String, Object> chargeParams = new HashMap<String, Object>();
		chargeParams.put("amount", 100);
		chargeParams.put("currency", "usd");
		Map<String, Object> cardMap = new HashMap<String, Object>();
		cardMap.put("number", "4242424242424242");
		cardMap.put("exp_month", 12);
		cardMap.put("exp_year", getYear());
		chargeParams.put("card", cardMap);
		Charge charge = Charge.create(chargeParams);

		assertTrue(charge.getSource() instanceof Card);
		assertNotNull(charge.getSource().getId());
	}

	@Test
	public void testAlipayAccountCreation() throws StripeException {
		Token alipayToken = Token.create(defaultAlipayTokenParams);
		Map<String, Object> customerParams = new HashMap<String, Object>();
		customerParams.put("source", alipayToken.getId());
		Customer cus = Customer.create(customerParams);

		ExternalAccount alipayAccount = cus.getSources().getData().get(0);
		assertEquals("alipay_account", alipayAccount.getObject());
		assertEquals(cus.getId(), alipayAccount.getCustomer());
		assertTrue(AlipayAccount.class.isInstance(alipayAccount));
	}

	@Test
	public void testAlipayAccountUpdating() throws StripeException {
		Token alipayToken = Token.create(defaultAlipayTokenParams);
		Map<String, Object> customerParams = new HashMap<String, Object>();
		customerParams.put("source", alipayToken.getId());
		Customer cus = Customer.create(customerParams);

		Map<String, Object> updateParams = new HashMap<String, Object>();
		Map<String, Object> metadata = new HashMap<String, Object>();
		metadata.put("foo", "bar");
		updateParams.put("metadata", metadata);

		ExternalAccount alipayAccount = cus.getSources().getData().get(0);
		ExternalAccount updatedAccount = alipayAccount.update(updateParams);

		assertEquals("bar", ((AlipayAccount) updatedAccount).getMetadata().get("foo"));
	}

	@Test
	public void testAlipayAccountDeleting() throws StripeException {
		Token alipayToken = Token.create(defaultAlipayTokenParams);
		Map<String, Object> customerParams = new HashMap<String, Object>();
		customerParams.put("source", alipayToken.getId());
		Customer cus = Customer.create(customerParams);

		AlipayAccount alipayAccount = (AlipayAccount) cus.getSources().getData().get(0);
		alipayAccount.delete();

		ExternalAccountCollection sources = cus.getSources().all(new HashMap<String, Object>());
		assertEquals(0, sources.getData().size());
	}

	@Test
	public void testProductCreateReadUpdate() throws StripeException {
		RequestOptions relayRequestOptions = RequestOptions.builder()
				.setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
				.build();

		Map<String, Object> createParams = new HashMap<String, Object>();
		String id = "my_first_product_" + UUID.randomUUID();
		createParams.put("id", id);
		createParams.put("name", "Watermelon");
		Product created = Product.create(createParams, relayRequestOptions);
		assertEquals(id, created.getId());
		assertEquals("Watermelon", created.getName());

		Product retrieved = Product.retrieve(id, relayRequestOptions);
		assertEquals("Watermelon", retrieved.getName());

		Product updated = retrieved.update(ImmutableMap.<String,Object>of("name", "Cantelope"), relayRequestOptions);
		assertEquals("Cantelope", updated.getName());
	}

	@Test
	public void testSKUCreateReadUpdate() throws StripeException {
		RequestOptions relayRequestOptions = RequestOptions.builder()
				.setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
				.build();

		Map<String, Object> productCreateParams = new HashMap<String, Object>();
		String productId = "my_first_product_" + UUID.randomUUID();
		productCreateParams.put("id", productId);
		productCreateParams.put("name", "Watermelon");
		productCreateParams.put("attributes[]", "size");
		Product.create(productCreateParams, relayRequestOptions);

		Map<String, Object> skuCreateParams = new HashMap<String, Object>();
		String skuId = "my_first_sku_" + UUID.randomUUID();
		skuCreateParams.put("id", skuId);
		skuCreateParams.put("product", productId);
		skuCreateParams.put("attributes", ImmutableMap.of("size", "large"));
		skuCreateParams.put("price", 100);
		skuCreateParams.put("currency", "usd");
		skuCreateParams.put("inventory", ImmutableMap.of("type", "infinite"));
		SKU created = SKU.create(skuCreateParams, relayRequestOptions);
		assertEquals(skuId, created.getId());
		assertEquals(productId, created.getProduct());
		assertEquals("large", created.getAttributes().get("size"));
		assertEquals("infinite", created.getInventory().getType());

		SKU retrieved = SKU.retrieve(skuId, relayRequestOptions);
		assertEquals("large", retrieved.getAttributes().get("size"));

		SKU updated = retrieved.update(ImmutableMap.<String,Object>of("price", 200), relayRequestOptions);
		assertEquals((Integer)200, updated.getPrice());
	}

	@Test
	public void testSKUProductDeletion() throws StripeException {
		RequestOptions relayRequestOptions = RequestOptions.builder()
				.setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
				.build();

		Map<String, Object> productCreateParams = new HashMap<String, Object>();
		String productId = "my_first_product_" + UUID.randomUUID();
		productCreateParams.put("id", productId);
		productCreateParams.put("name", "Watermelon");
		productCreateParams.put("attributes[]", "size");
		Product createdProduct = Product.create(productCreateParams, relayRequestOptions);

		Map<String, Object> skuCreateParams = new HashMap<String, Object>();
		String skuId = "my_first_sku_" + UUID.randomUUID();
		skuCreateParams.put("id", skuId);
		skuCreateParams.put("product", productId);
		skuCreateParams.put("attributes", ImmutableMap.of("size", "large"));
		skuCreateParams.put("price", 100);
		skuCreateParams.put("currency", "usd");
		skuCreateParams.put("inventory", ImmutableMap.of("type", "infinite"));

		SKU created = SKU.create(skuCreateParams, relayRequestOptions);

		DeletedSKU deletedSKU = created.delete(relayRequestOptions);
		assertTrue(deletedSKU.getDeleted());

		DeletedProduct deletedProduct = createdProduct.delete(relayRequestOptions);
		assertTrue(deletedProduct.getDeleted());
	}

	@Test
	public void testOrderCreateReadUpdatePayReturn() throws StripeException {
		RequestOptions relayRequestOptions = RequestOptions.builder()
				.setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
				.build();

		Map<String, Object> productCreateParams = new HashMap<String, Object>();
		String productId = "my_first_product_" + UUID.randomUUID();
		productCreateParams.put("id", productId);
		productCreateParams.put("name", "Watermelon");
		productCreateParams.put("attributes[]", "size");
		productCreateParams.put("shippable", false);
		Product.create(productCreateParams, relayRequestOptions);

		Map<String, Object> skuCreateParams = new HashMap<String, Object>();
		String skuId = "my_first_sku_" + UUID.randomUUID();
		skuCreateParams.put("id", skuId);
		skuCreateParams.put("product", productId);
		skuCreateParams.put("attributes", ImmutableMap.of("size", "large"));
		skuCreateParams.put("price", 100);
		skuCreateParams.put("currency", "usd");
		skuCreateParams.put("inventory", ImmutableMap.of("type", "infinite"));
		SKU.create(skuCreateParams, relayRequestOptions);

		Map<String, Object> orderCreateParams = new HashMap<String, Object>();
		orderCreateParams.put("items[]", ImmutableMap.<String, Object>of("type", "sku", "parent", skuId));
		orderCreateParams.put("currency", "usd");
		orderCreateParams.put("email", "foo@bar.com");
		Order created = Order.create(orderCreateParams, relayRequestOptions);
		assertEquals("created", created.getStatus());

		OrderItem item = null;
		for (OrderItem i : created.getItems()) {
			if (skuId.equals(i.getParent())) {
				item = i;
				break;
			}
		}
		assertNotNull(item);
		assertEquals("sku", item.getType());

		Order retrieved = Order.retrieve(created.getId(), relayRequestOptions);

		item = null;
		for (OrderItem i : created.getItems()) {
			if (skuId.equals(i.getParent())) {
				item = i;
				break;
			}
		}
		assertNotNull(item);
		assertEquals("sku", item.getType());

		Order updated = retrieved.update(ImmutableMap.<String,Object>of("metadata", ImmutableMap.of("foo", "bar")), relayRequestOptions);
		assertEquals("bar", updated.getMetadata().get("foo"));

		Order paid = updated.pay(ImmutableMap.<String,Object>of("source", defaultSourceParams), relayRequestOptions);
		assertEquals("paid", paid.getStatus());

		OrderReturn returned = paid.returnOrder(null, relayRequestOptions);
		assertEquals(paid.getId(), returned.getOrder());
	}

	@Test
	public void testGetAllExternalAccounts() throws StripeException {
		Account account = Account.create(defaultManagedAccountParams);
		Assert.assertNotNull(account);

		Map<String, Object> accountParams = new HashMap<String, Object>();
		accountParams.put("limit", 3);
		AccountCollection accountCollection = Account.all(accountParams);

		Assert.assertNotNull(accountCollection);
	}

	@Test
	public void testCountrySpecRetrieve() throws StripeException {
		String country = "US";
		CountrySpec retrievedCountrySpec = CountrySpec.retrieve(country);

		assertEquals(country, retrievedCountrySpec.getId());
		assertNotSame(retrievedCountrySpec.getSupportedPaymentCurrencies().size(), 0);
		assertNotSame(retrievedCountrySpec.getSupportedBankAccountCurrencies().size(), 0);
		assertNotSame(retrievedCountrySpec.getSupportedPaymentMethods().size(), 0);

		List<String> countryForBankAccountInUsd = retrievedCountrySpec.getSupportedBankAccountCurrencies().get("usd");
		assertNotSame(countryForBankAccountInUsd.size(), 0);

		VerificationFields verificationFields = retrievedCountrySpec.getVerificationFields();
		assertNotSame(verificationFields.getIndividual().getMinimum().size(), 0);

		CountrySpec retrievedCountrySpec2 = CountrySpec.retrieve(country);
		VerificationFields verificationFields2 = retrievedCountrySpec2.getVerificationFields();
		assert(verificationFields2.equals(verificationFields));

		CountrySpec retrievedCountrySpecFR = CountrySpec.retrieve("FR");
		VerificationFields verificationFieldsFR = retrievedCountrySpecFR.getVerificationFields();
		assert(!verificationFieldsFR.equals(verificationFields));
	}

	@Test
		public void testCountrySpecAll() throws StripeException {
		Integer limit = 3;
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", limit);
		CountrySpecCollection retrievedCountrySpecCollection = CountrySpec.list(listParams);

		assertEquals((Integer)retrievedCountrySpecCollection.getData().size(), limit);
	}
}
