package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.annotations.SerializedName;

import com.stripe.param.common.EmptyParam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class ApiRequestParamsConverterTest {
  private ApiRequestParamsConverter converter = new ApiRequestParamsConverter();

  // To test interactions between the flattening and empty enums
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

  private static class ModelHasExtraParams extends ApiRequestParams {
    private String stringValue;
    private EnumParam enumValue;

    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    private Map<String, Object> extraParams;

    public ModelHasExtraParams(EnumParam enumValue) {
      this.stringValue = "foo";
      this.enumValue = enumValue;
      this.extraParams = new HashMap<>();
      this.extraParams.put("hello", "world");
    }

    static Map<String, Object> expectedParams(String enumString) {
      Map<String, Object> paramMap = new HashMap<>();
      paramMap.put("string_value", "foo");
      paramMap.put("enum_value", enumString);
      // "hello" key is flattened to the same level as root-level params
      // and the key for `extraParams` is dropped
      paramMap.put("hello", "world");
      return paramMap;
    }
  }

  private static class RootModelHasNestedExtraParams extends ApiRequestParams {
    private String rootStringValue;
    private EnumParam rootEnumValue;
    private ModelHasExtraParams subParamFoo;

    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    private Map<String, Object> extraParams;

    public RootModelHasNestedExtraParams(EnumParam rootEnumValue,
                                         ModelHasExtraParams subParamFoo) {
      this.rootStringValue = "bar";
      this.rootEnumValue = rootEnumValue;
      this.subParamFoo = subParamFoo;
      this.extraParams = new HashMap<>();
      this.extraParams.put("bar_hello", "bar_world");
    }

    static Map<String, Object> expectedParams(String enumString) {
      Map<String, Object> rootLevelParams = new HashMap<>();
      rootLevelParams.put("root_string_value", "bar");
      rootLevelParams.put("root_enum_value", enumString);
      // similar to the `ModelHasExtraParams` test model,
      // "bar_hello" key is flattened to the same level as root-level params
      rootLevelParams.put("bar_hello", "bar_world");
      return rootLevelParams;
    }
  }

  private static class ModelHasListExtraParams extends ApiRequestParams {
    List<ModelHasExtraParams> paramFooList;
  }

  private static class IllegalModelWithExtraParams extends ApiRequestParams {
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    String extraParams;
  }

  private static class ModelHasExtraParamsWithWrongSerializedName extends ApiRequestParams {
    @SerializedName("extra_params")
    private Map<String, Object> extraParams;
  }

  @Test
  public void testHasExtraParams() {
    ModelHasExtraParams params = new ModelHasExtraParams(ParamCode.ENUM_FOO);

    assertEquals(
        ModelHasExtraParams.expectedParams("enum_foo"),
        toMap(params));
  }

  @Test
  public void testHasNestedExtraParams() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(ParamCode.ENUM_FOO);
    RootModelHasNestedExtraParams barParams = new RootModelHasNestedExtraParams(
        ParamCode.ENUM_BAR, fooParams);

    Map<String, Object> expected = RootModelHasNestedExtraParams.expectedParams("enum_bar");
    expected.put("sub_param_foo", ModelHasExtraParams.expectedParams("enum_foo"));

    assertEquals(expected, toMap(barParams));
  }

  @Test
  public void testHasListExtraParams() {
    ModelHasListExtraParams params = new ModelHasListExtraParams();
    params.paramFooList = Arrays.asList(
        new ModelHasExtraParams(ParamCode.ENUM_FOO),
        new ModelHasExtraParams(ParamCode.ENUM_BAR)
    );

    Map<String, Object> expected = new HashMap<>();
    expected.put("param_foo_list",
        Arrays.asList(
            ModelHasExtraParams.expectedParams("enum_foo"),
            ModelHasExtraParams.expectedParams("enum_bar")
        ));
    assertEquals(expected, toMap(params));
  }

  @Test
  public void testModelHasExtraParamsWithWrongSerializedName() {
    ModelHasExtraParamsWithWrongSerializedName params =
        new ModelHasExtraParamsWithWrongSerializedName();
    params.extraParams = new HashMap<>();
    params.extraParams.put("foo", "bar");

    Map<String, Object> untypedParams = toMap(params);
    assertEquals(1, untypedParams.size());
    assertTrue(untypedParams.containsKey("extra_params"));
    Map<String, Object> subParams = (Map<String, Object>)untypedParams.get("extra_params");
    assertEquals(1, subParams.size());
    assertEquals("bar", subParams.get("foo"));
  }

  @Test
  public void testNestedHasExtraParamsWithEmpty() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(EmptyParam.EMPTY);

    RootModelHasNestedExtraParams barParams = new RootModelHasNestedExtraParams(
        EmptyParam.EMPTY, fooParams);

    Map<String, Object> expectedParams = RootModelHasNestedExtraParams.expectedParams(null);
    expectedParams.put("sub_param_foo", ModelHasExtraParams.expectedParams(null));

    assertEquals(expectedParams, toMap(barParams));
  }

  @Test
  public void testIllegalExtraParamsType() {
    IllegalModelWithExtraParams params = new IllegalModelWithExtraParams();
    params.extraParams = "should have been a map";

    IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
      toMap(params);
    });
    assertTrue(exception.getMessage().contains("Unexpected schema for extra params"));
  }

  private Map<String, Object> toMap(ApiRequestParams params) {
    return converter.convert(params);
  }
}