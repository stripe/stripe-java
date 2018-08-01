package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Balance extends ApiResource {
  String object;
  List<Money> available;
  Boolean livemode;
  List<Money> pending;

  // <editor-fold desc="retrieve">
  /**
   * Retrieve balance.
   */
  public static Balance retrieve() throws StripeException {
    return retrieve((RequestOptions) null);
  }

  /**
   * Retrieve balance.
   */
  public static Balance retrieve(RequestOptions options) throws StripeException {
    return retrieve(null, options);
  }

  /**
   * Retrieve balance.
   */
  public static Balance retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, singleClassUrl(Balance.class), params, Balance.class,
        options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Money extends StripeObject {
    Long amount;
    String currency;
    SourceTypes sourceTypes;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceTypes extends StripeObject {
      Long alipayAccount;
      Long bankAccount;
      Long bitcoinReceiver;
      Long card;
    }
  }
}
