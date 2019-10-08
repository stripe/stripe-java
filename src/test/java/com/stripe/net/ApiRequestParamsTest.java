package com.stripe.net;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import com.google.gson.annotations.SerializedName;
import com.stripe.param.common.EmptyParam;
import java.util.Map;
import lombok.Setter;
import org.junit.Test;

public class ApiRequestParamsTest {
  enum ParamCode implements ApiRequestParams.EnumParam {
    OTHER("other");

    private final String value;

    ParamCode(String value) {
      this.value = value;
    }

    @Override
    public String getValue() {
      return this.value;
    }
  }

  @SuppressWarnings("unused")
  private static class ConcreteApiRequestParams extends ApiRequestParams {
    @SerializedName("foo_enum")
    private ApiRequestParams.EnumParam foo;

    @SerializedName("bar_enum")
    private ApiRequestParams.EnumParam bar;

    @SerializedName("baz_string")
    private Object bazString;

    @Setter
    @SerializedName("boo_code")
    private ParamCode booCode;

    // Overloaded setters for polymorphic enum, allowing the empty enum
    public void setFoo(ParamCode foo) {
      this.foo = foo;
    }

    public void setFoo(EmptyParam foo) {
      this.foo = foo;
    }

    public void setBar(ParamCode bar) {
      this.bar = bar;
    }

    public void setBar(EmptyParam bar) {
      this.bar = bar;
    }

    public void setBazString(String baz) {
      this.bazString = baz;
    }

    public void setBazString(EmptyParam baz) {
      this.bazString = baz;
    }
  }

  @SuppressWarnings("unused")
  private static class WithBooleanApiRequestParams extends ApiRequestParams {
    @SerializedName("boolean_param")
    Boolean booleanParam;

    @SerializedName("primitive_boolean_param")
    boolean primitiveBooleanParam;
  }

  @Test
  public void testToMapWithEmptyEnumToNull() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    // The ordering of param definition is important to verify that deserializer to null works
    // correctly.
    // With empty string enum "" we are okay serialize to null value, so this switch
    // mode of the serializer. After that finish writing this empty enum, we are back to dropping
    // null key.
    paramRequest.setFoo(EmptyParam.EMPTY);
    paramRequest.setBar((ParamCode) null);
    Map<String, Object> paramMap = paramRequest.toMap();

    // present key but null value
    assertTrue(paramMap.containsKey("foo_enum"));
    assertNull(paramMap.get("foo_enum"));

    // inherently null field should not be deserialized
    assertFalse(paramMap.containsKey("bar_enum"));

    // Test the reverse, just in case the param model definition has different order
    paramRequest = new ConcreteApiRequestParams();
    paramRequest.setFoo((ParamCode) null);
    paramRequest.setBar(EmptyParam.EMPTY);
    paramMap = paramRequest.toMap();
    assertTrue(paramMap.containsKey("bar_enum"));
    assertNull(paramMap.get("bar_enum"));

    assertFalse(paramMap.containsKey("foo_enum"));
  }

  @Test
  public void testToMapWithNonEmpty() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    paramRequest.setFoo(ParamCode.OTHER);
    Map<String, Object> paramMap = paramRequest.toMap();

    assertEquals(1, paramMap.size());
    assertEquals(ParamCode.OTHER.getValue(), paramMap.get("foo_enum"));
  }

  @Test
  public void testToMapWithEmptyStringDoesNotGetAffected() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    paramRequest.setFoo(EmptyParam.EMPTY);

    paramRequest.setBazString("");
    Map<String, Object> paramMap = paramRequest.toMap();

    assertEquals(2, paramMap.size());

    // present key but null value
    assertTrue(paramMap.containsKey("foo_enum"));
    assertNull(paramMap.get("foo_enum"));

    assertTrue(paramMap.containsKey("baz_string"));
    assertEquals("", paramMap.get("baz_string"));
  }

  @Test
  public void testToMapWithEmptyParamForStringIsNull() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    paramRequest.setBazString(EmptyParam.EMPTY);
    Map<String, Object> paramMap = paramRequest.toMap();

    assertEquals(1, paramMap.size());

    // present key but null value
    assertTrue(paramMap.containsKey("baz_string"));
    assertNull(paramMap.get("baz_string"));
  }

  @Test
  public void testToMapWithNormalParamDoesNotGetAffected() {
    ConcreteApiRequestParams paramRequest = new ConcreteApiRequestParams();
    paramRequest.setFoo(EmptyParam.EMPTY);

    paramRequest.setBooCode(ParamCode.OTHER);
    Map<String, Object> paramMap = paramRequest.toMap();

    assertEquals(2, paramMap.size());

    // present key but null value
    assertTrue(paramMap.containsKey("foo_enum"));
    assertNull(paramMap.get("foo_enum"));

    assertTrue(paramMap.containsKey("boo_code"));
    assertEquals(ParamCode.OTHER.getValue(), paramMap.get("boo_code"));
  }

  @Test
  public void testToMapWithBooleanParams() {
    ApiRequestParams params = new WithBooleanApiRequestParams();
    Map<String, Object> paramMap = params.toMap();
    assertEquals(1, paramMap.size());
    assertFalse("Found uninitialized param in param map", paramMap.containsKey("boolean_param"));

    // primitive boolean is default false and is converted into map param accordingly
    assertTrue(paramMap.containsKey("primitive_boolean_param"));
    assertEquals(false, paramMap.get("primitive_boolean_param"));
  }
}
