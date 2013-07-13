package com.stripe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stripe.exception.CardException;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Balance;
import com.stripe.model.BankAccount;
import com.stripe.model.Card;
import com.stripe.model.Charge;
import com.stripe.model.Coupon;
import com.stripe.model.Customer;
import com.stripe.model.DeletedCoupon;
import com.stripe.model.DeletedCustomer;
import com.stripe.model.DeletedInvoiceItem;
import com.stripe.model.DeletedPlan;
import com.stripe.model.Event;
import com.stripe.model.Fee;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceItem;
import com.stripe.model.InvoiceLineItemCollection;
import com.stripe.model.Plan;
import com.stripe.model.Subscription;
import com.stripe.model.Token;
import com.stripe.model.Transfer;
import com.stripe.model.Recipient;
import com.stripe.model.DeletedRecipient;

public class StripeTest {
	static HashMap<String, Object> defaultCardParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultChargeParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultCustomerParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultPlanParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultCouponParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultTokenParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultBankAccountParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultTransferParams = new HashMap<String, Object>();
	static HashMap<String, Object> defaultRecipientParams = new HashMap<String, Object>();

	static String getUniquePlanId() {
		return String.format("JAVA-PLAN-%s", UUID.randomUUID());
	}

	static String getUniqueCouponId() {
		return String.format("JAVA-COUPON-%s", UUID.randomUUID());
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
		Customer customer = Customer.create(customerWithPlanParams);
		return customer;
	}

	static Recipient createDefaultRecipient()
			throws StripeException {
		Map<String, Object> recipientParams = new HashMap<String, Object>();
		recipientParams.putAll(defaultRecipientParams);
		Recipient recipient = Recipient.create(recipientParams);
		return recipient;
	}

	@BeforeClass
	public static void setUp() {
		Stripe.apiKey = "tGN0bIwXnHdwOa85VABjPdSn8nWY7G7I"; // stripe public
															// test key

		defaultCardParams.put("number", "4242424242424242");
		defaultCardParams.put("exp_month", 12);
		defaultCardParams.put("exp_year", 2015);
		defaultCardParams.put("cvc", "123");
		defaultCardParams.put("name", "Java Bindings Cardholder");
		defaultCardParams.put("address_line1", "140 2nd Street");
		defaultCardParams.put("address_line2", "4th Floor");
		defaultCardParams.put("address_city", "San Francisco");
		defaultCardParams.put("address_zip", "94105");
		defaultCardParams.put("address_state", "CA");
		defaultCardParams.put("address_country", "USA");

		defaultChargeParams.put("amount", 100);
		defaultChargeParams.put("currency", "usd");
		defaultChargeParams.put("card", defaultCardParams);

		defaultTokenParams.put("card", defaultCardParams);

		defaultCustomerParams.put("card", defaultCardParams);
		defaultCustomerParams.put("description", "Java Bindings Customer");

		defaultPlanParams.put("amount", 100);
		defaultPlanParams.put("currency", "usd");
		defaultPlanParams.put("interval", "month");
		defaultPlanParams.put("interval_count", 2);
		defaultPlanParams.put("name", "Java Bindings Plan");

		defaultCouponParams.put("duration", "once");
		defaultCouponParams.put("percent_off", 10);

		defaultBankAccountParams.put("country", "US");
		defaultBankAccountParams.put("routing_number", "110000000");
		defaultBankAccountParams.put("account_number", "000123456789");

		defaultRecipientParams.put("name", "Java Test");
		defaultRecipientParams.put("type", "individual");
		defaultRecipientParams.put("tax_id", "000000000");
		defaultRecipientParams.put("bank_account", defaultBankAccountParams);

		defaultTransferParams.put("amount", 100);
		defaultTransferParams.put("currency", "usd");
	}

	@Test
	public void testAccountRetrieve() throws StripeException {
		Account retrievedAccount = Account.retrieve();
		assertEquals("test+bindings@stripe.com", retrievedAccount.getEmail());
		assertEquals(false, retrievedAccount.getChargeEnabled());
		assertEquals(false, retrievedAccount.getDetailsSubmitted());
		assertEquals(null, retrievedAccount.getStatementDescriptor());

		List<String> currencies = retrievedAccount.getCurrenciesSupported();
		assertEquals(1, currencies.size());
		assertEquals("USD", currencies.get(0));
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

		assertEquals(1, createdCharge.getFeeDetails().size());

		Fee fee = createdCharge.getFeeDetails().get(0);
		assertEquals("stripe_fee", fee.getType());
		assertEquals(createdCharge.getFee(), fee.getAmount());
		assertEquals(createdCharge.getCurrency(), fee.getCurrency());
		assertEquals(null, fee.getApplication());
	}

	@Test
	public void testChargeRetrieve() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge retrievedCharge = Charge.retrieve(createdCharge.getId());
		assertEquals(createdCharge.getCreated(), retrievedCharge.getCreated());
		assertEquals(createdCharge.getId(), retrievedCharge.getId());
	}

	@Test
	public void testChargeRefund() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge refundedCharge = createdCharge.refund();
		assertTrue(refundedCharge.getRefunded());
	}

	@Test
	public void testChargeCapture() throws StripeException {
		HashMap<String, Object> options = (HashMap<String, Object>)defaultChargeParams.clone();
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
		invalidCardParams.put("exp_year", 2015);
		invalidChargeParams.put("card", invalidCardParams);
		Charge.create(invalidChargeParams);
	}

	@Test
	public void testCustomerCreate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		assertEquals(customer.getDescription(), "Java Bindings Customer");
		List<Card> customerCards = customer.getCards().getData();
		assertEquals(1, customerCards.size());
		assertEquals("4242", customerCards.get(0).getLast4());
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
		assertEquals(customer.getSubscription().getPlan().getId(), plan.getId());
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
		assertEquals(customer.getSubscription().getStatus(), "active");
		Subscription canceledSubscription = customer.cancelSubscription();
		assertEquals(canceledSubscription.getStatus(), "canceled");
	}

	@Test
	public void testCancelSubscriptionAtPeriodEnd() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscription().getStatus(), "active");
		Map<String, Object> cancelParams = new HashMap<String, Object>();
		cancelParams.put("at_period_end", true);
		Subscription canceledSubscription = customer
				.cancelSubscription(cancelParams);
		assertEquals(canceledSubscription.getStatus(), "active");
		assertEquals(canceledSubscription.getCancelAtPeriodEnd(), true);
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
		assertFalse(lines == null);
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
	public void testUpcomingInvoice() throws Exception {
		Customer customer = Customer.create(defaultCustomerParams);
		createDefaultInvoiceItem(customer);
		Map<String, Object> upcomingParams = new HashMap<String, Object>();
		upcomingParams.put("customer", customer.getId());
		Invoice upcomingInvoice = Invoice.upcoming(upcomingParams);
		assertFalse(upcomingInvoice.getAttempted());
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
		Recipient recipient = Recipient.create(defaultRecipientParams);
		defaultTransferParams.put("recipient", recipient.getId());
		Transfer createdTransfer = Transfer.create(defaultTransferParams);
		assertEquals("pending", createdTransfer.getStatus());
		assertEquals(1, createdTransfer.getFeeDetails().size());
	}

	@Test
	public void testTransferRetrieve() throws StripeException {
		Recipient recipient = Recipient.create(defaultRecipientParams);
		defaultTransferParams.put("recipient", recipient.getId());
		Transfer createdTransfer = Transfer.create(defaultTransferParams);
		Transfer retrievedTransfer= Transfer.retrieve(createdTransfer.getId());
		assertEquals(createdTransfer.getDate(), retrievedTransfer.getDate());
		assertEquals(createdTransfer.getId(), retrievedTransfer.getId());
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
		assertEquals(true, retrievedRecipient.getActiveAccount() instanceof BankAccount);
		assertEquals(false, retrievedRecipient.getActiveAccount().getValidated());
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
	public void testRecipientDelete() throws StripeException {
		Recipient createdRecipient = Recipient.create(defaultRecipientParams);
		DeletedRecipient deletedRecipient = createdRecipient.delete();
		Recipient deletedRetrievedRecipient = Recipient.retrieve(createdRecipient.getId());
		assertTrue(deletedRecipient.getDeleted());
		assertEquals(deletedRecipient.getId(), createdRecipient.getId());
		assertTrue(deletedRetrievedRecipient.getDeleted());
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
		invalidCardParams.put("exp_year", 2015);
		invalidChargeParams.put("card", invalidCardParams);
		Charge.create(invalidChargeParams, Stripe.apiKey);
	}

	@Test
	public void testCustomerCreatePerCallAPIKey() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams,
				Stripe.apiKey);
		assertEquals(customer.getDescription(), "Java Bindings Customer");
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
		assertEquals(customer.getSubscription().getPlan().getId(), plan.getId());
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
		assertEquals(customer.getSubscription().getStatus(), "active");
		Subscription canceledSubscription = customer
				.cancelSubscription(Stripe.apiKey);
		assertEquals(canceledSubscription.getStatus(), "canceled");
	}

	@Test
	public void testCancelSubscriptionAtPeriodEndPerCallAPIKey()
			throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscription().getStatus(), "active");
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

}
