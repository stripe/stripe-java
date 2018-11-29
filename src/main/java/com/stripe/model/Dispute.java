package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends ApiResource
    implements BalanceTransactionSource, MetadataStore<Dispute> {
  /**
   * Disputed amount. Usually the amount of the charge, but can differ (usually because of currency
   * fluctuation or because only part of the order is disputed).
   */
  Long amount;

  /**
   * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your
   * Stripe account as a result of this dispute.
   */
  List<BalanceTransaction> balanceTransactions;

  /** ID of the charge that was disputed. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  DisputeEvidence evidence;

  DisputeEvidenceDetails evidenceDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * If true, it is still possible to refund the disputed payment. Once the payment has been fully
   * refunded, no further funds will be withdrawn from your Stripe account as a result of this
   * dispute.
   */
  Boolean isChargeRefundable;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Reason given by cardholder for dispute. Possible values are `duplicate`, `fraudulent`,
   * `subscription_canceled`, `product_unacceptable`, `product_not_received`, `unrecognized`,
   * `credit_not_processed`, `general`, `incorrect_account_details`, `insufficient_funds`,
   * `bank_cannot_process`, `debit_not_authorized`, or `customer_initiated`. Read more about
   * [dispute reasons](/docs/disputes/categories).
   */
  String reason;

  /**
   * Current status of dispute. Possible values are `warning_needs_response`,
   * `warning_under_review`, `warning_closed`, `needs_response`, `under_review`, `charge_refunded`,
   * `won`, or `lost`.
   */
  String status;

  /** Get id of expandable `charge` object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded `charge`. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of your disputes. */
  public static DisputeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your disputes. */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/disputes");
    return requestCollection(url, params, DisputeCollection.class, options);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(String dispute) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(String dispute, RequestOptions options) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, options);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(String dispute, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/disputes/%s", dispute));
    return request(ApiResource.RequestMethod.GET, url, params, Dispute.class, options);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from <code>needs_response</code> to <code>lost</code>.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close() throws StripeException {
    return close((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from <code>needs_response</code> to <code>lost</code>.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(Map<String, Object> params) throws StripeException {
    return close(params, (RequestOptions) null);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from <code>needs_response</code> to <code>lost</code>.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/disputes/%s/close", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/disputes/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }
}
