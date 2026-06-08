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
public class AccountEvaluationCreateParams extends ApiRequestParams {
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

  /** Event payload for login_initiated. */
  @SerializedName("login_initiated")
  LoginInitiated loginInitiated;

  /** Event payload for registration_initiated. */
  @SerializedName("registration_initiated")
  RegistrationInitiated registrationInitiated;

  /** <strong>Required.</strong> The type of evaluation requested. */
  @SerializedName("type")
  Type type;

  private AccountEvaluationCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      LoginInitiated loginInitiated,
      RegistrationInitiated registrationInitiated,
      Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.loginInitiated = loginInitiated;
    this.registrationInitiated = registrationInitiated;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private LoginInitiated loginInitiated;

    private RegistrationInitiated registrationInitiated;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountEvaluationCreateParams build() {
      return new AccountEvaluationCreateParams(
          this.expand,
          this.extraParams,
          this.loginInitiated,
          this.registrationInitiated,
          this.type);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountEvaluationCreateParams#expand} for the field documentation.
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
     * AccountEvaluationCreateParams#expand} for the field documentation.
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

    /** Event payload for login_initiated. */
    public Builder setLoginInitiated(AccountEvaluationCreateParams.LoginInitiated loginInitiated) {
      this.loginInitiated = loginInitiated;
      return this;
    }

    /** Event payload for registration_initiated. */
    public Builder setRegistrationInitiated(
        AccountEvaluationCreateParams.RegistrationInitiated registrationInitiated) {
      this.registrationInitiated = registrationInitiated;
      return this;
    }

    /** <strong>Required.</strong> The type of evaluation requested. */
    public Builder setType(AccountEvaluationCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginInitiated {
    /** <strong>Required.</strong> Client device metadata details (e.g., radar_session). */
    @SerializedName("client_device_metadata_details")
    ClientDeviceMetadataDetails clientDeviceMetadataDetails;

    /** <strong>Required.</strong> Stripe customer ID */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private LoginInitiated(
        ClientDeviceMetadataDetails clientDeviceMetadataDetails,
        String customer,
        Map<String, Object> extraParams) {
      this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
      this.customer = customer;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDeviceMetadataDetails clientDeviceMetadataDetails;

      private String customer;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountEvaluationCreateParams.LoginInitiated build() {
        return new AccountEvaluationCreateParams.LoginInitiated(
            this.clientDeviceMetadataDetails, this.customer, this.extraParams);
      }

      /** <strong>Required.</strong> Client device metadata details (e.g., radar_session). */
      public Builder setClientDeviceMetadataDetails(
          AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails
              clientDeviceMetadataDetails) {
        this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
        return this;
      }

      /** <strong>Required.</strong> Stripe customer ID */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationCreateParams.LoginInitiated#extraParams} for the field documentation.
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
       * See {@link AccountEvaluationCreateParams.LoginInitiated#extraParams} for the field
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
    public static class ClientDeviceMetadataDetails {
      /**
       * Raw client metadata fallback when Stripe.js is blocked. Required unless radar_session is
       * provided.
       */
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

      /** ID for the Radar Session. Required unless data is provided. */
      @SerializedName("radar_session")
      String radarSession;

      private ClientDeviceMetadataDetails(
          Data data, Map<String, Object> extraParams, String radarSession) {
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
        public AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails build() {
          return new AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails(
              this.data, this.extraParams, this.radarSession);
        }

        /**
         * Raw client metadata fallback when Stripe.js is blocked. Required unless radar_session is
         * provided.
         */
        public Builder setData(
            AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails.Data data) {
          this.data = data;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails#extraParams} for
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
         * AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** ID for the Radar Session. Required unless data is provided. */
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

        /**
         * <strong>Required.</strong> The end user's IP address. Used for proxy detection and
         * IP-clustering signals.
         */
        @SerializedName("ip")
        String ip;

        /** The referring URL of the login or registration page. */
        @SerializedName("referrer")
        String referrer;

        /** The User-Agent HTTP header. */
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
          public AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails.Data
              build() {
            return new AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails
                .Data(this.extraParams, this.ip, this.referrer, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails.Data#extraParams}
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
           * AccountEvaluationCreateParams.LoginInitiated.ClientDeviceMetadataDetails.Data#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> The end user's IP address. Used for proxy detection and
           * IP-clustering signals.
           */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The referring URL of the login or registration page. */
          public Builder setReferrer(String referrer) {
            this.referrer = referrer;
            return this;
          }

          /** The User-Agent HTTP header. */
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
  public static class RegistrationInitiated {
    /** <strong>Required.</strong> Client device metadata details (e.g., radar_session). */
    @SerializedName("client_device_metadata_details")
    ClientDeviceMetadataDetails clientDeviceMetadataDetails;

    /** Stripe customer ID. */
    @SerializedName("customer")
    String customer;

    /** Customer data. */
    @SerializedName("customer_data")
    CustomerData customerData;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RegistrationInitiated(
        ClientDeviceMetadataDetails clientDeviceMetadataDetails,
        String customer,
        CustomerData customerData,
        Map<String, Object> extraParams) {
      this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
      this.customer = customer;
      this.customerData = customerData;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDeviceMetadataDetails clientDeviceMetadataDetails;

      private String customer;

      private CustomerData customerData;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountEvaluationCreateParams.RegistrationInitiated build() {
        return new AccountEvaluationCreateParams.RegistrationInitiated(
            this.clientDeviceMetadataDetails, this.customer, this.customerData, this.extraParams);
      }

      /** <strong>Required.</strong> Client device metadata details (e.g., radar_session). */
      public Builder setClientDeviceMetadataDetails(
          AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails
              clientDeviceMetadataDetails) {
        this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
        return this;
      }

      /** Stripe customer ID. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** Customer data. */
      public Builder setCustomerData(
          AccountEvaluationCreateParams.RegistrationInitiated.CustomerData customerData) {
        this.customerData = customerData;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationCreateParams.RegistrationInitiated#extraParams} for the field
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
       * See {@link AccountEvaluationCreateParams.RegistrationInitiated#extraParams} for the field
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
    public static class ClientDeviceMetadataDetails {
      /**
       * Raw client metadata fallback when Stripe.js is blocked. Required unless radar_session is
       * provided.
       */
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

      /** ID for the Radar Session. Required unless data is provided. */
      @SerializedName("radar_session")
      String radarSession;

      private ClientDeviceMetadataDetails(
          Data data, Map<String, Object> extraParams, String radarSession) {
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
        public AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails
            build() {
          return new AccountEvaluationCreateParams.RegistrationInitiated
              .ClientDeviceMetadataDetails(this.data, this.extraParams, this.radarSession);
        }

        /**
         * Raw client metadata fallback when Stripe.js is blocked. Required unless radar_session is
         * provided.
         */
        public Builder setData(
            AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails.Data
                data) {
          this.data = data;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails#extraParams}
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
         * AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** ID for the Radar Session. Required unless data is provided. */
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

        /**
         * <strong>Required.</strong> The end user's IP address. Used for proxy detection and
         * IP-clustering signals.
         */
        @SerializedName("ip")
        String ip;

        /** The referring URL of the login or registration page. */
        @SerializedName("referrer")
        String referrer;

        /** The User-Agent HTTP header. */
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
          public AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails
                  .Data
              build() {
            return new AccountEvaluationCreateParams.RegistrationInitiated
                .ClientDeviceMetadataDetails.Data(
                this.extraParams, this.ip, this.referrer, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails.Data#extraParams}
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
           * AccountEvaluationCreateParams.RegistrationInitiated.ClientDeviceMetadataDetails.Data#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> The end user's IP address. Used for proxy detection and
           * IP-clustering signals.
           */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The referring URL of the login or registration page. */
          public Builder setReferrer(String referrer) {
            this.referrer = referrer;
            return this;
          }

          /** The User-Agent HTTP header. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerData {
      /** Customer email. */
      @SerializedName("email")
      String email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Customer name. */
      @SerializedName("name")
      String name;

      /** Customer phone. */
      @SerializedName("phone")
      String phone;

      private CustomerData(
          String email, Map<String, Object> extraParams, String name, String phone) {
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String email;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountEvaluationCreateParams.RegistrationInitiated.CustomerData build() {
          return new AccountEvaluationCreateParams.RegistrationInitiated.CustomerData(
              this.email, this.extraParams, this.name, this.phone);
        }

        /** Customer email. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountEvaluationCreateParams.RegistrationInitiated.CustomerData#extraParams} for the
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
         * AccountEvaluationCreateParams.RegistrationInitiated.CustomerData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Customer name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Customer phone. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("login_initiated")
    LOGIN_INITIATED("login_initiated"),

    @SerializedName("registration_initiated")
    REGISTRATION_INITIATED("registration_initiated");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
