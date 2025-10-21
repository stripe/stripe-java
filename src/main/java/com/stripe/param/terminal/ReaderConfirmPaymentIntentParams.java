// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ReaderConfirmPaymentIntentParams extends ApiRequestParams {
  /** Configuration overrides for this confirmation, such as surcharge settings and return URL. */
  @SerializedName("confirm_config")
  ConfirmConfig confirmConfig;

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

  /** <strong>Required.</strong> The ID of the PaymentIntent to confirm. */
  @SerializedName("payment_intent")
  String paymentIntent;

  private ReaderConfirmPaymentIntentParams(
      ConfirmConfig confirmConfig,
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentIntent) {
    this.confirmConfig = confirmConfig;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentIntent = paymentIntent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private ConfirmConfig confirmConfig;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentIntent;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderConfirmPaymentIntentParams build() {
      return new ReaderConfirmPaymentIntentParams(
          this.confirmConfig, this.expand, this.extraParams, this.paymentIntent);
    }

    /** Configuration overrides for this confirmation, such as surcharge settings and return URL. */
    public Builder setConfirmConfig(ReaderConfirmPaymentIntentParams.ConfirmConfig confirmConfig) {
      this.confirmConfig = confirmConfig;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderConfirmPaymentIntentParams#expand} for the field documentation.
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
     * ReaderConfirmPaymentIntentParams#expand} for the field documentation.
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
     * ReaderConfirmPaymentIntentParams#extraParams} for the field documentation.
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
     * See {@link ReaderConfirmPaymentIntentParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The ID of the PaymentIntent to confirm. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ConfirmConfig {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme.
     */
    @SerializedName("return_url")
    String returnUrl;

    private ConfirmConfig(Map<String, Object> extraParams, String returnUrl) {
      this.extraParams = extraParams;
      this.returnUrl = returnUrl;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String returnUrl;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderConfirmPaymentIntentParams.ConfirmConfig build() {
        return new ReaderConfirmPaymentIntentParams.ConfirmConfig(this.extraParams, this.returnUrl);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderConfirmPaymentIntentParams.ConfirmConfig#extraParams} for the field documentation.
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
       * See {@link ReaderConfirmPaymentIntentParams.ConfirmConfig#extraParams} for the field
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
       * The URL to redirect your customer back to after they authenticate or cancel their payment
       * on the payment method's app or site. If you'd prefer to redirect to a mobile application,
       * you can alternatively supply an application URI scheme.
       */
      public Builder setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
      }
    }
  }
}
