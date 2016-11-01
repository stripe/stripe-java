package com.stripe.functional;

import com.google.common.collect.ImmutableMap;
import com.stripe.Stripe;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.Card;
import com.stripe.model.Charge;
import com.stripe.model.ShippingDetails;
import org.junit.Test;
import java.util.*;
import com.stripe.BaseStripeFunctionalTest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ChargeTest extends BaseStripeFunctionalTest {

	@Test
	public void testChargeCreate() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		assertFalse(createdCharge.getRefunded());
	}

	@Test
	public void testChargeCreateExpandBalanceTransaction() throws StripeException {
		String[] expand = new String[]{"balance_transaction"};
		Map<String, Object> params = defaultChargeParams;
		params.put("expand[]", "balance_transaction");
		Charge createdCharge = Charge.create(params);
		assertFalse(createdCharge.getRefunded());
		//Check expanded BT
		assertEquals(createdCharge.getBalanceTransactionObject().getId(), createdCharge.getBalanceTransaction());
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
	public void testChargeRetrieve() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Charge retrievedCharge = Charge.retrieve(createdCharge.getId());
		assertEquals(createdCharge.getCreated(), retrievedCharge.getCreated());
		assertEquals(createdCharge.getId(), retrievedCharge.getId());
		assertNotNull(retrievedCharge.getSource());
		assertEquals("card", retrievedCharge.getSource().getObject());
		Card card = (Card) retrievedCharge.getSource();
		assertEquals(defaultCardParams.get("address_city"), card.getAddressCity());
		//BT Checks:
		assertNotNull(retrievedCharge.getBalanceTransaction());
		assertNull(retrievedCharge.getBalanceTransactionObject());
	}

	@Test
	public void testChargeRetrieveWithBalanceTransaction() throws StripeException {
		Charge createdCharge = Charge.create(defaultChargeParams);
		Map<String, Object> retrieveParams = new HashMap<String, Object>();
		retrieveParams.put("expand[]", "balance_transaction");
		Charge retrievedCharge = Charge.retrieve(createdCharge.getId(), retrieveParams, supportedRequestOptions);

		//Check basics
		assertEquals(retrievedCharge.getCreated(), retrievedCharge.getCreated());
		assertEquals(retrievedCharge.getId(), retrievedCharge.getId());

		//Check expanded BT
		assertEquals(retrievedCharge.getBalanceTransactionObject().getId(), createdCharge.getBalanceTransaction());
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
	public void testChargeCapture() throws StripeException {
		Map<String, Object> options = new HashMap<String, Object>(defaultChargeParams);
		options.put("capture", false);

		Charge created = Charge.create(options);
		assertFalse(created.getCaptured());

		Charge captured = created.capture();
		assertTrue(captured.getCaptured());
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

	// ChargeCollection Tests:
	@Test
	public void testChargeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		List<Charge> charges = Charge.all(listParams).getData();
		assertEquals(charges.size(), 1);
	}

	@Test
	public void testChargeListExpandBalanceTransaction() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 1);
		listParams.put("expand[]", "data.balance_transaction");
		List<Charge> charges = Charge.list(listParams).getData();
		assertEquals(charges.size(), 1);
		//Check expanded BT
		Charge c = charges.get(0);
		assertEquals(c.getBalanceTransactionObject().getId(), c.getBalanceTransaction());
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
		final Long REFUND_AMOUNT = 50l;
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
	public void testChargeMetadata() throws StripeException {
		testMetadata(Charge.create(defaultChargeParams));
	}

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
}
