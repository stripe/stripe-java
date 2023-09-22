// File generated from our OpenAPI spec
package com.stripe.model.capital;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingSummaryRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A financing object describes an account's current financing state. Used by Connect platforms to
 * read the state of Capital offered to their connected accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancingSummary extends ApiResource {
  /**
   * Additional information about the financing summary. Describes currency, advance amount, fee
   * amount, withhold rate, remaining amount, paid amount, current repayment interval, repayment
   * start date, and advance payout date.
   */
  @SerializedName("details")
  Details details;

  /** The Financing Offer ID this Financing Summary corresponds to. */
  @SerializedName("financing_offer")
  String financingOffer;

  /**
   * The object type: financing_summary
   *
   * <p>Equal to {@code capital.financing_summary}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the Connected Account's financing. <a
   * href="https://stripe.com/docs/api/capital/financing_summary">/v1/capital/financing_summary</a>
   * will only return {@code details} for {@code paid_out} financing.
   *
   * <p>One of {@code accepted}, {@code delivered}, or {@code none}.
   */
  @SerializedName("status")
  String status;

  /** Retrieve the financing state for the account that was authenticated in the request. */
  public static FinancingSummary retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve the financing state for the account that was authenticated in the request. */
  public static FinancingSummary retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieve the financing state for the account that was authenticated in the request. */
  public static FinancingSummary retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/capital/financing_summary";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            FinancingSummary.class,
            options,
            ApiMode.V1);
  }

  /** Retrieve the financing state for the account that was authenticated in the request. */
  public static FinancingSummary retrieve(
      FinancingSummaryRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_summary";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            FinancingSummary.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Details extends StripeObject {
    /** Amount of financing offered, in minor units. */
    @SerializedName("advance_amount")
    Long advanceAmount;

    /**
     * The time at which the funds were paid out the the Connected account's Stripe balance. Given
     * in milliseconds since unix epoch.
     */
    @SerializedName("advance_paid_out_at")
    Long advancePaidOutAt;

    /** Currency that the financing offer is transacted in. For example, {@code usd}. */
    @SerializedName("currency")
    String currency;

    /** The chronologically current repayment interval for the financing offer. */
    @SerializedName("current_repayment_interval")
    CurrentRepaymentInterval currentRepaymentInterval;

    /** Fixed fee amount, in minor units. */
    @SerializedName("fee_amount")
    Long feeAmount;

    /** The amount the Connected account has paid toward the financing debt so far. */
    @SerializedName("paid_amount")
    Long paidAmount;

    /** The balance remaining to be paid on the financing, in minor units. */
    @SerializedName("remaining_amount")
    Long remainingAmount;

    /**
     * The time at which Capital will begin withholding from payments. Given in seconds since unix
     * epoch.
     */
    @SerializedName("repayments_begin_at")
    Long repaymentsBeginAt;

    /** Per-transaction rate at which Stripe will withhold funds to repay the financing. */
    @SerializedName("withhold_rate")
    BigDecimal withholdRate;

    /** The current repayment interval for the Connected account. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CurrentRepaymentInterval extends StripeObject {
      /**
       * The time at which the minimum payment amount will be due. If not met through withholding,
       * the Connected account's linked bank account will be debited. Given in seconds since unix
       * epoch.
       */
      @SerializedName("due_at")
      Long dueAt;

      /** The amount that has already been paid in the current repayment interval. */
      @SerializedName("paid_amount")
      Long paidAmount;

      /** The amount that is yet to be paid in the current repayment interval. */
      @SerializedName("remaining_amount")
      Long remainingAmount;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(details, responseGetter);
  }
}
