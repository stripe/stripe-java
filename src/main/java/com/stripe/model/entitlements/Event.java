// File generated from our OpenAPI spec
package com.stripe.model.entitlements;

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
import com.stripe.param.entitlements.EventCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An entitlement event either grants or revokes an entitlement to a feature for a customer. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends ApiResource implements HasId {
  /** The customer that is being granted or revoked entitlement to/from a feature. */
  @SerializedName("customer")
  String customer;

  /** The feature that the customer is being granted/revoked entitlement to/from. */
  @SerializedName("feature")
  String feature;

  /** Contains information about type=grant entitlement event. */
  @SerializedName("grant")
  Grant grant;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code entitlements.event}.
   */
  @SerializedName("object")
  String object;

  /**
   * Contains information about entitlement events relating to features with type=quantity. Required
   * when the feature has type=quantity.
   */
  @SerializedName("quantity")
  Quantity quantity;

  /** Contains information about type=revoke entitlement event. */
  @SerializedName("revoke")
  Revoke revoke;

  /**
   * Whether the event is a grant or revocation of the feature.
   *
   * <p>One of {@code grant}, or {@code revoke}.
   */
  @SerializedName("type")
  String type;

  /**
   * Create an entitlement event manually, outside of the entitlement events automatically created
   * by Stripe lifecycle events.
   */
  public static Event create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an entitlement event manually, outside of the entitlement events automatically created
   * by Stripe lifecycle events.
   */
  public static Event create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/events";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Event.class);
  }

  /**
   * Create an entitlement event manually, outside of the entitlement events automatically created
   * by Stripe lifecycle events.
   */
  public static Event create(EventCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an entitlement event manually, outside of the entitlement events automatically created
   * by Stripe lifecycle events.
   */
  public static Event create(EventCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/events";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Event.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Grant extends StripeObject {
    /**
     * When manually creating a grant entitlement event, you can make it a temporary grant by
     * setting it to expire.
     */
    @SerializedName("expires_at")
    Long expiresAt;

    /**
     * Who/what created this grant entitlement event.
     *
     * <p>One of {@code subscription_item}, or {@code user}.
     */
    @SerializedName("granted_by")
    String grantedBy;

    /**
     * If this entitlement event was created by a subscription_item, this will contains information
     * about the subscription_item.
     */
    @SerializedName("subscription_item")
    SubscriptionItem subscriptionItem;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionItem extends StripeObject {
      /** The subscription line item quantity. */
      @SerializedName("item_quantity")
      Long itemQuantity;

      /** The price for the product that contains the feature for this entitlement event. */
      @SerializedName("price")
      String price;

      /** The product that contains the feature for this entitlement event. */
      @SerializedName("product")
      String product;

      /** The subscription that created this entitlement event. */
      @SerializedName("subscription")
      String subscription;

      /** The subscription item that created this entitlement event. */
      @SerializedName("subscription_item")
      String subscriptionItem;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Quantity extends StripeObject {
    /**
     * When granting or revoking an entitlement to a type=quantity feature, you must specify the
     * number of units you're granting/revoking. When the entitlement event type=grant, this number
     * increments the total quantity available to the customer, and when type=revoke it decrements
     * the total quantity available to the customer.
     */
    @SerializedName("units")
    Long units;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Revoke extends StripeObject {
    /**
     * A revoke entitlement event will always expire at the same time as the grant it is revoking.
     */
    @SerializedName("expires_at")
    Long expiresAt;

    /**
     * Who/what created this revoke entitlement event.
     *
     * <p>One of {@code subscription_item}, or {@code user}.
     */
    @SerializedName("revoked_by")
    String revokedBy;

    /**
     * If this entitlement event was created by a subscription_item, this will contains information
     * about the subscription_item.
     */
    @SerializedName("subscription_item")
    SubscriptionItem subscriptionItem;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionItem extends StripeObject {
      /** The subscription line item quantity. */
      @SerializedName("item_quantity")
      Long itemQuantity;

      /** The price for the product that contains the feature for this entitlement event. */
      @SerializedName("price")
      String price;

      /** The product that contains the feature for this entitlement event. */
      @SerializedName("product")
      String product;

      /** The subscription that created this entitlement event. */
      @SerializedName("subscription")
      String subscription;

      /** The subscription item that created this entitlement event. */
      @SerializedName("subscription_item")
      String subscriptionItem;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(grant, responseGetter);
    trySetResponseGetter(quantity, responseGetter);
    trySetResponseGetter(revoke, responseGetter);
  }
}
