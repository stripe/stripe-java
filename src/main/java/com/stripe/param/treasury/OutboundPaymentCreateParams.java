// File generated from our OpenAPI spec
package com.stripe.param.treasury;

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
public class OutboundPaymentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Amount (in cents) to be transferred. */
  @SerializedName("amount")
  Long amount;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * ID of the customer to whom the OutboundPayment is sent. Must match the Customer attached to the
   * {@code destination_payment_method} passed in.
   */
  @SerializedName("customer")
  String customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The PaymentMethod to use as the payment instrument for the OutboundPayment. Exclusive with
   * {@code destination_payment_method_data}.
   */
  @SerializedName("destination_payment_method")
  String destinationPaymentMethod;

  /**
   * Hash used to generate the PaymentMethod to be used for this OutboundPayment. Exclusive with
   * {@code destination_payment_method}.
   */
  @SerializedName("destination_payment_method_data")
  DestinationPaymentMethodData destinationPaymentMethodData;

  /** Payment method-specific configuration for this OutboundPayment. */
  @SerializedName("destination_payment_method_options")
  DestinationPaymentMethodOptions destinationPaymentMethodOptions;

  /** End user details. */
  @SerializedName("end_user_details")
  EndUserDetails endUserDetails;

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

  /** <strong>Required.</strong> The FinancialAccount to pull funds from. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The description that appears on the receiving end for this OutboundPayment (for example, bank
   * statement for external bank transfer). Maximum 10 characters for {@code ach} payments, 140
   * characters for {@code us_domestic_wire} payments, or 500 characters for {@code stripe} network
   * transfers. The default value is &quot;payment&quot;.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private OutboundPaymentCreateParams(
      Long amount,
      String currency,
      String customer,
      String description,
      String destinationPaymentMethod,
      DestinationPaymentMethodData destinationPaymentMethodData,
      DestinationPaymentMethodOptions destinationPaymentMethodOptions,
      EndUserDetails endUserDetails,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      Map<String, String> metadata,
      String statementDescriptor) {
    this.amount = amount;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.destinationPaymentMethod = destinationPaymentMethod;
    this.destinationPaymentMethodData = destinationPaymentMethodData;
    this.destinationPaymentMethodOptions = destinationPaymentMethodOptions;
    this.endUserDetails = endUserDetails;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String customer;

    private String description;

    private String destinationPaymentMethod;

    private DestinationPaymentMethodData destinationPaymentMethodData;

    private DestinationPaymentMethodOptions destinationPaymentMethodOptions;

    private EndUserDetails endUserDetails;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Map<String, String> metadata;

    private String statementDescriptor;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundPaymentCreateParams build() {
      return new OutboundPaymentCreateParams(
          this.amount,
          this.currency,
          this.customer,
          this.description,
          this.destinationPaymentMethod,
          this.destinationPaymentMethodData,
          this.destinationPaymentMethodOptions,
          this.endUserDetails,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.metadata,
          this.statementDescriptor);
    }

    /** <strong>Required.</strong> Amount (in cents) to be transferred. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
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
     * ID of the customer to whom the OutboundPayment is sent. Must match the Customer attached to
     * the {@code destination_payment_method} passed in.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The PaymentMethod to use as the payment instrument for the OutboundPayment. Exclusive with
     * {@code destination_payment_method_data}.
     */
    public Builder setDestinationPaymentMethod(String destinationPaymentMethod) {
      this.destinationPaymentMethod = destinationPaymentMethod;
      return this;
    }

    /**
     * Hash used to generate the PaymentMethod to be used for this OutboundPayment. Exclusive with
     * {@code destination_payment_method}.
     */
    public Builder setDestinationPaymentMethodData(
        OutboundPaymentCreateParams.DestinationPaymentMethodData destinationPaymentMethodData) {
      this.destinationPaymentMethodData = destinationPaymentMethodData;
      return this;
    }

    /** Payment method-specific configuration for this OutboundPayment. */
    public Builder setDestinationPaymentMethodOptions(
        OutboundPaymentCreateParams.DestinationPaymentMethodOptions
            destinationPaymentMethodOptions) {
      this.destinationPaymentMethodOptions = destinationPaymentMethodOptions;
      return this;
    }

    /** End user details. */
    public Builder setEndUserDetails(OutboundPaymentCreateParams.EndUserDetails endUserDetails) {
      this.endUserDetails = endUserDetails;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OutboundPaymentCreateParams#expand} for the field documentation.
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
     * OutboundPaymentCreateParams#expand} for the field documentation.
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
     * OutboundPaymentCreateParams#extraParams} for the field documentation.
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
     * See {@link OutboundPaymentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The FinancialAccount to pull funds from. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundPaymentCreateParams#metadata} for the field documentation.
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
     * See {@link OutboundPaymentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The description that appears on the receiving end for this OutboundPayment (for example, bank
     * statement for external bank transfer). Maximum 10 characters for {@code ach} payments, 140
     * characters for {@code us_domestic_wire} payments, or 500 characters for {@code stripe}
     * network transfers. The default value is &quot;payment&quot;.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DestinationPaymentMethodData {
    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Required if type is set to {@code financial_account}. The FinancialAccount ID to send funds
     * to.
     */
    @SerializedName("financial_account")
    String financialAccount;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
     * the PaymentMethod with a name matching this value. It contains additional information
     * specific to the PaymentMethod type.
     */
    @SerializedName("type")
    Type type;

    /** Required hash if type is set to {@code us_bank_account}. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    private DestinationPaymentMethodData(
        BillingDetails billingDetails,
        Map<String, Object> extraParams,
        String financialAccount,
        Map<String, String> metadata,
        Type type,
        UsBankAccount usBankAccount) {
      this.billingDetails = billingDetails;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
      this.metadata = metadata;
      this.type = type;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingDetails billingDetails;

      private Map<String, Object> extraParams;

      private String financialAccount;

      private Map<String, String> metadata;

      private Type type;

      private UsBankAccount usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.DestinationPaymentMethodData build() {
        return new OutboundPaymentCreateParams.DestinationPaymentMethodData(
            this.billingDetails,
            this.extraParams,
            this.financialAccount,
            this.metadata,
            this.type,
            this.usBankAccount);
      }

      /**
       * Billing information associated with the PaymentMethod that may be used or required by
       * particular types of payment methods.
       */
      public Builder setBillingDetails(
          OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.DestinationPaymentMethodData#extraParams} for the field
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
       * See {@link OutboundPaymentCreateParams.DestinationPaymentMethodData#extraParams} for the
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
       * Required if type is set to {@code financial_account}. The FinancialAccount ID to send funds
       * to.
       */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.DestinationPaymentMethodData#metadata} for the field
       * documentation.
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
       * See {@link OutboundPaymentCreateParams.DestinationPaymentMethodData#metadata} for the field
       * documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(OutboundPaymentCreateParams.DestinationPaymentMethodData.Type type) {
        this.type = type;
        return this;
      }

      /** Required hash if type is set to {@code us_bank_account}. */
      public Builder setUsBankAccount(
          OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails {
      /** Billing address. */
      @SerializedName("address")
      Object address;

      /** Email address. */
      @SerializedName("email")
      Object email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Full name. */
      @SerializedName("name")
      Object name;

      /** Billing phone number (including extension). */
      @SerializedName("phone")
      Object phone;

      /**
       * Taxpayer identification number. Used only for transactions between LATAM buyers and
       * non-LATAM sellers.
       */
      @SerializedName("tax_id")
      String taxId;

      private BillingDetails(
          Object address,
          Object email,
          Map<String, Object> extraParams,
          Object name,
          Object phone,
          String taxId) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
        this.taxId = taxId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object address;

        private Object email;

        private Map<String, Object> extraParams;

        private Object name;

        private Object phone;

        private String taxId;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails build() {
          return new OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone, this.taxId);
        }

        /** Billing address. */
        public Builder setAddress(
            OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails.Address
                address) {
          this.address = address;
          return this;
        }

        /** Billing address. */
        public Builder setAddress(EmptyParam address) {
          this.address = address;
          return this;
        }

        /** Email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /** Email address. */
        public Builder setEmail(EmptyParam email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails#extraParams} for
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
         * map. See {@link
         * OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Full name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Full name. */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /** Billing phone number (including extension). */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** Billing phone number (including extension). */
        public Builder setPhone(EmptyParam phone) {
          this.phone = phone;
          return this;
        }

        /**
         * Taxpayer identification number. Used only for transactions between LATAM buyers and
         * non-LATAM sellers.
         */
        public Builder setTaxId(String taxId) {
          this.taxId = taxId;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
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
          public OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails.Address
              build() {
            return new OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails
                .Address(
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

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails.Address#extraParams}
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
           * OutboundPaymentCreateParams.DestinationPaymentMethodData.BillingDetails.Address#extraParams}
           * for the field documentation.
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

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount {
      /** Account holder type: individual or company. */
      @SerializedName("account_holder_type")
      AccountHolderType accountHolderType;

      /** Account number of the bank account. */
      @SerializedName("account_number")
      String accountNumber;

      /** Account type: checkings or savings. Defaults to checking if omitted. */
      @SerializedName("account_type")
      AccountType accountType;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of a Financial Connections Account to use as a payment method. */
      @SerializedName("financial_connections_account")
      String financialConnectionsAccount;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;

      private UsBankAccount(
          AccountHolderType accountHolderType,
          String accountNumber,
          AccountType accountType,
          Map<String, Object> extraParams,
          String financialConnectionsAccount,
          String routingNumber) {
        this.accountHolderType = accountHolderType;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.extraParams = extraParams;
        this.financialConnectionsAccount = financialConnectionsAccount;
        this.routingNumber = routingNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AccountHolderType accountHolderType;

        private String accountNumber;

        private AccountType accountType;

        private Map<String, Object> extraParams;

        private String financialConnectionsAccount;

        private String routingNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount build() {
          return new OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount(
              this.accountHolderType,
              this.accountNumber,
              this.accountType,
              this.extraParams,
              this.financialConnectionsAccount,
              this.routingNumber);
        }

        /** Account holder type: individual or company. */
        public Builder setAccountHolderType(
            OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount.AccountHolderType
                accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** Account number of the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Account type: checkings or savings. Defaults to checking if omitted. */
        public Builder setAccountType(
            OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount.AccountType
                accountType) {
          this.accountType = accountType;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount#extraParams} for
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
         * map. See {@link
         * OutboundPaymentCreateParams.DestinationPaymentMethodData.UsBankAccount#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of a Financial Connections Account to use as a payment method. */
        public Builder setFinancialConnectionsAccount(String financialConnectionsAccount) {
          this.financialConnectionsAccount = financialConnectionsAccount;
          return this;
        }

        /** Routing number of the bank account. */
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

      public enum AccountType implements ApiRequestParams.EnumParam {
        @SerializedName("checking")
        CHECKING("checking"),

        @SerializedName("savings")
        SAVINGS("savings");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AccountType(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("financial_account")
      FINANCIAL_ACCOUNT("financial_account"),

      @SerializedName("us_bank_account")
      US_BANK_ACCOUNT("us_bank_account");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DestinationPaymentMethodOptions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Optional fields for {@code us_bank_account}. */
    @SerializedName("us_bank_account")
    Object usBankAccount;

    private DestinationPaymentMethodOptions(Map<String, Object> extraParams, Object usBankAccount) {
      this.extraParams = extraParams;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.DestinationPaymentMethodOptions build() {
        return new OutboundPaymentCreateParams.DestinationPaymentMethodOptions(
            this.extraParams, this.usBankAccount);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.DestinationPaymentMethodOptions#extraParams} for the field
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
       * See {@link OutboundPaymentCreateParams.DestinationPaymentMethodOptions#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Optional fields for {@code us_bank_account}. */
      public Builder setUsBankAccount(
          OutboundPaymentCreateParams.DestinationPaymentMethodOptions.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /** Optional fields for {@code us_bank_account}. */
      public Builder setUsBankAccount(EmptyParam usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Specifies the network rails to be used. If not set, will default to the PaymentMethod's
       * preferred network. See the <a
       * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more
       * about money movement timelines for each network type.
       */
      @SerializedName("network")
      Network network;

      private UsBankAccount(Map<String, Object> extraParams, Network network) {
        this.extraParams = extraParams;
        this.network = network;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Network network;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundPaymentCreateParams.DestinationPaymentMethodOptions.UsBankAccount build() {
          return new OutboundPaymentCreateParams.DestinationPaymentMethodOptions.UsBankAccount(
              this.extraParams, this.network);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OutboundPaymentCreateParams.DestinationPaymentMethodOptions.UsBankAccount#extraParams}
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
         * OutboundPaymentCreateParams.DestinationPaymentMethodOptions.UsBankAccount#extraParams}
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
         * Specifies the network rails to be used. If not set, will default to the PaymentMethod's
         * preferred network. See the <a
         * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more
         * about money movement timelines for each network type.
         */
        public Builder setNetwork(
            OutboundPaymentCreateParams.DestinationPaymentMethodOptions.UsBankAccount.Network
                network) {
          this.network = network;
          return this;
        }
      }

      public enum Network implements ApiRequestParams.EnumParam {
        @SerializedName("ach")
        ACH("ach"),

        @SerializedName("us_domestic_wire")
        US_DOMESTIC_WIRE("us_domestic_wire");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Network(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class EndUserDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * IP address of the user initiating the OutboundPayment. Must be supplied if {@code present} is
     * set to {@code true}.
     */
    @SerializedName("ip_address")
    String ipAddress;

    /**
     * <strong>Required.</strong> {@code True} if the OutboundPayment creation request is being made
     * on behalf of an end user by a platform. Otherwise, {@code false}.
     */
    @SerializedName("present")
    Boolean present;

    private EndUserDetails(Map<String, Object> extraParams, String ipAddress, Boolean present) {
      this.extraParams = extraParams;
      this.ipAddress = ipAddress;
      this.present = present;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String ipAddress;

      private Boolean present;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentCreateParams.EndUserDetails build() {
        return new OutboundPaymentCreateParams.EndUserDetails(
            this.extraParams, this.ipAddress, this.present);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentCreateParams.EndUserDetails#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentCreateParams.EndUserDetails#extraParams} for the field
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
       * IP address of the user initiating the OutboundPayment. Must be supplied if {@code present}
       * is set to {@code true}.
       */
      public Builder setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
      }

      /**
       * <strong>Required.</strong> {@code True} if the OutboundPayment creation request is being
       * made on behalf of an end user by a platform. Otherwise, {@code false}.
       */
      public Builder setPresent(Boolean present) {
        this.present = present;
        return this;
      }
    }
  }
}
