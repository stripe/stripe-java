package com.stripe.net;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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
    final List<String> nested = new LinkedList<String>();
    nested.add("A");
    nested.add("B");
    nested.add("C");

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<String, Object>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals("nested[]=A&nested[]=B&nested[]=C&a=b&c=d",
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

    assertEquals("nested[]=A&nested[]=B&nested[]=C&a=b&c=d",
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

    final List<Object> nested = new LinkedList<Object>();
    nested.add(deepNestedMap1);
    nested.add(deepNestedMap2);

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<String, Object>();
    params.put("nested", nested);

    assertEquals("nested[][A]=A-1&nested[][B]=B-1&nested[][A]=A-2&nested[][B]=B-2",
        LiveStripeResponseGetter.createQuery(params));
  }

  @Test
  public void testCreateQueryWithEmptyList() throws StripeException, UnsupportedEncodingException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("a", new LinkedList<String>());
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

    final List<Object> additionalOwners = new LinkedList<Object>();
    additionalOwners.add(ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<String, Object>();
    legalEntityParams.put("additional_owners", additionalOwners);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("legal_entity", legalEntityParams);

    assertEquals("legal_entity[additional_owners][][first_name]=Stripe",
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
}
