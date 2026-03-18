package com.stripe.service;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerUpdateParams;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link CustomerService#serializeBatchUpdate} which serializes customer update requests
 * into JSONL lines for batch job uploads.
 *
 * <p>These tests don't make HTTP calls — they only exercise the local serialization logic. We
 * extend BaseStripeTest because CustomerService requires a StripeResponseGetter to be instantiated.
 */
public class CustomerServiceSerializeBatchTest extends BaseStripeTest {

  private CustomerService service() {
    return mockClient.customers();
  }

  @Test
  public void testSerializeBatchUpdate_basicStructure() throws StripeException {
    CustomerUpdateParams params =
        CustomerUpdateParams.builder().setDescription("test customer").build();

    String json = service().serializeBatchUpdate("cus_123", params);
    JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

    // id is a valid UUID
    String id = obj.get("id").getAsString();
    assertDoesNotThrow(() -> UUID.fromString(id), "id should be a valid UUID");

    // path_params
    JsonObject pathParams = obj.getAsJsonObject("path_params");
    assertEquals("cus_123", pathParams.get("customer").getAsString());

    // params contains the description
    JsonObject paramsObj = obj.getAsJsonObject("params");
    assertEquals("test customer", paramsObj.get("description").getAsString());

    // stripe_version equals the global API version
    assertEquals(Stripe.API_VERSION, obj.get("stripe_version").getAsString());

    // context key is absent (not null — absent entirely)
    assertFalse(obj.has("context"), "context should be absent when no stripeContext is set");

    // Key ordering preserved by LinkedHashMap: id, path_params, params, stripe_version
    List<String> keys = new ArrayList<>(obj.keySet());
    assertEquals("id", keys.get(0));
    assertEquals("path_params", keys.get(1));
    assertEquals("params", keys.get(2));
    assertEquals("stripe_version", keys.get(3));
    assertEquals(4, keys.size());
  }

  @Test
  public void testSerializeBatchUpdate_uniqueIds() throws StripeException {
    CustomerUpdateParams params = CustomerUpdateParams.builder().setDescription("test").build();

    String json1 = service().serializeBatchUpdate("cus_123", params);
    String json2 = service().serializeBatchUpdate("cus_123", params);

    JsonObject obj1 = JsonParser.parseString(json1).getAsJsonObject();
    JsonObject obj2 = JsonParser.parseString(json2).getAsJsonObject();

    assertNotEquals(
        obj1.get("id").getAsString(),
        obj2.get("id").getAsString(),
        "Each call should generate a unique id");
  }

  @Test
  public void testSerializeBatchUpdate_requestOptionsVersionAlwaysGlobal() throws StripeException {
    // RequestOptions.getStripeVersion() is initialized to
    // Stripe.getStripeVersionWithBetaHeaders() at field declaration time and has no setter.
    // So passing any RequestOptions — even with just stripeContext set — will still produce
    // Stripe.API_VERSION as the stripe_version in the output.
    CustomerUpdateParams params = CustomerUpdateParams.builder().setDescription("test").build();
    RequestOptions options = RequestOptions.builder().setStripeContext("acct_456").build();

    String json = service().serializeBatchUpdate("cus_123", params, options);
    JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

    assertEquals(
        Stripe.API_VERSION,
        obj.get("stripe_version").getAsString(),
        "stripe_version should be the global API version regardless of RequestOptions");
  }

  @Test
  public void testSerializeBatchUpdate_withStripeContext() throws StripeException {
    CustomerUpdateParams params = CustomerUpdateParams.builder().setDescription("test").build();
    RequestOptions options = RequestOptions.builder().setStripeContext("acct_123").build();

    String json = service().serializeBatchUpdate("cus_123", params, options);
    JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

    assertTrue(obj.has("context"), "context should be present when stripeContext is set");
    assertEquals("acct_123", obj.get("context").getAsString());
  }

  @Test
  public void testSerializeBatchUpdate_nullParams() throws StripeException {
    String json = service().serializeBatchUpdate("cus_123", null);
    JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

    // ApiResource.GSON omits null Map values, so the "params" key is absent.
    // Note: this means the backend must tolerate a missing "params" field for null-param calls.
    assertFalse(obj.has("params"), "params key should be absent (GSON omits null map values)");

    // Other fields should still be correct
    assertDoesNotThrow(() -> UUID.fromString(obj.get("id").getAsString()));
    assertEquals("cus_123", obj.getAsJsonObject("path_params").get("customer").getAsString());
    assertEquals(Stripe.API_VERSION, obj.get("stripe_version").getAsString());
  }

  @Test
  public void testSerializeBatchUpdate_withMetadata() throws StripeException {
    CustomerUpdateParams params =
        CustomerUpdateParams.builder()
            .putMetadata("key1", "value1")
            .putMetadata("key2", "value2")
            .build();

    String json = service().serializeBatchUpdate("cus_123", params);
    JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

    JsonObject paramsObj = obj.getAsJsonObject("params");
    assertNotNull(paramsObj, "params should not be null");
    JsonObject metadata = paramsObj.getAsJsonObject("metadata");
    assertNotNull(metadata, "metadata should be a nested JSON object");
    assertEquals("value1", metadata.get("key1").getAsString());
    assertEquals("value2", metadata.get("key2").getAsString());
  }

  @Test
  public void testSerializeBatchUpdate_twoArgDelegatesToThreeArg() throws StripeException {
    // The two-arg overload calls three-arg with null options.
    // Verify the output structure matches three-arg with null options.
    CustomerUpdateParams params =
        CustomerUpdateParams.builder().setDescription("delegate test").build();

    String json = service().serializeBatchUpdate("cus_123", params);
    JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

    // stripe_version should be Stripe.API_VERSION (null options falls through to default)
    assertEquals(Stripe.API_VERSION, obj.get("stripe_version").getAsString());

    // context should be absent (null options means no stripeContext)
    assertFalse(obj.has("context"), "context should be absent when options is null");
  }
}
