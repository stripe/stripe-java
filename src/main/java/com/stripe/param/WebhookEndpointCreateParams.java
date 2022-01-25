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
public class WebhookEndpointCreateParams extends ApiRequestParams {
  /**
   * Events sent to this endpoint will be generated with this Stripe Version instead of your
   * account's default Stripe Version.
   */
  @SerializedName("api_version")
  ApiVersion apiVersion;

  /**
   * Whether this endpoint should receive events from connected accounts ({@code true}), or from
   * your account ({@code false}). Defaults to {@code false}.
   */
  @SerializedName("connect")
  Boolean connect;

  /** An optional description of what the webhook is used for. */
  @SerializedName("description")
  String description;

  /**
   * The list of events to enable for this endpoint. You may specify {@code ['*']} to enable all
   * events, except those that require explicit selection.
   */
  @SerializedName("enabled_events")
  List<EnabledEvent> enabledEvents;

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

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The URL of the webhook endpoint. */
  @SerializedName("url")
  String url;

  private WebhookEndpointCreateParams(
      ApiVersion apiVersion,
      Boolean connect,
      String description,
      List<EnabledEvent> enabledEvents,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      String url) {
    this.apiVersion = apiVersion;
    this.connect = connect;
    this.description = description;
    this.enabledEvents = enabledEvents;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.url = url;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private ApiVersion apiVersion;

    private Boolean connect;

    private String description;

    private List<EnabledEvent> enabledEvents;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private String url;

    /** Finalize and obtain parameter instance from this builder. */
    public WebhookEndpointCreateParams build() {
      return new WebhookEndpointCreateParams(
          this.apiVersion,
          this.connect,
          this.description,
          this.enabledEvents,
          this.expand,
          this.extraParams,
          this.metadata,
          this.url);
    }

    /**
     * Events sent to this endpoint will be generated with this Stripe Version instead of your
     * account's default Stripe Version.
     */
    public Builder setApiVersion(ApiVersion apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    /**
     * Whether this endpoint should receive events from connected accounts ({@code true}), or from
     * your account ({@code false}). Defaults to {@code false}.
     */
    public Builder setConnect(Boolean connect) {
      this.connect = connect;
      return this;
    }

    /** An optional description of what the webhook is used for. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointCreateParams#enabledEvents} for the field documentation.
     */
    public Builder addEnabledEvent(EnabledEvent element) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.add(element);
      return this;
    }

    /**
     * Add all elements to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointCreateParams#enabledEvents} for the field documentation.
     */
    public Builder addAllEnabledEvent(List<EnabledEvent> elements) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointCreateParams#expand} for the field documentation.
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
     * WebhookEndpointCreateParams#expand} for the field documentation.
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
     * WebhookEndpointCreateParams#extraParams} for the field documentation.
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
     * See {@link WebhookEndpointCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * WebhookEndpointCreateParams#metadata} for the field documentation.
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
     * See {@link WebhookEndpointCreateParams#metadata} for the field documentation.
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

    /** The URL of the webhook endpoint. */
    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }
  }

  public enum ApiVersion implements ApiRequestParams.EnumParam {
    @SerializedName("2011-01-01")
    VERSION_2011_01_01("2011-01-01"),

    @SerializedName("2011-06-21")
    VERSION_2011_06_21("2011-06-21"),

    @SerializedName("2011-06-28")
    VERSION_2011_06_28("2011-06-28"),

    @SerializedName("2011-08-01")
    VERSION_2011_08_01("2011-08-01"),

    @SerializedName("2011-09-15")
    VERSION_2011_09_15("2011-09-15"),

    @SerializedName("2011-11-17")
    VERSION_2011_11_17("2011-11-17"),

    @SerializedName("2012-02-23")
    VERSION_2012_02_23("2012-02-23"),

    @SerializedName("2012-03-25")
    VERSION_2012_03_25("2012-03-25"),

    @SerializedName("2012-06-18")
    VERSION_2012_06_18("2012-06-18"),

    @SerializedName("2012-06-28")
    VERSION_2012_06_28("2012-06-28"),

    @SerializedName("2012-07-09")
    VERSION_2012_07_09("2012-07-09"),

    @SerializedName("2012-09-24")
    VERSION_2012_09_24("2012-09-24"),

    @SerializedName("2012-10-26")
    VERSION_2012_10_26("2012-10-26"),

    @SerializedName("2012-11-07")
    VERSION_2012_11_07("2012-11-07"),

    @SerializedName("2013-02-11")
    VERSION_2013_02_11("2013-02-11"),

    @SerializedName("2013-02-13")
    VERSION_2013_02_13("2013-02-13"),

    @SerializedName("2013-07-05")
    VERSION_2013_07_05("2013-07-05"),

    @SerializedName("2013-08-12")
    VERSION_2013_08_12("2013-08-12"),

    @SerializedName("2013-08-13")
    VERSION_2013_08_13("2013-08-13"),

    @SerializedName("2013-10-29")
    VERSION_2013_10_29("2013-10-29"),

    @SerializedName("2013-12-03")
    VERSION_2013_12_03("2013-12-03"),

    @SerializedName("2014-01-31")
    VERSION_2014_01_31("2014-01-31"),

    @SerializedName("2014-03-13")
    VERSION_2014_03_13("2014-03-13"),

    @SerializedName("2014-03-28")
    VERSION_2014_03_28("2014-03-28"),

    @SerializedName("2014-05-19")
    VERSION_2014_05_19("2014-05-19"),

    @SerializedName("2014-06-13")
    VERSION_2014_06_13("2014-06-13"),

    @SerializedName("2014-06-17")
    VERSION_2014_06_17("2014-06-17"),

    @SerializedName("2014-07-22")
    VERSION_2014_07_22("2014-07-22"),

    @SerializedName("2014-07-26")
    VERSION_2014_07_26("2014-07-26"),

    @SerializedName("2014-08-04")
    VERSION_2014_08_04("2014-08-04"),

    @SerializedName("2014-08-20")
    VERSION_2014_08_20("2014-08-20"),

    @SerializedName("2014-09-08")
    VERSION_2014_09_08("2014-09-08"),

    @SerializedName("2014-10-07")
    VERSION_2014_10_07("2014-10-07"),

    @SerializedName("2014-11-05")
    VERSION_2014_11_05("2014-11-05"),

    @SerializedName("2014-11-20")
    VERSION_2014_11_20("2014-11-20"),

    @SerializedName("2014-12-08")
    VERSION_2014_12_08("2014-12-08"),

    @SerializedName("2014-12-17")
    VERSION_2014_12_17("2014-12-17"),

    @SerializedName("2014-12-22")
    VERSION_2014_12_22("2014-12-22"),

    @SerializedName("2015-01-11")
    VERSION_2015_01_11("2015-01-11"),

    @SerializedName("2015-01-26")
    VERSION_2015_01_26("2015-01-26"),

    @SerializedName("2015-02-10")
    VERSION_2015_02_10("2015-02-10"),

    @SerializedName("2015-02-16")
    VERSION_2015_02_16("2015-02-16"),

    @SerializedName("2015-02-18")
    VERSION_2015_02_18("2015-02-18"),

    @SerializedName("2015-03-24")
    VERSION_2015_03_24("2015-03-24"),

    @SerializedName("2015-04-07")
    VERSION_2015_04_07("2015-04-07"),

    @SerializedName("2015-06-15")
    VERSION_2015_06_15("2015-06-15"),

    @SerializedName("2015-07-07")
    VERSION_2015_07_07("2015-07-07"),

    @SerializedName("2015-07-13")
    VERSION_2015_07_13("2015-07-13"),

    @SerializedName("2015-07-28")
    VERSION_2015_07_28("2015-07-28"),

    @SerializedName("2015-08-07")
    VERSION_2015_08_07("2015-08-07"),

    @SerializedName("2015-08-19")
    VERSION_2015_08_19("2015-08-19"),

    @SerializedName("2015-09-03")
    VERSION_2015_09_03("2015-09-03"),

    @SerializedName("2015-09-08")
    VERSION_2015_09_08("2015-09-08"),

    @SerializedName("2015-09-23")
    VERSION_2015_09_23("2015-09-23"),

    @SerializedName("2015-10-01")
    VERSION_2015_10_01("2015-10-01"),

    @SerializedName("2015-10-12")
    VERSION_2015_10_12("2015-10-12"),

    @SerializedName("2015-10-16")
    VERSION_2015_10_16("2015-10-16"),

    @SerializedName("2016-02-03")
    VERSION_2016_02_03("2016-02-03"),

    @SerializedName("2016-02-19")
    VERSION_2016_02_19("2016-02-19"),

    @SerializedName("2016-02-22")
    VERSION_2016_02_22("2016-02-22"),

    @SerializedName("2016-02-23")
    VERSION_2016_02_23("2016-02-23"),

    @SerializedName("2016-02-29")
    VERSION_2016_02_29("2016-02-29"),

    @SerializedName("2016-03-07")
    VERSION_2016_03_07("2016-03-07"),

    @SerializedName("2016-06-15")
    VERSION_2016_06_15("2016-06-15"),

    @SerializedName("2016-07-06")
    VERSION_2016_07_06("2016-07-06"),

    @SerializedName("2016-10-19")
    VERSION_2016_10_19("2016-10-19"),

    @SerializedName("2017-01-27")
    VERSION_2017_01_27("2017-01-27"),

    @SerializedName("2017-02-14")
    VERSION_2017_02_14("2017-02-14"),

    @SerializedName("2017-04-06")
    VERSION_2017_04_06("2017-04-06"),

    @SerializedName("2017-05-25")
    VERSION_2017_05_25("2017-05-25"),

    @SerializedName("2017-06-05")
    VERSION_2017_06_05("2017-06-05"),

    @SerializedName("2017-08-15")
    VERSION_2017_08_15("2017-08-15"),

    @SerializedName("2017-12-14")
    VERSION_2017_12_14("2017-12-14"),

    @SerializedName("2018-01-23")
    VERSION_2018_01_23("2018-01-23"),

    @SerializedName("2018-02-05")
    VERSION_2018_02_05("2018-02-05"),

    @SerializedName("2018-02-06")
    VERSION_2018_02_06("2018-02-06"),

    @SerializedName("2018-02-28")
    VERSION_2018_02_28("2018-02-28"),

    @SerializedName("2018-05-21")
    VERSION_2018_05_21("2018-05-21"),

    @SerializedName("2018-07-27")
    VERSION_2018_07_27("2018-07-27"),

    @SerializedName("2018-08-23")
    VERSION_2018_08_23("2018-08-23"),

    @SerializedName("2018-09-06")
    VERSION_2018_09_06("2018-09-06"),

    @SerializedName("2018-09-24")
    VERSION_2018_09_24("2018-09-24"),

    @SerializedName("2018-10-31")
    VERSION_2018_10_31("2018-10-31"),

    @SerializedName("2018-11-08")
    VERSION_2018_11_08("2018-11-08"),

    @SerializedName("2019-02-11")
    VERSION_2019_02_11("2019-02-11"),

    @SerializedName("2019-02-19")
    VERSION_2019_02_19("2019-02-19"),

    @SerializedName("2019-03-14")
    VERSION_2019_03_14("2019-03-14"),

    @SerializedName("2019-05-16")
    VERSION_2019_05_16("2019-05-16"),

    @SerializedName("2019-08-14")
    VERSION_2019_08_14("2019-08-14"),

    @SerializedName("2019-09-09")
    VERSION_2019_09_09("2019-09-09"),

    @SerializedName("2019-10-08")
    VERSION_2019_10_08("2019-10-08"),

    @SerializedName("2019-10-17")
    VERSION_2019_10_17("2019-10-17"),

    @SerializedName("2019-11-05")
    VERSION_2019_11_05("2019-11-05"),

    @SerializedName("2019-12-03")
    VERSION_2019_12_03("2019-12-03"),

    @SerializedName("2020-03-02")
    VERSION_2020_03_02("2020-03-02"),

    @SerializedName("2020-08-27")
    VERSION_2020_08_27("2020-08-27");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ApiVersion(String value) {
      this.value = value;
    }
  }

  public enum EnabledEvent implements ApiRequestParams.EnumParam {
    @SerializedName("*")
    ALL("*"),

    @SerializedName("account.application.authorized")
    ACCOUNT__APPLICATION__AUTHORIZED("account.application.authorized"),

    @SerializedName("account.application.deauthorized")
    ACCOUNT__APPLICATION__DEAUTHORIZED("account.application.deauthorized"),

    @SerializedName("account.external_account.created")
    ACCOUNT__EXTERNAL_ACCOUNT__CREATED("account.external_account.created"),

    @SerializedName("account.external_account.deleted")
    ACCOUNT__EXTERNAL_ACCOUNT__DELETED("account.external_account.deleted"),

    @SerializedName("account.external_account.updated")
    ACCOUNT__EXTERNAL_ACCOUNT__UPDATED("account.external_account.updated"),

    @SerializedName("account.updated")
    ACCOUNT__UPDATED("account.updated"),

    @SerializedName("application_fee.created")
    APPLICATION_FEE__CREATED("application_fee.created"),

    @SerializedName("application_fee.refund.updated")
    APPLICATION_FEE__REFUND__UPDATED("application_fee.refund.updated"),

    @SerializedName("application_fee.refunded")
    APPLICATION_FEE__REFUNDED("application_fee.refunded"),

    @SerializedName("balance.available")
    BALANCE__AVAILABLE("balance.available"),

    @SerializedName("billing_portal.configuration.created")
    BILLING_PORTAL__CONFIGURATION__CREATED("billing_portal.configuration.created"),

    @SerializedName("billing_portal.configuration.updated")
    BILLING_PORTAL__CONFIGURATION__UPDATED("billing_portal.configuration.updated"),

    @SerializedName("capability.updated")
    CAPABILITY__UPDATED("capability.updated"),

    @SerializedName("charge.captured")
    CHARGE__CAPTURED("charge.captured"),

    @SerializedName("charge.dispute.closed")
    CHARGE__DISPUTE__CLOSED("charge.dispute.closed"),

    @SerializedName("charge.dispute.created")
    CHARGE__DISPUTE__CREATED("charge.dispute.created"),

    @SerializedName("charge.dispute.funds_reinstated")
    CHARGE__DISPUTE__FUNDS_REINSTATED("charge.dispute.funds_reinstated"),

    @SerializedName("charge.dispute.funds_withdrawn")
    CHARGE__DISPUTE__FUNDS_WITHDRAWN("charge.dispute.funds_withdrawn"),

    @SerializedName("charge.dispute.updated")
    CHARGE__DISPUTE__UPDATED("charge.dispute.updated"),

    @SerializedName("charge.expired")
    CHARGE__EXPIRED("charge.expired"),

    @SerializedName("charge.failed")
    CHARGE__FAILED("charge.failed"),

    @SerializedName("charge.pending")
    CHARGE__PENDING("charge.pending"),

    @SerializedName("charge.refund.updated")
    CHARGE__REFUND__UPDATED("charge.refund.updated"),

    @SerializedName("charge.refunded")
    CHARGE__REFUNDED("charge.refunded"),

    @SerializedName("charge.succeeded")
    CHARGE__SUCCEEDED("charge.succeeded"),

    @SerializedName("charge.updated")
    CHARGE__UPDATED("charge.updated"),

    @SerializedName("checkout.session.async_payment_failed")
    CHECKOUT__SESSION__ASYNC_PAYMENT_FAILED("checkout.session.async_payment_failed"),

    @SerializedName("checkout.session.async_payment_succeeded")
    CHECKOUT__SESSION__ASYNC_PAYMENT_SUCCEEDED("checkout.session.async_payment_succeeded"),

    @SerializedName("checkout.session.completed")
    CHECKOUT__SESSION__COMPLETED("checkout.session.completed"),

    @SerializedName("checkout.session.expired")
    CHECKOUT__SESSION__EXPIRED("checkout.session.expired"),

    @SerializedName("coupon.created")
    COUPON__CREATED("coupon.created"),

    @SerializedName("coupon.deleted")
    COUPON__DELETED("coupon.deleted"),

    @SerializedName("coupon.updated")
    COUPON__UPDATED("coupon.updated"),

    @SerializedName("credit_note.created")
    CREDIT_NOTE__CREATED("credit_note.created"),

    @SerializedName("credit_note.updated")
    CREDIT_NOTE__UPDATED("credit_note.updated"),

    @SerializedName("credit_note.voided")
    CREDIT_NOTE__VOIDED("credit_note.voided"),

    @SerializedName("customer.created")
    CUSTOMER__CREATED("customer.created"),

    @SerializedName("customer.deleted")
    CUSTOMER__DELETED("customer.deleted"),

    @SerializedName("customer.discount.created")
    CUSTOMER__DISCOUNT__CREATED("customer.discount.created"),

    @SerializedName("customer.discount.deleted")
    CUSTOMER__DISCOUNT__DELETED("customer.discount.deleted"),

    @SerializedName("customer.discount.updated")
    CUSTOMER__DISCOUNT__UPDATED("customer.discount.updated"),

    @SerializedName("customer.source.created")
    CUSTOMER__SOURCE__CREATED("customer.source.created"),

    @SerializedName("customer.source.deleted")
    CUSTOMER__SOURCE__DELETED("customer.source.deleted"),

    @SerializedName("customer.source.expiring")
    CUSTOMER__SOURCE__EXPIRING("customer.source.expiring"),

    @SerializedName("customer.source.updated")
    CUSTOMER__SOURCE__UPDATED("customer.source.updated"),

    @SerializedName("customer.subscription.created")
    CUSTOMER__SUBSCRIPTION__CREATED("customer.subscription.created"),

    @SerializedName("customer.subscription.deleted")
    CUSTOMER__SUBSCRIPTION__DELETED("customer.subscription.deleted"),

    @SerializedName("customer.subscription.pending_update_applied")
    CUSTOMER__SUBSCRIPTION__PENDING_UPDATE_APPLIED("customer.subscription.pending_update_applied"),

    @SerializedName("customer.subscription.pending_update_expired")
    CUSTOMER__SUBSCRIPTION__PENDING_UPDATE_EXPIRED("customer.subscription.pending_update_expired"),

    @SerializedName("customer.subscription.trial_will_end")
    CUSTOMER__SUBSCRIPTION__TRIAL_WILL_END("customer.subscription.trial_will_end"),

    @SerializedName("customer.subscription.updated")
    CUSTOMER__SUBSCRIPTION__UPDATED("customer.subscription.updated"),

    @SerializedName("customer.tax_id.created")
    CUSTOMER__TAX_ID__CREATED("customer.tax_id.created"),

    @SerializedName("customer.tax_id.deleted")
    CUSTOMER__TAX_ID__DELETED("customer.tax_id.deleted"),

    @SerializedName("customer.tax_id.updated")
    CUSTOMER__TAX_ID__UPDATED("customer.tax_id.updated"),

    @SerializedName("customer.updated")
    CUSTOMER__UPDATED("customer.updated"),

    @SerializedName("file.created")
    FILE__CREATED("file.created"),

    @SerializedName("identity.verification_session.canceled")
    IDENTITY__VERIFICATION_SESSION__CANCELED("identity.verification_session.canceled"),

    @SerializedName("identity.verification_session.created")
    IDENTITY__VERIFICATION_SESSION__CREATED("identity.verification_session.created"),

    @SerializedName("identity.verification_session.processing")
    IDENTITY__VERIFICATION_SESSION__PROCESSING("identity.verification_session.processing"),

    @SerializedName("identity.verification_session.redacted")
    IDENTITY__VERIFICATION_SESSION__REDACTED("identity.verification_session.redacted"),

    @SerializedName("identity.verification_session.requires_input")
    IDENTITY__VERIFICATION_SESSION__REQUIRES_INPUT("identity.verification_session.requires_input"),

    @SerializedName("identity.verification_session.verified")
    IDENTITY__VERIFICATION_SESSION__VERIFIED("identity.verification_session.verified"),

    @SerializedName("invoice.created")
    INVOICE__CREATED("invoice.created"),

    @SerializedName("invoice.deleted")
    INVOICE__DELETED("invoice.deleted"),

    @SerializedName("invoice.finalization_failed")
    INVOICE__FINALIZATION_FAILED("invoice.finalization_failed"),

    @SerializedName("invoice.finalized")
    INVOICE__FINALIZED("invoice.finalized"),

    @SerializedName("invoice.marked_uncollectible")
    INVOICE__MARKED_UNCOLLECTIBLE("invoice.marked_uncollectible"),

    @SerializedName("invoice.paid")
    INVOICE__PAID("invoice.paid"),

    @SerializedName("invoice.payment_action_required")
    INVOICE__PAYMENT_ACTION_REQUIRED("invoice.payment_action_required"),

    @SerializedName("invoice.payment_failed")
    INVOICE__PAYMENT_FAILED("invoice.payment_failed"),

    @SerializedName("invoice.payment_succeeded")
    INVOICE__PAYMENT_SUCCEEDED("invoice.payment_succeeded"),

    @SerializedName("invoice.sent")
    INVOICE__SENT("invoice.sent"),

    @SerializedName("invoice.upcoming")
    INVOICE__UPCOMING("invoice.upcoming"),

    @SerializedName("invoice.updated")
    INVOICE__UPDATED("invoice.updated"),

    @SerializedName("invoice.voided")
    INVOICE__VOIDED("invoice.voided"),

    @SerializedName("invoiceitem.created")
    INVOICEITEM__CREATED("invoiceitem.created"),

    @SerializedName("invoiceitem.deleted")
    INVOICEITEM__DELETED("invoiceitem.deleted"),

    @SerializedName("invoiceitem.updated")
    INVOICEITEM__UPDATED("invoiceitem.updated"),

    @SerializedName("issuing_authorization.created")
    ISSUING_AUTHORIZATION__CREATED("issuing_authorization.created"),

    @SerializedName("issuing_authorization.request")
    ISSUING_AUTHORIZATION__REQUEST("issuing_authorization.request"),

    @SerializedName("issuing_authorization.updated")
    ISSUING_AUTHORIZATION__UPDATED("issuing_authorization.updated"),

    @SerializedName("issuing_card.created")
    ISSUING_CARD__CREATED("issuing_card.created"),

    @SerializedName("issuing_card.updated")
    ISSUING_CARD__UPDATED("issuing_card.updated"),

    @SerializedName("issuing_cardholder.created")
    ISSUING_CARDHOLDER__CREATED("issuing_cardholder.created"),

    @SerializedName("issuing_cardholder.updated")
    ISSUING_CARDHOLDER__UPDATED("issuing_cardholder.updated"),

    @SerializedName("issuing_dispute.closed")
    ISSUING_DISPUTE__CLOSED("issuing_dispute.closed"),

    @SerializedName("issuing_dispute.created")
    ISSUING_DISPUTE__CREATED("issuing_dispute.created"),

    @SerializedName("issuing_dispute.funds_reinstated")
    ISSUING_DISPUTE__FUNDS_REINSTATED("issuing_dispute.funds_reinstated"),

    @SerializedName("issuing_dispute.submitted")
    ISSUING_DISPUTE__SUBMITTED("issuing_dispute.submitted"),

    @SerializedName("issuing_dispute.updated")
    ISSUING_DISPUTE__UPDATED("issuing_dispute.updated"),

    @SerializedName("issuing_transaction.created")
    ISSUING_TRANSACTION__CREATED("issuing_transaction.created"),

    @SerializedName("issuing_transaction.updated")
    ISSUING_TRANSACTION__UPDATED("issuing_transaction.updated"),

    @SerializedName("mandate.updated")
    MANDATE__UPDATED("mandate.updated"),

    @SerializedName("order.created")
    ORDER__CREATED("order.created"),

    @SerializedName("order.payment_failed")
    ORDER__PAYMENT_FAILED("order.payment_failed"),

    @SerializedName("order.payment_succeeded")
    ORDER__PAYMENT_SUCCEEDED("order.payment_succeeded"),

    @SerializedName("order.updated")
    ORDER__UPDATED("order.updated"),

    @SerializedName("order_return.created")
    ORDER_RETURN__CREATED("order_return.created"),

    @SerializedName("payment_intent.amount_capturable_updated")
    PAYMENT_INTENT__AMOUNT_CAPTURABLE_UPDATED("payment_intent.amount_capturable_updated"),

    @SerializedName("payment_intent.canceled")
    PAYMENT_INTENT__CANCELED("payment_intent.canceled"),

    @SerializedName("payment_intent.created")
    PAYMENT_INTENT__CREATED("payment_intent.created"),

    @SerializedName("payment_intent.payment_failed")
    PAYMENT_INTENT__PAYMENT_FAILED("payment_intent.payment_failed"),

    @SerializedName("payment_intent.processing")
    PAYMENT_INTENT__PROCESSING("payment_intent.processing"),

    @SerializedName("payment_intent.requires_action")
    PAYMENT_INTENT__REQUIRES_ACTION("payment_intent.requires_action"),

    @SerializedName("payment_intent.succeeded")
    PAYMENT_INTENT__SUCCEEDED("payment_intent.succeeded"),

    @SerializedName("payment_link.created")
    PAYMENT_LINK__CREATED("payment_link.created"),

    @SerializedName("payment_link.updated")
    PAYMENT_LINK__UPDATED("payment_link.updated"),

    @SerializedName("payment_method.attached")
    PAYMENT_METHOD__ATTACHED("payment_method.attached"),

    @SerializedName("payment_method.automatically_updated")
    PAYMENT_METHOD__AUTOMATICALLY_UPDATED("payment_method.automatically_updated"),

    @SerializedName("payment_method.detached")
    PAYMENT_METHOD__DETACHED("payment_method.detached"),

    @SerializedName("payment_method.updated")
    PAYMENT_METHOD__UPDATED("payment_method.updated"),

    @SerializedName("payout.canceled")
    PAYOUT__CANCELED("payout.canceled"),

    @SerializedName("payout.created")
    PAYOUT__CREATED("payout.created"),

    @SerializedName("payout.failed")
    PAYOUT__FAILED("payout.failed"),

    @SerializedName("payout.paid")
    PAYOUT__PAID("payout.paid"),

    @SerializedName("payout.updated")
    PAYOUT__UPDATED("payout.updated"),

    @SerializedName("person.created")
    PERSON__CREATED("person.created"),

    @SerializedName("person.deleted")
    PERSON__DELETED("person.deleted"),

    @SerializedName("person.updated")
    PERSON__UPDATED("person.updated"),

    @SerializedName("plan.created")
    PLAN__CREATED("plan.created"),

    @SerializedName("plan.deleted")
    PLAN__DELETED("plan.deleted"),

    @SerializedName("plan.updated")
    PLAN__UPDATED("plan.updated"),

    @SerializedName("price.created")
    PRICE__CREATED("price.created"),

    @SerializedName("price.deleted")
    PRICE__DELETED("price.deleted"),

    @SerializedName("price.updated")
    PRICE__UPDATED("price.updated"),

    @SerializedName("product.created")
    PRODUCT__CREATED("product.created"),

    @SerializedName("product.deleted")
    PRODUCT__DELETED("product.deleted"),

    @SerializedName("product.updated")
    PRODUCT__UPDATED("product.updated"),

    @SerializedName("promotion_code.created")
    PROMOTION_CODE__CREATED("promotion_code.created"),

    @SerializedName("promotion_code.updated")
    PROMOTION_CODE__UPDATED("promotion_code.updated"),

    @SerializedName("quote.accepted")
    QUOTE__ACCEPTED("quote.accepted"),

    @SerializedName("quote.canceled")
    QUOTE__CANCELED("quote.canceled"),

    @SerializedName("quote.created")
    QUOTE__CREATED("quote.created"),

    @SerializedName("quote.finalized")
    QUOTE__FINALIZED("quote.finalized"),

    @SerializedName("radar.early_fraud_warning.created")
    RADAR__EARLY_FRAUD_WARNING__CREATED("radar.early_fraud_warning.created"),

    @SerializedName("radar.early_fraud_warning.updated")
    RADAR__EARLY_FRAUD_WARNING__UPDATED("radar.early_fraud_warning.updated"),

    @SerializedName("recipient.created")
    RECIPIENT__CREATED("recipient.created"),

    @SerializedName("recipient.deleted")
    RECIPIENT__DELETED("recipient.deleted"),

    @SerializedName("recipient.updated")
    RECIPIENT__UPDATED("recipient.updated"),

    @SerializedName("reporting.report_run.failed")
    REPORTING__REPORT_RUN__FAILED("reporting.report_run.failed"),

    @SerializedName("reporting.report_run.succeeded")
    REPORTING__REPORT_RUN__SUCCEEDED("reporting.report_run.succeeded"),

    @SerializedName("reporting.report_type.updated")
    REPORTING__REPORT_TYPE__UPDATED("reporting.report_type.updated"),

    @SerializedName("review.closed")
    REVIEW__CLOSED("review.closed"),

    @SerializedName("review.opened")
    REVIEW__OPENED("review.opened"),

    @SerializedName("setup_intent.canceled")
    SETUP_INTENT__CANCELED("setup_intent.canceled"),

    @SerializedName("setup_intent.created")
    SETUP_INTENT__CREATED("setup_intent.created"),

    @SerializedName("setup_intent.requires_action")
    SETUP_INTENT__REQUIRES_ACTION("setup_intent.requires_action"),

    @SerializedName("setup_intent.setup_failed")
    SETUP_INTENT__SETUP_FAILED("setup_intent.setup_failed"),

    @SerializedName("setup_intent.succeeded")
    SETUP_INTENT__SUCCEEDED("setup_intent.succeeded"),

    @SerializedName("sigma.scheduled_query_run.created")
    SIGMA__SCHEDULED_QUERY_RUN__CREATED("sigma.scheduled_query_run.created"),

    @SerializedName("sku.created")
    SKU__CREATED("sku.created"),

    @SerializedName("sku.deleted")
    SKU__DELETED("sku.deleted"),

    @SerializedName("sku.updated")
    SKU__UPDATED("sku.updated"),

    @SerializedName("source.canceled")
    SOURCE__CANCELED("source.canceled"),

    @SerializedName("source.chargeable")
    SOURCE__CHARGEABLE("source.chargeable"),

    @SerializedName("source.failed")
    SOURCE__FAILED("source.failed"),

    @SerializedName("source.mandate_notification")
    SOURCE__MANDATE_NOTIFICATION("source.mandate_notification"),

    @SerializedName("source.refund_attributes_required")
    SOURCE__REFUND_ATTRIBUTES_REQUIRED("source.refund_attributes_required"),

    @SerializedName("source.transaction.created")
    SOURCE__TRANSACTION__CREATED("source.transaction.created"),

    @SerializedName("source.transaction.updated")
    SOURCE__TRANSACTION__UPDATED("source.transaction.updated"),

    @SerializedName("subscription_schedule.aborted")
    SUBSCRIPTION_SCHEDULE__ABORTED("subscription_schedule.aborted"),

    @SerializedName("subscription_schedule.canceled")
    SUBSCRIPTION_SCHEDULE__CANCELED("subscription_schedule.canceled"),

    @SerializedName("subscription_schedule.completed")
    SUBSCRIPTION_SCHEDULE__COMPLETED("subscription_schedule.completed"),

    @SerializedName("subscription_schedule.created")
    SUBSCRIPTION_SCHEDULE__CREATED("subscription_schedule.created"),

    @SerializedName("subscription_schedule.expiring")
    SUBSCRIPTION_SCHEDULE__EXPIRING("subscription_schedule.expiring"),

    @SerializedName("subscription_schedule.released")
    SUBSCRIPTION_SCHEDULE__RELEASED("subscription_schedule.released"),

    @SerializedName("subscription_schedule.updated")
    SUBSCRIPTION_SCHEDULE__UPDATED("subscription_schedule.updated"),

    @SerializedName("tax_rate.created")
    TAX_RATE__CREATED("tax_rate.created"),

    @SerializedName("tax_rate.updated")
    TAX_RATE__UPDATED("tax_rate.updated"),

    @SerializedName("topup.canceled")
    TOPUP__CANCELED("topup.canceled"),

    @SerializedName("topup.created")
    TOPUP__CREATED("topup.created"),

    @SerializedName("topup.failed")
    TOPUP__FAILED("topup.failed"),

    @SerializedName("topup.reversed")
    TOPUP__REVERSED("topup.reversed"),

    @SerializedName("topup.succeeded")
    TOPUP__SUCCEEDED("topup.succeeded"),

    @SerializedName("transfer.created")
    TRANSFER__CREATED("transfer.created"),

    @SerializedName("transfer.failed")
    TRANSFER__FAILED("transfer.failed"),

    @SerializedName("transfer.paid")
    TRANSFER__PAID("transfer.paid"),

    @SerializedName("transfer.reversed")
    TRANSFER__REVERSED("transfer.reversed"),

    @SerializedName("transfer.updated")
    TRANSFER__UPDATED("transfer.updated");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EnabledEvent(String value) {
      this.value = value;
    }
  }
}
