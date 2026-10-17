// File generated from our OpenAPI spec
package com.stripe.param.risk;

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
public class FormUpdateParams extends ApiRequestParams {
  /** Provide this for Forms of type {@code appeal}. */
  @SerializedName("appeal")
  Appeal appeal;

  /** Provide this for Forms of type {@code authorization_documents}. */
  @SerializedName("authorization_documents")
  AuthorizationDocuments authorizationDocuments;

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

  /** Provide this for Forms of type {@code payment_processing}. */
  @SerializedName("payment_processing")
  PaymentProcessing paymentProcessing;

  /** Provide this for Forms of type {@code product_removal}. */
  @SerializedName("product_removal")
  ProductRemoval productRemoval;

  /** Provide this for Forms of type {@code reviewed_fields}. */
  @SerializedName("reviewed_fields")
  ReviewedFields reviewedFields;

  /** Provide this for Forms of type {@code self_funding_context}. */
  @SerializedName("self_funding_context")
  SelfFundingContext selfFundingContext;

  /** Provide this for Forms of type {@code transaction_context}. */
  @SerializedName("transaction_context")
  TransactionContext transactionContext;

  private FormUpdateParams(
      Appeal appeal,
      AuthorizationDocuments authorizationDocuments,
      List<String> expand,
      Map<String, Object> extraParams,
      PaymentProcessing paymentProcessing,
      ProductRemoval productRemoval,
      ReviewedFields reviewedFields,
      SelfFundingContext selfFundingContext,
      TransactionContext transactionContext) {
    this.appeal = appeal;
    this.authorizationDocuments = authorizationDocuments;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentProcessing = paymentProcessing;
    this.productRemoval = productRemoval;
    this.reviewedFields = reviewedFields;
    this.selfFundingContext = selfFundingContext;
    this.transactionContext = transactionContext;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Appeal appeal;

    private AuthorizationDocuments authorizationDocuments;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private PaymentProcessing paymentProcessing;

    private ProductRemoval productRemoval;

    private ReviewedFields reviewedFields;

    private SelfFundingContext selfFundingContext;

    private TransactionContext transactionContext;

    /** Finalize and obtain parameter instance from this builder. */
    public FormUpdateParams build() {
      return new FormUpdateParams(
          this.appeal,
          this.authorizationDocuments,
          this.expand,
          this.extraParams,
          this.paymentProcessing,
          this.productRemoval,
          this.reviewedFields,
          this.selfFundingContext,
          this.transactionContext);
    }

    /** Provide this for Forms of type {@code appeal}. */
    public Builder setAppeal(FormUpdateParams.Appeal appeal) {
      this.appeal = appeal;
      return this;
    }

    /** Provide this for Forms of type {@code authorization_documents}. */
    public Builder setAuthorizationDocuments(
        FormUpdateParams.AuthorizationDocuments authorizationDocuments) {
      this.authorizationDocuments = authorizationDocuments;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FormUpdateParams#expand} for the field documentation.
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
     * FormUpdateParams#expand} for the field documentation.
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
     * FormUpdateParams#extraParams} for the field documentation.
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
     * See {@link FormUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Provide this for Forms of type {@code payment_processing}. */
    public Builder setPaymentProcessing(FormUpdateParams.PaymentProcessing paymentProcessing) {
      this.paymentProcessing = paymentProcessing;
      return this;
    }

    /** Provide this for Forms of type {@code product_removal}. */
    public Builder setProductRemoval(FormUpdateParams.ProductRemoval productRemoval) {
      this.productRemoval = productRemoval;
      return this;
    }

    /** Provide this for Forms of type {@code reviewed_fields}. */
    public Builder setReviewedFields(FormUpdateParams.ReviewedFields reviewedFields) {
      this.reviewedFields = reviewedFields;
      return this;
    }

    /** Provide this for Forms of type {@code self_funding_context}. */
    public Builder setSelfFundingContext(FormUpdateParams.SelfFundingContext selfFundingContext) {
      this.selfFundingContext = selfFundingContext;
      return this;
    }

    /** Provide this for Forms of type {@code transaction_context}. */
    public Builder setTransactionContext(FormUpdateParams.TransactionContext transactionContext) {
      this.transactionContext = transactionContext;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Appeal {
    /** <strong>Required.</strong> A text explanation for the appeal. */
    @SerializedName("explanation")
    Object explanation;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Appeal(Object explanation, Map<String, Object> extraParams) {
      this.explanation = explanation;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object explanation;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.Appeal build() {
        return new FormUpdateParams.Appeal(this.explanation, this.extraParams);
      }

      /** <strong>Required.</strong> A text explanation for the appeal. */
      public Builder setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
      }

      /** <strong>Required.</strong> A text explanation for the appeal. */
      public Builder setExplanation(EmptyParam explanation) {
        this.explanation = explanation;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.Appeal#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.Appeal#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationDocuments {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> IDs of uploaded files to attach as authorization documents. */
    @SerializedName("files")
    List<String> files;

    private AuthorizationDocuments(Map<String, Object> extraParams, List<String> files) {
      this.extraParams = extraParams;
      this.files = files;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<String> files;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.AuthorizationDocuments build() {
        return new FormUpdateParams.AuthorizationDocuments(this.extraParams, this.files);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.AuthorizationDocuments#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.AuthorizationDocuments#extraParams} for the field
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
       * Add an element to `files` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * FormUpdateParams.AuthorizationDocuments#files} for the field documentation.
       */
      public Builder addFile(String element) {
        if (this.files == null) {
          this.files = new ArrayList<>();
        }
        this.files.add(element);
        return this;
      }

      /**
       * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * FormUpdateParams.AuthorizationDocuments#files} for the field documentation.
       */
      public Builder addAllFile(List<String> elements) {
        if (this.files == null) {
          this.files = new ArrayList<>();
        }
        this.files.addAll(elements);
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentProcessing {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Payments the connected account accepts outside Stripe. */
    @SerializedName("multi_processor")
    MultiProcessor multiProcessor;

    /** How the connected account uses Stripe. */
    @SerializedName("purpose")
    Object purpose;

    /** Why the connected account chose Stripe. */
    @SerializedName("stripe_selection_rationale")
    Object stripeSelectionRationale;

    private PaymentProcessing(
        Map<String, Object> extraParams,
        MultiProcessor multiProcessor,
        Object purpose,
        Object stripeSelectionRationale) {
      this.extraParams = extraParams;
      this.multiProcessor = multiProcessor;
      this.purpose = purpose;
      this.stripeSelectionRationale = stripeSelectionRationale;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private MultiProcessor multiProcessor;

      private Object purpose;

      private Object stripeSelectionRationale;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.PaymentProcessing build() {
        return new FormUpdateParams.PaymentProcessing(
            this.extraParams, this.multiProcessor, this.purpose, this.stripeSelectionRationale);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.PaymentProcessing#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.PaymentProcessing#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Payments the connected account accepts outside Stripe. */
      public Builder setMultiProcessor(
          FormUpdateParams.PaymentProcessing.MultiProcessor multiProcessor) {
        this.multiProcessor = multiProcessor;
        return this;
      }

      /** How the connected account uses Stripe. */
      public Builder setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
      }

      /** How the connected account uses Stripe. */
      public Builder setPurpose(EmptyParam purpose) {
        this.purpose = purpose;
        return this;
      }

      /** Why the connected account chose Stripe. */
      public Builder setStripeSelectionRationale(String stripeSelectionRationale) {
        this.stripeSelectionRationale = stripeSelectionRationale;
        return this;
      }

      /** Why the connected account chose Stripe. */
      public Builder setStripeSelectionRationale(EmptyParam stripeSelectionRationale) {
        this.stripeSelectionRationale = stripeSelectionRationale;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MultiProcessor {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Files evidencing payments accepted outside Stripe. Each entry carries a tag naming the
       * document type so a reviewer can distinguish statement types without opening the file.
       */
      @SerializedName("files")
      List<FormUpdateParams.PaymentProcessing.MultiProcessor.File> files;

      /** Whether the connected account accepts payments outside Stripe. */
      @SerializedName("value")
      Object value;

      private MultiProcessor(
          Map<String, Object> extraParams,
          List<FormUpdateParams.PaymentProcessing.MultiProcessor.File> files,
          Object value) {
        this.extraParams = extraParams;
        this.files = files;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<FormUpdateParams.PaymentProcessing.MultiProcessor.File> files;

        private Object value;

        /** Finalize and obtain parameter instance from this builder. */
        public FormUpdateParams.PaymentProcessing.MultiProcessor build() {
          return new FormUpdateParams.PaymentProcessing.MultiProcessor(
              this.extraParams, this.files, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormUpdateParams.PaymentProcessing.MultiProcessor#extraParams} for the
         * field documentation.
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
         * map. See {@link FormUpdateParams.PaymentProcessing.MultiProcessor#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.PaymentProcessing.MultiProcessor#files} for the field documentation.
         */
        public Builder addFile(FormUpdateParams.PaymentProcessing.MultiProcessor.File element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.PaymentProcessing.MultiProcessor#files} for the field documentation.
         */
        public Builder addAllFile(
            List<FormUpdateParams.PaymentProcessing.MultiProcessor.File> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }

        /** Whether the connected account accepts payments outside Stripe. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }

        /** Whether the connected account accepts payments outside Stripe. */
        public Builder setValue(EmptyParam value) {
          this.value = value;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class File {
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
         * <strong>Required.</strong> ID of the uploaded file. Upload using /v1/files before
         * referencing it here.
         */
        @SerializedName("file")
        Object file;

        /**
         * What kind of document this is. One of alt_financial_statements, recent_bank_statements,
         * or payment_receipt.
         */
        @SerializedName("tag")
        Object tag;

        private File(Map<String, Object> extraParams, Object file, Object tag) {
          this.extraParams = extraParams;
          this.file = file;
          this.tag = tag;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object file;

          private Object tag;

          /** Finalize and obtain parameter instance from this builder. */
          public FormUpdateParams.PaymentProcessing.MultiProcessor.File build() {
            return new FormUpdateParams.PaymentProcessing.MultiProcessor.File(
                this.extraParams, this.file, this.tag);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link FormUpdateParams.PaymentProcessing.MultiProcessor.File#extraParams} for
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
           * map. See {@link FormUpdateParams.PaymentProcessing.MultiProcessor.File#extraParams} for
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
           * <strong>Required.</strong> ID of the uploaded file. Upload using /v1/files before
           * referencing it here.
           */
          public Builder setFile(String file) {
            this.file = file;
            return this;
          }

          /**
           * <strong>Required.</strong> ID of the uploaded file. Upload using /v1/files before
           * referencing it here.
           */
          public Builder setFile(EmptyParam file) {
            this.file = file;
            return this;
          }

          /**
           * What kind of document this is. One of alt_financial_statements, recent_bank_statements,
           * or payment_receipt.
           */
          public Builder setTag(String tag) {
            this.tag = tag;
            return this;
          }

          /**
           * What kind of document this is. One of alt_financial_statements, recent_bank_statements,
           * or payment_receipt.
           */
          public Builder setTag(EmptyParam tag) {
            this.tag = tag;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ProductRemoval {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The Unix timestamp when the prohibited items were removed. */
    @SerializedName("items_removed_at")
    Long itemsRemovedAt;

    private ProductRemoval(Map<String, Object> extraParams, Long itemsRemovedAt) {
      this.extraParams = extraParams;
      this.itemsRemovedAt = itemsRemovedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long itemsRemovedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.ProductRemoval build() {
        return new FormUpdateParams.ProductRemoval(this.extraParams, this.itemsRemovedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.ProductRemoval#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.ProductRemoval#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The Unix timestamp when the prohibited items were removed. */
      public Builder setItemsRemovedAt(Long itemsRemovedAt) {
        this.itemsRemovedAt = itemsRemovedAt;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ReviewedFields {
    /**
     * <strong>Required.</strong> The connected account's attestation that the named account field
     * values are accurate. Update inaccurate values through the Accounts API before attesting.
     */
    @SerializedName("attestation")
    Attestation attestation;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ReviewedFields(Attestation attestation, Map<String, Object> extraParams) {
      this.attestation = attestation;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Attestation attestation;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.ReviewedFields build() {
        return new FormUpdateParams.ReviewedFields(this.attestation, this.extraParams);
      }

      /**
       * <strong>Required.</strong> The connected account's attestation that the named account field
       * values are accurate. Update inaccurate values through the Accounts API before attesting.
       */
      public Builder setAttestation(FormUpdateParams.ReviewedFields.Attestation attestation) {
        this.attestation = attestation;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.ReviewedFields#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.ReviewedFields#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Attestation {
      /** The Unix timestamp when the connected account attested to these fields. */
      @SerializedName("attested_at")
      Long attestedAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Account field paths in the currently accepted v2 Accounts API format, for example {@code
       * defaults.profile.product_description}.
       */
      @SerializedName("fields")
      List<String> fields;

      private Attestation(Long attestedAt, Map<String, Object> extraParams, List<String> fields) {
        this.attestedAt = attestedAt;
        this.extraParams = extraParams;
        this.fields = fields;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long attestedAt;

        private Map<String, Object> extraParams;

        private List<String> fields;

        /** Finalize and obtain parameter instance from this builder. */
        public FormUpdateParams.ReviewedFields.Attestation build() {
          return new FormUpdateParams.ReviewedFields.Attestation(
              this.attestedAt, this.extraParams, this.fields);
        }

        /** The Unix timestamp when the connected account attested to these fields. */
        public Builder setAttestedAt(Long attestedAt) {
          this.attestedAt = attestedAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormUpdateParams.ReviewedFields.Attestation#extraParams} for the field
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
         * map. See {@link FormUpdateParams.ReviewedFields.Attestation#extraParams} for the field
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
         * Add an element to `fields` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.ReviewedFields.Attestation#fields} for the field documentation.
         */
        public Builder addField(String element) {
          if (this.fields == null) {
            this.fields = new ArrayList<>();
          }
          this.fields.add(element);
          return this;
        }

        /**
         * Add all elements to `fields` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.ReviewedFields.Attestation#fields} for the field documentation.
         */
        public Builder addAllField(List<String> elements) {
          if (this.fields == null) {
            this.fields = new ArrayList<>();
          }
          this.fields.addAll(elements);
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SelfFundingContext {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The connected account's source of wealth. */
    @SerializedName("source_of_wealth")
    SourceOfWealth sourceOfWealth;

    private SelfFundingContext(Map<String, Object> extraParams, SourceOfWealth sourceOfWealth) {
      this.extraParams = extraParams;
      this.sourceOfWealth = sourceOfWealth;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private SourceOfWealth sourceOfWealth;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.SelfFundingContext build() {
        return new FormUpdateParams.SelfFundingContext(this.extraParams, this.sourceOfWealth);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.SelfFundingContext#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.SelfFundingContext#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The connected account's source of wealth. */
      public Builder setSourceOfWealth(
          FormUpdateParams.SelfFundingContext.SourceOfWealth sourceOfWealth) {
        this.sourceOfWealth = sourceOfWealth;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfWealth {
      /** A text explanation of the connected account's source of wealth. */
      @SerializedName("description")
      Object description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** IDs of uploaded files evidencing the source of wealth. */
      @SerializedName("files")
      List<String> files;

      private SourceOfWealth(
          Object description, Map<String, Object> extraParams, List<String> files) {
        this.description = description;
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object description;

        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public FormUpdateParams.SelfFundingContext.SourceOfWealth build() {
          return new FormUpdateParams.SelfFundingContext.SourceOfWealth(
              this.description, this.extraParams, this.files);
        }

        /** A text explanation of the connected account's source of wealth. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /** A text explanation of the connected account's source of wealth. */
        public Builder setDescription(EmptyParam description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormUpdateParams.SelfFundingContext.SourceOfWealth#extraParams} for the
         * field documentation.
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
         * map. See {@link FormUpdateParams.SelfFundingContext.SourceOfWealth#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.SelfFundingContext.SourceOfWealth#files} for the field documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.SelfFundingContext.SourceOfWealth#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionContext {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * How often the connected account expects transactions like this one. One of one_time_payment,
     * recurring_subscription, repeat_customer, split_payment, or something_else.
     */
    @SerializedName("frequency")
    Object frequency;

    /** The purpose of the transaction. */
    @SerializedName("purpose")
    Object purpose;

    /** IDs of uploaded files evidencing the purpose of the transaction. */
    @SerializedName("purpose_files")
    List<String> purposeFiles;

    /** The connected account's relationship to the sender. */
    @SerializedName("sender_relationship")
    Object senderRelationship;

    /** Where the funds for the transaction came from. */
    @SerializedName("source_of_funds")
    SourceOfFunds sourceOfFunds;

    /** How the funds from the transaction will be used. */
    @SerializedName("use_of_funds")
    Object useOfFunds;

    private TransactionContext(
        Map<String, Object> extraParams,
        Object frequency,
        Object purpose,
        List<String> purposeFiles,
        Object senderRelationship,
        SourceOfFunds sourceOfFunds,
        Object useOfFunds) {
      this.extraParams = extraParams;
      this.frequency = frequency;
      this.purpose = purpose;
      this.purposeFiles = purposeFiles;
      this.senderRelationship = senderRelationship;
      this.sourceOfFunds = sourceOfFunds;
      this.useOfFunds = useOfFunds;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object frequency;

      private Object purpose;

      private List<String> purposeFiles;

      private Object senderRelationship;

      private SourceOfFunds sourceOfFunds;

      private Object useOfFunds;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.TransactionContext build() {
        return new FormUpdateParams.TransactionContext(
            this.extraParams,
            this.frequency,
            this.purpose,
            this.purposeFiles,
            this.senderRelationship,
            this.sourceOfFunds,
            this.useOfFunds);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormUpdateParams.TransactionContext#extraParams} for the field documentation.
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
       * See {@link FormUpdateParams.TransactionContext#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * How often the connected account expects transactions like this one. One of
       * one_time_payment, recurring_subscription, repeat_customer, split_payment, or
       * something_else.
       */
      public Builder setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
      }

      /**
       * How often the connected account expects transactions like this one. One of
       * one_time_payment, recurring_subscription, repeat_customer, split_payment, or
       * something_else.
       */
      public Builder setFrequency(EmptyParam frequency) {
        this.frequency = frequency;
        return this;
      }

      /** The purpose of the transaction. */
      public Builder setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
      }

      /** The purpose of the transaction. */
      public Builder setPurpose(EmptyParam purpose) {
        this.purpose = purpose;
        return this;
      }

      /**
       * Add an element to `purposeFiles` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * FormUpdateParams.TransactionContext#purposeFiles} for the field documentation.
       */
      public Builder addPurposeFile(String element) {
        if (this.purposeFiles == null) {
          this.purposeFiles = new ArrayList<>();
        }
        this.purposeFiles.add(element);
        return this;
      }

      /**
       * Add all elements to `purposeFiles` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * FormUpdateParams.TransactionContext#purposeFiles} for the field documentation.
       */
      public Builder addAllPurposeFile(List<String> elements) {
        if (this.purposeFiles == null) {
          this.purposeFiles = new ArrayList<>();
        }
        this.purposeFiles.addAll(elements);
        return this;
      }

      /** The connected account's relationship to the sender. */
      public Builder setSenderRelationship(String senderRelationship) {
        this.senderRelationship = senderRelationship;
        return this;
      }

      /** The connected account's relationship to the sender. */
      public Builder setSenderRelationship(EmptyParam senderRelationship) {
        this.senderRelationship = senderRelationship;
        return this;
      }

      /** Where the funds for the transaction came from. */
      public Builder setSourceOfFunds(
          FormUpdateParams.TransactionContext.SourceOfFunds sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
        return this;
      }

      /** How the funds from the transaction will be used. */
      public Builder setUseOfFunds(String useOfFunds) {
        this.useOfFunds = useOfFunds;
        return this;
      }

      /** How the funds from the transaction will be used. */
      public Builder setUseOfFunds(EmptyParam useOfFunds) {
        this.useOfFunds = useOfFunds;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfFunds {
      /** A text explanation of where the funds for the transaction came from. */
      @SerializedName("description")
      Object description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** IDs of uploaded files evidencing the source of funds. */
      @SerializedName("files")
      List<String> files;

      private SourceOfFunds(
          Object description, Map<String, Object> extraParams, List<String> files) {
        this.description = description;
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object description;

        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public FormUpdateParams.TransactionContext.SourceOfFunds build() {
          return new FormUpdateParams.TransactionContext.SourceOfFunds(
              this.description, this.extraParams, this.files);
        }

        /** A text explanation of where the funds for the transaction came from. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /** A text explanation of where the funds for the transaction came from. */
        public Builder setDescription(EmptyParam description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormUpdateParams.TransactionContext.SourceOfFunds#extraParams} for the
         * field documentation.
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
         * map. See {@link FormUpdateParams.TransactionContext.SourceOfFunds#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.TransactionContext.SourceOfFunds#files} for the field documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * FormUpdateParams.TransactionContext.SourceOfFunds#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }
  }
}
