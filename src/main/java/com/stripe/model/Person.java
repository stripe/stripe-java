package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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

  LegalEntityAddress address;

  /** The Kana variation of the person's address (Japan only). */
  LegalEntityJapanAddress addressKana;

  /** The Kanji variation of the person's address (Japan only). */
  LegalEntityJapanAddress addressKanji;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Always true for a deleted object. */
  Boolean deleted;

  LegalEntityDob dob;

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

  PersonRelationship relationship;

  /**
   * Information about the requirements for this person, including what information needs to be
   * collected, and by when.
   */
  PersonRequirements requirements;

  /** Whether the last 4 digits of this person's SSN have been provided. */
  Boolean ssnLast4Provided;

  LegalEntityVerification verification;

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

  /** Updates an existing Person. */
  public Person update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing Person. */
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
}
