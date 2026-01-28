// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
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
  Object description;

  /**
   * <strong>Required.</strong> The list of events to enable for this endpoint. You may specify
   * {@code ['*']} to enable all events, except those that require explicit selection.
   */
  @SerializedName("enabled_events")
  List<WebhookEndpointCreateParams.EnabledEvent> enabledEvents;

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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** <strong>Required.</strong> The URL of the webhook endpoint. */
  @SerializedName("url")
  String url;

  private WebhookEndpointCreateParams(
      ApiVersion apiVersion,
      Boolean connect,
      Object description,
      List<WebhookEndpointCreateParams.EnabledEvent> enabledEvents,
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

    private Object description;

    private List<WebhookEndpointCreateParams.EnabledEvent> enabledEvents;

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
    public Builder setApiVersion(WebhookEndpointCreateParams.ApiVersion apiVersion) {
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

    /** An optional description of what the webhook is used for. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointCreateParams#enabledEvents} for the field documentation.
     */
    public Builder addEnabledEvent(WebhookEndpointCreateParams.EnabledEvent element) {
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
    public Builder addAllEnabledEvent(List<WebhookEndpointCreateParams.EnabledEvent> elements) {
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

    /** <strong>Required.</strong> The URL of the webhook endpoint. */
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
    VERSION_2020_08_27("2020-08-27"),

    @SerializedName("2022-08-01")
    VERSION_2022_08_01("2022-08-01"),

    @SerializedName("2022-11-15")
    VERSION_2022_11_15("2022-11-15"),

    @SerializedName("2023-08-16")
    VERSION_2023_08_16("2023-08-16"),

    @SerializedName("2023-10-16")
    VERSION_2023_10_16("2023-10-16"),

    @SerializedName("2024-04-10")
    VERSION_2024_04_10("2024-04-10"),

    @SerializedName("2024-06-20")
    VERSION_2024_06_20("2024-06-20"),

    @SerializedName("2024-09-30.acacia")
    VERSION_2024_09_30_ACACIA("2024-09-30.acacia"),

    @SerializedName("2024-10-28.acacia")
    VERSION_2024_10_28_ACACIA("2024-10-28.acacia"),

    @SerializedName("2024-11-20.acacia")
    VERSION_2024_11_20_ACACIA("2024-11-20.acacia"),

    @SerializedName("2024-12-18.acacia")
    VERSION_2024_12_18_ACACIA("2024-12-18.acacia"),

    @SerializedName("2025-01-27.acacia")
    VERSION_2025_01_27_ACACIA("2025-01-27.acacia"),

    @SerializedName("2025-02-24.acacia")
    VERSION_2025_02_24_ACACIA("2025-02-24.acacia"),

    @SerializedName("2025-03-01.dashboard")
    VERSION_2025_03_01_DASHBOARD("2025-03-01.dashboard"),

    @SerializedName("2025-03-31.basil")
    VERSION_2025_03_31_BASIL("2025-03-31.basil"),

    @SerializedName("2025-04-30.basil")
    VERSION_2025_04_30_BASIL("2025-04-30.basil"),

    @SerializedName("2025-05-28.basil")
    VERSION_2025_05_28_BASIL("2025-05-28.basil"),

    @SerializedName("2025-06-30.basil")
    VERSION_2025_06_30_BASIL("2025-06-30.basil"),

    @SerializedName("2025-07-30.basil")
    VERSION_2025_07_30_BASIL("2025-07-30.basil"),

    @SerializedName("2025-08-27.basil")
    VERSION_2025_08_27_BASIL("2025-08-27.basil"),

    @SerializedName("2025-09-30.clover")
    VERSION_2025_09_30_CLOVER("2025-09-30.clover"),

    @SerializedName("2025-10-29.clover")
    VERSION_2025_10_29_CLOVER("2025-10-29.clover"),

    @SerializedName("2025-11-17.clover")
    VERSION_2025_11_17_CLOVER("2025-11-17.clover"),

    @SerializedName("2025-12-15.clover")
    VERSION_2025_12_15_CLOVER("2025-12-15.clover"),

    @SerializedName("2026-01-28.clover")
    VERSION_2026_01_28_CLOVER("2026-01-28.clover");

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

    @SerializedName("account_notice.created")
    ACCOUNT_NOTICE__CREATED("account_notice.created"),

    @SerializedName("account_notice.updated")
    ACCOUNT_NOTICE__UPDATED("account_notice.updated"),

    @SerializedName("application_fee.created")
    APPLICATION_FEE__CREATED("application_fee.created"),

    @SerializedName("application_fee.refund.updated")
    APPLICATION_FEE__REFUND__UPDATED("application_fee.refund.updated"),

    @SerializedName("application_fee.refunded")
    APPLICATION_FEE__REFUNDED("application_fee.refunded"),

    @SerializedName("balance.available")
    BALANCE__AVAILABLE("balance.available"),

    @SerializedName("balance_settings.updated")
    BALANCE_SETTINGS__UPDATED("balance_settings.updated"),

    @SerializedName("billing.alert.triggered")
    BILLING__ALERT__TRIGGERED("billing.alert.triggered"),

    @SerializedName("billing_portal.configuration.created")
    BILLING_PORTAL__CONFIGURATION__CREATED("billing_portal.configuration.created"),

    @SerializedName("billing_portal.configuration.updated")
    BILLING_PORTAL__CONFIGURATION__UPDATED("billing_portal.configuration.updated"),

    @SerializedName("billing_portal.session.created")
    BILLING_PORTAL__SESSION__CREATED("billing_portal.session.created"),

    @SerializedName("capability.updated")
    CAPABILITY__UPDATED("capability.updated"),

    @SerializedName("capital.financing_offer.accepted")
    CAPITAL__FINANCING_OFFER__ACCEPTED("capital.financing_offer.accepted"),

    @SerializedName("capital.financing_offer.accepted_other_offer")
    CAPITAL__FINANCING_OFFER__ACCEPTED_OTHER_OFFER("capital.financing_offer.accepted_other_offer"),

    @SerializedName("capital.financing_offer.canceled")
    CAPITAL__FINANCING_OFFER__CANCELED("capital.financing_offer.canceled"),

    @SerializedName("capital.financing_offer.created")
    CAPITAL__FINANCING_OFFER__CREATED("capital.financing_offer.created"),

    @SerializedName("capital.financing_offer.expired")
    CAPITAL__FINANCING_OFFER__EXPIRED("capital.financing_offer.expired"),

    @SerializedName("capital.financing_offer.fully_repaid")
    CAPITAL__FINANCING_OFFER__FULLY_REPAID("capital.financing_offer.fully_repaid"),

    @SerializedName("capital.financing_offer.paid_out")
    CAPITAL__FINANCING_OFFER__PAID_OUT("capital.financing_offer.paid_out"),

    @SerializedName("capital.financing_offer.rejected")
    CAPITAL__FINANCING_OFFER__REJECTED("capital.financing_offer.rejected"),

    @SerializedName("capital.financing_offer.replacement_created")
    CAPITAL__FINANCING_OFFER__REPLACEMENT_CREATED("capital.financing_offer.replacement_created"),

    @SerializedName("capital.financing_summary.line_of_credit_update")
    CAPITAL__FINANCING_SUMMARY__LINE_OF_CREDIT_UPDATE(
        "capital.financing_summary.line_of_credit_update"),

    @SerializedName("capital.financing_transaction.created")
    CAPITAL__FINANCING_TRANSACTION__CREATED("capital.financing_transaction.created"),

    @SerializedName("cash_balance.funds_available")
    CASH_BALANCE__FUNDS_AVAILABLE("cash_balance.funds_available"),

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

    @SerializedName("climate.order.canceled")
    CLIMATE__ORDER__CANCELED("climate.order.canceled"),

    @SerializedName("climate.order.created")
    CLIMATE__ORDER__CREATED("climate.order.created"),

    @SerializedName("climate.order.delayed")
    CLIMATE__ORDER__DELAYED("climate.order.delayed"),

    @SerializedName("climate.order.delivered")
    CLIMATE__ORDER__DELIVERED("climate.order.delivered"),

    @SerializedName("climate.order.product_substituted")
    CLIMATE__ORDER__PRODUCT_SUBSTITUTED("climate.order.product_substituted"),

    @SerializedName("climate.product.created")
    CLIMATE__PRODUCT__CREATED("climate.product.created"),

    @SerializedName("climate.product.pricing_updated")
    CLIMATE__PRODUCT__PRICING_UPDATED("climate.product.pricing_updated"),

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

    @SerializedName("customer.subscription.collection_paused")
    CUSTOMER__SUBSCRIPTION__COLLECTION_PAUSED("customer.subscription.collection_paused"),

    @SerializedName("customer.subscription.collection_resumed")
    CUSTOMER__SUBSCRIPTION__COLLECTION_RESUMED("customer.subscription.collection_resumed"),

    @SerializedName("customer.subscription.created")
    CUSTOMER__SUBSCRIPTION__CREATED("customer.subscription.created"),

    @SerializedName("customer.subscription.custom_event")
    CUSTOMER__SUBSCRIPTION__CUSTOM_EVENT("customer.subscription.custom_event"),

    @SerializedName("customer.subscription.deleted")
    CUSTOMER__SUBSCRIPTION__DELETED("customer.subscription.deleted"),

    @SerializedName("customer.subscription.paused")
    CUSTOMER__SUBSCRIPTION__PAUSED("customer.subscription.paused"),

    @SerializedName("customer.subscription.pending_update_applied")
    CUSTOMER__SUBSCRIPTION__PENDING_UPDATE_APPLIED("customer.subscription.pending_update_applied"),

    @SerializedName("customer.subscription.pending_update_expired")
    CUSTOMER__SUBSCRIPTION__PENDING_UPDATE_EXPIRED("customer.subscription.pending_update_expired"),

    @SerializedName("customer.subscription.price_migration_failed")
    CUSTOMER__SUBSCRIPTION__PRICE_MIGRATION_FAILED("customer.subscription.price_migration_failed"),

    @SerializedName("customer.subscription.resumed")
    CUSTOMER__SUBSCRIPTION__RESUMED("customer.subscription.resumed"),

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

    @SerializedName("customer_cash_balance_transaction.created")
    CUSTOMER_CASH_BALANCE_TRANSACTION__CREATED("customer_cash_balance_transaction.created"),

    @SerializedName("entitlements.active_entitlement_summary.updated")
    ENTITLEMENTS__ACTIVE_ENTITLEMENT_SUMMARY__UPDATED(
        "entitlements.active_entitlement_summary.updated"),

    @SerializedName("file.created")
    FILE__CREATED("file.created"),

    @SerializedName("financial_connections.account.account_numbers_updated")
    FINANCIAL_CONNECTIONS__ACCOUNT__ACCOUNT_NUMBERS_UPDATED(
        "financial_connections.account.account_numbers_updated"),

    @SerializedName("financial_connections.account.created")
    FINANCIAL_CONNECTIONS__ACCOUNT__CREATED("financial_connections.account.created"),

    @SerializedName("financial_connections.account.deactivated")
    FINANCIAL_CONNECTIONS__ACCOUNT__DEACTIVATED("financial_connections.account.deactivated"),

    @SerializedName("financial_connections.account.disconnected")
    FINANCIAL_CONNECTIONS__ACCOUNT__DISCONNECTED("financial_connections.account.disconnected"),

    @SerializedName("financial_connections.account.reactivated")
    FINANCIAL_CONNECTIONS__ACCOUNT__REACTIVATED("financial_connections.account.reactivated"),

    @SerializedName("financial_connections.account.refreshed_balance")
    FINANCIAL_CONNECTIONS__ACCOUNT__REFRESHED_BALANCE(
        "financial_connections.account.refreshed_balance"),

    @SerializedName("financial_connections.account.refreshed_inferred_balances")
    FINANCIAL_CONNECTIONS__ACCOUNT__REFRESHED_INFERRED_BALANCES(
        "financial_connections.account.refreshed_inferred_balances"),

    @SerializedName("financial_connections.account.refreshed_ownership")
    FINANCIAL_CONNECTIONS__ACCOUNT__REFRESHED_OWNERSHIP(
        "financial_connections.account.refreshed_ownership"),

    @SerializedName("financial_connections.account.refreshed_transactions")
    FINANCIAL_CONNECTIONS__ACCOUNT__REFRESHED_TRANSACTIONS(
        "financial_connections.account.refreshed_transactions"),

    @SerializedName("financial_connections.account.upcoming_account_number_expiry")
    FINANCIAL_CONNECTIONS__ACCOUNT__UPCOMING_ACCOUNT_NUMBER_EXPIRY(
        "financial_connections.account.upcoming_account_number_expiry"),

    @SerializedName("financial_connections.session.updated")
    FINANCIAL_CONNECTIONS__SESSION__UPDATED("financial_connections.session.updated"),

    @SerializedName("fx_quote.expired")
    FX_QUOTE__EXPIRED("fx_quote.expired"),

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

    @SerializedName("invoice.overdue")
    INVOICE__OVERDUE("invoice.overdue"),

    @SerializedName("invoice.overpaid")
    INVOICE__OVERPAID("invoice.overpaid"),

    @SerializedName("invoice.paid")
    INVOICE__PAID("invoice.paid"),

    @SerializedName("invoice.payment.overpaid")
    INVOICE__PAYMENT__OVERPAID("invoice.payment.overpaid"),

    @SerializedName("invoice.payment_action_required")
    INVOICE__PAYMENT_ACTION_REQUIRED("invoice.payment_action_required"),

    @SerializedName("invoice.payment_attempt_required")
    INVOICE__PAYMENT_ATTEMPT_REQUIRED("invoice.payment_attempt_required"),

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

    @SerializedName("invoice.will_be_due")
    INVOICE__WILL_BE_DUE("invoice.will_be_due"),

    @SerializedName("invoice_payment.paid")
    INVOICE_PAYMENT__PAID("invoice_payment.paid"),

    @SerializedName("invoiceitem.created")
    INVOICEITEM__CREATED("invoiceitem.created"),

    @SerializedName("invoiceitem.deleted")
    INVOICEITEM__DELETED("invoiceitem.deleted"),

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

    @SerializedName("issuing_dispute.funds_rescinded")
    ISSUING_DISPUTE__FUNDS_RESCINDED("issuing_dispute.funds_rescinded"),

    @SerializedName("issuing_dispute.submitted")
    ISSUING_DISPUTE__SUBMITTED("issuing_dispute.submitted"),

    @SerializedName("issuing_dispute.updated")
    ISSUING_DISPUTE__UPDATED("issuing_dispute.updated"),

    @SerializedName("issuing_dispute_settlement_detail.created")
    ISSUING_DISPUTE_SETTLEMENT_DETAIL__CREATED("issuing_dispute_settlement_detail.created"),

    @SerializedName("issuing_dispute_settlement_detail.updated")
    ISSUING_DISPUTE_SETTLEMENT_DETAIL__UPDATED("issuing_dispute_settlement_detail.updated"),

    @SerializedName("issuing_fraud_liability_debit.created")
    ISSUING_FRAUD_LIABILITY_DEBIT__CREATED("issuing_fraud_liability_debit.created"),

    @SerializedName("issuing_personalization_design.activated")
    ISSUING_PERSONALIZATION_DESIGN__ACTIVATED("issuing_personalization_design.activated"),

    @SerializedName("issuing_personalization_design.deactivated")
    ISSUING_PERSONALIZATION_DESIGN__DEACTIVATED("issuing_personalization_design.deactivated"),

    @SerializedName("issuing_personalization_design.rejected")
    ISSUING_PERSONALIZATION_DESIGN__REJECTED("issuing_personalization_design.rejected"),

    @SerializedName("issuing_personalization_design.updated")
    ISSUING_PERSONALIZATION_DESIGN__UPDATED("issuing_personalization_design.updated"),

    @SerializedName("issuing_settlement.created")
    ISSUING_SETTLEMENT__CREATED("issuing_settlement.created"),

    @SerializedName("issuing_settlement.updated")
    ISSUING_SETTLEMENT__UPDATED("issuing_settlement.updated"),

    @SerializedName("issuing_token.created")
    ISSUING_TOKEN__CREATED("issuing_token.created"),

    @SerializedName("issuing_token.updated")
    ISSUING_TOKEN__UPDATED("issuing_token.updated"),

    @SerializedName("issuing_transaction.created")
    ISSUING_TRANSACTION__CREATED("issuing_transaction.created"),

    @SerializedName("issuing_transaction.purchase_details_receipt_updated")
    ISSUING_TRANSACTION__PURCHASE_DETAILS_RECEIPT_UPDATED(
        "issuing_transaction.purchase_details_receipt_updated"),

    @SerializedName("issuing_transaction.updated")
    ISSUING_TRANSACTION__UPDATED("issuing_transaction.updated"),

    @SerializedName("mandate.updated")
    MANDATE__UPDATED("mandate.updated"),

    @SerializedName("payment_intent.amount_capturable_updated")
    PAYMENT_INTENT__AMOUNT_CAPTURABLE_UPDATED("payment_intent.amount_capturable_updated"),

    @SerializedName("payment_intent.canceled")
    PAYMENT_INTENT__CANCELED("payment_intent.canceled"),

    @SerializedName("payment_intent.created")
    PAYMENT_INTENT__CREATED("payment_intent.created"),

    @SerializedName("payment_intent.partially_funded")
    PAYMENT_INTENT__PARTIALLY_FUNDED("payment_intent.partially_funded"),

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

    @SerializedName("payout.reconciliation_completed")
    PAYOUT__RECONCILIATION_COMPLETED("payout.reconciliation_completed"),

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

    @SerializedName("privacy.redaction_job.canceled")
    PRIVACY__REDACTION_JOB__CANCELED("privacy.redaction_job.canceled"),

    @SerializedName("privacy.redaction_job.created")
    PRIVACY__REDACTION_JOB__CREATED("privacy.redaction_job.created"),

    @SerializedName("privacy.redaction_job.ready")
    PRIVACY__REDACTION_JOB__READY("privacy.redaction_job.ready"),

    @SerializedName("privacy.redaction_job.succeeded")
    PRIVACY__REDACTION_JOB__SUCCEEDED("privacy.redaction_job.succeeded"),

    @SerializedName("privacy.redaction_job.validation_error")
    PRIVACY__REDACTION_JOB__VALIDATION_ERROR("privacy.redaction_job.validation_error"),

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

    @SerializedName("quote.accept_failed")
    QUOTE__ACCEPT_FAILED("quote.accept_failed"),

    @SerializedName("quote.accepted")
    QUOTE__ACCEPTED("quote.accepted"),

    @SerializedName("quote.accepting")
    QUOTE__ACCEPTING("quote.accepting"),

    @SerializedName("quote.canceled")
    QUOTE__CANCELED("quote.canceled"),

    @SerializedName("quote.created")
    QUOTE__CREATED("quote.created"),

    @SerializedName("quote.draft")
    QUOTE__DRAFT("quote.draft"),

    @SerializedName("quote.finalized")
    QUOTE__FINALIZED("quote.finalized"),

    @SerializedName("quote.reestimate_failed")
    QUOTE__REESTIMATE_FAILED("quote.reestimate_failed"),

    @SerializedName("quote.reestimated")
    QUOTE__REESTIMATED("quote.reestimated"),

    @SerializedName("quote.stale")
    QUOTE__STALE("quote.stale"),

    @SerializedName("radar.early_fraud_warning.created")
    RADAR__EARLY_FRAUD_WARNING__CREATED("radar.early_fraud_warning.created"),

    @SerializedName("radar.early_fraud_warning.updated")
    RADAR__EARLY_FRAUD_WARNING__UPDATED("radar.early_fraud_warning.updated"),

    @SerializedName("refund.created")
    REFUND__CREATED("refund.created"),

    @SerializedName("refund.failed")
    REFUND__FAILED("refund.failed"),

    @SerializedName("refund.updated")
    REFUND__UPDATED("refund.updated"),

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

    @SerializedName("subscription_schedule.price_migration_failed")
    SUBSCRIPTION_SCHEDULE__PRICE_MIGRATION_FAILED("subscription_schedule.price_migration_failed"),

    @SerializedName("subscription_schedule.released")
    SUBSCRIPTION_SCHEDULE__RELEASED("subscription_schedule.released"),

    @SerializedName("subscription_schedule.updated")
    SUBSCRIPTION_SCHEDULE__UPDATED("subscription_schedule.updated"),

    @SerializedName("tax.form.updated")
    TAX__FORM__UPDATED("tax.form.updated"),

    @SerializedName("tax.settings.updated")
    TAX__SETTINGS__UPDATED("tax.settings.updated"),

    @SerializedName("tax_rate.created")
    TAX_RATE__CREATED("tax_rate.created"),

    @SerializedName("tax_rate.updated")
    TAX_RATE__UPDATED("tax_rate.updated"),

    @SerializedName("terminal.reader.action_failed")
    TERMINAL__READER__ACTION_FAILED("terminal.reader.action_failed"),

    @SerializedName("terminal.reader.action_succeeded")
    TERMINAL__READER__ACTION_SUCCEEDED("terminal.reader.action_succeeded"),

    @SerializedName("terminal.reader.action_updated")
    TERMINAL__READER__ACTION_UPDATED("terminal.reader.action_updated"),

    @SerializedName("test_helpers.test_clock.advancing")
    TEST_HELPERS__TEST_CLOCK__ADVANCING("test_helpers.test_clock.advancing"),

    @SerializedName("test_helpers.test_clock.created")
    TEST_HELPERS__TEST_CLOCK__CREATED("test_helpers.test_clock.created"),

    @SerializedName("test_helpers.test_clock.deleted")
    TEST_HELPERS__TEST_CLOCK__DELETED("test_helpers.test_clock.deleted"),

    @SerializedName("test_helpers.test_clock.internal_failure")
    TEST_HELPERS__TEST_CLOCK__INTERNAL_FAILURE("test_helpers.test_clock.internal_failure"),

    @SerializedName("test_helpers.test_clock.ready")
    TEST_HELPERS__TEST_CLOCK__READY("test_helpers.test_clock.ready"),

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

    @SerializedName("transfer.reversed")
    TRANSFER__REVERSED("transfer.reversed"),

    @SerializedName("transfer.updated")
    TRANSFER__UPDATED("transfer.updated"),

    @SerializedName("treasury.credit_reversal.created")
    TREASURY__CREDIT_REVERSAL__CREATED("treasury.credit_reversal.created"),

    @SerializedName("treasury.credit_reversal.posted")
    TREASURY__CREDIT_REVERSAL__POSTED("treasury.credit_reversal.posted"),

    @SerializedName("treasury.debit_reversal.completed")
    TREASURY__DEBIT_REVERSAL__COMPLETED("treasury.debit_reversal.completed"),

    @SerializedName("treasury.debit_reversal.created")
    TREASURY__DEBIT_REVERSAL__CREATED("treasury.debit_reversal.created"),

    @SerializedName("treasury.debit_reversal.initial_credit_granted")
    TREASURY__DEBIT_REVERSAL__INITIAL_CREDIT_GRANTED(
        "treasury.debit_reversal.initial_credit_granted"),

    @SerializedName("treasury.financial_account.closed")
    TREASURY__FINANCIAL_ACCOUNT__CLOSED("treasury.financial_account.closed"),

    @SerializedName("treasury.financial_account.created")
    TREASURY__FINANCIAL_ACCOUNT__CREATED("treasury.financial_account.created"),

    @SerializedName("treasury.financial_account.features_status_updated")
    TREASURY__FINANCIAL_ACCOUNT__FEATURES_STATUS_UPDATED(
        "treasury.financial_account.features_status_updated"),

    @SerializedName("treasury.inbound_transfer.canceled")
    TREASURY__INBOUND_TRANSFER__CANCELED("treasury.inbound_transfer.canceled"),

    @SerializedName("treasury.inbound_transfer.created")
    TREASURY__INBOUND_TRANSFER__CREATED("treasury.inbound_transfer.created"),

    @SerializedName("treasury.inbound_transfer.failed")
    TREASURY__INBOUND_TRANSFER__FAILED("treasury.inbound_transfer.failed"),

    @SerializedName("treasury.inbound_transfer.succeeded")
    TREASURY__INBOUND_TRANSFER__SUCCEEDED("treasury.inbound_transfer.succeeded"),

    @SerializedName("treasury.outbound_payment.canceled")
    TREASURY__OUTBOUND_PAYMENT__CANCELED("treasury.outbound_payment.canceled"),

    @SerializedName("treasury.outbound_payment.created")
    TREASURY__OUTBOUND_PAYMENT__CREATED("treasury.outbound_payment.created"),

    @SerializedName("treasury.outbound_payment.expected_arrival_date_updated")
    TREASURY__OUTBOUND_PAYMENT__EXPECTED_ARRIVAL_DATE_UPDATED(
        "treasury.outbound_payment.expected_arrival_date_updated"),

    @SerializedName("treasury.outbound_payment.failed")
    TREASURY__OUTBOUND_PAYMENT__FAILED("treasury.outbound_payment.failed"),

    @SerializedName("treasury.outbound_payment.posted")
    TREASURY__OUTBOUND_PAYMENT__POSTED("treasury.outbound_payment.posted"),

    @SerializedName("treasury.outbound_payment.returned")
    TREASURY__OUTBOUND_PAYMENT__RETURNED("treasury.outbound_payment.returned"),

    @SerializedName("treasury.outbound_payment.tracking_details_updated")
    TREASURY__OUTBOUND_PAYMENT__TRACKING_DETAILS_UPDATED(
        "treasury.outbound_payment.tracking_details_updated"),

    @SerializedName("treasury.outbound_transfer.canceled")
    TREASURY__OUTBOUND_TRANSFER__CANCELED("treasury.outbound_transfer.canceled"),

    @SerializedName("treasury.outbound_transfer.created")
    TREASURY__OUTBOUND_TRANSFER__CREATED("treasury.outbound_transfer.created"),

    @SerializedName("treasury.outbound_transfer.expected_arrival_date_updated")
    TREASURY__OUTBOUND_TRANSFER__EXPECTED_ARRIVAL_DATE_UPDATED(
        "treasury.outbound_transfer.expected_arrival_date_updated"),

    @SerializedName("treasury.outbound_transfer.failed")
    TREASURY__OUTBOUND_TRANSFER__FAILED("treasury.outbound_transfer.failed"),

    @SerializedName("treasury.outbound_transfer.posted")
    TREASURY__OUTBOUND_TRANSFER__POSTED("treasury.outbound_transfer.posted"),

    @SerializedName("treasury.outbound_transfer.returned")
    TREASURY__OUTBOUND_TRANSFER__RETURNED("treasury.outbound_transfer.returned"),

    @SerializedName("treasury.outbound_transfer.tracking_details_updated")
    TREASURY__OUTBOUND_TRANSFER__TRACKING_DETAILS_UPDATED(
        "treasury.outbound_transfer.tracking_details_updated"),

    @SerializedName("treasury.received_credit.created")
    TREASURY__RECEIVED_CREDIT__CREATED("treasury.received_credit.created"),

    @SerializedName("treasury.received_credit.failed")
    TREASURY__RECEIVED_CREDIT__FAILED("treasury.received_credit.failed"),

    @SerializedName("treasury.received_credit.succeeded")
    TREASURY__RECEIVED_CREDIT__SUCCEEDED("treasury.received_credit.succeeded"),

    @SerializedName("treasury.received_debit.created")
    TREASURY__RECEIVED_DEBIT__CREATED("treasury.received_debit.created"),

    @SerializedName("invoice_payment.detached")
    INVOICE_PAYMENT__DETACHED("invoice_payment.detached"),

    @SerializedName("billing.credit_balance_transaction.created")
    BILLING__CREDIT_BALANCE_TRANSACTION__CREATED("billing.credit_balance_transaction.created"),

    @SerializedName("billing.credit_grant.created")
    BILLING__CREDIT_GRANT__CREATED("billing.credit_grant.created"),

    @SerializedName("billing.credit_grant.updated")
    BILLING__CREDIT_GRANT__UPDATED("billing.credit_grant.updated"),

    @SerializedName("billing.meter.created")
    BILLING__METER__CREATED("billing.meter.created"),

    @SerializedName("billing.meter.deactivated")
    BILLING__METER__DEACTIVATED("billing.meter.deactivated"),

    @SerializedName("billing.meter.reactivated")
    BILLING__METER__REACTIVATED("billing.meter.reactivated"),

    @SerializedName("billing.meter.updated")
    BILLING__METER__UPDATED("billing.meter.updated");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EnabledEvent(String value) {
      this.value = value;
    }
  }
}
