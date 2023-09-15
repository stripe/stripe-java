// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.CardDesign;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardDesignActivateTestmodeParams;
import com.stripe.param.issuing.CardDesignDeactivateTestmodeParams;
import com.stripe.param.issuing.CardDesignRejectTestmodeParams;

public final class CardDesignService extends ApiService {
  public CardDesignService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Updates the {@code status} of the specified testmode card design object to {@code active}. */
  public CardDesign activateTestmode(String cardDesign, CardDesignActivateTestmodeParams params)
      throws StripeException {
    return activateTestmode(cardDesign, params, (RequestOptions) null);
  }
  /** Updates the {@code status} of the specified testmode card design object to {@code active}. */
  public CardDesign activateTestmode(String cardDesign, RequestOptions options)
      throws StripeException {
    return activateTestmode(cardDesign, (CardDesignActivateTestmodeParams) null, options);
  }
  /** Updates the {@code status} of the specified testmode card design object to {@code active}. */
  public CardDesign activateTestmode(String cardDesign) throws StripeException {
    return activateTestmode(
        cardDesign, (CardDesignActivateTestmodeParams) null, (RequestOptions) null);
  }
  /** Updates the {@code status} of the specified testmode card design object to {@code active}. */
  public CardDesign activateTestmode(
      String cardDesign, CardDesignActivateTestmodeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/card_designs/%s/status/activate",
            ApiResource.urlEncodeId(cardDesign));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }
  /**
   * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
   */
  public CardDesign deactivateTestmode(String cardDesign, CardDesignDeactivateTestmodeParams params)
      throws StripeException {
    return deactivateTestmode(cardDesign, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
   */
  public CardDesign deactivateTestmode(String cardDesign, RequestOptions options)
      throws StripeException {
    return deactivateTestmode(cardDesign, (CardDesignDeactivateTestmodeParams) null, options);
  }
  /**
   * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
   */
  public CardDesign deactivateTestmode(String cardDesign) throws StripeException {
    return deactivateTestmode(
        cardDesign, (CardDesignDeactivateTestmodeParams) null, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
   */
  public CardDesign deactivateTestmode(
      String cardDesign, CardDesignDeactivateTestmodeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/card_designs/%s/status/deactivate",
            ApiResource.urlEncodeId(cardDesign));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }
  /**
   * Updates the {@code status} of the specified testmode card design object to {@code rejected}.
   */
  public CardDesign rejectTestmode(String cardDesign, CardDesignRejectTestmodeParams params)
      throws StripeException {
    return rejectTestmode(cardDesign, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode card design object to {@code rejected}.
   */
  public CardDesign rejectTestmode(
      String cardDesign, CardDesignRejectTestmodeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/card_designs/%s/status/reject",
            ApiResource.urlEncodeId(cardDesign));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }
}
