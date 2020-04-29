package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Price;
import com.stripe.model.PriceCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class PriceTest extends BaseStripeTest {
  public static final String PRICE_ID = "price_123";

  private Price getPriceFixture() throws StripeException {
    final Price price = Price.retrieve(PRICE_ID);
    resetNetworkSpy();
    return price;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> recurringParams = new HashMap<>();
    recurringParams.put("interval", "month");

    final Map<String, Object> productDataParams = new HashMap<>();
    productDataParams.put("name", "Product name");

    final Map<String, Object> params = new HashMap<>();
    params.put("unit_amount", 1000);
    params.put("currency", "usd");
    params.put("recurring", recurringParams);
    params.put("product_data", productDataParams);

    final Price price = Price.create(params);

    assertNotNull(price);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/prices", params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Price price = Price.retrieve(PRICE_ID);

    assertNotNull(price);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/prices/%s", PRICE_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Price price = getPriceFixture();

    final Map<String, Object> params = new HashMap<>();
    params.put("nickname", "Updated Name");

    final Price updatedPrice = price.update(params);

    assertNotNull(updatedPrice);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/prices/%s", price.getId()), params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    PriceCollection prices = Price.list(params);

    assertNotNull(prices);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/prices", params);
  }
}
