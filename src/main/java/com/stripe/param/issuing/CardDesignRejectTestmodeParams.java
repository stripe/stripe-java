// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CardDesignRejectTestmodeParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The reason(s) the card design was rejected. */
  @SerializedName("rejection_reasons")
  RejectionReasons rejectionReasons;

  private CardDesignRejectTestmodeParams(
      List<String> expand, Map<String, Object> extraParams, RejectionReasons rejectionReasons) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.rejectionReasons = rejectionReasons;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private RejectionReasons rejectionReasons;

    /** Finalize and obtain parameter instance from this builder. */
    public CardDesignRejectTestmodeParams build() {
      return new CardDesignRejectTestmodeParams(
          this.expand, this.extraParams, this.rejectionReasons);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardDesignRejectTestmodeParams#expand} for the field documentation.
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
     * CardDesignRejectTestmodeParams#expand} for the field documentation.
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
     * CardDesignRejectTestmodeParams#extraParams} for the field documentation.
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
     * See {@link CardDesignRejectTestmodeParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The reason(s) the card design was rejected. */
    public Builder setRejectionReasons(
        CardDesignRejectTestmodeParams.RejectionReasons rejectionReasons) {
      this.rejectionReasons = rejectionReasons;
      return this;
    }
  }

  @Getter
  public static class RejectionReasons {
    /** The reason(s) the card logo was rejected. */
    @SerializedName("card_logo")
    List<CardDesignRejectTestmodeParams.RejectionReasons.CardLogo> cardLogo;

    /** The reason(s) the carrier text was rejected. */
    @SerializedName("carrier_text")
    List<CardDesignRejectTestmodeParams.RejectionReasons.CarrierText> carrierText;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RejectionReasons(
        List<CardDesignRejectTestmodeParams.RejectionReasons.CardLogo> cardLogo,
        List<CardDesignRejectTestmodeParams.RejectionReasons.CarrierText> carrierText,
        Map<String, Object> extraParams) {
      this.cardLogo = cardLogo;
      this.carrierText = carrierText;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<CardDesignRejectTestmodeParams.RejectionReasons.CardLogo> cardLogo;

      private List<CardDesignRejectTestmodeParams.RejectionReasons.CarrierText> carrierText;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CardDesignRejectTestmodeParams.RejectionReasons build() {
        return new CardDesignRejectTestmodeParams.RejectionReasons(
            this.cardLogo, this.carrierText, this.extraParams);
      }

      /**
       * Add an element to `cardLogo` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * CardDesignRejectTestmodeParams.RejectionReasons#cardLogo} for the field documentation.
       */
      public Builder addCardLogo(CardDesignRejectTestmodeParams.RejectionReasons.CardLogo element) {
        if (this.cardLogo == null) {
          this.cardLogo = new ArrayList<>();
        }
        this.cardLogo.add(element);
        return this;
      }

      /**
       * Add all elements to `cardLogo` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * CardDesignRejectTestmodeParams.RejectionReasons#cardLogo} for the field documentation.
       */
      public Builder addAllCardLogo(
          List<CardDesignRejectTestmodeParams.RejectionReasons.CardLogo> elements) {
        if (this.cardLogo == null) {
          this.cardLogo = new ArrayList<>();
        }
        this.cardLogo.addAll(elements);
        return this;
      }

      /**
       * Add an element to `carrierText` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CardDesignRejectTestmodeParams.RejectionReasons#carrierText} for the field documentation.
       */
      public Builder addCarrierText(
          CardDesignRejectTestmodeParams.RejectionReasons.CarrierText element) {
        if (this.carrierText == null) {
          this.carrierText = new ArrayList<>();
        }
        this.carrierText.add(element);
        return this;
      }

      /**
       * Add all elements to `carrierText` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CardDesignRejectTestmodeParams.RejectionReasons#carrierText} for the field documentation.
       */
      public Builder addAllCarrierText(
          List<CardDesignRejectTestmodeParams.RejectionReasons.CarrierText> elements) {
        if (this.carrierText == null) {
          this.carrierText = new ArrayList<>();
        }
        this.carrierText.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardDesignRejectTestmodeParams.RejectionReasons#extraParams} for the field documentation.
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
       * See {@link CardDesignRejectTestmodeParams.RejectionReasons#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum CardLogo implements ApiRequestParams.EnumParam {
      @SerializedName("geographic_location")
      GEOGRAPHIC_LOCATION("geographic_location"),

      @SerializedName("inappropriate")
      INAPPROPRIATE("inappropriate"),

      @SerializedName("network_name")
      NETWORK_NAME("network_name"),

      @SerializedName("non_binary_image")
      NON_BINARY_IMAGE("non_binary_image"),

      @SerializedName("non_fiat_currency")
      NON_FIAT_CURRENCY("non_fiat_currency"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("other_entity")
      OTHER_ENTITY("other_entity"),

      @SerializedName("promotional_material")
      PROMOTIONAL_MATERIAL("promotional_material");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CardLogo(String value) {
        this.value = value;
      }
    }

    public enum CarrierText implements ApiRequestParams.EnumParam {
      @SerializedName("geographic_location")
      GEOGRAPHIC_LOCATION("geographic_location"),

      @SerializedName("inappropriate")
      INAPPROPRIATE("inappropriate"),

      @SerializedName("network_name")
      NETWORK_NAME("network_name"),

      @SerializedName("non_fiat_currency")
      NON_FIAT_CURRENCY("non_fiat_currency"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("other_entity")
      OTHER_ENTITY("other_entity"),

      @SerializedName("promotional_material")
      PROMOTIONAL_MATERIAL("promotional_material");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CarrierText(String value) {
        this.value = value;
      }
    }
  }
}
