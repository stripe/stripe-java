package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class CountrySpecTest extends BaseStripeFunctionalTest {
    @Test
    public void testChargeCreationSourceAsCard() throws StripeException {
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("amount", 100);
        chargeParams.put("currency", "usd");
        Map<String, Object> cardMap = new HashMap<String, Object>();
        cardMap.put("number", "4242424242424242");
        cardMap.put("exp_month", 12);
        cardMap.put("exp_year", getYear());
        chargeParams.put("card", cardMap);
        Charge charge = Charge.create(chargeParams);

        assertTrue(charge.getSource() instanceof Card);
        assertNotNull(charge.getSource().getId());
    }

    @Test
    public void testCountrySpecRetrieve() throws StripeException {
        String country = "US";
        CountrySpec retrievedCountrySpec = CountrySpec.retrieve(country);

        assertEquals(country, retrievedCountrySpec.getId());
        assertNotSame(retrievedCountrySpec.getSupportedPaymentCurrencies().size(), 0);
        assertNotSame(retrievedCountrySpec.getSupportedBankAccountCurrencies().size(), 0);
        assertNotSame(retrievedCountrySpec.getSupportedPaymentMethods().size(), 0);

        List<String> countryForBankAccountInUsd = retrievedCountrySpec.getSupportedBankAccountCurrencies().get("usd");
        assertNotSame(countryForBankAccountInUsd.size(), 0);

        VerificationFields verificationFields = retrievedCountrySpec.getVerificationFields();
        assertNotSame(verificationFields.getIndividual().getMinimum().size(), 0);

        CountrySpec retrievedCountrySpec2 = CountrySpec.retrieve(country);
        VerificationFields verificationFields2 = retrievedCountrySpec2.getVerificationFields();
        assert(verificationFields2.equals(verificationFields));

        CountrySpec retrievedCountrySpecFR = CountrySpec.retrieve("FR");
        VerificationFields verificationFieldsFR = retrievedCountrySpecFR.getVerificationFields();
        assert(!verificationFieldsFR.equals(verificationFields));
    }

    @Test
    public void testCountrySpecAll() throws StripeException {
        Integer limit = 3;
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", limit);
        CountrySpecCollection retrievedCountrySpecCollection = CountrySpec.list(listParams);

        assertEquals((Integer)retrievedCountrySpecCollection.getData().size(), limit);
    }
}
