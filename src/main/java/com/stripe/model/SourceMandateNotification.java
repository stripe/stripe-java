package com.stripe.model;

import com.stripe.net.APIResource;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
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
}
