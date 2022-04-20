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
public class CustomerCreateFundingInstructionsParams extends ApiRequestParams {
  /** Additional parameters for {@code bank_transfer} funding types. */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

  /** The {@code funding_type} to get the instructions for. */
  @SerializedName("funding_type")
  FundingType fundingType;

  private CustomerCreateFundingInstructionsParams(
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
    public CustomerCreateFundingInstructionsParams build() {
      return new CustomerCreateFundingInstructionsParams(
          this.bankTransfer, this.currency, this.expand, this.extraParams, this.fundingType);
    }

    /** Additional parameters for {@code bank_transfer} funding types. */
    public Builder setBankTransfer(BankTransfer bankTransfer) {
      this.bankTransfer = bankTransfer;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateFundingInstructionsParams#expand} for the field documentation.
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
     * CustomerCreateFundingInstructionsParams#expand} for the field documentation.
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
     * CustomerCreateFundingInstructionsParams#extraParams} for the field documentation.
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
     * See {@link CustomerCreateFundingInstructionsParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The {@code funding_type} to get the instructions for. */
    public Builder setFundingType(FundingType fundingType) {
      this.fundingType = fundingType;
      return this;
    }
  }

  @Getter
  public static class BankTransfer {
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
     * <p>Permitted values include: {@code zengin}.
     */
    @SerializedName("requested_address_types")
    List<RequestedAddressType> requestedAddressTypes;

    /** The type of the {@code bank_transfer}. */
    @SerializedName("type")
    Type type;

    private BankTransfer(
        Map<String, Object> extraParams,
        List<RequestedAddressType> requestedAddressTypes,
        Type type) {
      this.extraParams = extraParams;
      this.requestedAddressTypes = requestedAddressTypes;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<RequestedAddressType> requestedAddressTypes;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public BankTransfer build() {
        return new BankTransfer(this.extraParams, this.requestedAddressTypes, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateFundingInstructionsParams.BankTransfer#extraParams} for the field
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
       * See {@link CustomerCreateFundingInstructionsParams.BankTransfer#extraParams} for the field
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
       * {@link CustomerCreateFundingInstructionsParams.BankTransfer#requestedAddressTypes} for the
       * field documentation.
       */
      public Builder addRequestedAddressType(RequestedAddressType element) {
        if (this.requestedAddressTypes == null) {
          this.requestedAddressTypes = new ArrayList<>();
        }
        this.requestedAddressTypes.add(element);
        return this;
      }

      /**
       * Add all elements to `requestedAddressTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CustomerCreateFundingInstructionsParams.BankTransfer#requestedAddressTypes} for the
       * field documentation.
       */
      public Builder addAllRequestedAddressType(List<RequestedAddressType> elements) {
        if (this.requestedAddressTypes == null) {
          this.requestedAddressTypes = new ArrayList<>();
        }
        this.requestedAddressTypes.addAll(elements);
        return this;
      }

      /** The type of the {@code bank_transfer}. */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }
    }

    public enum RequestedAddressType implements ApiRequestParams.EnumParam {
      @SerializedName("zengin")
      ZENGIN("zengin");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RequestedAddressType(String value) {
        this.value = value;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("jp_bank_transfer")
      JP_BANK_TRANSFER("jp_bank_transfer");

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
