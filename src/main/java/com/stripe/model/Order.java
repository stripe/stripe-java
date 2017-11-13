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

public class Order extends APIResource implements HasId, MetadataStore<Order> {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long amountReturned;
	@Getter @Setter
	String application;
	@Getter @Setter
	Long applicationFee;
	ExpandableField<Charge> charge;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	ExpandableField<Customer> customer;
	@Getter @Setter
	String email;
	@Getter @Setter
	String externalCouponCode;
	@Getter @Setter
	List<OrderItem> items;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	Map<String, String> metadata;
	@Getter @Setter
	OrderReturnCollection returns;
	@Getter @Setter
	String selectedShippingMethod;
	@Getter @Setter
	ShippingDetails shipping;
	@Getter @Setter
	List<ShippingMethod> shippingMethods;
	@Getter @Setter
	String status;
	@Getter @Setter
	StatusTransitions statusTransitions;
	@Getter @Setter
	Long updated;
	@Getter @Setter
	String upstreamId;

	public String getCharge() {
		if (this.charge == null) {
			return null;
		}
		return this.charge.getId();
	}

	public void setCharge(String chargeID) {
		this.charge = setExpandableFieldID(chargeID, this.charge);

	}

	public Charge getChargeObject() {
		if (this.charge == null) {
			return null;
		}
		return this.charge.getExpanded();
	}

	public void setChargeObject(Charge charge) {
		this.charge = new ExpandableField<Charge>(charge.getId(), charge);
	}

	public String getCustomer() {
		if (this.customer == null) {
			return null;
		}
		return this.customer.getId();
	}

	public void setCustomer(String customerID) {
		this.customer = setExpandableFieldID(customerID, this.customer);
	}

	public Customer getCustomerObject() {
		if (this.customer == null) {
			return null;
		}
		return this.customer.getExpanded();
	}

	public void setCustomerObject(Customer customer) {
		this.customer = new ExpandableField<Customer>(customer.getId(), customer);
	}

	public static Order create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static Order retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, null);
	}

	public Order update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public static Order create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Order.class), params, Order.class, options);
	}

	public static Order retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Order.class, id), null, Order.class, options);
	}

	public static Order retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Order.class, id), params, Order.class, options);
	}

	public static OrderCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static OrderCollection list(Map<String, Object> params,
									   RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Order.class), params, OrderCollection.class, options);
	}

	@Deprecated
	public static OrderCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static OrderCollection all(Map<String, Object> params,
									  RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	@Deprecated
	public Order update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Order.class, this.id), params, Order.class, options);
	}

	public Order pay(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.pay(params, null);
	}

	public Order pay(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/pay",
				instanceURL(Order.class, this.getId())), params, Order.class, options);
	}

	public OrderReturn returnOrder(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.returnOrder(params, null);
	}

	public OrderReturn returnOrder(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/returns",
				instanceURL(Order.class, this.getId())), params, OrderReturn.class, options);
	}
}
