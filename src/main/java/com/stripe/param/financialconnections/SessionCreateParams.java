// File generated from our OpenAPI spec
package com.stripe.param.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SessionCreateParams extends ApiRequestParams {
  /** The account holder to link accounts for. */
  @SerializedName("account_holder")
  AccountHolder accountHolder;

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

  /** Filters to restrict the kinds of accounts to collect. */
  @SerializedName("filters")
  Filters filters;

  /**
   * List of data features that you would like to request access to.
   *
   * <p>Possible values are {@code balances}, {@code transactions}, {@code ownership}, and {@code
   * payment_method}.
   */
  @SerializedName("permissions")
  List<SessionCreateParams.Permission> permissions;

  /**
   * For webview integrations only. Upon completing OAuth login in the native browser, the user will
   * be redirected to this URL to return to your app.
   */
  @SerializedName("return_url")
  String returnUrl;

  private SessionCreateParams(
      AccountHolder accountHolder,
      List<String> expand,
      Map<String, Object> extraParams,
      Filters filters,
      List<SessionCreateParams.Permission> permissions,
      String returnUrl) {
    this.accountHolder = accountHolder;
    this.expand = expand;
    this.extraParams = extraParams;
    this.filters = filters;
    this.permissions = permissions;
    this.returnUrl = returnUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountHolder accountHolder;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Filters filters;

    private List<SessionCreateParams.Permission> permissions;

    private String returnUrl;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionCreateParams build() {
      return new SessionCreateParams(
          this.accountHolder,
          this.expand,
          this.extraParams,
          this.filters,
          this.permissions,
          this.returnUrl);
    }

    /** The account holder to link accounts for. */
    public Builder setAccountHolder(SessionCreateParams.AccountHolder accountHolder) {
      this.accountHolder = accountHolder;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#extraParams} for the field documentation.
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
     * See {@link SessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Filters to restrict the kinds of accounts to collect. */
    public Builder setFilters(SessionCreateParams.Filters filters) {
      this.filters = filters;
      return this;
    }

    /**
     * Add an element to `permissions` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#permissions} for the field documentation.
     */
    public Builder addPermission(SessionCreateParams.Permission element) {
      if (this.permissions == null) {
        this.permissions = new ArrayList<>();
      }
      this.permissions.add(element);
      return this;
    }

    /**
     * Add all elements to `permissions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#permissions} for the field documentation.
     */
    public Builder addAllPermission(List<SessionCreateParams.Permission> elements) {
      if (this.permissions == null) {
        this.permissions = new ArrayList<>();
      }
      this.permissions.addAll(elements);
      return this;
    }

    /**
     * For webview integrations only. Upon completing OAuth login in the native browser, the user
     * will be redirected to this URL to return to your app.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }
  }

  @Getter
  public static class AccountHolder {
    /**
     * The ID of the Stripe account whose accounts will be retrieved. Should only be present if
     * {@code type} is {@code account}.
     */
    @SerializedName("account")
    String account;

    /**
     * The ID of the Stripe customer whose accounts will be retrieved. Should only be present if
     * {@code type} is {@code customer}.
     */
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

    /** Type of account holder to collect accounts for. */
    @SerializedName("type")
    Type type;

    private AccountHolder(
        String account, String customer, Map<String, Object> extraParams, Type type) {
      this.account = account;
      this.customer = customer;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private String customer;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.AccountHolder build() {
        return new SessionCreateParams.AccountHolder(
            this.account, this.customer, this.extraParams, this.type);
      }

      /**
       * The ID of the Stripe account whose accounts will be retrieved. Should only be present if
       * {@code type} is {@code account}.
       */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /**
       * The ID of the Stripe customer whose accounts will be retrieved. Should only be present if
       * {@code type} is {@code customer}.
       */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.AccountHolder#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.AccountHolder#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Type of account holder to collect accounts for. */
      public Builder setType(SessionCreateParams.AccountHolder.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("account")
      ACCOUNT("account"),

      @SerializedName("customer")
      CUSTOMER("customer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Filters {
    /** List of countries from which to collect accounts. */
    @SerializedName("countries")
    List<String> countries;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Filters(List<String> countries, Map<String, Object> extraParams) {
      this.countries = countries;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<String> countries;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.Filters build() {
        return new SessionCreateParams.Filters(this.countries, this.extraParams);
      }

      /**
       * Add an element to `countries` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.Filters#countries} for the field documentation.
       */
      public Builder addCountry(String element) {
        if (this.countries == null) {
          this.countries = new ArrayList<>();
        }
        this.countries.add(element);
        return this;
      }

      /**
       * Add all elements to `countries` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SessionCreateParams.Filters#countries} for the field documentation.
       */
      public Builder addAllCountry(List<String> elements) {
        if (this.countries == null) {
          this.countries = new ArrayList<>();
        }
        this.countries.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.Filters#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.Filters#extraParams} for the field documentation.
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

  public enum Permission implements ApiRequestParams.EnumParam {
    @SerializedName("balances")
    BALANCES("balances"),

    @SerializedName("ownership")
    OWNERSHIP("ownership"),

    @SerializedName("payment_method")
    PAYMENT_METHOD("payment_method"),

    @SerializedName("transactions")
    TRANSACTIONS("transactions");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Permission(String value) {
      this.value = value;
    }
  }
}
