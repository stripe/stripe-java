// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class WebhookEndpointUpdateParams extends ApiRequestParams {
  /** Disable the webhook endpoint if set to true. */
  @SerializedName("disabled")
  Boolean disabled;

  /**
   * The list of events to enable for this endpoint. You may specify `['*']` to enable all events.
   */
  @SerializedName("enabled_events")
  List<EnabledEvent> enabledEvents;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** The URL of the webhook endpoint. */
  @SerializedName("url")
  String url;

  private WebhookEndpointUpdateParams(
      Boolean disabled, List<EnabledEvent> enabledEvents, List<String> expand, String url) {
    this.disabled = disabled;
    this.enabledEvents = enabledEvents;
    this.expand = expand;
    this.url = url;
  }

  public static Builder builder() {
    return new com.stripe.param.WebhookEndpointUpdateParams.Builder();
  }

  public static class Builder {
    private Boolean disabled;

    private List<EnabledEvent> enabledEvents;

    private List<String> expand;

    private String url;

    /** Finalize and obtain parameter instance from this builder. */
    public WebhookEndpointUpdateParams build() {
      return new WebhookEndpointUpdateParams(
          this.disabled, this.enabledEvents, this.expand, this.url);
    }

    /**
     * Add all elements to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointUpdateParams#enabledEvents} for the field documentation.
     */
    public Builder addAllEnabledEvent(List<EnabledEvent> elements) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.addAll(elements);
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
     * Add an element to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointUpdateParams#enabledEvents} for the field documentation.
     */
    public Builder addEnabledEvent(EnabledEvent element) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.add(element);
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

    /** Disable the webhook endpoint if set to true. */
    public Builder setDisabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /** The URL of the webhook endpoint. */
    public Builder setUrl(String url) {
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

    @SerializedName("application_fee.created")
    APPLICATION_FEE__CREATED("application_fee.created"),

    @SerializedName("application_fee.refund.updated")
    APPLICATION_FEE__REFUND__UPDATED("application_fee.refund.updated"),

    @SerializedName("application_fee.refunded")
    APPLICATION_FEE__REFUNDED("application_fee.refunded"),

    @SerializedName("balance.available")
    BALANCE__AVAILABLE("balance.available"),

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

    @SerializedName("checkout.session.completed")
    CHECKOUT__SESSION__COMPLETED("checkout.session.completed"),

    @SerializedName("coupon.created")
    COUPON__CREATED("coupon.created"),

    @SerializedName("coupon.deleted")
    COUPON__DELETED("coupon.deleted"),

    @SerializedName("coupon.updated")
    COUPON__UPDATED("coupon.updated"),

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

    @SerializedName("customer.subscription.trial_will_end")
    CUSTOMER__SUBSCRIPTION__TRIAL_WILL_END("customer.subscription.trial_will_end"),

    @SerializedName("customer.subscription.updated")
    CUSTOMER__SUBSCRIPTION__UPDATED("customer.subscription.updated"),

    @SerializedName("customer.updated")
    CUSTOMER__UPDATED("customer.updated"),

    @SerializedName("file.created")
    FILE__CREATED("file.created"),

    @SerializedName("invoice.created")
    INVOICE__CREATED("invoice.created"),

    @SerializedName("invoice.deleted")
    INVOICE__DELETED("invoice.deleted"),

    @SerializedName("invoice.finalized")
    INVOICE__FINALIZED("invoice.finalized"),

    @SerializedName("invoice.marked_uncollectible")
    INVOICE__MARKED_UNCOLLECTIBLE("invoice.marked_uncollectible"),

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

    @SerializedName("issuing_dispute.created")
    ISSUING_DISPUTE__CREATED("issuing_dispute.created"),

    @SerializedName("issuing_dispute.updated")
    ISSUING_DISPUTE__UPDATED("issuing_dispute.updated"),

    @SerializedName("issuing_settlement.created")
    ISSUING_SETTLEMENT__CREATED("issuing_settlement.created"),

    @SerializedName("issuing_settlement.updated")
    ISSUING_SETTLEMENT__UPDATED("issuing_settlement.updated"),

    @SerializedName("issuing_transaction.created")
    ISSUING_TRANSACTION__CREATED("issuing_transaction.created"),

    @SerializedName("issuing_transaction.updated")
    ISSUING_TRANSACTION__UPDATED("issuing_transaction.updated"),

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

    @SerializedName("payment_intent.created")
    PAYMENT_INTENT__CREATED("payment_intent.created"),

    @SerializedName("payment_intent.payment_failed")
    PAYMENT_INTENT__PAYMENT_FAILED("payment_intent.payment_failed"),

    @SerializedName("payment_intent.succeeded")
    PAYMENT_INTENT__SUCCEEDED("payment_intent.succeeded"),

    @SerializedName("payment_method.attached")
    PAYMENT_METHOD__ATTACHED("payment_method.attached"),

    @SerializedName("payment_method.card_automatically_updated")
    PAYMENT_METHOD__CARD_AUTOMATICALLY_UPDATED("payment_method.card_automatically_updated"),

    @SerializedName("payment_method.detached")
    PAYMENT_METHOD__DETACHED("payment_method.detached"),

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

    @SerializedName("product.created")
    PRODUCT__CREATED("product.created"),

    @SerializedName("product.deleted")
    PRODUCT__DELETED("product.deleted"),

    @SerializedName("product.updated")
    PRODUCT__UPDATED("product.updated"),

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

    @Getter private final String value;

    EnabledEvent(String value) {
      this.value = value;
    }
  }
}
