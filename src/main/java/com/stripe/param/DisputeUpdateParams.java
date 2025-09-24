// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class DisputeUpdateParams extends ApiRequestParams {
  /**
   * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all
   * fields in the hash for review. The combined character count of all fields is limited to
   * 150,000.
   */
  @SerializedName("evidence")
  Evidence evidence;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Intended submission method for the dispute. */
  @SerializedName("intended_submission_method")
  IntendedSubmissionMethod intendedSubmissionMethod;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Whether to immediately submit evidence to the bank. If {@code false}, evidence is staged on the
   * dispute. Staged evidence is visible in the API and Dashboard, and can be submitted to the bank
   * by making another request with this attribute set to {@code true} (the default).
   */
  @SerializedName("submit")
  Boolean submit;

  private DisputeUpdateParams(
      Evidence evidence,
      List<String> expand,
      Map<String, Object> extraParams,
      IntendedSubmissionMethod intendedSubmissionMethod,
      Object metadata,
      Boolean submit) {
    this.evidence = evidence;
    this.expand = expand;
    this.extraParams = extraParams;
    this.intendedSubmissionMethod = intendedSubmissionMethod;
    this.metadata = metadata;
    this.submit = submit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Evidence evidence;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private IntendedSubmissionMethod intendedSubmissionMethod;

    private Object metadata;

    private Boolean submit;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeUpdateParams build() {
      return new DisputeUpdateParams(
          this.evidence,
          this.expand,
          this.extraParams,
          this.intendedSubmissionMethod,
          this.metadata,
          this.submit);
    }

    /**
     * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all
     * fields in the hash for review. The combined character count of all fields is limited to
     * 150,000.
     */
    public Builder setEvidence(DisputeUpdateParams.Evidence evidence) {
      this.evidence = evidence;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeUpdateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Intended submission method for the dispute. */
    public Builder setIntendedSubmissionMethod(
        DisputeUpdateParams.IntendedSubmissionMethod intendedSubmissionMethod) {
      this.intendedSubmissionMethod = intendedSubmissionMethod;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Whether to immediately submit evidence to the bank. If {@code false}, evidence is staged on
     * the dispute. Staged evidence is visible in the API and Dashboard, and can be submitted to the
     * bank by making another request with this attribute set to {@code true} (the default).
     */
    public Builder setSubmit(Boolean submit) {
      this.submit = submit;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Evidence {
    /**
     * Any server or activity logs showing proof that the customer accessed or downloaded the
     * purchased digital product. This information should include IP addresses, corresponding
     * timestamps, and any detailed recorded activity. Has a maximum character count of 20,000.
     */
    @SerializedName("access_activity_log")
    Object accessActivityLog;

    /** The billing address provided by the customer. */
    @SerializedName("billing_address")
    Object billingAddress;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your
     * subscription cancellation policy, as shown to the customer.
     */
    @SerializedName("cancellation_policy")
    Object cancellationPolicy;

    /**
     * An explanation of how and when the customer was shown your refund policy prior to purchase.
     * Has a maximum character count of 20,000.
     */
    @SerializedName("cancellation_policy_disclosure")
    Object cancellationPolicyDisclosure;

    /**
     * A justification for why the customer's subscription was not canceled. Has a maximum character
     * count of 20,000.
     */
    @SerializedName("cancellation_rebuttal")
    Object cancellationRebuttal;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any
     * communication with the customer that you feel is relevant to your case. Examples include
     * emails proving that the customer received the product or service, or demonstrating their use
     * of or satisfaction with the product or service.
     */
    @SerializedName("customer_communication")
    Object customerCommunication;

    /** The email address of the customer. */
    @SerializedName("customer_email_address")
    Object customerEmailAddress;

    /** The name of the customer. */
    @SerializedName("customer_name")
    Object customerName;

    /** The IP address that the customer used when making the purchase. */
    @SerializedName("customer_purchase_ip")
    Object customerPurchaseIp;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A relevant
     * document or contract showing the customer's signature.
     */
    @SerializedName("customer_signature")
    Object customerSignature;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Documentation
     * for the prior charge that can uniquely identify the charge, such as a receipt, shipping
     * label, work order, etc. This document should be paired with a similar document from the
     * disputed payment that proves the two payments are separate.
     */
    @SerializedName("duplicate_charge_documentation")
    Object duplicateChargeDocumentation;

    /**
     * An explanation of the difference between the disputed charge versus the prior charge that
     * appears to be a duplicate. Has a maximum character count of 20,000.
     */
    @SerializedName("duplicate_charge_explanation")
    Object duplicateChargeExplanation;

    /**
     * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
     */
    @SerializedName("duplicate_charge_id")
    Object duplicateChargeId;

    /** Additional evidence for qualifying evidence programs. */
    @SerializedName("enhanced_evidence")
    Object enhancedEvidence;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A description of the product or service that was sold. Has a maximum character count of
     * 20,000.
     */
    @SerializedName("product_description")
    Object productDescription;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any receipt or
     * message sent to the customer notifying them of the charge.
     */
    @SerializedName("receipt")
    Object receipt;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your refund
     * policy, as shown to the customer.
     */
    @SerializedName("refund_policy")
    Object refundPolicy;

    /**
     * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
     * Has a maximum character count of 20,000.
     */
    @SerializedName("refund_policy_disclosure")
    Object refundPolicyDisclosure;

    /**
     * A justification for why the customer is not entitled to a refund. Has a maximum character
     * count of 20,000.
     */
    @SerializedName("refund_refusal_explanation")
    Object refundRefusalExplanation;

    /**
     * The date on which the customer received or began receiving the purchased service, in a clear
     * human-readable format.
     */
    @SerializedName("service_date")
    Object serviceDate;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Documentation
     * showing proof that a service was provided to the customer. This could include a copy of a
     * signed contract, work order, or other form of written agreement.
     */
    @SerializedName("service_documentation")
    Object serviceDocumentation;

    /**
     * The address to which a physical product was shipped. You should try to include as complete
     * address information as possible.
     */
    @SerializedName("shipping_address")
    Object shippingAddress;

    /**
     * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If
     * multiple carriers were used for this purchase, please separate them with commas.
     */
    @SerializedName("shipping_carrier")
    Object shippingCarrier;

    /**
     * The date on which a physical product began its route to the shipping address, in a clear
     * human-readable format.
     */
    @SerializedName("shipping_date")
    Object shippingDate;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Documentation
     * showing proof that a product was shipped to the customer at the same address the customer
     * provided to you. This could include a copy of the shipment receipt, shipping label, etc. It
     * should show the customer's full shipping address, if possible.
     */
    @SerializedName("shipping_documentation")
    Object shippingDocumentation;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("shipping_tracking_number")
    Object shippingTrackingNumber;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any additional
     * evidence or statements.
     */
    @SerializedName("uncategorized_file")
    Object uncategorizedFile;

    /** Any additional evidence or statements. Has a maximum character count of 20,000. */
    @SerializedName("uncategorized_text")
    Object uncategorizedText;

    private Evidence(
        Object accessActivityLog,
        Object billingAddress,
        Object cancellationPolicy,
        Object cancellationPolicyDisclosure,
        Object cancellationRebuttal,
        Object customerCommunication,
        Object customerEmailAddress,
        Object customerName,
        Object customerPurchaseIp,
        Object customerSignature,
        Object duplicateChargeDocumentation,
        Object duplicateChargeExplanation,
        Object duplicateChargeId,
        Object enhancedEvidence,
        Map<String, Object> extraParams,
        Object productDescription,
        Object receipt,
        Object refundPolicy,
        Object refundPolicyDisclosure,
        Object refundRefusalExplanation,
        Object serviceDate,
        Object serviceDocumentation,
        Object shippingAddress,
        Object shippingCarrier,
        Object shippingDate,
        Object shippingDocumentation,
        Object shippingTrackingNumber,
        Object uncategorizedFile,
        Object uncategorizedText) {
      this.accessActivityLog = accessActivityLog;
      this.billingAddress = billingAddress;
      this.cancellationPolicy = cancellationPolicy;
      this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
      this.cancellationRebuttal = cancellationRebuttal;
      this.customerCommunication = customerCommunication;
      this.customerEmailAddress = customerEmailAddress;
      this.customerName = customerName;
      this.customerPurchaseIp = customerPurchaseIp;
      this.customerSignature = customerSignature;
      this.duplicateChargeDocumentation = duplicateChargeDocumentation;
      this.duplicateChargeExplanation = duplicateChargeExplanation;
      this.duplicateChargeId = duplicateChargeId;
      this.enhancedEvidence = enhancedEvidence;
      this.extraParams = extraParams;
      this.productDescription = productDescription;
      this.receipt = receipt;
      this.refundPolicy = refundPolicy;
      this.refundPolicyDisclosure = refundPolicyDisclosure;
      this.refundRefusalExplanation = refundRefusalExplanation;
      this.serviceDate = serviceDate;
      this.serviceDocumentation = serviceDocumentation;
      this.shippingAddress = shippingAddress;
      this.shippingCarrier = shippingCarrier;
      this.shippingDate = shippingDate;
      this.shippingDocumentation = shippingDocumentation;
      this.shippingTrackingNumber = shippingTrackingNumber;
      this.uncategorizedFile = uncategorizedFile;
      this.uncategorizedText = uncategorizedText;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object accessActivityLog;

      private Object billingAddress;

      private Object cancellationPolicy;

      private Object cancellationPolicyDisclosure;

      private Object cancellationRebuttal;

      private Object customerCommunication;

      private Object customerEmailAddress;

      private Object customerName;

      private Object customerPurchaseIp;

      private Object customerSignature;

      private Object duplicateChargeDocumentation;

      private Object duplicateChargeExplanation;

      private Object duplicateChargeId;

      private Object enhancedEvidence;

      private Map<String, Object> extraParams;

      private Object productDescription;

      private Object receipt;

      private Object refundPolicy;

      private Object refundPolicyDisclosure;

      private Object refundRefusalExplanation;

      private Object serviceDate;

      private Object serviceDocumentation;

      private Object shippingAddress;

      private Object shippingCarrier;

      private Object shippingDate;

      private Object shippingDocumentation;

      private Object shippingTrackingNumber;

      private Object uncategorizedFile;

      private Object uncategorizedText;

      /** Finalize and obtain parameter instance from this builder. */
      public DisputeUpdateParams.Evidence build() {
        return new DisputeUpdateParams.Evidence(
            this.accessActivityLog,
            this.billingAddress,
            this.cancellationPolicy,
            this.cancellationPolicyDisclosure,
            this.cancellationRebuttal,
            this.customerCommunication,
            this.customerEmailAddress,
            this.customerName,
            this.customerPurchaseIp,
            this.customerSignature,
            this.duplicateChargeDocumentation,
            this.duplicateChargeExplanation,
            this.duplicateChargeId,
            this.enhancedEvidence,
            this.extraParams,
            this.productDescription,
            this.receipt,
            this.refundPolicy,
            this.refundPolicyDisclosure,
            this.refundRefusalExplanation,
            this.serviceDate,
            this.serviceDocumentation,
            this.shippingAddress,
            this.shippingCarrier,
            this.shippingDate,
            this.shippingDocumentation,
            this.shippingTrackingNumber,
            this.uncategorizedFile,
            this.uncategorizedText);
      }

      /**
       * Any server or activity logs showing proof that the customer accessed or downloaded the
       * purchased digital product. This information should include IP addresses, corresponding
       * timestamps, and any detailed recorded activity. Has a maximum character count of 20,000.
       */
      public Builder setAccessActivityLog(String accessActivityLog) {
        this.accessActivityLog = accessActivityLog;
        return this;
      }

      /**
       * Any server or activity logs showing proof that the customer accessed or downloaded the
       * purchased digital product. This information should include IP addresses, corresponding
       * timestamps, and any detailed recorded activity. Has a maximum character count of 20,000.
       */
      public Builder setAccessActivityLog(EmptyParam accessActivityLog) {
        this.accessActivityLog = accessActivityLog;
        return this;
      }

      /** The billing address provided by the customer. */
      public Builder setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
        return this;
      }

      /** The billing address provided by the customer. */
      public Builder setBillingAddress(EmptyParam billingAddress) {
        this.billingAddress = billingAddress;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your
       * subscription cancellation policy, as shown to the customer.
       */
      public Builder setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your
       * subscription cancellation policy, as shown to the customer.
       */
      public Builder setCancellationPolicy(EmptyParam cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        return this;
      }

      /**
       * An explanation of how and when the customer was shown your refund policy prior to purchase.
       * Has a maximum character count of 20,000.
       */
      public Builder setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
        this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
        return this;
      }

      /**
       * An explanation of how and when the customer was shown your refund policy prior to purchase.
       * Has a maximum character count of 20,000.
       */
      public Builder setCancellationPolicyDisclosure(EmptyParam cancellationPolicyDisclosure) {
        this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
        return this;
      }

      /**
       * A justification for why the customer's subscription was not canceled. Has a maximum
       * character count of 20,000.
       */
      public Builder setCancellationRebuttal(String cancellationRebuttal) {
        this.cancellationRebuttal = cancellationRebuttal;
        return this;
      }

      /**
       * A justification for why the customer's subscription was not canceled. Has a maximum
       * character count of 20,000.
       */
      public Builder setCancellationRebuttal(EmptyParam cancellationRebuttal) {
        this.cancellationRebuttal = cancellationRebuttal;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any
       * communication with the customer that you feel is relevant to your case. Examples include
       * emails proving that the customer received the product or service, or demonstrating their
       * use of or satisfaction with the product or service.
       */
      public Builder setCustomerCommunication(String customerCommunication) {
        this.customerCommunication = customerCommunication;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any
       * communication with the customer that you feel is relevant to your case. Examples include
       * emails proving that the customer received the product or service, or demonstrating their
       * use of or satisfaction with the product or service.
       */
      public Builder setCustomerCommunication(EmptyParam customerCommunication) {
        this.customerCommunication = customerCommunication;
        return this;
      }

      /** The email address of the customer. */
      public Builder setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
      }

      /** The email address of the customer. */
      public Builder setCustomerEmailAddress(EmptyParam customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
      }

      /** The name of the customer. */
      public Builder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
      }

      /** The name of the customer. */
      public Builder setCustomerName(EmptyParam customerName) {
        this.customerName = customerName;
        return this;
      }

      /** The IP address that the customer used when making the purchase. */
      public Builder setCustomerPurchaseIp(String customerPurchaseIp) {
        this.customerPurchaseIp = customerPurchaseIp;
        return this;
      }

      /** The IP address that the customer used when making the purchase. */
      public Builder setCustomerPurchaseIp(EmptyParam customerPurchaseIp) {
        this.customerPurchaseIp = customerPurchaseIp;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A relevant
       * document or contract showing the customer's signature.
       */
      public Builder setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A relevant
       * document or contract showing the customer's signature.
       */
      public Builder setCustomerSignature(EmptyParam customerSignature) {
        this.customerSignature = customerSignature;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>)
       * Documentation for the prior charge that can uniquely identify the charge, such as a
       * receipt, shipping label, work order, etc. This document should be paired with a similar
       * document from the disputed payment that proves the two payments are separate.
       */
      public Builder setDuplicateChargeDocumentation(String duplicateChargeDocumentation) {
        this.duplicateChargeDocumentation = duplicateChargeDocumentation;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>)
       * Documentation for the prior charge that can uniquely identify the charge, such as a
       * receipt, shipping label, work order, etc. This document should be paired with a similar
       * document from the disputed payment that proves the two payments are separate.
       */
      public Builder setDuplicateChargeDocumentation(EmptyParam duplicateChargeDocumentation) {
        this.duplicateChargeDocumentation = duplicateChargeDocumentation;
        return this;
      }

      /**
       * An explanation of the difference between the disputed charge versus the prior charge that
       * appears to be a duplicate. Has a maximum character count of 20,000.
       */
      public Builder setDuplicateChargeExplanation(String duplicateChargeExplanation) {
        this.duplicateChargeExplanation = duplicateChargeExplanation;
        return this;
      }

      /**
       * An explanation of the difference between the disputed charge versus the prior charge that
       * appears to be a duplicate. Has a maximum character count of 20,000.
       */
      public Builder setDuplicateChargeExplanation(EmptyParam duplicateChargeExplanation) {
        this.duplicateChargeExplanation = duplicateChargeExplanation;
        return this;
      }

      /**
       * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
       */
      public Builder setDuplicateChargeId(String duplicateChargeId) {
        this.duplicateChargeId = duplicateChargeId;
        return this;
      }

      /**
       * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
       */
      public Builder setDuplicateChargeId(EmptyParam duplicateChargeId) {
        this.duplicateChargeId = duplicateChargeId;
        return this;
      }

      /** Additional evidence for qualifying evidence programs. */
      public Builder setEnhancedEvidence(
          DisputeUpdateParams.Evidence.EnhancedEvidence enhancedEvidence) {
        this.enhancedEvidence = enhancedEvidence;
        return this;
      }

      /** Additional evidence for qualifying evidence programs. */
      public Builder setEnhancedEvidence(EmptyParam enhancedEvidence) {
        this.enhancedEvidence = enhancedEvidence;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeUpdateParams.Evidence#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link DisputeUpdateParams.Evidence#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A description of the product or service that was sold. Has a maximum character count of
       * 20,000.
       */
      public Builder setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      /**
       * A description of the product or service that was sold. Has a maximum character count of
       * 20,000.
       */
      public Builder setProductDescription(EmptyParam productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any receipt
       * or message sent to the customer notifying them of the charge.
       */
      public Builder setReceipt(String receipt) {
        this.receipt = receipt;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any receipt
       * or message sent to the customer notifying them of the charge.
       */
      public Builder setReceipt(EmptyParam receipt) {
        this.receipt = receipt;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your refund
       * policy, as shown to the customer.
       */
      public Builder setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your refund
       * policy, as shown to the customer.
       */
      public Builder setRefundPolicy(EmptyParam refundPolicy) {
        this.refundPolicy = refundPolicy;
        return this;
      }

      /**
       * Documentation demonstrating that the customer was shown your refund policy prior to
       * purchase. Has a maximum character count of 20,000.
       */
      public Builder setRefundPolicyDisclosure(String refundPolicyDisclosure) {
        this.refundPolicyDisclosure = refundPolicyDisclosure;
        return this;
      }

      /**
       * Documentation demonstrating that the customer was shown your refund policy prior to
       * purchase. Has a maximum character count of 20,000.
       */
      public Builder setRefundPolicyDisclosure(EmptyParam refundPolicyDisclosure) {
        this.refundPolicyDisclosure = refundPolicyDisclosure;
        return this;
      }

      /**
       * A justification for why the customer is not entitled to a refund. Has a maximum character
       * count of 20,000.
       */
      public Builder setRefundRefusalExplanation(String refundRefusalExplanation) {
        this.refundRefusalExplanation = refundRefusalExplanation;
        return this;
      }

      /**
       * A justification for why the customer is not entitled to a refund. Has a maximum character
       * count of 20,000.
       */
      public Builder setRefundRefusalExplanation(EmptyParam refundRefusalExplanation) {
        this.refundRefusalExplanation = refundRefusalExplanation;
        return this;
      }

      /**
       * The date on which the customer received or began receiving the purchased service, in a
       * clear human-readable format.
       */
      public Builder setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
        return this;
      }

      /**
       * The date on which the customer received or began receiving the purchased service, in a
       * clear human-readable format.
       */
      public Builder setServiceDate(EmptyParam serviceDate) {
        this.serviceDate = serviceDate;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>)
       * Documentation showing proof that a service was provided to the customer. This could include
       * a copy of a signed contract, work order, or other form of written agreement.
       */
      public Builder setServiceDocumentation(String serviceDocumentation) {
        this.serviceDocumentation = serviceDocumentation;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>)
       * Documentation showing proof that a service was provided to the customer. This could include
       * a copy of a signed contract, work order, or other form of written agreement.
       */
      public Builder setServiceDocumentation(EmptyParam serviceDocumentation) {
        this.serviceDocumentation = serviceDocumentation;
        return this;
      }

      /**
       * The address to which a physical product was shipped. You should try to include as complete
       * address information as possible.
       */
      public Builder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /**
       * The address to which a physical product was shipped. You should try to include as complete
       * address information as possible.
       */
      public Builder setShippingAddress(EmptyParam shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /**
       * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If
       * multiple carriers were used for this purchase, please separate them with commas.
       */
      public Builder setShippingCarrier(String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
      }

      /**
       * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If
       * multiple carriers were used for this purchase, please separate them with commas.
       */
      public Builder setShippingCarrier(EmptyParam shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
      }

      /**
       * The date on which a physical product began its route to the shipping address, in a clear
       * human-readable format.
       */
      public Builder setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
        return this;
      }

      /**
       * The date on which a physical product began its route to the shipping address, in a clear
       * human-readable format.
       */
      public Builder setShippingDate(EmptyParam shippingDate) {
        this.shippingDate = shippingDate;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>)
       * Documentation showing proof that a product was shipped to the customer at the same address
       * the customer provided to you. This could include a copy of the shipment receipt, shipping
       * label, etc. It should show the customer's full shipping address, if possible.
       */
      public Builder setShippingDocumentation(String shippingDocumentation) {
        this.shippingDocumentation = shippingDocumentation;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>)
       * Documentation showing proof that a product was shipped to the customer at the same address
       * the customer provided to you. This could include a copy of the shipment receipt, shipping
       * label, etc. It should show the customer's full shipping address, if possible.
       */
      public Builder setShippingDocumentation(EmptyParam shippingDocumentation) {
        this.shippingDocumentation = shippingDocumentation;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setShippingTrackingNumber(String shippingTrackingNumber) {
        this.shippingTrackingNumber = shippingTrackingNumber;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setShippingTrackingNumber(EmptyParam shippingTrackingNumber) {
        this.shippingTrackingNumber = shippingTrackingNumber;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any
       * additional evidence or statements.
       */
      public Builder setUncategorizedFile(String uncategorizedFile) {
        this.uncategorizedFile = uncategorizedFile;
        return this;
      }

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any
       * additional evidence or statements.
       */
      public Builder setUncategorizedFile(EmptyParam uncategorizedFile) {
        this.uncategorizedFile = uncategorizedFile;
        return this;
      }

      /** Any additional evidence or statements. Has a maximum character count of 20,000. */
      public Builder setUncategorizedText(String uncategorizedText) {
        this.uncategorizedText = uncategorizedText;
        return this;
      }

      /** Any additional evidence or statements. Has a maximum character count of 20,000. */
      public Builder setUncategorizedText(EmptyParam uncategorizedText) {
        this.uncategorizedText = uncategorizedText;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EnhancedEvidence {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Evidence provided for Visa Compelling Evidence 3.0 evidence submission. */
      @SerializedName("visa_compelling_evidence_3")
      VisaCompellingEvidence3 visaCompellingEvidence3;

      /** Evidence provided for Visa compliance evidence submission. */
      @SerializedName("visa_compliance")
      VisaCompliance visaCompliance;

      private EnhancedEvidence(
          Map<String, Object> extraParams,
          VisaCompellingEvidence3 visaCompellingEvidence3,
          VisaCompliance visaCompliance) {
        this.extraParams = extraParams;
        this.visaCompellingEvidence3 = visaCompellingEvidence3;
        this.visaCompliance = visaCompliance;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private VisaCompellingEvidence3 visaCompellingEvidence3;

        private VisaCompliance visaCompliance;

        /** Finalize and obtain parameter instance from this builder. */
        public DisputeUpdateParams.Evidence.EnhancedEvidence build() {
          return new DisputeUpdateParams.Evidence.EnhancedEvidence(
              this.extraParams, this.visaCompellingEvidence3, this.visaCompliance);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.EnhancedEvidence#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.EnhancedEvidence#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Evidence provided for Visa Compelling Evidence 3.0 evidence submission. */
        public Builder setVisaCompellingEvidence3(
            DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                visaCompellingEvidence3) {
          this.visaCompellingEvidence3 = visaCompellingEvidence3;
          return this;
        }

        /** Evidence provided for Visa compliance evidence submission. */
        public Builder setVisaCompliance(
            DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompliance visaCompliance) {
          this.visaCompliance = visaCompliance;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class VisaCompellingEvidence3 {
        /** Disputed transaction details for Visa Compelling Evidence 3.0 evidence submission. */
        @SerializedName("disputed_transaction")
        DisputedTransaction disputedTransaction;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * List of exactly two prior undisputed transaction objects for Visa Compelling Evidence 3.0
         * evidence submission.
         */
        @SerializedName("prior_undisputed_transactions")
        List<
                DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                    .PriorUndisputedTransaction>
            priorUndisputedTransactions;

        private VisaCompellingEvidence3(
            DisputedTransaction disputedTransaction,
            Map<String, Object> extraParams,
            List<
                    DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                        .PriorUndisputedTransaction>
                priorUndisputedTransactions) {
          this.disputedTransaction = disputedTransaction;
          this.extraParams = extraParams;
          this.priorUndisputedTransactions = priorUndisputedTransactions;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private DisputedTransaction disputedTransaction;

          private Map<String, Object> extraParams;

          private List<
                  DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                      .PriorUndisputedTransaction>
              priorUndisputedTransactions;

          /** Finalize and obtain parameter instance from this builder. */
          public DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3 build() {
            return new DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3(
                this.disputedTransaction, this.extraParams, this.priorUndisputedTransactions);
          }

          /** Disputed transaction details for Visa Compelling Evidence 3.0 evidence submission. */
          public Builder setDisputedTransaction(
              DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                      .DisputedTransaction
                  disputedTransaction) {
            this.disputedTransaction = disputedTransaction;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `priorUndisputedTransactions` list. A list is initialized for the
           * first `add/addAll` call, and subsequent calls adds additional elements to the original
           * list. See {@link
           * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3#priorUndisputedTransactions}
           * for the field documentation.
           */
          public Builder addPriorUndisputedTransaction(
              DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                      .PriorUndisputedTransaction
                  element) {
            if (this.priorUndisputedTransactions == null) {
              this.priorUndisputedTransactions = new ArrayList<>();
            }
            this.priorUndisputedTransactions.add(element);
            return this;
          }

          /**
           * Add all elements to `priorUndisputedTransactions` list. A list is initialized for the
           * first `add/addAll` call, and subsequent calls adds additional elements to the original
           * list. See {@link
           * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3#priorUndisputedTransactions}
           * for the field documentation.
           */
          public Builder addAllPriorUndisputedTransaction(
              List<
                      DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                          .PriorUndisputedTransaction>
                  elements) {
            if (this.priorUndisputedTransactions == null) {
              this.priorUndisputedTransactions = new ArrayList<>();
            }
            this.priorUndisputedTransactions.addAll(elements);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class DisputedTransaction {
          /**
           * User Account ID used to log into business platform. Must be recognizable by the user.
           */
          @SerializedName("customer_account_id")
          Object customerAccountId;

          /**
           * Unique identifier of the cardholder’s device derived from a combination of at least two
           * hardware and software attributes. Must be at least 20 characters.
           */
          @SerializedName("customer_device_fingerprint")
          Object customerDeviceFingerprint;

          /**
           * Unique identifier of the cardholder’s device such as a device serial number (e.g.,
           * International Mobile Equipment Identity [IMEI]). Must be at least 15 characters.
           */
          @SerializedName("customer_device_id")
          Object customerDeviceId;

          /** The email address of the customer. */
          @SerializedName("customer_email_address")
          Object customerEmailAddress;

          /** The IP address that the customer used when making the purchase. */
          @SerializedName("customer_purchase_ip")
          Object customerPurchaseIp;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Categorization of disputed payment. */
          @SerializedName("merchandise_or_services")
          MerchandiseOrServices merchandiseOrServices;

          /** A description of the product or service that was sold. */
          @SerializedName("product_description")
          Object productDescription;

          /**
           * The address to which a physical product was shipped. All fields are required for Visa
           * Compelling Evidence 3.0 evidence submission.
           */
          @SerializedName("shipping_address")
          ShippingAddress shippingAddress;

          private DisputedTransaction(
              Object customerAccountId,
              Object customerDeviceFingerprint,
              Object customerDeviceId,
              Object customerEmailAddress,
              Object customerPurchaseIp,
              Map<String, Object> extraParams,
              MerchandiseOrServices merchandiseOrServices,
              Object productDescription,
              ShippingAddress shippingAddress) {
            this.customerAccountId = customerAccountId;
            this.customerDeviceFingerprint = customerDeviceFingerprint;
            this.customerDeviceId = customerDeviceId;
            this.customerEmailAddress = customerEmailAddress;
            this.customerPurchaseIp = customerPurchaseIp;
            this.extraParams = extraParams;
            this.merchandiseOrServices = merchandiseOrServices;
            this.productDescription = productDescription;
            this.shippingAddress = shippingAddress;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object customerAccountId;

            private Object customerDeviceFingerprint;

            private Object customerDeviceId;

            private Object customerEmailAddress;

            private Object customerPurchaseIp;

            private Map<String, Object> extraParams;

            private MerchandiseOrServices merchandiseOrServices;

            private Object productDescription;

            private ShippingAddress shippingAddress;

            /** Finalize and obtain parameter instance from this builder. */
            public DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                    .DisputedTransaction
                build() {
              return new DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                  .DisputedTransaction(
                  this.customerAccountId,
                  this.customerDeviceFingerprint,
                  this.customerDeviceId,
                  this.customerEmailAddress,
                  this.customerPurchaseIp,
                  this.extraParams,
                  this.merchandiseOrServices,
                  this.productDescription,
                  this.shippingAddress);
            }

            /**
             * User Account ID used to log into business platform. Must be recognizable by the user.
             */
            public Builder setCustomerAccountId(String customerAccountId) {
              this.customerAccountId = customerAccountId;
              return this;
            }

            /**
             * User Account ID used to log into business platform. Must be recognizable by the user.
             */
            public Builder setCustomerAccountId(EmptyParam customerAccountId) {
              this.customerAccountId = customerAccountId;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device derived from a combination of at least
             * two hardware and software attributes. Must be at least 20 characters.
             */
            public Builder setCustomerDeviceFingerprint(String customerDeviceFingerprint) {
              this.customerDeviceFingerprint = customerDeviceFingerprint;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device derived from a combination of at least
             * two hardware and software attributes. Must be at least 20 characters.
             */
            public Builder setCustomerDeviceFingerprint(EmptyParam customerDeviceFingerprint) {
              this.customerDeviceFingerprint = customerDeviceFingerprint;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device such as a device serial number (e.g.,
             * International Mobile Equipment Identity [IMEI]). Must be at least 15 characters.
             */
            public Builder setCustomerDeviceId(String customerDeviceId) {
              this.customerDeviceId = customerDeviceId;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device such as a device serial number (e.g.,
             * International Mobile Equipment Identity [IMEI]). Must be at least 15 characters.
             */
            public Builder setCustomerDeviceId(EmptyParam customerDeviceId) {
              this.customerDeviceId = customerDeviceId;
              return this;
            }

            /** The email address of the customer. */
            public Builder setCustomerEmailAddress(String customerEmailAddress) {
              this.customerEmailAddress = customerEmailAddress;
              return this;
            }

            /** The email address of the customer. */
            public Builder setCustomerEmailAddress(EmptyParam customerEmailAddress) {
              this.customerEmailAddress = customerEmailAddress;
              return this;
            }

            /** The IP address that the customer used when making the purchase. */
            public Builder setCustomerPurchaseIp(String customerPurchaseIp) {
              this.customerPurchaseIp = customerPurchaseIp;
              return this;
            }

            /** The IP address that the customer used when making the purchase. */
            public Builder setCustomerPurchaseIp(EmptyParam customerPurchaseIp) {
              this.customerPurchaseIp = customerPurchaseIp;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.DisputedTransaction#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.DisputedTransaction#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Categorization of disputed payment. */
            public Builder setMerchandiseOrServices(
                DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                        .DisputedTransaction.MerchandiseOrServices
                    merchandiseOrServices) {
              this.merchandiseOrServices = merchandiseOrServices;
              return this;
            }

            /** A description of the product or service that was sold. */
            public Builder setProductDescription(String productDescription) {
              this.productDescription = productDescription;
              return this;
            }

            /** A description of the product or service that was sold. */
            public Builder setProductDescription(EmptyParam productDescription) {
              this.productDescription = productDescription;
              return this;
            }

            /**
             * The address to which a physical product was shipped. All fields are required for Visa
             * Compelling Evidence 3.0 evidence submission.
             */
            public Builder setShippingAddress(
                DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                        .DisputedTransaction.ShippingAddress
                    shippingAddress) {
              this.shippingAddress = shippingAddress;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class ShippingAddress {
            /** City, district, suburb, town, or village. */
            @SerializedName("city")
            Object city;

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            @SerializedName("country")
            Object country;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Address line 1, such as the street, PO Box, or company name. */
            @SerializedName("line1")
            Object line1;

            /** Address line 2, such as the apartment, suite, unit, or building. */
            @SerializedName("line2")
            Object line2;

            /** ZIP or postal code. */
            @SerializedName("postal_code")
            Object postalCode;

            /** State, county, province, or region. */
            @SerializedName("state")
            Object state;

            private ShippingAddress(
                Object city,
                Object country,
                Map<String, Object> extraParams,
                Object line1,
                Object line2,
                Object postalCode,
                Object state) {
              this.city = city;
              this.country = country;
              this.extraParams = extraParams;
              this.line1 = line1;
              this.line2 = line2;
              this.postalCode = postalCode;
              this.state = state;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Object city;

              private Object country;

              private Map<String, Object> extraParams;

              private Object line1;

              private Object line2;

              private Object postalCode;

              private Object state;

              /** Finalize and obtain parameter instance from this builder. */
              public DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                      .DisputedTransaction.ShippingAddress
                  build() {
                return new DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                    .DisputedTransaction.ShippingAddress(
                    this.city,
                    this.country,
                    this.extraParams,
                    this.line1,
                    this.line2,
                    this.postalCode,
                    this.state);
              }

              /** City, district, suburb, town, or village. */
              public Builder setCity(String city) {
                this.city = city;
                return this;
              }

              /** City, district, suburb, town, or village. */
              public Builder setCity(EmptyParam city) {
                this.city = city;
                return this;
              }

              /**
               * Two-letter country code (<a
               * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
               */
              public Builder setCountry(String country) {
                this.country = country;
                return this;
              }

              /**
               * Two-letter country code (<a
               * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
               */
              public Builder setCountry(EmptyParam country) {
                this.country = country;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.DisputedTransaction.ShippingAddress#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.DisputedTransaction.ShippingAddress#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Address line 1, such as the street, PO Box, or company name. */
              public Builder setLine1(String line1) {
                this.line1 = line1;
                return this;
              }

              /** Address line 1, such as the street, PO Box, or company name. */
              public Builder setLine1(EmptyParam line1) {
                this.line1 = line1;
                return this;
              }

              /** Address line 2, such as the apartment, suite, unit, or building. */
              public Builder setLine2(String line2) {
                this.line2 = line2;
                return this;
              }

              /** Address line 2, such as the apartment, suite, unit, or building. */
              public Builder setLine2(EmptyParam line2) {
                this.line2 = line2;
                return this;
              }

              /** ZIP or postal code. */
              public Builder setPostalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
              }

              /** ZIP or postal code. */
              public Builder setPostalCode(EmptyParam postalCode) {
                this.postalCode = postalCode;
                return this;
              }

              /** State, county, province, or region. */
              public Builder setState(String state) {
                this.state = state;
                return this;
              }

              /** State, county, province, or region. */
              public Builder setState(EmptyParam state) {
                this.state = state;
                return this;
              }
            }
          }

          public enum MerchandiseOrServices implements ApiRequestParams.EnumParam {
            @SerializedName("merchandise")
            MERCHANDISE("merchandise"),

            @SerializedName("services")
            SERVICES("services");

            @Getter(onMethod_ = {@Override})
            private final String value;

            MerchandiseOrServices(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PriorUndisputedTransaction {
          /**
           * <strong>Required.</strong> Stripe charge ID for the Visa Compelling Evidence 3.0
           * eligible prior charge.
           */
          @SerializedName("charge")
          Object charge;

          /**
           * User Account ID used to log into business platform. Must be recognizable by the user.
           */
          @SerializedName("customer_account_id")
          Object customerAccountId;

          /**
           * Unique identifier of the cardholder’s device derived from a combination of at least two
           * hardware and software attributes. Must be at least 20 characters.
           */
          @SerializedName("customer_device_fingerprint")
          Object customerDeviceFingerprint;

          /**
           * Unique identifier of the cardholder’s device such as a device serial number (e.g.,
           * International Mobile Equipment Identity [IMEI]). Must be at least 15 characters.
           */
          @SerializedName("customer_device_id")
          Object customerDeviceId;

          /** The email address of the customer. */
          @SerializedName("customer_email_address")
          Object customerEmailAddress;

          /** The IP address that the customer used when making the purchase. */
          @SerializedName("customer_purchase_ip")
          Object customerPurchaseIp;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A description of the product or service that was sold. */
          @SerializedName("product_description")
          Object productDescription;

          /**
           * The address to which a physical product was shipped. All fields are required for Visa
           * Compelling Evidence 3.0 evidence submission.
           */
          @SerializedName("shipping_address")
          ShippingAddress shippingAddress;

          private PriorUndisputedTransaction(
              Object charge,
              Object customerAccountId,
              Object customerDeviceFingerprint,
              Object customerDeviceId,
              Object customerEmailAddress,
              Object customerPurchaseIp,
              Map<String, Object> extraParams,
              Object productDescription,
              ShippingAddress shippingAddress) {
            this.charge = charge;
            this.customerAccountId = customerAccountId;
            this.customerDeviceFingerprint = customerDeviceFingerprint;
            this.customerDeviceId = customerDeviceId;
            this.customerEmailAddress = customerEmailAddress;
            this.customerPurchaseIp = customerPurchaseIp;
            this.extraParams = extraParams;
            this.productDescription = productDescription;
            this.shippingAddress = shippingAddress;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object charge;

            private Object customerAccountId;

            private Object customerDeviceFingerprint;

            private Object customerDeviceId;

            private Object customerEmailAddress;

            private Object customerPurchaseIp;

            private Map<String, Object> extraParams;

            private Object productDescription;

            private ShippingAddress shippingAddress;

            /** Finalize and obtain parameter instance from this builder. */
            public DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                    .PriorUndisputedTransaction
                build() {
              return new DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                  .PriorUndisputedTransaction(
                  this.charge,
                  this.customerAccountId,
                  this.customerDeviceFingerprint,
                  this.customerDeviceId,
                  this.customerEmailAddress,
                  this.customerPurchaseIp,
                  this.extraParams,
                  this.productDescription,
                  this.shippingAddress);
            }

            /**
             * <strong>Required.</strong> Stripe charge ID for the Visa Compelling Evidence 3.0
             * eligible prior charge.
             */
            public Builder setCharge(String charge) {
              this.charge = charge;
              return this;
            }

            /**
             * <strong>Required.</strong> Stripe charge ID for the Visa Compelling Evidence 3.0
             * eligible prior charge.
             */
            public Builder setCharge(EmptyParam charge) {
              this.charge = charge;
              return this;
            }

            /**
             * User Account ID used to log into business platform. Must be recognizable by the user.
             */
            public Builder setCustomerAccountId(String customerAccountId) {
              this.customerAccountId = customerAccountId;
              return this;
            }

            /**
             * User Account ID used to log into business platform. Must be recognizable by the user.
             */
            public Builder setCustomerAccountId(EmptyParam customerAccountId) {
              this.customerAccountId = customerAccountId;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device derived from a combination of at least
             * two hardware and software attributes. Must be at least 20 characters.
             */
            public Builder setCustomerDeviceFingerprint(String customerDeviceFingerprint) {
              this.customerDeviceFingerprint = customerDeviceFingerprint;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device derived from a combination of at least
             * two hardware and software attributes. Must be at least 20 characters.
             */
            public Builder setCustomerDeviceFingerprint(EmptyParam customerDeviceFingerprint) {
              this.customerDeviceFingerprint = customerDeviceFingerprint;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device such as a device serial number (e.g.,
             * International Mobile Equipment Identity [IMEI]). Must be at least 15 characters.
             */
            public Builder setCustomerDeviceId(String customerDeviceId) {
              this.customerDeviceId = customerDeviceId;
              return this;
            }

            /**
             * Unique identifier of the cardholder’s device such as a device serial number (e.g.,
             * International Mobile Equipment Identity [IMEI]). Must be at least 15 characters.
             */
            public Builder setCustomerDeviceId(EmptyParam customerDeviceId) {
              this.customerDeviceId = customerDeviceId;
              return this;
            }

            /** The email address of the customer. */
            public Builder setCustomerEmailAddress(String customerEmailAddress) {
              this.customerEmailAddress = customerEmailAddress;
              return this;
            }

            /** The email address of the customer. */
            public Builder setCustomerEmailAddress(EmptyParam customerEmailAddress) {
              this.customerEmailAddress = customerEmailAddress;
              return this;
            }

            /** The IP address that the customer used when making the purchase. */
            public Builder setCustomerPurchaseIp(String customerPurchaseIp) {
              this.customerPurchaseIp = customerPurchaseIp;
              return this;
            }

            /** The IP address that the customer used when making the purchase. */
            public Builder setCustomerPurchaseIp(EmptyParam customerPurchaseIp) {
              this.customerPurchaseIp = customerPurchaseIp;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.PriorUndisputedTransaction#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.PriorUndisputedTransaction#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A description of the product or service that was sold. */
            public Builder setProductDescription(String productDescription) {
              this.productDescription = productDescription;
              return this;
            }

            /** A description of the product or service that was sold. */
            public Builder setProductDescription(EmptyParam productDescription) {
              this.productDescription = productDescription;
              return this;
            }

            /**
             * The address to which a physical product was shipped. All fields are required for Visa
             * Compelling Evidence 3.0 evidence submission.
             */
            public Builder setShippingAddress(
                DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                        .PriorUndisputedTransaction.ShippingAddress
                    shippingAddress) {
              this.shippingAddress = shippingAddress;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class ShippingAddress {
            /** City, district, suburb, town, or village. */
            @SerializedName("city")
            Object city;

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            @SerializedName("country")
            Object country;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Address line 1, such as the street, PO Box, or company name. */
            @SerializedName("line1")
            Object line1;

            /** Address line 2, such as the apartment, suite, unit, or building. */
            @SerializedName("line2")
            Object line2;

            /** ZIP or postal code. */
            @SerializedName("postal_code")
            Object postalCode;

            /** State, county, province, or region. */
            @SerializedName("state")
            Object state;

            private ShippingAddress(
                Object city,
                Object country,
                Map<String, Object> extraParams,
                Object line1,
                Object line2,
                Object postalCode,
                Object state) {
              this.city = city;
              this.country = country;
              this.extraParams = extraParams;
              this.line1 = line1;
              this.line2 = line2;
              this.postalCode = postalCode;
              this.state = state;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Object city;

              private Object country;

              private Map<String, Object> extraParams;

              private Object line1;

              private Object line2;

              private Object postalCode;

              private Object state;

              /** Finalize and obtain parameter instance from this builder. */
              public DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                      .PriorUndisputedTransaction.ShippingAddress
                  build() {
                return new DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3
                    .PriorUndisputedTransaction.ShippingAddress(
                    this.city,
                    this.country,
                    this.extraParams,
                    this.line1,
                    this.line2,
                    this.postalCode,
                    this.state);
              }

              /** City, district, suburb, town, or village. */
              public Builder setCity(String city) {
                this.city = city;
                return this;
              }

              /** City, district, suburb, town, or village. */
              public Builder setCity(EmptyParam city) {
                this.city = city;
                return this;
              }

              /**
               * Two-letter country code (<a
               * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
               */
              public Builder setCountry(String country) {
                this.country = country;
                return this;
              }

              /**
               * Two-letter country code (<a
               * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
               */
              public Builder setCountry(EmptyParam country) {
                this.country = country;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.PriorUndisputedTransaction.ShippingAddress#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompellingEvidence3.PriorUndisputedTransaction.ShippingAddress#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Address line 1, such as the street, PO Box, or company name. */
              public Builder setLine1(String line1) {
                this.line1 = line1;
                return this;
              }

              /** Address line 1, such as the street, PO Box, or company name. */
              public Builder setLine1(EmptyParam line1) {
                this.line1 = line1;
                return this;
              }

              /** Address line 2, such as the apartment, suite, unit, or building. */
              public Builder setLine2(String line2) {
                this.line2 = line2;
                return this;
              }

              /** Address line 2, such as the apartment, suite, unit, or building. */
              public Builder setLine2(EmptyParam line2) {
                this.line2 = line2;
                return this;
              }

              /** ZIP or postal code. */
              public Builder setPostalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
              }

              /** ZIP or postal code. */
              public Builder setPostalCode(EmptyParam postalCode) {
                this.postalCode = postalCode;
                return this;
              }

              /** State, county, province, or region. */
              public Builder setState(String state) {
                this.state = state;
                return this;
              }

              /** State, county, province, or region. */
              public Builder setState(EmptyParam state) {
                this.state = state;
                return this;
              }
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class VisaCompliance {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * A field acknowledging the fee incurred when countering a Visa compliance dispute. If this
         * field is set to true, evidence can be submitted for the compliance dispute. Stripe
         * collects a 500 USD (or local equivalent) amount to cover the network costs associated
         * with resolving compliance disputes. Stripe refunds the 500 USD network fee if you win the
         * dispute.
         */
        @SerializedName("fee_acknowledged")
        Boolean feeAcknowledged;

        private VisaCompliance(Map<String, Object> extraParams, Boolean feeAcknowledged) {
          this.extraParams = extraParams;
          this.feeAcknowledged = feeAcknowledged;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Boolean feeAcknowledged;

          /** Finalize and obtain parameter instance from this builder. */
          public DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompliance build() {
            return new DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompliance(
                this.extraParams, this.feeAcknowledged);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompliance#extraParams} for the field
           * documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * DisputeUpdateParams.Evidence.EnhancedEvidence.VisaCompliance#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * A field acknowledging the fee incurred when countering a Visa compliance dispute. If
           * this field is set to true, evidence can be submitted for the compliance dispute. Stripe
           * collects a 500 USD (or local equivalent) amount to cover the network costs associated
           * with resolving compliance disputes. Stripe refunds the 500 USD network fee if you win
           * the dispute.
           */
          public Builder setFeeAcknowledged(Boolean feeAcknowledged) {
            this.feeAcknowledged = feeAcknowledged;
            return this;
          }
        }
      }
    }
  }

  public enum IntendedSubmissionMethod implements ApiRequestParams.EnumParam {
    @SerializedName("manual")
    MANUAL("manual"),

    @SerializedName("prefer_manual")
    PREFER_MANUAL("prefer_manual"),

    @SerializedName("prefer_smart_disputes")
    PREFER_SMART_DISPUTES("prefer_smart_disputes"),

    @SerializedName("smart_disputes")
    SMART_DISPUTES("smart_disputes");

    @Getter(onMethod_ = {@Override})
    private final String value;

    IntendedSubmissionMethod(String value) {
      this.value = value;
    }
  }
}
