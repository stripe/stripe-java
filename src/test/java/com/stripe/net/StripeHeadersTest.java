package com.stripe.net;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.net.StripeHeaders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StripeHeadersTest extends BaseStripeTest {

  private Map<String, List<String>> generateHeaderMap() {
    List<String> multiValueHeader = new ArrayList<String>();
    multiValueHeader.add("FirstValue");
    multiValueHeader.add("SecondValue");
 
    List<String> requestIdHeader = new ArrayList<String>();
    requestIdHeader.add("req_12345");
 
    Map<String, List<String>> headerMap = new HashMap<String, List<String>>();
    headerMap.put("Request-Id", requestIdHeader);
    headerMap.put("Multi-Val", multiValueHeader);
    headerMap.put("Empty-Header", new ArrayList<String>());
 
    return headerMap;
  }

  @Test
  public void testGet() {
    StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals("req_12345", headers.get("Request-Id"));
    assertEquals("FirstValue", headers.get("Multi-Val"));
  }

  @Test
  public void testValues() {
    StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals(2, headers.values("Multi-Val").size());
    assertEquals("FirstValue", headers.values("Multi-Val").get(0));
    assertEquals("SecondValue", headers.values("Multi-Val").get(1));
  }

  @Test
  public void testGetEmpty() {
    StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals(null, headers.get("Empty-Header"));
  }
}
