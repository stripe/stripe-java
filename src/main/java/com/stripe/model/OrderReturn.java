package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class OrderReturn extends APIResource implements HasId {
  String id;
  String object;
  Long amount;
  Long created;
  String currency;
  List<OrderItem> items;
  Boolean livemode;
  ExpandableField<Order> order;
  ExpandableField<Refund> refund;

  @Override
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String orderID) {
    this.order = setExpandableFieldID(orderID, this.order);
  }

  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order order) {
    this.order = new ExpandableField<Order>(order.getId(), order);
  }

  public String getRefund() {
    return (this.refund != null) ? this.refund.getId() : null;
  }

  public void setRefund(String refundID) {
    this.refund = setExpandableFieldID(refundID, this.refund);
  }

  public Refund getRefundObject() {
    return (this.refund != null) ? this.refund.getExpanded() : null;
  }

  public void setRefundObject(Refund refund) {
    this.refund = new ExpandableField<Refund>(refund.getId(), refund);
  }

  public static OrderReturn retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  public static OrderReturn retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(OrderReturn.class, id), null, OrderReturn.class,
        options);
  }

  public static OrderReturnCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static OrderReturnCollection list(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(OrderReturn.class), params, OrderReturnCollection.class,
        options);
  }
}
