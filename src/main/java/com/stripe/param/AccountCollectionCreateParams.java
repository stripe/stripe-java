// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class AccountCollectionCreateParams extends ApiRequestParams {
  /**
   * When set to true, or if this is the first external account added in this currency, this account
   * becomes the default external account for its currency.
   */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * <strong>Required.</strong> Please refer to full <a
   * href="https://stripe.com/docs/api">documentation</a> instead.
   */
  @SerializedName("external_account")
  Object externalAccount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private AccountCollectionCreateParams(
      Boolean defaultForCurrency,
      List<String> expand,
      Object externalAccount,
      Map<String, Object> extraParams,
      Map<String, String> metadata) {
    this.defaultForCurrency = defaultForCurrency;
    this.expand = expand;
    this.externalAccount = externalAccount;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean defaultForCurrency;

    private List<String> expand;

    private Object externalAccount;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountCollectionCreateParams build() {
      return new AccountCollectionCreateParams(
          this.defaultForCurrency,
          this.expand,
          this.externalAccount,
          this.extraParams,
          this.metadata);
    }

    /**
     * When set to true, or if this is the first external account added in this currency, this
     * account becomes the default external account for its currency.
     */
    public Builder setDefaultForCurrency(Boolean defaultForCurrency) {
      this.defaultForCurrency = defaultForCurrency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountCollectionCreateParams#expand} for the field documentation.
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
     * AccountCollectionCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * <strong>Required.</strong> Please refer to full <a
     * href="https://stripe.com/docs/api">documentation</a> instead.
     */
    public Builder setExternalAccount(String externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * <strong>Required.</strong> Please refer to full <a
     * href="https://stripe.com/docs/api">documentation</a> instead.
     */
    public Builder setExternalAccount(AccountCollectionCreateParams.Card externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * <strong>Required.</strong> Please refer to full <a
     * href="https://stripe.com/docs/api">documentation</a> instead.
     */
    public Builder setExternalAccount(AccountCollectionCreateParams.BankAccount externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * <strong>Required.</strong> Please refer to full <a
     * href="https://stripe.com/docs/api">documentation</a> instead.
     */
    public Builder setExternalAccount(AccountCollectionCreateParams.CardToken externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCollectionCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountCollectionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AccountCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  public static class BankAccount {
    /**
     * The name of the person or business that owns the bank account.This field is required when
     * attaching the bank account to a {@code Customer} object.
     */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /**
     * The type of entity that holds the account. It can be {@code company} or {@code individual}.
     * This field is required when attaching the bank account to a {@code Customer} object.
     */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /**
     * <strong>Required.</strong> The account number for the bank account, in string form. Must be a
     * checking account.
     */
    @SerializedName("account_number")
    String accountNumber;

    /** <strong>Required.</strong> The country in which the bank account is located. */
    @SerializedName("country")
    String country;

    /**
     * The currency the bank account is in. This must be a country/currency pairing that <a
     * href="docs/payouts">Stripe supports.</a>
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> */
    @SerializedName("object")
    String object;

    /**
     * The routing number, sort code, or other country-appropriateinstitution number for the bank
     * account. For US bank accounts, this is required and should bethe ACH routing number, not the
     * wire routing number. If you are providing an IBAN for{@code account_number}, this field is
     * not required.
     */
    @SerializedName("routing_number")
    String routingNumber;

    private BankAccount(
        String accountHolderName,
        AccountHolderType accountHolderType,
        String accountNumber,
        String country,
        String currency,
        Map<String, Object> extraParams,
        String object,
        String routingNumber) {
      this.accountHolderName = accountHolderName;
      this.accountHolderType = accountHolderType;
      this.accountNumber = accountNumber;
      this.country = country;
      this.currency = currency;
      this.extraParams = extraParams;
      this.object = object;
      this.routingNumber = routingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountHolderName;

      private AccountHolderType accountHolderType;

      private String accountNumber;

      private String country;

      private String currency;

      private Map<String, Object> extraParams;

      private String object;

      private String routingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCollectionCreateParams.BankAccount build() {
        return new AccountCollectionCreateParams.BankAccount(
            this.accountHolderName,
            this.accountHolderType,
            this.accountNumber,
            this.country,
            this.currency,
            this.extraParams,
            this.object,
            this.routingNumber);
      }

      /**
       * The name of the person or business that owns the bank account.This field is required when
       * attaching the bank account to a {@code Customer} object.
       */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /**
       * The type of entity that holds the account. It can be {@code company} or {@code individual}.
       * This field is required when attaching the bank account to a {@code Customer} object.
       */
      public Builder setAccountHolderType(
          AccountCollectionCreateParams.BankAccount.AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /**
       * <strong>Required.</strong> The account number for the bank account, in string form. Must be
       * a checking account.
       */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /** <strong>Required.</strong> The country in which the bank account is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * The currency the bank account is in. This must be a country/currency pairing that <a
       * href="docs/payouts">Stripe supports.</a>
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCollectionCreateParams.BankAccount#extraParams} for the field documentation.
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
       * See {@link AccountCollectionCreateParams.BankAccount#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setObject(String object) {
        this.object = object;
        return this;
      }

      /**
       * The routing number, sort code, or other country-appropriateinstitution number for the bank
       * account. For US bank accounts, this is required and should bethe ACH routing number, not
       * the wire routing number. If you are providing an IBAN for{@code account_number}, this field
       * is not required.
       */
      public Builder setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
        return this;
      }
    }

    public enum AccountHolderType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountHolderType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Card {
    @SerializedName("address_city")
    String addressCity;

    @SerializedName("address_country")
    String addressCountry;

    @SerializedName("address_line1")
    String addressLine1;

    @SerializedName("address_line2")
    String addressLine2;

    @SerializedName("address_state")
    String addressState;

    @SerializedName("address_zip")
    String addressZip;

    @SerializedName("currency")
    String currency;

    @SerializedName("cvc")
    String cvc;

    /** <strong>Required.</strong> */
    @SerializedName("exp_month")
    Long expMonth;

    /** <strong>Required.</strong> */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    @SerializedName("name")
    String name;

    /** <strong>Required.</strong> */
    @SerializedName("number")
    String number;

    /** <strong>Required.</strong> */
    @SerializedName("object")
    String object;

    private Card(
        String addressCity,
        String addressCountry,
        String addressLine1,
        String addressLine2,
        String addressState,
        String addressZip,
        String currency,
        String cvc,
        Long expMonth,
        Long expYear,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String name,
        String number,
        String object) {
      this.addressCity = addressCity;
      this.addressCountry = addressCountry;
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressState = addressState;
      this.addressZip = addressZip;
      this.currency = currency;
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.name = name;
      this.number = number;
      this.object = object;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String addressCity;

      private String addressCountry;

      private String addressLine1;

      private String addressLine2;

      private String addressState;

      private String addressZip;

      private String currency;

      private String cvc;

      private Long expMonth;

      private Long expYear;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String name;

      private String number;

      private String object;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCollectionCreateParams.Card build() {
        return new AccountCollectionCreateParams.Card(
            this.addressCity,
            this.addressCountry,
            this.addressLine1,
            this.addressLine2,
            this.addressState,
            this.addressZip,
            this.currency,
            this.cvc,
            this.expMonth,
            this.expYear,
            this.extraParams,
            this.metadata,
            this.name,
            this.number,
            this.object);
      }

      public Builder setAddressCity(String addressCity) {
        this.addressCity = addressCity;
        return this;
      }

      public Builder setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
        return this;
      }

      public Builder setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
      }

      public Builder setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
      }

      public Builder setAddressState(String addressState) {
        this.addressState = addressState;
        return this;
      }

      public Builder setAddressZip(String addressZip) {
        this.addressZip = addressZip;
        return this;
      }

      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setExpMonth(Long expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setExpYear(Long expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCollectionCreateParams.Card#extraParams} for the field documentation.
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
       * See {@link AccountCollectionCreateParams.Card#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCollectionCreateParams.Card#metadata} for the field documentation.
       */
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCollectionCreateParams.Card#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setObject(String object) {
        this.object = object;
        return this;
      }
    }
  }

  @Getter
  public static class CardToken {
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> */
    @SerializedName("object")
    String object;

    /** <strong>Required.</strong> */
    @SerializedName("token")
    String token;

    private CardToken(
        String currency, Map<String, Object> extraParams, String object, String token) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.object = object;
      this.token = token;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String object;

      private String token;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCollectionCreateParams.CardToken build() {
        return new AccountCollectionCreateParams.CardToken(
            this.currency, this.extraParams, this.object, this.token);
      }

      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCollectionCreateParams.CardToken#extraParams} for the field documentation.
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
       * See {@link AccountCollectionCreateParams.CardToken#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setObject(String object) {
        this.object = object;
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setToken(String token) {
        this.token = token;
        return this;
      }
    }
  }
}
