package com.stripe.model;

import java.util.List;
import java.util.Map;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

public class OrderReturn extends APIResource implements HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	@Getter @Setter
	List<OrderItem> items;
	@Getter @Setter
	Boolean livemode;
	ExpandableField<Order> order;
	ExpandableField<Refund> refund;

	public String getOrder() {
		if (order == null) {
			return null;
		}
		return order.getId();
	}

	public void setOrder(String orderID) {
		this.order = setExpandableFieldID(orderID, this.order);
	}

	public Order getOrderObject() {
		if (this.order == null) {
			return null;
		}
		return this.order.getExpanded();
	}

	public void setOrderObject(Order order) {
		this.order = new ExpandableField<Order>(order.getId(), order);
	}

	public String getRefund() {
		if (refund == null) {
			return null;
		}
		return refund.getId();
	}

	public void setRefund(String refundID) {
		this.refund = setExpandableFieldID(refundID, this.refund);
	}

	public Refund getRefundObject() {
		if (this.refund == null) {
			return null;
		}
		return this.refund.getExpanded();
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
		return request(RequestMethod.GET, instanceURL(OrderReturn.class, id), null, OrderReturn.class, options);
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
		return requestCollection(classURL(OrderReturn.class), params, OrderReturnCollection.class, options);
	}
}
