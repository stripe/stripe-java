// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountExternalAccountUpdateParams extends ApiRequestParams {
  /** The name of the person or business that owns the bank account. */
  @SerializedName("account_holder_name")
  Object accountHolderName;

  /**
   * The type of entity that holds the account. This can be either {@code individual} or {@code
   * company}.
   */
  @SerializedName("account_holder_type")
  ApiRequestParams.EnumParam accountHolderType;

  /**
   * The bank account type. This can only be {@code checking} or {@code savings} in most countries.
   * In Japan, this can only be {@code futsu} or {@code toza}.
   */
  @SerializedName("account_type")
  AccountType accountType;

  /** City/District/Suburb/Town/Village. */
  @SerializedName("address_city")
  Object addressCity;

  /** Billing address country, if provided when creating card. */
  @SerializedName("address_country")
  Object addressCountry;

  /** Address line 1 (Street address/PO Box/Company name). */
  @SerializedName("address_line1")
  Object addressLine1;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  @SerializedName("address_line2")
  Object addressLine2;

  /** State/County/Province/Region. */
  @SerializedName("address_state")
  Object addressState;

  /** ZIP or postal code. */
  @SerializedName("address_zip")
  Object addressZip;

  /** When set to true, this becomes the default external account for its currency. */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Documents that may be submitted to satisfy various informational requests. */
  @SerializedName("documents")
  Documents documents;

  /** Two digit number representing the card’s expiration month. */
  @SerializedName("exp_month")
  Object expMonth;

  /** Four digit number representing the card’s expiration year. */
  @SerializedName("exp_year")
  Object expYear;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Cardholder name. */
  @SerializedName("name")
  Object name;

  private AccountExternalAccountUpdateParams(
      Object accountHolderName,
      ApiRequestParams.EnumParam accountHolderType,
      AccountType accountType,
      Object addressCity,
      Object addressCountry,
      Object addressLine1,
      Object addressLine2,
      Object addressState,
      Object addressZip,
      Boolean defaultForCurrency,
      Documents documents,
      Object expMonth,
      Object expYear,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Object name) {
    this.accountHolderName = accountHolderName;
    this.accountHolderType = accountHolderType;
    this.accountType = accountType;
    this.addressCity = addressCity;
    this.addressCountry = addressCountry;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.addressState = addressState;
    this.addressZip = addressZip;
    this.defaultForCurrency = defaultForCurrency;
    this.documents = documents;
    this.expMonth = expMonth;
    this.expYear = expYear;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.name = name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountHolderName;

    private ApiRequestParams.EnumParam accountHolderType;

    private AccountType accountType;

    private Object addressCity;

    private Object addressCountry;

    private Object addressLine1;

    private Object addressLine2;

    private Object addressState;

    private Object addressZip;

    private Boolean defaultForCurrency;

    private Documents documents;

    private Object expMonth;

    private Object expYear;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Object name;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountExternalAccountUpdateParams build() {
      return new AccountExternalAccountUpdateParams(
          this.accountHolderName,
          this.accountHolderType,
          this.accountType,
          this.addressCity,
          this.addressCountry,
          this.addressLine1,
          this.addressLine2,
          this.addressState,
          this.addressZip,
          this.defaultForCurrency,
          this.documents,
          this.expMonth,
          this.expYear,
          this.expand,
          this.extraParams,
          this.metadata,
          this.name);
    }

    /** The name of the person or business that owns the bank account. */
    public Builder setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
      return this;
    }

    /** The name of the person or business that owns the bank account. */
    public Builder setAccountHolderName(EmptyParam accountHolderName) {
      this.accountHolderName = accountHolderName;
      return this;
    }

    /**
     * The type of entity that holds the account. This can be either {@code individual} or {@code
     * company}.
     */
    public Builder setAccountHolderType(
        AccountExternalAccountUpdateParams.AccountHolderType accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /**
     * The type of entity that holds the account. This can be either {@code individual} or {@code
     * company}.
     */
    public Builder setAccountHolderType(EmptyParam accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /**
     * The bank account type. This can only be {@code checking} or {@code savings} in most
     * countries. In Japan, this can only be {@code futsu} or {@code toza}.
     */
    public Builder setAccountType(AccountExternalAccountUpdateParams.AccountType accountType) {
      this.accountType = accountType;
      return this;
    }

    /** City/District/Suburb/Town/Village. */
    public Builder setAddressCity(String addressCity) {
      this.addressCity = addressCity;
      return this;
    }

    /** City/District/Suburb/Town/Village. */
    public Builder setAddressCity(EmptyParam addressCity) {
      this.addressCity = addressCity;
      return this;
    }

    /** Billing address country, if provided when creating card. */
    public Builder setAddressCountry(String addressCountry) {
      this.addressCountry = addressCountry;
      return this;
    }

    /** Billing address country, if provided when creating card. */
    public Builder setAddressCountry(EmptyParam addressCountry) {
      this.addressCountry = addressCountry;
      return this;
    }

    /** Address line 1 (Street address/PO Box/Company name). */
    public Builder setAddressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    /** Address line 1 (Street address/PO Box/Company name). */
    public Builder setAddressLine1(EmptyParam addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    /** Address line 2 (Apartment/Suite/Unit/Building). */
    public Builder setAddressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /** Address line 2 (Apartment/Suite/Unit/Building). */
    public Builder setAddressLine2(EmptyParam addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /** State/County/Province/Region. */
    public Builder setAddressState(String addressState) {
      this.addressState = addressState;
      return this;
    }

    /** State/County/Province/Region. */
    public Builder setAddressState(EmptyParam addressState) {
      this.addressState = addressState;
      return this;
    }

    /** ZIP or postal code. */
    public Builder setAddressZip(String addressZip) {
      this.addressZip = addressZip;
      return this;
    }

    /** ZIP or postal code. */
    public Builder setAddressZip(EmptyParam addressZip) {
      this.addressZip = addressZip;
      return this;
    }

    /** When set to true, this becomes the default external account for its currency. */
    public Builder setDefaultForCurrency(Boolean defaultForCurrency) {
      this.defaultForCurrency = defaultForCurrency;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(AccountExternalAccountUpdateParams.Documents documents) {
      this.documents = documents;
      return this;
    }

    /** Two digit number representing the card’s expiration month. */
    public Builder setExpMonth(String expMonth) {
      this.expMonth = expMonth;
      return this;
    }

    /** Two digit number representing the card’s expiration month. */
    public Builder setExpMonth(EmptyParam expMonth) {
      this.expMonth = expMonth;
      return this;
    }

    /** Four digit number representing the card’s expiration year. */
    public Builder setExpYear(String expYear) {
      this.expYear = expYear;
      return this;
    }

    /** Four digit number representing the card’s expiration year. */
    public Builder setExpYear(EmptyParam expYear) {
      this.expYear = expYear;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountExternalAccountUpdateParams#expand} for the field documentation.
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
     * AccountExternalAccountUpdateParams#expand} for the field documentation.
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
     * AccountExternalAccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link AccountExternalAccountUpdateParams#extraParams} for the field documentation.
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
     * AccountExternalAccountUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AccountExternalAccountUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** Cardholder name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Cardholder name. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Documents {
    /**
     * One or more documents that support the <a
     * href="https://support.stripe.com/questions/bank-account-ownership-verification">Bank account
     * ownership verification</a> requirement. Must be a document associated with the bank account
     * that displays the last 4 digits of the account number, either a statement or a check.
     */
    @SerializedName("bank_account_ownership_verification")
    BankAccountOwnershipVerification bankAccountOwnershipVerification;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Documents(
        BankAccountOwnershipVerification bankAccountOwnershipVerification,
        Map<String, Object> extraParams) {
      this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankAccountOwnershipVerification bankAccountOwnershipVerification;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountExternalAccountUpdateParams.Documents build() {
        return new AccountExternalAccountUpdateParams.Documents(
            this.bankAccountOwnershipVerification, this.extraParams);
      }

      /**
       * One or more documents that support the <a
       * href="https://support.stripe.com/questions/bank-account-ownership-verification">Bank
       * account ownership verification</a> requirement. Must be a document associated with the bank
       * account that displays the last 4 digits of the account number, either a statement or a
       * check.
       */
      public Builder setBankAccountOwnershipVerification(
          AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification
              bankAccountOwnershipVerification) {
        this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountExternalAccountUpdateParams.Documents#extraParams} for the field documentation.
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
       * See {@link AccountExternalAccountUpdateParams.Documents#extraParams} for the field
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
    public static class BankAccountOwnershipVerification {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private BankAccountOwnershipVerification(
          Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification
            build() {
          return new AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification#extraParams}
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
         * AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification#extraParams}
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
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification#files} for
         * the field documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountExternalAccountUpdateParams.Documents.BankAccountOwnershipVerification#files} for
         * the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
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

  public enum AccountType implements ApiRequestParams.EnumParam {
    @SerializedName("checking")
    CHECKING("checking"),

    @SerializedName("futsu")
    FUTSU("futsu"),

    @SerializedName("savings")
    SAVINGS("savings"),

    @SerializedName("toza")
    TOZA("toza");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AccountType(String value) {
      this.value = value;
    }
  }
}
