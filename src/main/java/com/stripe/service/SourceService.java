// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentSource;
import com.stripe.model.Source;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SourceCreateParams;
import com.stripe.param.SourceDetachParams;
import com.stripe.param.SourceRetrieveParams;
import com.stripe.param.SourceUpdateParams;
import com.stripe.param.SourceVerifyParams;

public final class SourceService extends ApiService {
  public SourceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Delete a specified source for a given customer. */
  public PaymentSource detach(String customer, String id, SourceDetachParams params)
      throws StripeException {
    return detach(customer, id, params, (RequestOptions) null);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource detach(String customer, String id, RequestOptions options)
      throws StripeException {
    return detach(customer, id, (SourceDetachParams) null, options);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource detach(String customer, String id) throws StripeException {
    return detach(customer, id, (SourceDetachParams) null, (RequestOptions) null);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource detach(
      String customer, String id, SourceDetachParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentSource.class);
  }
  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public Source retrieve(String source, SourceRetrieveParams params) throws StripeException {
    return retrieve(source, params, (RequestOptions) null);
  }
  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public Source retrieve(String source, RequestOptions options) throws StripeException {
    return retrieve(source, (SourceRetrieveParams) null, options);
  }
  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public Source retrieve(String source) throws StripeException {
    return retrieve(source, (SourceRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public Source retrieve(String source, SourceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/sources/%s", ApiResource.urlEncodeId(source));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Source.class);
  }
  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(String source, SourceUpdateParams params) throws StripeException {
    return update(source, params, (RequestOptions) null);
  }
  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(String source, RequestOptions options) throws StripeException {
    return update(source, (SourceUpdateParams) null, options);
  }
  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(String source) throws StripeException {
    return update(source, (SourceUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(String source, SourceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/sources/%s", ApiResource.urlEncodeId(source));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Source.class);
  }
  /** Creates a new source object. */
  public Source create(SourceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new source object. */
  public Source create(RequestOptions options) throws StripeException {
    return create((SourceCreateParams) null, options);
  }
  /** Creates a new source object. */
  public Source create() throws StripeException {
    return create((SourceCreateParams) null, (RequestOptions) null);
  }
  /** Creates a new source object. */
  public Source create(SourceCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/sources";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Source.class);
  }
  /** Verify a given source. */
  public Source verify(String source, SourceVerifyParams params) throws StripeException {
    return verify(source, params, (RequestOptions) null);
  }
  /** Verify a given source. */
  public Source verify(String source, SourceVerifyParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/sources/%s/verify", ApiResource.urlEncodeId(source));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Source.class);
  }

  public com.stripe.service.SourceTransactionService transactions() {
    return new com.stripe.service.SourceTransactionService(this.getResponseGetter());
  }
}
