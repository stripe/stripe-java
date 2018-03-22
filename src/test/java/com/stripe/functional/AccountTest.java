package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class AccountTest extends BaseStripeFunctionalTest {
	@Test
	public void testAccountRetrieve() throws StripeException {
		Account retrievedAccount = Account.retrieve();
		assertTrue(Pattern.matches("\\A.*@stripe.com\\z", retrievedAccount.getEmail()));
	}

	@Test
	public void testGetAllExternalAccounts() throws StripeException {
		Account account = Account.create(defaultManagedAccountParams);
		Assert.assertNotNull(account);

		Map<String, Object> accountParams = new HashMap<String, Object>();
		accountParams.put("limit", 3);
		AccountCollection accountCollection = Account.all(accountParams);

		Assert.assertNotNull(accountCollection);
	}
}
