package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Sku;
import com.stripe.model.SkuCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SkuCreateParams;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class SkuTest extends BaseStripeTest {
  public static final String SKU_ID = "sku_123";

  private Sku getSkuFixture() throws StripeException {
    final Sku sku = Sku.retrieve(SKU_ID);
    resetNetworkSpy();
    return sku;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = createUntypedParams();

    final Sku sku = Sku.create(params);

    assertNotNull(sku);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/skus", params);
  }

  @Test
  public void testCreateWithTypedParams() throws StripeException {
    SkuCreateParams.Inventory inventory =
        SkuCreateParams.Inventory.builder()
            .setType(SkuCreateParams.Inventory.Type.BUCKET)
            .setValue(SkuCreateParams.Inventory.Value.LIMITED)
            .build();

    Map<String, String> additionalAttributes = new HashMap<>();
    additionalAttributes.put("attr2", "val2");

    SkuCreateParams typedParams =
        SkuCreateParams.builder()
            .setActive(true)
            // support both individual key/value entry and the whole map
            .putAttribute("attr1", "val1")
            .putAllAttribute(additionalAttributes)
            .setPrice(499L)
            .setCurrency("usd")
            .setInventory(inventory)
            .setProduct("prod_123")
            .setImage("http://example.com/foo.png")
            .build();

    final Sku sku = Sku.create(typedParams, RequestOptions.getDefault());

    assertNotNull(sku);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/skus", createUntypedParams());
  }

  private Map<String, Object> createUntypedParams() {
    final Map<String, Object> attributes = new HashMap<>();
    attributes.put("attr1", "val1");
    attributes.put("attr2", "val2");
    final Map<String, Object> inventory = new HashMap<>();
    inventory.put("type", "bucket");
    inventory.put("value", "limited");
    final Map<String, Object> params = new HashMap<>();
    params.put("active", true);
    params.put("attributes", attributes);
    params.put("price", 499);
    params.put("currency", "usd");
    params.put("inventory", inventory);
    params.put("product", "prod_123");
    params.put("image", "http://example.com/foo.png");
    return params;
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Sku sku = Sku.retrieve(SKU_ID);

    assertNotNull(sku);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/skus/%s", SKU_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Sku sku = getSkuFixture();

    final Map<String, Object> inventory = new HashMap<>();
    inventory.put("type", "bucket");
    inventory.put("value", "in_stock");
    final Map<String, Object> params = new HashMap<>();
    params.put("inventory", inventory);

    final Sku updatedSku = sku.update(params);

    assertNotNull(updatedSku);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/skus/%s", sku.getId()), params);
  }

  @Test
  public void testDelete() throws StripeException {
    final Sku sku = getSkuFixture();

    final Sku deletedSku = sku.delete();

    assertNotNull(deletedSku);
    assertTrue(deletedSku.getDeleted());
    verifyRequest(ApiResource.RequestMethod.DELETE, String.format("/v1/skus/%s", sku.getId()));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final SkuCollection skus = Sku.list(params);

    assertNotNull(skus);
    assertEquals(1, skus.getData().size());
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/skus", params);
  }
}
