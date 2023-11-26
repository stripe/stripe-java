// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ChargeCaptureParams;
import com.stripe.param.ChargeCreateParams;
import com.stripe.param.ChargeListParams;
import com.stripe.param.ChargeRetrieveParams;
import com.stripe.param.ChargeSearchParams;
import com.stripe.param.ChargeUpdateParams;


public final class ChargeService {
  private final ChargeCreator chargeCreator;
  private final ChargeRetriever chargeRetriever;
  private final ChargeUpdater chargeUpdater;
  private final ChargeSearcher chargeSearcher;
  private final ChargeCapturer chargeCapturer;
  private final ChargeLister chargeLister;

  public ChargeService(StripeResponseGetter responseGetter) {
    this.chargeCreator = new ChargeCreator(responseGetter);
    this.chargeRetriever = new ChargeRetriever(responseGetter);
    this.chargeUpdater = new ChargeUpdater(responseGetter);
    this.chargeSearcher = new ChargeSearcher(responseGetter);
    this.chargeCapturer = new ChargeCapturer(responseGetter);
    this.chargeLister = new ChargeLister(responseGetter);
  }

  public Charge create(ChargeCreateParams params, RequestOptions options) throws StripeException {
    return chargeCreator.create(params, options);
  }

  public Charge create(RequestOptions options) throws StripeException {
    return chargeCreator.create(options);
  }

  public Charge create() throws StripeException {
    return chargeCreator.create();
  }

  public Charge create(ChargeCreateParams params) throws StripeException {
    return chargeCreator.create(params);
  }

  public Charge retrieve(String charge, ChargeRetrieveParams params, RequestOptions options) throws StripeException {
    return chargeRetriever.retrieve(charge, params, options);
  }

  public Charge retrieve(String charge, RequestOptions options) throws StripeException {
    return chargeRetriever.retrieve(charge, options);
  }

  public Charge retrieve(String charge) throws StripeException {
    return chargeRetriever.retrieve(charge);
  }

  public Charge retrieve(String charge, ChargeRetrieveParams params) throws StripeException {
    return chargeRetriever.retrieve(charge, params);
  }

  public Charge update(String charge, ChargeUpdateParams params, RequestOptions options) throws StripeException {
    return chargeUpdater.update(charge, params, options);
  }

  public Charge update(String charge, RequestOptions options) throws StripeException {
    return chargeUpdater.update(charge, options);
  }

  public Charge update(String charge) throws StripeException {
    return chargeUpdater.update(charge);
  }

  public Charge update(String charge, ChargeUpdateParams params) throws StripeException {
    return chargeUpdater.update(charge, params);
  }

  public StripeSearchResult<Charge> search(ChargeSearchParams params, RequestOptions options) throws StripeException {
    return chargeSearcher.search(params, options);
  }

  public StripeSearchResult<Charge> search(ChargeSearchParams params) throws StripeException {
    return chargeSearcher.search(params);
  }

  public Charge capture(String charge, ChargeCaptureParams params, RequestOptions options) throws StripeException {
    return chargeCapturer.capture(charge, params, options);
  }

  public Charge capture(String charge, RequestOptions options) throws StripeException {
    return chargeCapturer.capture(charge, options);
  }

  public Charge capture(String charge) throws StripeException {
    return chargeCapturer.capture(charge);
  }

  public Charge capture(String charge, ChargeCaptureParams params) throws StripeException {
    return chargeCapturer.capture(charge, params);
  }

  public StripeCollection<Charge> list(ChargeListParams params, RequestOptions options) throws StripeException {
    return chargeLister.list(params, options);
  }

  public StripeCollection<Charge> list(RequestOptions options) throws StripeException {
    return chargeLister.list(options);
  }

  public StripeCollection<Charge> list() throws StripeException {
    return chargeLister.list();
  }

  public StripeCollection<Charge> list(ChargeListParams params) throws StripeException {
    return chargeLister.list(params);
  }
}


class ChargeCreator {
  private final StripeResponseGetter responseGetter;

  public ChargeCreator(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Use the <a href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to
   * initiate a new payment instead of using this method. Confirmation of the PaymentIntent creates
   * the {@code Charge} object used to request payment, so this method is limited to legacy
   * integrations.
   */
  public Charge create(ChargeCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/charges";
    return responseGetter.request(
      BaseAddress.API,
      ApiResource.RequestMethod.POST,
      path,
      ApiRequestParams.paramsToMap(params),
      Charge.class,
      options,
      ApiMode.V1);
  }

  /**
   * Use the <a href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to
   * initiate a new payment instead of using this method. Confirmation of the PaymentIntent creates
   * the {@code Charge} object used to request payment, so this method is limited to legacy
   * integrations.
   */
  public Charge create(RequestOptions options) throws StripeException {
    return create(null, options);
  }

  /**
   * Use the <a href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to
   * initiate a new payment instead of using this method. Confirmation of the PaymentIntent creates
   * the {@code Charge} object used to request payment, so this method is limited to legacy
   * integrations.
   */
  public Charge create() throws StripeException {
    return create(null, null);
  }

  /**
   * Use the <a href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to
   * initiate a new payment instead of using this method. Confirmation of the PaymentIntent creates
   * the {@code Charge} object used to request payment, so this method is limited to legacy
   * integrations.
   */
  public Charge create(ChargeCreateParams params) throws StripeException {
    return create(params, null);
  }
}

class ChargeRetriever {
  private final StripeResponseGetter responseGetter;

  public ChargeRetriever(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String charge, ChargeRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(charge));
    return responseGetter.request(
      BaseAddress.API,
      ApiResource.RequestMethod.GET,
      path,
      ApiRequestParams.paramsToMap(params),
      Charge.class,
      options,
      ApiMode.V1);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String charge, RequestOptions options) throws StripeException {
    return retrieve(charge, null, options);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String charge) throws StripeException {
    return retrieve(charge, null, null);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String charge, ChargeRetrieveParams params) throws StripeException {
    return retrieve(charge, params, null);
  }
}

class ChargeUpdater {
  private final StripeResponseGetter responseGetter;

  public ChargeUpdater(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String charge, ChargeUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(charge));
    return responseGetter.request(
      BaseAddress.API,
      ApiResource.RequestMethod.POST,
      path,
      ApiRequestParams.paramsToMap(params),
      Charge.class,
      options,
      ApiMode.V1);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String charge, RequestOptions options) throws StripeException {
    return update(charge, null, options);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String charge) throws StripeException {
    return update(charge, null, null);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String charge, ChargeUpdateParams params) throws StripeException {
    return update(charge, params, null);
  }
}

class ChargeSearcher {
  private final StripeResponseGetter responseGetter;

  public ChargeSearcher(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Charge> search(ChargeSearchParams params, RequestOptions options) throws StripeException {
    String path = "/v1/charges/search";
    return responseGetter.request(
      BaseAddress.API,
      ApiResource.RequestMethod.GET,
      path,
      ApiRequestParams.paramsToMap(params),
      new TypeToken<StripeSearchResult<Charge>>() {}.getType(),
      options,
      ApiMode.V1);
  }

  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Charge> search(ChargeSearchParams params) throws StripeException {
    return search(params, null);
  }
}

class ChargeCapturer {
  private final StripeResponseGetter responseGetter;

  public ChargeCapturer(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(String charge, ChargeCaptureParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s/capture", ApiResource.urlEncodeId(charge));
    return responseGetter.request(
      BaseAddress.API,
      ApiResource.RequestMethod.POST,
      path,
      ApiRequestParams.paramsToMap(params),
      Charge.class,
      options,
      ApiMode.V1);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(String charge, RequestOptions options) throws StripeException {
    return capture(charge, null, options);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(String charge) throws StripeException {
    return capture(charge, null, null);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(String charge, ChargeCaptureParams params) throws StripeException {
    return capture(charge, params, null);
  }
}

class ChargeLister {
  private final StripeResponseGetter responseGetter;

  public ChargeLister(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list(ChargeListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/charges";
    return responseGetter.request(
      BaseAddress.API,
      ApiResource.RequestMethod.GET,
      path,
      ApiRequestParams.paramsToMap(params),
      new TypeToken<StripeCollection<Charge>>() {}.getType(),
      options,
      ApiMode.V1);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list(RequestOptions options) throws StripeException {
    return list(null, options);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list() throws StripeException {
    return list(null, null);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list(ChargeListParams params) throws StripeException {
    return list(params, null);
  }
}


