package com.stripe.model;

import com.google.gson.annotations.SerializedName;

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
public class Person extends ApiResource implements MetadataStore<Person>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String account;
  Address address;
  JapanAddress addressKana;
  JapanAddress addressKanji;
  Long created;
  Boolean deleted;
  DateOfBirth dob;
  String email;
  String firstName;
  String firstNameKana;
  String firstNameKanji;
  String gender;
  Boolean idNumberProvided;
  String lastName;
  String lastNameKana;
  String lastNameKanji;
  String maidenName;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String phone;
  Requirements requirements;
  @SerializedName("ssn_last_4_provided") Boolean ssnLast4Provided;
  Verification verification;

  // <editor-fold desc="delete">
  /**
   * Delete a person.
   */
  public Person delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a person.
   */
  public Person delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, this.getInstanceUrl(), null, Person.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a person.
   */
  public Person update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a person.
   */
  public Person update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, this.getInstanceUrl(), params, Person.class, options);
  }
  // </editor-fold>

  protected String getInstanceUrl() {
    if (this.account != null) {
      return String.format("%s/%s/persons/%s", classUrl(Account.class), this.getAccount(),
          this.getId());
    }
    return null;
  }

  // TODO: Move this to a top level class instead of duplicating
  // with the LegalEntity resource
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    Long day;
    Long month;
    Long year;
  }

  // TODO: Move this to a top level class instead of duplicating
  // with the LegalEntity resource
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class JapanAddress extends StripeObject {
    String city;
    String country;
    String line1;
    String line2;
    String postalCode;
    String state;
    String town;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship extends StripeObject {
    Boolean accountOpener;
    Boolean director;
    Boolean executive;
    Boolean owner;
    BigDecimal percentOwnership;
    Boolean representative;
    String title;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    List<String> currentlyDue;
    List<String> eventuallyDue;
    List<String> pastDue;
  }

  // TODO: Move this to a top level class instead of duplicating
  // with the LegalEntity resource
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    String details;
    String detailsCode;
    String document;
    String documentBack;
    String status;
  }
}
