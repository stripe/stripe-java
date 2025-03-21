// File generated from our OpenAPI spec
package com.stripe.param.giftcards;

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
public class TransactionCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The amount of the transaction. A negative amount deducts funds, and
   * a positive amount adds funds.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Whether this is a confirmed transaction. A confirmed transaction immediately deducts from/adds
   * to the {@code amount_available} on the gift card. Otherwise, it creates a held transaction that
   * increments the {@code amount_held} on the gift card.
   */
  @SerializedName("confirm")
  Boolean confirm;

  /** Related objects which created this transaction. */
  @SerializedName("created_by")
  CreatedBy createdBy;

  /**
   * <strong>Required.</strong> The currency of the transaction. This must match the currency of the
   * gift card.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

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

  /** <strong>Required.</strong> The gift card to create a new transaction on. */
  @SerializedName("gift_card")
  String giftCard;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * A string that identifies this transaction as part of a group. See the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers">Connect documentation</a>
   * for details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private TransactionCreateParams(
      Long amount,
      Boolean confirm,
      CreatedBy createdBy,
      String currency,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      String giftCard,
      Map<String, String> metadata,
      String transferGroup) {
    this.amount = amount;
    this.confirm = confirm;
    this.createdBy = createdBy;
    this.currency = currency;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.giftCard = giftCard;
    this.metadata = metadata;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Boolean confirm;

    private CreatedBy createdBy;

    private String currency;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String giftCard;

    private Map<String, String> metadata;

    private String transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public TransactionCreateParams build() {
      return new TransactionCreateParams(
          this.amount,
          this.confirm,
          this.createdBy,
          this.currency,
          this.description,
          this.expand,
          this.extraParams,
          this.giftCard,
          this.metadata,
          this.transferGroup);
    }

    /**
     * <strong>Required.</strong> The amount of the transaction. A negative amount deducts funds,
     * and a positive amount adds funds.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Whether this is a confirmed transaction. A confirmed transaction immediately deducts
     * from/adds to the {@code amount_available} on the gift card. Otherwise, it creates a held
     * transaction that increments the {@code amount_held} on the gift card.
     */
    public Builder setConfirm(Boolean confirm) {
      this.confirm = confirm;
      return this;
    }

    /** Related objects which created this transaction. */
    public Builder setCreatedBy(TransactionCreateParams.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * <strong>Required.</strong> The currency of the transaction. This must match the currency of
     * the gift card.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateParams#expand} for the field documentation.
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
     * TransactionCreateParams#expand} for the field documentation.
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
     * TransactionCreateParams#extraParams} for the field documentation.
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
     * See {@link TransactionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The gift card to create a new transaction on. */
    public Builder setGiftCard(String giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * TransactionCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link TransactionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. See the <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers">Connect
     * documentation</a> for details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CreatedBy {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The details for the payment that created this object. */
    @SerializedName("payment")
    Payment payment;

    /** <strong>Required.</strong> The type of event that created this object. */
    @SerializedName("type")
    Type type;

    private CreatedBy(Map<String, Object> extraParams, Payment payment, Type type) {
      this.extraParams = extraParams;
      this.payment = payment;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Payment payment;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionCreateParams.CreatedBy build() {
        return new TransactionCreateParams.CreatedBy(this.extraParams, this.payment, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionCreateParams.CreatedBy#extraParams} for the field documentation.
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
       * See {@link TransactionCreateParams.CreatedBy#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The details for the payment that created this object. */
      public Builder setPayment(TransactionCreateParams.CreatedBy.Payment payment) {
        this.payment = payment;
        return this;
      }

      /** <strong>Required.</strong> The type of event that created this object. */
      public Builder setType(TransactionCreateParams.CreatedBy.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payment {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The PaymentIntent used to collect payment for this object. */
      @SerializedName("payment_intent")
      String paymentIntent;

      private Payment(Map<String, Object> extraParams, String paymentIntent) {
        this.extraParams = extraParams;
        this.paymentIntent = paymentIntent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String paymentIntent;

        /** Finalize and obtain parameter instance from this builder. */
        public TransactionCreateParams.CreatedBy.Payment build() {
          return new TransactionCreateParams.CreatedBy.Payment(
              this.extraParams, this.paymentIntent);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TransactionCreateParams.CreatedBy.Payment#extraParams} for the field
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
         * map. See {@link TransactionCreateParams.CreatedBy.Payment#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The PaymentIntent used to collect payment for this object. */
        public Builder setPaymentIntent(String paymentIntent) {
          this.paymentIntent = paymentIntent;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("payment")
      PAYMENT("payment");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
