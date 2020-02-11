package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

  /**
   * Type of the tax ID, one of {@code eu_vat}, {@code nz_gst}, {@code au_abn}, {@code in_gst},
   * {@code no_vat}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen}, {@code ru_inn},
   * {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code tw_vat}, {@code th_vat}, {@code jp_cn},
   * {@code li_uid}, {@code my_itn}, {@code us_ein}, {@code kr_brn}, or {@code ca_qst}. Note that
   * some legacy tax IDs have type {@code unknown}
   */
  @SerializedName("type")
  String type;

  /** Value of the tax ID. */
  @SerializedName("value")
  String value;

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

  /** Deletes an existing <code>TaxID</code> object. */
  public TaxId delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes an existing <code>TaxID</code> object. */
  public TaxId delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes an existing <code>TaxID</code> object. */
  public TaxId delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes an existing <code>TaxID</code> object. */
  public TaxId delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/tax_ids/%s",
                ApiResource.urlEncodeId(this.getCustomer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.DELETE, url, params, TaxId.class, options);
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
}
