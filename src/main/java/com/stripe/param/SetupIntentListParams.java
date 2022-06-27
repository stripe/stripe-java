// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SetupIntentListParams extends ApiRequestParams {
  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * <p>It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a Customer.
   */
  @SerializedName("attach_to_self")
  Boolean attachToSelf;

  /**
   * A filter on the list, based on the object {@code created} field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
   */
  @SerializedName("created")
  Object created;

  /**
   * Only return SetupIntents for the customer specified by this customer ID.
   */
  @SerializedName("customer")
  String customer;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /**
   * Specifies which fields in the response should be expanded.
   */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * Only return SetupIntents associated with the specified payment method.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private SetupIntentListParams(
      Boolean attachToSelf,
      Object created,
      String customer,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String paymentMethod,
      String startingAfter) {
    this.attachToSelf = attachToSelf;
    this.created = created;
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.paymentMethod = paymentMethod;
    this.startingAfter = startingAfter;
  }
  public static Builder builder() {
    return new Builder();
  }
  public static class Builder {
    private Boolean attachToSelf;

    private Object created;

    private String customer;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String paymentMethod;

    private String startingAfter;

    /**
     * Finalize and obtain parameter instance from this builder.
     */
    public SetupIntentListParams build() {
      return new SetupIntentListParams(
        this.attachToSelf,
        this.created,
        this.customer,
        this.endingBefore,
        this.expand,
        this.extraParams,
        this.limit,
        this.paymentMethod,
        this.startingAfter
      );
    }

    /**
     * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
     *
     * <p>It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a Customer.
     */
    public Builder setAttachToSelf(Boolean attachToSelf) {
      this.attachToSelf = attachToSelf;
      return this;
    }

    /**
     * A filter on the list, based on the object {@code created} field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
     */
    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    /**
     * A filter on the list, based on the object {@code created} field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with a number of different query options.
     */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /**
     * Only return SetupIntents for the customer specified by this customer ID.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SetupIntentListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SetupIntentListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SetupIntentListParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SetupIntentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Only return SetupIntents associated with the specified payment method.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }
  }
  @Getter
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Minimum value to filter by (exclusive).
     */
    @SerializedName("gt")
    Long gt;

    /**
     * Minimum value to filter by (inclusive).
     */
    @SerializedName("gte")
    Long gte;

    /**
     * Maximum value to filter by (exclusive).
     */
    @SerializedName("lt")
    Long lt;

    /**
     * Maximum value to filter by (inclusive).
     */
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

      /**
       * Finalize and obtain parameter instance from this builder.
       */
      public Created build() {
        return new Created(this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SetupIntentListParams.Created#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SetupIntentListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Minimum value to filter by (exclusive).
       */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /**
       * Minimum value to filter by (inclusive).
       */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /**
       * Maximum value to filter by (exclusive).
       */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /**
       * Maximum value to filter by (inclusive).
       */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }
}