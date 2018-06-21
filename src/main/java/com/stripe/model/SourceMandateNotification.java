package com.stripe.model;

import com.stripe.net.ApiResource;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceMandateNotification extends ApiResource implements HasId, HasSourceTypeData {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long created;
  Boolean livemode;
  String reason;
  Source source;
  String status;
  String type;

  // Type-specific properties
  @Getter(onMethod = @__({@Override})) @Setter(onMethod = @__({@Override}))
      Map<String, String> typeData;
}
