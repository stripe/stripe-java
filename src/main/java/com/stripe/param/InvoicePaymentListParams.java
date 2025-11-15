// File generated from our OpenAPI spec
package com.stripe.param;

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
public class InvoicePaymentListParams extends ApiRequestParams {
  /** Only return invoice payments that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

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

  /** The identifier of the invoice whose payments to return. */
  @SerializedName("invoice")
  String invoice;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** The payment details of the invoice payments to return. */
  @SerializedName("payment")
  Payment payment;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** The status of the invoice payments to return. */
  @SerializedName("status")
  Status status;

  private InvoicePaymentListParams(
      Object created,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoice,
      Long limit,
      Payment payment,
      String startingAfter,
      Status status) {
    this.created = created;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.limit = limit;
    this.payment = payment;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object created;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoice;

    private Long limit;

    private Payment payment;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoicePaymentListParams build() {
      return new InvoicePaymentListParams(
          this.created,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.invoice,
          this.limit,
          this.payment,
          this.startingAfter,
          this.status);
    }

    /** Only return invoice payments that were created during the given date interval. */
    public Builder setCreated(InvoicePaymentListParams.Created created) {
      this.created = created;
      return this;
    }

    /** Only return invoice payments that were created during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoicePaymentListParams#expand} for the field documentation.
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
     * InvoicePaymentListParams#expand} for the field documentation.
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
     * InvoicePaymentListParams#extraParams} for the field documentation.
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
     * See {@link InvoicePaymentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The identifier of the invoice whose payments to return. */
    public Builder setInvoice(String invoice) {
      this.invoice = invoice;
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** The payment details of the invoice payments to return. */
    public Builder setPayment(InvoicePaymentListParams.Payment payment) {
      this.payment = payment;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /** The status of the invoice payments to return. */
    public Builder setStatus(InvoicePaymentListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private Created(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoicePaymentListParams.Created build() {
        return new InvoicePaymentListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoicePaymentListParams.Created#extraParams} for the field documentation.
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
       * See {@link InvoicePaymentListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payment {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Only return invoice payments associated by this payment intent ID. */
    @SerializedName("payment_intent")
    String paymentIntent;

    /** Only return invoice payments associated by this payment record ID. */
    @SerializedName("payment_record")
    String paymentRecord;

    /** <strong>Required.</strong> Only return invoice payments associated by this payment type. */
    @SerializedName("type")
    Type type;

    private Payment(
        Map<String, Object> extraParams, String paymentIntent, String paymentRecord, Type type) {
      this.extraParams = extraParams;
      this.paymentIntent = paymentIntent;
      this.paymentRecord = paymentRecord;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String paymentIntent;

      private String paymentRecord;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoicePaymentListParams.Payment build() {
        return new InvoicePaymentListParams.Payment(
            this.extraParams, this.paymentIntent, this.paymentRecord, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoicePaymentListParams.Payment#extraParams} for the field documentation.
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
       * See {@link InvoicePaymentListParams.Payment#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Only return invoice payments associated by this payment intent ID. */
      public Builder setPaymentIntent(String paymentIntent) {
        this.paymentIntent = paymentIntent;
        return this;
      }

      /** Only return invoice payments associated by this payment record ID. */
      public Builder setPaymentRecord(String paymentRecord) {
        this.paymentRecord = paymentRecord;
        return this;
      }

      /**
       * <strong>Required.</strong> Only return invoice payments associated by this payment type.
       */
      public Builder setType(InvoicePaymentListParams.Payment.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("payment_intent")
      PAYMENT_INTENT("payment_intent"),

      @SerializedName("payment_record")
      PAYMENT_RECORD("payment_record");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("open")
    OPEN("open"),

    @SerializedName("paid")
    PAID("paid");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
