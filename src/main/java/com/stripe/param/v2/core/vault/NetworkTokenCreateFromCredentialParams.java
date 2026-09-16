// File generated from our OpenAPI spec
package com.stripe.param.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class NetworkTokenCreateFromCredentialParams extends ApiRequestParams {
  /** The existing Stripe card reference to provision or resolve. */
  @SerializedName("card")
  Card card;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Private preview supports card only. */
  @SerializedName("type")
  Type type;

  private NetworkTokenCreateFromCredentialParams(
      Card card, Map<String, Object> extraParams, Type type) {
    this.card = card;
    this.extraParams = extraParams;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Card card;

    private Map<String, Object> extraParams;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public NetworkTokenCreateFromCredentialParams build() {
      return new NetworkTokenCreateFromCredentialParams(this.card, this.extraParams, this.type);
    }

    /** The existing Stripe card reference to provision or resolve. */
    public Builder setCard(NetworkTokenCreateFromCredentialParams.Card card) {
      this.card = card;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * NetworkTokenCreateFromCredentialParams#extraParams} for the field documentation.
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
     * See {@link NetworkTokenCreateFromCredentialParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Private preview supports card only. */
    public Builder setType(NetworkTokenCreateFromCredentialParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Card {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The optional origin attestation for the referenced card. */
    @SerializedName("origin")
    Origin origin;

    /** <strong>Required.</strong> A supported v2 Card ID or v1 PaymentMethod ID of type card. */
    @SerializedName("reference")
    String reference;

    private Card(Map<String, Object> extraParams, Origin origin, String reference) {
      this.extraParams = extraParams;
      this.origin = origin;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Origin origin;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public NetworkTokenCreateFromCredentialParams.Card build() {
        return new NetworkTokenCreateFromCredentialParams.Card(
            this.extraParams, this.origin, this.reference);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * NetworkTokenCreateFromCredentialParams.Card#extraParams} for the field documentation.
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
       * See {@link NetworkTokenCreateFromCredentialParams.Card#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The optional origin attestation for the referenced card. */
      public Builder setOrigin(NetworkTokenCreateFromCredentialParams.Card.Origin origin) {
        this.origin = origin;
        return this;
      }

      /** <strong>Required.</strong> A supported v2 Card ID or v1 PaymentMethod ID of type card. */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }

    public enum Origin implements ApiRequestParams.EnumParam {
      @SerializedName("card_on_file")
      CARD_ON_FILE("card_on_file");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Origin(String value) {
        this.value = value;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("card")
    CARD("card");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
