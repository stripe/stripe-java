// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardDesignActivateTestmodeParams;
import com.stripe.param.issuing.CardDesignDeactivateTestmodeParams;
import com.stripe.param.issuing.CardDesignListParams;
import com.stripe.param.issuing.CardDesignRetrieveParams;
import com.stripe.param.issuing.CardDesignUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Card Design is a logical grouping of a Card Bundle, card logo, and carrier text that represents
 * a product line.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CardDesign extends ApiResource implements HasId, MetadataStore<CardDesign> {
  /** The card bundle object belonging to this card design. */
  @SerializedName("card_bundle")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<CardBundle> cardBundle;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * A lookup key used to retrieve card designs dynamically from a static string. This may be up to
   * 200 characters.
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
   * <p>Equal to {@code issuing.card_design}.
   */
  @SerializedName("object")
  String object;

  /**
   * Whether this card design is used to create cards when one is not specified.
   *
   * <p>One of {@code default}, or {@code none}.
   */
  @SerializedName("preference")
  String preference;

  /**
   * Whether this card design can be used to create cards.
   *
   * <p>One of {@code active}, {@code inactive}, {@code rejected}, or {@code review}.
   */
  @SerializedName("status")
  String status;

  /** Get ID of expandable {@code cardBundle} object. */
  public String getCardBundle() {
    return (this.cardBundle != null) ? this.cardBundle.getId() : null;
  }

  public void setCardBundle(String id) {
    this.cardBundle = ApiResource.setExpandableFieldId(id, this.cardBundle);
  }

  /** Get expanded {@code cardBundle}. */
  public CardBundle getCardBundleObject() {
    return (this.cardBundle != null) ? this.cardBundle.getExpanded() : null;
  }

  public void setCardBundleObject(CardBundle expandableObject) {
    this.cardBundle = new ExpandableField<CardBundle>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardDesignCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardDesignCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_designs";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CardDesignCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardDesignCollection list(CardDesignListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of card design objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardDesignCollection list(CardDesignListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_designs";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesignCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a card design object. */
  public static CardDesign retrieve(String cardDesign) throws StripeException {
    return retrieve(cardDesign, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a card design object. */
  public static CardDesign retrieve(String cardDesign, RequestOptions options)
      throws StripeException {
    return retrieve(cardDesign, (Map<String, Object>) null, options);
  }

  /** Retrieves a card design object. */
  public static CardDesign retrieve(
      String cardDesign, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_designs/%s", ApiResource.urlEncodeId(cardDesign));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CardDesign.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a card design object. */
  public static CardDesign retrieve(
      String cardDesign, CardDesignRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_designs/%s", ApiResource.urlEncodeId(cardDesign));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }

  /** Updates a card design object. */
  @Override
  public CardDesign update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a card design object. */
  @Override
  public CardDesign update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/card_designs/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CardDesign.class,
            options,
            ApiMode.V1);
  }

  /** Updates a card design object. */
  public CardDesign update(CardDesignUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a card design object. */
  public CardDesign update(CardDesignUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/card_designs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CardDesign.class,
            options,
            ApiMode.V1);
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final CardDesign resource;

    private TestHelpers(CardDesign resource) {
      this.resource = resource;
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code active}.
     */
    public CardDesign activateTestmode() throws StripeException {
      return activateTestmode((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code active}.
     */
    public CardDesign activateTestmode(RequestOptions options) throws StripeException {
      return activateTestmode((Map<String, Object>) null, options);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code active}.
     */
    public CardDesign activateTestmode(Map<String, Object> params) throws StripeException {
      return activateTestmode(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code active}.
     */
    public CardDesign activateTestmode(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/card_designs/%s/status/activate",
              ApiResource.urlEncodeId(this.resource.getId()));
      return resource
          .getResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              params,
              CardDesign.class,
              options,
              ApiMode.V1);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code active}.
     */
    public CardDesign activateTestmode(CardDesignActivateTestmodeParams params)
        throws StripeException {
      return activateTestmode(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code active}.
     */
    public CardDesign activateTestmode(
        CardDesignActivateTestmodeParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/card_designs/%s/status/activate",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      return resource
          .getResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              CardDesign.class,
              options,
              ApiMode.V1);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
     */
    public CardDesign deactivateTestmode() throws StripeException {
      return deactivateTestmode((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
     */
    public CardDesign deactivateTestmode(RequestOptions options) throws StripeException {
      return deactivateTestmode((Map<String, Object>) null, options);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
     */
    public CardDesign deactivateTestmode(Map<String, Object> params) throws StripeException {
      return deactivateTestmode(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
     */
    public CardDesign deactivateTestmode(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/card_designs/%s/status/deactivate",
              ApiResource.urlEncodeId(this.resource.getId()));
      return resource
          .getResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              params,
              CardDesign.class,
              options,
              ApiMode.V1);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
     */
    public CardDesign deactivateTestmode(CardDesignDeactivateTestmodeParams params)
        throws StripeException {
      return deactivateTestmode(params, (RequestOptions) null);
    }

    /**
     * Updates the {@code status} of the specified testmode card design object to {@code inactive}.
     */
    public CardDesign deactivateTestmode(
        CardDesignDeactivateTestmodeParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/card_designs/%s/status/deactivate",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      return resource
          .getResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              CardDesign.class,
              options,
              ApiMode.V1);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(cardBundle, responseGetter);
  }
}
