package com.stripe.functional;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Source;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SourceTest extends BaseStripeFunctionalTest {
  @Test
  public void testSourceCreateRead() throws StripeException {
    final RequestOptions sourceRequestOptions = RequestOptions.builder()
        .setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
        .build();

    Map<String, Object> ownerParams = new HashMap<String, Object>();
    ownerParams.put("email", "payinguser+fill_now@example.com");

    Map<String, Object> sourceCreateParams = new HashMap<String, Object>();
    sourceCreateParams.put("type", "ach_credit_transfer");
    sourceCreateParams.put("currency", "usd");
    sourceCreateParams.put("owner", ownerParams);

    Source created = Source.create(sourceCreateParams, sourceRequestOptions);

    assertEquals("ach_credit_transfer", created.getType());
    assertEquals("receiver", created.getFlow());

    assertEquals(false, created.getTypeData().isEmpty());

    Source retrieved = Source.retrieve(created.getId(), sourceRequestOptions);
    assertEquals(created.getId(), retrieved.getId());
  }
}
