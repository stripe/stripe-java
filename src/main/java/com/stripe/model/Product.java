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

public class Product extends APIResource implements HasId, MetadataStore<Product> {
  String id;
  String object;
  Boolean active;
  List<String> attributes;
  String caption;
  Long created;
  List<String> deactivateOn;
  String description;
  List<String> images;
  Boolean livemode;
  Map<String, String> metadata;
  String name;
  PackageDimensions packageDimensions;
  Boolean shippable;
  SKUCollection skus;
  String statementDescriptor;
  String type;
  Long updated;
  String url;

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

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public List<String> getDeactivateOn() {
    return deactivateOn;
  }

  public void setDeactivateOn(List<String> deactivateOn) {
    this.deactivateOn = deactivateOn;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  @Override
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageDimensions getPackageDimensions() {
    return packageDimensions;
  }

  public void setPackageDimensions(PackageDimensions packageDimensions) {
    this.packageDimensions = packageDimensions;
  }

  public Boolean getShippable() {
    return shippable;
  }

  public void setShippable(Boolean shippable) {
    this.shippable = shippable;
  }

  public SKUCollection getSkus() {
    return skus;
  }

  public void setSkus(SKUCollection skus) {
    this.skus = skus;
  }

  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public String getStatementDescriptor() {
    return statementDescriptor;
  }

  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getURL() {
    return url;
  }

  public void setURL(String url) {
    this.url = url;
  }

  public static Product create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  public static Product create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Product.class), params, Product.class, options);
  }

  public static Product retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  public static Product retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Product.class, id), null, Product.class, options);
  }

  @Override
  public Product update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  @Override
  public Product update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Product.class, this.id), params,
        Product.class, options);
  }

  public DeletedProduct delete()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(null);
  }

  public DeletedProduct delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Product.class, this.id), null,
        DeletedProduct.class, options);
  }

  public static ProductCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static ProductCollection list(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Product.class), params, ProductCollection.class, options);
  }

  @Deprecated
  public static ProductCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static ProductCollection all(Map<String, Object> params,
                    RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }
}
