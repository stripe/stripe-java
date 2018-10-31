package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Person;
import com.stripe.model.PersonCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PersonTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "cus_123";
  public static final String PERSON_ID = "person_123";

  private PersonCollection getPersonCollectionFixture(Account account)
      throws IOException, StripeException {
    PersonCollection persons = account.persons();
    resetNetworkSpy();

    return persons;
  }

  @Test
  public void testCreate() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("first_name", "John");

    final Person person = account.persons().create(params);

    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/persons", account.getId()),
        params
    );
  }

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);
    Person person = personsTmp.retrieve(PERSON_ID);

    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/persons/%s", account.getId(), PERSON_ID)
    );
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);
    Person person = personsTmp.retrieve(PERSON_ID);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("first_name", "John");

    final Person updatedPerson = person.update(params);

    assertNotNull(updatedPerson);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/persons/%s", account.getId(), person.getId()),
        params
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final PersonCollection persons = personsTmp.list(params);

    assertNotNull(persons);
    assertEquals(1, persons.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/persons", account.getId())
    );

    final Person person = persons.getData().get(0);
    assertNotNull(person);
  }

  @Test
  public void testDelete() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);
    final PersonCollection personsTmp = getPersonCollectionFixture(account);
    Person person = personsTmp.retrieve(PERSON_ID);

    final Person deletedPerson = person.delete();

    assertNotNull(deletedPerson);
    assertTrue(deletedPerson.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/accounts/%s/persons/%s", account.getId(), person.getId())
    );
  }
}
