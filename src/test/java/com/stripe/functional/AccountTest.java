package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest extends BaseStripeFunctionalTest {
    @Test
    public void testAccountRetrieve() throws StripeException {
        Account retrievedAccount = Account.retrieve();
        assertTrue(Pattern.matches("\\A.*@stripe.com\\z", retrievedAccount.getEmail()));
    }

    @Test
    public void testAlipayAccountCreation() throws StripeException {
        Token alipayToken = Token.create(defaultAlipayTokenParams);
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("source", alipayToken.getId());
        Customer cus = Customer.create(customerParams);

        ExternalAccount alipayAccount = cus.getSources().getData().get(0);
        assertEquals("alipay_account", alipayAccount.getObject());
        assertEquals(cus.getId(), alipayAccount.getCustomer());
        assertTrue(AlipayAccount.class.isInstance(alipayAccount));
    }

    @Test
    public void testAlipayAccountUpdating() throws StripeException {
        Token alipayToken = Token.create(defaultAlipayTokenParams);
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("source", alipayToken.getId());
        Customer cus = Customer.create(customerParams);

        Map<String, Object> updateParams = new HashMap<String, Object>();
        Map<String, Object> metadata = new HashMap<String, Object>();
        metadata.put("foo", "bar");
        updateParams.put("metadata", metadata);

        ExternalAccount alipayAccount = cus.getSources().getData().get(0);
        ExternalAccount updatedAccount = alipayAccount.update(updateParams);

        assertEquals("bar", ((AlipayAccount) updatedAccount).getMetadata().get("foo"));
    }

    @Test
    public void testAlipayAccountDeleting() throws StripeException {
        Token alipayToken = Token.create(defaultAlipayTokenParams);
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("source", alipayToken.getId());
        Customer cus = Customer.create(customerParams);

        AlipayAccount alipayAccount = (AlipayAccount) cus.getSources().getData().get(0);
        alipayAccount.delete();

        ExternalAccountCollection sources = cus.getSources().all(new HashMap<String, Object>());
        assertEquals(0, sources.getData().size());
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
