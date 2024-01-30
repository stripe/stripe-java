// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.PersonalizationDesign;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.PersonalizationDesignCreateParams;
import com.stripe.param.issuing.PersonalizationDesignListParams;
import com.stripe.param.issuing.PersonalizationDesignRetrieveParams;
import com.stripe.param.issuing.PersonalizationDesignUpdateParams;

public final class PersonalizationDesignService extends ApiService {
  public PersonalizationDesignService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PersonalizationDesign> list(PersonalizationDesignListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PersonalizationDesign> list(RequestOptions options)
      throws StripeException {
    return list((PersonalizationDesignListParams) null, options);
  }
  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PersonalizationDesign> list() throws StripeException {
    return list((PersonalizationDesignListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PersonalizationDesign> list(
      PersonalizationDesignListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/personalization_designs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<PersonalizationDesign>>() {}.getType());
  }
  /** Creates a personalization design object. */
  public PersonalizationDesign create(PersonalizationDesignCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a personalization design object. */
  public PersonalizationDesign create(
      PersonalizationDesignCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/personalization_designs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(
      String personalizationDesign, PersonalizationDesignRetrieveParams params)
      throws StripeException {
    return retrieve(personalizationDesign, params, (RequestOptions) null);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(String personalizationDesign, RequestOptions options)
      throws StripeException {
    return retrieve(personalizationDesign, (PersonalizationDesignRetrieveParams) null, options);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(String personalizationDesign) throws StripeException {
    return retrieve(
        personalizationDesign, (PersonalizationDesignRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(
      String personalizationDesign,
      PersonalizationDesignRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/personalization_designs/%s",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(
      String personalizationDesign, PersonalizationDesignUpdateParams params)
      throws StripeException {
    return update(personalizationDesign, params, (RequestOptions) null);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(String personalizationDesign, RequestOptions options)
      throws StripeException {
    return update(personalizationDesign, (PersonalizationDesignUpdateParams) null, options);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(String personalizationDesign) throws StripeException {
    return update(
        personalizationDesign, (PersonalizationDesignUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(
      String personalizationDesign,
      PersonalizationDesignUpdateParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/personalization_designs/%s",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }
}
