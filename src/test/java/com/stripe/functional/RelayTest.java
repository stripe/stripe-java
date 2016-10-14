package com.stripe.functional;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import com.stripe.net.RequestOptions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RelayTest extends BaseStripeFunctionalTest {
    @Test
    public void testProductCreateReadUpdate() throws StripeException {
        RequestOptions relayRequestOptions = RequestOptions.builder()
                .setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
                .build();

        Map<String, Object> createParams = new HashMap<String, Object>();
        String id = "my_first_product_" + UUID.randomUUID();
        createParams.put("id", id);
        createParams.put("name", "Watermelon");
        Product created = Product.create(createParams, relayRequestOptions);
        assertEquals(id, created.getId());
        assertEquals("Watermelon", created.getName());

        Product retrieved = Product.retrieve(id, relayRequestOptions);
        assertEquals("Watermelon", retrieved.getName());

        Product updated = retrieved.update(ImmutableMap.<String,Object>of("name", "Cantelope"), relayRequestOptions);
        assertEquals("Cantelope", updated.getName());
    }

    @Test
    public void testSKUCreateReadUpdate() throws StripeException {
        RequestOptions relayRequestOptions = RequestOptions.builder()
                .setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
                .build();

        Map<String, Object> productCreateParams = new HashMap<String, Object>();
        String productId = "my_first_product_" + UUID.randomUUID();
        productCreateParams.put("id", productId);
        productCreateParams.put("name", "Watermelon");
        productCreateParams.put("attributes[]", "size");
        Product.create(productCreateParams, relayRequestOptions);

        Map<String, Object> skuCreateParams = new HashMap<String, Object>();
        String skuId = "my_first_sku_" + UUID.randomUUID();
        skuCreateParams.put("id", skuId);
        skuCreateParams.put("product", productId);
        skuCreateParams.put("attributes", ImmutableMap.of("size", "large"));
        skuCreateParams.put("price", 100);
        skuCreateParams.put("currency", "usd");
        skuCreateParams.put("inventory", ImmutableMap.of("type", "infinite"));
        SKU created = SKU.create(skuCreateParams, relayRequestOptions);
        assertEquals(skuId, created.getId());
        assertEquals(productId, created.getProduct());
        assertEquals("large", created.getAttributes().get("size"));
        assertEquals("infinite", created.getInventory().getType());

        SKU retrieved = SKU.retrieve(skuId, relayRequestOptions);
        assertEquals("large", retrieved.getAttributes().get("size"));

        SKU updated = retrieved.update(ImmutableMap.<String,Object>of("price", 200), relayRequestOptions);
        assertEquals((Integer)200, updated.getPrice());
    }

    @Test
    public void testSKUProductDeletion() throws StripeException {
        RequestOptions relayRequestOptions = RequestOptions.builder()
                .setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
                .build();

        Map<String, Object> productCreateParams = new HashMap<String, Object>();
        String productId = "my_first_product_" + UUID.randomUUID();
        productCreateParams.put("id", productId);
        productCreateParams.put("name", "Watermelon");
        productCreateParams.put("attributes[]", "size");
        Product createdProduct = Product.create(productCreateParams, relayRequestOptions);

        Map<String, Object> skuCreateParams = new HashMap<String, Object>();
        String skuId = "my_first_sku_" + UUID.randomUUID();
        skuCreateParams.put("id", skuId);
        skuCreateParams.put("product", productId);
        skuCreateParams.put("attributes", ImmutableMap.of("size", "large"));
        skuCreateParams.put("price", 100);
        skuCreateParams.put("currency", "usd");
        skuCreateParams.put("inventory", ImmutableMap.of("type", "infinite"));

        SKU created = SKU.create(skuCreateParams, relayRequestOptions);

        DeletedSKU deletedSKU = created.delete(relayRequestOptions);
        assertTrue(deletedSKU.getDeleted());

        DeletedProduct deletedProduct = createdProduct.delete(relayRequestOptions);
        assertTrue(deletedProduct.getDeleted());
    }

    @Test
    public void testOrderCreateReadUpdatePayReturn() throws StripeException {
        RequestOptions relayRequestOptions = RequestOptions.builder()
                .setApiKey("sk_test_JieJALRz7rPz7boV17oMma7a")
                .build();

        Map<String, Object> productCreateParams = new HashMap<String, Object>();
        String productId = "my_first_product_" + UUID.randomUUID();
        productCreateParams.put("id", productId);
        productCreateParams.put("name", "Watermelon");
        productCreateParams.put("attributes[]", "size");
        productCreateParams.put("shippable", false);
        Product.create(productCreateParams, relayRequestOptions);

        Map<String, Object> skuCreateParams = new HashMap<String, Object>();
        String skuId = "my_first_sku_" + UUID.randomUUID();
        skuCreateParams.put("id", skuId);
        skuCreateParams.put("product", productId);
        skuCreateParams.put("attributes", ImmutableMap.of("size", "large"));
        skuCreateParams.put("price", 100);
        skuCreateParams.put("currency", "usd");
        skuCreateParams.put("inventory", ImmutableMap.of("type", "infinite"));
        SKU.create(skuCreateParams, relayRequestOptions);

        Map<String, Object> orderCreateParams = new HashMap<String, Object>();
        orderCreateParams.put("items[]", ImmutableMap.<String, Object>of("type", "sku", "parent", skuId));
        orderCreateParams.put("currency", "usd");
        orderCreateParams.put("email", "foo@bar.com");
        Order created = Order.create(orderCreateParams, relayRequestOptions);
        assertEquals("created", created.getStatus());

        OrderItem item = null;
        for (OrderItem i : created.getItems()) {
            if (skuId.equals(i.getParent())) {
                item = i;
                break;
            }
        }
        assertNotNull(item);
        assertEquals("sku", item.getType());

        Order retrieved = Order.retrieve(created.getId(), relayRequestOptions);

        item = null;
        for (OrderItem i : created.getItems()) {
            if (skuId.equals(i.getParent())) {
                item = i;
                break;
            }
        }
        assertNotNull(item);
        assertEquals("sku", item.getType());

        Order updated = retrieved.update(ImmutableMap.<String,Object>of("metadata", ImmutableMap.of("foo", "bar")), relayRequestOptions);
        assertEquals("bar", updated.getMetadata().get("foo"));

        Order paid = updated.pay(ImmutableMap.<String,Object>of("source", defaultSourceParams), relayRequestOptions);
        assertEquals("paid", paid.getStatus());

        OrderReturn returned = paid.returnOrder(null, relayRequestOptions);
        assertEquals(paid.getId(), returned.getOrder());
    }
}
