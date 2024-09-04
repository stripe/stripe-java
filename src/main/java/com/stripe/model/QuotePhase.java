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
import com.stripe.param.QuotePhaseListLineItemsParams;
import com.stripe.param.QuotePhaseRetrieveParams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A quote phase describes the line items, coupons, and trialing status of a subscription for a
 * predefined time period.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class QuotePhase extends ApiResource implements HasId {
  /** Total before any discounts or taxes are applied. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total after discounts and taxes are applied. */
  @SerializedName("amount_total")
  Long amountTotal;

  /**
   * If set to {@code reset}, the billing_cycle_anchor of the subscription is set to the start of
   * the phase when entering the phase. If unset, then the billing cycle anchor is automatically
   * modified as needed when entering the phase. For more information, see the billing cycle <a
   * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
   *
   * <p>Equal to {@code reset}.
   */
  @SerializedName("billing_cycle_anchor")
  String billingCycleAnchor;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
   * the default source attached to the customer. When sending an invoice, Stripe will email your
   * customer an invoice with payment instructions and mark the subscription as {@code active}.
   *
   * <p>One of {@code charge_automatically}, or {@code send_invoice}.
   */
  @SerializedName("collection_method")
  String collectionMethod;

  /** The default tax rates to apply to the subscription during this phase of the quote. */
  @SerializedName("default_tax_rates")
  List<ExpandableField<TaxRate>> defaultTaxRates;

  /**
   * The stackable discounts that will be applied to the subscription on this phase. Subscription
   * item discounts are applied before subscription discounts.
   */
  @SerializedName("discounts")
  List<ExpandableField<com.stripe.model.Discount>> discounts;

  /** The end of this phase of the quote. */
  @SerializedName("end_date")
  Long endDate;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The invoice settings applicable during this phase. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /**
   * Integer representing the multiplier applied to the price interval. For example, {@code
   * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
   * results in a phase of duration {@code 2 * 3 months = 6 months}.
   */
  @SerializedName("iterations")
  Long iterations;

  /** A list of items the customer is being quoted for. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
   * declaratively set metadata on the subscription schedule's phases when the quote is accepted.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code quote_phase}.
   */
  @SerializedName("object")
  String object;

  /**
   * If the quote will prorate when transitioning to this phase. Possible values are {@code
   * create_prorations} and {@code none}.
   *
   * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
   */
  @SerializedName("proration_behavior")
  String prorationBehavior;

  @SerializedName("total_details")
  TotalDetails totalDetails;

  /**
   * If set to true the entire phase is counted as a trial and the customer will not be charged for
   * any recurring fees.
   */
  @SerializedName("trial")
  Boolean trial;

  /** When the trial ends within the phase. */
  @SerializedName("trial_end")
  Long trialEnd;

  /** Get IDs of expandable {@code defaultTaxRates} object list. */
  public List<String> getDefaultTaxRates() {
    return (this.defaultTaxRates != null)
        ? this.defaultTaxRates.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDefaultTaxRates(List<String> ids) {
    if (ids == null) {
      this.defaultTaxRates = null;
      return;
    }
    if (this.defaultTaxRates != null
        && this.defaultTaxRates.stream()
            .map(x -> x.getId())
            .collect(Collectors.toList())
            .equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.defaultTaxRates =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<TaxRate>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code defaultTaxRates}. */
  public List<TaxRate> getDefaultTaxRateObjects() {
    return (this.defaultTaxRates != null)
        ? this.defaultTaxRates.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDefaultTaxRateObjects(List<TaxRate> objs) {
    this.defaultTaxRates =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<TaxRate>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Get IDs of expandable {@code discounts} object list. */
  public List<String> getDiscounts() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDiscounts(List<String> ids) {
    if (ids == null) {
      this.discounts = null;
      return;
    }
    if (this.discounts != null
        && this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.discounts =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<com.stripe.model.Discount>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code discounts}. */
  public List<com.stripe.model.Discount> getDiscountObjects() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDiscountObjects(List<com.stripe.model.Discount> objs) {
    this.discounts =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<com.stripe.model.Discount>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/quote_phases/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(QuotePhaseListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(
      QuotePhaseListLineItemsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/quote_phases/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /** Retrieves the quote phase with the given ID. */
  public static QuotePhase retrieve(String quotePhase) throws StripeException {
    return retrieve(quotePhase, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the quote phase with the given ID. */
  public static QuotePhase retrieve(String quotePhase, RequestOptions options)
      throws StripeException {
    return retrieve(quotePhase, (Map<String, Object>) null, options);
  }

  /** Retrieves the quote phase with the given ID. */
  public static QuotePhase retrieve(
      String quotePhase, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quote_phases/%s", ApiResource.urlEncodeId(quotePhase));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, QuotePhase.class);
  }

  /** Retrieves the quote phase with the given ID. */
  public static QuotePhase retrieve(
      String quotePhase, QuotePhaseRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quote_phases/%s", ApiResource.urlEncodeId(quotePhase));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, QuotePhase.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceSettings extends StripeObject {
    /**
     * Number of days within which a customer must pay invoices generated by this subscription
     * schedule. This value will be {@code null} for subscription schedules where {@code
     * billing=charge_automatically}.
     */
    @SerializedName("days_until_due")
    Long daysUntilDue;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDetails extends StripeObject {
    /** This is the sum of all the discounts. */
    @SerializedName("amount_discount")
    Long amountDiscount;

    /** This is the sum of all the shipping amounts. */
    @SerializedName("amount_shipping")
    Long amountShipping;

    /** This is the sum of all the tax amounts. */
    @SerializedName("amount_tax")
    Long amountTax;

    @SerializedName("breakdown")
    Breakdown breakdown;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Breakdown extends StripeObject {
      /** The aggregated discounts. */
      @SerializedName("discounts")
      List<QuotePhase.TotalDetails.Breakdown.Discount> discounts;

      /** The aggregated tax amounts by rate. */
      @SerializedName("taxes")
      List<QuotePhase.TotalDetails.Breakdown.Tax> taxes;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount extends StripeObject {
        /** The amount discounted. */
        @SerializedName("amount")
        Long amount;

        /**
         * A discount represents the actual application of a <a
         * href="https://stripe.com/docs/api#coupons">coupon</a> or <a
         * href="https://stripe.com/docs/api#promotion_codes">promotion code</a>. It contains
         * information about when the discount began, when it will end, and what it is applied to.
         *
         * <p>Related guide: <a
         * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying discounts to
         * subscriptions</a>
         */
        @SerializedName("discount")
        com.stripe.model.Discount discount;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /** Amount of tax applied for this rate. */
        @SerializedName("amount")
        Long amount;

        /**
         * Tax rates can be applied to <a
         * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
         * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
         * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
         * Sessions</a> to collect tax.
         *
         * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
         */
        @SerializedName("rate")
        TaxRate rate;

        /**
         * The reasoning behind this tax, for example, if the product is tax exempt. The possible
         * values for this field may be extended as new tax rules are supported.
         *
         * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
         * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
         * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
         * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
         * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
         */
        @SerializedName("taxability_reason")
        String taxabilityReason;

        /** The amount on which tax is calculated, in cents (or local equivalent). */
        @SerializedName("taxable_amount")
        Long taxableAmount;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(invoiceSettings, responseGetter);
    trySetResponseGetter(lineItems, responseGetter);
    trySetResponseGetter(totalDetails, responseGetter);
  }
}
