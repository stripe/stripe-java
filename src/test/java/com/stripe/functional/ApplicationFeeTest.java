package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplicationFee;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ApplicationFeeTest extends BaseStripeFunctionalTest {
    @Test
    public void testApplicationFeeList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 0);
        List<ApplicationFee> fees = ApplicationFee.all(listParams).getData();
        assertEquals(fees.size(), 0);
    }
}
