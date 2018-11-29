package com.stripe.model;

import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LegalEntityVerification extends ApiResource {
  /**
   * A user-displayable string describing the verification state for this legal entity. For example,
   * if a document is uploaded and the picture is too fuzzy, this may say "Identity document is too
   * unclear to read".
   */
  String details;

  /**
   * A machine-readable code specifying the verification state for this legal entity. One of
   * `scan_corrupt`, `scan_not_readable`, `scan_failed_greyscale`, `scan_not_uploaded`,
   * `scan_id_type_not_supported`, `scan_id_country_not_supported`, `scan_failed_other`, or
   * `scan_failed_test_mode`.
   */
  String detailsCode;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A photo (jpg or png) of the
   * front of an identifying document, either a passport or local ID card.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> document;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A photo (jpg or png) of the
   * back of an identifying document, either a passport or local ID card.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> documentBack;

  /**
   * The state of verification for this legal entity. Possible values are `unverified`, `pending`,
   * or `verified`.
   */
  String status;

  /** Get id of expandable `document` object. */
  public String getDocument() {
    return (this.document != null) ? this.document.getId() : null;
  }

  public void setDocument(String id) {
    this.document = ApiResource.setExpandableFieldId(id, this.document);
  }

  /** Get expanded `document`. */
  public File getDocumentObject() {
    return (this.document != null) ? this.document.getExpanded() : null;
  }

  public void setDocumentObject(File expandableObject) {
    this.document = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `documentBack` object. */
  public String getDocumentBack() {
    return (this.documentBack != null) ? this.documentBack.getId() : null;
  }

  public void setDocumentBack(String id) {
    this.documentBack = ApiResource.setExpandableFieldId(id, this.documentBack);
  }

  /** Get expanded `documentBack`. */
  public File getDocumentBackObject() {
    return (this.documentBack != null) ? this.documentBack.getExpanded() : null;
  }

  public void setDocumentBackObject(File expandableObject) {
    this.documentBack = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }
}
