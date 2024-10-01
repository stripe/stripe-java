package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ThinEventRelatedObject {
  @SerializedName("id")
  public String id;

  @SerializedName("type")
  public String type;

  @SerializedName("url")
  public String url;
}
