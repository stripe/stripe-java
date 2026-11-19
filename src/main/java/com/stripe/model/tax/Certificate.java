// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerTaxExemption;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CertificateCreateParams;
import com.stripe.param.tax.CertificateListParams;
import com.stripe.param.tax.CertificateRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax Certificate associates an uploaded exemption or resale certificate file with a customer's
 * tax exemption. A tax exemption can have multiple certificates. Deleting a tax exemption also
 * deletes its certificates, but retains their uploaded files.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Certificate extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * If {@code true}, the certificate has been deleted. If {@code false}, it hasn't been deleted.
   */
  @SerializedName("deleted")
  Boolean deleted;

  /** The ID of the uploaded certificate <a href="https://stripe.com/api/files/object">file</a>. */
  @SerializedName("file")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> file;

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
   * <p>Equal to {@code tax.certificate}.
   */
  @SerializedName("object")
  String object;

  /**
   * The ID of the <a href="https://stripe.com/api/tax/exemptions/object">customer tax exemption</a>
   * associated with this certificate.
   */
  @SerializedName("tax_exemption")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<CustomerTaxExemption> taxExemption;

  /** Get ID of expandable {@code file} object. */
  public String getFile() {
    return (this.file != null) ? this.file.getId() : null;
  }

  public void setFile(String id) {
    this.file = ApiResource.setExpandableFieldId(id, this.file);
  }

  /** Get expanded {@code file}. */
  public File getFileObject() {
    return (this.file != null) ? this.file.getExpanded() : null;
  }

  public void setFileObject(File expandableObject) {
    this.file = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code taxExemption} object. */
  public String getTaxExemption() {
    return (this.taxExemption != null) ? this.taxExemption.getId() : null;
  }

  public void setTaxExemption(String id) {
    this.taxExemption = ApiResource.setExpandableFieldId(id, this.taxExemption);
  }

  /** Get expanded {@code taxExemption}. */
  public CustomerTaxExemption getTaxExemptionObject() {
    return (this.taxExemption != null) ? this.taxExemption.getExpanded() : null;
  }

  public void setTaxExemptionObject(CustomerTaxExemption expandableObject) {
    this.taxExemption =
        new ExpandableField<CustomerTaxExemption>(expandableObject.getId(), expandableObject);
  }

  /**
   * Creates a Tax Certificate associated with a tax exemption. Before creating the certificate, <a
   * href="https://stripe.com/api/files/create">upload a file</a> with purpose {@code
   * tax_certificate}.
   */
  public static Certificate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a Tax Certificate associated with a tax exemption. Before creating the certificate, <a
   * href="https://stripe.com/api/files/create">upload a file</a> with purpose {@code
   * tax_certificate}.
   */
  public static Certificate create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/certificates";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Certificate.class);
  }

  /**
   * Creates a Tax Certificate associated with a tax exemption. Before creating the certificate, <a
   * href="https://stripe.com/api/files/create">upload a file</a> with purpose {@code
   * tax_certificate}.
   */
  public static Certificate create(CertificateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a Tax Certificate associated with a tax exemption. Before creating the certificate, <a
   * href="https://stripe.com/api/files/create">upload a file</a> with purpose {@code
   * tax_certificate}.
   */
  public static Certificate create(CertificateCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/certificates";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Certificate.class);
  }

  /**
   * Deletes a Tax Certificate without deleting its uploaded file. You can reuse the file to create
   * another certificate, and you can still retrieve the deleted certificate.
   */
  public Certificate delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes a Tax Certificate without deleting its uploaded file. You can reuse the file to create
   * another certificate, and you can still retrieve the deleted certificate.
   */
  public Certificate delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes a Tax Certificate without deleting its uploaded file. You can reuse the file to create
   * another certificate, and you can still retrieve the deleted certificate.
   */
  public Certificate delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes a Tax Certificate without deleting its uploaded file. You can reuse the file to create
   * another certificate, and you can still retrieve the deleted certificate.
   */
  public Certificate delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/certificates/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Certificate.class);
  }

  /**
   * Lists a tax exemption’s certificates, ordered from newest to oldest. The list excludes deleted
   * certificates.
   */
  public static CertificateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Lists a tax exemption’s certificates, ordered from newest to oldest. The list excludes deleted
   * certificates.
   */
  public static CertificateCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/certificates";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CertificateCollection.class);
  }

  /**
   * Lists a tax exemption’s certificates, ordered from newest to oldest. The list excludes deleted
   * certificates.
   */
  public static CertificateCollection list(CertificateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Lists a tax exemption’s certificates, ordered from newest to oldest. The list excludes deleted
   * certificates.
   */
  public static CertificateCollection list(CertificateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/certificates";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CertificateCollection.class);
  }

  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public static Certificate retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public static Certificate retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public static Certificate retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/certificates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Certificate.class);
  }

  /**
   * Retrieves a Tax Certificate. Deleted certificates remain retrievable with all their fields and
   * {@code deleted} set to {@code true}.
   */
  public static Certificate retrieve(
      String id, CertificateRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax/certificates/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Certificate.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(file, responseGetter);
    trySetResponseGetter(taxExemption, responseGetter);
  }
}
