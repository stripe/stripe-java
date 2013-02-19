package com.stripe.model;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class EventDataDeserializerTest {

    private static Gson gson  = com.stripe.net.APIResource.gson;

    @Test
    public void deserializePreviousAttributes() throws IOException {

        String json = resource("previous_attributes.json");
        EventData ed = gson.fromJson(json,EventData.class);

        assertThat(ed.getPreviousAttributes().get("fee"), notNullValue());
    }

    @Test
    public void deserializeAccountEvent() throws IOException {
        String json = resource("account_event.json");
        Event e = StripeObject.prettyPrintGson.fromJson(json, Event.class);

        assertEquals(e.getType(), "account.updated");
    }

    private String resource(String path) throws IOException {
        InputStream resource = getClass().getResourceAsStream(path);

        ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
        byte[] buf = new byte [1024];

        for( int i = resource.read(buf); i > 0; i = resource.read(buf)) {
            os.write(buf,0,i);
        }


        return os.toString("utf8");


    }
}
