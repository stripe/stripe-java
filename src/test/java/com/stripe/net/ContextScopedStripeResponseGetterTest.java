package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.google.gson.reflect.TypeToken;
import com.stripe.StripeClient;
import com.stripe.StripeContext;
import com.stripe.events.V1ProductUpdatedEvent;
import com.stripe.events.V1ProductUpdatedEventNotification;
import com.stripe.exception.StripeException;
import com.stripe.model.Product;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeObject;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.EventNotification;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class ContextScopedStripeResponseGetterTest {
  private HttpClient httpClient;
  private LiveStripeResponseGetter liveGetter;
  private StripeClient client;

  @BeforeEach
  public void setUp() throws StripeException {
    httpClient = mock(HttpClient.class);
    liveGetter =
        new LiveStripeResponseGetter(
            TestStripeResponseGetterOptions.builder()
                .setAuthenticator(new BearerTokenAuthenticator("sk_test_original"))
                .setApiBase("https://api.stripe.com")
                .setStripeAccount("acct_platform")
                .setStripeContext("ctx_platform")
                .build(),
            httpClient);
    client = new StripeClient(liveGetter);
    when(httpClient.requestWithRetries(any())).thenReturn(response(productJson()));
  }

  @Test
  public void scopedClientReplacesDefaultsAndLeavesOriginalUnchanged() throws StripeException {
    for (String context : Arrays.asList(null, "", "acct_child")) {
      clearInvocations(httpClient);
      StripeClient scoped =
          client.withStripeContext(context == null ? null : StripeContext.parse(context));
      Product product = scoped.v1().products().retrieve("prod_123");
      product.delete();
      client.v1().products().retrieve("prod_123");

      ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
      verify(httpClient, times(3)).requestWithRetries(requests.capture());
      for (StripeRequest request : requests.getAllValues().subList(0, 2)) {
        assertScope(request, context == null || context.isEmpty() ? null : context, null);
        assertEquals(
            "Bearer sk_test_original", request.headers().firstValue("Authorization").orElse(null));
      }
      assertScope(requests.getAllValues().get(2), "ctx_platform", "acct_platform");
    }
  }

  @Test
  public void explicitOverridesRetainMastersPrecedence() throws StripeException {
    StripeClient scoped = client.withStripeContext(StripeContext.parse("acct_child"));
    scoped
        .v1()
        .products()
        .retrieve("prod_123", RequestOptions.builder().setStripeContext("ctx_override").build())
        .delete();
    scoped
        .v1()
        .products()
        .retrieve("prod_123", RequestOptions.builder().setStripeAccount("acct_override").build());
    scoped
        .v1()
        .products()
        .retrieve(
            "prod_123",
            RequestOptions.builder()
                .setStripeContext("")
                .setStripeAccount("acct_override")
                .build());
    scoped
        .v1()
        .products()
        .retrieve(
            "prod_123", RequestOptions.builder().clearStripeAccount().clearStripeContext().build());

    ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient, times(5)).requestWithRetries(requests.capture());
    assertScope(requests.getAllValues().get(0), "ctx_override", null);
    assertScope(requests.getAllValues().get(1), "acct_child", null);
    assertScope(requests.getAllValues().get(2), "acct_child", "acct_override");
    assertScope(requests.getAllValues().get(3), null, "acct_override");
    assertScope(requests.getAllValues().get(4), "acct_child", null);
  }

  @Test
  public void repeatedScopingReplacesEarlierScope() throws StripeException {
    client
        .withStripeContext(StripeContext.parse("ctx_first"))
        .withStripeContext(null)
        .v1()
        .products()
        .retrieve("prod_123");
    ArgumentCaptor<StripeRequest> request = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient).requestWithRetries(request.capture());
    assertScope(request.getValue(), null, null);
  }

  @Test
  public void fullEventFetchAndMutationUseServerContext() throws StripeException {
    for (String context : Arrays.asList(null, "", "acct_child")) {
      clearInvocations(httpClient);
      V1ProductUpdatedEvent event = (V1ProductUpdatedEvent) Event.parse(eventJson(context));
      event.setResponseGetter(liveGetter);
      Product product = event.fetchRelatedObject();
      product.delete();
      ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
      verify(httpClient, times(2)).requestWithRetries(requests.capture());
      for (StripeRequest request : requests.getAllValues()) {
        assertScope(request, context == null || context.isEmpty() ? null : context, null);
      }
      assertEquals(
          "event=evt_123",
          requests
              .getAllValues()
              .get(0)
              .headers()
              .firstValue("Stripe-Request-Trigger")
              .orElse(null));
      assertFalse(
          requests
              .getAllValues()
              .get(1)
              .headers()
              .firstValue("Stripe-Request-Trigger")
              .isPresent());
    }
  }

  @Test
  public void notificationFetchAndMutationUseServerContext() throws StripeException {
    for (String context : Arrays.asList(null, "", "acct_child")) {
      clearInvocations(httpClient);
      V1ProductUpdatedEventNotification notification =
          (V1ProductUpdatedEventNotification)
              EventNotification.fromJson(eventJson(context), client);
      notification.fetchRelatedObject().delete();
      ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
      verify(httpClient, times(2)).requestWithRetries(requests.capture());
      for (StripeRequest request : requests.getAllValues()) {
        assertScope(request, context == null || context.isEmpty() ? null : context, null);
      }
    }
  }

  @Test
  public void notificationFetchEventScopesRequestAndReturnedEvent() throws StripeException {
    when(httpClient.requestWithRetries(any()))
        .thenReturn(response(eventJson("acct_child")), response(productJson()));
    V1ProductUpdatedEventNotification notification =
        (V1ProductUpdatedEventNotification)
            EventNotification.fromJson(eventJson("acct_child"), client);
    notification.fetchEvent().fetchRelatedObject().delete();
    ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient, times(3)).requestWithRetries(requests.capture());
    for (StripeRequest request : requests.getAllValues()) {
      assertScope(request, "acct_child", null);
    }
  }

  @Test
  public void collectionItemsAndLaterPagesRetainScope() throws StripeException {
    when(httpClient.requestWithRetries(any()))
        .thenReturn(
            response(
                "{\"object\":\"list\",\"url\":\"/v1/products\",\"has_more\":true,\"data\":["
                    + productJson()
                    + "]}"),
            response(
                "{\"object\":\"list\",\"url\":\"/v1/products\",\"has_more\":false,\"data\":["
                    + productJson()
                    + "]}"),
            response(productJson()));
    StripeCollection<Product> products =
        client.withStripeContext(StripeContext.parse("acct_child")).v1().products().list();
    Iterator<Product> iterator = products.autoPagingIterable().iterator();
    iterator.next();
    iterator.next().delete();
    assertFalse(iterator.hasNext());
    ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient, times(3)).requestWithRetries(requests.capture());
    for (StripeRequest request : requests.getAllValues()) {
      assertScope(request, "acct_child", null);
    }
  }

  @Test
  public void rawRequestsPreserveOptionsHeadersContentAndUsage() throws StripeException {
    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 1234));
    PasswordAuthentication credentials = new PasswordAuthentication("test", "test".toCharArray());
    RawRequestOptions.RawRequestOptionsBuilder builder =
        RawRequestOptions.builder()
            .setApiKey("sk_test_override")
            .setBaseUrl("https://example.com")
            .setClientId("ca_override")
            .setIdempotencyKey("idem_123")
            .setStripeRequestTrigger("event=evt_123")
            .setConnectTimeout(123)
            .setReadTimeout(456)
            .setMaxNetworkRetries(2)
            .setConnectionProxy(proxy)
            .setProxyCredential(credentials)
            .setAdditionalHeaders(Collections.singletonMap("X-Custom", "custom"));
    RequestOptions.RequestOptionsBuilder.unsafeSetStripeVersionOverride(builder, "2020-08-27");
    RawRequestOptions options = builder.build();
    StripeResponseGetter delegate = spy(liveGetter);
    client = new StripeClient(delegate);
    client
        .withStripeContext(StripeContext.parse("acct_child"))
        .rawRequest(ApiResource.RequestMethod.POST, "/v1/products", "name=Test", options);
    ArgumentCaptor<RawApiRequest> request = ArgumentCaptor.forClass(RawApiRequest.class);
    verify(delegate).rawRequest(request.capture());
    RawRequestOptions actual = request.getValue().getOptions();
    assertEquals(options.getAuthenticator(), actual.getAuthenticator());
    assertEquals(options.getBaseUrl(), actual.getBaseUrl());
    assertEquals(options.getClientId(), actual.getClientId());
    assertEquals(options.getIdempotencyKey(), actual.getIdempotencyKey());
    assertEquals(options.getStripeRequestTrigger(), actual.getStripeRequestTrigger());
    assertEquals(options.getConnectTimeout(), actual.getConnectTimeout());
    assertEquals(options.getReadTimeout(), actual.getReadTimeout());
    assertEquals(options.getMaxNetworkRetries(), actual.getMaxNetworkRetries());
    assertSame(proxy, actual.getConnectionProxy());
    assertSame(credentials, actual.getProxyCredential());
    assertEquals("2020-08-27", RequestOptions.unsafeGetStripeVersionOverride(actual));
    assertEquals(options.getAdditionalHeaders(), actual.getAdditionalHeaders());
    assertEquals(Arrays.asList("stripe_client", "raw_request"), request.getValue().getUsage());
    assertEquals("name=Test", request.getValue().getRawContent());
    assertNull(options.getStripeContext());
    ArgumentCaptor<StripeRequest> wireRequest = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient).requestWithRetries(wireRequest.capture());
    assertScope(wireRequest.getValue(), "acct_child", null);
    assertEquals("custom", wireRequest.getValue().headers().firstValue("X-Custom").orElse(null));
  }

  @Test
  public void streamRequestsUseScopedDefaults() throws StripeException {
    InputStream stream = new ByteArrayInputStream(new byte[0]);
    when(httpClient.requestStreamWithRetries(any()))
        .thenReturn(new StripeResponseStream(200, HttpHeaders.of(Collections.emptyMap()), stream));
    StripeResponseGetter scoped =
        ContextScopedStripeResponseGetter.withStripeContext(liveGetter, "acct_child");
    assertSame(
        stream,
        scoped.requestStream(
            new ApiRequest(
                BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/products", null, null)));
    ArgumentCaptor<StripeRequest> request = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient).requestStreamWithRetries(request.capture());
    assertScope(request.getValue(), "acct_child", null);
  }

  @Test
  @SuppressWarnings("deprecation")
  public void legacyCustomGetterNeedsNoAdditionalMethodsAndRetainsReturnedObjectScope()
      throws StripeException {
    StripeResponseGetter custom =
        new StripeResponseGetter() {
          @Override
          @SuppressWarnings("unchecked")
          public <T extends StripeObject> T request(
              BaseAddress base,
              ApiResource.RequestMethod method,
              String path,
              java.util.Map<String, Object> params,
              Type type,
              RequestOptions options,
              ApiMode mode)
              throws StripeException {
            assertEquals("acct_child", options.getStripeContext());
            assertNull(options.getStripeAccount());
            return liveGetter.request(base, method, path, params, type, options, mode);
          }

          @Override
          public InputStream requestStream(
              BaseAddress base,
              ApiResource.RequestMethod method,
              String path,
              java.util.Map<String, Object> params,
              RequestOptions options,
              ApiMode mode)
              throws StripeException {
            return liveGetter.requestStream(base, method, path, params, options, mode);
          }
        };
    new StripeClient(custom)
        .withStripeContext(StripeContext.parse("acct_child"))
        .v1()
        .products()
        .retrieve("prod_123")
        .delete();
    ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient, times(2)).requestWithRetries(requests.capture());
    for (StripeRequest request : requests.getAllValues()) {
      assertScope(request, "acct_child", null);
    }
  }

  @Test
  public void nestedActiveObjectsRetainScope() throws StripeException {
    when(httpClient.requestWithRetries(any()))
        .thenReturn(
            response(
                "{\"id\":\"prod_123\",\"object\":\"product\",\"default_price\":{\"id\":\"price_123\",\"object\":\"price\"}}"));
    Product product =
        client
            .withStripeContext(StripeContext.parse("acct_child"))
            .v1()
            .products()
            .retrieve("prod_123");
    product.getDefaultPriceObject().update(Collections.singletonMap("active", false));
    ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient, times(2)).requestWithRetries(requests.capture());
    for (StripeRequest request : requests.getAllValues()) {
      assertScope(request, "acct_child", null);
    }
  }

  @Test
  public void v2PaginationRetainsScope() throws StripeException {
    when(httpClient.requestWithRetries(any()))
        .thenReturn(
            response(
                "{\"data\":[{\"id\":\"acct_123\",\"object\":\"v2.core.account\"}],\"next_page_url\":\"/v2/core/accounts?page=next\"}"),
            response(
                "{\"data\":[{\"id\":\"acct_456\",\"object\":\"v2.core.account\"}],\"next_page_url\":null}"));
    StripeResponseGetter scoped =
        ContextScopedStripeResponseGetter.withStripeContext(liveGetter, "acct_child");
    com.stripe.model.v2.StripeCollection<com.stripe.model.v2.core.Account> accounts =
        scoped.request(
            new ApiRequest(
                BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/core/accounts", null, null),
            new TypeToken<
                com.stripe.model.v2.StripeCollection<
                    com.stripe.model.v2.core.Account>>() {}.getType());
    Iterator<com.stripe.model.v2.core.Account> iterator = accounts.autoPagingIterable().iterator();
    assertEquals("acct_123", iterator.next().getId());
    assertEquals("acct_456", iterator.next().getId());
    assertFalse(iterator.hasNext());
    ArgumentCaptor<StripeRequest> requests = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient, times(2)).requestWithRetries(requests.capture());
    for (StripeRequest request : requests.getAllValues()) {
      assertScope(request, "acct_child", null);
    }
  }

  @Test
  @SuppressWarnings("deprecation")
  public void deprecatedEntryPointsAndValidationDelegateWithScope() throws StripeException {
    StripeResponseGetter delegate = mock(StripeResponseGetter.class);
    StripeResponseGetter scoped =
        ContextScopedStripeResponseGetter.withStripeContext(delegate, "acct_child");
    scoped.request(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/prod_123",
        null,
        Product.class,
        null,
        ApiMode.V2);
    scoped.requestStream(
        BaseAddress.FILES,
        ApiResource.RequestMethod.GET,
        "/v1/files/file_123",
        null,
        null,
        ApiMode.V1);
    scoped.validateRequestOptions(null);
    ArgumentCaptor<RequestOptions> options = ArgumentCaptor.forClass(RequestOptions.class);
    verify(delegate)
        .request(
            eq(BaseAddress.API),
            eq(ApiResource.RequestMethod.GET),
            eq("/v1/products/prod_123"),
            isNull(),
            eq(Product.class),
            options.capture(),
            eq(ApiMode.V2));
    verify(delegate)
        .requestStream(
            eq(BaseAddress.FILES),
            eq(ApiResource.RequestMethod.GET),
            eq("/v1/files/file_123"),
            isNull(),
            options.capture(),
            eq(ApiMode.V1));
    verify(delegate).validateRequestOptions(options.capture());
    for (RequestOptions scopedOptions : options.getAllValues()) {
      RequestOptions merged =
          RequestOptions.merge(liveGetter.getOptions(), scopedOptions.toBuilderFullCopy().build());
      assertEquals("acct_child", merged.getStripeContext());
      assertNull(merged.getStripeAccount());
    }
  }

  @Test
  public void clearingUnscopedRequestOptionsStillInheritsDefaults() throws StripeException {
    client
        .v1()
        .products()
        .retrieve(
            "prod_123", RequestOptions.builder().clearStripeAccount().clearStripeContext().build());
    ArgumentCaptor<StripeRequest> request = ArgumentCaptor.forClass(StripeRequest.class);
    verify(httpClient).requestWithRetries(request.capture());
    assertScope(request.getValue(), "ctx_platform", "acct_platform");
  }

  private static void assertScope(StripeRequest request, String context, String account) {
    assertEquals(context, request.headers().firstValue("Stripe-Context").orElse(null));
    assertEquals(account, request.headers().firstValue("Stripe-Account").orElse(null));
  }

  private static StripeResponse response(String body) {
    return new StripeResponse(200, HttpHeaders.of(Collections.emptyMap()), body);
  }

  private static String productJson() {
    return "{\"id\":\"prod_123\",\"object\":\"product\"}";
  }

  private static String eventJson(String context) {
    return "{\"id\":\"evt_123\",\"object\":\"v2.core.event\",\"type\":\"v1.product.updated\",\"created\":\"2022-02-15T00:27:45.330Z\","
        + (context == null ? "" : "\"context\":\"" + context + "\",")
        + "\"related_object\":{\"id\":\"prod_123\",\"type\":\"product\",\"url\":\"/v1/products/prod_123\"}}";
  }
}
