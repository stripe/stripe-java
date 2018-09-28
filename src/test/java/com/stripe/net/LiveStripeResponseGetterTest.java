package com.stripe.net;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class LiveStripeResponseGetterTest {
  LiveStripeResponseGetter srg;

  @Before
  public void before() {
    srg = new LiveStripeResponseGetter();
  }

  @Test
  public void testCreateQuery() throws StripeException, UnsupportedEncodingException {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("a", "b");
    assertEquals("a=b", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithNestedParams() throws StripeException,
      UnsupportedEncodingException {
    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<String, Object>();
    final Map<String, Object> nested = new LinkedHashMap<String, Object>();
    nested.put("A", "B");
    nested.put("C", "D");
    params.put("nested", nested);
    params.put("c", "d");
    params.put("e", "f");
    assertEquals("nested[A]=B&nested[C]=D&c=d&e=f", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithListParams() throws StripeException, UnsupportedEncodingException {
    final List<String> nested = new ArrayList<String>();
    nested.add("A");
    nested.add("B");
    nested.add("C");

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<String, Object>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals("nested[0]=A&nested[1]=B&nested[2]=C&a=b&c=d",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithArrayParams() throws StripeException,
      UnsupportedEncodingException {

    final String[] nested = {"A", "B", "C"};

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<String, Object>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals("nested[0]=A&nested[1]=B&nested[2]=C&a=b&c=d",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithListOfHashes() throws StripeException,
      UnsupportedEncodingException {
    final Map<String, String> deepNestedMap1 = new LinkedHashMap<String, String>();
    deepNestedMap1.put("A", "A-1");
    deepNestedMap1.put("B", "B-1");

    final Map<String, String> deepNestedMap2 = new LinkedHashMap<String, String>();
    deepNestedMap2.put("A", "A-2");
    deepNestedMap2.put("B", "B-2");

    final List<Object> nested = new ArrayList<Object>();
    nested.add(deepNestedMap1);
    nested.add(deepNestedMap2);

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<String, Object>();
    params.put("nested", nested);

    assertEquals("nested[0][A]=A-1&nested[0][B]=B-1&nested[1][A]=A-2&nested[1][B]=B-2",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithEmptyList() throws StripeException, UnsupportedEncodingException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("a", new ArrayList<String>());
    assertEquals("a=", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithEmptyArray() throws StripeException, UnsupportedEncodingException {
    final String[] array = {};
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("a", array);
    assertEquals("a=", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryUrlEncodeSpecialCharacters() throws StripeException,
      UnsupportedEncodingException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("a", "+foo?");
    assertEquals("a=%2Bfoo%3F", LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testIncorrectAdditionalOwners() throws StripeException, UnsupportedEncodingException {
    final Map<String, String> ownerParams = new HashMap<String, String>();
    ownerParams.put("first_name", "Stripe");

    final List<Object> additionalOwners = new ArrayList<Object>();
    additionalOwners.add(ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<String, Object>();
    legalEntityParams.put("additional_owners", additionalOwners);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("legal_entity", legalEntityParams);

    assertEquals("legal_entity[additional_owners][0][first_name]=Stripe",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCorrectAdditionalOwners() throws StripeException, UnsupportedEncodingException {
    final Map<String, String> ownerParams = new HashMap<String, String>();
    ownerParams.put("first_name", "Stripe");

    final Map<String, Object> additionalOwnersMap = new HashMap<String, Object>();
    additionalOwnersMap.put("0", ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<String, Object>();
    legalEntityParams.put("additional_owners", additionalOwnersMap);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("legal_entity", legalEntityParams);

    assertEquals("legal_entity[additional_owners][0][first_name]=Stripe",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testAppInfo() {
    final RequestOptions options = (new RequestOptionsBuilder()).setApiKey("sk_foobar").build();

    Stripe.setAppInfo("MyAwesomePlugin", "1.2.34", "https://myawesomeplugin.info");

    final Map<String, String> headers = LiveStripeResponseGetter.getHeaders(options);

    final String expectedUserAgent = String.format(
        "Stripe/v1 JavaBindings/%s MyAwesomePlugin/1.2.34 (https://myawesomeplugin.info)",
        Stripe.VERSION);
    assertEquals(expectedUserAgent, headers.get("User-Agent"));

    final Gson gson = new Gson();

    final Map<String, String> uaMap = gson.fromJson(headers.get("X-Stripe-Client-User-Agent"),
        new TypeToken<Map<String, String>>() {}.getType());
    assertNotNull(uaMap.get("application"));

    final Map<String, String> appMap = gson.fromJson(uaMap.get("application"),
        new TypeToken<Map<String, String>>() {}.getType());
    assertEquals("MyAwesomePlugin", appMap.get("name"));
    assertEquals("1.2.34", appMap.get("version"));
    assertEquals("https://myawesomeplugin.info", appMap.get("url"));
  }

  @Test
  public void testXStripeClientUserAgent() {
    final RequestOptions options = (new RequestOptionsBuilder()).setApiKey("sk_foobar").build();

    final Map<String, String> headers = LiveStripeResponseGetter.getHeaders(options);
    final Map<String, String> uaMap = new Gson().fromJson(headers.get("X-Stripe-Client-User-Agent"),
            new TypeToken<Map<String, String>>() {}.getType());

    for (Map.Entry<String, String> entry : uaMap.entrySet()) {
      assertTrue("Header key contains unexpected '.'", !entry.getKey().contains("."));
      assertTrue("Header value should not be empty", entry.getValue() != null);
    }

    // properties common to other stripe client libraries
    assertTrue(uaMap.containsKey("bindings_version"));
    assertTrue(uaMap.containsKey("lang"));
    assertTrue(uaMap.containsKey("publisher"));

    // properties specific to java-client
    assertTrue(uaMap.containsKey("java_version"));
    assertTrue(uaMap.containsKey("java_vendor"));
    assertTrue(uaMap.containsKey("java_vm_version"));
    assertTrue(uaMap.containsKey("java_vm_vendor"));
    assertTrue(uaMap.containsKey("os_name"));
    assertTrue(uaMap.containsKey("os_version"));
    assertTrue(uaMap.containsKey("os_arch"));
  }
}
