// File generated from our OpenAPI spec
package com.stripe.param.v2;

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
    /** Indicates that the AccountLink provided should onboard an account. */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /** Indicates that the AccountLink provided should update a previously onboarded account. */
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

    /** <strong>Required.</strong> Open Enum. The type of AccountLink the user is requesting. */
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

      /** Indicates that the AccountLink provided should onboard an account. */
      public Builder setAccountOnboarding(
          AccountLinkCreateParams.UseCase.AccountOnboarding accountOnboarding) {
        this.accountOnboarding = accountOnboarding;
        return this;
      }

      /** Indicates that the AccountLink provided should update a previously onboarded account. */
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

      /** <strong>Required.</strong> Open Enum. The type of AccountLink the user is requesting. */
      public Builder setType(AccountLinkCreateParams.UseCase.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding {
      /**
       * <strong>Required.</strong> Open Enum. A v2/account can be configured to enable certain
       * functionality. The configuration param targets the v2/account_link to collect information
       * for the specified v2/account configuration/s.
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
          List<AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration> configurations,
          Map<String, Object> extraParams,
          String refreshUrl,
          String returnUrl) {
        this.configurations = configurations;
        this.extraParams = extraParams;
        this.refreshUrl = refreshUrl;
        this.returnUrl = returnUrl;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<AccountLinkCreateParams.UseCase.AccountOnboarding.Configuration>
            configurations;

        private Map<String, Object> extraParams;

        private String refreshUrl;

        private String returnUrl;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountLinkCreateParams.UseCase.AccountOnboarding build() {
          return new AccountLinkCreateParams.UseCase.AccountOnboarding(
              this.configurations, this.extraParams, this.refreshUrl, this.returnUrl);
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

      public enum Configuration implements ApiRequestParams.EnumParam {
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

      private AccountUpdate(
          List<AccountLinkCreateParams.UseCase.AccountUpdate.Configuration> configurations,
          Map<String, Object> extraParams,
          String refreshUrl,
          String returnUrl) {
        this.configurations = configurations;
        this.extraParams = extraParams;
        this.refreshUrl = refreshUrl;
        this.returnUrl = returnUrl;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<AccountLinkCreateParams.UseCase.AccountUpdate.Configuration> configurations;

        private Map<String, Object> extraParams;

        private String refreshUrl;

        private String returnUrl;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountLinkCreateParams.UseCase.AccountUpdate build() {
          return new AccountLinkCreateParams.UseCase.AccountUpdate(
              this.configurations, this.extraParams, this.refreshUrl, this.returnUrl);
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

      public enum Configuration implements ApiRequestParams.EnumParam {
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
