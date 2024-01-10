// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
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
import com.stripe.param.issuing.PersonalizationDesignActivateParams;
import com.stripe.param.issuing.PersonalizationDesignCreateParams;
import com.stripe.param.issuing.PersonalizationDesignDeactivateParams;
import com.stripe.param.issuing.PersonalizationDesignListParams;
import com.stripe.param.issuing.PersonalizationDesignRejectParams;
import com.stripe.param.issuing.PersonalizationDesignRetrieveParams;
import com.stripe.param.issuing.PersonalizationDesignUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Personalization Design is a logical grouping of a Physical Bundle, card logo, and carrier text
 * that represents a product line.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PersonalizationDesign extends ApiResource
    implements HasId, MetadataStore<PersonalizationDesign> {
  /**
   * The file for the card logo to use with physical bundles that support card logos. Must have a
   * {@code purpose} value of {@code issuing_logo}.
   */
  @SerializedName("card_logo")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<File> cardLogo;

  /** Hash containing carrier text, for use with physical bundles that support carrier text. */
  @SerializedName("carrier_text")
  CarrierText carrierText;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * A lookup key used to retrieve personalization designs dynamically from a static string. This
   * may be up to 200 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Friendly display name. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.personalization_design}.
   */
  @SerializedName("object")
  String object;

  /** The physical bundle object belonging to this personalization design. */
  @SerializedName("physical_bundle")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PhysicalBundle> physicalBundle;

  @SerializedName("preferences")
  Preferences preferences;

  @SerializedName("rejection_reasons")
  RejectionReasons rejectionReasons;

  /**
   * Whether this personalization design can be used to create cards.
   *
   * <p>One of {@code active}, {@code inactive}, {@code rejected}, or {@code review}.
   */
  @SerializedName("status")
  String status;

  /** Get ID of expandable {@code cardLogo} object. */
  public String getCardLogo() {
    return (this.cardLogo != null) ? this.cardLogo.getId() : null;
  }

  public void setCardLogo(String id) {
    this.cardLogo = ApiResource.setExpandableFieldId(id, this.cardLogo);
  }

  /** Get expanded {@code cardLogo}. */
  public File getCardLogoObject() {
    return (this.cardLogo != null) ? this.cardLogo.getExpanded() : null;
  }

  public void setCardLogoObject(File expandableObject) {
    this.cardLogo = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code physicalBundle} object. */
  public String getPhysicalBundle() {
    return (this.physicalBundle != null) ? this.physicalBundle.getId() : null;
  }

  public void setPhysicalBundle(String id) {
    this.physicalBundle = ApiResource.setExpandableFieldId(id, this.physicalBundle);
  }

  /** Get expanded {@code physicalBundle}. */
  public PhysicalBundle getPhysicalBundleObject() {
    return (this.physicalBundle != null) ? this.physicalBundle.getExpanded() : null;
  }

  public void setPhysicalBundleObject(PhysicalBundle expandableObject) {
    this.physicalBundle =
        new ExpandableField<PhysicalBundle>(expandableObject.getId(), expandableObject);
  }

  /** Creates a personalization design object. */
  public static PersonalizationDesign create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a personalization design object. */
  public static PersonalizationDesign create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/personalization_designs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, PersonalizationDesign.class);
  }

  /** Creates a personalization design object. */
  public static PersonalizationDesign create(PersonalizationDesignCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a personalization design object. */
  public static PersonalizationDesign create(
      PersonalizationDesignCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/personalization_designs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, PersonalizationDesign.class);
  }

  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static PersonalizationDesignCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static PersonalizationDesignCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/personalization_designs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, PersonalizationDesignCollection.class);
  }

  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static PersonalizationDesignCollection list(PersonalizationDesignListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of personalization design objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static PersonalizationDesignCollection list(
      PersonalizationDesignListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/personalization_designs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, PersonalizationDesignCollection.class);
  }

  /** Retrieves a personalization design object. */
  public static PersonalizationDesign retrieve(String personalizationDesign)
      throws StripeException {
    return retrieve(personalizationDesign, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a personalization design object. */
  public static PersonalizationDesign retrieve(String personalizationDesign, RequestOptions options)
      throws StripeException {
    return retrieve(personalizationDesign, (Map<String, Object>) null, options);
  }

  /** Retrieves a personalization design object. */
  public static PersonalizationDesign retrieve(
      String personalizationDesign, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/personalization_designs/%s",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, PersonalizationDesign.class);
  }

  /** Retrieves a personalization design object. */
  public static PersonalizationDesign retrieve(
      String personalizationDesign,
      PersonalizationDesignRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/personalization_designs/%s",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, PersonalizationDesign.class);
  }

  /** Updates a card personalization object. */
  @Override
  public PersonalizationDesign update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a card personalization object. */
  @Override
  public PersonalizationDesign update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/personalization_designs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }

  /** Updates a card personalization object. */
  public PersonalizationDesign update(PersonalizationDesignUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a card personalization object. */
  public PersonalizationDesign update(
      PersonalizationDesignUpdateParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/issuing/personalization_designs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CarrierText extends StripeObject {
    /** The footer body text of the carrier letter. */
    @SerializedName("footer_body")
    String footerBody;

    /** The footer title text of the carrier letter. */
    @SerializedName("footer_title")
    String footerTitle;

    /** The header body text of the carrier letter. */
    @SerializedName("header_body")
    String headerBody;

    /** The header title text of the carrier letter. */
    @SerializedName("header_title")
    String headerTitle;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Preferences extends StripeObject {
    /**
     * Whether we use this personalization design to create cards when one isn't specified. A
     * connected account uses the Connect platform's default design if no personalization design is
     * set as the default design.
     */
    @SerializedName("is_default")
    Boolean isDefault;

    /**
     * Whether this personalization design is used to create cards when one is not specified and a
     * default for this connected account does not exist.
     */
    @SerializedName("is_platform_default")
    Boolean isPlatformDefault;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RejectionReasons extends StripeObject {
    /** The reason(s) the card logo was rejected. */
    @SerializedName("card_logo")
    List<String> cardLogo;

    /** The reason(s) the carrier text was rejected. */
    @SerializedName("carrier_text")
    List<String> carrierText;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final PersonalizationDesign resource;

    private TestHelpers(PersonalizationDesign resource) {
      this.resource = resource;
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * active}.
     */
    public PersonalizationDesign activate() throws StripeException {
      return activate((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * active}.
     */
    public PersonalizationDesign activate(RequestOptions options) throws StripeException {
      return activate((Map<String, Object>) null, options);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * active}.
     */
    public PersonalizationDesign activate(Map<String, Object> params) throws StripeException {
      return activate(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * active}.
     */
    public PersonalizationDesign activate(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/personalization_designs/%s/activate",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
      return resource.getResponseGetter().request(request, PersonalizationDesign.class);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * active}.
     */
    public PersonalizationDesign activate(PersonalizationDesignActivateParams params)
        throws StripeException {
      return activate(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * active}.
     */
    public PersonalizationDesign activate(
        PersonalizationDesignActivateParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/personalization_designs/%s/activate",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options,
              ApiMode.V1);
      return resource.getResponseGetter().request(request, PersonalizationDesign.class);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * inactive}.
     */
    public PersonalizationDesign deactivate() throws StripeException {
      return deactivate((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * inactive}.
     */
    public PersonalizationDesign deactivate(RequestOptions options) throws StripeException {
      return deactivate((Map<String, Object>) null, options);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * inactive}.
     */
    public PersonalizationDesign deactivate(Map<String, Object> params) throws StripeException {
      return deactivate(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * inactive}.
     */
    public PersonalizationDesign deactivate(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/personalization_designs/%s/deactivate",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
      return resource.getResponseGetter().request(request, PersonalizationDesign.class);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * inactive}.
     */
    public PersonalizationDesign deactivate(PersonalizationDesignDeactivateParams params)
        throws StripeException {
      return deactivate(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * inactive}.
     */
    public PersonalizationDesign deactivate(
        PersonalizationDesignDeactivateParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/personalization_designs/%s/deactivate",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options,
              ApiMode.V1);
      return resource.getResponseGetter().request(request, PersonalizationDesign.class);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * rejected}.
     */
    public PersonalizationDesign reject(Map<String, Object> params) throws StripeException {
      return reject(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * rejected}.
     */
    public PersonalizationDesign reject(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/personalization_designs/%s/reject",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
      return resource.getResponseGetter().request(request, PersonalizationDesign.class);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * rejected}.
     */
    public PersonalizationDesign reject(PersonalizationDesignRejectParams params)
        throws StripeException {
      return reject(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode personalization design object to {@code
     * rejected}.
     */
    public PersonalizationDesign reject(
        PersonalizationDesignRejectParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/personalization_designs/%s/reject",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options,
              ApiMode.V1);
      return resource.getResponseGetter().request(request, PersonalizationDesign.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(cardLogo, responseGetter);
    trySetResponseGetter(carrierText, responseGetter);
    trySetResponseGetter(physicalBundle, responseGetter);
    trySetResponseGetter(preferences, responseGetter);
    trySetResponseGetter(rejectionReasons, responseGetter);
  }
}
