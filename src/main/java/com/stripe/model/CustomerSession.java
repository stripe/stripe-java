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
 * A customer session allows you to grant client access to Stripe's frontend SDKs (like StripeJs)
 * control over a customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerSession extends ApiResource {
  /**
   * The client secret of this customer session. Used on the client to set up secure access to the
   * given {@code customer}.
   *
   * <p>The client secret can be used to provide access to {@code customer} from your frontend. It
   * should not be stored, logged, or exposed to anyone other than the relevant customer. Make sure
   * that you have TLS enabled on any page that includes the client secret.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Configuration for the components supported by this customer session. */
  @SerializedName("components")
  Components components;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The customer the customer session was created for. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The timestamp at which this customer session will expire. */
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
   * Creates a customer session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public static CustomerSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a customer session object that includes a single-use client secret that you can use on
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
   * Creates a customer session object that includes a single-use client secret that you can use on
   * your front-end to grant client-side API access for certain customer resources.
   */
  public static CustomerSession create(CustomerSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a customer session object that includes a single-use client secret that you can use on
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

  /** Configuration for the components supported by this customer session. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Components extends StripeObject {
    /** This hash contains whether the buy button is enabled. */
    @SerializedName("buy_button")
    BuyButton buyButton;

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
