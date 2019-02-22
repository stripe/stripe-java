package com.stripe.net;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.junit.Test;

public class ApiRequestParamsTest {

  enum ParamCode implements ApiRequestParams.Enum {
    EMPTY(""),
    OTHER("other_foo");

    private final String value;

    ParamCode(String value) {
      this.value = value;
    }

    @Override
    public String getValue() {
      return this.value;
    }
  }

  private static class ConcreteApiRequestParams extends ApiRequestParams {
    private ParamCode foo;
    private ParamCode bar;

    public void setFoo(ParamCode foo) {
      this.foo = foo;
    }

    public void setBar(ParamCode bar) {
      this.bar = bar;
    }
  }

  @Test
  public void testToMapWithEmptyEnumToNull() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    paramRequest.setFoo(ParamCode.EMPTY);
    paramRequest.setBar(null);
    Map<String, Object> paramMap = paramRequest.toMap();

    // present key but null value
    assertTrue(paramMap.containsKey("foo"));
    assertNull(paramMap.get("foo"));

    // inherently null field should not be deserialized
    assertFalse(paramMap.containsKey("bar"));
  }

  @Test
  public void testToMapWithNonEmpty() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    paramRequest.setFoo(ParamCode.OTHER);
    Map<String, Object> paramMap = paramRequest.toMap();

    assertEquals(1, paramMap.size());
    assertEquals(ParamCode.OTHER.getValue(), paramMap.get("foo"));
  }
}