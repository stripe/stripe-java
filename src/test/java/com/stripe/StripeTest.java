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
import com.stripe.model.AlipayAccount;
import com.stripe.model.ApplePayDomain;
import com.stripe.model.ApplicationFee;
import com.stripe.model.Balance;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionCollection;
import com.stripe.model.BitcoinReceiver;
import com.stripe.model.BitcoinTransaction;
import com.stripe.model.Card;
import com.stripe.model.Charge;
import com.stripe.model.CountrySpec;
import com.stripe.model.CountrySpecCollection;
import com.stripe.model.Customer;
import com.stripe.model.DeletedApplePayDomain;
import com.stripe.model.DeletedBitcoinReceiver;
import com.stripe.model.DeletedCustomer;
import com.stripe.model.DeletedPlan;
import com.stripe.model.DeletedProduct;
import com.stripe.model.DeletedSKU;
import com.stripe.model.Event;
import com.stripe.model.ExternalAccount;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceItem;
import com.stripe.model.MetadataStore;
import com.stripe.model.Order;
import com.stripe.model.OrderReturn;
import com.stripe.model.OrderItem;
import com.stripe.model.Plan;
import com.stripe.model.Product;
import com.stripe.model.Recipient;
import com.stripe.model.Source;
import com.stripe.model.SKU;
import com.stripe.model.Subscription;
import com.stripe.model.Token;
import com.stripe.model.VerificationFields;

import com.stripe.net.RequestOptions;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Random;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StripeTest {
	public static Map<String, Object> defaultCardParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultSourceParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultDebitCardParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultPlanParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultCouponParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultTokenParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultDebitTokenParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultBankAccountParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultRecipientParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultBitcoinReceiverParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultAlipayTokenParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultManagedAccountParams = new HashMap<String, Object>();
	public static RequestOptions supportedRequestOptions;

	public static String getYear() {
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

	static Map<String, Object> getInvoiceItemParams() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
			Customer customer = Customer.create(defaultCustomerParams);
		params.put("amount", 100);
		params.put("currency", "usd");
		params.put("customer", customer.getId());
		return params;
	}

	static Map<String, Object> getApplePayDomainParams() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
		Random rand = new Random();
		Integer subdomain = rand.nextInt(Integer.MAX_VALUE);
		params.put("domain_name", "subdomain" + subdomain.toString() + ".example.com");
		return params;
	}

	static Customer createDefaultCustomerWithPlan(Plan plan)
			throws StripeException {
		Map<String, Object> customerWithPlanParams = new HashMap<String, Object>();
		customerWithPlanParams.putAll(defaultCustomerParams);
		customerWithPlanParams.put("plan", plan.getId());
		return Customer.create(customerWithPlanParams);
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

	@Test
	public void testAPIBase() throws StripeException {
		assertEquals("https://api.stripe.com", Stripe.getApiBase());
	}

	// Account Tests:
	@Test
	public void testAccountRetrieve() throws StripeException {
		Account retrievedAccount = Account.retrieve();
		assertTrue(Pattern.matches("\\A.*@stripe.com\\z", retrievedAccount.getEmail()));
	}


	// Balance Tests:
	@Test
	public void testBalanceRetrieve() throws StripeException {
		Balance retrievedBalance = Balance.retrieve();
		assertEquals(false, retrievedBalance.getLivemode());
		assertEquals(1, retrievedBalance.getPending().size());
		assertEquals(1, retrievedBalance.getAvailable().size());
	}

	// BalanceTransaction Test:
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

	// ChargeCollection Tests:
	@Test
	public void testChargeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Charge> charges = Charge.all(listParams).getData();
		assertEquals(charges.size(), 1);
	}

	// ApplicationFee Tests:
	@Test
	public void testApplicationFeeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 0);
		List<ApplicationFee> fees = ApplicationFee.all(listParams).getData();
		assertEquals(fees.size(), 0);
	}

	// Event Tests:
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

	@Test
	public void testSourceCreateRead() throws StripeException {
		RequestOptions sourceRequestOptions = RequestOptions.builder()
				.setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
				.build();

		Map<String, Object> receiverParams = new HashMap<String, Object>();
		receiverParams.put("refund_attributes_method", "manual");

		Map<String, Object> sourceCreateParams = new HashMap<String, Object>();
		sourceCreateParams.put("type", "bitcoin");
		sourceCreateParams.put("currency", "usd");
		sourceCreateParams.put("amount", 1000);
		sourceCreateParams.put("receiver", receiverParams);

		Source created = Source.create(sourceCreateParams, sourceRequestOptions);
		assertEquals("bitcoin", created.getType());
		assertEquals("receiver", created.getFlow());

		// TODO: It's obviously very unpleasant to have all strings
		// here. The plan is to type-check these once any method makes
		// it to public beta. For now, unfortunately, the user will have
		// to actually cast the data to what they want.
		assertEquals(0, Integer.parseInt(created.getTypeData().get("amount_charged")));

		Source retrieved = Source.retrieve(created.getId(), sourceRequestOptions);
		assertEquals(created.getId(), retrieved.getId());
	}

	@Test
	public void testApplePayDomainCreate() throws StripeException {
		ApplePayDomain domain = ApplePayDomain.create(getApplePayDomainParams());
		assertTrue(domain.getDomainName().contains("example.com"));
	}

	@Test
	public void testApplePayDomainRetrieve() throws StripeException {
		ApplePayDomain createdDomain = ApplePayDomain.create(getApplePayDomainParams());
		ApplePayDomain retrievedDomain = ApplePayDomain.retrieve(createdDomain.getId());
		assertEquals(createdDomain.getId(), retrievedDomain.getId());
	}

	@Test
	public void testApplePayDomainList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<ApplePayDomain> Domains = ApplePayDomain.list(listParams).getData();
		assertEquals(Domains.size(), 1);
	}

	@Test
	public void testApplePayDomainDelete() throws StripeException {
		ApplePayDomain createdDomain = ApplePayDomain.create(getApplePayDomainParams());
		DeletedApplePayDomain deletedDomain = createdDomain.delete();
		assertTrue(deletedDomain.getDeleted());
		assertEquals(deletedDomain.getId(), createdDomain.getId());
	}
}
