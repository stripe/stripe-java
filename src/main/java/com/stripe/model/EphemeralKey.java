// Stub for EphemeralKey — referenced by EphemeralKeyDeserializer and ApiResource
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EphemeralKey extends ApiResource implements HasId {
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("secret")
  String secret;

  @SerializedName("created")
  Long created;

  @SerializedName("expires")
  Long expires;

  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("object")
  String object;

  String rawJson;
}
