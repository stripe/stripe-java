// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentPlanCreateParams;
import com.stripe.param.PaymentPlanListParams;
import com.stripe.param.PaymentPlanRetrieveParams;
import com.stripe.param.PaymentPlanUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Payment Plan splits a single invoice obligation into multiple installments, each with its own
 * due date and amount. Payment Plans are associated with a finalized or draft invoice and track how
 * much has been collected against each installment.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentPlan extends ApiResource implements HasId, MetadataStore<PaymentPlan> {
  /** The list of objects this payment plan collects against. */
  @SerializedName("collects_on")
  List<PaymentPlan.CollectsOn> collectsOn;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The list of installments derived from the schedule. Each installment tracks an individual
   * payment obligation.
   */
  @SerializedName("installments")
  List<PaymentPlan.Installment> installments;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_plan}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("schedule")
  Schedule schedule;

  /**
   * Creates a payment plan that splits a single invoice obligation into installments with their own
   * due dates and amounts.
   */
  public static PaymentPlan create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a payment plan that splits a single invoice obligation into installments with their own
   * due dates and amounts.
   */
  public static PaymentPlan create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_plans";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentPlan.class);
  }

  /**
   * Creates a payment plan that splits a single invoice obligation into installments with their own
   * due dates and amounts.
   */
  public static PaymentPlan create(PaymentPlanCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a payment plan that splits a single invoice obligation into installments with their own
   * due dates and amounts.
   */
  public static PaymentPlan create(PaymentPlanCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_plans";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentPlan.class);
  }

  /** Returns a list of payment plans. */
  public static PaymentPlanCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of payment plans. */
  public static PaymentPlanCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_plans";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentPlanCollection.class);
  }

  /** Returns a list of payment plans. */
  public static PaymentPlanCollection list(PaymentPlanListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of payment plans. */
  public static PaymentPlanCollection list(PaymentPlanListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_plans";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentPlanCollection.class);
  }

  /** Retrieves the payment plan with the given ID. */
  public static PaymentPlan retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the payment plan with the given ID. */
  public static PaymentPlan retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the payment plan with the given ID. */
  public static PaymentPlan retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentPlan.class);
  }

  /** Retrieves the payment plan with the given ID. */
  public static PaymentPlan retrieve(
      String id, PaymentPlanRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payment_plans/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentPlan.class);
  }

  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  @Override
  public PaymentPlan update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  @Override
  public PaymentPlan update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_plans/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentPlan.class);
  }

  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  public PaymentPlan update(PaymentPlanUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the schedule or metadata of an existing payment plan. Only unpaid installments can be
   * updated.
   */
  public PaymentPlan update(PaymentPlanUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_plans/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentPlan.class);
  }

  /**
   * For more details about CollectsOn, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CollectsOn extends StripeObject {
    @SerializedName("invoice_details")
    InvoiceDetails invoiceDetails;

    /** The type of object this plan collects against. Currently always {@code invoice_details}. */
    @SerializedName("type")
    String type;

    /**
     * For more details about InvoiceDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceDetails extends StripeObject {
      /** The ID of the invoice this plan collects against. */
      @SerializedName("invoice")
      String invoice;
    }
  }

  /**
   * For more details about Installment, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Installment extends StripeObject implements HasId {
    /** Amount owed for this installment, in the smallest currency unit. */
    @SerializedName("amount_due")
    Long amountDue;

    /** Amount forgiven for this installment, in the smallest currency unit. */
    @SerializedName("amount_forgiven")
    Long amountForgiven;

    /** Amount already paid toward this installment, in the smallest currency unit. */
    @SerializedName("amount_paid")
    Long amountPaid;

    /** Three-letter ISO currency code. */
    @SerializedName("currency")
    String currency;

    /** A description of this installment. */
    @SerializedName("description")
    String description;

    /** Unix timestamp when this installment is due. Omitted for installments with no due date. */
    @SerializedName("due_date")
    Long dueDate;

    /** Unique identifier for the installment. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Unix timestamp when this installment was paid. */
    @SerializedName("paid_at")
    Long paidAt;

    /**
     * The status of this installment. One of {@code open}, {@code paid}, {@code past_due}, or
     * {@code canceled}.
     */
    @SerializedName("status")
    String status;
  }

  /**
   * For more details about Schedule, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Schedule extends StripeObject {
    @SerializedName("amounts_due")
    AmountsDue amountsDue;

    /** The type of schedule. Currently always {@code amounts_due}. */
    @SerializedName("type")
    String type;

    /**
     * For more details about AmountsDue, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountsDue extends StripeObject {
      /** The list of installment schedule entries. */
      @SerializedName("amounts")
      List<PaymentPlan.Schedule.AmountsDue.Amount> amounts;

      /**
       * For more details about Amount, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Amount extends StripeObject implements HasId {
        /** A description of this schedule entry. */
        @SerializedName("description")
        String description;

        @SerializedName("due_date")
        DueDate dueDate;

        @SerializedName("fixed_amount")
        FixedAmount fixedAmount;

        /** Unique identifier for this schedule entry. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /**
         * Percentage of the invoice total for this entry (0–100). Present when type is {@code
         * percentage}.
         */
        @SerializedName("percentage")
        BigDecimal percentage;

        /** The type of this schedule entry. Either {@code fixed_amount} or {@code percentage}. */
        @SerializedName("type")
        String type;

        /**
         * For more details about DueDate, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class DueDate extends StripeObject {
          /** Unix timestamp of the due date. Present when type is {@code absolute}. */
          @SerializedName("absolute")
          Long absolute;

          @SerializedName("relative")
          Relative relative;

          /** The type of due date. Either {@code absolute} or {@code relative}. */
          @SerializedName("type")
          String type;

          /**
           * For more details about Relative, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Relative extends StripeObject {
            /** The number of intervals after the invoice is finalized that this entry is due. */
            @SerializedName("count")
            Long count;

            /** The interval unit: {@code day}, {@code week}, {@code month}, or {@code year}. */
            @SerializedName("interval")
            String interval;
          }
        }

        /**
         * For more details about FixedAmount, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class FixedAmount extends StripeObject {
          /** Fixed amount for this entry, in the smallest currency unit. */
          @SerializedName("amount")
          Long amount;

          /** Three-letter ISO currency code. */
          @SerializedName("currency")
          String currency;
        }
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(schedule, responseGetter);
  }
}
