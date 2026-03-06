package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class GsonRoundTripTest extends BaseStripeTest {

  @Test
  public void testUnexpandedExpandableField() {
    String json = "{\"id\":\"in_123\",\"object\":\"invoice\",\"customer\":\"cus_456\"}";
    Invoice invoice = ApiResource.GSON.fromJson(json, Invoice.class);

    assertEquals("cus_456", invoice.getCustomer());
    assertNull(invoice.getCustomerObject());

    String serialized = ApiResource.GSON.toJson(invoice);
    Invoice roundTripped = ApiResource.GSON.fromJson(serialized, Invoice.class);

    assertEquals("cus_456", roundTripped.getCustomer());
    assertNull(roundTripped.getCustomerObject());
  }

  @Test
  public void testExpandedExpandableField() {
    String json =
        "{\"id\":\"in_123\",\"object\":\"invoice\","
            + "\"customer\":{\"id\":\"cus_456\",\"object\":\"customer\","
            + "\"name\":\"John Doe\",\"metadata\":{\"key\":\"value\"}}}";
    Invoice invoice = ApiResource.GSON.fromJson(json, Invoice.class);

    assertEquals("cus_456", invoice.getCustomer());
    Customer customer = invoice.getCustomerObject();
    assertNotNull(customer);
    assertEquals("cus_456", customer.getId());
    assertEquals("John Doe", customer.getName());

    String serialized = ApiResource.GSON.toJson(invoice);
    Invoice roundTripped = ApiResource.GSON.fromJson(serialized, Invoice.class);

    assertEquals("cus_456", roundTripped.getCustomer());
    Customer rtCustomer = roundTripped.getCustomerObject();
    assertNotNull(rtCustomer);
    assertEquals("cus_456", rtCustomer.getId());
    assertEquals("John Doe", rtCustomer.getName());
    assertEquals("value", rtCustomer.getMetadata().get("key"));
  }

  @Test
  public void testNullExpandableField() {
    String json = "{\"id\":\"in_123\",\"object\":\"invoice\",\"customer\":null}";
    Invoice invoice = ApiResource.GSON.fromJson(json, Invoice.class);

    assertNull(invoice.getCustomer());
    assertNull(invoice.getCustomerObject());

    String serialized = ApiResource.GSON.toJson(invoice);
    Invoice roundTripped = ApiResource.GSON.fromJson(serialized, Invoice.class);

    assertNull(roundTripped.getCustomer());
    assertNull(roundTripped.getCustomerObject());
  }

  @Test
  public void testPaymentSourceDirectField() {
    // Charge.source is a direct PaymentSource field (not ExpandableField)
    String json =
        "{\"id\":\"ch_123\",\"object\":\"charge\","
            + "\"source\":{\"id\":\"card_789\",\"object\":\"card\","
            + "\"brand\":\"Visa\",\"last4\":\"4242\"}}";
    Charge charge = ApiResource.GSON.fromJson(json, Charge.class);

    assertNotNull(charge.getSource());
    assertTrue(charge.getSource() instanceof Card);
    assertEquals("card_789", charge.getSource().getId());

    String serialized = ApiResource.GSON.toJson(charge);
    Charge roundTripped = ApiResource.GSON.fromJson(serialized, Charge.class);

    assertNotNull(roundTripped.getSource());
    assertTrue(roundTripped.getSource() instanceof Card);
    assertEquals("card_789", roundTripped.getSource().getId());
    assertEquals("Visa", ((Card) roundTripped.getSource()).getBrand());
    assertEquals("4242", ((Card) roundTripped.getSource()).getLast4());
  }

  @Test
  public void testStripeRawJsonObjectRoundTrip() {
    String innerJson = "{\"id\":\"unknown_123\",\"object\":\"unknown_type\",\"foo\":\"bar\"}";
    StripeRawJsonObject raw = new StripeRawJsonObject();
    raw.json = JsonParser.parseString(innerJson).getAsJsonObject();

    String serialized = ApiResource.GSON.toJson(raw);
    // Should serialize as the raw JSON, not wrapped in {"json":{...}}
    JsonObject parsed = JsonParser.parseString(serialized).getAsJsonObject();
    assertEquals("unknown_123", parsed.get("id").getAsString());
    assertEquals("bar", parsed.get("foo").getAsString());

    StripeRawJsonObject roundTripped =
        ApiResource.GSON.fromJson(serialized, StripeRawJsonObject.class);
    assertNotNull(roundTripped.json);
    assertEquals("unknown_123", roundTripped.json.get("id").getAsString());
    assertEquals("bar", roundTripped.json.get("foo").getAsString());
  }

  @Test
  public void testInvoiceWithExpandedCustomerRoundTrip() throws Exception {
    // Realistic scenario from RUN_DEVSDK-2253
    final String[] expansions = {"customer"};
    final String data = getFixture("/v1/invoices/in_123", expansions);
    final Invoice original = ApiResource.GSON.fromJson(data, Invoice.class);

    assertNotNull(original.getCustomerObject());
    assertEquals(original.getCustomer(), original.getCustomerObject().getId());

    String serialized = ApiResource.GSON.toJson(original);
    Invoice roundTripped = ApiResource.GSON.fromJson(serialized, Invoice.class);

    assertEquals(original.getId(), roundTripped.getId());
    assertEquals(original.getCustomer(), roundTripped.getCustomer());
    assertNotNull(roundTripped.getCustomerObject());
    assertEquals(original.getCustomerObject().getId(), roundTripped.getCustomerObject().getId());
  }

  @Test
  public void testSubscriptionWithDefaultSourceRoundTrip() throws Exception {
    // Realistic scenario from DEVSDK-2319
    final String[] expansions = {"default_source"};
    final String data = getFixture("/v1/subscriptions/sub_123", expansions);
    final Subscription original = ApiResource.GSON.fromJson(data, Subscription.class);

    String serialized = ApiResource.GSON.toJson(original);
    Subscription roundTripped = ApiResource.GSON.fromJson(serialized, Subscription.class);

    assertEquals(original.getId(), roundTripped.getId());
  }
}
