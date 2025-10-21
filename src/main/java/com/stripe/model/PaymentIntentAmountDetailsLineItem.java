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
  /** The amount an item was discounted for. Positive integer. */
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

  /** Unique identifier of the product. At most 12 characters long. */
  @SerializedName("product_code")
  String productCode;

  /** Name of the product. At most 100 characters long. */
  @SerializedName("product_name")
  String productName;

  /** Number of items of the product. Positive integer. */
  @SerializedName("quantity")
  Long quantity;

  /** Contains information about the tax on the item. */
  @SerializedName("tax")
  Tax tax;

  /** Cost of the product. Non-negative integer. */
  @SerializedName("unit_cost")
  Long unitCost;

  /** A unit of measure for the line item, such as gallons, feet, meters, etc. */
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
    /** Total portion of the amount that is for tax. */
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
