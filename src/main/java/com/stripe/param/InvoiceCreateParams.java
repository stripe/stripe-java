// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InvoiceCreateParams extends ApiRequestParams {
  /** The account tax IDs associated with the invoice. Only editable when the invoice is a draft. */
  @SerializedName("account_tax_ids")
  Object accountTaxIds;

  /**
   * A fee in %s that will be applied to the invoice and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
   * order to take an application fee. For more information, see the application fees <a
   * href="https://stripe.com/docs/billing/invoices/connect#collecting-fees">documentation</a>.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Controls whether Stripe will perform <a
   * href="https://stripe.com/docs/billing/invoices/workflow/#auto_advance">automatic collection</a>
   * of the invoice. When {@code false}, the invoice's state will not automatically advance without
   * an explicit action.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay this invoice using the default source attached to the customer. When
   * sending an invoice, Stripe will email this invoice to the customer with payment instructions.
   * Defaults to {@code charge_automatically}.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /** A list of up to 4 custom fields to be displayed on the invoice. */
  @SerializedName("custom_fields")
  Object customFields;

  /** The ID of the customer who will be billed. */
  @SerializedName("customer")
  String customer;

  /**
   * The number of days from when the invoice is created until it is due. Valid only for invoices
   * where {@code collection_method=send_invoice}.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  String defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  String defaultSource;

  /** The tax rates that will apply to any line item that does not have {@code tax_rates} set. */
  @SerializedName("default_tax_rates")
  List<String> defaultTaxRates;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as
   * 'memo' in the Dashboard.
   */
  @SerializedName("description")
  String description;

  /**
   * The coupons to redeem into discounts for the invoice. If not specified, inherits the discount
   * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
   */
  @SerializedName("discounts")
  Object discounts;

  /**
   * The date on which payment for this invoice is due. Valid only for invoices where {@code
   * collection_method=send_invoice}.
   */
  @SerializedName("due_date")
  Long dueDate;

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

  /** Footer to be displayed on the invoice. */
  @SerializedName("footer")
  String footer;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * {@code statement_descriptor} will be set to the first subscription item's product's {@code
   * statement_descriptor}.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The ID of the subscription to invoice, if any. If not set, the created invoice will include all
   * pending invoice items for the customer. If set, the created invoice will only include pending
   * invoice items for that subscription and pending invoice items not associated with any
   * subscription. The subscription's billing cycle and regular subscription events won't be
   * affected.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private InvoiceCreateParams(
      Object accountTaxIds,
      Long applicationFeeAmount,
      Boolean autoAdvance,
      CollectionMethod collectionMethod,
      Object customFields,
      String customer,
      Long daysUntilDue,
      String defaultPaymentMethod,
      String defaultSource,
      List<String> defaultTaxRates,
      String description,
      Object discounts,
      Long dueDate,
      List<String> expand,
      Map<String, Object> extraParams,
      String footer,
      Object metadata,
      String statementDescriptor,
      String subscription,
      TransferData transferData) {
    this.accountTaxIds = accountTaxIds;
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.collectionMethod = collectionMethod;
    this.customFields = customFields;
    this.customer = customer;
    this.daysUntilDue = daysUntilDue;
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.defaultSource = defaultSource;
    this.defaultTaxRates = defaultTaxRates;
    this.description = description;
    this.discounts = discounts;
    this.dueDate = dueDate;
    this.expand = expand;
    this.extraParams = extraParams;
    this.footer = footer;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
    this.subscription = subscription;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountTaxIds;

    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private CollectionMethod collectionMethod;

    private Object customFields;

    private String customer;

    private Long daysUntilDue;

    private String defaultPaymentMethod;

    private String defaultSource;

    private List<String> defaultTaxRates;

    private String description;

    private Object discounts;

    private Long dueDate;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String footer;

    private Object metadata;

    private String statementDescriptor;

    private String subscription;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceCreateParams build() {
      return new InvoiceCreateParams(
          this.accountTaxIds,
          this.applicationFeeAmount,
          this.autoAdvance,
          this.collectionMethod,
          this.customFields,
          this.customer,
          this.daysUntilDue,
          this.defaultPaymentMethod,
          this.defaultSource,
          this.defaultTaxRates,
          this.description,
          this.discounts,
          this.dueDate,
          this.expand,
          this.extraParams,
          this.footer,
          this.metadata,
          this.statementDescriptor,
          this.subscription,
          this.transferData);
    }

    /**
     * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#accountTaxIds} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAccountTaxId(String element) {
      if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
        this.accountTaxIds = new ArrayList<String>();
      }
      ((List<String>) this.accountTaxIds).add(element);
      return this;
    }

    /**
     * Add all elements to `accountTaxIds` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#accountTaxIds} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllAccountTaxId(List<String> elements) {
      if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
        this.accountTaxIds = new ArrayList<String>();
      }
      ((List<String>) this.accountTaxIds).addAll(elements);
      return this;
    }

    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
      this.accountTaxIds = accountTaxIds;
      return this;
    }

    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public Builder setAccountTaxIds(List<String> accountTaxIds) {
      this.accountTaxIds = accountTaxIds;
      return this;
    }

    /**
     * A fee in %s that will be applied to the invoice and transferred to the application owner's
     * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
     * order to take an application fee. For more information, see the application fees <a
     * href="https://stripe.com/docs/billing/invoices/connect#collecting-fees">documentation</a>.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Controls whether Stripe will perform <a
     * href="https://stripe.com/docs/billing/invoices/workflow/#auto_advance">automatic
     * collection</a> of the invoice. When {@code false}, the invoice's state will not automatically
     * advance without an explicit action.
     */
    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay this invoice using the default source attached to the customer.
     * When sending an invoice, Stripe will email this invoice to the customer with payment
     * instructions. Defaults to {@code charge_automatically}.
     */
    public Builder setCollectionMethod(CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addCustomField(CustomField element) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceCreateParams.CustomField>();
      }
      ((List<InvoiceCreateParams.CustomField>) this.customFields).add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllCustomField(List<CustomField> elements) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceCreateParams.CustomField>();
      }
      ((List<InvoiceCreateParams.CustomField>) this.customFields).addAll(elements);
      return this;
    }

    /** A list of up to 4 custom fields to be displayed on the invoice. */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /** A list of up to 4 custom fields to be displayed on the invoice. */
    public Builder setCustomFields(List<CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    /** The ID of the customer who will be billed. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The number of days from when the invoice is created until it is due. Valid only for invoices
     * where {@code collection_method=send_invoice}.
     */
    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#defaultTaxRates} for the field documentation.
     */
    public Builder addDefaultTaxRate(String element) {
      if (this.defaultTaxRates == null) {
        this.defaultTaxRates = new ArrayList<>();
      }
      this.defaultTaxRates.add(element);
      return this;
    }

    /**
     * Add all elements to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#defaultTaxRates} for the field documentation.
     */
    public Builder addAllDefaultTaxRate(List<String> elements) {
      if (this.defaultTaxRates == null) {
        this.defaultTaxRates = new ArrayList<>();
      }
      this.defaultTaxRates.addAll(elements);
      return this;
    }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. Referenced
     * as 'memo' in the Dashboard.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceCreateParams.Discount>();
      }
      ((List<InvoiceCreateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceCreateParams.Discount>();
      }
      ((List<InvoiceCreateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons to redeem into discounts for the invoice. If not specified, inherits the discount
     * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons to redeem into discounts for the invoice. If not specified, inherits the discount
     * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
     */
    public Builder setDiscounts(List<Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Valid only for invoices where {@code
     * collection_method=send_invoice}.
     */
    public Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#expand} for the field documentation.
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
     * InvoiceCreateParams#expand} for the field documentation.
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
     * InvoiceCreateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Footer to be displayed on the invoice. */
    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceCreateParams#metadata} for the field documentation.
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
     * See {@link InvoiceCreateParams#metadata} for the field documentation.
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * {@code statement_descriptor} will be set to the first subscription item's product's {@code
     * statement_descriptor}.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The ID of the subscription to invoice, if any. If not set, the created invoice will include
     * all pending invoice items for the customer. If set, the created invoice will only include
     * pending invoice items for that subscription and pending invoice items not associated with any
     * subscription. The subscription's billing cycle and regular subscription events won't be
     * affected.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge.
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  public static class CustomField {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The name of the custom field. This may be up to 30 characters. */
    @SerializedName("name")
    String name;

    /** The value of the custom field. This may be up to 30 characters. */
    @SerializedName("value")
    String value;

    private CustomField(Map<String, Object> extraParams, String name, String value) {
      this.extraParams = extraParams;
      this.name = name;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String name;

      private String value;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomField build() {
        return new CustomField(this.extraParams, this.name, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.CustomField#extraParams} for the field documentation.
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
       * See {@link InvoiceCreateParams.CustomField#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The name of the custom field. This may be up to 30 characters. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The value of the custom field. This may be up to 30 characters. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    String coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    String discount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Discount(String coupon, String discount, Map<String, Object> extraParams) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String coupon;

      private String discount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Discount build() {
        return new Discount(this.coupon, this.discount, this.extraParams);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.Discount#extraParams} for the field documentation.
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
       * See {@link InvoiceCreateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class TransferData {
    /**
     * The amount that will be transferred automatically when the invoice is paid. If no amount is
     * set, the full amount is transferred.
     */
    @SerializedName("amount")
    Long amount;

    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    String destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public TransferData build() {
        return new TransferData(this.amount, this.destination, this.extraParams);
      }

      /**
       * The amount that will be transferred automatically when the invoice is paid. If no amount is
       * set, the full amount is transferred.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link InvoiceCreateParams.TransferData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum CollectionMethod implements ApiRequestParams.EnumParam {
    @SerializedName("charge_automatically")
    CHARGE_AUTOMATICALLY("charge_automatically"),

    @SerializedName("send_invoice")
    SEND_INVOICE("send_invoice");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CollectionMethod(String value) {
      this.value = value;
    }
  }
}
