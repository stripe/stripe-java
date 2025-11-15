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
import com.stripe.param.CustomerSessionCreateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Customer Session allows you to grant Stripe's frontend SDKs (like Stripe.js) client-side access
 * control over a Customer.
 *
 * <p>Related guides: <a
 * href="https://stripe.com/payments/accept-a-payment-deferred?platform=web&amp;type=payment#save-payment-methods">Customer
 * Session with the Payment Element</a>, <a
 * href="https://stripe.com/payments/checkout/pricing-table#customer-session">Customer Session with
 * the Pricing Table</a>, <a
 * href="https://stripe.com/payment-links/buy-button#pass-an-existing-customer">Customer Session
 * with the Buy Button</a>.
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

  /** The Account that the Customer Session was created for. */
  @SerializedName("customer_account")
  String customerAccount;

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
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
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
            options);
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

    /** This hash contains whether the customer sheet is enabled and the features it supports. */
    @SerializedName("customer_sheet")
    CustomerSheet customerSheet;

    /**
     * This hash contains whether the mobile payment element is enabled and the features it
     * supports.
     */
    @SerializedName("mobile_payment_element")
    MobilePaymentElement mobilePaymentElement;

    /** This hash contains whether the Payment Element is enabled and the features it supports. */
    @SerializedName("payment_element")
    PaymentElement paymentElement;

    /** This hash contains whether the pricing table is enabled. */
    @SerializedName("pricing_table")
    PricingTable pricingTable;

    /** This hash contains whether the Tax ID Element is enabled and the features it supports. */
    @SerializedName("tax_id_element")
    TaxIdElement taxIdElement;

    /** This hash contains whether the buy button is enabled. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BuyButton extends StripeObject {
      /** Whether the buy button is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }

    /** This hash contains whether the customer sheet is enabled and the features it supports. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerSheet extends StripeObject {
      /** Whether the customer sheet is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** This hash defines whether the customer sheet supports certain features. */
      @SerializedName("features")
      Features features;

      /** This hash contains the features the customer sheet supports. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /**
         * A list of <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
         * allow_redisplay}</a> values that controls which saved payment methods the customer sheet
         * displays by filtering to only show payment methods with an {@code allow_redisplay} value
         * that is present in this list.
         *
         * <p>If not specified, defaults to [&quot;always&quot;]. In order to display all saved
         * payment methods, specify [&quot;always&quot;, &quot;limited&quot;,
         * &quot;unspecified&quot;].
         */
        @SerializedName("payment_method_allow_redisplay_filters")
        List<String> paymentMethodAllowRedisplayFilters;

        /**
         * Controls whether the customer sheet displays the option to remove a saved payment
         * method.&quot;
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
      }
    }

    /**
     * This hash contains whether the mobile payment element is enabled and the features it
     * supports.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MobilePaymentElement extends StripeObject {
      /** Whether the mobile payment element is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** This hash defines whether the mobile payment element supports certain features. */
      @SerializedName("features")
      Features features;

      /** This hash contains the features the mobile payment element supports. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /**
         * A list of <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
         * allow_redisplay}</a> values that controls which saved payment methods the mobile payment
         * element displays by filtering to only show payment methods with an {@code
         * allow_redisplay} value that is present in this list.
         *
         * <p>If not specified, defaults to [&quot;always&quot;]. In order to display all saved
         * payment methods, specify [&quot;always&quot;, &quot;limited&quot;,
         * &quot;unspecified&quot;].
         */
        @SerializedName("payment_method_allow_redisplay_filters")
        List<String> paymentMethodAllowRedisplayFilters;

        /**
         * Controls whether or not the mobile payment element shows saved payment methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("payment_method_redisplay")
        String paymentMethodRedisplay;

        /**
         * Controls whether the mobile payment element displays the option to remove a saved payment
         * method.&quot;
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
         * Controls whether the mobile payment element displays a checkbox offering to save a new
         * payment method.
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
         * Allows overriding the value of allow_override when saving a new payment method when
         * payment_method_save is set to disabled. Use values: &quot;always&quot;,
         * &quot;limited&quot;, or &quot;unspecified&quot;.
         *
         * <p>If not specified, defaults to {@code nil} (no override value).
         *
         * <p>One of {@code always}, {@code limited}, or {@code unspecified}.
         */
        @SerializedName("payment_method_save_allow_redisplay_override")
        String paymentMethodSaveAllowRedisplayOverride;
      }
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
         * A list of <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
         * allow_redisplay}</a> values that controls which saved payment methods the Payment Element
         * displays by filtering to only show payment methods with an {@code allow_redisplay} value
         * that is present in this list.
         *
         * <p>If not specified, defaults to [&quot;always&quot;]. In order to display all saved
         * payment methods, specify [&quot;always&quot;, &quot;limited&quot;,
         * &quot;unspecified&quot;].
         */
        @SerializedName("payment_method_allow_redisplay_filters")
        List<String> paymentMethodAllowRedisplayFilters;

        /**
         * Controls whether or not the Payment Element shows saved payment methods. This parameter
         * defaults to {@code disabled}.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("payment_method_redisplay")
        String paymentMethodRedisplay;

        /**
         * Determines the max number of saved payment methods for the Payment Element to display.
         * This parameter defaults to {@code 3}. The maximum redisplay limit is {@code 10}.
         */
        @SerializedName("payment_method_redisplay_limit")
        Long paymentMethodRedisplayLimit;

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

    /** This hash contains whether the Tax ID Element is enabled and the features it supports. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxIdElement extends StripeObject {
      /** Whether the Tax ID Element is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** This hash defines whether the Tax ID Element supports certain features. */
      @SerializedName("features")
      Features features;

      /** This hash defines whether the Tax ID Element supports certain features. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /**
         * Controls whether the Tax ID Element displays saved tax IDs for the customer. This
         * parameter defaults to {@code disabled}.
         *
         * <p>When enabled, the Tax ID Element will show existing tax IDs associated with the
         * customer, allowing them to select from previously saved tax identification numbers.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("tax_id_redisplay")
        String taxIdRedisplay;

        /**
         * Controls whether the Tax ID Element allows merchants to save new tax IDs for their
         * customer. This parameter defaults to {@code disabled}.
         *
         * <p>When enabled, customers can enter and save new tax identification numbers during the
         * payment flow, which will be stored securely and associated with their customer object for
         * future use.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("tax_id_save")
        String taxIdSave;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(components, responseGetter);
    trySetResponseGetter(customer, responseGetter);
  }
}
