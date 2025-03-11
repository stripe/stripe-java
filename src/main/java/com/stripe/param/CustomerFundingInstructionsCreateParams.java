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
public class CustomerFundingInstructionsCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Additional parameters for {@code bank_transfer} funding types */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

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

  /** <strong>Required.</strong> The {@code funding_type} to get the instructions for. */
  @SerializedName("funding_type")
  FundingType fundingType;

  private CustomerFundingInstructionsCreateParams(
      BankTransfer bankTransfer,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      FundingType fundingType) {
    this.bankTransfer = bankTransfer;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fundingType = fundingType;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankTransfer bankTransfer;

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FundingType fundingType;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerFundingInstructionsCreateParams build() {
      return new CustomerFundingInstructionsCreateParams(
          this.bankTransfer, this.currency, this.expand, this.extraParams, this.fundingType);
    }

    /** <strong>Required.</strong> Additional parameters for {@code bank_transfer} funding types */
    public Builder setBankTransfer(
        CustomerFundingInstructionsCreateParams.BankTransfer bankTransfer) {
      this.bankTransfer = bankTransfer;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerFundingInstructionsCreateParams#expand} for the field documentation.
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
     * CustomerFundingInstructionsCreateParams#expand} for the field documentation.
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
     * CustomerFundingInstructionsCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomerFundingInstructionsCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The {@code funding_type} to get the instructions for. */
    public Builder setFundingType(CustomerFundingInstructionsCreateParams.FundingType fundingType) {
      this.fundingType = fundingType;
      return this;
    }
  }

  @Getter
  public static class BankTransfer {
    /** Configuration for eu_bank_transfer funding type. */
    @SerializedName("eu_bank_transfer")
    EuBankTransfer euBankTransfer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * List of address types that should be returned in the financial_addresses response. If not
     * specified, all valid types will be returned.
     *
     * <p>Permitted values include: {@code sort_code}, {@code zengin}, {@code iban}, or {@code
     * spei}.
     */
    @SerializedName("requested_address_types")
    List<CustomerFundingInstructionsCreateParams.BankTransfer.RequestedAddressType>
        requestedAddressTypes;

    /** <strong>Required.</strong> The type of the {@code bank_transfer} */
    @SerializedName("type")
    Type type;

    private BankTransfer(
        EuBankTransfer euBankTransfer,
        Map<String, Object> extraParams,
        List<CustomerFundingInstructionsCreateParams.BankTransfer.RequestedAddressType>
            requestedAddressTypes,
        Type type) {
      this.euBankTransfer = euBankTransfer;
      this.extraParams = extraParams;
      this.requestedAddressTypes = requestedAddressTypes;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private EuBankTransfer euBankTransfer;

      private Map<String, Object> extraParams;

      private List<CustomerFundingInstructionsCreateParams.BankTransfer.RequestedAddressType>
          requestedAddressTypes;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerFundingInstructionsCreateParams.BankTransfer build() {
        return new CustomerFundingInstructionsCreateParams.BankTransfer(
            this.euBankTransfer, this.extraParams, this.requestedAddressTypes, this.type);
      }

      /** Configuration for eu_bank_transfer funding type. */
      public Builder setEuBankTransfer(
          CustomerFundingInstructionsCreateParams.BankTransfer.EuBankTransfer euBankTransfer) {
        this.euBankTransfer = euBankTransfer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerFundingInstructionsCreateParams.BankTransfer#extraParams} for the field
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
       * See {@link CustomerFundingInstructionsCreateParams.BankTransfer#extraParams} for the field
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
       * Add an element to `requestedAddressTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CustomerFundingInstructionsCreateParams.BankTransfer#requestedAddressTypes} for the
       * field documentation.
       */
      public Builder addRequestedAddressType(
          CustomerFundingInstructionsCreateParams.BankTransfer.RequestedAddressType element) {
        if (this.requestedAddressTypes == null) {
          this.requestedAddressTypes = new ArrayList<>();
        }
        this.requestedAddressTypes.add(element);
        return this;
      }

      /**
       * Add all elements to `requestedAddressTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CustomerFundingInstructionsCreateParams.BankTransfer#requestedAddressTypes} for the
       * field documentation.
       */
      public Builder addAllRequestedAddressType(
          List<CustomerFundingInstructionsCreateParams.BankTransfer.RequestedAddressType>
              elements) {
        if (this.requestedAddressTypes == null) {
          this.requestedAddressTypes = new ArrayList<>();
        }
        this.requestedAddressTypes.addAll(elements);
        return this;
      }

      /** <strong>Required.</strong> The type of the {@code bank_transfer} */
      public Builder setType(CustomerFundingInstructionsCreateParams.BankTransfer.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class EuBankTransfer {
      /**
       * <strong>Required.</strong> The desired country code of the bank account information.
       * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or
       * {@code NL}.
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private EuBankTransfer(String country, Map<String, Object> extraParams) {
        this.country = country;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String country;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerFundingInstructionsCreateParams.BankTransfer.EuBankTransfer build() {
          return new CustomerFundingInstructionsCreateParams.BankTransfer.EuBankTransfer(
              this.country, this.extraParams);
        }

        /**
         * <strong>Required.</strong> The desired country code of the bank account information.
         * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or
         * {@code NL}.
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CustomerFundingInstructionsCreateParams.BankTransfer.EuBankTransfer#extraParams} for the
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
         * CustomerFundingInstructionsCreateParams.BankTransfer.EuBankTransfer#extraParams} for the
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
    }

    public enum RequestedAddressType implements ApiRequestParams.EnumParam {
      @SerializedName("iban")
      IBAN("iban"),

      @SerializedName("sort_code")
      SORT_CODE("sort_code"),

      @SerializedName("spei")
      SPEI("spei"),

      @SerializedName("zengin")
      ZENGIN("zengin");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RequestedAddressType(String value) {
        this.value = value;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("eu_bank_transfer")
      EU_BANK_TRANSFER("eu_bank_transfer"),

      @SerializedName("gb_bank_transfer")
      GB_BANK_TRANSFER("gb_bank_transfer"),

      @SerializedName("jp_bank_transfer")
      JP_BANK_TRANSFER("jp_bank_transfer"),

      @SerializedName("mx_bank_transfer")
      MX_BANK_TRANSFER("mx_bank_transfer"),

      @SerializedName("us_bank_transfer")
      US_BANK_TRANSFER("us_bank_transfer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum FundingType implements ApiRequestParams.EnumParam {
    @SerializedName("bank_transfer")
    BANK_TRANSFER("bank_transfer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    FundingType(String value) {
      this.value = value;
    }
  }
}
