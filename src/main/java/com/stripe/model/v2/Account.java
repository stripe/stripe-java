// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Account extends StripeObject implements HasId {
  /**
   * Closed Enum. A list of the configurations which have been applied to the Account to allow
   * Accounts to be filtered by the products they have been configured for. Currently can only
   * contain {@code recipient}, which will be present if a recipient configuration is set.
   */
  @SerializedName("applied_configurations")
  List<String> appliedConfigurations;

  /**
   * Configuration to enable this Account to be used as a recipient of an OutboundPayment via the
   * OutboundPayments API, or via the dashboard.
   */
  @SerializedName("configuration")
  Configuration configuration;

  /**
   * Time at which the object was created. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /**
   * The default contact email address for the Account. This field is optional, but must be supplied
   * before the recipient configuration can be populated.
   */
  @SerializedName("email")
  String email;

  /** Unique identifier for the Account. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The default set of verification information for the Account. Currently, this only includes a
   * single Legal Entity which must be set as the default.
   */
  @SerializedName("legal_entity_data")
  LegalEntityData legalEntityData;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * A descriptive name for the Account. This name will be surfaced in the Account directory in the
   * dashboard.
   */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code account}.
   */
  @SerializedName("object")
  String object;

  /**
   * A list of outstanding tasks users must complete before Stripe allows the Account’s Features to
   * be activated.
   */
  @SerializedName("requirements")
  List<Account.Requirement> requirements;

  /**
   * For more details about Configuration, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Configuration extends StripeObject {
    /**
     * Configuration to enable this Account to be used as a recipient of an OutboundPayment via the
     * OutboundPayments API, or via the dashboard. This field will only be returned if {@code
     * configuration.recipient_data} is passed in the {@code include} parameter. Note that you
     * cannot pass the {@code include} parameter on list requests so this field cannot be populated
     * for lists.
     */
    @SerializedName("recipient_data")
    RecipientData recipientData;

    /**
     * Supported features that can be requested for the Account's configurations. This field will
     * only be returned if {@code supportable_features.recipient_data} is passed in the {@code
     * include} parameter. Note that you cannot pass the {@code include} parameter on list requests
     * so this field cannot be populated for lists.
     */
    @SerializedName("supportable_features")
    SupportableFeatures supportableFeatures;

    /**
     * For more details about RecipientData, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RecipientData extends StripeObject {
      /**
       * The payout method id to be used as a default outbound destination. This will allow the
       * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
       * dashboard.
       */
      @SerializedName("default_outbound_destination")
      DefaultOutboundDestination defaultOutboundDestination;

      /**
       * Features representing the functionality that should be enabled for when this Account is
       * used as a recipient. Features need to be explicitly requested, and the {@code status} field
       * indicates if the Feature is {@code active}, {@code restricted} or {@code pending}. Once a
       * Feature is {@code active}, the Account can be used with the product flow that the Feature
       * enables.
       */
      @SerializedName("features")
      Features features;

      /**
       * For more details about DefaultOutboundDestination, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DefaultOutboundDestination extends StripeObject implements HasId {
        /** The payout method ID of the default outbound destination. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /**
         * Closed Enum. The payout method type of the default outbound destination.
         *
         * <p>One of {@code at_bank_account}, {@code au_bank_account}, {@code ba_bank_account},
         * {@code be_bank_account}, {@code bg_bank_account}, {@code bj_bank_account}, {@code
         * bs_bank_account}, {@code card}, {@code ca_bank_account}, {@code ch_bank_account}, {@code
         * ci_bank_account}, {@code cy_bank_account}, {@code cz_bank_account}, {@code
         * de_bank_account}, {@code dk_bank_account}, {@code ec_bank_account}, {@code
         * ee_bank_account}, {@code es_bank_account}, {@code et_bank_account}, {@code
         * fi_bank_account}, {@code fr_bank_account}, {@code gb_bank_account}, {@code
         * gr_bank_account}, {@code hr_bank_account}, {@code hu_bank_account}, {@code
         * id_bank_account}, {@code ie_bank_account}, {@code il_bank_account}, {@code
         * in_bank_account}, {@code is_bank_account}, {@code it_bank_account}, {@code
         * ke_bank_account}, {@code li_bank_account}, {@code lt_bank_account}, {@code
         * lu_bank_account}, {@code lv_bank_account}, {@code mn_bank_account}, {@code
         * mt_bank_account}, {@code mu_bank_account}, {@code mx_bank_account}, {@code
         * na_bank_account}, {@code nl_bank_account}, {@code no_bank_account}, {@code
         * nz_bank_account}, {@code pa_bank_account}, {@code ph_bank_account}, {@code
         * pl_bank_account}, {@code pt_bank_account}, {@code ro_bank_account}, {@code
         * rs_bank_account}, {@code se_bank_account}, {@code sg_bank_account}, {@code
         * si_bank_account}, {@code sk_bank_account}, {@code sn_bank_account}, {@code
         * sv_bank_account}, {@code tn_bank_account}, {@code tr_bank_account}, {@code
         * us_bank_account}, or {@code za_bank_account}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /** Features that enable OutboundPayments to a bank account linked to this Account. */
        @SerializedName("bank_accounts")
        BankAccounts bankAccounts;

        /** Features that enable OutboundPayments to a card linked to this Account. */
        @SerializedName("cards")
        Cards cards;

        /**
         * For more details about BankAccounts, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BankAccounts extends StripeObject {
          /**
           * Enables this Account to receive OutboundPayments to linked bank accounts over local
           * networks.
           */
          @SerializedName("local")
          Local local;

          /** Enables this Account to receive OutboundPayments to linked bank accounts over wire. */
          @SerializedName("wire")
          Wire wire;

          /**
           * For more details about Local, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Local extends StripeObject {
            /** Whether or not the Feature has been requested. */
            @SerializedName("requested")
            Boolean requested;

            /**
             * Closed Enum. The current status of the Feature. Once the status is {@code active},
             * the Account is ready to be used in the product flow that the Feature represents.
             *
             * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code
             * unsupported}.
             */
            @SerializedName("status")
            String status;

            /**
             * Additional details regarding the status of the Feature - will be empty if status is
             * {@code active}.
             */
            @SerializedName("status_details")
            List<Account.Configuration.RecipientData.Features.BankAccounts.Local.StatusDetail>
                statusDetails;

            /**
             * For more details about StatusDetail, please refer to the <a
             * href="https://docs.stripe.com/api">API Reference.</a>
             */
            @Getter
            @Setter
            @EqualsAndHashCode(callSuper = false)
            public static class StatusDetail extends StripeObject {
              /**
               * Closed Enum. Status code, explaining why the Feature has a given status, if it is
               * not {@code active}.
               *
               * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
               * requirements_pending_verification}, {@code restricted_other}, or {@code
               * unsupported_country}.
               */
              @SerializedName("code")
              String code;

              /**
               * Closed Enum. Additional information about how to resolve the Feature status, if it
               * is not {@code active}.
               *
               * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
               */
              @SerializedName("resolution")
              String resolution;
            }
          }

          /**
           * For more details about Wire, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Wire extends StripeObject {
            /** Whether or not the Feature has been requested. */
            @SerializedName("requested")
            Boolean requested;

            /**
             * Closed Enum. The current status of the Feature. Once the status is {@code active},
             * the Account is ready to be used in the product flow that the Feature represents.
             *
             * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code
             * unsupported}.
             */
            @SerializedName("status")
            String status;

            /**
             * Additional details regarding the status of the Feature - will be empty if status is
             * {@code active}.
             */
            @SerializedName("status_details")
            List<Account.Configuration.RecipientData.Features.BankAccounts.Wire.StatusDetail>
                statusDetails;

            /**
             * For more details about StatusDetail, please refer to the <a
             * href="https://docs.stripe.com/api">API Reference.</a>
             */
            @Getter
            @Setter
            @EqualsAndHashCode(callSuper = false)
            public static class StatusDetail extends StripeObject {
              /**
               * Closed Enum. Status code, explaining why the Feature has a given status, if it is
               * not {@code active}.
               *
               * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
               * requirements_pending_verification}, {@code restricted_other}, or {@code
               * unsupported_country}.
               */
              @SerializedName("code")
              String code;

              /**
               * Closed Enum. Additional information about how to resolve the Feature status, if it
               * is not {@code active}.
               *
               * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
               */
              @SerializedName("resolution")
              String resolution;
            }
          }
        }

        /**
         * For more details about Cards, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Cards extends StripeObject {
          /** Whether or not the Feature has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * Closed Enum. The current status of the Feature. Once the status is {@code active}, the
           * Account is ready to be used in the product flow that the Feature represents.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Feature - will be empty if status is
           * {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.RecipientData.Features.Cards.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Closed Enum. Status code, explaining why the Feature has a given status, if it is not
             * {@code active}.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, or {@code
             * unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Closed Enum. Additional information about how to resolve the Feature status, if it is
             * not {@code active}.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }
      }
    }

    /**
     * For more details about SupportableFeatures, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SupportableFeatures extends StripeObject {
      /**
       * Closed Enum. A list of supported features that can be requested when the Account is
       * configured as a recipient. Will be unset unless Legal Entity country has been provided for
       * this Account.
       */
      @SerializedName("recipient_data")
      List<String> recipientData;
    }
  }

  /**
   * For more details about LegalEntityData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LegalEntityData extends StripeObject {
    /** The address of the Legal Entity. */
    @SerializedName("address")
    Address address;

    /**
     * Closed Enum. The business type of the Legal Entity.
     *
     * <p>One of {@code company}, or {@code individual}.
     */
    @SerializedName("business_type")
    String businessType;

    /**
     * Open Enum. Two-letter country code (ISO 3166-1 alpha-2) for where the company or individual
     * is located.
     *
     * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code am},
     * {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw}, {@code
     * ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code bg},
     * {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo}, {@code
     * bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code bz},
     * {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci}, {@code
     * ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code cv},
     * {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code
     * dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er},
     * {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code
     * fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh},
     * {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code
     * gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
     * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im}, {@code
     * in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code jm},
     * {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km}, {@code
     * kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code lb},
     * {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu}, {@code
     * lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code mg},
     * {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp}, {@code
     * mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code mx},
     * {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code
     * ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om},
     * {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code
     * pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa},
     * {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code
     * sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
     * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss}, {@code
     * st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code tf},
     * {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn}, {@code
     * to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code ug},
     * {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve}, {@code
     * vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code ye},
     * {@code yt}, {@code za}, {@code zm}, or {@code zw}.
     */
    @SerializedName("country")
    String country;

    /**
     * The legal name of this Legal Entity. Required unless the business type is {@code individual}.
     */
    @SerializedName("name")
    String name;

    /**
     * The representative of the Legal Entity. This is the person nominated by the Legal Entity to
     * provide information about themselves, and general information about the account. For legal
     * entities with {@code individual} business type, this field is required and should contain the
     * individual's information.
     */
    @SerializedName("representative")
    Representative representative;

    /**
     * For more details about Address, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City. */
      @SerializedName("city")
      String city;

      /**
       * Open Enum. Two-letter country code.
       *
       * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code
       * am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw},
       * {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code
       * bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo},
       * {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code
       * bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci},
       * {@code ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code
       * cv}, {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk},
       * {@code dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code
       * er}, {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo},
       * {@code fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code
       * gh}, {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr},
       * {@code gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code
       * hn}, {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
       * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code
       * jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km},
       * {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code
       * lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu},
       * {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code
       * mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp},
       * {@code mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code
       * mx}, {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng},
       * {@code ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code
       * om}, {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl},
       * {@code pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code
       * qa}, {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa},
       * {@code sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code
       * sj}, {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
       * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code
       * tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn},
       * {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code
       * ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve},
       * {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code
       * ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
       */
      @SerializedName("country")
      String country;

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

      /** Town. */
      @SerializedName("town")
      String town;
    }

    /**
     * For more details about Representative, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Representative extends StripeObject {
      /** The address of the representative. */
      @SerializedName("address")
      Address address;

      /** The date of birth of the representative. */
      @SerializedName("dob")
      Dob dob;

      /** The given name of the representative. */
      @SerializedName("given_name")
      String givenName;

      /** The surname of the representative. */
      @SerializedName("surname")
      String surname;

      /**
       * For more details about Address, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Address extends StripeObject {
        /** City. */
        @SerializedName("city")
        String city;

        /**
         * Open Enum. Two-letter country code.
         *
         * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code
         * am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw},
         * {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf},
         * {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn},
         * {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw},
         * {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg},
         * {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn}, {@code co},
         * {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy}, {@code cz},
         * {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz}, {@code ec},
         * {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et}, {@code fi},
         * {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga}, {@code gb},
         * {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi}, {@code gl},
         * {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs}, {@code gt},
         * {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn}, {@code hr},
         * {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im}, {@code in},
         * {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code jm},
         * {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km},
         * {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la},
         * {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt},
         * {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me},
         * {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn},
         * {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu},
         * {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na}, {@code nc},
         * {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no}, {@code np},
         * {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe}, {@code pf},
         * {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn}, {@code pr},
         * {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz}, {@code re},
         * {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb}, {@code sc},
         * {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj}, {@code sk},
         * {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss}, {@code st},
         * {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code tf},
         * {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn},
         * {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua},
         * {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc},
         * {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws},
         * {@code xx}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
         */
        @SerializedName("country")
        String country;

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

        /** Town. */
        @SerializedName("town")
        String town;
      }

      /**
       * For more details about Dob, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Dob extends StripeObject {
        /** The day of birth of the representative. */
        @SerializedName("day")
        Integer day;

        /** The month of birth of the representative. */
        @SerializedName("month")
        Integer month;

        /** The year of birth of the representative. */
        @SerializedName("year")
        Integer year;
      }
    }
  }

  /**
   * For more details about Requirement, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirement extends StripeObject {
    /**
     * Closed Enum. Whether the responsibility is with the integrator to action, or with Stripe (to
     * review info, to wait for some condition, etc.).
     *
     * <p>One of {@code stripe}, or {@code user}.
     */
    @SerializedName("awaiting_action_from")
    String awaitingActionFrom;

    /** When the requirement is due. */
    @SerializedName("deadline")
    Deadline deadline;

    /**
     * Open Enum. The unique identifier describing the data to be collected for this requirement.
     *
     * <p>One of {@code legal_entity.addresses.business_registration.city}, {@code
     * legal_entity.addresses.business_registration.country}, {@code
     * legal_entity.addresses.business_registration.line1}, {@code
     * legal_entity.addresses.business_registration.postal_code}, {@code
     * legal_entity.addresses.business_registration.state}, {@code legal_entity.business_type},
     * {@code legal_entity.documents.primary_identification}, {@code legal_entity.name}, {@code
     * recipient_config.recipient_verification}, {@code representative.addresses.residential.city},
     * {@code representative.addresses.residential.country}, {@code
     * representative.addresses.residential.line1}, {@code
     * representative.addresses.residential.postal_code}, {@code
     * representative.addresses.residential.state}, {@code representative.dob}, {@code
     * representative.documents.primary_identification}, {@code representative.given_name}, or
     * {@code representative.surname}.
     */
    @SerializedName("description")
    String description;

    /**
     * Communicate remediation steps with users if data previously submitted by user is not
     * acceptable by Stripe.
     */
    @SerializedName("errors")
    List<Account.Requirement.Errors> errors;

    /** Consequence of not completing this entry on time and in a Stripe-accepted manner. */
    @SerializedName("impact")
    Impact impact;

    /** Open Enum. Why Stripe wants this information. */
    @SerializedName("requested_reasons")
    List<String> requestedReasons;

    /**
     * For more details about Deadline, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Deadline extends StripeObject {
      /** Machine-readable version of the deadline. */
      @SerializedName("due_at")
      Instant dueAt;

      /**
       * Closed Enum. Human-readable description of the deadline.
       *
       * <p>One of {@code conditionally_due}, {@code currently_due}, or {@code deadline_past_due}.
       */
      @SerializedName("status")
      String status;
    }

    /**
     * For more details about Errors, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * Open Enum. Machine-readable error codes.
       *
       * <p>Equal to {@code po_box_address_not_allowed}.
       */
      @SerializedName("code")
      String code;

      /** Human-readable error messages. */
      @SerializedName("message")
      String message;
    }

    /**
     * For more details about Impact, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Impact extends StripeObject {
      /** Open Enum. The set of Features that are restricted by this requirement. */
      @SerializedName("required_for_features")
      List<String> requiredForFeatures;
    }
  }
}
