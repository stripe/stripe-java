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

  /**
   * Deletes a Tax Certificate without deleting its uploaded file. You can reuse the file to create
   * another certificate, and you can still retrieve the deleted certificate.
   */
  public Certificate delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /**
   * Deletes a Tax Certificate without deleting its uploaded file. You can reuse the file to create
   * another certificate, and you can still retrieve the deleted certificate.
   */
  public Certificate delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax/certificates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Certificate.class);
  }
  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public Certificate retrieve(String id, CertificateRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public Certificate retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CertificateRetrieveParams) null, options);
  }
  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public Certificate retrieve(String id) throws StripeException {
    return retrieve(id, (CertificateRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
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
  /**
   * Lists a tax exemption’s certificates, ordered from newest to oldest. The list excludes deleted
   * certificates.
   */
  public StripeCollection<Certificate> list(CertificateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Lists a tax exemption’s certificates, ordered from newest to oldest. The list excludes deleted
   * certificates.
   */
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
  /**
   * Creates a Tax Certificate associated with a tax exemption. Before creating the certificate, <a
   * href="https://stripe.com/api/files/create">upload a file</a> with purpose {@code
   * tax_certificate}.
   */
  public Certificate create(CertificateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a Tax Certificate associated with a tax exemption. Before creating the certificate, <a
   * href="https://stripe.com/api/files/create">upload a file</a> with purpose {@code
   * tax_certificate}.
   */
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
