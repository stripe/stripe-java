package com.stripe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stripe.exception.CardException;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.DeletedCustomer;
import com.stripe.model.DeletedInvoiceItem;
import com.stripe.model.DeletedPlan;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceItem;
import com.stripe.model.Plan;
import com.stripe.model.Subscription;
import com.stripe.model.Token;

public class StripeTest
{
	static Map<String, Object> defaultCardParams = new HashMap<String, Object>();
	static Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
	static Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
	static Map<String, Object> defaultPlanParams = new HashMap<String, Object>();

	static String getUniquePlanId() { return String.format("JAVA-BINDINGS-PLAN-%s", UUID.randomUUID()); }
	
	static Map<String, Object> getUniquePlanParams() {
		Map<String, Object> uniqueParams = new HashMap<String, Object>();
		uniqueParams.putAll(defaultPlanParams);
		uniqueParams.put("id", getUniquePlanId());
		return uniqueParams;
	}
	
	static InvoiceItem createDefaultInvoiceItem(Customer customer) throws StripeException {
		Map<String, Object> invoiceItemParams = new HashMap<String, Object>();
		invoiceItemParams.put("amount", 100);
		invoiceItemParams.put("currency", "usd");
		invoiceItemParams.put("customer", customer.getId());
		return InvoiceItem.create(invoiceItemParams);
	}
	
	static Customer createDefaultCustomerWithPlan(Plan plan) throws StripeException {
		Map<String, Object> customerWithPlanParams = new HashMap<String, Object>();
		customerWithPlanParams.putAll(defaultCustomerParams);
		customerWithPlanParams.put("plan", plan.getId());
		Customer customer = Customer.create(customerWithPlanParams);
		return customer;
	}
	@BeforeClass public static void setUp() { 
		Stripe.apiKey = "vtUQeOtUnYr7PGCLQ96Ul4zqpDUO4sOE"; //stripe public test key

		defaultCardParams.put("number", "4242424242424242");
		defaultCardParams.put("exp_month", 12);
		defaultCardParams.put("exp_year", 2015);
		defaultCardParams.put("cvc", "123");
		defaultCardParams.put("name", "Java Bindings Cardholder");
		defaultCardParams.put("address_line1", "522 Ramona St");
		defaultCardParams.put("address_line2", "Palo Alto");
		defaultCardParams.put("address_zip", "94301");
		defaultCardParams.put("address_state", "CA");
		defaultCardParams.put("address_country", "USA");
		
		defaultChargeParams.put("amount", 100);
		defaultChargeParams.put("currency", "usd");
		defaultChargeParams.put("card", defaultCardParams);
		
		defaultCustomerParams.put("card", defaultCardParams);
		defaultCustomerParams.put("description", "Java Bindings Customer");
		
		defaultPlanParams.put("amount", 100);
		defaultPlanParams.put("currency", "usd");
		defaultPlanParams.put("interval", "month");
		defaultPlanParams.put("name", "Java Bindings Plan");
	}
	
	@Test public void testChargeCreate() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		assertFalse(createdCharge.getRefunded());
	}
	
	@Test public void testChargeRetrieve() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge retrievedCharge = Charge.retrieve(createdCharge.getId());
		assertEquals(createdCharge.getCreated(), retrievedCharge.getCreated());
		assertEquals(createdCharge.getId(), retrievedCharge.getId());
	}
	
	@Test public void testChargeRefund() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge refundedCharge = createdCharge.refund();
		assertTrue(refundedCharge.getRefunded());
	}
	
	@Test public void testChargeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Charge> charges = Charge.all(listParams).getData();
		assertEquals(charges.size(), 1);
	}
	
	@Test(expected=CardException.class)
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
	
	@Test public void testCustomerCreate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		assertEquals(customer.getActiveCard().getLast4(), "4242");
	}
	
	@Test public void testCustomerRetrieve() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		Customer retrievedCustomer = Customer.retrieve(createdCustomer.getId());
		assertEquals(createdCustomer.getCreated(), retrievedCustomer.getCreated());
		assertEquals(createdCustomer.getId(), retrievedCustomer.getId());
	}
	
	@Test public void testCustomerList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Customer> Customers = Customer.all(listParams).getData();
		assertEquals(Customers.size(), 1);
	}
	
	@Test public void testCustomerUpdate() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "Updated Description");
		Customer updatedCustomer = createdCustomer.update(updateParams);
		assertEquals(updatedCustomer.getDescription(), "Updated Description");
	}
	
	@Test public void testCustomerDelete() throws StripeException {
		Customer createdCustomer = Customer.create(defaultCustomerParams);
		DeletedCustomer deletedCustomer = createdCustomer.delete();
		assertTrue(deletedCustomer.getDeleted());
		assertEquals(deletedCustomer.getId(), createdCustomer.getId());
	}
	
	@Test public void testPlanCreate() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		assertEquals(plan.getInterval(), "month");
	}
	
	@Test public void testPlanRetrieve() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams());
		Plan retrievedPlan = Plan.retrieve(createdPlan.getId());
		assertEquals(createdPlan.getId(), retrievedPlan.getId());
	}
	
	@Test public void testPlanList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Plan> Plans = Plan.all(listParams).getData();
		assertEquals(Plans.size(), 1);
	}
	
	@Test public void testPlanDelete() throws StripeException {
		Plan createdPlan = Plan.create(getUniquePlanParams());
		DeletedPlan deletedPlan = createdPlan.delete();
		assertTrue(deletedPlan.getDeleted());
		assertEquals(deletedPlan.getId(), createdPlan.getId());
	}
	
	@Test public void testCustomerCreateWithPlan() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscription().getPlan().getId(), plan.getId());
	}
	
	@Test public void testUpdateSubscription() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = Customer.create(defaultCustomerParams);
		Map<String, Object> subscriptionParams = new HashMap<String, Object>();
		subscriptionParams.put("plan", plan.getId());
		Subscription sub = customer.updateSubscription(subscriptionParams);
		assertEquals(sub.getPlan().getId(), plan.getId());
		assertEquals(sub.getCustomer(), customer.getId());
	}
	
	@Test public void testCancelSubscription() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		assertEquals(customer.getSubscription().getStatus(), "active");
		Subscription canceledSubscription = customer.cancelSubscription(null);
		assertEquals(canceledSubscription.getStatus(), "canceled");
	}
	
	@Test public void testInvoiceItemCreate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem invoiceItem = createDefaultInvoiceItem(customer);
		assertTrue(invoiceItem.getAmount() == 100);
	}
	
	@Test public void testInvoiceItemRetrieve() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		InvoiceItem retrievedInvoiceItem = InvoiceItem.retrieve(createdInvoiceItem.getId());
		assertEquals(createdInvoiceItem.getId(), retrievedInvoiceItem.getId());
	}
	
	@Test public void testInvoiceItemList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<InvoiceItem> InvoiceItems = InvoiceItem.all(listParams).getData();
		assertEquals(InvoiceItems.size(), 1);
	}
	
	@Test public void testInvoiceItemUpdate() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		Map<String, Object> updateParams = new HashMap<String, Object>();
		updateParams.put("description", "Updated Description");
		updateParams.put("amount", 200);
		updateParams.put("currency", "usd");
		InvoiceItem updatedInvoiceItem = createdInvoiceItem.update(updateParams);
		assertTrue(updatedInvoiceItem.getAmount() == 200);
		assertEquals(updatedInvoiceItem.getDescription(), "Updated Description");
	}
	
	@Test public void testInvoiceItemDelete() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
		DeletedInvoiceItem deletedInvoiceItem = createdInvoiceItem.delete();
		assertTrue(deletedInvoiceItem.getDeleted());
		assertEquals(deletedInvoiceItem.getId(), createdInvoiceItem.getId());
	}
	
	@Test public void testInvoiceListAndRetrieve() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		createDefaultCustomerWithPlan(plan);
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		Invoice createdInvoice = Invoice.all(listParams).getData().get(0);
	    Invoice retrievedInvoice = Invoice.retrieve(createdInvoice.getId());
	    assertEquals(createdInvoice.getId(), retrievedInvoice.getId());
	}
	
	@Test public void testInvoiceRetrieveForCustomer() throws StripeException {
		Plan plan = Plan.create(getUniquePlanParams());
		Customer customer = createDefaultCustomerWithPlan(plan);
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("customer", customer.getId());
		listParams.put("count", 1);
		Invoice invoice = Invoice.all(listParams).getData().get(0);
	    assertEquals(invoice.getCustomer(), customer.getId());
	}
	
	@Test public void testUpcomingInvoice() throws Exception {
		Customer customer = Customer.create(defaultCustomerParams);
		createDefaultInvoiceItem(customer);
		Map<String, Object> upcomingParams = new HashMap<String, Object>();
		upcomingParams.put("customer", customer.getId());
		Invoice upcomingInvoice = Invoice.upcoming(upcomingParams);
		assertFalse(upcomingInvoice.getAttempted());
	}
	
	@Test public void testTokenCreate() throws StripeException {
		Token token = Token.create(defaultChargeParams);
		assertFalse(token.getUsed());
	}
	
	@Test public void testTokenRetrieve() throws StripeException {
		Token createdToken = Token.create(defaultChargeParams);
		Token retrievedToken = Token.retrieve(createdToken.getId());
		assertEquals(createdToken.getId(), retrievedToken.getId());
	}
	
	@Test public void testTokenUse() throws StripeException {
		Token createdToken = Token.create(defaultChargeParams);
		Map<String, Object> chargeWithTokenParams = new HashMap<String, Object>();
		chargeWithTokenParams.put("amount", 199);
		chargeWithTokenParams.put("currency", "usd");
		chargeWithTokenParams.put("card", createdToken.getId());
		Charge.create(chargeWithTokenParams);
		Token retrievedToken = Token.retrieve(createdToken.getId());
		assertTrue(retrievedToken.getUsed());
	}
}
