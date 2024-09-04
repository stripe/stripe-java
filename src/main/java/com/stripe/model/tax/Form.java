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
  /** The form that corrects this form, if any. */
  @SerializedName("corrected_by")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Form> correctedBy;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * A list of tax filing statuses. Note that a filing status will only be included if the form has
   * been filed directly with the jurisdiction’s tax authority.
   */
  @SerializedName("filing_statuses")
  List<Form.FilingStatus> filingStatuses;

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
   * <p>Equal to {@code tax.form}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("payee")
  Payee payee;

  /**
   * The type of the tax form. An additional hash is included on the tax form with a name matching
   * this value. It contains additional information specific to the tax form type.
   *
   * <p>One of {@code us_1099_k}, {@code us_1099_misc}, or {@code us_1099_nec}.
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Jurisdiction extends StripeObject {
      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>). Always {@code US}.
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
       */
      @SerializedName("state")
      String state;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payee extends StripeObject {
    /** The ID of the payee's Stripe account. */
    @SerializedName("account")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> account;

    /**
     * Always {@code account}.
     *
     * <p>Equal to {@code account}.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099K extends StripeObject {
    /** Year represented by the information reported on the tax form. */
    @SerializedName("reporting_year")
    Long reportingYear;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099Misc extends StripeObject {
    /** Year represented by the information reported on the tax form. */
    @SerializedName("reporting_year")
    Long reportingYear;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099Nec extends StripeObject {
    /** Year represented by the information reported on the tax form. */
    @SerializedName("reporting_year")
    Long reportingYear;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(correctedBy, responseGetter);
    trySetResponseGetter(payee, responseGetter);
    trySetResponseGetter(us1099K, responseGetter);
    trySetResponseGetter(us1099Misc, responseGetter);
    trySetResponseGetter(us1099Nec, responseGetter);
  }
}
