// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PersonUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Person extends ApiResource implements HasId, MetadataStore<Person> {
  /** The account the person is associated with. */
  @SerializedName("account")
  String account;

  @SerializedName("address")
  Address address;

  /** The Kana variation of the person's address (Japan only). */
  @SerializedName("address_kana")
  JapanAddress addressKana;

  /** The Kanji variation of the person's address (Japan only). */
  @SerializedName("address_kanji")
  JapanAddress addressKanji;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  @SerializedName("dob")
  DateOfBirth dob;

  /** The person's email address. */
  @SerializedName("email")
  String email;

  /** The person's first name. */
  @SerializedName("first_name")
  String firstName;

  /** The Kana variation of the person's first name (Japan only). */
  @SerializedName("first_name_kana")
  String firstNameKana;

  /** The Kanji variation of the person's first name (Japan only). */
  @SerializedName("first_name_kanji")
  String firstNameKanji;

  /** A list of alternate names or aliases that the person is known by. */
  @SerializedName("full_name_aliases")
  List<String> fullNameAliases;

  /**
   * Information about the upcoming new requirements for this person, including what information
   * needs to be collected, and by when.
   */
  @SerializedName("future_requirements")
  FutureRequirements futureRequirements;

  /**
   * The person's gender (International regulations require either &quot;male&quot; or
   * &quot;female&quot;).
   */
  @SerializedName("gender")
  String gender;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether the person's {@code id_number} was provided. */
  @SerializedName("id_number_provided")
  Boolean idNumberProvided;

  /** The person's last name. */
  @SerializedName("last_name")
  String lastName;

  /** The Kana variation of the person's last name (Japan only). */
  @SerializedName("last_name_kana")
  String lastNameKana;

  /** The Kanji variation of the person's last name (Japan only). */
  @SerializedName("last_name_kanji")
  String lastNameKanji;

  /** The person's maiden name. */
  @SerializedName("maiden_name")
  String maidenName;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The country where the person is a national. */
  @SerializedName("nationality")
  String nationality;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code person}.
   */
  @SerializedName("object")
  String object;

  /** The person's phone number. */
  @SerializedName("phone")
  String phone;

  /**
   * Indicates if the person or any of their representatives, family members, or other closely
   * related persons, declares that they hold or have held an important public job or function, in
   * any jurisdiction.
   *
   * <p>One of {@code existing}, or {@code none}.
   */
  @SerializedName("political_exposure")
  String politicalExposure;

  @SerializedName("relationship")
  Relationship relationship;

  /**
   * Information about the requirements for this person, including what information needs to be
   * collected, and by when.
   */
  @SerializedName("requirements")
  Requirements requirements;

  /**
   * Whether the last four digits of the person's Social Security number have been provided (U.S.
   * only).
   */
  @SerializedName("ssn_last_4_provided")
  Boolean ssnLast4Provided;

  @SerializedName("verification")
  Verification verification;

  /** Updates an existing person. */
  @Override
  public Person update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing person. */
  @Override
  public Person update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/accounts/%s/persons/%s",
                ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }

  /** Updates an existing person. */
  public Person update(PersonUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing person. */
  public Person update(PersonUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/accounts/%s/persons/%s",
                ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }

  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the <code>
   * account_opener</code>. If your integration is using the <code>executive</code> parameter, you
   * cannot delete the only verified <code>executive</code> on file.
   */
  public Person delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the <code>
   * account_opener</code>. If your integration is using the <code>executive</code> parameter, you
   * cannot delete the only verified <code>executive</code> on file.
   */
  public Person delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the <code>
   * account_opener</code>. If your integration is using the <code>executive</code> parameter, you
   * cannot delete the only verified <code>executive</code> on file.
   */
  public Person delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the <code>
   * account_opener</code>. If your integration is using the <code>executive</code> parameter, you
   * cannot delete the only verified <code>executive</code> on file.
   */
  public Person delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/accounts/%s/persons/%s",
                ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Person.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    /** The day of birth, between 1 and 31. */
    @SerializedName("day")
    Long day;

    /** The month of birth, between 1 and 12. */
    @SerializedName("month")
    Long month;

    /** The four-digit year of birth. */
    @SerializedName("year")
    Long year;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FutureRequirements extends StripeObject {
    /**
     * Fields that are due and can be satisfied by providing the corresponding alternative fields
     * instead.
     */
    @SerializedName("alternatives")
    List<Person.FutureRequirements.Alternative> alternatives;

    /**
     * Fields that need to be collected to keep the person's account enabled. If not collected by
     * the account's {@code future_requirements[current_deadline]}, these fields will transition to
     * the main {@code requirements} hash, and may immediately become {@code past_due}, but the
     * account may also be given a grace period depending on the account's enablement state prior to
     * transition.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Person.FutureRequirements.Errors> errors;

    /**
     * Fields that need to be collected assuming all volume thresholds are reached. As they become
     * required, they appear in {@code currently_due} as well, and the account's {@code
     * future_requirements[current_deadline]} becomes set.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by the account's {@code requirements.current_deadline}. These
     * fields need to be collected to enable the person's account. New fields will never appear
     * here; {@code future_requirements.past_due} will always be a subset of {@code
     * requirements.past_due}.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due} or {@code currently_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alternative extends StripeObject {
      /** Fields that can be provided to satisfy all fields in {@code original_fields_due}. */
      @SerializedName("alternative_fields_due")
      List<String> alternativeFieldsDue;

      /**
       * Fields that are due and can be satisfied by providing all fields in {@code
       * alternative_fields_due}.
       */
      @SerializedName("original_fields_due")
      List<String> originalFieldsDue;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code invalid_street_address},
       * {@code invalid_value_other}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code verification_document_dob_mismatch},
       * {@code verification_document_duplicate_type}, {@code verification_document_expired}, {@code
       * verification_document_failed_copy}, {@code verification_document_failed_greyscale}, {@code
       * verification_document_failed_other}, {@code verification_document_failed_test_mode}, {@code
       * verification_document_fraudulent}, {@code verification_document_id_number_mismatch}, {@code
       * verification_document_id_number_missing}, {@code verification_document_incomplete}, {@code
       * verification_document_invalid}, {@code verification_document_issue_or_expiry_date_missing},
       * {@code verification_document_manipulated}, {@code verification_document_missing_back},
       * {@code verification_document_missing_front}, {@code verification_document_name_mismatch},
       * {@code verification_document_name_missing}, {@code
       * verification_document_nationality_mismatch}, {@code verification_document_not_readable},
       * {@code verification_document_not_signed}, {@code verification_document_not_uploaded},
       * {@code verification_document_photo_mismatch}, {@code verification_document_too_large},
       * {@code verification_document_type_not_supported}, {@code
       * verification_failed_address_match}, {@code verification_failed_business_iec_number}, {@code
       * verification_failed_document_match}, {@code verification_failed_id_number_match}, {@code
       * verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_tax_id_match}, {@code verification_failed_tax_id_not_issued}, {@code
       * verification_missing_executives}, {@code verification_missing_owners}, or {@code
       * verification_requires_additional_memorandum_of_associations}.
       */
      @SerializedName("code")
      String code;

      /**
       * An informative message that indicates the error type and provides additional details about
       * the error.
       */
      @SerializedName("reason")
      String reason;

      /**
       * The specific user onboarding requirement field (in the requirements hash) that needs to be
       * resolved.
       */
      @SerializedName("requirement")
      String requirement;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class JapanAddress extends StripeObject {
    /** City/Ward. */
    @SerializedName("city")
    String city;

    /**
     * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    String country;

    /** Block/Building number. */
    @SerializedName("line1")
    String line1;

    /** Building details. */
    @SerializedName("line2")
    String line2;

    /** ZIP or postal code. */
    @SerializedName("postal_code")
    String postalCode;

    /** Prefecture. */
    @SerializedName("state")
    String state;

    /** Town/cho-me. */
    @SerializedName("town")
    String town;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship extends StripeObject {
    /**
     * Whether the person is a director of the account's legal entity. Directors are typically
     * members of the governing board of the company, or responsible for ensuring the company meets
     * its regulatory obligations.
     */
    @SerializedName("director")
    Boolean director;

    /**
     * Whether the person has significant responsibility to control, manage, or direct the
     * organization.
     */
    @SerializedName("executive")
    Boolean executive;

    /** Whether the person is an owner of the account’s legal entity. */
    @SerializedName("owner")
    Boolean owner;

    /** The percent owned by the person of the account's legal entity. */
    @SerializedName("percent_ownership")
    BigDecimal percentOwnership;

    /**
     * Whether the person is authorized as the primary representative of the account. This is the
     * person nominated by the business to provide information about themselves, and general
     * information about the account. There can only be one representative at any given time. At the
     * time the account is created, this person should be set to the person responsible for opening
     * the account.
     */
    @SerializedName("representative")
    Boolean representative;

    /** The person's title (e.g., CEO, Support Engineer). */
    @SerializedName("title")
    String title;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * Fields that are due and can be satisfied by providing the corresponding alternative fields
     * instead.
     */
    @SerializedName("alternatives")
    List<Person.Requirements.Alternative> alternatives;

    /**
     * Fields that need to be collected to keep the person's account enabled. If not collected by
     * the account's {@code current_deadline}, these fields appear in {@code past_due} as well, and
     * the account is disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Account.Requirements.Errors> errors;

    /**
     * Fields that need to be collected assuming all volume thresholds are reached. As they become
     * required, they appear in {@code currently_due} as well, and the account's {@code
     * current_deadline} becomes set.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by the account's {@code current_deadline}. These fields need to
     * be collected to enable the person's account.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due}, {@code currently_due}, or {@code past_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alternative extends StripeObject {
      /** Fields that can be provided to satisfy all fields in {@code original_fields_due}. */
      @SerializedName("alternative_fields_due")
      List<String> alternativeFieldsDue;

      /**
       * Fields that are due and can be satisfied by providing all fields in {@code
       * alternative_fields_due}.
       */
      @SerializedName("original_fields_due")
      List<String> originalFieldsDue;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    /**
     * A document showing address, either a passport, local ID card, or utility bill from a
     * well-known utility company.
     */
    @SerializedName("additional_document")
    VerificationDocument additionalDocument;

    /**
     * A user-displayable string describing the verification state for the person. For example, this
     * may say &quot;Provided identity information could not be verified&quot;.
     */
    @SerializedName("details")
    String details;

    /**
     * One of {@code document_address_mismatch}, {@code document_dob_mismatch}, {@code
     * document_duplicate_type}, {@code document_id_number_mismatch}, {@code
     * document_name_mismatch}, {@code document_nationality_mismatch}, {@code
     * failed_keyed_identity}, or {@code failed_other}. A machine-readable code specifying the
     * verification state for the person.
     */
    @SerializedName("details_code")
    String detailsCode;

    @SerializedName("document")
    VerificationDocument document;

    /**
     * The state of verification for the person. Possible values are {@code unverified}, {@code
     * pending}, or {@code verified}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationDocument extends StripeObject {
    /**
     * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
     * upload</a> with a {@code purpose} value of {@code identity_document}.
     */
    @SerializedName("back")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> back;

    /**
     * A user-displayable string describing the verification state of this document. For example, if
     * a document is uploaded and the picture is too fuzzy, this may say &quot;Identity document is
     * too unclear to read&quot;.
     */
    @SerializedName("details")
    String details;

    /**
     * One of {@code document_corrupt}, {@code document_country_not_supported}, {@code
     * document_expired}, {@code document_failed_copy}, {@code document_failed_other}, {@code
     * document_failed_test_mode}, {@code document_fraudulent}, {@code document_failed_greyscale},
     * {@code document_incomplete}, {@code document_invalid}, {@code document_manipulated}, {@code
     * document_missing_back}, {@code document_missing_front}, {@code document_not_readable}, {@code
     * document_not_uploaded}, {@code document_photo_mismatch}, {@code document_too_large}, or
     * {@code document_type_not_supported}. A machine-readable code specifying the verification
     * state for this document.
     */
    @SerializedName("details_code")
    String detailsCode;

    /**
     * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
     * upload</a> with a {@code purpose} value of {@code identity_document}.
     */
    @SerializedName("front")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> front;

    /** Get ID of expandable {@code back} object. */
    public String getBack() {
      return (this.back != null) ? this.back.getId() : null;
    }

    public void setBack(String id) {
      this.back = ApiResource.setExpandableFieldId(id, this.back);
    }

    /** Get expanded {@code back}. */
    public File getBackObject() {
      return (this.back != null) ? this.back.getExpanded() : null;
    }

    public void setBackObject(File expandableObject) {
      this.back = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code front} object. */
    public String getFront() {
      return (this.front != null) ? this.front.getId() : null;
    }

    public void setFront(String id) {
      this.front = ApiResource.setExpandableFieldId(id, this.front);
    }

    /** Get expanded {@code front}. */
    public File getFrontObject() {
      return (this.front != null) ? this.front.getExpanded() : null;
    }

    public void setFrontObject(File expandableObject) {
      this.front = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }
}
