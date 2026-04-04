package com.stripe.model.v2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.google.gson.reflect.TypeToken;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.MeterEventSession;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiResource.RequestMethod;
import com.stripe.net.HttpHeaders;
import com.stripe.net.RawRequestOptions;
import com.stripe.net.StripeResponse;
import java.lang.reflect.Type;
import java.util.Collections;
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
  public void clientIsNotDeserializedFromJson() {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    assertNull(ref.client);
  }

  @Test
  public void fetchThrowsWhenClientIsNull() {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    IllegalStateException ex = assertThrows(IllegalStateException.class, ref::fetch);
    assertTrue(ex.getMessage().contains("StripeClient"));
  }

  @Test
  public void fetchCallsRawRequestAndDeserializes() throws StripeException {
    Type type = new TypeToken<Ref<MeterEventSession>>() {}.getType();
    Ref<MeterEventSession> ref = ApiResource.GSON.fromJson(REF_JSON, type);

    String sessionJson =
        "{"
            + "\"id\": \"mtes_123\","
            + "\"object\": \"v2.billing.meter_event_session\","
            + "\"authentication_token\": \"tok_abc\","
            + "\"livemode\": false"
            + "}";
    StripeResponse mockResponse =
        new StripeResponse(200, HttpHeaders.of(Collections.emptyMap()), sessionJson);

    MeterEventSession expectedSession = new MeterEventSession();

    StripeClient mockClient = mock(StripeClient.class);
    when(mockClient.rawRequest(RequestMethod.GET, ref.getUrl(), null)).thenReturn(mockResponse);
    when(mockClient.deserialize(sessionJson, ApiMode.V2)).thenReturn(expectedSession);

    ref.client = mockClient;

    MeterEventSession result = ref.fetch();

    assertSame(expectedSession, result);
    verify(mockClient).rawRequest(RequestMethod.GET, ref.getUrl(), null);
    verify(mockClient).deserialize(sessionJson, ApiMode.V2);
  }
}
