package com.stripe.model;

import com.stripe.net.ApiResource;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTransaction extends ApiResource implements HasId, HasSourceTypeData {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long created;
  String currency;
  String customerData;
  Boolean livemode;
  String source;
  String type;

  // Type-specific properties
  @Getter(onMethod = @__({@Override})) @Setter(onMethod = @__({@Override}))
      Map<String, String> typeData;
}
