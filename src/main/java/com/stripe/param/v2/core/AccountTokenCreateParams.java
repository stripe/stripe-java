// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

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
public class AccountTokenCreateParams extends ApiRequestParams {
  /**
   * The default contact email address for the Account. Required when configuring the account as a
   * merchant or recipient.
   */
  @SerializedName("contact_email")
  String contactEmail;

  /** The default contact phone for the Account. */
  @SerializedName("contact_phone")
  String contactPhone;

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

  private AccountTokenCreateParams(
      String contactEmail,
      String contactPhone,
      String displayName,
      Map<String, Object> extraParams,
      Identity identity) {
    this.contactEmail = contactEmail;
    this.contactPhone = contactPhone;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.identity = identity;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String contactEmail;

    private String contactPhone;

    private String displayName;

    private Map<String, Object> extraParams;

    private Identity identity;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountTokenCreateParams build() {
      return new AccountTokenCreateParams(
          this.contactEmail, this.contactPhone, this.displayName, this.extraParams, this.identity);
    }

    /**
     * The default contact email address for the Account. Required when configuring the account as a
     * merchant or recipient.
     */
    public Builder setContactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    /** The default contact phone for the Account. */
    public Builder setContactPhone(String contactPhone) {
      this.contactPhone = contactPhone;
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
     * AccountTokenCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountTokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information about the company, individual, and business represented by the Account. */
    public Builder setIdentity(AccountTokenCreateParams.Identity identity) {
      this.identity = identity;
      return this;
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
        EntityType entityType,
        Map<String, Object> extraParams,
        Individual individual) {
      this.attestations = attestations;
      this.businessDetails = businessDetails;
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

      private EntityType entityType;

      private Map<String, Object> extraParams;

      private Individual individual;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountTokenCreateParams.Identity build() {
        return new AccountTokenCreateParams.Identity(
            this.attestations,
            this.businessDetails,
            this.entityType,
            this.extraParams,
            this.individual);
      }

      /**
       * Attestations from the identity's key people, e.g. owners, executives, directors,
       * representatives.
       */
      public Builder setAttestations(AccountTokenCreateParams.Identity.Attestations attestations) {
        this.attestations = attestations;
        return this;
      }

      /** Information about the company or business. */
      public Builder setBusinessDetails(
          AccountTokenCreateParams.Identity.BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
        return this;
      }

      /** The entity type. */
      public Builder setEntityType(AccountTokenCreateParams.Identity.EntityType entityType) {
        this.entityType = entityType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountTokenCreateParams.Identity#extraParams} for the field documentation.
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
       * See {@link AccountTokenCreateParams.Identity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Information about the person represented by the account. */
      public Builder setIndividual(AccountTokenCreateParams.Identity.Individual individual) {
        this.individual = individual;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Attestations {
      /**
       * This hash is used to attest that the directors information provided to Stripe is both
       * current and correct; IP, date, and User Agent are expanded by Stripe.
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
       * both current and correct; IP, date, and User Agent are expanded by Stripe.
       */
      @SerializedName("ownership_declaration")
      OwnershipDeclaration ownershipDeclaration;

      /** Attestation that all Persons with a specific Relationship value have been provided. */
      @SerializedName("persons_provided")
      PersonsProvided personsProvided;

      /**
       * This hash is used to attest that the representative is authorized to act as the
       * representative of their legal entity; IP, date, and User Agent are expanded by Stripe.
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
        public AccountTokenCreateParams.Identity.Attestations build() {
          return new AccountTokenCreateParams.Identity.Attestations(
              this.directorshipDeclaration,
              this.extraParams,
              this.ownershipDeclaration,
              this.personsProvided,
              this.representativeDeclaration,
              this.termsOfService);
        }

        /**
         * This hash is used to attest that the directors information provided to Stripe is both
         * current and correct; IP, date, and User Agent are expanded by Stripe.
         */
        public Builder setDirectorshipDeclaration(
            AccountTokenCreateParams.Identity.Attestations.DirectorshipDeclaration
                directorshipDeclaration) {
          this.directorshipDeclaration = directorshipDeclaration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountTokenCreateParams.Identity.Attestations#extraParams} for the field
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
         * map. See {@link AccountTokenCreateParams.Identity.Attestations#extraParams} for the field
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
         * both current and correct; IP, date, and User Agent are expanded by Stripe.
         */
        public Builder setOwnershipDeclaration(
            AccountTokenCreateParams.Identity.Attestations.OwnershipDeclaration
                ownershipDeclaration) {
          this.ownershipDeclaration = ownershipDeclaration;
          return this;
        }

        /** Attestation that all Persons with a specific Relationship value have been provided. */
        public Builder setPersonsProvided(
            AccountTokenCreateParams.Identity.Attestations.PersonsProvided personsProvided) {
          this.personsProvided = personsProvided;
          return this;
        }

        /**
         * This hash is used to attest that the representative is authorized to act as the
         * representative of their legal entity; IP, date, and User Agent are expanded by Stripe.
         */
        public Builder setRepresentativeDeclaration(
            AccountTokenCreateParams.Identity.Attestations.RepresentativeDeclaration
                representativeDeclaration) {
          this.representativeDeclaration = representativeDeclaration;
          return this;
        }

        /** Attestations of accepted terms of service agreements. */
        public Builder setTermsOfService(
            AccountTokenCreateParams.Identity.Attestations.TermsOfService termsOfService) {
          this.termsOfService = termsOfService;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DirectorshipDeclaration {
        /** A boolean indicating if the directors information has been attested. */
        @SerializedName("attested")
        Boolean attested;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private DirectorshipDeclaration(Boolean attested, Map<String, Object> extraParams) {
          this.attested = attested;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean attested;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountTokenCreateParams.Identity.Attestations.DirectorshipDeclaration build() {
            return new AccountTokenCreateParams.Identity.Attestations.DirectorshipDeclaration(
                this.attested, this.extraParams);
          }

          /** A boolean indicating if the directors information has been attested. */
          public Builder setAttested(Boolean attested) {
            this.attested = attested;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.Attestations.DirectorshipDeclaration#extraParams} for
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
           * AccountTokenCreateParams.Identity.Attestations.DirectorshipDeclaration#extraParams} for
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
      public static class OwnershipDeclaration {
        /** A boolean indicating if the beneficial owner information has been attested. */
        @SerializedName("attested")
        Boolean attested;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private OwnershipDeclaration(Boolean attested, Map<String, Object> extraParams) {
          this.attested = attested;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean attested;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountTokenCreateParams.Identity.Attestations.OwnershipDeclaration build() {
            return new AccountTokenCreateParams.Identity.Attestations.OwnershipDeclaration(
                this.attested, this.extraParams);
          }

          /** A boolean indicating if the beneficial owner information has been attested. */
          public Builder setAttested(Boolean attested) {
            this.attested = attested;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.Attestations.OwnershipDeclaration#extraParams} for
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
           * AccountTokenCreateParams.Identity.Attestations.OwnershipDeclaration#extraParams} for
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
          public AccountTokenCreateParams.Identity.Attestations.PersonsProvided build() {
            return new AccountTokenCreateParams.Identity.Attestations.PersonsProvided(
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
           * map. See {@link
           * AccountTokenCreateParams.Identity.Attestations.PersonsProvided#extraParams} for the
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
           * AccountTokenCreateParams.Identity.Attestations.PersonsProvided#extraParams} for the
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
              AccountTokenCreateParams.Identity.Attestations.PersonsProvided
                      .OwnershipExemptionReason
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
         * A boolean indicating if the representative is authorized to act as the representative of
         * their legal entity.
         */
        @SerializedName("attested")
        Boolean attested;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private RepresentativeDeclaration(Boolean attested, Map<String, Object> extraParams) {
          this.attested = attested;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean attested;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountTokenCreateParams.Identity.Attestations.RepresentativeDeclaration build() {
            return new AccountTokenCreateParams.Identity.Attestations.RepresentativeDeclaration(
                this.attested, this.extraParams);
          }

          /**
           * A boolean indicating if the representative is authorized to act as the representative
           * of their legal entity.
           */
          public Builder setAttested(Boolean attested) {
            this.attested = attested;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.Attestations.RepresentativeDeclaration#extraParams}
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
           * AccountTokenCreateParams.Identity.Attestations.RepresentativeDeclaration#extraParams}
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
      @EqualsAndHashCode(callSuper = false)
      public static class TermsOfService {
        /**
         * Details on the Account's acceptance of the [Stripe Services Agreement]; IP, date, and
         * User Agent are expanded by Stripe.
         */
        @SerializedName("account")
        Account account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TermsOfService(Account account, Map<String, Object> extraParams) {
          this.account = account;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Account account;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountTokenCreateParams.Identity.Attestations.TermsOfService build() {
            return new AccountTokenCreateParams.Identity.Attestations.TermsOfService(
                this.account, this.extraParams);
          }

          /**
           * Details on the Account's acceptance of the [Stripe Services Agreement]; IP, date, and
           * User Agent are expanded by Stripe.
           */
          public Builder setAccount(
              AccountTokenCreateParams.Identity.Attestations.TermsOfService.Account account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.Attestations.TermsOfService#extraParams} for the
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
           * AccountTokenCreateParams.Identity.Attestations.TermsOfService#extraParams} for the
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

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Account {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The boolean value indicating if the terms of service have been accepted. */
          @SerializedName("shown_and_accepted")
          Boolean shownAndAccepted;

          private Account(Map<String, Object> extraParams, Boolean shownAndAccepted) {
            this.extraParams = extraParams;
            this.shownAndAccepted = shownAndAccepted;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean shownAndAccepted;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountTokenCreateParams.Identity.Attestations.TermsOfService.Account build() {
              return new AccountTokenCreateParams.Identity.Attestations.TermsOfService.Account(
                  this.extraParams, this.shownAndAccepted);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Attestations.TermsOfService.Account#extraParams}
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
             * AccountTokenCreateParams.Identity.Attestations.TermsOfService.Account#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The boolean value indicating if the terms of service have been accepted. */
            public Builder setShownAndAccepted(Boolean shownAndAccepted) {
              this.shownAndAccepted = shownAndAccepted;
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
       * Estimated maximum number of workers currently engaged by the business (including employees,
       * contractors, and vendors).
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
      List<AccountTokenCreateParams.Identity.BusinessDetails.IdNumber> idNumbers;

      /** An estimate of the monthly revenue of the business. */
      @SerializedName("monthly_estimated_revenue")
      MonthlyEstimatedRevenue monthlyEstimatedRevenue;

      /** The phone number of the Business Entity. */
      @SerializedName("phone")
      String phone;

      /** The business legal name. */
      @SerializedName("registered_name")
      String registeredName;

      /** When the business was incorporated or registered. */
      @SerializedName("registration_date")
      RegistrationDate registrationDate;

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
          List<AccountTokenCreateParams.Identity.BusinessDetails.IdNumber> idNumbers,
          MonthlyEstimatedRevenue monthlyEstimatedRevenue,
          String phone,
          String registeredName,
          RegistrationDate registrationDate,
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
        this.registrationDate = registrationDate;
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

        private List<AccountTokenCreateParams.Identity.BusinessDetails.IdNumber> idNumbers;

        private MonthlyEstimatedRevenue monthlyEstimatedRevenue;

        private String phone;

        private String registeredName;

        private RegistrationDate registrationDate;

        private ScriptAddresses scriptAddresses;

        private ScriptNames scriptNames;

        private Structure structure;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountTokenCreateParams.Identity.BusinessDetails build() {
          return new AccountTokenCreateParams.Identity.BusinessDetails(
              this.address,
              this.annualRevenue,
              this.documents,
              this.estimatedWorkerCount,
              this.extraParams,
              this.idNumbers,
              this.monthlyEstimatedRevenue,
              this.phone,
              this.registeredName,
              this.registrationDate,
              this.scriptAddresses,
              this.scriptNames,
              this.structure);
        }

        /** The business registration address of the business entity. */
        public Builder setAddress(
            AccountTokenCreateParams.Identity.BusinessDetails.Address address) {
          this.address = address;
          return this;
        }

        /** The business gross annual revenue for its preceding fiscal year. */
        public Builder setAnnualRevenue(
            AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue annualRevenue) {
          this.annualRevenue = annualRevenue;
          return this;
        }

        /** A document verifying the business. */
        public Builder setDocuments(
            AccountTokenCreateParams.Identity.BusinessDetails.Documents documents) {
          this.documents = documents;
          return this;
        }

        /**
         * Estimated maximum number of workers currently engaged by the business (including
         * employees, contractors, and vendors).
         */
        public Builder setEstimatedWorkerCount(Long estimatedWorkerCount) {
          this.estimatedWorkerCount = estimatedWorkerCount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountTokenCreateParams.Identity.BusinessDetails#extraParams} for the
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
         * map. See {@link AccountTokenCreateParams.Identity.BusinessDetails#extraParams} for the
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
         * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountTokenCreateParams.Identity.BusinessDetails#idNumbers} for the field documentation.
         */
        public Builder addIdNumber(
            AccountTokenCreateParams.Identity.BusinessDetails.IdNumber element) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.add(element);
          return this;
        }

        /**
         * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountTokenCreateParams.Identity.BusinessDetails#idNumbers} for the field documentation.
         */
        public Builder addAllIdNumber(
            List<AccountTokenCreateParams.Identity.BusinessDetails.IdNumber> elements) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.addAll(elements);
          return this;
        }

        /** An estimate of the monthly revenue of the business. */
        public Builder setMonthlyEstimatedRevenue(
            AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue
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

        /** When the business was incorporated or registered. */
        public Builder setRegistrationDate(
            AccountTokenCreateParams.Identity.BusinessDetails.RegistrationDate registrationDate) {
          this.registrationDate = registrationDate;
          return this;
        }

        /** The business registration address of the business entity in non latin script. */
        public Builder setScriptAddresses(
            AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The business legal name in non latin script. */
        public Builder setScriptNames(
            AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The category identifying the legal structure of the business. */
        public Builder setStructure(
            AccountTokenCreateParams.Identity.BusinessDetails.Structure structure) {
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

        /** Town or district. */
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
          public AccountTokenCreateParams.Identity.BusinessDetails.Address build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.Address(
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
           * map. See {@link AccountTokenCreateParams.Identity.BusinessDetails.Address#extraParams}
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
           * map. See {@link AccountTokenCreateParams.Identity.BusinessDetails.Address#extraParams}
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

          /** Town or district. */
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
          public AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue(
                this.amount, this.extraParams, this.fiscalYearEnd);
          }

          /** A non-negative integer representing the amount in the smallest currency unit. */
          public Builder setAmount(
              AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue.Amount amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue#extraParams} for the
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
           * AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue#extraParams} for the
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
           * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
           * the 31st of December, 2023.
           */
          public Builder setFiscalYearEnd(String fiscalYearEnd) {
            this.fiscalYearEnd = fiscalYearEnd;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Amount {
          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          @SerializedName("currency")
          String currency;

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
           * A non-negative integer representing how much to charge in the <a
           * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
           */
          @SerializedName("value")
          Long value;

          private Amount(String currency, Map<String, Object> extraParams, Long value) {
            this.currency = currency;
            this.extraParams = extraParams;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String currency;

            private Map<String, Object> extraParams;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue.Amount build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue.Amount(
                  this.currency, this.extraParams, this.value);
            }

            /**
             * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
             * code</a>, in lowercase. Must be a <a
             * href="https://stripe.com/docs/currencies">supported currency</a>.
             */
            public Builder setCurrency(String currency) {
              this.currency = currency;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue.Amount#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.AnnualRevenue.Amount#extraParams}
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
             * A non-negative integer representing how much to charge in the <a
             * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
             */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
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
          public AccountTokenCreateParams.Identity.BusinessDetails.Documents build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.Documents(
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
              AccountTokenCreateParams.Identity.BusinessDetails.Documents
                      .BankAccountOwnershipVerification
                  bankAccountOwnershipVerification) {
            this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s license to operate. */
          public Builder setCompanyLicense(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense
                  companyLicense) {
            this.companyLicense = companyLicense;
            return this;
          }

          /** One or more documents showing the company’s Memorandum of Association. */
          public Builder setCompanyMemorandumOfAssociation(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents
                      .CompanyMemorandumOfAssociation
                  companyMemorandumOfAssociation) {
            this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
            return this;
          }

          /**
           * Certain countries only: One or more documents showing the ministerial decree legalizing
           * the company’s establishment.
           */
          public Builder setCompanyMinisterialDecree(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree
                  companyMinisterialDecree) {
            this.companyMinisterialDecree = companyMinisterialDecree;
            return this;
          }

          /**
           * One or more documents that demonstrate proof of a company’s registration with the
           * appropriate local authorities.
           */
          public Builder setCompanyRegistrationVerification(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents
                      .CompanyRegistrationVerification
                  companyRegistrationVerification) {
            this.companyRegistrationVerification = companyRegistrationVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s tax ID. */
          public Builder setCompanyTaxIdVerification(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification
                  companyTaxIdVerification) {
            this.companyTaxIdVerification = companyTaxIdVerification;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.BusinessDetails.Documents#extraParams} for the field
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
           * AccountTokenCreateParams.Identity.BusinessDetails.Documents#extraParams} for the field
           * documentation.
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
              AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                  primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of address. */
          public Builder setProofOfAddress(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress
                  proofOfAddress) {
            this.proofOfAddress = proofOfAddress;
            return this;
          }

          /**
           * One or more documents showing the company’s proof of registration with the national
           * business registry.
           */
          public Builder setProofOfRegistration(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration
                  proofOfRegistration) {
            this.proofOfRegistration = proofOfRegistration;
            return this;
          }

          /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
          public Builder setProofOfUltimateBeneficialOwnership(
              AccountTokenCreateParams.Identity.BusinessDetails.Documents
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents
                    .BankAccountOwnershipVerification
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .BankAccountOwnershipVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#files} for
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense#files} for
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyLicense.Type
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents
                    .CompanyMemorandumOfAssociation
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .CompanyMemorandumOfAssociation(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents
                    .CompanyMinisterialDecree
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .CompanyMinisterialDecree(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree
                        .Type
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents
                    .CompanyRegistrationVerification
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .CompanyRegistrationVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents
                    .CompanyTaxIdVerification
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .CompanyTaxIdVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification
                        .Type
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .PrimaryVerification(this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification#extraParams}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                        .FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.Type
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
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
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
              public AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                      .FrontBack
                  build() {
                return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
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
               * AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * AccountTokenCreateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#files} for
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress#files} for
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfAddress.Type
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .ProofOfRegistration(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfRegistration.Type
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
            public AccountTokenCreateParams.Identity.BusinessDetails.Documents
                    .ProofOfUltimateBeneficialOwnership
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.Documents
                  .ProofOfUltimateBeneficialOwnership(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#files}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#files}
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
                AccountTokenCreateParams.Identity.BusinessDetails.Documents
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
          public AccountTokenCreateParams.Identity.BusinessDetails.IdNumber build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.IdNumber(
                this.extraParams, this.registrar, this.type, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountTokenCreateParams.Identity.BusinessDetails.IdNumber#extraParams}
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
           * map. See {@link AccountTokenCreateParams.Identity.BusinessDetails.IdNumber#extraParams}
           * for the field documentation.
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
          public Builder setType(
              AccountTokenCreateParams.Identity.BusinessDetails.IdNumber.Type type) {
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

          @SerializedName("ar_cuit")
          AR_CUIT("ar_cuit"),

          @SerializedName("at_fn")
          AT_FN("at_fn"),

          @SerializedName("at_stn")
          AT_STN("at_stn"),

          @SerializedName("at_vat")
          AT_VAT("at_vat"),

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

          @SerializedName("be_vat")
          BE_VAT("be_vat"),

          @SerializedName("bg_uic")
          BG_UIC("bg_uic"),

          @SerializedName("bg_vat")
          BG_VAT("bg_vat"),

          @SerializedName("br_cnpj")
          BR_CNPJ("br_cnpj"),

          @SerializedName("ca_cn")
          CA_CN("ca_cn"),

          @SerializedName("ca_crarr")
          CA_CRARR("ca_crarr"),

          @SerializedName("ca_gst_hst")
          CA_GST_HST("ca_gst_hst"),

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

          @SerializedName("cy_he")
          CY_HE("cy_he"),

          @SerializedName("cy_tic")
          CY_TIC("cy_tic"),

          @SerializedName("cy_vat")
          CY_VAT("cy_vat"),

          @SerializedName("cz_ico")
          CZ_ICO("cz_ico"),

          @SerializedName("cz_vat")
          CZ_VAT("cz_vat"),

          @SerializedName("de_hrn")
          DE_HRN("de_hrn"),

          @SerializedName("de_stn")
          DE_STN("de_stn"),

          @SerializedName("de_vat")
          DE_VAT("de_vat"),

          @SerializedName("dk_cvr")
          DK_CVR("dk_cvr"),

          @SerializedName("dk_vat")
          DK_VAT("dk_vat"),

          @SerializedName("do_rcn")
          DO_RCN("do_rcn"),

          @SerializedName("ee_rk")
          EE_RK("ee_rk"),

          @SerializedName("ee_vat")
          EE_VAT("ee_vat"),

          @SerializedName("es_cif")
          ES_CIF("es_cif"),

          @SerializedName("es_vat")
          ES_VAT("es_vat"),

          @SerializedName("fi_vat")
          FI_VAT("fi_vat"),

          @SerializedName("fi_yt")
          FI_YT("fi_yt"),

          @SerializedName("fr_rna")
          FR_RNA("fr_rna"),

          @SerializedName("fr_siren")
          FR_SIREN("fr_siren"),

          @SerializedName("fr_vat")
          FR_VAT("fr_vat"),

          @SerializedName("gb_crn")
          GB_CRN("gb_crn"),

          @SerializedName("gb_vat")
          GB_VAT("gb_vat"),

          @SerializedName("gi_crn")
          GI_CRN("gi_crn"),

          @SerializedName("gr_afm")
          GR_AFM("gr_afm"),

          @SerializedName("gr_gemi")
          GR_GEMI("gr_gemi"),

          @SerializedName("gr_vat")
          GR_VAT("gr_vat"),

          @SerializedName("gt_nit")
          GT_NIT("gt_nit"),

          @SerializedName("hk_br")
          HK_BR("hk_br"),

          @SerializedName("hk_cr")
          HK_CR("hk_cr"),

          @SerializedName("hr_mbs")
          HR_MBS("hr_mbs"),

          @SerializedName("hr_oib")
          HR_OIB("hr_oib"),

          @SerializedName("hr_vat")
          HR_VAT("hr_vat"),

          @SerializedName("hu_cjs")
          HU_CJS("hu_cjs"),

          @SerializedName("hu_tin")
          HU_TIN("hu_tin"),

          @SerializedName("hu_vat")
          HU_VAT("hu_vat"),

          @SerializedName("ie_crn")
          IE_CRN("ie_crn"),

          @SerializedName("ie_trn")
          IE_TRN("ie_trn"),

          @SerializedName("ie_vat")
          IE_VAT("ie_vat"),

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

          @SerializedName("lt_vat")
          LT_VAT("lt_vat"),

          @SerializedName("lu_nif")
          LU_NIF("lu_nif"),

          @SerializedName("lu_rcs")
          LU_RCS("lu_rcs"),

          @SerializedName("lu_vat")
          LU_VAT("lu_vat"),

          @SerializedName("lv_urn")
          LV_URN("lv_urn"),

          @SerializedName("lv_vat")
          LV_VAT("lv_vat"),

          @SerializedName("mt_crn")
          MT_CRN("mt_crn"),

          @SerializedName("mt_tin")
          MT_TIN("mt_tin"),

          @SerializedName("mt_vat")
          MT_VAT("mt_vat"),

          @SerializedName("mx_rfc")
          MX_RFC("mx_rfc"),

          @SerializedName("my_brn")
          MY_BRN("my_brn"),

          @SerializedName("my_coid")
          MY_COID("my_coid"),

          @SerializedName("my_itn")
          MY_ITN("my_itn"),

          @SerializedName("my_sst")
          MY_SST("my_sst"),

          @SerializedName("mz_nuit")
          MZ_NUIT("mz_nuit"),

          @SerializedName("nl_kvk")
          NL_KVK("nl_kvk"),

          @SerializedName("nl_rsin")
          NL_RSIN("nl_rsin"),

          @SerializedName("nl_vat")
          NL_VAT("nl_vat"),

          @SerializedName("no_orgnr")
          NO_ORGNR("no_orgnr"),

          @SerializedName("nz_bn")
          NZ_BN("nz_bn"),

          @SerializedName("nz_ird")
          NZ_IRD("nz_ird"),

          @SerializedName("pe_ruc")
          PE_RUC("pe_ruc"),

          @SerializedName("pk_ntn")
          PK_NTN("pk_ntn"),

          @SerializedName("pl_nip")
          PL_NIP("pl_nip"),

          @SerializedName("pl_regon")
          PL_REGON("pl_regon"),

          @SerializedName("pl_vat")
          PL_VAT("pl_vat"),

          @SerializedName("pt_vat")
          PT_VAT("pt_vat"),

          @SerializedName("ro_cui")
          RO_CUI("ro_cui"),

          @SerializedName("ro_orc")
          RO_ORC("ro_orc"),

          @SerializedName("ro_vat")
          RO_VAT("ro_vat"),

          @SerializedName("sa_crn")
          SA_CRN("sa_crn"),

          @SerializedName("sa_tin")
          SA_TIN("sa_tin"),

          @SerializedName("se_orgnr")
          SE_ORGNR("se_orgnr"),

          @SerializedName("se_vat")
          SE_VAT("se_vat"),

          @SerializedName("sg_uen")
          SG_UEN("sg_uen"),

          @SerializedName("si_msp")
          SI_MSP("si_msp"),

          @SerializedName("si_tin")
          SI_TIN("si_tin"),

          @SerializedName("si_vat")
          SI_VAT("si_vat"),

          @SerializedName("sk_dic")
          SK_DIC("sk_dic"),

          @SerializedName("sk_ico")
          SK_ICO("sk_ico"),

          @SerializedName("sk_vat")
          SK_VAT("sk_vat"),

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
          public AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue(
                this.amount, this.extraParams);
          }

          /** A non-negative integer representing the amount in the smallest currency unit. */
          public Builder setAmount(
              AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue.Amount
                  amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue#extraParams}
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
           * AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue#extraParams}
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
        public static class Amount {
          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          @SerializedName("currency")
          String currency;

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
           * A non-negative integer representing how much to charge in the <a
           * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
           */
          @SerializedName("value")
          Long value;

          private Amount(String currency, Map<String, Object> extraParams, Long value) {
            this.currency = currency;
            this.extraParams = extraParams;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String currency;

            private Map<String, Object> extraParams;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue.Amount
                build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue
                  .Amount(this.currency, this.extraParams, this.value);
            }

            /**
             * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
             * code</a>, in lowercase. Must be a <a
             * href="https://stripe.com/docs/currencies">supported currency</a>.
             */
            public Builder setCurrency(String currency) {
              this.currency = currency;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue.Amount#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue.Amount#extraParams}
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
             * A non-negative integer representing how much to charge in the <a
             * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
             */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class RegistrationDate {
        /** <strong>Required.</strong> The day of registration, between 1 and 31. */
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

        /** <strong>Required.</strong> The month of registration, between 1 and 12. */
        @SerializedName("month")
        Long month;

        /** <strong>Required.</strong> The four-digit year of registration. */
        @SerializedName("year")
        Long year;

        private RegistrationDate(Long day, Map<String, Object> extraParams, Long month, Long year) {
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
          public AccountTokenCreateParams.Identity.BusinessDetails.RegistrationDate build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.RegistrationDate(
                this.day, this.extraParams, this.month, this.year);
          }

          /** <strong>Required.</strong> The day of registration, between 1 and 31. */
          public Builder setDay(Long day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.BusinessDetails.RegistrationDate#extraParams} for the
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
           * AccountTokenCreateParams.Identity.BusinessDetails.RegistrationDate#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The month of registration, between 1 and 12. */
          public Builder setMonth(Long month) {
            this.month = month;
            return this;
          }

          /** <strong>Required.</strong> The four-digit year of registration. */
          public Builder setYear(Long year) {
            this.year = year;
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
          public AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses#extraParams} for the
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
           * AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses#extraParams} for the
           * field documentation.
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
              AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(
              AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji kanji) {
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

          /** Town or district. */
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
            public AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana(
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
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kana#extraParams}
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

            /** Town or district. */
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

          /** Town or district. */
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
            public AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji(
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
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji#extraParams}
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
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptAddresses.Kanji#extraParams}
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

            /** Town or district. */
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
          public AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames build() {
            return new AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames#extraParams} for the
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
           * AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames#extraParams} for the
           * field documentation.
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
              AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji name. */
          public Builder setKanji(
              AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kanji kanji) {
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
            public AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kana build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kana(
                  this.extraParams, this.registeredName);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kana#extraParams} for
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
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kana#extraParams} for
             * the field documentation.
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
            public AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kanji build() {
              return new AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kanji(
                  this.extraParams, this.registeredName);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kanji#extraParams} for
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
             * AccountTokenCreateParams.Identity.BusinessDetails.ScriptNames.Kanji#extraParams} for
             * the field documentation.
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
      List<AccountTokenCreateParams.Identity.Individual.AdditionalAddress> additionalAddresses;

      /** Additional names (e.g. aliases) associated with the individual. */
      @SerializedName("additional_names")
      List<AccountTokenCreateParams.Identity.Individual.AdditionalName> additionalNames;

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
      List<AccountTokenCreateParams.Identity.Individual.IdNumber> idNumbers;

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
      Map<String, Object> metadata;

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
          List<AccountTokenCreateParams.Identity.Individual.AdditionalAddress> additionalAddresses,
          List<AccountTokenCreateParams.Identity.Individual.AdditionalName> additionalNames,
          Address address,
          DateOfBirth dateOfBirth,
          Documents documents,
          String email,
          Map<String, Object> extraParams,
          String givenName,
          List<AccountTokenCreateParams.Identity.Individual.IdNumber> idNumbers,
          LegalGender legalGender,
          Map<String, Object> metadata,
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
        private List<AccountTokenCreateParams.Identity.Individual.AdditionalAddress>
            additionalAddresses;

        private List<AccountTokenCreateParams.Identity.Individual.AdditionalName> additionalNames;

        private Address address;

        private DateOfBirth dateOfBirth;

        private Documents documents;

        private String email;

        private Map<String, Object> extraParams;

        private String givenName;

        private List<AccountTokenCreateParams.Identity.Individual.IdNumber> idNumbers;

        private LegalGender legalGender;

        private Map<String, Object> metadata;

        private List<String> nationalities;

        private String phone;

        private PoliticalExposure politicalExposure;

        private Relationship relationship;

        private ScriptAddresses scriptAddresses;

        private ScriptNames scriptNames;

        private String surname;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountTokenCreateParams.Identity.Individual build() {
          return new AccountTokenCreateParams.Identity.Individual(
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
         * See {@link AccountTokenCreateParams.Identity.Individual#additionalAddresses} for the
         * field documentation.
         */
        public Builder addAdditionalAddress(
            AccountTokenCreateParams.Identity.Individual.AdditionalAddress element) {
          if (this.additionalAddresses == null) {
            this.additionalAddresses = new ArrayList<>();
          }
          this.additionalAddresses.add(element);
          return this;
        }

        /**
         * Add all elements to `additionalAddresses` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountTokenCreateParams.Identity.Individual#additionalAddresses} for the
         * field documentation.
         */
        public Builder addAllAdditionalAddress(
            List<AccountTokenCreateParams.Identity.Individual.AdditionalAddress> elements) {
          if (this.additionalAddresses == null) {
            this.additionalAddresses = new ArrayList<>();
          }
          this.additionalAddresses.addAll(elements);
          return this;
        }

        /**
         * Add an element to `additionalNames` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountTokenCreateParams.Identity.Individual#additionalNames} for the field
         * documentation.
         */
        public Builder addAdditionalName(
            AccountTokenCreateParams.Identity.Individual.AdditionalName element) {
          if (this.additionalNames == null) {
            this.additionalNames = new ArrayList<>();
          }
          this.additionalNames.add(element);
          return this;
        }

        /**
         * Add all elements to `additionalNames` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountTokenCreateParams.Identity.Individual#additionalNames} for the field
         * documentation.
         */
        public Builder addAllAdditionalName(
            List<AccountTokenCreateParams.Identity.Individual.AdditionalName> elements) {
          if (this.additionalNames == null) {
            this.additionalNames = new ArrayList<>();
          }
          this.additionalNames.addAll(elements);
          return this;
        }

        /** The individual's residential address. */
        public Builder setAddress(AccountTokenCreateParams.Identity.Individual.Address address) {
          this.address = address;
          return this;
        }

        /** The individual's date of birth. */
        public Builder setDateOfBirth(
            AccountTokenCreateParams.Identity.Individual.DateOfBirth dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
          return this;
        }

        /** Documents that may be submitted to satisfy various informational requests. */
        public Builder setDocuments(
            AccountTokenCreateParams.Identity.Individual.Documents documents) {
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
         * map. See {@link AccountTokenCreateParams.Identity.Individual#extraParams} for the field
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
         * map. See {@link AccountTokenCreateParams.Identity.Individual#extraParams} for the field
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
         * AccountTokenCreateParams.Identity.Individual#idNumbers} for the field documentation.
         */
        public Builder addIdNumber(AccountTokenCreateParams.Identity.Individual.IdNumber element) {
          if (this.idNumbers == null) {
            this.idNumbers = new ArrayList<>();
          }
          this.idNumbers.add(element);
          return this;
        }

        /**
         * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountTokenCreateParams.Identity.Individual#idNumbers} for the field documentation.
         */
        public Builder addAllIdNumber(
            List<AccountTokenCreateParams.Identity.Individual.IdNumber> elements) {
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
            AccountTokenCreateParams.Identity.Individual.LegalGender legalGender) {
          this.legalGender = legalGender;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * AccountTokenCreateParams.Identity.Individual#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * AccountTokenCreateParams.Identity.Individual#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. Map values can only be one of the following types: `String`, `EmptyParam`. See
         * {@link AccountTokenCreateParams.Identity.Individual#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, Object> map) {
          if (!map.values().stream()
              .allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
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
         * Add an element to `nationalities` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountTokenCreateParams.Identity.Individual#nationalities} for the field documentation.
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
         * See {@link AccountTokenCreateParams.Identity.Individual#nationalities} for the field
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
            AccountTokenCreateParams.Identity.Individual.PoliticalExposure politicalExposure) {
          this.politicalExposure = politicalExposure;
          return this;
        }

        /** The relationship that this individual has with the account's identity. */
        public Builder setRelationship(
            AccountTokenCreateParams.Identity.Individual.Relationship relationship) {
          this.relationship = relationship;
          return this;
        }

        /** The script addresses (e.g., non-Latin characters) associated with the individual. */
        public Builder setScriptAddresses(
            AccountTokenCreateParams.Identity.Individual.ScriptAddresses scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The individuals primary name in non latin script. */
        public Builder setScriptNames(
            AccountTokenCreateParams.Identity.Individual.ScriptNames scriptNames) {
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

        /** <strong>Required.</strong> Purpose of additional address. */
        @SerializedName("purpose")
        Purpose purpose;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        /** Town or district. */
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
          public AccountTokenCreateParams.Identity.Individual.AdditionalAddress build() {
            return new AccountTokenCreateParams.Identity.Individual.AdditionalAddress(
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
           * AccountTokenCreateParams.Identity.Individual.AdditionalAddress#extraParams} for the
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
           * AccountTokenCreateParams.Identity.Individual.AdditionalAddress#extraParams} for the
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

          /** <strong>Required.</strong> Purpose of additional address. */
          public Builder setPurpose(
              AccountTokenCreateParams.Identity.Individual.AdditionalAddress.Purpose purpose) {
            this.purpose = purpose;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** Town or district. */
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
          public AccountTokenCreateParams.Identity.Individual.AdditionalName build() {
            return new AccountTokenCreateParams.Identity.Individual.AdditionalName(
                this.extraParams, this.fullName, this.givenName, this.purpose, this.surname);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.Individual.AdditionalName#extraParams} for the field
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
           * AccountTokenCreateParams.Identity.Individual.AdditionalName#extraParams} for the field
           * documentation.
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
              AccountTokenCreateParams.Identity.Individual.AdditionalName.Purpose purpose) {
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

        /** Town or district. */
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
          public AccountTokenCreateParams.Identity.Individual.Address build() {
            return new AccountTokenCreateParams.Identity.Individual.Address(
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.Address#extraParams} for
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.Address#extraParams} for
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

          /** Town or district. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DateOfBirth {
        /** <strong>Required.</strong> The day of the birth. */
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
          public AccountTokenCreateParams.Identity.Individual.DateOfBirth build() {
            return new AccountTokenCreateParams.Identity.Individual.DateOfBirth(
                this.day, this.extraParams, this.month, this.year);
          }

          /** <strong>Required.</strong> The day of the birth. */
          public Builder setDay(Long day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountTokenCreateParams.Identity.Individual.DateOfBirth#extraParams}
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.DateOfBirth#extraParams}
           * for the field documentation.
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
          public AccountTokenCreateParams.Identity.Individual.Documents build() {
            return new AccountTokenCreateParams.Identity.Individual.Documents(
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
              AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization
                  companyAuthorization) {
            this.companyAuthorization = companyAuthorization;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountTokenCreateParams.Identity.Individual.Documents#extraParams} for
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.Documents#extraParams} for
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
           * One or more documents showing the person’s passport page with photo and personal data.
           */
          public Builder setPassport(
              AccountTokenCreateParams.Identity.Individual.Documents.Passport passport) {
            this.passport = passport;
            return this;
          }

          /**
           * An identifying document showing the person's name, either a passport or local ID card.
           */
          public Builder setPrimaryVerification(
              AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification
                  primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /**
           * A document showing address, either a passport, local ID card, or utility bill from a
           * well-known utility company.
           */
          public Builder setSecondaryVerification(
              AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification
                  secondaryVerification) {
            this.secondaryVerification = secondaryVerification;
            return this;
          }

          /**
           * One or more documents showing the person’s visa required for living in the country
           * where they are residing.
           */
          public Builder setVisa(AccountTokenCreateParams.Identity.Individual.Documents.Visa visa) {
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
            public AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization
                build() {
              return new AccountTokenCreateParams.Identity.Individual.Documents
                  .CompanyAuthorization(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization#extraParams}
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
             * AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization#extraParams}
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
             * AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization#files}
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
             * AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization#files}
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
                AccountTokenCreateParams.Identity.Individual.Documents.CompanyAuthorization.Type
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
            public AccountTokenCreateParams.Identity.Individual.Documents.Passport build() {
              return new AccountTokenCreateParams.Identity.Individual.Documents.Passport(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.Passport#extraParams} for the
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
             * AccountTokenCreateParams.Identity.Individual.Documents.Passport#extraParams} for the
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.Passport#files} for the field
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
             * AccountTokenCreateParams.Identity.Individual.Documents.Passport#files} for the field
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
                AccountTokenCreateParams.Identity.Individual.Documents.Passport.Type type) {
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
            public AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification
                build() {
              return new AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification#extraParams}
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
                AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification.Type
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
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
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
              public AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification
                      .FrontBack
                  build() {
                return new AccountTokenCreateParams.Identity.Individual.Documents
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
               * AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * AccountTokenCreateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
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
            public AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification
                build() {
              return new AccountTokenCreateParams.Identity.Individual.Documents
                  .SecondaryVerification(this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification#extraParams}
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
             * AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification#extraParams}
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
                AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification
                        .FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification.Type
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
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
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
              public AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification
                      .FrontBack
                  build() {
                return new AccountTokenCreateParams.Identity.Individual.Documents
                    .SecondaryVerification.FrontBack(this.back, this.extraParams, this.front);
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
               * AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack#extraParams}
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
               * AccountTokenCreateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack#extraParams}
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
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
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
            public AccountTokenCreateParams.Identity.Individual.Documents.Visa build() {
              return new AccountTokenCreateParams.Identity.Individual.Documents.Visa(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.Visa#extraParams} for the
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
             * AccountTokenCreateParams.Identity.Individual.Documents.Visa#extraParams} for the
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountTokenCreateParams.Identity.Individual.Documents.Visa#files} for the field
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
             * AccountTokenCreateParams.Identity.Individual.Documents.Visa#files} for the field
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
                AccountTokenCreateParams.Identity.Individual.Documents.Visa.Type type) {
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
          public AccountTokenCreateParams.Identity.Individual.IdNumber build() {
            return new AccountTokenCreateParams.Identity.Individual.IdNumber(
                this.extraParams, this.type, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountTokenCreateParams.Identity.Individual.IdNumber#extraParams} for
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.IdNumber#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID number type of an individual. */
          public Builder setType(AccountTokenCreateParams.Identity.Individual.IdNumber.Type type) {
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

          @SerializedName("ar_cuil")
          AR_CUIL("ar_cuil"),

          @SerializedName("ar_dni")
          AR_DNI("ar_dni"),

          @SerializedName("at_stn")
          AT_STN("at_stn"),

          @SerializedName("az_tin")
          AZ_TIN("az_tin"),

          @SerializedName("bd_brc")
          BD_BRC("bd_brc"),

          @SerializedName("bd_etin")
          BD_ETIN("bd_etin"),

          @SerializedName("bd_nid")
          BD_NID("bd_nid"),

          @SerializedName("be_nrn")
          BE_NRN("be_nrn"),

          @SerializedName("bg_ucn")
          BG_UCN("bg_ucn"),

          @SerializedName("bn_nric")
          BN_NRIC("bn_nric"),

          @SerializedName("br_cpf")
          BR_CPF("br_cpf"),

          @SerializedName("ca_sin")
          CA_SIN("ca_sin"),

          @SerializedName("ch_oasi")
          CH_OASI("ch_oasi"),

          @SerializedName("cl_rut")
          CL_RUT("cl_rut"),

          @SerializedName("cn_pp")
          CN_PP("cn_pp"),

          @SerializedName("co_nuip")
          CO_NUIP("co_nuip"),

          @SerializedName("cr_ci")
          CR_CI("cr_ci"),

          @SerializedName("cr_cpf")
          CR_CPF("cr_cpf"),

          @SerializedName("cr_dimex")
          CR_DIMEX("cr_dimex"),

          @SerializedName("cr_nite")
          CR_NITE("cr_nite"),

          @SerializedName("cy_tic")
          CY_TIC("cy_tic"),

          @SerializedName("cz_rc")
          CZ_RC("cz_rc"),

          @SerializedName("de_stn")
          DE_STN("de_stn"),

          @SerializedName("dk_cpr")
          DK_CPR("dk_cpr"),

          @SerializedName("do_cie")
          DO_CIE("do_cie"),

          @SerializedName("do_rcn")
          DO_RCN("do_rcn"),

          @SerializedName("ec_ci")
          EC_CI("ec_ci"),

          @SerializedName("ee_ik")
          EE_IK("ee_ik"),

          @SerializedName("es_nif")
          ES_NIF("es_nif"),

          @SerializedName("fi_hetu")
          FI_HETU("fi_hetu"),

          @SerializedName("fr_nir")
          FR_NIR("fr_nir"),

          @SerializedName("gb_nino")
          GB_NINO("gb_nino"),

          @SerializedName("gr_afm")
          GR_AFM("gr_afm"),

          @SerializedName("gt_nit")
          GT_NIT("gt_nit"),

          @SerializedName("hk_id")
          HK_ID("hk_id"),

          @SerializedName("hr_oib")
          HR_OIB("hr_oib"),

          @SerializedName("hu_ad")
          HU_AD("hu_ad"),

          @SerializedName("id_nik")
          ID_NIK("id_nik"),

          @SerializedName("ie_ppsn")
          IE_PPSN("ie_ppsn"),

          @SerializedName("is_kt")
          IS_KT("is_kt"),

          @SerializedName("it_cf")
          IT_CF("it_cf"),

          @SerializedName("jp_inc")
          JP_INC("jp_inc"),

          @SerializedName("ke_pin")
          KE_PIN("ke_pin"),

          @SerializedName("kz_iin")
          KZ_IIN("kz_iin"),

          @SerializedName("li_peid")
          LI_PEID("li_peid"),

          @SerializedName("lt_ak")
          LT_AK("lt_ak"),

          @SerializedName("lu_nif")
          LU_NIF("lu_nif"),

          @SerializedName("lv_pk")
          LV_PK("lv_pk"),

          @SerializedName("mx_rfc")
          MX_RFC("mx_rfc"),

          @SerializedName("my_nric")
          MY_NRIC("my_nric"),

          @SerializedName("mz_nuit")
          MZ_NUIT("mz_nuit"),

          @SerializedName("ng_nin")
          NG_NIN("ng_nin"),

          @SerializedName("nl_bsn")
          NL_BSN("nl_bsn"),

          @SerializedName("no_nin")
          NO_NIN("no_nin"),

          @SerializedName("nz_ird")
          NZ_IRD("nz_ird"),

          @SerializedName("pe_dni")
          PE_DNI("pe_dni"),

          @SerializedName("pk_cnic")
          PK_CNIC("pk_cnic"),

          @SerializedName("pk_snic")
          PK_SNIC("pk_snic"),

          @SerializedName("pl_pesel")
          PL_PESEL("pl_pesel"),

          @SerializedName("pt_nif")
          PT_NIF("pt_nif"),

          @SerializedName("ro_cnp")
          RO_CNP("ro_cnp"),

          @SerializedName("sa_tin")
          SA_TIN("sa_tin"),

          @SerializedName("se_pin")
          SE_PIN("se_pin"),

          @SerializedName("sg_fin")
          SG_FIN("sg_fin"),

          @SerializedName("sg_nric")
          SG_NRIC("sg_nric"),

          @SerializedName("sk_dic")
          SK_DIC("sk_dic"),

          @SerializedName("th_lc")
          TH_LC("th_lc"),

          @SerializedName("th_pin")
          TH_PIN("th_pin"),

          @SerializedName("tr_tin")
          TR_TIN("tr_tin"),

          @SerializedName("us_itin")
          US_ITIN("us_itin"),

          @SerializedName("us_itin_last_4")
          US_ITIN_LAST_4("us_itin_last_4"),

          @SerializedName("us_ssn")
          US_SSN("us_ssn"),

          @SerializedName("us_ssn_last_4")
          US_SSN_LAST_4("us_ssn_last_4"),

          @SerializedName("uy_dni")
          UY_DNI("uy_dni"),

          @SerializedName("za_id")
          ZA_ID("za_id");

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
          public AccountTokenCreateParams.Identity.Individual.Relationship build() {
            return new AccountTokenCreateParams.Identity.Individual.Relationship(
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.Relationship#extraParams}
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.Relationship#extraParams}
           * for the field documentation.
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
          public AccountTokenCreateParams.Identity.Individual.ScriptAddresses build() {
            return new AccountTokenCreateParams.Identity.Individual.ScriptAddresses(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountTokenCreateParams.Identity.Individual.ScriptAddresses#extraParams} for the field
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
           * AccountTokenCreateParams.Identity.Individual.ScriptAddresses#extraParams} for the field
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
              AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(
              AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kanji kanji) {
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

          /** Town or district. */
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
            public AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kana build() {
              return new AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kana(
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
             * AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kana#extraParams} for
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
             * AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kana#extraParams} for
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

            /** Town or district. */
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

          /** Town or district. */
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
            public AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kanji build() {
              return new AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kanji(
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
             * AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kanji#extraParams} for
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
             * AccountTokenCreateParams.Identity.Individual.ScriptAddresses.Kanji#extraParams} for
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

            /** Town or district. */
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
          public AccountTokenCreateParams.Identity.Individual.ScriptNames build() {
            return new AccountTokenCreateParams.Identity.Individual.ScriptNames(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountTokenCreateParams.Identity.Individual.ScriptNames#extraParams}
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
           * map. See {@link AccountTokenCreateParams.Identity.Individual.ScriptNames#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Persons name in kana script. */
          public Builder setKana(
              AccountTokenCreateParams.Identity.Individual.ScriptNames.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Persons name in kanji script. */
          public Builder setKanji(
              AccountTokenCreateParams.Identity.Individual.ScriptNames.Kanji kanji) {
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
            public AccountTokenCreateParams.Identity.Individual.ScriptNames.Kana build() {
              return new AccountTokenCreateParams.Identity.Individual.ScriptNames.Kana(
                  this.extraParams, this.givenName, this.surname);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.ScriptNames.Kana#extraParams} for the
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
             * AccountTokenCreateParams.Identity.Individual.ScriptNames.Kana#extraParams} for the
             * field documentation.
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
            public AccountTokenCreateParams.Identity.Individual.ScriptNames.Kanji build() {
              return new AccountTokenCreateParams.Identity.Individual.ScriptNames.Kanji(
                  this.extraParams, this.givenName, this.surname);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountTokenCreateParams.Identity.Individual.ScriptNames.Kanji#extraParams} for the
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
             * AccountTokenCreateParams.Identity.Individual.ScriptNames.Kanji#extraParams} for the
             * field documentation.
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
}
