// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.CustomerEvaluationCreateParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Customer Evaluation resource returned by the Radar Customer Evaluations API. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerEvaluation extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created_at")
  Long createdAt;

  /** The ID of the Stripe customer the customer evaluation is associated with. */
  @SerializedName("customer")
  String customer;

  /** The type of evaluation event. */
  @SerializedName("event_type")
  String eventType;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.customer_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** A hash of signal objects providing Radar's evaluation for the lifecycle event. */
  @SerializedName("signals")
  Signals signals;

  /** Creates a new {@code CustomerEvaluation} object. */
  public static CustomerEvaluation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code CustomerEvaluation} object. */
  public static CustomerEvaluation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/customer_evaluations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerEvaluation.class);
  }

  /** Creates a new {@code CustomerEvaluation} object. */
  public static CustomerEvaluation create(CustomerEvaluationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code CustomerEvaluation} object. */
  public static CustomerEvaluation create(
      CustomerEvaluationCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/customer_evaluations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerEvaluation.class);
  }

  /** Customer Evaluation Signals resource returned by the Radar Customer Evaluations API. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Signals extends StripeObject {
    @SerializedName("account_sharing")
    AccountSharing accountSharing;

    @SerializedName("multi_accounting")
    MultiAccounting multiAccounting;

    /**
     * For more details about AccountSharing, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountSharing extends StripeObject {
      /** Time at which the signal was evaluated. Measured in seconds since the Unix epoch. */
      @SerializedName("evaluated_at")
      Long evaluatedAt;

      /** The risk level for this signal. */
      @SerializedName("risk_level")
      String riskLevel;

      /** Score for this signal (float between 0.0-100.0). */
      @SerializedName("score")
      BigDecimal score;
    }

    /**
     * For more details about MultiAccounting, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MultiAccounting extends StripeObject {
      /** Time at which the signal was evaluated. Measured in seconds since the Unix epoch. */
      @SerializedName("evaluated_at")
      Long evaluatedAt;

      /** The risk level for this signal. */
      @SerializedName("risk_level")
      String riskLevel;

      /** Score for this signal (float between 0.0-100.0). */
      @SerializedName("score")
      BigDecimal score;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(signals, responseGetter);
  }
}
