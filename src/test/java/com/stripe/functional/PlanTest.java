package com.stripe.functional;

import com.stripe.BaseStripeStubTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.DeletedPlan;
import com.stripe.model.Plan;
import com.stripe.model.PlanCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlanTest extends BaseStripeStubTest {
	@Test
	public void testPlanCreate() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", "gold");
		Plan _plan = Plan.create(params);
	}

	@Test
	public void testPlanRetrieve() throws StripeException {
		Plan _plan = Plan.retrieve("gold");
	}

	@Test
	public void testPlanUpdate() throws StripeException {
		Plan plan = Plan.retrieve("gold");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", "silver");
		Plan _plan = plan.update(params);
	}

	@Test
	public void testPlanDelete() throws StripeException {
		Plan plan = Plan.retrieve("gold");
		DeletedPlan _deletedPlan = plan.delete();
	}

	@Test
	public void testPlanList() throws StripeException {
		PlanCollection plans = Plan.all(null);
		assertEquals(1, plans.getData().size());
	}
}
