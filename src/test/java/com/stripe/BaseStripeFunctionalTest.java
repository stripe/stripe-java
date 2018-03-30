package com.stripe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.MetadataStore;
import com.stripe.model.Plan;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseStripeFunctionalTest {
  public static Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultPlanParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultPlanWithProductParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultServiceProductParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultCouponParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultTokenParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultBankAccountParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultRecipientParams = new HashMap<String, Object>();
  public static Map<String, Object> defaultManagedAccountParams = new HashMap<String, Object>();
  public static RequestOptions supportedRequestOptions;
  public static StripeResponseGetter networkMock;

  /**
   * Returns a string containing next year.
   */
  public static String getYear() {
    Date date = new Date(); //Get current date
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(date);
    return calendar.get(Calendar.YEAR) + 1 + "";
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

  /**
   * Returns the parameters to create a new unique plan.
   */
  public static Map<String, Object> getUniquePlanParams() {
    Map<String, Object> uniqueParams = new HashMap<String, Object>();
    uniqueParams.putAll(defaultPlanParams);
    uniqueParams.put("id", getUniquePlanId());
    return uniqueParams;
  }

  /**
   * Creates a new customer object with a subscription to the given plan.
   */
  public static Customer createDefaultCustomerWithPlan(Plan plan)
      throws StripeException {
    Map<String, Object> customerWithPlanParams = new HashMap<String, Object>();
    customerWithPlanParams.putAll(defaultCustomerParams);
    customerWithPlanParams.put("plan", plan.getId());
    return Customer.create(customerWithPlanParams);
  }

  /**
   * Prepares a Stripe functional test: sets the API key and version, sets default params fixtures.
   */
  @BeforeClass
  public static void setUp() {
    Stripe.apiKey = "tGN0bIwXnHdwOa85VABjPdSn8nWY7G7I"; // stripe public

    // Peg the API version so that it can be varied independently of the
    // one set on the test account.
    Stripe.apiVersion = "2018-02-06";

    // test key
    supportedRequestOptions = RequestOptions.builder().setStripeVersion(Stripe.apiVersion).build();

    defaultChargeParams.put("amount", 100);
    defaultChargeParams.put("currency", "usd");
    defaultChargeParams.put("source", "tok_visa");

    defaultCustomerParams.put("source", "tok_visa");
    defaultCustomerParams.put("description", "J Bindings Customer");

    defaultPlanParams.put("amount", 100);
    defaultPlanParams.put("currency", "usd");
    defaultPlanParams.put("interval", "month");
    defaultPlanParams.put("interval_count", 2);
    defaultPlanParams.put("name", "J Bindings Plan");

    Map<String, Object> productParams = new HashMap<String, Object>();
    productParams.put("name", "Kittens on Demand");
    defaultPlanWithProductParams.put("product", productParams);
    defaultPlanWithProductParams.put("amount", 200);
    defaultPlanWithProductParams.put("currency", "usd");
    defaultPlanWithProductParams.put("interval", "month");
    defaultPlanWithProductParams.put("interval_count", 2);
    defaultPlanWithProductParams.put("nickname", "Two Month Kitten Plan");

    defaultServiceProductParams.put("type", "service");
    defaultServiceProductParams.put("name", "Run of the Mill Product");
    defaultServiceProductParams.put("statement_descriptor", "Run of the Mill");

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
    defaultRecipientParams.put("card", "tok_visa_debit");

    defaultManagedAccountParams.put("managed", true);
    defaultManagedAccountParams.put("country", "US");
    defaultManagedAccountParams.put("default_currency", "usd");
  }

  @Before
  public void before() {
    Stripe.apiVersion = null;
  }

  protected void testMetadata(MetadataStore<?> object) throws StripeException {
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
