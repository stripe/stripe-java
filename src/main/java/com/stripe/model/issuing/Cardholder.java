package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.CardholderCreateParams;
import com.stripe.param.issuing.CardholderListParams;
import com.stripe.param.issuing.CardholderRetrieveParams;
import com.stripe.param.issuing.CardholderUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Cardholder extends ApiResource implements HasId, MetadataStore<Cardholder> {
  /**
   * Spending rules that give you some control over how this cardholder's cards can be used. Refer
   * to our [authorizations](https://stripe.com/docs/issuing/authorizations) documentation for more
   * details.
   */
  @SerializedName("authorization_controls")
  AuthorizationControls authorizationControls;

  @SerializedName("billing")
  Billing billing;

  /** Additional information about a `business_entity` cardholder. */
  @SerializedName("company")
  Company company;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The cardholder's email address. */
  @SerializedName("email")
  String email;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Additional information about an `individual` cardholder. */
  @SerializedName("individual")
  Individual individual;

  /** Whether or not this cardholder is the default cardholder. */
  @SerializedName("is_default")
  Boolean isDefault;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The cardholder's name. This will be printed on cards issued to them. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `issuing.cardholder`.
   */
  @SerializedName("object")
  String object;

  /** The cardholder's phone number. */
  @SerializedName("phone_number")
  String phoneNumber;

  @SerializedName("requirements")
  Requirements requirements;

  /**
   * Specifies whether to permit authorizations on this cardholder's cards.
   *
   * <p>One of `active`, `blocked`, or `inactive`.
   */
  @SerializedName("status")
  String status;

  /** One of `individual` or `business_entity`. */
  @SerializedName("type")
  String type;

  /**
   * Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cardholders");
    return ApiResource.requestCollection(url, params, CardholderCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(CardholderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(CardholderListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cardholders");
    return ApiResource.requestCollection(url, params, CardholderCollection.class, options);
  }

  /** Creates a new Issuing <code>Cardholder</code> object that can be issued cards. */
  public static Cardholder create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Issuing <code>Cardholder</code> object that can be issued cards. */
  public static Cardholder create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cardholders");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Cardholder.class, options);
  }

  /** Creates a new Issuing <code>Cardholder</code> object that can be issued cards. */
  public static Cardholder create(CardholderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Issuing <code>Cardholder</code> object that can be issued cards. */
  public static Cardholder create(CardholderCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cardholders");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Cardholder.class, options);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(String cardholder) throws StripeException {
    return retrieve(cardholder, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(String cardholder, RequestOptions options)
      throws StripeException {
    return retrieve(cardholder, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(
      String cardholder, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(cardholder)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Cardholder.class, options);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(
      String cardholder, CardholderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(cardholder)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Cardholder.class, options);
  }

  /**
   * Updates the specified Issuing <code>Cardholder</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Cardholder update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Cardholder</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Cardholder update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Cardholder.class, options);
  }

  /**
   * Updates the specified Issuing <code>Cardholder</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(CardholderUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Cardholder</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(CardholderUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Cardholder.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationControls extends StripeObject {
    /**
     * Array of strings containing
     * [categories](https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category)
     * of authorizations permitted on this cardholder's cards.
     */
    @SerializedName("allowed_categories")
    List<String> allowedCategories;

    /**
     * Array of strings containing
     * [categories](https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category)
     * of authorizations to always decline on this cardholder's cards.
     */
    @SerializedName("blocked_categories")
    List<String> blockedCategories;

    /** Limit the spending with rules based on time intervals and categories. */
    @SerializedName("spending_limits")
    List<Cardholder.SpendingLimit> spendingLimits;

    /** Currency for the amounts within spending_limits. */
    @SerializedName("spending_limits_currency")
    String spendingLimitsCurrency;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Billing extends StripeObject {
    @SerializedName("address")
    Address address;

    @SerializedName("name")
    String name;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Company extends StripeObject {
    /** Whether the company's business ID number was provided. */
    @SerializedName("tax_id_provided")
    Boolean taxIdProvided;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Individual extends StripeObject {
    /** The date of birth of this cardholder. */
    @SerializedName("dob")
    DateOfBirth dob;

    /** The first name of this cardholder. */
    @SerializedName("first_name")
    String firstName;

    /** The last name of this cardholder. */
    @SerializedName("last_name")
    String lastName;

    /** Government-issued ID document for this cardholder. */
    @SerializedName("verification")
    Verification verification;

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
    public static class Verification extends StripeObject {
      /** An identifying document, either a passport or local ID card. */
      @SerializedName("document")
      Document document;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Document extends StripeObject {
        /**
         * The back of a document returned by a [file upload](#create_file) with a `purpose` value
         * of `identity_document`.
         */
        @SerializedName("back")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> back;

        /**
         * The front of a document returned by a [file upload](#create_file) with a `purpose` value
         * of `identity_document`.
         */
        @SerializedName("front")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> front;

        /** Get id of expandable `back` object. */
        public String getBack() {
          return (this.back != null) ? this.back.getId() : null;
        }

        public void setBack(String id) {
          this.back = ApiResource.setExpandableFieldId(id, this.back);
        }

        /** Get expanded `back`. */
        public File getBackObject() {
          return (this.back != null) ? this.back.getExpanded() : null;
        }

        public void setBackObject(File expandableObject) {
          this.back = new ExpandableField<File>(expandableObject.getId(), expandableObject);
        }

        /** Get id of expandable `front` object. */
        public String getFront() {
          return (this.front != null) ? this.front.getId() : null;
        }

        public void setFront(String id) {
          this.front = ApiResource.setExpandableFieldId(id, this.front);
        }

        /** Get expanded `front`. */
        public File getFrontObject() {
          return (this.front != null) ? this.front.getExpanded() : null;
        }

        public void setFrontObject(File expandableObject) {
          this.front = new ExpandableField<File>(expandableObject.getId(), expandableObject);
        }
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * If `disabled_reason` is present, all cards will decline authorizations with
     * `cardholder_verification_required` reason.
     *
     * <p>One of `listed`, `rejected.listed`, or `under_review`.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * If not empty, this field contains the list of fields that need to be collected in order to
     * verify and re-enabled the cardholder.
     */
    @SerializedName("past_due")
    List<String> pastDue;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingLimit extends StripeObject {
    /** Maximum amount allowed to spend per time interval. */
    @SerializedName("amount")
    Long amount;

    /**
     * Array of strings containing
     * [categories](https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category)
     * on which to apply the spending limit. Leave this blank to limit all charges.
     */
    @SerializedName("categories")
    List<String> categories;

    /**
     * The time interval or event with which to apply this spending limit towards.
     *
     * <p>One of `all_time`, `daily`, `monthly`, `per_authorization`, `weekly`, or `yearly`.
     */
    @SerializedName("interval")
    String interval;
  }
}
