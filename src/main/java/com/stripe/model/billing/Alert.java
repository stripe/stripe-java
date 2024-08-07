// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.AlertActivateParams;
import com.stripe.param.billing.AlertArchiveParams;
import com.stripe.param.billing.AlertCreateParams;
import com.stripe.param.billing.AlertDeactivateParams;
import com.stripe.param.billing.AlertListParams;
import com.stripe.param.billing.AlertRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A billing alert is a resource that notifies you when a certain usage threshold on a meter is
 * crossed. For example, you might create a billing alert to notify you when a certain user made 100
 * API requests.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Alert extends ApiResource implements HasId {
  /**
   * Defines the type of the alert.
   *
   * <p>Equal to {@code usage_threshold}.
   */
  @SerializedName("alert_type")
  String alertType;

  /**
   * Limits the scope of the alert to a specific <a
   * href="https://stripe.com/docs/api/customers">customer</a>.
   */
  @SerializedName("filter")
  Filter filter;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.alert}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the alert. This can be active, inactive or archived.
   *
   * <p>One of {@code active}, {@code archived}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** Title of the alert. */
  @SerializedName("title")
  String title;

  /**
   * Encapsulates configuration of the alert to monitor usage on a specific <a
   * href="https://stripe.com/docs/api/billing/meter">Billing Meter</a>.
   */
  @SerializedName("usage_threshold_config")
  UsageThresholdConfig usageThresholdConfig;

  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate() throws StripeException {
    return activate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(RequestOptions options) throws StripeException {
    return activate((Map<String, Object>) null, options);
  }

  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(Map<String, Object> params) throws StripeException {
    return activate(params, (RequestOptions) null);
  }

  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/billing/alerts/%s/activate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Alert.class);
  }

  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(AlertActivateParams params) throws StripeException {
    return activate(params, (RequestOptions) null);
  }

  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(AlertActivateParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/billing/alerts/%s/activate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Alert.class);
  }

  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive() throws StripeException {
    return archive((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(RequestOptions options) throws StripeException {
    return archive((Map<String, Object>) null, options);
  }

  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(Map<String, Object> params) throws StripeException {
    return archive(params, (RequestOptions) null);
  }

  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/billing/alerts/%s/archive", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Alert.class);
  }

  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(AlertArchiveParams params) throws StripeException {
    return archive(params, (RequestOptions) null);
  }

  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(AlertArchiveParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/billing/alerts/%s/archive", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Alert.class);
  }

  /** Creates a billing alert. */
  public static Alert create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing alert. */
  public static Alert create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/alerts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Alert.class);
  }

  /** Creates a billing alert. */
  public static Alert create(AlertCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing alert. */
  public static Alert create(AlertCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/alerts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Alert.class);
  }

  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate() throws StripeException {
    return deactivate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(RequestOptions options) throws StripeException {
    return deactivate((Map<String, Object>) null, options);
  }

  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(Map<String, Object> params) throws StripeException {
    return deactivate(params, (RequestOptions) null);
  }

  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/alerts/%s/deactivate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Alert.class);
  }

  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(AlertDeactivateParams params) throws StripeException {
    return deactivate(params, (RequestOptions) null);
  }

  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(AlertDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/alerts/%s/deactivate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Alert.class);
  }

  /** Lists billing active and inactive alerts. */
  public static AlertCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists billing active and inactive alerts. */
  public static AlertCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/alerts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, AlertCollection.class);
  }

  /** Lists billing active and inactive alerts. */
  public static AlertCollection list(AlertListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists billing active and inactive alerts. */
  public static AlertCollection list(AlertListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/alerts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, AlertCollection.class);
  }

  /** Retrieves a billing alert given an ID. */
  public static Alert retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a billing alert given an ID. */
  public static Alert retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a billing alert given an ID. */
  public static Alert retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Alert.class);
  }

  /** Retrieves a billing alert given an ID. */
  public static Alert retrieve(String id, AlertRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Alert.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Filter extends StripeObject {
    /** Limit the scope of the alert to this customer ID. */
    @SerializedName("customer")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Customer> customer;

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
  }

  /**
   * The usage threshold alert configuration enables setting up alerts for when a certain usage
   * threshold on a specific meter is crossed.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageThresholdConfig extends StripeObject {
    /** The value at which this alert will trigger. */
    @SerializedName("gte")
    Long gte;

    /**
     * The <a href="https://stripe.com/api/billing/meter">Billing Meter</a> ID whose usage is
     * monitored.
     */
    @SerializedName("meter")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Meter> meter;

    /**
     * Defines how the alert will behave.
     *
     * <p>Equal to {@code one_time}.
     */
    @SerializedName("recurrence")
    String recurrence;

    /** Get ID of expandable {@code meter} object. */
    public String getMeter() {
      return (this.meter != null) ? this.meter.getId() : null;
    }

    public void setMeter(String id) {
      this.meter = ApiResource.setExpandableFieldId(id, this.meter);
    }

    /** Get expanded {@code meter}. */
    public Meter getMeterObject() {
      return (this.meter != null) ? this.meter.getExpanded() : null;
    }

    public void setMeterObject(Meter expandableObject) {
      this.meter = new ExpandableField<Meter>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(filter, responseGetter);
    trySetResponseGetter(usageThresholdConfig, responseGetter);
  }
}
