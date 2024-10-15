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
public class CustomerCashBalanceTransactionCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** <strong>Required.</strong> The ID of the customer. */
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

  /** If this is a {@code type=funded} transaction, contains information about the funding. */
  @SerializedName("funded")
  Funded funded;

  /**
   * If this is a {@code type=funding_reversed} transaction, contains information about the reversal
   * of a funding.
   */
  @SerializedName("funding_reversed")
  FundingReversed fundingReversed;

  /**
   * The amount associated with the cash balance transaction. Only applicable to transactions of
   * type {@code funded}.
   */
  @SerializedName("net_amount")
  Long netAmount;

  /** <strong>Required.</strong> The type of cash balance transaction to generate. */
  @SerializedName("type")
  Type type;

  private CustomerCashBalanceTransactionCreateParams(
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      Funded funded,
      FundingReversed fundingReversed,
      Long netAmount,
      Type type) {
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.funded = funded;
    this.fundingReversed = fundingReversed;
    this.netAmount = netAmount;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Funded funded;

    private FundingReversed fundingReversed;

    private Long netAmount;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerCashBalanceTransactionCreateParams build() {
      return new CustomerCashBalanceTransactionCreateParams(
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.funded,
          this.fundingReversed,
          this.netAmount,
          this.type);
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

    /** <strong>Required.</strong> The ID of the customer. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerCashBalanceTransactionCreateParams#expand} for the field documentation.
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
     * CustomerCashBalanceTransactionCreateParams#expand} for the field documentation.
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
     * CustomerCashBalanceTransactionCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomerCashBalanceTransactionCreateParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** If this is a {@code type=funded} transaction, contains information about the funding. */
    public Builder setFunded(CustomerCashBalanceTransactionCreateParams.Funded funded) {
      this.funded = funded;
      return this;
    }

    /**
     * If this is a {@code type=funding_reversed} transaction, contains information about the
     * reversal of a funding.
     */
    public Builder setFundingReversed(
        CustomerCashBalanceTransactionCreateParams.FundingReversed fundingReversed) {
      this.fundingReversed = fundingReversed;
      return this;
    }

    /**
     * The amount associated with the cash balance transaction. Only applicable to transactions of
     * type {@code funded}.
     */
    public Builder setNetAmount(Long netAmount) {
      this.netAmount = netAmount;
      return this;
    }

    /** <strong>Required.</strong> The type of cash balance transaction to generate. */
    public Builder setType(CustomerCashBalanceTransactionCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class Funded {
    /** <strong>Required.</strong> */
    @SerializedName("bank_transfer")
    BankTransfer bankTransfer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Funded(BankTransfer bankTransfer, Map<String, Object> extraParams) {
      this.bankTransfer = bankTransfer;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankTransfer bankTransfer;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerCashBalanceTransactionCreateParams.Funded build() {
        return new CustomerCashBalanceTransactionCreateParams.Funded(
            this.bankTransfer, this.extraParams);
      }

      /** <strong>Required.</strong> */
      public Builder setBankTransfer(
          CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer bankTransfer) {
        this.bankTransfer = bankTransfer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCashBalanceTransactionCreateParams.Funded#extraParams} for the field documentation.
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
       * See {@link CustomerCashBalanceTransactionCreateParams.Funded#extraParams} for the field
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
    public static class BankTransfer {
      /** CA-specific details of the bank transfer funding. */
      @SerializedName("ca_bank_transfer")
      CaBankTransfer caBankTransfer;

      /** EU-specific details of the bank transfer funding. */
      @SerializedName("eu_bank_transfer")
      EuBankTransfer euBankTransfer;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** GB-specific details of the bank transfer funding. */
      @SerializedName("gb_bank_transfer")
      GbBankTransfer gbBankTransfer;

      /** JP-specific details of the bank transfer funding. */
      @SerializedName("jp_bank_transfer")
      JpBankTransfer jpBankTransfer;

      /** MX-specific details of the bank transfer funding. */
      @SerializedName("mx_bank_transfer")
      MxBankTransfer mxBankTransfer;

      @SerializedName("reference")
      String reference;

      @SerializedName("type")
      Type type;

      /** US-specific details of the bank transfer funding. */
      @SerializedName("us_bank_transfer")
      UsBankTransfer usBankTransfer;

      private BankTransfer(
          CaBankTransfer caBankTransfer,
          EuBankTransfer euBankTransfer,
          Map<String, Object> extraParams,
          GbBankTransfer gbBankTransfer,
          JpBankTransfer jpBankTransfer,
          MxBankTransfer mxBankTransfer,
          String reference,
          Type type,
          UsBankTransfer usBankTransfer) {
        this.caBankTransfer = caBankTransfer;
        this.euBankTransfer = euBankTransfer;
        this.extraParams = extraParams;
        this.gbBankTransfer = gbBankTransfer;
        this.jpBankTransfer = jpBankTransfer;
        this.mxBankTransfer = mxBankTransfer;
        this.reference = reference;
        this.type = type;
        this.usBankTransfer = usBankTransfer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CaBankTransfer caBankTransfer;

        private EuBankTransfer euBankTransfer;

        private Map<String, Object> extraParams;

        private GbBankTransfer gbBankTransfer;

        private JpBankTransfer jpBankTransfer;

        private MxBankTransfer mxBankTransfer;

        private String reference;

        private Type type;

        private UsBankTransfer usBankTransfer;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer build() {
          return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer(
              this.caBankTransfer,
              this.euBankTransfer,
              this.extraParams,
              this.gbBankTransfer,
              this.jpBankTransfer,
              this.mxBankTransfer,
              this.reference,
              this.type,
              this.usBankTransfer);
        }

        /** CA-specific details of the bank transfer funding. */
        public Builder setCaBankTransfer(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.CaBankTransfer
                caBankTransfer) {
          this.caBankTransfer = caBankTransfer;
          return this;
        }

        /** EU-specific details of the bank transfer funding. */
        public Builder setEuBankTransfer(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.EuBankTransfer
                euBankTransfer) {
          this.euBankTransfer = euBankTransfer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer#extraParams} for the field
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
         * map. See {@link
         * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** GB-specific details of the bank transfer funding. */
        public Builder setGbBankTransfer(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.GbBankTransfer
                gbBankTransfer) {
          this.gbBankTransfer = gbBankTransfer;
          return this;
        }

        /** JP-specific details of the bank transfer funding. */
        public Builder setJpBankTransfer(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.JpBankTransfer
                jpBankTransfer) {
          this.jpBankTransfer = jpBankTransfer;
          return this;
        }

        /** MX-specific details of the bank transfer funding. */
        public Builder setMxBankTransfer(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.MxBankTransfer
                mxBankTransfer) {
          this.mxBankTransfer = mxBankTransfer;
          return this;
        }

        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        public Builder setType(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.Type type) {
          this.type = type;
          return this;
        }

        /** US-specific details of the bank transfer funding. */
        public Builder setUsBankTransfer(
            CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.UsBankTransfer
                usBankTransfer) {
          this.usBankTransfer = usBankTransfer;
          return this;
        }
      }

      @Getter
      public static class CaBankTransfer {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private CaBankTransfer(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.CaBankTransfer
              build() {
            return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer
                .CaBankTransfer(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.CaBankTransfer#extraParams}
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
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.CaBankTransfer#extraParams}
           * for the field documentation.
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
      public static class EuBankTransfer {
        @SerializedName("bic")
        String bic;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("iban_last4")
        String ibanLast4;

        @SerializedName("network")
        Network network;

        @SerializedName("sender_name")
        String senderName;

        private EuBankTransfer(
            String bic,
            Map<String, Object> extraParams,
            String ibanLast4,
            Network network,
            String senderName) {
          this.bic = bic;
          this.extraParams = extraParams;
          this.ibanLast4 = ibanLast4;
          this.network = network;
          this.senderName = senderName;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String bic;

          private Map<String, Object> extraParams;

          private String ibanLast4;

          private Network network;

          private String senderName;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.EuBankTransfer
              build() {
            return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer
                .EuBankTransfer(
                this.bic, this.extraParams, this.ibanLast4, this.network, this.senderName);
          }

          public Builder setBic(String bic) {
            this.bic = bic;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.EuBankTransfer#extraParams}
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
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.EuBankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setIbanLast4(String ibanLast4) {
            this.ibanLast4 = ibanLast4;
            return this;
          }

          public Builder setNetwork(
              CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.EuBankTransfer.Network
                  network) {
            this.network = network;
            return this;
          }

          public Builder setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
          }
        }

        public enum Network implements ApiRequestParams.EnumParam {
          @SerializedName("sepa")
          SEPA("sepa"),

          @SerializedName("swift")
          SWIFT("swift");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Network(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class GbBankTransfer {
        @SerializedName("account_number_last4")
        String accountNumberLast4;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("sender_name")
        String senderName;

        @SerializedName("sort_code")
        String sortCode;

        private GbBankTransfer(
            String accountNumberLast4,
            Map<String, Object> extraParams,
            String senderName,
            String sortCode) {
          this.accountNumberLast4 = accountNumberLast4;
          this.extraParams = extraParams;
          this.senderName = senderName;
          this.sortCode = sortCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String accountNumberLast4;

          private Map<String, Object> extraParams;

          private String senderName;

          private String sortCode;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.GbBankTransfer
              build() {
            return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer
                .GbBankTransfer(
                this.accountNumberLast4, this.extraParams, this.senderName, this.sortCode);
          }

          public Builder setAccountNumberLast4(String accountNumberLast4) {
            this.accountNumberLast4 = accountNumberLast4;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.GbBankTransfer#extraParams}
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
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.GbBankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
          }

          public Builder setSortCode(String sortCode) {
            this.sortCode = sortCode;
            return this;
          }
        }
      }

      @Getter
      public static class JpBankTransfer {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("sender_bank")
        String senderBank;

        @SerializedName("sender_branch")
        String senderBranch;

        @SerializedName("sender_name")
        String senderName;

        private JpBankTransfer(
            Map<String, Object> extraParams,
            String senderBank,
            String senderBranch,
            String senderName) {
          this.extraParams = extraParams;
          this.senderBank = senderBank;
          this.senderBranch = senderBranch;
          this.senderName = senderName;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String senderBank;

          private String senderBranch;

          private String senderName;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.JpBankTransfer
              build() {
            return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer
                .JpBankTransfer(
                this.extraParams, this.senderBank, this.senderBranch, this.senderName);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.JpBankTransfer#extraParams}
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
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.JpBankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setSenderBank(String senderBank) {
            this.senderBank = senderBank;
            return this;
          }

          public Builder setSenderBranch(String senderBranch) {
            this.senderBranch = senderBranch;
            return this;
          }

          public Builder setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
          }
        }
      }

      @Getter
      public static class MxBankTransfer {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private MxBankTransfer(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.MxBankTransfer
              build() {
            return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer
                .MxBankTransfer(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.MxBankTransfer#extraParams}
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
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.MxBankTransfer#extraParams}
           * for the field documentation.
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
      public static class UsBankTransfer {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        @SerializedName("network")
        Network network;

        @SerializedName("sender_name")
        String senderName;

        private UsBankTransfer(
            Map<String, Object> extraParams, Network network, String senderName) {
          this.extraParams = extraParams;
          this.network = network;
          this.senderName = senderName;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Network network;

          private String senderName;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.UsBankTransfer
              build() {
            return new CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer
                .UsBankTransfer(this.extraParams, this.network, this.senderName);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.UsBankTransfer#extraParams}
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
           * CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.UsBankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setNetwork(
              CustomerCashBalanceTransactionCreateParams.Funded.BankTransfer.UsBankTransfer.Network
                  network) {
            this.network = network;
            return this;
          }

          public Builder setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
          }
        }

        public enum Network implements ApiRequestParams.EnumParam {
          @SerializedName("ach")
          ACH("ach"),

          @SerializedName("domestic_wire_us")
          DOMESTIC_WIRE_US("domestic_wire_us"),

          @SerializedName("swift")
          SWIFT("swift");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Network(String value) {
            this.value = value;
          }
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
  }

  @Getter
  public static class FundingReversed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The ID of the {@code funded} cash balance transaction to be
     * reversed.
     */
    @SerializedName("reversed_customer_cash_balance_transaction")
    String reversedCustomerCashBalanceTransaction;

    private FundingReversed(
        Map<String, Object> extraParams, String reversedCustomerCashBalanceTransaction) {
      this.extraParams = extraParams;
      this.reversedCustomerCashBalanceTransaction = reversedCustomerCashBalanceTransaction;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String reversedCustomerCashBalanceTransaction;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerCashBalanceTransactionCreateParams.FundingReversed build() {
        return new CustomerCashBalanceTransactionCreateParams.FundingReversed(
            this.extraParams, this.reversedCustomerCashBalanceTransaction);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCashBalanceTransactionCreateParams.FundingReversed#extraParams} for the field
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
       * See {@link CustomerCashBalanceTransactionCreateParams.FundingReversed#extraParams} for the
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
       * <strong>Required.</strong> The ID of the {@code funded} cash balance transaction to be
       * reversed.
       */
      public Builder setReversedCustomerCashBalanceTransaction(
          String reversedCustomerCashBalanceTransaction) {
        this.reversedCustomerCashBalanceTransaction = reversedCustomerCashBalanceTransaction;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("funded")
    FUNDED("funded"),

    @SerializedName("funding_reversed")
    FUNDING_REVERSED("funding_reversed");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
