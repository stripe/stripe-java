package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Person;
import com.stripe.model.PersonCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class PersonTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "cus_123";
  public static final String PERSON_ID = "person_123";

  private PersonCollection getPersonCollectionFixture(Account account) throws StripeException {
    PersonCollection persons = account.persons();
    resetNetworkSpy();

    return persons;
  }

  @Test
  public void testCreate() throws StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);

    final Map<String, Object> params = new HashMap<>();
    params.put("first_name", "John");

    final Person person = personsTmp.create(params);

    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/persons", account.getId()),
        params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);
    Person person = personsTmp.retrieve(PERSON_ID);

    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/persons/%s", account.getId(), PERSON_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);
    Person person = personsTmp.retrieve(PERSON_ID);

    final Map<String, Object> params = new HashMap<>();
    params.put("first_name", "John");

    final Person updatedPerson = person.update(params);

    assertNotNull(updatedPerson);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/persons/%s", account.getId(), person.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);

    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final PersonCollection persons = personsTmp.list(params);

    assertNotNull(persons);
    assertEquals(1, persons.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/accounts/%s/persons", account.getId()));

    final Person person = persons.getData().get(0);
    assertNotNull(person);
  }

  @Test
  public void testDelete() throws StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);
    Person person = personsTmp.retrieve(PERSON_ID);

    final Person deletedPerson = person.delete();

    assertNotNull(deletedPerson);
    assertTrue(deletedPerson.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/accounts/%s/persons/%s", account.getId(), person.getId()));
  }
}
