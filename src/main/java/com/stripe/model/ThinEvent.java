package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.time.Instant;
import lombok.Getter;

@Getter
public class ThinEvent {
  @SerializedName("id")
  public String id;

  @SerializedName("type")
  public String type;

  @SerializedName("created")
  public Instant created;

  // this is optional, and may be null
  @SerializedName("context")
  public String context;

  // this is optional, and may be null
  @SerializedName("related_object")
  public ThinEventRelatedObject relatedObject;
}
