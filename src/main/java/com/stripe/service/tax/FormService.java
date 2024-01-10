// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.Form;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.FormListParams;
import com.stripe.param.tax.FormPdfParams;
import com.stripe.param.tax.FormRetrieveParams;
import java.io.InputStream;

public final class FormService extends ApiService {
  public FormService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of tax forms which were previously created. The tax forms are returned in sorted
   * order, with the oldest tax forms appearing first.
   */
  public StripeCollection<Form> list(FormListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of tax forms which were previously created. The tax forms are returned in sorted
   * order, with the oldest tax forms appearing first.
   */
  public StripeCollection<Form> list(FormListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/forms";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Form>>() {}.getType());
  }
  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public Form retrieve(String id, FormRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public Form retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FormRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public Form retrieve(String id) throws StripeException {
    return retrieve(id, (FormRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public Form retrieve(String id, FormRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Form.class);
  }
  /** Download the PDF for a tax form. */
  public InputStream pdf(String id, FormPdfParams params) throws StripeException {
    return pdf(id, params, (RequestOptions) null);
  }
  /** Download the PDF for a tax form. */
  public InputStream pdf(String id, RequestOptions options) throws StripeException {
    return pdf(id, (FormPdfParams) null, options);
  }
  /** Download the PDF for a tax form. */
  public InputStream pdf(String id) throws StripeException {
    return pdf(id, (FormPdfParams) null, (RequestOptions) null);
  }
  /** Download the PDF for a tax form. */
  public InputStream pdf(String id, FormPdfParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/forms/%s/pdf", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().requestStream(request);
  }
}
