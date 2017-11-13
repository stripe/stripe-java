package com.stripe.model;

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


public class SKU extends APIResource implements HasId, MetadataStore<SKU> {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Boolean active;
	@Getter @Setter
	Map<String, String> attributes;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	@Getter @Setter
	String image;
	@Getter @Setter
	Inventory inventory;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	Map<String, String> metadata;
	@Getter @Setter
	PackageDimensions packageDimensions;
	@Getter @Setter
	Integer price;
	ExpandableField<Product> product;
	@Getter @Setter
	Long updated;

	public String getProduct() {
		if (this.product == null) {
			return null;
		}
		return this.product.getId();
	}

	public void setProduct(String productID) {
		this.product = setExpandableFieldID(productID, this.product);

	}

	public Product getProductObject() {
		if (this.product == null) {
			return null;
		}
		return this.product.getExpanded();
	}

	public void setProductObject(Product product) {
		this.product = new ExpandableField<Product>(product.getId(), product);
	}

	public static SKU create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static SKU retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, null);
	}

	public SKU update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public static SKU create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(SKU.class), params, SKU.class, options);
	}

	public static SKU retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(SKU.class, id), null, SKU.class, options);
	}

	public static SKU retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(SKU.class, id), params, SKU.class, options);
	}

	public DeletedSKU delete()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(null);
	}

	public DeletedSKU delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(SKU.class, this.id), null, DeletedSKU.class, options);
	}

	public static SKUCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static SKUCollection list(Map<String, Object> params,
									 RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(SKU.class), params, SKUCollection.class, options);
	}

	@Deprecated
	public static SKUCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static SKUCollection all(Map<String, Object> params,
									RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	public SKU update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(SKU.class, this.id), params, SKU.class, options);
	}
}
