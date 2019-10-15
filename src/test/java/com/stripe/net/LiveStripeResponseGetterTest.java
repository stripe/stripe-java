package com.stripe.net;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiveStripeResponseGetterTest {
  LiveStripeResponseGetter srg;

  @BeforeEach
  public void before() {
    srg = new LiveStripeResponseGetter();
  }

  @Test
  public void testCreateQuery() throws StripeException {
    Map<String, Object> params = new HashMap<>();
    params.put("a", "b");
    assertEquals("a=b", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithNestedParams() throws StripeException {
    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    final Map<String, Object> nested = new LinkedHashMap<>();
    nested.put("A", "B");
    nested.put("C", "D");
    params.put("nested", nested);
    params.put("c", "d");
    params.put("e", "f");
    assertEquals("nested[A]=B&nested[C]=D&c=d&e=f", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithListParams() throws StripeException {
    final List<String> nested = new ArrayList<>();
    nested.add("A");
    nested.add("B");
    nested.add("C");

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals(
        "nested[0]=A&nested[1]=B&nested[2]=C&a=b&c=d",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithArrayParams() throws StripeException {

    final String[] nested = {"A", "B", "C"};

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals(
        "nested[0]=A&nested[1]=B&nested[2]=C&a=b&c=d",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithListOfHashes() throws StripeException {
    final Map<String, String> deepNestedMap1 = new LinkedHashMap<>();
    deepNestedMap1.put("A", "A-1");
    deepNestedMap1.put("B", "B-1");

    final Map<String, String> deepNestedMap2 = new LinkedHashMap<>();
    deepNestedMap2.put("A", "A-2");
    deepNestedMap2.put("B", "B-2");

    final List<Object> nested = new ArrayList<>();
    nested.add(deepNestedMap1);
    nested.add(deepNestedMap2);

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("nested", nested);

    assertEquals(
        "nested[0][A]=A-1&nested[0][B]=B-1&nested[1][A]=A-2&nested[1][B]=B-2",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithFormEncodedKeys() throws StripeException {
    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();

    // Params with form-encoded keys can happen through "extraParams". Instead of passing a
    // string key and `Object` value, users can also specify key as form-encoded path to the
    // extra param value.
    // This "extraParams" behavior is supported by other typed libraries, but not
    // intended in `stripe-java`. However, by the virtue of supporting arbitrary string key in
    // extra param map, this behavior is implicitly supported.
    params.put("nested[0][A]", "A-1");
    params.put("nested[0][B]", "B-1");
    params.put("nested[1][A]", "A-2");
    params.put("nested[1][B]", "B-2");

    assertEquals(
        "nested[0][A]=A-1&nested[0][B]=B-1&nested[1][A]=A-2&nested[1][B]=B-2",
        LiveStripeResponseGetter.createQuery(params));
  }

  @SuppressWarnings("ModifiedButNotUsed")
  @Test
  public void testCreateQueryWithCollection() throws InvalidRequestException {
    // test collections with its own implementation to return iterator giving "A", "B", "C" in order
    final Set<String> nestedTreeSet = new TreeSet<>(String::compareTo);
    nestedTreeSet.add("B");
    nestedTreeSet.add("C");
    nestedTreeSet.add("A");

    final Deque<String> nestedDequeue = new ArrayDeque<>();
    nestedDequeue.addFirst("C");
    nestedDequeue.addFirst("B");
    nestedDequeue.addFirst("A");

    final Set<String> nestedLinkedHashSet = new LinkedHashSet<>();
    nestedLinkedHashSet.add("A");
    nestedLinkedHashSet.add("B");
    nestedLinkedHashSet.add("C");

    final List<String> nestedList = new ArrayList<>();
    nestedList.add("A");
    nestedList.add("B");
    nestedList.add("C");

    List<Collection<String>> collections =
        Arrays.asList(nestedTreeSet, nestedDequeue, nestedLinkedHashSet, nestedList);

    for (Collection<String> collection : collections) {
      final Map<String, Object> params = new LinkedHashMap<>();
      params.put("nested", collection);
      // collection is treated the same as array encoding
      assertEquals(
          "nested[0]=A&nested[1]=B&nested[2]=C",
          LiveStripeResponseGetter.createQuery(params),
          "Failed encoding for collection " + collection.getClass());
    }
  }

  @Test
  public void testCreateQueryWithEmptyCollection() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("a", new ArrayList<String>());
    assertEquals("a=", LiveStripeResponseGetter.createQuery(params));

    params.put("a", new HashSet<>());
    assertEquals("a=", LiveStripeResponseGetter.createQuery(params));

    params.put("a", new TreeSet<>());
    assertEquals("a=", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithEmptyArray() throws StripeException {
    final String[] array = {};
    final Map<String, Object> params = new HashMap<>();
    params.put("a", array);
    assertEquals("a=", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryUrlEncodeSpecialCharacters() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("a", "+foo?");
    assertEquals("a=%2Bfoo%3F", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testIncorrectAdditionalOwners() throws StripeException {
    final Map<String, String> ownerParams = new HashMap<>();
    ownerParams.put("first_name", "Stripe");

    final List<Object> additionalOwners = new ArrayList<>();
    additionalOwners.add(ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<>();
    legalEntityParams.put("additional_owners", additionalOwners);

    final Map<String, Object> params = new HashMap<>();
    params.put("legal_entity", legalEntityParams);

    assertEquals(
        "legal_entity[additional_owners][0][first_name]=Stripe",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCorrectAdditionalOwners() throws StripeException {
    final Map<String, String> ownerParams = new HashMap<>();
    ownerParams.put("first_name", "Stripe");

    final Map<String, Object> additionalOwnersMap = new HashMap<>();
    additionalOwnersMap.put("0", ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<>();
    legalEntityParams.put("additional_owners", additionalOwnersMap);

    final Map<String, Object> params = new HashMap<>();
    params.put("legal_entity", legalEntityParams);

    assertEquals(
        "legal_entity[additional_owners][0][first_name]=Stripe",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testThrowingOnCreateQueryWithFile() {
    final Map<String, Object> params = new HashMap<>();
    params.put("file", new File(getClass().getResource("/test.png").getFile()));

    // file encoding should be handled in multi-part request instead
    assertThrows(
        InvalidRequestException.class,
        () -> {
          LiveStripeResponseGetter.createQuery(params);
        });
  }

  @Test
  public void testEncodeMultipartParams() throws IOException, InvalidRequestException {
    final HttpURLConnection mockConn = mock(HttpURLConnection.class);
    final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    when(mockConn.getOutputStream()).thenReturn(outputStream);
    final MultipartProcessor multipartProcessor =
        new MultipartProcessor(mockConn, "abc", ApiResource.CHARSET);

    final Map<String, Object> params = new HashMap<>();
    params.put("file", new File(getClass().getResource("/test.png").getFile()));

    final Map<String, Object> nestedParams = new HashMap<>();
    nestedParams.put("create", true);
    nestedParams.put("expires_at", 123L);
    params.put("file_link_data", nestedParams);

    LiveStripeResponseGetter.encodeMultipartParams(multipartProcessor, params);

    String encoded = outputStream.toString();

    assertThat(
        encoded,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"file\"; filename=\"test.png\""));
    assertThat(
        encoded,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"file_link_data[create]\""));
    assertThat(
        encoded,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"file_link_data[expires_at]\""));
  }

  @Test
  public void testAppInfo() {
    final RequestOptions options = new RequestOptionsBuilder().setApiKey("sk_foobar").build();

    Stripe.setAppInfo(
        "MyAwesomePlugin", "1.2.34", "https://myawesomeplugin.info", "pp_partner_1234");

    final Map<String, String> headers = LiveStripeResponseGetter.getHeaders(options);

    final String expectedUserAgent =
        String.format(
            "Stripe/v1 JavaBindings/%s MyAwesomePlugin/1.2.34 (https://myawesomeplugin.info)",
            Stripe.VERSION);
    assertEquals(expectedUserAgent, headers.get("User-Agent"));

    final Gson gson = new Gson();

    final Map<String, String> uaMap =
        gson.fromJson(
            headers.get("X-Stripe-Client-User-Agent"),
            new TypeToken<Map<String, String>>() {}.getType());
    assertNotNull(uaMap.get("application"));

    final Map<String, String> appMap =
        gson.fromJson(uaMap.get("application"), new TypeToken<Map<String, String>>() {}.getType());
    assertEquals("MyAwesomePlugin", appMap.get("name"));
    assertEquals("1.2.34", appMap.get("version"));
    assertEquals("https://myawesomeplugin.info", appMap.get("url"));
    assertEquals("pp_partner_1234", appMap.get("partner_id"));
  }

  @Test
  public void testStripeVersion() {
    final RequestOptions versionOverrideOpts =
        new RequestOptionsBuilder().setStripeVersionOverride("2015-05-05").build();
    assertEquals(
        "2015-05-05",
        LiveStripeResponseGetter.getHeaders(versionOverrideOpts).get("Stripe-Version"));

    final RequestOptions options = new RequestOptionsBuilder().build();
    assertEquals(
        Stripe.API_VERSION, LiveStripeResponseGetter.getHeaders(options).get("Stripe-Version"));
  }
}
