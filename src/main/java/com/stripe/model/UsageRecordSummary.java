package com.stripe.model;

import com.stripe.net.ApiResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class UsageRecordSummary extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String invoice;
  Boolean livemode;
  Period period;
  String subscriptionItem;
  Long totalUsage;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Period extends StripeObject {
    Long end;
    Long start;
  }
}
