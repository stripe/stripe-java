package com.stripe.model;

import com.stripe.exception.*;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;


public class UsageRecord extends APIResource implements HasId {

    String id;
    String object;
    Long timestamp;
    String subscriptionItem;
    Integer quantity;

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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSubscriptionItem() {
        return subscriptionItem;
    }

    public void setSubscriptionItem(String subscriptionItem) {
        this.subscriptionItem = subscriptionItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public static UsageRecord create(String subscriptionItem, Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return create(subscriptionItem, params, null);
    }

    public static UsageRecord create(String subscriptionItem, Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, subclassInstanceURL(SubscriptionItem.class, subscriptionItem, UsageRecord.class), params, UsageRecord.class, options);
    }


}
