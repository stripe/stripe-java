// Stub — provides v1 Event type referenced by Webhook, StripeClient, and deserializers.
package com.stripe.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiResource;
import com.stripe.net.StripeResponseGetter;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends ApiResource implements HasId {
  @SerializedName("account")
  String account;

  @SerializedName("api_version")
  String apiVersion;

  @SerializedName("context")
  String context;

  @SerializedName("created")
  Long created;

  @SerializedName("data")
  Data data;

  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("object")
  String object;

  @SerializedName("pending_webhooks")
  Long pendingWebhooks;

  @SerializedName("request")
  Request request;

  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Data extends StripeObject implements StripeActiveObject {
    @SerializedName("previous_attributes")
    Map<String, Object> previousAttributes;

    @SerializedName("object")
    JsonObject object;

    private transient StripeResponseGetter responseGetter;

    @Deprecated
    public StripeObject getObject() {
      return StripeObject.deserializeStripeObject(object, this.responseGetter, ApiMode.V1);
    }

    @Override
    public void setResponseGetter(StripeResponseGetter responseGetter) {
      this.responseGetter = responseGetter;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Request extends StripeObject implements HasId {
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    @SerializedName("idempotency_key")
    String idempotencyKey;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(data, responseGetter);
    trySetResponseGetter(request, responseGetter);
  }
}
