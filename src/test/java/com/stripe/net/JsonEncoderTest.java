package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.param.common.EmptyParam;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class JsonEncoderTest extends BaseStripeTest {
  enum TestEnum {
    @SerializedName("foo")
    FOO,

    @SerializedName("bar")
    BAR,
  }

  static class TestParams extends ApiRequestParams {
    @SerializedName("name")
    public Object name;

    @SerializedName("nested")
    public NestedParams nested;

    @SerializedName("enum")
    public TestEnum eenum;
  }

  static class NestedParams {
    @SerializedName("email")
    public Object email;
  }

  @Test
  public void testCreateJsonContent() throws IOException {
    TestParams params = new TestParams();
    params.name = "name";
    params.nested = new NestedParams();
    params.nested.email = "a@example.com";
    params.eenum = TestEnum.FOO;

    HttpContent content = JsonEncoder.createHttpContent(ApiRequestParams.paramsToMap(params));

    assertNotNull(content);
    assertEquals("application/json", content.contentType());
    assertEquals(
        "{\"name\":\"name\",\"nested\":{\"email\":\"a@example.com\"},\"enum\":\"foo\"}",
        content.stringContent());
  }

  @Test
  public void testCreateJsonContentEmptyParam() throws IOException {
    TestParams params = new TestParams();
    params.name = EmptyParam.EMPTY;
    params.nested = new NestedParams();
    params.nested.email = EmptyParam.EMPTY;

    HttpContent content = JsonEncoder.createHttpContent(ApiRequestParams.paramsToMap(params));

    assertNotNull(content);
    assertEquals("application/json", content.contentType());
    assertEquals("{\"name\":null,\"nested\":{\"email\":null}}", content.stringContent());
  }
}
