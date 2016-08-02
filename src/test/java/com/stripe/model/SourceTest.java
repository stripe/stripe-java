package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

import java.io.IOException;

import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class SourceTest extends BaseStripeTest {
	@Test
	public void testGetTypeData() throws IOException {
		Source source = new Source();

		// Create each map
		Map<String, String> idealMap = new HashMap<String, String>();
		idealMap.put("type", "ideal");
		source.setIdeal(idealMap);

		Map<String, String> sofortMap = new HashMap<String, String>();
		sofortMap.put("type", "sofort");
		source.setSofort(sofortMap);

		Map<String, String> bancontactMap = new HashMap<String, String>();
		bancontactMap.put("type", "bancontact");
		source.setBancontact(bancontactMap);

		Map<String, String> bitcoinMap = new HashMap<String, String>();
		bitcoinMap.put("type", "bitcoin");
		source.setBitcoin(bitcoinMap);

		Map<String, String> achDebitMap = new HashMap<String, String>();
		achDebitMap.put("type", "achDebit");
		source.setACHDebit(achDebitMap);

		Map<String, String> sepaDebitMap = new HashMap<String, String>();
		sepaDebitMap.put("type", "sepaDebit");
		source.setSEPADebit(sepaDebitMap);

		// Test each map
		source.setType("ideal");
		assertEquals("ideal", source.getTypeData().get("type"));
		source.setType("sofort");
		assertEquals("sofort", source.getTypeData().get("type"));
		source.setType("bancontact");
		assertEquals("bancontact", source.getTypeData().get("type"));
		source.setType("bitcoin");
		assertEquals("bitcoin", source.getTypeData().get("type"));
		source.setType("ach_debit");
		assertEquals("achDebit", source.getTypeData().get("type"));
		source.setType("sepa_debit");
		assertEquals("sepaDebit", source.getTypeData().get("type"));

		// Test error
		source.setType("some_invalid_type");
		try {
			source.getTypeData();
		} catch (IOException e) {
			assertEquals("Unknown type: some_invalid_type", e.getMessage());
		}
	}
}
