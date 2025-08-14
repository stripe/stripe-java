// File generated from our OpenAPI spec
package com.stripe.param.v2;

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
public class AccountUpdateParams extends ApiRequestParams {
  /**
   * Configurations applied to this Account in order to allow it to be used in different product
   * flows. Currently only supports the recipient configuration.
   */
  @SerializedName("configuration")
  Configuration configuration;

  /**
   * The default contact email address for the Account. This field is optional, but must be supplied
   * before the recipient configuration can be populated.
   */
  @SerializedName("email")
  Object email;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Closed Enum. Additional fields to include in the response. Currently supports {@code
   * configuration.recipient_data}, {@code legal_entity_data}, {@code requirements}, and {@code
   * supportable_features.recipient_data}.
   */
  @SerializedName("include")
  List<AccountUpdateParams.Include> include;

  /**
   * Information about the company or individual that this Account represents. Stripe may require
   * Legal Entity information in order to enable Features requested on the Account.
   */
  @SerializedName("legal_entity_data")
  LegalEntityData legalEntityData;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /**
   * A descriptive name for the Account. This name will be surfaced in the Account directory in the
   * dashboard.
   */
  @SerializedName("name")
  Object name;

  private AccountUpdateParams(
      Configuration configuration,
      Object email,
      Map<String, Object> extraParams,
      List<AccountUpdateParams.Include> include,
      LegalEntityData legalEntityData,
      Map<String, Object> metadata,
      Object name) {
    this.configuration = configuration;
    this.email = email;
    this.extraParams = extraParams;
    this.include = include;
    this.legalEntityData = legalEntityData;
    this.metadata = metadata;
    this.name = name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Configuration configuration;

    private Object email;

    private Map<String, Object> extraParams;

    private List<AccountUpdateParams.Include> include;

    private LegalEntityData legalEntityData;

    private Map<String, Object> metadata;

    private Object name;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountUpdateParams build() {
      return new AccountUpdateParams(
          this.configuration,
          this.email,
          this.extraParams,
          this.include,
          this.legalEntityData,
          this.metadata,
          this.name);
    }

    /**
     * Configurations applied to this Account in order to allow it to be used in different product
     * flows. Currently only supports the recipient configuration.
     */
    public Builder setConfiguration(AccountUpdateParams.Configuration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * The default contact email address for the Account. This field is optional, but must be
     * supplied before the recipient configuration can be populated.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * The default contact email address for the Account. This field is optional, but must be
     * supplied before the recipient configuration can be populated.
     */
    public Builder setEmail(EmptyParam email) {
      this.email = email;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link AccountUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateParams#include} for the field documentation.
     */
    public Builder addInclude(AccountUpdateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<AccountUpdateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Information about the company or individual that this Account represents. Stripe may require
     * Legal Entity information in order to enable Features requested on the Account.
     */
    public Builder setLegalEntityData(AccountUpdateParams.LegalEntityData legalEntityData) {
      this.legalEntityData = legalEntityData;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * A descriptive name for the Account. This name will be surfaced in the Account directory in
     * the dashboard.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * A descriptive name for the Account. This name will be surfaced in the Account directory in
     * the dashboard.
     */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Configuration {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Configuration to enable this Account to be used as a recipient of an OutboundPayment via the
     * OutboundPayments API, or via the dashboard.
     */
    @SerializedName("recipient_data")
    RecipientData recipientData;

    private Configuration(Map<String, Object> extraParams, RecipientData recipientData) {
      this.extraParams = extraParams;
      this.recipientData = recipientData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private RecipientData recipientData;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Configuration build() {
        return new AccountUpdateParams.Configuration(this.extraParams, this.recipientData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Configuration#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Configuration#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Configuration to enable this Account to be used as a recipient of an OutboundPayment via
       * the OutboundPayments API, or via the dashboard.
       */
      public Builder setRecipientData(
          AccountUpdateParams.Configuration.RecipientData recipientData) {
        this.recipientData = recipientData;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RecipientData {
      /**
       * The payout method id to be used as a default outbound destination. This will allow the
       * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
       * dashboard. Can also be explicitly set to {@code null} to clear the existing default
       * outbound destination.
       */
      @SerializedName("default_outbound_destination")
      Object defaultOutboundDestination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Features representing the functionality that should be enabled for when this Account is
       * used as a recipient. Features need to be explicitly requested, and the {@code status} field
       * indicates if the Feature is {@code active}, {@code restricted} or {@code pending}. Once a
       * Feature is {@code active}, the Account can be used with the product flow that the Feature
       * enables.
       */
      @SerializedName("features")
      Features features;

      private RecipientData(
          Object defaultOutboundDestination, Map<String, Object> extraParams, Features features) {
        this.defaultOutboundDestination = defaultOutboundDestination;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object defaultOutboundDestination;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Configuration.RecipientData build() {
          return new AccountUpdateParams.Configuration.RecipientData(
              this.defaultOutboundDestination, this.extraParams, this.features);
        }

        /**
         * The payout method id to be used as a default outbound destination. This will allow the
         * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
         * dashboard. Can also be explicitly set to {@code null} to clear the existing default
         * outbound destination.
         */
        public Builder setDefaultOutboundDestination(String defaultOutboundDestination) {
          this.defaultOutboundDestination = defaultOutboundDestination;
          return this;
        }

        /**
         * The payout method id to be used as a default outbound destination. This will allow the
         * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
         * dashboard. Can also be explicitly set to {@code null} to clear the existing default
         * outbound destination.
         */
        public Builder setDefaultOutboundDestination(EmptyParam defaultOutboundDestination) {
          this.defaultOutboundDestination = defaultOutboundDestination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Configuration.RecipientData#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Configuration.RecipientData#extraParams} for the
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
         * Features representing the functionality that should be enabled for when this Account is
         * used as a recipient. Features need to be explicitly requested, and the {@code status}
         * field indicates if the Feature is {@code active}, {@code restricted} or {@code pending}.
         * Once a Feature is {@code active}, the Account can be used with the product flow that the
         * Feature enables.
         */
        public Builder setFeatures(
            AccountUpdateParams.Configuration.RecipientData.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /** Features that enable OutboundPayments to a bank account linked to this Account. */
        @SerializedName("bank_accounts")
        BankAccounts bankAccounts;

        /** Feature that enable OutboundPayments to a debit card linked to this Account. */
        @SerializedName("cards")
        Cards cards;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(BankAccounts bankAccounts, Cards cards, Map<String, Object> extraParams) {
          this.bankAccounts = bankAccounts;
          this.cards = cards;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BankAccounts bankAccounts;

          private Cards cards;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.RecipientData.Features build() {
            return new AccountUpdateParams.Configuration.RecipientData.Features(
                this.bankAccounts, this.cards, this.extraParams);
          }

          /** Features that enable OutboundPayments to a bank account linked to this Account. */
          public Builder setBankAccounts(
              AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts bankAccounts) {
            this.bankAccounts = bankAccounts;
            return this;
          }

          /** Feature that enable OutboundPayments to a debit card linked to this Account. */
          public Builder setCards(
              AccountUpdateParams.Configuration.RecipientData.Features.Cards cards) {
            this.cards = cards;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.RecipientData.Features#extraParams}
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
           * map. See {@link AccountUpdateParams.Configuration.RecipientData.Features#extraParams}
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

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BankAccounts {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Enables this Account to receive OutboundPayments to linked bank accounts over local
           * networks.
           */
          @SerializedName("local")
          Local local;

          /** Enables this Account to receive OutboundPayments to linked bank accounts over wire. */
          @SerializedName("wire")
          Wire wire;

          private BankAccounts(Map<String, Object> extraParams, Local local, Wire wire) {
            this.extraParams = extraParams;
            this.local = local;
            this.wire = wire;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Local local;

            private Wire wire;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts build() {
              return new AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts(
                  this.extraParams, this.local, this.wire);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts#extraParams}
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
             * Enables this Account to receive OutboundPayments to linked bank accounts over local
             * networks.
             */
            public Builder setLocal(
                AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Local local) {
              this.local = local;
              return this;
            }

            /**
             * Enables this Account to receive OutboundPayments to linked bank accounts over wire.
             */
            public Builder setWire(
                AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Wire wire) {
              this.wire = wire;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Local {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Whether or not to request the Feature. */
            @SerializedName("requested")
            Boolean requested;

            private Local(Map<String, Object> extraParams, Boolean requested) {
              this.extraParams = extraParams;
              this.requested = requested;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Boolean requested;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Local
                  build() {
                return new AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts
                    .Local(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Local#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Local#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Whether or not to request the Feature. */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Wire {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Whether or not to request the Feature. */
            @SerializedName("requested")
            Boolean requested;

            private Wire(Map<String, Object> extraParams, Boolean requested) {
              this.extraParams = extraParams;
              this.requested = requested;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Boolean requested;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Wire
                  build() {
                return new AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts
                    .Wire(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Wire#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.RecipientData.Features.BankAccounts.Wire#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Whether or not to request the Feature. */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Cards {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Whether or not to request the Feature. */
          @SerializedName("requested")
          Boolean requested;

          private Cards(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.RecipientData.Features.Cards build() {
              return new AccountUpdateParams.Configuration.RecipientData.Features.Cards(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.RecipientData.Features.Cards#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.RecipientData.Features.Cards#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Whether or not to request the Feature. */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LegalEntityData {
    /** The address of the Legal Entity. */
    @SerializedName("address")
    Object address;

    /** Closed Enum. The business type of the Legal Entity. */
    @SerializedName("business_type")
    ApiRequestParams.EnumParam businessType;

    /**
     * Open Enum. Two-letter country code (ISO 3166-1 alpha-2) for where the company or individual
     * is located.
     */
    @SerializedName("country")
    ApiRequestParams.EnumParam country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The legal name of this Legal Entity. Required unless the business type is {@code individual}.
     */
    @SerializedName("name")
    Object name;

    /**
     * The representative of the Legal Entity. This is the person nominated by the Legal Entity to
     * provide information about themselves, and general information about the account. For legal
     * entities with {@code individual} business type, this field is required and should contain the
     * individual's information.
     */
    @SerializedName("representative")
    Object representative;

    private LegalEntityData(
        Object address,
        ApiRequestParams.EnumParam businessType,
        ApiRequestParams.EnumParam country,
        Map<String, Object> extraParams,
        Object name,
        Object representative) {
      this.address = address;
      this.businessType = businessType;
      this.country = country;
      this.extraParams = extraParams;
      this.name = name;
      this.representative = representative;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object address;

      private ApiRequestParams.EnumParam businessType;

      private ApiRequestParams.EnumParam country;

      private Map<String, Object> extraParams;

      private Object name;

      private Object representative;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.LegalEntityData build() {
        return new AccountUpdateParams.LegalEntityData(
            this.address,
            this.businessType,
            this.country,
            this.extraParams,
            this.name,
            this.representative);
      }

      /** The address of the Legal Entity. */
      public Builder setAddress(AccountUpdateParams.LegalEntityData.Address address) {
        this.address = address;
        return this;
      }

      /** The address of the Legal Entity. */
      public Builder setAddress(EmptyParam address) {
        this.address = address;
        return this;
      }

      /** Closed Enum. The business type of the Legal Entity. */
      public Builder setBusinessType(
          AccountUpdateParams.LegalEntityData.BusinessType businessType) {
        this.businessType = businessType;
        return this;
      }

      /** Closed Enum. The business type of the Legal Entity. */
      public Builder setBusinessType(EmptyParam businessType) {
        this.businessType = businessType;
        return this;
      }

      /**
       * Open Enum. Two-letter country code (ISO 3166-1 alpha-2) for where the company or individual
       * is located.
       */
      public Builder setCountry(AccountUpdateParams.LegalEntityData.Country country) {
        this.country = country;
        return this;
      }

      /**
       * Open Enum. Two-letter country code (ISO 3166-1 alpha-2) for where the company or individual
       * is located.
       */
      public Builder setCountry(EmptyParam country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.LegalEntityData#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.LegalEntityData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The legal name of this Legal Entity. Required unless the business type is {@code
       * individual}.
       */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * The legal name of this Legal Entity. Required unless the business type is {@code
       * individual}.
       */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /**
       * The representative of the Legal Entity. This is the person nominated by the Legal Entity to
       * provide information about themselves, and general information about the account. For legal
       * entities with {@code individual} business type, this field is required and should contain
       * the individual's information.
       */
      public Builder setRepresentative(
          AccountUpdateParams.LegalEntityData.Representative representative) {
        this.representative = representative;
        return this;
      }

      /**
       * The representative of the Legal Entity. This is the person nominated by the Legal Entity to
       * provide information about themselves, and general information about the account. For legal
       * entities with {@code individual} business type, this field is required and should contain
       * the individual's information.
       */
      public Builder setRepresentative(EmptyParam representative) {
        this.representative = representative;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** City. */
      @SerializedName("city")
      Object city;

      /** Open Enum. Two-letter country code. */
      @SerializedName("country")
      ApiRequestParams.EnumParam country;

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

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      /** Town. */
      @SerializedName("town")
      Object town;

      private Address(
          Object city,
          ApiRequestParams.EnumParam country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state,
          Object town) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
        this.town = town;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object city;

        private ApiRequestParams.EnumParam country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        private Object town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.LegalEntityData.Address build() {
          return new AccountUpdateParams.LegalEntityData.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
        }

        /** City. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** City. */
        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        /** Open Enum. Two-letter country code. */
        public Builder setCountry(AccountUpdateParams.LegalEntityData.Address.Country country) {
          this.country = country;
          return this;
        }

        /** Open Enum. Two-letter country code. */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.LegalEntityData.Address#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.LegalEntityData.Address#extraParams} for the field
         * documentation.
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

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }

        /** Town. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }

        /** Town. */
        public Builder setTown(EmptyParam town) {
          this.town = town;
          return this;
        }
      }

      public enum Country implements ApiRequestParams.EnumParam {
        @SerializedName("ad")
        AD("ad"),

        @SerializedName("ae")
        AE("ae"),

        @SerializedName("af")
        AF("af"),

        @SerializedName("ag")
        AG("ag"),

        @SerializedName("ai")
        AI("ai"),

        @SerializedName("al")
        AL("al"),

        @SerializedName("am")
        AM("am"),

        @SerializedName("ao")
        AO("ao"),

        @SerializedName("aq")
        AQ("aq"),

        @SerializedName("ar")
        AR("ar"),

        @SerializedName("as")
        AS("as"),

        @SerializedName("at")
        AT("at"),

        @SerializedName("au")
        AU("au"),

        @SerializedName("aw")
        AW("aw"),

        @SerializedName("ax")
        AX("ax"),

        @SerializedName("az")
        AZ("az"),

        @SerializedName("ba")
        BA("ba"),

        @SerializedName("bb")
        BB("bb"),

        @SerializedName("bd")
        BD("bd"),

        @SerializedName("be")
        BE("be"),

        @SerializedName("bf")
        BF("bf"),

        @SerializedName("bg")
        BG("bg"),

        @SerializedName("bh")
        BH("bh"),

        @SerializedName("bi")
        BI("bi"),

        @SerializedName("bj")
        BJ("bj"),

        @SerializedName("bl")
        BL("bl"),

        @SerializedName("bm")
        BM("bm"),

        @SerializedName("bn")
        BN("bn"),

        @SerializedName("bo")
        BO("bo"),

        @SerializedName("bq")
        BQ("bq"),

        @SerializedName("br")
        BR("br"),

        @SerializedName("bs")
        BS("bs"),

        @SerializedName("bt")
        BT("bt"),

        @SerializedName("bv")
        BV("bv"),

        @SerializedName("bw")
        BW("bw"),

        @SerializedName("by")
        BY("by"),

        @SerializedName("bz")
        BZ("bz"),

        @SerializedName("ca")
        CA("ca"),

        @SerializedName("cc")
        CC("cc"),

        @SerializedName("cd")
        CD("cd"),

        @SerializedName("cf")
        CF("cf"),

        @SerializedName("cg")
        CG("cg"),

        @SerializedName("ch")
        CH("ch"),

        @SerializedName("ci")
        CI("ci"),

        @SerializedName("ck")
        CK("ck"),

        @SerializedName("cl")
        CL("cl"),

        @SerializedName("cm")
        CM("cm"),

        @SerializedName("cn")
        CN("cn"),

        @SerializedName("co")
        CO("co"),

        @SerializedName("cr")
        CR("cr"),

        @SerializedName("cu")
        CU("cu"),

        @SerializedName("cv")
        CV("cv"),

        @SerializedName("cw")
        CW("cw"),

        @SerializedName("cx")
        CX("cx"),

        @SerializedName("cy")
        CY("cy"),

        @SerializedName("cz")
        CZ("cz"),

        @SerializedName("de")
        DE("de"),

        @SerializedName("dj")
        DJ("dj"),

        @SerializedName("dk")
        DK("dk"),

        @SerializedName("dm")
        DM("dm"),

        @SerializedName("do")
        DO("do"),

        @SerializedName("dz")
        DZ("dz"),

        @SerializedName("ec")
        EC("ec"),

        @SerializedName("ee")
        EE("ee"),

        @SerializedName("eg")
        EG("eg"),

        @SerializedName("eh")
        EH("eh"),

        @SerializedName("er")
        ER("er"),

        @SerializedName("es")
        ES("es"),

        @SerializedName("et")
        ET("et"),

        @SerializedName("fi")
        FI("fi"),

        @SerializedName("fj")
        FJ("fj"),

        @SerializedName("fk")
        FK("fk"),

        @SerializedName("fm")
        FM("fm"),

        @SerializedName("fo")
        FO("fo"),

        @SerializedName("fr")
        FR("fr"),

        @SerializedName("ga")
        GA("ga"),

        @SerializedName("gb")
        GB("gb"),

        @SerializedName("gd")
        GD("gd"),

        @SerializedName("ge")
        GE("ge"),

        @SerializedName("gf")
        GF("gf"),

        @SerializedName("gg")
        GG("gg"),

        @SerializedName("gh")
        GH("gh"),

        @SerializedName("gi")
        GI("gi"),

        @SerializedName("gl")
        GL("gl"),

        @SerializedName("gm")
        GM("gm"),

        @SerializedName("gn")
        GN("gn"),

        @SerializedName("gp")
        GP("gp"),

        @SerializedName("gq")
        GQ("gq"),

        @SerializedName("gr")
        GR("gr"),

        @SerializedName("gs")
        GS("gs"),

        @SerializedName("gt")
        GT("gt"),

        @SerializedName("gu")
        GU("gu"),

        @SerializedName("gw")
        GW("gw"),

        @SerializedName("gy")
        GY("gy"),

        @SerializedName("hk")
        HK("hk"),

        @SerializedName("hm")
        HM("hm"),

        @SerializedName("hn")
        HN("hn"),

        @SerializedName("hr")
        HR("hr"),

        @SerializedName("ht")
        HT("ht"),

        @SerializedName("hu")
        HU("hu"),

        @SerializedName("id")
        ID("id"),

        @SerializedName("ie")
        IE("ie"),

        @SerializedName("il")
        IL("il"),

        @SerializedName("im")
        IM("im"),

        @SerializedName("in")
        IN("in"),

        @SerializedName("io")
        IO("io"),

        @SerializedName("iq")
        IQ("iq"),

        @SerializedName("ir")
        IR("ir"),

        @SerializedName("is")
        IS("is"),

        @SerializedName("it")
        IT("it"),

        @SerializedName("je")
        JE("je"),

        @SerializedName("jm")
        JM("jm"),

        @SerializedName("jo")
        JO("jo"),

        @SerializedName("jp")
        JP("jp"),

        @SerializedName("ke")
        KE("ke"),

        @SerializedName("kg")
        KG("kg"),

        @SerializedName("kh")
        KH("kh"),

        @SerializedName("ki")
        KI("ki"),

        @SerializedName("km")
        KM("km"),

        @SerializedName("kn")
        KN("kn"),

        @SerializedName("kp")
        KP("kp"),

        @SerializedName("kr")
        KR("kr"),

        @SerializedName("kw")
        KW("kw"),

        @SerializedName("ky")
        KY("ky"),

        @SerializedName("kz")
        KZ("kz"),

        @SerializedName("la")
        LA("la"),

        @SerializedName("lb")
        LB("lb"),

        @SerializedName("lc")
        LC("lc"),

        @SerializedName("li")
        LI("li"),

        @SerializedName("lk")
        LK("lk"),

        @SerializedName("lr")
        LR("lr"),

        @SerializedName("ls")
        LS("ls"),

        @SerializedName("lt")
        LT("lt"),

        @SerializedName("lu")
        LU("lu"),

        @SerializedName("lv")
        LV("lv"),

        @SerializedName("ly")
        LY("ly"),

        @SerializedName("ma")
        MA("ma"),

        @SerializedName("mc")
        MC("mc"),

        @SerializedName("md")
        MD("md"),

        @SerializedName("me")
        ME("me"),

        @SerializedName("mf")
        MF("mf"),

        @SerializedName("mg")
        MG("mg"),

        @SerializedName("mh")
        MH("mh"),

        @SerializedName("mk")
        MK("mk"),

        @SerializedName("ml")
        ML("ml"),

        @SerializedName("mm")
        MM("mm"),

        @SerializedName("mn")
        MN("mn"),

        @SerializedName("mo")
        MO("mo"),

        @SerializedName("mp")
        MP("mp"),

        @SerializedName("mq")
        MQ("mq"),

        @SerializedName("mr")
        MR("mr"),

        @SerializedName("ms")
        MS("ms"),

        @SerializedName("mt")
        MT("mt"),

        @SerializedName("mu")
        MU("mu"),

        @SerializedName("mv")
        MV("mv"),

        @SerializedName("mw")
        MW("mw"),

        @SerializedName("mx")
        MX("mx"),

        @SerializedName("my")
        MY("my"),

        @SerializedName("mz")
        MZ("mz"),

        @SerializedName("na")
        NA("na"),

        @SerializedName("nc")
        NC("nc"),

        @SerializedName("ne")
        NE("ne"),

        @SerializedName("nf")
        NF("nf"),

        @SerializedName("ng")
        NG("ng"),

        @SerializedName("ni")
        NI("ni"),

        @SerializedName("nl")
        NL("nl"),

        @SerializedName("no")
        NO("no"),

        @SerializedName("np")
        NP("np"),

        @SerializedName("nr")
        NR("nr"),

        @SerializedName("nu")
        NU("nu"),

        @SerializedName("nz")
        NZ("nz"),

        @SerializedName("om")
        OM("om"),

        @SerializedName("pa")
        PA("pa"),

        @SerializedName("pe")
        PE("pe"),

        @SerializedName("pf")
        PF("pf"),

        @SerializedName("pg")
        PG("pg"),

        @SerializedName("ph")
        PH("ph"),

        @SerializedName("pk")
        PK("pk"),

        @SerializedName("pl")
        PL("pl"),

        @SerializedName("pm")
        PM("pm"),

        @SerializedName("pn")
        PN("pn"),

        @SerializedName("pr")
        PR("pr"),

        @SerializedName("ps")
        PS("ps"),

        @SerializedName("pt")
        PT("pt"),

        @SerializedName("pw")
        PW("pw"),

        @SerializedName("py")
        PY("py"),

        @SerializedName("qa")
        QA("qa"),

        @SerializedName("qz")
        QZ("qz"),

        @SerializedName("re")
        RE("re"),

        @SerializedName("ro")
        RO("ro"),

        @SerializedName("rs")
        RS("rs"),

        @SerializedName("ru")
        RU("ru"),

        @SerializedName("rw")
        RW("rw"),

        @SerializedName("sa")
        SA("sa"),

        @SerializedName("sb")
        SB("sb"),

        @SerializedName("sc")
        SC("sc"),

        @SerializedName("sd")
        SD("sd"),

        @SerializedName("se")
        SE("se"),

        @SerializedName("sg")
        SG("sg"),

        @SerializedName("sh")
        SH("sh"),

        @SerializedName("si")
        SI("si"),

        @SerializedName("sj")
        SJ("sj"),

        @SerializedName("sk")
        SK("sk"),

        @SerializedName("sl")
        SL("sl"),

        @SerializedName("sm")
        SM("sm"),

        @SerializedName("sn")
        SN("sn"),

        @SerializedName("so")
        SO("so"),

        @SerializedName("sr")
        SR("sr"),

        @SerializedName("ss")
        SS("ss"),

        @SerializedName("st")
        ST("st"),

        @SerializedName("sv")
        SV("sv"),

        @SerializedName("sx")
        SX("sx"),

        @SerializedName("sy")
        SY("sy"),

        @SerializedName("sz")
        SZ("sz"),

        @SerializedName("tc")
        TC("tc"),

        @SerializedName("td")
        TD("td"),

        @SerializedName("tf")
        TF("tf"),

        @SerializedName("tg")
        TG("tg"),

        @SerializedName("th")
        TH("th"),

        @SerializedName("tj")
        TJ("tj"),

        @SerializedName("tk")
        TK("tk"),

        @SerializedName("tl")
        TL("tl"),

        @SerializedName("tm")
        TM("tm"),

        @SerializedName("tn")
        TN("tn"),

        @SerializedName("to")
        TO("to"),

        @SerializedName("tr")
        TR("tr"),

        @SerializedName("tt")
        TT("tt"),

        @SerializedName("tv")
        TV("tv"),

        @SerializedName("tw")
        TW("tw"),

        @SerializedName("tz")
        TZ("tz"),

        @SerializedName("ua")
        UA("ua"),

        @SerializedName("ug")
        UG("ug"),

        @SerializedName("um")
        UM("um"),

        @SerializedName("us")
        US("us"),

        @SerializedName("uy")
        UY("uy"),

        @SerializedName("uz")
        UZ("uz"),

        @SerializedName("va")
        VA("va"),

        @SerializedName("vc")
        VC("vc"),

        @SerializedName("ve")
        VE("ve"),

        @SerializedName("vg")
        VG("vg"),

        @SerializedName("vi")
        VI("vi"),

        @SerializedName("vn")
        VN("vn"),

        @SerializedName("vu")
        VU("vu"),

        @SerializedName("wf")
        WF("wf"),

        @SerializedName("ws")
        WS("ws"),

        @SerializedName("xx")
        XX("xx"),

        @SerializedName("ye")
        YE("ye"),

        @SerializedName("yt")
        YT("yt"),

        @SerializedName("za")
        ZA("za"),

        @SerializedName("zm")
        ZM("zm"),

        @SerializedName("zw")
        ZW("zw");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Country(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Representative {
      /** The address of the representative. */
      @SerializedName("address")
      Object address;

      /** The date of birth of the representative. */
      @SerializedName("dob")
      Object dob;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The given name of the representative. */
      @SerializedName("given_name")
      Object givenName;

      /** The surname of the representative. */
      @SerializedName("surname")
      Object surname;

      private Representative(
          Object address,
          Object dob,
          Map<String, Object> extraParams,
          Object givenName,
          Object surname) {
        this.address = address;
        this.dob = dob;
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object address;

        private Object dob;

        private Map<String, Object> extraParams;

        private Object givenName;

        private Object surname;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.LegalEntityData.Representative build() {
          return new AccountUpdateParams.LegalEntityData.Representative(
              this.address, this.dob, this.extraParams, this.givenName, this.surname);
        }

        /** The address of the representative. */
        public Builder setAddress(
            AccountUpdateParams.LegalEntityData.Representative.Address address) {
          this.address = address;
          return this;
        }

        /** The address of the representative. */
        public Builder setAddress(EmptyParam address) {
          this.address = address;
          return this;
        }

        /** The date of birth of the representative. */
        public Builder setDob(AccountUpdateParams.LegalEntityData.Representative.Dob dob) {
          this.dob = dob;
          return this;
        }

        /** The date of birth of the representative. */
        public Builder setDob(EmptyParam dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.LegalEntityData.Representative#extraParams} for the
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
         * map. See {@link AccountUpdateParams.LegalEntityData.Representative#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The given name of the representative. */
        public Builder setGivenName(String givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The given name of the representative. */
        public Builder setGivenName(EmptyParam givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The surname of the representative. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }

        /** The surname of the representative. */
        public Builder setSurname(EmptyParam surname) {
          this.surname = surname;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City. */
        @SerializedName("city")
        Object city;

        /** Open Enum. Two-letter country code. */
        @SerializedName("country")
        ApiRequestParams.EnumParam country;

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
        Object line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        /** Town. */
        @SerializedName("town")
        Object town;

        private Address(
            Object city,
            ApiRequestParams.EnumParam country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state,
            Object town) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
          this.town = town;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object city;

          private ApiRequestParams.EnumParam country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          private Object town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.LegalEntityData.Representative.Address build() {
            return new AccountUpdateParams.LegalEntityData.Representative.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state,
                this.town);
          }

          /** City. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /** City. */
          public Builder setCity(EmptyParam city) {
            this.city = city;
            return this;
          }

          /** Open Enum. Two-letter country code. */
          public Builder setCountry(
              AccountUpdateParams.LegalEntityData.Representative.Address.Country country) {
            this.country = country;
            return this;
          }

          /** Open Enum. Two-letter country code. */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.LegalEntityData.Representative.Address#extraParams}
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
           * map. See {@link AccountUpdateParams.LegalEntityData.Representative.Address#extraParams}
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

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(EmptyParam state) {
            this.state = state;
            return this;
          }

          /** Town. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }

          /** Town. */
          public Builder setTown(EmptyParam town) {
            this.town = town;
            return this;
          }
        }

        public enum Country implements ApiRequestParams.EnumParam {
          @SerializedName("ad")
          AD("ad"),

          @SerializedName("ae")
          AE("ae"),

          @SerializedName("af")
          AF("af"),

          @SerializedName("ag")
          AG("ag"),

          @SerializedName("ai")
          AI("ai"),

          @SerializedName("al")
          AL("al"),

          @SerializedName("am")
          AM("am"),

          @SerializedName("ao")
          AO("ao"),

          @SerializedName("aq")
          AQ("aq"),

          @SerializedName("ar")
          AR("ar"),

          @SerializedName("as")
          AS("as"),

          @SerializedName("at")
          AT("at"),

          @SerializedName("au")
          AU("au"),

          @SerializedName("aw")
          AW("aw"),

          @SerializedName("ax")
          AX("ax"),

          @SerializedName("az")
          AZ("az"),

          @SerializedName("ba")
          BA("ba"),

          @SerializedName("bb")
          BB("bb"),

          @SerializedName("bd")
          BD("bd"),

          @SerializedName("be")
          BE("be"),

          @SerializedName("bf")
          BF("bf"),

          @SerializedName("bg")
          BG("bg"),

          @SerializedName("bh")
          BH("bh"),

          @SerializedName("bi")
          BI("bi"),

          @SerializedName("bj")
          BJ("bj"),

          @SerializedName("bl")
          BL("bl"),

          @SerializedName("bm")
          BM("bm"),

          @SerializedName("bn")
          BN("bn"),

          @SerializedName("bo")
          BO("bo"),

          @SerializedName("bq")
          BQ("bq"),

          @SerializedName("br")
          BR("br"),

          @SerializedName("bs")
          BS("bs"),

          @SerializedName("bt")
          BT("bt"),

          @SerializedName("bv")
          BV("bv"),

          @SerializedName("bw")
          BW("bw"),

          @SerializedName("by")
          BY("by"),

          @SerializedName("bz")
          BZ("bz"),

          @SerializedName("ca")
          CA("ca"),

          @SerializedName("cc")
          CC("cc"),

          @SerializedName("cd")
          CD("cd"),

          @SerializedName("cf")
          CF("cf"),

          @SerializedName("cg")
          CG("cg"),

          @SerializedName("ch")
          CH("ch"),

          @SerializedName("ci")
          CI("ci"),

          @SerializedName("ck")
          CK("ck"),

          @SerializedName("cl")
          CL("cl"),

          @SerializedName("cm")
          CM("cm"),

          @SerializedName("cn")
          CN("cn"),

          @SerializedName("co")
          CO("co"),

          @SerializedName("cr")
          CR("cr"),

          @SerializedName("cu")
          CU("cu"),

          @SerializedName("cv")
          CV("cv"),

          @SerializedName("cw")
          CW("cw"),

          @SerializedName("cx")
          CX("cx"),

          @SerializedName("cy")
          CY("cy"),

          @SerializedName("cz")
          CZ("cz"),

          @SerializedName("de")
          DE("de"),

          @SerializedName("dj")
          DJ("dj"),

          @SerializedName("dk")
          DK("dk"),

          @SerializedName("dm")
          DM("dm"),

          @SerializedName("do")
          DO("do"),

          @SerializedName("dz")
          DZ("dz"),

          @SerializedName("ec")
          EC("ec"),

          @SerializedName("ee")
          EE("ee"),

          @SerializedName("eg")
          EG("eg"),

          @SerializedName("eh")
          EH("eh"),

          @SerializedName("er")
          ER("er"),

          @SerializedName("es")
          ES("es"),

          @SerializedName("et")
          ET("et"),

          @SerializedName("fi")
          FI("fi"),

          @SerializedName("fj")
          FJ("fj"),

          @SerializedName("fk")
          FK("fk"),

          @SerializedName("fm")
          FM("fm"),

          @SerializedName("fo")
          FO("fo"),

          @SerializedName("fr")
          FR("fr"),

          @SerializedName("ga")
          GA("ga"),

          @SerializedName("gb")
          GB("gb"),

          @SerializedName("gd")
          GD("gd"),

          @SerializedName("ge")
          GE("ge"),

          @SerializedName("gf")
          GF("gf"),

          @SerializedName("gg")
          GG("gg"),

          @SerializedName("gh")
          GH("gh"),

          @SerializedName("gi")
          GI("gi"),

          @SerializedName("gl")
          GL("gl"),

          @SerializedName("gm")
          GM("gm"),

          @SerializedName("gn")
          GN("gn"),

          @SerializedName("gp")
          GP("gp"),

          @SerializedName("gq")
          GQ("gq"),

          @SerializedName("gr")
          GR("gr"),

          @SerializedName("gs")
          GS("gs"),

          @SerializedName("gt")
          GT("gt"),

          @SerializedName("gu")
          GU("gu"),

          @SerializedName("gw")
          GW("gw"),

          @SerializedName("gy")
          GY("gy"),

          @SerializedName("hk")
          HK("hk"),

          @SerializedName("hm")
          HM("hm"),

          @SerializedName("hn")
          HN("hn"),

          @SerializedName("hr")
          HR("hr"),

          @SerializedName("ht")
          HT("ht"),

          @SerializedName("hu")
          HU("hu"),

          @SerializedName("id")
          ID("id"),

          @SerializedName("ie")
          IE("ie"),

          @SerializedName("il")
          IL("il"),

          @SerializedName("im")
          IM("im"),

          @SerializedName("in")
          IN("in"),

          @SerializedName("io")
          IO("io"),

          @SerializedName("iq")
          IQ("iq"),

          @SerializedName("ir")
          IR("ir"),

          @SerializedName("is")
          IS("is"),

          @SerializedName("it")
          IT("it"),

          @SerializedName("je")
          JE("je"),

          @SerializedName("jm")
          JM("jm"),

          @SerializedName("jo")
          JO("jo"),

          @SerializedName("jp")
          JP("jp"),

          @SerializedName("ke")
          KE("ke"),

          @SerializedName("kg")
          KG("kg"),

          @SerializedName("kh")
          KH("kh"),

          @SerializedName("ki")
          KI("ki"),

          @SerializedName("km")
          KM("km"),

          @SerializedName("kn")
          KN("kn"),

          @SerializedName("kp")
          KP("kp"),

          @SerializedName("kr")
          KR("kr"),

          @SerializedName("kw")
          KW("kw"),

          @SerializedName("ky")
          KY("ky"),

          @SerializedName("kz")
          KZ("kz"),

          @SerializedName("la")
          LA("la"),

          @SerializedName("lb")
          LB("lb"),

          @SerializedName("lc")
          LC("lc"),

          @SerializedName("li")
          LI("li"),

          @SerializedName("lk")
          LK("lk"),

          @SerializedName("lr")
          LR("lr"),

          @SerializedName("ls")
          LS("ls"),

          @SerializedName("lt")
          LT("lt"),

          @SerializedName("lu")
          LU("lu"),

          @SerializedName("lv")
          LV("lv"),

          @SerializedName("ly")
          LY("ly"),

          @SerializedName("ma")
          MA("ma"),

          @SerializedName("mc")
          MC("mc"),

          @SerializedName("md")
          MD("md"),

          @SerializedName("me")
          ME("me"),

          @SerializedName("mf")
          MF("mf"),

          @SerializedName("mg")
          MG("mg"),

          @SerializedName("mh")
          MH("mh"),

          @SerializedName("mk")
          MK("mk"),

          @SerializedName("ml")
          ML("ml"),

          @SerializedName("mm")
          MM("mm"),

          @SerializedName("mn")
          MN("mn"),

          @SerializedName("mo")
          MO("mo"),

          @SerializedName("mp")
          MP("mp"),

          @SerializedName("mq")
          MQ("mq"),

          @SerializedName("mr")
          MR("mr"),

          @SerializedName("ms")
          MS("ms"),

          @SerializedName("mt")
          MT("mt"),

          @SerializedName("mu")
          MU("mu"),

          @SerializedName("mv")
          MV("mv"),

          @SerializedName("mw")
          MW("mw"),

          @SerializedName("mx")
          MX("mx"),

          @SerializedName("my")
          MY("my"),

          @SerializedName("mz")
          MZ("mz"),

          @SerializedName("na")
          NA("na"),

          @SerializedName("nc")
          NC("nc"),

          @SerializedName("ne")
          NE("ne"),

          @SerializedName("nf")
          NF("nf"),

          @SerializedName("ng")
          NG("ng"),

          @SerializedName("ni")
          NI("ni"),

          @SerializedName("nl")
          NL("nl"),

          @SerializedName("no")
          NO("no"),

          @SerializedName("np")
          NP("np"),

          @SerializedName("nr")
          NR("nr"),

          @SerializedName("nu")
          NU("nu"),

          @SerializedName("nz")
          NZ("nz"),

          @SerializedName("om")
          OM("om"),

          @SerializedName("pa")
          PA("pa"),

          @SerializedName("pe")
          PE("pe"),

          @SerializedName("pf")
          PF("pf"),

          @SerializedName("pg")
          PG("pg"),

          @SerializedName("ph")
          PH("ph"),

          @SerializedName("pk")
          PK("pk"),

          @SerializedName("pl")
          PL("pl"),

          @SerializedName("pm")
          PM("pm"),

          @SerializedName("pn")
          PN("pn"),

          @SerializedName("pr")
          PR("pr"),

          @SerializedName("ps")
          PS("ps"),

          @SerializedName("pt")
          PT("pt"),

          @SerializedName("pw")
          PW("pw"),

          @SerializedName("py")
          PY("py"),

          @SerializedName("qa")
          QA("qa"),

          @SerializedName("qz")
          QZ("qz"),

          @SerializedName("re")
          RE("re"),

          @SerializedName("ro")
          RO("ro"),

          @SerializedName("rs")
          RS("rs"),

          @SerializedName("ru")
          RU("ru"),

          @SerializedName("rw")
          RW("rw"),

          @SerializedName("sa")
          SA("sa"),

          @SerializedName("sb")
          SB("sb"),

          @SerializedName("sc")
          SC("sc"),

          @SerializedName("sd")
          SD("sd"),

          @SerializedName("se")
          SE("se"),

          @SerializedName("sg")
          SG("sg"),

          @SerializedName("sh")
          SH("sh"),

          @SerializedName("si")
          SI("si"),

          @SerializedName("sj")
          SJ("sj"),

          @SerializedName("sk")
          SK("sk"),

          @SerializedName("sl")
          SL("sl"),

          @SerializedName("sm")
          SM("sm"),

          @SerializedName("sn")
          SN("sn"),

          @SerializedName("so")
          SO("so"),

          @SerializedName("sr")
          SR("sr"),

          @SerializedName("ss")
          SS("ss"),

          @SerializedName("st")
          ST("st"),

          @SerializedName("sv")
          SV("sv"),

          @SerializedName("sx")
          SX("sx"),

          @SerializedName("sy")
          SY("sy"),

          @SerializedName("sz")
          SZ("sz"),

          @SerializedName("tc")
          TC("tc"),

          @SerializedName("td")
          TD("td"),

          @SerializedName("tf")
          TF("tf"),

          @SerializedName("tg")
          TG("tg"),

          @SerializedName("th")
          TH("th"),

          @SerializedName("tj")
          TJ("tj"),

          @SerializedName("tk")
          TK("tk"),

          @SerializedName("tl")
          TL("tl"),

          @SerializedName("tm")
          TM("tm"),

          @SerializedName("tn")
          TN("tn"),

          @SerializedName("to")
          TO("to"),

          @SerializedName("tr")
          TR("tr"),

          @SerializedName("tt")
          TT("tt"),

          @SerializedName("tv")
          TV("tv"),

          @SerializedName("tw")
          TW("tw"),

          @SerializedName("tz")
          TZ("tz"),

          @SerializedName("ua")
          UA("ua"),

          @SerializedName("ug")
          UG("ug"),

          @SerializedName("um")
          UM("um"),

          @SerializedName("us")
          US("us"),

          @SerializedName("uy")
          UY("uy"),

          @SerializedName("uz")
          UZ("uz"),

          @SerializedName("va")
          VA("va"),

          @SerializedName("vc")
          VC("vc"),

          @SerializedName("ve")
          VE("ve"),

          @SerializedName("vg")
          VG("vg"),

          @SerializedName("vi")
          VI("vi"),

          @SerializedName("vn")
          VN("vn"),

          @SerializedName("vu")
          VU("vu"),

          @SerializedName("wf")
          WF("wf"),

          @SerializedName("ws")
          WS("ws"),

          @SerializedName("xx")
          XX("xx"),

          @SerializedName("ye")
          YE("ye"),

          @SerializedName("yt")
          YT("yt"),

          @SerializedName("za")
          ZA("za"),

          @SerializedName("zm")
          ZM("zm"),

          @SerializedName("zw")
          ZW("zw");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Country(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Dob {
        /** <strong>Required.</strong> The day of birth of the representative. */
        @SerializedName("day")
        Integer day;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The month of birth of the representative. */
        @SerializedName("month")
        Integer month;

        /** <strong>Required.</strong> The year of birth of the representative. */
        @SerializedName("year")
        Integer year;

        private Dob(Integer day, Map<String, Object> extraParams, Integer month, Integer year) {
          this.day = day;
          this.extraParams = extraParams;
          this.month = month;
          this.year = year;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Integer day;

          private Map<String, Object> extraParams;

          private Integer month;

          private Integer year;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.LegalEntityData.Representative.Dob build() {
            return new AccountUpdateParams.LegalEntityData.Representative.Dob(
                this.day, this.extraParams, this.month, this.year);
          }

          /** <strong>Required.</strong> The day of birth of the representative. */
          public Builder setDay(Integer day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.LegalEntityData.Representative.Dob#extraParams} for
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
           * map. See {@link AccountUpdateParams.LegalEntityData.Representative.Dob#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The month of birth of the representative. */
          public Builder setMonth(Integer month) {
            this.month = month;
            return this;
          }

          /** <strong>Required.</strong> The year of birth of the representative. */
          public Builder setYear(Integer year) {
            this.year = year;
            return this;
          }
        }
      }
    }

    public enum BusinessType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BusinessType(String value) {
        this.value = value;
      }
    }

    public enum Country implements ApiRequestParams.EnumParam {
      @SerializedName("ad")
      AD("ad"),

      @SerializedName("ae")
      AE("ae"),

      @SerializedName("af")
      AF("af"),

      @SerializedName("ag")
      AG("ag"),

      @SerializedName("ai")
      AI("ai"),

      @SerializedName("al")
      AL("al"),

      @SerializedName("am")
      AM("am"),

      @SerializedName("ao")
      AO("ao"),

      @SerializedName("aq")
      AQ("aq"),

      @SerializedName("ar")
      AR("ar"),

      @SerializedName("as")
      AS("as"),

      @SerializedName("at")
      AT("at"),

      @SerializedName("au")
      AU("au"),

      @SerializedName("aw")
      AW("aw"),

      @SerializedName("ax")
      AX("ax"),

      @SerializedName("az")
      AZ("az"),

      @SerializedName("ba")
      BA("ba"),

      @SerializedName("bb")
      BB("bb"),

      @SerializedName("bd")
      BD("bd"),

      @SerializedName("be")
      BE("be"),

      @SerializedName("bf")
      BF("bf"),

      @SerializedName("bg")
      BG("bg"),

      @SerializedName("bh")
      BH("bh"),

      @SerializedName("bi")
      BI("bi"),

      @SerializedName("bj")
      BJ("bj"),

      @SerializedName("bl")
      BL("bl"),

      @SerializedName("bm")
      BM("bm"),

      @SerializedName("bn")
      BN("bn"),

      @SerializedName("bo")
      BO("bo"),

      @SerializedName("bq")
      BQ("bq"),

      @SerializedName("br")
      BR("br"),

      @SerializedName("bs")
      BS("bs"),

      @SerializedName("bt")
      BT("bt"),

      @SerializedName("bv")
      BV("bv"),

      @SerializedName("bw")
      BW("bw"),

      @SerializedName("by")
      BY("by"),

      @SerializedName("bz")
      BZ("bz"),

      @SerializedName("ca")
      CA("ca"),

      @SerializedName("cc")
      CC("cc"),

      @SerializedName("cd")
      CD("cd"),

      @SerializedName("cf")
      CF("cf"),

      @SerializedName("cg")
      CG("cg"),

      @SerializedName("ch")
      CH("ch"),

      @SerializedName("ci")
      CI("ci"),

      @SerializedName("ck")
      CK("ck"),

      @SerializedName("cl")
      CL("cl"),

      @SerializedName("cm")
      CM("cm"),

      @SerializedName("cn")
      CN("cn"),

      @SerializedName("co")
      CO("co"),

      @SerializedName("cr")
      CR("cr"),

      @SerializedName("cu")
      CU("cu"),

      @SerializedName("cv")
      CV("cv"),

      @SerializedName("cw")
      CW("cw"),

      @SerializedName("cx")
      CX("cx"),

      @SerializedName("cy")
      CY("cy"),

      @SerializedName("cz")
      CZ("cz"),

      @SerializedName("de")
      DE("de"),

      @SerializedName("dj")
      DJ("dj"),

      @SerializedName("dk")
      DK("dk"),

      @SerializedName("dm")
      DM("dm"),

      @SerializedName("do")
      DO("do"),

      @SerializedName("dz")
      DZ("dz"),

      @SerializedName("ec")
      EC("ec"),

      @SerializedName("ee")
      EE("ee"),

      @SerializedName("eg")
      EG("eg"),

      @SerializedName("eh")
      EH("eh"),

      @SerializedName("er")
      ER("er"),

      @SerializedName("es")
      ES("es"),

      @SerializedName("et")
      ET("et"),

      @SerializedName("fi")
      FI("fi"),

      @SerializedName("fj")
      FJ("fj"),

      @SerializedName("fk")
      FK("fk"),

      @SerializedName("fm")
      FM("fm"),

      @SerializedName("fo")
      FO("fo"),

      @SerializedName("fr")
      FR("fr"),

      @SerializedName("ga")
      GA("ga"),

      @SerializedName("gb")
      GB("gb"),

      @SerializedName("gd")
      GD("gd"),

      @SerializedName("ge")
      GE("ge"),

      @SerializedName("gf")
      GF("gf"),

      @SerializedName("gg")
      GG("gg"),

      @SerializedName("gh")
      GH("gh"),

      @SerializedName("gi")
      GI("gi"),

      @SerializedName("gl")
      GL("gl"),

      @SerializedName("gm")
      GM("gm"),

      @SerializedName("gn")
      GN("gn"),

      @SerializedName("gp")
      GP("gp"),

      @SerializedName("gq")
      GQ("gq"),

      @SerializedName("gr")
      GR("gr"),

      @SerializedName("gs")
      GS("gs"),

      @SerializedName("gt")
      GT("gt"),

      @SerializedName("gu")
      GU("gu"),

      @SerializedName("gw")
      GW("gw"),

      @SerializedName("gy")
      GY("gy"),

      @SerializedName("hk")
      HK("hk"),

      @SerializedName("hm")
      HM("hm"),

      @SerializedName("hn")
      HN("hn"),

      @SerializedName("hr")
      HR("hr"),

      @SerializedName("ht")
      HT("ht"),

      @SerializedName("hu")
      HU("hu"),

      @SerializedName("id")
      ID("id"),

      @SerializedName("ie")
      IE("ie"),

      @SerializedName("il")
      IL("il"),

      @SerializedName("im")
      IM("im"),

      @SerializedName("in")
      IN("in"),

      @SerializedName("io")
      IO("io"),

      @SerializedName("iq")
      IQ("iq"),

      @SerializedName("ir")
      IR("ir"),

      @SerializedName("is")
      IS("is"),

      @SerializedName("it")
      IT("it"),

      @SerializedName("je")
      JE("je"),

      @SerializedName("jm")
      JM("jm"),

      @SerializedName("jo")
      JO("jo"),

      @SerializedName("jp")
      JP("jp"),

      @SerializedName("ke")
      KE("ke"),

      @SerializedName("kg")
      KG("kg"),

      @SerializedName("kh")
      KH("kh"),

      @SerializedName("ki")
      KI("ki"),

      @SerializedName("km")
      KM("km"),

      @SerializedName("kn")
      KN("kn"),

      @SerializedName("kp")
      KP("kp"),

      @SerializedName("kr")
      KR("kr"),

      @SerializedName("kw")
      KW("kw"),

      @SerializedName("ky")
      KY("ky"),

      @SerializedName("kz")
      KZ("kz"),

      @SerializedName("la")
      LA("la"),

      @SerializedName("lb")
      LB("lb"),

      @SerializedName("lc")
      LC("lc"),

      @SerializedName("li")
      LI("li"),

      @SerializedName("lk")
      LK("lk"),

      @SerializedName("lr")
      LR("lr"),

      @SerializedName("ls")
      LS("ls"),

      @SerializedName("lt")
      LT("lt"),

      @SerializedName("lu")
      LU("lu"),

      @SerializedName("lv")
      LV("lv"),

      @SerializedName("ly")
      LY("ly"),

      @SerializedName("ma")
      MA("ma"),

      @SerializedName("mc")
      MC("mc"),

      @SerializedName("md")
      MD("md"),

      @SerializedName("me")
      ME("me"),

      @SerializedName("mf")
      MF("mf"),

      @SerializedName("mg")
      MG("mg"),

      @SerializedName("mh")
      MH("mh"),

      @SerializedName("mk")
      MK("mk"),

      @SerializedName("ml")
      ML("ml"),

      @SerializedName("mm")
      MM("mm"),

      @SerializedName("mn")
      MN("mn"),

      @SerializedName("mo")
      MO("mo"),

      @SerializedName("mp")
      MP("mp"),

      @SerializedName("mq")
      MQ("mq"),

      @SerializedName("mr")
      MR("mr"),

      @SerializedName("ms")
      MS("ms"),

      @SerializedName("mt")
      MT("mt"),

      @SerializedName("mu")
      MU("mu"),

      @SerializedName("mv")
      MV("mv"),

      @SerializedName("mw")
      MW("mw"),

      @SerializedName("mx")
      MX("mx"),

      @SerializedName("my")
      MY("my"),

      @SerializedName("mz")
      MZ("mz"),

      @SerializedName("na")
      NA("na"),

      @SerializedName("nc")
      NC("nc"),

      @SerializedName("ne")
      NE("ne"),

      @SerializedName("nf")
      NF("nf"),

      @SerializedName("ng")
      NG("ng"),

      @SerializedName("ni")
      NI("ni"),

      @SerializedName("nl")
      NL("nl"),

      @SerializedName("no")
      NO("no"),

      @SerializedName("np")
      NP("np"),

      @SerializedName("nr")
      NR("nr"),

      @SerializedName("nu")
      NU("nu"),

      @SerializedName("nz")
      NZ("nz"),

      @SerializedName("om")
      OM("om"),

      @SerializedName("pa")
      PA("pa"),

      @SerializedName("pe")
      PE("pe"),

      @SerializedName("pf")
      PF("pf"),

      @SerializedName("pg")
      PG("pg"),

      @SerializedName("ph")
      PH("ph"),

      @SerializedName("pk")
      PK("pk"),

      @SerializedName("pl")
      PL("pl"),

      @SerializedName("pm")
      PM("pm"),

      @SerializedName("pn")
      PN("pn"),

      @SerializedName("pr")
      PR("pr"),

      @SerializedName("ps")
      PS("ps"),

      @SerializedName("pt")
      PT("pt"),

      @SerializedName("pw")
      PW("pw"),

      @SerializedName("py")
      PY("py"),

      @SerializedName("qa")
      QA("qa"),

      @SerializedName("qz")
      QZ("qz"),

      @SerializedName("re")
      RE("re"),

      @SerializedName("ro")
      RO("ro"),

      @SerializedName("rs")
      RS("rs"),

      @SerializedName("ru")
      RU("ru"),

      @SerializedName("rw")
      RW("rw"),

      @SerializedName("sa")
      SA("sa"),

      @SerializedName("sb")
      SB("sb"),

      @SerializedName("sc")
      SC("sc"),

      @SerializedName("sd")
      SD("sd"),

      @SerializedName("se")
      SE("se"),

      @SerializedName("sg")
      SG("sg"),

      @SerializedName("sh")
      SH("sh"),

      @SerializedName("si")
      SI("si"),

      @SerializedName("sj")
      SJ("sj"),

      @SerializedName("sk")
      SK("sk"),

      @SerializedName("sl")
      SL("sl"),

      @SerializedName("sm")
      SM("sm"),

      @SerializedName("sn")
      SN("sn"),

      @SerializedName("so")
      SO("so"),

      @SerializedName("sr")
      SR("sr"),

      @SerializedName("ss")
      SS("ss"),

      @SerializedName("st")
      ST("st"),

      @SerializedName("sv")
      SV("sv"),

      @SerializedName("sx")
      SX("sx"),

      @SerializedName("sy")
      SY("sy"),

      @SerializedName("sz")
      SZ("sz"),

      @SerializedName("tc")
      TC("tc"),

      @SerializedName("td")
      TD("td"),

      @SerializedName("tf")
      TF("tf"),

      @SerializedName("tg")
      TG("tg"),

      @SerializedName("th")
      TH("th"),

      @SerializedName("tj")
      TJ("tj"),

      @SerializedName("tk")
      TK("tk"),

      @SerializedName("tl")
      TL("tl"),

      @SerializedName("tm")
      TM("tm"),

      @SerializedName("tn")
      TN("tn"),

      @SerializedName("to")
      TO("to"),

      @SerializedName("tr")
      TR("tr"),

      @SerializedName("tt")
      TT("tt"),

      @SerializedName("tv")
      TV("tv"),

      @SerializedName("tw")
      TW("tw"),

      @SerializedName("tz")
      TZ("tz"),

      @SerializedName("ua")
      UA("ua"),

      @SerializedName("ug")
      UG("ug"),

      @SerializedName("um")
      UM("um"),

      @SerializedName("us")
      US("us"),

      @SerializedName("uy")
      UY("uy"),

      @SerializedName("uz")
      UZ("uz"),

      @SerializedName("va")
      VA("va"),

      @SerializedName("vc")
      VC("vc"),

      @SerializedName("ve")
      VE("ve"),

      @SerializedName("vg")
      VG("vg"),

      @SerializedName("vi")
      VI("vi"),

      @SerializedName("vn")
      VN("vn"),

      @SerializedName("vu")
      VU("vu"),

      @SerializedName("wf")
      WF("wf"),

      @SerializedName("ws")
      WS("ws"),

      @SerializedName("xx")
      XX("xx"),

      @SerializedName("ye")
      YE("ye"),

      @SerializedName("yt")
      YT("yt"),

      @SerializedName("za")
      ZA("za"),

      @SerializedName("zm")
      ZM("zm"),

      @SerializedName("zw")
      ZW("zw");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Country(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("configuration.recipient_data")
    CONFIGURATION__RECIPIENT_DATA("configuration.recipient_data"),

    @SerializedName("legal_entity_data")
    LEGAL_ENTITY_DATA("legal_entity_data"),

    @SerializedName("requirements")
    REQUIREMENTS("requirements"),

    @SerializedName("supportable_features.recipient_data")
    SUPPORTABLE_FEATURES__RECIPIENT_DATA("supportable_features.recipient_data");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
