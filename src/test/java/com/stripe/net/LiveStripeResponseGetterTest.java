package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LiveStripeResponseGetterTest {
	LiveStripeResponseGetter srg;

	@Before
	public void before() {
		srg = new LiveStripeResponseGetter();
	}

	/* Kind of hacky, but makes tests readable */
	public String encode(String s) throws UnsupportedEncodingException {
		return s.replace("[", "%5B").replace("]", "%5D");
	}

	@Test
	public void testCreateQuery() throws StripeException, UnsupportedEncodingException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("a", "b");
		assertEquals("a=b", srg.createQuery(params));
	}

	@Test
	public void testCreateQueryWithNestedParams() throws StripeException, UnsupportedEncodingException {
		/* Use LinkedHashMap because it preserves iteration order */
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		Map<String, Object> nested = new LinkedHashMap<String, Object>();
		nested.put("A", "B");
		nested.put("C", "D");
		params.put("nested", nested);
		params.put("c", "d");
		params.put("e", "f");
		assertEquals(encode("nested[A]=B&nested[C]=D&c=d&e=f"), srg.createQuery(params));
	}

	@Test
	public void testCreateQueryWithListParams() throws StripeException, UnsupportedEncodingException {

		List<String> nested = new LinkedList<String>();
		nested.add("A");
		nested.add("B");
		nested.add("C");

		/* Use LinkedHashMap because it preserves iteration order */
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("nested", nested);
		params.put("a", "b");
		params.put("c", "d");

		assertEquals(encode("nested[]=A&nested[]=B&nested[]=C&a=b&c=d"), srg.createQuery(params));
	}

	@Test
	public void testCreateQueryWithArrayOfHashes() throws StripeException, UnsupportedEncodingException {
		Map<String, String> deepNestedMap1 = new LinkedHashMap<String, String>();
		deepNestedMap1.put("A", "A-1");
		deepNestedMap1.put("B", "B-1");

		Map<String, String> deepNestedMap2 = new LinkedHashMap<String, String>();
		deepNestedMap2.put("A", "A-2");
		deepNestedMap2.put("B", "B-2");

		List<Object> nested = new LinkedList<Object>();
		nested.add(deepNestedMap1);
		nested.add(deepNestedMap2);

		/* Use LinkedHashMap because it preserves iteration order */
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("nested", nested);

		assertEquals(encode("nested[][A]=A-1&nested[][B]=B-1&nested[][A]=A-2&nested[][B]=B-2"), srg.createQuery(params));
	}

	@Test
	public void testCreateQueryWithEmptyList() throws StripeException, UnsupportedEncodingException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("a", new LinkedList<String>());
		assertEquals("a=", srg.createQuery(params));
	}

	@Test
	public void testIncorrectAdditionalOwners() throws StripeException, UnsupportedEncodingException {
		Map<String, String> ownerParams = new HashMap<String, String>();
		ownerParams.put("first_name", "Stripe");

		List<Object> additionalOwners = new LinkedList<Object>();
		additionalOwners.add(ownerParams);

		Map<String, Object> legalEntityParams = new HashMap<String, Object>();
		legalEntityParams.put("additional_owners", additionalOwners);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("legal_entity", legalEntityParams);

		assertEquals(encode("legal_entity[additional_owners][][first_name]=Stripe"), srg.createQuery(params));
	}

	@Test
	public void testCorrectAdditionalOwners() throws StripeException, UnsupportedEncodingException {
		Map<String, String> ownerParams = new HashMap<String, String>();
		ownerParams.put("first_name", "Stripe");

		Map<String, Object> additionalOwnersMap = new HashMap<String, Object>();
		additionalOwnersMap.put("0", ownerParams);

		Map<String, Object> legalEntityParams = new HashMap<String, Object>();
		legalEntityParams.put("additional_owners", additionalOwnersMap);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("legal_entity", legalEntityParams);

		assertEquals(encode("legal_entity[additional_owners][0][first_name]=Stripe"), srg.createQuery(params));
	}
}
