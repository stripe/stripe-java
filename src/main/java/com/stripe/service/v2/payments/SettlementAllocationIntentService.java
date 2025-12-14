// File generated from our OpenAPI spec
package com.stripe.service.v2.payments;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.payments.SettlementAllocationIntent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.payments.SettlementAllocationIntentCreateParams;
import com.stripe.param.v2.payments.SettlementAllocationIntentUpdateParams;

public final class SettlementAllocationIntentService extends ApiService {
  public SettlementAllocationIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create a new SettlementAllocationIntent. */
  public SettlementAllocationIntent create(SettlementAllocationIntentCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a new SettlementAllocationIntent. */
  public SettlementAllocationIntent create(
      SettlementAllocationIntentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/payments/settlement_allocation_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SettlementAllocationIntent.class);
  }
  /** Retrieve an existing SettlementAllocationIntent. */
  public SettlementAllocationIntent retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve an existing SettlementAllocationIntent. */
  public SettlementAllocationIntent retrieve(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/payments/settlement_allocation_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, SettlementAllocationIntent.class);
  }
  /**
   * Updates SettlementAllocationIntent. Only SettlementAllocationIntent with status {@code
   * pending}, {@code submitted} and {@code errored} can be updated. Only amount and reference
   * fields can be updated for a SettlementAllocationIntent and at least one must be present.
   * Updating an {@code amount} moves the SettlementAllocationIntent {@code pending} status and
   * updating the {@code reference} for {@code errored} SettlementAllocationIntent moves it to
   * {@code submitted}.
   */
  public SettlementAllocationIntent update(String id, SettlementAllocationIntentUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates SettlementAllocationIntent. Only SettlementAllocationIntent with status {@code
   * pending}, {@code submitted} and {@code errored} can be updated. Only amount and reference
   * fields can be updated for a SettlementAllocationIntent and at least one must be present.
   * Updating an {@code amount} moves the SettlementAllocationIntent {@code pending} status and
   * updating the {@code reference} for {@code errored} SettlementAllocationIntent moves it to
   * {@code submitted}.
   */
  public SettlementAllocationIntent update(String id, RequestOptions options)
      throws StripeException {
    return update(id, (SettlementAllocationIntentUpdateParams) null, options);
  }
  /**
   * Updates SettlementAllocationIntent. Only SettlementAllocationIntent with status {@code
   * pending}, {@code submitted} and {@code errored} can be updated. Only amount and reference
   * fields can be updated for a SettlementAllocationIntent and at least one must be present.
   * Updating an {@code amount} moves the SettlementAllocationIntent {@code pending} status and
   * updating the {@code reference} for {@code errored} SettlementAllocationIntent moves it to
   * {@code submitted}.
   */
  public SettlementAllocationIntent update(String id) throws StripeException {
    return update(id, (SettlementAllocationIntentUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates SettlementAllocationIntent. Only SettlementAllocationIntent with status {@code
   * pending}, {@code submitted} and {@code errored} can be updated. Only amount and reference
   * fields can be updated for a SettlementAllocationIntent and at least one must be present.
   * Updating an {@code amount} moves the SettlementAllocationIntent {@code pending} status and
   * updating the {@code reference} for {@code errored} SettlementAllocationIntent moves it to
   * {@code submitted}.
   */
  public SettlementAllocationIntent update(
      String id, SettlementAllocationIntentUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/payments/settlement_allocation_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SettlementAllocationIntent.class);
  }
  /**
   * Cancels an existing SettlementAllocationIntent. Only SettlementAllocationIntent with status
   * {@code pending}, {@code submitted} and {@code errored} can be {@code canceled}.
   */
  public SettlementAllocationIntent cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /**
   * Cancels an existing SettlementAllocationIntent. Only SettlementAllocationIntent with status
   * {@code pending}, {@code submitted} and {@code errored} can be {@code canceled}.
   */
  public SettlementAllocationIntent cancel(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/payments/settlement_allocation_intents/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, SettlementAllocationIntent.class);
  }
  /**
   * Submits a SettlementAllocationIntent. Only SettlementAllocationIntent with status {@code
   * pending} can be {@code submitted}. The net sum of SettlementAllocationIntentSplit amount must
   * be equal to SettlementAllocationIntent amount to be eligible to be submitted.
   */
  public SettlementAllocationIntent submit(String id) throws StripeException {
    return submit(id, (RequestOptions) null);
  }
  /**
   * Submits a SettlementAllocationIntent. Only SettlementAllocationIntent with status {@code
   * pending} can be {@code submitted}. The net sum of SettlementAllocationIntentSplit amount must
   * be equal to SettlementAllocationIntent amount to be eligible to be submitted.
   */
  public SettlementAllocationIntent submit(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/payments/settlement_allocation_intents/%s/submit", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, SettlementAllocationIntent.class);
  }

  public com.stripe.service.v2.payments.settlementallocationintents.SplitService splits() {
    return new com.stripe.service.v2.payments.settlementallocationintents.SplitService(
        this.getResponseGetter());
  }
}
