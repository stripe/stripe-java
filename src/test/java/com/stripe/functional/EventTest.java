package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class EventTest extends BaseStripeFunctionalTest {
    @Test
    public void testEventRetrieve() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        Event event = Event.all(listParams).getData().get(0);
        Event retrievedEvent = Event.retrieve(event.getId());
        assertEquals(event.getId(), retrievedEvent.getId());
    }

    @Test
    public void testEventList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Event> events = Event.all(listParams).getData();
        assertEquals(events.size(), 1);
    }

    @Test
    public void testEventRetrievePerCallAPIKey() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        Event event = Event.all(listParams, Stripe.apiKey).getData().get(0);
        Event retrievedEvent = Event.retrieve(event.getId());
        assertEquals(event.getId(), retrievedEvent.getId());
    }

    @Test
    public void testEventListPerCallAPIKey() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Event> events = Event.all(listParams, Stripe.apiKey).getData();
        assertEquals(events.size(), 1);
    }
}
