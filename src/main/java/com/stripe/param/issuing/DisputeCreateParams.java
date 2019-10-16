package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The reason for the dispute. One of `other` or `fraudulent`. */
  @SerializedName("reason")
  Reason reason;

  private DisputeCreateParams(
      Long amount,
      String disputedTransaction,
      Evidence evidence,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Reason reason) {
    this.amount = amount;
    this.disputedTransaction = disputedTransaction;
    this.evidence = evidence;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.reason = reason;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String disputedTransaction;

    private Evidence evidence;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Reason reason;

    /** Finalize and obtain parameter instance from this builder. */
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
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** The ID of the issuing transaction to create a dispute for. */
    public Builder setDisputedTransaction(String disputedTransaction) {
      this.disputedTransaction = disputedTransaction;
      return this;
    }

    /**
     * A hash containing all the evidence related to the dispute. This should have a single key,
     * equal to the provided `reason`, mapping to an appropriate evidence object.
     */
    public Builder setEvidence(Evidence evidence) {
      this.evidence = evidence;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeCreateParams#expand} for the field documentation.
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
     * DisputeCreateParams#expand} for the field documentation.
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
     * DisputeCreateParams#extraParams} for the field documentation.
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
     * See {@link DisputeCreateParams#extraParams} for the field documentation.
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
     * DisputeCreateParams#metadata} for the field documentation.
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
     * See {@link DisputeCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The reason for the dispute. One of `other` or `fraudulent`. */
    public Builder setReason(Reason reason) {
      this.reason = reason;
      return this;
    }
  }

  @Getter
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
    Fraudulent fraudulent;

    /**
     * Evidence to support an uncategorized dispute. Only provide this if your dispute's `reason` is
     * `other`.
     */
    @SerializedName("other")
    Other other;

    private Evidence(Map<String, Object> extraParams, Fraudulent fraudulent, Other other) {
      this.extraParams = extraParams;
      this.fraudulent = fraudulent;
      this.other = other;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Fraudulent fraudulent;

      private Other other;

      /** Finalize and obtain parameter instance from this builder. */
      public Evidence build() {
        return new Evidence(this.extraParams, this.fraudulent, this.other);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeCreateParams.Evidence#extraParams} for the field documentation.
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
       * See {@link DisputeCreateParams.Evidence#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
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
      public Builder setFraudulent(Fraudulent fraudulent) {
        this.fraudulent = fraudulent;
        return this;
      }

      /**
       * Evidence to support an uncategorized dispute. Only provide this if your dispute's `reason`
       * is `other`.
       */
      public Builder setOther(Other other) {
        this.other = other;
        return this;
      }
    }

    @Getter
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String disputeExplanation;

        private Map<String, Object> extraParams;

        private String uncategorizedFile;

        /** Finalize and obtain parameter instance from this builder. */
        public Fraudulent build() {
          return new Fraudulent(this.disputeExplanation, this.extraParams, this.uncategorizedFile);
        }

        /** Brief freeform text explaining why you are disputing this transaction. */
        public Builder setDisputeExplanation(String disputeExplanation) {
          this.disputeExplanation = disputeExplanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeCreateParams.Evidence.Fraudulent#extraParams} for the field
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
         * map. See {@link DisputeCreateParams.Evidence.Fraudulent#extraParams} for the field
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
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file
         * evidence supporting your dispute.
         */
        public Builder setUncategorizedFile(String uncategorizedFile) {
          this.uncategorizedFile = uncategorizedFile;
          return this;
        }
      }
    }

    @Getter
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String disputeExplanation;

        private Map<String, Object> extraParams;

        private String uncategorizedFile;

        /** Finalize and obtain parameter instance from this builder. */
        public Other build() {
          return new Other(this.disputeExplanation, this.extraParams, this.uncategorizedFile);
        }

        /** Brief freeform text explaining why you are disputing this transaction. */
        public Builder setDisputeExplanation(String disputeExplanation) {
          this.disputeExplanation = disputeExplanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeCreateParams.Evidence.Other#extraParams} for the field
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
         * map. See {@link DisputeCreateParams.Evidence.Other#extraParams} for the field
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
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file
         * evidence supporting your dispute.
         */
        public Builder setUncategorizedFile(String uncategorizedFile) {
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

    Reason(String value) {
      this.value = value;
    }
  }
}
