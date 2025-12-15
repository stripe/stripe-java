// File generated from our OpenAPI spec
package com.stripe.model.capital;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
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
 * A financing summary object describes a connected account's financing status in real time. A
 * financing status is either {@code accepted}, {@code delivered}, or {@code none}. You can read the
 * status of your connected accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancingSummary extends ApiResource {
  /**
   * Additional information about the financing summary. Describes currency, advance amount, fee
   * amount, withhold rate, remaining amount, paid amount, current repayment interval, repayment
   * start date, and advance payout date.
   *
   * <p>Only present for financing offers with the {@code paid_out} status.
   */
  @SerializedName("details")
  Details details;

  /**
   * The unique identifier of the Financing Offer object that corresponds to the Financing Summary
   * object.
   */
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
   * The financing status of the connected account.
   *
   * <p>One of {@code accepted}, {@code delivered}, or {@code none}.
   */
  @SerializedName("status")
  String status;

  /** Retrieve the financing summary object for the account. */
  public static FinancingSummary retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve the financing summary object for the account. */
  public static FinancingSummary retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieve the financing summary object for the account. */
  public static FinancingSummary retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/capital/financing_summary";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FinancingSummary.class);
  }

  /** Retrieve the financing summary object for the account. */
  public static FinancingSummary retrieve(
      FinancingSummaryRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_summary";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FinancingSummary.class);
  }

  /**
   * For more details about Details, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Details extends StripeObject {
    /**
     * Amount of financing offered, in minor units. For example, 1,000 USD is represented as 100000.
     */
    @SerializedName("advance_amount")
    Long advanceAmount;

    /**
     * The time at which the funds were paid out to the connected account's Stripe balance. Given in
     * milliseconds since unix epoch.
     */
    @SerializedName("advance_paid_out_at")
    BigDecimal advancePaidOutAt;

    /** Currency that the financing offer is transacted in. For example, {@code usd}. */
    @SerializedName("currency")
    String currency;

    /** The chronologically current repayment interval for the financing offer. */
    @SerializedName("current_repayment_interval")
    CurrentRepaymentInterval currentRepaymentInterval;

    /** Fixed fee amount, in minor units. For example, 100 USD is represented as 10000. */
    @SerializedName("fee_amount")
    Long feeAmount;

    /**
     * The amount the Connected account has paid toward the financing debt so far, in minor units.
     * For example, 1,000 USD is represented as 100000.
     */
    @SerializedName("paid_amount")
    Long paidAmount;

    /**
     * The balance remaining to be paid on the financing, in minor units. For example, 1,000 USD is
     * represented as 100000.
     */
    @SerializedName("remaining_amount")
    Long remainingAmount;

    /**
     * The time at which Capital will begin withholding from payments. Given in seconds since unix
     * epoch.
     */
    @SerializedName("repayments_begin_at")
    BigDecimal repaymentsBeginAt;

    /** Per-transaction rate at which Stripe withholds funds to repay the financing. */
    @SerializedName("withhold_rate")
    BigDecimal withholdRate;

    /** The current repayment interval for the Connected account. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CurrentRepaymentInterval extends StripeObject {
      /**
       * The time at which the minimum payment amount will be due. If not met through withholding,
       * the Connected account's linked bank account or account balance will be debited. Given in
       * seconds since unix epoch.
       */
      @SerializedName("due_at")
      BigDecimal dueAt;

      /**
       * The amount that has already been paid in the current repayment interval, in minor units.
       * For example, 100 USD is represented as 10000.
       */
      @SerializedName("paid_amount")
      Long paidAmount;

      /**
       * The amount that is yet to be paid in the current repayment interval, in minor units. For
       * example, 100 USD is represented as 10000.
       */
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
