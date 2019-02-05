package com.stripe.model;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import org.junit.Test;

public class AccountCreateParamsTest {
  @Test
  public void testBuilderCreateParams() {
    AccountCreateParams.Builder builder = AccountCreateParams.builder();
    AccountCreateParams createParams = builder
        .beginLegalEntity()
          .beginArrayAdditionalOwners()
            .beginAdditionalOwner()
              .beginAddress()
                .setCity("Tokyo")
                .setCountry("Japan")
                .setPostalCode("123")
              .done()
            .done()
          .beginAdditionalOwner()
            .beginAddress()
              .setCity("London")
              .setCountry("UK")
              .setPostalCode("456")
            .done()
          .done()
        .done()
      .done()
      .setType("foo_type")
    .build();

    AccountCreateParams.LegalEntity legalEntity = createParams.getLegalEntity();
    assertNotNull(legalEntity);
    assertNotNull(legalEntity.getAdditionalOwners());
    assertEquals(legalEntity.getAdditionalOwners().size(), 2);
    AccountCreateParams.Address address1 = legalEntity.getAdditionalOwners().get(0).getAddress();
    assertEquals("Tokyo", address1.getCity());
    assertEquals("Japan", address1.getCountry());
    assertEquals("123", address1.getPostalCode());

    AccountCreateParams.Address address2 = legalEntity.getAdditionalOwners().get(1).getAddress();
    assertEquals("London", address2.getCity());
    assertEquals("UK", address2.getCountry());
    assertEquals("456", address2.getPostalCode());

    assertEquals("foo_type", createParams.getType());
  }

  @Test
  public void testBuilderCreateParamsWithIterations() {
    AccountCreateParams.Builder builder = AccountCreateParams.builder();

    AccountCreateParams.AdditionalOwnerArrayBuilder additionalOwnerArrayBuilder = builder
        .beginLegalEntity()
        .beginArrayAdditionalOwners();

    List<Map<String, String>> addresses = Arrays.asList(
        ImmutableMap.of("my_city_key", "foo1", "my_country_key", "bar1"),
        ImmutableMap.of("my_city_key", "foo2", "my_country_key", "bar2"),
        ImmutableMap.of("my_city_key", "foo3", "my_country_key", "bar3")
    );

    for (Map<String, String> address : addresses) {
      additionalOwnerArrayBuilder = additionalOwnerArrayBuilder
          .beginAdditionalOwner()
            .beginAddress()
              .setCity(address.get("my_city_key"))
              .setCountry(address.get("my_country_key"))
            .done()
          .done();
    }

    AccountCreateParams params = additionalOwnerArrayBuilder.done().done().build();
    List<AccountCreateParams.AdditionalOwner> additionalOwners =
        params.getLegalEntity().getAdditionalOwners();

    assertEquals(3, additionalOwners.size());
    IntStream.range(0, 3).forEach(i -> {
      assertEquals(addresses.get(i).get("my_city_key"), additionalOwners.get(i).getAddress().getCity());
      assertEquals(addresses.get(i).get("my_country_key"), additionalOwners.get(i).getAddress().getCountry());
    });
  }
}