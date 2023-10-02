package com.stripe.functional;

import com.stripe.BaseStripeTest;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.Subscription;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpHeaders;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class StripeCollectionTest extends BaseStripeTest {
  @Test
  public void testPaginationWithStripeClient() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    StripeClient client = new StripeClient(srg);
    StripeResponse firstResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"list\", \"url\": \"/v1/subscriptions\", \"data\": [{\"object\": \"subscription\", \"id\": \"1\"}], \"has_more\": true}");
    StripeResponse secondResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"list\", \"url\": \"/v1/subscriptions\", \"data\": [{\"object\": \"subscription\", \"id\": \"2\"}], \"has_more\": false}");

    AtomicInteger count = new AtomicInteger(0);
    Mockito.doAnswer(
            new Answer<StripeResponse>() {
              public StripeResponse answer(InvocationOnMock invocation) {
                if (count.getAndIncrement() == 0) {
                  return firstResponse;
                }
                return secondResponse;
              }
            })
        .when(spy)
        .requestWithRetries(Mockito.<StripeRequest>any());
    for (final Subscription sub : client.subscriptions().list().autoPagingIterable()) {
      System.out.print(sub.getId());
    }
  }
}
