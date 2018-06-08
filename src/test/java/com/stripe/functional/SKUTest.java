package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.DeletedSKU;
import com.stripe.model.SKU;
import com.stripe.model.SKUCollection;
import com.stripe.net.APIResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SKUTest extends BaseStripeTest {
  public static final String SKU_ID = "sku_123";

  private SKU getSKUFixture() throws StripeException {
    final SKU sku = SKU.retrieve(SKU_ID);
    resetNetworkSpy();
    return sku;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> attributes = new HashMap<String, Object>();
    attributes.put("attr1", "val1");
    attributes.put("attr2", "val2");
    final Map<String, Object> inventory = new HashMap<String, Object>();
    inventory.put("type", "bucket");
    inventory.put("value", "limited");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("active", true);
    params.put("attributes", attributes);
    params.put("price", 499);
    params.put("currency", "usd");
    params.put("inventory", inventory);
    params.put("product", "prod_123");
    params.put("image", "http://example.com/foo.png");

    final SKU sku = SKU.create(params);

    assertNotNull(sku);
    verifyRequest(
        APIResource.RequestMethod.POST,
        "/v1/skus",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final SKU sku = SKU.retrieve(SKU_ID);

    assertNotNull(sku);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/skus/%s", SKU_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final SKU sku = getSKUFixture();

    final Map<String, Object> inventory = new HashMap<String, Object>();
    inventory.put("type", "bucket");
    inventory.put("value", "in_stock");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("inventory", inventory);

    final SKU updatedSku = sku.update(params);

    assertNotNull(updatedSku);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/skus/%s", sku.getId()),
        params
    );
  }

  @Test
  public void testDelete() throws StripeException {
    final SKU sku = getSKUFixture();

    final DeletedSKU deletedSku = sku.delete();

    assertNotNull(deletedSku);
    verifyRequest(
        APIResource.RequestMethod.DELETE,
        String.format("/v1/skus/%s", sku.getId())
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final SKUCollection skus = SKU.list(params);

    assertNotNull(skus);
    assertEquals(1, skus.getData().size());
    verifyRequest(
        APIResource.RequestMethod.GET,
        "/v1/skus",
        params
    );
  }
}
