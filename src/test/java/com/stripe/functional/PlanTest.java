package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.DeletedPlan;
import com.stripe.model.Plan;
import com.stripe.model.PlanTier;
import com.stripe.model.PlanTransformUsage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.junit.Test;

public class PlanTest extends BaseStripeFunctionalTest {
  @Test
  public void testPlanCreate() throws StripeException {
    Plan plan = Plan.create(getUniquePlanParams());
    assertEquals(plan.getInterval(), "month");
    assertEquals(plan.getIntervalCount(), (Integer) 2);
  }

  @Test
  public void testPlanCreateWithProduct() throws StripeException {
    Plan plan = Plan.create(defaultPlanWithProductParams);
    assertEquals(plan.getInterval(), "month");
    assertEquals(plan.getIntervalCount(), (Integer) 2);
    assertEquals(plan.getNickname(), defaultPlanWithProductParams.get("nickname"));
    assertNotNull(plan.getProduct());
  }

  @Test
  public void testPlanCreateWithStatementDescriptor() throws StripeException {
    Map<String, Object> planParamsWithStatementDescriptor = getUniquePlanParams();
    planParamsWithStatementDescriptor.put("statement_descriptor", "Stripe");
    Plan plan = Plan.create(planParamsWithStatementDescriptor);
    assertEquals(plan.getStatementDescriptor(), "Stripe");
  }

  @Test
  public void testPlanUpdate() throws StripeException {
    Plan createdPlan = Plan.create(getUniquePlanParams());
    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("name", "Updated Plan Name");
    Plan updatedplan = createdPlan.update(updateParams);
    assertEquals(updatedplan.getName(), "Updated Plan Name");
  }

  @Test
  public void testPlanRetrieve() throws StripeException {
    Plan createdPlan = Plan.create(getUniquePlanParams());
    Plan retrievedPlan = Plan.retrieve(createdPlan.getId());
    assertEquals(createdPlan.getId(), retrievedPlan.getId());
  }

  @Test
  public void testPlanList() throws StripeException {
    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("count", 1);
    List<Plan> plans = Plan.all(listParams).getData();
    assertEquals(plans.size(), 1);
  }

  @Test
  public void testPlanDelete() throws StripeException {
    Plan createdPlan = Plan.create(getUniquePlanParams());
    DeletedPlan deletedPlan = createdPlan.delete();
    assertTrue(deletedPlan.getDeleted());
    assertEquals(deletedPlan.getId(), createdPlan.getId());
  }

  @Test
  public void testCustomerCreateWithPlan() throws StripeException {
    Plan plan = Plan.create(getUniquePlanParams());
    Customer customer = createDefaultCustomerWithPlan(plan);
    assertEquals(customer.getSubscriptions().getData().get(0).getPlan().getId(), plan.getId());
  }

  @Test
  public void testPlanCreatePerCallAPIKey() throws StripeException {
    Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
    assertEquals(plan.getInterval(), "month");
  }

  @Test
  public void testPlanUpdatePerCallAPIKey() throws StripeException {
    Plan createdPlan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("name", "Updated Plan Name");
    Plan updatedplan = createdPlan.update(updateParams, Stripe.apiKey);
    assertEquals(updatedplan.getName(), "Updated Plan Name");
  }

  @Test
  public void testPlanRetrievePerCallAPIKey() throws StripeException {
    Plan createdPlan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
    Plan retrievedPlan = Plan.retrieve(createdPlan.getId(), Stripe.apiKey);
    assertEquals(createdPlan.getId(), retrievedPlan.getId());
  }

  @Test
  public void testPlanListPerCallAPIKey() throws StripeException {
    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("count", 1);
    List<Plan> plans = Plan.all(listParams, Stripe.apiKey).getData();
    assertEquals(plans.size(), 1);
  }

  @Test
  public void testPlanDeletePerCallAPIKey() throws StripeException {
    Plan createdPlan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
    DeletedPlan deletedPlan = createdPlan.delete(Stripe.apiKey);
    assertTrue(deletedPlan.getDeleted());
    assertEquals(deletedPlan.getId(), createdPlan.getId());
  }

  @Test
  public void testPlanMetadata() throws StripeException {
    testMetadata(Plan.create(getUniquePlanParams()));
  }

  @Test
  public void testPlanCreateWithTiers() throws StripeException {
    Map<String, Object> productParams = new HashMap<String, Object>();
    productParams.put("name", "Bar");

    Map<String, Object> params = getUniquePlanParams();
    params.remove("amount");
    params.remove("name");
    params.put("nickname", "Foo");
    params.put("product", productParams);

    Map<String, Object> tier1 = new HashMap<>();
    tier1.put("up_to", 1000);
    tier1.put("amount", 1000);

    Map<String, Object> tier2 = new HashMap<>();
    tier2.put("up_to", "inf");
    tier2.put("amount", 2000);

    List<Map<String, Object>> tiers = new ArrayList<>();
    tiers.add(tier1);
    tiers.add(tier2);
    params.put("tiers", tiers);
    params.put("tiers_mode", "volume");
    params.put("billing_scheme", "tiered");

    Plan plan = Plan.create(params);
    assertEquals(null, plan.getAmount());
    assertEquals("volume", plan.getTiersMode());
    List<PlanTier> tierConfig = plan.getTiers();
    assertEquals(2, tierConfig.size());
    assertTrue(Objects.equals(1000L, tierConfig.get(0).getAmount()));
    assertTrue(Objects.equals(1000L, tierConfig.get(0).getUpTo()));
    assertEquals(null, tierConfig.get(1).getUpTo());
    assertTrue(Objects.equals(2000L, tierConfig.get(1).getAmount()));
  }

  @Test
  public void testPlanCreateWithTransformUsage() throws StripeException {
    Map<String, Object> productParams = new HashMap<String, Object>();
    productParams.put("name", "Bar");

    Map<String, Object> params = getUniquePlanParams();
    params.remove("name");
    params.put("nickname", "Foo");
    params.put("product", productParams);

    Map<String, Object> transformUsage = new HashMap<>();
    transformUsage.put("divide_by", 1000);
    transformUsage.put("round", "up");

    params.put("transform_usage", transformUsage);

    Plan plan = Plan.create(params);
    assertTrue(Objects.equals(100L, plan.getAmount()));

    PlanTransformUsage planTransformUsage = plan.getTransformUsage();
    assertTrue(Objects.equals(1000L, planTransformUsage.getDivideBy()));
    assertEquals("up", planTransformUsage.getRound());
  }

  @Test
  public void testPlanCreateMetered() throws StripeException {
    Map<String, Object> productParams = new HashMap<String, Object>();
    productParams.put("name", "Bar");

    Map<String, Object> params = getUniquePlanParams();
    params.remove("name");
    params.put("nickname", "Foo");
    params.put("product", productParams);

    params.put("usage_type", "metered");

    Plan plan = Plan.create(params);
    assertEquals("metered", plan.getUsageType());
  }
}
