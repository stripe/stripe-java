package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class TokenCreateParams extends ApiRequestParams {
  /** The bank account this token will represent. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  @SerializedName("card")
  Object card;

  /**
   * The customer (owned by the application's account) for which to create a token. For use only
   * with [Stripe Connect](https://stripe.com/docs/connect). Also, this can be used only with an
   * [OAuth access token](https://stripe.com/docs/connect/standard-accounts) or [Stripe-Account
   * header](https://stripe.com/docs/connect/authentication). For more details, see [Shared
   * Customers](https://stripe.com/docs/connect/shared-customers).
   */
  @SerializedName("customer")
  String customer;

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

  /** The PII this token will represent. */
  @SerializedName("pii")
  Pii pii;

  private TokenCreateParams(
      BankAccount bankAccount,
      Object card,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      Pii pii) {
    this.bankAccount = bankAccount;
    this.card = card;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.pii = pii;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankAccount bankAccount;

    private Object card;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Pii pii;

    /** Finalize and obtain parameter instance from this builder. */
    public TokenCreateParams build() {
      return new TokenCreateParams(
          this.bankAccount, this.card, this.customer, this.expand, this.extraParams, this.pii);
    }

    /** The bank account this token will represent. */
    public Builder setBankAccount(BankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    public Builder setCard(Card card) {
      this.card = card;
      return this;
    }

    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * The customer (owned by the application's account) for which to create a token. For use only
     * with [Stripe Connect](https://stripe.com/docs/connect). Also, this can be used only with an
     * [OAuth access token](https://stripe.com/docs/connect/standard-accounts) or [Stripe-Account
     * header](https://stripe.com/docs/connect/authentication). For more details, see [Shared
     * Customers](https://stripe.com/docs/connect/shared-customers).
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TokenCreateParams#expand} for the field documentation.
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
     * TokenCreateParams#expand} for the field documentation.
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
     * TokenCreateParams#extraParams} for the field documentation.
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
     * See {@link TokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The PII this token will represent. */
    public Builder setPii(Pii pii) {
      this.pii = pii;
      return this;
    }
  }

  public static class BankAccount {
    /**
     * The name of the person or business that owns the bank account.This field is required when
     * attaching the bank account to a `Customer` object.
     */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /**
     * The type of entity that holds the account. It can be `company` or `individual`. This field is
     * required when attaching the bank account to a `Customer` object.
     */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** The account number for the bank account, in string form. Must be a checking account. */
    @SerializedName("account_number")
    String accountNumber;

    /** The country in which the bank account is located. */
    @SerializedName("country")
    String country;

    /**
     * The currency the bank account is in. This must be a country/currency pairing that [Stripe
     * supports.](docs/payouts)
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

    /**
     * The routing number, sort code, or other country-appropriateinstitution number for the bank
     * account. For US bank accounts, this is required and should bethe ACH routing number, not the
     * wire routing number. If you are providing an IBAN for`account_number`, this field is not
     * required.
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
        String routingNumber) {
      this.accountHolderName = accountHolderName;
      this.accountHolderType = accountHolderType;
      this.accountNumber = accountNumber;
      this.country = country;
      this.currency = currency;
      this.extraParams = extraParams;
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

      private String routingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public BankAccount build() {
        return new BankAccount(
            this.accountHolderName,
            this.accountHolderType,
            this.accountNumber,
            this.country,
            this.currency,
            this.extraParams,
            this.routingNumber);
      }

      /**
       * The name of the person or business that owns the bank account.This field is required when
       * attaching the bank account to a `Customer` object.
       */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /**
       * The type of entity that holds the account. It can be `company` or `individual`. This field
       * is required when attaching the bank account to a `Customer` object.
       */
      public Builder setAccountHolderType(AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** The account number for the bank account, in string form. Must be a checking account. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /** The country in which the bank account is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * The currency the bank account is in. This must be a country/currency pairing that [Stripe
       * supports.](docs/payouts)
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.BankAccount#extraParams} for the field documentation.
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
       * See {@link TokenCreateParams.BankAccount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The routing number, sort code, or other country-appropriateinstitution number for the bank
       * account. For US bank accounts, this is required and should bethe ACH routing number, not
       * the wire routing number. If you are providing an IBAN for`account_number`, this field is
       * not required.
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

    @SerializedName("exp_month")
    String expMonth;

    @SerializedName("exp_year")
    String expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("name")
    String name;

    @SerializedName("number")
    String number;

    private Card(
        String addressCity,
        String addressCountry,
        String addressLine1,
        String addressLine2,
        String addressState,
        String addressZip,
        String currency,
        String cvc,
        String expMonth,
        String expYear,
        Map<String, Object> extraParams,
        String name,
        String number) {
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
      this.name = name;
      this.number = number;
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

      private String expMonth;

      private String expYear;

      private Map<String, Object> extraParams;

      private String name;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public Card build() {
        return new Card(
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
            this.name,
            this.number);
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

      public Builder setExpMonth(String expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      public Builder setExpYear(String expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Card#extraParams} for the field documentation.
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
       * See {@link TokenCreateParams.Card#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  public static class Pii {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The `id_number` for the PII, in string form. */
    @SerializedName("id_number")
    String idNumber;

    private Pii(Map<String, Object> extraParams, String idNumber) {
      this.extraParams = extraParams;
      this.idNumber = idNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String idNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Pii build() {
        return new Pii(this.extraParams, this.idNumber);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Pii#extraParams} for the field documentation.
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
       * See {@link TokenCreateParams.Pii#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The `id_number` for the PII, in string form. */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }
    }
  }
}
