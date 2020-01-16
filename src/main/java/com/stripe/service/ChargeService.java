package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import com.stripe.param.ChargeCaptureParams;
import com.stripe.param.ChargeCreateParams;
import com.stripe.param.ChargeListParams;
import com.stripe.param.ChargeRetrieveParams;
import com.stripe.param.ChargeUpdateParams;
import com.stripe.util.StringUtils;
import java.lang.reflect.Type;

public class ChargeService extends Service<Charge> {
  public ChargeService(StripeClient client) {
    super(client);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   *
   * @param id the ID of the charge to update
   * @return the captured charge
   * @throws StripeException if the request fails
   */
  public Charge capture(String id) throws StripeException {
    return this.capture(id, null, null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   *
   * @param id the ID of the charge to update
   * @param params the request parameters
   * @return the captured charge
   * @throws StripeException if the request fails
   */
  public Charge capture(String id, ChargeCaptureParams params) throws StripeException {
    return this.capture(id, params, null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   *
   * @param id the ID of the charge to capture
   * @param params the request parameters
   * @param options the special options for the request
   * @return the captured charge
   * @throws StripeException if the request fails
   */
  public Charge capture(String id, ChargeCaptureParams params, RequestOptions options)
      throws StripeException {
    return this.request(
        Charge.class,
        ApiResource.RequestMethod.POST,
        String.format("/v1/charges/%s/capture", StringUtils.urlEncode(id)),
        params,
        options);
  }

  /**
   * To charge a credit card or other payment source, you create a <code>Charge</code> object. If
   * your API key is in test mode, the supplied payment source (e.g., card) won’t actually be
   * charged, although everything else will occur as if in live mode. (Stripe assumes that the
   * charge would have completed successfully).
   *
   * @param params the request parameters
   * @return the created charge
   * @throws StripeException if the request fails
   */
  public Charge create(ChargeCreateParams params) throws StripeException {
    return this.create(params, null);
  }

  /**
   * To charge a credit card or other payment source, you create a <code>Charge</code> object. If
   * your API key is in test mode, the supplied payment source (e.g., card) won’t actually be
   * charged, although everything else will occur as if in live mode. (Stripe assumes that the
   * charge would have completed successfully).
   *
   * @param params the request parameters
   * @param options the special options for the request
   * @return the created charge
   * @throws StripeException if the request fails
   */
  public Charge create(ChargeCreateParams params, RequestOptions options) throws StripeException {
    return this.request(
        Charge.class, ApiResource.RequestMethod.POST, "/v1/charges", params, options);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   *
   * @return the list of charges
   * @throws StripeException if the request fails
   */
  public StripeCollection<Charge> list() throws StripeException {
    return this.list(null, null);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   *
   * @param params the request parameters
   * @return the list of charges
   * @throws StripeException if the request fails
   */
  public StripeCollection<Charge> list(ChargeListParams params) throws StripeException {
    return this.list(params, null);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   *
   * @param params the request parameters
   * @param options the special options for the request
   * @return the list of charges
   * @throws StripeException if the request fails
   */
  public StripeCollection<Charge> list(ChargeListParams params, RequestOptions options)
      throws StripeException {
    Type type = new TypeToken<StripeCollection<Charge>>() {}.getType();
    return this.request(type, ApiResource.RequestMethod.GET, "/v1/charges", params, options);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   *
   * @param id the ID of the charge to retrieve
   * @return the retrieved charge
   * @throws StripeException if the request fails
   */
  public Charge retrieve(String id) throws StripeException {
    return this.retrieve(id, null, null);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   *
   * @param id the ID of the charge to retrieve
   * @param params the request parameters
   * @return the retrieved charge
   * @throws StripeException if the request fails
   */
  public Charge retrieve(String id, ChargeRetrieveParams params) throws StripeException {
    return this.retrieve(id, params, null);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   *
   * @param id the ID of the charge to retrieve
   * @param params the request parameters
   * @param options the special options for the request
   * @return the retrieved charge
   * @throws StripeException if the request fails
   */
  public Charge retrieve(String id, ChargeRetrieveParams params, RequestOptions options)
      throws StripeException {
    return this.request(
        Charge.class,
        ApiResource.RequestMethod.GET,
        String.format("/v1/charges/%s", StringUtils.urlEncode(id)),
        params,
        options);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * @param id the ID of the charge to update
   * @param params the request parameters
   * @return the updated charge
   * @throws StripeException if the request fails
   */
  public Charge update(String id, ChargeUpdateParams params) throws StripeException {
    return this.update(id, params, null);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * @param id the ID of the charge to update
   * @param params the request parameters
   * @param options the special options for the request
   * @return the updated charge
   * @throws StripeException if the request fails
   */
  public Charge update(String id, ChargeUpdateParams params, RequestOptions options)
      throws StripeException {
    return this.request(
        Charge.class,
        ApiResource.RequestMethod.POST,
        String.format("/v1/charges/%s", StringUtils.urlEncode(id)),
        params,
        options);
  }
}
