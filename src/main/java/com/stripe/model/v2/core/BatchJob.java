// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BatchJob extends StripeObject implements HasId {
  /** Unique identifier for the batch job. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code v2.core.batch_job}.
   */
  @SerializedName("object")
  String object;

  /** The URL to upload the JSONL file to. */
  @SerializedName("url")
  String url;
}
