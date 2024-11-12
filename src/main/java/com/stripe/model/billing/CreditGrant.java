// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.CreditGrantCreateParams;
import com.stripe.param.billing.CreditGrantExpireParams;
import com.stripe.param.billing.CreditGrantListParams;
import com.stripe.param.billing.CreditGrantRetrieveParams;
import com.stripe.param.billing.CreditGrantUpdateParams;
import com.stripe.param.billing.CreditGrantVoidGrantParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A credit grant is an API resource that documents the allocation of some billing credits to a
 * customer.
 *
 * <p>Related guide: <a
 * href="https://docs.stripe.com/billing/subscriptions/usage-based/billing-credits">Billing
 * credits</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditGrant extends ApiResource implements HasId, MetadataStore<CreditGrant> {
  @SerializedName("amount")
  Amount amount;

  @SerializedName("applicability_config")
  ApplicabilityConfig applicabilityConfig;

  /**
   * The category of this credit grant. This is for tracking purposes and isn't displayed to the
   * customer.
   *
   * <p>One of {@code paid}, or {@code promotional}.
   */
  @SerializedName("category")
  String category;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** ID of the customer receiving the billing credits. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The time when the billing credits become effective—when they're eligible for use. */
  @SerializedName("effective_at")
  Long effectiveAt;

  /** The time when the billing credits expire. If not present, the billing credits don't expire. */
  @SerializedName("expires_at")
  Long expiresAt;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A descriptive name shown in dashboard. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.credit_grant}.
   */
  @SerializedName("object")
  String object;

  /** ID of the test clock this credit grant belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /**
   * The time when this credit grant was voided. If not present, the credit grant hasn't been
   * voided.
   */
  @SerializedName("voided_at")
  Long voidedAt;

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

  /** Get ID of expandable {@code testClock} object. */
  public String getTestClock() {
    return (this.testClock != null) ? this.testClock.getId() : null;
  }

  public void setTestClock(String id) {
    this.testClock = ApiResource.setExpandableFieldId(id, this.testClock);
  }

  /** Get expanded {@code testClock}. */
  public TestClock getTestClockObject() {
    return (this.testClock != null) ? this.testClock.getExpanded() : null;
  }

  public void setTestClockObject(TestClock expandableObject) {
    this.testClock = new ExpandableField<TestClock>(expandableObject.getId(), expandableObject);
  }

  /** Creates a credit grant. */
  public static CreditGrant create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a credit grant. */
  public static CreditGrant create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_grants";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, CreditGrant.class);
  }

  /** Creates a credit grant. */
  public static CreditGrant create(CreditGrantCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a credit grant. */
  public static CreditGrant create(CreditGrantCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_grants";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditGrant.class);
  }

  /** Expires a credit grant. */
  public CreditGrant expire() throws StripeException {
    return expire((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Expires a credit grant. */
  public CreditGrant expire(RequestOptions options) throws StripeException {
    return expire((Map<String, Object>) null, options);
  }

  /** Expires a credit grant. */
  public CreditGrant expire(Map<String, Object> params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /** Expires a credit grant. */
  public CreditGrant expire(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_grants/%s/expire", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, CreditGrant.class);
  }

  /** Expires a credit grant. */
  public CreditGrant expire(CreditGrantExpireParams params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /** Expires a credit grant. */
  public CreditGrant expire(CreditGrantExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_grants/%s/expire", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CreditGrant.class);
  }

  /** Retrieve a list of credit grants. */
  public static CreditGrantCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of credit grants. */
  public static CreditGrantCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_grants";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditGrantCollection.class);
  }

  /** Retrieve a list of credit grants. */
  public static CreditGrantCollection list(CreditGrantListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of credit grants. */
  public static CreditGrantCollection list(CreditGrantListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_grants";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditGrantCollection.class);
  }

  /** Retrieves a credit grant. */
  public static CreditGrant retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a credit grant. */
  public static CreditGrant retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a credit grant. */
  public static CreditGrant retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/credit_grants/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditGrant.class);
  }

  /** Retrieves a credit grant. */
  public static CreditGrant retrieve(
      String id, CreditGrantRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/credit_grants/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditGrant.class);
  }

  /** Updates a credit grant. */
  @Override
  public CreditGrant update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a credit grant. */
  @Override
  public CreditGrant update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_grants/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, CreditGrant.class);
  }

  /** Updates a credit grant. */
  public CreditGrant update(CreditGrantUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a credit grant. */
  public CreditGrant update(CreditGrantUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_grants/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CreditGrant.class);
  }

  /** Voids a credit grant. */
  public CreditGrant voidGrant() throws StripeException {
    return voidGrant((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Voids a credit grant. */
  public CreditGrant voidGrant(RequestOptions options) throws StripeException {
    return voidGrant((Map<String, Object>) null, options);
  }

  /** Voids a credit grant. */
  public CreditGrant voidGrant(Map<String, Object> params) throws StripeException {
    return voidGrant(params, (RequestOptions) null);
  }

  /** Voids a credit grant. */
  public CreditGrant voidGrant(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_grants/%s/void", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, CreditGrant.class);
  }

  /** Voids a credit grant. */
  public CreditGrant voidGrant(CreditGrantVoidGrantParams params) throws StripeException {
    return voidGrant(params, (RequestOptions) null);
  }

  /** Voids a credit grant. */
  public CreditGrant voidGrant(CreditGrantVoidGrantParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_grants/%s/void", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CreditGrant.class);
  }

  /**
   * For more details about Amount, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
    /** The monetary amount. */
    @SerializedName("monetary")
    Monetary monetary;

    /**
     * The type of this amount. We currently only support {@code monetary} billing credits.
     *
     * <p>Equal to {@code monetary}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Monetary, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Monetary extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /** A positive integer representing the amount. */
      @SerializedName("value")
      Long value;
    }
  }

  /**
   * For more details about ApplicabilityConfig, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApplicabilityConfig extends StripeObject {
    @SerializedName("scope")
    Scope scope;

    /**
     * For more details about Scope, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Scope extends StripeObject {
      /**
       * The price type for which credit grants can apply. We currently only support the {@code
       * metered} price type. This refers to prices that have a <a
       * href="https://docs.stripe.com/api/billing/meter">Billing Meter</a> attached to them.
       *
       * <p>Equal to {@code metered}.
       */
      @SerializedName("price_type")
      String priceType;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amount, responseGetter);
    trySetResponseGetter(applicabilityConfig, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
  }
}
