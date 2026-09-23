// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.stripe.exception.StripeException;
import com.stripe.model.financialconnections.Consent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.ConsentCreateParams;
import com.stripe.param.financialconnections.ConsentRetrieveParams;

public final class ConsentService extends ApiService {
  public ConsentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public Consent retrieve(String consent, ConsentRetrieveParams params) throws StripeException {
    return retrieve(consent, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public Consent retrieve(String consent, RequestOptions options) throws StripeException {
    return retrieve(consent, (ConsentRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public Consent retrieve(String consent) throws StripeException {
    return retrieve(consent, (ConsentRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public Consent retrieve(String consent, ConsentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/consents/%s", ApiResource.urlEncodeId(consent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Consent.class);
  }
  /** Creates a Financial Connections {@code Consent} object for an account holder. */
  public Consent create(ConsentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a Financial Connections {@code Consent} object for an account holder. */
  public Consent create(ConsentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/financial_connections/consents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Consent.class);
  }
}
