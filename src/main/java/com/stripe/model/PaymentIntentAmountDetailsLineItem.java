// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentIntentAmountDetailsLineItemListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentAmountDetailsLineItem extends ApiResource implements HasId {
  /**
   * The discount applied on this line item represented in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An integer
   * greater than 0.
   *
   * <p>This field is mutually exclusive with the {@code amount_details[discount_amount]} field.
   */
  @SerializedName("discount_amount")
  Long discountAmount;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_intent_amount_details_line_item}.
   */
  @SerializedName("object")
  String object;

  /** Payment method-specific information for line items. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The product code of the line item, such as an SKU. Required for L3 rates. At most 12 characters
   * long.
   */
  @SerializedName("product_code")
  String productCode;

  /**
   * The product name of the line item. Required for L3 rates. At most 1024 characters long.
   *
   * <p>For Cards, this field is truncated to 26 alphanumeric characters before being sent to the
   * card networks. For Paypal, this field is truncated to 127 characters.
   */
  @SerializedName("product_name")
  String productName;

  /** The quantity of items. Required for L3 rates. An integer greater than 0. */
  @SerializedName("quantity")
  Long quantity;

  /** Contains information about the tax on the item. */
  @SerializedName("tax")
  Tax tax;

  /**
   * The unit cost of the line item represented in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. Required for
   * L3 rates. An integer greater than or equal to 0.
   */
  @SerializedName("unit_cost")
  Long unitCost;

  /**
   * A unit of measure for the line item, such as gallons, feet, meters, etc. Required for L3 rates.
   * At most 12 alphanumeric characters long.
   */
  @SerializedName("unit_of_measure")
  String unitOfMeasure;

  /** Lists all LineItems of a given PaymentIntent. */
  public static PaymentIntentAmountDetailsLineItemCollection list(
      String intent, Map<String, Object> params) throws StripeException {
    return list(intent, params, (RequestOptions) null);
  }

  /** Lists all LineItems of a given PaymentIntent. */
  public static PaymentIntentAmountDetailsLineItemCollection list(
      String intent, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/amount_details_line_items", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter()
        .request(request, PaymentIntentAmountDetailsLineItemCollection.class);
  }

  /** Lists all LineItems of a given PaymentIntent. */
  public static PaymentIntentAmountDetailsLineItemCollection list(
      String intent, PaymentIntentAmountDetailsLineItemListParams params) throws StripeException {
    return list(intent, params, (RequestOptions) null);
  }

  /** Lists all LineItems of a given PaymentIntent. */
  public static PaymentIntentAmountDetailsLineItemCollection list(
      String intent, PaymentIntentAmountDetailsLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/amount_details_line_items", ApiResource.urlEncodeId(intent));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter()
        .request(request, PaymentIntentAmountDetailsLineItemCollection.class);
  }

  /**
   * For more details about PaymentMethodOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions extends StripeObject {
    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("paypal")
    Paypal paypal;

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      @SerializedName("commodity_code")
      String commodityCode;
    }

    /**
     * For more details about CardPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      @SerializedName("commodity_code")
      String commodityCode;
    }

    /**
     * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
      @SerializedName("image_url")
      String imageUrl;

      @SerializedName("product_url")
      String productUrl;

      @SerializedName("reference")
      String reference;

      @SerializedName("subscription_reference")
      String subscriptionReference;
    }

    /**
     * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {
      /**
       * Type of the line item.
       *
       * <p>One of {@code digital_goods}, {@code donation}, or {@code physical_goods}.
       */
      @SerializedName("category")
      String category;

      /** Description of the line item. */
      @SerializedName("description")
      String description;

      /**
       * The Stripe account ID of the connected account that sells the item. This is only needed
       * when using <a
       * href="https://docs.stripe.com/connect/separate-charges-and-transfers">Separate Charges and
       * Transfers</a>.
       */
      @SerializedName("sold_by")
      String soldBy;
    }
  }

  /**
   * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tax extends StripeObject {
    /**
     * The total amount of tax on the transaction represented in the <a
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. Required
     * for L2 rates. An integer greater than or equal to 0.
     *
     * <p>This field is mutually exclusive with the {@code
     * amount_details[line_items][#][tax][total_tax_amount]} field.
     */
    @SerializedName("total_tax_amount")
    Long totalTaxAmount;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(paymentMethodOptions, responseGetter);
    trySetResponseGetter(tax, responseGetter);
  }
}
