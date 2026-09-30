// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.FormListParams;
import com.stripe.param.tax.FormPdfParams;
import com.stripe.param.tax.FormRetrieveParams;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Tax forms are legal documents which are delivered to one or more tax authorities for information
 * reporting purposes.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/connect/tax-reporting">US tax reporting for
 * Connect platforms</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Form extends ApiResource implements HasId {
  @SerializedName("au_serr")
  AuSerr auSerr;

  @SerializedName("ca_mrdp")
  CaMrdp caMrdp;

  /** The form that corrects this form, if any. */
  @SerializedName("corrected_by")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Form> correctedBy;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  @SerializedName("eu_dac7")
  EuDac7 euDac7;

  /**
   * A list of tax filing statuses. Note that a filing status will only be included if the form has
   * been filed directly with the jurisdiction’s tax authority.
   */
  @SerializedName("filing_statuses")
  List<Form.FilingStatus> filingStatuses;

  @SerializedName("gb_mrdp")
  GbMrdp gbMrdp;

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

  @SerializedName("nz_mrdp")
  NzMrdp nzMrdp;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.form}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("payee")
  Payee payee;

  /**
   * Whether the tax form is a mutable draft or a finalized form.
   *
   * <p>One of {@code draft}, or {@code finalized}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the tax form. An additional hash is included on the tax form with a name matching
   * this value. It contains additional information specific to the tax form type.
   *
   * <p>One of {@code au_serr}, {@code ca_mrdp}, {@code eu_dac7}, {@code gb_mrdp}, {@code nz_mrdp},
   * {@code us_1099_k}, {@code us_1099_misc}, or {@code us_1099_nec}.
   */
  @SerializedName("type")
  String type;

  @SerializedName("us_1099_k")
  Us1099K us1099K;

  @SerializedName("us_1099_misc")
  Us1099Misc us1099Misc;

  @SerializedName("us_1099_nec")
  Us1099Nec us1099Nec;

  /** Get ID of expandable {@code correctedBy} object. */
  public String getCorrectedBy() {
    return (this.correctedBy != null) ? this.correctedBy.getId() : null;
  }

  public void setCorrectedBy(String id) {
    this.correctedBy = ApiResource.setExpandableFieldId(id, this.correctedBy);
  }

  /** Get expanded {@code correctedBy}. */
  public Form getCorrectedByObject() {
    return (this.correctedBy != null) ? this.correctedBy.getExpanded() : null;
  }

  public void setCorrectedByObject(Form expandableObject) {
    this.correctedBy = new ExpandableField<Form>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of tax forms which were previously created. The tax forms are returned in sorted
   * order, with the oldest tax forms appearing first.
   */
  public static FormCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of tax forms which were previously created. The tax forms are returned in sorted
   * order, with the oldest tax forms appearing first.
   */
  public static FormCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/forms";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FormCollection.class);
  }

  /**
   * Returns a list of tax forms which were previously created. The tax forms are returned in sorted
   * order, with the oldest tax forms appearing first.
   */
  public static FormCollection list(FormListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of tax forms which were previously created. The tax forms are returned in sorted
   * order, with the oldest tax forms appearing first.
   */
  public static FormCollection list(FormListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/forms";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FormCollection.class);
  }

  /** Download the PDF for a tax form. */
  public InputStream pdf() throws StripeException {
    return pdf((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Download the PDF for a tax form. */
  public InputStream pdf(Map<String, Object> params) throws StripeException {
    return pdf(params, (RequestOptions) null);
  }

  /** Download the PDF for a tax form. */
  public InputStream pdf(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/forms/%s/pdf", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.FILES, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().requestStream(request);
  }

  /** Download the PDF for a tax form. */
  public InputStream pdf(FormPdfParams params) throws StripeException {
    return pdf(params, (RequestOptions) null);
  }

  /** Download the PDF for a tax form. */
  public InputStream pdf(FormPdfParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax/forms/%s/pdf", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().requestStream(request);
  }

  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public static Form retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public static Form retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public static Form retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Form.class);
  }

  /**
   * Retrieves the details of a tax form that has previously been created. Supply the unique tax
   * form ID that was returned from your previous request, and Stripe will return the corresponding
   * tax form information.
   */
  public static Form retrieve(String id, FormRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/forms/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Form.class);
  }

  /**
   * For more details about AuSerr, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuSerr extends StripeObject {
    /** End date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_end_date")
    String reportingPeriodEndDate;

    /** Start date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_start_date")
    String reportingPeriodStartDate;
  }

  /**
   * For more details about CaMrdp, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CaMrdp extends StripeObject {
    /** End date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_end_date")
    String reportingPeriodEndDate;

    /** Start date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_start_date")
    String reportingPeriodStartDate;
  }

  /**
   * For more details about EuDac7, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EuDac7 extends StripeObject {
    /** End date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_end_date")
    String reportingPeriodEndDate;

    /** Start date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_start_date")
    String reportingPeriodStartDate;
  }

  /**
   * For more details about FilingStatus, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FilingStatus extends StripeObject {
    /** Time when the filing status was updated. */
    @SerializedName("effective_at")
    Long effectiveAt;

    @SerializedName("jurisdiction")
    Jurisdiction jurisdiction;

    /**
     * The current status of the filed form.
     *
     * <p>One of {@code accepted}, {@code filed}, or {@code rejected}.
     */
    @SerializedName("value")
    String value;

    /**
     * For more details about Jurisdiction, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Jurisdiction extends StripeObject {
      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Indicates the level of the jurisdiction where the form was filed.
       *
       * <p>One of {@code country}, or {@code state}.
       */
      @SerializedName("level")
      String level;

      /**
       * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 U.S. state code</a>,
       * without country prefix, if any. For example, &quot;NY&quot; for New York, United States.
       * Null for non-U.S. forms.
       */
      @SerializedName("state")
      String state;
    }
  }

  /**
   * For more details about GbMrdp, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GbMrdp extends StripeObject {
    /** End date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_end_date")
    String reportingPeriodEndDate;

    /** Start date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_start_date")
    String reportingPeriodStartDate;
  }

  /**
   * For more details about NzMrdp, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NzMrdp extends StripeObject {
    /** End date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_end_date")
    String reportingPeriodEndDate;

    /** Start date of the period represented by the information reported on the tax form. */
    @SerializedName("reporting_period_start_date")
    String reportingPeriodStartDate;
  }

  /**
   * For more details about Payee, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payee extends StripeObject {
    /** The ID of the payee's Stripe account. */
    @SerializedName("account")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> account;

    /** The external reference to this payee. */
    @SerializedName("external_reference")
    String externalReference;

    /**
     * Specifies the payee type.
     *
     * <p>One of {@code account}, or {@code external_reference}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code account} object. */
    public String getAccount() {
      return (this.account != null) ? this.account.getId() : null;
    }

    public void setAccount(String id) {
      this.account = ApiResource.setExpandableFieldId(id, this.account);
    }

    /** Get expanded {@code account}. */
    public Account getAccountObject() {
      return (this.account != null) ? this.account.getExpanded() : null;
    }

    public void setAccountObject(Account expandableObject) {
      this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Us1099K, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099K extends StripeObject {
    @SerializedName("card_not_present_transactions")
    CardNotPresentTransactions cardNotPresentTransactions;

    @SerializedName("cash_tips")
    CashTips cashTips;

    /** The currency of the amounts on the form. Always {@code usd}. */
    @SerializedName("currency")
    String currency;

    @SerializedName("federal_income_tax_withheld")
    FederalIncomeTaxWithheld federalIncomeTaxWithheld;

    /** The gross amount of payment transactions, as a decimal string in USD. */
    @SerializedName("gross_amount_of_transactions_decimal")
    String grossAmountOfTransactionsDecimal;

    /** The gross amounts for each month, ordered from January through December. */
    @SerializedName("monthly_volumes")
    List<Form.Us1099K.MonthlyVolume> monthlyVolumes;

    @SerializedName("payment_transactions_count")
    PaymentTransactionsCount paymentTransactionsCount;

    /** Year represented by the information reported on the tax form. */
    @SerializedName("reporting_year")
    Long reportingYear;

    @SerializedName("state_income_tax_withheld")
    StateIncomeTaxWithheld stateIncomeTaxWithheld;

    /**
     * For more details about CardNotPresentTransactions, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardNotPresentTransactions extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about CashTips, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CashTips extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about FederalIncomeTaxWithheld, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FederalIncomeTaxWithheld extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about MonthlyVolume, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MonthlyVolume extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about PaymentTransactionsCount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentTransactionsCount extends StripeObject {
      /** The effective number of transactions. */
      @SerializedName("count")
      Long count;

      /** The signed adjustment included in the effective count. Only present for drafts. */
      @SerializedName("delta")
      Long delta;
    }

    /**
     * For more details about StateIncomeTaxWithheld, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StateIncomeTaxWithheld extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }
  }

  /**
   * For more details about Us1099Misc, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099Misc extends StripeObject {
    @SerializedName("cash_tips")
    CashTips cashTips;

    @SerializedName("crop_insurance_proceeds")
    CropInsuranceProceeds cropInsuranceProceeds;

    /** The currency of the amounts on the form. Always {@code usd}. */
    @SerializedName("currency")
    String currency;

    /** Whether direct sales of at least $5,000 of consumer products were made for resale. */
    @SerializedName("direct_sales_for_resale")
    Boolean directSalesForResale;

    @SerializedName("excess_golden_parachute_payments")
    ExcessGoldenParachutePayments excessGoldenParachutePayments;

    /** Whether the FATCA filing requirement applies. */
    @SerializedName("fatca_filing_required")
    Boolean fatcaFilingRequired;

    @SerializedName("federal_income_tax_withheld")
    FederalIncomeTaxWithheld federalIncomeTaxWithheld;

    @SerializedName("fish_purchased_for_resale")
    FishPurchasedForResale fishPurchasedForResale;

    @SerializedName("fishing_boat_proceeds")
    FishingBoatProceeds fishingBoatProceeds;

    @SerializedName("gross_proceeds_paid_to_an_attorney")
    GrossProceedsPaidToAnAttorney grossProceedsPaidToAnAttorney;

    @SerializedName("medical_and_health_care_payments")
    MedicalAndHealthCarePayments medicalAndHealthCarePayments;

    @SerializedName("nonqualified_deferred_compensation")
    NonqualifiedDeferredCompensation nonqualifiedDeferredCompensation;

    @SerializedName("other_income")
    OtherIncome otherIncome;

    @SerializedName("overtime_compensation")
    OvertimeCompensation overtimeCompensation;

    @SerializedName("rents")
    Rents rents;

    /** Year represented by the information reported on the tax form. */
    @SerializedName("reporting_year")
    Long reportingYear;

    @SerializedName("royalties")
    Royalties royalties;

    @SerializedName("section_409a_deferrals")
    Section409aDeferrals section409aDeferrals;

    @SerializedName("state_income")
    StateIncome stateIncome;

    @SerializedName("state_tax_withheld")
    StateTaxWithheld stateTaxWithheld;

    @SerializedName("substitute_payments")
    SubstitutePayments substitutePayments;

    /**
     * For more details about CashTips, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CashTips extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about CropInsuranceProceeds, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CropInsuranceProceeds extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about ExcessGoldenParachutePayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExcessGoldenParachutePayments extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about FederalIncomeTaxWithheld, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FederalIncomeTaxWithheld extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about FishPurchasedForResale, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FishPurchasedForResale extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about FishingBoatProceeds, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FishingBoatProceeds extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about GrossProceedsPaidToAnAttorney, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GrossProceedsPaidToAnAttorney extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about MedicalAndHealthCarePayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MedicalAndHealthCarePayments extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about NonqualifiedDeferredCompensation, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NonqualifiedDeferredCompensation extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about OtherIncome, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OtherIncome extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about OvertimeCompensation, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OvertimeCompensation extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about Rents, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rents extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about Royalties, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Royalties extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about Section409aDeferrals, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Section409aDeferrals extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about StateIncome, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StateIncome extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about StateTaxWithheld, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StateTaxWithheld extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about SubstitutePayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubstitutePayments extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }
  }

  /**
   * For more details about Us1099Nec, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099Nec extends StripeObject {
    @SerializedName("cash_tips")
    CashTips cashTips;

    /** The currency of the amounts on the form. Always {@code usd}. */
    @SerializedName("currency")
    String currency;

    /** Whether direct sales of at least $5,000 of consumer products were made for resale. */
    @SerializedName("direct_sales_indicator")
    Boolean directSalesIndicator;

    /** Whether the FATCA filing requirement applies. */
    @SerializedName("fatca_filing_requirement")
    Boolean fatcaFilingRequirement;

    @SerializedName("federal_income_tax_withheld")
    FederalIncomeTaxWithheld federalIncomeTaxWithheld;

    @SerializedName("nonemployee_compensation")
    NonemployeeCompensation nonemployeeCompensation;

    @SerializedName("overtime_compensation")
    OvertimeCompensation overtimeCompensation;

    /** Year represented by the information reported on the tax form. */
    @SerializedName("reporting_year")
    Long reportingYear;

    @SerializedName("state_income")
    StateIncome stateIncome;

    @SerializedName("state_tax_withheld")
    StateTaxWithheld stateTaxWithheld;

    /**
     * For more details about CashTips, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CashTips extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about FederalIncomeTaxWithheld, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FederalIncomeTaxWithheld extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about NonemployeeCompensation, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NonemployeeCompensation extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about OvertimeCompensation, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OvertimeCompensation extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about StateIncome, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StateIncome extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }

    /**
     * For more details about StateTaxWithheld, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StateTaxWithheld extends StripeObject {
      /**
       * The signed adjustment included in the effective amount, as a decimal string. Only present
       * for drafts.
       */
      @SerializedName("delta_decimal")
      String deltaDecimal;

      /** The effective amount in the form's currency, as a decimal string. */
      @SerializedName("volume_decimal")
      String volumeDecimal;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(auSerr, responseGetter);
    trySetResponseGetter(caMrdp, responseGetter);
    trySetResponseGetter(correctedBy, responseGetter);
    trySetResponseGetter(euDac7, responseGetter);
    trySetResponseGetter(gbMrdp, responseGetter);
    trySetResponseGetter(nzMrdp, responseGetter);
    trySetResponseGetter(payee, responseGetter);
    trySetResponseGetter(us1099K, responseGetter);
    trySetResponseGetter(us1099Misc, responseGetter);
    trySetResponseGetter(us1099Nec, responseGetter);
  }
}
