package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class DisputeCreateParams extends ApiRequestParams {

  /**
   * Amount to dispute, defaults to full value, given in the currency the transaction was made in.
   */
  @SerializedName("amount")
  Long amount;

  /** The ID of the issuing transaction to create a dispute for. */
  @SerializedName("disputed_transaction")
  String disputedTransaction;

  /**
   * A hash containing all the evidence related to the dispute. This should have a single key, equal
   * to the provided `reason`, mapping to an appropriate evidence object.
   */
  @SerializedName("evidence")
  DisputeCreateParams.Evidence evidence;

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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The reason for the dispute. One of `other` or `fraudulent`. */
  @SerializedName("reason")
  DisputeCreateParams.Reason reason;

  private DisputeCreateParams(
      Long amount,
      String disputedTransaction,
      DisputeCreateParams.Evidence evidence,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      DisputeCreateParams.Reason reason) {

    this.amount = amount;
    this.disputedTransaction = disputedTransaction;
    this.evidence = evidence;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.reason = reason;
  }

  public static DisputeCreateParams.Builder builder() {
    return new DisputeCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;
    private String disputedTransaction;
    private DisputeCreateParams.Evidence evidence;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;
    private DisputeCreateParams.Reason reason;

    public DisputeCreateParams build() {
      return new DisputeCreateParams(
          this.amount,
          this.disputedTransaction,
          this.evidence,
          this.expand,
          this.extraParams,
          this.metadata,
          this.reason);
    }

    /**
     * Amount to dispute, defaults to full value, given in the currency the transaction was made in.
     */
    public DisputeCreateParams.Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** The ID of the issuing transaction to create a dispute for. */
    public DisputeCreateParams.Builder setDisputedTransaction(String disputedTransaction) {

      this.disputedTransaction = disputedTransaction;
      return this;
    }

    /**
     * A hash containing all the evidence related to the dispute. This should have a single key,
     * equal to the provided `reason`, mapping to an appropriate evidence object.
     */
    public DisputeCreateParams.Builder setEvidence(DisputeCreateParams.Evidence evidence) {

      this.evidence = evidence;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeCreateParams#expand} for the field documentation.
     */
    public DisputeCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeCreateParams#expand} for the field documentation.
     */
    public DisputeCreateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeCreateParams#extraParams} for the field documentation.
     */
    public DisputeCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeCreateParams#extraParams} for the field documentation.
     */
    public DisputeCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeCreateParams#metadata} for the field documentation.
     */
    public DisputeCreateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeCreateParams#metadata} for the field documentation.
     */
    public DisputeCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The reason for the dispute. One of `other` or `fraudulent`. */
    public DisputeCreateParams.Builder setReason(DisputeCreateParams.Reason reason) {

      this.reason = reason;
      return this;
    }
  }

  public static class Evidence {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Evidence to support a fraudulent dispute. Only provide this if your dispute's `reason` is
     * `fraudulent`.
     */
    @SerializedName("fraudulent")
    DisputeCreateParams.Evidence.Fraudulent fraudulent;

    /**
     * Evidence to support an uncategorized dispute. Only provide this if your dispute's `reason` is
     * `other`.
     */
    @SerializedName("other")
    DisputeCreateParams.Evidence.Other other;

    private Evidence(
        Map<String, Object> extraParams,
        DisputeCreateParams.Evidence.Fraudulent fraudulent,
        DisputeCreateParams.Evidence.Other other) {

      this.extraParams = extraParams;
      this.fraudulent = fraudulent;
      this.other = other;
    }

    public static DisputeCreateParams.Evidence.Builder builder() {
      return new DisputeCreateParams.Evidence.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private DisputeCreateParams.Evidence.Fraudulent fraudulent;
      private DisputeCreateParams.Evidence.Other other;

      public DisputeCreateParams.Evidence build() {
        return new DisputeCreateParams.Evidence(this.extraParams, this.fraudulent, this.other);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeCreateParams.Evidence#extraParams} for the field documentation.
       */
      public DisputeCreateParams.Evidence.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link DisputeCreateParams.Evidence#extraParams} for the field documentation.
       */
      public DisputeCreateParams.Evidence.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Evidence to support a fraudulent dispute. Only provide this if your dispute's `reason` is
       * `fraudulent`.
       */
      public DisputeCreateParams.Evidence.Builder setFraudulent(
          DisputeCreateParams.Evidence.Fraudulent fraudulent) {

        this.fraudulent = fraudulent;
        return this;
      }

      /**
       * Evidence to support an uncategorized dispute. Only provide this if your dispute's `reason`
       * is `other`.
       */
      public DisputeCreateParams.Evidence.Builder setOther(
          DisputeCreateParams.Evidence.Other other) {

        this.other = other;
        return this;
      }
    }

    public static class Fraudulent {

      /** Brief freeform text explaining why you are disputing this transaction. */
      @SerializedName("dispute_explanation")
      String disputeExplanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file
       * evidence supporting your dispute.
       */
      @SerializedName("uncategorized_file")
      String uncategorizedFile;

      private Fraudulent(
          String disputeExplanation, Map<String, Object> extraParams, String uncategorizedFile) {

        this.disputeExplanation = disputeExplanation;
        this.extraParams = extraParams;
        this.uncategorizedFile = uncategorizedFile;
      }

      public static DisputeCreateParams.Evidence.Fraudulent.Builder builder() {

        return new DisputeCreateParams.Evidence.Fraudulent.Builder();
      }

      public static class Builder {
        private String disputeExplanation;
        private Map<String, Object> extraParams;
        private String uncategorizedFile;

        public DisputeCreateParams.Evidence.Fraudulent build() {
          return new DisputeCreateParams.Evidence.Fraudulent(
              this.disputeExplanation, this.extraParams, this.uncategorizedFile);
        }

        /** Brief freeform text explaining why you are disputing this transaction. */
        public DisputeCreateParams.Evidence.Fraudulent.Builder setDisputeExplanation(
            String disputeExplanation) {

          this.disputeExplanation = disputeExplanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeCreateParams.Evidence.Fraudulent#extraParams} for the field
         * documentation.
         */
        public DisputeCreateParams.Evidence.Fraudulent.Builder putExtraParam(
            String key, Object value) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeCreateParams.Evidence.Fraudulent#extraParams} for the field
         * documentation.
         */
        public DisputeCreateParams.Evidence.Fraudulent.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file
         * evidence supporting your dispute.
         */
        public DisputeCreateParams.Evidence.Fraudulent.Builder setUncategorizedFile(
            String uncategorizedFile) {

          this.uncategorizedFile = uncategorizedFile;
          return this;
        }
      }
    }

    public static class Other {

      /** Brief freeform text explaining why you are disputing this transaction. */
      @SerializedName("dispute_explanation")
      String disputeExplanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file
       * evidence supporting your dispute.
       */
      @SerializedName("uncategorized_file")
      String uncategorizedFile;

      private Other(
          String disputeExplanation, Map<String, Object> extraParams, String uncategorizedFile) {

        this.disputeExplanation = disputeExplanation;
        this.extraParams = extraParams;
        this.uncategorizedFile = uncategorizedFile;
      }

      public static DisputeCreateParams.Evidence.Other.Builder builder() {
        return new DisputeCreateParams.Evidence.Other.Builder();
      }

      public static class Builder {
        private String disputeExplanation;
        private Map<String, Object> extraParams;
        private String uncategorizedFile;

        public DisputeCreateParams.Evidence.Other build() {
          return new DisputeCreateParams.Evidence.Other(
              this.disputeExplanation, this.extraParams, this.uncategorizedFile);
        }

        /** Brief freeform text explaining why you are disputing this transaction. */
        public DisputeCreateParams.Evidence.Other.Builder setDisputeExplanation(
            String disputeExplanation) {

          this.disputeExplanation = disputeExplanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeCreateParams.Evidence.Other#extraParams} for the field
         * documentation.
         */
        public DisputeCreateParams.Evidence.Other.Builder putExtraParam(String key, Object value) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeCreateParams.Evidence.Other#extraParams} for the field
         * documentation.
         */
        public DisputeCreateParams.Evidence.Other.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file
         * evidence supporting your dispute.
         */
        public DisputeCreateParams.Evidence.Other.Builder setUncategorizedFile(
            String uncategorizedFile) {

          this.uncategorizedFile = uncategorizedFile;
          return this;
        }
      }
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),
    @SerializedName("other")
    OTHER("other");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Reason(String value) {
      this.value = value;
    }
  }
}
