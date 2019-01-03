package com.stripe.model;

import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethod extends StripeObject implements PaymentSource {
  BillingDetails billingDetails;

  Card card;

  Long created;

  @Getter(onMethod = @__({@Override}))
  String id;

  Ideal ideal;

  Boolean livemode;

  Map<String, String> metadata;

  String object;

  SepaDebit sepaDebit;

  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingDetails extends StripeObject {
    Address address;

    String email;

    String name;

    String phone;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    String brand;

    Long expMonth;

    Long expYear;

    String funding;

    String last4;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ideal extends StripeObject {
    String bank;

    String last4;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebit extends StripeObject {
    String bankCode;

    String branchCode;

    String country;

    String fingerprint;

    String last4;
  }
}
