// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardBundleListParams;
import com.stripe.param.issuing.CardBundleRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Card Bundle represents the bundle of physical items - card stock, carrier letter, and envelope
 * - that is shipped to a cardholder when you create a physical card.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CardBundle extends ApiResource implements HasId {
  @SerializedName("features")
  Features features;

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

  /** Friendly display name. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.card_bundle}.
   */
  @SerializedName("object")
  String object;

  /**
   * Whether this card bundle can be used to create cards.
   *
   * <p>One of {@code active}, {@code inactive}, or {@code review}.
   */
  @SerializedName("status")
  String status;

  /**
   * Whether this card bundle is a standard Stripe offering or custom-made for you.
   *
   * <p>One of {@code custom}, or {@code standard}.
   */
  @SerializedName("type")
  String type;

  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardBundleCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardBundleCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_bundles";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CardBundleCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardBundleCollection list(CardBundleListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of card bundle objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.
   */
  public static CardBundleCollection list(CardBundleListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/card_bundles";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardBundleCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a card bundle object. */
  public static CardBundle retrieve(String cardBundle) throws StripeException {
    return retrieve(cardBundle, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a card bundle object. */
  public static CardBundle retrieve(String cardBundle, RequestOptions options)
      throws StripeException {
    return retrieve(cardBundle, (Map<String, Object>) null, options);
  }

  /** Retrieves a card bundle object. */
  public static CardBundle retrieve(
      String cardBundle, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_bundles/%s", ApiResource.urlEncodeId(cardBundle));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CardBundle.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a card bundle object. */
  public static CardBundle retrieve(
      String cardBundle, CardBundleRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/card_bundles/%s", ApiResource.urlEncodeId(cardBundle));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardBundle.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Features extends StripeObject {
    /**
     * The policy for how to use card logo images in a card design with this card bundle.
     *
     * <p>One of {@code optional}, {@code required}, or {@code unsupported}.
     */
    @SerializedName("card_logo")
    String cardLogo;

    /**
     * The policy for how to use carrier letter text in a card design with this card bundle.
     *
     * <p>One of {@code optional}, {@code required}, or {@code unsupported}.
     */
    @SerializedName("carrier_text")
    String carrierText;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(features, responseGetter);
  }
}
