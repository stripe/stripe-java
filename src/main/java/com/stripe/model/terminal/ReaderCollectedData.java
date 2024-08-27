// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ReaderCollectedDataRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Returns data collected by Terminal readers. This data is only stored for 24 hours. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReaderCollectedData extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

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

  /** The magstripe data collected by the reader. */
  @SerializedName("magstripe")
  Magstripe magstripe;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code terminal.reader_collected_data}.
   */
  @SerializedName("object")
  String object;

  /**
   * The type of data collected by the reader.
   *
   * <p>Equal to {@code magstripe}.
   */
  @SerializedName("type")
  String type;

  /** Retrieve data collected using Reader hardware. */
  public static ReaderCollectedData retrieve(String readerCollectedData) throws StripeException {
    return retrieve(readerCollectedData, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve data collected using Reader hardware. */
  public static ReaderCollectedData retrieve(String readerCollectedData, RequestOptions options)
      throws StripeException {
    return retrieve(readerCollectedData, (Map<String, Object>) null, options);
  }

  /** Retrieve data collected using Reader hardware. */
  public static ReaderCollectedData retrieve(
      String readerCollectedData, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/reader_collected_data/%s", ApiResource.urlEncodeId(readerCollectedData));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ReaderCollectedData.class);
  }

  /** Retrieve data collected using Reader hardware. */
  public static ReaderCollectedData retrieve(
      String readerCollectedData, ReaderCollectedDataRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/reader_collected_data/%s", ApiResource.urlEncodeId(readerCollectedData));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ReaderCollectedData.class);
  }

  /** Represents magstripe data collected by the reader. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Magstripe extends StripeObject {
    /** The raw magstripe data collected by the reader. */
    @SerializedName("data")
    String data;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(magstripe, responseGetter);
  }
}
