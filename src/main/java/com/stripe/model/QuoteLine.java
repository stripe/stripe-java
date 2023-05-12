// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A quote line defines a set of changes that will be applied upon quote acceptance. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class QuoteLine extends StripeObject implements HasId {
  /** A list of items the customer is being quoted for. */
  @SerializedName("actions")
  List<QuoteLine.Action> actions;

  /** Details to identify the subscription schedule the quote line applies to. */
  @SerializedName("applies_to")
  AppliesTo appliesTo;

  /**
   * For a point-in-time operation, this attribute lets you set or update whether the subscription's
   * billing cycle anchor is reset at the {@code starts_at} timestamp.
   *
   * <p>One of {@code automatic}, or {@code line_starts_at}.
   */
  @SerializedName("billing_cycle_anchor")
  String billingCycleAnchor;

  /**
   * Details to identify the end of the time range modified by the proposed change. If not supplied,
   * the quote line is considered a point-in-time operation that only affects the exact timestamp at
   * {@code starts_at}, and a restricted set of attributes is supported on the quote line.
   */
  @SerializedName("ends_at")
  EndsAt endsAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code quote_line}.
   */
  @SerializedName("object")
  String object;

  /**
   * Changes to how Stripe handles prorations during the quote line's time span. Affects if and how
   * prorations are created when a future phase starts.
   *
   * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
   */
  @SerializedName("proration_behavior")
  String prorationBehavior;

  /**
   * Timestamp helper to end the underlying schedule early, based on the acompanying line's start or
   * end date.
   *
   * <p>One of {@code line_ends_at}, or {@code line_starts_at}.
   */
  @SerializedName("set_schedule_end")
  String setScheduleEnd;

  /** Details to identify the earliest timestamp where the proposed change should take effect. */
  @SerializedName("starts_at")
  StartsAt startsAt;

  /** Settings related to subscription trials. */
  @SerializedName("trial_settings")
  TrialSettings trialSettings;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Action extends StripeObject {
    /** Details for the {@code add_discount} type. */
    @SerializedName("add_discount")
    AddDiscount addDiscount;

    /** Details for the {@code add_item} type. */
    @SerializedName("add_item")
    AddItem addItem;

    /** Details for the {@code add_metadata} type: specify a hash of key-value pairs. */
    @SerializedName("add_metadata")
    Map<String, String> addMetadata;

    /** Details for the {@code remove_discount} type. */
    @SerializedName("remove_discount")
    RemoveDiscount removeDiscount;

    /** Details for the {@code remove_item} type. */
    @SerializedName("remove_item")
    RemoveItem removeItem;

    /** Details for the {@code remove_metadata} type: specify an array of metadata keys. */
    @SerializedName("remove_metadata")
    List<String> removeMetadata;

    /** Details for the {@code set_discounts} type. */
    @SerializedName("set_discounts")
    List<QuoteLine.Action.SetDiscount> setDiscounts;

    /** Details for the {@code set_items} type. */
    @SerializedName("set_items")
    List<QuoteLine.Action.SetItem> setItems;

    /** Details for the {@code set_metadata} type: specify an array of key-value pairs. */
    @SerializedName("set_metadata")
    Map<String, String> setMetadata;

    /**
     * The type of action the quote line performs.
     *
     * <p>One of {@code add_discount}, {@code add_item}, {@code add_metadata}, {@code
     * clear_discounts}, {@code clear_metadata}, {@code remove_discount}, {@code remove_item},
     * {@code remove_metadata}, {@code set_discounts}, {@code set_items}, or {@code set_metadata}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AddDiscount extends StripeObject {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Coupon> coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<com.stripe.model.Discount> discount;

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * The index, starting at 0, at which to position the new discount. When not supplied, Stripe
       * defaults to appending the discount to the end of the {@code discounts} array.
       */
      @SerializedName("index")
      Long index;

      /** Get ID of expandable {@code coupon} object. */
      public String getCoupon() {
        return (this.coupon != null) ? this.coupon.getId() : null;
      }

      public void setCoupon(String id) {
        this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
      }

      /** Get expanded {@code coupon}. */
      public Coupon getCouponObject() {
        return (this.coupon != null) ? this.coupon.getExpanded() : null;
      }

      public void setCouponObject(Coupon expandableObject) {
        this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code discount} object. */
      public String getDiscount() {
        return (this.discount != null) ? this.discount.getId() : null;
      }

      public void setDiscount(String id) {
        this.discount = ApiResource.setExpandableFieldId(id, this.discount);
      }

      /** Get expanded {@code discount}. */
      public com.stripe.model.Discount getDiscountObject() {
        return (this.discount != null) ? this.discount.getExpanded() : null;
      }

      public void setDiscountObject(com.stripe.model.Discount expandableObject) {
        this.discount =
            new ExpandableField<com.stripe.model.Discount>(
                expandableObject.getId(), expandableObject);
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DiscountEnd extends StripeObject {
        /**
         * The discount end type.
         *
         * <p>Equal to {@code line_ends_at}.
         */
        @SerializedName("type")
        String type;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AddItem extends StripeObject {
      /**
       * The discounts applied to the subscription item. Subscription item discounts are applied
       * before subscription discounts. Use {@code expand[]=discounts} to expand each discount.
       */
      @SerializedName("discounts")
      List<QuoteLine.Action.AddItem.Discount> discounts;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an item. Metadata on this item will update the underlying subscription item's
       * {@code metadata} when the phase is entered.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** ID of the price to which the customer should be subscribed. */
      @SerializedName("price")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Price> price;

      /** Quantity of the plan to which the customer should be subscribed. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to this {@code phase_item}. When set, the {@code
       * default_tax_rates} on the phase do not apply to this {@code phase_item}.
       */
      @SerializedName("tax_rates")
      List<TaxRate> taxRates;

      /** Options that configure the trial on the subscription item. */
      @SerializedName("trial")
      Trial trial;

      /** Get ID of expandable {@code price} object. */
      public String getPrice() {
        return (this.price != null) ? this.price.getId() : null;
      }

      public void setPrice(String id) {
        this.price = ApiResource.setExpandableFieldId(id, this.price);
      }

      /** Get expanded {@code price}. */
      public Price getPriceObject() {
        return (this.price != null) ? this.price.getExpanded() : null;
      }

      public void setPriceObject(Price expandableObject) {
        this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount extends StripeObject {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<Coupon> coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<com.stripe.model.Discount> discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /** Get ID of expandable {@code coupon} object. */
        public String getCoupon() {
          return (this.coupon != null) ? this.coupon.getId() : null;
        }

        public void setCoupon(String id) {
          this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
        }

        /** Get expanded {@code coupon}. */
        public Coupon getCouponObject() {
          return (this.coupon != null) ? this.coupon.getExpanded() : null;
        }

        public void setCouponObject(Coupon expandableObject) {
          this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
        }

        /** Get ID of expandable {@code discount} object. */
        public String getDiscount() {
          return (this.discount != null) ? this.discount.getId() : null;
        }

        public void setDiscount(String id) {
          this.discount = ApiResource.setExpandableFieldId(id, this.discount);
        }

        /** Get expanded {@code discount}. */
        public com.stripe.model.Discount getDiscountObject() {
          return (this.discount != null) ? this.discount.getExpanded() : null;
        }

        public void setDiscountObject(com.stripe.model.Discount expandableObject) {
          this.discount =
              new ExpandableField<com.stripe.model.Discount>(
                  expandableObject.getId(), expandableObject);
        }

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class DiscountEnd extends StripeObject {
          /** The discount end timestamp. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * The discount end type.
           *
           * <p>Equal to {@code timestamp}.
           */
          @SerializedName("type")
          String type;
        }
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Trial extends StripeObject {
        /**
         * List of price IDs which, if present on the subscription following a paid trial,
         * constitute opting-in to the paid trial.
         */
        @SerializedName("converts_to")
        List<String> convertsTo;

        @SerializedName("type")
        String type;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RemoveDiscount extends StripeObject {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Coupon> coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<com.stripe.model.Discount> discount;

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /** Get ID of expandable {@code coupon} object. */
      public String getCoupon() {
        return (this.coupon != null) ? this.coupon.getId() : null;
      }

      public void setCoupon(String id) {
        this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
      }

      /** Get expanded {@code coupon}. */
      public Coupon getCouponObject() {
        return (this.coupon != null) ? this.coupon.getExpanded() : null;
      }

      public void setCouponObject(Coupon expandableObject) {
        this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code discount} object. */
      public String getDiscount() {
        return (this.discount != null) ? this.discount.getId() : null;
      }

      public void setDiscount(String id) {
        this.discount = ApiResource.setExpandableFieldId(id, this.discount);
      }

      /** Get expanded {@code discount}. */
      public com.stripe.model.Discount getDiscountObject() {
        return (this.discount != null) ? this.discount.getExpanded() : null;
      }

      public void setDiscountObject(com.stripe.model.Discount expandableObject) {
        this.discount =
            new ExpandableField<com.stripe.model.Discount>(
                expandableObject.getId(), expandableObject);
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DiscountEnd extends StripeObject {
        /** The discount end timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * The discount end type.
         *
         * <p>Equal to {@code timestamp}.
         */
        @SerializedName("type")
        String type;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RemoveItem extends StripeObject {
      /** ID of a price to remove. */
      @SerializedName("price")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Price> price;

      /** Get ID of expandable {@code price} object. */
      public String getPrice() {
        return (this.price != null) ? this.price.getId() : null;
      }

      public void setPrice(String id) {
        this.price = ApiResource.setExpandableFieldId(id, this.price);
      }

      /** Get expanded {@code price}. */
      public Price getPriceObject() {
        return (this.price != null) ? this.price.getExpanded() : null;
      }

      public void setPriceObject(Price expandableObject) {
        this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SetDiscount extends StripeObject {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Coupon> coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<com.stripe.model.Discount> discount;

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /** Get ID of expandable {@code coupon} object. */
      public String getCoupon() {
        return (this.coupon != null) ? this.coupon.getId() : null;
      }

      public void setCoupon(String id) {
        this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
      }

      /** Get expanded {@code coupon}. */
      public Coupon getCouponObject() {
        return (this.coupon != null) ? this.coupon.getExpanded() : null;
      }

      public void setCouponObject(Coupon expandableObject) {
        this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code discount} object. */
      public String getDiscount() {
        return (this.discount != null) ? this.discount.getId() : null;
      }

      public void setDiscount(String id) {
        this.discount = ApiResource.setExpandableFieldId(id, this.discount);
      }

      /** Get expanded {@code discount}. */
      public com.stripe.model.Discount getDiscountObject() {
        return (this.discount != null) ? this.discount.getExpanded() : null;
      }

      public void setDiscountObject(com.stripe.model.Discount expandableObject) {
        this.discount =
            new ExpandableField<com.stripe.model.Discount>(
                expandableObject.getId(), expandableObject);
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DiscountEnd extends StripeObject {
        /** The discount end timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * The discount end type.
         *
         * <p>Equal to {@code timestamp}.
         */
        @SerializedName("type")
        String type;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SetItem extends StripeObject {
      /**
       * The discounts applied to the subscription item. Subscription item discounts are applied
       * before subscription discounts. Use {@code expand[]=discounts} to expand each discount.
       */
      @SerializedName("discounts")
      List<QuoteLine.Action.SetItem.Discount> discounts;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an item. Metadata on this item will update the underlying subscription item's
       * {@code metadata} when the phase is entered.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** ID of the price to which the customer should be subscribed. */
      @SerializedName("price")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Price> price;

      /** Quantity of the plan to which the customer should be subscribed. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to this {@code phase_item}. When set, the {@code
       * default_tax_rates} on the phase do not apply to this {@code phase_item}.
       */
      @SerializedName("tax_rates")
      List<TaxRate> taxRates;

      /** Options that configure the trial on the subscription item. */
      @SerializedName("trial")
      Trial trial;

      /** Get ID of expandable {@code price} object. */
      public String getPrice() {
        return (this.price != null) ? this.price.getId() : null;
      }

      public void setPrice(String id) {
        this.price = ApiResource.setExpandableFieldId(id, this.price);
      }

      /** Get expanded {@code price}. */
      public Price getPriceObject() {
        return (this.price != null) ? this.price.getExpanded() : null;
      }

      public void setPriceObject(Price expandableObject) {
        this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount extends StripeObject {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<Coupon> coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<com.stripe.model.Discount> discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /** Get ID of expandable {@code coupon} object. */
        public String getCoupon() {
          return (this.coupon != null) ? this.coupon.getId() : null;
        }

        public void setCoupon(String id) {
          this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
        }

        /** Get expanded {@code coupon}. */
        public Coupon getCouponObject() {
          return (this.coupon != null) ? this.coupon.getExpanded() : null;
        }

        public void setCouponObject(Coupon expandableObject) {
          this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
        }

        /** Get ID of expandable {@code discount} object. */
        public String getDiscount() {
          return (this.discount != null) ? this.discount.getId() : null;
        }

        public void setDiscount(String id) {
          this.discount = ApiResource.setExpandableFieldId(id, this.discount);
        }

        /** Get expanded {@code discount}. */
        public com.stripe.model.Discount getDiscountObject() {
          return (this.discount != null) ? this.discount.getExpanded() : null;
        }

        public void setDiscountObject(com.stripe.model.Discount expandableObject) {
          this.discount =
              new ExpandableField<com.stripe.model.Discount>(
                  expandableObject.getId(), expandableObject);
        }

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class DiscountEnd extends StripeObject {
          /** The discount end timestamp. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * The discount end type.
           *
           * <p>Equal to {@code timestamp}.
           */
          @SerializedName("type")
          String type;
        }
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Trial extends StripeObject {
        /**
         * List of price IDs which, if present on the subscription following a paid trial,
         * constitute opting-in to the paid trial.
         */
        @SerializedName("converts_to")
        List<String> convertsTo;

        @SerializedName("type")
        String type;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliesTo extends StripeObject {
    /**
     * A custom string that identifies a new subscription schedule being created upon quote
     * acceptance. All quote lines with the same {@code new_reference} field will be applied to the
     * creation of a new subscription schedule.
     */
    @SerializedName("new_reference")
    String newReference;

    /** The ID of the schedule the line applies to. */
    @SerializedName("subscription_schedule")
    String subscriptionSchedule;

    /**
     * Describes whether the quote line is affecting a new schedule or an existing schedule.
     *
     * <p>One of {@code new_reference}, or {@code subscription_schedule}.
     */
    @SerializedName("type")
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EndsAt extends StripeObject {
    /**
     * The timestamp value that will be used to determine when to make changes to the subscription
     * schedule, as computed from the {@code ends_at} field. For example, if {@code
     * ends_at[type]=upcoming_invoice}, the upcoming invoice date will be computed at the time the
     * {@code ends_at} field was specified and saved. This field will not be recomputed upon future
     * requests to update or finalize the quote unless {@code ends_at} is respecified. This field is
     * guaranteed to be populated after quote acceptance.
     */
    @SerializedName("computed")
    Long computed;

    /** Use the {@code end} time of a given discount. */
    @SerializedName("discount_end")
    DiscountEnd discountEnd;

    /** Time span for the quote line starting from the {@code starts_at} date. */
    @SerializedName("duration")
    Duration duration;

    /** A precise Unix timestamp. */
    @SerializedName("timestamp")
    Long timestamp;

    /**
     * Select a way to pass in {@code ends_at}.
     *
     * <p>One of {@code discount_end}, {@code duration}, {@code quote_acceptance_date}, {@code
     * schedule_end}, {@code timestamp}, or {@code upcoming_invoice}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DiscountEnd extends StripeObject {
      /** The ID of a specific discount. */
      @SerializedName("discount")
      String discount;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Duration extends StripeObject {
      /**
       * Specifies a type of interval unit. Either {@code day}, {@code week}, {@code month} or
       * {@code year}.
       *
       * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
       */
      @SerializedName("interval")
      String interval;

      /**
       * The number of intervals, as an whole number greater than 0. Stripe multiplies this by the
       * interval type to get the overall duration.
       */
      @SerializedName("interval_count")
      Long intervalCount;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StartsAt extends StripeObject {
    /**
     * The timestamp value that will be used to determine when to make changes to the subscription
     * schedule, as computed from the {@code starts_at} field. For example, if {@code
     * starts_at[type]=upcoming_invoice}, the upcoming invoice date will be computed at the time the
     * {@code starts_at} field was specified and saved. This field will not be recomputed upon
     * future requests to update or finalize the quote unless {@code starts_at} is respecified. This
     * field is guaranteed to be populated after quote acceptance.
     */
    @SerializedName("computed")
    Long computed;

    /** Use the {@code end} time of a given discount. */
    @SerializedName("discount_end")
    DiscountEnd discountEnd;

    /** The timestamp the given line ends at. */
    @SerializedName("line_ends_at")
    LineEndsAt lineEndsAt;

    /** A precise Unix timestamp. */
    @SerializedName("timestamp")
    Long timestamp;

    /**
     * Select a way to pass in {@code starts_at}.
     *
     * <p>One of {@code discount_end}, {@code line_ends_at}, {@code now}, {@code
     * quote_acceptance_date}, {@code schedule_end}, {@code timestamp}, or {@code upcoming_invoice}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DiscountEnd extends StripeObject {
      /** The ID of a specific discount. */
      @SerializedName("discount")
      String discount;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LineEndsAt extends StripeObject implements HasId {
      /** Unique identifier for the object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;
    }
  }

  /** Configures how the scheduled subscription behaves during the trial period. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TrialSettings extends StripeObject {
    /** Defines how the subscription should behave when a trial ends. */
    @SerializedName("end_behavior")
    EndBehavior endBehavior;

    /** Defines how the scheduled subscription behaves when a trial ends. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EndBehavior extends StripeObject {
      /**
       * Configure how an opt-in following a paid trial is billed when using {@code
       * billing_behavior: prorate_up_front}.
       *
       * <p>One of {@code defer}, or {@code include}.
       */
      @SerializedName("prorate_up_front")
      String prorateUpFront;
    }
  }
}
