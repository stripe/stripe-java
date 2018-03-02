package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

public class UsageRecord extends APIResource implements HasId {
  String id;
  String object;
  Boolean livemode;
  Long quantity;
  String subscriptionItem;
  Long timestamp;

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

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public String getSubscriptionItem() {
    return subscriptionItem;
  }

  public void setSubscriptionItem(String subscriptionItem) {
    this.subscriptionItem = subscriptionItem;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Create a new usage record associated with a subscription item.
   * @param params The quantity, the timestamp and the conflict behaviour (action)
   * @param options Request options
   * @return The created usage record
   */
  public static UsageRecord create(Map<String, Object> params, RequestOptions options)
          throws AuthenticationException, InvalidRequestException,
          APIConnectionException, CardException, APIException {
    String subscriptionItem = (String)params.get("subscription_item");
    if (subscriptionItem == null) {
      throw new InvalidRequestException(
              "The params object must contain a subscription_item element",
              "subscription_item",
              null,
              null,
              null,
              null
      );
    }
    Map<String, Object> requestParams = new HashMap<String, Object>(params);
    requestParams.remove("subscription_item");
    return request(
            RequestMethod.POST,
            subresourceURL(SubscriptionItem.class, subscriptionItem, UsageRecord.class),
            requestParams, UsageRecord.class, options);
  }
}
