// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionCancelParams extends ApiRequestParams {
  /** Details about why this subscription was cancelled. */
  @SerializedName("cancellation_details")
  CancellationDetails cancellationDetails;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending
   * proration invoice items. Defaults to {@code false}.
   */
  @SerializedName("invoice_now")
  Boolean invoiceNow;

  /**
   * Will generate a proration invoice item that credits remaining unused time until the
   * subscription period end. Defaults to {@code false}.
   */
  @SerializedName("prorate")
  Boolean prorate;

  private SubscriptionCancelParams(
      CancellationDetails cancellationDetails,
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean invoiceNow,
      Boolean prorate) {
    this.cancellationDetails = cancellationDetails;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceNow = invoiceNow;
    this.prorate = prorate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CancellationDetails cancellationDetails;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean invoiceNow;

    private Boolean prorate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionCancelParams build() {
      return new SubscriptionCancelParams(
          this.cancellationDetails, this.expand, this.extraParams, this.invoiceNow, this.prorate);
    }

    /** Details about why this subscription was cancelled. */
    public Builder setCancellationDetails(
        SubscriptionCancelParams.CancellationDetails cancellationDetails) {
      this.cancellationDetails = cancellationDetails;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionCancelParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionCancelParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionCancelParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionCancelParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending
     * proration invoice items. Defaults to {@code false}.
     */
    public Builder setInvoiceNow(Boolean invoiceNow) {
      this.invoiceNow = invoiceNow;
      return this;
    }

    /**
     * Will generate a proration invoice item that credits remaining unused time until the
     * subscription period end. Defaults to {@code false}.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CancellationDetails {
    /**
     * Additional comments about why the user canceled the subscription, if the subscription was
     * canceled explicitly by the user.
     */
    @SerializedName("comment")
    Object comment;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The customer submitted reason for why they canceled, if the subscription was canceled
     * explicitly by the user.
     */
    @SerializedName("feedback")
    ApiRequestParams.EnumParam feedback;

    private CancellationDetails(
        Object comment, Map<String, Object> extraParams, ApiRequestParams.EnumParam feedback) {
      this.comment = comment;
      this.extraParams = extraParams;
      this.feedback = feedback;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object comment;

      private Map<String, Object> extraParams;

      private ApiRequestParams.EnumParam feedback;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionCancelParams.CancellationDetails build() {
        return new SubscriptionCancelParams.CancellationDetails(
            this.comment, this.extraParams, this.feedback);
      }

      /**
       * Additional comments about why the user canceled the subscription, if the subscription was
       * canceled explicitly by the user.
       */
      public Builder setComment(String comment) {
        this.comment = comment;
        return this;
      }

      /**
       * Additional comments about why the user canceled the subscription, if the subscription was
       * canceled explicitly by the user.
       */
      public Builder setComment(EmptyParam comment) {
        this.comment = comment;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionCancelParams.CancellationDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionCancelParams.CancellationDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The customer submitted reason for why they canceled, if the subscription was canceled
       * explicitly by the user.
       */
      public Builder setFeedback(SubscriptionCancelParams.CancellationDetails.Feedback feedback) {
        this.feedback = feedback;
        return this;
      }

      /**
       * The customer submitted reason for why they canceled, if the subscription was canceled
       * explicitly by the user.
       */
      public Builder setFeedback(EmptyParam feedback) {
        this.feedback = feedback;
        return this;
      }
    }

    public enum Feedback implements ApiRequestParams.EnumParam {
      @SerializedName("customer_service")
      CUSTOMER_SERVICE("customer_service"),

      @SerializedName("low_quality")
      LOW_QUALITY("low_quality"),

      @SerializedName("missing_features")
      MISSING_FEATURES("missing_features"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("switched_service")
      SWITCHED_SERVICE("switched_service"),

      @SerializedName("too_complex")
      TOO_COMPLEX("too_complex"),

      @SerializedName("too_expensive")
      TOO_EXPENSIVE("too_expensive"),

      @SerializedName("unused")
      UNUSED("unused");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Feedback(String value) {
        this.value = value;
      }
    }
  }
}
