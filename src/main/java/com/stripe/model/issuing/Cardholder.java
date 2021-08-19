// File generated from our OpenAPI spec
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
  @SerializedName("billing")
  Billing billing;

  /** Additional information about a {@code company} cardholder. */
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

  /** Additional information about an {@code individual} cardholder. */
  @SerializedName("individual")
  Individual individual;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
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
   * <p>Equal to {@code issuing.cardholder}.
   */
  @SerializedName("object")
  String object;

  /**
   * The cardholder's phone number. This is required for all cardholders who will be creating EU
   * cards. See the <a href="https://stripe.com/docs/issuing/3d-secure#when-is-3d-secure-applied">3D
   * Secure documentation</a> for more details.
   */
  @SerializedName("phone_number")
  String phoneNumber;

  @SerializedName("requirements")
  Requirements requirements;

  /**
   * Rules that control spending across this cardholder's cards. Refer to our <a
   * href="https://stripe.com/docs/issuing/controls/spending-controls">documentation</a> for more
   * details.
   */
  @SerializedName("spending_controls")
  SpendingControls spendingControls;

  /**
   * Specifies whether to permit authorizations on this cardholder's cards.
   *
   * <p>One of {@code active}, {@code blocked}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** One of {@code individual} or {@code company}. */
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
  public static class Billing extends StripeObject {
    @SerializedName("address")
    Address address;
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
         * The back of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code identity_document}.
         */
        @SerializedName("back")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> back;

        /**
         * The front of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code identity_document}.
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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * If {@code disabled_reason} is present, all cards will decline authorizations with {@code
     * cardholder_verification_required} reason.
     *
     * <p>One of {@code listed}, {@code rejected.listed}, or {@code under_review}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Array of fields that need to be collected in order to verify and re-enable the cardholder.
     */
    @SerializedName("past_due")
    List<String> pastDue;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingControls extends StripeObject {
    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to allow. All other categories will be blocked. Cannot be set with {@code
     * blocked_categories}.
     */
    @SerializedName("allowed_categories")
    List<String> allowedCategories;

    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to decline. All other categories will be allowed. Cannot be set with {@code
     * allowed_categories}.
     */
    @SerializedName("blocked_categories")
    List<String> blockedCategories;

    /** Limit spending with amount-based rules that apply across this cardholder's cards. */
    @SerializedName("spending_limits")
    List<Cardholder.SpendingControls.SpendingLimit> spendingLimits;

    /** Currency of the amounts within {@code spending_limits}. */
    @SerializedName("spending_limits_currency")
    String spendingLimitsCurrency;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SpendingLimit extends StripeObject {
      /** Maximum amount allowed to spend per interval. */
      @SerializedName("amount")
      Long amount;

      /**
       * Array of strings containing <a
       * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
       * this limit applies to. Omitting this field will apply the limit to all categories.
       */
      @SerializedName("categories")
      List<String> categories;

      /**
       * Interval (or event) to which the amount applies.
       *
       * <p>One of {@code all_time}, {@code daily}, {@code monthly}, {@code per_authorization},
       * {@code weekly}, or {@code yearly}.
       */
      @SerializedName("interval")
      String interval;
    }
  }
}
