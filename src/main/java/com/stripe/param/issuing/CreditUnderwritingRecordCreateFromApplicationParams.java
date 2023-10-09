// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CreditUnderwritingRecordCreateFromApplicationParams extends ApiRequestParams {
  /** <strong>Required.</strong> Details about the application submission. */
  @SerializedName("application")
  Application application;

  /**
   * <strong>Required.</strong> Information about the company or person applying or holding the
   * account.
   */
  @SerializedName("credit_user")
  CreditUser creditUser;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private CreditUnderwritingRecordCreateFromApplicationParams(
      Application application,
      CreditUser creditUser,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata) {
    this.application = application;
    this.creditUser = creditUser;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Application application;

    private CreditUser creditUser;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditUnderwritingRecordCreateFromApplicationParams build() {
      return new CreditUnderwritingRecordCreateFromApplicationParams(
          this.application, this.creditUser, this.expand, this.extraParams, this.metadata);
    }

    /** <strong>Required.</strong> Details about the application submission. */
    public Builder setApplication(
        CreditUnderwritingRecordCreateFromApplicationParams.Application application) {
      this.application = application;
      return this;
    }

    /**
     * <strong>Required.</strong> Information about the company or person applying or holding the
     * account.
     */
    public Builder setCreditUser(
        CreditUnderwritingRecordCreateFromApplicationParams.CreditUser creditUser) {
      this.creditUser = creditUser;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditUnderwritingRecordCreateFromApplicationParams#expand} for the field documentation.
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
     * CreditUnderwritingRecordCreateFromApplicationParams#expand} for the field documentation.
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
     * CreditUnderwritingRecordCreateFromApplicationParams#extraParams} for the field documentation.
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
     * See {@link CreditUnderwritingRecordCreateFromApplicationParams#extraParams} for the field
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditUnderwritingRecordCreateFromApplicationParams#metadata} for the field documentation.
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
     * See {@link CreditUnderwritingRecordCreateFromApplicationParams#metadata} for the field
     * documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  public static class Application {
    /**
     * The channel through which the applicant has submitted their application. Defaults to {@code
     * online}.
     */
    @SerializedName("application_method")
    ApplicationMethod applicationMethod;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Scope of demand made by the applicant. */
    @SerializedName("purpose")
    Purpose purpose;

    /** <strong>Required.</strong> Date when the applicant submitted their application. */
    @SerializedName("submitted_at")
    Long submittedAt;

    private Application(
        ApplicationMethod applicationMethod,
        Map<String, Object> extraParams,
        Purpose purpose,
        Long submittedAt) {
      this.applicationMethod = applicationMethod;
      this.extraParams = extraParams;
      this.purpose = purpose;
      this.submittedAt = submittedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ApplicationMethod applicationMethod;

      private Map<String, Object> extraParams;

      private Purpose purpose;

      private Long submittedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditUnderwritingRecordCreateFromApplicationParams.Application build() {
        return new CreditUnderwritingRecordCreateFromApplicationParams.Application(
            this.applicationMethod, this.extraParams, this.purpose, this.submittedAt);
      }

      /**
       * The channel through which the applicant has submitted their application. Defaults to {@code
       * online}.
       */
      public Builder setApplicationMethod(
          CreditUnderwritingRecordCreateFromApplicationParams.Application.ApplicationMethod
              applicationMethod) {
        this.applicationMethod = applicationMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditUnderwritingRecordCreateFromApplicationParams.Application#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CreditUnderwritingRecordCreateFromApplicationParams.Application#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Scope of demand made by the applicant. */
      public Builder setPurpose(
          CreditUnderwritingRecordCreateFromApplicationParams.Application.Purpose purpose) {
        this.purpose = purpose;
        return this;
      }

      /** <strong>Required.</strong> Date when the applicant submitted their application. */
      public Builder setSubmittedAt(Long submittedAt) {
        this.submittedAt = submittedAt;
        return this;
      }
    }

    public enum ApplicationMethod implements ApiRequestParams.EnumParam {
      @SerializedName("in_person")
      IN_PERSON("in_person"),

      @SerializedName("mail")
      MAIL("mail"),

      @SerializedName("online")
      ONLINE("online"),

      @SerializedName("phone")
      PHONE("phone");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ApplicationMethod(String value) {
        this.value = value;
      }
    }

    public enum Purpose implements ApiRequestParams.EnumParam {
      @SerializedName("credit_limit_increase")
      CREDIT_LIMIT_INCREASE("credit_limit_increase"),

      @SerializedName("credit_line_opening")
      CREDIT_LINE_OPENING("credit_line_opening");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Purpose(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class CreditUser {
    /** <strong>Required.</strong> Email of the applicant or accountholder. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Full name of the company or person. */
    @SerializedName("name")
    String name;

    private CreditUser(String email, Map<String, Object> extraParams, String name) {
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String email;

      private Map<String, Object> extraParams;

      private String name;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditUnderwritingRecordCreateFromApplicationParams.CreditUser build() {
        return new CreditUnderwritingRecordCreateFromApplicationParams.CreditUser(
            this.email, this.extraParams, this.name);
      }

      /** <strong>Required.</strong> Email of the applicant or accountholder. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditUnderwritingRecordCreateFromApplicationParams.CreditUser#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CreditUnderwritingRecordCreateFromApplicationParams.CreditUser#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Full name of the company or person. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }
    }
  }
}
