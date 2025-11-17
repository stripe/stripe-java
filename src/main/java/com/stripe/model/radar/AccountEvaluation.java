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
import com.stripe.param.radar.AccountEvaluationCreateParams;
import com.stripe.param.radar.AccountEvaluationRetrieveParams;
import com.stripe.param.radar.AccountEvaluationUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Account Evaluation resource returned by the Radar Account Evaluations API. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountEvaluation extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created_at")
  Long createdAt;

  /** The ID of the Stripe customer the account evaluation is associated with. */
  @SerializedName("customer")
  String customer;

  /**
   * The list of events that were reported for this Account Evaluation object via the report API.
   */
  @SerializedName("events")
  List<AccountEvaluation.Event> events;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.account_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** A hash of signal objects providing Radar's evaluation for the lifecycle event. */
  @SerializedName("signals")
  Signals signals;

  /** The type of evaluation returned, based on the user's request. */
  @SerializedName("type")
  String type;

  /** Creates a new {@code AccountEvaluation} object. */
  public static AccountEvaluation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code AccountEvaluation} object. */
  public static AccountEvaluation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/account_evaluations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, AccountEvaluation.class);
  }

  /** Creates a new {@code AccountEvaluation} object. */
  public static AccountEvaluation create(AccountEvaluationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code AccountEvaluation} object. */
  public static AccountEvaluation create(
      AccountEvaluationCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/account_evaluations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountEvaluation.class);
  }

  /** Retrieves an {@code AccountEvaluation} object. */
  public static AccountEvaluation retrieve(String accountEvaluation) throws StripeException {
    return retrieve(accountEvaluation, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an {@code AccountEvaluation} object. */
  public static AccountEvaluation retrieve(String accountEvaluation, RequestOptions options)
      throws StripeException {
    return retrieve(accountEvaluation, (Map<String, Object>) null, options);
  }

  /** Retrieves an {@code AccountEvaluation} object. */
  public static AccountEvaluation retrieve(
      String accountEvaluation, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/account_evaluations/%s", ApiResource.urlEncodeId(accountEvaluation));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AccountEvaluation.class);
  }

  /** Retrieves an {@code AccountEvaluation} object. */
  public static AccountEvaluation retrieve(
      String accountEvaluation, AccountEvaluationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/account_evaluations/%s", ApiResource.urlEncodeId(accountEvaluation));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountEvaluation.class);
  }

  /** Reports an event on an {@code AccountEvaluation} object. */
  public AccountEvaluation update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Reports an event on an {@code AccountEvaluation} object. */
  public AccountEvaluation update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/account_evaluations/%s/report_event", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, AccountEvaluation.class);
  }

  /** Reports an event on an {@code AccountEvaluation} object. */
  public AccountEvaluation update(AccountEvaluationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Reports an event on an {@code AccountEvaluation} object. */
  public AccountEvaluation update(AccountEvaluationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/account_evaluations/%s/report_event", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, AccountEvaluation.class);
  }

  /** Event object representing an event reported for an Account Evaluation via the report API. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Event extends StripeObject {
    /** Time at which the event occurred. Measured in seconds since the Unix epoch. */
    @SerializedName("occurred_at")
    Long occurredAt;

    /** The type of event that occurred. */
    @SerializedName("type")
    String type;
  }

  /** Account Evaluation Signal resource returned by the Radar Account Evaluations API. */
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
