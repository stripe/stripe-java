// File generated from our OpenAPI spec
package com.stripe.model.delegatedcheckout;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.delegatedcheckout.RequestedSessionConfirmParams;
import com.stripe.param.delegatedcheckout.RequestedSessionCreateParams;
import com.stripe.param.delegatedcheckout.RequestedSessionExpireParams;
import com.stripe.param.delegatedcheckout.RequestedSessionRetrieveParams;
import com.stripe.param.delegatedcheckout.RequestedSessionUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A requested session is a session that has been requested by a customer. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RequestedSession extends ApiResource
    implements HasId, MetadataStore<RequestedSession> {
  /** The subtotal amount of the requested session. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** The total amount of the requested session. */
  @SerializedName("amount_total")
  Long amountTotal;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created_at")
  Long createdAt;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The customer for this requested session. */
  @SerializedName("customer")
  String customer;

  /** Time at which the requested session expires. Measured in seconds since the Unix epoch. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** The details of the fulfillment. */
  @SerializedName("fulfillment_details")
  FulfillmentDetails fulfillmentDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The line items to be purchased. */
  @SerializedName("line_item_details")
  List<RequestedSession.LineItemDetail> lineItemDetails;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code delegated_checkout.requested_session}.
   */
  @SerializedName("object")
  String object;

  /** The details of the order. */
  @SerializedName("order_details")
  OrderDetails orderDetails;

  /** The payment method used for the requested session. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** The preview of the payment method to be created when the requested session is confirmed. */
  @SerializedName("payment_method_preview")
  PaymentMethodPreview paymentMethodPreview;

  @SerializedName("seller_details")
  SellerDetails sellerDetails;

  /**
   * Whether or not the payment method should be saved for future use.
   *
   * <p>Equal to {@code on_session}.
   */
  @SerializedName("setup_future_usage")
  String setupFutureUsage;

  /** The metadata shared with the seller. */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  /** The SPT used for payment. */
  @SerializedName("shared_payment_issued_token")
  String sharedPaymentIssuedToken;

  /**
   * The status of the requested session.
   *
   * <p>One of {@code completed}, {@code expired}, or {@code open}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("total_details")
  TotalDetails totalDetails;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated_at")
  Long updatedAt;

  /** Confirms a requested session. */
  public RequestedSession confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(RequestOptions options) throws StripeException {
    return confirm((Map<String, Object>) null, options);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/confirm",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(RequestedSessionConfirmParams params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(RequestedSessionConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/confirm",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Creates a requested session. */
  public static RequestedSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a requested session. */
  public static RequestedSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/delegated_checkout/requested_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Creates a requested session. */
  public static RequestedSession create(RequestedSessionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a requested session. */
  public static RequestedSession create(RequestedSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/delegated_checkout/requested_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Expires a requested session. */
  public RequestedSession expire() throws StripeException {
    return expire((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Expires a requested session. */
  public RequestedSession expire(RequestOptions options) throws StripeException {
    return expire((Map<String, Object>) null, options);
  }

  /** Expires a requested session. */
  public RequestedSession expire(Map<String, Object> params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /** Expires a requested session. */
  public RequestedSession expire(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/expire",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Expires a requested session. */
  public RequestedSession expire(RequestedSessionExpireParams params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /** Expires a requested session. */
  public RequestedSession expire(RequestedSessionExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/expire",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(String requestedSession) throws StripeException {
    return retrieve(requestedSession, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(String requestedSession, RequestOptions options)
      throws StripeException {
    return retrieve(requestedSession, (Map<String, Object>) null, options);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(
      String requestedSession, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(
      String requestedSession, RequestedSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s",
            ApiResource.urlEncodeId(requestedSession));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Updates a requested session. */
  @Override
  public RequestedSession update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a requested session. */
  @Override
  public RequestedSession update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Updates a requested session. */
  public RequestedSession update(RequestedSessionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a requested session. */
  public RequestedSession update(RequestedSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /**
   * For more details about FulfillmentDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FulfillmentDetails extends StripeObject {
    /** The fulfillment address. */
    @SerializedName("address")
    Address address;

    /** The email address for the fulfillment details. */
    @SerializedName("email")
    String email;

    /** The fulfillment options. */
    @SerializedName("fulfillment_options")
    List<RequestedSession.FulfillmentDetails.FulfillmentOption> fulfillmentOptions;

    /** The name for the fulfillment details. */
    @SerializedName("name")
    String name;

    /** The phone number for the fulfillment details. */
    @SerializedName("phone")
    String phone;

    /** The fulfillment option. */
    @SerializedName("selected_fulfillment_option")
    SelectedFulfillmentOption selectedFulfillmentOption;

    /**
     * For more details about Address, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      String line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;
    }

    /**
     * For more details about FulfillmentOption, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FulfillmentOption extends StripeObject {
      /** The shipping option. */
      @SerializedName("shipping")
      Shipping shipping;

      /** The type of the fulfillment option. */
      @SerializedName("type")
      String type;

      /**
       * For more details about Shipping, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping extends StripeObject {
        /** The shipping options. */
        @SerializedName("shipping_options")
        List<RequestedSession.FulfillmentDetails.FulfillmentOption.Shipping.ShippingOption>
            shippingOptions;

        /**
         * For more details about ShippingOption, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ShippingOption extends StripeObject {
          /** The description of the shipping option. */
          @SerializedName("description")
          String description;

          /** The display name of the shipping option. */
          @SerializedName("display_name")
          String displayName;

          /** The earliest delivery time of the shipping option. */
          @SerializedName("earliest_delivery_time")
          Long earliestDeliveryTime;

          /** The key of the shipping option. */
          @SerializedName("key")
          String key;

          /** The latest delivery time of the shipping option. */
          @SerializedName("latest_delivery_time")
          Long latestDeliveryTime;

          /** The shipping amount of the shipping option. */
          @SerializedName("shipping_amount")
          Long shippingAmount;
        }
      }
    }

    /**
     * For more details about SelectedFulfillmentOption, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SelectedFulfillmentOption extends StripeObject {
      /** The shipping option. */
      @SerializedName("shipping")
      Shipping shipping;

      /** The type of the selected fulfillment option. */
      @SerializedName("type")
      String type;

      /**
       * For more details about Shipping, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping extends StripeObject {
        /** The shipping option. */
        @SerializedName("shipping_option")
        String shippingOption;
      }
    }
  }

  /**
   * For more details about LineItemDetail, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItemDetail extends StripeObject {
    /** The total discount for this line item. If no discount were applied, defaults to 0. */
    @SerializedName("amount_discount")
    Long amountDiscount;

    /** The total before any discounts or taxes are applied. */
    @SerializedName("amount_subtotal")
    Long amountSubtotal;

    /** The total after discounts but before taxes are applied. */
    @SerializedName("amount_subtotal_after_discount")
    Long amountSubtotalAfterDiscount;

    /** The total after discounts and taxes. */
    @SerializedName("amount_total")
    Long amountTotal;

    /** The description of the line item. */
    @SerializedName("description")
    String description;

    /** The images of the line item. */
    @SerializedName("images")
    List<String> images;

    /** The key of the line item. */
    @SerializedName("key")
    String key;

    /** The name of the line item. */
    @SerializedName("name")
    String name;

    /** The quantity of the line item. */
    @SerializedName("quantity")
    Long quantity;

    /** The SKU ID of the line item. */
    @SerializedName("sku_id")
    String skuId;

    /** The per-unit amount of the item before any discounts or taxes are applied. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /** The per-unit amount of the item after discounts but before taxes are applied. */
    @SerializedName("unit_amount_after_discount")
    Long unitAmountAfterDiscount;

    /** The per-unit discount amount. If no discount were applied, defaults to 0. */
    @SerializedName("unit_discount")
    Long unitDiscount;
  }

  /**
   * For more details about OrderDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OrderDetails extends StripeObject {
    /** The seller's order identifier. */
    @SerializedName("order_id")
    String orderId;

    /** The URL to the order status. */
    @SerializedName("order_status_url")
    String orderStatusUrl;
  }

  /**
   * For more details about PaymentMethodPreview, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodPreview extends StripeObject {
    /** The billing details of the payment method. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** The card details of the payment method. */
    @SerializedName("card")
    Card card;

    /** The type of the payment method. */
    @SerializedName("type")
    String type;

    /**
     * For more details about BillingDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /** The billing address. */
      @SerializedName("address")
      Address address;

      /** The email address for the billing details. */
      @SerializedName("email")
      String email;

      /** The name for the billing details. */
      @SerializedName("name")
      String name;

      /** The phone number for the billing details. */
      @SerializedName("phone")
      String phone;

      /**
       * For more details about Address, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Address extends StripeObject {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;
      }
    }

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /** The expiry month of the card. */
      @SerializedName("exp_month")
      Long expMonth;

      /** The expiry year of the card. */
      @SerializedName("exp_year")
      Long expYear;

      /** The last 4 digits of the card number. */
      @SerializedName("last4")
      String last4;
    }
  }

  /**
   * For more details about SellerDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SellerDetails extends StripeObject {}

  /**
   * For more details about TotalDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDetails extends StripeObject {
    /** The amount discount of the total details. */
    @SerializedName("amount_discount")
    Long amountDiscount;

    /** The amount fulfillment of the total details. */
    @SerializedName("amount_fulfillment")
    Long amountFulfillment;

    /** Total of all items after discounts but before taxes are applied. */
    @SerializedName("amount_subtotal_after_discount")
    Long amountSubtotalAfterDiscount;

    /** The amount tax of the total details. */
    @SerializedName("amount_tax")
    Long amountTax;

    /** The applicable fees of the total details. */
    @SerializedName("applicable_fees")
    List<RequestedSession.TotalDetails.ApplicableFee> applicableFees;

    /**
     * For more details about ApplicableFee, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicableFee extends StripeObject {
      /** The amount of the applicable fee. */
      @SerializedName("amount")
      Long amount;

      /** The description of the applicable fee. */
      @SerializedName("description")
      String description;

      /** The display name of the applicable fee. */
      @SerializedName("display_name")
      String displayName;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(fulfillmentDetails, responseGetter);
    trySetResponseGetter(orderDetails, responseGetter);
    trySetResponseGetter(paymentMethodPreview, responseGetter);
    trySetResponseGetter(sellerDetails, responseGetter);
    trySetResponseGetter(totalDetails, responseGetter);
  }
}
