// File generated from our OpenAPI spec
package com.stripe.param.radar;

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
public class CustomerEvaluationUpdateParams extends ApiRequestParams {
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

  /** Event payload for login_failed. */
  @SerializedName("login_failed")
  LoginFailed loginFailed;

  /** Event payload for registration_failed. */
  @SerializedName("registration_failed")
  RegistrationFailed registrationFailed;

  /** Event payload for registration_success. */
  @SerializedName("registration_success")
  RegistrationSuccess registrationSuccess;

  /** <strong>Required.</strong> The type of event to report. */
  @SerializedName("type")
  Type type;

  private CustomerEvaluationUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      LoginFailed loginFailed,
      RegistrationFailed registrationFailed,
      RegistrationSuccess registrationSuccess,
      Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.loginFailed = loginFailed;
    this.registrationFailed = registrationFailed;
    this.registrationSuccess = registrationSuccess;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private LoginFailed loginFailed;

    private RegistrationFailed registrationFailed;

    private RegistrationSuccess registrationSuccess;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerEvaluationUpdateParams build() {
      return new CustomerEvaluationUpdateParams(
          this.expand,
          this.extraParams,
          this.loginFailed,
          this.registrationFailed,
          this.registrationSuccess,
          this.type);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerEvaluationUpdateParams#expand} for the field documentation.
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
     * CustomerEvaluationUpdateParams#expand} for the field documentation.
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
     * CustomerEvaluationUpdateParams#extraParams} for the field documentation.
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
     * See {@link CustomerEvaluationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Event payload for login_failed. */
    public Builder setLoginFailed(CustomerEvaluationUpdateParams.LoginFailed loginFailed) {
      this.loginFailed = loginFailed;
      return this;
    }

    /** Event payload for registration_failed. */
    public Builder setRegistrationFailed(
        CustomerEvaluationUpdateParams.RegistrationFailed registrationFailed) {
      this.registrationFailed = registrationFailed;
      return this;
    }

    /** Event payload for registration_success. */
    public Builder setRegistrationSuccess(
        CustomerEvaluationUpdateParams.RegistrationSuccess registrationSuccess) {
      this.registrationSuccess = registrationSuccess;
      return this;
    }

    /** <strong>Required.</strong> The type of event to report. */
    public Builder setType(CustomerEvaluationUpdateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginFailed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The reason why this login failed. */
    @SerializedName("reason")
    Reason reason;

    private LoginFailed(Map<String, Object> extraParams, Reason reason) {
      this.extraParams = extraParams;
      this.reason = reason;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Reason reason;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerEvaluationUpdateParams.LoginFailed build() {
        return new CustomerEvaluationUpdateParams.LoginFailed(this.extraParams, this.reason);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerEvaluationUpdateParams.LoginFailed#extraParams} for the field documentation.
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
       * See {@link CustomerEvaluationUpdateParams.LoginFailed#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The reason why this login failed. */
      public Builder setReason(CustomerEvaluationUpdateParams.LoginFailed.Reason reason) {
        this.reason = reason;
        return this;
      }
    }

    public enum Reason implements ApiRequestParams.EnumParam {
      @SerializedName("other")
      OTHER("other"),

      @SerializedName("suspected_account_sharing")
      SUSPECTED_ACCOUNT_SHARING("suspected_account_sharing");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Reason(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RegistrationFailed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The reason why this registration failed. */
    @SerializedName("reason")
    Reason reason;

    private RegistrationFailed(Map<String, Object> extraParams, Reason reason) {
      this.extraParams = extraParams;
      this.reason = reason;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Reason reason;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerEvaluationUpdateParams.RegistrationFailed build() {
        return new CustomerEvaluationUpdateParams.RegistrationFailed(this.extraParams, this.reason);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerEvaluationUpdateParams.RegistrationFailed#extraParams} for the field documentation.
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
       * See {@link CustomerEvaluationUpdateParams.RegistrationFailed#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The reason why this registration failed. */
      public Builder setReason(CustomerEvaluationUpdateParams.RegistrationFailed.Reason reason) {
        this.reason = reason;
        return this;
      }
    }

    public enum Reason implements ApiRequestParams.EnumParam {
      @SerializedName("other")
      OTHER("other"),

      @SerializedName("suspected_multi_accounting")
      SUSPECTED_MULTI_ACCOUNTING("suspected_multi_accounting");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Reason(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RegistrationSuccess {
    /** Stripe customer ID to attach to an entity-less registration evaluation. */
    @SerializedName("customer")
    Object customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RegistrationSuccess(Object customer, Map<String, Object> extraParams) {
      this.customer = customer;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object customer;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerEvaluationUpdateParams.RegistrationSuccess build() {
        return new CustomerEvaluationUpdateParams.RegistrationSuccess(
            this.customer, this.extraParams);
      }

      /** Stripe customer ID to attach to an entity-less registration evaluation. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** Stripe customer ID to attach to an entity-less registration evaluation. */
      public Builder setCustomer(EmptyParam customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerEvaluationUpdateParams.RegistrationSuccess#extraParams} for the field
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
       * See {@link CustomerEvaluationUpdateParams.RegistrationSuccess#extraParams} for the field
       * documentation.
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("login_failed")
    LOGIN_FAILED("login_failed"),

    @SerializedName("login_success")
    LOGIN_SUCCESS("login_success"),

    @SerializedName("registration_failed")
    REGISTRATION_FAILED("registration_failed"),

    @SerializedName("registration_success")
    REGISTRATION_SUCCESS("registration_success");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
