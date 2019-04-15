package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Person;
import com.stripe.model.PersonCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.PersonCreateParams;
import com.stripe.param.PersonDeleteParams;
import com.stripe.param.PersonListParams;
import com.stripe.param.PersonRetrieveParams;
import com.stripe.param.PersonUpdateParams;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class PersonServiceTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "cus_123";
  public static final String PERSON_ID = "person_123";

  private PersonService personService = new PersonService();

  @Test
  public void testCreate() throws StripeException {
    Person person = personService.create(ACCOUNT_ID, PersonCreateParams.builder()
        .setFirstName("John")
        .build());

    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/persons", ACCOUNT_ID),
        ImmutableMap.of("first_name", "John")
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    Person person = personService.retrieve(
        ACCOUNT_ID,
        PERSON_ID,
        PersonRetrieveParams.builder().build());

    assertNotNull(person);
    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/persons/%s", ACCOUNT_ID, PERSON_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Person updatedPerson = personService.update(
        ACCOUNT_ID,
        PERSON_ID,
        PersonUpdateParams.builder()
          .setFirstName("John").build());

    assertNotNull(updatedPerson);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/persons/%s", ACCOUNT_ID, PERSON_ID),
        ImmutableMap.of("first_name", "John")
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final PersonCollection persons = personService.list(
        ACCOUNT_ID,
        PersonListParams.builder()
            .setLimit(1L).build());

    assertNotNull(persons);
    assertEquals(1, persons.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/persons", ACCOUNT_ID)
    );

    final Person person = persons.getData().get(0);
    assertNotNull(person);
  }

  @Test
  public void testDelete() throws StripeException {
    final Person deletedPerson = personService.delete(
        ACCOUNT_ID,
        PERSON_ID,
        PersonDeleteParams.builder().build());

    assertNotNull(deletedPerson);
    assertTrue(deletedPerson.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/accounts/%s/persons/%s", ACCOUNT_ID, PERSON_ID)
    );
  }
}