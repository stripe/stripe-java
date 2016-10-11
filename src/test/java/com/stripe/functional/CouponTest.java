package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Coupon;
import com.stripe.model.Customer;
import com.stripe.model.DeletedCoupon;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class CouponTest extends BaseStripeFunctionalTest {
    static Map<String, Object> getUniqueCouponParams() {
        Map<String, Object> uniqueParams = new HashMap<String, Object>();
        uniqueParams.putAll(defaultCouponParams);
        uniqueParams.put("id", getUniqueCouponId());
        return uniqueParams;
    }

    @Test
    public void testCouponCreate() throws StripeException {
        Coupon coupon = Coupon.create(getUniqueCouponParams());
        assertEquals(coupon.getDuration(), "once");
    }

    @Test
    public void testCouponUpdate() throws StripeException {
        Coupon createdCoupon = Coupon.create(getUniqueCouponParams());
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("metadata[message]", "This month is on us!");
        Coupon updatedCoupon = createdCoupon.update(updateParams);
        assertEquals(updatedCoupon.getMetadata().get("message"), "This month is on us!");
    }

    @Test
    public void testCouponRetrieve() throws StripeException {
        Coupon createdCoupon = Coupon.create(getUniqueCouponParams());
        Coupon retrievedCoupon = Coupon.retrieve(createdCoupon.getId());
        assertEquals(createdCoupon.getId(), retrievedCoupon.getId());
    }

    @Test
    public void testCouponList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Coupon> Coupons = Coupon.all(listParams).getData();
        assertEquals(Coupons.size(), 1);
    }

    @Test
    public void testCouponDelete() throws StripeException {
        Coupon createdCoupon = Coupon.create(getUniqueCouponParams());
        DeletedCoupon deletedCoupon = createdCoupon.delete();
        assertTrue(deletedCoupon.getDeleted());
        assertEquals(deletedCoupon.getId(), createdCoupon.getId());
    }

    @Test
    public void testCustomerCreateWithCoupon() throws StripeException {
        Coupon coupon = Coupon.create(getUniqueCouponParams());
        Map<String, Object> customerWithCouponParams = new HashMap<String, Object>();
        customerWithCouponParams.put("coupon", coupon.getId());
        Customer customer = Customer.create(customerWithCouponParams);
        assertEquals(customer.getDiscount().getCoupon().getId(), coupon.getId());

        customer.deleteDiscount();
        assertNull(Customer.retrieve(customer.getId()).getDiscount());
    }

    @Test
    public void testCouponCreatePerCallAPIKey() throws StripeException {
        Coupon coupon = Coupon.create(getUniqueCouponParams(), Stripe.apiKey);
        assertEquals(coupon.getDuration(), "once");
    }

    @Test
    public void testCouponRetrievePerCallAPIKey() throws StripeException {
        Coupon createdCoupon = Coupon.create(getUniqueCouponParams(),
                Stripe.apiKey);
        Coupon retrievedCoupon = Coupon.retrieve(createdCoupon.getId(),
                Stripe.apiKey);
        assertEquals(createdCoupon.getId(), retrievedCoupon.getId());
    }

    @Test
    public void testCouponListPerCallAPIKey() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<Coupon> Coupons = Coupon.all(listParams, Stripe.apiKey).getData();
        assertEquals(Coupons.size(), 1);
    }

    @Test
    public void testCouponDeletePerCallAPIKey() throws StripeException {
        Coupon createdCoupon = Coupon.create(getUniqueCouponParams(),
                Stripe.apiKey);
        DeletedCoupon deletedCoupon = createdCoupon.delete(Stripe.apiKey);
        assertTrue(deletedCoupon.getDeleted());
        assertEquals(deletedCoupon.getId(), createdCoupon.getId());
    }

    @Test
    public void testCustomerCreateWithCouponPerCallAPIKey()
            throws StripeException {
        Coupon coupon = Coupon.create(getUniqueCouponParams(), Stripe.apiKey);
        Map<String, Object> customerWithCouponParams = new HashMap<String, Object>();
        customerWithCouponParams.put("coupon", coupon.getId());
        Customer customer = Customer.create(customerWithCouponParams,
                Stripe.apiKey);
        assertEquals(customer.getDiscount().getCoupon().getId(), coupon.getId());

        customer.deleteDiscount();
        assertNull(Customer.retrieve(customer.getId()).getDiscount());
    }

    @Test
    public void testCouponMetadata() throws StripeException {
        testMetadata(Coupon.create(getUniqueCouponParams()));
    }
}
