package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class ExternalAccountUpdateParams extends ApiRequestParams {

  /** The name of the person or business that owns the bank account. */
  @SerializedName("account_holder_name")
  String accountHolderName;

  /** The type of entity that holds the account. This can be either `individual` or `company`. */
  @SerializedName("account_holder_type")
  ApiRequestParams.EnumParam accountHolderType;

  /** City/District/Suburb/Town/Village. */
  @SerializedName("address_city")
  String addressCity;

  /** Billing address country, if provided when creating card. */
  @SerializedName("address_country")
  String addressCountry;

  /** Address line 1 (Street address/PO Box/Company name). */
  @SerializedName("address_line1")
  String addressLine1;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  @SerializedName("address_line2")
  String addressLine2;

  /** State/County/Province/Region. */
  @SerializedName("address_state")
  String addressState;

  /** ZIP or postal code. */
  @SerializedName("address_zip")
  String addressZip;

  /** When set to true, this becomes the default external account for its currency. */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Two digit number representing the card’s expiration month. */
  @SerializedName("exp_month")
  String expMonth;

  /** Four digit number representing the card’s expiration year. */
  @SerializedName("exp_year")
  String expYear;

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

  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Cardholder name. */
  @SerializedName("name")
  String name;

  private ExternalAccountUpdateParams(
      String accountHolderName,
      ApiRequestParams.EnumParam accountHolderType,
      String addressCity,
      String addressCountry,
      String addressLine1,
      String addressLine2,
      String addressState,
      String addressZip,
      Boolean defaultForCurrency,
      String expMonth,
      String expYear,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String name) {

    this.accountHolderName = accountHolderName;
    this.accountHolderType = accountHolderType;
    this.addressCity = addressCity;
    this.addressCountry = addressCountry;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.addressState = addressState;
    this.addressZip = addressZip;
    this.defaultForCurrency = defaultForCurrency;
    this.expMonth = expMonth;
    this.expYear = expYear;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.name = name;
  }

  public static ExternalAccountUpdateParams.Builder builder() {
    return new ExternalAccountUpdateParams.Builder();
  }

  public static class Builder {
    private String accountHolderName;
    private ApiRequestParams.EnumParam accountHolderType;
    private String addressCity;
    private String addressCountry;
    private String addressLine1;
    private String addressLine2;
    private String addressState;
    private String addressZip;
    private Boolean defaultForCurrency;
    private String expMonth;
    private String expYear;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;
    private String name;

    public ExternalAccountUpdateParams build() {
      return new ExternalAccountUpdateParams(
          this.accountHolderName,
          this.accountHolderType,
          this.addressCity,
          this.addressCountry,
          this.addressLine1,
          this.addressLine2,
          this.addressState,
          this.addressZip,
          this.defaultForCurrency,
          this.expMonth,
          this.expYear,
          this.expand,
          this.extraParams,
          this.metadata,
          this.name);
    }

    /** The name of the person or business that owns the bank account. */
    public ExternalAccountUpdateParams.Builder setAccountHolderName(String accountHolderName) {

      this.accountHolderName = accountHolderName;
      return this;
    }

    /** The type of entity that holds the account. This can be either `individual` or `company`. */
    public ExternalAccountUpdateParams.Builder setAccountHolderType(EmptyParam accountHolderType) {

      this.accountHolderType = accountHolderType;
      return this;
    }

    /** The type of entity that holds the account. This can be either `individual` or `company`. */
    public ExternalAccountUpdateParams.Builder setAccountHolderType(
        ExternalAccountUpdateParams.AccountHolderType accountHolderType) {

      this.accountHolderType = accountHolderType;
      return this;
    }

    /** City/District/Suburb/Town/Village. */
    public ExternalAccountUpdateParams.Builder setAddressCity(String addressCity) {

      this.addressCity = addressCity;
      return this;
    }

    /** Billing address country, if provided when creating card. */
    public ExternalAccountUpdateParams.Builder setAddressCountry(String addressCountry) {

      this.addressCountry = addressCountry;
      return this;
    }

    /** Address line 1 (Street address/PO Box/Company name). */
    public ExternalAccountUpdateParams.Builder setAddressLine1(String addressLine1) {

      this.addressLine1 = addressLine1;
      return this;
    }

    /** Address line 2 (Apartment/Suite/Unit/Building). */
    public ExternalAccountUpdateParams.Builder setAddressLine2(String addressLine2) {

      this.addressLine2 = addressLine2;
      return this;
    }

    /** State/County/Province/Region. */
    public ExternalAccountUpdateParams.Builder setAddressState(String addressState) {

      this.addressState = addressState;
      return this;
    }

    /** ZIP or postal code. */
    public ExternalAccountUpdateParams.Builder setAddressZip(String addressZip) {

      this.addressZip = addressZip;
      return this;
    }

    /** When set to true, this becomes the default external account for its currency. */
    public ExternalAccountUpdateParams.Builder setDefaultForCurrency(Boolean defaultForCurrency) {

      this.defaultForCurrency = defaultForCurrency;
      return this;
    }

    /** Two digit number representing the card’s expiration month. */
    public ExternalAccountUpdateParams.Builder setExpMonth(String expMonth) {

      this.expMonth = expMonth;
      return this;
    }

    /** Four digit number representing the card’s expiration year. */
    public ExternalAccountUpdateParams.Builder setExpYear(String expYear) {
      this.expYear = expYear;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ExternalAccountUpdateParams#expand} for the field documentation.
     */
    public ExternalAccountUpdateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ExternalAccountUpdateParams#expand} for the field documentation.
     */
    public ExternalAccountUpdateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ExternalAccountUpdateParams#extraParams} for the field documentation.
     */
    public ExternalAccountUpdateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ExternalAccountUpdateParams#extraParams} for the field documentation.
     */
    public ExternalAccountUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    public ExternalAccountUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    public ExternalAccountUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Cardholder name. */
    public ExternalAccountUpdateParams.Builder setName(String name) {
      this.name = name;
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

    private AccountHolderType(String value) {
      this.value = value;
    }
  }
}
