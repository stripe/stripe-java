// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.Certificate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CertificateCreateParams;
import com.stripe.param.tax.CertificateListParams;
import com.stripe.param.tax.CertificateRetrieveParams;

public final class CertificateService extends ApiService {
  public CertificateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Delete a tax certificate associated with a tax exemption. */
  public Certificate delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Delete a tax certificate associated with a tax exemption. */
  public Certificate delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax/certificates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Certificate.class);
  }
  /** Retrieve a tax certificate associated with a tax exemption. */
  public Certificate retrieve(String id, CertificateRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a tax certificate associated with a tax exemption. */
  public Certificate retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CertificateRetrieveParams) null, options);
  }
  /** Retrieve a tax certificate associated with a tax exemption. */
  public Certificate retrieve(String id) throws StripeException {
    return retrieve(id, (CertificateRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a tax certificate associated with a tax exemption. */
  public Certificate retrieve(String id, CertificateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/certificates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Certificate.class);
  }
  /** List certificates for an existing tax exemption. */
  public StripeCollection<Certificate> list(CertificateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List certificates for an existing tax exemption. */
  public StripeCollection<Certificate> list(CertificateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/certificates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Certificate>>() {}.getType());
  }
  /** Create a tax certificate associated with a tax exemption. */
  public Certificate create(CertificateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a tax certificate associated with a tax exemption. */
  public Certificate create(CertificateCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/certificates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Certificate.class);
  }
}
