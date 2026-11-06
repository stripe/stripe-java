// File generated from our OpenAPI spec
package com.stripe.param.tax;

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
public class FormCreateParams extends ApiRequestParams {
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
   * Replacement payee details. Cannot be combined with numerical correction fields. Omitted fields
   * remain unchanged.
   */
  @SerializedName("payee_details")
  PayeeDetails payeeDetails;

  /**
   * Whether a second TIN notice was received. Supported for K and MISC forms only; cannot be
   * supplied without a substantive correction.
   */
  @SerializedName("second_tin_notice")
  Boolean secondTinNotice;

  /**
   * Replacement numerical values for a 1099-K. Supply only the group matching the original form.
   * Omitted fields remain unchanged.
   */
  @SerializedName("us_1099_k")
  Us1099K us1099K;

  /**
   * Replacement numerical values for a 1099-MISC. Supply only the group matching the original form.
   * Omitted fields remain unchanged.
   */
  @SerializedName("us_1099_misc")
  Us1099Misc us1099Misc;

  /**
   * Replacement numerical values for a 1099-NEC. Supply only the group matching the original form.
   * Omitted fields remain unchanged.
   */
  @SerializedName("us_1099_nec")
  Us1099Nec us1099Nec;

  private FormCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      PayeeDetails payeeDetails,
      Boolean secondTinNotice,
      Us1099K us1099K,
      Us1099Misc us1099Misc,
      Us1099Nec us1099Nec) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.payeeDetails = payeeDetails;
    this.secondTinNotice = secondTinNotice;
    this.us1099K = us1099K;
    this.us1099Misc = us1099Misc;
    this.us1099Nec = us1099Nec;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private PayeeDetails payeeDetails;

    private Boolean secondTinNotice;

    private Us1099K us1099K;

    private Us1099Misc us1099Misc;

    private Us1099Nec us1099Nec;

    /** Finalize and obtain parameter instance from this builder. */
    public FormCreateParams build() {
      return new FormCreateParams(
          this.expand,
          this.extraParams,
          this.payeeDetails,
          this.secondTinNotice,
          this.us1099K,
          this.us1099Misc,
          this.us1099Nec);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FormCreateParams#expand} for the field documentation.
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
     * FormCreateParams#expand} for the field documentation.
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
     * FormCreateParams#extraParams} for the field documentation.
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
     * See {@link FormCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Replacement payee details. Cannot be combined with numerical correction fields. Omitted
     * fields remain unchanged.
     */
    public Builder setPayeeDetails(FormCreateParams.PayeeDetails payeeDetails) {
      this.payeeDetails = payeeDetails;
      return this;
    }

    /**
     * Whether a second TIN notice was received. Supported for K and MISC forms only; cannot be
     * supplied without a substantive correction.
     */
    public Builder setSecondTinNotice(Boolean secondTinNotice) {
      this.secondTinNotice = secondTinNotice;
      return this;
    }

    /**
     * Replacement numerical values for a 1099-K. Supply only the group matching the original form.
     * Omitted fields remain unchanged.
     */
    public Builder setUs1099K(FormCreateParams.Us1099K us1099K) {
      this.us1099K = us1099K;
      return this;
    }

    /**
     * Replacement numerical values for a 1099-MISC. Supply only the group matching the original
     * form. Omitted fields remain unchanged.
     */
    public Builder setUs1099Misc(FormCreateParams.Us1099Misc us1099Misc) {
      this.us1099Misc = us1099Misc;
      return this;
    }

    /**
     * Replacement numerical values for a 1099-NEC. Supply only the group matching the original
     * form. Omitted fields remain unchanged.
     */
    public Builder setUs1099Nec(FormCreateParams.Us1099Nec us1099Nec) {
      this.us1099Nec = us1099Nec;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PayeeDetails {
    /** The payee's replacement address fields. Omitted fields remain unchanged. */
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

    /** The payee's merchant category code. */
    @SerializedName("merchant_category_code")
    String merchantCategoryCode;

    /** The first line of the payee's name. */
    @SerializedName("name_line_1")
    String nameLine1;

    /** The second line of the payee's name. An empty string clears this field. */
    @SerializedName("name_line_2")
    String nameLine2;

    /** The payee's US taxpayer identification number. */
    @SerializedName("tax_id_number")
    String taxIdNumber;

    /**
     * The payee's Treasury tipped occupation code, where supported by the reporting year and form
     * type.
     */
    @SerializedName("treasury_tipped_occupation_code")
    String treasuryTippedOccupationCode;

    private PayeeDetails(
        Address address,
        Map<String, Object> extraParams,
        String merchantCategoryCode,
        String nameLine1,
        String nameLine2,
        String taxIdNumber,
        String treasuryTippedOccupationCode) {
      this.address = address;
      this.extraParams = extraParams;
      this.merchantCategoryCode = merchantCategoryCode;
      this.nameLine1 = nameLine1;
      this.nameLine2 = nameLine2;
      this.taxIdNumber = taxIdNumber;
      this.treasuryTippedOccupationCode = treasuryTippedOccupationCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private String merchantCategoryCode;

      private String nameLine1;

      private String nameLine2;

      private String taxIdNumber;

      private String treasuryTippedOccupationCode;

      /** Finalize and obtain parameter instance from this builder. */
      public FormCreateParams.PayeeDetails build() {
        return new FormCreateParams.PayeeDetails(
            this.address,
            this.extraParams,
            this.merchantCategoryCode,
            this.nameLine1,
            this.nameLine2,
            this.taxIdNumber,
            this.treasuryTippedOccupationCode);
      }

      /** The payee's replacement address fields. Omitted fields remain unchanged. */
      public Builder setAddress(FormCreateParams.PayeeDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormCreateParams.PayeeDetails#extraParams} for the field documentation.
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
       * See {@link FormCreateParams.PayeeDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The payee's merchant category code. */
      public Builder setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
      }

      /** The first line of the payee's name. */
      public Builder setNameLine1(String nameLine1) {
        this.nameLine1 = nameLine1;
        return this;
      }

      /** The second line of the payee's name. An empty string clears this field. */
      public Builder setNameLine2(String nameLine2) {
        this.nameLine2 = nameLine2;
        return this;
      }

      /** The payee's US taxpayer identification number. */
      public Builder setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
        return this;
      }

      /**
       * The payee's Treasury tipped occupation code, where supported by the reporting year and form
       * type.
       */
      public Builder setTreasuryTippedOccupationCode(String treasuryTippedOccupationCode) {
        this.treasuryTippedOccupationCode = treasuryTippedOccupationCode;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** The city of the payee's address. */
      @SerializedName("city")
      String city;

      /** The two-letter country code of the payee's address. */
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

      /** The first line of the payee's address. */
      @SerializedName("line1")
      String line1;

      /** The second line of the payee's address. An empty string clears this field. */
      @SerializedName("line2")
      String line2;

      /** The postal code of the payee's address. */
      @SerializedName("postal_code")
      String postalCode;

      /** The state of the payee's address. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
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
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.PayeeDetails.Address build() {
          return new FormCreateParams.PayeeDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** The city of the payee's address. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** The two-letter country code of the payee's address. */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.PayeeDetails.Address#extraParams} for the field
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
         * map. See {@link FormCreateParams.PayeeDetails.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The first line of the payee's address. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** The second line of the payee's address. An empty string clears this field. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** The postal code of the payee's address. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** The state of the payee's address. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099K {
    /** Replacement card-not-present transaction amount. */
    @SerializedName("card_not_present_transactions")
    CardNotPresentTransactions cardNotPresentTransactions;

    /** Replacement cash tips, where supported by the reporting year. */
    @SerializedName("cash_tips")
    CashTips cashTips;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Replacement federal income tax withheld. */
    @SerializedName("federal_income_tax_withheld")
    FederalIncomeTaxWithheld federalIncomeTaxWithheld;

    /** Replacement amounts for all twelve months, from January through December. */
    @SerializedName("monthly_volumes")
    List<FormCreateParams.Us1099K.MonthlyVolume> monthlyVolumes;

    /** Replacement payment transaction count. */
    @SerializedName("payment_transactions_count")
    PaymentTransactionsCount paymentTransactionsCount;

    /** Replacement state income tax withheld. */
    @SerializedName("state_income_tax_withheld")
    StateIncomeTaxWithheld stateIncomeTaxWithheld;

    private Us1099K(
        CardNotPresentTransactions cardNotPresentTransactions,
        CashTips cashTips,
        Map<String, Object> extraParams,
        FederalIncomeTaxWithheld federalIncomeTaxWithheld,
        List<FormCreateParams.Us1099K.MonthlyVolume> monthlyVolumes,
        PaymentTransactionsCount paymentTransactionsCount,
        StateIncomeTaxWithheld stateIncomeTaxWithheld) {
      this.cardNotPresentTransactions = cardNotPresentTransactions;
      this.cashTips = cashTips;
      this.extraParams = extraParams;
      this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
      this.monthlyVolumes = monthlyVolumes;
      this.paymentTransactionsCount = paymentTransactionsCount;
      this.stateIncomeTaxWithheld = stateIncomeTaxWithheld;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CardNotPresentTransactions cardNotPresentTransactions;

      private CashTips cashTips;

      private Map<String, Object> extraParams;

      private FederalIncomeTaxWithheld federalIncomeTaxWithheld;

      private List<FormCreateParams.Us1099K.MonthlyVolume> monthlyVolumes;

      private PaymentTransactionsCount paymentTransactionsCount;

      private StateIncomeTaxWithheld stateIncomeTaxWithheld;

      /** Finalize and obtain parameter instance from this builder. */
      public FormCreateParams.Us1099K build() {
        return new FormCreateParams.Us1099K(
            this.cardNotPresentTransactions,
            this.cashTips,
            this.extraParams,
            this.federalIncomeTaxWithheld,
            this.monthlyVolumes,
            this.paymentTransactionsCount,
            this.stateIncomeTaxWithheld);
      }

      /** Replacement card-not-present transaction amount. */
      public Builder setCardNotPresentTransactions(
          FormCreateParams.Us1099K.CardNotPresentTransactions cardNotPresentTransactions) {
        this.cardNotPresentTransactions = cardNotPresentTransactions;
        return this;
      }

      /** Replacement cash tips, where supported by the reporting year. */
      public Builder setCashTips(FormCreateParams.Us1099K.CashTips cashTips) {
        this.cashTips = cashTips;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormCreateParams.Us1099K#extraParams} for the field documentation.
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
       * See {@link FormCreateParams.Us1099K#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Replacement federal income tax withheld. */
      public Builder setFederalIncomeTaxWithheld(
          FormCreateParams.Us1099K.FederalIncomeTaxWithheld federalIncomeTaxWithheld) {
        this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
        return this;
      }

      /**
       * Add an element to `monthlyVolumes` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * FormCreateParams.Us1099K#monthlyVolumes} for the field documentation.
       */
      public Builder addMonthlyVolume(FormCreateParams.Us1099K.MonthlyVolume element) {
        if (this.monthlyVolumes == null) {
          this.monthlyVolumes = new ArrayList<>();
        }
        this.monthlyVolumes.add(element);
        return this;
      }

      /**
       * Add all elements to `monthlyVolumes` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * FormCreateParams.Us1099K#monthlyVolumes} for the field documentation.
       */
      public Builder addAllMonthlyVolume(List<FormCreateParams.Us1099K.MonthlyVolume> elements) {
        if (this.monthlyVolumes == null) {
          this.monthlyVolumes = new ArrayList<>();
        }
        this.monthlyVolumes.addAll(elements);
        return this;
      }

      /** Replacement payment transaction count. */
      public Builder setPaymentTransactionsCount(
          FormCreateParams.Us1099K.PaymentTransactionsCount paymentTransactionsCount) {
        this.paymentTransactionsCount = paymentTransactionsCount;
        return this;
      }

      /** Replacement state income tax withheld. */
      public Builder setStateIncomeTaxWithheld(
          FormCreateParams.Us1099K.StateIncomeTaxWithheld stateIncomeTaxWithheld) {
        this.stateIncomeTaxWithheld = stateIncomeTaxWithheld;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardNotPresentTransactions {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private CardNotPresentTransactions(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099K.CardNotPresentTransactions build() {
          return new FormCreateParams.Us1099K.CardNotPresentTransactions(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099K.CardNotPresentTransactions#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099K.CardNotPresentTransactions#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CashTips {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private CashTips(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099K.CashTips build() {
          return new FormCreateParams.Us1099K.CashTips(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099K.CashTips#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099K.CashTips#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FederalIncomeTaxWithheld {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private FederalIncomeTaxWithheld(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099K.FederalIncomeTaxWithheld build() {
          return new FormCreateParams.Us1099K.FederalIncomeTaxWithheld(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099K.FederalIncomeTaxWithheld#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099K.FederalIncomeTaxWithheld#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MonthlyVolume {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private MonthlyVolume(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099K.MonthlyVolume build() {
          return new FormCreateParams.Us1099K.MonthlyVolume(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099K.MonthlyVolume#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099K.MonthlyVolume#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentTransactionsCount {
      /** <strong>Required.</strong> The replacement non-negative transaction count. */
      @SerializedName("count")
      Long count;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PaymentTransactionsCount(Long count, Map<String, Object> extraParams) {
        this.count = count;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long count;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099K.PaymentTransactionsCount build() {
          return new FormCreateParams.Us1099K.PaymentTransactionsCount(
              this.count, this.extraParams);
        }

        /** <strong>Required.</strong> The replacement non-negative transaction count. */
        public Builder setCount(Long count) {
          this.count = count;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099K.PaymentTransactionsCount#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099K.PaymentTransactionsCount#extraParams} for the
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StateIncomeTaxWithheld {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private StateIncomeTaxWithheld(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099K.StateIncomeTaxWithheld build() {
          return new FormCreateParams.Us1099K.StateIncomeTaxWithheld(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099K.StateIncomeTaxWithheld#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099K.StateIncomeTaxWithheld#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099Misc {
    /** Replacement cash tips, where supported by the reporting year. */
    @SerializedName("cash_tips")
    CashTips cashTips;

    /** Replacement crop insurance proceeds. */
    @SerializedName("crop_insurance_proceeds")
    CropInsuranceProceeds cropInsuranceProceeds;

    /** Replacement direct-sales-for-resale indicator. */
    @SerializedName("direct_sales_for_resale")
    Boolean directSalesForResale;

    /** Replacement excess golden parachute payments, where supported by the reporting year. */
    @SerializedName("excess_golden_parachute_payments")
    ExcessGoldenParachutePayments excessGoldenParachutePayments;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Replacement FATCA filing requirement; cannot be supplied without a substantive correction.
     */
    @SerializedName("fatca_filing_required")
    Boolean fatcaFilingRequired;

    /** Replacement federal income tax withheld. */
    @SerializedName("federal_income_tax_withheld")
    FederalIncomeTaxWithheld federalIncomeTaxWithheld;

    /** Replacement fish purchased for resale. */
    @SerializedName("fish_purchased_for_resale")
    FishPurchasedForResale fishPurchasedForResale;

    /** Replacement fishing boat proceeds. */
    @SerializedName("fishing_boat_proceeds")
    FishingBoatProceeds fishingBoatProceeds;

    /** Replacement gross proceeds paid to an attorney. */
    @SerializedName("gross_proceeds_paid_to_an_attorney")
    GrossProceedsPaidToAnAttorney grossProceedsPaidToAnAttorney;

    /** Replacement medical and health care payments. */
    @SerializedName("medical_and_health_care_payments")
    MedicalAndHealthCarePayments medicalAndHealthCarePayments;

    /** Replacement nonqualified deferred compensation. */
    @SerializedName("nonqualified_deferred_compensation")
    NonqualifiedDeferredCompensation nonqualifiedDeferredCompensation;

    /** Replacement other income. */
    @SerializedName("other_income")
    OtherIncome otherIncome;

    /** Replacement overtime compensation, where supported by the reporting year. */
    @SerializedName("overtime_compensation")
    OvertimeCompensation overtimeCompensation;

    /** Replacement rents. */
    @SerializedName("rents")
    Rents rents;

    /** Replacement royalties. */
    @SerializedName("royalties")
    Royalties royalties;

    /** Replacement section 409A deferrals. */
    @SerializedName("section_409a_deferrals")
    Section409aDeferrals section409aDeferrals;

    /** Replacement state income. */
    @SerializedName("state_income")
    StateIncome stateIncome;

    /** Replacement state tax withheld. */
    @SerializedName("state_tax_withheld")
    StateTaxWithheld stateTaxWithheld;

    /** Replacement substitute payments. */
    @SerializedName("substitute_payments")
    SubstitutePayments substitutePayments;

    private Us1099Misc(
        CashTips cashTips,
        CropInsuranceProceeds cropInsuranceProceeds,
        Boolean directSalesForResale,
        ExcessGoldenParachutePayments excessGoldenParachutePayments,
        Map<String, Object> extraParams,
        Boolean fatcaFilingRequired,
        FederalIncomeTaxWithheld federalIncomeTaxWithheld,
        FishPurchasedForResale fishPurchasedForResale,
        FishingBoatProceeds fishingBoatProceeds,
        GrossProceedsPaidToAnAttorney grossProceedsPaidToAnAttorney,
        MedicalAndHealthCarePayments medicalAndHealthCarePayments,
        NonqualifiedDeferredCompensation nonqualifiedDeferredCompensation,
        OtherIncome otherIncome,
        OvertimeCompensation overtimeCompensation,
        Rents rents,
        Royalties royalties,
        Section409aDeferrals section409aDeferrals,
        StateIncome stateIncome,
        StateTaxWithheld stateTaxWithheld,
        SubstitutePayments substitutePayments) {
      this.cashTips = cashTips;
      this.cropInsuranceProceeds = cropInsuranceProceeds;
      this.directSalesForResale = directSalesForResale;
      this.excessGoldenParachutePayments = excessGoldenParachutePayments;
      this.extraParams = extraParams;
      this.fatcaFilingRequired = fatcaFilingRequired;
      this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
      this.fishPurchasedForResale = fishPurchasedForResale;
      this.fishingBoatProceeds = fishingBoatProceeds;
      this.grossProceedsPaidToAnAttorney = grossProceedsPaidToAnAttorney;
      this.medicalAndHealthCarePayments = medicalAndHealthCarePayments;
      this.nonqualifiedDeferredCompensation = nonqualifiedDeferredCompensation;
      this.otherIncome = otherIncome;
      this.overtimeCompensation = overtimeCompensation;
      this.rents = rents;
      this.royalties = royalties;
      this.section409aDeferrals = section409aDeferrals;
      this.stateIncome = stateIncome;
      this.stateTaxWithheld = stateTaxWithheld;
      this.substitutePayments = substitutePayments;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CashTips cashTips;

      private CropInsuranceProceeds cropInsuranceProceeds;

      private Boolean directSalesForResale;

      private ExcessGoldenParachutePayments excessGoldenParachutePayments;

      private Map<String, Object> extraParams;

      private Boolean fatcaFilingRequired;

      private FederalIncomeTaxWithheld federalIncomeTaxWithheld;

      private FishPurchasedForResale fishPurchasedForResale;

      private FishingBoatProceeds fishingBoatProceeds;

      private GrossProceedsPaidToAnAttorney grossProceedsPaidToAnAttorney;

      private MedicalAndHealthCarePayments medicalAndHealthCarePayments;

      private NonqualifiedDeferredCompensation nonqualifiedDeferredCompensation;

      private OtherIncome otherIncome;

      private OvertimeCompensation overtimeCompensation;

      private Rents rents;

      private Royalties royalties;

      private Section409aDeferrals section409aDeferrals;

      private StateIncome stateIncome;

      private StateTaxWithheld stateTaxWithheld;

      private SubstitutePayments substitutePayments;

      /** Finalize and obtain parameter instance from this builder. */
      public FormCreateParams.Us1099Misc build() {
        return new FormCreateParams.Us1099Misc(
            this.cashTips,
            this.cropInsuranceProceeds,
            this.directSalesForResale,
            this.excessGoldenParachutePayments,
            this.extraParams,
            this.fatcaFilingRequired,
            this.federalIncomeTaxWithheld,
            this.fishPurchasedForResale,
            this.fishingBoatProceeds,
            this.grossProceedsPaidToAnAttorney,
            this.medicalAndHealthCarePayments,
            this.nonqualifiedDeferredCompensation,
            this.otherIncome,
            this.overtimeCompensation,
            this.rents,
            this.royalties,
            this.section409aDeferrals,
            this.stateIncome,
            this.stateTaxWithheld,
            this.substitutePayments);
      }

      /** Replacement cash tips, where supported by the reporting year. */
      public Builder setCashTips(FormCreateParams.Us1099Misc.CashTips cashTips) {
        this.cashTips = cashTips;
        return this;
      }

      /** Replacement crop insurance proceeds. */
      public Builder setCropInsuranceProceeds(
          FormCreateParams.Us1099Misc.CropInsuranceProceeds cropInsuranceProceeds) {
        this.cropInsuranceProceeds = cropInsuranceProceeds;
        return this;
      }

      /** Replacement direct-sales-for-resale indicator. */
      public Builder setDirectSalesForResale(Boolean directSalesForResale) {
        this.directSalesForResale = directSalesForResale;
        return this;
      }

      /** Replacement excess golden parachute payments, where supported by the reporting year. */
      public Builder setExcessGoldenParachutePayments(
          FormCreateParams.Us1099Misc.ExcessGoldenParachutePayments excessGoldenParachutePayments) {
        this.excessGoldenParachutePayments = excessGoldenParachutePayments;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormCreateParams.Us1099Misc#extraParams} for the field documentation.
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
       * See {@link FormCreateParams.Us1099Misc#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Replacement FATCA filing requirement; cannot be supplied without a substantive correction.
       */
      public Builder setFatcaFilingRequired(Boolean fatcaFilingRequired) {
        this.fatcaFilingRequired = fatcaFilingRequired;
        return this;
      }

      /** Replacement federal income tax withheld. */
      public Builder setFederalIncomeTaxWithheld(
          FormCreateParams.Us1099Misc.FederalIncomeTaxWithheld federalIncomeTaxWithheld) {
        this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
        return this;
      }

      /** Replacement fish purchased for resale. */
      public Builder setFishPurchasedForResale(
          FormCreateParams.Us1099Misc.FishPurchasedForResale fishPurchasedForResale) {
        this.fishPurchasedForResale = fishPurchasedForResale;
        return this;
      }

      /** Replacement fishing boat proceeds. */
      public Builder setFishingBoatProceeds(
          FormCreateParams.Us1099Misc.FishingBoatProceeds fishingBoatProceeds) {
        this.fishingBoatProceeds = fishingBoatProceeds;
        return this;
      }

      /** Replacement gross proceeds paid to an attorney. */
      public Builder setGrossProceedsPaidToAnAttorney(
          FormCreateParams.Us1099Misc.GrossProceedsPaidToAnAttorney grossProceedsPaidToAnAttorney) {
        this.grossProceedsPaidToAnAttorney = grossProceedsPaidToAnAttorney;
        return this;
      }

      /** Replacement medical and health care payments. */
      public Builder setMedicalAndHealthCarePayments(
          FormCreateParams.Us1099Misc.MedicalAndHealthCarePayments medicalAndHealthCarePayments) {
        this.medicalAndHealthCarePayments = medicalAndHealthCarePayments;
        return this;
      }

      /** Replacement nonqualified deferred compensation. */
      public Builder setNonqualifiedDeferredCompensation(
          FormCreateParams.Us1099Misc.NonqualifiedDeferredCompensation
              nonqualifiedDeferredCompensation) {
        this.nonqualifiedDeferredCompensation = nonqualifiedDeferredCompensation;
        return this;
      }

      /** Replacement other income. */
      public Builder setOtherIncome(FormCreateParams.Us1099Misc.OtherIncome otherIncome) {
        this.otherIncome = otherIncome;
        return this;
      }

      /** Replacement overtime compensation, where supported by the reporting year. */
      public Builder setOvertimeCompensation(
          FormCreateParams.Us1099Misc.OvertimeCompensation overtimeCompensation) {
        this.overtimeCompensation = overtimeCompensation;
        return this;
      }

      /** Replacement rents. */
      public Builder setRents(FormCreateParams.Us1099Misc.Rents rents) {
        this.rents = rents;
        return this;
      }

      /** Replacement royalties. */
      public Builder setRoyalties(FormCreateParams.Us1099Misc.Royalties royalties) {
        this.royalties = royalties;
        return this;
      }

      /** Replacement section 409A deferrals. */
      public Builder setSection409aDeferrals(
          FormCreateParams.Us1099Misc.Section409aDeferrals section409aDeferrals) {
        this.section409aDeferrals = section409aDeferrals;
        return this;
      }

      /** Replacement state income. */
      public Builder setStateIncome(FormCreateParams.Us1099Misc.StateIncome stateIncome) {
        this.stateIncome = stateIncome;
        return this;
      }

      /** Replacement state tax withheld. */
      public Builder setStateTaxWithheld(
          FormCreateParams.Us1099Misc.StateTaxWithheld stateTaxWithheld) {
        this.stateTaxWithheld = stateTaxWithheld;
        return this;
      }

      /** Replacement substitute payments. */
      public Builder setSubstitutePayments(
          FormCreateParams.Us1099Misc.SubstitutePayments substitutePayments) {
        this.substitutePayments = substitutePayments;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CashTips {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private CashTips(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.CashTips build() {
          return new FormCreateParams.Us1099Misc.CashTips(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.CashTips#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.CashTips#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CropInsuranceProceeds {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private CropInsuranceProceeds(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.CropInsuranceProceeds build() {
          return new FormCreateParams.Us1099Misc.CropInsuranceProceeds(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.CropInsuranceProceeds#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Misc.CropInsuranceProceeds#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ExcessGoldenParachutePayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private ExcessGoldenParachutePayments(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.ExcessGoldenParachutePayments build() {
          return new FormCreateParams.Us1099Misc.ExcessGoldenParachutePayments(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.ExcessGoldenParachutePayments#extraParams}
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
         * map. See {@link FormCreateParams.Us1099Misc.ExcessGoldenParachutePayments#extraParams}
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FederalIncomeTaxWithheld {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private FederalIncomeTaxWithheld(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.FederalIncomeTaxWithheld build() {
          return new FormCreateParams.Us1099Misc.FederalIncomeTaxWithheld(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.FederalIncomeTaxWithheld#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Misc.FederalIncomeTaxWithheld#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FishPurchasedForResale {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private FishPurchasedForResale(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.FishPurchasedForResale build() {
          return new FormCreateParams.Us1099Misc.FishPurchasedForResale(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.FishPurchasedForResale#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Misc.FishPurchasedForResale#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FishingBoatProceeds {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private FishingBoatProceeds(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.FishingBoatProceeds build() {
          return new FormCreateParams.Us1099Misc.FishingBoatProceeds(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.FishingBoatProceeds#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Misc.FishingBoatProceeds#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GrossProceedsPaidToAnAttorney {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private GrossProceedsPaidToAnAttorney(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.GrossProceedsPaidToAnAttorney build() {
          return new FormCreateParams.Us1099Misc.GrossProceedsPaidToAnAttorney(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.GrossProceedsPaidToAnAttorney#extraParams}
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
         * map. See {@link FormCreateParams.Us1099Misc.GrossProceedsPaidToAnAttorney#extraParams}
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MedicalAndHealthCarePayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private MedicalAndHealthCarePayments(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.MedicalAndHealthCarePayments build() {
          return new FormCreateParams.Us1099Misc.MedicalAndHealthCarePayments(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.MedicalAndHealthCarePayments#extraParams} for
         * the field documentation.
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
         * map. See {@link FormCreateParams.Us1099Misc.MedicalAndHealthCarePayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NonqualifiedDeferredCompensation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private NonqualifiedDeferredCompensation(
          Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.NonqualifiedDeferredCompensation build() {
          return new FormCreateParams.Us1099Misc.NonqualifiedDeferredCompensation(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.NonqualifiedDeferredCompensation#extraParams}
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
         * map. See {@link FormCreateParams.Us1099Misc.NonqualifiedDeferredCompensation#extraParams}
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OtherIncome {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private OtherIncome(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.OtherIncome build() {
          return new FormCreateParams.Us1099Misc.OtherIncome(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.OtherIncome#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.OtherIncome#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OvertimeCompensation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private OvertimeCompensation(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.OvertimeCompensation build() {
          return new FormCreateParams.Us1099Misc.OvertimeCompensation(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.OvertimeCompensation#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Misc.OvertimeCompensation#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Rents {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private Rents(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.Rents build() {
          return new FormCreateParams.Us1099Misc.Rents(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.Rents#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.Rents#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Royalties {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private Royalties(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.Royalties build() {
          return new FormCreateParams.Us1099Misc.Royalties(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.Royalties#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.Royalties#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Section409aDeferrals {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private Section409aDeferrals(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.Section409aDeferrals build() {
          return new FormCreateParams.Us1099Misc.Section409aDeferrals(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.Section409aDeferrals#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Misc.Section409aDeferrals#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StateIncome {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private StateIncome(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.StateIncome build() {
          return new FormCreateParams.Us1099Misc.StateIncome(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.StateIncome#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.StateIncome#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StateTaxWithheld {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private StateTaxWithheld(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.StateTaxWithheld build() {
          return new FormCreateParams.Us1099Misc.StateTaxWithheld(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.StateTaxWithheld#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.StateTaxWithheld#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SubstitutePayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private SubstitutePayments(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Misc.SubstitutePayments build() {
          return new FormCreateParams.Us1099Misc.SubstitutePayments(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Misc.SubstitutePayments#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Misc.SubstitutePayments#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Us1099Nec {
    /** Replacement cash tips, where supported by the reporting year. */
    @SerializedName("cash_tips")
    CashTips cashTips;

    /** Replacement direct-sales indicator. */
    @SerializedName("direct_sales_indicator")
    Boolean directSalesIndicator;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Replacement federal income tax withheld. */
    @SerializedName("federal_income_tax_withheld")
    FederalIncomeTaxWithheld federalIncomeTaxWithheld;

    /** Replacement nonemployee compensation. */
    @SerializedName("nonemployee_compensation")
    NonemployeeCompensation nonemployeeCompensation;

    /** Replacement overtime compensation, where supported by the reporting year. */
    @SerializedName("overtime_compensation")
    OvertimeCompensation overtimeCompensation;

    /** Replacement state income. */
    @SerializedName("state_income")
    StateIncome stateIncome;

    /** Replacement state tax withheld. */
    @SerializedName("state_tax_withheld")
    StateTaxWithheld stateTaxWithheld;

    private Us1099Nec(
        CashTips cashTips,
        Boolean directSalesIndicator,
        Map<String, Object> extraParams,
        FederalIncomeTaxWithheld federalIncomeTaxWithheld,
        NonemployeeCompensation nonemployeeCompensation,
        OvertimeCompensation overtimeCompensation,
        StateIncome stateIncome,
        StateTaxWithheld stateTaxWithheld) {
      this.cashTips = cashTips;
      this.directSalesIndicator = directSalesIndicator;
      this.extraParams = extraParams;
      this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
      this.nonemployeeCompensation = nonemployeeCompensation;
      this.overtimeCompensation = overtimeCompensation;
      this.stateIncome = stateIncome;
      this.stateTaxWithheld = stateTaxWithheld;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CashTips cashTips;

      private Boolean directSalesIndicator;

      private Map<String, Object> extraParams;

      private FederalIncomeTaxWithheld federalIncomeTaxWithheld;

      private NonemployeeCompensation nonemployeeCompensation;

      private OvertimeCompensation overtimeCompensation;

      private StateIncome stateIncome;

      private StateTaxWithheld stateTaxWithheld;

      /** Finalize and obtain parameter instance from this builder. */
      public FormCreateParams.Us1099Nec build() {
        return new FormCreateParams.Us1099Nec(
            this.cashTips,
            this.directSalesIndicator,
            this.extraParams,
            this.federalIncomeTaxWithheld,
            this.nonemployeeCompensation,
            this.overtimeCompensation,
            this.stateIncome,
            this.stateTaxWithheld);
      }

      /** Replacement cash tips, where supported by the reporting year. */
      public Builder setCashTips(FormCreateParams.Us1099Nec.CashTips cashTips) {
        this.cashTips = cashTips;
        return this;
      }

      /** Replacement direct-sales indicator. */
      public Builder setDirectSalesIndicator(Boolean directSalesIndicator) {
        this.directSalesIndicator = directSalesIndicator;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormCreateParams.Us1099Nec#extraParams} for the field documentation.
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
       * See {@link FormCreateParams.Us1099Nec#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Replacement federal income tax withheld. */
      public Builder setFederalIncomeTaxWithheld(
          FormCreateParams.Us1099Nec.FederalIncomeTaxWithheld federalIncomeTaxWithheld) {
        this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
        return this;
      }

      /** Replacement nonemployee compensation. */
      public Builder setNonemployeeCompensation(
          FormCreateParams.Us1099Nec.NonemployeeCompensation nonemployeeCompensation) {
        this.nonemployeeCompensation = nonemployeeCompensation;
        return this;
      }

      /** Replacement overtime compensation, where supported by the reporting year. */
      public Builder setOvertimeCompensation(
          FormCreateParams.Us1099Nec.OvertimeCompensation overtimeCompensation) {
        this.overtimeCompensation = overtimeCompensation;
        return this;
      }

      /** Replacement state income. */
      public Builder setStateIncome(FormCreateParams.Us1099Nec.StateIncome stateIncome) {
        this.stateIncome = stateIncome;
        return this;
      }

      /** Replacement state tax withheld. */
      public Builder setStateTaxWithheld(
          FormCreateParams.Us1099Nec.StateTaxWithheld stateTaxWithheld) {
        this.stateTaxWithheld = stateTaxWithheld;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CashTips {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private CashTips(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Nec.CashTips build() {
          return new FormCreateParams.Us1099Nec.CashTips(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Nec.CashTips#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Nec.CashTips#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FederalIncomeTaxWithheld {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private FederalIncomeTaxWithheld(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Nec.FederalIncomeTaxWithheld build() {
          return new FormCreateParams.Us1099Nec.FederalIncomeTaxWithheld(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Nec.FederalIncomeTaxWithheld#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Nec.FederalIncomeTaxWithheld#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NonemployeeCompensation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private NonemployeeCompensation(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Nec.NonemployeeCompensation build() {
          return new FormCreateParams.Us1099Nec.NonemployeeCompensation(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Nec.NonemployeeCompensation#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Nec.NonemployeeCompensation#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OvertimeCompensation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private OvertimeCompensation(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Nec.OvertimeCompensation build() {
          return new FormCreateParams.Us1099Nec.OvertimeCompensation(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Nec.OvertimeCompensation#extraParams} for the
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
         * map. See {@link FormCreateParams.Us1099Nec.OvertimeCompensation#extraParams} for the
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StateIncome {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private StateIncome(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Nec.StateIncome build() {
          return new FormCreateParams.Us1099Nec.StateIncome(this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Nec.StateIncome#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Nec.StateIncome#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StateTaxWithheld {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The replacement amount in major currency units, with at most two
       * decimal places. Must be non-negative.
       */
      @SerializedName("volume_decimal")
      String volumeDecimal;

      private StateTaxWithheld(Map<String, Object> extraParams, String volumeDecimal) {
        this.extraParams = extraParams;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public FormCreateParams.Us1099Nec.StateTaxWithheld build() {
          return new FormCreateParams.Us1099Nec.StateTaxWithheld(
              this.extraParams, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FormCreateParams.Us1099Nec.StateTaxWithheld#extraParams} for the field
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
         * map. See {@link FormCreateParams.Us1099Nec.StateTaxWithheld#extraParams} for the field
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
         * <strong>Required.</strong> The replacement amount in major currency units, with at most
         * two decimal places. Must be non-negative.
         */
        public Builder setVolumeDecimal(String volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }
    }
  }
}
