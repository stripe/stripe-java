// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.ProgramCreateParams;
import com.stripe.param.issuing.ProgramListParams;
import com.stripe.param.issuing.ProgramRetrieveParams;
import com.stripe.param.issuing.ProgramUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An Issuing {@code Program} represents a card program that the user has access to. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Program extends ApiResource implements HasId, MetadataStore<Program> {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Whether or not this is the &quot;default&quot; issuing program new cards are created on. Only
   * one active {@code is_default} program at the same time.
   */
  @SerializedName("is_default")
  Boolean isDefault;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.program}.
   */
  @SerializedName("object")
  String object;

  /** The platform's Issuing Program for which this program is associated. */
  @SerializedName("platform_program")
  String platformProgram;

  /** Create a {@code Program} object. */
  public static Program create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a {@code Program} object. */
  public static Program create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/programs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Program.class);
  }

  /** Create a {@code Program} object. */
  public static Program create(ProgramCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a {@code Program} object. */
  public static Program create(ProgramCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/programs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Program.class);
  }

  /** List all of the programs the given Issuing user has access to. */
  public static ProgramCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all of the programs the given Issuing user has access to. */
  public static ProgramCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/programs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ProgramCollection.class);
  }

  /** List all of the programs the given Issuing user has access to. */
  public static ProgramCollection list(ProgramListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all of the programs the given Issuing user has access to. */
  public static ProgramCollection list(ProgramListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/programs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ProgramCollection.class);
  }

  /** Retrieves the program specified by the given id. */
  public static Program retrieve(String program) throws StripeException {
    return retrieve(program, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the program specified by the given id. */
  public static Program retrieve(String program, RequestOptions options) throws StripeException {
    return retrieve(program, (Map<String, Object>) null, options);
  }

  /** Retrieves the program specified by the given id. */
  public static Program retrieve(String program, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/programs/%s", ApiResource.urlEncodeId(program));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Program.class);
  }

  /** Retrieves the program specified by the given id. */
  public static Program retrieve(
      String program, ProgramRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/programs/%s", ApiResource.urlEncodeId(program));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Program.class);
  }

  /** Updates a {@code Program} object. */
  @Override
  public Program update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a {@code Program} object. */
  @Override
  public Program update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/programs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Program.class);
  }

  /** Updates a {@code Program} object. */
  public Program update(ProgramUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a {@code Program} object. */
  public Program update(ProgramUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/programs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Program.class);
  }
}
