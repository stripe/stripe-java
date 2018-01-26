package com.stripe.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SourceMandateNotificationTest extends BaseStripeTest {
	@Test
	public void testDeserialize() throws StripeException, IOException {
		String json = resource("source_mandate_notification.json");
		SourceMandateNotification mandateNotification = APIResource.GSON.fromJson(json, SourceMandateNotification.class);
		Map<String, String> typeData = mandateNotification.getTypeData();

		assertEquals("srcmn_1234", mandateNotification.getId());
		assertEquals("source_mandate_notification", mandateNotification.getObject());
		assertEquals(1000L, (long) mandateNotification.getAmount());
		assertEquals(1516981090, (long) mandateNotification.getCreated());
		assertEquals(false, mandateNotification.getLivemode());
		assertEquals("debit_initiated", mandateNotification.getReason());
		assertEquals("pending", mandateNotification.getStatus());
		assertEquals("sepa_debit", mandateNotification.getType());
		assertEquals("src_123", mandateNotification.getSource().getId());
		assertEquals("sepa_debit", mandateNotification.getSource().getType());

		assertEquals("TEST111111111111111", typeData.get("creditor_identifier"));
		assertEquals("OAAAAAAAAAAAAAAO", typeData.get("mandate_reference"));
		assertEquals("3000", typeData.get("last4"));
	}
}
