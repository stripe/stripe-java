package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiResource.RequestMethod;
import com.stripe.net.StripeResponse;
import lombok.Getter;

/**
 * A typed object reference with wire shape {@code {type: string, id: string, url: string}}. Call
 * {@link #fetch()} to retrieve the full object from the API.
 *
 * @param <T> the type of the referenced Stripe object
 */
@Getter
public class Ref<T extends StripeObject> {
  /** The type of the referenced object (e.g. {@code "v2.billing.meter_event"}). */
  @SerializedName("type")
  String type;

  /** The unique identifier of the referenced object. */
  @SerializedName("id")
  String id;

  /** The relative URL of the referenced object (e.g. {@code "/v2/billing/meter_events/mtr_123"}). */
  @SerializedName("url")
  String url;

  /** The client used to fetch the referenced object. Set externally after deserialization. */
  transient StripeClient client;

  /**
   * Fetches the full object from the Stripe API by issuing a GET to {@link #getUrl()}.
   *
   * @return the deserialized Stripe object
   * @throws StripeException if the request fails
   * @throws IllegalStateException if no client has been set on this reference
   */
  @SuppressWarnings("unchecked")
  public T fetch() throws StripeException {
    if (client == null) {
      throw new IllegalStateException(
          "Cannot fetch Ref without a StripeClient. Set the client field before calling fetch().");
    }

    StripeResponse response = client.rawRequest(RequestMethod.GET, url, null);
    return (T) client.deserialize(response.body(), ApiMode.getMode(url));
  }
}
