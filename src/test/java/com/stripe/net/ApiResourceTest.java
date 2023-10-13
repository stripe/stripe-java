package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonIOException;
import com.stripe.BaseStripeTest;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;
import java.net.Proxy;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class ApiResourceTest extends BaseStripeTest {

  @Test
  public void testUrlEncode() {
    assertEquals("cus_123", ApiResource.urlEncode("cus_123"));
    // legacy Ids allow customer-defined and can have arbitrary names
    assertEquals("Plan+100%24%2Fmonth", ApiResource.urlEncode("Plan 100$/month"));
  }

  @Test
  public void testUrlEncodeIdThrowingOnNull() {
    assertThrows(
        InvalidRequestException.class,
        () -> {
          ApiResource.urlEncodeId(null);
        });
  }

  static class MyClass extends ApiResource {
    public Proxy proxy;
  }

  @Test
  public void testReflectionFilter() {
    JsonIOException e =
        assertThrows(JsonIOException.class, () -> ApiResource.GSON.fromJson("{}", MyClass.class));

    // Assert that the error message involves a ReflectionAccessFilter.
    assertTrue(e.getMessage().contains("ReflectionAccessFilter"));
  }

  @Test
  public void testExternalDeserializeSetsResponseGetter() throws Exception {
    String json = "{\"id\": \"ch_123\", \"object\": \"charge\"}";
    Charge charge = ApiResource.GSON.fromJson(json, Charge.class);
    assertEquals(charge.getResponseGetter(), ApiResource.getGlobalResponseGetter());
    charge.update(new HashMap<>());
  }

  @Test
  public void testInternalDeserializeSetsResponseGetter() {
    String json = "{\"id\": \"ch_123\", \"object\": \"charge\"}";
    Charge charge = ApiResource.INTERNAL_GSON.fromJson(json, Charge.class);
    IllegalStateException e =
        assertThrows(IllegalStateException.class, () -> charge.update(new HashMap<>()));
    assertTrue(
        e.getMessage()
            .contains(
                "The resource you're trying to use was deserialized without the use of ApiResource.GSON"));
  }
}
