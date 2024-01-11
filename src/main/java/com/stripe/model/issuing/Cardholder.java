// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardholderCreateParams;
import com.stripe.param.issuing.CardholderListParams;
import com.stripe.param.issuing.CardholderRetrieveParams;
import com.stripe.param.issuing.CardholderUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An Issuing {@code Cardholder} object represents an individual or business entity who is <a
 * href="https://stripe.com/docs/issuing">issued</a> cards.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/issuing/cards#create-cardholder">How to create
 * a cardholder</a>
 */
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

  /**
   * The cardholder’s preferred locales (languages), ordered by preference. Locales can be {@code
   * de}, {@code en}, {@code es}, {@code fr}, or {@code it}. This changes the language of the <a
   * href="https://stripe.com/docs/issuing/3d-secure">3D Secure flow</a> and one-time password
   * messages sent to the cardholder.
   */
  @SerializedName("preferred_locales")
  List<String> preferredLocales;

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

  /**
   * One of {@code individual} or {@code company}. See <a
   * href="https://stripe.com/docs/issuing/other/choose-cardholder">Choose a cardholder type</a> for
   * more details.
   */
  @SerializedName("type")
  String type;

  /** Creates a new Issuing {@code Cardholder} object that can be issued cards. */
  public static Cardholder create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Issuing {@code Cardholder} object that can be issued cards. */
  public static Cardholder create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cardholders";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Cardholder.class);
  }

  /** Creates a new Issuing {@code Cardholder} object that can be issued cards. */
  public static Cardholder create(CardholderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Issuing {@code Cardholder} object that can be issued cards. */
  public static Cardholder create(CardholderCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cardholders";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Cardholder.class);
  }

  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cardholders";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, CardholderCollection.class);
  }

  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(CardholderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Cardholder} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(CardholderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cardholders";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, CardholderCollection.class);
  }

  /** Retrieves an Issuing {@code Cardholder} object. */
  public static Cardholder retrieve(String cardholder) throws StripeException {
    return retrieve(cardholder, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code Cardholder} object. */
  public static Cardholder retrieve(String cardholder, RequestOptions options)
      throws StripeException {
    return retrieve(cardholder, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code Cardholder} object. */
  public static Cardholder retrieve(
      String cardholder, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(cardholder));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Cardholder.class);
  }

  /** Retrieves an Issuing {@code Cardholder} object. */
  public static Cardholder retrieve(
      String cardholder, CardholderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(cardholder));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Cardholder.class);
  }

  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Cardholder update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Cardholder update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Cardholder.class);
  }

  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(CardholderUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Cardholder} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(CardholderUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/cardholders/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Cardholder.class);
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
    /** Information related to the card_issuing program for this cardholder. */
    @SerializedName("card_issuing")
    CardIssuing cardIssuing;

    /** The date of birth of this cardholder. */
    @SerializedName("dob")
    Dob dob;

    /**
     * The first name of this cardholder. Required before activating Cards. This field cannot
     * contain any numbers, special characters (except periods, commas, hyphens, spaces and
     * apostrophes) or non-latin letters.
     */
    @SerializedName("first_name")
    String firstName;

    /**
     * The last name of this cardholder. Required before activating Cards. This field cannot contain
     * any numbers, special characters (except periods, commas, hyphens, spaces and apostrophes) or
     * non-latin letters.
     */
    @SerializedName("last_name")
    String lastName;

    /** Government-issued ID document for this cardholder. */
    @SerializedName("verification")
    Verification verification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardIssuing extends StripeObject {
      /**
       * Information about cardholder acceptance of Celtic <a
       * href="https://stripe.com/docs/issuing/cards#accept-authorized-user-terms">Authorized User
       * Terms</a>. Required for cards backed by a Celtic program.
       */
      @SerializedName("user_terms_acceptance")
      UserTermsAcceptance userTermsAcceptance;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class UserTermsAcceptance extends StripeObject {
        /** The Unix timestamp marking when the cardholder accepted the Authorized User Terms. */
        @SerializedName("date")
        Long date;

        /** The IP address from which the cardholder accepted the Authorized User Terms. */
        @SerializedName("ip")
        String ip;

        /**
         * The user agent of the browser from which the cardholder accepted the Authorized User
         * Terms.
         */
        @SerializedName("user_agent")
        String userAgent;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dob extends StripeObject {
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
     * <p>One of {@code listed}, {@code rejected.listed}, {@code requirements.past_due}, or {@code
     * under_review}.
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
      /**
       * Maximum amount allowed to spend per interval. This amount is in the card's currency and in
       * the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
       */
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(billing, responseGetter);
    trySetResponseGetter(company, responseGetter);
    trySetResponseGetter(individual, responseGetter);
    trySetResponseGetter(requirements, responseGetter);
    trySetResponseGetter(spendingControls, responseGetter);
  }
}
