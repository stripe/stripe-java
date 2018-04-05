package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.Charge;
import com.stripe.model.ChargeRefundCollection;
import com.stripe.model.Refund;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class RefundTest extends BaseStripeFunctionalTest {
  @Test
  public void testChargeRefund() throws StripeException {
    Charge createdCharge = Charge.create(defaultChargeParams);
    Charge refundedCharge = createdCharge.refund();
    assertTrue(refundedCharge.getRefunded());
    ChargeRefundCollection refunds = refundedCharge.getRefunds();
    assertTrue(refunds.getData() instanceof List);
    assertEquals(1, refunds.getData().size());
    assertTrue(refunds.getData().get(0) instanceof Refund);
  }

  @Test
  public void testChargeRefundUpdateApiKey() throws StripeException {
    Charge createdCharge = Charge.create(defaultChargeParams);
    ChargeRefundCollection refunds = createdCharge.refund().getRefunds();
    Refund refund = refunds.getData().get(0);

    Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("foo", "bar");

    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("metadata", metadata);
    refund = refund.update(updateParams, Stripe.apiKey);

    assertEquals("bar", refund.getMetadata().get("foo"));
  }

  @Test
  public void testChargeRefundCreate() throws StripeException {
    Charge ch = Charge.create(defaultChargeParams);
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 10);
    ChargeRefundCollection refunds = ch.getRefunds();
    Refund created = refunds.create(params);
    Refund retrieved = ch.getRefunds().retrieve(created.getId());
    assertEquals(created.getId(), retrieved.getId());
  }

  @Test
  public void testChargeRefundCreateApiKey() throws StripeException {
    Charge ch = Charge.create(defaultChargeParams);
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 10);
    Refund created = ch.getRefunds().create(params, Stripe.apiKey);
    Refund retrieved = ch.getRefunds().retrieve(created.getId(), Stripe.apiKey);
    assertEquals(created.getId(), retrieved.getId());
  }

  @Test
  public void testChargePartialRefund() throws StripeException {
    Charge createdCharge = Charge.create(defaultChargeParams);
    Map<String, Object> refundParams = new HashMap<String, Object>();
    final Long refundAmount = 50L;
    refundParams.put("amount", refundAmount);
    Charge refundedCharge = createdCharge.refund(refundParams);
    assertFalse(refundedCharge.getRefunded());
    assertEquals(refundedCharge.getAmountRefunded(), refundAmount);
  }

  @Test
  public void testChargeRefundListAndRetrieve()
      throws StripeException {
    Charge ch = Charge.create(defaultChargeParams);
    ch = ch.refund();
    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("count", 1);
    Refund created = ch.getRefunds().all(listParams).getData().get(0);
    Refund retrieved = ch.getRefunds().retrieve(created.getId());
    assertEquals(created.getId(), retrieved.getId());
  }

  @Test
  public void testChargeRefundListAndRetrievePerCallAPIKey()
      throws StripeException {
    Charge ch = Charge.create(defaultChargeParams);
    ch = ch.refund();
    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("count", 1);
    Refund created = ch.getRefunds().all(listParams,
        Stripe.apiKey).getData().get(0);
    Refund retrieved = ch.getRefunds().retrieve(created.getId(), Stripe.apiKey);
    assertEquals(created.getId(), retrieved.getId());
  }

  @Test
  public void testChargeRefundListWithExpand()
      throws StripeException {
    Charge ch = Charge.create(defaultChargeParams);
    ch = ch.refund();

    List<String> expandList = new ArrayList<>();
    expandList.add("data.balance_transaction");
    expandList.add("data.balance_transaction.source");
    expandList.add("data.charge");

    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("charge", ch.getId());
    listParams.put("count", 1);
    listParams.put("expand", expandList);

    Refund refund = Refund.list(listParams).getData().get(0);

    Charge expCharge = refund.getChargeObject();
    assertNotNull(expCharge);
    assertEquals(ch.getId(), expCharge.getId());

    BalanceTransaction expBT = refund.getBalanceTransactionObject();
    assertNotNull(expBT);
    Refund expRefundInBT = (Refund) expBT.getSourceObject();
    assertEquals(refund.getId(), expRefundInBT.getId());
  }

  @Test
  public void testRefundMetadata() throws StripeException {
    Charge createdCharge = Charge.create(defaultChargeParams);
    Charge refundedCharge = createdCharge.refund();
    testMetadata(refundedCharge.getRefunds().getData().get(0));
  }
}
