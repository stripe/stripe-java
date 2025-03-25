// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CustomerListPaymentMethodsParams extends ApiRequestParams {
  /**
   * This field indicates whether this payment method can be shown again to its customer in a
   * checkout flow. Stripe products such as Checkout and Elements use this field to determine
   * whether a payment method can be shown as a saved payment method in a checkout flow. The field
   * defaults to {@code unspecified}.
   */
  @SerializedName("allow_redisplay")
  AllowRedisplay allowRedisplay;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * An optional filter on the list, based on the object {@code type} field. Without the filter, the
   * list includes all current and future payment method types. If your integration expects only one
   * type of payment method in the response, make sure to provide a type value in the request.
   */
  @SerializedName("type")
  Type type;

  private CustomerListPaymentMethodsParams(
      AllowRedisplay allowRedisplay,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String startingAfter,
      Type type) {
    this.allowRedisplay = allowRedisplay;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AllowRedisplay allowRedisplay;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String startingAfter;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerListPaymentMethodsParams build() {
      return new CustomerListPaymentMethodsParams(
          this.allowRedisplay,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.startingAfter,
          this.type);
    }

    /**
     * This field indicates whether this payment method can be shown again to its customer in a
     * checkout flow. Stripe products such as Checkout and Elements use this field to determine
     * whether a payment method can be shown as a saved payment method in a checkout flow. The field
     * defaults to {@code unspecified}.
     */
    public Builder setAllowRedisplay(
        CustomerListPaymentMethodsParams.AllowRedisplay allowRedisplay) {
      this.allowRedisplay = allowRedisplay;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerListPaymentMethodsParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerListPaymentMethodsParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerListPaymentMethodsParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CustomerListPaymentMethodsParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * An optional filter on the list, based on the object {@code type} field. Without the filter,
     * the list includes all current and future payment method types. If your integration expects
     * only one type of payment method in the response, make sure to provide a type value in the
     * request.
     */
    public Builder setType(CustomerListPaymentMethodsParams.Type type) {
      this.type = type;
      return this;
    }
  }

  public enum AllowRedisplay implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("limited")
    LIMITED("limited"),

    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AllowRedisplay(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("acss_debit")
    ACSS_DEBIT("acss_debit"),

    @SerializedName("affirm")
    AFFIRM("affirm"),

    @SerializedName("afterpay_clearpay")
    AFTERPAY_CLEARPAY("afterpay_clearpay"),

    @SerializedName("alipay")
    ALIPAY("alipay"),

    @SerializedName("alma")
    ALMA("alma"),

    @SerializedName("amazon_pay")
    AMAZON_PAY("amazon_pay"),

    @SerializedName("au_becs_debit")
    AU_BECS_DEBIT("au_becs_debit"),

    @SerializedName("bacs_debit")
    BACS_DEBIT("bacs_debit"),

    @SerializedName("bancontact")
    BANCONTACT("bancontact"),

    @SerializedName("billie")
    BILLIE("billie"),

    @SerializedName("blik")
    BLIK("blik"),

    @SerializedName("boleto")
    BOLETO("boleto"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("cashapp")
    CASHAPP("cashapp"),

    @SerializedName("customer_balance")
    CUSTOMER_BALANCE("customer_balance"),

    @SerializedName("eps")
    EPS("eps"),

    @SerializedName("fpx")
    FPX("fpx"),

    @SerializedName("giropay")
    GIROPAY("giropay"),

    @SerializedName("grabpay")
    GRABPAY("grabpay"),

    @SerializedName("ideal")
    IDEAL("ideal"),

    @SerializedName("kakao_pay")
    KAKAO_PAY("kakao_pay"),

    @SerializedName("klarna")
    KLARNA("klarna"),

    @SerializedName("konbini")
    KONBINI("konbini"),

    @SerializedName("kr_card")
    KR_CARD("kr_card"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("mobilepay")
    MOBILEPAY("mobilepay"),

    @SerializedName("multibanco")
    MULTIBANCO("multibanco"),

    @SerializedName("naver_pay")
    NAVER_PAY("naver_pay"),

    @SerializedName("nz_bank_account")
    NZ_BANK_ACCOUNT("nz_bank_account"),

    @SerializedName("oxxo")
    OXXO("oxxo"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("pay_by_bank")
    PAY_BY_BANK("pay_by_bank"),

    @SerializedName("payco")
    PAYCO("payco"),

    @SerializedName("paynow")
    PAYNOW("paynow"),

    @SerializedName("paypal")
    PAYPAL("paypal"),

    @SerializedName("pix")
    PIX("pix"),

    @SerializedName("promptpay")
    PROMPTPAY("promptpay"),

    @SerializedName("revolut_pay")
    REVOLUT_PAY("revolut_pay"),

    @SerializedName("samsung_pay")
    SAMSUNG_PAY("samsung_pay"),

    @SerializedName("satispay")
    SATISPAY("satispay"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit"),

    @SerializedName("sofort")
    SOFORT("sofort"),

    @SerializedName("swish")
    SWISH("swish"),

    @SerializedName("twint")
    TWINT("twint"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account"),

    @SerializedName("wechat_pay")
    WECHAT_PAY("wechat_pay"),

    @SerializedName("zip")
    ZIP("zip");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
