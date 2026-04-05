package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeActiveObject;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.StripeResponseGetter;
import java.lang.reflect.Type;
import lombok.Getter;
import lombok.Setter;

/**
 * A typed object reference with wire shape {@code {type: string, id: string, url: string}}. Call
 * {@link #fetch()} to retrieve the full object from the API.
 *
 * @param <T> the type of the referenced Stripe object
 */
@Getter
public class Ref<T extends StripeObject> implements StripeActiveObject {
  /** The type of the referenced object (e.g. {@code "v2.billing.meter_event"}). */
  @SerializedName("type")
  String type;

  /** The unique identifier of the referenced object. */
  @SerializedName("id")
  String id;

  /** The relative URL of the referenced object (e.g. {@code "/v2/billing/meter_events/mtr_123"}). */
  @SerializedName("url")
  String url;

  /** The response getter used to fetch the referenced object. Auto-injected during deserialization. */
  transient StripeResponseGetter responseGetter;

  /** The concrete type of {@code T}, captured at deserialization time to work around type erasure. */
  @Setter private transient Type targetType;

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  /**
   * Fetches the full object from the Stripe API by issuing a GET to {@link #getUrl()}.
   *
   * @return the deserialized Stripe object
   * @throws StripeException if the request fails
   * @throws IllegalStateException if no responseGetter has been set on this reference
   */
  public T fetch() throws StripeException {
    if (responseGetter == null) {
      throw new IllegalStateException(
          "Cannot fetch Ref without a StripeResponseGetter. Ensure this object was obtained via"
              + " deserialization.");
    }

    return responseGetter.request(
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, url, null, null),
        targetType);
  }
}
