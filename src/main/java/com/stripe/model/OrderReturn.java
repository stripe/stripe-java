package com.stripe.model;

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
public class OrderReturn extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long created;
  String currency;
  List<OrderItem> items;
  Boolean livemode;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Order> order;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Refund> refund;

  // <editor-fold desc="order">
  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String orderId) {
    this.order = setExpandableFieldId(orderId, this.order);
  }

  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order order) {
    this.order = new ExpandableField<Order>(order.getId(), order);
  }
  // </editor-fold>

  // <editor-fold desc="refund">
  public String getRefund() {
    return (this.refund != null) ? this.refund.getId() : null;
  }

  public void setRefund(String refundId) {
    this.refund = setExpandableFieldId(refundId, this.refund);
  }

  public Refund getRefundObject() {
    return (this.refund != null) ? this.refund.getExpanded() : null;
  }

  public void setRefundObject(Refund refund) {
    this.refund = new ExpandableField<Refund>(refund.getId(), refund);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all order returns.
   */
  public static OrderReturnCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all order returns.
   */
  public static OrderReturnCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(OrderReturn.class), params, OrderReturnCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an order return.
   */
  public static OrderReturn retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an order return.
   */
  public static OrderReturn retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(OrderReturn.class, id), null, OrderReturn.class,
        options);
  }
  // </editor-fold>
}
