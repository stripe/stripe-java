package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

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
import com.stripe.param.SubscriptionSearchParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class StripeSearchResultTest extends BaseStripeTest {
  @Test
  public void testPaginationWithStripeClient() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    StripeClient client = new StripeClient(srg);
    StripeResponse firstResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"search_result\", \"url\": \"/v1/subscriptions/search\", \"data\": [{\"object\": \"subscription\", \"id\": \"1\"}], \"has_more\": true, \"next_page\": "
                + "\"/v1/subscriptions/search?page=2\"}");
    StripeResponse secondResponse =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"object\": \"search_result\", \"url\": \"/v1/subscriptions\", \"data\": [{\"object\": \"subscription\", \"id\": \"2\"}], \"has_more\": false}");

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
    List<String> seen = new ArrayList<String>();
    for (final Subscription sub :
        client
            .subscriptions()
            .search(SubscriptionSearchParams.builder().build())
            .autoPagingIterable()) {
      assertInstanceOf(Subscription.class, sub);
      seen.add(sub.getId());
    }
    assertEquals(2, seen.size());
  }
}
