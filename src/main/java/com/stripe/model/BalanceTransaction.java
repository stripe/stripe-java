package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
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
public class BalanceTransaction extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long availableOn;
  Long created;
  String currency;
  String description;
  Long fee;
  List<Fee> feeDetails;
  Integer net;
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

  public void setSource(String sourceID) {
    this.source = setExpandableFieldID(sourceID, this.source);
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
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all balance history.
   */
  public static BalanceTransactionCollection list(Map<String, Object> params,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    String url = String.format("%s/%s", Stripe.getApiBase(), "v1/balance/history");
    return requestCollection(url, params, BalanceTransactionCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a balance transaction.
   */
  public static BalanceTransaction retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a balance transaction.
   */
  public static BalanceTransaction retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    String url = String.format("%s/%s/%s", Stripe.getApiBase(), "v1/balance/history", id);
    return request(RequestMethod.GET, url, null, BalanceTransaction.class, options);
  }
  // </editor-fold>
}
