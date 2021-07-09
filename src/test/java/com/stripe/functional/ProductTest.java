package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Product;
import com.stripe.model.ProductCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ProductTest extends BaseStripeTest {
  public static final String PRODUCT_ID = "prod_123";

  private Product getProductFixture() throws StripeException {
    final Product product = Product.retrieve(PRODUCT_ID);
    resetNetworkSpy();
    return product;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> packageDimensions = new HashMap<>();
    packageDimensions.put("height", 2.234);
    packageDimensions.put("length", 5.10);
    packageDimensions.put("width", 6.50);
    packageDimensions.put("weight", 10);
    final Map<String, Object> params = new HashMap<>();
    params.put("active", true);
    params.put("name", "Test Name");
    params.put("description", "This is a description");
    params.put("url", "http://example.com");
    params.put("shippable", true);
    params.put("package_dimensions", packageDimensions);

    final Product product = Product.create(params);

    assertNotNull(product);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/products", params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Product product = Product.retrieve(PRODUCT_ID);

    assertNotNull(product);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/products/%s", PRODUCT_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Product product = getProductFixture();

    Map<String, Object> params = new HashMap<>();
    params.put("name", "Updated Name");

    final Product updatedProduct = product.update(params);

    assertNotNull(updatedProduct);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/products/%s", product.getId()), params);
  }

  @Test
  public void testDelete() throws StripeException {
    final Product product = getProductFixture();

    final Product deletedProduct = product.delete();

    assertNotNull(deletedProduct);
    assertTrue(deletedProduct.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE, String.format("/v1/products/%s", product.getId()));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final ProductCollection products = Product.list(params);

    assertNotNull(products);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/products", params);
  }
}
