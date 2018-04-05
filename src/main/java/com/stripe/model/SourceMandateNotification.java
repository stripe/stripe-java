package com.stripe.model;

import com.stripe.net.APIResource;

import java.util.Map;

public class SourceMandateNotification extends APIResource implements HasId, HasSourceTypeData {
  String id;
  String object;
  Long amount;
  Long created;
  Boolean livemode;
  String reason;
  Source source;
  String status;
  String type;

  // Type-specific properties
  Map<String, String> typeData;

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

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  // Type-specific getters/setters

  @Override
  public Map<String, String> getTypeData() {
    return typeData;
  }

  @Override
  public void setTypeData(Map<String, String> typeData) {
    this.typeData = typeData;
  }
}
