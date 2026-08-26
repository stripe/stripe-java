// File generated from our OpenAPI spec
package com.stripe.param.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountActivityCreateParams extends ApiRequestParams {
  /** The account, customer, or inline account data associated with the activity. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /** The account evaluation this activity is associated with, when applicable. */
  @SerializedName("account_evaluation")
  String accountEvaluation;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Details for the login attempt. Provide only when type is login_attempt. */
  @SerializedName("login_attempt")
  LoginAttempt loginAttempt;

  /** Details for the login decision. Provide only when type is login_decision. */
  @SerializedName("login_decision")
  LoginDecision loginDecision;

  /** Timestamp at which the activity occurred. Defaults to the created time if not provided. */
  @SerializedName("occurred_at")
  Instant occurredAt;

  /** Details for the registration attempt. Provide only when type is registration_attempt. */
  @SerializedName("registration_attempt")
  RegistrationAttempt registrationAttempt;

  /** Details for the registration decision. Provide only when type is registration_decision. */
  @SerializedName("registration_decision")
  RegistrationDecision registrationDecision;

  /** <strong>Required.</strong> The type of activity. */
  @SerializedName("type")
  Type type;

  private AccountActivityCreateParams(
      AccountDetails accountDetails,
      String accountEvaluation,
      Map<String, Object> extraParams,
      LoginAttempt loginAttempt,
      LoginDecision loginDecision,
      Instant occurredAt,
      RegistrationAttempt registrationAttempt,
      RegistrationDecision registrationDecision,
      Type type) {
    this.accountDetails = accountDetails;
    this.accountEvaluation = accountEvaluation;
    this.extraParams = extraParams;
    this.loginAttempt = loginAttempt;
    this.loginDecision = loginDecision;
    this.occurredAt = occurredAt;
    this.registrationAttempt = registrationAttempt;
    this.registrationDecision = registrationDecision;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountDetails accountDetails;

    private String accountEvaluation;

    private Map<String, Object> extraParams;

    private LoginAttempt loginAttempt;

    private LoginDecision loginDecision;

    private Instant occurredAt;

    private RegistrationAttempt registrationAttempt;

    private RegistrationDecision registrationDecision;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountActivityCreateParams build() {
      return new AccountActivityCreateParams(
          this.accountDetails,
          this.accountEvaluation,
          this.extraParams,
          this.loginAttempt,
          this.loginDecision,
          this.occurredAt,
          this.registrationAttempt,
          this.registrationDecision,
          this.type);
    }

    /** The account, customer, or inline account data associated with the activity. */
    public Builder setAccountDetails(AccountActivityCreateParams.AccountDetails accountDetails) {
      this.accountDetails = accountDetails;
      return this;
    }

    /** The account evaluation this activity is associated with, when applicable. */
    public Builder setAccountEvaluation(String accountEvaluation) {
      this.accountEvaluation = accountEvaluation;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountActivityCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountActivityCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Details for the login attempt. Provide only when type is login_attempt. */
    public Builder setLoginAttempt(AccountActivityCreateParams.LoginAttempt loginAttempt) {
      this.loginAttempt = loginAttempt;
      return this;
    }

    /** Details for the login decision. Provide only when type is login_decision. */
    public Builder setLoginDecision(AccountActivityCreateParams.LoginDecision loginDecision) {
      this.loginDecision = loginDecision;
      return this;
    }

    /** Timestamp at which the activity occurred. Defaults to the created time if not provided. */
    public Builder setOccurredAt(Instant occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }

    /** Details for the registration attempt. Provide only when type is registration_attempt. */
    public Builder setRegistrationAttempt(
        AccountActivityCreateParams.RegistrationAttempt registrationAttempt) {
      this.registrationAttempt = registrationAttempt;
      return this;
    }

    /** Details for the registration decision. Provide only when type is registration_decision. */
    public Builder setRegistrationDecision(
        AccountActivityCreateParams.RegistrationDecision registrationDecision) {
      this.registrationDecision = registrationDecision;
      return this;
    }

    /** <strong>Required.</strong> The type of activity. */
    public Builder setType(AccountActivityCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountDetails {
    /** The v2 account ID of the account. */
    @SerializedName("account")
    String account;

    /** The v1 customer ID of the account, for users not yet migrated to v2/accounts. */
    @SerializedName("customer")
    String customer;

    /** Inline account data to evaluate without creating a v2 account. */
    @SerializedName("data")
    Data data;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AccountDetails(
        String account, String customer, Data data, Map<String, Object> extraParams) {
      this.account = account;
      this.customer = customer;
      this.data = data;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private String customer;

      private Data data;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountActivityCreateParams.AccountDetails build() {
        return new AccountActivityCreateParams.AccountDetails(
            this.account, this.customer, this.data, this.extraParams);
      }

      /** The v2 account ID of the account. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /** The v1 customer ID of the account, for users not yet migrated to v2/accounts. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** Inline account data to evaluate without creating a v2 account. */
      public Builder setData(AccountActivityCreateParams.AccountDetails.Data data) {
        this.data = data;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountActivityCreateParams.AccountDetails#extraParams} for the field documentation.
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
       * See {@link AccountActivityCreateParams.AccountDetails#extraParams} for the field
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Data {
      /** Default account settings. */
      @SerializedName("defaults")
      Defaults defaults;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Data(Defaults defaults, Map<String, Object> extraParams) {
        this.defaults = defaults;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Defaults defaults;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountActivityCreateParams.AccountDetails.Data build() {
          return new AccountActivityCreateParams.AccountDetails.Data(
              this.defaults, this.extraParams);
        }

        /** Default account settings. */
        public Builder setDefaults(
            AccountActivityCreateParams.AccountDetails.Data.Defaults defaults) {
          this.defaults = defaults;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountActivityCreateParams.AccountDetails.Data#extraParams} for the
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
         * map. See {@link AccountActivityCreateParams.AccountDetails.Data#extraParams} for the
         * field documentation.
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
      public static class Defaults {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Account profile data. */
        @SerializedName("profile")
        Profile profile;

        private Defaults(Map<String, Object> extraParams, Profile profile) {
          this.extraParams = extraParams;
          this.profile = profile;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Profile profile;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountActivityCreateParams.AccountDetails.Data.Defaults build() {
            return new AccountActivityCreateParams.AccountDetails.Data.Defaults(
                this.extraParams, this.profile);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountActivityCreateParams.AccountDetails.Data.Defaults#extraParams}
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountActivityCreateParams.AccountDetails.Data.Defaults#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Account profile data. */
          public Builder setProfile(
              AccountActivityCreateParams.AccountDetails.Data.Defaults.Profile profile) {
            this.profile = profile;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Profile {
          /** <strong>Required.</strong> The business URL. */
          @SerializedName("business_url")
          String businessUrl;

          /** Doing business as (DBA) name. */
          @SerializedName("doing_business_as")
          String doingBusinessAs;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Description of the account's product or service. */
          @SerializedName("product_description")
          String productDescription;

          private Profile(
              String businessUrl,
              String doingBusinessAs,
              Map<String, Object> extraParams,
              String productDescription) {
            this.businessUrl = businessUrl;
            this.doingBusinessAs = doingBusinessAs;
            this.extraParams = extraParams;
            this.productDescription = productDescription;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String businessUrl;

            private String doingBusinessAs;

            private Map<String, Object> extraParams;

            private String productDescription;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountActivityCreateParams.AccountDetails.Data.Defaults.Profile build() {
              return new AccountActivityCreateParams.AccountDetails.Data.Defaults.Profile(
                  this.businessUrl,
                  this.doingBusinessAs,
                  this.extraParams,
                  this.productDescription);
            }

            /** <strong>Required.</strong> The business URL. */
            public Builder setBusinessUrl(String businessUrl) {
              this.businessUrl = businessUrl;
              return this;
            }

            /** Doing business as (DBA) name. */
            public Builder setDoingBusinessAs(String doingBusinessAs) {
              this.doingBusinessAs = doingBusinessAs;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountActivityCreateParams.AccountDetails.Data.Defaults.Profile#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountActivityCreateParams.AccountDetails.Data.Defaults.Profile#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Description of the account's product or service. */
            public Builder setProductDescription(String productDescription) {
              this.productDescription = productDescription;
              return this;
            }
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginAttempt {
    /** <strong>Required.</strong> Client details captured for the attempt. */
    @SerializedName("client_details")
    ClientDetails clientDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private LoginAttempt(ClientDetails clientDetails, Map<String, Object> extraParams) {
      this.clientDetails = clientDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDetails clientDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountActivityCreateParams.LoginAttempt build() {
        return new AccountActivityCreateParams.LoginAttempt(this.clientDetails, this.extraParams);
      }

      /** <strong>Required.</strong> Client details captured for the attempt. */
      public Builder setClientDetails(
          AccountActivityCreateParams.LoginAttempt.ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountActivityCreateParams.LoginAttempt#extraParams} for the field documentation.
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
       * See {@link AccountActivityCreateParams.LoginAttempt#extraParams} for the field
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDetails {
      /** Raw client details for the activity, when a Radar session is not available. */
      @SerializedName("data")
      Data data;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The Radar session ID capturing client details for the activity. */
      @SerializedName("radar_session")
      String radarSession;

      private ClientDetails(Data data, Map<String, Object> extraParams, String radarSession) {
        this.data = data;
        this.extraParams = extraParams;
        this.radarSession = radarSession;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Data data;

        private Map<String, Object> extraParams;

        private String radarSession;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountActivityCreateParams.LoginAttempt.ClientDetails build() {
          return new AccountActivityCreateParams.LoginAttempt.ClientDetails(
              this.data, this.extraParams, this.radarSession);
        }

        /** Raw client details for the activity, when a Radar session is not available. */
        public Builder setData(AccountActivityCreateParams.LoginAttempt.ClientDetails.Data data) {
          this.data = data;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountActivityCreateParams.LoginAttempt.ClientDetails#extraParams} for
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
         * map. See {@link AccountActivityCreateParams.LoginAttempt.ClientDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The Radar session ID capturing client details for the activity. */
        public Builder setRadarSession(String radarSession) {
          this.radarSession = radarSession;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Data {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The IP address associated with the activity. */
        @SerializedName("ip")
        String ip;

        /** The referrer associated with the activity. */
        @SerializedName("referrer")
        String referrer;

        /** The user agent associated with the activity. */
        @SerializedName("user_agent")
        String userAgent;

        private Data(
            Map<String, Object> extraParams, String ip, String referrer, String userAgent) {
          this.extraParams = extraParams;
          this.ip = ip;
          this.referrer = referrer;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String ip;

          private String referrer;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountActivityCreateParams.LoginAttempt.ClientDetails.Data build() {
            return new AccountActivityCreateParams.LoginAttempt.ClientDetails.Data(
                this.extraParams, this.ip, this.referrer, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountActivityCreateParams.LoginAttempt.ClientDetails.Data#extraParams} for the field
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
           * AccountActivityCreateParams.LoginAttempt.ClientDetails.Data#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The IP address associated with the activity. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The referrer associated with the activity. */
          public Builder setReferrer(String referrer) {
            this.referrer = referrer;
            return this;
          }

          /** The user agent associated with the activity. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginDecision {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The action the merchant took following the evaluation. */
    @SerializedName("status")
    Status status;

    private LoginDecision(Map<String, Object> extraParams, Status status) {
      this.extraParams = extraParams;
      this.status = status;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Status status;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountActivityCreateParams.LoginDecision build() {
        return new AccountActivityCreateParams.LoginDecision(this.extraParams, this.status);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountActivityCreateParams.LoginDecision#extraParams} for the field documentation.
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
       * See {@link AccountActivityCreateParams.LoginDecision#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The action the merchant took following the evaluation. */
      public Builder setStatus(AccountActivityCreateParams.LoginDecision.Status status) {
        this.status = status;
        return this;
      }
    }

    public enum Status implements ApiRequestParams.EnumParam {
      @SerializedName("allowed")
      ALLOWED("allowed"),

      @SerializedName("blocked")
      BLOCKED("blocked"),

      @SerializedName("restricted")
      RESTRICTED("restricted");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Status(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RegistrationAttempt {
    /** <strong>Required.</strong> Client details captured for the attempt. */
    @SerializedName("client_details")
    ClientDetails clientDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RegistrationAttempt(ClientDetails clientDetails, Map<String, Object> extraParams) {
      this.clientDetails = clientDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDetails clientDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountActivityCreateParams.RegistrationAttempt build() {
        return new AccountActivityCreateParams.RegistrationAttempt(
            this.clientDetails, this.extraParams);
      }

      /** <strong>Required.</strong> Client details captured for the attempt. */
      public Builder setClientDetails(
          AccountActivityCreateParams.RegistrationAttempt.ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountActivityCreateParams.RegistrationAttempt#extraParams} for the field documentation.
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
       * See {@link AccountActivityCreateParams.RegistrationAttempt#extraParams} for the field
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDetails {
      /** Raw client details for the activity, when a Radar session is not available. */
      @SerializedName("data")
      Data data;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The Radar session ID capturing client details for the activity. */
      @SerializedName("radar_session")
      String radarSession;

      private ClientDetails(Data data, Map<String, Object> extraParams, String radarSession) {
        this.data = data;
        this.extraParams = extraParams;
        this.radarSession = radarSession;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Data data;

        private Map<String, Object> extraParams;

        private String radarSession;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountActivityCreateParams.RegistrationAttempt.ClientDetails build() {
          return new AccountActivityCreateParams.RegistrationAttempt.ClientDetails(
              this.data, this.extraParams, this.radarSession);
        }

        /** Raw client details for the activity, when a Radar session is not available. */
        public Builder setData(
            AccountActivityCreateParams.RegistrationAttempt.ClientDetails.Data data) {
          this.data = data;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountActivityCreateParams.RegistrationAttempt.ClientDetails#extraParams} for the field
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
         * AccountActivityCreateParams.RegistrationAttempt.ClientDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The Radar session ID capturing client details for the activity. */
        public Builder setRadarSession(String radarSession) {
          this.radarSession = radarSession;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Data {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The IP address associated with the activity. */
        @SerializedName("ip")
        String ip;

        /** The referrer associated with the activity. */
        @SerializedName("referrer")
        String referrer;

        /** The user agent associated with the activity. */
        @SerializedName("user_agent")
        String userAgent;

        private Data(
            Map<String, Object> extraParams, String ip, String referrer, String userAgent) {
          this.extraParams = extraParams;
          this.ip = ip;
          this.referrer = referrer;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String ip;

          private String referrer;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountActivityCreateParams.RegistrationAttempt.ClientDetails.Data build() {
            return new AccountActivityCreateParams.RegistrationAttempt.ClientDetails.Data(
                this.extraParams, this.ip, this.referrer, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountActivityCreateParams.RegistrationAttempt.ClientDetails.Data#extraParams} for the
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
           * map. See {@link
           * AccountActivityCreateParams.RegistrationAttempt.ClientDetails.Data#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The IP address associated with the activity. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The referrer associated with the activity. */
          public Builder setReferrer(String referrer) {
            this.referrer = referrer;
            return this;
          }

          /** The user agent associated with the activity. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RegistrationDecision {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The action the merchant took following the evaluation. */
    @SerializedName("status")
    Status status;

    private RegistrationDecision(Map<String, Object> extraParams, Status status) {
      this.extraParams = extraParams;
      this.status = status;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Status status;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountActivityCreateParams.RegistrationDecision build() {
        return new AccountActivityCreateParams.RegistrationDecision(this.extraParams, this.status);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountActivityCreateParams.RegistrationDecision#extraParams} for the field documentation.
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
       * See {@link AccountActivityCreateParams.RegistrationDecision#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The action the merchant took following the evaluation. */
      public Builder setStatus(AccountActivityCreateParams.RegistrationDecision.Status status) {
        this.status = status;
        return this;
      }
    }

    public enum Status implements ApiRequestParams.EnumParam {
      @SerializedName("allowed")
      ALLOWED("allowed"),

      @SerializedName("blocked")
      BLOCKED("blocked"),

      @SerializedName("restricted")
      RESTRICTED("restricted");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Status(String value) {
        this.value = value;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("login_attempt")
    LOGIN_ATTEMPT("login_attempt"),

    @SerializedName("login_decision")
    LOGIN_DECISION("login_decision"),

    @SerializedName("registration_attempt")
    REGISTRATION_ATTEMPT("registration_attempt"),

    @SerializedName("registration_decision")
    REGISTRATION_DECISION("registration_decision");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
