// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountCreateParams extends ApiRequestParams {
  /**
   * An Account Configuration which allows the Account to take on a key persona across Stripe
   * products.
   */
  @SerializedName("configuration")
  Configuration configuration;

  /**
   * The default contact email address for the Account. Required when configuring the account as a
   * merchant or recipient.
   */
  @SerializedName("contact_email")
  String contactEmail;

  /**
   * A value indicating the Stripe dashboard this Account has access to. This will depend on which
   * configurations are enabled for this account.
   */
  @SerializedName("dashboard")
  Dashboard dashboard;

  /** Default values to be used on Account Configurations. */
  @SerializedName("defaults")
  Defaults defaults;

  /**
   * A descriptive name for the Account. This name will be surfaced in the Stripe Dashboard and on
   * any invoices sent to the Account.
   */
  @SerializedName("display_name")
  String displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Information about the company, individual, and business represented by the Account. */
  @SerializedName("identity")
  Identity identity;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<AccountCreateParams.Include> include;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private AccountCreateParams(
      Configuration configuration,
      String contactEmail,
      Dashboard dashboard,
      Defaults defaults,
      String displayName,
      Map<String, Object> extraParams,
      Identity identity,
      List<AccountCreateParams.Include> include,
      Map<String, String> metadata) {
    this.configuration = configuration;
    this.contactEmail = contactEmail;
    this.dashboard = dashboard;
    this.defaults = defaults;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.identity = identity;
    this.include = include;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Configuration configuration;

    private String contactEmail;

    private Dashboard dashboard;

    private Defaults defaults;

    private String displayName;

    private Map<String, Object> extraParams;

    private Identity identity;

    private List<AccountCreateParams.Include> include;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountCreateParams build() {
      return new AccountCreateParams(
          this.configuration,
          this.contactEmail,
          this.dashboard,
          this.defaults,
          this.displayName,
          this.extraParams,
          this.identity,
          this.include,
          this.metadata);
    }

    /**
     * An Account Configuration which allows the Account to take on a key persona across Stripe
     * products.
     */
    public Builder setConfiguration(AccountCreateParams.Configuration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * The default contact email address for the Account. Required when configuring the account as a
     * merchant or recipient.
     */
    public Builder setContactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    /**
     * A value indicating the Stripe dashboard this Account has access to. This will depend on which
     * configurations are enabled for this account.
     */
    public Builder setDashboard(AccountCreateParams.Dashboard dashboard) {
      this.dashboard = dashboard;
      return this;
    }

    /** Default values to be used on Account Configurations. */
    public Builder setDefaults(AccountCreateParams.Defaults defaults) {
      this.defaults = defaults;
      return this;
    }

    /**
     * A descriptive name for the Account. This name will be surfaced in the Stripe Dashboard and on
     * any invoices sent to the Account.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information about the company, individual, and business represented by the Account. */
    public Builder setIdentity(AccountCreateParams.Identity identity) {
      this.identity = identity;
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountCreateParams#include} for the field documentation.
     */
    public Builder addInclude(AccountCreateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountCreateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<AccountCreateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCreateParams#metadata} for the field documentation.
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
     * See {@link AccountCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Configuration {
    /** The CardCreator Configuration allows the Account to create and issue cards to users. */
    @SerializedName("card_creator")
    CardCreator cardCreator;

    /** The Customer Configuration allows the Account to be used in inbound payment flows. */
    @SerializedName("customer")
    Customer customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The Merchant configuration allows the Account to act as a connected account and collect
     * payments facilitated by a Connect platform. You can add this configuration to your connected
     * accounts only if you’ve completed onboarding as a Connect platform.
     */
    @SerializedName("merchant")
    Merchant merchant;

    /** The Recipient Configuration allows the Account to receive funds. */
    @SerializedName("recipient")
    Recipient recipient;

    /**
     * The Storer Configuration allows the Account to store and move funds using stored-value
     * FinancialAccounts.
     */
    @SerializedName("storer")
    Storer storer;

    private Configuration(
        CardCreator cardCreator,
        Customer customer,
        Map<String, Object> extraParams,
        Merchant merchant,
        Recipient recipient,
        Storer storer) {
      this.cardCreator = cardCreator;
      this.customer = customer;
      this.extraParams = extraParams;
      this.merchant = merchant;
      this.recipient = recipient;
      this.storer = storer;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CardCreator cardCreator;

      private Customer customer;

      private Map<String, Object> extraParams;

      private Merchant merchant;

      private Recipient recipient;

      private Storer storer;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Configuration build() {
        return new AccountCreateParams.Configuration(
            this.cardCreator,
            this.customer,
            this.extraParams,
            this.merchant,
            this.recipient,
            this.storer);
      }

      /** The CardCreator Configuration allows the Account to create and issue cards to users. */
      public Builder setCardCreator(AccountCreateParams.Configuration.CardCreator cardCreator) {
        this.cardCreator = cardCreator;
        return this;
      }

      /** The Customer Configuration allows the Account to be used in inbound payment flows. */
      public Builder setCustomer(AccountCreateParams.Configuration.Customer customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Configuration#extraParams} for the field documentation.
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
       * See {@link AccountCreateParams.Configuration#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The Merchant configuration allows the Account to act as a connected account and collect
       * payments facilitated by a Connect platform. You can add this configuration to your
       * connected accounts only if you’ve completed onboarding as a Connect platform.
       */
      public Builder setMerchant(AccountCreateParams.Configuration.Merchant merchant) {
        this.merchant = merchant;
        return this;
      }

      /** The Recipient Configuration allows the Account to receive funds. */
      public Builder setRecipient(AccountCreateParams.Configuration.Recipient recipient) {
        this.recipient = recipient;
        return this;
      }

      /**
       * The Storer Configuration allows the Account to store and move funds using stored-value
       * FinancialAccounts.
       */
      public Builder setStorer(AccountCreateParams.Configuration.Storer storer) {
        this.storer = storer;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardCreator {
      /** Capabilities to request on the CardCreator Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CardCreator(Capabilities capabilities, Map<String, Object> extraParams) {
        this.capabilities = capabilities;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Capabilities capabilities;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Configuration.CardCreator build() {
          return new AccountCreateParams.Configuration.CardCreator(
              this.capabilities, this.extraParams);
        }

        /** Capabilities to request on the CardCreator Configuration. */
        public Builder setCapabilities(
            AccountCreateParams.Configuration.CardCreator.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Configuration.CardCreator#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Configuration.CardCreator#extraParams} for the field
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
      public static class Capabilities {
        /** Can create cards for commercial issuing use cases. */
        @SerializedName("commercial")
        Commercial commercial;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Capabilities(Commercial commercial, Map<String, Object> extraParams) {
          this.commercial = commercial;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Commercial commercial;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.CardCreator.Capabilities build() {
            return new AccountCreateParams.Configuration.CardCreator.Capabilities(
                this.commercial, this.extraParams);
          }

          /** Can create cards for commercial issuing use cases. */
          public Builder setCommercial(
              AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial commercial) {
            this.commercial = commercial;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.CardCreator.Capabilities#extraParams}
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
           * map. See {@link AccountCreateParams.Configuration.CardCreator.Capabilities#extraParams}
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
        public static class Commercial {
          /** Can create commercial issuing cards with Celtic as BIN sponsor. */
          @SerializedName("celtic")
          Celtic celtic;

          /** Can create commercial issuing cards with Cross River Bank as BIN sponsor. */
          @SerializedName("cross_river_bank")
          CrossRiverBank crossRiverBank;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Can create commercial issuing cards with Stripe as BIN sponsor. */
          @SerializedName("stripe")
          Stripe stripe;

          private Commercial(
              Celtic celtic,
              CrossRiverBank crossRiverBank,
              Map<String, Object> extraParams,
              Stripe stripe) {
            this.celtic = celtic;
            this.crossRiverBank = crossRiverBank;
            this.extraParams = extraParams;
            this.stripe = stripe;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Celtic celtic;

            private CrossRiverBank crossRiverBank;

            private Map<String, Object> extraParams;

            private Stripe stripe;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial build() {
              return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial(
                  this.celtic, this.crossRiverBank, this.extraParams, this.stripe);
            }

            /** Can create commercial issuing cards with Celtic as BIN sponsor. */
            public Builder setCeltic(
                AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic
                    celtic) {
              this.celtic = celtic;
              return this;
            }

            /** Can create commercial issuing cards with Cross River Bank as BIN sponsor. */
            public Builder setCrossRiverBank(
                AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank
                    crossRiverBank) {
              this.crossRiverBank = crossRiverBank;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial#extraParams}
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
             * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Can create commercial issuing cards with Stripe as BIN sponsor. */
            public Builder setStripe(
                AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe
                    stripe) {
              this.stripe = stripe;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Celtic {
            /** Can create commercial issuing charge cards with Celtic as BIN sponsor. */
            @SerializedName("charge_card")
            ChargeCard chargeCard;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Can create commercial issuing spend cards with Celtic as BIN sponsor. */
            @SerializedName("spend_card")
            SpendCard spendCard;

            private Celtic(
                ChargeCard chargeCard, Map<String, Object> extraParams, SpendCard spendCard) {
              this.chargeCard = chargeCard;
              this.extraParams = extraParams;
              this.spendCard = spendCard;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private ChargeCard chargeCard;

              private Map<String, Object> extraParams;

              private SpendCard spendCard;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic
                  build() {
                return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                    .Celtic(this.chargeCard, this.extraParams, this.spendCard);
              }

              /** Can create commercial issuing charge cards with Celtic as BIN sponsor. */
              public Builder setChargeCard(
                  AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic
                          .ChargeCard
                      chargeCard) {
                this.chargeCard = chargeCard;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic#extraParams}
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
               * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Can create commercial issuing spend cards with Celtic as BIN sponsor. */
              public Builder setSpendCard(
                  AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic
                          .SpendCard
                      spendCard) {
                this.spendCard = spendCard;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class ChargeCard {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              @SerializedName("requested")
              Boolean requested;

              private ChargeCard(Map<String, Object> extraParams, Boolean requested) {
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
                public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic
                        .ChargeCard
                    build() {
                  return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .Celtic.ChargeCard(this.extraParams, this.requested);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic.ChargeCard#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic.ChargeCard#extraParams}
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
                 * <strong>Required.</strong> To request a new Capability for an account, pass true.
                 * There can be a delay before the requested Capability becomes active.
                 */
                public Builder setRequested(Boolean requested) {
                  this.requested = requested;
                  return this;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class SpendCard {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              @SerializedName("requested")
              Boolean requested;

              private SpendCard(Map<String, Object> extraParams, Boolean requested) {
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
                public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic
                        .SpendCard
                    build() {
                  return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .Celtic.SpendCard(this.extraParams, this.requested);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic.SpendCard#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Celtic.SpendCard#extraParams}
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
                 * <strong>Required.</strong> To request a new Capability for an account, pass true.
                 * There can be a delay before the requested Capability becomes active.
                 */
                public Builder setRequested(Boolean requested) {
                  this.requested = requested;
                  return this;
                }
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class CrossRiverBank {
            /** Can create commercial issuing charge cards with Cross River Bank as BIN sponsor. */
            @SerializedName("charge_card")
            ChargeCard chargeCard;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Can create commercial issuing spend cards with Cross River Bank as BIN sponsor. */
            @SerializedName("spend_card")
            SpendCard spendCard;

            private CrossRiverBank(
                ChargeCard chargeCard, Map<String, Object> extraParams, SpendCard spendCard) {
              this.chargeCard = chargeCard;
              this.extraParams = extraParams;
              this.spendCard = spendCard;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private ChargeCard chargeCard;

              private Map<String, Object> extraParams;

              private SpendCard spendCard;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .CrossRiverBank
                  build() {
                return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                    .CrossRiverBank(this.chargeCard, this.extraParams, this.spendCard);
              }

              /**
               * Can create commercial issuing charge cards with Cross River Bank as BIN sponsor.
               */
              public Builder setChargeCard(
                  AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                          .CrossRiverBank.ChargeCard
                      chargeCard) {
                this.chargeCard = chargeCard;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank#extraParams}
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
               * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Can create commercial issuing spend cards with Cross River Bank as BIN sponsor. */
              public Builder setSpendCard(
                  AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                          .CrossRiverBank.SpendCard
                      spendCard) {
                this.spendCard = spendCard;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class ChargeCard {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              @SerializedName("requested")
              Boolean requested;

              private ChargeCard(Map<String, Object> extraParams, Boolean requested) {
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
                public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                        .CrossRiverBank.ChargeCard
                    build() {
                  return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .CrossRiverBank.ChargeCard(this.extraParams, this.requested);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank.ChargeCard#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank.ChargeCard#extraParams}
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
                 * <strong>Required.</strong> To request a new Capability for an account, pass true.
                 * There can be a delay before the requested Capability becomes active.
                 */
                public Builder setRequested(Boolean requested) {
                  this.requested = requested;
                  return this;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class SpendCard {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              @SerializedName("requested")
              Boolean requested;

              private SpendCard(Map<String, Object> extraParams, Boolean requested) {
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
                public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                        .CrossRiverBank.SpendCard
                    build() {
                  return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .CrossRiverBank.SpendCard(this.extraParams, this.requested);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank.SpendCard#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.CrossRiverBank.SpendCard#extraParams}
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
                 * <strong>Required.</strong> To request a new Capability for an account, pass true.
                 * There can be a delay before the requested Capability becomes active.
                 */
                public Builder setRequested(Boolean requested) {
                  this.requested = requested;
                  return this;
                }
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Stripe {
            /** Can create commercial issuing charge cards with Stripe as BIN sponsor. */
            @SerializedName("charge_card")
            ChargeCard chargeCard;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Can create commercial issuing prepaid cards with Stripe as BIN sponsor. */
            @SerializedName("prepaid_card")
            PrepaidCard prepaidCard;

            private Stripe(
                ChargeCard chargeCard, Map<String, Object> extraParams, PrepaidCard prepaidCard) {
              this.chargeCard = chargeCard;
              this.extraParams = extraParams;
              this.prepaidCard = prepaidCard;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private ChargeCard chargeCard;

              private Map<String, Object> extraParams;

              private PrepaidCard prepaidCard;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe
                  build() {
                return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                    .Stripe(this.chargeCard, this.extraParams, this.prepaidCard);
              }

              /** Can create commercial issuing charge cards with Stripe as BIN sponsor. */
              public Builder setChargeCard(
                  AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe
                          .ChargeCard
                      chargeCard) {
                this.chargeCard = chargeCard;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe#extraParams}
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
               * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Can create commercial issuing prepaid cards with Stripe as BIN sponsor. */
              public Builder setPrepaidCard(
                  AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe
                          .PrepaidCard
                      prepaidCard) {
                this.prepaidCard = prepaidCard;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class ChargeCard {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              @SerializedName("requested")
              Boolean requested;

              private ChargeCard(Map<String, Object> extraParams, Boolean requested) {
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
                public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe
                        .ChargeCard
                    build() {
                  return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .Stripe.ChargeCard(this.extraParams, this.requested);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe.ChargeCard#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe.ChargeCard#extraParams}
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
                 * <strong>Required.</strong> To request a new Capability for an account, pass true.
                 * There can be a delay before the requested Capability becomes active.
                 */
                public Builder setRequested(Boolean requested) {
                  this.requested = requested;
                  return this;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class PrepaidCard {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              @SerializedName("requested")
              Boolean requested;

              private PrepaidCard(Map<String, Object> extraParams, Boolean requested) {
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
                public AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe
                        .PrepaidCard
                    build() {
                  return new AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial
                      .Stripe.PrepaidCard(this.extraParams, this.requested);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe.PrepaidCard#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Configuration.CardCreator.Capabilities.Commercial.Stripe.PrepaidCard#extraParams}
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
                 * <strong>Required.</strong> To request a new Capability for an account, pass true.
                 * There can be a delay before the requested Capability becomes active.
                 */
                public Builder setRequested(Boolean requested) {
                  this.requested = requested;
                  return this;
                }
              }
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Customer {
      /**
       * Automatic indirect tax settings to be used when automatic tax calculation is enabled on the
       * customer's invoices, subscriptions, checkout sessions, or payment links. Surfaces if
       * automatic tax calculation is possible given the current customer location information.
       */
      @SerializedName("automatic_indirect_tax")
      AutomaticIndirectTax automaticIndirectTax;

      /**
       * Billing settings - default settings used for this customer in Billing flows such as
       * Invoices and Subscriptions.
       */
      @SerializedName("billing")
      Billing billing;

      /** Capabilities that have been requested on the Customer Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The customer's shipping information. Appears on invoices emailed to this customer. */
      @SerializedName("shipping")
      Shipping shipping;

      /**
       * ID of the test clock to attach to the customer. Can only be set on testmode Accounts, and
       * when the Customer Configuration is first set on an Account.
       */
      @SerializedName("test_clock")
      String testClock;

      private Customer(
          AutomaticIndirectTax automaticIndirectTax,
          Billing billing,
          Capabilities capabilities,
          Map<String, Object> extraParams,
          Shipping shipping,
          String testClock) {
        this.automaticIndirectTax = automaticIndirectTax;
        this.billing = billing;
        this.capabilities = capabilities;
        this.extraParams = extraParams;
        this.shipping = shipping;
        this.testClock = testClock;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AutomaticIndirectTax automaticIndirectTax;

        private Billing billing;

        private Capabilities capabilities;

        private Map<String, Object> extraParams;

        private Shipping shipping;

        private String testClock;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Configuration.Customer build() {
          return new AccountCreateParams.Configuration.Customer(
              this.automaticIndirectTax,
              this.billing,
              this.capabilities,
              this.extraParams,
              this.shipping,
              this.testClock);
        }

        /**
         * Automatic indirect tax settings to be used when automatic tax calculation is enabled on
         * the customer's invoices, subscriptions, checkout sessions, or payment links. Surfaces if
         * automatic tax calculation is possible given the current customer location information.
         */
        public Builder setAutomaticIndirectTax(
            AccountCreateParams.Configuration.Customer.AutomaticIndirectTax automaticIndirectTax) {
          this.automaticIndirectTax = automaticIndirectTax;
          return this;
        }

        /**
         * Billing settings - default settings used for this customer in Billing flows such as
         * Invoices and Subscriptions.
         */
        public Builder setBilling(AccountCreateParams.Configuration.Customer.Billing billing) {
          this.billing = billing;
          return this;
        }

        /** Capabilities that have been requested on the Customer Configuration. */
        public Builder setCapabilities(
            AccountCreateParams.Configuration.Customer.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Configuration.Customer#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Configuration.Customer#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The customer's shipping information. Appears on invoices emailed to this customer. */
        public Builder setShipping(AccountCreateParams.Configuration.Customer.Shipping shipping) {
          this.shipping = shipping;
          return this;
        }

        /**
         * ID of the test clock to attach to the customer. Can only be set on testmode Accounts, and
         * when the Customer Configuration is first set on an Account.
         */
        public Builder setTestClock(String testClock) {
          this.testClock = testClock;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AutomaticIndirectTax {
        /**
         * Describes the customer's tax exemption status, which is {@code none}, {@code exempt}, or
         * {@code reverse}. When set to reverse, invoice and receipt PDFs include the following
         * text: “Reverse charge”.
         */
        @SerializedName("exempt")
        Exempt exempt;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * A recent IP address of the customer used for tax reporting and tax location inference.
         */
        @SerializedName("ip_address")
        String ipAddress;

        /**
         * The data source used to identify the customer's tax location - defaults to
         * 'identity_address'. Will only be used for automatic tax calculation on the customer's
         * Invoices and Subscriptions.
         */
        @SerializedName("location_source")
        LocationSource locationSource;

        private AutomaticIndirectTax(
            Exempt exempt,
            Map<String, Object> extraParams,
            String ipAddress,
            LocationSource locationSource) {
          this.exempt = exempt;
          this.extraParams = extraParams;
          this.ipAddress = ipAddress;
          this.locationSource = locationSource;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Exempt exempt;

          private Map<String, Object> extraParams;

          private String ipAddress;

          private LocationSource locationSource;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Customer.AutomaticIndirectTax build() {
            return new AccountCreateParams.Configuration.Customer.AutomaticIndirectTax(
                this.exempt, this.extraParams, this.ipAddress, this.locationSource);
          }

          /**
           * Describes the customer's tax exemption status, which is {@code none}, {@code exempt},
           * or {@code reverse}. When set to reverse, invoice and receipt PDFs include the following
           * text: “Reverse charge”.
           */
          public Builder setExempt(
              AccountCreateParams.Configuration.Customer.AutomaticIndirectTax.Exempt exempt) {
            this.exempt = exempt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Configuration.Customer.AutomaticIndirectTax#extraParams} for the
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
           * AccountCreateParams.Configuration.Customer.AutomaticIndirectTax#extraParams} for the
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
           * A recent IP address of the customer used for tax reporting and tax location inference.
           */
          public Builder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /**
           * The data source used to identify the customer's tax location - defaults to
           * 'identity_address'. Will only be used for automatic tax calculation on the customer's
           * Invoices and Subscriptions.
           */
          public Builder setLocationSource(
              AccountCreateParams.Configuration.Customer.AutomaticIndirectTax.LocationSource
                  locationSource) {
            this.locationSource = locationSource;
            return this;
          }
        }

        public enum Exempt implements ApiRequestParams.EnumParam {
          @SerializedName("exempt")
          EXEMPT("exempt"),

          @SerializedName("none")
          NONE("none"),

          @SerializedName("reverse")
          REVERSE("reverse");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Exempt(String value) {
            this.value = value;
          }
        }

        public enum LocationSource implements ApiRequestParams.EnumParam {
          @SerializedName("identity_address")
          IDENTITY_ADDRESS("identity_address"),

          @SerializedName("ip_address")
          IP_ADDRESS("ip_address"),

          @SerializedName("shipping_address")
          SHIPPING_ADDRESS("shipping_address");

          @Getter(onMethod_ = {@Override})
          private final String value;

          LocationSource(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Billing {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Default settings used on invoices for this customer. */
        @SerializedName("invoice")
        Invoice invoice;

        private Billing(Map<String, Object> extraParams, Invoice invoice) {
          this.extraParams = extraParams;
          this.invoice = invoice;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Invoice invoice;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Customer.Billing build() {
            return new AccountCreateParams.Configuration.Customer.Billing(
                this.extraParams, this.invoice);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Customer.Billing#extraParams} for the
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
           * map. See {@link AccountCreateParams.Configuration.Customer.Billing#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Default settings used on invoices for this customer. */
          public Builder setInvoice(
              AccountCreateParams.Configuration.Customer.Billing.Invoice invoice) {
            this.invoice = invoice;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Invoice {
          /**
           * The list of up to 4 default custom fields to be displayed on invoices for this
           * customer.
           */
          @SerializedName("custom_fields")
          List<AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField> customFields;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Default footer to be displayed on invoices for this customer. */
          @SerializedName("footer")
          String footer;

          /** The sequence to be used on the customer's next invoice. Defaults to 1. */
          @SerializedName("next_sequence")
          Long nextSequence;

          /**
           * The prefix for the customer used to generate unique invoice numbers. Must be 3–12
           * uppercase letters or numbers.
           */
          @SerializedName("prefix")
          String prefix;

          /** Default options for invoice PDF rendering for this customer. */
          @SerializedName("rendering")
          Rendering rendering;

          private Invoice(
              List<AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField>
                  customFields,
              Map<String, Object> extraParams,
              String footer,
              Long nextSequence,
              String prefix,
              Rendering rendering) {
            this.customFields = customFields;
            this.extraParams = extraParams;
            this.footer = footer;
            this.nextSequence = nextSequence;
            this.prefix = prefix;
            this.rendering = rendering;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField>
                customFields;

            private Map<String, Object> extraParams;

            private String footer;

            private Long nextSequence;

            private String prefix;

            private Rendering rendering;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Customer.Billing.Invoice build() {
              return new AccountCreateParams.Configuration.Customer.Billing.Invoice(
                  this.customFields,
                  this.extraParams,
                  this.footer,
                  this.nextSequence,
                  this.prefix,
                  this.rendering);
            }

            /**
             * Add an element to `customFields` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * AccountCreateParams.Configuration.Customer.Billing.Invoice#customFields} for the
             * field documentation.
             */
            public Builder addCustomField(
                AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField element) {
              if (this.customFields == null) {
                this.customFields = new ArrayList<>();
              }
              this.customFields.add(element);
              return this;
            }

            /**
             * Add all elements to `customFields` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * AccountCreateParams.Configuration.Customer.Billing.Invoice#customFields} for the
             * field documentation.
             */
            public Builder addAllCustomField(
                List<AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField>
                    elements) {
              if (this.customFields == null) {
                this.customFields = new ArrayList<>();
              }
              this.customFields.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Customer.Billing.Invoice#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Customer.Billing.Invoice#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Default footer to be displayed on invoices for this customer. */
            public Builder setFooter(String footer) {
              this.footer = footer;
              return this;
            }

            /** The sequence to be used on the customer's next invoice. Defaults to 1. */
            public Builder setNextSequence(Long nextSequence) {
              this.nextSequence = nextSequence;
              return this;
            }

            /**
             * The prefix for the customer used to generate unique invoice numbers. Must be 3–12
             * uppercase letters or numbers.
             */
            public Builder setPrefix(String prefix) {
              this.prefix = prefix;
              return this;
            }

            /** Default options for invoice PDF rendering for this customer. */
            public Builder setRendering(
                AccountCreateParams.Configuration.Customer.Billing.Invoice.Rendering rendering) {
              this.rendering = rendering;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class CustomField {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> The name of the custom field. This may be up to 40
             * characters.
             */
            @SerializedName("name")
            String name;

            /**
             * <strong>Required.</strong> The value of the custom field. This may be up to 140
             * characters. When updating, pass an empty string to remove previously-defined values.
             */
            @SerializedName("value")
            String value;

            private CustomField(Map<String, Object> extraParams, String name, String value) {
              this.extraParams = extraParams;
              this.name = name;
              this.value = value;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String name;

              private String value;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField
                  build() {
                return new AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField(
                    this.extraParams, this.name, this.value);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField#extraParams}
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
               * AccountCreateParams.Configuration.Customer.Billing.Invoice.CustomField#extraParams}
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
               * <strong>Required.</strong> The name of the custom field. This may be up to 40
               * characters.
               */
              public Builder setName(String name) {
                this.name = name;
                return this;
              }

              /**
               * <strong>Required.</strong> The value of the custom field. This may be up to 140
               * characters. When updating, pass an empty string to remove previously-defined
               * values.
               */
              public Builder setValue(String value) {
                this.value = value;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Rendering {
            /**
             * How line-item prices and amounts will be displayed with respect to tax on invoice
             * PDFs. One of exclude_tax or include_inclusive_tax. include_inclusive_tax will include
             * inclusive tax (and exclude exclusive tax) in invoice PDF amounts. exclude_tax will
             * exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
             */
            @SerializedName("amount_tax_display")
            AmountTaxDisplay amountTaxDisplay;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** ID of the invoice rendering template to use for future invoices. */
            @SerializedName("template")
            String template;

            private Rendering(
                AmountTaxDisplay amountTaxDisplay,
                Map<String, Object> extraParams,
                String template) {
              this.amountTaxDisplay = amountTaxDisplay;
              this.extraParams = extraParams;
              this.template = template;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private AmountTaxDisplay amountTaxDisplay;

              private Map<String, Object> extraParams;

              private String template;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Configuration.Customer.Billing.Invoice.Rendering build() {
                return new AccountCreateParams.Configuration.Customer.Billing.Invoice.Rendering(
                    this.amountTaxDisplay, this.extraParams, this.template);
              }

              /**
               * How line-item prices and amounts will be displayed with respect to tax on invoice
               * PDFs. One of exclude_tax or include_inclusive_tax. include_inclusive_tax will
               * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts.
               * exclude_tax will exclude all tax (inclusive and exclusive alike) from invoice PDF
               * amounts.
               */
              public Builder setAmountTaxDisplay(
                  AccountCreateParams.Configuration.Customer.Billing.Invoice.Rendering
                          .AmountTaxDisplay
                      amountTaxDisplay) {
                this.amountTaxDisplay = amountTaxDisplay;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Customer.Billing.Invoice.Rendering#extraParams}
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
               * AccountCreateParams.Configuration.Customer.Billing.Invoice.Rendering#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** ID of the invoice rendering template to use for future invoices. */
              public Builder setTemplate(String template) {
                this.template = template;
                return this;
              }
            }

            public enum AmountTaxDisplay implements ApiRequestParams.EnumParam {
              @SerializedName("exclude_tax")
              EXCLUDE_TAX("exclude_tax"),

              @SerializedName("include_inclusive_tax")
              INCLUDE_INCLUSIVE_TAX("include_inclusive_tax");

              @Getter(onMethod_ = {@Override})
              private final String value;

              AmountTaxDisplay(String value) {
                this.value = value;
              }
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities {
        /**
         * Generates requirements for enabling automatic indirect tax calculation on this customer's
         * invoices or subscriptions. Recommended to request this capability if planning to enable
         * automatic tax calculation on this customer's invoices or subscriptions. Uses the {@code
         * location_source} field.
         */
        @SerializedName("automatic_indirect_tax")
        AutomaticIndirectTax automaticIndirectTax;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Capabilities(
            AutomaticIndirectTax automaticIndirectTax, Map<String, Object> extraParams) {
          this.automaticIndirectTax = automaticIndirectTax;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AutomaticIndirectTax automaticIndirectTax;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Customer.Capabilities build() {
            return new AccountCreateParams.Configuration.Customer.Capabilities(
                this.automaticIndirectTax, this.extraParams);
          }

          /**
           * Generates requirements for enabling automatic indirect tax calculation on this
           * customer's invoices or subscriptions. Recommended to request this capability if
           * planning to enable automatic tax calculation on this customer's invoices or
           * subscriptions. Uses the {@code location_source} field.
           */
          public Builder setAutomaticIndirectTax(
              AccountCreateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax
                  automaticIndirectTax) {
            this.automaticIndirectTax = automaticIndirectTax;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Customer.Capabilities#extraParams}
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
           * map. See {@link AccountCreateParams.Configuration.Customer.Capabilities#extraParams}
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
        public static class AutomaticIndirectTax {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AutomaticIndirectTax(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax
                build() {
              return new AccountCreateParams.Configuration.Customer.Capabilities
                  .AutomaticIndirectTax(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax#extraParams}
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
             * AccountCreateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping {
        /** Customer shipping address. */
        @SerializedName("address")
        Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Customer name. */
        @SerializedName("name")
        String name;

        /** Customer phone (including extension). */
        @SerializedName("phone")
        String phone;

        private Shipping(
            Address address, Map<String, Object> extraParams, String name, String phone) {
          this.address = address;
          this.extraParams = extraParams;
          this.name = name;
          this.phone = phone;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Map<String, Object> extraParams;

          private String name;

          private String phone;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Customer.Shipping build() {
            return new AccountCreateParams.Configuration.Customer.Shipping(
                this.address, this.extraParams, this.name, this.phone);
          }

          /** Customer shipping address. */
          public Builder setAddress(
              AccountCreateParams.Configuration.Customer.Shipping.Address address) {
            this.address = address;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Customer.Shipping#extraParams} for
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
           * map. See {@link AccountCreateParams.Configuration.Customer.Shipping#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Customer name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Customer phone (including extension). */
          public Builder setPhone(String phone) {
            this.phone = phone;
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public AccountCreateParams.Configuration.Customer.Shipping.Address build() {
              return new AccountCreateParams.Configuration.Customer.Shipping.Address(
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Customer.Shipping.Address#extraParams} for the
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
             * AccountCreateParams.Configuration.Customer.Shipping.Address#extraParams} for the
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Merchant {
      /** Settings used for Bacs debit payments. */
      @SerializedName("bacs_debit_payments")
      BacsDebitPayments bacsDebitPayments;

      /**
       * Settings used to apply the merchant's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      @SerializedName("branding")
      Branding branding;

      /** Capabilities to request on the Merchant Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /** Card payments settings. */
      @SerializedName("card_payments")
      CardPayments cardPayments;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The merchant category code for the Merchant Configuration. MCCs are used to classify
       * businesses based on the goods or services they provide.
       */
      @SerializedName("mcc")
      String mcc;

      /** Statement descriptor. */
      @SerializedName("statement_descriptor")
      StatementDescriptor statementDescriptor;

      /** Publicly available contact information for sending support issues to. */
      @SerializedName("support")
      Support support;

      private Merchant(
          BacsDebitPayments bacsDebitPayments,
          Branding branding,
          Capabilities capabilities,
          CardPayments cardPayments,
          Map<String, Object> extraParams,
          String mcc,
          StatementDescriptor statementDescriptor,
          Support support) {
        this.bacsDebitPayments = bacsDebitPayments;
        this.branding = branding;
        this.capabilities = capabilities;
        this.cardPayments = cardPayments;
        this.extraParams = extraParams;
        this.mcc = mcc;
        this.statementDescriptor = statementDescriptor;
        this.support = support;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BacsDebitPayments bacsDebitPayments;

        private Branding branding;

        private Capabilities capabilities;

        private CardPayments cardPayments;

        private Map<String, Object> extraParams;

        private String mcc;

        private StatementDescriptor statementDescriptor;

        private Support support;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Configuration.Merchant build() {
          return new AccountCreateParams.Configuration.Merchant(
              this.bacsDebitPayments,
              this.branding,
              this.capabilities,
              this.cardPayments,
              this.extraParams,
              this.mcc,
              this.statementDescriptor,
              this.support);
        }

        /** Settings used for Bacs debit payments. */
        public Builder setBacsDebitPayments(
            AccountCreateParams.Configuration.Merchant.BacsDebitPayments bacsDebitPayments) {
          this.bacsDebitPayments = bacsDebitPayments;
          return this;
        }

        /**
         * Settings used to apply the merchant's branding to email receipts, invoices, Checkout, and
         * other products.
         */
        public Builder setBranding(AccountCreateParams.Configuration.Merchant.Branding branding) {
          this.branding = branding;
          return this;
        }

        /** Capabilities to request on the Merchant Configuration. */
        public Builder setCapabilities(
            AccountCreateParams.Configuration.Merchant.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /** Card payments settings. */
        public Builder setCardPayments(
            AccountCreateParams.Configuration.Merchant.CardPayments cardPayments) {
          this.cardPayments = cardPayments;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Configuration.Merchant#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Configuration.Merchant#extraParams} for the field
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
         * The merchant category code for the Merchant Configuration. MCCs are used to classify
         * businesses based on the goods or services they provide.
         */
        public Builder setMcc(String mcc) {
          this.mcc = mcc;
          return this;
        }

        /** Statement descriptor. */
        public Builder setStatementDescriptor(
            AccountCreateParams.Configuration.Merchant.StatementDescriptor statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /** Publicly available contact information for sending support issues to. */
        public Builder setSupport(AccountCreateParams.Configuration.Merchant.Support support) {
          this.support = support;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BacsDebitPayments {
        /** Display name for Bacs debit payments. */
        @SerializedName("display_name")
        String displayName;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private BacsDebitPayments(String displayName, Map<String, Object> extraParams) {
          this.displayName = displayName;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String displayName;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Merchant.BacsDebitPayments build() {
            return new AccountCreateParams.Configuration.Merchant.BacsDebitPayments(
                this.displayName, this.extraParams);
          }

          /** Display name for Bacs debit payments. */
          public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Configuration.Merchant.BacsDebitPayments#extraParams} for the field
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
           * AccountCreateParams.Configuration.Merchant.BacsDebitPayments#extraParams} for the field
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Branding {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>:
         * An icon for the merchant. Must be square and at least 128px x 128px.
         */
        @SerializedName("icon")
        String icon;

        /**
         * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>:
         * A logo for the merchant that will be used in Checkout instead of the icon and without the
         * merchant's name next to it if provided. Must be at least 128px x 128px.
         */
        @SerializedName("logo")
        String logo;

        /** A CSS hex color value representing the primary branding color for the merchant. */
        @SerializedName("primary_color")
        String primaryColor;

        /** A CSS hex color value representing the secondary branding color for the merchant. */
        @SerializedName("secondary_color")
        String secondaryColor;

        private Branding(
            Map<String, Object> extraParams,
            String icon,
            String logo,
            String primaryColor,
            String secondaryColor) {
          this.extraParams = extraParams;
          this.icon = icon;
          this.logo = logo;
          this.primaryColor = primaryColor;
          this.secondaryColor = secondaryColor;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String icon;

          private String logo;

          private String primaryColor;

          private String secondaryColor;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Merchant.Branding build() {
            return new AccountCreateParams.Configuration.Merchant.Branding(
                this.extraParams, this.icon, this.logo, this.primaryColor, this.secondaryColor);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Merchant.Branding#extraParams} for
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
           * map. See {@link AccountCreateParams.Configuration.Merchant.Branding#extraParams} for
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
           * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file
           * upload</a>: An icon for the merchant. Must be square and at least 128px x 128px.
           */
          public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
          }

          /**
           * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file
           * upload</a>: A logo for the merchant that will be used in Checkout instead of the icon
           * and without the merchant's name next to it if provided. Must be at least 128px x 128px.
           */
          public Builder setLogo(String logo) {
            this.logo = logo;
            return this;
          }

          /** A CSS hex color value representing the primary branding color for the merchant. */
          public Builder setPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
            return this;
          }

          /** A CSS hex color value representing the secondary branding color for the merchant. */
          public Builder setSecondaryColor(String secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities {
        /** Allow the merchant to process ACH debit payments. */
        @SerializedName("ach_debit_payments")
        AchDebitPayments achDebitPayments;

        /** Allow the merchant to process ACSS debit payments. */
        @SerializedName("acss_debit_payments")
        AcssDebitPayments acssDebitPayments;

        /** Allow the merchant to process Affirm payments. */
        @SerializedName("affirm_payments")
        AffirmPayments affirmPayments;

        /** Allow the merchant to process Afterpay/Clearpay payments. */
        @SerializedName("afterpay_clearpay_payments")
        AfterpayClearpayPayments afterpayClearpayPayments;

        /** Allow the merchant to process Alma payments. */
        @SerializedName("alma_payments")
        AlmaPayments almaPayments;

        /** Allow the merchant to process Amazon Pay payments. */
        @SerializedName("amazon_pay_payments")
        AmazonPayPayments amazonPayPayments;

        /** Allow the merchant to process Australian BECS Direct Debit payments. */
        @SerializedName("au_becs_debit_payments")
        AuBecsDebitPayments auBecsDebitPayments;

        /** Allow the merchant to process BACS Direct Debit payments. */
        @SerializedName("bacs_debit_payments")
        BacsDebitPayments bacsDebitPayments;

        /** Allow the merchant to process Bancontact payments. */
        @SerializedName("bancontact_payments")
        BancontactPayments bancontactPayments;

        /** Allow the merchant to process BLIK payments. */
        @SerializedName("blik_payments")
        BlikPayments blikPayments;

        /** Allow the merchant to process Boleto payments. */
        @SerializedName("boleto_payments")
        BoletoPayments boletoPayments;

        /** Allow the merchant to collect card payments. */
        @SerializedName("card_payments")
        CardPayments cardPayments;

        /** Allow the merchant to process Cartes Bancaires payments. */
        @SerializedName("cartes_bancaires_payments")
        CartesBancairesPayments cartesBancairesPayments;

        /** Allow the merchant to process Cash App payments. */
        @SerializedName("cashapp_payments")
        CashappPayments cashappPayments;

        /** Allow the merchant to process EPS payments. */
        @SerializedName("eps_payments")
        EpsPayments epsPayments;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Allow the merchant to process FPX payments. */
        @SerializedName("fpx_payments")
        FpxPayments fpxPayments;

        /** Allow the merchant to process UK bank transfer payments. */
        @SerializedName("gb_bank_transfer_payments")
        GbBankTransferPayments gbBankTransferPayments;

        /** Allow the merchant to process GrabPay payments. */
        @SerializedName("grabpay_payments")
        GrabpayPayments grabpayPayments;

        /** Allow the merchant to process iDEAL payments. */
        @SerializedName("ideal_payments")
        IdealPayments idealPayments;

        /** Allow the merchant to process JCB card payments. */
        @SerializedName("jcb_payments")
        JcbPayments jcbPayments;

        /** Allow the merchant to process Japanese bank transfer payments. */
        @SerializedName("jp_bank_transfer_payments")
        JpBankTransferPayments jpBankTransferPayments;

        /** Allow the merchant to process Kakao Pay payments. */
        @SerializedName("kakao_pay_payments")
        KakaoPayPayments kakaoPayPayments;

        /** Allow the merchant to process Klarna payments. */
        @SerializedName("klarna_payments")
        KlarnaPayments klarnaPayments;

        /** Allow the merchant to process Konbini convenience store payments. */
        @SerializedName("konbini_payments")
        KonbiniPayments konbiniPayments;

        /** Allow the merchant to process Korean card payments. */
        @SerializedName("kr_card_payments")
        KrCardPayments krCardPayments;

        /** Allow the merchant to process Link payments. */
        @SerializedName("link_payments")
        LinkPayments linkPayments;

        /** Allow the merchant to process MobilePay payments. */
        @SerializedName("mobilepay_payments")
        MobilepayPayments mobilepayPayments;

        /** Allow the merchant to process Multibanco payments. */
        @SerializedName("multibanco_payments")
        MultibancoPayments multibancoPayments;

        /** Allow the merchant to process Mexican bank transfer payments. */
        @SerializedName("mx_bank_transfer_payments")
        MxBankTransferPayments mxBankTransferPayments;

        /** Allow the merchant to process Naver Pay payments. */
        @SerializedName("naver_pay_payments")
        NaverPayPayments naverPayPayments;

        /** Allow the merchant to process OXXO payments. */
        @SerializedName("oxxo_payments")
        OxxoPayments oxxoPayments;

        /** Allow the merchant to process Przelewy24 (P24) payments. */
        @SerializedName("p24_payments")
        P24Payments p24Payments;

        /** Allow the merchant to process Pay by Bank payments. */
        @SerializedName("pay_by_bank_payments")
        PayByBankPayments payByBankPayments;

        /** Allow the merchant to process PAYCO payments. */
        @SerializedName("payco_payments")
        PaycoPayments paycoPayments;

        /** Allow the merchant to process PayNow payments. */
        @SerializedName("paynow_payments")
        PaynowPayments paynowPayments;

        /** Allow the merchant to process PromptPay payments. */
        @SerializedName("promptpay_payments")
        PromptpayPayments promptpayPayments;

        /** Allow the merchant to process Revolut Pay payments. */
        @SerializedName("revolut_pay_payments")
        RevolutPayPayments revolutPayPayments;

        /** Allow the merchant to process Samsung Pay payments. */
        @SerializedName("samsung_pay_payments")
        SamsungPayPayments samsungPayPayments;

        /** Allow the merchant to process SEPA bank transfer payments. */
        @SerializedName("sepa_bank_transfer_payments")
        SepaBankTransferPayments sepaBankTransferPayments;

        /** Allow the merchant to process SEPA Direct Debit payments. */
        @SerializedName("sepa_debit_payments")
        SepaDebitPayments sepaDebitPayments;

        /** Allow the merchant to process Swish payments. */
        @SerializedName("swish_payments")
        SwishPayments swishPayments;

        /** Allow the merchant to process TWINT payments. */
        @SerializedName("twint_payments")
        TwintPayments twintPayments;

        /** Allow the merchant to process US bank transfer payments. */
        @SerializedName("us_bank_transfer_payments")
        UsBankTransferPayments usBankTransferPayments;

        /** Allow the merchant to process Zip payments. */
        @SerializedName("zip_payments")
        ZipPayments zipPayments;

        private Capabilities(
            AchDebitPayments achDebitPayments,
            AcssDebitPayments acssDebitPayments,
            AffirmPayments affirmPayments,
            AfterpayClearpayPayments afterpayClearpayPayments,
            AlmaPayments almaPayments,
            AmazonPayPayments amazonPayPayments,
            AuBecsDebitPayments auBecsDebitPayments,
            BacsDebitPayments bacsDebitPayments,
            BancontactPayments bancontactPayments,
            BlikPayments blikPayments,
            BoletoPayments boletoPayments,
            CardPayments cardPayments,
            CartesBancairesPayments cartesBancairesPayments,
            CashappPayments cashappPayments,
            EpsPayments epsPayments,
            Map<String, Object> extraParams,
            FpxPayments fpxPayments,
            GbBankTransferPayments gbBankTransferPayments,
            GrabpayPayments grabpayPayments,
            IdealPayments idealPayments,
            JcbPayments jcbPayments,
            JpBankTransferPayments jpBankTransferPayments,
            KakaoPayPayments kakaoPayPayments,
            KlarnaPayments klarnaPayments,
            KonbiniPayments konbiniPayments,
            KrCardPayments krCardPayments,
            LinkPayments linkPayments,
            MobilepayPayments mobilepayPayments,
            MultibancoPayments multibancoPayments,
            MxBankTransferPayments mxBankTransferPayments,
            NaverPayPayments naverPayPayments,
            OxxoPayments oxxoPayments,
            P24Payments p24Payments,
            PayByBankPayments payByBankPayments,
            PaycoPayments paycoPayments,
            PaynowPayments paynowPayments,
            PromptpayPayments promptpayPayments,
            RevolutPayPayments revolutPayPayments,
            SamsungPayPayments samsungPayPayments,
            SepaBankTransferPayments sepaBankTransferPayments,
            SepaDebitPayments sepaDebitPayments,
            SwishPayments swishPayments,
            TwintPayments twintPayments,
            UsBankTransferPayments usBankTransferPayments,
            ZipPayments zipPayments) {
          this.achDebitPayments = achDebitPayments;
          this.acssDebitPayments = acssDebitPayments;
          this.affirmPayments = affirmPayments;
          this.afterpayClearpayPayments = afterpayClearpayPayments;
          this.almaPayments = almaPayments;
          this.amazonPayPayments = amazonPayPayments;
          this.auBecsDebitPayments = auBecsDebitPayments;
          this.bacsDebitPayments = bacsDebitPayments;
          this.bancontactPayments = bancontactPayments;
          this.blikPayments = blikPayments;
          this.boletoPayments = boletoPayments;
          this.cardPayments = cardPayments;
          this.cartesBancairesPayments = cartesBancairesPayments;
          this.cashappPayments = cashappPayments;
          this.epsPayments = epsPayments;
          this.extraParams = extraParams;
          this.fpxPayments = fpxPayments;
          this.gbBankTransferPayments = gbBankTransferPayments;
          this.grabpayPayments = grabpayPayments;
          this.idealPayments = idealPayments;
          this.jcbPayments = jcbPayments;
          this.jpBankTransferPayments = jpBankTransferPayments;
          this.kakaoPayPayments = kakaoPayPayments;
          this.klarnaPayments = klarnaPayments;
          this.konbiniPayments = konbiniPayments;
          this.krCardPayments = krCardPayments;
          this.linkPayments = linkPayments;
          this.mobilepayPayments = mobilepayPayments;
          this.multibancoPayments = multibancoPayments;
          this.mxBankTransferPayments = mxBankTransferPayments;
          this.naverPayPayments = naverPayPayments;
          this.oxxoPayments = oxxoPayments;
          this.p24Payments = p24Payments;
          this.payByBankPayments = payByBankPayments;
          this.paycoPayments = paycoPayments;
          this.paynowPayments = paynowPayments;
          this.promptpayPayments = promptpayPayments;
          this.revolutPayPayments = revolutPayPayments;
          this.samsungPayPayments = samsungPayPayments;
          this.sepaBankTransferPayments = sepaBankTransferPayments;
          this.sepaDebitPayments = sepaDebitPayments;
          this.swishPayments = swishPayments;
          this.twintPayments = twintPayments;
          this.usBankTransferPayments = usBankTransferPayments;
          this.zipPayments = zipPayments;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AchDebitPayments achDebitPayments;

          private AcssDebitPayments acssDebitPayments;

          private AffirmPayments affirmPayments;

          private AfterpayClearpayPayments afterpayClearpayPayments;

          private AlmaPayments almaPayments;

          private AmazonPayPayments amazonPayPayments;

          private AuBecsDebitPayments auBecsDebitPayments;

          private BacsDebitPayments bacsDebitPayments;

          private BancontactPayments bancontactPayments;

          private BlikPayments blikPayments;

          private BoletoPayments boletoPayments;

          private CardPayments cardPayments;

          private CartesBancairesPayments cartesBancairesPayments;

          private CashappPayments cashappPayments;

          private EpsPayments epsPayments;

          private Map<String, Object> extraParams;

          private FpxPayments fpxPayments;

          private GbBankTransferPayments gbBankTransferPayments;

          private GrabpayPayments grabpayPayments;

          private IdealPayments idealPayments;

          private JcbPayments jcbPayments;

          private JpBankTransferPayments jpBankTransferPayments;

          private KakaoPayPayments kakaoPayPayments;

          private KlarnaPayments klarnaPayments;

          private KonbiniPayments konbiniPayments;

          private KrCardPayments krCardPayments;

          private LinkPayments linkPayments;

          private MobilepayPayments mobilepayPayments;

          private MultibancoPayments multibancoPayments;

          private MxBankTransferPayments mxBankTransferPayments;

          private NaverPayPayments naverPayPayments;

          private OxxoPayments oxxoPayments;

          private P24Payments p24Payments;

          private PayByBankPayments payByBankPayments;

          private PaycoPayments paycoPayments;

          private PaynowPayments paynowPayments;

          private PromptpayPayments promptpayPayments;

          private RevolutPayPayments revolutPayPayments;

          private SamsungPayPayments samsungPayPayments;

          private SepaBankTransferPayments sepaBankTransferPayments;

          private SepaDebitPayments sepaDebitPayments;

          private SwishPayments swishPayments;

          private TwintPayments twintPayments;

          private UsBankTransferPayments usBankTransferPayments;

          private ZipPayments zipPayments;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Merchant.Capabilities build() {
            return new AccountCreateParams.Configuration.Merchant.Capabilities(
                this.achDebitPayments,
                this.acssDebitPayments,
                this.affirmPayments,
                this.afterpayClearpayPayments,
                this.almaPayments,
                this.amazonPayPayments,
                this.auBecsDebitPayments,
                this.bacsDebitPayments,
                this.bancontactPayments,
                this.blikPayments,
                this.boletoPayments,
                this.cardPayments,
                this.cartesBancairesPayments,
                this.cashappPayments,
                this.epsPayments,
                this.extraParams,
                this.fpxPayments,
                this.gbBankTransferPayments,
                this.grabpayPayments,
                this.idealPayments,
                this.jcbPayments,
                this.jpBankTransferPayments,
                this.kakaoPayPayments,
                this.klarnaPayments,
                this.konbiniPayments,
                this.krCardPayments,
                this.linkPayments,
                this.mobilepayPayments,
                this.multibancoPayments,
                this.mxBankTransferPayments,
                this.naverPayPayments,
                this.oxxoPayments,
                this.p24Payments,
                this.payByBankPayments,
                this.paycoPayments,
                this.paynowPayments,
                this.promptpayPayments,
                this.revolutPayPayments,
                this.samsungPayPayments,
                this.sepaBankTransferPayments,
                this.sepaDebitPayments,
                this.swishPayments,
                this.twintPayments,
                this.usBankTransferPayments,
                this.zipPayments);
          }

          /** Allow the merchant to process ACH debit payments. */
          public Builder setAchDebitPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AchDebitPayments
                  achDebitPayments) {
            this.achDebitPayments = achDebitPayments;
            return this;
          }

          /** Allow the merchant to process ACSS debit payments. */
          public Builder setAcssDebitPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AcssDebitPayments
                  acssDebitPayments) {
            this.acssDebitPayments = acssDebitPayments;
            return this;
          }

          /** Allow the merchant to process Affirm payments. */
          public Builder setAffirmPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AffirmPayments
                  affirmPayments) {
            this.affirmPayments = affirmPayments;
            return this;
          }

          /** Allow the merchant to process Afterpay/Clearpay payments. */
          public Builder setAfterpayClearpayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments
                  afterpayClearpayPayments) {
            this.afterpayClearpayPayments = afterpayClearpayPayments;
            return this;
          }

          /** Allow the merchant to process Alma payments. */
          public Builder setAlmaPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AlmaPayments almaPayments) {
            this.almaPayments = almaPayments;
            return this;
          }

          /** Allow the merchant to process Amazon Pay payments. */
          public Builder setAmazonPayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AmazonPayPayments
                  amazonPayPayments) {
            this.amazonPayPayments = amazonPayPayments;
            return this;
          }

          /** Allow the merchant to process Australian BECS Direct Debit payments. */
          public Builder setAuBecsDebitPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments
                  auBecsDebitPayments) {
            this.auBecsDebitPayments = auBecsDebitPayments;
            return this;
          }

          /** Allow the merchant to process BACS Direct Debit payments. */
          public Builder setBacsDebitPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.BacsDebitPayments
                  bacsDebitPayments) {
            this.bacsDebitPayments = bacsDebitPayments;
            return this;
          }

          /** Allow the merchant to process Bancontact payments. */
          public Builder setBancontactPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.BancontactPayments
                  bancontactPayments) {
            this.bancontactPayments = bancontactPayments;
            return this;
          }

          /** Allow the merchant to process BLIK payments. */
          public Builder setBlikPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.BlikPayments blikPayments) {
            this.blikPayments = blikPayments;
            return this;
          }

          /** Allow the merchant to process Boleto payments. */
          public Builder setBoletoPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.BoletoPayments
                  boletoPayments) {
            this.boletoPayments = boletoPayments;
            return this;
          }

          /** Allow the merchant to collect card payments. */
          public Builder setCardPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.CardPayments cardPayments) {
            this.cardPayments = cardPayments;
            return this;
          }

          /** Allow the merchant to process Cartes Bancaires payments. */
          public Builder setCartesBancairesPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments
                  cartesBancairesPayments) {
            this.cartesBancairesPayments = cartesBancairesPayments;
            return this;
          }

          /** Allow the merchant to process Cash App payments. */
          public Builder setCashappPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.CashappPayments
                  cashappPayments) {
            this.cashappPayments = cashappPayments;
            return this;
          }

          /** Allow the merchant to process EPS payments. */
          public Builder setEpsPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.EpsPayments epsPayments) {
            this.epsPayments = epsPayments;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Merchant.Capabilities#extraParams}
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
           * map. See {@link AccountCreateParams.Configuration.Merchant.Capabilities#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Allow the merchant to process FPX payments. */
          public Builder setFpxPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.FpxPayments fpxPayments) {
            this.fpxPayments = fpxPayments;
            return this;
          }

          /** Allow the merchant to process UK bank transfer payments. */
          public Builder setGbBankTransferPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments
                  gbBankTransferPayments) {
            this.gbBankTransferPayments = gbBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process GrabPay payments. */
          public Builder setGrabpayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.GrabpayPayments
                  grabpayPayments) {
            this.grabpayPayments = grabpayPayments;
            return this;
          }

          /** Allow the merchant to process iDEAL payments. */
          public Builder setIdealPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.IdealPayments idealPayments) {
            this.idealPayments = idealPayments;
            return this;
          }

          /** Allow the merchant to process JCB card payments. */
          public Builder setJcbPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.JcbPayments jcbPayments) {
            this.jcbPayments = jcbPayments;
            return this;
          }

          /** Allow the merchant to process Japanese bank transfer payments. */
          public Builder setJpBankTransferPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments
                  jpBankTransferPayments) {
            this.jpBankTransferPayments = jpBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process Kakao Pay payments. */
          public Builder setKakaoPayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.KakaoPayPayments
                  kakaoPayPayments) {
            this.kakaoPayPayments = kakaoPayPayments;
            return this;
          }

          /** Allow the merchant to process Klarna payments. */
          public Builder setKlarnaPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.KlarnaPayments
                  klarnaPayments) {
            this.klarnaPayments = klarnaPayments;
            return this;
          }

          /** Allow the merchant to process Konbini convenience store payments. */
          public Builder setKonbiniPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.KonbiniPayments
                  konbiniPayments) {
            this.konbiniPayments = konbiniPayments;
            return this;
          }

          /** Allow the merchant to process Korean card payments. */
          public Builder setKrCardPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.KrCardPayments
                  krCardPayments) {
            this.krCardPayments = krCardPayments;
            return this;
          }

          /** Allow the merchant to process Link payments. */
          public Builder setLinkPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.LinkPayments linkPayments) {
            this.linkPayments = linkPayments;
            return this;
          }

          /** Allow the merchant to process MobilePay payments. */
          public Builder setMobilepayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.MobilepayPayments
                  mobilepayPayments) {
            this.mobilepayPayments = mobilepayPayments;
            return this;
          }

          /** Allow the merchant to process Multibanco payments. */
          public Builder setMultibancoPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.MultibancoPayments
                  multibancoPayments) {
            this.multibancoPayments = multibancoPayments;
            return this;
          }

          /** Allow the merchant to process Mexican bank transfer payments. */
          public Builder setMxBankTransferPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments
                  mxBankTransferPayments) {
            this.mxBankTransferPayments = mxBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process Naver Pay payments. */
          public Builder setNaverPayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.NaverPayPayments
                  naverPayPayments) {
            this.naverPayPayments = naverPayPayments;
            return this;
          }

          /** Allow the merchant to process OXXO payments. */
          public Builder setOxxoPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.OxxoPayments oxxoPayments) {
            this.oxxoPayments = oxxoPayments;
            return this;
          }

          /** Allow the merchant to process Przelewy24 (P24) payments. */
          public Builder setP24Payments(
              AccountCreateParams.Configuration.Merchant.Capabilities.P24Payments p24Payments) {
            this.p24Payments = p24Payments;
            return this;
          }

          /** Allow the merchant to process Pay by Bank payments. */
          public Builder setPayByBankPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.PayByBankPayments
                  payByBankPayments) {
            this.payByBankPayments = payByBankPayments;
            return this;
          }

          /** Allow the merchant to process PAYCO payments. */
          public Builder setPaycoPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.PaycoPayments paycoPayments) {
            this.paycoPayments = paycoPayments;
            return this;
          }

          /** Allow the merchant to process PayNow payments. */
          public Builder setPaynowPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.PaynowPayments
                  paynowPayments) {
            this.paynowPayments = paynowPayments;
            return this;
          }

          /** Allow the merchant to process PromptPay payments. */
          public Builder setPromptpayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.PromptpayPayments
                  promptpayPayments) {
            this.promptpayPayments = promptpayPayments;
            return this;
          }

          /** Allow the merchant to process Revolut Pay payments. */
          public Builder setRevolutPayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.RevolutPayPayments
                  revolutPayPayments) {
            this.revolutPayPayments = revolutPayPayments;
            return this;
          }

          /** Allow the merchant to process Samsung Pay payments. */
          public Builder setSamsungPayPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.SamsungPayPayments
                  samsungPayPayments) {
            this.samsungPayPayments = samsungPayPayments;
            return this;
          }

          /** Allow the merchant to process SEPA bank transfer payments. */
          public Builder setSepaBankTransferPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments
                  sepaBankTransferPayments) {
            this.sepaBankTransferPayments = sepaBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process SEPA Direct Debit payments. */
          public Builder setSepaDebitPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.SepaDebitPayments
                  sepaDebitPayments) {
            this.sepaDebitPayments = sepaDebitPayments;
            return this;
          }

          /** Allow the merchant to process Swish payments. */
          public Builder setSwishPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.SwishPayments swishPayments) {
            this.swishPayments = swishPayments;
            return this;
          }

          /** Allow the merchant to process TWINT payments. */
          public Builder setTwintPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.TwintPayments twintPayments) {
            this.twintPayments = twintPayments;
            return this;
          }

          /** Allow the merchant to process US bank transfer payments. */
          public Builder setUsBankTransferPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments
                  usBankTransferPayments) {
            this.usBankTransferPayments = usBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process Zip payments. */
          public Builder setZipPayments(
              AccountCreateParams.Configuration.Merchant.Capabilities.ZipPayments zipPayments) {
            this.zipPayments = zipPayments;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AchDebitPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AchDebitPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AchDebitPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.AchDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AchDebitPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.AchDebitPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AcssDebitPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AcssDebitPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AcssDebitPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.AcssDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AcssDebitPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.AcssDebitPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AffirmPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AffirmPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AffirmPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.AffirmPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AffirmPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.AffirmPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AfterpayClearpayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AfterpayClearpayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .AfterpayClearpayPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AlmaPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AlmaPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AlmaPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.AlmaPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AlmaPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AlmaPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AmazonPayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AmazonPayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AmazonPayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.AmazonPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AmazonPayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.AmazonPayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AuBecsDebitPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AuBecsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .AuBecsDebitPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BacsDebitPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BacsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.BacsDebitPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.BacsDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.BacsDebitPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.BacsDebitPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BancontactPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BancontactPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.BancontactPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.BancontactPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.BancontactPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.BancontactPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BlikPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BlikPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.BlikPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.BlikPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.BlikPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.BlikPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BoletoPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BoletoPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.BoletoPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.BoletoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.BoletoPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.BoletoPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CardPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CardPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.CardPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.CardPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.CardPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.CardPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CartesBancairesPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CartesBancairesPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .CartesBancairesPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CashappPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CashappPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.CashappPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.CashappPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.CashappPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.CashappPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class EpsPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private EpsPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.EpsPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.EpsPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.EpsPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.EpsPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class FpxPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private FpxPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.FpxPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.FpxPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.FpxPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.FpxPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class GbBankTransferPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private GbBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .GbBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class GrabpayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private GrabpayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.GrabpayPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.GrabpayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.GrabpayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.GrabpayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class IdealPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private IdealPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.IdealPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.IdealPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.IdealPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.IdealPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class JcbPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private JcbPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.JcbPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.JcbPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.JcbPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.JcbPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class JpBankTransferPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private JpBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .JpBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KakaoPayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KakaoPayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.KakaoPayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.KakaoPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.KakaoPayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.KakaoPayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KlarnaPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KlarnaPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.KlarnaPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.KlarnaPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.KlarnaPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.KlarnaPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KonbiniPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KonbiniPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.KonbiniPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.KonbiniPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.KonbiniPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.KonbiniPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KrCardPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KrCardPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.KrCardPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.KrCardPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.KrCardPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.KrCardPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class LinkPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private LinkPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.LinkPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.LinkPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.LinkPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.LinkPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MobilepayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private MobilepayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.MobilepayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.MobilepayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.MobilepayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.MobilepayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MultibancoPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private MultibancoPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.MultibancoPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.MultibancoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.MultibancoPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.MultibancoPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MxBankTransferPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private MxBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .MxBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class NaverPayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private NaverPayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.NaverPayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.NaverPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.NaverPayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.NaverPayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class OxxoPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private OxxoPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.OxxoPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.OxxoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.OxxoPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.OxxoPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class P24Payments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private P24Payments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.P24Payments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.P24Payments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.P24Payments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.P24Payments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PayByBankPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PayByBankPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.PayByBankPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.PayByBankPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.PayByBankPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.PayByBankPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PaycoPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PaycoPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.PaycoPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.PaycoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.PaycoPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.PaycoPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PaynowPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PaynowPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.PaynowPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.PaynowPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.PaynowPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.PaynowPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PromptpayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PromptpayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.PromptpayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.PromptpayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.PromptpayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.PromptpayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class RevolutPayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private RevolutPayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.RevolutPayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.RevolutPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.RevolutPayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.RevolutPayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SamsungPayPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SamsungPayPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.SamsungPayPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.SamsungPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.SamsungPayPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.SamsungPayPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaBankTransferPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SepaBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .SepaBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaDebitPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SepaDebitPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.SepaDebitPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.SepaDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.SepaDebitPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.SepaDebitPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SwishPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SwishPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.SwishPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.SwishPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.SwishPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.SwishPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class TwintPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private TwintPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.TwintPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.TwintPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.TwintPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.TwintPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class UsBankTransferPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private UsBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments
                build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities
                  .UsBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments#extraParams}
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
             * AccountCreateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ZipPayments {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private ZipPayments(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Merchant.Capabilities.ZipPayments build() {
              return new AccountCreateParams.Configuration.Merchant.Capabilities.ZipPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.ZipPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Capabilities.ZipPayments#extraParams} for
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CardPayments {
        /**
         * Automatically declines certain charge types regardless of whether the card issuer
         * accepted or declined the charge.
         */
        @SerializedName("decline_on")
        DeclineOn declineOn;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private CardPayments(DeclineOn declineOn, Map<String, Object> extraParams) {
          this.declineOn = declineOn;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private DeclineOn declineOn;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Merchant.CardPayments build() {
            return new AccountCreateParams.Configuration.Merchant.CardPayments(
                this.declineOn, this.extraParams);
          }

          /**
           * Automatically declines certain charge types regardless of whether the card issuer
           * accepted or declined the charge.
           */
          public Builder setDeclineOn(
              AccountCreateParams.Configuration.Merchant.CardPayments.DeclineOn declineOn) {
            this.declineOn = declineOn;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Merchant.CardPayments#extraParams}
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
           * map. See {@link AccountCreateParams.Configuration.Merchant.CardPayments#extraParams}
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
        public static class DeclineOn {
          /**
           * Whether Stripe automatically declines charges with an incorrect ZIP or postal code.
           * This setting only applies when a ZIP or postal code is provided and they fail bank
           * verification.
           */
          @SerializedName("avs_failure")
          Boolean avsFailure;

          /**
           * Whether Stripe automatically declines charges with an incorrect CVC. This setting only
           * applies when a CVC is provided and it fails bank verification.
           */
          @SerializedName("cvc_failure")
          Boolean cvcFailure;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private DeclineOn(
              Boolean avsFailure, Boolean cvcFailure, Map<String, Object> extraParams) {
            this.avsFailure = avsFailure;
            this.cvcFailure = cvcFailure;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Boolean avsFailure;

            private Boolean cvcFailure;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Merchant.CardPayments.DeclineOn build() {
              return new AccountCreateParams.Configuration.Merchant.CardPayments.DeclineOn(
                  this.avsFailure, this.cvcFailure, this.extraParams);
            }

            /**
             * Whether Stripe automatically declines charges with an incorrect ZIP or postal code.
             * This setting only applies when a ZIP or postal code is provided and they fail bank
             * verification.
             */
            public Builder setAvsFailure(Boolean avsFailure) {
              this.avsFailure = avsFailure;
              return this;
            }

            /**
             * Whether Stripe automatically declines charges with an incorrect CVC. This setting
             * only applies when a CVC is provided and it fails bank verification.
             */
            public Builder setCvcFailure(Boolean cvcFailure) {
              this.cvcFailure = cvcFailure;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.CardPayments.DeclineOn#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.CardPayments.DeclineOn#extraParams} for
             * the field documentation.
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StatementDescriptor {
        /**
         * The default text that appears on statements for non-card charges outside of Japan. For
         * card charges, if you don’t set a statement_descriptor_prefix, this text is also used as
         * the statement descriptor prefix. In that case, if concatenating the statement descriptor
         * suffix causes the combined statement descriptor to exceed 22 characters, we truncate the
         * statement_descriptor text to limit the full descriptor to 22 characters. For more
         * information about statement descriptors and their requirements, see the Merchant
         * Configuration settings documentation.
         */
        @SerializedName("descriptor")
        String descriptor;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Default text that appears on statements for card charges outside of Japan, prefixing any
         * dynamic statement_descriptor_suffix specified on the charge. To maximize space for the
         * dynamic part of the descriptor, keep this text short. If you don’t specify this value,
         * statement_descriptor is used as the prefix. For more information about statement
         * descriptors and their requirements, see the Merchant Configuration settings
         * documentation.
         */
        @SerializedName("prefix")
        String prefix;

        private StatementDescriptor(
            String descriptor, Map<String, Object> extraParams, String prefix) {
          this.descriptor = descriptor;
          this.extraParams = extraParams;
          this.prefix = prefix;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String descriptor;

          private Map<String, Object> extraParams;

          private String prefix;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Merchant.StatementDescriptor build() {
            return new AccountCreateParams.Configuration.Merchant.StatementDescriptor(
                this.descriptor, this.extraParams, this.prefix);
          }

          /**
           * The default text that appears on statements for non-card charges outside of Japan. For
           * card charges, if you don’t set a statement_descriptor_prefix, this text is also used as
           * the statement descriptor prefix. In that case, if concatenating the statement
           * descriptor suffix causes the combined statement descriptor to exceed 22 characters, we
           * truncate the statement_descriptor text to limit the full descriptor to 22 characters.
           * For more information about statement descriptors and their requirements, see the
           * Merchant Configuration settings documentation.
           */
          public Builder setDescriptor(String descriptor) {
            this.descriptor = descriptor;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Configuration.Merchant.StatementDescriptor#extraParams} for the
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
           * AccountCreateParams.Configuration.Merchant.StatementDescriptor#extraParams} for the
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
           * Default text that appears on statements for card charges outside of Japan, prefixing
           * any dynamic statement_descriptor_suffix specified on the charge. To maximize space for
           * the dynamic part of the descriptor, keep this text short. If you don’t specify this
           * value, statement_descriptor is used as the prefix. For more information about statement
           * descriptors and their requirements, see the Merchant Configuration settings
           * documentation.
           */
          public Builder setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Support {
        /** A publicly available mailing address for sending support issues to. */
        @SerializedName("address")
        Address address;

        /** A publicly available email address for sending support issues to. */
        @SerializedName("email")
        String email;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A publicly available phone number to call with support issues. */
        @SerializedName("phone")
        String phone;

        /** A publicly available website for handling support issues. */
        @SerializedName("url")
        String url;

        private Support(
            Address address,
            String email,
            Map<String, Object> extraParams,
            String phone,
            String url) {
          this.address = address;
          this.email = email;
          this.extraParams = extraParams;
          this.phone = phone;
          this.url = url;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private String email;

          private Map<String, Object> extraParams;

          private String phone;

          private String url;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Merchant.Support build() {
            return new AccountCreateParams.Configuration.Merchant.Support(
                this.address, this.email, this.extraParams, this.phone, this.url);
          }

          /** A publicly available mailing address for sending support issues to. */
          public Builder setAddress(
              AccountCreateParams.Configuration.Merchant.Support.Address address) {
            this.address = address;
            return this;
          }

          /** A publicly available email address for sending support issues to. */
          public Builder setEmail(String email) {
            this.email = email;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Merchant.Support#extraParams} for the
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
           * map. See {@link AccountCreateParams.Configuration.Merchant.Support#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A publicly available phone number to call with support issues. */
          public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
          }

          /** A publicly available website for handling support issues. */
          public Builder setUrl(String url) {
            this.url = url;
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
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;

          private Address(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state,
              String town) {
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
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            private String town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Merchant.Support.Address build() {
              return new AccountCreateParams.Configuration.Merchant.Support.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
            }

            /** City, district, suburb, town, or village. */
            public Builder setCity(String city) {
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Support.Address#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Merchant.Support.Address#extraParams} for the field
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Recipient {
      /** Capabilities to be requested on the Recipient Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Recipient(Capabilities capabilities, Map<String, Object> extraParams) {
        this.capabilities = capabilities;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Capabilities capabilities;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Configuration.Recipient build() {
          return new AccountCreateParams.Configuration.Recipient(
              this.capabilities, this.extraParams);
        }

        /** Capabilities to be requested on the Recipient Configuration. */
        public Builder setCapabilities(
            AccountCreateParams.Configuration.Recipient.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Configuration.Recipient#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Configuration.Recipient#extraParams} for the field
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
      public static class Capabilities {
        /** Capabilities that enable OutboundPayments to a bank account linked to this Account. */
        @SerializedName("bank_accounts")
        BankAccounts bankAccounts;

        /** Capabilities that enable OutboundPayments to a card linked to this Account. */
        @SerializedName("cards")
        Cards cards;

        /** Capabilities that enable OutboundPayments to a crypto wallet linked to this Account. */
        @SerializedName("crypto_wallets")
        CryptoWallets cryptoWallets;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Capabilities that enable the recipient to manage their Stripe Balance (/v1/balance). */
        @SerializedName("stripe_balance")
        StripeBalance stripeBalance;

        private Capabilities(
            BankAccounts bankAccounts,
            Cards cards,
            CryptoWallets cryptoWallets,
            Map<String, Object> extraParams,
            StripeBalance stripeBalance) {
          this.bankAccounts = bankAccounts;
          this.cards = cards;
          this.cryptoWallets = cryptoWallets;
          this.extraParams = extraParams;
          this.stripeBalance = stripeBalance;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BankAccounts bankAccounts;

          private Cards cards;

          private CryptoWallets cryptoWallets;

          private Map<String, Object> extraParams;

          private StripeBalance stripeBalance;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Recipient.Capabilities build() {
            return new AccountCreateParams.Configuration.Recipient.Capabilities(
                this.bankAccounts,
                this.cards,
                this.cryptoWallets,
                this.extraParams,
                this.stripeBalance);
          }

          /** Capabilities that enable OutboundPayments to a bank account linked to this Account. */
          public Builder setBankAccounts(
              AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts bankAccounts) {
            this.bankAccounts = bankAccounts;
            return this;
          }

          /** Capabilities that enable OutboundPayments to a card linked to this Account. */
          public Builder setCards(
              AccountCreateParams.Configuration.Recipient.Capabilities.Cards cards) {
            this.cards = cards;
            return this;
          }

          /**
           * Capabilities that enable OutboundPayments to a crypto wallet linked to this Account.
           */
          public Builder setCryptoWallets(
              AccountCreateParams.Configuration.Recipient.Capabilities.CryptoWallets
                  cryptoWallets) {
            this.cryptoWallets = cryptoWallets;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Recipient.Capabilities#extraParams}
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
           * map. See {@link AccountCreateParams.Configuration.Recipient.Capabilities#extraParams}
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
           * Capabilities that enable the recipient to manage their Stripe Balance (/v1/balance).
           */
          public Builder setStripeBalance(
              AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance
                  stripeBalance) {
            this.stripeBalance = stripeBalance;
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
            public AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts build() {
              return new AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts(
                  this.extraParams, this.local, this.wire);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts#extraParams}
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
             * AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts#extraParams}
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
                AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Local local) {
              this.local = local;
              return this;
            }

            /**
             * Enables this Account to receive OutboundPayments to linked bank accounts over wire.
             */
            public Builder setWire(
                AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire wire) {
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

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
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
              public AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Local
                  build() {
                return new AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts
                    .Local(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Local#extraParams}
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
               * AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Local#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
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

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
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
              public AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire
                  build() {
                return new AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts
                    .Wire(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire#extraParams}
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
               * AccountCreateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
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

          /**
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
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
            public AccountCreateParams.Configuration.Recipient.Capabilities.Cards build() {
              return new AccountCreateParams.Configuration.Recipient.Capabilities.Cards(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Recipient.Capabilities.Cards#extraParams} for the
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
             * AccountCreateParams.Configuration.Recipient.Capabilities.Cards#extraParams} for the
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CryptoWallets {
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
           * <strong>Required.</strong> To request a new Capability for an account, pass true. There
           * can be a delay before the requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CryptoWallets(Map<String, Object> extraParams, Boolean requested) {
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
            public AccountCreateParams.Configuration.Recipient.Capabilities.CryptoWallets build() {
              return new AccountCreateParams.Configuration.Recipient.Capabilities.CryptoWallets(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Recipient.Capabilities.CryptoWallets#extraParams}
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
             * AccountCreateParams.Configuration.Recipient.Capabilities.CryptoWallets#extraParams}
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
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class StripeBalance {
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
           * Allows the account to receive /v1/transfers into their Stripe Balance (/v1/balance).
           */
          @SerializedName("stripe_transfers")
          StripeTransfers stripeTransfers;

          private StripeBalance(Map<String, Object> extraParams, StripeTransfers stripeTransfers) {
            this.extraParams = extraParams;
            this.stripeTransfers = stripeTransfers;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private StripeTransfers stripeTransfers;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance build() {
              return new AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance(
                  this.extraParams, this.stripeTransfers);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance#extraParams}
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
             * AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance#extraParams}
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
             * Allows the account to receive /v1/transfers into their Stripe Balance (/v1/balance).
             */
            public Builder setStripeTransfers(
                AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance
                        .StripeTransfers
                    stripeTransfers) {
              this.stripeTransfers = stripeTransfers;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class StripeTransfers {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private StripeTransfers(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance
                      .StripeTransfers
                  build() {
                return new AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance
                    .StripeTransfers(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance.StripeTransfers#extraParams}
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
               * AccountCreateParams.Configuration.Recipient.Capabilities.StripeBalance.StripeTransfers#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
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
    public static class Storer {
      /** Capabilities to request on the Storer Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Storer(Capabilities capabilities, Map<String, Object> extraParams) {
        this.capabilities = capabilities;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Capabilities capabilities;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Configuration.Storer build() {
          return new AccountCreateParams.Configuration.Storer(this.capabilities, this.extraParams);
        }

        /** Capabilities to request on the Storer Configuration. */
        public Builder setCapabilities(
            AccountCreateParams.Configuration.Storer.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Configuration.Storer#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Configuration.Storer#extraParams} for the field
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
      public static class Capabilities {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Can provision a financial address to credit/debit a FinancialAccount. */
        @SerializedName("financial_addresses")
        FinancialAddresses financialAddresses;

        /** Can hold storage-type funds on Stripe. */
        @SerializedName("holds_currencies")
        HoldsCurrencies holdsCurrencies;

        /** Can pull funds from an external source, owned by yourself, to a FinancialAccount. */
        @SerializedName("inbound_transfers")
        InboundTransfers inboundTransfers;

        /** Can send funds from a FinancialAccount to a destination owned by someone else. */
        @SerializedName("outbound_payments")
        OutboundPayments outboundPayments;

        /** Can send funds from a FinancialAccount to a destination owned by yourself. */
        @SerializedName("outbound_transfers")
        OutboundTransfers outboundTransfers;

        private Capabilities(
            Map<String, Object> extraParams,
            FinancialAddresses financialAddresses,
            HoldsCurrencies holdsCurrencies,
            InboundTransfers inboundTransfers,
            OutboundPayments outboundPayments,
            OutboundTransfers outboundTransfers) {
          this.extraParams = extraParams;
          this.financialAddresses = financialAddresses;
          this.holdsCurrencies = holdsCurrencies;
          this.inboundTransfers = inboundTransfers;
          this.outboundPayments = outboundPayments;
          this.outboundTransfers = outboundTransfers;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private FinancialAddresses financialAddresses;

          private HoldsCurrencies holdsCurrencies;

          private InboundTransfers inboundTransfers;

          private OutboundPayments outboundPayments;

          private OutboundTransfers outboundTransfers;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Configuration.Storer.Capabilities build() {
            return new AccountCreateParams.Configuration.Storer.Capabilities(
                this.extraParams,
                this.financialAddresses,
                this.holdsCurrencies,
                this.inboundTransfers,
                this.outboundPayments,
                this.outboundTransfers);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Configuration.Storer.Capabilities#extraParams} for
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
           * map. See {@link AccountCreateParams.Configuration.Storer.Capabilities#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Can provision a financial address to credit/debit a FinancialAccount. */
          public Builder setFinancialAddresses(
              AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses
                  financialAddresses) {
            this.financialAddresses = financialAddresses;
            return this;
          }

          /** Can hold storage-type funds on Stripe. */
          public Builder setHoldsCurrencies(
              AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies
                  holdsCurrencies) {
            this.holdsCurrencies = holdsCurrencies;
            return this;
          }

          /** Can pull funds from an external source, owned by yourself, to a FinancialAccount. */
          public Builder setInboundTransfers(
              AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers
                  inboundTransfers) {
            this.inboundTransfers = inboundTransfers;
            return this;
          }

          /** Can send funds from a FinancialAccount to a destination owned by someone else. */
          public Builder setOutboundPayments(
              AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                  outboundPayments) {
            this.outboundPayments = outboundPayments;
            return this;
          }

          /** Can send funds from a FinancialAccount to a destination owned by yourself. */
          public Builder setOutboundTransfers(
              AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers
                  outboundTransfers) {
            this.outboundTransfers = outboundTransfers;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class FinancialAddresses {
          /**
           * Can provision a bank-account-like financial address (VBAN) to credit/debit a
           * FinancialAccount.
           */
          @SerializedName("bank_accounts")
          BankAccounts bankAccounts;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private FinancialAddresses(BankAccounts bankAccounts, Map<String, Object> extraParams) {
            this.bankAccounts = bankAccounts;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BankAccounts bankAccounts;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses
                build() {
              return new AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses(
                  this.bankAccounts, this.extraParams);
            }

            /**
             * Can provision a bank-account-like financial address (VBAN) to credit/debit a
             * FinancialAccount.
             */
            public Builder setBankAccounts(
                AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses
                        .BankAccounts
                    bankAccounts) {
              this.bankAccounts = bankAccounts;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses#extraParams}
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
             * AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses#extraParams}
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
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private BankAccounts(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses
                      .BankAccounts
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses
                    .BankAccounts(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses.BankAccounts#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.FinancialAddresses.BankAccounts#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class HoldsCurrencies {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Can hold storage-type funds on Stripe in GBP. */
          @SerializedName("gbp")
          Gbp gbp;

          /** Can hold storage-type funds on Stripe in USD. */
          @SerializedName("usd")
          Usd usd;

          private HoldsCurrencies(Map<String, Object> extraParams, Gbp gbp, Usd usd) {
            this.extraParams = extraParams;
            this.gbp = gbp;
            this.usd = usd;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Gbp gbp;

            private Usd usd;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies build() {
              return new AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies(
                  this.extraParams, this.gbp, this.usd);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies#extraParams}
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
             * AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Can hold storage-type funds on Stripe in GBP. */
            public Builder setGbp(
                AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Gbp gbp) {
              this.gbp = gbp;
              return this;
            }

            /** Can hold storage-type funds on Stripe in USD. */
            public Builder setUsd(
                AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Usd usd) {
              this.usd = usd;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Gbp {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private Gbp(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Gbp
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies
                    .Gbp(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Gbp#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Gbp#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Usd {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private Usd(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Usd
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies
                    .Usd(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Usd#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.HoldsCurrencies.Usd#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class InboundTransfers {
          /**
           * Can pull funds from an external bank account owned by yourself to a FinancialAccount.
           */
          @SerializedName("bank_accounts")
          BankAccounts bankAccounts;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private InboundTransfers(BankAccounts bankAccounts, Map<String, Object> extraParams) {
            this.bankAccounts = bankAccounts;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BankAccounts bankAccounts;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers build() {
              return new AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers(
                  this.bankAccounts, this.extraParams);
            }

            /**
             * Can pull funds from an external bank account owned by yourself to a FinancialAccount.
             */
            public Builder setBankAccounts(
                AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers.BankAccounts
                    bankAccounts) {
              this.bankAccounts = bankAccounts;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers#extraParams}
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
             * AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers#extraParams}
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
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private BankAccounts(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers
                      .BankAccounts
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers
                    .BankAccounts(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers.BankAccounts#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.InboundTransfers.BankAccounts#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class OutboundPayments {
          /** Can send funds from a FinancialAccount to a bank account owned by someone else. */
          @SerializedName("bank_accounts")
          BankAccounts bankAccounts;

          /** Can send funds from a FinancialAccount to a debit card owned by someone else. */
          @SerializedName("cards")
          Cards cards;

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
           * Can send funds from a FinancialAccount to another FinancialAccount owned by someone
           * else.
           */
          @SerializedName("financial_accounts")
          FinancialAccounts financialAccounts;

          private OutboundPayments(
              BankAccounts bankAccounts,
              Cards cards,
              Map<String, Object> extraParams,
              FinancialAccounts financialAccounts) {
            this.bankAccounts = bankAccounts;
            this.cards = cards;
            this.extraParams = extraParams;
            this.financialAccounts = financialAccounts;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BankAccounts bankAccounts;

            private Cards cards;

            private Map<String, Object> extraParams;

            private FinancialAccounts financialAccounts;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments build() {
              return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments(
                  this.bankAccounts, this.cards, this.extraParams, this.financialAccounts);
            }

            /** Can send funds from a FinancialAccount to a bank account owned by someone else. */
            public Builder setBankAccounts(
                AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.BankAccounts
                    bankAccounts) {
              this.bankAccounts = bankAccounts;
              return this;
            }

            /** Can send funds from a FinancialAccount to a debit card owned by someone else. */
            public Builder setCards(
                AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.Cards
                    cards) {
              this.cards = cards;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments#extraParams}
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
             * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments#extraParams}
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
             * Can send funds from a FinancialAccount to another FinancialAccount owned by someone
             * else.
             */
            public Builder setFinancialAccounts(
                AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                        .FinancialAccounts
                    financialAccounts) {
              this.financialAccounts = financialAccounts;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class BankAccounts {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private BankAccounts(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                      .BankAccounts
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                    .BankAccounts(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.BankAccounts#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.BankAccounts#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Cards {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
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
              public AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.Cards
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                    .Cards(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.Cards#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.Cards#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FinancialAccounts {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private FinancialAccounts(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                      .FinancialAccounts
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments
                    .FinancialAccounts(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.FinancialAccounts#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundPayments.FinancialAccounts#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class OutboundTransfers {
          /** Can send funds from a FinancialAccount to a bank account owned by yourself. */
          @SerializedName("bank_accounts")
          BankAccounts bankAccounts;

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
           * Can send funds from a FinancialAccount to another FinancialAccount owned by yourself.
           */
          @SerializedName("financial_accounts")
          FinancialAccounts financialAccounts;

          private OutboundTransfers(
              BankAccounts bankAccounts,
              Map<String, Object> extraParams,
              FinancialAccounts financialAccounts) {
            this.bankAccounts = bankAccounts;
            this.extraParams = extraParams;
            this.financialAccounts = financialAccounts;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BankAccounts bankAccounts;

            private Map<String, Object> extraParams;

            private FinancialAccounts financialAccounts;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers build() {
              return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers(
                  this.bankAccounts, this.extraParams, this.financialAccounts);
            }

            /** Can send funds from a FinancialAccount to a bank account owned by yourself. */
            public Builder setBankAccounts(
                AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers.BankAccounts
                    bankAccounts) {
              this.bankAccounts = bankAccounts;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers#extraParams}
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
             * AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers#extraParams}
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
             * Can send funds from a FinancialAccount to another FinancialAccount owned by yourself.
             */
            public Builder setFinancialAccounts(
                AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers
                        .FinancialAccounts
                    financialAccounts) {
              this.financialAccounts = financialAccounts;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class BankAccounts {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private BankAccounts(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers
                      .BankAccounts
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers
                    .BankAccounts(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers.BankAccounts#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers.BankAccounts#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FinancialAccounts {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> To request a new Capability for an account, pass true.
             * There can be a delay before the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private FinancialAccounts(Map<String, Object> extraParams, Boolean requested) {
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
              public AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers
                      .FinancialAccounts
                  build() {
                return new AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers
                    .FinancialAccounts(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers.FinancialAccounts#extraParams}
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
               * AccountCreateParams.Configuration.Storer.Capabilities.OutboundTransfers.FinancialAccounts#extraParams}
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
               * <strong>Required.</strong> To request a new Capability for an account, pass true.
               * There can be a delay before the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Defaults {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The Account's preferred locales (languages), ordered by preference. */
    @SerializedName("locales")
    List<AccountCreateParams.Defaults.Locale> locales;

    /** Account profile information. */
    @SerializedName("profile")
    Profile profile;

    /** Default responsibilities held by either Stripe or the platform. */
    @SerializedName("responsibilities")
    Responsibilities responsibilities;

    private Defaults(
        String currency,
        Map<String, Object> extraParams,
        List<AccountCreateParams.Defaults.Locale> locales,
        Profile profile,
        Responsibilities responsibilities) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.locales = locales;
      this.profile = profile;
      this.responsibilities = responsibilities;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private List<AccountCreateParams.Defaults.Locale> locales;

      private Profile profile;

      private Responsibilities responsibilities;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Defaults build() {
        return new AccountCreateParams.Defaults(
            this.currency, this.extraParams, this.locales, this.profile, this.responsibilities);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Defaults#extraParams} for the field documentation.
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
       * See {@link AccountCreateParams.Defaults#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `locales` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AccountCreateParams.Defaults#locales} for the field documentation.
       */
      public Builder addLocale(AccountCreateParams.Defaults.Locale element) {
        if (this.locales == null) {
          this.locales = new ArrayList<>();
        }
        this.locales.add(element);
        return this;
      }

      /**
       * Add all elements to `locales` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AccountCreateParams.Defaults#locales} for the field documentation.
       */
      public Builder addAllLocale(List<AccountCreateParams.Defaults.Locale> elements) {
        if (this.locales == null) {
          this.locales = new ArrayList<>();
        }
        this.locales.addAll(elements);
        return this;
      }

      /** Account profile information. */
      public Builder setProfile(AccountCreateParams.Defaults.Profile profile) {
        this.profile = profile;
        return this;
      }

      /** Default responsibilities held by either Stripe or the platform. */
      public Builder setResponsibilities(
          AccountCreateParams.Defaults.Responsibilities responsibilities) {
        this.responsibilities = responsibilities;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Profile {
      /** The business's publicly-available website. */
      @SerializedName("business_url")
      String businessUrl;

      /** The name which is used by the business. */
      @SerializedName("doing_business_as")
      String doingBusinessAs;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Internal-only description of the product sold or service provided by the business. It's
       * used by Stripe for risk and underwriting purposes.
       */
      @SerializedName("product_description")
      String productDescription;

      private Profile(
          String businessUrl,
          String doingBusinessAs,
          Map<String, Object> extraParams,
          String productDescription) {
        this.businessUrl = businessUrl;
        this.doingBusinessAs = doingBusinessAs;
        this.extraParams = extraParams;
        this.productDescription = productDescription;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String businessUrl;

        private String doingBusinessAs;

        private Map<String, Object> extraParams;

        private String productDescription;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Defaults.Profile build() {
          return new AccountCreateParams.Defaults.Profile(
              this.businessUrl, this.doingBusinessAs, this.extraParams, this.productDescription);
        }

        /** The business's publicly-available website. */
        public Builder setBusinessUrl(String businessUrl) {
          this.businessUrl = businessUrl;
          return this;
        }

        /** The name which is used by the business. */
        public Builder setDoingBusinessAs(String doingBusinessAs) {
          this.doingBusinessAs = doingBusinessAs;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Defaults.Profile#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Defaults.Profile#extraParams} for the field
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
         * Internal-only description of the product sold or service provided by the business. It's
         * used by Stripe for risk and underwriting purposes.
         */
        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Responsibilities {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> A value indicating the party responsible for collecting fees
       * from this account.
       */
      @SerializedName("fees_collector")
      FeesCollector feesCollector;

      /**
       * <strong>Required.</strong> A value indicating who is responsible for losses when this
       * Account can’t pay back negative balances from payments.
       */
      @SerializedName("losses_collector")
      LossesCollector lossesCollector;

      private Responsibilities(
          Map<String, Object> extraParams,
          FeesCollector feesCollector,
          LossesCollector lossesCollector) {
        this.extraParams = extraParams;
        this.feesCollector = feesCollector;
        this.lossesCollector = lossesCollector;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FeesCollector feesCollector;

        private LossesCollector lossesCollector;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Defaults.Responsibilities build() {
          return new AccountCreateParams.Defaults.Responsibilities(
              this.extraParams, this.feesCollector, this.lossesCollector);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Defaults.Responsibilities#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Defaults.Responsibilities#extraParams} for the field
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
         * <strong>Required.</strong> A value indicating the party responsible for collecting fees
         * from this account.
         */
        public Builder setFeesCollector(
            AccountCreateParams.Defaults.Responsibilities.FeesCollector feesCollector) {
          this.feesCollector = feesCollector;
          return this;
        }

        /**
         * <strong>Required.</strong> A value indicating who is responsible for losses when this
         * Account can’t pay back negative balances from payments.
         */
        public Builder setLossesCollector(
            AccountCreateParams.Defaults.Responsibilities.LossesCollector lossesCollector) {
          this.lossesCollector = lossesCollector;
          return this;
        }
      }

      public enum FeesCollector implements ApiRequestParams.EnumParam {
        @SerializedName("application")
        APPLICATION("application"),

        @SerializedName("stripe")
        STRIPE("stripe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        FeesCollector(String value) {
          this.value = value;
        }
      }

      public enum LossesCollector implements ApiRequestParams.EnumParam {
        @SerializedName("application")
        APPLICATION("application"),

        @SerializedName("stripe")
        STRIPE("stripe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        LossesCollector(String value) {
          this.value = value;
        }
      }
    }

    public enum Locale implements ApiRequestParams.EnumParam {
      @SerializedName("ar-SA")
      AR_SA("ar-SA"),

      @SerializedName("bg")
      BG("bg"),

      @SerializedName("bg-BG")
      BG_BG("bg-BG"),

      @SerializedName("cs")
      CS("cs"),

      @SerializedName("cs-CZ")
      CS_CZ("cs-CZ"),

      @SerializedName("da")
      DA("da"),

      @SerializedName("da-DK")
      DA_DK("da-DK"),

      @SerializedName("de")
      DE("de"),

      @SerializedName("de-DE")
      DE_DE("de-DE"),

      @SerializedName("el")
      EL("el"),

      @SerializedName("el-GR")
      EL_GR("el-GR"),

      @SerializedName("en")
      EN("en"),

      @SerializedName("en-AU")
      EN_AU("en-AU"),

      @SerializedName("en-CA")
      EN_CA("en-CA"),

      @SerializedName("en-GB")
      EN_GB("en-GB"),

      @SerializedName("en-IE")
      EN_IE("en-IE"),

      @SerializedName("en-IN")
      EN_IN("en-IN"),

      @SerializedName("en-NZ")
      EN_NZ("en-NZ"),

      @SerializedName("en-SG")
      EN_SG("en-SG"),

      @SerializedName("en-US")
      EN_US("en-US"),

      @SerializedName("es")
      ES("es"),

      @SerializedName("es-419")
      ES_419("es-419"),

      @SerializedName("es-ES")
      ES_ES("es-ES"),

      @SerializedName("et")
      ET("et"),

      @SerializedName("et-EE")
      ET_EE("et-EE"),

      @SerializedName("fi")
      FI("fi"),

      @SerializedName("fil")
      FIL("fil"),

      @SerializedName("fil-PH")
      FIL_PH("fil-PH"),

      @SerializedName("fi-FI")
      FI_FI("fi-FI"),

      @SerializedName("fr")
      FR("fr"),

      @SerializedName("fr-CA")
      FR_CA("fr-CA"),

      @SerializedName("fr-FR")
      FR_FR("fr-FR"),

      @SerializedName("he-IL")
      HE_IL("he-IL"),

      @SerializedName("hr")
      HR("hr"),

      @SerializedName("hr-HR")
      HR_HR("hr-HR"),

      @SerializedName("hu")
      HU("hu"),

      @SerializedName("hu-HU")
      HU_HU("hu-HU"),

      @SerializedName("id")
      ID("id"),

      @SerializedName("id-ID")
      ID_ID("id-ID"),

      @SerializedName("it")
      IT("it"),

      @SerializedName("it-IT")
      IT_IT("it-IT"),

      @SerializedName("ja")
      JA("ja"),

      @SerializedName("ja-JP")
      JA_JP("ja-JP"),

      @SerializedName("ko")
      KO("ko"),

      @SerializedName("ko-KR")
      KO_KR("ko-KR"),

      @SerializedName("lt")
      LT("lt"),

      @SerializedName("lt-LT")
      LT_LT("lt-LT"),

      @SerializedName("lv")
      LV("lv"),

      @SerializedName("lv-LV")
      LV_LV("lv-LV"),

      @SerializedName("ms")
      MS("ms"),

      @SerializedName("ms-MY")
      MS_MY("ms-MY"),

      @SerializedName("mt")
      MT("mt"),

      @SerializedName("mt-MT")
      MT_MT("mt-MT"),

      @SerializedName("nb")
      NB("nb"),

      @SerializedName("nb-NO")
      NB_NO("nb-NO"),

      @SerializedName("nl")
      NL("nl"),

      @SerializedName("nl-NL")
      NL_NL("nl-NL"),

      @SerializedName("pl")
      PL("pl"),

      @SerializedName("pl-PL")
      PL_PL("pl-PL"),

      @SerializedName("pt")
      PT("pt"),

      @SerializedName("pt-BR")
      PT_BR("pt-BR"),

      @SerializedName("pt-PT")
      PT_PT("pt-PT"),

      @SerializedName("ro")
      RO("ro"),

      @SerializedName("ro-RO")
      RO_RO("ro-RO"),

      @SerializedName("ru")
      RU("ru"),

      @SerializedName("ru-RU")
      RU_RU("ru-RU"),

      @SerializedName("sk")
      SK("sk"),

      @SerializedName("sk-SK")
      SK_SK("sk-SK"),

      @SerializedName("sl")
      SL("sl"),

      @SerializedName("sl-SI")
      SL_SI("sl-SI"),

      @SerializedName("sv")
      SV("sv"),

      @SerializedName("sv-SE")
      SV_SE("sv-SE"),

      @SerializedName("th")
      TH("th"),

      @SerializedName("th-TH")
      TH_TH("th-TH"),

      @SerializedName("tr")
      TR("tr"),

      @SerializedName("tr-TR")
      TR_TR("tr-TR"),

      @SerializedName("vi")
      VI("vi"),

      @SerializedName("vi-VN")
      VI_VN("vi-VN"),

      @SerializedName("zh")
      ZH("zh"),

      @SerializedName("zh-Hans")
      ZH_HANS("zh-Hans"),

      @SerializedName("zh-Hant-HK")
      ZH_HANT_HK("zh-Hant-HK"),

      @SerializedName("zh-Hant-TW")
      ZH_HANT_TW("zh-Hant-TW"),

      @SerializedName("zh-HK")
      ZH_HK("zh-HK"),

      @SerializedName("zh-TW")
      ZH_TW("zh-TW");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Locale(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Identity {
    /**
     * Attestations from the identity's key people, e.g. owners, executives, directors,
     * representatives.
     */
    @SerializedName("attestations")
    Attestations attestations;

    /** Information about the company or business. */
    @SerializedName("business_details")
    BusinessDetails businessDetails;

    /**
     * The country in which the account holder resides, or in which the business is legally
     * established. This should be an <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a> country code.
     */
    @SerializedName("country")
    String country;

    /** The entity type. */
    @SerializedName("entity_type")
    EntityType entityType;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Information about the person represented by the account. */
    @SerializedName("individual")
    Individual individual;

    private Identity(
        Attestations attestations,
        BusinessDetails businessDetails,
        String country,
        EntityType entityType,
        Map<String, Object> extraParams,
        Individual individual) {
      this.attestations = attestations;
      this.businessDetails = businessDetails;
      this.country = country;
      this.entityType = entityType;
      this.extraParams = extraParams;
      this.individual = individual;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Attestations attestations;

      private BusinessDetails businessDetails;

      private String country;

      private EntityType entityType;

      private Map<String, Object> extraParams;

      private Individual individual;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Identity build() {
        return new AccountCreateParams.Identity(
            this.attestations,
            this.businessDetails,
            this.country,
            this.entityType,
            this.extraParams,
            this.individual);
      }

      /**
       * Attestations from the identity's key people, e.g. owners, executives, directors,
       * representatives.
       */
      public Builder setAttestations(AccountCreateParams.Identity.Attestations attestations) {
        this.attestations = attestations;
        return this;
      }

      /** Information about the company or business. */
      public Builder setBusinessDetails(
          AccountCreateParams.Identity.BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
        return this;
      }

      /**
       * The country in which the account holder resides, or in which the business is legally
       * established. This should be an <a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> country
       * code.
       */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /** The entity type. */
      public Builder setEntityType(AccountCreateParams.Identity.EntityType entityType) {
        this.entityType = entityType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Identity#extraParams} for the field documentation.
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
       * See {@link AccountCreateParams.Identity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Information about the person represented by the account. */
      public Builder setIndividual(AccountCreateParams.Identity.Individual individual) {
        this.individual = individual;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Attestations {
      /**
       * This hash is used to attest that the directors information provided to Stripe is both
       * current and correct.
       */
      @SerializedName("directorship_declaration")
      DirectorshipDeclaration directorshipDeclaration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * This hash is used to attest that the beneficial owner information provided to Stripe is
       * both current and correct.
       */
      @SerializedName("ownership_declaration")
      OwnershipDeclaration ownershipDeclaration;

      /** Attestation that all Persons with a specific Relationship value have been provided. */
      @SerializedName("persons_provided")
      PersonsProvided personsProvided;

      /**
       * This hash is used to attest that the representative is authorized to act as the
       * representative of their legal entity.
       */
      @SerializedName("representative_declaration")
      RepresentativeDeclaration representativeDeclaration;

      /** Attestations of accepted terms of service agreements. */
      @SerializedName("terms_of_service")
      TermsOfService termsOfService;

      private Attestations(
          DirectorshipDeclaration directorshipDeclaration,
          Map<String, Object> extraParams,
          OwnershipDeclaration ownershipDeclaration,
          PersonsProvided personsProvided,
          RepresentativeDeclaration representativeDeclaration,
          TermsOfService termsOfService) {
        this.directorshipDeclaration = directorshipDeclaration;
        this.extraParams = extraParams;
        this.ownershipDeclaration = ownershipDeclaration;
        this.personsProvided = personsProvided;
        this.representativeDeclaration = representativeDeclaration;
        this.termsOfService = termsOfService;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DirectorshipDeclaration directorshipDeclaration;

        private Map<String, Object> extraParams;

        private OwnershipDeclaration ownershipDeclaration;

        private PersonsProvided personsProvided;

        private RepresentativeDeclaration representativeDeclaration;

        private TermsOfService termsOfService;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Identity.Attestations build() {
          return new AccountCreateParams.Identity.Attestations(
              this.directorshipDeclaration,
              this.extraParams,
              this.ownershipDeclaration,
              this.personsProvided,
              this.representativeDeclaration,
              this.termsOfService);
        }

        /**
         * This hash is used to attest that the directors information provided to Stripe is both
         * current and correct.
         */
        public Builder setDirectorshipDeclaration(
            AccountCreateParams.Identity.Attestations.DirectorshipDeclaration
                directorshipDeclaration) {
          this.directorshipDeclaration = directorshipDeclaration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Identity.Attestations#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Identity.Attestations#extraParams} for the field
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
         * This hash is used to attest that the beneficial owner information provided to Stripe is
         * both current and correct.
         */
        public Builder setOwnershipDeclaration(
            AccountCreateParams.Identity.Attestations.OwnershipDeclaration ownershipDeclaration) {
          this.ownershipDeclaration = ownershipDeclaration;
          return this;
        }

        /** Attestation that all Persons with a specific Relationship value have been provided. */
        public Builder setPersonsProvided(
            AccountCreateParams.Identity.Attestations.PersonsProvided personsProvided) {
          this.personsProvided = personsProvided;
          return this;
        }

        /**
         * This hash is used to attest that the representative is authorized to act as the
         * representative of their legal entity.
         */
        public Builder setRepresentativeDeclaration(
            AccountCreateParams.Identity.Attestations.RepresentativeDeclaration
                representativeDeclaration) {
          this.representativeDeclaration = representativeDeclaration;
          return this;
        }

        /** Attestations of accepted terms of service agreements. */
        public Builder setTermsOfService(
            AccountCreateParams.Identity.Attestations.TermsOfService termsOfService) {
          this.termsOfService = termsOfService;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DirectorshipDeclaration {
        /**
         * The time marking when the director attestation was made. Represented as a RFC 3339 date
         * &amp; time UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the director attestation was made. */
        @SerializedName("ip")
        String ip;

        /** The user agent of the browser from which the director attestation was made. */
        @SerializedName("user_agent")
        String userAgent;

        private DirectorshipDeclaration(
            Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Instant date;

          private Map<String, Object> extraParams;

          private String ip;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Attestations.DirectorshipDeclaration build() {
            return new AccountCreateParams.Identity.Attestations.DirectorshipDeclaration(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The time marking when the director attestation was made. Represented as a RFC 3339 date
           * &amp; time UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
           */
          public Builder setDate(Instant date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Identity.Attestations.DirectorshipDeclaration#extraParams} for the
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
           * AccountCreateParams.Identity.Attestations.DirectorshipDeclaration#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the director attestation was made. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The user agent of the browser from which the director attestation was made. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class OwnershipDeclaration {
        /**
         * The time marking when the beneficial owner attestation was made. Represented as a RFC
         * 3339 date &amp; time UTC value in millisecond precision, for example:
         * 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the beneficial owner attestation was made. */
        @SerializedName("ip")
        String ip;

        /** The user agent of the browser from which the beneficial owner attestation was made. */
        @SerializedName("user_agent")
        String userAgent;

        private OwnershipDeclaration(
            Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Instant date;

          private Map<String, Object> extraParams;

          private String ip;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Attestations.OwnershipDeclaration build() {
            return new AccountCreateParams.Identity.Attestations.OwnershipDeclaration(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The time marking when the beneficial owner attestation was made. Represented as a RFC
           * 3339 date &amp; time UTC value in millisecond precision, for example:
           * 2022-09-18T13:22:18.123Z.
           */
          public Builder setDate(Instant date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Identity.Attestations.OwnershipDeclaration#extraParams} for the
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
           * AccountCreateParams.Identity.Attestations.OwnershipDeclaration#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the beneficial owner attestation was made. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The user agent of the browser from which the beneficial owner attestation was made. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PersonsProvided {
        /**
         * Whether the company’s directors have been provided. Set this Boolean to true after
         * creating all the company’s directors with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("directors")
        Boolean directors;

        /**
         * Whether the company’s executives have been provided. Set this Boolean to true after
         * creating all the company’s executives with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("executives")
        Boolean executives;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Whether the company’s owners have been provided. Set this Boolean to true after creating
         * all the company’s owners with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("owners")
        Boolean owners;

        /** Reason for why the company is exempt from providing ownership information. */
        @SerializedName("ownership_exemption_reason")
        OwnershipExemptionReason ownershipExemptionReason;

        private PersonsProvided(
            Boolean directors,
            Boolean executives,
            Map<String, Object> extraParams,
            Boolean owners,
            OwnershipExemptionReason ownershipExemptionReason) {
          this.directors = directors;
          this.executives = executives;
          this.extraParams = extraParams;
          this.owners = owners;
          this.ownershipExemptionReason = ownershipExemptionReason;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean directors;

          private Boolean executives;

          private Map<String, Object> extraParams;

          private Boolean owners;

          private OwnershipExemptionReason ownershipExemptionReason;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Attestations.PersonsProvided build() {
            return new AccountCreateParams.Identity.Attestations.PersonsProvided(
                this.directors,
                this.executives,
                this.extraParams,
                this.owners,
                this.ownershipExemptionReason);
          }

          /**
           * Whether the company’s directors have been provided. Set this Boolean to true after
           * creating all the company’s directors with the <a
           * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
           */
          public Builder setDirectors(Boolean directors) {
            this.directors = directors;
            return this;
          }

          /**
           * Whether the company’s executives have been provided. Set this Boolean to true after
           * creating all the company’s executives with the <a
           * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
           */
          public Builder setExecutives(Boolean executives) {
            this.executives = executives;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Attestations.PersonsProvided#extraParams}
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
           * map. See {@link AccountCreateParams.Identity.Attestations.PersonsProvided#extraParams}
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
           * Whether the company’s owners have been provided. Set this Boolean to true after
           * creating all the company’s owners with the <a
           * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
           */
          public Builder setOwners(Boolean owners) {
            this.owners = owners;
            return this;
          }

          /** Reason for why the company is exempt from providing ownership information. */
          public Builder setOwnershipExemptionReason(
              AccountCreateParams.Identity.Attestations.PersonsProvided.OwnershipExemptionReason
                  ownershipExemptionReason) {
            this.ownershipExemptionReason = ownershipExemptionReason;
            return this;
          }
        }

        public enum OwnershipExemptionReason implements ApiRequestParams.EnumParam {
          @SerializedName("qualified_entity_exceeds_ownership_threshold")
          QUALIFIED_ENTITY_EXCEEDS_OWNERSHIP_THRESHOLD(
              "qualified_entity_exceeds_ownership_threshold"),

          @SerializedName("qualifies_as_financial_institution")
          QUALIFIES_AS_FINANCIAL_INSTITUTION("qualifies_as_financial_institution");

          @Getter(onMethod_ = {@Override})
          private final String value;

          OwnershipExemptionReason(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class RepresentativeDeclaration {
        /**
         * The time marking when the representative attestation was made. Represented as a RFC 3339
         * date &amp; time UTC value in millisecond precision, for example:
         * 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the representative attestation was made. */
        @SerializedName("ip")
        String ip;

        /** The user agent of the browser from which the representative attestation was made. */
        @SerializedName("user_agent")
        String userAgent;

        private RepresentativeDeclaration(
            Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Instant date;

          private Map<String, Object> extraParams;

          private String ip;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Attestations.RepresentativeDeclaration build() {
            return new AccountCreateParams.Identity.Attestations.RepresentativeDeclaration(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The time marking when the representative attestation was made. Represented as a RFC
           * 3339 date &amp; time UTC value in millisecond precision, for example:
           * 2022-09-18T13:22:18.123Z.
           */
          public Builder setDate(Instant date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Identity.Attestations.RepresentativeDeclaration#extraParams} for
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
           * AccountCreateParams.Identity.Attestations.RepresentativeDeclaration#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the representative attestation was made. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The user agent of the browser from which the representative attestation was made. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class TermsOfService {
        /**
         * Details on the Account's acceptance of the <a
         * href="https://docs.stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
         * Agreement</a>.
         */
        @SerializedName("account")
        Account account;

        /** Details on the Account's acceptance of Issuing-specific terms of service. */
        @SerializedName("card_creator")
        CardCreator cardCreator;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details on the Account's acceptance of Treasury-specific terms of service. */
        @SerializedName("storer")
        Storer storer;

        private TermsOfService(
            Account account,
            CardCreator cardCreator,
            Map<String, Object> extraParams,
            Storer storer) {
          this.account = account;
          this.cardCreator = cardCreator;
          this.extraParams = extraParams;
          this.storer = storer;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Account account;

          private CardCreator cardCreator;

          private Map<String, Object> extraParams;

          private Storer storer;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Attestations.TermsOfService build() {
            return new AccountCreateParams.Identity.Attestations.TermsOfService(
                this.account, this.cardCreator, this.extraParams, this.storer);
          }

          /**
           * Details on the Account's acceptance of the <a
           * href="https://docs.stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
           * Agreement</a>.
           */
          public Builder setAccount(
              AccountCreateParams.Identity.Attestations.TermsOfService.Account account) {
            this.account = account;
            return this;
          }

          /** Details on the Account's acceptance of Issuing-specific terms of service. */
          public Builder setCardCreator(
              AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator cardCreator) {
            this.cardCreator = cardCreator;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Attestations.TermsOfService#extraParams}
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
           * map. See {@link AccountCreateParams.Identity.Attestations.TermsOfService#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details on the Account's acceptance of Treasury-specific terms of service. */
          public Builder setStorer(
              AccountCreateParams.Identity.Attestations.TermsOfService.Storer storer) {
            this.storer = storer;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Account {
          /**
           * <strong>Required.</strong> The time when the Account's representative accepted the
           * terms of service. Represented as a RFC 3339 date &amp; time UTC value in millisecond
           * precision, for example: 2022-09-18T13:22:18.123Z.
           */
          @SerializedName("date")
          Instant date;

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
           * <strong>Required.</strong> The IP address from which the Account's representative
           * accepted the terms of service.
           */
          @SerializedName("ip")
          String ip;

          /**
           * The user agent of the browser from which the Account's representative accepted the
           * terms of service.
           */
          @SerializedName("user_agent")
          String userAgent;

          private Account(
              Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
            this.date = date;
            this.extraParams = extraParams;
            this.ip = ip;
            this.userAgent = userAgent;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Instant date;

            private Map<String, Object> extraParams;

            private String ip;

            private String userAgent;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Attestations.TermsOfService.Account build() {
              return new AccountCreateParams.Identity.Attestations.TermsOfService.Account(
                  this.date, this.extraParams, this.ip, this.userAgent);
            }

            /**
             * <strong>Required.</strong> The time when the Account's representative accepted the
             * terms of service. Represented as a RFC 3339 date &amp; time UTC value in millisecond
             * precision, for example: 2022-09-18T13:22:18.123Z.
             */
            public Builder setDate(Instant date) {
              this.date = date;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Attestations.TermsOfService.Account#extraParams} for the
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
             * AccountCreateParams.Identity.Attestations.TermsOfService.Account#extraParams} for the
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
             * <strong>Required.</strong> The IP address from which the Account's representative
             * accepted the terms of service.
             */
            public Builder setIp(String ip) {
              this.ip = ip;
              return this;
            }

            /**
             * The user agent of the browser from which the Account's representative accepted the
             * terms of service.
             */
            public Builder setUserAgent(String userAgent) {
              this.userAgent = userAgent;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CardCreator {
          /** Terms of service acceptances to create cards for commercial issuing use cases. */
          @SerializedName("commercial")
          Commercial commercial;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private CardCreator(Commercial commercial, Map<String, Object> extraParams) {
            this.commercial = commercial;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Commercial commercial;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator build() {
              return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator(
                  this.commercial, this.extraParams);
            }

            /** Terms of service acceptances to create cards for commercial issuing use cases. */
            public Builder setCommercial(
                AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                    commercial) {
              this.commercial = commercial;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator#extraParams} for
             * the field documentation.
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
          public static class Commercial {
            /** Terms of service acceptances for Stripe commercial card issuing. */
            @SerializedName("account_holder")
            AccountHolder accountHolder;

            /**
             * Terms of service acceptances for commercial issuing cards with Celtic as BIN sponsor.
             */
            @SerializedName("celtic")
            Celtic celtic;

            /**
             * Terms of service acceptances for commercial issuing cards with Cross River Bank as
             * BIN sponsor.
             */
            @SerializedName("cross_river_bank")
            CrossRiverBank crossRiverBank;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private Commercial(
                AccountHolder accountHolder,
                Celtic celtic,
                CrossRiverBank crossRiverBank,
                Map<String, Object> extraParams) {
              this.accountHolder = accountHolder;
              this.celtic = celtic;
              this.crossRiverBank = crossRiverBank;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private AccountHolder accountHolder;

              private Celtic celtic;

              private CrossRiverBank crossRiverBank;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                  build() {
                return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                    .Commercial(
                    this.accountHolder, this.celtic, this.crossRiverBank, this.extraParams);
              }

              /** Terms of service acceptances for Stripe commercial card issuing. */
              public Builder setAccountHolder(
                  AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                          .AccountHolder
                      accountHolder) {
                this.accountHolder = accountHolder;
                return this;
              }

              /**
               * Terms of service acceptances for commercial issuing cards with Celtic as BIN
               * sponsor.
               */
              public Builder setCeltic(
                  AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                          .Celtic
                      celtic) {
                this.celtic = celtic;
                return this;
              }

              /**
               * Terms of service acceptances for commercial issuing cards with Cross River Bank as
               * BIN sponsor.
               */
              public Builder setCrossRiverBank(
                  AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                          .CrossRiverBank
                      crossRiverBank) {
                this.crossRiverBank = crossRiverBank;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial#extraParams}
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
               * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial#extraParams}
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
            public static class AccountHolder {
              /**
               * <strong>Required.</strong> The time when the Account's representative accepted the
               * terms of service. Represented as a RFC 3339 date &amp; time UTC value in
               * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
               */
              @SerializedName("date")
              Instant date;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> The IP address from which the Account's representative
               * accepted the terms of service.
               */
              @SerializedName("ip")
              String ip;

              /**
               * The user agent of the browser from which the Account's representative accepted the
               * terms of service.
               */
              @SerializedName("user_agent")
              String userAgent;

              private AccountHolder(
                  Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                this.date = date;
                this.extraParams = extraParams;
                this.ip = ip;
                this.userAgent = userAgent;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Instant date;

                private Map<String, Object> extraParams;

                private String ip;

                private String userAgent;

                /** Finalize and obtain parameter instance from this builder. */
                public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.AccountHolder
                    build() {
                  return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                      .Commercial.AccountHolder(
                      this.date, this.extraParams, this.ip, this.userAgent);
                }

                /**
                 * <strong>Required.</strong> The time when the Account's representative accepted
                 * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                 * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                 */
                public Builder setDate(Instant date) {
                  this.date = date;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.AccountHolder#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.AccountHolder#extraParams}
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
                 * <strong>Required.</strong> The IP address from which the Account's representative
                 * accepted the terms of service.
                 */
                public Builder setIp(String ip) {
                  this.ip = ip;
                  return this;
                }

                /**
                 * The user agent of the browser from which the Account's representative accepted
                 * the terms of service.
                 */
                public Builder setUserAgent(String userAgent) {
                  this.userAgent = userAgent;
                  return this;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Celtic {
              /**
               * Terms of service acceptances for commercial issuing Apple Pay cards with Celtic as
               * BIN sponsor.
               */
              @SerializedName("apple_pay")
              ApplePay applePay;

              /**
               * Terms of service acceptances for commercial issuing charge cards with Celtic as BIN
               * sponsor.
               */
              @SerializedName("charge_card")
              ChargeCard chargeCard;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * Terms of service acceptances for commercial issuing spend cards with Celtic as BIN
               * sponsor.
               */
              @SerializedName("spend_card")
              SpendCard spendCard;

              private Celtic(
                  ApplePay applePay,
                  ChargeCard chargeCard,
                  Map<String, Object> extraParams,
                  SpendCard spendCard) {
                this.applePay = applePay;
                this.chargeCard = chargeCard;
                this.extraParams = extraParams;
                this.spendCard = spendCard;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private ApplePay applePay;

                private ChargeCard chargeCard;

                private Map<String, Object> extraParams;

                private SpendCard spendCard;

                /** Finalize and obtain parameter instance from this builder. */
                public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.Celtic
                    build() {
                  return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                      .Commercial.Celtic(
                      this.applePay, this.chargeCard, this.extraParams, this.spendCard);
                }

                /**
                 * Terms of service acceptances for commercial issuing Apple Pay cards with Celtic
                 * as BIN sponsor.
                 */
                public Builder setApplePay(
                    AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                            .Celtic.ApplePay
                        applePay) {
                  this.applePay = applePay;
                  return this;
                }

                /**
                 * Terms of service acceptances for commercial issuing charge cards with Celtic as
                 * BIN sponsor.
                 */
                public Builder setChargeCard(
                    AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                            .Celtic.ChargeCard
                        chargeCard) {
                  this.chargeCard = chargeCard;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic#extraParams}
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
                 * Terms of service acceptances for commercial issuing spend cards with Celtic as
                 * BIN sponsor.
                 */
                public Builder setSpendCard(
                    AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                            .Celtic.SpendCard
                        spendCard) {
                  this.spendCard = spendCard;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class ApplePay {
                /**
                 * <strong>Required.</strong> The time when the Account's representative accepted
                 * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                 * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                 */
                @SerializedName("date")
                Instant date;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * <strong>Required.</strong> The IP address from which the Account's representative
                 * accepted the terms of service.
                 */
                @SerializedName("ip")
                String ip;

                /**
                 * The user agent of the browser from which the Account's representative accepted
                 * the terms of service.
                 */
                @SerializedName("user_agent")
                String userAgent;

                private ApplePay(
                    Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                  this.date = date;
                  this.extraParams = extraParams;
                  this.ip = ip;
                  this.userAgent = userAgent;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Instant date;

                  private Map<String, Object> extraParams;

                  private String ip;

                  private String userAgent;

                  /** Finalize and obtain parameter instance from this builder. */
                  public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                          .Commercial.Celtic.ApplePay
                      build() {
                    return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.Celtic.ApplePay(
                        this.date, this.extraParams, this.ip, this.userAgent);
                  }

                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  public Builder setDate(Instant date) {
                    this.date = date;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ApplePay#extraParams}
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
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ApplePay#extraParams}
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
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  public Builder setIp(String ip) {
                    this.ip = ip;
                    return this;
                  }

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  public Builder setUserAgent(String userAgent) {
                    this.userAgent = userAgent;
                    return this;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class ChargeCard {
                /**
                 * Bank terms of service acceptance for commercial issuing charge cards with Celtic
                 * as BIN sponsor.
                 */
                @SerializedName("bank_terms")
                BankTerms bankTerms;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * Platform terms of service acceptance for commercial issuing charge cards with
                 * Celtic as BIN sponsor.
                 */
                @SerializedName("platform")
                Platform platform;

                private ChargeCard(
                    BankTerms bankTerms, Map<String, Object> extraParams, Platform platform) {
                  this.bankTerms = bankTerms;
                  this.extraParams = extraParams;
                  this.platform = platform;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private BankTerms bankTerms;

                  private Map<String, Object> extraParams;

                  private Platform platform;

                  /** Finalize and obtain parameter instance from this builder. */
                  public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                          .Commercial.Celtic.ChargeCard
                      build() {
                    return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.Celtic.ChargeCard(
                        this.bankTerms, this.extraParams, this.platform);
                  }

                  /**
                   * Bank terms of service acceptance for commercial issuing charge cards with
                   * Celtic as BIN sponsor.
                   */
                  public Builder setBankTerms(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.Celtic.ChargeCard.BankTerms
                          bankTerms) {
                    this.bankTerms = bankTerms;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ChargeCard#extraParams}
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
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ChargeCard#extraParams}
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
                   * Platform terms of service acceptance for commercial issuing charge cards with
                   * Celtic as BIN sponsor.
                   */
                  public Builder setPlatform(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.Celtic.ChargeCard.Platform
                          platform) {
                    this.platform = platform;
                    return this;
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class BankTerms {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private BankTerms(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.Celtic.ChargeCard.BankTerms
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.Celtic.ChargeCard.BankTerms(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ChargeCard.BankTerms#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ChargeCard.BankTerms#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Platform {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private Platform(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.Celtic.ChargeCard.Platform
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.Celtic.ChargeCard.Platform(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ChargeCard.Platform#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.ChargeCard.Platform#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class SpendCard {
                /**
                 * Bank terms of service acceptance for commercial issuing spend cards with Celtic
                 * as BIN sponsor.
                 */
                @SerializedName("bank_terms")
                BankTerms bankTerms;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * Financial disclosures terms of service acceptance for commercial issuing spend
                 * cards with Celtic as BIN sponsor.
                 */
                @SerializedName("financing_disclosures")
                FinancingDisclosures financingDisclosures;

                /**
                 * Platform terms of service acceptance for commercial issuing spend cards with
                 * Celtic as BIN sponsor.
                 */
                @SerializedName("platform")
                Platform platform;

                private SpendCard(
                    BankTerms bankTerms,
                    Map<String, Object> extraParams,
                    FinancingDisclosures financingDisclosures,
                    Platform platform) {
                  this.bankTerms = bankTerms;
                  this.extraParams = extraParams;
                  this.financingDisclosures = financingDisclosures;
                  this.platform = platform;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private BankTerms bankTerms;

                  private Map<String, Object> extraParams;

                  private FinancingDisclosures financingDisclosures;

                  private Platform platform;

                  /** Finalize and obtain parameter instance from this builder. */
                  public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                          .Commercial.Celtic.SpendCard
                      build() {
                    return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.Celtic.SpendCard(
                        this.bankTerms, this.extraParams, this.financingDisclosures, this.platform);
                  }

                  /**
                   * Bank terms of service acceptance for commercial issuing spend cards with Celtic
                   * as BIN sponsor.
                   */
                  public Builder setBankTerms(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.Celtic.SpendCard.BankTerms
                          bankTerms) {
                    this.bankTerms = bankTerms;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard#extraParams}
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
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard#extraParams}
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
                   * Financial disclosures terms of service acceptance for commercial issuing spend
                   * cards with Celtic as BIN sponsor.
                   */
                  public Builder setFinancingDisclosures(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.Celtic.SpendCard.FinancingDisclosures
                          financingDisclosures) {
                    this.financingDisclosures = financingDisclosures;
                    return this;
                  }

                  /**
                   * Platform terms of service acceptance for commercial issuing spend cards with
                   * Celtic as BIN sponsor.
                   */
                  public Builder setPlatform(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.Celtic.SpendCard.Platform
                          platform) {
                    this.platform = platform;
                    return this;
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class BankTerms {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private BankTerms(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.Celtic.SpendCard.BankTerms
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.Celtic.SpendCard.BankTerms(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard.BankTerms#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard.BankTerms#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class FinancingDisclosures {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private FinancingDisclosures(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.Celtic.SpendCard.FinancingDisclosures
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.Celtic.SpendCard.FinancingDisclosures(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard.FinancingDisclosures#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard.FinancingDisclosures#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Platform {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private Platform(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.Celtic.SpendCard.Platform
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.Celtic.SpendCard.Platform(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard.Platform#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.Celtic.SpendCard.Platform#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class CrossRiverBank {
              /**
               * Terms of service acceptances for commercial issuing Apple Pay cards with Cross
               * River Bank as BIN sponsor.
               */
              @SerializedName("apple_pay")
              ApplePay applePay;

              /**
               * Terms of service acceptances for commercial issuing charge cards with Cross River
               * Bank as BIN sponsor.
               */
              @SerializedName("charge_card")
              ChargeCard chargeCard;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * Terms of service acceptances for commercial issuing spend cards with Cross River
               * Bank as BIN sponsor.
               */
              @SerializedName("spend_card")
              SpendCard spendCard;

              private CrossRiverBank(
                  ApplePay applePay,
                  ChargeCard chargeCard,
                  Map<String, Object> extraParams,
                  SpendCard spendCard) {
                this.applePay = applePay;
                this.chargeCard = chargeCard;
                this.extraParams = extraParams;
                this.spendCard = spendCard;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private ApplePay applePay;

                private ChargeCard chargeCard;

                private Map<String, Object> extraParams;

                private SpendCard spendCard;

                /** Finalize and obtain parameter instance from this builder. */
                public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.CrossRiverBank
                    build() {
                  return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                      .Commercial.CrossRiverBank(
                      this.applePay, this.chargeCard, this.extraParams, this.spendCard);
                }

                /**
                 * Terms of service acceptances for commercial issuing Apple Pay cards with Cross
                 * River Bank as BIN sponsor.
                 */
                public Builder setApplePay(
                    AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                            .CrossRiverBank.ApplePay
                        applePay) {
                  this.applePay = applePay;
                  return this;
                }

                /**
                 * Terms of service acceptances for commercial issuing charge cards with Cross River
                 * Bank as BIN sponsor.
                 */
                public Builder setChargeCard(
                    AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                            .CrossRiverBank.ChargeCard
                        chargeCard) {
                  this.chargeCard = chargeCard;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank#extraParams}
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
                 * Terms of service acceptances for commercial issuing spend cards with Cross River
                 * Bank as BIN sponsor.
                 */
                public Builder setSpendCard(
                    AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial
                            .CrossRiverBank.SpendCard
                        spendCard) {
                  this.spendCard = spendCard;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class ApplePay {
                /**
                 * <strong>Required.</strong> The time when the Account's representative accepted
                 * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                 * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                 */
                @SerializedName("date")
                Instant date;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * <strong>Required.</strong> The IP address from which the Account's representative
                 * accepted the terms of service.
                 */
                @SerializedName("ip")
                String ip;

                /**
                 * The user agent of the browser from which the Account's representative accepted
                 * the terms of service.
                 */
                @SerializedName("user_agent")
                String userAgent;

                private ApplePay(
                    Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                  this.date = date;
                  this.extraParams = extraParams;
                  this.ip = ip;
                  this.userAgent = userAgent;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Instant date;

                  private Map<String, Object> extraParams;

                  private String ip;

                  private String userAgent;

                  /** Finalize and obtain parameter instance from this builder. */
                  public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                          .Commercial.CrossRiverBank.ApplePay
                      build() {
                    return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.CrossRiverBank.ApplePay(
                        this.date, this.extraParams, this.ip, this.userAgent);
                  }

                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  public Builder setDate(Instant date) {
                    this.date = date;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ApplePay#extraParams}
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
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ApplePay#extraParams}
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
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  public Builder setIp(String ip) {
                    this.ip = ip;
                    return this;
                  }

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  public Builder setUserAgent(String userAgent) {
                    this.userAgent = userAgent;
                    return this;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class ChargeCard {
                /**
                 * Bank terms of service acceptance for commercial issuing charge cards with Cross
                 * River Bank as BIN sponsor.
                 */
                @SerializedName("bank_terms")
                BankTerms bankTerms;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * Financial disclosures terms of service acceptance for commercial issuing charge
                 * cards with Cross River Bank as BIN sponsor.
                 */
                @SerializedName("financing_disclosures")
                FinancingDisclosures financingDisclosures;

                /**
                 * Platform terms of service acceptance for commercial issuing charge cards with
                 * Cross River Bank as BIN sponsor.
                 */
                @SerializedName("platform")
                Platform platform;

                private ChargeCard(
                    BankTerms bankTerms,
                    Map<String, Object> extraParams,
                    FinancingDisclosures financingDisclosures,
                    Platform platform) {
                  this.bankTerms = bankTerms;
                  this.extraParams = extraParams;
                  this.financingDisclosures = financingDisclosures;
                  this.platform = platform;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private BankTerms bankTerms;

                  private Map<String, Object> extraParams;

                  private FinancingDisclosures financingDisclosures;

                  private Platform platform;

                  /** Finalize and obtain parameter instance from this builder. */
                  public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                          .Commercial.CrossRiverBank.ChargeCard
                      build() {
                    return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.CrossRiverBank.ChargeCard(
                        this.bankTerms, this.extraParams, this.financingDisclosures, this.platform);
                  }

                  /**
                   * Bank terms of service acceptance for commercial issuing charge cards with Cross
                   * River Bank as BIN sponsor.
                   */
                  public Builder setBankTerms(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.CrossRiverBank.ChargeCard.BankTerms
                          bankTerms) {
                    this.bankTerms = bankTerms;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard#extraParams}
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
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard#extraParams}
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
                   * Financial disclosures terms of service acceptance for commercial issuing charge
                   * cards with Cross River Bank as BIN sponsor.
                   */
                  public Builder setFinancingDisclosures(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.CrossRiverBank.ChargeCard.FinancingDisclosures
                          financingDisclosures) {
                    this.financingDisclosures = financingDisclosures;
                    return this;
                  }

                  /**
                   * Platform terms of service acceptance for commercial issuing charge cards with
                   * Cross River Bank as BIN sponsor.
                   */
                  public Builder setPlatform(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.CrossRiverBank.ChargeCard.Platform
                          platform) {
                    this.platform = platform;
                    return this;
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class BankTerms {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private BankTerms(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.CrossRiverBank.ChargeCard.BankTerms
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.CrossRiverBank.ChargeCard.BankTerms(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard.BankTerms#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard.BankTerms#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class FinancingDisclosures {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private FinancingDisclosures(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.CrossRiverBank.ChargeCard.FinancingDisclosures
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.CrossRiverBank.ChargeCard.FinancingDisclosures(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard.FinancingDisclosures#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard.FinancingDisclosures#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Platform {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private Platform(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.CrossRiverBank.ChargeCard.Platform
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.CrossRiverBank.ChargeCard.Platform(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard.Platform#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.ChargeCard.Platform#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class SpendCard {
                /**
                 * Bank terms of service acceptance for commercial issuing spend cards with Cross
                 * River Bank as BIN sponsor.
                 */
                @SerializedName("bank_terms")
                BankTerms bankTerms;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * Financial disclosures terms of service acceptance for commercial issuing spend
                 * cards with Cross River Bank as BIN sponsor.
                 */
                @SerializedName("financing_disclosures")
                FinancingDisclosures financingDisclosures;

                private SpendCard(
                    BankTerms bankTerms,
                    Map<String, Object> extraParams,
                    FinancingDisclosures financingDisclosures) {
                  this.bankTerms = bankTerms;
                  this.extraParams = extraParams;
                  this.financingDisclosures = financingDisclosures;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private BankTerms bankTerms;

                  private Map<String, Object> extraParams;

                  private FinancingDisclosures financingDisclosures;

                  /** Finalize and obtain parameter instance from this builder. */
                  public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                          .Commercial.CrossRiverBank.SpendCard
                      build() {
                    return new AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                        .Commercial.CrossRiverBank.SpendCard(
                        this.bankTerms, this.extraParams, this.financingDisclosures);
                  }

                  /**
                   * Bank terms of service acceptance for commercial issuing spend cards with Cross
                   * River Bank as BIN sponsor.
                   */
                  public Builder setBankTerms(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.CrossRiverBank.SpendCard.BankTerms
                          bankTerms) {
                    this.bankTerms = bankTerms;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.SpendCard#extraParams}
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
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.SpendCard#extraParams}
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
                   * Financial disclosures terms of service acceptance for commercial issuing spend
                   * cards with Cross River Bank as BIN sponsor.
                   */
                  public Builder setFinancingDisclosures(
                      AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                              .Commercial.CrossRiverBank.SpendCard.FinancingDisclosures
                          financingDisclosures) {
                    this.financingDisclosures = financingDisclosures;
                    return this;
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class BankTerms {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private BankTerms(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.CrossRiverBank.SpendCard.BankTerms
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.CrossRiverBank.SpendCard.BankTerms(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.SpendCard.BankTerms#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.SpendCard.BankTerms#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class FinancingDisclosures {
                  /**
                   * <strong>Required.</strong> The time when the Account's representative accepted
                   * the terms of service. Represented as a RFC 3339 date &amp; time UTC value in
                   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                   */
                  @SerializedName("date")
                  Instant date;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /**
                   * <strong>Required.</strong> The IP address from which the Account's
                   * representative accepted the terms of service.
                   */
                  @SerializedName("ip")
                  String ip;

                  /**
                   * The user agent of the browser from which the Account's representative accepted
                   * the terms of service.
                   */
                  @SerializedName("user_agent")
                  String userAgent;

                  private FinancingDisclosures(
                      Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
                    this.date = date;
                    this.extraParams = extraParams;
                    this.ip = ip;
                    this.userAgent = userAgent;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private Instant date;

                    private Map<String, Object> extraParams;

                    private String ip;

                    private String userAgent;

                    /** Finalize and obtain parameter instance from this builder. */
                    public AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator
                            .Commercial.CrossRiverBank.SpendCard.FinancingDisclosures
                        build() {
                      return new AccountCreateParams.Identity.Attestations.TermsOfService
                          .CardCreator.Commercial.CrossRiverBank.SpendCard.FinancingDisclosures(
                          this.date, this.extraParams, this.ip, this.userAgent);
                    }

                    /**
                     * <strong>Required.</strong> The time when the Account's representative
                     * accepted the terms of service. Represented as a RFC 3339 date &amp; time UTC
                     * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
                     */
                    public Builder setDate(Instant date) {
                      this.date = date;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.SpendCard.FinancingDisclosures#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * AccountCreateParams.Identity.Attestations.TermsOfService.CardCreator.Commercial.CrossRiverBank.SpendCard.FinancingDisclosures#extraParams}
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
                     * <strong>Required.</strong> The IP address from which the Account's
                     * representative accepted the terms of service.
                     */
                    public Builder setIp(String ip) {
                      this.ip = ip;
                      return this;
                    }

                    /**
                     * The user agent of the browser from which the Account's representative
                     * accepted the terms of service.
                     */
                    public Builder setUserAgent(String userAgent) {
                      this.userAgent = userAgent;
                      return this;
                    }
                  }
                }
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Storer {
          /**
           * <strong>Required.</strong> The time when the Account's representative accepted the
           * terms of service. Represented as a RFC 3339 date &amp; time UTC value in millisecond
           * precision, for example: 2022-09-18T13:22:18.123Z.
           */
          @SerializedName("date")
          Instant date;

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
           * <strong>Required.</strong> The IP address from which the Account's representative
           * accepted the terms of service.
           */
          @SerializedName("ip")
          String ip;

          /**
           * The user agent of the browser from which the Account's representative accepted the
           * terms of service.
           */
          @SerializedName("user_agent")
          String userAgent;

          private Storer(
              Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
            this.date = date;
            this.extraParams = extraParams;
            this.ip = ip;
            this.userAgent = userAgent;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Instant date;

            private Map<String, Object> extraParams;

            private String ip;

            private String userAgent;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Attestations.TermsOfService.Storer build() {
              return new AccountCreateParams.Identity.Attestations.TermsOfService.Storer(
                  this.date, this.extraParams, this.ip, this.userAgent);
            }

            /**
             * <strong>Required.</strong> The time when the Account's representative accepted the
             * terms of service. Represented as a RFC 3339 date &amp; time UTC value in millisecond
             * precision, for example: 2022-09-18T13:22:18.123Z.
             */
            public Builder setDate(Instant date) {
              this.date = date;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Attestations.TermsOfService.Storer#extraParams} for the
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
             * AccountCreateParams.Identity.Attestations.TermsOfService.Storer#extraParams} for the
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
             * <strong>Required.</strong> The IP address from which the Account's representative
             * accepted the terms of service.
             */
            public Builder setIp(String ip) {
              this.ip = ip;
              return this;
            }

            /**
             * The user agent of the browser from which the Account's representative accepted the
             * terms of service.
             */
            public Builder setUserAgent(String userAgent) {
              this.userAgent = userAgent;
              return this;
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BusinessDetails {
      /** The business registration address of the business entity. */
      @SerializedName("address")
      Address address;

      /** The business gross annual revenue for its preceding fiscal year. */
      @SerializedName("annual_revenue")
      AnnualRevenue annualRevenue;

      /** A document verifying the business. */
      @SerializedName("documents")
      Documents documents;

      /**
       * An estimated upper bound of employees, contractors, vendors, etc. currently working for the
       * business.
       */
      @SerializedName("estimated_worker_count")
      Long estimatedWorkerCount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID numbers of a business entity. */
      @SerializedName("id_numbers")
      List<AccountCreateParams.Identity.BusinessDetails.IdNumber> idNumbers;

      /** An estimate of the monthly revenue of the business. */
      @SerializedName("monthly_estimated_revenue")
      MonthlyEstimatedRevenue monthlyEstimatedRevenue;

      /** The phone number of the Business Entity. */
      @SerializedName("phone")
      String phone;

      /** The business legal name. */
      @SerializedName("registered_name")
      String registeredName;

      /** The business registration address of the business entity in non latin script. */
      @SerializedName("script_addresses")
      ScriptAddresses scriptAddresses;

      /** The business legal name in non latin script. */
      @SerializedName("script_names")
      ScriptNames scriptNames;

      /** The category identifying the legal structure of the business. */
      @SerializedName("structure")
      Structure structure;

      private BusinessDetails(
          Address address,
          AnnualRevenue annualRevenue,
          Documents documents,
          Long estimatedWorkerCount,
          Map<String, Object> extraParams,
          List<AccountCreateParams.Identity.BusinessDetails.IdNumber> idNumbers,
          MonthlyEstimatedRevenue monthlyEstimatedRevenue,
          String phone,
          String registeredName,
          ScriptAddresses scriptAddresses,
          ScriptNames scriptNames,
          Structure structure) {
        this.address = address;
        this.annualRevenue = annualRevenue;
        this.documents = documents;
        this.estimatedWorkerCount = estimatedWorkerCount;
        this.extraParams = extraParams;
        this.idNumbers = idNumbers;
        this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
        this.phone = phone;
        this.registeredName = registeredName;
        this.scriptAddresses = scriptAddresses;
        this.scriptNames = scriptNames;
        this.structure = structure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private AnnualRevenue annualRevenue;

        private Documents documents;

        private Long estimatedWorkerCount;

        private Map<String, Object> extraParams;

        private List<AccountCreateParams.Identity.BusinessDetails.IdNumber> idNumbers;

        private MonthlyEstimatedRevenue monthlyEstimatedRevenue;

        private String phone;

        private String registeredName;

        private ScriptAddresses scriptAddresses;

        private ScriptNames scriptNames;

        private Structure structure;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Identity.BusinessDetails build() {
          return new AccountCreateParams.Identity.BusinessDetails(
              this.address,
              this.annualRevenue,
              this.documents,
              this.estimatedWorkerCount,
              this.extraParams,
              this.idNumbers,
              this.monthlyEstimatedRevenue,
              this.phone,
              this.registeredName,
              this.scriptAddresses,
              this.scriptNames,
              this.structure);
        }

        /** The business registration address of the business entity. */
        public Builder setAddress(AccountCreateParams.Identity.BusinessDetails.Address address) {
          this.address = address;
          return this;
        }

        /** The business gross annual revenue for its preceding fiscal year. */
        public Builder setAnnualRevenue(
            AccountCreateParams.Identity.BusinessDetails.AnnualRevenue annualRevenue) {
          this.annualRevenue = annualRevenue;
          return this;
        }

        /** A document verifying the business. */
        public Builder setDocuments(
            AccountCreateParams.Identity.BusinessDetails.Documents documents) {
          this.documents = documents;
          return this;
        }

        /**
         * An estimated upper bound of employees, contractors, vendors, etc. currently working for
         * the business.
         */
        public Builder setEstimatedWorkerCount(Long estimatedWorkerCount) {
          this.estimatedWorkerCount = estimatedWorkerCount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Identity.BusinessDetails#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Identity.BusinessDetails#extraParams} for the field
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
         * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Identity.BusinessDetails#idNumbers} for the field documentation.
         */
        public Builder addIdNumber(AccountCreateParams.Identity.BusinessDetails.IdNumber element) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.add(element);
          return this;
        }

        /**
         * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Identity.BusinessDetails#idNumbers} for the field documentation.
         */
        public Builder addAllIdNumber(
            List<AccountCreateParams.Identity.BusinessDetails.IdNumber> elements) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.addAll(elements);
          return this;
        }

        /** An estimate of the monthly revenue of the business. */
        public Builder setMonthlyEstimatedRevenue(
            AccountCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue
                monthlyEstimatedRevenue) {
          this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
          return this;
        }

        /** The phone number of the Business Entity. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** The business legal name. */
        public Builder setRegisteredName(String registeredName) {
          this.registeredName = registeredName;
          return this;
        }

        /** The business registration address of the business entity in non latin script. */
        public Builder setScriptAddresses(
            AccountCreateParams.Identity.BusinessDetails.ScriptAddresses scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The business legal name in non latin script. */
        public Builder setScriptNames(
            AccountCreateParams.Identity.BusinessDetails.ScriptNames scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The category identifying the legal structure of the business. */
        public Builder setStructure(
            AccountCreateParams.Identity.BusinessDetails.Structure structure) {
          this.structure = structure;
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
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

        /** Town or cho-me. */
        @SerializedName("town")
        String town;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state,
            String town) {
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
          private String city;

          private String country;

          private Map<String, Object> extraParams;

          private String line1;

          private String line2;

          private String postalCode;

          private String state;

          private String town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.Address build() {
            return new AccountCreateParams.Identity.BusinessDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state,
                this.town);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
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
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.Address#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.Address#extraParams} for
           * the field documentation.
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

          /** Town or cho-me. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AnnualRevenue {
        /** A non-negative integer representing the amount in the smallest currency unit. */
        @SerializedName("amount")
        Amount amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
         * the 31st of December, 2023.
         */
        @SerializedName("fiscal_year_end")
        String fiscalYearEnd;

        private AnnualRevenue(
            Amount amount, Map<String, Object> extraParams, String fiscalYearEnd) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.fiscalYearEnd = fiscalYearEnd;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Amount amount;

          private Map<String, Object> extraParams;

          private String fiscalYearEnd;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.AnnualRevenue build() {
            return new AccountCreateParams.Identity.BusinessDetails.AnnualRevenue(
                this.amount, this.extraParams, this.fiscalYearEnd);
          }

          /** A non-negative integer representing the amount in the smallest currency unit. */
          public Builder setAmount(Amount amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.AnnualRevenue#extraParams}
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
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.AnnualRevenue#extraParams}
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
           * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
           * the 31st of December, 2023.
           */
          public Builder setFiscalYearEnd(String fiscalYearEnd) {
            this.fiscalYearEnd = fiscalYearEnd;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Documents {
        /**
         * One or more documents that support the bank account ownership verification requirement.
         * Must be a document associated with the account’s primary active bank account that
         * displays the last 4 digits of the account number, either a statement or a check.
         */
        @SerializedName("bank_account_ownership_verification")
        BankAccountOwnershipVerification bankAccountOwnershipVerification;

        /** One or more documents that demonstrate proof of a company’s license to operate. */
        @SerializedName("company_license")
        CompanyLicense companyLicense;

        /** One or more documents showing the company’s Memorandum of Association. */
        @SerializedName("company_memorandum_of_association")
        CompanyMemorandumOfAssociation companyMemorandumOfAssociation;

        /**
         * Certain countries only: One or more documents showing the ministerial decree legalizing
         * the company’s establishment.
         */
        @SerializedName("company_ministerial_decree")
        CompanyMinisterialDecree companyMinisterialDecree;

        /**
         * One or more documents that demonstrate proof of a company’s registration with the
         * appropriate local authorities.
         */
        @SerializedName("company_registration_verification")
        CompanyRegistrationVerification companyRegistrationVerification;

        /** One or more documents that demonstrate proof of a company’s tax ID. */
        @SerializedName("company_tax_id_verification")
        CompanyTaxIdVerification companyTaxIdVerification;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A document verifying the business. */
        @SerializedName("primary_verification")
        PrimaryVerification primaryVerification;

        /** One or more documents that demonstrate proof of address. */
        @SerializedName("proof_of_address")
        ProofOfAddress proofOfAddress;

        /**
         * One or more documents showing the company’s proof of registration with the national
         * business registry.
         */
        @SerializedName("proof_of_registration")
        ProofOfRegistration proofOfRegistration;

        /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
        @SerializedName("proof_of_ultimate_beneficial_ownership")
        ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

        private Documents(
            BankAccountOwnershipVerification bankAccountOwnershipVerification,
            CompanyLicense companyLicense,
            CompanyMemorandumOfAssociation companyMemorandumOfAssociation,
            CompanyMinisterialDecree companyMinisterialDecree,
            CompanyRegistrationVerification companyRegistrationVerification,
            CompanyTaxIdVerification companyTaxIdVerification,
            Map<String, Object> extraParams,
            PrimaryVerification primaryVerification,
            ProofOfAddress proofOfAddress,
            ProofOfRegistration proofOfRegistration,
            ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership) {
          this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
          this.companyLicense = companyLicense;
          this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
          this.companyMinisterialDecree = companyMinisterialDecree;
          this.companyRegistrationVerification = companyRegistrationVerification;
          this.companyTaxIdVerification = companyTaxIdVerification;
          this.extraParams = extraParams;
          this.primaryVerification = primaryVerification;
          this.proofOfAddress = proofOfAddress;
          this.proofOfRegistration = proofOfRegistration;
          this.proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BankAccountOwnershipVerification bankAccountOwnershipVerification;

          private CompanyLicense companyLicense;

          private CompanyMemorandumOfAssociation companyMemorandumOfAssociation;

          private CompanyMinisterialDecree companyMinisterialDecree;

          private CompanyRegistrationVerification companyRegistrationVerification;

          private CompanyTaxIdVerification companyTaxIdVerification;

          private Map<String, Object> extraParams;

          private PrimaryVerification primaryVerification;

          private ProofOfAddress proofOfAddress;

          private ProofOfRegistration proofOfRegistration;

          private ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.Documents build() {
            return new AccountCreateParams.Identity.BusinessDetails.Documents(
                this.bankAccountOwnershipVerification,
                this.companyLicense,
                this.companyMemorandumOfAssociation,
                this.companyMinisterialDecree,
                this.companyRegistrationVerification,
                this.companyTaxIdVerification,
                this.extraParams,
                this.primaryVerification,
                this.proofOfAddress,
                this.proofOfRegistration,
                this.proofOfUltimateBeneficialOwnership);
          }

          /**
           * One or more documents that support the bank account ownership verification requirement.
           * Must be a document associated with the account’s primary active bank account that
           * displays the last 4 digits of the account number, either a statement or a check.
           */
          public Builder setBankAccountOwnershipVerification(
              AccountCreateParams.Identity.BusinessDetails.Documents
                      .BankAccountOwnershipVerification
                  bankAccountOwnershipVerification) {
            this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s license to operate. */
          public Builder setCompanyLicense(
              AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense
                  companyLicense) {
            this.companyLicense = companyLicense;
            return this;
          }

          /** One or more documents showing the company’s Memorandum of Association. */
          public Builder setCompanyMemorandumOfAssociation(
              AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation
                  companyMemorandumOfAssociation) {
            this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
            return this;
          }

          /**
           * Certain countries only: One or more documents showing the ministerial decree legalizing
           * the company’s establishment.
           */
          public Builder setCompanyMinisterialDecree(
              AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree
                  companyMinisterialDecree) {
            this.companyMinisterialDecree = companyMinisterialDecree;
            return this;
          }

          /**
           * One or more documents that demonstrate proof of a company’s registration with the
           * appropriate local authorities.
           */
          public Builder setCompanyRegistrationVerification(
              AccountCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification
                  companyRegistrationVerification) {
            this.companyRegistrationVerification = companyRegistrationVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s tax ID. */
          public Builder setCompanyTaxIdVerification(
              AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification
                  companyTaxIdVerification) {
            this.companyTaxIdVerification = companyTaxIdVerification;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.Documents#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.Documents#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A document verifying the business. */
          public Builder setPrimaryVerification(
              AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                  primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of address. */
          public Builder setProofOfAddress(
              AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress
                  proofOfAddress) {
            this.proofOfAddress = proofOfAddress;
            return this;
          }

          /**
           * One or more documents showing the company’s proof of registration with the national
           * business registry.
           */
          public Builder setProofOfRegistration(
              AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration
                  proofOfRegistration) {
            this.proofOfRegistration = proofOfRegistration;
            return this;
          }

          /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
          public Builder setProofOfUltimateBeneficialOwnership(
              AccountCreateParams.Identity.BusinessDetails.Documents
                      .ProofOfUltimateBeneficialOwnership
                  proofOfUltimateBeneficialOwnership) {
            this.proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BankAccountOwnershipVerification {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private BankAccountOwnershipVerification(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents
                    .BankAccountOwnershipVerification
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents
                  .BankAccountOwnershipVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents
                        .BankAccountOwnershipVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyLicense {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyLicense(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#files} for the
             * field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#files} for the
             * field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents.CompanyLicense.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyMemorandumOfAssociation {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyMemorandumOfAssociation(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents
                    .CompanyMemorandumOfAssociation
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents
                  .CompanyMemorandumOfAssociation(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents
                        .CompanyMemorandumOfAssociation.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyMinisterialDecree {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyMinisterialDecree(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents
                  .CompanyMinisterialDecree(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyRegistrationVerification {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyRegistrationVerification(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents
                    .CompanyRegistrationVerification
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents
                  .CompanyRegistrationVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents
                        .CompanyRegistrationVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyTaxIdVerification {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyTaxIdVerification(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents
                  .CompanyTaxIdVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryVerification {
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
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
           * referring to each side of the document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * <strong>Required.</strong> The format of the verification document. Currently supports
           * {@code front_back} only.
           */
          @SerializedName("type")
          Type type;

          private PrimaryVerification(
              Map<String, Object> extraParams, FrontBack frontBack, Type type) {
            this.extraParams = extraParams;
            this.frontBack = frontBack;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FrontBack frontBack;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification#extraParams}
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
             * <strong>Required.</strong> The <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
             * referring to each side of the document.
             */
            public Builder setFrontBack(
                AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack {
            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the back of the verification document. The purpose of the uploaded
             * file should be 'identity_document'. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            @SerializedName("back")
            String back;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> A <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
             * representing the front of the verification document. The purpose of the uploaded file
             * should be 'identity_document'. The uploaded file needs to be a color image (smaller
             * than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
             */
            @SerializedName("front")
            String front;

            private FrontBack(String back, Map<String, Object> extraParams, String front) {
              this.back = back;
              this.extraParams = extraParams;
              this.front = front;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String back;

              private Map<String, Object> extraParams;

              private String front;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                      .FrontBack
                  build() {
                return new AccountCreateParams.Identity.BusinessDetails.Documents
                    .PrimaryVerification.FrontBack(this.back, this.extraParams, this.front);
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(String back) {
                this.back = back;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * AccountCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * <strong>Required.</strong> A <a
               * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
               * representing the front of the verification document. The purpose of the uploaded
               * file should be 'identity_document'. The uploaded file needs to be a color image
               * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB
               * in size.
               */
              public Builder setFront(String front) {
                this.front = front;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("front_back")
            FRONT_BACK("front_back");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfAddress {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private ProofOfAddress(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#files} for the
             * field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#files} for the
             * field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfRegistration {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private ProofOfRegistration(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#files} for
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
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#files} for
             * the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfUltimateBeneficialOwnership {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private ProofOfUltimateBeneficialOwnership(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.Documents
                    .ProofOfUltimateBeneficialOwnership
                build() {
              return new AccountCreateParams.Identity.BusinessDetails.Documents
                  .ProofOfUltimateBeneficialOwnership(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#extraParams}
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
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.BusinessDetails.Documents
                        .ProofOfUltimateBeneficialOwnership.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class IdNumber {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The registrar of the ID number (Only valid for DE ID number types). */
        @SerializedName("registrar")
        String registrar;

        /** <strong>Required.</strong> Open Enum. The ID number type of a business entity. */
        @SerializedName("type")
        Type type;

        /** <strong>Required.</strong> The value of the ID number. */
        @SerializedName("value")
        String value;

        private IdNumber(
            Map<String, Object> extraParams, String registrar, Type type, String value) {
          this.extraParams = extraParams;
          this.registrar = registrar;
          this.type = type;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String registrar;

          private Type type;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.IdNumber build() {
            return new AccountCreateParams.Identity.BusinessDetails.IdNumber(
                this.extraParams, this.registrar, this.type, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.IdNumber#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.IdNumber#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The registrar of the ID number (Only valid for DE ID number types). */
          public Builder setRegistrar(String registrar) {
            this.registrar = registrar;
            return this;
          }

          /** <strong>Required.</strong> Open Enum. The ID number type of a business entity. */
          public Builder setType(AccountCreateParams.Identity.BusinessDetails.IdNumber.Type type) {
            this.type = type;
            return this;
          }

          /** <strong>Required.</strong> The value of the ID number. */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("ae_crn")
          AE_CRN("ae_crn"),

          @SerializedName("ae_vat")
          AE_VAT("ae_vat"),

          @SerializedName("ao_nif")
          AO_NIF("ao_nif"),

          @SerializedName("at_fn")
          AT_FN("at_fn"),

          @SerializedName("au_abn")
          AU_ABN("au_abn"),

          @SerializedName("au_acn")
          AU_ACN("au_acn"),

          @SerializedName("au_in")
          AU_IN("au_in"),

          @SerializedName("az_tin")
          AZ_TIN("az_tin"),

          @SerializedName("bd_etin")
          BD_ETIN("bd_etin"),

          @SerializedName("be_cbe")
          BE_CBE("be_cbe"),

          @SerializedName("bg_uic")
          BG_UIC("bg_uic"),

          @SerializedName("br_cnpj")
          BR_CNPJ("br_cnpj"),

          @SerializedName("ca_cn")
          CA_CN("ca_cn"),

          @SerializedName("ca_crarr")
          CA_CRARR("ca_crarr"),

          @SerializedName("ca_neq")
          CA_NEQ("ca_neq"),

          @SerializedName("ca_rid")
          CA_RID("ca_rid"),

          @SerializedName("ch_chid")
          CH_CHID("ch_chid"),

          @SerializedName("ch_uid")
          CH_UID("ch_uid"),

          @SerializedName("cr_cpj")
          CR_CPJ("cr_cpj"),

          @SerializedName("cr_nite")
          CR_NITE("cr_nite"),

          @SerializedName("cy_tic")
          CY_TIC("cy_tic"),

          @SerializedName("cz_ico")
          CZ_ICO("cz_ico"),

          @SerializedName("de_hrn")
          DE_HRN("de_hrn"),

          @SerializedName("de_vat")
          DE_VAT("de_vat"),

          @SerializedName("dk_cvr")
          DK_CVR("dk_cvr"),

          @SerializedName("do_rcn")
          DO_RCN("do_rcn"),

          @SerializedName("ee_rk")
          EE_RK("ee_rk"),

          @SerializedName("es_cif")
          ES_CIF("es_cif"),

          @SerializedName("fi_yt")
          FI_YT("fi_yt"),

          @SerializedName("fr_siren")
          FR_SIREN("fr_siren"),

          @SerializedName("fr_vat")
          FR_VAT("fr_vat"),

          @SerializedName("gb_crn")
          GB_CRN("gb_crn"),

          @SerializedName("gi_crn")
          GI_CRN("gi_crn"),

          @SerializedName("gr_gemi")
          GR_GEMI("gr_gemi"),

          @SerializedName("gt_nit")
          GT_NIT("gt_nit"),

          @SerializedName("hk_br")
          HK_BR("hk_br"),

          @SerializedName("hk_cr")
          HK_CR("hk_cr"),

          @SerializedName("hk_mbs")
          HK_MBS("hk_mbs"),

          @SerializedName("hu_cjs")
          HU_CJS("hu_cjs"),

          @SerializedName("ie_crn")
          IE_CRN("ie_crn"),

          @SerializedName("it_rea")
          IT_REA("it_rea"),

          @SerializedName("it_vat")
          IT_VAT("it_vat"),

          @SerializedName("jp_cn")
          JP_CN("jp_cn"),

          @SerializedName("kz_bin")
          KZ_BIN("kz_bin"),

          @SerializedName("li_uid")
          LI_UID("li_uid"),

          @SerializedName("lt_ccrn")
          LT_CCRN("lt_ccrn"),

          @SerializedName("lu_rcs")
          LU_RCS("lu_rcs"),

          @SerializedName("lv_urn")
          LV_URN("lv_urn"),

          @SerializedName("mt_crn")
          MT_CRN("mt_crn"),

          @SerializedName("mx_rfc")
          MX_RFC("mx_rfc"),

          @SerializedName("my_brn")
          MY_BRN("my_brn"),

          @SerializedName("my_coid")
          MY_COID("my_coid"),

          @SerializedName("my_sst")
          MY_SST("my_sst"),

          @SerializedName("mz_nuit")
          MZ_NUIT("mz_nuit"),

          @SerializedName("nl_kvk")
          NL_KVK("nl_kvk"),

          @SerializedName("no_orgnr")
          NO_ORGNR("no_orgnr"),

          @SerializedName("nz_bn")
          NZ_BN("nz_bn"),

          @SerializedName("pe_ruc")
          PE_RUC("pe_ruc"),

          @SerializedName("pk_ntn")
          PK_NTN("pk_ntn"),

          @SerializedName("pl_regon")
          PL_REGON("pl_regon"),

          @SerializedName("pt_vat")
          PT_VAT("pt_vat"),

          @SerializedName("ro_cui")
          RO_CUI("ro_cui"),

          @SerializedName("sa_crn")
          SA_CRN("sa_crn"),

          @SerializedName("sa_tin")
          SA_TIN("sa_tin"),

          @SerializedName("se_orgnr")
          SE_ORGNR("se_orgnr"),

          @SerializedName("sg_uen")
          SG_UEN("sg_uen"),

          @SerializedName("si_msp")
          SI_MSP("si_msp"),

          @SerializedName("sk_ico")
          SK_ICO("sk_ico"),

          @SerializedName("th_crn")
          TH_CRN("th_crn"),

          @SerializedName("th_prn")
          TH_PRN("th_prn"),

          @SerializedName("th_tin")
          TH_TIN("th_tin"),

          @SerializedName("us_ein")
          US_EIN("us_ein");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MonthlyEstimatedRevenue {
        /** A non-negative integer representing the amount in the smallest currency unit. */
        @SerializedName("amount")
        Amount amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private MonthlyEstimatedRevenue(Amount amount, Map<String, Object> extraParams) {
          this.amount = amount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Amount amount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue build() {
            return new AccountCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue(
                this.amount, this.extraParams);
          }

          /** A non-negative integer representing the amount in the smallest currency unit. */
          public Builder setAmount(Amount amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue#extraParams} for
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
           * AccountCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue#extraParams} for
           * the field documentation.
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
      public static class ScriptAddresses {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Kana Address. */
        @SerializedName("kana")
        Kana kana;

        /** Kanji Address. */
        @SerializedName("kanji")
        Kanji kanji;

        private ScriptAddresses(Map<String, Object> extraParams, Kana kana, Kanji kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Kana kana;

          private Kanji kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.ScriptAddresses build() {
            return new AccountCreateParams.Identity.BusinessDetails.ScriptAddresses(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Identity.BusinessDetails.ScriptAddresses#extraParams} for the field
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
           * AccountCreateParams.Identity.BusinessDetails.ScriptAddresses#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Kana Address. */
          public Builder setKana(
              AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(
              AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;

          private Kana(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state,
              String town) {
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
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            private String town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana build() {
              return new AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
            }

            /** City, district, suburb, town, or village. */
            public Builder setCity(String city) {
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana#extraParams} for
             * the field documentation.
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;

          private Kanji(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state,
              String town) {
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
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            private String town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji build() {
              return new AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
            }

            /** City, district, suburb, town, or village. */
            public Builder setCity(String city) {
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji#extraParams} for
             * the field documentation.
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptNames {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Kana name. */
        @SerializedName("kana")
        Kana kana;

        /** Kanji name. */
        @SerializedName("kanji")
        Kanji kanji;

        private ScriptNames(Map<String, Object> extraParams, Kana kana, Kanji kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Kana kana;

          private Kanji kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.BusinessDetails.ScriptNames build() {
            return new AccountCreateParams.Identity.BusinessDetails.ScriptNames(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.ScriptNames#extraParams}
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
           * map. See {@link AccountCreateParams.Identity.BusinessDetails.ScriptNames#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Kana name. */
          public Builder setKana(
              AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji name. */
          public Builder setKanji(
              AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Registered name of the business. */
          @SerializedName("registered_name")
          String registeredName;

          private Kana(Map<String, Object> extraParams, String registeredName) {
            this.extraParams = extraParams;
            this.registeredName = registeredName;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String registeredName;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kana build() {
              return new AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kana(
                  this.extraParams, this.registeredName);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kana#extraParams} for the
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
             * AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kana#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Registered name of the business. */
            public Builder setRegisteredName(String registeredName) {
              this.registeredName = registeredName;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Registered name of the business. */
          @SerializedName("registered_name")
          String registeredName;

          private Kanji(Map<String, Object> extraParams, String registeredName) {
            this.extraParams = extraParams;
            this.registeredName = registeredName;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String registeredName;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kanji build() {
              return new AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kanji(
                  this.extraParams, this.registeredName);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kanji#extraParams} for the
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
             * AccountCreateParams.Identity.BusinessDetails.ScriptNames.Kanji#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Registered name of the business. */
            public Builder setRegisteredName(String registeredName) {
              this.registeredName = registeredName;
              return this;
            }
          }
        }
      }

      public enum Structure implements ApiRequestParams.EnumParam {
        @SerializedName("cooperative")
        COOPERATIVE("cooperative"),

        @SerializedName("free_zone_establishment")
        FREE_ZONE_ESTABLISHMENT("free_zone_establishment"),

        @SerializedName("free_zone_llc")
        FREE_ZONE_LLC("free_zone_llc"),

        @SerializedName("governmental_unit")
        GOVERNMENTAL_UNIT("governmental_unit"),

        @SerializedName("government_instrumentality")
        GOVERNMENT_INSTRUMENTALITY("government_instrumentality"),

        @SerializedName("incorporated_association")
        INCORPORATED_ASSOCIATION("incorporated_association"),

        @SerializedName("incorporated_non_profit")
        INCORPORATED_NON_PROFIT("incorporated_non_profit"),

        @SerializedName("incorporated_partnership")
        INCORPORATED_PARTNERSHIP("incorporated_partnership"),

        @SerializedName("limited_liability_partnership")
        LIMITED_LIABILITY_PARTNERSHIP("limited_liability_partnership"),

        @SerializedName("llc")
        LLC("llc"),

        @SerializedName("multi_member_llc")
        MULTI_MEMBER_LLC("multi_member_llc"),

        @SerializedName("private_company")
        PRIVATE_COMPANY("private_company"),

        @SerializedName("private_corporation")
        PRIVATE_CORPORATION("private_corporation"),

        @SerializedName("private_partnership")
        PRIVATE_PARTNERSHIP("private_partnership"),

        @SerializedName("public_company")
        PUBLIC_COMPANY("public_company"),

        @SerializedName("public_corporation")
        PUBLIC_CORPORATION("public_corporation"),

        @SerializedName("public_listed_corporation")
        PUBLIC_LISTED_CORPORATION("public_listed_corporation"),

        @SerializedName("public_partnership")
        PUBLIC_PARTNERSHIP("public_partnership"),

        @SerializedName("registered_charity")
        REGISTERED_CHARITY("registered_charity"),

        @SerializedName("single_member_llc")
        SINGLE_MEMBER_LLC("single_member_llc"),

        @SerializedName("sole_establishment")
        SOLE_ESTABLISHMENT("sole_establishment"),

        @SerializedName("sole_proprietorship")
        SOLE_PROPRIETORSHIP("sole_proprietorship"),

        @SerializedName("tax_exempt_government_instrumentality")
        TAX_EXEMPT_GOVERNMENT_INSTRUMENTALITY("tax_exempt_government_instrumentality"),

        @SerializedName("trust")
        TRUST("trust"),

        @SerializedName("unincorporated_association")
        UNINCORPORATED_ASSOCIATION("unincorporated_association"),

        @SerializedName("unincorporated_non_profit")
        UNINCORPORATED_NON_PROFIT("unincorporated_non_profit"),

        @SerializedName("unincorporated_partnership")
        UNINCORPORATED_PARTNERSHIP("unincorporated_partnership");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Structure(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Individual {
      /** Additional addresses associated with the individual. */
      @SerializedName("additional_addresses")
      List<AccountCreateParams.Identity.Individual.AdditionalAddress> additionalAddresses;

      /** Additional names (e.g. aliases) associated with the individual. */
      @SerializedName("additional_names")
      List<AccountCreateParams.Identity.Individual.AdditionalName> additionalNames;

      /** The individual's residential address. */
      @SerializedName("address")
      Address address;

      /** The individual's date of birth. */
      @SerializedName("date_of_birth")
      DateOfBirth dateOfBirth;

      /** Documents that may be submitted to satisfy various informational requests. */
      @SerializedName("documents")
      Documents documents;

      /** The individual's email address. */
      @SerializedName("email")
      String email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The individual's first name. */
      @SerializedName("given_name")
      String givenName;

      /** The identification numbers (e.g., SSN) associated with the individual. */
      @SerializedName("id_numbers")
      List<AccountCreateParams.Identity.Individual.IdNumber> idNumbers;

      /**
       * The individual's gender (International regulations require either &quot;male&quot; or
       * &quot;female&quot;).
       */
      @SerializedName("legal_gender")
      LegalGender legalGender;

      /**
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * The countries where the individual is a national. Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      @SerializedName("nationalities")
      List<String> nationalities;

      /** The individual's phone number. */
      @SerializedName("phone")
      String phone;

      /** The individual's political exposure. */
      @SerializedName("political_exposure")
      PoliticalExposure politicalExposure;

      /** The relationship that this individual has with the account's identity. */
      @SerializedName("relationship")
      Relationship relationship;

      /** The script addresses (e.g., non-Latin characters) associated with the individual. */
      @SerializedName("script_addresses")
      ScriptAddresses scriptAddresses;

      /** The individuals primary name in non latin script. */
      @SerializedName("script_names")
      ScriptNames scriptNames;

      /** The individual's last name. */
      @SerializedName("surname")
      String surname;

      private Individual(
          List<AccountCreateParams.Identity.Individual.AdditionalAddress> additionalAddresses,
          List<AccountCreateParams.Identity.Individual.AdditionalName> additionalNames,
          Address address,
          DateOfBirth dateOfBirth,
          Documents documents,
          String email,
          Map<String, Object> extraParams,
          String givenName,
          List<AccountCreateParams.Identity.Individual.IdNumber> idNumbers,
          LegalGender legalGender,
          Map<String, String> metadata,
          List<String> nationalities,
          String phone,
          PoliticalExposure politicalExposure,
          Relationship relationship,
          ScriptAddresses scriptAddresses,
          ScriptNames scriptNames,
          String surname) {
        this.additionalAddresses = additionalAddresses;
        this.additionalNames = additionalNames;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.documents = documents;
        this.email = email;
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.idNumbers = idNumbers;
        this.legalGender = legalGender;
        this.metadata = metadata;
        this.nationalities = nationalities;
        this.phone = phone;
        this.politicalExposure = politicalExposure;
        this.relationship = relationship;
        this.scriptAddresses = scriptAddresses;
        this.scriptNames = scriptNames;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<AccountCreateParams.Identity.Individual.AdditionalAddress> additionalAddresses;

        private List<AccountCreateParams.Identity.Individual.AdditionalName> additionalNames;

        private Address address;

        private DateOfBirth dateOfBirth;

        private Documents documents;

        private String email;

        private Map<String, Object> extraParams;

        private String givenName;

        private List<AccountCreateParams.Identity.Individual.IdNumber> idNumbers;

        private LegalGender legalGender;

        private Map<String, String> metadata;

        private List<String> nationalities;

        private String phone;

        private PoliticalExposure politicalExposure;

        private Relationship relationship;

        private ScriptAddresses scriptAddresses;

        private ScriptNames scriptNames;

        private String surname;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Identity.Individual build() {
          return new AccountCreateParams.Identity.Individual(
              this.additionalAddresses,
              this.additionalNames,
              this.address,
              this.dateOfBirth,
              this.documents,
              this.email,
              this.extraParams,
              this.givenName,
              this.idNumbers,
              this.legalGender,
              this.metadata,
              this.nationalities,
              this.phone,
              this.politicalExposure,
              this.relationship,
              this.scriptAddresses,
              this.scriptNames,
              this.surname);
        }

        /**
         * Add an element to `additionalAddresses` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountCreateParams.Identity.Individual#additionalAddresses} for the field
         * documentation.
         */
        public Builder addAdditionalAddress(
            AccountCreateParams.Identity.Individual.AdditionalAddress element) {
          if (this.additionalAddresses == null) {
            this.additionalAddresses = new ArrayList<>();
          }
          this.additionalAddresses.add(element);
          return this;
        }

        /**
         * Add all elements to `additionalAddresses` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountCreateParams.Identity.Individual#additionalAddresses} for the field
         * documentation.
         */
        public Builder addAllAdditionalAddress(
            List<AccountCreateParams.Identity.Individual.AdditionalAddress> elements) {
          if (this.additionalAddresses == null) {
            this.additionalAddresses = new ArrayList<>();
          }
          this.additionalAddresses.addAll(elements);
          return this;
        }

        /**
         * Add an element to `additionalNames` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountCreateParams.Identity.Individual#additionalNames} for the field
         * documentation.
         */
        public Builder addAdditionalName(
            AccountCreateParams.Identity.Individual.AdditionalName element) {
          if (this.additionalNames == null) {
            this.additionalNames = new ArrayList<>();
          }
          this.additionalNames.add(element);
          return this;
        }

        /**
         * Add all elements to `additionalNames` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountCreateParams.Identity.Individual#additionalNames} for the field
         * documentation.
         */
        public Builder addAllAdditionalName(
            List<AccountCreateParams.Identity.Individual.AdditionalName> elements) {
          if (this.additionalNames == null) {
            this.additionalNames = new ArrayList<>();
          }
          this.additionalNames.addAll(elements);
          return this;
        }

        /** The individual's residential address. */
        public Builder setAddress(AccountCreateParams.Identity.Individual.Address address) {
          this.address = address;
          return this;
        }

        /** The individual's date of birth. */
        public Builder setDateOfBirth(
            AccountCreateParams.Identity.Individual.DateOfBirth dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
          return this;
        }

        /** Documents that may be submitted to satisfy various informational requests. */
        public Builder setDocuments(AccountCreateParams.Identity.Individual.Documents documents) {
          this.documents = documents;
          return this;
        }

        /** The individual's email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Identity.Individual#extraParams} for the field
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
         * map. See {@link AccountCreateParams.Identity.Individual#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The individual's first name. */
        public Builder setGivenName(String givenName) {
          this.givenName = givenName;
          return this;
        }

        /**
         * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Identity.Individual#idNumbers} for the field documentation.
         */
        public Builder addIdNumber(AccountCreateParams.Identity.Individual.IdNumber element) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.add(element);
          return this;
        }

        /**
         * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Identity.Individual#idNumbers} for the field documentation.
         */
        public Builder addAllIdNumber(
            List<AccountCreateParams.Identity.Individual.IdNumber> elements) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.addAll(elements);
          return this;
        }

        /**
         * The individual's gender (International regulations require either &quot;male&quot; or
         * &quot;female&quot;).
         */
        public Builder setLegalGender(
            AccountCreateParams.Identity.Individual.LegalGender legalGender) {
          this.legalGender = legalGender;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * AccountCreateParams.Identity.Individual#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Identity.Individual#metadata} for the field
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
         * Add an element to `nationalities` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Identity.Individual#nationalities} for the field documentation.
         */
        public Builder addNationality(String element) {
          if (this.nationalities == null) {
            this.nationalities = new ArrayList<>();
          }
          this.nationalities.add(element);
          return this;
        }

        /**
         * Add all elements to `nationalities` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountCreateParams.Identity.Individual#nationalities} for the field
         * documentation.
         */
        public Builder addAllNationality(List<String> elements) {
          if (this.nationalities == null) {
            this.nationalities = new ArrayList<>();
          }
          this.nationalities.addAll(elements);
          return this;
        }

        /** The individual's phone number. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** The individual's political exposure. */
        public Builder setPoliticalExposure(
            AccountCreateParams.Identity.Individual.PoliticalExposure politicalExposure) {
          this.politicalExposure = politicalExposure;
          return this;
        }

        /** The relationship that this individual has with the account's identity. */
        public Builder setRelationship(
            AccountCreateParams.Identity.Individual.Relationship relationship) {
          this.relationship = relationship;
          return this;
        }

        /** The script addresses (e.g., non-Latin characters) associated with the individual. */
        public Builder setScriptAddresses(
            AccountCreateParams.Identity.Individual.ScriptAddresses scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The individuals primary name in non latin script. */
        public Builder setScriptNames(
            AccountCreateParams.Identity.Individual.ScriptNames scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The individual's last name. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalAddress {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

        /** <strong>Required.</strong> Purpose of additional address. */
        @SerializedName("purpose")
        Purpose purpose;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        /** Town or cho-me. */
        @SerializedName("town")
        String town;

        private AdditionalAddress(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            Purpose purpose,
            String state,
            String town) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.purpose = purpose;
          this.state = state;
          this.town = town;
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

          private Purpose purpose;

          private String state;

          private String town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.AdditionalAddress build() {
            return new AccountCreateParams.Identity.Individual.AdditionalAddress(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.purpose,
                this.state,
                this.town);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
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
           * map. See {@link AccountCreateParams.Identity.Individual.AdditionalAddress#extraParams}
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
           * map. See {@link AccountCreateParams.Identity.Individual.AdditionalAddress#extraParams}
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

          /** <strong>Required.</strong> Purpose of additional address. */
          public Builder setPurpose(
              AccountCreateParams.Identity.Individual.AdditionalAddress.Purpose purpose) {
            this.purpose = purpose;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** Town or cho-me. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }
        }

        public enum Purpose implements ApiRequestParams.EnumParam {
          @SerializedName("registered")
          REGISTERED("registered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Purpose(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalName {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The person's full name. */
        @SerializedName("full_name")
        String fullName;

        /** The person's first or given name. */
        @SerializedName("given_name")
        String givenName;

        /** <strong>Required.</strong> The purpose or type of the additional name. */
        @SerializedName("purpose")
        Purpose purpose;

        /** The person's last or family name. */
        @SerializedName("surname")
        String surname;

        private AdditionalName(
            Map<String, Object> extraParams,
            String fullName,
            String givenName,
            Purpose purpose,
            String surname) {
          this.extraParams = extraParams;
          this.fullName = fullName;
          this.givenName = givenName;
          this.purpose = purpose;
          this.surname = surname;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String fullName;

          private String givenName;

          private Purpose purpose;

          private String surname;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.AdditionalName build() {
            return new AccountCreateParams.Identity.Individual.AdditionalName(
                this.extraParams, this.fullName, this.givenName, this.purpose, this.surname);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.AdditionalName#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.Individual.AdditionalName#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The person's full name. */
          public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
          }

          /** The person's first or given name. */
          public Builder setGivenName(String givenName) {
            this.givenName = givenName;
            return this;
          }

          /** <strong>Required.</strong> The purpose or type of the additional name. */
          public Builder setPurpose(
              AccountCreateParams.Identity.Individual.AdditionalName.Purpose purpose) {
            this.purpose = purpose;
            return this;
          }

          /** The person's last or family name. */
          public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
          }
        }

        public enum Purpose implements ApiRequestParams.EnumParam {
          @SerializedName("alias")
          ALIAS("alias"),

          @SerializedName("maiden")
          MAIDEN("maiden");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Purpose(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

        /** Town or cho-me. */
        @SerializedName("town")
        String town;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state,
            String town) {
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
          private String city;

          private String country;

          private Map<String, Object> extraParams;

          private String line1;

          private String line2;

          private String postalCode;

          private String state;

          private String town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.Address build() {
            return new AccountCreateParams.Identity.Individual.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state,
                this.town);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
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
           * map. See {@link AccountCreateParams.Identity.Individual.Address#extraParams} for the
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
           * map. See {@link AccountCreateParams.Identity.Individual.Address#extraParams} for the
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

          /** Town or cho-me. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DateOfBirth {
        /** <strong>Required.</strong> The day of birth. */
        @SerializedName("day")
        Long day;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The month of birth. */
        @SerializedName("month")
        Long month;

        /** <strong>Required.</strong> The year of birth. */
        @SerializedName("year")
        Long year;

        private DateOfBirth(Long day, Map<String, Object> extraParams, Long month, Long year) {
          this.day = day;
          this.extraParams = extraParams;
          this.month = month;
          this.year = year;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long day;

          private Map<String, Object> extraParams;

          private Long month;

          private Long year;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.DateOfBirth build() {
            return new AccountCreateParams.Identity.Individual.DateOfBirth(
                this.day, this.extraParams, this.month, this.year);
          }

          /** <strong>Required.</strong> The day of birth. */
          public Builder setDay(Long day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.DateOfBirth#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.Individual.DateOfBirth#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The month of birth. */
          public Builder setMonth(Long month) {
            this.month = month;
            return this;
          }

          /** <strong>Required.</strong> The year of birth. */
          public Builder setYear(Long year) {
            this.year = year;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Documents {
        /**
         * One or more documents that demonstrate proof that this person is authorized to represent
         * the company.
         */
        @SerializedName("company_authorization")
        CompanyAuthorization companyAuthorization;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * One or more documents showing the person’s passport page with photo and personal data.
         */
        @SerializedName("passport")
        Passport passport;

        /**
         * An identifying document showing the person's name, either a passport or local ID card.
         */
        @SerializedName("primary_verification")
        PrimaryVerification primaryVerification;

        /**
         * A document showing address, either a passport, local ID card, or utility bill from a
         * well-known utility company.
         */
        @SerializedName("secondary_verification")
        SecondaryVerification secondaryVerification;

        /**
         * One or more documents showing the person’s visa required for living in the country where
         * they are residing.
         */
        @SerializedName("visa")
        Visa visa;

        private Documents(
            CompanyAuthorization companyAuthorization,
            Map<String, Object> extraParams,
            Passport passport,
            PrimaryVerification primaryVerification,
            SecondaryVerification secondaryVerification,
            Visa visa) {
          this.companyAuthorization = companyAuthorization;
          this.extraParams = extraParams;
          this.passport = passport;
          this.primaryVerification = primaryVerification;
          this.secondaryVerification = secondaryVerification;
          this.visa = visa;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private CompanyAuthorization companyAuthorization;

          private Map<String, Object> extraParams;

          private Passport passport;

          private PrimaryVerification primaryVerification;

          private SecondaryVerification secondaryVerification;

          private Visa visa;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.Documents build() {
            return new AccountCreateParams.Identity.Individual.Documents(
                this.companyAuthorization,
                this.extraParams,
                this.passport,
                this.primaryVerification,
                this.secondaryVerification,
                this.visa);
          }

          /**
           * One or more documents that demonstrate proof that this person is authorized to
           * represent the company.
           */
          public Builder setCompanyAuthorization(
              AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization
                  companyAuthorization) {
            this.companyAuthorization = companyAuthorization;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.Documents#extraParams} for the
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
           * map. See {@link AccountCreateParams.Identity.Individual.Documents#extraParams} for the
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
           * One or more documents showing the person’s passport page with photo and personal data.
           */
          public Builder setPassport(
              AccountCreateParams.Identity.Individual.Documents.Passport passport) {
            this.passport = passport;
            return this;
          }

          /**
           * An identifying document showing the person's name, either a passport or local ID card.
           */
          public Builder setPrimaryVerification(
              AccountCreateParams.Identity.Individual.Documents.PrimaryVerification
                  primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /**
           * A document showing address, either a passport, local ID card, or utility bill from a
           * well-known utility company.
           */
          public Builder setSecondaryVerification(
              AccountCreateParams.Identity.Individual.Documents.SecondaryVerification
                  secondaryVerification) {
            this.secondaryVerification = secondaryVerification;
            return this;
          }

          /**
           * One or more documents showing the person’s visa required for living in the country
           * where they are residing.
           */
          public Builder setVisa(AccountCreateParams.Identity.Individual.Documents.Visa visa) {
            this.visa = visa;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyAuthorization {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyAuthorization(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization build() {
              return new AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization#extraParams}
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
             * AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization#files} for the
             * field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization#files} for the
             * field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.Individual.Documents.CompanyAuthorization.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Passport {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private Passport(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.Documents.Passport build() {
              return new AccountCreateParams.Identity.Individual.Documents.Passport(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Passport#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Passport#extraParams} for the field
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Passport#files} for the field
             * documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Passport#files} for the field
             * documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.Individual.Documents.Passport.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryVerification {
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
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
           * referring to each side of the document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * <strong>Required.</strong> The format of the verification document. Currently supports
           * {@code front_back} only.
           */
          @SerializedName("type")
          Type type;

          private PrimaryVerification(
              Map<String, Object> extraParams, FrontBack frontBack, Type type) {
            this.extraParams = extraParams;
            this.frontBack = frontBack;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FrontBack frontBack;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.Documents.PrimaryVerification build() {
              return new AccountCreateParams.Identity.Individual.Documents.PrimaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.PrimaryVerification#extraParams}
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
             * AccountCreateParams.Identity.Individual.Documents.PrimaryVerification#extraParams}
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
             * <strong>Required.</strong> The <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
             * referring to each side of the document.
             */
            public Builder setFrontBack(
                AccountCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.Individual.Documents.PrimaryVerification.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack {
            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the back of the verification document. The purpose of the uploaded
             * file should be 'identity_document'. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            @SerializedName("back")
            String back;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> A <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
             * representing the front of the verification document. The purpose of the uploaded file
             * should be 'identity_document'. The uploaded file needs to be a color image (smaller
             * than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
             */
            @SerializedName("front")
            String front;

            private FrontBack(String back, Map<String, Object> extraParams, String front) {
              this.back = back;
              this.extraParams = extraParams;
              this.front = front;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String back;

              private Map<String, Object> extraParams;

              private String front;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack
                  build() {
                return new AccountCreateParams.Identity.Individual.Documents.PrimaryVerification
                    .FrontBack(this.back, this.extraParams, this.front);
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(String back) {
                this.back = back;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * AccountCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * <strong>Required.</strong> A <a
               * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
               * representing the front of the verification document. The purpose of the uploaded
               * file should be 'identity_document'. The uploaded file needs to be a color image
               * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB
               * in size.
               */
              public Builder setFront(String front) {
                this.front = front;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("front_back")
            FRONT_BACK("front_back");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SecondaryVerification {
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
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
           * referring to each side of the document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * <strong>Required.</strong> The format of the verification document. Currently supports
           * {@code front_back} only.
           */
          @SerializedName("type")
          Type type;

          private SecondaryVerification(
              Map<String, Object> extraParams, FrontBack frontBack, Type type) {
            this.extraParams = extraParams;
            this.frontBack = frontBack;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FrontBack frontBack;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.Documents.SecondaryVerification build() {
              return new AccountCreateParams.Identity.Individual.Documents.SecondaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.SecondaryVerification#extraParams}
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
             * AccountCreateParams.Identity.Individual.Documents.SecondaryVerification#extraParams}
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
             * <strong>Required.</strong> The <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
             * referring to each side of the document.
             */
            public Builder setFrontBack(
                AccountCreateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.Individual.Documents.SecondaryVerification.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack {
            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the back of the verification document. The purpose of the uploaded
             * file should be 'identity_document'. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            @SerializedName("back")
            String back;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> A <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
             * representing the front of the verification document. The purpose of the uploaded file
             * should be 'identity_document'. The uploaded file needs to be a color image (smaller
             * than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
             */
            @SerializedName("front")
            String front;

            private FrontBack(String back, Map<String, Object> extraParams, String front) {
              this.back = back;
              this.extraParams = extraParams;
              this.front = front;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String back;

              private Map<String, Object> extraParams;

              private String front;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountCreateParams.Identity.Individual.Documents.SecondaryVerification
                      .FrontBack
                  build() {
                return new AccountCreateParams.Identity.Individual.Documents.SecondaryVerification
                    .FrontBack(this.back, this.extraParams, this.front);
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(String back) {
                this.back = back;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountCreateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack#extraParams}
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
               * AccountCreateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack#extraParams}
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
               * <strong>Required.</strong> A <a
               * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
               * representing the front of the verification document. The purpose of the uploaded
               * file should be 'identity_document'. The uploaded file needs to be a color image
               * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB
               * in size.
               */
              public Builder setFront(String front) {
                this.front = front;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("front_back")
            FRONT_BACK("front_back");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Visa {
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
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private Visa(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.Documents.Visa build() {
              return new AccountCreateParams.Identity.Individual.Documents.Visa(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Visa#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Visa#extraParams} for the field
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Visa#files} for the field
             * documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountCreateParams.Identity.Individual.Documents.Visa#files} for the field
             * documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountCreateParams.Identity.Individual.Documents.Visa.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class IdNumber {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The ID number type of an individual. */
        @SerializedName("type")
        Type type;

        /** <strong>Required.</strong> The value of the ID number. */
        @SerializedName("value")
        String value;

        private IdNumber(Map<String, Object> extraParams, Type type, String value) {
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
          public AccountCreateParams.Identity.Individual.IdNumber build() {
            return new AccountCreateParams.Identity.Individual.IdNumber(
                this.extraParams, this.type, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.IdNumber#extraParams} for the
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
           * map. See {@link AccountCreateParams.Identity.Individual.IdNumber#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID number type of an individual. */
          public Builder setType(AccountCreateParams.Identity.Individual.IdNumber.Type type) {
            this.type = type;
            return this;
          }

          /** <strong>Required.</strong> The value of the ID number. */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("ae_eid")
          AE_EID("ae_eid"),

          @SerializedName("ao_nif")
          AO_NIF("ao_nif"),

          @SerializedName("az_tin")
          AZ_TIN("az_tin"),

          @SerializedName("bd_brc")
          BD_BRC("bd_brc"),

          @SerializedName("bd_etin")
          BD_ETIN("bd_etin"),

          @SerializedName("bd_nid")
          BD_NID("bd_nid"),

          @SerializedName("br_cpf")
          BR_CPF("br_cpf"),

          @SerializedName("cr_cpf")
          CR_CPF("cr_cpf"),

          @SerializedName("cr_dimex")
          CR_DIMEX("cr_dimex"),

          @SerializedName("cr_nite")
          CR_NITE("cr_nite"),

          @SerializedName("de_stn")
          DE_STN("de_stn"),

          @SerializedName("do_rcn")
          DO_RCN("do_rcn"),

          @SerializedName("gt_nit")
          GT_NIT("gt_nit"),

          @SerializedName("hk_id")
          HK_ID("hk_id"),

          @SerializedName("kz_iin")
          KZ_IIN("kz_iin"),

          @SerializedName("mx_rfc")
          MX_RFC("mx_rfc"),

          @SerializedName("my_nric")
          MY_NRIC("my_nric"),

          @SerializedName("mz_nuit")
          MZ_NUIT("mz_nuit"),

          @SerializedName("nl_bsn")
          NL_BSN("nl_bsn"),

          @SerializedName("pe_dni")
          PE_DNI("pe_dni"),

          @SerializedName("pk_cnic")
          PK_CNIC("pk_cnic"),

          @SerializedName("pk_snic")
          PK_SNIC("pk_snic"),

          @SerializedName("sa_tin")
          SA_TIN("sa_tin"),

          @SerializedName("sg_fin")
          SG_FIN("sg_fin"),

          @SerializedName("sg_nric")
          SG_NRIC("sg_nric"),

          @SerializedName("th_lc")
          TH_LC("th_lc"),

          @SerializedName("th_pin")
          TH_PIN("th_pin"),

          @SerializedName("us_itin")
          US_ITIN("us_itin"),

          @SerializedName("us_itin_last_4")
          US_ITIN_LAST_4("us_itin_last_4"),

          @SerializedName("us_ssn")
          US_SSN("us_ssn"),

          @SerializedName("us_ssn_last_4")
          US_SSN_LAST_4("us_ssn_last_4");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Relationship {
        /**
         * Whether the person is a director of the account's identity. Directors are typically
         * members of the governing board of the company, or responsible for ensuring the company
         * meets its regulatory obligations.
         */
        @SerializedName("director")
        Boolean director;

        /**
         * Whether the person has significant responsibility to control, manage, or direct the
         * organization.
         */
        @SerializedName("executive")
        Boolean executive;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether the person is an owner of the account’s identity. */
        @SerializedName("owner")
        Boolean owner;

        /** The percent owned by the person of the account's legal entity. */
        @SerializedName("percent_ownership")
        String percentOwnership;

        /** The person's title (e.g., CEO, Support Engineer). */
        @SerializedName("title")
        String title;

        private Relationship(
            Boolean director,
            Boolean executive,
            Map<String, Object> extraParams,
            Boolean owner,
            String percentOwnership,
            String title) {
          this.director = director;
          this.executive = executive;
          this.extraParams = extraParams;
          this.owner = owner;
          this.percentOwnership = percentOwnership;
          this.title = title;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean director;

          private Boolean executive;

          private Map<String, Object> extraParams;

          private Boolean owner;

          private String percentOwnership;

          private String title;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.Relationship build() {
            return new AccountCreateParams.Identity.Individual.Relationship(
                this.director,
                this.executive,
                this.extraParams,
                this.owner,
                this.percentOwnership,
                this.title);
          }

          /**
           * Whether the person is a director of the account's identity. Directors are typically
           * members of the governing board of the company, or responsible for ensuring the company
           * meets its regulatory obligations.
           */
          public Builder setDirector(Boolean director) {
            this.director = director;
            return this;
          }

          /**
           * Whether the person has significant responsibility to control, manage, or direct the
           * organization.
           */
          public Builder setExecutive(Boolean executive) {
            this.executive = executive;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.Relationship#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.Individual.Relationship#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether the person is an owner of the account’s identity. */
          public Builder setOwner(Boolean owner) {
            this.owner = owner;
            return this;
          }

          /** The percent owned by the person of the account's legal entity. */
          public Builder setPercentOwnership(String percentOwnership) {
            this.percentOwnership = percentOwnership;
            return this;
          }

          /** The person's title (e.g., CEO, Support Engineer). */
          public Builder setTitle(String title) {
            this.title = title;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptAddresses {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Kana Address. */
        @SerializedName("kana")
        Kana kana;

        /** Kanji Address. */
        @SerializedName("kanji")
        Kanji kanji;

        private ScriptAddresses(Map<String, Object> extraParams, Kana kana, Kanji kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Kana kana;

          private Kanji kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.ScriptAddresses build() {
            return new AccountCreateParams.Identity.Individual.ScriptAddresses(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.ScriptAddresses#extraParams}
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
           * map. See {@link AccountCreateParams.Identity.Individual.ScriptAddresses#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Kana Address. */
          public Builder setKana(
              AccountCreateParams.Identity.Individual.ScriptAddresses.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(
              AccountCreateParams.Identity.Individual.ScriptAddresses.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;

          private Kana(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state,
              String town) {
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
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            private String town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.ScriptAddresses.Kana build() {
              return new AccountCreateParams.Identity.Individual.ScriptAddresses.Kana(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
            }

            /** City, district, suburb, town, or village. */
            public Builder setCity(String city) {
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.ScriptAddresses.Kana#extraParams} for the
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
             * AccountCreateParams.Identity.Individual.ScriptAddresses.Kana#extraParams} for the
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;

          private Kanji(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state,
              String town) {
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
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            private String town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.ScriptAddresses.Kanji build() {
              return new AccountCreateParams.Identity.Individual.ScriptAddresses.Kanji(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
            }

            /** City, district, suburb, town, or village. */
            public Builder setCity(String city) {
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.ScriptAddresses.Kanji#extraParams} for the
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
             * AccountCreateParams.Identity.Individual.ScriptAddresses.Kanji#extraParams} for the
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptNames {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Persons name in kana script. */
        @SerializedName("kana")
        Kana kana;

        /** Persons name in kanji script. */
        @SerializedName("kanji")
        Kanji kanji;

        private ScriptNames(Map<String, Object> extraParams, Kana kana, Kanji kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Kana kana;

          private Kanji kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Identity.Individual.ScriptNames build() {
            return new AccountCreateParams.Identity.Individual.ScriptNames(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Identity.Individual.ScriptNames#extraParams} for
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
           * map. See {@link AccountCreateParams.Identity.Individual.ScriptNames#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Persons name in kana script. */
          public Builder setKana(AccountCreateParams.Identity.Individual.ScriptNames.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Persons name in kanji script. */
          public Builder setKanji(AccountCreateParams.Identity.Individual.ScriptNames.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The person's first or given name. */
          @SerializedName("given_name")
          String givenName;

          /** The person's last or family name. */
          @SerializedName("surname")
          String surname;

          private Kana(Map<String, Object> extraParams, String givenName, String surname) {
            this.extraParams = extraParams;
            this.givenName = givenName;
            this.surname = surname;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String givenName;

            private String surname;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.ScriptNames.Kana build() {
              return new AccountCreateParams.Identity.Individual.ScriptNames.Kana(
                  this.extraParams, this.givenName, this.surname);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.ScriptNames.Kana#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.ScriptNames.Kana#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The person's first or given name. */
            public Builder setGivenName(String givenName) {
              this.givenName = givenName;
              return this;
            }

            /** The person's last or family name. */
            public Builder setSurname(String surname) {
              this.surname = surname;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The person's first or given name. */
          @SerializedName("given_name")
          String givenName;

          /** The person's last or family name. */
          @SerializedName("surname")
          String surname;

          private Kanji(Map<String, Object> extraParams, String givenName, String surname) {
            this.extraParams = extraParams;
            this.givenName = givenName;
            this.surname = surname;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String givenName;

            private String surname;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountCreateParams.Identity.Individual.ScriptNames.Kanji build() {
              return new AccountCreateParams.Identity.Individual.ScriptNames.Kanji(
                  this.extraParams, this.givenName, this.surname);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.ScriptNames.Kanji#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountCreateParams.Identity.Individual.ScriptNames.Kanji#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The person's first or given name. */
            public Builder setGivenName(String givenName) {
              this.givenName = givenName;
              return this;
            }

            /** The person's last or family name. */
            public Builder setSurname(String surname) {
              this.surname = surname;
              return this;
            }
          }
        }
      }

      public enum LegalGender implements ApiRequestParams.EnumParam {
        @SerializedName("female")
        FEMALE("female"),

        @SerializedName("male")
        MALE("male");

        @Getter(onMethod_ = {@Override})
        private final String value;

        LegalGender(String value) {
          this.value = value;
        }
      }

      public enum PoliticalExposure implements ApiRequestParams.EnumParam {
        @SerializedName("existing")
        EXISTING("existing"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PoliticalExposure(String value) {
          this.value = value;
        }
      }
    }

    public enum EntityType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("government_entity")
      GOVERNMENT_ENTITY("government_entity"),

      @SerializedName("individual")
      INDIVIDUAL("individual"),

      @SerializedName("non_profit")
      NON_PROFIT("non_profit");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EntityType(String value) {
        this.value = value;
      }
    }
  }

  public enum Dashboard implements ApiRequestParams.EnumParam {
    @SerializedName("express")
    EXPRESS("express"),

    @SerializedName("full")
    FULL("full"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Dashboard(String value) {
      this.value = value;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("configuration.card_creator")
    CONFIGURATION__CARD_CREATOR("configuration.card_creator"),

    @SerializedName("configuration.customer")
    CONFIGURATION__CUSTOMER("configuration.customer"),

    @SerializedName("configuration.merchant")
    CONFIGURATION__MERCHANT("configuration.merchant"),

    @SerializedName("configuration.recipient")
    CONFIGURATION__RECIPIENT("configuration.recipient"),

    @SerializedName("configuration.storer")
    CONFIGURATION__STORER("configuration.storer"),

    @SerializedName("defaults")
    DEFAULTS("defaults"),

    @SerializedName("identity")
    IDENTITY("identity"),

    @SerializedName("requirements")
    REQUIREMENTS("requirements");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
