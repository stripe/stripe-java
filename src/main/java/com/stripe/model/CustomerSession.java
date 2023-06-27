// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/customer_sessions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CustomerSession.class, options);
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
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/customer_sessions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CustomerSession.class, options);
  }
}
