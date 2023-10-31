// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.Registration;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.RegistrationCreateParams;
import com.stripe.param.tax.RegistrationListParams;
import com.stripe.param.tax.RegistrationUpdateParams;

public final class RegistrationService extends ApiService {
  public RegistrationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public StripeCollection<Registration> list(RegistrationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Tax {@code Registration} objects. */
  public StripeCollection<Registration> list(RequestOptions options) throws StripeException {
    return list((RegistrationListParams) null, options);
  }
  /** Returns a list of Tax {@code Registration} objects. */
  public StripeCollection<Registration> list() throws StripeException {
    return list((RegistrationListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Tax {@code Registration} objects. */
  public StripeCollection<Registration> list(RegistrationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Registration>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Creates a new Tax {@code Registration} object. */
  public Registration create(RegistrationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new Tax {@code Registration} object. */
  public Registration create(RegistrationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Registration.class,
            options,
            ApiMode.V1);
  }
  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(String id, RegistrationUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(String id, RequestOptions options) throws StripeException {
    return update(id, (RegistrationUpdateParams) null, options);
  }
  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(String id) throws StripeException {
    return update(id, (RegistrationUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(String id, RegistrationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Registration.class,
            options,
            ApiMode.V1);
  }
}
