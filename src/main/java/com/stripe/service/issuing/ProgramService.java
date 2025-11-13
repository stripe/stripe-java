// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Program;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.ProgramCreateParams;
import com.stripe.param.issuing.ProgramListParams;
import com.stripe.param.issuing.ProgramRetrieveParams;
import com.stripe.param.issuing.ProgramUpdateParams;

public final class ProgramService extends ApiService {
  public ProgramService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all of the programs the given Issuing user has access to. */
  public StripeCollection<Program> list(ProgramListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all of the programs the given Issuing user has access to. */
  public StripeCollection<Program> list(RequestOptions options) throws StripeException {
    return list((ProgramListParams) null, options);
  }
  /** List all of the programs the given Issuing user has access to. */
  public StripeCollection<Program> list() throws StripeException {
    return list((ProgramListParams) null, (RequestOptions) null);
  }
  /** List all of the programs the given Issuing user has access to. */
  public StripeCollection<Program> list(ProgramListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/programs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Program>>() {}.getType());
  }
  /** Create a {@code Program} object. */
  public Program create(ProgramCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a {@code Program} object. */
  public Program create(ProgramCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/programs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Program.class);
  }
  /** Retrieves the program specified by the given id. */
  public Program retrieve(String program, ProgramRetrieveParams params) throws StripeException {
    return retrieve(program, params, (RequestOptions) null);
  }
  /** Retrieves the program specified by the given id. */
  public Program retrieve(String program, RequestOptions options) throws StripeException {
    return retrieve(program, (ProgramRetrieveParams) null, options);
  }
  /** Retrieves the program specified by the given id. */
  public Program retrieve(String program) throws StripeException {
    return retrieve(program, (ProgramRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the program specified by the given id. */
  public Program retrieve(String program, ProgramRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/programs/%s", ApiResource.urlEncodeId(program));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Program.class);
  }
  /** Updates a {@code Program} object. */
  public Program update(String program, ProgramUpdateParams params) throws StripeException {
    return update(program, params, (RequestOptions) null);
  }
  /** Updates a {@code Program} object. */
  public Program update(String program, RequestOptions options) throws StripeException {
    return update(program, (ProgramUpdateParams) null, options);
  }
  /** Updates a {@code Program} object. */
  public Program update(String program) throws StripeException {
    return update(program, (ProgramUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a {@code Program} object. */
  public Program update(String program, ProgramUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/programs/%s", ApiResource.urlEncodeId(program));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Program.class);
  }
}
