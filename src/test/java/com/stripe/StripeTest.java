package com.stripe;

import com.stripe.exception.StripeException;
import com.stripe.model.ApplePayDomain;
import com.stripe.model.ApplicationFee;
import com.stripe.model.Balance;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionCollection;
import com.stripe.model.Card;
import com.stripe.model.Charge;
import com.stripe.model.CountrySpec;
import com.stripe.model.CountrySpecCollection;
import com.stripe.model.Customer;
import com.stripe.model.DeletedApplePayDomain;
import com.stripe.model.MetadataStore;
import com.stripe.model.Source;
import com.stripe.model.VerificationFields;
import com.stripe.net.RequestOptions;

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

	static String getUniquePlanId() {
		return String.format("MY-J-PLAN-%s", UUID.randomUUID().toString().substring(24));
	}

	static Map<String, Object> getApplePayDomainParams() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
		Random rand = new Random();
		Integer subdomain = rand.nextInt(Integer.MAX_VALUE);
		params.put("domain_name", "subdomain" + subdomain.toString() + ".example.com");
		return params;
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

	// ApplicationFee Tests:
	@Test
	public void testApplicationFeeList() throws StripeException {
		Map<String, Object> listParams = new HashMap<String, Object>();
		listParams.put("count", 0);
		List<ApplicationFee> fees = ApplicationFee.all(listParams).getData();
		assertEquals(fees.size(), 0);
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
	public void testCardMetadata() throws StripeException {
		Customer customer = Customer.create(defaultCustomerParams);
		Map<String, Object> creationParams = new HashMap<String, Object>();
		creationParams.put("card", defaultCardParams);
		testMetadata(customer.createCard(creationParams));
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
