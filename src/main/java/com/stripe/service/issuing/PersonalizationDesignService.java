// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.PersonalizationDesign;
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
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PersonalizationDesign>>() {}.getType());
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
            options);
    return this.request(request, PersonalizationDesign.class);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(String id, PersonalizationDesignRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PersonalizationDesignRetrieveParams) null, options);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(String id) throws StripeException {
    return retrieve(id, (PersonalizationDesignRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a personalization design object. */
  public PersonalizationDesign retrieve(
      String id, PersonalizationDesignRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/personalization_designs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PersonalizationDesign.class);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(String id, PersonalizationDesignUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(String id, RequestOptions options) throws StripeException {
    return update(id, (PersonalizationDesignUpdateParams) null, options);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(String id) throws StripeException {
    return update(id, (PersonalizationDesignUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a card personalization object. */
  public PersonalizationDesign update(
      String id, PersonalizationDesignUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/personalization_designs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PersonalizationDesign.class);
  }
}
