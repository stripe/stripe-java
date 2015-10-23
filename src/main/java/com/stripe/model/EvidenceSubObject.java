package com.stripe.model;

public final class EvidenceSubObject extends StripeObject {

	/**
	 * A description of the product or service which was sold.
	 */
	protected String productDescription;

	/**
	 * A description of the product or service which was sold.
	 */
	public String getProductDescription() {
		return this.productDescription;
	}

	/**
	 * A description of the product or service which was sold.
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * The name of the customer.
	 */
	protected String customerName;

	/**
	 * The name of the customer.
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	/**
	 * The name of the customer.
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * The email address of the customer.
	 */
	protected String customerEmailAddress;

	/**
	 * The email address of the customer.
	 */
	public String getCustomerEmailAddress() {
		return this.customerEmailAddress;
	}

	/**
	 * The email address of the customer.
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	/**
	 * The IP address that the customer used when making the purchase (this will be automatically expanded to include geographical data when possible).
	 */
	protected String customerPurchaseIp;

	/**
	 * The IP address that the customer used when making the purchase (this will be automatically expanded to include geographical data when possible).
	 */
	public String getCustomerPurchaseIp() {
		return this.customerPurchaseIp;
	}

	/**
	 * The IP address that the customer used when making the purchase (this will be automatically expanded to include geographical data when possible).
	 */
	public void setCustomerPurchaseIp(String customerPurchaseIp) {
		this.customerPurchaseIp = customerPurchaseIp;
	}

	/**
	 * The billing addess provided by the customer.
	 */
	protected String billingAddress;

	/**
	 * The billing addess provided by the customer.
	 */
	public String getBillingAddress() {
		return this.billingAddress;
	}

	/**
	 * The billing addess provided by the customer.
	 */
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent to the customer notifying them of the charge. This field will be automatically filled with a Stripe generated email receipt if any such receipt was sent.
	 */
	protected String receipt;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent to the customer notifying them of the charge. This field will be automatically filled with a Stripe generated email receipt if any such receipt was sent.
	 */
	public String getReceipt() {
		return this.receipt;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent to the customer notifying them of the charge. This field will be automatically filled with a Stripe generated email receipt if any such receipt was sent.
	 */
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	/**
	 * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
	 */
	protected String shippingAddress;

	/**
	 * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
	 */
	public String getShippingAddress() {
		return this.shippingAddress;
	}

	/**
	 * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
	 */
	protected String shippingDate;

	/**
	 * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
	 */
	public String getShippingDate() {
		return this.shippingDate;
	}

	/**
	 * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
	 */
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	/**
	 * The tracking number for a physical product, usually obtained from a delivery service such as Fedex, UPS, USPS, etc. If multiple tracking numbers were generated for this purchase, please separate them with commas. These tracking numbers will be expanded to include detailed delivery information from the carrier when possible.
	 */
	protected String shippingTrackingNumber;

	/**
	 * The tracking number for a physical product, usually obtained from a delivery service such as Fedex, UPS, USPS, etc. If multiple tracking numbers were generated for this purchase, please separate them with commas. These tracking numbers will be expanded to include detailed delivery information from the carrier when possible.
	 */
	public String getShippingTrackingNumber() {
		return this.shippingTrackingNumber;
	}

	/**
	 * The tracking number for a physical product, usually obtained from a delivery service such as Fedex, UPS, USPS, etc. If multiple tracking numbers were generated for this purchase, please separate them with commas. These tracking numbers will be expanded to include detailed delivery information from the carrier when possible.
	 */
	public void setShippingTrackingNumber(String shippingTrackingNumber) {
		this.shippingTrackingNumber = shippingTrackingNumber;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or contract showing the customer's signature.
	 */
	protected String customerSignature;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or contract showing the customer's signature.
	 */
	public String getCustomerSignature() {
		return this.customerSignature;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or contract showing the customer's signature.
	 */
	public void setCustomerSignature(String customerSignature) {
		this.customerSignature = customerSignature;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a product was shipped to the customer at the same address the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should show the full shipping address of the customer, if possible.
	 */
	protected String shippingDocumentation;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a product was shipped to the customer at the same address the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should show the full shipping address of the customer, if possible.
	 */
	public String getShippingDocumentation() {
		return this.shippingDocumentation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a product was shipped to the customer at the same address the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should show the full shipping address of the customer, if possible.
	 */
	public void setShippingDocumentation(String shippingDocumentation) {
		this.shippingDocumentation = shippingDocumentation;
	}

	/**
	 * Any server or activity logs showing proof that the customer accessed or downloaded the purchased digital product. This information should include IP addresses, corresponding timestamps, and any detailed recorded activity.
	 */
	protected String accessActivityLog;

	/**
	 * Any server or activity logs showing proof that the customer accessed or downloaded the purchased digital product. This information should include IP addresses, corresponding timestamps, and any detailed recorded activity.
	 */
	public String getAccessActivityLog() {
		return this.accessActivityLog;
	}

	/**
	 * Any server or activity logs showing proof that the customer accessed or downloaded the purchased digital product. This information should include IP addresses, corresponding timestamps, and any detailed recorded activity.
	 */
	public void setAccessActivityLog(String accessActivityLog) {
		this.accessActivityLog = accessActivityLog;
	}

	/**
	 * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
	 */
	protected String serviceDate;

	/**
	 * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
	 */
	public String getServiceDate() {
		return this.serviceDate;
	}

	/**
	 * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
	 */
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a service was provided to the customer. This could include a copy of a signed contract, work order, or other form of written agreement.
	 */
	protected String serviceDocumentation;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a service was provided to the customer. This could include a copy of a signed contract, work order, or other form of written agreement.
	 */
	public String getServiceDocumentation() {
		return this.serviceDocumentation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a service was provided to the customer. This could include a copy of a signed contract, work order, or other form of written agreement.
	 */
	public void setServiceDocumentation(String serviceDocumentation) {
		this.serviceDocumentation = serviceDocumentation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communications with the customer proving that they received the product or service that demonstrates their use of or satisfaction with the product or service.
	 */
	protected String customerCommunication;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communications with the customer proving that they received the product or service that demonstrates their use of or satisfaction with the product or service.
	 */
	public String getCustomerCommunication() {
		return this.customerCommunication;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communications with the customer proving that they received the product or service that demonstrates their use of or satisfaction with the product or service.
	 */
	public void setCustomerCommunication(String customerCommunication) {
		this.customerCommunication = customerCommunication;
	}

	/**
	 * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge (only for disputes of reason `duplicate`)
	 */
	protected String duplicateChargeId;

	/**
	 * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge (only for disputes of reason `duplicate`)
	 */
	public String getDuplicateChargeId() {
		return this.duplicateChargeId;
	}

	/**
	 * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge (only for disputes of reason `duplicate`)
	 */
	public void setDuplicateChargeId(String duplicateChargeId) {
		this.duplicateChargeId = duplicateChargeId;
	}

	/**
	 * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate (only for disputes of reason `duplicate`)
	 */
	protected String duplicateChargeExplanation;

	/**
	 * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate (only for disputes of reason `duplicate`)
	 */
	public String getDuplicateChargeExplanation() {
		return this.duplicateChargeExplanation;
	}

	/**
	 * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate (only for disputes of reason `duplicate`)
	 */
	public void setDuplicateChargeExplanation(String duplicateChargeExplanation) {
		this.duplicateChargeExplanation = duplicateChargeExplanation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior charge that can uniquely identify the charge, such as a receipt, shipping label, work order, etc. (only for disputes of reason `duplicate`). This document should be paired with a similar document from the disputed payment that proves the two payments are separate.
	 */
	protected String duplicateChargeDocumentation;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior charge that can uniquely identify the charge, such as a receipt, shipping label, work order, etc. (only for disputes of reason `duplicate`). This document should be paired with a similar document from the disputed payment that proves the two payments are separate.
	 */
	public String getDuplicateChargeDocumentation() {
		return this.duplicateChargeDocumentation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior charge that can uniquely identify the charge, such as a receipt, shipping label, work order, etc. (only for disputes of reason `duplicate`). This document should be paired with a similar document from the disputed payment that proves the two payments are separate.
	 */
	public void setDuplicateChargeDocumentation(String duplicateChargeDocumentation) {
		this.duplicateChargeDocumentation = duplicateChargeDocumentation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as shown to the customer.
	 */
	protected String refundPolicy;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as shown to the customer.
	 */
	public String getRefundPolicy() {
		return this.refundPolicy;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as shown to the customer.
	 */
	public void setRefundPolicy(String refundPolicy) {
		this.refundPolicy = refundPolicy;
	}

	/**
	 * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
	 */
	protected String refundPolicyDisclosure;

	/**
	 * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
	 */
	public String getRefundPolicyDisclosure() {
		return this.refundPolicyDisclosure;
	}

	/**
	 * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
	 */
	public void setRefundPolicyDisclosure(String refundPolicyDisclosure) {
		this.refundPolicyDisclosure = refundPolicyDisclosure;
	}

	/**
	 * Justification for why the customer is not entitled to a refund.
	 */
	protected String refundRefusalExplanation;

	/**
	 * Justification for why the customer is not entitled to a refund.
	 */
	public String getRefundRefusalExplanation() {
		return this.refundRefusalExplanation;
	}

	/**
	 * Justification for why the customer is not entitled to a refund.
	 */
	public void setRefundRefusalExplanation(String refundRefusalExplanation) {
		this.refundRefusalExplanation = refundRefusalExplanation;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription cancellation policy, as shown to the customer.
	 */
	protected String cancellationPolicy;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription cancellation policy, as shown to the customer.
	 */
	public String getCancellationPolicy() {
		return this.cancellationPolicy;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription cancellation policy, as shown to the customer.
	 */
	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}

	/**
	 * Documentation demonstrating that the customer was shown your cancellation policy prior to purchase.
	 */
	protected String cancellationPolicyDisclosure;

	/**
	 * Documentation demonstrating that the customer was shown your cancellation policy prior to purchase.
	 */
	public String getCancellationPolicyDisclosure() {
		return this.cancellationPolicyDisclosure;
	}

	/**
	 * Documentation demonstrating that the customer was shown your cancellation policy prior to purchase.
	 */
	public void setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
		this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
	}

	/**
	 * Justification for why the customer's subscription was not canceled.
	 */
	protected String cancellationRebuttal;

	/**
	 * Justification for why the customer's subscription was not canceled.
	 */
	public String getCancellationRebuttal() {
		return this.cancellationRebuttal;
	}

	/**
	 * Justification for why the customer's subscription was not canceled.
	 */
	public void setCancellationRebuttal(String cancellationRebuttal) {
		this.cancellationRebuttal = cancellationRebuttal;
	}

	/**
	 * Any additional evidence or statements.
	 */
	protected String uncategorizedText;

	/**
	 * Any additional evidence or statements.
	 */
	public String getUncategorizedText() {
		return this.uncategorizedText;
	}

	/**
	 * Any additional evidence or statements.
	 */
	public void setUncategorizedText(String uncategorizedText) {
		this.uncategorizedText = uncategorizedText;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or statements.
	 */
	protected String uncategorizedFile;

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or statements.
	 */
	public String getUncategorizedFile() {
		return this.uncategorizedFile;
	}

	/**
	 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or statements.
	 */
	public void setUncategorizedFile(String uncategorizedFile) {
		this.uncategorizedFile = uncategorizedFile;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		EvidenceSubObject that = (EvidenceSubObject) o;

		if (accessActivityLog != null ? !accessActivityLog.equals(that.accessActivityLog) : that.accessActivityLog != null) {
			return false;
		}
		if (billingAddress != null ? !billingAddress.equals(that.billingAddress) : that.billingAddress != null) {
			return false;
		}
		if (cancellationPolicy != null ? !cancellationPolicy.equals(that.cancellationPolicy) : that.cancellationPolicy != null) {
			return false;
		}
		if (cancellationPolicyDisclosure != null ? !cancellationPolicyDisclosure.equals(that.cancellationPolicyDisclosure) : that.cancellationPolicyDisclosure != null) {
			return false;
		}
		if (cancellationRebuttal != null ? !cancellationRebuttal.equals(that.cancellationRebuttal) : that.cancellationRebuttal != null) {
			return false;
		}
		if (customerCommunication != null ? !customerCommunication.equals(that.customerCommunication) : that.customerCommunication != null) {
			return false;
		}
		if (customerEmailAddress != null ? !customerEmailAddress.equals(that.customerEmailAddress) : that.customerEmailAddress != null) {
			return false;
		}
		if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) {
			return false;
		}
		if (customerPurchaseIp != null ? !customerPurchaseIp.equals(that.customerPurchaseIp) : that.customerPurchaseIp != null) {
			return false;
		}
		if (customerSignature != null ? !customerSignature.equals(that.customerSignature) : that.customerSignature != null) {
			return false;
		}
		if (duplicateChargeDocumentation != null ? !duplicateChargeDocumentation.equals(that.duplicateChargeDocumentation) : that.duplicateChargeDocumentation != null) {
			return false;
		}
		if (duplicateChargeExplanation != null ? !duplicateChargeExplanation.equals(that.duplicateChargeExplanation) : that.duplicateChargeExplanation != null) {
			return false;
		}
		if (duplicateChargeId != null ? !duplicateChargeId.equals(that.duplicateChargeId) : that.duplicateChargeId != null) {
			return false;
		}
		if (productDescription != null ? !productDescription.equals(that.productDescription) : that.productDescription != null) {
			return false;
		}
		if (receipt != null ? !receipt.equals(that.receipt) : that.receipt != null) {
			return false;
		}
		if (refundPolicy != null ? !refundPolicy.equals(that.refundPolicy) : that.refundPolicy != null) {
			return false;
		}
		if (refundPolicyDisclosure != null ? !refundPolicyDisclosure.equals(that.refundPolicyDisclosure) : that.refundPolicyDisclosure != null) {
			return false;
		}
		if (refundRefusalExplanation != null ? !refundRefusalExplanation.equals(that.refundRefusalExplanation) : that.refundRefusalExplanation != null) {
			return false;
		}
		if (serviceDate != null ? !serviceDate.equals(that.serviceDate) : that.serviceDate != null) {
			return false;
		}
		if (serviceDocumentation != null ? !serviceDocumentation.equals(that.serviceDocumentation) : that.serviceDocumentation != null) {
			return false;
		}
		if (shippingAddress != null ? !shippingAddress.equals(that.shippingAddress) : that.shippingAddress != null) {
			return false;
		}
		if (shippingDate != null ? !shippingDate.equals(that.shippingDate) : that.shippingDate != null) {
			return false;
		}
		if (shippingDocumentation != null ? !shippingDocumentation.equals(that.shippingDocumentation) : that.shippingDocumentation != null) {
			return false;
		}
		if (shippingTrackingNumber != null ? !shippingTrackingNumber.equals(that.shippingTrackingNumber) : that.shippingTrackingNumber != null) {
			return false;
		}
		if (uncategorizedFile != null ? !uncategorizedFile.equals(that.uncategorizedFile) : that.uncategorizedFile != null) {
			return false;
		}
		if (uncategorizedText != null ? !uncategorizedText.equals(that.uncategorizedText) : that.uncategorizedText != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = productDescription != null ? productDescription.hashCode() : 0;
		result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
		result = 31 * result + (customerEmailAddress != null ? customerEmailAddress.hashCode() : 0);
		result = 31 * result + (customerPurchaseIp != null ? customerPurchaseIp.hashCode() : 0);
		result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
		result = 31 * result + (receipt != null ? receipt.hashCode() : 0);
		result = 31 * result + (shippingAddress != null ? shippingAddress.hashCode() : 0);
		result = 31 * result + (shippingDate != null ? shippingDate.hashCode() : 0);
		result = 31 * result + (shippingTrackingNumber != null ? shippingTrackingNumber.hashCode() : 0);
		result = 31 * result + (customerSignature != null ? customerSignature.hashCode() : 0);
		result = 31 * result + (shippingDocumentation != null ? shippingDocumentation.hashCode() : 0);
		result = 31 * result + (accessActivityLog != null ? accessActivityLog.hashCode() : 0);
		result = 31 * result + (serviceDate != null ? serviceDate.hashCode() : 0);
		result = 31 * result + (serviceDocumentation != null ? serviceDocumentation.hashCode() : 0);
		result = 31 * result + (customerCommunication != null ? customerCommunication.hashCode() : 0);
		result = 31 * result + (duplicateChargeId != null ? duplicateChargeId.hashCode() : 0);
		result = 31 * result + (duplicateChargeExplanation != null ? duplicateChargeExplanation.hashCode() : 0);
		result = 31 * result + (duplicateChargeDocumentation != null ? duplicateChargeDocumentation.hashCode() : 0);
		result = 31 * result + (refundPolicy != null ? refundPolicy.hashCode() : 0);
		result = 31 * result + (refundPolicyDisclosure != null ? refundPolicyDisclosure.hashCode() : 0);
		result = 31 * result + (refundRefusalExplanation != null ? refundRefusalExplanation.hashCode() : 0);
		result = 31 * result + (cancellationPolicy != null ? cancellationPolicy.hashCode() : 0);
		result = 31 * result + (cancellationPolicyDisclosure != null ? cancellationPolicyDisclosure.hashCode() : 0);
		result = 31 * result + (cancellationRebuttal != null ? cancellationRebuttal.hashCode() : 0);
		result = 31 * result + (uncategorizedText != null ? uncategorizedText.hashCode() : 0);
		result = 31 * result + (uncategorizedFile != null ? uncategorizedFile.hashCode() : 0);
		return result;
	}
}
