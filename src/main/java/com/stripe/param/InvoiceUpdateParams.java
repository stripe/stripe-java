package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InvoiceUpdateParams extends ApiRequestParams {
  /**
   * A fee in %s that will be applied to the invoice and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
   * order to take an application fee. For more information, see the application fees
   * [documentation](https://stripe.com/docs/connect/subscriptions#invoices).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Controls whether Stripe will perform [automatic
   * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /**
   * Either `charge_automatically` or `send_invoice`. This field can be updated only on `draft`
   * invoices.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /**
   * A list of up to 4 custom fields to be displayed on the invoice. If a value for `custom_fields`
   * is specified, the list specified will replace the existing custom field list on this invoice.
   * Pass an empty string to remove previously-defined fields.
   */
  @SerializedName("custom_fields")
  Object customFields;

  /**
   * The number of days from which the invoice is created until it is due. Only valid for invoices
   * where `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  Object defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  Object defaultSource;

  /**
   * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an
   * empty string to remove previously-defined tax rates.
   */
  @SerializedName("default_tax_rates")
  Object defaultTaxRates;

  @SerializedName("description")
  Object description;

  /**
   * The date on which payment for this invoice is due. Only valid for invoices where
   * `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
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
  Object footer;

  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * `statement_descriptor` will be set to the first subscription item's product's
   * `statement_descriptor`.
   */
  @SerializedName("statement_descriptor")
  Object statementDescriptor;

  /**
   * The percent tax rate applied to the invoice, represented as a non-negative decimal number (with
   * at most four decimal places) between 0 and 100. To unset a previously-set value, pass an empty
   * string. This field can be updated only on `draft` invoices. This field has been deprecated and
   * will be removed in a future API version, for further information view the [migration
   * docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
   */
  @SerializedName("tax_percent")
  Object taxPercent;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge. This will be unset if you POST an
   * empty value.
   */
  @SerializedName("transfer_data")
  Object transferData;

  private InvoiceUpdateParams(
      Long applicationFeeAmount,
      Boolean autoAdvance,
      CollectionMethod collectionMethod,
      Object customFields,
      Long daysUntilDue,
      Object defaultPaymentMethod,
      Object defaultSource,
      Object defaultTaxRates,
      Object description,
      Long dueDate,
      List<String> expand,
      Map<String, Object> extraParams,
      Object footer,
      Map<String, String> metadata,
      Object statementDescriptor,
      Object taxPercent,
      Object transferData) {
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.collectionMethod = collectionMethod;
    this.customFields = customFields;
    this.daysUntilDue = daysUntilDue;
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.defaultSource = defaultSource;
    this.defaultTaxRates = defaultTaxRates;
    this.description = description;
    this.dueDate = dueDate;
    this.expand = expand;
    this.extraParams = extraParams;
    this.footer = footer;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
    this.taxPercent = taxPercent;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private CollectionMethod collectionMethod;

    private Object customFields;

    private Long daysUntilDue;

    private Object defaultPaymentMethod;

    private Object defaultSource;

    private Object defaultTaxRates;

    private Object description;

    private Long dueDate;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object footer;

    private Map<String, String> metadata;

    private Object statementDescriptor;

    private Object taxPercent;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceUpdateParams build() {
      return new InvoiceUpdateParams(
          this.applicationFeeAmount,
          this.autoAdvance,
          this.collectionMethod,
          this.customFields,
          this.daysUntilDue,
          this.defaultPaymentMethod,
          this.defaultSource,
          this.defaultTaxRates,
          this.description,
          this.dueDate,
          this.expand,
          this.extraParams,
          this.footer,
          this.metadata,
          this.statementDescriptor,
          this.taxPercent,
          this.transferData);
    }

    /**
     * A fee in %s that will be applied to the invoice and transferred to the application owner's
     * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
     * order to take an application fee. For more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#invoices).
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Controls whether Stripe will perform [automatic
     * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
     */
    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /**
     * Either `charge_automatically` or `send_invoice`. This field can be updated only on `draft`
     * invoices.
     */
    public Builder setCollectionMethod(CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addCustomField(CustomField element) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceUpdateParams.CustomField>();
      }
      ((List<InvoiceUpdateParams.CustomField>) this.customFields).add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllCustomField(List<CustomField> elements) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceUpdateParams.CustomField>();
      }
      ((List<InvoiceUpdateParams.CustomField>) this.customFields).addAll(elements);
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for
     * `custom_fields` is specified, the list specified will replace the existing custom field list
     * on this invoice. Pass an empty string to remove previously-defined fields.
     */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for
     * `custom_fields` is specified, the list specified will replace the existing custom field list
     * on this invoice. Pass an empty string to remove previously-defined fields.
     */
    public Builder setCustomFields(List<CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * The number of days from which the invoice is created until it is due. Only valid for invoices
     * where `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
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
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
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
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public Builder setDefaultSource(EmptyParam defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#defaultTaxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDefaultTaxRate(String element) {
      if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
        this.defaultTaxRates = new ArrayList<String>();
      }
      ((List<String>) this.defaultTaxRates).add(element);
      return this;
    }

    /**
     * Add all elements to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#defaultTaxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDefaultTaxRate(List<String> elements) {
      if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
        this.defaultTaxRates = new ArrayList<String>();
      }
      ((List<String>) this.defaultTaxRates).addAll(elements);
      return this;
    }

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an
     * empty string to remove previously-defined tax rates.
     */
    public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an
     * empty string to remove previously-defined tax rates.
     */
    public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Only valid for invoices where
     * `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
     */
    public Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#expand} for the field documentation.
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
     * InvoiceUpdateParams#expand} for the field documentation.
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
     * InvoiceUpdateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceUpdateParams#extraParams} for the field documentation.
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

    /** Footer to be displayed on the invoice. */
    public Builder setFooter(EmptyParam footer) {
      this.footer = footer;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceUpdateParams#metadata} for the field documentation.
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
     * See {@link InvoiceUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * `statement_descriptor` will be set to the first subscription item's product's
     * `statement_descriptor`.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * `statement_descriptor` will be set to the first subscription item's product's
     * `statement_descriptor`.
     */
    public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The percent tax rate applied to the invoice, represented as a non-negative decimal number
     * (with at most four decimal places) between 0 and 100. To unset a previously-set value, pass
     * an empty string. This field can be updated only on `draft` invoices. This field has been
     * deprecated and will be removed in a future API version, for further information view the
     * [migration docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
     */
    public Builder setTaxPercent(BigDecimal taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * The percent tax rate applied to the invoice, represented as a non-negative decimal number
     * (with at most four decimal places) between 0 and 100. To unset a previously-set value, pass
     * an empty string. This field can be updated only on `draft` invoices. This field has been
     * deprecated and will be removed in a future API version, for further information view the
     * [migration docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
     */
    public Builder setTaxPercent(EmptyParam taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(EmptyParam transferData) {
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
    Object name;

    /** The value of the custom field. This may be up to 30 characters. */
    @SerializedName("value")
    Object value;

    private CustomField(Map<String, Object> extraParams, Object name, Object value) {
      this.extraParams = extraParams;
      this.name = name;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object name;

      private Object value;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomField build() {
        return new CustomField(this.extraParams, this.name, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.CustomField#extraParams} for the field documentation.
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
       * See {@link InvoiceUpdateParams.CustomField#extraParams} for the field documentation.
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

      /** The name of the custom field. This may be up to 30 characters. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** The value of the custom field. This may be up to 30 characters. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }

      /** The value of the custom field. This may be up to 30 characters. */
      public Builder setValue(EmptyParam value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  public static class TransferData {
    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    Object destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Object destination, Map<String, Object> extraParams) {
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public TransferData build() {
        return new TransferData(this.destination, this.extraParams);
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(EmptyParam destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link InvoiceUpdateParams.TransferData#extraParams} for the field documentation.
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
