// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

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
  /** The account ID to evaluate. Exactly one of account or account_data must be provided. */
  @SerializedName("account")
  String account;

  /**
   * Account data for entity-less evaluation. Exactly one of account or account_data must be
   * provided.
   */
  @SerializedName("account_data")
  AccountData accountData;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> List of signals to evaluate. */
  @SerializedName("signals")
  List<AccountEvaluationCreateParams.Signal> signals;

  private AccountEvaluationCreateParams(
      String account,
      AccountData accountData,
      Map<String, Object> extraParams,
      List<AccountEvaluationCreateParams.Signal> signals) {
    this.account = account;
    this.accountData = accountData;
    this.extraParams = extraParams;
    this.signals = signals;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private AccountData accountData;

    private Map<String, Object> extraParams;

    private List<AccountEvaluationCreateParams.Signal> signals;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountEvaluationCreateParams build() {
      return new AccountEvaluationCreateParams(
          this.account, this.accountData, this.extraParams, this.signals);
    }

    /** The account ID to evaluate. Exactly one of account or account_data must be provided. */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * Account data for entity-less evaluation. Exactly one of account or account_data must be
     * provided.
     */
    public Builder setAccountData(AccountEvaluationCreateParams.AccountData accountData) {
      this.accountData = accountData;
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
     * Add an element to `signals` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountEvaluationCreateParams#signals} for the field documentation.
     */
    public Builder addSignal(AccountEvaluationCreateParams.Signal element) {
      if (this.signals == null) {
        this.signals = new ArrayList<>();
      }
      this.signals.add(element);
      return this;
    }

    /**
     * Add all elements to `signals` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountEvaluationCreateParams#signals} for the field documentation.
     */
    public Builder addAllSignal(List<AccountEvaluationCreateParams.Signal> elements) {
      if (this.signals == null) {
        this.signals = new ArrayList<>();
      }
      this.signals.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountData {
    /** Default account settings. */
    @SerializedName("defaults")
    Defaults defaults;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Identity data. */
    @SerializedName("identity")
    Identity identity;

    private AccountData(Defaults defaults, Map<String, Object> extraParams, Identity identity) {
      this.defaults = defaults;
      this.extraParams = extraParams;
      this.identity = identity;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Defaults defaults;

      private Map<String, Object> extraParams;

      private Identity identity;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountEvaluationCreateParams.AccountData build() {
        return new AccountEvaluationCreateParams.AccountData(
            this.defaults, this.extraParams, this.identity);
      }

      /** Default account settings. */
      public Builder setDefaults(AccountEvaluationCreateParams.AccountData.Defaults defaults) {
        this.defaults = defaults;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountEvaluationCreateParams.AccountData#extraParams} for the field documentation.
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
       * See {@link AccountEvaluationCreateParams.AccountData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Identity data. */
      public Builder setIdentity(AccountEvaluationCreateParams.AccountData.Identity identity) {
        this.identity = identity;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Defaults {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public AccountEvaluationCreateParams.AccountData.Defaults build() {
          return new AccountEvaluationCreateParams.AccountData.Defaults(
              this.extraParams, this.profile);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountEvaluationCreateParams.AccountData.Defaults#extraParams} for the
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
         * map. See {@link AccountEvaluationCreateParams.AccountData.Defaults#extraParams} for the
         * field documentation.
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
            AccountEvaluationCreateParams.AccountData.Defaults.Profile profile) {
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
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public AccountEvaluationCreateParams.AccountData.Defaults.Profile build() {
            return new AccountEvaluationCreateParams.AccountData.Defaults.Profile(
                this.businessUrl, this.doingBusinessAs, this.extraParams, this.productDescription);
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountEvaluationCreateParams.AccountData.Defaults.Profile#extraParams}
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
           * map. See {@link AccountEvaluationCreateParams.AccountData.Defaults.Profile#extraParams}
           * for the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Identity {
      /** <strong>Required.</strong> Business details for identity data. */
      @SerializedName("business_details")
      BusinessDetails businessDetails;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Identity(BusinessDetails businessDetails, Map<String, Object> extraParams) {
        this.businessDetails = businessDetails;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BusinessDetails businessDetails;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountEvaluationCreateParams.AccountData.Identity build() {
          return new AccountEvaluationCreateParams.AccountData.Identity(
              this.businessDetails, this.extraParams);
        }

        /** <strong>Required.</strong> Business details for identity data. */
        public Builder setBusinessDetails(
            AccountEvaluationCreateParams.AccountData.Identity.BusinessDetails businessDetails) {
          this.businessDetails = businessDetails;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountEvaluationCreateParams.AccountData.Identity#extraParams} for the
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
         * map. See {@link AccountEvaluationCreateParams.AccountData.Identity#extraParams} for the
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
      public static class BusinessDetails {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Registered business name. */
        @SerializedName("registered_name")
        String registeredName;

        private BusinessDetails(Map<String, Object> extraParams, String registeredName) {
          this.extraParams = extraParams;
          this.registeredName = registeredName;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String registeredName;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountEvaluationCreateParams.AccountData.Identity.BusinessDetails build() {
            return new AccountEvaluationCreateParams.AccountData.Identity.BusinessDetails(
                this.extraParams, this.registeredName);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountEvaluationCreateParams.AccountData.Identity.BusinessDetails#extraParams} for the
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
           * AccountEvaluationCreateParams.AccountData.Identity.BusinessDetails#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Registered business name. */
          public Builder setRegisteredName(String registeredName) {
            this.registeredName = registeredName;
            return this;
          }
        }
      }
    }
  }

  public enum Signal implements ApiRequestParams.EnumParam {
    @SerializedName("fraudulent_website")
    FRAUDULENT_WEBSITE("fraudulent_website");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Signal(String value) {
      this.value = value;
    }
  }
}
