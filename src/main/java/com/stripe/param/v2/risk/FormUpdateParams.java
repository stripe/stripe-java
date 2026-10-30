// File generated from our OpenAPI spec
package com.stripe.param.v2.risk;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FormUpdateParams extends ApiRequestParams {
  /** Provide this for appeal inquiries. */
  @SerializedName("appeal")
  Appeal appeal;

  /** Provide this for authorization_documents inquiries. */
  @SerializedName("authorization_documents")
  AuthorizationDocuments authorizationDocuments;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Provide this for product_removal inquiries. */
  @SerializedName("product_removal")
  ProductRemoval productRemoval;

  /** Provide this for self_funding_context inquiries. */
  @SerializedName("self_funding_context")
  SelfFundingContext selfFundingContext;

  /** Provide this for transaction_context inquiries. */
  @SerializedName("transaction_context")
  TransactionContext transactionContext;

  private FormUpdateParams(
      Appeal appeal,
      AuthorizationDocuments authorizationDocuments,
      Map<String, Object> extraParams,
      ProductRemoval productRemoval,
      SelfFundingContext selfFundingContext,
      TransactionContext transactionContext) {
    this.appeal = appeal;
    this.authorizationDocuments = authorizationDocuments;
    this.extraParams = extraParams;
    this.productRemoval = productRemoval;
    this.selfFundingContext = selfFundingContext;
    this.transactionContext = transactionContext;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Appeal appeal;

    private AuthorizationDocuments authorizationDocuments;

    private Map<String, Object> extraParams;

    private ProductRemoval productRemoval;

    private SelfFundingContext selfFundingContext;

    private TransactionContext transactionContext;

    /** Finalize and obtain parameter instance from this builder. */
    public FormUpdateParams build() {
      return new FormUpdateParams(
          this.appeal,
          this.authorizationDocuments,
          this.extraParams,
          this.productRemoval,
          this.selfFundingContext,
          this.transactionContext);
    }

    /** Provide this for appeal inquiries. */
    public Builder setAppeal(FormUpdateParams.Appeal appeal) {
      this.appeal = appeal;
      return this;
    }

    /** Provide this for authorization_documents inquiries. */
    public Builder setAuthorizationDocuments(
        FormUpdateParams.AuthorizationDocuments authorizationDocuments) {
      this.authorizationDocuments = authorizationDocuments;
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

    /** Provide this for product_removal inquiries. */
    public Builder setProductRemoval(FormUpdateParams.ProductRemoval productRemoval) {
      this.productRemoval = productRemoval;
      return this;
    }

    /** Provide this for self_funding_context inquiries. */
    public Builder setSelfFundingContext(FormUpdateParams.SelfFundingContext selfFundingContext) {
      this.selfFundingContext = selfFundingContext;
      return this;
    }

    /** Provide this for transaction_context inquiries. */
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
  public static class ProductRemoval {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The timestamp when the prohibited items were removed. */
    @SerializedName("items_removed_at")
    Instant itemsRemovedAt;

    private ProductRemoval(Map<String, Object> extraParams, Instant itemsRemovedAt) {
      this.extraParams = extraParams;
      this.itemsRemovedAt = itemsRemovedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Instant itemsRemovedAt;

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

      /** <strong>Required.</strong> The timestamp when the prohibited items were removed. */
      public Builder setItemsRemovedAt(Instant itemsRemovedAt) {
        this.itemsRemovedAt = itemsRemovedAt;
        return this;
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
      /**
       * <strong>Required.</strong> A text explanation of the connected account's source of wealth.
       */
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

      /** <strong>Required.</strong> IDs of uploaded files evidencing the source of wealth. */
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

        /**
         * <strong>Required.</strong> A text explanation of the connected account's source of
         * wealth.
         */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * <strong>Required.</strong> A text explanation of the connected account's source of
         * wealth.
         */
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

    /** <strong>Required.</strong> The purpose of the transaction. */
    @SerializedName("purpose")
    Object purpose;

    /** The connected account's relationship to the sender. Optional. */
    @SerializedName("sender_relationship")
    Object senderRelationship;

    /** Where the funds for the transaction came from. */
    @SerializedName("source_of_funds")
    SourceOfFunds sourceOfFunds;

    /** <strong>Required.</strong> How the funds from the transaction will be used. */
    @SerializedName("use_of_funds")
    Object useOfFunds;

    private TransactionContext(
        Map<String, Object> extraParams,
        Object purpose,
        Object senderRelationship,
        SourceOfFunds sourceOfFunds,
        Object useOfFunds) {
      this.extraParams = extraParams;
      this.purpose = purpose;
      this.senderRelationship = senderRelationship;
      this.sourceOfFunds = sourceOfFunds;
      this.useOfFunds = useOfFunds;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object purpose;

      private Object senderRelationship;

      private SourceOfFunds sourceOfFunds;

      private Object useOfFunds;

      /** Finalize and obtain parameter instance from this builder. */
      public FormUpdateParams.TransactionContext build() {
        return new FormUpdateParams.TransactionContext(
            this.extraParams,
            this.purpose,
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

      /** <strong>Required.</strong> The purpose of the transaction. */
      public Builder setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
      }

      /** <strong>Required.</strong> The purpose of the transaction. */
      public Builder setPurpose(EmptyParam purpose) {
        this.purpose = purpose;
        return this;
      }

      /** The connected account's relationship to the sender. Optional. */
      public Builder setSenderRelationship(String senderRelationship) {
        this.senderRelationship = senderRelationship;
        return this;
      }

      /** The connected account's relationship to the sender. Optional. */
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

      /** <strong>Required.</strong> How the funds from the transaction will be used. */
      public Builder setUseOfFunds(String useOfFunds) {
        this.useOfFunds = useOfFunds;
        return this;
      }

      /** <strong>Required.</strong> How the funds from the transaction will be used. */
      public Builder setUseOfFunds(EmptyParam useOfFunds) {
        this.useOfFunds = useOfFunds;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfFunds {
      /**
       * <strong>Required.</strong> A text explanation of where the funds for the transaction came
       * from.
       */
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

      /** <strong>Required.</strong> IDs of uploaded files evidencing the source of funds. */
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

        /**
         * <strong>Required.</strong> A text explanation of where the funds for the transaction came
         * from.
         */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * <strong>Required.</strong> A text explanation of where the funds for the transaction came
         * from.
         */
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
