// File generated from our OpenAPI spec
package com.stripe.param.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SessionUpdateParams extends ApiRequestParams {
  /**
   * Settings for automatic tax lookup for this session and resulting payments, invoices, and
   * subscriptions.
   */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Information about the customer collected within the Checkout Session. Can only be set when
   * updating {@code embedded} or {@code custom} sessions.
   */
  @SerializedName("collected_information")
  CollectedInformation collectedInformation;

  /** List of coupons and promotion codes attached to the Checkout Session. */
  @SerializedName("discounts")
  Object discounts;

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

  /** Generate a post-purchase Invoice for one-time payments. */
  @SerializedName("invoice_creation")
  InvoiceCreation invoiceCreation;

  /**
   * A list of items the customer is purchasing.
   *
   * <p>When updating line items, you must retransmit the entire array of line items.
   *
   * <p>To retain an existing line item, specify its {@code id}.
   *
   * <p>To update an existing line item, specify its {@code id} along with the new values of the
   * fields to update.
   *
   * <p>To add a new line item, specify one of {@code price} or {@code price_data} and {@code
   * quantity}.
   *
   * <p>To remove an existing line item, omit the line item's ID from the retransmitted array.
   *
   * <p>To reorder a line item, specify it at the desired position in the retransmitted array.
   */
  @SerializedName("line_items")
  List<SessionUpdateParams.LineItem> lineItems;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The shipping rate options to apply to this Session. Up to a maximum of 5. */
  @SerializedName("shipping_options")
  Object shippingOptions;

  /**
   * A subset of parameters to be passed to subscription creation for Checkout Sessions in {@code
   * subscription} mode.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  private SessionUpdateParams(
      AutomaticTax automaticTax,
      CollectedInformation collectedInformation,
      Object discounts,
      List<String> expand,
      Map<String, Object> extraParams,
      InvoiceCreation invoiceCreation,
      List<SessionUpdateParams.LineItem> lineItems,
      Object metadata,
      Object shippingOptions,
      SubscriptionData subscriptionData) {
    this.automaticTax = automaticTax;
    this.collectedInformation = collectedInformation;
    this.discounts = discounts;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceCreation = invoiceCreation;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.shippingOptions = shippingOptions;
    this.subscriptionData = subscriptionData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AutomaticTax automaticTax;

    private CollectedInformation collectedInformation;

    private Object discounts;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private InvoiceCreation invoiceCreation;

    private List<SessionUpdateParams.LineItem> lineItems;

    private Object metadata;

    private Object shippingOptions;

    private SubscriptionData subscriptionData;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionUpdateParams build() {
      return new SessionUpdateParams(
          this.automaticTax,
          this.collectedInformation,
          this.discounts,
          this.expand,
          this.extraParams,
          this.invoiceCreation,
          this.lineItems,
          this.metadata,
          this.shippingOptions,
          this.subscriptionData);
    }

    /**
     * Settings for automatic tax lookup for this session and resulting payments, invoices, and
     * subscriptions.
     */
    public Builder setAutomaticTax(SessionUpdateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * Information about the customer collected within the Checkout Session. Can only be set when
     * updating {@code embedded} or {@code custom} sessions.
     */
    public Builder setCollectedInformation(
        SessionUpdateParams.CollectedInformation collectedInformation) {
      this.collectedInformation = collectedInformation;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(SessionUpdateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<SessionUpdateParams.Discount>();
      }
      ((List<SessionUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<SessionUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<SessionUpdateParams.Discount>();
      }
      ((List<SessionUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /** List of coupons and promotion codes attached to the Checkout Session. */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /** List of coupons and promotion codes attached to the Checkout Session. */
    public Builder setDiscounts(List<SessionUpdateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#expand} for the field documentation.
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
     * SessionUpdateParams#expand} for the field documentation.
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
     * SessionUpdateParams#extraParams} for the field documentation.
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
     * See {@link SessionUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Generate a post-purchase Invoice for one-time payments. */
    public Builder setInvoiceCreation(SessionUpdateParams.InvoiceCreation invoiceCreation) {
      this.invoiceCreation = invoiceCreation;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(SessionUpdateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<SessionUpdateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SessionUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SessionUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Add an element to `shippingOptions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#shippingOptions} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addShippingOption(SessionUpdateParams.ShippingOption element) {
      if (this.shippingOptions == null || this.shippingOptions instanceof EmptyParam) {
        this.shippingOptions = new ArrayList<SessionUpdateParams.ShippingOption>();
      }
      ((List<SessionUpdateParams.ShippingOption>) this.shippingOptions).add(element);
      return this;
    }

    /**
     * Add all elements to `shippingOptions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SessionUpdateParams#shippingOptions} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllShippingOption(List<SessionUpdateParams.ShippingOption> elements) {
      if (this.shippingOptions == null || this.shippingOptions instanceof EmptyParam) {
        this.shippingOptions = new ArrayList<SessionUpdateParams.ShippingOption>();
      }
      ((List<SessionUpdateParams.ShippingOption>) this.shippingOptions).addAll(elements);
      return this;
    }

    /** The shipping rate options to apply to this Session. Up to a maximum of 5. */
    public Builder setShippingOptions(EmptyParam shippingOptions) {
      this.shippingOptions = shippingOptions;
      return this;
    }

    /** The shipping rate options to apply to this Session. Up to a maximum of 5. */
    public Builder setShippingOptions(List<SessionUpdateParams.ShippingOption> shippingOptions) {
      this.shippingOptions = shippingOptions;
      return this;
    }

    /**
     * A subset of parameters to be passed to subscription creation for Checkout Sessions in {@code
     * subscription} mode.
     */
    public Builder setSubscriptionData(SessionUpdateParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    private AutomaticTax(Map<String, Object> extraParams, Liability liability) {
      this.extraParams = extraParams;
      this.liability = liability;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Liability liability;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.AutomaticTax build() {
        return new SessionUpdateParams.AutomaticTax(this.extraParams, this.liability);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.AutomaticTax#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The account that's liable for tax. If set, the business address and tax registrations
       * required to perform the tax calculation are loaded from this account. The tax transaction
       * is returned in the report of the connected account.
       */
      public Builder setLiability(SessionUpdateParams.AutomaticTax.Liability liability) {
        this.liability = liability;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      Object account;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      @SerializedName("type")
      Type type;

      private Liability(Object account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.AutomaticTax.Liability build() {
          return new SessionUpdateParams.AutomaticTax.Liability(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(EmptyParam account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.AutomaticTax.Liability#extraParams} for the field
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
         * map. See {@link SessionUpdateParams.AutomaticTax.Liability#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        public Builder setType(SessionUpdateParams.AutomaticTax.Liability.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("account")
        ACCOUNT("account"),

        @SerializedName("self")
        SELF("self");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CollectedInformation {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The shipping details to apply to this Session. */
    @SerializedName("shipping_details")
    ShippingDetails shippingDetails;

    private CollectedInformation(Map<String, Object> extraParams, ShippingDetails shippingDetails) {
      this.extraParams = extraParams;
      this.shippingDetails = shippingDetails;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private ShippingDetails shippingDetails;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.CollectedInformation build() {
        return new SessionUpdateParams.CollectedInformation(this.extraParams, this.shippingDetails);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.CollectedInformation#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.CollectedInformation#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The shipping details to apply to this Session. */
      public Builder setShippingDetails(
          SessionUpdateParams.CollectedInformation.ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingDetails {
      /** <strong>Required.</strong> The address of the customer */
      @SerializedName("address")
      Address address;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The name of customer */
      @SerializedName("name")
      Object name;

      private ShippingDetails(Address address, Map<String, Object> extraParams, Object name) {
        this.address = address;
        this.extraParams = extraParams;
        this.name = name;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private Map<String, Object> extraParams;

        private Object name;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.CollectedInformation.ShippingDetails build() {
          return new SessionUpdateParams.CollectedInformation.ShippingDetails(
              this.address, this.extraParams, this.name);
        }

        /** <strong>Required.</strong> The address of the customer */
        public Builder setAddress(
            SessionUpdateParams.CollectedInformation.ShippingDetails.Address address) {
          this.address = address;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.CollectedInformation.ShippingDetails#extraParams} for
         * the field documentation.
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
         * map. See {@link SessionUpdateParams.CollectedInformation.ShippingDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The name of customer */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** <strong>Required.</strong> The name of customer */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        Object country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
         */
        @SerializedName("line1")
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /**
         * State, county, province, or region (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
        @SerializedName("state")
        Object state;

        private Address(
            Object city,
            Object country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object city;

          private Object country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.CollectedInformation.ShippingDetails.Address build() {
            return new SessionUpdateParams.CollectedInformation.ShippingDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(EmptyParam city) {
            this.city = city;
            return this;
          }

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionUpdateParams.CollectedInformation.ShippingDetails.Address#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SessionUpdateParams.CollectedInformation.ShippingDetails.Address#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(EmptyParam line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(EmptyParam postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setState(EmptyParam state) {
            this.state = state;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Discount {
    /**
     * The ID of the <a href="https://docs.stripe.com/api/coupons">Coupon</a> to apply to this
     * Session. One of {@code coupon} or {@code coupon_data} is required when updating discounts.
     */
    @SerializedName("coupon")
    Object coupon;

    /**
     * Data used to generate a new <a href="https://docs.stripe.com/api/coupon">Coupon</a> object
     * inline. One of {@code coupon} or {@code coupon_data} is required when updating discounts.
     */
    @SerializedName("coupon_data")
    CouponData couponData;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Discount(Object coupon, CouponData couponData, Map<String, Object> extraParams) {
      this.coupon = coupon;
      this.couponData = couponData;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private CouponData couponData;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.Discount build() {
        return new SessionUpdateParams.Discount(this.coupon, this.couponData, this.extraParams);
      }

      /**
       * The ID of the <a href="https://docs.stripe.com/api/coupons">Coupon</a> to apply to this
       * Session. One of {@code coupon} or {@code coupon_data} is required when updating discounts.
       */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /**
       * The ID of the <a href="https://docs.stripe.com/api/coupons">Coupon</a> to apply to this
       * Session. One of {@code coupon} or {@code coupon_data} is required when updating discounts.
       */
      public Builder setCoupon(EmptyParam coupon) {
        this.coupon = coupon;
        return this;
      }

      /**
       * Data used to generate a new <a href="https://docs.stripe.com/api/coupon">Coupon</a> object
       * inline. One of {@code coupon} or {@code coupon_data} is required when updating discounts.
       */
      public Builder setCouponData(SessionUpdateParams.Discount.CouponData couponData) {
        this.couponData = couponData;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.Discount#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CouponData {
      /**
       * A positive integer representing the amount to subtract from an invoice total (required if
       * {@code percent_off} is not passed).
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> of
       * the {@code amount_off} parameter (required if {@code amount_off} is passed).
       */
      @SerializedName("currency")
      Object currency;

      /**
       * Specifies how long the discount will be in effect if used on a subscription. Defaults to
       * {@code once}.
       */
      @SerializedName("duration")
      Duration duration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Object metadata;

      /**
       * Name of the coupon displayed to customers on, for instance invoices, or receipts. By
       * default the {@code id} is shown if {@code name} is not set.
       */
      @SerializedName("name")
      Object name;

      /**
       * A positive float larger than 0, and smaller or equal to 100, that represents the discount
       * the coupon will apply (required if {@code amount_off} is not passed).
       */
      @SerializedName("percent_off")
      BigDecimal percentOff;

      private CouponData(
          Long amountOff,
          Object currency,
          Duration duration,
          Map<String, Object> extraParams,
          Object metadata,
          Object name,
          BigDecimal percentOff) {
        this.amountOff = amountOff;
        this.currency = currency;
        this.duration = duration;
        this.extraParams = extraParams;
        this.metadata = metadata;
        this.name = name;
        this.percentOff = percentOff;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amountOff;

        private Object currency;

        private Duration duration;

        private Map<String, Object> extraParams;

        private Object metadata;

        private Object name;

        private BigDecimal percentOff;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.Discount.CouponData build() {
          return new SessionUpdateParams.Discount.CouponData(
              this.amountOff,
              this.currency,
              this.duration,
              this.extraParams,
              this.metadata,
              this.name,
              this.percentOff);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total (required if
         * {@code percent_off} is not passed).
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a>
         * of the {@code amount_off} parameter (required if {@code amount_off} is passed).
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a>
         * of the {@code amount_off} parameter (required if {@code amount_off} is passed).
         */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Specifies how long the discount will be in effect if used on a subscription. Defaults to
         * {@code once}.
         */
        public Builder setDuration(SessionUpdateParams.Discount.CouponData.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.Discount.CouponData#extraParams} for the field
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
         * map. See {@link SessionUpdateParams.Discount.CouponData#extraParams} for the field
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
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SessionUpdateParams.Discount.CouponData#metadata} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null || this.metadata instanceof EmptyParam) {
            this.metadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.metadata).put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.Discount.CouponData#metadata} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null || this.metadata instanceof EmptyParam) {
            this.metadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.metadata).putAll(map);
          return this;
        }

        /**
         * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(EmptyParam metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(Map<String, String> metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * Name of the coupon displayed to customers on, for instance invoices, or receipts. By
         * default the {@code id} is shown if {@code name} is not set.
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /**
         * Name of the coupon displayed to customers on, for instance invoices, or receipts. By
         * default the {@code id} is shown if {@code name} is not set.
         */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /**
         * A positive float larger than 0, and smaller or equal to 100, that represents the discount
         * the coupon will apply (required if {@code amount_off} is not passed).
         */
        public Builder setPercentOff(BigDecimal percentOff) {
          this.percentOff = percentOff;
          return this;
        }
      }

      public enum Duration implements ApiRequestParams.EnumParam {
        @SerializedName("forever")
        FOREVER("forever"),

        @SerializedName("once")
        ONCE("once"),

        @SerializedName("repeating")
        REPEATING("repeating");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Duration(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceCreation {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Parameters passed when creating invoices for payment-mode Checkout Sessions. */
    @SerializedName("invoice_data")
    InvoiceData invoiceData;

    private InvoiceCreation(Map<String, Object> extraParams, InvoiceData invoiceData) {
      this.extraParams = extraParams;
      this.invoiceData = invoiceData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private InvoiceData invoiceData;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.InvoiceCreation build() {
        return new SessionUpdateParams.InvoiceCreation(this.extraParams, this.invoiceData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.InvoiceCreation#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.InvoiceCreation#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Parameters passed when creating invoices for payment-mode Checkout Sessions. */
      public Builder setInvoiceData(SessionUpdateParams.InvoiceCreation.InvoiceData invoiceData) {
        this.invoiceData = invoiceData;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceData {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      private InvoiceData(Map<String, Object> extraParams, Issuer issuer) {
        this.extraParams = extraParams;
        this.issuer = issuer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Issuer issuer;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.InvoiceCreation.InvoiceData build() {
          return new SessionUpdateParams.InvoiceCreation.InvoiceData(this.extraParams, this.issuer);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.InvoiceCreation.InvoiceData#extraParams} for the
         * field documentation.
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
         * map. See {@link SessionUpdateParams.InvoiceCreation.InvoiceData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(SessionUpdateParams.InvoiceCreation.InvoiceData.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.InvoiceCreation.InvoiceData.Issuer build() {
            return new SessionUpdateParams.InvoiceCreation.InvoiceData.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionUpdateParams.InvoiceCreation.InvoiceData.Issuer#extraParams} for
           * the field documentation.
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
           * map. See {@link SessionUpdateParams.InvoiceCreation.InvoiceData.Issuer#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(SessionUpdateParams.InvoiceCreation.InvoiceData.Issuer.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItem {
    /**
     * When set, provides configuration for this item’s quantity to be adjusted by the customer
     * during Checkout.
     */
    @SerializedName("adjustable_quantity")
    AdjustableQuantity adjustableQuantity;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of an existing line item. */
    @SerializedName("id")
    Object id;

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /**
     * The ID of the <a href="https://docs.stripe.com/api/prices">Price</a>. One of {@code price} or
     * {@code price_data} is required when creating a new line item.
     */
    @SerializedName("price")
    Object price;

    /**
     * Data used to generate a new <a href="https://docs.stripe.com/api/prices">Price</a> object
     * inline. One of {@code price} or {@code price_data} is required when creating a new line item.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /**
     * The quantity of the line item being purchased. Quantity should not be defined when {@code
     * recurring.usage_type=metered}.
     */
    @SerializedName("quantity")
    Long quantity;

    /**
     * The <a href="https://docs.stripe.com/api/tax_rates">tax rates</a> which apply to this line
     * item.
     */
    @SerializedName("tax_rates")
    Object taxRates;

    private LineItem(
        AdjustableQuantity adjustableQuantity,
        Map<String, Object> extraParams,
        Object id,
        Object metadata,
        Object price,
        PriceData priceData,
        Long quantity,
        Object taxRates) {
      this.adjustableQuantity = adjustableQuantity;
      this.extraParams = extraParams;
      this.id = id;
      this.metadata = metadata;
      this.price = price;
      this.priceData = priceData;
      this.quantity = quantity;
      this.taxRates = taxRates;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AdjustableQuantity adjustableQuantity;

      private Map<String, Object> extraParams;

      private Object id;

      private Object metadata;

      private Object price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.LineItem build() {
        return new SessionUpdateParams.LineItem(
            this.adjustableQuantity,
            this.extraParams,
            this.id,
            this.metadata,
            this.price,
            this.priceData,
            this.quantity,
            this.taxRates);
      }

      /**
       * When set, provides configuration for this item’s quantity to be adjusted by the customer
       * during Checkout.
       */
      public Builder setAdjustableQuantity(
          SessionUpdateParams.LineItem.AdjustableQuantity adjustableQuantity) {
        this.adjustableQuantity = adjustableQuantity;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** ID of an existing line item. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** ID of an existing line item. */
      public Builder setId(EmptyParam id) {
        this.id = id;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.LineItem#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SessionUpdateParams.LineItem#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).putAll(map);
        return this;
      }

      /**
       * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * The ID of the <a href="https://docs.stripe.com/api/prices">Price</a>. One of {@code price}
       * or {@code price_data} is required when creating a new line item.
       */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /**
       * The ID of the <a href="https://docs.stripe.com/api/prices">Price</a>. One of {@code price}
       * or {@code price_data} is required when creating a new line item.
       */
      public Builder setPrice(EmptyParam price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new <a href="https://docs.stripe.com/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required when creating a new line
       * item.
       */
      public Builder setPriceData(SessionUpdateParams.LineItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /**
       * The quantity of the line item being purchased. Quantity should not be defined when {@code
       * recurring.usage_type=metered}.
       */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionUpdateParams.LineItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addTaxRate(String element) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SessionUpdateParams.LineItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).addAll(elements);
        return this;
      }

      /**
       * The <a href="https://docs.stripe.com/api/tax_rates">tax rates</a> which apply to this line
       * item.
       */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * The <a href="https://docs.stripe.com/api/tax_rates">tax rates</a> which apply to this line
       * item.
       */
      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AdjustableQuantity {
      /**
       * <strong>Required.</strong> Set to true if the quantity can be adjusted to any positive
       * integer. Setting to false will remove any previously specified constraints on quantity.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The maximum quantity the customer can purchase for the Checkout Session. By default this
       * value is 99. You can specify a value up to 999999.
       */
      @SerializedName("maximum")
      Long maximum;

      /**
       * The minimum quantity the customer must purchase for the Checkout Session. By default this
       * value is 0.
       */
      @SerializedName("minimum")
      Long minimum;

      private AdjustableQuantity(
          Boolean enabled, Map<String, Object> extraParams, Long maximum, Long minimum) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.maximum = maximum;
        this.minimum = minimum;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Long maximum;

        private Long minimum;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.LineItem.AdjustableQuantity build() {
          return new SessionUpdateParams.LineItem.AdjustableQuantity(
              this.enabled, this.extraParams, this.maximum, this.minimum);
        }

        /**
         * <strong>Required.</strong> Set to true if the quantity can be adjusted to any positive
         * integer. Setting to false will remove any previously specified constraints on quantity.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.LineItem.AdjustableQuantity#extraParams} for the
         * field documentation.
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
         * map. See {@link SessionUpdateParams.LineItem.AdjustableQuantity#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The maximum quantity the customer can purchase for the Checkout Session. By default this
         * value is 99. You can specify a value up to 999999.
         */
        public Builder setMaximum(Long maximum) {
          this.maximum = maximum;
          return this;
        }

        /**
         * The minimum quantity the customer must purchase for the Checkout Session. By default this
         * value is 0.
         */
        public Builder setMinimum(Long minimum) {
          this.minimum = minimum;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PriceData {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      Object currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
       * href="https://docs.stripe.com/api/prices">Price</a> will belong to. One of {@code product}
       * or {@code product_data} is required.
       */
      @SerializedName("product")
      Object product;

      /**
       * Data used to generate a new <a href="https://docs.stripe.com/api/products">Product</a>
       * object inline. One of {@code product} or {@code product_data} is required.
       */
      @SerializedName("product_data")
      ProductData productData;

      /**
       * The recurring components of a price such as {@code interval} and {@code interval_count}.
       */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Only required if a <a
       * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A non-negative integer in cents (or local equivalent) representing how much to charge. One
       * of {@code unit_amount} or {@code unit_amount_decimal} is required.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      Object unitAmountDecimal;

      private PriceData(
          Object currency,
          Map<String, Object> extraParams,
          Object product,
          ProductData productData,
          Recurring recurring,
          TaxBehavior taxBehavior,
          Long unitAmount,
          Object unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.productData = productData;
        this.recurring = recurring;
        this.taxBehavior = taxBehavior;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object currency;

        private Map<String, Object> extraParams;

        private Object product;

        private ProductData productData;

        private Recurring recurring;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private Object unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.LineItem.PriceData build() {
          return new SessionUpdateParams.LineItem.PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.productData,
              this.recurring,
              this.taxBehavior,
              this.unitAmount,
              this.unitAmountDecimal);
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.LineItem.PriceData#extraParams} for the field
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
         * map. See {@link SessionUpdateParams.LineItem.PriceData#extraParams} for the field
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
         * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to. One of {@code
         * product} or {@code product_data} is required.
         */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to. One of {@code
         * product} or {@code product_data} is required.
         */
        public Builder setProduct(EmptyParam product) {
          this.product = product;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://docs.stripe.com/api/products">Product</a>
         * object inline. One of {@code product} or {@code product_data} is required.
         */
        public Builder setProductData(
            SessionUpdateParams.LineItem.PriceData.ProductData productData) {
          this.productData = productData;
          return this;
        }

        /**
         * The recurring components of a price such as {@code interval} and {@code interval_count}.
         */
        public Builder setRecurring(SessionUpdateParams.LineItem.PriceData.Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /**
         * Only required if a <a
         * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            SessionUpdateParams.LineItem.PriceData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A non-negative integer in cents (or local equivalent) representing how much to charge.
         * One of {@code unit_amount} or {@code unit_amount_decimal} is required.
         */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ProductData {
        /**
         * The product's description, meant to be displayable to the customer. Use this field to
         * optionally store a long form explanation of the product being sold for your own rendering
         * purposes.
         */
        @SerializedName("description")
        Object description;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * A list of up to 8 URLs of images for this product, meant to be displayable to the
         * customer.
         */
        @SerializedName("images")
        List<String> images;

        /**
         * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /**
         * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
         */
        @SerializedName("name")
        Object name;

        /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
        @SerializedName("tax_code")
        Object taxCode;

        /**
         * Tax details for this product, including the <a
         * href="https://stripe.com/tax/tax-codes">tax code</a> and an optional performance
         * location.
         */
        @SerializedName("tax_details")
        TaxDetails taxDetails;

        /**
         * A label that represents units of this product. When set, this will be included in
         * customers' receipts, invoices, Checkout, and the customer portal.
         */
        @SerializedName("unit_label")
        Object unitLabel;

        private ProductData(
            Object description,
            Map<String, Object> extraParams,
            List<String> images,
            Map<String, String> metadata,
            Object name,
            Object taxCode,
            TaxDetails taxDetails,
            Object unitLabel) {
          this.description = description;
          this.extraParams = extraParams;
          this.images = images;
          this.metadata = metadata;
          this.name = name;
          this.taxCode = taxCode;
          this.taxDetails = taxDetails;
          this.unitLabel = unitLabel;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object description;

          private Map<String, Object> extraParams;

          private List<String> images;

          private Map<String, String> metadata;

          private Object name;

          private Object taxCode;

          private TaxDetails taxDetails;

          private Object unitLabel;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.LineItem.PriceData.ProductData build() {
            return new SessionUpdateParams.LineItem.PriceData.ProductData(
                this.description,
                this.extraParams,
                this.images,
                this.metadata,
                this.name,
                this.taxCode,
                this.taxDetails,
                this.unitLabel);
          }

          /**
           * The product's description, meant to be displayable to the customer. Use this field to
           * optionally store a long form explanation of the product being sold for your own
           * rendering purposes.
           */
          public Builder setDescription(String description) {
            this.description = description;
            return this;
          }

          /**
           * The product's description, meant to be displayable to the customer. Use this field to
           * optionally store a long form explanation of the product being sold for your own
           * rendering purposes.
           */
          public Builder setDescription(EmptyParam description) {
            this.description = description;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionUpdateParams.LineItem.PriceData.ProductData#extraParams} for the
           * field documentation.
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
           * map. See {@link SessionUpdateParams.LineItem.PriceData.ProductData#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `images` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * SessionUpdateParams.LineItem.PriceData.ProductData#images} for the field documentation.
           */
          public Builder addImage(String element) {
            if (this.images == null) {
              this.images = new ArrayList<>();
            }
            this.images.add(element);
            return this;
          }

          /**
           * Add all elements to `images` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SessionUpdateParams.LineItem.PriceData.ProductData#images} for the field documentation.
           */
          public Builder addAllImage(List<String> elements) {
            if (this.images == null) {
              this.images = new ArrayList<>();
            }
            this.images.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link SessionUpdateParams.LineItem.PriceData.ProductData#metadata} for the field
           * documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionUpdateParams.LineItem.PriceData.ProductData#metadata} for the
           * field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
           */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }

          /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
          public Builder setTaxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
          }

          /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
          public Builder setTaxCode(EmptyParam taxCode) {
            this.taxCode = taxCode;
            return this;
          }

          /**
           * Tax details for this product, including the <a
           * href="https://stripe.com/tax/tax-codes">tax code</a> and an optional performance
           * location.
           */
          public Builder setTaxDetails(
              SessionUpdateParams.LineItem.PriceData.ProductData.TaxDetails taxDetails) {
            this.taxDetails = taxDetails;
            return this;
          }

          /**
           * A label that represents units of this product. When set, this will be included in
           * customers' receipts, invoices, Checkout, and the customer portal.
           */
          public Builder setUnitLabel(String unitLabel) {
            this.unitLabel = unitLabel;
            return this;
          }

          /**
           * A label that represents units of this product. When set, this will be included in
           * customers' receipts, invoices, Checkout, and the customer portal.
           */
          public Builder setUnitLabel(EmptyParam unitLabel) {
            this.unitLabel = unitLabel;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class TaxDetails {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * A tax location ID. Depending on the <a
           * href="https://stripe.com/tax/tax-for-tickets/reference/tax-location-performance">tax
           * code</a>, this is required, optional, or not supported.
           */
          @SerializedName("performance_location")
          Object performanceLocation;

          /**
           * <strong>Required.</strong> A <a href="https://docs.stripe.com/tax/tax-categories">tax
           * code</a> ID.
           */
          @SerializedName("tax_code")
          Object taxCode;

          private TaxDetails(
              Map<String, Object> extraParams, Object performanceLocation, Object taxCode) {
            this.extraParams = extraParams;
            this.performanceLocation = performanceLocation;
            this.taxCode = taxCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object performanceLocation;

            private Object taxCode;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionUpdateParams.LineItem.PriceData.ProductData.TaxDetails build() {
              return new SessionUpdateParams.LineItem.PriceData.ProductData.TaxDetails(
                  this.extraParams, this.performanceLocation, this.taxCode);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.LineItem.PriceData.ProductData.TaxDetails#extraParams} for the
             * field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.LineItem.PriceData.ProductData.TaxDetails#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * A tax location ID. Depending on the <a
             * href="https://stripe.com/tax/tax-for-tickets/reference/tax-location-performance">tax
             * code</a>, this is required, optional, or not supported.
             */
            public Builder setPerformanceLocation(String performanceLocation) {
              this.performanceLocation = performanceLocation;
              return this;
            }

            /**
             * A tax location ID. Depending on the <a
             * href="https://stripe.com/tax/tax-for-tickets/reference/tax-location-performance">tax
             * code</a>, this is required, optional, or not supported.
             */
            public Builder setPerformanceLocation(EmptyParam performanceLocation) {
              this.performanceLocation = performanceLocation;
              return this;
            }

            /**
             * <strong>Required.</strong> A <a href="https://docs.stripe.com/tax/tax-categories">tax
             * code</a> ID.
             */
            public Builder setTaxCode(String taxCode) {
              this.taxCode = taxCode;
              return this;
            }

            /**
             * <strong>Required.</strong> A <a href="https://docs.stripe.com/tax/tax-categories">tax
             * code</a> ID.
             */
            public Builder setTaxCode(EmptyParam taxCode) {
              this.taxCode = taxCode;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Recurring {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three years
         * interval allowed (3 years, 36 months, or 156 weeks).
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Recurring(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.LineItem.PriceData.Recurring build() {
            return new SessionUpdateParams.LineItem.PriceData.Recurring(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionUpdateParams.LineItem.PriceData.Recurring#extraParams} for the
           * field documentation.
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
           * map. See {@link SessionUpdateParams.LineItem.PriceData.Recurring#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              SessionUpdateParams.LineItem.PriceData.Recurring.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
           * years interval allowed (3 years, 36 months, or 156 weeks).
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingOption {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the Shipping Rate to use for this shipping option. */
    @SerializedName("shipping_rate")
    Object shippingRate;

    /** Parameters to be passed to Shipping Rate creation for this shipping option. */
    @SerializedName("shipping_rate_data")
    ShippingRateData shippingRateData;

    private ShippingOption(
        Map<String, Object> extraParams, Object shippingRate, ShippingRateData shippingRateData) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.shippingRateData = shippingRateData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object shippingRate;

      private ShippingRateData shippingRateData;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.ShippingOption build() {
        return new SessionUpdateParams.ShippingOption(
            this.extraParams, this.shippingRate, this.shippingRateData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.ShippingOption#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.ShippingOption#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the Shipping Rate to use for this shipping option. */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** The ID of the Shipping Rate to use for this shipping option. */
      public Builder setShippingRate(EmptyParam shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** Parameters to be passed to Shipping Rate creation for this shipping option. */
      public Builder setShippingRateData(
          SessionUpdateParams.ShippingOption.ShippingRateData shippingRateData) {
        this.shippingRateData = shippingRateData;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingRateData {
      /**
       * The estimated range for how long shipping will take, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("delivery_estimate")
      DeliveryEstimate deliveryEstimate;

      /**
       * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("display_name")
      Object displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Describes a fixed amount to charge for shipping. Must be present if type is {@code
       * fixed_amount}.
       */
      @SerializedName("fixed_amount")
      FixedAmount fixedAmount;

      /**
       * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. The Shipping tax
       * code is {@code txcd_92010001}.
       */
      @SerializedName("tax_code")
      Object taxCode;

      /** The type of calculation to use on the shipping rate. */
      @SerializedName("type")
      Type type;

      private ShippingRateData(
          DeliveryEstimate deliveryEstimate,
          Object displayName,
          Map<String, Object> extraParams,
          FixedAmount fixedAmount,
          Map<String, String> metadata,
          TaxBehavior taxBehavior,
          Object taxCode,
          Type type) {
        this.deliveryEstimate = deliveryEstimate;
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.fixedAmount = fixedAmount;
        this.metadata = metadata;
        this.taxBehavior = taxBehavior;
        this.taxCode = taxCode;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DeliveryEstimate deliveryEstimate;

        private Object displayName;

        private Map<String, Object> extraParams;

        private FixedAmount fixedAmount;

        private Map<String, String> metadata;

        private TaxBehavior taxBehavior;

        private Object taxCode;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.ShippingOption.ShippingRateData build() {
          return new SessionUpdateParams.ShippingOption.ShippingRateData(
              this.deliveryEstimate,
              this.displayName,
              this.extraParams,
              this.fixedAmount,
              this.metadata,
              this.taxBehavior,
              this.taxCode,
              this.type);
        }

        /**
         * The estimated range for how long shipping will take, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDeliveryEstimate(
            SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate deliveryEstimate) {
          this.deliveryEstimate = deliveryEstimate;
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(EmptyParam displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.ShippingOption.ShippingRateData#extraParams} for the
         * field documentation.
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
         * map. See {@link SessionUpdateParams.ShippingOption.ShippingRateData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Describes a fixed amount to charge for shipping. Must be present if type is {@code
         * fixed_amount}.
         */
        public Builder setFixedAmount(
            SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount fixedAmount) {
          this.fixedAmount = fixedAmount;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SessionUpdateParams.ShippingOption.ShippingRateData#metadata} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.ShippingOption.ShippingRateData#metadata} for the
         * field documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
         * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        public Builder setTaxBehavior(
            SessionUpdateParams.ShippingOption.ShippingRateData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(String taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /**
         * A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(EmptyParam taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /** The type of calculation to use on the shipping rate. */
        public Builder setType(SessionUpdateParams.ShippingOption.ShippingRateData.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DeliveryEstimate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
         * infinite.
         */
        @SerializedName("maximum")
        Maximum maximum;

        /** The lower bound of the estimated range. If empty, represents no lower bound. */
        @SerializedName("minimum")
        Minimum minimum;

        private DeliveryEstimate(
            Map<String, Object> extraParams, Maximum maximum, Minimum minimum) {
          this.extraParams = extraParams;
          this.maximum = maximum;
          this.minimum = minimum;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Maximum maximum;

          private Minimum minimum;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate build() {
            return new SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate(
                this.extraParams, this.maximum, this.minimum);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate#extraParams} for
           * the field documentation.
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
           * map. See {@link
           * SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
           * infinite.
           */
          public Builder setMaximum(
              SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum
                  maximum) {
            this.maximum = maximum;
            return this;
          }

          /** The lower bound of the estimated range. If empty, represents no lower bound. */
          public Builder setMinimum(
              SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum
                  minimum) {
            this.minimum = minimum;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Maximum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Maximum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum
                build() {
              return new SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate
                  .Maximum(this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Maximum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Minimum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Minimum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum
                build() {
              return new SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate
                  .Minimum(this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                SessionUpdateParams.ShippingOption.ShippingRateData.DeliveryEstimate.Minimum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class FixedAmount {
        /**
         * <strong>Required.</strong> A non-negative integer in cents representing how much to
         * charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        Object currency;

        /**
         * Shipping rates defined in each available currency option. Each key must be a three-letter
         * <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
         * href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency_options")
        Map<String, SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption>
            currencyOptions;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private FixedAmount(
            Long amount,
            Object currency,
            Map<
                    String,
                    SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption>
                currencyOptions,
            Map<String, Object> extraParams) {
          this.amount = amount;
          this.currency = currency;
          this.currencyOptions = currencyOptions;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Object currency;

          private Map<
                  String,
                  SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption>
              currencyOptions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount build() {
            return new SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount(
                this.amount, this.currency, this.currencyOptions, this.extraParams);
          }

          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount#currencyOptions} for
           * the field documentation.
           */
          public Builder putCurrencyOption(
              String key,
              SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption
                  value) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the
           * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
           * original map. See {@link
           * SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount#currencyOptions} for
           * the field documentation.
           */
          public Builder putAllCurrencyOption(
              Map<
                      String,
                      SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount
                          .CurrencyOption>
                  map) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount#extraParams} for the
           * field documentation.
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
           * map. See {@link
           * SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CurrencyOption {
          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          private CurrencyOption(
              Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.taxBehavior = taxBehavior;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private TaxBehavior taxBehavior;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption
                build() {
              return new SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount
                  .CurrencyOption(this.amount, this.extraParams, this.taxBehavior);
            }

            /**
             * <strong>Required.</strong> A non-negative integer in cents representing how much to
             * charge.
             */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes.
             * One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
             */
            public Builder setTaxBehavior(
                SessionUpdateParams.ShippingOption.ShippingRateData.FixedAmount.CurrencyOption
                        .TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
            }
          }

          public enum TaxBehavior implements ApiRequestParams.EnumParam {
            @SerializedName("exclusive")
            EXCLUSIVE("exclusive"),

            @SerializedName("inclusive")
            INCLUSIVE("inclusive"),

            @SerializedName("unspecified")
            UNSPECIFIED("unspecified");

            @Getter(onMethod_ = {@Override})
            private final String value;

            TaxBehavior(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("fixed_amount")
        FIXED_AMOUNT("fixed_amount");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionData {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. Has to be at least 48 hours in the future.
     */
    @SerializedName("trial_end")
    Long trialEnd;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time. Has to be at least 1.
     */
    @SerializedName("trial_period_days")
    Object trialPeriodDays;

    private SubscriptionData(
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Long trialEnd,
        Object trialPeriodDays) {
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.trialEnd = trialEnd;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Long trialEnd;

      private Object trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionUpdateParams.SubscriptionData build() {
        return new SessionUpdateParams.SubscriptionData(
            this.extraParams, this.invoiceSettings, this.trialEnd, this.trialPeriodDays);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionUpdateParams.SubscriptionData#extraParams} for the field documentation.
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
       * See {@link SessionUpdateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(
          SessionUpdateParams.SubscriptionData.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
      }

      /**
       * Unix timestamp representing the end of the trial period the customer will get before being
       * charged for the first time. Has to be at least 48 hours in the future.
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time. Has to be at least 1.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time. Has to be at least 1.
       */
      public Builder setTrialPeriodDays(EmptyParam trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      private InvoiceSettings(Map<String, Object> extraParams, Issuer issuer) {
        this.extraParams = extraParams;
        this.issuer = issuer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Issuer issuer;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionUpdateParams.SubscriptionData.InvoiceSettings build() {
          return new SessionUpdateParams.SubscriptionData.InvoiceSettings(
              this.extraParams, this.issuer);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionUpdateParams.SubscriptionData.InvoiceSettings#extraParams} for the
         * field documentation.
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
         * map. See {@link SessionUpdateParams.SubscriptionData.InvoiceSettings#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            SessionUpdateParams.SubscriptionData.InvoiceSettings.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionUpdateParams.SubscriptionData.InvoiceSettings.Issuer build() {
            return new SessionUpdateParams.SubscriptionData.InvoiceSettings.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionUpdateParams.SubscriptionData.InvoiceSettings.Issuer#extraParams} for the field
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
           * map. See {@link
           * SessionUpdateParams.SubscriptionData.InvoiceSettings.Issuer#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              SessionUpdateParams.SubscriptionData.InvoiceSettings.Issuer.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }
  }
}
