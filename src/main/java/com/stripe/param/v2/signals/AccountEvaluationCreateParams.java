// File generated from our OpenAPI spec
package com.stripe.param.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountEvaluationCreateParams extends ApiRequestParams {
  /** Account activity to record alongside this evaluation. */
  @SerializedName("account_activity_details")
  AccountActivityDetails accountActivityDetails;

  /** <strong>Required.</strong> The account, customer, or inline account data to evaluate. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> List of signals to evaluate. */
  @SerializedName("requested_signals")
  List<AccountEvaluationCreateParams.RequestedSignal> requestedSignals;

  private AccountEvaluationCreateParams(
      AccountActivityDetails accountActivityDetails,
      AccountDetails accountDetails,
      Map<String, Object> extraParams,
      List<AccountEvaluationCreateParams.RequestedSignal> requestedSignals) {
    this.accountActivityDetails = accountActivityDetails;
    this.accountDetails = accountDetails;
    this.extraParams = extraParams;
    this.requestedSignals = requestedSignals;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountActivityDetails accountActivityDetails;

    private AccountDetails accountDetails;

    private Map<String, Object> extraParams;

    private List<AccountEvaluationCreateParams.RequestedSignal> requestedSignals;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountEvaluationCreateParams build() {
      return new AccountEvaluationCreateParams(
          this.accountActivityDetails,
          this.accountDetails,
          this.extraParams,
          this.requestedSignals);
    }

    /** Account activity to record alongside this evaluation. */
    public Builder setAccountActivityDetails(
        AccountEvaluationCreateParams.AccountActivityDetails accountActivityDetails) {
      this.accountActivityDetails = accountActivityDetails;
      return this;
    }

    /** <strong>Required.</strong> The account, customer, or inline account data to evaluate. */
    public Builder setAccountDetails(AccountEvaluationCreateParams.AccountDetails accountDetails) {
      this.accountDetails = accountDetails;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountEvaluationCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountEvaluationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `requestedSignals` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * AccountEvaluationCreateParams#requestedSignals} for the field documentation.
     */
    public Builder addRequestedSignal(AccountEvaluationCreateParams.RequestedSignal element) {
      if (this.requestedSignals == null) {
        this.requestedSignals = new ArrayList<>();
      }
      this.requestedSignals.add(element);
      return this;
    }

    /**
     * Add all elements to `requestedSignals` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * AccountEvaluationCreateParams#requestedSignals} for the field documentation.
     */
    public Builder addAllRequestedSignal(
        List<AccountEvaluationCreateParams.RequestedSignal> elements) {
      if (this.requestedSignals == null) {
        this.requestedSignals = new ArrayList<>();
      }
      this.requestedSignals.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountActivityDetails {
    /** The ID of an existing account activity to associate with the evaluation. */
    @SerializedName("account_activity")
    String accountActivity;

    /** Inline activity data used to create a new account activity for the evaluation. */
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

    private AccountActivityDetails(
        String accountActivity, Data data, Map<String, Object> extraParams) {
      this.accountActivity = accountActivity;
      this.data = data;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountActivity;

      private Data data;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountEvaluationCreateParams.AccountActivityDetails build() {
        return new AccountEvaluationCreateParams.AccountActivityDetails(
            this.accountActivity, this.data, this.extraParams);
      }

      /** The ID of an existing account activity to associate with the evaluation. */
      public Builder setAccountActivity(String accountActivity) {
        this.accountActivity = accountActivity;
        return this;
      }

      /** Inline activity data used to create a new account activity for the evaluation. */
      public Builder setData(AccountEvaluationCreateParams.AccountActivityDetails.Data data) {
        this.data = data;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationCreateParams.AccountActivityDetails#extraParams} for the field
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
       * See {@link AccountEvaluationCreateParams.AccountActivityDetails#extraParams} for the field
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
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details for the login attempt. Provide only when type is login_attempt. */
      @SerializedName("login_attempt")
      LoginAttempt loginAttempt;

      /** Timestamp at which the activity occurred. Defaults to the created time if not provided. */
      @SerializedName("occurred_at")
      Instant occurredAt;

      /** Details for the registration attempt. Provide only when type is registration_attempt. */
      @SerializedName("registration_attempt")
      RegistrationAttempt registrationAttempt;

      /**
       * <strong>Required.</strong> The type of activity. Must be registration_attempt or
       * login_attempt.
       */
      @SerializedName("type")
      Type type;

      private Data(
          Map<String, Object> extraParams,
          LoginAttempt loginAttempt,
          Instant occurredAt,
          RegistrationAttempt registrationAttempt,
          Type type) {
        this.extraParams = extraParams;
        this.loginAttempt = loginAttempt;
        this.occurredAt = occurredAt;
        this.registrationAttempt = registrationAttempt;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private LoginAttempt loginAttempt;

        private Instant occurredAt;

        private RegistrationAttempt registrationAttempt;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountEvaluationCreateParams.AccountActivityDetails.Data build() {
          return new AccountEvaluationCreateParams.AccountActivityDetails.Data(
              this.extraParams,
              this.loginAttempt,
              this.occurredAt,
              this.registrationAttempt,
              this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountEvaluationCreateParams.AccountActivityDetails.Data#extraParams}
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
         * map. See {@link AccountEvaluationCreateParams.AccountActivityDetails.Data#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details for the login attempt. Provide only when type is login_attempt. */
        public Builder setLoginAttempt(
            AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt loginAttempt) {
          this.loginAttempt = loginAttempt;
          return this;
        }

        /**
         * Timestamp at which the activity occurred. Defaults to the created time if not provided.
         */
        public Builder setOccurredAt(Instant occurredAt) {
          this.occurredAt = occurredAt;
          return this;
        }

        /** Details for the registration attempt. Provide only when type is registration_attempt. */
        public Builder setRegistrationAttempt(
            AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt
                registrationAttempt) {
          this.registrationAttempt = registrationAttempt;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of activity. Must be registration_attempt or
         * login_attempt.
         */
        public Builder setType(
            AccountEvaluationCreateParams.AccountActivityDetails.Data.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class LoginAttempt {
        /** <strong>Required.</strong> Client details captured for the attempt. */
        @SerializedName("client_details")
        ClientDetails clientDetails;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt build() {
            return new AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt(
                this.clientDetails, this.extraParams);
          }

          /** <strong>Required.</strong> Client details captured for the attempt. */
          public Builder setClientDetails(
              AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt.ClientDetails
                  clientDetails) {
            this.clientDetails = clientDetails;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt#extraParams} for
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
           * map. See {@link
           * AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt#extraParams} for
           * the field documentation.
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
          InnerData data;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The Radar session ID capturing client details for the activity. */
          @SerializedName("radar_session")
          String radarSession;

          private ClientDetails(
              InnerData data, Map<String, Object> extraParams, String radarSession) {
            this.data = data;
            this.extraParams = extraParams;
            this.radarSession = radarSession;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private InnerData data;

            private Map<String, Object> extraParams;

            private String radarSession;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt
                    .ClientDetails
                build() {
              return new AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt
                  .ClientDetails(this.data, this.extraParams, this.radarSession);
            }

            /** Raw client details for the activity, when a Radar session is not available. */
            public Builder setData(
                AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt.ClientDetails
                        .InnerData
                    data) {
              this.data = data;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt.ClientDetails#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt.ClientDetails#extraParams}
             * for the field documentation.
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
          public static class InnerData {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
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

            private InnerData(
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
              public AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt
                      .ClientDetails.InnerData
                  build() {
                return new AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt
                    .ClientDetails.InnerData(
                    this.extraParams, this.ip, this.referrer, this.userAgent);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt.ClientDetails.InnerData#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountEvaluationCreateParams.AccountActivityDetails.Data.LoginAttempt.ClientDetails.InnerData#extraParams}
               * for the field documentation.
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
      public static class RegistrationAttempt {
        /** <strong>Required.</strong> Client details captured for the attempt. */
        @SerializedName("client_details")
        ClientDetails clientDetails;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt
              build() {
            return new AccountEvaluationCreateParams.AccountActivityDetails.Data
                .RegistrationAttempt(this.clientDetails, this.extraParams);
          }

          /** <strong>Required.</strong> Client details captured for the attempt. */
          public Builder setClientDetails(
              AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt
                      .ClientDetails
                  clientDetails) {
            this.clientDetails = clientDetails;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt#extraParams}
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
           * map. See {@link
           * AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt#extraParams}
           * for the field documentation.
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
          InnerData data;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The Radar session ID capturing client details for the activity. */
          @SerializedName("radar_session")
          String radarSession;

          private ClientDetails(
              InnerData data, Map<String, Object> extraParams, String radarSession) {
            this.data = data;
            this.extraParams = extraParams;
            this.radarSession = radarSession;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private InnerData data;

            private Map<String, Object> extraParams;

            private String radarSession;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt
                    .ClientDetails
                build() {
              return new AccountEvaluationCreateParams.AccountActivityDetails.Data
                  .RegistrationAttempt.ClientDetails(
                  this.data, this.extraParams, this.radarSession);
            }

            /** Raw client details for the activity, when a Radar session is not available. */
            public Builder setData(
                AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt
                        .ClientDetails.InnerData
                    data) {
              this.data = data;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt.ClientDetails#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt.ClientDetails#extraParams}
             * for the field documentation.
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
          public static class InnerData {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
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

            private InnerData(
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
              public AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt
                      .ClientDetails.InnerData
                  build() {
                return new AccountEvaluationCreateParams.AccountActivityDetails.Data
                    .RegistrationAttempt.ClientDetails.InnerData(
                    this.extraParams, this.ip, this.referrer, this.userAgent);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt.ClientDetails.InnerData#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountEvaluationCreateParams.AccountActivityDetails.Data.RegistrationAttempt.ClientDetails.InnerData#extraParams}
               * for the field documentation.
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
      public AccountEvaluationCreateParams.AccountDetails build() {
        return new AccountEvaluationCreateParams.AccountDetails(
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
      public Builder setData(AccountEvaluationCreateParams.AccountDetails.Data data) {
        this.data = data;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationCreateParams.AccountDetails#extraParams} for the field documentation.
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
       * See {@link AccountEvaluationCreateParams.AccountDetails#extraParams} for the field
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
        public AccountEvaluationCreateParams.AccountDetails.Data build() {
          return new AccountEvaluationCreateParams.AccountDetails.Data(
              this.defaults, this.extraParams);
        }

        /** Default account settings. */
        public Builder setDefaults(
            AccountEvaluationCreateParams.AccountDetails.Data.Defaults defaults) {
          this.defaults = defaults;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountEvaluationCreateParams.AccountDetails.Data#extraParams} for the
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
         * map. See {@link AccountEvaluationCreateParams.AccountDetails.Data#extraParams} for the
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
          public AccountEvaluationCreateParams.AccountDetails.Data.Defaults build() {
            return new AccountEvaluationCreateParams.AccountDetails.Data.Defaults(
                this.extraParams, this.profile);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountEvaluationCreateParams.AccountDetails.Data.Defaults#extraParams}
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
           * map. See {@link AccountEvaluationCreateParams.AccountDetails.Data.Defaults#extraParams}
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
              AccountEvaluationCreateParams.AccountDetails.Data.Defaults.Profile profile) {
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
            public AccountEvaluationCreateParams.AccountDetails.Data.Defaults.Profile build() {
              return new AccountEvaluationCreateParams.AccountDetails.Data.Defaults.Profile(
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
             * AccountEvaluationCreateParams.AccountDetails.Data.Defaults.Profile#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountEvaluationCreateParams.AccountDetails.Data.Defaults.Profile#extraParams} for
             * the field documentation.
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

  public enum RequestedSignal implements ApiRequestParams.EnumParam {
    @SerializedName("user_account_sharing")
    USER_ACCOUNT_SHARING("user_account_sharing"),

    @SerializedName("user_multi_accounting")
    USER_MULTI_ACCOUNTING("user_multi_accounting");

    @Getter(onMethod_ = {@Override})
    private final String value;

    RequestedSignal(String value) {
      this.value = value;
    }
  }
}
