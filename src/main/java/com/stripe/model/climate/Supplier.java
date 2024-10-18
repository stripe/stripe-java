// File generated from our OpenAPI spec
package com.stripe.model.climate;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.climate.SupplierListParams;
import com.stripe.param.climate.SupplierRetrieveParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A supplier of carbon removal. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Supplier extends ApiResource implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Link to a webpage to learn more about the supplier. */
  @SerializedName("info_url")
  String infoUrl;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The locations in which this supplier operates. */
  @SerializedName("locations")
  List<Supplier.Location> locations;

  /** Name of this carbon removal supplier. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object’s type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code climate.supplier}.
   */
  @SerializedName("object")
  String object;

  /**
   * The scientific pathway used for carbon removal.
   *
   * <p>One of {@code biomass_carbon_removal_and_storage}, {@code direct_air_capture}, or {@code
   * enhanced_weathering}.
   */
  @SerializedName("removal_pathway")
  String removalPathway;

  /** Lists all available Climate supplier objects. */
  public static SupplierCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all available Climate supplier objects. */
  public static SupplierCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/suppliers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SupplierCollection.class);
  }

  /** Lists all available Climate supplier objects. */
  public static SupplierCollection list(SupplierListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all available Climate supplier objects. */
  public static SupplierCollection list(SupplierListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/suppliers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SupplierCollection.class);
  }

  /** Retrieves a Climate supplier object. */
  public static Supplier retrieve(String supplier) throws StripeException {
    return retrieve(supplier, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Climate supplier object. */
  public static Supplier retrieve(String supplier, RequestOptions options) throws StripeException {
    return retrieve(supplier, (Map<String, Object>) null, options);
  }

  /** Retrieves a Climate supplier object. */
  public static Supplier retrieve(
      String supplier, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/climate/suppliers/%s", ApiResource.urlEncodeId(supplier));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Supplier.class);
  }

  /** Retrieves a Climate supplier object. */
  public static Supplier retrieve(
      String supplier, SupplierRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/suppliers/%s", ApiResource.urlEncodeId(supplier));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Supplier.class);
  }

  /**
   * For more details about Location, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Location extends StripeObject {
    /** The city where the supplier is located. */
    @SerializedName("city")
    String city;

    /** Two-letter ISO code representing the country where the supplier is located. */
    @SerializedName("country")
    String country;

    /** The geographic latitude where the supplier is located. */
    @SerializedName("latitude")
    BigDecimal latitude;

    /** The geographic longitude where the supplier is located. */
    @SerializedName("longitude")
    BigDecimal longitude;

    /** The state/county/province/region where the supplier is located. */
    @SerializedName("region")
    String region;
  }
}
