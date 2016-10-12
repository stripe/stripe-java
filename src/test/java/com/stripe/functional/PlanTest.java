package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.DeletedPlan;
import com.stripe.model.Plan;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlanTest extends BaseStripeFunctionalTest {
    @Test
    public void testPlanCreate() throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams());
        assertEquals(plan.getInterval(), "month");
        assertEquals(plan.getIntervalCount(), (Integer) 2);
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
        List<Plan> Plans = Plan.all(listParams).getData();
        assertEquals(Plans.size(), 1);
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
        List<Plan> Plans = Plan.all(listParams, Stripe.apiKey).getData();
        assertEquals(Plans.size(), 1);
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
}
