package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stripe.model.StripeObject;
import java.io.IOException;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class DiscriminatedUnionSerializationTest {
  private final ApiRequestParamsConverter converter = new ApiRequestParamsConverter();

  private final Gson testGson =
      new GsonBuilder()
          .registerTypeAdapterFactory(new TestColorTypeAdapterFactory())
          .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
          .create();

  // ---------------------------------------------------------------------------
  // Request-side fixtures — standalone union
  // The parent params hold an Object-typed field that can hold any variant.
  // ---------------------------------------------------------------------------

  @SuppressWarnings("UnusedVariable")
  private static class TestCreateParams extends ApiRequestParams {
    @SerializedName("color")
    Object color;

    @SerializedName("name")
    String name;
  }

  @SuppressWarnings("UnusedVariable")
  private static class TestRgbColorParams extends ApiRequestParams {
    @SerializedName("model")
    String model = "rgb";

    @SerializedName("r")
    Long r;

    @SerializedName("g")
    Long g;

    @SerializedName("b")
    Long b;
  }

  @SuppressWarnings("UnusedVariable")
  private static class TestHsvColorParams extends ApiRequestParams {
    @SerializedName("model")
    String model = "hsv";

    @SerializedName("h")
    Long h;

    @SerializedName("s")
    Long s;

    @SerializedName("v")
    Long v;
  }

  // ---------------------------------------------------------------------------
  // Request-side fixtures — inline union
  // The parent params hold the discriminator and each variant's fields directly.
  // ---------------------------------------------------------------------------

  @SuppressWarnings("UnusedVariable")
  private static class TestInlineParams extends ApiRequestParams {
    @SerializedName("type")
    String type;

    @SerializedName("card")
    TestCardParams card;

    @SerializedName("bank")
    TestBankParams bank;
  }

  @SuppressWarnings("UnusedVariable")
  private static class TestCardParams extends ApiRequestParams {
    @SerializedName("number")
    String number;

    @SerializedName("exp_month")
    Long expMonth;
  }

  @SuppressWarnings("UnusedVariable")
  private static class TestBankParams extends ApiRequestParams {
    @SerializedName("routing_number")
    String routingNumber;

    @SerializedName("account_number")
    String accountNumber;
  }

  // ---------------------------------------------------------------------------
  // Response-side fixtures
  // ---------------------------------------------------------------------------

  private static class TestColorEntity extends StripeObject {
    @SerializedName("model")
    String model;
  }

  private static class TestRgbColorEntity extends TestColorEntity {
    @SerializedName("r")
    Long r;

    @SerializedName("g")
    Long g;

    @SerializedName("b")
    Long b;
  }

  private static class TestHsvColorEntity extends TestColorEntity {
    @SerializedName("h")
    Long h;

    @SerializedName("s")
    Long s;

    @SerializedName("v")
    Long v;
  }

  private static class TestColorTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    @SuppressWarnings("unchecked")
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!TestColorEntity.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      return (TypeAdapter<T>)
          new TypeAdapter<TestColorEntity>() {
            @Override
            @SuppressWarnings("unchecked")
            public void write(JsonWriter out, TestColorEntity value) throws IOException {
              ((TypeAdapter<TestColorEntity>) gson.getAdapter(value.getClass())).write(out, value);
            }

            @Override
            public TestColorEntity read(JsonReader in) throws IOException {
              JsonObject obj = JsonParser.parseReader(in).getAsJsonObject();
              String model = obj.has("model") ? obj.get("model").getAsString() : null;
              if ("rgb".equals(model)) {
                return gson.getDelegateAdapter(
                        TestColorTypeAdapterFactory.this, TypeToken.get(TestRgbColorEntity.class))
                    .fromJsonTree(obj);
              } else if ("hsv".equals(model)) {
                return gson.getDelegateAdapter(
                        TestColorTypeAdapterFactory.this, TypeToken.get(TestHsvColorEntity.class))
                    .fromJsonTree(obj);
              }
              return gson.getDelegateAdapter(
                      TestColorTypeAdapterFactory.this, TypeToken.get(TestColorEntity.class))
                  .fromJsonTree(obj);
            }
          };
    }
  }

  private static class TestColorContainer extends StripeObject {
    @SerializedName("color")
    TestColorEntity color;

    @SerializedName("name")
    String name;
  }

  private static class TestPaymentEntity extends StripeObject {
    @SerializedName("type")
    String type;

    @SerializedName("card")
    TestCardEntity card;

    @SerializedName("bank")
    TestBankEntity bank;
  }

  private static class TestCardEntity extends StripeObject {
    @SerializedName("number")
    String number;

    @SerializedName("exp_month")
    Long expMonth;
  }

  private static class TestBankEntity extends StripeObject {
    @SerializedName("routing_number")
    String routingNumber;

    @SerializedName("account_number")
    String accountNumber;
  }

  // ---------------------------------------------------------------------------
  // Tests — request side (params → map)
  // ---------------------------------------------------------------------------

  @Test
  @SuppressWarnings("unchecked")
  public void testStandaloneUnion_RgbVariant_Serialization() {
    TestRgbColorParams rgb = new TestRgbColorParams();
    rgb.r = 255L;
    rgb.g = 128L;
    rgb.b = 0L;

    TestCreateParams params = new TestCreateParams();
    params.color = rgb;
    params.name = "sunset";

    Map<String, Object> map = converter.convert(params);
    assertEquals("sunset", map.get("name"));

    Map<String, Object> colorMap = (Map<String, Object>) map.get("color");
    assertEquals("rgb", colorMap.get("model"));
    assertEquals(255L, colorMap.get("r"));
    assertEquals(128L, colorMap.get("g"));
    assertEquals(0L, colorMap.get("b"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testStandaloneUnion_HsvVariant_Serialization() {
    TestHsvColorParams hsv = new TestHsvColorParams();
    hsv.h = 30L;
    hsv.s = 100L;
    hsv.v = 100L;

    TestCreateParams params = new TestCreateParams();
    params.color = hsv;
    params.name = "orange";

    Map<String, Object> map = converter.convert(params);
    assertEquals("orange", map.get("name"));

    Map<String, Object> colorMap = (Map<String, Object>) map.get("color");
    assertEquals("hsv", colorMap.get("model"));
    assertEquals(30L, colorMap.get("h"));
    assertEquals(100L, colorMap.get("s"));
    assertEquals(100L, colorMap.get("v"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testInlineUnion_CardVariant_Serialization() {
    TestCardParams card = new TestCardParams();
    card.number = "4242424242424242";
    card.expMonth = 12L;

    TestInlineParams params = new TestInlineParams();
    params.type = "card";
    params.card = card;

    Map<String, Object> map = converter.convert(params);
    assertEquals("card", map.get("type"));

    Map<String, Object> cardMap = (Map<String, Object>) map.get("card");
    assertEquals("4242424242424242", cardMap.get("number"));
    assertEquals(12L, cardMap.get("exp_month"));

    // Non-selected variant is not present in serialized output.
    assertEquals(null, map.get("bank"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testInlineUnion_BankVariant_Serialization() {
    TestBankParams bank = new TestBankParams();
    bank.routingNumber = "110000000";
    bank.accountNumber = "000123456789";

    TestInlineParams params = new TestInlineParams();
    params.type = "bank";
    params.bank = bank;

    Map<String, Object> map = converter.convert(params);
    assertEquals("bank", map.get("type"));

    Map<String, Object> bankMap = (Map<String, Object>) map.get("bank");
    assertEquals("110000000", bankMap.get("routing_number"));
    assertEquals("000123456789", bankMap.get("account_number"));
  }

  // ---------------------------------------------------------------------------
  // Tests — response side (JSON → object)
  // ---------------------------------------------------------------------------

  @Test
  public void testStandaloneUnion_RgbVariant_Deserialization() {
    String json =
        "{\"color\": {\"model\": \"rgb\", \"r\": 255, \"g\": 128, \"b\": 0}, \"name\": \"sunset\"}";

    TestColorContainer container = testGson.fromJson(json, TestColorContainer.class);

    assertEquals("sunset", container.name);
    assertTrue(container.color instanceof TestRgbColorEntity);
    TestRgbColorEntity rgb = (TestRgbColorEntity) container.color;
    assertEquals("rgb", rgb.model);
    assertEquals(Long.valueOf(255L), rgb.r);
    assertEquals(Long.valueOf(128L), rgb.g);
    assertEquals(Long.valueOf(0L), rgb.b);
  }

  @Test
  public void testStandaloneUnion_HsvVariant_Deserialization() {
    String json =
        "{\"color\": {\"model\": \"hsv\", \"h\": 30, \"s\": 100, \"v\": 50}, \"name\": \"orange\"}";

    TestColorContainer container = testGson.fromJson(json, TestColorContainer.class);

    assertEquals("orange", container.name);
    assertTrue(container.color instanceof TestHsvColorEntity);
    TestHsvColorEntity hsv = (TestHsvColorEntity) container.color;
    assertEquals("hsv", hsv.model);
    assertEquals(Long.valueOf(30L), hsv.h);
    assertEquals(Long.valueOf(100L), hsv.s);
    assertEquals(Long.valueOf(50L), hsv.v);
  }

  @Test
  public void testInlineUnion_CardVariant_Deserialization() {
    String json =
        "{\"type\": \"card\", \"card\": {\"number\": \"4242424242424242\", \"exp_month\": 12}}";

    TestPaymentEntity entity = ApiResource.GSON.fromJson(json, TestPaymentEntity.class);

    assertEquals("card", entity.type);
    assertEquals("4242424242424242", entity.card.number);
    assertEquals(Long.valueOf(12L), entity.card.expMonth);

    // Non-selected variant remains null.
    assertEquals(null, entity.bank);
  }
}
