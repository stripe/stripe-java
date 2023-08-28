// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.EventListParams;
import com.stripe.param.EventRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Events are our way of letting you know when something interesting happens in your account. When
 * an interesting event occurs, we create a new {@code Event} object. For example, when a charge
 * succeeds, we create a {@code charge.succeeded} event; and when an invoice payment attempt fails,
 * we create an {@code invoice.payment_failed} event. Note that many API requests may cause multiple
 * events to be created. For example, if you create a new subscription for a customer, you will
 * receive both a {@code customer.subscription.created} event and a {@code charge.succeeded} event.
 *
 * <p>Events occur when the state of another API resource changes. The state of that resource at the
 * time of the change is embedded in the event's data field. For example, a {@code charge.succeeded}
 * event will contain a charge, and an {@code invoice.payment_failed} event will contain an invoice.
 *
 * <p>As with other API resources, you can use endpoints to retrieve an <a
 * href="https://stripe.com/docs/api#retrieve_event">individual event</a> or a <a
 * href="https://stripe.com/docs/api#list_events">list of events</a> from the API. We also have a
 * separate <a href="http://en.wikipedia.org/wiki/Webhook">webhooks</a> system for sending the
 * {@code Event} objects directly to an endpoint on your server. Webhooks are managed in your <a
 * href="https://dashboard.stripe.com/account/webhooks">account settings</a>, and our <a
 * href="https://stripe.com/docs/webhooks">Using Webhooks</a> guide will help you get set up.
 *
 * <p>When using <a href="https://stripe.com/docs/connect">Connect</a>, you can also receive
 * notifications of events that occur in connected accounts. For these events, there will be an
 * additional {@code account} attribute in the received {@code Event} object.
 *
 * <p><strong>NOTE:</strong> Right now, access to events through the <a
 * href="https://stripe.com/docs/api#retrieve_event">Retrieve Event API</a> is guaranteed only for
 * 30 days.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends ApiResource implements HasId {
  /** The connected account that originated the event. */
  @SerializedName("account")
  String account;

  /**
   * The Stripe API version used to render {@code data}. <em>Note: This property is populated only
   * for events on or after October 31, 2014</em>.
   */
  @SerializedName("api_version")
  String apiVersion;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  @SerializedName("data")
  Data data;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code event}.
   */
  @SerializedName("object")
  String object;

  /**
   * Number of webhooks that have yet to be successfully delivered (i.e., to return a 20x response)
   * to the URLs you've specified.
   */
  @SerializedName("pending_webhooks")
  Long pendingWebhooks;

  /** Information on the API request that instigated the event. */
  @SerializedName("request")
  Request request;

  /**
   * Description of the event (e.g., {@code invoice.created} or {@code charge.refunded}).
   *
   * <p>One of {@code account.application.authorized}, {@code account.application.deauthorized},
   * {@code account.external_account.created}, {@code account.external_account.deleted}, {@code
   * account.external_account.updated}, {@code account.updated}, {@code application_fee.created},
   * {@code application_fee.refund.updated}, {@code application_fee.refunded}, {@code
   * balance.available}, {@code billing_portal.configuration.created}, {@code
   * billing_portal.configuration.updated}, {@code billing_portal.session.created}, {@code
   * capability.updated}, {@code cash_balance.funds_available}, {@code charge.captured}, {@code
   * charge.dispute.closed}, {@code charge.dispute.created}, {@code
   * charge.dispute.funds_reinstated}, {@code charge.dispute.funds_withdrawn}, {@code
   * charge.dispute.updated}, {@code charge.expired}, {@code charge.failed}, {@code charge.pending},
   * {@code charge.refund.updated}, {@code charge.refunded}, {@code charge.succeeded}, {@code
   * charge.updated}, {@code checkout.session.async_payment_failed}, {@code
   * checkout.session.async_payment_succeeded}, {@code checkout.session.completed}, {@code
   * checkout.session.expired}, {@code coupon.created}, {@code coupon.deleted}, {@code
   * coupon.updated}, {@code credit_note.created}, {@code credit_note.updated}, {@code
   * credit_note.voided}, {@code customer.created}, {@code customer.deleted}, {@code
   * customer.discount.created}, {@code customer.discount.deleted}, {@code
   * customer.discount.updated}, {@code customer.source.created}, {@code customer.source.deleted},
   * {@code customer.source.expiring}, {@code customer.source.updated}, {@code
   * customer.subscription.created}, {@code customer.subscription.deleted}, {@code
   * customer.subscription.paused}, {@code customer.subscription.pending_update_applied}, {@code
   * customer.subscription.pending_update_expired}, {@code customer.subscription.resumed}, {@code
   * customer.subscription.trial_will_end}, {@code customer.subscription.updated}, {@code
   * customer.tax_id.created}, {@code customer.tax_id.deleted}, {@code customer.tax_id.updated},
   * {@code customer.updated}, {@code customer_cash_balance_transaction.created}, {@code
   * file.created}, {@code financial_connections.account.created}, {@code
   * financial_connections.account.deactivated}, {@code financial_connections.account.disconnected},
   * {@code financial_connections.account.reactivated}, {@code
   * financial_connections.account.refreshed_balance}, {@code
   * identity.verification_session.canceled}, {@code identity.verification_session.created}, {@code
   * identity.verification_session.processing}, {@code identity.verification_session.redacted},
   * {@code identity.verification_session.requires_input}, {@code
   * identity.verification_session.verified}, {@code invoice.created}, {@code invoice.deleted},
   * {@code invoice.finalization_failed}, {@code invoice.finalized}, {@code
   * invoice.marked_uncollectible}, {@code invoice.paid}, {@code invoice.payment_action_required},
   * {@code invoice.payment_failed}, {@code invoice.payment_succeeded}, {@code invoice.sent}, {@code
   * invoice.upcoming}, {@code invoice.updated}, {@code invoice.voided}, {@code
   * invoiceitem.created}, {@code invoiceitem.deleted}, {@code invoiceitem.updated}, {@code
   * issuing_authorization.created}, {@code issuing_authorization.request}, {@code
   * issuing_authorization.updated}, {@code issuing_card.created}, {@code issuing_card.updated},
   * {@code issuing_cardholder.created}, {@code issuing_cardholder.updated}, {@code
   * issuing_dispute.closed}, {@code issuing_dispute.created}, {@code
   * issuing_dispute.funds_reinstated}, {@code issuing_dispute.submitted}, {@code
   * issuing_dispute.updated}, {@code issuing_transaction.created}, {@code
   * issuing_transaction.updated}, {@code mandate.updated}, {@code order.created}, {@code
   * payment_intent.amount_capturable_updated}, {@code payment_intent.canceled}, {@code
   * payment_intent.created}, {@code payment_intent.partially_funded}, {@code
   * payment_intent.payment_failed}, {@code payment_intent.processing}, {@code
   * payment_intent.requires_action}, {@code payment_intent.succeeded}, {@code
   * payment_link.created}, {@code payment_link.updated}, {@code payment_method.attached}, {@code
   * payment_method.automatically_updated}, {@code payment_method.detached}, {@code
   * payment_method.updated}, {@code payout.canceled}, {@code payout.created}, {@code
   * payout.failed}, {@code payout.paid}, {@code payout.reconciliation_completed}, {@code
   * payout.updated}, {@code person.created}, {@code person.deleted}, {@code person.updated}, {@code
   * plan.created}, {@code plan.deleted}, {@code plan.updated}, {@code price.created}, {@code
   * price.deleted}, {@code price.updated}, {@code product.created}, {@code product.deleted}, {@code
   * product.updated}, {@code promotion_code.created}, {@code promotion_code.updated}, {@code
   * quote.accepted}, {@code quote.canceled}, {@code quote.created}, {@code quote.finalized}, {@code
   * radar.early_fraud_warning.created}, {@code radar.early_fraud_warning.updated}, {@code
   * recipient.created}, {@code recipient.deleted}, {@code recipient.updated}, {@code
   * refund.created}, {@code refund.updated}, {@code reporting.report_run.failed}, {@code
   * reporting.report_run.succeeded}, {@code reporting.report_type.updated}, {@code review.closed},
   * {@code review.opened}, {@code setup_intent.canceled}, {@code setup_intent.created}, {@code
   * setup_intent.requires_action}, {@code setup_intent.setup_failed}, {@code
   * setup_intent.succeeded}, {@code sigma.scheduled_query_run.created}, {@code sku.created}, {@code
   * sku.deleted}, {@code sku.updated}, {@code source.canceled}, {@code source.chargeable}, {@code
   * source.failed}, {@code source.mandate_notification}, {@code source.refund_attributes_required},
   * {@code source.transaction.created}, {@code source.transaction.updated}, {@code
   * subscription_schedule.aborted}, {@code subscription_schedule.canceled}, {@code
   * subscription_schedule.completed}, {@code subscription_schedule.created}, {@code
   * subscription_schedule.expiring}, {@code subscription_schedule.released}, {@code
   * subscription_schedule.updated}, {@code tax.settings.updated}, {@code tax_rate.created}, {@code
   * tax_rate.updated}, {@code terminal.reader.action_failed}, {@code
   * terminal.reader.action_succeeded}, {@code test_helpers.test_clock.advancing}, {@code
   * test_helpers.test_clock.created}, {@code test_helpers.test_clock.deleted}, {@code
   * test_helpers.test_clock.internal_failure}, {@code test_helpers.test_clock.ready}, {@code
   * topup.canceled}, {@code topup.created}, {@code topup.failed}, {@code topup.reversed}, {@code
   * topup.succeeded}, {@code transfer.created}, {@code transfer.reversed}, or {@code
   * transfer.updated}.
   */
  @SerializedName("type")
  String type;

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/events";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            EventCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(EventListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version} attribute
   * (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(EventListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/events";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            EventCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/events/%s", ApiResource.urlEncodeId(id));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Event.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, EventRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/events/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Event.class,
            options,
            ApiMode.V1);
  }

  /**
   * Get deserialization helper to handle failure due to schema incompatibility. When event API
   * version matches that of the library's pinned version, the following integration pattern is
   * safe.
   *
   * <pre>
   *   Event event = getEvent(); // either from webhook or event endpoint
   *   EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();
   *   Optional&lt;StripeObject&gt; stripeObject = deserializer.getObject();
   * </pre>
   *
   * You can ensure that webhook events has the same API version by creating webhook endpoint
   * specifying api version](https://stripe.com/docs/api/webhook_endpoints/create) as {@link
   * com.stripe.Stripe#API_VERSION}. For reading from old webhook endpoints or old events with
   * potential schema incompatibility, see {@link EventDataObjectDeserializer#deserialize()} and
   * {@link EventDataObjectDeserializer#deserializeUnsafe()}.
   */
  public EventDataObjectDeserializer getDataObjectDeserializer() {
    return new EventDataObjectDeserializer(apiVersion, type, data.object);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Data extends StripeObject {
    /**
     * Object containing the names of the updated attributes and their values prior to the event
     * (only included in events of type {@code *.updated}). If an array attribute has any updated
     * elements, this object contains the entire array. In Stripe API versions 2017-04-06 or
     * earlier, an updated array attribute in this object includes only the updated array elements.
     */
    @SerializedName("previous_attributes")
    Map<String, Object> previousAttributes;

    /**
     * Raw JSON object intended to be deserialized as {@code StripeObject}. The deserialization
     * should be deferred to the user. See the now deprecated method {@link #getObject()}.
     */
    @SerializedName("object")
    JsonObject object;

    /**
     * @deprecated Deprecated in favor of getting {@code StripeObject} from {@link
     *     Event#getDataObjectDeserializer()} and {@link EventDataObjectDeserializer#getObject()}.
     *     Throws {@link JsonParseException} deserialization failure due to general invalid JSON, or
     *     more specifically when JSON data and model class have incompatible schemas.
     * @return Deserialized StripeObject for event data.
     */
    @Deprecated
    public StripeObject getObject() {
      return StripeObject.deserializeStripeObject(object);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Request extends StripeObject implements HasId {
    /**
     * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe's
     * automatic subscription handling). Request logs are available in the <a
     * href="https://dashboard.stripe.com/logs">dashboard</a>, but currently not in the API.
     */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The idempotency key transmitted during the request, if any. <em>Note: This property is
     * populated only for events on or after May 23, 2017</em>.
     */
    @SerializedName("idempotency_key")
    String idempotencyKey;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(data, responseGetter);
    trySetResponseGetter(request, responseGetter);
  }
}
