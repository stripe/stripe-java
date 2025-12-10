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
public class AccountLinkCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the Account to create link for. */
  @SerializedName("account")
  String account;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The use case of the AccountLink. */
  @SerializedName("use_case")
  UseCase useCase;

  private AccountLinkCreateParams(
      String account, Map<String, Object> extraParams, UseCase useCase) {
    this.account = account;
    this.extraParams = extraParams;
    this.useCase = useCase;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Map<String, Object> extraParams;

    private UseCase useCase;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountLinkCreateParams build() {
      return new AccountLinkCreateParams(this.account, this.extraParams, this.useCase);
    }

    /** <strong>Required.</strong> The ID of the Account to create link for. */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountLinkCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountLinkCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The use case of the AccountLink. */
    public Builder setUseCase(AccountLinkCreateParams.UseCase useCase) {
      this.useCase = useCase;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UseCase {
    /**
     * Hash containing configuration options for an Account Link object that onboards a new account.
     */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /**
     * Hash containing configuration options for an Account Link that updates an existing account.
     */
    @SerializedName("account_update")
    AccountUpdate accountUpdate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Open Enum. The type of Account Link the user is requesting. */
    @SerializedName("type")
    Type type;

    private UseCase(
        AccountOnboarding accountOnboarding,
        AccountUpdate accountUpdate,
        Map<String, Object> extraParams,
        Type type) {
      this.accountOnboarding = accountOnboarding;
      this.accountUpdate = accountUpdate;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountOnboarding accountOnboarding;

      private AccountUpdate accountUpdate;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountLinkCreateParams.UseCase build() {
        return new AccountLinkCreateParams.UseCase(
            this.accountOnboarding, this.accountUpdate, this.extraParams, this.type);
      }

      /**
       * Hash containing configuration options for an Account Link object that onboards a new
       * account.
       */
      public Builder setAccountOnboarding(
          AccountLinkCreateParams.UseCase.AccountOnboarding accountOnboarding) {
        this.accountOnboarding = accountOnboarding;
        return this;
      }

      /**
       * Hash containing configuration options for an Account Link that updates an existing account.
       */
      public Builder setAccountUpdate(AccountLinkCreateParams.UseCase.AccountUpdate accountUpdate) {
        this.accountUpdate = accountUpdate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountLinkCreateParams.UseCase#extraParams} for the field documentation.
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
       * See {@link AccountLinkCreateParams.UseCase#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Open Enum. The type of Account Link the user is requesting. */
      public Builder setType(AccountLinkCreateParams.UseCase.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding {
      /**
       * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
       * flow.
       */
      @SerializedName("collection_options")
      CollectionOptions collectionOptions;

      /**
       * <strong>Required.</strong> Open Enum. A v2/core/account can be configured to enable certain
       * functionality. The configuration param targets the v2/core/account_link to collect
       * information for the specified v2/core/account configuration/s.
       */
      @SerializedName("configurations")
      List<AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration> configurations;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The URL the user will be redirected to if the AccountLink is
       * expired, has been used, or is otherwise invalid. The URL you specify should attempt to
       * generate a new AccountLink with the same parameters used to create the original
       * AccountLink, then redirect the user to the new AccountLink’s URL so they can continue the
       * flow. If a new AccountLink cannot be generated or the redirect fails you should display a
       * useful error to the user. Please make sure to implement authentication before redirecting
       * the user in case this URL is leaked to a third party.
       */
      @SerializedName("refresh_url")
      String refreshUrl;

      /** The URL that the user will be redirected to upon completing the linked flow. */
      @SerializedName("return_url")
      String returnUrl;

      private AccountOnboarding(
          CollectionOptions collectionOptions,
          List<AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration> configurations,
          Map<String, Object> extraParams,
          String refreshUrl,
          String returnUrl) {
        this.collectionOptions = collectionOptions;
        this.configurations = configurations;
        this.extraParams = extraParams;
        this.refreshUrl = refreshUrl;
        this.returnUrl = returnUrl;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectionOptions collectionOptions;

        private List<AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration>
            configurations;

        private Map<String, Object> extraParams;

        private String refreshUrl;

        private String returnUrl;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountLinkCreateParams.UseCase.AccountOnboarding build() {
          return new AccountLinkCreateParams.UseCase.AccountOnboarding(
              this.collectionOptions,
              this.configurations,
              this.extraParams,
              this.refreshUrl,
              this.returnUrl);
        }

        /**
         * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
         * flow.
         */
        public Builder setCollectionOptions(
            AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions collectionOptions) {
          this.collectionOptions = collectionOptions;
          return this;
        }

        /**
         * Add an element to `configurations` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountLinkCreateParams.UseCase.AccountOnboarding#configurations} for the field
         * documentation.
         */
        public Builder addConfiguration(
            AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration element) {
          if (this.configurations == null) {
            this.configurations = new ArrayList<>();
          }
          this.configurations.add(element);
          return this;
        }

        /**
         * Add all elements to `configurations` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountLinkCreateParams.UseCase.AccountOnboarding#configurations} for the
         * field documentation.
         */
        public Builder addAllConfiguration(
            List<AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration> elements) {
          if (this.configurations == null) {
            this.configurations = new ArrayList<>();
          }
          this.configurations.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountLinkCreateParams.UseCase.AccountOnboarding#extraParams} for the
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
         * map. See {@link AccountLinkCreateParams.UseCase.AccountOnboarding#extraParams} for the
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
         * <strong>Required.</strong> The URL the user will be redirected to if the AccountLink is
         * expired, has been used, or is otherwise invalid. The URL you specify should attempt to
         * generate a new AccountLink with the same parameters used to create the original
         * AccountLink, then redirect the user to the new AccountLink’s URL so they can continue the
         * flow. If a new AccountLink cannot be generated or the redirect fails you should display a
         * useful error to the user. Please make sure to implement authentication before redirecting
         * the user in case this URL is leaked to a third party.
         */
        public Builder setRefreshUrl(String refreshUrl) {
          this.refreshUrl = refreshUrl;
          return this;
        }

        /** The URL that the user will be redirected to upon completing the linked flow. */
        public Builder setReturnUrl(String returnUrl) {
          this.returnUrl = returnUrl;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CollectionOptions {
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
         * Specifies whether the platform collects only currently_due requirements ({@code
         * currently_due}) or both currently_due and eventually_due requirements ({@code
         * eventually_due}). If you don’t specify collection_options, the default value is
         * currently_due.
         */
        @SerializedName("fields")
        Fields fields;

        /**
         * Specifies whether the platform collects future_requirements in addition to requirements
         * in Connect Onboarding. The default value is {@code omit}.
         */
        @SerializedName("future_requirements")
        FutureRequirements futureRequirements;

        private CollectionOptions(
            Map<String, Object> extraParams, Fields fields, FutureRequirements futureRequirements) {
          this.extraParams = extraParams;
          this.fields = fields;
          this.futureRequirements = futureRequirements;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Fields fields;

          private FutureRequirements futureRequirements;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions build() {
            return new AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions(
                this.extraParams, this.fields, this.futureRequirements);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions#extraParams} for
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
           * AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions#extraParams} for
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
           * Specifies whether the platform collects only currently_due requirements ({@code
           * currently_due}) or both currently_due and eventually_due requirements ({@code
           * eventually_due}). If you don’t specify collection_options, the default value is
           * currently_due.
           */
          public Builder setFields(
              AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions.Fields fields) {
            this.fields = fields;
            return this;
          }

          /**
           * Specifies whether the platform collects future_requirements in addition to requirements
           * in Connect Onboarding. The default value is {@code omit}.
           */
          public Builder setFutureRequirements(
              AccountLinkCreateParams.UseCase.AccountOnboarding.CollectionOptions.FutureRequirements
                  futureRequirements) {
            this.futureRequirements = futureRequirements;
            return this;
          }
        }

        public enum Fields implements ApiRequestParams.EnumParam {
          @SerializedName("currently_due")
          CURRENTLY_DUE("currently_due"),

          @SerializedName("eventually_due")
          EVENTUALLY_DUE("eventually_due");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Fields(String value) {
            this.value = value;
          }
        }

        public enum FutureRequirements implements ApiRequestParams.EnumParam {
          @SerializedName("include")
          INCLUDE("include"),

          @SerializedName("omit")
          OMIT("omit");

          @Getter(onMethod_ = {@Override})
          private final String value;

          FutureRequirements(String value) {
            this.value = value;
          }
        }
      }

      public enum Configuration implements ApiRequestParams.EnumParam {
        @SerializedName("customer")
        CUSTOMER("customer"),

        @SerializedName("merchant")
        MERCHANT("merchant"),

        @SerializedName("recipient")
        RECIPIENT("recipient");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Configuration(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountUpdate {
      /**
       * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
       * flow.
       */
      @SerializedName("collection_options")
      CollectionOptions collectionOptions;

      /**
       * <strong>Required.</strong> Open Enum. A v2/account can be configured to enable certain
       * functionality. The configuration param targets the v2/account_link to collect information
       * for the specified v2/account configuration/s.
       */
      @SerializedName("configurations")
      List<AccountLinkCreateParams.UseCase.AccountUpdate.Configuration> configurations;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The URL the user will be redirected to if the Account Link is
       * expired, has been used, or is otherwise invalid. The URL you specify should attempt to
       * generate a new Account Link with the same parameters used to create the original Account
       * Link, then redirect the user to the new Account Link URL so they can continue the flow.
       * Make sure to authenticate the user before redirecting to the new Account Link, in case the
       * URL leaks to a third party. If a new Account Link can't be generated, or if the redirect
       * fails, you should display a useful error to the user.
       */
      @SerializedName("refresh_url")
      String refreshUrl;

      /** The URL that the user will be redirected to upon completing the linked flow. */
      @SerializedName("return_url")
      String returnUrl;

      private AccountUpdate(
          CollectionOptions collectionOptions,
          List<AccountLinkCreateParams.UseCase.AccountUpdate.Configuration> configurations,
          Map<String, Object> extraParams,
          String refreshUrl,
          String returnUrl) {
        this.collectionOptions = collectionOptions;
        this.configurations = configurations;
        this.extraParams = extraParams;
        this.refreshUrl = refreshUrl;
        this.returnUrl = returnUrl;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectionOptions collectionOptions;

        private List<AccountLinkCreateParams.UseCase.AccountUpdate.Configuration> configurations;

        private Map<String, Object> extraParams;

        private String refreshUrl;

        private String returnUrl;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountLinkCreateParams.UseCase.AccountUpdate build() {
          return new AccountLinkCreateParams.UseCase.AccountUpdate(
              this.collectionOptions,
              this.configurations,
              this.extraParams,
              this.refreshUrl,
              this.returnUrl);
        }

        /**
         * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
         * flow.
         */
        public Builder setCollectionOptions(
            AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions collectionOptions) {
          this.collectionOptions = collectionOptions;
          return this;
        }

        /**
         * Add an element to `configurations` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountLinkCreateParams.UseCase.AccountUpdate#configurations} for the field
         * documentation.
         */
        public Builder addConfiguration(
            AccountLinkCreateParams.UseCase.AccountUpdate.Configuration element) {
          if (this.configurations == null) {
            this.configurations = new ArrayList<>();
          }
          this.configurations.add(element);
          return this;
        }

        /**
         * Add all elements to `configurations` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountLinkCreateParams.UseCase.AccountUpdate#configurations} for the field
         * documentation.
         */
        public Builder addAllConfiguration(
            List<AccountLinkCreateParams.UseCase.AccountUpdate.Configuration> elements) {
          if (this.configurations == null) {
            this.configurations = new ArrayList<>();
          }
          this.configurations.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountLinkCreateParams.UseCase.AccountUpdate#extraParams} for the field
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
         * map. See {@link AccountLinkCreateParams.UseCase.AccountUpdate#extraParams} for the field
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
         * <strong>Required.</strong> The URL the user will be redirected to if the Account Link is
         * expired, has been used, or is otherwise invalid. The URL you specify should attempt to
         * generate a new Account Link with the same parameters used to create the original Account
         * Link, then redirect the user to the new Account Link URL so they can continue the flow.
         * Make sure to authenticate the user before redirecting to the new Account Link, in case
         * the URL leaks to a third party. If a new Account Link can't be generated, or if the
         * redirect fails, you should display a useful error to the user.
         */
        public Builder setRefreshUrl(String refreshUrl) {
          this.refreshUrl = refreshUrl;
          return this;
        }

        /** The URL that the user will be redirected to upon completing the linked flow. */
        public Builder setReturnUrl(String returnUrl) {
          this.returnUrl = returnUrl;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CollectionOptions {
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
         * Specifies whether the platform collects only currently_due requirements ({@code
         * currently_due}) or both currently_due and eventually_due requirements ({@code
         * eventually_due}). The default value is {@code currently_due}.
         */
        @SerializedName("fields")
        Fields fields;

        /**
         * Specifies whether the platform collects future_requirements in addition to requirements
         * in Connect Onboarding. The default value is {@code omit}.
         */
        @SerializedName("future_requirements")
        FutureRequirements futureRequirements;

        private CollectionOptions(
            Map<String, Object> extraParams, Fields fields, FutureRequirements futureRequirements) {
          this.extraParams = extraParams;
          this.fields = fields;
          this.futureRequirements = futureRequirements;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Fields fields;

          private FutureRequirements futureRequirements;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions build() {
            return new AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions(
                this.extraParams, this.fields, this.futureRequirements);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions#extraParams} for the
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
           * AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions#extraParams} for the
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
           * Specifies whether the platform collects only currently_due requirements ({@code
           * currently_due}) or both currently_due and eventually_due requirements ({@code
           * eventually_due}). The default value is {@code currently_due}.
           */
          public Builder setFields(
              AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions.Fields fields) {
            this.fields = fields;
            return this;
          }

          /**
           * Specifies whether the platform collects future_requirements in addition to requirements
           * in Connect Onboarding. The default value is {@code omit}.
           */
          public Builder setFutureRequirements(
              AccountLinkCreateParams.UseCase.AccountUpdate.CollectionOptions.FutureRequirements
                  futureRequirements) {
            this.futureRequirements = futureRequirements;
            return this;
          }
        }

        public enum Fields implements ApiRequestParams.EnumParam {
          @SerializedName("currently_due")
          CURRENTLY_DUE("currently_due"),

          @SerializedName("eventually_due")
          EVENTUALLY_DUE("eventually_due");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Fields(String value) {
            this.value = value;
          }
        }

        public enum FutureRequirements implements ApiRequestParams.EnumParam {
          @SerializedName("include")
          INCLUDE("include"),

          @SerializedName("omit")
          OMIT("omit");

          @Getter(onMethod_ = {@Override})
          private final String value;

          FutureRequirements(String value) {
            this.value = value;
          }
        }
      }

      public enum Configuration implements ApiRequestParams.EnumParam {
        @SerializedName("customer")
        CUSTOMER("customer"),

        @SerializedName("merchant")
        MERCHANT("merchant"),

        @SerializedName("recipient")
        RECIPIENT("recipient");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Configuration(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("account_onboarding")
      ACCOUNT_ONBOARDING("account_onboarding"),

      @SerializedName("account_update")
      ACCOUNT_UPDATE("account_update");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
