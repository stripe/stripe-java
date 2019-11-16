package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
    ENUM_BAR("enum_bar"),
    ;

    private final String value;

    ParamCode(String value) {
      this.value = value;
    }

    @Override
    public String getValue() {
      return this.value;
    }
  }

  // The fields are implicitly used in testing serialization
  @SuppressWarnings("UnusedVariable")
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

  // The fields are implicitly used in testing serialization
  @SuppressWarnings("UnusedVariable")
  private static class RootModelHasNestedExtraParams extends ApiRequestParams {
    private String rootStringValue;
    private EnumParam rootEnumValue;
    private ModelHasExtraParams subParamFoo;

    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    private Map<String, String> extraParams;

    public RootModelHasNestedExtraParams(EnumParam rootEnumValue, ModelHasExtraParams subParamFoo) {
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

  private static class HasMetadataParams extends ApiRequestParams {
    @SerializedName("metadata")
    Map<String, String> metadata;

    @SerializedName("feature_map")
    Map<String, Long> featureMap;
  }

  private static class ModelHasExtraParamsWithWrongSerializedName extends ApiRequestParams {
    @SerializedName("extra_params")
    private Map<String, String> extraParams;
  }

  private static class IllegalModelHasWrongExtraParamsType extends ApiRequestParams {
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    String extraParams;
  }

  @Test
  public void testHasExtraParams() {
    ModelHasExtraParams params = new ModelHasExtraParams(ParamCode.ENUM_FOO);

    assertEquals(ModelHasExtraParams.expectedParams("enum_foo"), toMap(params));
  }

  @Test
  public void testHasExtraParamsWithFormEncodedKeys() {
    ModelHasExtraParams params = new ModelHasExtraParams(ParamCode.ENUM_FOO);
    params.extraParams.put("root_param[foo][string]", "value_foo");
    params.extraParams.put("root_param[bar][integer]", "123");

    Map<String, Object> expected = ModelHasExtraParams.expectedParams("enum_foo");
    assertNotEquals(expected, toMap(params));

    expected.put("root_param[foo][string]", "value_foo");
    expected.put("root_param[bar][integer]", "123");
    assertEquals(expected, toMap(params));
  }

  @Test
  public void testHasNestedExtraParams() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(ParamCode.ENUM_FOO);
    RootModelHasNestedExtraParams barParams =
        new RootModelHasNestedExtraParams(ParamCode.ENUM_BAR, fooParams);

    Map<String, Object> expected = RootModelHasNestedExtraParams.expectedParams("enum_bar");
    expected.put("sub_param_foo", ModelHasExtraParams.expectedParams("enum_foo"));

    assertEquals(expected, toMap(barParams));
  }

  @Test
  public void testHasNestedExtraParamsWithEmpty() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(EmptyParam.EMPTY);

    RootModelHasNestedExtraParams barParams =
        new RootModelHasNestedExtraParams(EmptyParam.EMPTY, fooParams);

    Map<String, Object> expected = RootModelHasNestedExtraParams.expectedParams(null);
    expected.put("sub_param_foo", ModelHasExtraParams.expectedParams(null));

    assertEquals(expected, toMap(barParams));
  }

  @Test
  public void testHasListExtraParams() {
    ModelHasListExtraParams params = new ModelHasListExtraParams();
    params.paramFooList =
        Arrays.asList(
            new ModelHasExtraParams(ParamCode.ENUM_FOO),
            new ModelHasExtraParams(ParamCode.ENUM_BAR));

    Map<String, Object> expected = new HashMap<>();
    expected.put(
        "param_foo_list",
        Arrays.asList(
            ModelHasExtraParams.expectedParams("enum_foo"),
            ModelHasExtraParams.expectedParams("enum_bar")));
    assertEquals(expected, toMap(params));
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testHasExtraParamsWithWrongSerializedName() {
    ModelHasExtraParamsWithWrongSerializedName params =
        new ModelHasExtraParamsWithWrongSerializedName();
    params.extraParams = new HashMap<>();
    params.extraParams.put("foo", "bar");

    Map<String, Object> untypedParams = toMap(params);
    assertEquals(1, untypedParams.size());
    assertTrue(untypedParams.containsKey("extra_params"));
    Map<String, Object> subParams = (Map<String, Object>) untypedParams.get("extra_params");
    assertEquals(1, subParams.size());
    assertEquals("bar", subParams.get("foo"));
  }

  @Test
  public void testIllegalExtraParamsType() {
    IllegalModelHasWrongExtraParamsType params = new IllegalModelHasWrongExtraParamsType();
    params.extraParams = "should have been a map";

    IllegalStateException exception =
        assertThrows(
            IllegalStateException.class,
            () -> {
              toMap(params);
            });
    assertTrue(exception.getMessage().contains("Unexpected schema for extra params"));
  }

  @Test
  public void testIllegalConflictingExtraParams() {
    ModelHasExtraParams fooParams = new ModelHasExtraParams(ParamCode.ENUM_FOO);
    // `string_value` will find two param values: one from the original param, the other from the
    // flattened extra param map.
    assertTrue(fooParams.toMap().containsKey("string_value"));
    fooParams.extraParams.put("string_value", "my conflicting param value");

    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              toMap(fooParams);
            });
    assertTrue(
        exception
            .getMessage()
            .contains(
                "Found param key `string_value` with values `foo` and `my conflicting param value`."));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMapsWithNullValue() {
    HasMetadataParams params = new HasMetadataParams();
    params.metadata = new HashMap<>();
    params.metadata.put("foo", "123");
    params.metadata.put("bar", null);

    params.featureMap = new HashMap<>();
    params.featureMap.put("fooLong", 123L);
    params.featureMap.put("barLong", null);

    Map<String, Object> untypedParams = toMap(params);
    Map<String, String> metadata = (Map<String, String>) untypedParams.get("metadata");
    assertEquals(metadata.size(), 2);
    assertEquals(metadata.get("foo"), "123");
    assertEquals(metadata.get("bar"), null);

    assertEquals(metadata.size(), 2);

    Map<String, String> featureMap = (Map<String, String>) untypedParams.get("feature_map");

    assertEquals(featureMap.size(), 2);
    assertEquals(featureMap.get("fooLong"), 123L);
    assertEquals(featureMap.get("barLong"), null);
  }

  private Map<String, Object> toMap(ApiRequestParams params) {
    return converter.convert(params);
  }
}
