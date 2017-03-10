package com.stripe.functional;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.*;
import org.junit.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DisputeTest extends BaseStripeFunctionalTest {

    private Charge createDisputedCharge(int chargeValueCents) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException, InterruptedException {
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.putAll(defaultChargeParams);
        chargeParams.put("amount", chargeValueCents);
        Map<String, Object> testModeDisputeCardParams = new HashMap<String, Object>();
        testModeDisputeCardParams.put("number", "4000000000000259");
        testModeDisputeCardParams.put("exp_month", 12);
        testModeDisputeCardParams.put("exp_year", getYear());
        chargeParams.put("card", testModeDisputeCardParams);
        Charge charge = Charge.create(chargeParams);

        // This test relies on the server asynchronously marking the charge as disputed.
        // TODO: find a more reliable way to do this instead of sleeping
        Thread.sleep(10000);

        Map<String, Object> retrieveParams = new HashMap<String, Object>();
		retrieveParams.put("expand[]", "dispute");
        return Charge.retrieve(charge.getId(), retrieveParams, null);
    }

    @Test
    public void testDisputedCharge() throws StripeException, InterruptedException {
        int chargeValueCents = 100;
        Charge disputedCharge = createDisputedCharge(chargeValueCents);
        Dispute dispute = disputedCharge.getDisputeObject();
        assertNotNull(dispute);
        assertFalse(dispute.getIsChargeRefundable());
        assertEquals(1, dispute.getBalanceTransactions().size());
        assertEquals(-chargeValueCents, dispute.getBalanceTransactions().get(0).getAmount().intValue());
    }

    @Test
    public void testRetrieveDispute() throws StripeException, InterruptedException {
        int chargeValueCents = 100;
        Charge disputedCharge = createDisputedCharge(chargeValueCents);
        Dispute dispute = disputedCharge.getDisputeObject();
        Dispute retrievedDispute = Dispute.retrieve(dispute.getId());
        assertEquals(dispute.getId(), retrievedDispute.getId());
    }

    @Test
    public void testUpdateDispute() throws StripeException, InterruptedException {
        int chargeValueCents = 100;
        Charge disputedCharge = createDisputedCharge(chargeValueCents);

        Dispute initialDispute = disputedCharge.getDisputeObject();
        EvidenceSubObject emptyEvidence = new EvidenceSubObject();
        assertEquals(emptyEvidence, initialDispute.getEvidenceSubObject());
        assertEquals(new HashMap<String, String>(), initialDispute.getMetadata());

        Map<String, Object> params = new HashMap<String, Object>();
        Map<String, Object> evidence = new HashMap<String, Object>();
        Map<String, String> metadata = new HashMap<String, String>();

        evidence.put("product_description", "my productDescription");
        evidence.put("customer_name", "my customerName");
        evidence.put("uncategorized_text", "my uncategorizedText");

        metadata.put("some_info", "about the dispute");
        metadata.put("a_little_more", "12345");

        params.put("evidence", evidence);
        params.put("metadata", metadata);

        Dispute updatedDispute = initialDispute.update(params);
        assertNotNull(updatedDispute);

        EvidenceSubObject evidenceSubObject = updatedDispute.getEvidenceSubObject();
        assertEquals(evidence.get("product_description"), evidenceSubObject.getProductDescription());
        assertEquals(evidence.get("customer_name"), evidenceSubObject.getCustomerName());
        assertEquals(evidence.get("uncategorized_text"), evidenceSubObject.getUncategorizedText());

        // Ensure this didn't get stored in the deprecated evidence field.
        assertNull(updatedDispute.getEvidence());

        Map<String, String> disputeMetadata = updatedDispute.getMetadata();
        assertNotNull(disputeMetadata);
        assertEquals(metadata, disputeMetadata);
    }

    @Test
    public void testCloseDispute() throws StripeException, InterruptedException {
        int chargeValueCents = 100;
        Charge disputedCharge = createDisputedCharge(chargeValueCents);
        Dispute dispute = disputedCharge.getDisputeObject();
        assertEquals("needs_response", dispute.getStatus());

        Dispute closedDispute = dispute.close();
        assertEquals(dispute.getId(), closedDispute.getId());
        assertEquals("lost", closedDispute.getStatus());
    }

    // DisputeCollection Tests:
    @Test
    public void testDisputeList() throws StripeException, InterruptedException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 3);
        List<Dispute> disputes = Dispute.all(listParams).getData();

        assertEquals(3, disputes.size());
    }

    // FraudDetails Test:
    @Test
    public void testFraudDetails() throws StripeException, InterruptedException {
        Charge charge = Charge.create(defaultChargeParams);
        FraudDetails expected = new FraudDetails();
        assertEquals(expected, charge.getFraudDetails());
        Charge refundedCharge = charge.refund();
        assertEquals(expected, refundedCharge.getFraudDetails());
        Charge updatedCharge = charge.update(ImmutableMap.<String, Object>of("fraud_details", ImmutableMap.of("user_report", "fraudulent")));
        FraudDetails expectedReported = new FraudDetails();
        expectedReported.setUserReport("fraudulent");
        assertEquals(expectedReported, updatedCharge.getFraudDetails());

        Charge nowSafe = updatedCharge.markSafe(null);
        expectedReported.setUserReport("safe");
        assertEquals(expectedReported, nowSafe.getFraudDetails());

        Charge nowFraudulent = nowSafe.markFraudulent(null);
        expectedReported.setUserReport("fraudulent");
        assertEquals(expectedReported, nowFraudulent.getFraudDetails());
    }

    // FileUpload and evidence Tests:
    @Test
    public void testCreateFileUpload() throws StripeException,
            InterruptedException, URISyntaxException {
        URL url = getClass().getSuperclass().getResource("minimal.pdf");
        File file = new File(url.getPath());
        Map<String, Object> fileUploadParams = new HashMap<String, Object>();
        fileUploadParams.put("purpose", "dispute_evidence");
        fileUploadParams.put("file", file);

        FileUpload fileUpload = FileUpload.create(fileUploadParams);
        assertEquals(file.length(), fileUpload.getSize().longValue());
        assertEquals("pdf", fileUpload.getType());

        FileUpload retrievedUpload = FileUpload.retrieve(fileUpload.getId());
        assertEquals(fileUpload.getId(), retrievedUpload.getId());
        assertEquals(file.length(), retrievedUpload.getSize().longValue());
        assertEquals("pdf", retrievedUpload.getType());
    }

    @Test
    public void testFileUploadList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("limit", 1);
        List<FileUpload> uploads = FileUpload.all(listParams).getData();
        assertEquals(uploads.size(), 1);
    }

    @Test
    public void testSubmitEvidence() throws StripeException, InterruptedException {
        int chargeValueCents = 100;
        Charge disputedCharge = createDisputedCharge(chargeValueCents);

        Dispute initialDispute = disputedCharge.getDisputeObject();
        assertNull(initialDispute.getEvidence());
        EvidenceSubObject emptyEvidence = new EvidenceSubObject();
        assertEquals(emptyEvidence, initialDispute.getEvidenceSubObject());
        assertEquals(0, initialDispute.getEvidenceDetails().getSubmissionCount().intValue());

        Map<String, Object> evidenceHashParams = new HashMap<String, Object>();
        // TODO: assert on all param types
        evidenceHashParams.put("product_description", "my productDescription");
        evidenceHashParams.put("customer_name", "my customerName");
        evidenceHashParams.put("uncategorized_text", "my uncategorizedText");
        Map<String, Object> providedEvidenceParams = ImmutableMap.<String, Object>of("evidence", evidenceHashParams);

        Dispute updatedDispute = disputedCharge.updateDispute(providedEvidenceParams);
        assertNotNull(updatedDispute);
        EvidenceSubObject evidenceSubObject = updatedDispute.getEvidenceSubObject();
        assertNotSame(emptyEvidence, evidenceSubObject);
        assertEquals(1, updatedDispute.getEvidenceDetails().getSubmissionCount().intValue());
        assertNull(updatedDispute.getEvidence());

        assertEquals("my productDescription", evidenceSubObject.getProductDescription());
        assertEquals("my customerName", evidenceSubObject.getCustomerName());
        assertEquals("my uncategorizedText", evidenceSubObject.getUncategorizedText());

        EvidenceDetails evidenceDetails = updatedDispute.getEvidenceDetails();
        assertNotNull(evidenceDetails);
        assertEquals(1, evidenceDetails.getSubmissionCount().intValue());
    }

    @Test
    public void testSubmitOldStyleEvidence() throws StripeException, InterruptedException {
        int chargeValueCents = 100;
        Stripe.apiVersion = "2014-11-20";
        Charge disputedCharge = createDisputedCharge(chargeValueCents);

        String myEvidence = "Here's evidence showing this charge is legitimate.";
        Dispute initialDispute = disputedCharge.getDisputeObject();
        assertNull(initialDispute.getEvidence());
        assertNull(initialDispute.getEvidenceSubObject());
        Map<String, Object> disputeParams = ImmutableMap.<String, Object>of("evidence", myEvidence);

        Dispute updatedDispute = disputedCharge.updateDispute(disputeParams);
        assertNotNull(updatedDispute);
        assertEquals(myEvidence, updatedDispute.getEvidence());
        assertNull(updatedDispute.getEvidenceSubObject());
    }
}
