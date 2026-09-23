// File generated from our OpenAPI spec
package com.stripe.param.financialconnections;

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
public class ConsentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The account holder for whom the Consent is issued. */
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

  /**
   * The customer's preferred locale for the consent text, expressed as a BCP 47 language tag. If
   * omitted, Stripe uses the default locale.
   */
  @SerializedName("locale")
  String locale;

  private ConsentCreateParams(
      AccountHolder accountHolder,
      List<String> expand,
      Map<String, Object> extraParams,
      String locale) {
    this.accountHolder = accountHolder;
    this.expand = expand;
    this.extraParams = extraParams;
    this.locale = locale;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountHolder accountHolder;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String locale;

    /** Finalize and obtain parameter instance from this builder. */
    public ConsentCreateParams build() {
      return new ConsentCreateParams(
          this.accountHolder, this.expand, this.extraParams, this.locale);
    }

    /** <strong>Required.</strong> The account holder for whom the Consent is issued. */
    public Builder setAccountHolder(ConsentCreateParams.AccountHolder accountHolder) {
      this.accountHolder = accountHolder;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ConsentCreateParams#expand} for the field documentation.
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
     * ConsentCreateParams#expand} for the field documentation.
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
     * ConsentCreateParams#extraParams} for the field documentation.
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
     * See {@link ConsentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The customer's preferred locale for the consent text, expressed as a BCP 47 language tag. If
     * omitted, Stripe uses the default locale.
     */
    public Builder setLocale(String locale) {
      this.locale = locale;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountHolder {
    /**
     * The ID of the Account for whom the Consent is issued. Required when {@code type} is {@code
     * account}.
     */
    @SerializedName("account")
    String account;

    /**
     * The ID of the Customer for whom the Consent is issued. Required when {@code type} is {@code
     * customer} unless {@code customer_account} is provided.
     */
    @SerializedName("customer")
    String customer;

    /**
     * The ID of an Account representing the Customer for whom the Consent is issued. Required when
     * {@code type} is {@code customer} unless {@code customer} is provided.
     */
    @SerializedName("customer_account")
    String customerAccount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The type of account holder for whom the Consent is issued. */
    @SerializedName("type")
    Type type;

    private AccountHolder(
        String account,
        String customer,
        String customerAccount,
        Map<String, Object> extraParams,
        Type type) {
      this.account = account;
      this.customer = customer;
      this.customerAccount = customerAccount;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private String customer;

      private String customerAccount;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ConsentCreateParams.AccountHolder build() {
        return new ConsentCreateParams.AccountHolder(
            this.account, this.customer, this.customerAccount, this.extraParams, this.type);
      }

      /**
       * The ID of the Account for whom the Consent is issued. Required when {@code type} is {@code
       * account}.
       */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /**
       * The ID of the Customer for whom the Consent is issued. Required when {@code type} is {@code
       * customer} unless {@code customer_account} is provided.
       */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * The ID of an Account representing the Customer for whom the Consent is issued. Required
       * when {@code type} is {@code customer} unless {@code customer} is provided.
       */
      public Builder setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConsentCreateParams.AccountHolder#extraParams} for the field documentation.
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
       * See {@link ConsentCreateParams.AccountHolder#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The type of account holder for whom the Consent is issued. */
      public Builder setType(ConsentCreateParams.AccountHolder.Type type) {
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
}
