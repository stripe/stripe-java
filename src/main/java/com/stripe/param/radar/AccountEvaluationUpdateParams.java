// File generated from our OpenAPI spec
package com.stripe.param.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountEvaluationUpdateParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The type of event to report. */
  @SerializedName("type")
  Type type;

  private AccountEvaluationUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      LoginFailed loginFailed,
      RegistrationFailed registrationFailed,
      Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.loginFailed = loginFailed;
    this.registrationFailed = registrationFailed;
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

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountEvaluationUpdateParams build() {
      return new AccountEvaluationUpdateParams(
          this.expand, this.extraParams, this.loginFailed, this.registrationFailed, this.type);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountEvaluationUpdateParams#expand} for the field documentation.
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
     * AccountEvaluationUpdateParams#expand} for the field documentation.
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
     * AccountEvaluationUpdateParams#extraParams} for the field documentation.
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
     * See {@link AccountEvaluationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Event payload for login_failed. */
    public Builder setLoginFailed(AccountEvaluationUpdateParams.LoginFailed loginFailed) {
      this.loginFailed = loginFailed;
      return this;
    }

    /** Event payload for registration_failed. */
    public Builder setRegistrationFailed(
        AccountEvaluationUpdateParams.RegistrationFailed registrationFailed) {
      this.registrationFailed = registrationFailed;
      return this;
    }

    /** <strong>Required.</strong> The type of event to report. */
    public Builder setType(AccountEvaluationUpdateParams.Type type) {
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
      public AccountEvaluationUpdateParams.LoginFailed build() {
        return new AccountEvaluationUpdateParams.LoginFailed(this.extraParams, this.reason);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationUpdateParams.LoginFailed#extraParams} for the field documentation.
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
       * See {@link AccountEvaluationUpdateParams.LoginFailed#extraParams} for the field
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
      public Builder setReason(AccountEvaluationUpdateParams.LoginFailed.Reason reason) {
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
      public AccountEvaluationUpdateParams.RegistrationFailed build() {
        return new AccountEvaluationUpdateParams.RegistrationFailed(this.extraParams, this.reason);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationUpdateParams.RegistrationFailed#extraParams} for the field documentation.
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
       * See {@link AccountEvaluationUpdateParams.RegistrationFailed#extraParams} for the field
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
      public Builder setReason(AccountEvaluationUpdateParams.RegistrationFailed.Reason reason) {
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("login_failed")
    LOGIN_FAILED("login_failed"),

    @SerializedName("login_succeeded")
    LOGIN_SUCCEEDED("login_succeeded"),

    @SerializedName("registration_failed")
    REGISTRATION_FAILED("registration_failed"),

    @SerializedName("registration_succeeded")
    REGISTRATION_SUCCEEDED("registration_succeeded");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
