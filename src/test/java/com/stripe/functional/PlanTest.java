package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.DeletedPlan;
import com.stripe.model.Plan;
import com.stripe.model.PlanCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PlanTest extends BaseStripeTest {
  public static final String PLAN_ID = "gold";

  private Plan getPlanFixture() throws StripeException {
    final Plan plan = Plan.retrieve(PLAN_ID);
    resetNetworkSpy();
    return plan;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 1);
    params.put("currency", "usd");
    params.put("id", "sapphire-elite");
    params.put("interval", "month");
    params.put("name", "Sapphire Elite");

    final Plan plan = Plan.create(params);

    assertNotNull(plan);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/plans",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Plan plan = Plan.retrieve(PLAN_ID);

    assertNotNull(plan);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/plans/%s", PLAN_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Plan plan = getPlanFixture();

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("name", "Updated Name");

    final Plan updatedPlan = plan.update(params);

    assertNotNull(updatedPlan);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/plans/%s", plan.getId()),
        params
    );
  }

  @Test
  public void testDelete() throws StripeException {
    final Plan plan = getPlanFixture();

    final DeletedPlan deletedPlan = plan.delete();

    assertNotNull(deletedPlan);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/plans/%s", plan.getId())
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    PlanCollection plans = Plan.list(params);

    assertNotNull(plans);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/plans",
        params
    );
  }
}
