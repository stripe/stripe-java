package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceTransaction extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long availableOn;
  Long created;
  String currency;
  String description;
  Long fee;
  List<Fee> feeDetails;
  Long net;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<HasId> source;
  String status;
  String type;

  /**
   * The {@code sourced_transfers} attribute.
   *
   * @deprecated Prefer using the {@link Transfer#list} method with the {@code transfer_group}
   *     parameter.
   * @see <a href="https://stripe.com/docs/upgrades#2017-01-27">API version 2017-01-27</a>
   */
  @Deprecated
  TransferCollection sourcedTransfers;

  // <editor-fold desc="source">
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String sourceId) {
    this.source = setExpandableFieldId(sourceId, this.source);
  }

  public HasId getSourceObject() {
    return (this.source != null) ? this.source.getExpanded() : null;
  }

  public void setSourceObject(HasId o) {
    this.source = new ExpandableField<HasId>(o.getId(), o);
  }

  @SuppressWarnings("unchecked")
  public <O extends HasId> O getSourceObjectAs() {
    return (this.source != null) ? (O) this.source.getExpanded() : null;
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all balance history.
   */
  public static BalanceTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, null);
  }

  /**
   * List all balance history.
   */
  public static BalanceTransactionCollection list(Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s/%s", Stripe.getApiBase(), "v1/balance/history");
    return requestCollection(url, params, BalanceTransactionCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a balance transaction.
   */
  public static BalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a balance transaction.
   */
  public static BalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    String url = String.format("%s/%s/%s", Stripe.getApiBase(), "v1/balance/history", id);
    return request(RequestMethod.GET, url, null, BalanceTransaction.class, options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fee extends ApiResource {
    Long amount;
    String application;
    String currency;
    String description;
    String type;
  }
}
