// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
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
   * Filter only accounts that have all of the configurations specified. If omitted, returns all
   * accounts regardless of which configurations they have.
   */
  @SerializedName("applied_configurations")
  List<String> appliedConfigurations;

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
   * Time at which the object was created. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /**
   * A value indicating the Stripe dashboard this Account has access to. This will depend on which
   * configurations are enabled for this account.
   *
   * <p>One of {@code express}, {@code full}, or {@code none}.
   */
  @SerializedName("dashboard")
  String dashboard;

  /** Default values to be used on Account Configurations. */
  @SerializedName("defaults")
  Defaults defaults;

  /**
   * A descriptive name for the Account. This name will be surfaced in the Stripe Dashboard and on
   * any invoices sent to the Account.
   */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the Account. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Information about the company, individual, and business represented by the Account. */
  @SerializedName("identity")
  Identity identity;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.account}.
   */
  @SerializedName("object")
  String object;

  /**
   * Information about the requirements for the Account, including what information needs to be
   * collected, and by when.
   */
  @SerializedName("requirements")
  Requirements requirements;

  /**
   * For more details about Configuration, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Configuration extends StripeObject {
    /** The Customer Configuration allows the Account to be used in inbound payment flows. */
    @SerializedName("customer")
    Customer customer;

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
     * For more details about Customer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Customer extends StripeObject {
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

      /** The customer's shipping information. Appears on invoices emailed to this customer. */
      @SerializedName("shipping")
      Shipping shipping;

      /**
       * ID of the test clock to attach to the customer. Can only be set on testmode Accounts, and
       * when the Customer Configuration is first set on an Account.
       */
      @SerializedName("test_clock")
      String testClock;

      /**
       * For more details about AutomaticIndirectTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AutomaticIndirectTax extends StripeObject {
        /**
         * Describes the customer's tax exemption status, which is {@code none}, {@code exempt}, or
         * {@code reverse}. When set to reverse, invoice and receipt PDFs include the following
         * text: “Reverse charge”.
         *
         * <p>One of {@code exempt}, {@code none}, or {@code reverse}.
         */
        @SerializedName("exempt")
        String exempt;

        /**
         * A recent IP address of the customer used for tax reporting and tax location inference.
         */
        @SerializedName("ip_address")
        String ipAddress;

        /**
         * The customer’s location as identified by Stripe Tax - uses {@code location_source}. Will
         * only be rendered if the {@code automatic_indirect_tax} feature is requested and {@code
         * active}.
         */
        @SerializedName("location")
        Location location;

        /**
         * The data source used by Stripe Tax to identify the customer's location - defaults to
         * 'identity_address'. Will only be used for automatic tax calculation on the customer's
         * Invoices and Subscriptions.
         *
         * <p>One of {@code identity_address}, {@code ip_address}, or {@code shipping_address}.
         */
        @SerializedName("location_source")
        String locationSource;

        /**
         * For more details about Location, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Location extends StripeObject {
          /**
           * The customer's country as identified by Stripe Tax.
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
           */
          @SerializedName("country")
          String country;

          /** The customer's state, county, province, or region as identified by Stripe Tax. */
          @SerializedName("state")
          String state;
        }
      }

      /**
       * For more details about Billing, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Billing extends StripeObject {
        /**
         * ID of a payment method that’s attached to the customer, to be used as the customer’s
         * default payment method for invoices and subscriptions.
         */
        @SerializedName("default_payment_method")
        String defaultPaymentMethod;

        /** Default settings used on invoices for this customer. */
        @SerializedName("invoice")
        Invoice invoice;

        /**
         * For more details about Invoice, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Invoice extends StripeObject {
          /**
           * The list of up to 4 default custom fields to be displayed on invoices for this
           * customer. When updating, pass an empty string to remove previously-defined fields.
           */
          @SerializedName("custom_fields")
          List<Account.Configuration.Customer.Billing.Invoice.CustomField> customFields;

          /** Default footer to be displayed on invoices for this customer. */
          @SerializedName("footer")
          String footer;

          /** The sequence to be used on the customer's next invoice. Defaults to 1. */
          @SerializedName("next_sequence")
          Integer nextSequence;

          /**
           * The prefix for the customer used to generate unique invoice numbers. Must be 3–12
           * uppercase letters or numbers.
           */
          @SerializedName("prefix")
          String prefix;

          /** Default options for invoice PDF rendering for this customer. */
          @SerializedName("rendering")
          Rendering rendering;

          /**
           * For more details about CustomField, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class CustomField extends StripeObject {
            /** The name of the custom field. This may be up to 40 characters. */
            @SerializedName("name")
            String name;

            /**
             * The value of the custom field. This may be up to 140 characters. When updating, pass
             * an empty string to remove previously-defined values.
             */
            @SerializedName("value")
            String value;
          }

          /**
           * For more details about Rendering, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Rendering extends StripeObject {
            /**
             * How line-item prices and amounts will be displayed with respect to tax on invoice
             * PDFs. One of exclude_tax or include_inclusive_tax. include_inclusive_tax will include
             * inclusive tax (and exclude exclusive tax) in invoice PDF amounts. exclude_tax will
             * exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
             */
            @SerializedName("amount_tax_display")
            String amountTaxDisplay;

            /** ID of the invoice rendering template to use for future invoices. */
            @SerializedName("template")
            String template;
          }
        }
      }

      /**
       * For more details about Capabilities, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities extends StripeObject {
        /**
         * Generates requirements for enabling automatic indirect tax calculation on this customer's
         * invoices or subscriptions. Recommended to request this capability if planning to enable
         * automatic tax calculation on this customer's invoices or subscriptions. Uses the {@code
         * location_source} field.
         */
        @SerializedName("automatic_indirect_tax")
        AutomaticIndirectTax automaticIndirectTax;

        /**
         * For more details about AutomaticIndirectTax, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AutomaticIndirectTax extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Customer.Capabilities.AutomaticIndirectTax.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }
      }

      /**
       * For more details about Shipping, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping extends StripeObject {
        /** Customer shipping address. */
        @SerializedName("address")
        Address address;

        /** Customer name. */
        @SerializedName("name")
        String name;

        /** Customer phone (including extension). */
        @SerializedName("phone")
        String phone;

        /**
         * For more details about Address, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Address extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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
        }
      }
    }

    /**
     * For more details about Merchant, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Merchant extends StripeObject {
      /** Settings used for Bacs debit payments. */
      @SerializedName("bacs_debit_payments")
      BacsDebitPayments bacsDebitPayments;

      /**
       * Settings used to apply the merchant's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      @SerializedName("branding")
      Branding branding;

      /** Capabilities that have been requested on the Merchant Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /** Card payments settings. */
      @SerializedName("card_payments")
      CardPayments cardPayments;

      /**
       * The merchant category code for the merchant. MCCs are used to classify businesses based on
       * the goods or services they provide.
       */
      @SerializedName("mcc")
      String mcc;

      /** Settings used for SEPA debit payments. */
      @SerializedName("sepa_debit_payments")
      SepaDebitPayments sepaDebitPayments;

      /** Statement descriptor. */
      @SerializedName("statement_descriptor")
      StatementDescriptor statementDescriptor;

      /** Publicly available contact information for sending support issues to. */
      @SerializedName("support")
      Support support;

      /**
       * For more details about BacsDebitPayments, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BacsDebitPayments extends StripeObject {
        /** Display name for Bacs debit payments. */
        @SerializedName("display_name")
        String displayName;

        /** Service user number for Bacs debit payments. */
        @SerializedName("service_user_number")
        String serviceUserNumber;
      }

      /**
       * For more details about Branding, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Branding extends StripeObject {
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
      }

      /**
       * For more details about Capabilities, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities extends StripeObject {
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

        /**
         * For more details about AchDebitPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AchDebitPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AchDebitPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about AcssDebitPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AcssDebitPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AcssDebitPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about AffirmPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AffirmPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AffirmPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about AfterpayClearpayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AfterpayClearpayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AfterpayClearpayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about AlmaPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AlmaPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AlmaPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about AmazonPayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AmazonPayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AmazonPayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about AuBecsDebitPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AuBecsDebitPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.AuBecsDebitPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about BacsDebitPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BacsDebitPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.BacsDebitPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about BancontactPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BancontactPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.BancontactPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about BlikPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BlikPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.BlikPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about BoletoPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BoletoPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.BoletoPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about CardPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CardPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.CardPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about CartesBancairesPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CartesBancairesPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.CartesBancairesPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about CashappPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CashappPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.CashappPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about EpsPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class EpsPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.EpsPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about FpxPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class FpxPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.FpxPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about GbBankTransferPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class GbBankTransferPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.GbBankTransferPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about GrabpayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class GrabpayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.GrabpayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about IdealPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class IdealPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.IdealPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about JcbPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class JcbPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.JcbPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about JpBankTransferPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class JpBankTransferPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.JpBankTransferPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about KakaoPayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class KakaoPayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.KakaoPayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about KlarnaPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class KlarnaPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.KlarnaPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about KonbiniPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class KonbiniPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.KonbiniPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about KrCardPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class KrCardPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.KrCardPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about LinkPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class LinkPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.LinkPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about MobilepayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MobilepayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.MobilepayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about MultibancoPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MultibancoPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.MultibancoPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about MxBankTransferPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MxBankTransferPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.MxBankTransferPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about NaverPayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class NaverPayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.NaverPayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about OxxoPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class OxxoPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.OxxoPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about P24Payments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class P24Payments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.P24Payments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about PayByBankPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PayByBankPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.PayByBankPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about PaycoPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PaycoPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.PaycoPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about PaynowPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PaynowPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.PaynowPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about PromptpayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PromptpayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.PromptpayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about RevolutPayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class RevolutPayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.RevolutPayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about SamsungPayPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SamsungPayPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.SamsungPayPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about SepaBankTransferPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaBankTransferPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.SepaBankTransferPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about SepaDebitPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaDebitPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.SepaDebitPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about SwishPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SwishPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.SwishPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about TwintPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class TwintPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.TwintPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about UsBankTransferPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class UsBankTransferPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.UsBankTransferPayments.StatusDetail>
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
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about ZipPayments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ZipPayments extends StripeObject {
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Merchant.Capabilities.ZipPayments.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }
      }

      /**
       * For more details about CardPayments, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CardPayments extends StripeObject {
        /**
         * Automatically declines certain charge types regardless of whether the card issuer
         * accepted or declined the charge.
         */
        @SerializedName("decline_on")
        DeclineOn declineOn;

        /**
         * For more details about DeclineOn, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class DeclineOn extends StripeObject {
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
        }
      }

      /**
       * For more details about SepaDebitPayments, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SepaDebitPayments extends StripeObject {
        /** Creditor ID for SEPA debit payments. */
        @SerializedName("creditor_id")
        String creditorId;
      }

      /**
       * For more details about StatementDescriptor, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatementDescriptor extends StripeObject {
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
         * Default text that appears on statements for card charges outside of Japan, prefixing any
         * dynamic statement_descriptor_suffix specified on the charge. To maximize space for the
         * dynamic part of the descriptor, keep this text short. If you don’t specify this value,
         * statement_descriptor is used as the prefix. For more information about statement
         * descriptors and their requirements, see the Merchant Configuration settings
         * documentation.
         */
        @SerializedName("prefix")
        String prefix;
      }

      /**
       * For more details about Support, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Support extends StripeObject {
        /** A publicly available mailing address for sending support issues to. */
        @SerializedName("address")
        Address address;

        /** A publicly available email address for sending support issues to. */
        @SerializedName("email")
        String email;

        /** A publicly available phone number to call with support issues. */
        @SerializedName("phone")
        String phone;

        /** A publicly available website for handling support issues. */
        @SerializedName("url")
        String url;

        /**
         * For more details about Address, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Address extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;
        }
      }
    }

    /**
     * For more details about Recipient, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Recipient extends StripeObject {
      /** Capabilities that have been requested on the Recipient Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * The payout method to be used as a default outbound destination. This will allow the
       * PayoutMethod to be omitted on OutboundPayments made through the dashboard.
       */
      @SerializedName("default_outbound_destination")
      DefaultOutboundDestination defaultOutboundDestination;

      /**
       * For more details about Capabilities, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities extends StripeObject {
        /** Capabilities that enable OutboundPayments to a bank account linked to this Account. */
        @SerializedName("bank_accounts")
        BankAccounts bankAccounts;

        /** Capability that enable OutboundPayments to a debit card linked to this Account. */
        @SerializedName("cards")
        Cards cards;

        /**
         * Capabilities that enable the recipient to receive money into their Stripe Balance
         * (/v1/balance).
         */
        @SerializedName("stripe_balance")
        StripeBalance stripeBalance;

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
            /** Whether the Capability has been requested. */
            @SerializedName("requested")
            Boolean requested;

            /**
             * The status of the Capability.
             *
             * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code
             * unsupported}.
             */
            @SerializedName("status")
            String status;

            /**
             * Additional details regarding the status of the Capability. {@code status_details}
             * will be empty if the Capability's status is {@code active}.
             */
            @SerializedName("status_details")
            List<Account.Configuration.Recipient.Capabilities.BankAccounts.Local.StatusDetail>
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
               * Machine-readable code explaining the reason for the Capability to be in its current
               * status.
               *
               * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
               * requirements_pending_verification}, {@code restricted_other}, {@code
               * unsupported_business}, or {@code unsupported_country}.
               */
              @SerializedName("code")
              String code;

              /**
               * Machine-readable code explaining how to make the Capability active.
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
            /** Whether the Capability has been requested. */
            @SerializedName("requested")
            Boolean requested;

            /**
             * The status of the Capability.
             *
             * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code
             * unsupported}.
             */
            @SerializedName("status")
            String status;

            /**
             * Additional details regarding the status of the Capability. {@code status_details}
             * will be empty if the Capability's status is {@code active}.
             */
            @SerializedName("status_details")
            List<Account.Configuration.Recipient.Capabilities.BankAccounts.Wire.StatusDetail>
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
               * Machine-readable code explaining the reason for the Capability to be in its current
               * status.
               *
               * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
               * requirements_pending_verification}, {@code restricted_other}, {@code
               * unsupported_business}, or {@code unsupported_country}.
               */
              @SerializedName("code")
              String code;

              /**
               * Machine-readable code explaining how to make the Capability active.
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
          /** Whether the Capability has been requested. */
          @SerializedName("requested")
          Boolean requested;

          /**
           * The status of the Capability.
           *
           * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code unsupported}.
           */
          @SerializedName("status")
          String status;

          /**
           * Additional details regarding the status of the Capability. {@code status_details} will
           * be empty if the Capability's status is {@code active}.
           */
          @SerializedName("status_details")
          List<Account.Configuration.Recipient.Capabilities.Cards.StatusDetail> statusDetails;

          /**
           * For more details about StatusDetail, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StatusDetail extends StripeObject {
            /**
             * Machine-readable code explaining the reason for the Capability to be in its current
             * status.
             *
             * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
             * requirements_pending_verification}, {@code restricted_other}, {@code
             * unsupported_business}, or {@code unsupported_country}.
             */
            @SerializedName("code")
            String code;

            /**
             * Machine-readable code explaining how to make the Capability active.
             *
             * <p>One of {@code contact_stripe}, {@code no_resolution}, or {@code provide_info}.
             */
            @SerializedName("resolution")
            String resolution;
          }
        }

        /**
         * For more details about StripeBalance, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class StripeBalance extends StripeObject {
          /**
           * Allows the recipient to receive /v1/transfers into their Stripe Balance (/v1/balance).
           */
          @SerializedName("stripe_transfers")
          StripeTransfers stripeTransfers;

          /**
           * For more details about StripeTransfers, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class StripeTransfers extends StripeObject {
            /** Whether the Capability has been requested. */
            @SerializedName("requested")
            Boolean requested;

            /**
             * The status of the Capability.
             *
             * <p>One of {@code active}, {@code pending}, {@code restricted}, or {@code
             * unsupported}.
             */
            @SerializedName("status")
            String status;

            /**
             * Additional details regarding the status of the Capability. {@code status_details}
             * will be empty if the Capability's status is {@code active}.
             */
            @SerializedName("status_details")
            List<
                    Account.Configuration.Recipient.Capabilities.StripeBalance.StripeTransfers
                        .StatusDetail>
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
               * Machine-readable code explaining the reason for the Capability to be in its current
               * status.
               *
               * <p>One of {@code determining_status}, {@code requirements_past_due}, {@code
               * requirements_pending_verification}, {@code restricted_other}, {@code
               * unsupported_business}, or {@code unsupported_country}.
               */
              @SerializedName("code")
              String code;

              /**
               * Machine-readable code explaining how to make the Capability active.
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
    }
  }

  /**
   * For more details about Defaults, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Defaults extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     *
     * <p>One of {@code aed}, {@code afn}, {@code all}, {@code amd}, {@code ang}, {@code aoa},
     * {@code ars}, {@code aud}, {@code awg}, {@code azn}, {@code bam}, {@code bbd}, {@code bdt},
     * {@code bgn}, {@code bhd}, {@code bif}, {@code bmd}, {@code bnd}, {@code bob}, {@code bov},
     * {@code brl}, {@code bsd}, {@code btn}, {@code bwp}, {@code byn}, {@code byr}, {@code bzd},
     * {@code cad}, {@code cdf}, {@code che}, {@code chf}, {@code chw}, {@code clf}, {@code clp},
     * {@code cny}, {@code cop}, {@code cou}, {@code crc}, {@code cuc}, {@code cup}, {@code cve},
     * {@code czk}, {@code djf}, {@code dkk}, {@code dop}, {@code dzd}, {@code eek}, {@code egp},
     * {@code ern}, {@code etb}, {@code eur}, {@code fjd}, {@code fkp}, {@code gbp}, {@code gel},
     * {@code ghc}, {@code ghs}, {@code gip}, {@code gmd}, {@code gnf}, {@code gtq}, {@code gyd},
     * {@code hkd}, {@code hnl}, {@code hrk}, {@code htg}, {@code huf}, {@code idr}, {@code ils},
     * {@code inr}, {@code iqd}, {@code irr}, {@code isk}, {@code jmd}, {@code jod}, {@code jpy},
     * {@code kes}, {@code kgs}, {@code khr}, {@code kmf}, {@code kpw}, {@code krw}, {@code kwd},
     * {@code kyd}, {@code kzt}, {@code lak}, {@code lbp}, {@code lkr}, {@code lrd}, {@code lsl},
     * {@code ltl}, {@code lvl}, {@code lyd}, {@code mad}, {@code mdl}, {@code mga}, {@code mkd},
     * {@code mmk}, {@code mnt}, {@code mop}, {@code mro}, {@code mru}, {@code mur}, {@code mvr},
     * {@code mwk}, {@code mxn}, {@code mxv}, {@code myr}, {@code mzn}, {@code nad}, {@code ngn},
     * {@code nio}, {@code nok}, {@code npr}, {@code nzd}, {@code omr}, {@code pab}, {@code pen},
     * {@code pgk}, {@code php}, {@code pkr}, {@code pln}, {@code pyg}, {@code qar}, {@code ron},
     * {@code rsd}, {@code rub}, {@code rwf}, {@code sar}, {@code sbd}, {@code scr}, {@code sdg},
     * {@code sek}, {@code sgd}, {@code shp}, {@code sle}, {@code sll}, {@code sos}, {@code srd},
     * {@code ssp}, {@code std}, {@code stn}, {@code svc}, {@code syp}, {@code szl}, {@code thb},
     * {@code tjs}, {@code tmt}, {@code tnd}, {@code top}, {@code try}, {@code ttd}, {@code twd},
     * {@code tzs}, {@code uah}, {@code ugx}, {@code usd}, {@code usdc}, {@code usn}, {@code uyi},
     * {@code uyu}, {@code uzs}, {@code vef}, {@code ves}, {@code vnd}, {@code vuv}, {@code wst},
     * {@code xaf}, {@code xcd}, {@code xcg}, {@code xof}, {@code xpf}, {@code yer}, {@code zar},
     * {@code zmk}, {@code zmw}, {@code zwd}, {@code zwg}, or {@code zwl}.
     */
    @SerializedName("currency")
    String currency;

    /** The Account's preferred locales (languages), ordered by preference. */
    @SerializedName("locales")
    List<String> locales;

    /** Default responsibilities held by either Stripe or the platform. */
    @SerializedName("responsibilities")
    Responsibilities responsibilities;

    /**
     * For more details about Responsibilities, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Responsibilities extends StripeObject {
      /**
       * A value indicating the responsible payer of a bundle of Stripe fees for pricing-control
       * eligible products on this Account.
       *
       * <p>One of {@code application}, or {@code stripe}.
       */
      @SerializedName("fees_collector")
      String feesCollector;

      /**
       * A value indicating who is responsible for losses when this Account can’t pay back negative
       * balances from payments.
       *
       * <p>One of {@code application}, or {@code stripe}.
       */
      @SerializedName("losses_collector")
      String lossesCollector;
    }
  }

  /**
   * For more details about Identity, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Identity extends StripeObject {
    /** Attestations from the identity's key people, e.g. owners, executives, directors. */
    @SerializedName("attestations")
    Attestations attestations;

    /** Information about the company or business. */
    @SerializedName("business_details")
    BusinessDetails businessDetails;

    /**
     * The country in which the account holder resides, or in which the business is legally
     * established. This should be an <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a> country code.
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
     * vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code ye}, {@code yt},
     * {@code za}, {@code zm}, or {@code zw}.
     */
    @SerializedName("country")
    String country;

    /**
     * The entity type.
     *
     * <p>One of {@code company}, {@code government_entity}, {@code individual}, or {@code
     * non_profit}.
     */
    @SerializedName("entity_type")
    String entityType;

    /**
     * Information about the individual represented by the Account. This property is {@code null}
     * unless {@code entity_type} is set to {@code individual}.
     */
    @SerializedName("individual")
    Individual individual;

    /**
     * For more details about Attestations, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Attestations extends StripeObject {
      /**
       * This hash is used to attest that the directors information provided to Stripe is both
       * current and correct.
       */
      @SerializedName("directorship_declaration")
      DirectorshipDeclaration directorshipDeclaration;

      /**
       * This hash is used to attest that the beneficial owner information provided to Stripe is
       * both current and correct.
       */
      @SerializedName("ownership_declaration")
      OwnershipDeclaration ownershipDeclaration;

      /** Attestation that all Persons with a specific Relationship value have been provided. */
      @SerializedName("persons_provided")
      PersonsProvided personsProvided;

      /** Attestations of accepted terms of service agreements. */
      @SerializedName("terms_of_service")
      TermsOfService termsOfService;

      /**
       * For more details about DirectorshipDeclaration, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DirectorshipDeclaration extends StripeObject {
        /**
         * The time marking when the director attestation was made. Represented as a RFC 3339 date
         * &amp; time UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /** The IP address from which the director attestation was made. */
        @SerializedName("ip")
        String ip;

        /** The user agent of the browser from which the director attestation was made. */
        @SerializedName("user_agent")
        String userAgent;
      }

      /**
       * For more details about OwnershipDeclaration, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OwnershipDeclaration extends StripeObject {
        /**
         * The time marking when the beneficial owner attestation was made. Represented as a RFC
         * 3339 date &amp; time UTC value in millisecond precision, for example:
         * 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /** The IP address from which the beneficial owner attestation was made. */
        @SerializedName("ip")
        String ip;

        /** The user agent of the browser from which the beneficial owner attestation was made. */
        @SerializedName("user_agent")
        String userAgent;
      }

      /**
       * For more details about PersonsProvided, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class PersonsProvided extends StripeObject {
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
         * Whether the company’s owners have been provided. Set this Boolean to true after creating
         * all the company’s owners with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("owners")
        Boolean owners;

        /**
         * Reason for why the company is exempt from providing ownership information.
         *
         * <p>One of {@code qualified_entity_exceeds_ownership_threshold}, or {@code
         * qualifies_as_financial_institution}.
         */
        @SerializedName("ownership_exemption_reason")
        String ownershipExemptionReason;
      }

      /**
       * For more details about TermsOfService, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TermsOfService extends StripeObject {
        /**
         * Details on the Account's acceptance of the <a
         * href="https://docs.stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
         * Agreement</a>.
         */
        @SerializedName("account")
        InnerAccount account;

        /**
         * For more details about InnerAccount, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class InnerAccount extends StripeObject {
          /**
           * The time when the Account's representative accepted the terms of service. Represented
           * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
           * 2022-09-18T13:22:18.123Z.
           */
          @SerializedName("date")
          Instant date;

          /**
           * The IP address from which the Account's representative accepted the terms of service.
           */
          @SerializedName("ip")
          String ip;

          /**
           * The user agent of the browser from which the Account's representative accepted the
           * terms of service.
           */
          @SerializedName("user_agent")
          String userAgent;
        }
      }
    }

    /**
     * For more details about BusinessDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BusinessDetails extends StripeObject {
      /** The company’s primary address. */
      @SerializedName("address")
      Address address;

      /** The business gross annual revenue for its preceding fiscal year. */
      @SerializedName("annual_revenue")
      AnnualRevenue annualRevenue;

      /** Documents that may be submitted to satisfy various informational requests. */
      @SerializedName("documents")
      Documents documents;

      /** The company’s legal name. */
      @SerializedName("doing_business_as")
      String doingBusinessAs;

      /**
       * An estimated upper bound of employees, contractors, vendors, etc. currently working for the
       * business.
       */
      @SerializedName("estimated_worker_count")
      Integer estimatedWorkerCount;

      /** The provided ID numbers of a business entity. */
      @SerializedName("id_numbers")
      List<Account.Identity.BusinessDetails.IdNumber> idNumbers;

      /** An estimate of the monthly revenue of the business. */
      @SerializedName("monthly_estimated_revenue")
      MonthlyEstimatedRevenue monthlyEstimatedRevenue;

      /** The company’s phone number (used for verification). */
      @SerializedName("phone")
      String phone;

      /**
       * Internal-only description of the product sold or service provided by the business. It’s
       * used by Stripe for risk and underwriting purposes.
       */
      @SerializedName("product_description")
      String productDescription;

      /** The business legal name. */
      @SerializedName("registered_name")
      String registeredName;

      /** The business registration address of the business entity in non latin script. */
      @SerializedName("script_addresses")
      ScriptAddresses scriptAddresses;

      /** The business legal name in non latin script. */
      @SerializedName("script_names")
      ScriptNames scriptNames;

      /**
       * The category identifying the legal structure of the business.
       *
       * <p>One of {@code free_zone_establishment}, {@code free_zone_llc}, {@code
       * governmental_unit}, {@code government_instrumentality}, {@code incorporated_non_profit},
       * {@code incorporated_partnership}, {@code llc}, {@code multi_member_llc}, {@code
       * private_company}, {@code private_corporation}, {@code private_partnership}, {@code
       * public_company}, {@code public_corporation}, {@code public_partnership}, {@code
       * registered_charity}, {@code single_member_llc}, {@code sole_establishment}, {@code
       * sole_proprietorship}, {@code tax_exempt_government_instrumentality}, {@code
       * unincorporated_association}, {@code unincorporated_non_profit}, or {@code
       * unincorporated_partnership}.
       */
      @SerializedName("structure")
      String structure;

      /** The business's publicly available website. */
      @SerializedName("url")
      String url;

      /**
       * For more details about Address, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Address extends StripeObject {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
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
         * {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

        /** Town or cho-me. */
        @SerializedName("town")
        String town;
      }

      /**
       * For more details about AnnualRevenue, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AnnualRevenue extends StripeObject {
        /** A non-negative integer representing the amount in the smallest currency unit. */
        @SerializedName("amount")
        Amount amount;

        /**
         * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
         * the 31st of December, 2023.
         */
        @SerializedName("fiscal_year_end")
        String fiscalYearEnd;
      }

      /**
       * For more details about Documents, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Documents extends StripeObject {
        /**
         * One or more documents that support the Bank account ownership verification requirement.
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

        /** A document verifying the business. */
        @SerializedName("primary_verification")
        PrimaryVerification primaryVerification;

        /**
         * One or more documents showing the company’s proof of registration with the national
         * business registry.
         */
        @SerializedName("proof_of_registration")
        ProofOfRegistration proofOfRegistration;

        /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
        @SerializedName("proof_of_ultimate_beneficial_ownership")
        ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

        /**
         * For more details about BankAccountOwnershipVerification, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BankAccountOwnershipVerification extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about CompanyLicense, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyLicense extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about CompanyMemorandumOfAssociation, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyMemorandumOfAssociation extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about CompanyMinisterialDecree, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyMinisterialDecree extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about CompanyRegistrationVerification, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyRegistrationVerification extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about CompanyTaxIdVerification, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyTaxIdVerification extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about PrimaryVerification, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryVerification extends StripeObject {
          /**
           * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * tokens for the front and back of the verification document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * The format of the verification document. Currently supports {@code front_back} only.
           *
           * <p>Equal to {@code front_back}.
           */
          @SerializedName("type")
          String type;

          /**
           * For more details about FrontBack, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack extends StripeObject {
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
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
             */
            @SerializedName("front")
            String front;
          }
        }

        /**
         * For more details about ProofOfRegistration, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfRegistration extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about ProofOfUltimateBeneficialOwnership, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfUltimateBeneficialOwnership extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /**
       * For more details about IdNumber, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class IdNumber extends StripeObject {
        /** The registrar of the ID number (Only valid for DE ID number types). */
        @SerializedName("registrar")
        String registrar;

        /**
         * Open Enum. The ID number type of a business entity.
         *
         * <p>One of {@code ae_crn}, {@code ae_vat}, {@code at_fn}, {@code au_abn}, {@code au_acn},
         * {@code au_in}, {@code be_cbe}, {@code bg_uic}, {@code br_cnpj}, {@code ca_cn}, {@code
         * ca_crarr}, {@code ca_neq}, {@code ca_rid}, {@code ch_chid}, {@code ch_uid}, {@code
         * cy_tic}, {@code cz_ico}, {@code de_hrn}, {@code de_vat}, {@code dk_cvr}, {@code ee_rk},
         * {@code es_cif}, {@code fi_yt}, {@code fr_siren}, {@code fr_vat}, {@code gb_crn}, {@code
         * gi_crn}, {@code gr_gemi}, {@code hk_br}, {@code hk_cr}, {@code hk_mbs}, {@code hu_cjs},
         * {@code ie_crn}, {@code it_rea}, {@code it_vat}, {@code jp_cn}, {@code li_uid}, {@code
         * lt_ccrn}, {@code lu_rcs}, {@code lv_urn}, {@code mt_crn}, {@code mx_rfc}, {@code my_brn},
         * {@code my_coid}, {@code my_sst}, {@code nl_kvk}, {@code no_orgnr}, {@code nz_bn}, {@code
         * pl_regon}, {@code pt_vat}, {@code ro_cui}, {@code se_orgnr}, {@code sg_uen}, {@code
         * si_msp}, {@code sk_ico}, {@code th_crn}, {@code th_prn}, {@code th_tin}, or {@code
         * us_ein}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about MonthlyEstimatedRevenue, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MonthlyEstimatedRevenue extends StripeObject {
        /** A non-negative integer representing the amount in the smallest currency unit. */
        @SerializedName("amount")
        Amount amount;
      }

      /**
       * For more details about ScriptAddresses, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptAddresses extends StripeObject {
        /** Kana Address. */
        @SerializedName("kana")
        Kana kana;

        /** Kanji Address. */
        @SerializedName("kanji")
        Kanji kanji;

        /**
         * For more details about Kana, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;
        }

        /**
         * For more details about Kanji, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;
        }
      }

      /**
       * For more details about ScriptNames, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptNames extends StripeObject {
        /** Kana name. */
        @SerializedName("kana")
        Kana kana;

        /** Kanji name. */
        @SerializedName("kanji")
        Kanji kanji;

        /**
         * For more details about Kana, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana extends StripeObject {
          /** Registered name of the business. */
          @SerializedName("registered_name")
          String registeredName;
        }

        /**
         * For more details about Kanji, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji extends StripeObject {
          /** Registered name of the business. */
          @SerializedName("registered_name")
          String registeredName;
        }
      }
    }

    /**
     * For more details about Individual, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Individual extends StripeObject implements HasId {
      /** The account ID which the individual belongs to. */
      @SerializedName("account")
      String account;

      /** Additional addresses associated with the individual. */
      @SerializedName("additional_addresses")
      List<Account.Identity.Individual.AdditionalAddress> additionalAddresses;

      /** Additional names (e.g. aliases) associated with the individual. */
      @SerializedName("additional_names")
      List<Account.Identity.Individual.AdditionalName> additionalNames;

      /** Terms of service acceptances. */
      @SerializedName("additional_terms_of_service")
      AdditionalTermsOfService additionalTermsOfService;

      /** The individual's residential address. */
      @SerializedName("address")
      Address address;

      /**
       * Time at which the object was created. Represented as a RFC 3339 date &amp; time UTC value
       * in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
       */
      @SerializedName("created")
      Instant created;

      /** The individual's date of birth. */
      @SerializedName("date_of_birth")
      DateOfBirth dateOfBirth;

      /** Documents that may be submitted to satisfy various informational requests. */
      @SerializedName("documents")
      Documents documents;

      /** The individual's email address. */
      @SerializedName("email")
      String email;

      /** The individual's first name. */
      @SerializedName("given_name")
      String givenName;

      /** Unique identifier for the object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The identification numbers (e.g., SSN) associated with the individual. */
      @SerializedName("id_numbers")
      List<Account.Identity.Individual.IdNumber> idNumbers;

      /**
       * The individual's gender (International regulations require either &quot;male” or
       * &quot;female&quot;).
       *
       * <p>One of {@code female}, or {@code male}.
       */
      @SerializedName("legal_gender")
      String legalGender;

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

      /** String representing the object's type. Objects of the same type share the same value. */
      @SerializedName("object")
      String object;

      /** The individual's phone number. */
      @SerializedName("phone")
      String phone;

      /**
       * Indicates if the individual or any of their representatives, family members, or other
       * closely related persons, declares that they hold or have held an important public job or
       * function, in any jurisdiction.
       *
       * <p>One of {@code existing}, or {@code none}.
       */
      @SerializedName("political_exposure")
      String politicalExposure;

      /** The relationship that this individual has with the Account's identity. */
      @SerializedName("relationship")
      Relationship relationship;

      /** The script addresses (e.g., non-Latin characters) associated with the individual. */
      @SerializedName("script_addresses")
      ScriptAddresses scriptAddresses;

      /** The script names (e.g. non-Latin characters) associated with the individual. */
      @SerializedName("script_names")
      ScriptNames scriptNames;

      /** The individual's last name. */
      @SerializedName("surname")
      String surname;

      /** Time at which the object was last updated. */
      @SerializedName("updated")
      Instant updated;

      /**
       * For more details about AdditionalAddress, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalAddress extends StripeObject {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
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
         * {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

        /**
         * Purpose of additional address.
         *
         * <p>Equal to {@code registered}.
         */
        @SerializedName("purpose")
        String purpose;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        /** Town or cho-me. */
        @SerializedName("town")
        String town;
      }

      /**
       * For more details about AdditionalName, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalName extends StripeObject {
        /** The individual's full name. */
        @SerializedName("full_name")
        String fullName;

        /** The individual's first or given name. */
        @SerializedName("given_name")
        String givenName;

        /**
         * The purpose or type of the additional name.
         *
         * <p>One of {@code alias}, or {@code maiden}.
         */
        @SerializedName("purpose")
        String purpose;

        /** The individual's last or family name. */
        @SerializedName("surname")
        String surname;
      }

      /**
       * For more details about AdditionalTermsOfService, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalTermsOfService extends StripeObject {
        /** Stripe terms of service agreement. */
        @SerializedName("account")
        InnerAccount account;

        /**
         * For more details about InnerAccount, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class InnerAccount extends StripeObject {
          /**
           * The time when the Account's representative accepted the terms of service. Represented
           * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
           * 2022-09-18T13:22:18.123Z.
           */
          @SerializedName("date")
          Instant date;

          /**
           * The IP address from which the Account's representative accepted the terms of service.
           */
          @SerializedName("ip")
          String ip;

          /**
           * The user agent of the browser from which the Account's representative accepted the
           * terms of service.
           */
          @SerializedName("user_agent")
          String userAgent;
        }
      }

      /**
       * For more details about Address, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Address extends StripeObject {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
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
         * {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

        /** Town or cho-me. */
        @SerializedName("town")
        String town;
      }

      /**
       * For more details about DateOfBirth, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DateOfBirth extends StripeObject {
        /** The day of birth, between 1 and 31. */
        @SerializedName("day")
        Integer day;

        /** The month of birth, between 1 and 12. */
        @SerializedName("month")
        Integer month;

        /** The four-digit year of birth. */
        @SerializedName("year")
        Integer year;
      }

      /**
       * For more details about Documents, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Documents extends StripeObject {
        /**
         * One or more documents that demonstrate proof that this person is authorized to represent
         * the company.
         */
        @SerializedName("company_authorization")
        CompanyAuthorization companyAuthorization;

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

        /**
         * For more details about CompanyAuthorization, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyAuthorization extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about Passport, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Passport extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about PrimaryVerification, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryVerification extends StripeObject {
          /**
           * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * tokens for the front and back of the verification document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * The format of the verification document. Currently supports {@code front_back} only.
           *
           * <p>Equal to {@code front_back}.
           */
          @SerializedName("type")
          String type;

          /**
           * For more details about FrontBack, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack extends StripeObject {
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
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
             */
            @SerializedName("front")
            String front;
          }
        }

        /**
         * For more details about SecondaryVerification, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SecondaryVerification extends StripeObject {
          /**
           * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * tokens for the front and back of the verification document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * The format of the verification document. Currently supports {@code front_back} only.
           *
           * <p>Equal to {@code front_back}.
           */
          @SerializedName("type")
          String type;

          /**
           * For more details about FrontBack, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack extends StripeObject {
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
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
             */
            @SerializedName("front")
            String front;
          }
        }

        /**
         * For more details about Visa, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Visa extends StripeObject {
          /**
           * One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * The format of the document. Currently supports {@code files} only.
           *
           * <p>Equal to {@code files}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /**
       * For more details about IdNumber, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class IdNumber extends StripeObject {
        /**
         * The ID number type of an individual.
         *
         * <p>One of {@code ae_eid}, {@code br_cpf}, {@code de_stn}, {@code hk_id}, {@code mx_rfc},
         * {@code my_nric}, {@code nl_bsn}, {@code sg_fin}, {@code sg_nric}, {@code th_lc}, {@code
         * th_pin}, {@code us_itin}, {@code us_itin_last_4}, {@code us_ssn}, or {@code
         * us_ssn_last_4}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Relationship, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Relationship extends StripeObject {
        /**
         * Whether the individual is a director of the Account’s legal entity. Directors are
         * typically members of the governing board of the company, or responsible for ensuring the
         * company meets its regulatory obligations.
         */
        @SerializedName("director")
        Boolean director;

        /**
         * Whether the individual has significant responsibility to control, manage, or direct the
         * organization.
         */
        @SerializedName("executive")
        Boolean executive;

        /** Whether the individual is the legal guardian of the Account’s representative. */
        @SerializedName("legal_guardian")
        Boolean legalGuardian;

        /** Whether the individual is an owner of the Account’s legal entity. */
        @SerializedName("owner")
        Boolean owner;

        /** The percent owned by the individual of the Account’s legal entity. */
        @SerializedName("percent_ownership")
        String percentOwnership;

        /**
         * Whether the individual is authorized as the primary representative of the Account. This
         * is the person nominated by the business to provide information about themselves, and
         * general information about the account. There can only be one representative at any given
         * time. At the time the account is created, this person should be set to the person
         * responsible for opening the account.
         */
        @SerializedName("representative")
        Boolean representative;

        /** The individual's title (e.g., CEO, Support Engineer). */
        @SerializedName("title")
        String title;
      }

      /**
       * For more details about ScriptAddresses, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptAddresses extends StripeObject {
        /** Kana Address. */
        @SerializedName("kana")
        Kana kana;

        /** Kanji Address. */
        @SerializedName("kanji")
        Kanji kanji;

        /**
         * For more details about Kana, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;
        }

        /**
         * For more details about Kanji, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           *
           * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al},
           * {@code am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au},
           * {@code aw}, {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be},
           * {@code bf}, {@code bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm},
           * {@code bn}, {@code bo}, {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv},
           * {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf},
           * {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm}, {@code cn},
           * {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
           * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz},
           * {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et},
           * {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga},
           * {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh}, {@code gi},
           * {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code gs},
           * {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
           * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
           * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
           * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki},
           * {@code km}, {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz},
           * {@code la}, {@code lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls},
           * {@code lt}, {@code lu}, {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md},
           * {@code me}, {@code mf}, {@code mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm},
           * {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr}, {@code ms}, {@code mt},
           * {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz}, {@code na},
           * {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
           * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe},
           * {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn},
           * {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz},
           * {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code sb},
           * {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
           * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
           * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td},
           * {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
           * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz},
           * {@code ua}, {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va},
           * {@code vc}, {@code ve}, {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf},
           * {@code ws}, {@code ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

          /** Town or cho-me. */
          @SerializedName("town")
          String town;
        }
      }

      /**
       * For more details about ScriptNames, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptNames extends StripeObject {
        /** Persons name in kana script. */
        @SerializedName("kana")
        Kana kana;

        /** Persons name in kanji script. */
        @SerializedName("kanji")
        Kanji kanji;

        /**
         * For more details about Kana, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana extends StripeObject {
          /** The person's first or given name. */
          @SerializedName("given_name")
          String givenName;

          /** The person's last or family name. */
          @SerializedName("surname")
          String surname;
        }

        /**
         * For more details about Kanji, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji extends StripeObject {
          /** The person's first or given name. */
          @SerializedName("given_name")
          String givenName;

          /** The person's last or family name. */
          @SerializedName("surname")
          String surname;
        }
      }
    }
  }

  /**
   * For more details about Requirements, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * A value indicating responsibility for collecting requirements on this account.
     *
     * <p>One of {@code application}, or {@code stripe}.
     */
    @SerializedName("collector")
    String collector;

    /** A list of requirements for the Account. */
    @SerializedName("entries")
    List<Account.Requirements.Entry> entries;

    /** An object containing an overview of requirements for the Account. */
    @SerializedName("summary")
    Summary summary;

    /**
     * For more details about Entry, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Entry extends StripeObject {
      /**
       * Whether the responsibility is with the integrator or with Stripe (to review info, to wait
       * for some condition, etc.) to action the requirement.
       *
       * <p>One of {@code stripe}, or {@code user}.
       */
      @SerializedName("awaiting_action_from")
      String awaitingActionFrom;

      /** Machine-readable string describing the requirement. */
      @SerializedName("description")
      String description;

      /**
       * Descriptions of why the requirement must be collected, or why the collected information
       * isn't satisfactory to Stripe.
       */
      @SerializedName("errors")
      List<Account.Requirements.Entry.Errors> errors;

      /**
       * A hash describing the impact of not collecting the requirement, or Stripe not being able to
       * verify the collected information.
       */
      @SerializedName("impact")
      Impact impact;

      /** The soonest point when the account will be impacted by not providing the requirement. */
      @SerializedName("minimum_deadline")
      MinimumDeadline minimumDeadline;

      /** A reference to the location of the requirement. */
      @SerializedName("reference")
      Reference reference;

      /** A list of reasons why Stripe is collecting the requirement. */
      @SerializedName("requested_reasons")
      List<Account.Requirements.Entry.RequestedReason> requestedReasons;

      /**
       * For more details about Errors, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Errors extends StripeObject {
        /**
         * Machine-readable code describing the error.
         *
         * <p>One of {@code invalid_address_city_state_postal_code}, {@code
         * invalid_address_highway_contract_box}, {@code invalid_address_private_mailbox}, {@code
         * invalid_business_profile_name}, {@code invalid_business_profile_name_denylisted}, {@code
         * invalid_company_name_denylisted}, {@code invalid_dob_age_over_maximum}, {@code
         * invalid_dob_age_under_18}, {@code invalid_dob_age_under_minimum}, {@code
         * invalid_product_description_length}, {@code invalid_product_description_url_match},
         * {@code invalid_representative_country}, {@code
         * invalid_statement_descriptor_business_mismatch}, {@code
         * invalid_statement_descriptor_denylisted}, {@code invalid_statement_descriptor_length},
         * {@code invalid_statement_descriptor_prefix_denylisted}, {@code
         * invalid_statement_descriptor_prefix_mismatch}, {@code invalid_street_address}, {@code
         * invalid_tax_id}, {@code invalid_tax_id_format}, {@code invalid_tos_acceptance}, {@code
         * invalid_url_denylisted}, {@code invalid_url_format}, {@code
         * invalid_url_website_business_information_mismatch}, {@code invalid_url_website_empty},
         * {@code invalid_url_website_inaccessible}, {@code
         * invalid_url_website_inaccessible_geoblocked}, {@code
         * invalid_url_website_inaccessible_password_protected}, {@code
         * invalid_url_website_incomplete}, {@code
         * invalid_url_website_incomplete_cancellation_policy}, {@code
         * invalid_url_website_incomplete_customer_service_details}, {@code
         * invalid_url_website_incomplete_legal_restrictions}, {@code
         * invalid_url_website_incomplete_refund_policy}, {@code
         * invalid_url_website_incomplete_return_policy}, {@code
         * invalid_url_website_incomplete_terms_and_conditions}, {@code
         * invalid_url_website_incomplete_under_construction}, {@code invalid_url_website_other},
         * {@code invalid_url_web_presence_detected}, {@code invalid_value_other}, {@code
         * unresolvable_ip_address}, {@code unresolvable_postal_code}, {@code
         * verification_directors_mismatch}, {@code verification_document_address_mismatch}, {@code
         * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
         * verification_document_country_not_supported}, {@code
         * verification_document_directors_mismatch}, {@code verification_document_dob_mismatch},
         * {@code verification_document_duplicate_type}, {@code verification_document_expired},
         * {@code verification_document_failed_copy}, {@code
         * verification_document_failed_greyscale}, {@code verification_document_failed_other},
         * {@code verification_document_failed_test_mode}, {@code verification_document_fraudulent},
         * {@code verification_document_id_number_mismatch}, {@code
         * verification_document_id_number_missing}, {@code verification_document_incomplete},
         * {@code verification_document_invalid}, {@code
         * verification_document_issue_or_expiry_date_missing}, {@code
         * verification_document_manipulated}, {@code verification_document_missing_back}, {@code
         * verification_document_missing_front}, {@code verification_document_name_mismatch}, {@code
         * verification_document_name_missing}, {@code verification_document_nationality_mismatch},
         * {@code verification_document_not_readable}, {@code verification_document_not_signed},
         * {@code verification_document_not_uploaded}, {@code verification_document_photo_mismatch},
         * {@code verification_document_too_large}, {@code
         * verification_document_type_not_supported}, {@code verification_extraneous_directors},
         * {@code verification_failed_address_match}, {@code
         * verification_failed_business_iec_number}, {@code verification_failed_document_match},
         * {@code verification_failed_id_number_match}, {@code verification_failed_keyed_identity},
         * {@code verification_failed_keyed_match}, {@code verification_failed_name_match}, {@code
         * verification_failed_other}, {@code verification_failed_representative_authority}, {@code
         * verification_failed_residential_address}, {@code verification_failed_tax_id_match},
         * {@code verification_failed_tax_id_not_issued}, {@code verification_missing_directors},
         * {@code verification_missing_executives}, {@code verification_missing_owners}, {@code
         * verification_requires_additional_memorandum_of_associations}, {@code
         * verification_requires_additional_proof_of_registration}, {@code
         * verification_selfie_document_missing_photo}, {@code verification_selfie_face_mismatch},
         * {@code verification_selfie_manipulated}, {@code verification_selfie_unverified_other},
         * {@code verification_supportability}, or {@code verification_token_stale}.
         */
        @SerializedName("code")
        String code;

        /** Human-readable description of the error. */
        @SerializedName("description")
        String description;
      }

      /**
       * For more details about Impact, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Impact extends StripeObject {
        /**
         * The Capabilities that will be restricted if the requirement is not collected and
         * satisfactory to Stripe.
         */
        @SerializedName("restricts_capabilities")
        List<Account.Requirements.Entry.Impact.RestrictsCapability> restrictsCapabilities;

        /**
         * Details about payouts restrictions that will be enforced if the requirement is not
         * collected and satisfactory to Stripe.
         */
        @SerializedName("restricts_payouts")
        RestrictsPayouts restrictsPayouts;

        /**
         * For more details about RestrictsCapability, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class RestrictsCapability extends StripeObject {
          /**
           * The name of the Capability which will be restricted.
           *
           * <p>One of {@code ach_debit_payments}, {@code acss_debit_payments}, {@code
           * affirm_payments}, {@code afterpay_clearpay_payments}, {@code alma_payments}, {@code
           * amazon_pay_payments}, {@code automatic_indirect_tax}, {@code au_becs_debit_payments},
           * {@code bacs_debit_payments}, {@code bancontact_payments}, {@code bank_accounts.local},
           * {@code bank_accounts.wire}, {@code blik_payments}, {@code boleto_payments}, {@code
           * cards}, {@code card_payments}, {@code cartes_bancaires_payments}, {@code
           * cashapp_payments}, {@code eps_payments}, {@code fpx_payments}, {@code
           * gb_bank_transfer_payments}, {@code grabpay_payments}, {@code ideal_payments}, {@code
           * jcb_payments}, {@code jp_bank_transfer_payments}, {@code kakao_pay_payments}, {@code
           * klarna_payments}, {@code konbini_payments}, {@code kr_card_payments}, {@code
           * link_payments}, {@code mobilepay_payments}, {@code multibanco_payments}, {@code
           * mx_bank_transfer_payments}, {@code naver_pay_payments}, {@code oxxo_payments}, {@code
           * p24_payments}, {@code payco_payments}, {@code paynow_payments}, {@code
           * pay_by_bank_payments}, {@code promptpay_payments}, {@code revolut_pay_payments}, {@code
           * samsung_pay_payments}, {@code sepa_bank_transfer_payments}, {@code
           * sepa_debit_payments}, {@code stripe_balance.stripe_transfers}, {@code swish_payments},
           * {@code twint_payments}, {@code us_bank_transfer_payments}, or {@code zip_payments}.
           */
          @SerializedName("capability")
          String capability;

          /**
           * The configuration which specifies the Capability which will be restricted.
           *
           * <p>One of {@code customer}, {@code merchant}, or {@code recipient}.
           */
          @SerializedName("configuration")
          String configuration;

          /**
           * Details about when in the account lifecycle the requirement must be collected by the
           * avoid the Capability restriction.
           */
          @SerializedName("deadline")
          Deadline deadline;

          /**
           * For more details about Deadline, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Deadline extends StripeObject {
            /**
             * The current status of the requirement's impact.
             *
             * <p>One of {@code currently_due}, {@code eventually_due}, or {@code past_due}.
             */
            @SerializedName("status")
            String status;
          }
        }

        /**
         * For more details about RestrictsPayouts, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class RestrictsPayouts extends StripeObject {
          /**
           * Details about when in the Account's lifecycle the requirement must be collected by the
           * avoid the earliest specified impact.
           */
          @SerializedName("deadline")
          Deadline deadline;

          /**
           * For more details about Deadline, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Deadline extends StripeObject {
            /**
             * The current status of the requirement's impact.
             *
             * <p>One of {@code currently_due}, {@code eventually_due}, or {@code past_due}.
             */
            @SerializedName("status")
            String status;
          }
        }
      }

      /**
       * For more details about MinimumDeadline, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MinimumDeadline extends StripeObject {
        /**
         * The current status of the requirement's impact.
         *
         * <p>One of {@code currently_due}, {@code eventually_due}, or {@code past_due}.
         */
        @SerializedName("status")
        String status;
      }

      /**
       * For more details about Reference, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Reference extends StripeObject {
        /** If {@code inquiry} is the type, the inquiry token. */
        @SerializedName("inquiry")
        String inquiry;

        /** If {@code resource} is the type, the resource token. */
        @SerializedName("resource")
        String resource;

        /**
         * The type of the reference. An additional hash is included with a name matching the type.
         * It contains additional information specific to the type.
         *
         * <p>One of {@code inquiry}, or {@code resource}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about RequestedReason, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class RequestedReason extends StripeObject {
        /**
         * Machine-readable description of Stripe's reason for collecting the requirement.
         *
         * <p>One of {@code future_requirements}, {@code routine_onboarding}, or {@code
         * routine_verification}.
         */
        @SerializedName("code")
        String code;
      }
    }

    /**
     * For more details about Summary, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Summary extends StripeObject {
      /**
       * The soonest date and time a requirement on the Account will become {@code past due}.
       * Represented as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
       * {@code 2022-09-18T13:22:18.123Z}.
       */
      @SerializedName("minimum_deadline")
      MinimumDeadline minimumDeadline;

      /**
       * For more details about MinimumDeadline, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MinimumDeadline extends StripeObject {
        /**
         * The current strictest status of all requirements on the Account.
         *
         * <p>One of {@code currently_due}, {@code eventually_due}, or {@code past_due}.
         */
        @SerializedName("status")
        String status;

        /** The soonest RFC3339 date &amp; time UTC value a requirement can impact the Account. */
        @SerializedName("time")
        Instant time;
      }
    }
  }
}
