// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class BatchJobCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The endpoint configuration for the batch job. */
  @SerializedName("endpoint")
  Endpoint endpoint;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Optional field that allows the user to control how fast they want this batch job to run. Gives
   * them a control over the number of webhooks they receive.
   */
  @SerializedName("maximum_rps")
  Long maximumRps;

  /** <strong>Required.</strong> The metadata of the {@code batch_job}. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Notification suppression settings for the batch job. */
  @SerializedName("notification_suppression")
  NotificationSuppression notificationSuppression;

  /** <strong>Required.</strong> Allows the user to skip validation. */
  @SerializedName("skip_validation")
  Boolean skipValidation;

  private BatchJobCreateParams(
      Endpoint endpoint,
      Map<String, Object> extraParams,
      Long maximumRps,
      Map<String, String> metadata,
      NotificationSuppression notificationSuppression,
      Boolean skipValidation) {
    this.endpoint = endpoint;
    this.extraParams = extraParams;
    this.maximumRps = maximumRps;
    this.metadata = metadata;
    this.notificationSuppression = notificationSuppression;
    this.skipValidation = skipValidation;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Endpoint endpoint;

    private Map<String, Object> extraParams;

    private Long maximumRps;

    private Map<String, String> metadata;

    private NotificationSuppression notificationSuppression;

    private Boolean skipValidation;

    /** Finalize and obtain parameter instance from this builder. */
    public BatchJobCreateParams build() {
      return new BatchJobCreateParams(
          this.endpoint,
          this.extraParams,
          this.maximumRps,
          this.metadata,
          this.notificationSuppression,
          this.skipValidation);
    }

    /** <strong>Required.</strong> The endpoint configuration for the batch job. */
    public Builder setEndpoint(BatchJobCreateParams.Endpoint endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BatchJobCreateParams#extraParams} for the field documentation.
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
     * See {@link BatchJobCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Optional field that allows the user to control how fast they want this batch job to run.
     * Gives them a control over the number of webhooks they receive.
     */
    public Builder setMaximumRps(Long maximumRps) {
      this.maximumRps = maximumRps;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * BatchJobCreateParams#metadata} for the field documentation.
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
     * See {@link BatchJobCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Notification suppression settings for the batch job. */
    public Builder setNotificationSuppression(
        BatchJobCreateParams.NotificationSuppression notificationSuppression) {
      this.notificationSuppression = notificationSuppression;
      return this;
    }

    /** <strong>Required.</strong> Allows the user to skip validation. */
    public Builder setSkipValidation(Boolean skipValidation) {
      this.skipValidation = skipValidation;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Endpoint {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The HTTP method to use when calling the endpoint. */
    @SerializedName("http_method")
    HttpMethod httpMethod;

    /**
     * <strong>Required.</strong> The path of the endpoint to run this batch job against. In the
     * form used in the documentation. For instance, for subscription migration this would be {@code
     * /v1/subscriptions/:id/migrate}.
     */
    @SerializedName("path")
    Path path;

    private Endpoint(Map<String, Object> extraParams, HttpMethod httpMethod, Path path) {
      this.extraParams = extraParams;
      this.httpMethod = httpMethod;
      this.path = path;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private HttpMethod httpMethod;

      private Path path;

      /** Finalize and obtain parameter instance from this builder. */
      public BatchJobCreateParams.Endpoint build() {
        return new BatchJobCreateParams.Endpoint(this.extraParams, this.httpMethod, this.path);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BatchJobCreateParams.Endpoint#extraParams} for the field documentation.
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
       * See {@link BatchJobCreateParams.Endpoint#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The HTTP method to use when calling the endpoint. */
      public Builder setHttpMethod(BatchJobCreateParams.Endpoint.HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
        return this;
      }

      /**
       * <strong>Required.</strong> The path of the endpoint to run this batch job against. In the
       * form used in the documentation. For instance, for subscription migration this would be
       * {@code /v1/subscriptions/:id/migrate}.
       */
      public Builder setPath(BatchJobCreateParams.Endpoint.Path path) {
        this.path = path;
        return this;
      }
    }

    public enum HttpMethod implements ApiRequestParams.EnumParam {
      @SerializedName("delete")
      DELETE("delete"),

      @SerializedName("post")
      POST("post");

      @Getter(onMethod_ = {@Override})
      private final String value;

      HttpMethod(String value) {
        this.value = value;
      }
    }

    public enum Path implements ApiRequestParams.EnumParam {
      @SerializedName("/v1/accounts/:account")
      V1_ACCOUNT_UPDATE("/v1/accounts/:account"),

      @SerializedName("/v1/accounts")
      V1_ACCOUNT_CREATE("/v1/accounts"),

      @SerializedName("/v1/accounts/:account")
      V1_ACCOUNT_DELETE("/v1/accounts/:account"),

      @SerializedName("/v1/coupons")
      V1_COUPON_CREATE("/v1/coupons"),

      @SerializedName("/v1/coupons/:coupon")
      V1_COUPON_UPDATE("/v1/coupons/:coupon"),

      @SerializedName("/v1/coupons/:coupon")
      V1_COUPON_DELETE("/v1/coupons/:coupon"),

      @SerializedName("/v1/credit_notes")
      V1_CREDIT_NOTE_CREATE("/v1/credit_notes"),

      @SerializedName("/v1/customers/:customer")
      V1_CUSTOMER_UPDATE("/v1/customers/:customer"),

      @SerializedName("/v1/customers/:customer")
      V1_CUSTOMER_DELETE("/v1/customers/:customer"),

      @SerializedName("/v1/customers")
      V1_CUSTOMER_CREATE("/v1/customers"),

      @SerializedName("/v1/customers/:customer/discount")
      V1_CUSTOMER_DELETE_DISCOUNT("/v1/customers/:customer/discount"),

      @SerializedName("/v1/customers/:customer/funding_instructions")
      V1_CUSTOMER_CREATE_FUNDING_INSTRUCTIONS("/v1/customers/:customer/funding_instructions"),

      @SerializedName("/v1/customers/:customer/subscriptions")
      V1_CUSTOMER_CREATE_SUBSCRIPTION("/v1/customers/:customer/subscriptions"),

      @SerializedName("/v1/customers/:customer/subscriptions")
      V1_CUSTOMER_DELETE_SUBSCRIPTION("/v1/customers/:customer/subscriptions"),

      @SerializedName("/v1/customers/:customer/subscriptions/:subscription_exposed_id")
      V1_CUSTOMER_UPDATE_SUBSCRIPTION(
          "/v1/customers/:customer/subscriptions/:subscription_exposed_id"),

      @SerializedName("/v1/customers/:customer/subscriptions/:subscription_exposed_id/discount")
      V1_CUSTOMER_DELETE_SUBSCRIPTION_DISCOUNT(
          "/v1/customers/:customer/subscriptions/:subscription_exposed_id/discount"),

      @SerializedName("/v1/customers/:customer/bank_accounts")
      V1_CUSTOMER_CREATE_BANK_ACCOUNT("/v1/customers/:customer/bank_accounts"),

      @SerializedName("/v1/customers/:customer/bank_accounts/:id")
      V1_CUSTOMER_UPDATE_BANK_ACCOUNT("/v1/customers/:customer/bank_accounts/:id"),

      @SerializedName("/v1/customers/:customer/bank_accounts/:id")
      V1_CUSTOMER_DELETE_BANK_ACCOUNT("/v1/customers/:customer/bank_accounts/:id"),

      @SerializedName("/v1/customers/:customer/bank_accounts/:id/verify")
      V1_CUSTOMER_VERIFY_BANK_ACCOUNT("/v1/customers/:customer/bank_accounts/:id/verify"),

      @SerializedName("/v1/customers/:customer/cards")
      V1_CUSTOMER_CREATE_CARD("/v1/customers/:customer/cards"),

      @SerializedName("/v1/customers/:customer/cards/:id")
      V1_CUSTOMER_UPDATE_CARD("/v1/customers/:customer/cards/:id"),

      @SerializedName("/v1/customers/:customer/cards/:id")
      V1_CUSTOMER_DELETE_CARD("/v1/customers/:customer/cards/:id"),

      @SerializedName("/v1/customers/:customer/tax_ids")
      V1_CUSTOMER_DELETE_TAX_IDS("/v1/customers/:customer/tax_ids"),

      @SerializedName("/v1/customers/:customer/sources")
      V1_PAYMENT_SOURCE_CREATE("/v1/customers/:customer/sources"),

      @SerializedName("/v1/customers/:customer/sources/:id")
      V1_BANK_ACCOUNT_UPDATE("/v1/customers/:customer/sources/:id"),

      @SerializedName("/v1/customers/:customer/sources/:id")
      V1_BANK_ACCOUNT_DELETE("/v1/customers/:customer/sources/:id"),

      @SerializedName("/v1/customers/:customer/sources/:id/verify")
      V1_BANK_ACCOUNT_VERIFY("/v1/customers/:customer/sources/:id/verify"),

      @SerializedName("/v1/customers/:customer/balance_transactions")
      V1_CUSTOMER_BALANCE_TRANSACTION_CREATE("/v1/customers/:customer/balance_transactions"),

      @SerializedName("/v1/customers/:customer/balance_transactions/:transaction")
      V1_CUSTOMER_BALANCE_TRANSACTION_UPDATE(
          "/v1/customers/:customer/balance_transactions/:transaction"),

      @SerializedName("/v1/customers/:customer/cash_balance")
      V1_CASH_BALANCE_UPDATE("/v1/customers/:customer/cash_balance"),

      @SerializedName("/v1/customer_sessions")
      V1_CUSTOMER_SESSION_CREATE("/v1/customer_sessions"),

      @SerializedName("/v1/disputes/:dispute/close")
      V1_DISPUTE_CLOSE("/v1/disputes/:dispute/close"),

      @SerializedName("/v1/invoices")
      V1_INVOICE_CREATE("/v1/invoices"),

      @SerializedName("/v1/invoices/:invoice")
      V1_INVOICE_UPDATE("/v1/invoices/:invoice"),

      @SerializedName("/v1/invoices/:invoice")
      V1_INVOICE_DELETE("/v1/invoices/:invoice"),

      @SerializedName("/v1/invoices/:invoice/pay")
      V1_INVOICE_PAY("/v1/invoices/:invoice/pay"),

      @SerializedName("/v1/invoices/:invoice/send")
      V1_INVOICE_SEND_INVOICE("/v1/invoices/:invoice/send"),

      @SerializedName("/v1/invoices/:invoice/void")
      V1_INVOICE_VOID_INVOICE("/v1/invoices/:invoice/void"),

      @SerializedName("/v1/invoices/:invoice/finalize")
      V1_INVOICE_FINALIZE_INVOICE("/v1/invoices/:invoice/finalize"),

      @SerializedName("/v1/invoices/:invoice/mark_uncollectible")
      V1_INVOICE_MARK_UNCOLLECTIBLE("/v1/invoices/:invoice/mark_uncollectible"),

      @SerializedName("/v1/invoices/:invoice/update_lines")
      V1_INVOICE_UPDATE_LINES("/v1/invoices/:invoice/update_lines"),

      @SerializedName("/v1/invoices/:invoice/add_lines")
      V1_INVOICE_ADD_LINES("/v1/invoices/:invoice/add_lines"),

      @SerializedName("/v1/invoices/:invoice/remove_lines")
      V1_INVOICE_REMOVE_LINES("/v1/invoices/:invoice/remove_lines"),

      @SerializedName("/v1/invoices/create_preview")
      V1_INVOICE_CREATE_PREVIEW("/v1/invoices/create_preview"),

      @SerializedName("/v1/invoices/:invoice/lines/:line_item_id")
      V1_LINE_ITEM_UPDATE("/v1/invoices/:invoice/lines/:line_item_id"),

      @SerializedName("/v1/invoiceitems")
      V1_INVOICEITEM_CREATE("/v1/invoiceitems"),

      @SerializedName("/v1/invoiceitems/:invoiceitem")
      V1_INVOICEITEM_UPDATE("/v1/invoiceitems/:invoiceitem"),

      @SerializedName("/v1/invoiceitems/:invoiceitem")
      V1_INVOICEITEM_DELETE("/v1/invoiceitems/:invoiceitem"),

      @SerializedName("/v1/invoice_rendering_templates/:template/archive")
      V1_INVOICE_RENDERING_TEMPLATE_ARCHIVE("/v1/invoice_rendering_templates/:template/archive"),

      @SerializedName("/v1/invoice_rendering_templates/:template/unarchive")
      V1_INVOICE_RENDERING_TEMPLATE_UNARCHIVE(
          "/v1/invoice_rendering_templates/:template/unarchive"),

      @SerializedName("/v1/payment_methods/:payment_method/attach")
      V1_PAYMENT_METHOD_ATTACH("/v1/payment_methods/:payment_method/attach"),

      @SerializedName("/v1/prices")
      V1_PRICE_CREATE("/v1/prices"),

      @SerializedName("/v1/prices/:price")
      V1_PRICE_UPDATE("/v1/prices/:price"),

      @SerializedName("/v1/products")
      V1_PRODUCT_CREATE("/v1/products"),

      @SerializedName("/v1/products/:id")
      V1_PRODUCT_UPDATE("/v1/products/:id"),

      @SerializedName("/v1/products/:id")
      V1_PRODUCT_DELETE("/v1/products/:id"),

      @SerializedName("/v1/products/:product/features")
      V1_PRODUCT_FEATURE_CREATE("/v1/products/:product/features"),

      @SerializedName("/v1/products/:product/features/:id")
      V1_PRODUCT_FEATURE_DELETE("/v1/products/:product/features/:id"),

      @SerializedName("/v1/promotion_codes")
      V1_PROMOTION_CODE_CREATE("/v1/promotion_codes"),

      @SerializedName("/v1/promotion_codes/:promotion_code")
      V1_PROMOTION_CODE_UPDATE("/v1/promotion_codes/:promotion_code"),

      @SerializedName("/v1/radar/value_list_items")
      V1_RADAR_VALUE_LIST_ITEM_CREATE("/v1/radar/value_list_items"),

      @SerializedName("/v1/refunds")
      V1_REFUND_CREATE("/v1/refunds"),

      @SerializedName("/v1/refunds/:refund/cancel")
      V1_REFUND_CANCEL("/v1/refunds/:refund/cancel"),

      @SerializedName("/v1/subscriptions/:subscription_exposed_id")
      V1_SUBSCRIPTION_UPDATE("/v1/subscriptions/:subscription_exposed_id"),

      @SerializedName("/v1/subscriptions/:subscription_exposed_id")
      V1_SUBSCRIPTION_CANCEL("/v1/subscriptions/:subscription_exposed_id"),

      @SerializedName("/v1/subscriptions/:subscription/migrate")
      V1_SUBSCRIPTION_MIGRATE("/v1/subscriptions/:subscription/migrate"),

      @SerializedName("/v1/subscriptions")
      V1_SUBSCRIPTION_CREATE("/v1/subscriptions"),

      @SerializedName("/v1/subscriptions/:subscription/resume")
      V1_SUBSCRIPTION_RESUME("/v1/subscriptions/:subscription/resume"),

      @SerializedName("/v1/subscriptions/:subscription/pause")
      V1_SUBSCRIPTION_PAUSE("/v1/subscriptions/:subscription/pause"),

      @SerializedName("/v1/subscription_items")
      V1_SUBSCRIPTION_ITEM_CREATE("/v1/subscription_items"),

      @SerializedName("/v1/subscription_items/:item")
      V1_SUBSCRIPTION_ITEM_UPDATE("/v1/subscription_items/:item"),

      @SerializedName("/v1/subscription_items/:item")
      V1_SUBSCRIPTION_ITEM_DELETE("/v1/subscription_items/:item"),

      @SerializedName("/v1/subscription_schedules")
      V1_SUBSCRIPTION_SCHEDULE_CREATE("/v1/subscription_schedules"),

      @SerializedName("/v1/subscription_schedules/:schedule")
      V1_SUBSCRIPTION_SCHEDULE_UPDATE("/v1/subscription_schedules/:schedule"),

      @SerializedName("/v1/subscription_schedules/:schedule/cancel")
      V1_SUBSCRIPTION_SCHEDULE_CANCEL("/v1/subscription_schedules/:schedule/cancel"),

      @SerializedName("/v1/subscription_schedules/:schedule/release")
      V1_SUBSCRIPTION_SCHEDULE_RELEASE("/v1/subscription_schedules/:schedule/release"),

      @SerializedName("/v1/tax/registrations")
      V1_TAX_REGISTRATION_CREATE("/v1/tax/registrations"),

      @SerializedName("/v1/tax/registrations/:id")
      V1_TAX_REGISTRATION_UPDATE("/v1/tax/registrations/:id"),

      @SerializedName("/v1/tax/settings")
      V1_TAX_SETTINGS_UPDATE("/v1/tax/settings"),

      @SerializedName("/v1/tax/transactions/create_reversal")
      V1_TAX_TRANSACTION_CREATE_REVERSAL("/v1/tax/transactions/create_reversal"),

      @SerializedName("/v1/tax_ids")
      V1_TAX_ID_CREATE("/v1/tax_ids"),

      @SerializedName("/v1/tax_ids/:id")
      V1_TAX_ID_UPDATE("/v1/tax_ids/:id"),

      @SerializedName("/v1/customers/:customer/tax_ids")
      V1_TAX_ID_CREATE_FOR_CUSTOMER("/v1/customers/:customer/tax_ids"),

      @SerializedName("/v1/customers/:customer/tax_ids/:id")
      V1_TAX_ID_DELETE("/v1/customers/:customer/tax_ids/:id"),

      @SerializedName("/v1/tax_rates")
      V1_TAX_RATE_CREATE("/v1/tax_rates"),

      @SerializedName("/v1/tax_rates/:tax_rate")
      V1_TAX_RATE_UPDATE("/v1/tax_rates/:tax_rate");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Path(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NotificationSuppression {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The scope of notification suppression. */
    @SerializedName("scope")
    Scope scope;

    private NotificationSuppression(Map<String, Object> extraParams, Scope scope) {
      this.extraParams = extraParams;
      this.scope = scope;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Scope scope;

      /** Finalize and obtain parameter instance from this builder. */
      public BatchJobCreateParams.NotificationSuppression build() {
        return new BatchJobCreateParams.NotificationSuppression(this.extraParams, this.scope);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BatchJobCreateParams.NotificationSuppression#extraParams} for the field documentation.
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
       * See {@link BatchJobCreateParams.NotificationSuppression#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The scope of notification suppression. */
      public Builder setScope(BatchJobCreateParams.NotificationSuppression.Scope scope) {
        this.scope = scope;
        return this;
      }
    }

    public enum Scope implements ApiRequestParams.EnumParam {
      @SerializedName("all")
      ALL("all"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Scope(String value) {
        this.value = value;
      }
    }
  }
}
