// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.tax.AssociationFindParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax Association exposes the Tax Transactions that Stripe attempted to create on your behalf
 * based on the PaymentIntent input.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Association extends ApiResource implements HasId {
  /**
   * The <a href="https://stripe.com/docs/api/tax/calculations/object">Tax Calculation</a> that was
   * included in PaymentIntent.
   */
  @SerializedName("calculation")
  String calculation;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.association}.
   */
  @SerializedName("object")
  String object;

  /**
   * The <a href="https://stripe.com/docs/api/payment_intents/object">PaymentIntent</a> that this
   * Tax Association is tracking.
   */
  @SerializedName("payment_intent")
  String paymentIntent;

  /** Information about the tax transactions linked to this payment intent. */
  @SerializedName("tax_transaction_attempts")
  List<Association.TaxTransactionAttempt> taxTransactionAttempts;

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(Map<String, Object> params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/associations/find";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Association.class);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(AssociationFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(AssociationFindParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/associations/find";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Association.class);
  }

  /**
   * For more details about TaxTransactionAttempt, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxTransactionAttempt extends StripeObject {
    @SerializedName("committed")
    Committed committed;

    @SerializedName("errored")
    Errored errored;

    /** The source of the tax transaction attempt. This is either a refund or a payment intent. */
    @SerializedName("source")
    String source;

    /** The status of the transaction attempt. This can be {@code errored} or {@code committed}. */
    @SerializedName("status")
    String status;

    /**
     * For more details about Committed, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Committed extends StripeObject {
      /** The <a href="https://stripe.com/docs/api/tax/transaction/object">Tax Transaction.</a> */
      @SerializedName("transaction")
      String transaction;
    }

    /**
     * For more details about Errored, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errored extends StripeObject {
      /**
       * Details on why we couldn't commit the tax transaction.
       *
       * <p>One of {@code another_payment_associated_with_calculation}, {@code calculation_expired},
       * {@code currency_mismatch}, {@code original_transaction_voided}, or {@code
       * unique_reference_violation}.
       */
      @SerializedName("reason")
      String reason;
    }
  }
}
