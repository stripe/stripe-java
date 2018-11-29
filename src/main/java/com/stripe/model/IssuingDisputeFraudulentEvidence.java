package com.stripe.model;

import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingDisputeFraudulentEvidence extends ApiResource {
  /** Brief freeform text explaining why you are disputing this transaction. */
  String disputeExplanation;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file evidence
   * supporting your dispute.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> uncategorizedFile;

  /** Get id of expandable `uncategorizedFile` object. */
  public String getUncategorizedFile() {
    return (this.uncategorizedFile != null) ? this.uncategorizedFile.getId() : null;
  }

  public void setUncategorizedFile(String id) {
    this.uncategorizedFile = ApiResource.setExpandableFieldId(id, this.uncategorizedFile);
  }

  /** Get expanded `uncategorizedFile`. */
  public File getUncategorizedFileObject() {
    return (this.uncategorizedFile != null) ? this.uncategorizedFile.getExpanded() : null;
  }

  public void setUncategorizedFileObject(File expandableObject) {
    this.uncategorizedFile = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }
}
