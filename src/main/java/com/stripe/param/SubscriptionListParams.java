// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class SubscriptionListParams extends ApiRequestParams {
  /**
   * The billing mode of the subscriptions to retrieve. Either `charge_automatically` or
   * `send_invoice`.
   */
  @SerializedName("billing")
  Billing billing;

  @SerializedName("created")
  Object created;

  @SerializedName("current_period_end")
  Object currentPeriodEnd;

  @SerializedName("current_period_start")
  Object currentPeriodStart;

  /** The ID of the customer whose subscriptions will be retrieved. */
  @SerializedName("customer")
  String customer;

  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** The ID of the plan whose subscriptions will be retrieved. */
  @SerializedName("plan")
  String plan;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * The status of the subscriptions to retrieve. One of: `incomplete`, `incomplete_expired`,
   * `trialing`, `active`, `past_due`, `unpaid`, `canceled`, or `all`. Passing in a value of
   * `canceled` will return all canceled subscriptions, including those belonging to deleted
   * customers. Passing in a value of `all` will return subscriptions of all statuses.
   */
  @SerializedName("status")
  Status status;

  private SubscriptionListParams(
      Billing billing,
      Object created,
      Object currentPeriodEnd,
      Object currentPeriodStart,
      String customer,
      String endingBefore,
      List<String> expand,
      Long limit,
      String plan,
      String startingAfter,
      Status status) {
    this.billing = billing;
    this.created = created;
    this.currentPeriodEnd = currentPeriodEnd;
    this.currentPeriodStart = currentPeriodStart;
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.plan = plan;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new com.stripe.param.SubscriptionListParams.Builder();
  }

  public static class Builder {
    private Billing billing;

    private Object created;

    private Object currentPeriodEnd;

    private Object currentPeriodStart;

    private String customer;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String plan;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionListParams build() {
      return new SubscriptionListParams(
          this.billing,
          this.created,
          this.currentPeriodEnd,
          this.currentPeriodStart,
          this.customer,
          this.endingBefore,
          this.expand,
          this.limit,
          this.plan,
          this.startingAfter,
          this.status);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * The billing mode of the subscriptions to retrieve. Either `charge_automatically` or
     * `send_invoice`.
     */
    public Builder setBilling(Billing billing) {
      this.billing = billing;
      return this;
    }

    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    public Builder setCurrentPeriodEnd(CurrentPeriodEnd currentPeriodEnd) {
      this.currentPeriodEnd = currentPeriodEnd;
      return this;
    }

    public Builder setCurrentPeriodEnd(Long currentPeriodEnd) {
      this.currentPeriodEnd = currentPeriodEnd;
      return this;
    }

    public Builder setCurrentPeriodStart(CurrentPeriodStart currentPeriodStart) {
      this.currentPeriodStart = currentPeriodStart;
      return this;
    }

    public Builder setCurrentPeriodStart(Long currentPeriodStart) {
      this.currentPeriodStart = currentPeriodStart;
      return this;
    }

    /** The ID of the customer whose subscriptions will be retrieved. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
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

    /** The ID of the plan whose subscriptions will be retrieved. */
    public Builder setPlan(String plan) {
      this.plan = plan;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * The status of the subscriptions to retrieve. One of: `incomplete`, `incomplete_expired`,
     * `trialing`, `active`, `past_due`, `unpaid`, `canceled`, or `all`. Passing in a value of
     * `canceled` will return all canceled subscriptions, including those belonging to deleted
     * customers. Passing in a value of `all` will return subscriptions of all statuses.
     */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  public static class Created {
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

    private Created(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionListParams.Created.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public Created build() {
        return new Created(this.gt, this.gte, this.lt, this.lte);
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }
    }
  }

  @Getter
  public static class CurrentPeriodEnd {
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

    private CurrentPeriodEnd(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionListParams.CurrentPeriodEnd.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public CurrentPeriodEnd build() {
        return new CurrentPeriodEnd(this.gt, this.gte, this.lt, this.lte);
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }
    }
  }

  @Getter
  public static class CurrentPeriodStart {
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

    private CurrentPeriodStart(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionListParams.CurrentPeriodStart.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public CurrentPeriodStart build() {
        return new CurrentPeriodStart(this.gt, this.gte, this.lt, this.lte);
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }
    }
  }

  public enum Billing implements ApiRequestParams.EnumParam {
    @SerializedName("charge_automatically")
    CHARGE_AUTOMATICALLY("charge_automatically"),

    @SerializedName("send_invoice")
    SEND_INVOICE("send_invoice");

    @Getter(onMethod = @__({@Override}))
    private final String value;

    Billing(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("all")
    ALL("all"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("ended")
    ENDED("ended"),

    @SerializedName("incomplete")
    INCOMPLETE("incomplete"),

    @SerializedName("incomplete_expired")
    INCOMPLETE_EXPIRED("incomplete_expired"),

    @SerializedName("past_due")
    PAST_DUE("past_due"),

    @SerializedName("trialing")
    TRIALING("trialing"),

    @SerializedName("unpaid")
    UNPAID("unpaid");

    @Getter(onMethod = @__({@Override}))
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
