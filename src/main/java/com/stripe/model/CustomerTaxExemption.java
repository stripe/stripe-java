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
import com.stripe.param.CustomerTaxExemptionCreateParams;
import com.stripe.param.CustomerTaxExemptionListParams;
import com.stripe.param.CustomerTaxExemptionRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Location specific customer tax exemptions. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerTaxExemption extends ApiResource implements HasId {
  @SerializedName("ca")
  Ca ca;

  @SerializedName("country")
  String country;

  @SerializedName("created")
  Long created;

  @SerializedName("customer")
  String customer;

  /** Present and true when the exemption has been deleted. */
  @SerializedName("deleted")
  Boolean deleted;

  /** ISO 8601 date (YYYY-MM-DD) when the exemption becomes effective. */
  @SerializedName("effective_date")
  String effectiveDate;

  /** ISO 8601 date (YYYY-MM-DD) when the exemption expires. */
  @SerializedName("expiration_date")
  String expirationDate;

  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("object")
  String object;

  @SerializedName("us")
  Us us;

  /** Create a location specific tax exemption for a customer. */
  public static CustomerTaxExemption create(String customer, Map<String, Object> params)
      throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }

  /** Create a location specific tax exemption for a customer. */
  public static CustomerTaxExemption create(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerTaxExemption.class);
  }

  /** Create a location specific tax exemption for a customer. */
  public static CustomerTaxExemption create(
      String customer, CustomerTaxExemptionCreateParams params) throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }

  /** Create a location specific tax exemption for a customer. */
  public static CustomerTaxExemption create(
      String customer, CustomerTaxExemptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(customer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerTaxExemption.class);
  }

  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, CustomerTaxExemption.class);
  }

  /** List all location specific tax exemptions for a customer. */
  public static CustomerTaxExemptionCollection list(String customer, Map<String, Object> params)
      throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }

  /** List all location specific tax exemptions for a customer. */
  public static CustomerTaxExemptionCollection list(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerTaxExemptionCollection.class);
  }

  /** List all location specific tax exemptions for a customer. */
  public static CustomerTaxExemptionCollection list(
      String customer, CustomerTaxExemptionListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }

  /** List all location specific tax exemptions for a customer. */
  public static CustomerTaxExemptionCollection list(
      String customer, CustomerTaxExemptionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(customer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerTaxExemptionCollection.class);
  }

  /** Retrieve a location specific tax exemption for a customer. */
  public static CustomerTaxExemption retrieve(String customer, String id) throws StripeException {
    return retrieve(customer, id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a location specific tax exemption for a customer. */
  public static CustomerTaxExemption retrieve(String customer, String id, RequestOptions options)
      throws StripeException {
    return retrieve(customer, id, (Map<String, Object>) null, options);
  }

  /** Retrieve a location specific tax exemption for a customer. */
  public static CustomerTaxExemption retrieve(
      String customer, String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerTaxExemption.class);
  }

  /** Retrieve a location specific tax exemption for a customer. */
  public static CustomerTaxExemption retrieve(
      String customer, String id, CustomerTaxExemptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerTaxExemption.class);
  }

  /**
   * For more details about Ca, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ca extends StripeObject {
    /** Two-letter Canadian province code (ISO 3166-2). Null for country-wide GST/HST exemptions. */
    @SerializedName("state")
    String state;

    /** The type of Canadian tax (gst_hst, PST, QST, RST). */
    @SerializedName("tax_type")
    String taxType;
  }

  /**
   * For more details about Us, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us extends StripeObject {
    /** Two-letter US state code (ISO 3166-2). */
    @SerializedName("state")
    String state;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(ca, responseGetter);
    trySetResponseGetter(us, responseGetter);
  }
}
