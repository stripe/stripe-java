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
public class InquiryUpdateParams extends ApiRequestParams {
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

  private InquiryUpdateParams(
      Appeal appeal,
      AuthorizationDocuments authorizationDocuments,
      Map<String, Object> extraParams,
      ProductRemoval productRemoval) {
    this.appeal = appeal;
    this.authorizationDocuments = authorizationDocuments;
    this.extraParams = extraParams;
    this.productRemoval = productRemoval;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Appeal appeal;

    private AuthorizationDocuments authorizationDocuments;

    private Map<String, Object> extraParams;

    private ProductRemoval productRemoval;

    /** Finalize and obtain parameter instance from this builder. */
    public InquiryUpdateParams build() {
      return new InquiryUpdateParams(
          this.appeal, this.authorizationDocuments, this.extraParams, this.productRemoval);
    }

    /** Provide this for appeal inquiries. */
    public Builder setAppeal(InquiryUpdateParams.Appeal appeal) {
      this.appeal = appeal;
      return this;
    }

    /** Provide this for authorization_documents inquiries. */
    public Builder setAuthorizationDocuments(
        InquiryUpdateParams.AuthorizationDocuments authorizationDocuments) {
      this.authorizationDocuments = authorizationDocuments;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InquiryUpdateParams#extraParams} for the field documentation.
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
     * See {@link InquiryUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Provide this for product_removal inquiries. */
    public Builder setProductRemoval(InquiryUpdateParams.ProductRemoval productRemoval) {
      this.productRemoval = productRemoval;
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
      public InquiryUpdateParams.Appeal build() {
        return new InquiryUpdateParams.Appeal(this.explanation, this.extraParams);
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
       * InquiryUpdateParams.Appeal#extraParams} for the field documentation.
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
       * See {@link InquiryUpdateParams.Appeal#extraParams} for the field documentation.
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
      public InquiryUpdateParams.AuthorizationDocuments build() {
        return new InquiryUpdateParams.AuthorizationDocuments(this.extraParams, this.files);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InquiryUpdateParams.AuthorizationDocuments#extraParams} for the field documentation.
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
       * See {@link InquiryUpdateParams.AuthorizationDocuments#extraParams} for the field
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
       * InquiryUpdateParams.AuthorizationDocuments#files} for the field documentation.
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
       * InquiryUpdateParams.AuthorizationDocuments#files} for the field documentation.
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
      public InquiryUpdateParams.ProductRemoval build() {
        return new InquiryUpdateParams.ProductRemoval(this.extraParams, this.itemsRemovedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InquiryUpdateParams.ProductRemoval#extraParams} for the field documentation.
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
       * See {@link InquiryUpdateParams.ProductRemoval#extraParams} for the field documentation.
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
}
