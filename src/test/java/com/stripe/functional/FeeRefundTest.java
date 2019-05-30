package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplicationFee;
import com.stripe.model.FeeRefund;
import com.stripe.model.FeeRefundCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FeeRefundCollectionCreateParams;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class FeeRefundTest extends BaseStripeTest {
  public static final String FEE_ID = "fee_123";
  public static final String REFUND_ID = "fr_123";

  private ApplicationFee getFeeFixture() throws StripeException {
    final ApplicationFee fee = ApplicationFee.retrieve(FEE_ID);
    resetNetworkSpy();
    return fee;
  }

  private FeeRefund getRefundFixture(ApplicationFee fee) throws StripeException {
    final FeeRefund refund = fee.getRefunds().retrieve(REFUND_ID);
    resetNetworkSpy();
    return refund;
  }

  @Test
  public void testCreate() throws StripeException {
    final ApplicationFee fee = getFeeFixture();

    final Map<String, Object> params = new HashMap<>();
    params.put("amount", 100);

    final FeeRefund refund = fee.getRefunds().create(params);

    assertNotNull(refund);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/application_fees/%s/refunds", fee.getId()),
        params);
  }

  @Test
  public void testCreateWithTypedParams() throws StripeException {
    final ApplicationFee fee = getFeeFixture();

    FeeRefundCollectionCreateParams typedParams =
        FeeRefundCollectionCreateParams.builder().setAmount(100L).build();

    final FeeRefund refund = fee.getRefunds().create(typedParams, RequestOptions.getDefault());

    assertNotNull(refund);
    Map<String, Object> param = new HashMap<>();
    param.put("amount", 100);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/application_fees/%s/refunds", fee.getId()),
        param);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final ApplicationFee fee = getFeeFixture();

    final FeeRefund refund = fee.getRefunds().retrieve(REFUND_ID);

    assertNotNull(refund);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/application_fees/%s/refunds/%s", fee.getId(), REFUND_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final ApplicationFee fee = getFeeFixture();
    final FeeRefund refund = getRefundFixture(fee);

    Map<String, Object> metadata = new HashMap<>();
    metadata.put("key", "value");
    Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final FeeRefund updatedRefund = refund.update(params);

    assertNotNull(updatedRefund);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/application_fees/%s/refunds/%s", fee.getId(), refund.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final ApplicationFee fee = getFeeFixture();

    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final FeeRefundCollection refunds = fee.getRefunds().list(params);

    assertNotNull(refunds);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/application_fees/%s/refunds", fee.getId()),
        params);
  }
}
