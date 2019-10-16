package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
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

  /**
   * A set of key-value pairs that you can attach to a dispute object. This can be useful for
   * storing additional information about the dispute in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Whether to immediately submit evidence to the bank. If `false`, evidence is staged on the
   * dispute. Staged evidence is visible in the API and Dashboard, and can be submitted to the bank
   * by making another request with this attribute set to `true` (the default).
   */
  @SerializedName("submit")
  Boolean submit;

  private DisputeUpdateParams(
      Evidence evidence,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Boolean submit) {
    this.evidence = evidence;
    this.expand = expand;
    this.extraParams = extraParams;
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

    private Map<String, String> metadata;

    private Boolean submit;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeUpdateParams build() {
      return new DisputeUpdateParams(
          this.evidence, this.expand, this.extraParams, this.metadata, this.submit);
    }

    /**
     * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all
     * fields in the hash for review. The combined character count of all fields is limited to
     * 150,000.
     */
    public Builder setEvidence(Evidence evidence) {
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

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Whether to immediately submit evidence to the bank. If `false`, evidence is staged on the
     * dispute. Staged evidence is visible in the API and Dashboard, and can be submitted to the
     * bank by making another request with this attribute set to `true` (the default).
     */
    public Builder setSubmit(Boolean submit) {
      this.submit = submit;
      return this;
    }
  }

  @Getter
  public static class Evidence {
    /** Has a maximum character count of 20,000. */
    @SerializedName("access_activity_log")
    Object accessActivityLog;

    @SerializedName("billing_address")
    Object billingAddress;

    @SerializedName("cancellation_policy")
    Object cancellationPolicy;

    /** Has a maximum character count of 20,000. */
    @SerializedName("cancellation_policy_disclosure")
    Object cancellationPolicyDisclosure;

    /** Has a maximum character count of 20,000. */
    @SerializedName("cancellation_rebuttal")
    Object cancellationRebuttal;

    @SerializedName("customer_communication")
    Object customerCommunication;

    @SerializedName("customer_email_address")
    Object customerEmailAddress;

    @SerializedName("customer_name")
    Object customerName;

    @SerializedName("customer_purchase_ip")
    Object customerPurchaseIp;

    @SerializedName("customer_signature")
    Object customerSignature;

    @SerializedName("duplicate_charge_documentation")
    Object duplicateChargeDocumentation;

    /** Has a maximum character count of 20,000. */
    @SerializedName("duplicate_charge_explanation")
    Object duplicateChargeExplanation;

    @SerializedName("duplicate_charge_id")
    Object duplicateChargeId;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Has a maximum character count of 20,000. */
    @SerializedName("product_description")
    Object productDescription;

    @SerializedName("receipt")
    Object receipt;

    @SerializedName("refund_policy")
    Object refundPolicy;

    /** Has a maximum character count of 20,000. */
    @SerializedName("refund_policy_disclosure")
    Object refundPolicyDisclosure;

    /** Has a maximum character count of 20,000. */
    @SerializedName("refund_refusal_explanation")
    Object refundRefusalExplanation;

    @SerializedName("service_date")
    Object serviceDate;

    @SerializedName("service_documentation")
    Object serviceDocumentation;

    @SerializedName("shipping_address")
    Object shippingAddress;

    @SerializedName("shipping_carrier")
    Object shippingCarrier;

    @SerializedName("shipping_date")
    Object shippingDate;

    @SerializedName("shipping_documentation")
    Object shippingDocumentation;

    @SerializedName("shipping_tracking_number")
    Object shippingTrackingNumber;

    @SerializedName("uncategorized_file")
    Object uncategorizedFile;

    /** Has a maximum character count of 20,000. */
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
      public Evidence build() {
        return new Evidence(
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

      /** Has a maximum character count of 20,000. */
      public Builder setAccessActivityLog(String accessActivityLog) {
        this.accessActivityLog = accessActivityLog;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setAccessActivityLog(EmptyParam accessActivityLog) {
        this.accessActivityLog = accessActivityLog;
        return this;
      }

      public Builder setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
        return this;
      }

      public Builder setBillingAddress(EmptyParam billingAddress) {
        this.billingAddress = billingAddress;
        return this;
      }

      public Builder setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        return this;
      }

      public Builder setCancellationPolicy(EmptyParam cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
        this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setCancellationPolicyDisclosure(EmptyParam cancellationPolicyDisclosure) {
        this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setCancellationRebuttal(String cancellationRebuttal) {
        this.cancellationRebuttal = cancellationRebuttal;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setCancellationRebuttal(EmptyParam cancellationRebuttal) {
        this.cancellationRebuttal = cancellationRebuttal;
        return this;
      }

      public Builder setCustomerCommunication(String customerCommunication) {
        this.customerCommunication = customerCommunication;
        return this;
      }

      public Builder setCustomerCommunication(EmptyParam customerCommunication) {
        this.customerCommunication = customerCommunication;
        return this;
      }

      public Builder setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
      }

      public Builder setCustomerEmailAddress(EmptyParam customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
      }

      public Builder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
      }

      public Builder setCustomerName(EmptyParam customerName) {
        this.customerName = customerName;
        return this;
      }

      public Builder setCustomerPurchaseIp(String customerPurchaseIp) {
        this.customerPurchaseIp = customerPurchaseIp;
        return this;
      }

      public Builder setCustomerPurchaseIp(EmptyParam customerPurchaseIp) {
        this.customerPurchaseIp = customerPurchaseIp;
        return this;
      }

      public Builder setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
        return this;
      }

      public Builder setCustomerSignature(EmptyParam customerSignature) {
        this.customerSignature = customerSignature;
        return this;
      }

      public Builder setDuplicateChargeDocumentation(String duplicateChargeDocumentation) {
        this.duplicateChargeDocumentation = duplicateChargeDocumentation;
        return this;
      }

      public Builder setDuplicateChargeDocumentation(EmptyParam duplicateChargeDocumentation) {
        this.duplicateChargeDocumentation = duplicateChargeDocumentation;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setDuplicateChargeExplanation(String duplicateChargeExplanation) {
        this.duplicateChargeExplanation = duplicateChargeExplanation;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setDuplicateChargeExplanation(EmptyParam duplicateChargeExplanation) {
        this.duplicateChargeExplanation = duplicateChargeExplanation;
        return this;
      }

      public Builder setDuplicateChargeId(String duplicateChargeId) {
        this.duplicateChargeId = duplicateChargeId;
        return this;
      }

      public Builder setDuplicateChargeId(EmptyParam duplicateChargeId) {
        this.duplicateChargeId = duplicateChargeId;
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

      /** Has a maximum character count of 20,000. */
      public Builder setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setProductDescription(EmptyParam productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      public Builder setReceipt(String receipt) {
        this.receipt = receipt;
        return this;
      }

      public Builder setReceipt(EmptyParam receipt) {
        this.receipt = receipt;
        return this;
      }

      public Builder setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy;
        return this;
      }

      public Builder setRefundPolicy(EmptyParam refundPolicy) {
        this.refundPolicy = refundPolicy;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setRefundPolicyDisclosure(String refundPolicyDisclosure) {
        this.refundPolicyDisclosure = refundPolicyDisclosure;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setRefundPolicyDisclosure(EmptyParam refundPolicyDisclosure) {
        this.refundPolicyDisclosure = refundPolicyDisclosure;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setRefundRefusalExplanation(String refundRefusalExplanation) {
        this.refundRefusalExplanation = refundRefusalExplanation;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setRefundRefusalExplanation(EmptyParam refundRefusalExplanation) {
        this.refundRefusalExplanation = refundRefusalExplanation;
        return this;
      }

      public Builder setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
        return this;
      }

      public Builder setServiceDate(EmptyParam serviceDate) {
        this.serviceDate = serviceDate;
        return this;
      }

      public Builder setServiceDocumentation(String serviceDocumentation) {
        this.serviceDocumentation = serviceDocumentation;
        return this;
      }

      public Builder setServiceDocumentation(EmptyParam serviceDocumentation) {
        this.serviceDocumentation = serviceDocumentation;
        return this;
      }

      public Builder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      public Builder setShippingAddress(EmptyParam shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      public Builder setShippingCarrier(String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
      }

      public Builder setShippingCarrier(EmptyParam shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
      }

      public Builder setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
        return this;
      }

      public Builder setShippingDate(EmptyParam shippingDate) {
        this.shippingDate = shippingDate;
        return this;
      }

      public Builder setShippingDocumentation(String shippingDocumentation) {
        this.shippingDocumentation = shippingDocumentation;
        return this;
      }

      public Builder setShippingDocumentation(EmptyParam shippingDocumentation) {
        this.shippingDocumentation = shippingDocumentation;
        return this;
      }

      public Builder setShippingTrackingNumber(String shippingTrackingNumber) {
        this.shippingTrackingNumber = shippingTrackingNumber;
        return this;
      }

      public Builder setShippingTrackingNumber(EmptyParam shippingTrackingNumber) {
        this.shippingTrackingNumber = shippingTrackingNumber;
        return this;
      }

      public Builder setUncategorizedFile(String uncategorizedFile) {
        this.uncategorizedFile = uncategorizedFile;
        return this;
      }

      public Builder setUncategorizedFile(EmptyParam uncategorizedFile) {
        this.uncategorizedFile = uncategorizedFile;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setUncategorizedText(String uncategorizedText) {
        this.uncategorizedText = uncategorizedText;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setUncategorizedText(EmptyParam uncategorizedText) {
        this.uncategorizedText = uncategorizedText;
        return this;
      }
    }
  }
}
