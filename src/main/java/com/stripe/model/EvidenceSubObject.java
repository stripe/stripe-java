package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class EvidenceSubObject extends StripeObject {
  /**
   * A description of the product or service which was sold.
   */
  String productDescription;

  /**
   * The name of the customer.
   */
  String customerName;

  /**
   * The email address of the customer.
   */
  String customerEmailAddress;

  /**
   * The IP address that the customer used when making the purchase (this will be automatically
   * expanded to include geographical data when possible).
   */
  String customerPurchaseIp;

  /**
   * The billing addess provided by the customer.
   */
  String billingAddress;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent
   * to the customer notifying them of the charge. This field will be automatically filled with a
   * Stripe generated email receipt if any such receipt was sent.
   */
  String receipt;

  /**
   * The address to which a physical product was shipped. You should try to include as much complete
   * address information as possible.
   */
  String shippingAddress;

  /**
   * The date on which a physical product began its route to the shipping address, in a clear
   * human-readable format.
   */
  String shippingDate;

  /**
   * The tracking number for a physical product, usually obtained from a delivery service such as
   * Fedex, UPS, USPS, etc. If multiple tracking numbers were generated for this purchase, please
   * separate them with commas. These tracking numbers will be expanded to include detailed delivery
   * information from the carrier when possible.
   */
  String shippingTrackingNumber;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or
   * contract showing the customer's signature.
   */
  String customerSignature;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof
   * that a product was shipped to the customer at the same address the customer provided to you.
   * This could include a copy of the shipment receipt, shipping label, etc, and should show the
   * full shipping address of the customer, if possible.
   */
  String shippingDocumentation;

  /**
   * Any server or activity logs showing proof that the customer accessed or downloaded the
   * purchased digital product. This information should include IP addresses, corresponding
   * timestamps, and any detailed recorded activity.
   */
  String accessActivityLog;

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
  String serviceDocumentation;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communications with the
   * customer proving that they received the product or service that demonstrates their use of or
   * satisfaction with the product or service.
   */
  String customerCommunication;

  /**
   * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge (only
   * for disputes of reason `duplicate`).
   */
  String duplicateChargeId;

  /**
   * An explanation of the difference between the disputed charge and the prior charge that appears
   * to be a duplicate (only for disputes of reason `duplicate`).
   */
  String duplicateChargeExplanation;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior
   * charge that can uniquely identify the charge, such as a receipt, shipping label, work order,
   * etc. (only for disputes of reason `duplicate`). This document should be paired with a similar
   * document from the disputed payment that proves the two payments are separate.
   */
  String duplicateChargeDocumentation;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as
   * shown to the customer.
   */
  String refundPolicy;

  /**
   * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
   */
  String refundPolicyDisclosure;

  /**
   * Justification for why the customer is not entitled to a refund.
   */
  String refundRefusalExplanation;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription
   * cancellation policy, as shown to the customer.
   */
  String cancellationPolicy;

  /**
   * Documentation demonstrating that the customer was shown your cancellation policy prior to
   * purchase.
   */
  String cancellationPolicyDisclosure;

  /**
   * Justification for why the customer's subscription was not canceled.
   */
  String cancellationRebuttal;

  /**
   * Any additional evidence or statements.
   */
  String uncategorizedText;

  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or
   * statements.
   */
  String uncategorizedFile;
}
