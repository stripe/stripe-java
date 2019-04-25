package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Invoice;
import com.stripe.net.ApiResource;
import com.stripe.param.InvoiceCreateParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class InvoiceServiceTest extends BaseStripeTest {
  private InvoiceService service = new InvoiceService();

  @Test
  public void testCreate() throws StripeException {
    InvoiceCreateParams params = InvoiceCreateParams.builder()
        .setCustomer("cus_123")
        .build();

    final Invoice invoice = service.create(params);

    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices"),
        params.toMap()
    );
  }

  @Test
  public void testCreateWithExtraParams() throws StripeException {
    // suppose that `custom_fields` isn't available yet, pretend
    // that users want this beta feature and use untyped map in our
    // main typed param via `putExtraParam`
    List<Map<String, Object>> customFields = new ArrayList<>();
    customFields.add(
        ImmutableMap.of(
            "name", "A",
            "value", "1"
        ));
    customFields.add(
        ImmutableMap.of(
            "name", "B",
            "value", "2"
        )
    );

    InvoiceCreateParams params = InvoiceCreateParams.builder()
        .putExtraParam("custom_fields", customFields)
        .setCustomer("cus_123")
        .build();

    final Invoice invoice = service.create(params);

    InvoiceCreateParams expectedParams = InvoiceCreateParams.builder()
        .setCustomFields(Arrays.asList(
            InvoiceCreateParams.CustomField.builder()
                .setName("A").setValue("1").build(),
            InvoiceCreateParams.CustomField.builder()
                .setName("B").setValue("2").build()
        ))
        .setCustomer("cus_123")
        .build();

    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices"),
        expectedParams.toMap()
    );
  }
}