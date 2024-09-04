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
import com.stripe.param.climate.ProductListParams;
import com.stripe.param.climate.ProductRetrieveParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Climate product represents a type of carbon removal unit available for reservation. You can
 * retrieve it to see the current price and availability.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Product extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Current prices for a metric ton of carbon removal in a currency's smallest unit. */
  @SerializedName("current_prices_per_metric_ton")
  Map<String, Product.CurrentPricesPerMetricTon> currentPricesPerMetricTon;

  /** The year in which the carbon removal is expected to be delivered. */
  @SerializedName("delivery_year")
  Long deliveryYear;

  /**
   * Unique identifier for the object. For convenience, Climate product IDs are human-readable
   * strings that start with {@code climsku_}. See <a
   * href="https://stripe.com/docs/climate/orders/carbon-removal-inventory">carbon removal
   * inventory</a> for a list of available carbon removal products.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The quantity of metric tons available for reservation. */
  @SerializedName("metric_tons_available")
  BigDecimal metricTonsAvailable;

  /** The Climate product's name. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code climate.product}.
   */
  @SerializedName("object")
  String object;

  /** The carbon removal suppliers that fulfill orders for this Climate product. */
  @SerializedName("suppliers")
  List<Supplier> suppliers;

  /** Lists all available Climate product objects. */
  public static ProductCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all available Climate product objects. */
  public static ProductCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/products";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ProductCollection.class);
  }

  /** Lists all available Climate product objects. */
  public static ProductCollection list(ProductListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all available Climate product objects. */
  public static ProductCollection list(ProductListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/products";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ProductCollection.class);
  }

  /** Retrieves the details of a Climate product with the given ID. */
  public static Product retrieve(String product) throws StripeException {
    return retrieve(product, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Climate product with the given ID. */
  public static Product retrieve(String product, RequestOptions options) throws StripeException {
    return retrieve(product, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Climate product with the given ID. */
  public static Product retrieve(String product, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/products/%s", ApiResource.urlEncodeId(product));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Product.class);
  }

  /** Retrieves the details of a Climate product with the given ID. */
  public static Product retrieve(
      String product, ProductRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/climate/products/%s", ApiResource.urlEncodeId(product));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Product.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrentPricesPerMetricTon extends StripeObject {
    /** Fees for one metric ton of carbon removal in the currency's smallest unit. */
    @SerializedName("amount_fees")
    Long amountFees;

    /**
     * Subtotal for one metric ton of carbon removal (excluding fees) in the currency's smallest
     * unit.
     */
    @SerializedName("amount_subtotal")
    Long amountSubtotal;

    /**
     * Total for one metric ton of carbon removal (including fees) in the currency's smallest unit.
     */
    @SerializedName("amount_total")
    Long amountTotal;
  }
}
