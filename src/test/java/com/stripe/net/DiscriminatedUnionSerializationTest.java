package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class DiscriminatedUnionSerializationTest {
  private final ApiRequestParamsConverter converter = new ApiRequestParamsConverter();

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

    @SerializedName("r")
    Long r;

    @SerializedName("g")
    Long g;

    @SerializedName("b")
    Long b;

    @SerializedName("h")
    Long h;

    @SerializedName("s")
    Long s;

    @SerializedName("v")
    Long v;
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

    TestColorContainer container = ApiResource.GSON.fromJson(json, TestColorContainer.class);

    assertEquals("sunset", container.name);
    assertEquals("rgb", container.color.model);
    assertEquals(Long.valueOf(255L), container.color.r);
    assertEquals(Long.valueOf(128L), container.color.g);
    assertEquals(Long.valueOf(0L), container.color.b);

    // Non-selected variant fields remain null.
    assertEquals(null, container.color.h);
    assertEquals(null, container.color.s);
    assertEquals(null, container.color.v);
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
