// File generated from our OpenAPI spec
package com.stripe.model.productcatalog;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Price;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.productcatalog.TrialOfferCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Resource for the TrialOffer API, used to describe a subscription item's trial period settings.
 * Renders a TrialOffer object that describes the price, duration, end_behavior of a trial offer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TrialOffer extends ApiResource implements HasId {
  @SerializedName("duration")
  Duration duration;

  @SerializedName("end_behavior")
  EndBehavior endBehavior;

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

  /** A brief, user-friendly name for the trial offer-for identification purposes. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code product_catalog.trial_offer}.
   */
  @SerializedName("object")
  String object;

  /** The price during the trial offer. */
  @SerializedName("price")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Price> price;

  /** Get ID of expandable {@code price} object. */
  public String getPrice() {
    return (this.price != null) ? this.price.getId() : null;
  }

  public void setPrice(String id) {
    this.price = ApiResource.setExpandableFieldId(id, this.price);
  }

  /** Get expanded {@code price}. */
  public Price getPriceObject() {
    return (this.price != null) ? this.price.getExpanded() : null;
  }

  public void setPriceObject(Price expandableObject) {
    this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
  }

  /** Creates a trial offer. */
  public static TrialOffer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a trial offer. */
  public static TrialOffer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/product_catalog/trial_offers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, TrialOffer.class);
  }

  /** Creates a trial offer. */
  public static TrialOffer create(TrialOfferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a trial offer. */
  public static TrialOffer create(TrialOfferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/product_catalog/trial_offers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TrialOffer.class);
  }

  /**
   * For more details about Duration, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Duration extends StripeObject {
    @SerializedName("relative")
    Relative relative;

    /**
     * The type of trial offer duration.
     *
     * <p>One of {@code relative}, or {@code timestamp}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Relative, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Relative extends StripeObject {
      /** The number of iterations of the price's interval for this trial offer. */
      @SerializedName("iterations")
      Long iterations;
    }
  }

  /**
   * For more details about EndBehavior, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EndBehavior extends StripeObject {
    @SerializedName("transition")
    Transition transition;

    /**
     * The type of behavior when the trial offer ends.
     *
     * <p>Equal to {@code transition}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Transition, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Transition extends StripeObject {
      /** The new price to use at the end of the trial offer period. */
      @SerializedName("price")
      String price;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(duration, responseGetter);
    trySetResponseGetter(endBehavior, responseGetter);
    trySetResponseGetter(price, responseGetter);
  }
}
