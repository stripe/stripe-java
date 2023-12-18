// File generated from our OpenAPI spec
package com.stripe.param.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CalculationCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The ID of an existing customer to use for this calculation. If provided, the customer's address
   * and tax IDs are copied to {@code customer_details}.
   */
  @SerializedName("customer")
  String customer;

  /** Details about the customer, including address and tax IDs. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

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

  /** <strong>Required.</strong> A list of items the customer is purchasing. */
  @SerializedName("line_items")
  List<CalculationCreateParams.LineItem> lineItems;

  /** Details about the address from which the goods are being shippped. */
  @SerializedName("ship_from_details")
  ShipFromDetails shipFromDetails;

  /** Shipping cost details to be used for the calculation. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /**
   * Timestamp of date at which the tax rules and rates in effect applies for the calculation.
   * Measured in seconds since the Unix epoch. Can be up to 48 hours in the past, and up to 48 hours
   * in the future.
   */
  @SerializedName("tax_date")
  Long taxDate;

  private CalculationCreateParams(
      String currency,
      String customer,
      CustomerDetails customerDetails,
      List<String> expand,
      Map<String, Object> extraParams,
      List<CalculationCreateParams.LineItem> lineItems,
      ShipFromDetails shipFromDetails,
      ShippingCost shippingCost,
      Long taxDate) {
    this.currency = currency;
    this.customer = customer;
    this.customerDetails = customerDetails;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lineItems = lineItems;
    this.shipFromDetails = shipFromDetails;
    this.shippingCost = shippingCost;
    this.taxDate = taxDate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String customer;

    private CustomerDetails customerDetails;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<CalculationCreateParams.LineItem> lineItems;

    private ShipFromDetails shipFromDetails;

    private ShippingCost shippingCost;

    private Long taxDate;

    /** Finalize and obtain parameter instance from this builder. */
    public CalculationCreateParams build() {
      return new CalculationCreateParams(
          this.currency,
          this.customer,
          this.customerDetails,
          this.expand,
          this.extraParams,
          this.lineItems,
          this.shipFromDetails,
          this.shippingCost,
          this.taxDate);
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
     * The ID of an existing customer to use for this calculation. If provided, the customer's
     * address and tax IDs are copied to {@code customer_details}.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** Details about the customer, including address and tax IDs. */
    public Builder setCustomerDetails(CalculationCreateParams.CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CalculationCreateParams#expand} for the field documentation.
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
     * CalculationCreateParams#expand} for the field documentation.
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
     * CalculationCreateParams#extraParams} for the field documentation.
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
     * See {@link CalculationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CalculationCreateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(CalculationCreateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CalculationCreateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<CalculationCreateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /** Details about the address from which the goods are being shippped. */
    public Builder setShipFromDetails(CalculationCreateParams.ShipFromDetails shipFromDetails) {
      this.shipFromDetails = shipFromDetails;
      return this;
    }

    /** Shipping cost details to be used for the calculation. */
    public Builder setShippingCost(CalculationCreateParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /**
     * Timestamp of date at which the tax rules and rates in effect applies for the calculation.
     * Measured in seconds since the Unix epoch. Can be up to 48 hours in the past, and up to 48
     * hours in the future.
     */
    public Builder setTaxDate(Long taxDate) {
      this.taxDate = taxDate;
      return this;
    }
  }

  @Getter
  public static class CustomerDetails {
    /** The customer's postal address (for example, home or business location). */
    @SerializedName("address")
    Address address;

    /** The type of customer address provided. */
    @SerializedName("address_source")
    AddressSource addressSource;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The customer's IP address (IPv4 or IPv6). */
    @SerializedName("ip_address")
    String ipAddress;

    /**
     * The customer's tax IDs. Stripe Tax might consider a transaction with applicable tax IDs to be
     * B2B, which might affect the tax calculation result. Stripe Tax doesn't validate tax IDs for
     * correctness.
     */
    @SerializedName("tax_ids")
    List<CalculationCreateParams.CustomerDetails.TaxId> taxIds;

    /**
     * Overrides the tax calculation result to allow you to not collect tax from your customer. Use
     * this if you've manually checked your customer's tax exemptions. Prefer providing the
     * customer's {@code tax_ids} where possible, which automatically determines whether {@code
     * reverse_charge} applies.
     */
    @SerializedName("taxability_override")
    TaxabilityOverride taxabilityOverride;

    private CustomerDetails(
        Address address,
        AddressSource addressSource,
        Map<String, Object> extraParams,
        String ipAddress,
        List<CalculationCreateParams.CustomerDetails.TaxId> taxIds,
        TaxabilityOverride taxabilityOverride) {
      this.address = address;
      this.addressSource = addressSource;
      this.extraParams = extraParams;
      this.ipAddress = ipAddress;
      this.taxIds = taxIds;
      this.taxabilityOverride = taxabilityOverride;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private AddressSource addressSource;

      private Map<String, Object> extraParams;

      private String ipAddress;

      private List<CalculationCreateParams.CustomerDetails.TaxId> taxIds;

      private TaxabilityOverride taxabilityOverride;

      /** Finalize and obtain parameter instance from this builder. */
      public CalculationCreateParams.CustomerDetails build() {
        return new CalculationCreateParams.CustomerDetails(
            this.address,
            this.addressSource,
            this.extraParams,
            this.ipAddress,
            this.taxIds,
            this.taxabilityOverride);
      }

      /** The customer's postal address (for example, home or business location). */
      public Builder setAddress(CalculationCreateParams.CustomerDetails.Address address) {
        this.address = address;
        return this;
      }

      /** The type of customer address provided. */
      public Builder setAddressSource(
          CalculationCreateParams.CustomerDetails.AddressSource addressSource) {
        this.addressSource = addressSource;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CalculationCreateParams.CustomerDetails#extraParams} for the field documentation.
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
       * See {@link CalculationCreateParams.CustomerDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The customer's IP address (IPv4 or IPv6). */
      public Builder setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
      }

      /**
       * Add an element to `taxIds` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * CalculationCreateParams.CustomerDetails#taxIds} for the field documentation.
       */
      public Builder addTaxId(CalculationCreateParams.CustomerDetails.TaxId element) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.add(element);
        return this;
      }

      /**
       * Add all elements to `taxIds` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * CalculationCreateParams.CustomerDetails#taxIds} for the field documentation.
       */
      public Builder addAllTaxId(List<CalculationCreateParams.CustomerDetails.TaxId> elements) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.addAll(elements);
        return this;
      }

      /**
       * Overrides the tax calculation result to allow you to not collect tax from your customer.
       * Use this if you've manually checked your customer's tax exemptions. Prefer providing the
       * customer's {@code tax_ids} where possible, which automatically determines whether {@code
       * reverse_charge} applies.
       */
      public Builder setTaxabilityOverride(
          CalculationCreateParams.CustomerDetails.TaxabilityOverride taxabilityOverride) {
        this.taxabilityOverride = taxabilityOverride;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /**
       * State, county, province, or region. We recommend sending <a
       * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a> subdivision code value when
       * possible.
       */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          String country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object city;

        private String country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public CalculationCreateParams.CustomerDetails.Address build() {
          return new CalculationCreateParams.CustomerDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        /**
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CalculationCreateParams.CustomerDetails.Address#extraParams} for the
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
         * map. See {@link CalculationCreateParams.CustomerDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State, county, province, or region. We recommend sending <a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a> subdivision code value
         * when possible.
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /**
         * State, county, province, or region. We recommend sending <a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a> subdivision code value
         * when possible.
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    public static class TaxId {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
       * {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bo_tin}, {@code
       * br_cnpj}, {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code
       * ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code ch_vat}, {@code cl_tin}, {@code
       * cn_tin}, {@code co_nit}, {@code cr_tin}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin},
       * {@code es_cif}, {@code eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code
       * hk_br}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat},
       * {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code
       * li_uid}, {@code mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code no_vat},
       * {@code nz_gst}, {@code pe_ruc}, {@code ph_tin}, {@code ro_tin}, {@code rs_pib}, {@code
       * ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code sg_uen}, {@code si_tin},
       * {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code tw_vat}, {@code ua_vat}, {@code
       * us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code za_vat}
       */
      @SerializedName("type")
      Type type;

      /** <strong>Required.</strong> Value of the tax ID. */
      @SerializedName("value")
      String value;

      private TaxId(Map<String, Object> extraParams, Type type, String value) {
        this.extraParams = extraParams;
        this.type = type;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        private String value;

        /** Finalize and obtain parameter instance from this builder. */
        public CalculationCreateParams.CustomerDetails.TaxId build() {
          return new CalculationCreateParams.CustomerDetails.TaxId(
              this.extraParams, this.type, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CalculationCreateParams.CustomerDetails.TaxId#extraParams} for the field
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
         * map. See {@link CalculationCreateParams.CustomerDetails.TaxId#extraParams} for the field
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
         * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
         * {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bo_tin}, {@code
         * br_cnpj}, {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code
         * ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code ch_vat}, {@code cl_tin}, {@code
         * cn_tin}, {@code co_nit}, {@code cr_tin}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin},
         * {@code es_cif}, {@code eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat},
         * {@code hk_br}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code
         * is_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kr_brn},
         * {@code li_uid}, {@code mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code
         * no_vat}, {@code nz_gst}, {@code pe_ruc}, {@code ph_tin}, {@code ro_tin}, {@code rs_pib},
         * {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code sg_uen}, {@code
         * si_tin}, {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code tw_vat}, {@code ua_vat},
         * {@code us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code za_vat}
         */
        public Builder setType(CalculationCreateParams.CustomerDetails.TaxId.Type type) {
          this.type = type;
          return this;
        }

        /** <strong>Required.</strong> Value of the tax ID. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ad_nrt")
        AD_NRT("ad_nrt"),

        @SerializedName("ae_trn")
        AE_TRN("ae_trn"),

        @SerializedName("ar_cuit")
        AR_CUIT("ar_cuit"),

        @SerializedName("au_abn")
        AU_ABN("au_abn"),

        @SerializedName("au_arn")
        AU_ARN("au_arn"),

        @SerializedName("bg_uic")
        BG_UIC("bg_uic"),

        @SerializedName("bo_tin")
        BO_TIN("bo_tin"),

        @SerializedName("br_cnpj")
        BR_CNPJ("br_cnpj"),

        @SerializedName("br_cpf")
        BR_CPF("br_cpf"),

        @SerializedName("ca_bn")
        CA_BN("ca_bn"),

        @SerializedName("ca_gst_hst")
        CA_GST_HST("ca_gst_hst"),

        @SerializedName("ca_pst_bc")
        CA_PST_BC("ca_pst_bc"),

        @SerializedName("ca_pst_mb")
        CA_PST_MB("ca_pst_mb"),

        @SerializedName("ca_pst_sk")
        CA_PST_SK("ca_pst_sk"),

        @SerializedName("ca_qst")
        CA_QST("ca_qst"),

        @SerializedName("ch_vat")
        CH_VAT("ch_vat"),

        @SerializedName("cl_tin")
        CL_TIN("cl_tin"),

        @SerializedName("cn_tin")
        CN_TIN("cn_tin"),

        @SerializedName("co_nit")
        CO_NIT("co_nit"),

        @SerializedName("cr_tin")
        CR_TIN("cr_tin"),

        @SerializedName("do_rcn")
        DO_RCN("do_rcn"),

        @SerializedName("ec_ruc")
        EC_RUC("ec_ruc"),

        @SerializedName("eg_tin")
        EG_TIN("eg_tin"),

        @SerializedName("es_cif")
        ES_CIF("es_cif"),

        @SerializedName("eu_oss_vat")
        EU_OSS_VAT("eu_oss_vat"),

        @SerializedName("eu_vat")
        EU_VAT("eu_vat"),

        @SerializedName("gb_vat")
        GB_VAT("gb_vat"),

        @SerializedName("ge_vat")
        GE_VAT("ge_vat"),

        @SerializedName("hk_br")
        HK_BR("hk_br"),

        @SerializedName("hu_tin")
        HU_TIN("hu_tin"),

        @SerializedName("id_npwp")
        ID_NPWP("id_npwp"),

        @SerializedName("il_vat")
        IL_VAT("il_vat"),

        @SerializedName("in_gst")
        IN_GST("in_gst"),

        @SerializedName("is_vat")
        IS_VAT("is_vat"),

        @SerializedName("jp_cn")
        JP_CN("jp_cn"),

        @SerializedName("jp_rn")
        JP_RN("jp_rn"),

        @SerializedName("jp_trn")
        JP_TRN("jp_trn"),

        @SerializedName("ke_pin")
        KE_PIN("ke_pin"),

        @SerializedName("kr_brn")
        KR_BRN("kr_brn"),

        @SerializedName("li_uid")
        LI_UID("li_uid"),

        @SerializedName("mx_rfc")
        MX_RFC("mx_rfc"),

        @SerializedName("my_frp")
        MY_FRP("my_frp"),

        @SerializedName("my_itn")
        MY_ITN("my_itn"),

        @SerializedName("my_sst")
        MY_SST("my_sst"),

        @SerializedName("no_vat")
        NO_VAT("no_vat"),

        @SerializedName("nz_gst")
        NZ_GST("nz_gst"),

        @SerializedName("pe_ruc")
        PE_RUC("pe_ruc"),

        @SerializedName("ph_tin")
        PH_TIN("ph_tin"),

        @SerializedName("ro_tin")
        RO_TIN("ro_tin"),

        @SerializedName("rs_pib")
        RS_PIB("rs_pib"),

        @SerializedName("ru_inn")
        RU_INN("ru_inn"),

        @SerializedName("ru_kpp")
        RU_KPP("ru_kpp"),

        @SerializedName("sa_vat")
        SA_VAT("sa_vat"),

        @SerializedName("sg_gst")
        SG_GST("sg_gst"),

        @SerializedName("sg_uen")
        SG_UEN("sg_uen"),

        @SerializedName("si_tin")
        SI_TIN("si_tin"),

        @SerializedName("sv_nit")
        SV_NIT("sv_nit"),

        @SerializedName("th_vat")
        TH_VAT("th_vat"),

        @SerializedName("tr_tin")
        TR_TIN("tr_tin"),

        @SerializedName("tw_vat")
        TW_VAT("tw_vat"),

        @SerializedName("ua_vat")
        UA_VAT("ua_vat"),

        @SerializedName("us_ein")
        US_EIN("us_ein"),

        @SerializedName("uy_ruc")
        UY_RUC("uy_ruc"),

        @SerializedName("ve_rif")
        VE_RIF("ve_rif"),

        @SerializedName("vn_tin")
        VN_TIN("vn_tin"),

        @SerializedName("za_vat")
        ZA_VAT("za_vat");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum AddressSource implements ApiRequestParams.EnumParam {
      @SerializedName("billing")
      BILLING("billing"),

      @SerializedName("shipping")
      SHIPPING("shipping");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AddressSource(String value) {
        this.value = value;
      }
    }

    public enum TaxabilityOverride implements ApiRequestParams.EnumParam {
      @SerializedName("customer_exempt")
      CUSTOMER_EXEMPT("customer_exempt"),

      @SerializedName("none")
      NONE("none"),

      @SerializedName("reverse_charge")
      REVERSE_CHARGE("reverse_charge");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxabilityOverride(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class LineItem {
    /**
     * <strong>Required.</strong> A positive integer in cents representing the line item's total
     * price. If {@code tax_behavior=inclusive}, then this amount includes taxes. Otherwise, taxes
     * are calculated on top of this amount.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If provided, the product's {@code tax_code} will be used as the line item's {@code tax_code}.
     */
    @SerializedName("product")
    String product;

    /**
     * The number of units of the item being purchased. Used to calculate the per-unit price from
     * the total {@code amount} for the line. For example, if {@code amount=100} and {@code
     * quantity=4}, the calculated unit price is 25.
     */
    @SerializedName("quantity")
    Long quantity;

    /**
     * A custom identifier for this line item, which must be unique across the line items in the
     * calculation. The reference helps identify each line item in exported <a
     * href="https://stripe.com/docs/tax/reports">tax reports</a>.
     */
    @SerializedName("reference")
    String reference;

    /** Specifies whether the {@code amount} includes taxes. Defaults to {@code exclusive}. */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /**
     * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID to use for this line
     * item. If not provided, we will use the tax code from the provided {@code product} param. If
     * neither {@code tax_code} nor {@code product} is provided, we will use the default tax code
     * from your Tax Settings.
     */
    @SerializedName("tax_code")
    String taxCode;

    private LineItem(
        Long amount,
        Map<String, Object> extraParams,
        String product,
        Long quantity,
        String reference,
        TaxBehavior taxBehavior,
        String taxCode) {
      this.amount = amount;
      this.extraParams = extraParams;
      this.product = product;
      this.quantity = quantity;
      this.reference = reference;
      this.taxBehavior = taxBehavior;
      this.taxCode = taxCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Map<String, Object> extraParams;

      private String product;

      private Long quantity;

      private String reference;

      private TaxBehavior taxBehavior;

      private String taxCode;

      /** Finalize and obtain parameter instance from this builder. */
      public CalculationCreateParams.LineItem build() {
        return new CalculationCreateParams.LineItem(
            this.amount,
            this.extraParams,
            this.product,
            this.quantity,
            this.reference,
            this.taxBehavior,
            this.taxCode);
      }

      /**
       * <strong>Required.</strong> A positive integer in cents representing the line item's total
       * price. If {@code tax_behavior=inclusive}, then this amount includes taxes. Otherwise, taxes
       * are calculated on top of this amount.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CalculationCreateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link CalculationCreateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * If provided, the product's {@code tax_code} will be used as the line item's {@code
       * tax_code}.
       */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /**
       * The number of units of the item being purchased. Used to calculate the per-unit price from
       * the total {@code amount} for the line. For example, if {@code amount=100} and {@code
       * quantity=4}, the calculated unit price is 25.
       */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * A custom identifier for this line item, which must be unique across the line items in the
       * calculation. The reference helps identify each line item in exported <a
       * href="https://stripe.com/docs/tax/reports">tax reports</a>.
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }

      /** Specifies whether the {@code amount} includes taxes. Defaults to {@code exclusive}. */
      public Builder setTaxBehavior(CalculationCreateParams.LineItem.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID to use for this line
       * item. If not provided, we will use the tax code from the provided {@code product} param. If
       * neither {@code tax_code} nor {@code product} is provided, we will use the default tax code
       * from your Tax Settings.
       */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }
    }

    public enum TaxBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("exclusive")
      EXCLUSIVE("exclusive"),

      @SerializedName("inclusive")
      INCLUSIVE("inclusive");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class ShipFromDetails {
    /** <strong>Required.</strong> The address from which the goods are being shipped from. */
    @SerializedName("address")
    Address address;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ShipFromDetails(Address address, Map<String, Object> extraParams) {
      this.address = address;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CalculationCreateParams.ShipFromDetails build() {
        return new CalculationCreateParams.ShipFromDetails(this.address, this.extraParams);
      }

      /** <strong>Required.</strong> The address from which the goods are being shipped from. */
      public Builder setAddress(CalculationCreateParams.ShipFromDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CalculationCreateParams.ShipFromDetails#extraParams} for the field documentation.
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
       * See {@link CalculationCreateParams.ShipFromDetails#extraParams} for the field
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
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
       */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          String country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object city;

        private String country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public CalculationCreateParams.ShipFromDetails.Address build() {
          return new CalculationCreateParams.ShipFromDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        /**
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CalculationCreateParams.ShipFromDetails.Address#extraParams} for the
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
         * map. See {@link CalculationCreateParams.ShipFromDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class ShippingCost {
    /**
     * A positive integer in cents representing the shipping charge. If {@code
     * tax_behavior=inclusive}, then this amount includes taxes. Otherwise, taxes are calculated on
     * top of this amount.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If provided, the <a href="https://stripe.com/docs/api/shipping_rates/object">shipping
     * rate</a>'s {@code amount}, {@code tax_code} and {@code tax_behavior} are used. If you provide
     * a shipping rate, then you cannot pass the {@code amount}, {@code tax_code}, or {@code
     * tax_behavior} parameters.
     */
    @SerializedName("shipping_rate")
    String shippingRate;

    /**
     * Specifies whether the {@code amount} includes taxes. If {@code tax_behavior=inclusive}, then
     * the amount includes taxes. Defaults to {@code exclusive}.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /**
     * The <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> used to calculate tax
     * on shipping. If not provided, the default shipping tax code from your <a
     * href="https://stripe.com/settings/tax">Tax Settings</a> is used.
     */
    @SerializedName("tax_code")
    String taxCode;

    private ShippingCost(
        Long amount,
        Map<String, Object> extraParams,
        String shippingRate,
        TaxBehavior taxBehavior,
        String taxCode) {
      this.amount = amount;
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.taxBehavior = taxBehavior;
      this.taxCode = taxCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Map<String, Object> extraParams;

      private String shippingRate;

      private TaxBehavior taxBehavior;

      private String taxCode;

      /** Finalize and obtain parameter instance from this builder. */
      public CalculationCreateParams.ShippingCost build() {
        return new CalculationCreateParams.ShippingCost(
            this.amount, this.extraParams, this.shippingRate, this.taxBehavior, this.taxCode);
      }

      /**
       * A positive integer in cents representing the shipping charge. If {@code
       * tax_behavior=inclusive}, then this amount includes taxes. Otherwise, taxes are calculated
       * on top of this amount.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CalculationCreateParams.ShippingCost#extraParams} for the field documentation.
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
       * See {@link CalculationCreateParams.ShippingCost#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * If provided, the <a href="https://stripe.com/docs/api/shipping_rates/object">shipping
       * rate</a>'s {@code amount}, {@code tax_code} and {@code tax_behavior} are used. If you
       * provide a shipping rate, then you cannot pass the {@code amount}, {@code tax_code}, or
       * {@code tax_behavior} parameters.
       */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /**
       * Specifies whether the {@code amount} includes taxes. If {@code tax_behavior=inclusive},
       * then the amount includes taxes. Defaults to {@code exclusive}.
       */
      public Builder setTaxBehavior(CalculationCreateParams.ShippingCost.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * The <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> used to calculate tax
       * on shipping. If not provided, the default shipping tax code from your <a
       * href="https://stripe.com/settings/tax">Tax Settings</a> is used.
       */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }
    }

    public enum TaxBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("exclusive")
      EXCLUSIVE("exclusive"),

      @SerializedName("inclusive")
      INCLUSIVE("inclusive");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxBehavior(String value) {
        this.value = value;
      }
    }
  }
}
