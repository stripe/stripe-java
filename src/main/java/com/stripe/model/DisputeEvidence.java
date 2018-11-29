package com.stripe.model;

import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DisputeEvidence extends ApiResource {
  /**
   * Any server or activity logs showing proof that the customer accessed or downloaded the
   * purchased digital product. This information should include IP addresses, corresponding
   * timestamps, and any detailed recorded activity.
   */
  String accessActivityLog;

  /** The billing address provided by the customer. */
  String billingAddress;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription
   * cancellation policy, as shown to the customer.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> cancellationPolicy;

  /** An explanation of how and when the customer was shown your refund policy prior to purchase. */
  String cancellationPolicyDisclosure;

  /** A justification for why the customer's subscription was not canceled. */
  String cancellationRebuttal;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communication with the
   * customer that you feel is relevant to your case. Examples include emails proving that the
   * customer received the product or service, or demonstrating their use of or satisfaction with
   * the product or service.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> customerCommunication;

  /** The email address of the customer. */
  String customerEmailAddress;

  /** The name of the customer. */
  String customerName;

  /** The IP address that the customer used when making the purchase. */
  String customerPurchaseIp;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or
   * contract showing the customer's signature.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> customerSignature;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior
   * charge that can uniquely identify the charge, such as a receipt, shipping label, work order,
   * etc. This document should be paired with a similar document from the disputed payment that
   * proves the two payments are separate.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> duplicateChargeDocumentation;

  /**
   * An explanation of the difference between the disputed charge versus the prior charge that
   * appears to be a duplicate.
   */
  String duplicateChargeExplanation;

  /** The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge. */
  String duplicateChargeId;

  /** A description of the product or service that was sold. */
  String productDescription;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent
   * to the customer notifying them of the charge.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> receipt;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as
   * shown to the customer.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> refundPolicy;

  /**
   * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
   */
  String refundPolicyDisclosure;

  /** A justification for why the customer is not entitled to a refund. */
  String refundRefusalExplanation;

  /**
   * The date on which the customer received or began receiving the purchased service, in a clear
   * human-readable format.
   */
  String serviceDate;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof
   * that a service was provided to the customer. This could include a copy of a signed contract,
   * work order, or other form of written agreement.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> serviceDocumentation;

  /**
   * The address to which a physical product was shipped. You should try to include as complete
   * address information as possible.
   */
  String shippingAddress;

  /**
   * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If
   * multiple carriers were used for this purchase, please separate them with commas.
   */
  String shippingCarrier;

  /**
   * The date on which a physical product began its route to the shipping address, in a clear
   * human-readable format.
   */
  String shippingDate;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof
   * that a product was shipped to the customer at the same address the customer provided to you.
   * This could include a copy of the shipment receipt, shipping label, etc. It should show the
   * customer's full shipping address, if possible.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> shippingDocumentation;

  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple
   * tracking numbers were generated for this purchase, please separate them with commas.
   */
  String shippingTrackingNumber;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or
   * statements.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> uncategorizedFile;

  /** Any additional evidence or statements. */
  String uncategorizedText;

  /** Get id of expandable `cancellationPolicy` object. */
  public String getCancellationPolicy() {
    return (this.cancellationPolicy != null) ? this.cancellationPolicy.getId() : null;
  }

  public void setCancellationPolicy(String id) {
    this.cancellationPolicy = ApiResource.setExpandableFieldId(id, this.cancellationPolicy);
  }

  /** Get expanded `cancellationPolicy`. */
  public File getCancellationPolicyObject() {
    return (this.cancellationPolicy != null) ? this.cancellationPolicy.getExpanded() : null;
  }

  public void setCancellationPolicyObject(File expandableObject) {
    this.cancellationPolicy = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customerCommunication` object. */
  public String getCustomerCommunication() {
    return (this.customerCommunication != null) ? this.customerCommunication.getId() : null;
  }

  public void setCustomerCommunication(String id) {
    this.customerCommunication = ApiResource.setExpandableFieldId(id, this.customerCommunication);
  }

  /** Get expanded `customerCommunication`. */
  public File getCustomerCommunicationObject() {
    return (this.customerCommunication != null) ? this.customerCommunication.getExpanded() : null;
  }

  public void setCustomerCommunicationObject(File expandableObject) {
    this.customerCommunication =
        new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customerSignature` object. */
  public String getCustomerSignature() {
    return (this.customerSignature != null) ? this.customerSignature.getId() : null;
  }

  public void setCustomerSignature(String id) {
    this.customerSignature = ApiResource.setExpandableFieldId(id, this.customerSignature);
  }

  /** Get expanded `customerSignature`. */
  public File getCustomerSignatureObject() {
    return (this.customerSignature != null) ? this.customerSignature.getExpanded() : null;
  }

  public void setCustomerSignatureObject(File expandableObject) {
    this.customerSignature = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `duplicateChargeDocumentation` object. */
  public String getDuplicateChargeDocumentation() {
    return (this.duplicateChargeDocumentation != null)
        ? this.duplicateChargeDocumentation.getId()
        : null;
  }

  public void setDuplicateChargeDocumentation(String id) {
    this.duplicateChargeDocumentation =
        ApiResource.setExpandableFieldId(id, this.duplicateChargeDocumentation);
  }

  /** Get expanded `duplicateChargeDocumentation`. */
  public File getDuplicateChargeDocumentationObject() {
    return (this.duplicateChargeDocumentation != null)
        ? this.duplicateChargeDocumentation.getExpanded()
        : null;
  }

  public void setDuplicateChargeDocumentationObject(File expandableObject) {
    this.duplicateChargeDocumentation =
        new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `receipt` object. */
  public String getReceipt() {
    return (this.receipt != null) ? this.receipt.getId() : null;
  }

  public void setReceipt(String id) {
    this.receipt = ApiResource.setExpandableFieldId(id, this.receipt);
  }

  /** Get expanded `receipt`. */
  public File getReceiptObject() {
    return (this.receipt != null) ? this.receipt.getExpanded() : null;
  }

  public void setReceiptObject(File expandableObject) {
    this.receipt = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `refundPolicy` object. */
  public String getRefundPolicy() {
    return (this.refundPolicy != null) ? this.refundPolicy.getId() : null;
  }

  public void setRefundPolicy(String id) {
    this.refundPolicy = ApiResource.setExpandableFieldId(id, this.refundPolicy);
  }

  /** Get expanded `refundPolicy`. */
  public File getRefundPolicyObject() {
    return (this.refundPolicy != null) ? this.refundPolicy.getExpanded() : null;
  }

  public void setRefundPolicyObject(File expandableObject) {
    this.refundPolicy = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `serviceDocumentation` object. */
  public String getServiceDocumentation() {
    return (this.serviceDocumentation != null) ? this.serviceDocumentation.getId() : null;
  }

  public void setServiceDocumentation(String id) {
    this.serviceDocumentation = ApiResource.setExpandableFieldId(id, this.serviceDocumentation);
  }

  /** Get expanded `serviceDocumentation`. */
  public File getServiceDocumentationObject() {
    return (this.serviceDocumentation != null) ? this.serviceDocumentation.getExpanded() : null;
  }

  public void setServiceDocumentationObject(File expandableObject) {
    this.serviceDocumentation =
        new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `shippingDocumentation` object. */
  public String getShippingDocumentation() {
    return (this.shippingDocumentation != null) ? this.shippingDocumentation.getId() : null;
  }

  public void setShippingDocumentation(String id) {
    this.shippingDocumentation = ApiResource.setExpandableFieldId(id, this.shippingDocumentation);
  }

  /** Get expanded `shippingDocumentation`. */
  public File getShippingDocumentationObject() {
    return (this.shippingDocumentation != null) ? this.shippingDocumentation.getExpanded() : null;
  }

  public void setShippingDocumentationObject(File expandableObject) {
    this.shippingDocumentation =
        new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

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
