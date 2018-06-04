package com.stripe.model;

import com.stripe.net.APIResource;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTransaction extends APIResource implements HasId, HasSourceTypeData {
  String id;
  String object;
  Long amount;
  Long created;
  String currency;
  String customerData;
  Boolean livemode;
  String source;
  String type;

  // Type-specific properties
  Map<String, String> typeData;
}
