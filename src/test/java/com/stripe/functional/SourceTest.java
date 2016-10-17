package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Source;
import com.stripe.net.RequestOptions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SourceTest extends BaseStripeFunctionalTest {
    @Test
    public void testSourceCreateRead() throws StripeException {
        RequestOptions sourceRequestOptions = RequestOptions.builder()
                .setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
                .build();

        Map<String, Object> ownerParams = new HashMap<String, Object>();
        ownerParams.put("email", "payinguser+fill_now@example.com");

        Map<String, Object> sourceCreateParams = new HashMap<String, Object>();
        sourceCreateParams.put("type", "bitcoin");
        sourceCreateParams.put("currency", "usd");
        sourceCreateParams.put("amount", 1000);
        sourceCreateParams.put("owner", ownerParams);

        Source created = Source.create(sourceCreateParams, sourceRequestOptions);

        assertEquals("bitcoin", created.getType());
        assertEquals("receiver", created.getFlow());

        // TODO: It's obviously very unpleasant to have all strings
        // here. The plan is to type-check these once any method makes
        // it to public beta. For now, unfortunately, the user will have
        // to actually cast the data to what they want.
        assertEquals(0, Long.parseLong(created.getTypeData().get("amount_charged")));

        Source retrieved = Source.retrieve(created.getId(), sourceRequestOptions);
        assertEquals(created.getId(), retrieved.getId());
    }
}
