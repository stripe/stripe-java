package com.stripe.model.v2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.MeterEventSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.StripeResponseGetter;
import java.lang.reflect.Type;
import org.junit.jupiter.api.Test;

public class RefTest {

  private static final String REF_JSON =
      "{"
          + "\"type\": \"v2.billing.meter_event_session\","
          + "\"id\": \"mtes_123\","
          + "\"url\": \"/v2/billing/meter_event_sessions/mtes_123\""
          + "}";

  @Test
  public void deserializesWireFields() {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    assertEquals("v2.billing.meter_event_session", ref.getType());
    assertEquals("mtes_123", ref.getId());
    assertEquals("/v2/billing/meter_event_sessions/mtes_123", ref.getUrl());
  }

  @Test
  public void responseGetterIsAutoInjectedOnDeserialization() {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    // StripeResponseGetterSettingTypeAdapterFactory calls setResponseGetter during
    // deserialization because Ref implements StripeActiveObject.
    assertNotNull(ref.responseGetter);
  }

  @Test
  public void targetTypeIsSetByTypeAdapterFactory() {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    // StripeCollectionItemTypeSettingFactory extracts T from Ref<T> and calls setTargetType
    // so that fetch() can pass the item type directly to responseGetter.request().
    assertNotNull(ref.getTargetType());
    assertEquals(MeterEventSession.class, ref.getTargetType());
  }

  @Test
  public void fetchThrowsWhenResponseGetterIsNull() {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);
    ref.setResponseGetter(null);

    IllegalStateException ex = assertThrows(IllegalStateException.class, ref::fetch);
    assertTrue(ex.getMessage().contains("StripeResponseGetter"));
  }

  @Test
  public void fetchCallsResponseGetterRequest() throws StripeException {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    MeterEventSession expectedSession = new MeterEventSession();

    StripeResponseGetter mockResponseGetter = mock(StripeResponseGetter.class);
    when(mockResponseGetter.request(
            any(ApiRequest.class), eq(ref.getTargetType())))
        .thenReturn(expectedSession);

    ref.setResponseGetter(mockResponseGetter);

    MeterEventSession result = ref.fetch();

    assertSame(expectedSession, result);
    verify(mockResponseGetter)
        .request(
            argThat(
                req ->
                    req.getBaseAddress() == BaseAddress.API
                        && req.getMethod() == ApiResource.RequestMethod.GET
                        && req.getPath().equals(ref.getUrl())),
            eq(ref.getTargetType()));
  }
}
