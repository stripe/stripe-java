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
import com.stripe.param.TaxIdCreateParams;
import com.stripe.param.TaxIdListParams;
import com.stripe.param.TaxIdRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can add one or multiple tax IDs to a <a
 * href="https://stripe.com/docs/api/customers">customer</a> or account. Customer and account tax
 * IDs get displayed on related invoices and credit notes.
 *
 * <p>Related guides: <a href="https://stripe.com/docs/billing/taxes/tax-ids">Customer tax
 * identification numbers</a>, <a
 * href="https://stripe.com/docs/invoicing/connect#account-tax-ids">Account tax IDs</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxId extends ApiResource implements HasId {
  /** Two-letter ISO code representing the country of the tax ID. */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** ID of the customer. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

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
   * <p>Equal to {@code tax_id}.
   */
  @SerializedName("object")
  String object;

  /** The account or customer the tax ID belongs to. */
  @SerializedName("owner")
  Owner owner;

  /**
   * Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn}, {@code ar_cuit}, {@code au_abn},
   * {@code au_arn}, {@code bg_uic}, {@code bh_vat}, {@code bo_tin}, {@code br_cnpj}, {@code
   * br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code
   * ca_pst_sk}, {@code ca_qst}, {@code ch_uid}, {@code ch_vat}, {@code cl_tin}, {@code cn_tin},
   * {@code co_nit}, {@code cr_tin}, {@code de_stn}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin},
   * {@code es_cif}, {@code eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code
   * hk_br}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code
   * jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code kz_bin}, {@code
   * li_uid}, {@code mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code
   * no_vat}, {@code no_voec}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code ph_tin},
   * {@code ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst},
   * {@code sg_uen}, {@code si_tin}, {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code tw_vat},
   * {@code ua_vat}, {@code us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code
   * za_vat}. Note that some legacy tax IDs have type {@code unknown}
   */
  @SerializedName("type")
  String type;

  /** Value of the tax ID. */
  @SerializedName("value")
  String value;

  /** Tax ID verification information. */
  @SerializedName("verification")
  Verification verification;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Creates a new account or customer {@code tax_id} object. */
  public static TaxId create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new account or customer {@code tax_id} object. */
  public static TaxId create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_ids";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, TaxId.class);
  }

  /** Creates a new account or customer {@code tax_id} object. */
  public static TaxId create(TaxIdCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new account or customer {@code tax_id} object. */
  public static TaxId create(TaxIdCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_ids";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxId.class);
  }

  /** Deletes an existing account or customer {@code tax_id} object. */
  public TaxId delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes an existing account or customer {@code tax_id} object. */
  public TaxId delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes an existing account or customer {@code tax_id} object. */
  public TaxId delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes an existing account or customer {@code tax_id} object. */
  public TaxId delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax_ids/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Deletes an existing {@code tax_id} object. */
  public static TaxId delete(String customer, String id) throws StripeException {
    return delete(customer, id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes an existing {@code tax_id} object. */
  public static TaxId delete(String customer, String id, RequestOptions options)
      throws StripeException {
    return delete(customer, id, (Map<String, Object>) null, options);
  }

  /** Deletes an existing {@code tax_id} object. */
  public static TaxId delete(String customer, String id, Map<String, Object> params)
      throws StripeException {
    return delete(customer, id, params, (RequestOptions) null);
  }

  /** Deletes an existing {@code tax_id} object. */
  public static TaxId delete(
      String customer, String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_ids/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getGlobalResponseGetter().request(request, TaxId.class);
  }

  /** Returns a list of tax IDs. */
  public static TaxIdCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs. */
  public static TaxIdCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_ids";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TaxIdCollection.class);
  }

  /** Returns a list of tax IDs. */
  public static TaxIdCollection list(TaxIdListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs. */
  public static TaxIdCollection list(TaxIdListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_ids";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxIdCollection.class);
  }

  /** Retrieves an account or customer {@code tax_id} object. */
  public static TaxId retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an account or customer {@code tax_id} object. */
  public static TaxId retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves an account or customer {@code tax_id} object. */
  public static TaxId retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_ids/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TaxId.class);
  }

  /** Retrieves an account or customer {@code tax_id} object. */
  public static TaxId retrieve(String id, TaxIdRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_ids/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TaxId.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Owner extends StripeObject {
    /** The account being referenced when {@code type} is {@code account}. */
    @SerializedName("account")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> account;

    /** The Connect Application being referenced when {@code type} is {@code application}. */
    @SerializedName("application")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Application> application;

    /** The customer being referenced when {@code type} is {@code customer}. */
    @SerializedName("customer")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Customer> customer;

    /**
     * Type of owner referenced.
     *
     * <p>One of {@code account}, {@code application}, {@code customer}, or {@code self}.
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

    /** Get ID of expandable {@code application} object. */
    public String getApplication() {
      return (this.application != null) ? this.application.getId() : null;
    }

    public void setApplication(String id) {
      this.application = ApiResource.setExpandableFieldId(id, this.application);
    }

    /** Get expanded {@code application}. */
    public Application getApplicationObject() {
      return (this.application != null) ? this.application.getExpanded() : null;
    }

    public void setApplicationObject(Application expandableObject) {
      this.application =
          new ExpandableField<Application>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code customer} object. */
    public String getCustomer() {
      return (this.customer != null) ? this.customer.getId() : null;
    }

    public void setCustomer(String id) {
      this.customer = ApiResource.setExpandableFieldId(id, this.customer);
    }

    /** Get expanded {@code customer}. */
    public Customer getCustomerObject() {
      return (this.customer != null) ? this.customer.getExpanded() : null;
    }

    public void setCustomerObject(Customer expandableObject) {
      this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    /**
     * Verification status, one of {@code pending}, {@code verified}, {@code unverified}, or {@code
     * unavailable}.
     */
    @SerializedName("status")
    String status;

    /** Verified address. */
    @SerializedName("verified_address")
    String verifiedAddress;

    /** Verified name. */
    @SerializedName("verified_name")
    String verifiedName;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(owner, responseGetter);
    trySetResponseGetter(verification, responseGetter);
  }
}
