package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ServiceProductTest extends BaseStripeFunctionalTest {
    @Test
    public void testProductCreate() throws StripeException {
        Product product = Product.create(defaultServiceProductParams);

        assertNotNull(product.getId());
        assertEquals("service", product.getType());
        assertEquals(defaultServiceProductParams.get("name"), product.getName());
        assertEquals(defaultServiceProductParams.get("statement_descriptor"), product.getStatementDescriptor());
    }

    @Test
    public void testProductUpdate() throws StripeException {
        Product product = Product.create(defaultServiceProductParams);

        HashMap<String, Object> updateParams = new HashMap<>();
        updateParams.put("name", "New name not like the old name");
        updateParams.put("statement_descriptor", "NEW AND IMPROVED");
        Product updatedProduct = product.update(updateParams);

        assertEquals("New name not like the old name", updatedProduct.getName());
        assertEquals("NEW AND IMPROVED", updatedProduct.getStatementDescriptor());
    }
}
