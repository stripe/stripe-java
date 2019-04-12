package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;

class ApiResourceTest {

  @Test
  public void testUrlEncodeId() throws UnsupportedEncodingException {
    assertEquals("cus_123", ApiResource.urlEncode("cus_123"));
    // legacy Ids allow customer-defined and can have arbitrary names
    assertEquals("Plan+100%24%2Fmonth", ApiResource.urlEncode("Plan 100$/month"));
  }
}