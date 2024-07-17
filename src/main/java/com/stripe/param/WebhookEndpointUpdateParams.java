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
public class WebhookEndpointUpdateParams extends ApiRequestParams {
  /** An optional description of what the webhook is used for. */
  @SerializedName("description")
  Object description;

  /** Disable the webhook endpoint if set to true. */
  @SerializedName("disabled")
  Boolean disabled;

  /**
   * The list of events to enable for this endpoint. You may specify {@code ['*']} to enable all
   * events, except those that require explicit selection.
   */
  @SerializedName("enabled_events")
  List<WebhookEndpointUpdateParams.EnabledEvent> enabledEvents;

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
  Object url;

  private WebhookEndpointUpdateParams(
      Object description,
      Boolean disabled,
      List<WebhookEndpointUpdateParams.EnabledEvent> enabledEvents,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Object url) {
    this.description = description;
    this.disabled = disabled;
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
    private Object description;

    private Boolean disabled;

    private List<WebhookEndpointUpdateParams.EnabledEvent> enabledEvents;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Object url;

    /** Finalize and obtain parameter instance from this builder. */
    public WebhookEndpointUpdateParams build() {
      return new WebhookEndpointUpdateParams(
          this.description,
          this.disabled,
          this.enabledEvents,
          this.expand,
          this.extraParams,
          this.metadata,
          this.url);
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

    /** Disable the webhook endpoint if set to true. */
    public Builder setDisabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /**
     * Add an element to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointUpdateParams#enabledEvents} for the field documentation.
     */
    public Builder addEnabledEvent(WebhookEndpointUpdateParams.EnabledEvent element) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.add(element);
      return this;
    }

    /**
     * Add all elements to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointUpdateParams#enabledEvents} for the field documentation.
     */
    public Builder addAllEnabledEvent(List<WebhookEndpointUpdateParams.EnabledEvent> elements) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointUpdateParams#expand} for the field documentation.
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
     * WebhookEndpointUpdateParams#expand} for the field documentation.
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
     * WebhookEndpointUpdateParams#extraParams} for the field documentation.
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
     * See {@link WebhookEndpointUpdateParams#extraParams} for the field documentation.
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
     * WebhookEndpointUpdateParams#metadata} for the field documentation.
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
     * See {@link WebhookEndpointUpdateParams#metadata} for the field documentation.
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

    /** The URL of the webhook endpoint. */
    public Builder setUrl(EmptyParam url) {
      this.url = url;
      return this;
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

    @SerializedName("financial_connections.session.updated")
    FINANCIAL_CONNECTIONS__SESSION__UPDATED("financial_connections.session.updated"),

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

    @SerializedName("invoice.payment.overpaid")
    INVOICE__PAYMENT__OVERPAID("invoice.payment.overpaid"),

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

    @SerializedName("issuing_personalization_design.activated")
    ISSUING_PERSONALIZATION_DESIGN__ACTIVATED("issuing_personalization_design.activated"),

    @SerializedName("issuing_personalization_design.deactivated")
    ISSUING_PERSONALIZATION_DESIGN__DEACTIVATED("issuing_personalization_design.deactivated"),

    @SerializedName("issuing_personalization_design.rejected")
    ISSUING_PERSONALIZATION_DESIGN__REJECTED("issuing_personalization_design.rejected"),

    @SerializedName("issuing_personalization_design.updated")
    ISSUING_PERSONALIZATION_DESIGN__UPDATED("issuing_personalization_design.updated"),

    @SerializedName("issuing_token.created")
    ISSUING_TOKEN__CREATED("issuing_token.created"),

    @SerializedName("issuing_token.updated")
    ISSUING_TOKEN__UPDATED("issuing_token.updated"),

    @SerializedName("issuing_transaction.created")
    ISSUING_TRANSACTION__CREATED("issuing_transaction.created"),

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
    TREASURY__RECEIVED_DEBIT__CREATED("treasury.received_debit.created");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EnabledEvent(String value) {
      this.value = value;
    }
  }
}
