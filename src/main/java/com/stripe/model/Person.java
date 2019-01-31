package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
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
  Relationship relationship;
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    Long day;
    Long month;
    Long year;
  }

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
    Boolean owner;
    BigDecimal percentOwnership;
    String title;

    /**
     * The {@code executive} attribute.
     * @deprecated This is not required anymore.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    Boolean executive;

    /**
     * The {@code representative} attribute.
     * @deprecated This is not required anymore.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    Boolean representative;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    List<String> currentlyDue;
    List<String> eventuallyDue;
    List<String> pastDue;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    String details;
    String detailsCode;
    VerificationDocument documentSubObject;
    String status;

    /**
     * The {@code document} attribute.
     *
     * @return the {@code document} attribute
     * @deprecated Prefer using the {@link #getDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> document;

    /**
     * The {@code document_back} attribute.
     *
     * @return the {@code document_back} attribute
     * @deprecated Prefer using the {@link #getDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> documentBack;

    // <editor-fold desc="document">
    /**
     * Gets the {@code document} attribute.
     *
     * @return the {@code document} attribute
     * @deprecated Prefer using the {@link #getDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public String getDocument() {
      return (this.document != null) ? this.document.getId() : null;
    }

    /**
     * Sets the {@code document} attribute.
     *
     * @deprecated Prefer using the {@link #setDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public void setDocument(String id) {
      this.document = ApiResource.setExpandableFieldId(id, this.document);
    }

    /**
     * Gets the {@code document} attribute.
     *
     * @return the {@code document} attribute
     * @deprecated Prefer using the {@link #getDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public File getDocumentObject() {
      return (this.document != null) ? this.document.getExpanded() : null;
    }

    /**
     * Sets the {@code document} attribute.
     *
     * @deprecated Prefer using the {@link #setDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public void setDocumentObject(File expandableObject) {
      this.document = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
    // </editor-fold>

    // <editor-fold desc="documentBack">
    /**
     * Gets the {@code document_back} attribute.
     *
     * @return the {@code document_back} attribute
     * @deprecated Prefer using the {@link #getDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public String getDocumentBack() {
      return (this.documentBack != null) ? this.documentBack.getId() : null;
    }

    /**
     * Sets the {@code document_back} attribute.
     *
     * @deprecated Prefer using the {@link #setDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public void setDocumentBack(String id) {
      this.documentBack = ApiResource.setExpandableFieldId(id, this.documentBack);
    }

    /**
     * Gets the {@code document_back} attribute.
     *
     * @return the {@code document_back} attribute
     * @deprecated Prefer using the {@link #getDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public File getDocumentBackObject() {
      return (this.documentBack != null) ? this.documentBack.getExpanded() : null;
    }

    /**
     * Sets the {@code document_back} attribute.
     *
     * @deprecated Prefer using the {@link #setDocumentSubObject} method instead.
     * @see <a href="https://stripe.com/docs/upgrades#2019-02-19">API version 2019-02-19</a>
     */
    @Deprecated
    public void setDocumentBackObject(File expandableObject) {
      this.documentBack = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
    // </editor-fold>
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationDocument extends StripeObject {
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> back;
    String details;
    String detailsCode;
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> front;

    // <editor-fold desc="back">
    public String getBack() {
      return (this.back != null) ? this.back.getId() : null;
    }

    public void setBack(String id) {
      this.back = ApiResource.setExpandableFieldId(id, this.back);
    }

    public File getBackObject() {
      return (this.back != null) ? this.back.getExpanded() : null;
    }

    public void setBackObject(File expandableObject) {
      this.back = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
    // </editor-fold>

    // <editor-fold desc="front">
    public String getFront() {
      return (this.front != null) ? this.front.getId() : null;
    }

    public void setFront(String id) {
      this.front = ApiResource.setExpandableFieldId(id, this.front);
    }

    public File getFrontObject() {
      return (this.front != null) ? this.front.getExpanded() : null;
    }

    public void setFrontObject(File expandableObject) {
      this.front = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
    // </editor-fold>
  }
}
