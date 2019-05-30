package com.stripe.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Plan;
import com.stripe.model.PlanCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

public class PlanTest extends BaseStripeTest {
  public static final String PLAN_ID = "gold";

  private Plan getPlanFixture() throws StripeException {
    final Plan plan = Plan.retrieve(PLAN_ID);
    resetNetworkSpy();
    return plan;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("amount", 1);
    params.put("currency", "usd");
    params.put("id", "sapphire-elite");
    params.put("interval", "month");
    params.put("nickname", "Sapphire Elite");

    final Plan plan = Plan.create(params);

    assertNotNull(plan);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/plans", params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Plan plan = Plan.retrieve(PLAN_ID);

    assertNotNull(plan);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/plans/%s", PLAN_ID));
  }

  @Test
  public void testRetrieveIdWithForwardSlash() throws StripeException {
    // `stripe-mock` now has a different behavior from the actual APIs.
    // It currently does not accept url-encoded values.
    InvalidRequestException exception =
        assertThrows(
            InvalidRequestException.class,
            () -> {
              Plan.retrieve("Pro plan $699/month");
            });
    assertThat(
        exception.getMessage(),
        CoreMatchers.containsString(
            "Unrecognized request URL (GET: /v1/plans/Pro+plan+$699/month)"));

    // Still verifying that request is invoked with encoded url.
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/plans/%s", "Pro+plan+%24699%2Fmonth"));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Plan plan = getPlanFixture();

    final Map<String, Object> params = new HashMap<>();
    params.put("nickname", "Updated Name");

    final Plan updatedPlan = plan.update(params);

    assertNotNull(updatedPlan);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/plans/%s", plan.getId()), params);
  }

  @Test
  public void testDelete() throws StripeException {
    final Plan plan = getPlanFixture();

    final Plan deletedPlan = plan.delete();

    assertNotNull(deletedPlan);
    assertTrue(deletedPlan.getDeleted());
    verifyRequest(ApiResource.RequestMethod.DELETE, String.format("/v1/plans/%s", plan.getId()));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    PlanCollection plans = Plan.list(params);

    assertNotNull(plans);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/plans", params);
  }
}
