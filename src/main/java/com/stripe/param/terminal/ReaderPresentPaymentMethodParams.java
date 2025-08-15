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
public class ReaderPresentPaymentMethodParams extends ApiRequestParams {
  /** Simulated on-reader tip amount. */
  @SerializedName("amount_tip")
  Long amountTip;

  /** Simulated data for the card payment method. */
  @SerializedName("card")
  Card card;

  /** Simulated data for the card_present payment method. */
  @SerializedName("card_present")
  CardPresent cardPresent;

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

  /** Simulated data for the interac_present payment method. */
  @SerializedName("interac_present")
  InteracPresent interacPresent;

  /** Simulated payment type. */
  @SerializedName("type")
  Type type;

  private ReaderPresentPaymentMethodParams(
      Long amountTip,
      Card card,
      CardPresent cardPresent,
      List<String> expand,
      Map<String, Object> extraParams,
      InteracPresent interacPresent,
      Type type) {
    this.amountTip = amountTip;
    this.card = card;
    this.cardPresent = cardPresent;
    this.expand = expand;
    this.extraParams = extraParams;
    this.interacPresent = interacPresent;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amountTip;

    private Card card;

    private CardPresent cardPresent;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private InteracPresent interacPresent;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderPresentPaymentMethodParams build() {
      return new ReaderPresentPaymentMethodParams(
          this.amountTip,
          this.card,
          this.cardPresent,
          this.expand,
          this.extraParams,
          this.interacPresent,
          this.type);
    }

    /** Simulated on-reader tip amount. */
    public Builder setAmountTip(Long amountTip) {
      this.amountTip = amountTip;
      return this;
    }

    /** Simulated data for the card payment method. */
    public Builder setCard(ReaderPresentPaymentMethodParams.Card card) {
      this.card = card;
      return this;
    }

    /** Simulated data for the card_present payment method. */
    public Builder setCardPresent(ReaderPresentPaymentMethodParams.CardPresent cardPresent) {
      this.cardPresent = cardPresent;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderPresentPaymentMethodParams#expand} for the field documentation.
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
     * ReaderPresentPaymentMethodParams#expand} for the field documentation.
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
     * ReaderPresentPaymentMethodParams#extraParams} for the field documentation.
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
     * See {@link ReaderPresentPaymentMethodParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Simulated data for the interac_present payment method. */
    public Builder setInteracPresent(
        ReaderPresentPaymentMethodParams.InteracPresent interacPresent) {
      this.interacPresent = interacPresent;
      return this;
    }

    /** Simulated payment type. */
    public Builder setType(ReaderPresentPaymentMethodParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Card {
    /** <strong>Required.</strong> Card security code. */
    @SerializedName("cvc")
    String cvc;

    /** <strong>Required.</strong> Two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /**
     * <strong>Required.</strong> Two- or four-digit number representing the card's expiration year.
     */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The card number, as a string without any separators. */
    @SerializedName("number")
    String number;

    private Card(
        String cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, String number) {
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String cvc;

      private Long expMonth;

      private Long expYear;

      private Map<String, Object> extraParams;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderPresentPaymentMethodParams.Card build() {
        return new ReaderPresentPaymentMethodParams.Card(
            this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
      }

      /** <strong>Required.</strong> Card security code. */
      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      /** <strong>Required.</strong> Two-digit number representing the card's expiration month. */
      public Builder setExpMonth(Long expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      /**
       * <strong>Required.</strong> Two- or four-digit number representing the card's expiration
       * year.
       */
      public Builder setExpYear(Long expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderPresentPaymentMethodParams.Card#extraParams} for the field documentation.
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
       * See {@link ReaderPresentPaymentMethodParams.Card#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The card number, as a string without any separators. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CardPresent {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The card number, as a string without any separators. */
    @SerializedName("number")
    String number;

    private CardPresent(Map<String, Object> extraParams, String number) {
      this.extraParams = extraParams;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderPresentPaymentMethodParams.CardPresent build() {
        return new ReaderPresentPaymentMethodParams.CardPresent(this.extraParams, this.number);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderPresentPaymentMethodParams.CardPresent#extraParams} for the field documentation.
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
       * See {@link ReaderPresentPaymentMethodParams.CardPresent#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The card number, as a string without any separators. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class InteracPresent {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Card Number. */
    @SerializedName("number")
    String number;

    private InteracPresent(Map<String, Object> extraParams, String number) {
      this.extraParams = extraParams;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderPresentPaymentMethodParams.InteracPresent build() {
        return new ReaderPresentPaymentMethodParams.InteracPresent(this.extraParams, this.number);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderPresentPaymentMethodParams.InteracPresent#extraParams} for the field documentation.
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
       * See {@link ReaderPresentPaymentMethodParams.InteracPresent#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Card Number. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("card")
    CARD("card"),

    @SerializedName("card_present")
    CARD_PRESENT("card_present"),

    @SerializedName("interac_present")
    INTERAC_PRESENT("interac_present");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
