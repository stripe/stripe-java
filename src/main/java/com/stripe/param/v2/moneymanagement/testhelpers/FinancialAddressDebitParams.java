// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement.testhelpers;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialAddressDebitParams extends ApiRequestParams {
  /** <strong>Required.</strong> Object containing the amount value and currency to debit. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> The network to use in simulating the funds flow. This will be
   * reflected in the resulting ReceivedDebit.
   */
  @SerializedName("network")
  Network network;

  /**
   * Network-specific details for the simulated debit. Only used for ACH debits; supplied details
   * must be valid.
   */
  @SerializedName("network_details")
  NetworkDetails networkDetails;

  /**
   * String explaining funds flow. Use this field to populate the statement descriptor of the
   * ReceivedDebit created as an eventual result of this simulation.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private FinancialAddressDebitParams(
      Amount amount,
      Map<String, Object> extraParams,
      Network network,
      NetworkDetails networkDetails,
      String statementDescriptor) {
    this.amount = amount;
    this.extraParams = extraParams;
    this.network = network;
    this.networkDetails = networkDetails;
    this.statementDescriptor = statementDescriptor;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Map<String, Object> extraParams;

    private Network network;

    private NetworkDetails networkDetails;

    private String statementDescriptor;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressDebitParams build() {
      return new FinancialAddressDebitParams(
          this.amount,
          this.extraParams,
          this.network,
          this.networkDetails,
          this.statementDescriptor);
    }

    /** <strong>Required.</strong> Object containing the amount value and currency to debit. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAddressDebitParams#extraParams} for the field documentation.
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
     * See {@link FinancialAddressDebitParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The network to use in simulating the funds flow. This will be
     * reflected in the resulting ReceivedDebit.
     */
    public Builder setNetwork(FinancialAddressDebitParams.Network network) {
      this.network = network;
      return this;
    }

    /**
     * Network-specific details for the simulated debit. Only used for ACH debits; supplied details
     * must be valid.
     */
    public Builder setNetworkDetails(FinancialAddressDebitParams.NetworkDetails networkDetails) {
      this.networkDetails = networkDetails;
      return this;
    }

    /**
     * String explaining funds flow. Use this field to populate the statement descriptor of the
     * ReceivedDebit created as an eventual result of this simulation.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkDetails {
    /** ACH-specific details for the simulated debit. */
    @SerializedName("ach")
    Ach ach;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private NetworkDetails(Ach ach, Map<String, Object> extraParams) {
      this.ach = ach;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Ach ach;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAddressDebitParams.NetworkDetails build() {
        return new FinancialAddressDebitParams.NetworkDetails(this.ach, this.extraParams);
      }

      /** ACH-specific details for the simulated debit. */
      public Builder setAch(FinancialAddressDebitParams.NetworkDetails.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAddressDebitParams.NetworkDetails#extraParams} for the field documentation.
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
       * See {@link FinancialAddressDebitParams.NetworkDetails#extraParams} for the field
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
    public static class Ach {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The ACH company ID of the originator of the simulated debit.
       * Must contain exactly 10 alphanumeric characters. Sent to the network in uppercase.
       */
      @SerializedName("originator_company_id")
      String originatorCompanyId;

      private Ach(Map<String, Object> extraParams, String originatorCompanyId) {
        this.extraParams = extraParams;
        this.originatorCompanyId = originatorCompanyId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String originatorCompanyId;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAddressDebitParams.NetworkDetails.Ach build() {
          return new FinancialAddressDebitParams.NetworkDetails.Ach(
              this.extraParams, this.originatorCompanyId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAddressDebitParams.NetworkDetails.Ach#extraParams} for the field
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
         * map. See {@link FinancialAddressDebitParams.NetworkDetails.Ach#extraParams} for the field
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
         * <strong>Required.</strong> The ACH company ID of the originator of the simulated debit.
         * Must contain exactly 10 alphanumeric characters. Sent to the network in uppercase.
         */
        public Builder setOriginatorCompanyId(String originatorCompanyId) {
          this.originatorCompanyId = originatorCompanyId;
          return this;
        }
      }
    }
  }

  public enum Network implements ApiRequestParams.EnumParam {
    @SerializedName("ach")
    ACH("ach"),

    @SerializedName("bacs")
    BACS("bacs"),

    @SerializedName("sepa")
    SEPA("sepa");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Network(String value) {
      this.value = value;
    }
  }
}
