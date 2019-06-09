package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   * A list of up to 4 custom fields to be displayed on the invoice. If a value for `custom_fields`
   * is specified, the list specified will replace the existing custom field list on this invoice.
   */
  @SerializedName("custom_fields")
  Object customFields;

  /**
   * The number of days from which the invoice is created until it is due. Only valid for invoices
   * where `billing=send_invoice`. This field can only be updated on `draft` invoices.
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

  /**
   * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an
   * empty string to remove previously-set default tax rates.
   */
  @SerializedName("default_tax_rates")
  Object defaultTaxRates;

  @SerializedName("description")
  String description;

  /**
   * The date on which payment for this invoice is due. Only valid for invoices where
   * `billing=send_invoice`. This field can only be updated on `draft` invoices.
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

  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * `statement_descriptor` will be set to the first subscription item's product's
   * `statement_descriptor`.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

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
      Object customFields,
      Long daysUntilDue,
      String defaultPaymentMethod,
      String defaultSource,
      Object defaultTaxRates,
      String description,
      Long dueDate,
      List<String> expand,
      Map<String, Object> extraParams,
      String footer,
      Map<String, String> metadata,
      String statementDescriptor,
      Object taxPercent,
      Object transferData) {

    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
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

  public static InvoiceUpdateParams.Builder builder() {
    return new InvoiceUpdateParams.Builder();
  }

  public static class Builder {
    private Long applicationFeeAmount;
    private Boolean autoAdvance;
    private Object customFields;
    private Long daysUntilDue;
    private String defaultPaymentMethod;
    private String defaultSource;
    private Object defaultTaxRates;
    private String description;
    private Long dueDate;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private String footer;
    private Map<String, String> metadata;
    private String statementDescriptor;
    private Object taxPercent;
    private Object transferData;

    public InvoiceUpdateParams build() {
      return new InvoiceUpdateParams(
          this.applicationFeeAmount,
          this.autoAdvance,
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
    public InvoiceUpdateParams.Builder setApplicationFeeAmount(Long applicationFeeAmount) {

      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Controls whether Stripe will perform [automatic
     * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
     */
    public InvoiceUpdateParams.Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for
     * `custom_fields` is specified, the list specified will replace the existing custom field list
     * on this invoice.
     */
    public InvoiceUpdateParams.Builder setCustomFields(
        List<InvoiceUpdateParams.CustomField> customFields) {

      this.customFields = customFields;
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for
     * `custom_fields` is specified, the list specified will replace the existing custom field list
     * on this invoice.
     */
    public InvoiceUpdateParams.Builder setCustomFields(EmptyParam customFields) {

      this.customFields = customFields;
      return this;
    }

    /**
     * The number of days from which the invoice is created until it is due. Only valid for invoices
     * where `billing=send_invoice`. This field can only be updated on `draft` invoices.
     */
    public InvoiceUpdateParams.Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public InvoiceUpdateParams.Builder setDefaultPaymentMethod(String defaultPaymentMethod) {

      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public InvoiceUpdateParams.Builder setDefaultSource(String defaultSource) {

      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an
     * empty string to remove previously-set default tax rates.
     */
    public InvoiceUpdateParams.Builder setDefaultTaxRates(List<String> defaultTaxRates) {

      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an
     * empty string to remove previously-set default tax rates.
     */
    public InvoiceUpdateParams.Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {

      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    public InvoiceUpdateParams.Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Only valid for invoices where
     * `billing=send_invoice`. This field can only be updated on `draft` invoices.
     */
    public InvoiceUpdateParams.Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#expand} for the field documentation.
     */
    public InvoiceUpdateParams.Builder addExpand(String element) {
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
    public InvoiceUpdateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceUpdateParams#extraParams} for the field documentation.
     */
    public InvoiceUpdateParams.Builder putExtraParam(String key, Object value) {

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
    public InvoiceUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Footer to be displayed on the invoice. */
    public InvoiceUpdateParams.Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    public InvoiceUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    public InvoiceUpdateParams.Builder putAllMetadata(Map<String, String> map) {

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
    public InvoiceUpdateParams.Builder setStatementDescriptor(String statementDescriptor) {

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
    public InvoiceUpdateParams.Builder setTaxPercent(BigDecimal taxPercent) {

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
    public InvoiceUpdateParams.Builder setTaxPercent(EmptyParam taxPercent) {

      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public InvoiceUpdateParams.Builder setTransferData(
        InvoiceUpdateParams.TransferData transferData) {

      this.transferData = transferData;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public InvoiceUpdateParams.Builder setTransferData(EmptyParam transferData) {

      this.transferData = transferData;
      return this;
    }
  }

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

    public static InvoiceUpdateParams.CustomField.Builder builder() {
      return new InvoiceUpdateParams.CustomField.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private String name;
      private String value;

      public InvoiceUpdateParams.CustomField build() {
        return new InvoiceUpdateParams.CustomField(this.extraParams, this.name, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.CustomField#extraParams} for the field documentation.
       */
      public InvoiceUpdateParams.CustomField.Builder putExtraParam(String key, Object value) {

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
      public InvoiceUpdateParams.CustomField.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The name of the custom field. This may be up to 30 characters. */
      public InvoiceUpdateParams.CustomField.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /** The value of the custom field. This may be up to 30 characters. */
      public InvoiceUpdateParams.CustomField.Builder setValue(String value) {

        this.value = value;
        return this;
      }
    }
  }

  public static class TransferData {

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

    private TransferData(String destination, Map<String, Object> extraParams) {

      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static InvoiceUpdateParams.TransferData.Builder builder() {
      return new InvoiceUpdateParams.TransferData.Builder();
    }

    public static class Builder {
      private String destination;
      private Map<String, Object> extraParams;

      public InvoiceUpdateParams.TransferData build() {
        return new InvoiceUpdateParams.TransferData(this.destination, this.extraParams);
      }

      /** ID of an existing, connected Stripe account. */
      public InvoiceUpdateParams.TransferData.Builder setDestination(String destination) {

        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.TransferData#extraParams} for the field documentation.
       */
      public InvoiceUpdateParams.TransferData.Builder putExtraParam(String key, Object value) {

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
      public InvoiceUpdateParams.TransferData.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }
}
