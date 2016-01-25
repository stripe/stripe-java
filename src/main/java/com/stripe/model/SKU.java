package com.stripe.model;

import java.util.Map;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;


public class SKU extends APIResource implements HasId, MetadataStore<SKU> {
	Long created;
	Long updated;
	String id;
	Boolean livemode;
	Boolean active;
	String image;
	Integer price;
	String currency;
	Map<String, String> attributes;
	Inventory inventory;
	String product;
	PackageDimensions packageDimensions;
	Map<String, String> metadata;

	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public Long getUpdated() {
		return updated;
	}
	public void setUpdated(Long updated) {
		this.updated = updated;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getLivemode() {
		return livemode;
	}
	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public PackageDimensions getPackageDimensions() {
		return packageDimensions;
	}
	public void setPackageDimensions(PackageDimensions packageDimensions) {
		this.packageDimensions = packageDimensions;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public static SKU create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static SKU retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public SKU update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
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

	public DeletedSKU delete()
		throws AuthenticationException, InvalidRequestException,
		APIConnectionException, CardException, APIException {
		return delete((RequestOptions) null);
	}

	public DeletedSKU delete(RequestOptions options)
		throws AuthenticationException, InvalidRequestException,
		APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(SKU.class, this.id), null, DeletedSKU.class, options);
	}

	public static SKUCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
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
		return list(params, (RequestOptions) null);
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
