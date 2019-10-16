package com.stripe.param;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChargeUpdateParamsTest {
  @Test
  public void testGetter() {
    ChargeUpdateParams chargeUpdateParams =
        ChargeUpdateParams.builder().setDescription("foo").build();

    assertEquals("foo", chargeUpdateParams.getDescription());
  }

  @Test
  public void testGetterNested() {
    ChargeUpdateParams chargeUpdateParams =
        ChargeUpdateParams.builder()
            .setShipping(ChargeUpdateParams.Shipping.builder().setName("Jenny Rosen").build())
            .build();

    assertEquals("Jenny Rosen", chargeUpdateParams.getShipping().getName());
  }
}
