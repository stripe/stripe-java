package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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
  String account;

  Address address;

  /** The Kana variation of the person's address (Japan only). */
  LegalEntity.JapanAddress addressKana;

  /** The Kanji variation of the person's address (Japan only). */
  LegalEntity.JapanAddress addressKanji;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Always true for a deleted object. */
  Boolean deleted;

  LegalEntity.DateOfBirth dob;

  /** The person's email address. */
  String email;

  /** The person's first name. */
  String firstName;

  /** The Kana variation of the person's first name (Japan only). */
  String firstNameKana;

  /** The Kanji variation of the person's first name (Japan only). */
  String firstNameKanji;

  /** The person's gender (International regulations require either "male" or "female"). */
  String gender;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** Whether the person's `id_number` was provided. */
  Boolean idNumberProvided;

  /** The person's last name. */
  String lastName;

  /** The Kana variation of the person's last name (Japan only). */
  String lastNameKana;

  /** The Kanji variation of the person's last name (Japan only). */
  String lastNameKanji;

  /** The person's maiden name. */
  String maidenName;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The person's phone number. */
  String phone;

  Relationship relationship;

  /**
   * Information about the requirements for this person, including what information needs to be
   * collected, and by when.
   */
  Requirements requirements;

  /** Whether the last 4 digits of this person's SSN have been provided. */
  Boolean ssnLast4Provided;

  LegalEntity.Verification verification;

  /** Updates an existing person. */
  public Person update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing person. */
  public Person update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/accounts/%s/persons/%s", this.getAccount(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/accounts/%s/persons/%s", this.getAccount(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.DELETE, url, params, Person.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship extends StripeObject {
    /**
     * Whether the person opened the account. This person provides information about themselves, and
     * general information about the account.
     */
    Boolean accountOpener;

    /** Whether the person is a director of the account's legal entity. */
    Boolean director;

    /** Whether the person has a significant control of the account’s legal entity. */
    Boolean executive;

    /** Whether the person is an owner of the account’s legal entity. */
    Boolean owner;

    /** The percent owned by the person of the account's legal entity. */
    BigDecimal percentOwnership;

    /** The person's title (e.g., CEO, Support Engineer). */
    String title;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * Fields that need to be collected to keep the person's account enabled. If not collected by
     * the account's `current_deadline`, these fields are moved to `past_due` and the account is
     * disabled.
     */
    List<String> currentlyDue;

    /**
     * Fields that need to be collected assuming all volume thresholds are reached. As fields are
     * needed, they are moved to `currently_due` and the account's `current_deadline` is set.
     */
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by the account's `current_deadline`. These fields need to be
     * collected to enable payouts for the person's account.
     */
    List<String> pastDue;
  }
}
