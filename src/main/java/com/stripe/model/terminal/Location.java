// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.LocationCreateParams;
import com.stripe.param.terminal.LocationListParams;
import com.stripe.param.terminal.LocationRetrieveParams;
import com.stripe.param.terminal.LocationUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Location represents a grouping of readers.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/terminal/fleet/locations">Fleet management</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Location extends ApiResource implements HasId, MetadataStore<Location> {
  @SerializedName("address")
  Address address;

  @SerializedName("address_kana")
  AddressKana addressKana;

  @SerializedName("address_kanji")
  AddressKanji addressKanji;

  /** The ID of a configuration that will be used to customize all readers in this location. */
  @SerializedName("configuration_overrides")
  String configurationOverrides;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** The display name of the location. */
  @SerializedName("display_name")
  String displayName;

  /** The Kana variation of the display name of the location. */
  @SerializedName("display_name_kana")
  String displayNameKana;

  /** The Kanji variation of the display name of the location. */
  @SerializedName("display_name_kanji")
  String displayNameKanji;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code terminal.location}.
   */
  @SerializedName("object")
  String object;

  /** The phone number of the location. */
  @SerializedName("phone")
  String phone;

  /**
   * Creates a new {@code Location} object. For further details, including which address fields are
   * required in each country, see the <a
   * href="https://stripe.com/docs/terminal/fleet/locations">Manage locations</a> guide.
   */
  public static Location create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new {@code Location} object. For further details, including which address fields are
   * required in each country, see the <a
   * href="https://stripe.com/docs/terminal/fleet/locations">Manage locations</a> guide.
   */
  public static Location create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/locations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  /**
   * Creates a new {@code Location} object. For further details, including which address fields are
   * required in each country, see the <a
   * href="https://stripe.com/docs/terminal/fleet/locations">Manage locations</a> guide.
   */
  public static Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new {@code Location} object. For further details, including which address fields are
   * required in each country, see the <a
   * href="https://stripe.com/docs/terminal/fleet/locations">Manage locations</a> guide.
   */
  public static Location create(LocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/locations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  /** Deletes a {@code Location} object. */
  public Location delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a {@code Location} object. */
  public Location delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a {@code Location} object. */
  public Location delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a {@code Location} object. */
  public Location delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Location.class);
  }

  /** Returns a list of {@code Location} objects. */
  public static LocationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of {@code Location} objects. */
  public static LocationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/locations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, LocationCollection.class);
  }

  /** Returns a list of {@code Location} objects. */
  public static LocationCollection list(LocationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of {@code Location} objects. */
  public static LocationCollection list(LocationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/locations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, LocationCollection.class);
  }

  /** Retrieves a {@code Location} object. */
  public static Location retrieve(String location) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code Location} object. */
  public static Location retrieve(String location, RequestOptions options) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code Location} object. */
  public static Location retrieve(
      String location, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  /** Retrieves a {@code Location} object. */
  public static Location retrieve(
      String location, LocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  @Override
  public Location update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  @Override
  public Location update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Location.class);
  }

  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(LocationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(LocationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Location.class);
  }

  /**
   * For more details about AddressKana, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AddressKana extends StripeObject {
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

  /**
   * For more details about AddressKanji, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AddressKanji extends StripeObject {
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(address, responseGetter);
    trySetResponseGetter(addressKana, responseGetter);
    trySetResponseGetter(addressKanji, responseGetter);
  }
}
