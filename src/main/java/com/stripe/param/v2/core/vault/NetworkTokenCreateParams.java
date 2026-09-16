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
public class NetworkTokenCreateParams extends ApiRequestParams {
  /** Raw card values used to provision the network token. */
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

  private NetworkTokenCreateParams(Card card, Map<String, Object> extraParams, Type type) {
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
    public NetworkTokenCreateParams build() {
      return new NetworkTokenCreateParams(this.card, this.extraParams, this.type);
    }

    /** Raw card values used to provision the network token. */
    public Builder setCard(NetworkTokenCreateParams.Card card) {
      this.card = card;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * NetworkTokenCreateParams#extraParams} for the field documentation.
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
     * See {@link NetworkTokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Private preview supports card only. */
    public Builder setType(NetworkTokenCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Card {
    /** <strong>Required.</strong> The two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    String expMonth;

    /** <strong>Required.</strong> The four-digit number representing the card's expiration year. */
    @SerializedName("exp_year")
    String expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The card number. */
    @SerializedName("number")
    String number;

    /** The optional origin attestation for the card. */
    @SerializedName("origin")
    Origin origin;

    /**
     * Optional owner contact details used only when a network requires them for raw-card
     * tokenization.
     */
    @SerializedName("owner_details")
    OwnerDetails ownerDetails;

    private Card(
        String expMonth,
        String expYear,
        Map<String, Object> extraParams,
        String number,
        Origin origin,
        OwnerDetails ownerDetails) {
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.number = number;
      this.origin = origin;
      this.ownerDetails = ownerDetails;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String expMonth;

      private String expYear;

      private Map<String, Object> extraParams;

      private String number;

      private Origin origin;

      private OwnerDetails ownerDetails;

      /** Finalize and obtain parameter instance from this builder. */
      public NetworkTokenCreateParams.Card build() {
        return new NetworkTokenCreateParams.Card(
            this.expMonth,
            this.expYear,
            this.extraParams,
            this.number,
            this.origin,
            this.ownerDetails);
      }

      /**
       * <strong>Required.</strong> The two-digit number representing the card's expiration month.
       */
      public Builder setExpMonth(String expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      /**
       * <strong>Required.</strong> The four-digit number representing the card's expiration year.
       */
      public Builder setExpYear(String expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * NetworkTokenCreateParams.Card#extraParams} for the field documentation.
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
       * See {@link NetworkTokenCreateParams.Card#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The card number. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }

      /** The optional origin attestation for the card. */
      public Builder setOrigin(NetworkTokenCreateParams.Card.Origin origin) {
        this.origin = origin;
        return this;
      }

      /**
       * Optional owner contact details used only when a network requires them for raw-card
       * tokenization.
       */
      public Builder setOwnerDetails(NetworkTokenCreateParams.Card.OwnerDetails ownerDetails) {
        this.ownerDetails = ownerDetails;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OwnerDetails {
      /** Cardholder email address. */
      @SerializedName("email")
      String email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Cardholder phone number in international format, for example +15555550123. */
      @SerializedName("phone")
      String phone;

      private OwnerDetails(String email, Map<String, Object> extraParams, String phone) {
        this.email = email;
        this.extraParams = extraParams;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String email;

        private Map<String, Object> extraParams;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public NetworkTokenCreateParams.Card.OwnerDetails build() {
          return new NetworkTokenCreateParams.Card.OwnerDetails(
              this.email, this.extraParams, this.phone);
        }

        /** Cardholder email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link NetworkTokenCreateParams.Card.OwnerDetails#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link NetworkTokenCreateParams.Card.OwnerDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Cardholder phone number in international format, for example +15555550123. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
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
