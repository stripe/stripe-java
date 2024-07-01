// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerSessionCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Customer Session allows you to grant Stripe's frontend SDKs (like Stripe.js) client-side access
 * control over a Customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerSession extends ApiResource {
  /**
   * The client secret of this Customer Session. Used on the client to set up secure access to the
   * given {@code customer}.
   *
   * <p>The client secret can be used to provide access to {@code customer} from your frontend. It
   * should not be stored, logged, or exposed to anyone other than the relevant customer. Make sure
   * that you have TLS enabled on any page that includes the client secret.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Configuration for the components supported by this Customer Session. */
  @SerializedName("components")
  Components components;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The Customer the Customer Session was created for. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The timestamp at which this Customer Session will expire. */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code customer_session}.
   */
  @SerializedName("object")
  String object;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /**
   * Creates a Customer Session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public static CustomerSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a Customer Session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public static CustomerSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customer_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, CustomerSession.class);
  }

  /**
   * Creates a Customer Session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public static CustomerSession create(CustomerSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a Customer Session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public static CustomerSession create(CustomerSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customer_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, CustomerSession.class);
  }

  /** Configuration for the components supported by this Customer Session. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Components extends StripeObject {
    /** This hash contains whether the buy button is enabled. */
    @SerializedName("buy_button")
    BuyButton buyButton;

    /** This hash contains whether the Payment Element is enabled and the features it supports. */
    @SerializedName("payment_element")
    PaymentElement paymentElement;

    /** This hash contains whether the pricing table is enabled. */
    @SerializedName("pricing_table")
    PricingTable pricingTable;

    /** This hash contains whether the buy button is enabled. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BuyButton extends StripeObject {
      /** Whether the buy button is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }

    /** This hash contains whether the Payment Element is enabled and the features it supports. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentElement extends StripeObject {
      /** Whether the Payment Element is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** This hash defines whether the Payment Element supports certain features. */
      @SerializedName("features")
      Features features;

      /** This hash contains the features the Payment Element supports. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /**
         * Controls whether the Payment Element displays the option to remove a saved payment
         * method. This parameter defaults to {@code disabled}.
         *
         * <p>Allowing buyers to remove their saved payment methods impacts subscriptions that
         * depend on that payment method. Removing the payment method detaches the <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer">{@code
         * customer} object</a> from that <a
         * href="https://docs.stripe.com/api/payment_methods">PaymentMethod</a>.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("payment_method_remove")
        String paymentMethodRemove;

        /**
         * Controls whether the Payment Element displays a checkbox offering to save a new payment
         * method. This parameter defaults to {@code disabled}.
         *
         * <p>If a customer checks the box, the <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
         * allow_redisplay}</a> value on the PaymentMethod is set to {@code 'always'} at
         * confirmation time. For PaymentIntents, the <a
         * href="https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage">{@code
         * setup_future_usage}</a> value is also set to the value defined in {@code
         * payment_method_save_usage}.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("payment_method_save")
        String paymentMethodSave;

        /**
         * When using PaymentIntents and the customer checks the save checkbox, this field
         * determines the <a
         * href="https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage">{@code
         * setup_future_usage}</a> value used to confirm the PaymentIntent.
         *
         * <p>When using SetupIntents, directly configure the <a
         * href="https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage">{@code
         * usage}</a> value on SetupIntent creation.
         *
         * <p>One of {@code off_session}, or {@code on_session}.
         */
        @SerializedName("payment_method_save_usage")
        String paymentMethodSaveUsage;

        /**
         * Controls whether the Payment Element displays the option to update a saved payment
         * method. This parameter defaults to {@code disabled}.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("payment_method_update")
        String paymentMethodUpdate;
      }
    }

    /** This hash contains whether the pricing table is enabled. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PricingTable extends StripeObject {
      /** Whether the pricing table is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(components, responseGetter);
    trySetResponseGetter(customer, responseGetter);
  }
}
