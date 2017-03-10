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

public class Order extends APIResource implements HasId, MetadataStore<Order> {
	String id;
	String object;
	Long amount;
	Long amountReturned;
	String application;
	Long applicationFee;
	ExpandableField<Charge> charge;
	Long created;
	String currency;
	ExpandableField<Customer> customer;
	String email;
	String externalCouponCode;
	List<OrderItem> items;
	Boolean livemode;
	Map<String, String> metadata;
	OrderReturnCollection returns;
	String selectedShippingMethod;
	ShippingDetails shipping;
	List<ShippingMethod> shippingMethods;
	String status;
	StatusTransitions statusTransitions;
	Long updated;
	String upstreamId;

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

	public Long getAmountReturned() {
		return amountReturned;
	}

	public void setAmountReturned(Long amountReturned) {
		this.amountReturned = amountReturned;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Long getApplicationFee() {
		return applicationFee;
	}

	public void setApplicationFee(Long applicationFee) {
		this.applicationFee = applicationFee;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExternalCouponCode() {
		return externalCouponCode;
	}

	public void setExternalCouponCode(String externalCouponCode) {
		this.externalCouponCode = externalCouponCode;
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

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public OrderReturnCollection getReturns() {
		return returns;
	}

	public void setReturns(OrderReturnCollection returns) {
		this.returns = returns;
	}

	public String getSelectedShippingMethod() {
		return selectedShippingMethod;
	}

	public void setSelectedShippingMethod(String selectedShippingMethod) {
		this.selectedShippingMethod = selectedShippingMethod;
	}

	public ShippingDetails getShipping() {
		return shipping;
	}

	public void setShipping(ShippingDetails shipping) {
		this.shipping = shipping;
	}

	public List<ShippingMethod> getShippingMethods() {
		return shippingMethods;
	}

	public void setShippingMethods(List<ShippingMethod> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StatusTransitions getStatusTransitions() {
		return statusTransitions;
	}

	public void setStatusTransitions(StatusTransitions statusTransitions) {
		this.statusTransitions = statusTransitions;
	}

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	public String getUpstreamId() {
		return upstreamId;
	}

	public void setUpstreamId(String upstreamId) {
		this.upstreamId = upstreamId;
	}

	public static Order create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Order retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public Order update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
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
		return list(params, (RequestOptions) null);
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
		return list(params, (RequestOptions) null);
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
		return this.pay(params, (RequestOptions) null);
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
		return this.returnOrder(params, (RequestOptions) null);
	}

	public OrderReturn returnOrder(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/returns",
					instanceURL(Order.class, this.getId())), params, OrderReturn.class, options);
	}
}
