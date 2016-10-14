package com.stripe;

import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.MetadataStore;
import com.stripe.model.Plan;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BaseStripeFunctionalTest {
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
    public static StripeResponseGetter networkMock;


    public static String getYear() {
        Date date = new Date(); //Get current date
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR) + 1 +"";
    }

    public static String getUniqueEmail() {
        return String.format("test+bindings-%s@stripe.com", UUID.randomUUID().toString().substring(24));
    }

    public static String getUniquePlanId() {
        return String.format("MY-J-PLAN-%s", UUID.randomUUID().toString().substring(24));
    }

    public static String getUniqueCouponId() {
        return String.format("MY-J-COUPON-%s", UUID.randomUUID().toString().substring(24));
    }

    public static Map<String, Object> getUniquePlanParams() {
        Map<String, Object> uniqueParams = new HashMap<String, Object>();
        uniqueParams.putAll(defaultPlanParams);
        uniqueParams.put("id", getUniquePlanId());
        return uniqueParams;
    }

    public static Customer createDefaultCustomerWithPlan(Plan plan)
            throws StripeException {
        Map<String, Object> customerWithPlanParams = new HashMap<String, Object>();
        customerWithPlanParams.putAll(defaultCustomerParams);
        customerWithPlanParams.put("plan", plan.getId());
        return Customer.create(customerWithPlanParams);
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

    @Before
    public void before()
    {
        Stripe.apiVersion = null;
    }

    public void testMetadata(MetadataStore<?> object) throws StripeException {
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
    public void testAPIBase() throws StripeException {
        assertEquals("https://api.stripe.com", Stripe.getApiBase());
    }
}
