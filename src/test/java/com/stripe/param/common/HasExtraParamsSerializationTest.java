package com.stripe.param.common;


import static junit.framework.TestCase.assertEquals;

import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class HasExtraParamsSerializationTest {

  enum ParamCode implements ApiRequestParams.EnumParam {
    ENUM_FOO("enum_foo"),
    ENUM_BAR("enum_bar"),;

    private final String value;

    ParamCode(String value) {
      this.value = value;
    }

    @Override
    public String getValue() {
      return this.value;
    }
  }

  private static class ModelHasExtraParams extends ApiRequestParams implements HasExtraParams {
    private String stringValue;
    private EnumParam enumValue;

    public ModelHasExtraParams(EnumParam enumValue) {
      this.stringValue = "foo";
      this.enumValue = enumValue;
      this.extraParams = new HashMap<>();
      this.extraParams.put("hello", "world");
    }

    @Override
    public Map<String, String> getExtraParam() {
      return this.extraParams;
    }

    static Map<String, Object> expectedParams(String enumString) {
      Map<String, Object> paramMap = new HashMap<>();
      paramMap.put("string_value", "foo");
      paramMap.put("enum_value", enumString);
      paramMap.put("hello", "world");
      return paramMap;
    }
  }

  private static class RootModelHasNestedExtraParams extends ApiRequestParams implements HasExtraParams {

    private String rootStringValue;
    private EnumParam rootEnumValue;
    private ModelHasExtraParams subParamFoo;

    public RootModelHasNestedExtraParams(EnumParam rootEnumValue,
                                         ModelHasExtraParams subParamFoo) {
      this.rootStringValue = "bar";
      this.rootEnumValue = rootEnumValue;
      this.subParamFoo = subParamFoo;
      this.extraParams = new HashMap<>();
      this.extraParams.put("bar_hello", "bar_world");
    }

    @Override
    public Map<String, String> getExtraParam() {
      return this.extraParams;
    }

    static Map<String, Object> expectedParams(String enumString) {
      Map<String, Object> rootLevelParams = new HashMap<>();
      rootLevelParams.put("root_string_value", "bar");
      rootLevelParams.put("root_enum_value", enumString);
      rootLevelParams.put("bar_hello", "bar_world");
      return rootLevelParams;
    }
  }

  @Test
  public void testHasExtraParams() {
    ModelHasExtraParams params = new ModelHasExtraParams(ParamCode.ENUM_FOO);

    assertEquals(
        ModelHasExtraParams.expectedParams("enum_foo"),
        params.toMap());
  }

  @Test
  public void testNestedHasExtraParams() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(ParamCode.ENUM_FOO);
    RootModelHasNestedExtraParams barParams = new RootModelHasNestedExtraParams(
        ParamCode.ENUM_BAR, fooParams);

    Map<String, Object> expected = RootModelHasNestedExtraParams.expectedParams("enum_bar");
    expected.put("sub_param_foo", ModelHasExtraParams.expectedParams("enum_foo"));

    assertEquals(expected, barParams.toMap());
  }

  @Test
  public void testNestedHasExtraParamsWithEmpty() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(EmptyParam.EMPTY);

    RootModelHasNestedExtraParams barParams = new RootModelHasNestedExtraParams(
        EmptyParam.EMPTY, fooParams);

    Map<String, Object> expectedParams = RootModelHasNestedExtraParams.expectedParams(null);
    expectedParams.put("sub_param_foo", ModelHasExtraParams.expectedParams(null));

    assertEquals(expectedParams, barParams.toMap());
  }
}