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

public class SourceTest extends BaseStripeTest {
  @Before
  public void mockStripeResponseGetter() {
    APIResource.setStripeResponseGetter(networkMock);
  }

  @After
  public void unmockStripeResponseGetter() {
    /* This needs to be done because tests aren't isolated in Java */
    APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

  @Test
  public void testCreate() throws StripeException {
    HashMap<String, Object> ownerParams = new HashMap<String, Object>();
    ownerParams.put("email", "jenny.rosen@example.com");

    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("type", "bitcoin");
    params.put("amount", 1000);
    params.put("currency", "usd");
    params.put("owner", ownerParams);

    Source src = Source.create(params);

    verifyPost(Source.class, "https://api.stripe.com/v1/sources", params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    Source src = Source.retrieve("src_foo");

    verifyGet(Source.class, "https://api.stripe.com/v1/sources/src_foo");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testVerify() throws StripeException, IOException {
    stubNetwork(Source.class, resource("source_ach_debit.json"));
    Source src = Source.retrieve("src_19LGIDKCFFPkgtRhhqvVrz6T");
    verifyGet(Source.class, "https://api.stripe.com/v1/sources/src_19LGIDKCFFPkgtRhhqvVrz6T");

    Map params = new HashMap<String, Object>();
    Integer[] values = {32, 45};
    params.put("values", values);
    src.verify(params);
    verifyPost(
        Source.class,
        "https://api.stripe.com/v1/sources/src_19LGIDKCFFPkgtRhhqvVrz6T/verify",
        params
    );
  }
}
