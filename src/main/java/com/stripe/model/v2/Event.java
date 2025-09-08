// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeActiveObject;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends StripeObject implements HasId, StripeActiveObject {
  /** Authentication context needed to fetch the event or related object. */
  @SerializedName("context")
  String context;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the event. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.event}.
   */
  @SerializedName("object")
  String object;

  /** Reason for the event. */
  @SerializedName("reason")
  Reason reason;

  /** The type of the event. */
  @SerializedName("type")
  String type;

  StripeResponseGetter responseGetter;

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /** Retrieves the object associated with the event. */
  protected StripeObject fetchRelatedObject(RelatedObject relatedObject) throws StripeException {
    if (relatedObject == null) {
      return null;
    }
    if (relatedObject.getUrl() == null) {
      return null;
    }

    Class<? extends StripeObject> objectClass =
        EventDataClassLookup.classLookup.get(relatedObject.getType());
    if (objectClass == null) {
      objectClass = StripeRawJsonObject.class;
    }

    RequestOptions opts = null;

    if (context != null) {
      opts = new RequestOptions.RequestOptionsBuilder().setStripeAccount(context).build();
    }

    return this.responseGetter.request(
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, relatedObject.getUrl(), null, opts),
        objectClass);
  }

  /**
   * Returns an StripeEvent instance using the provided JSON payload. Throws a JsonSyntaxException
   * if the payload is not valid JSON.
   *
   * @param payload the payload sent by Stripe.
   * @return the StripeEvent instance
   */
  public static Event parse(String payload) {
    return ApiResource.GSON.fromJson(payload, Event.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RelatedObject extends StripeObject implements HasId {
    /** Unique identifier for the object relevant to the event. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Type of the object relevant to the event. */
    @SerializedName("type")
    String type;

    /** Type of the object relevant to the event. */
    @SerializedName("url")
    String url;
  }

  /**
   * For more details about Reason, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reason extends StripeObject {
    /** Information on the API request that instigated the event. */
    @SerializedName("request")
    Request request;

    /**
     * Event reason type.
     *
     * <p>Equal to {@code request}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Request, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Request extends StripeObject implements HasId {
      /** ID of the API request that caused the event. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The idempotency key transmitted during the request. */
      @SerializedName("idempotency_key")
      String idempotencyKey;
    }
  }
}
