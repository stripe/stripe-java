package com.stripe.param.issuing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;
import com.stripe.param.common.EmptyParam;
import java.util.Map;
import org.junit.jupiter.api.Test;

class TransactionUpdateParamsTest {

  @Test
  public void testSetMetadataEmpty() {
    TransactionUpdateParams transactionUpdateParams =
        TransactionUpdateParams.builder().setMetadata(EmptyParam.EMPTY).build();

    Map<String, Object> untypedParams = transactionUpdateParams.toMap();
    assertEquals(null, untypedParams.get("metadata"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testSetMetadataMap() {
    Map<String, String> metadata = ImmutableMap.of("key_1", "value_1", "key_2", "value_2");
    TransactionUpdateParams transactionUpdateParams =
        TransactionUpdateParams.builder().setMetadata(metadata).build();

    Map<String, Object> untypedParams = transactionUpdateParams.toMap();
    assertTrue(untypedParams.get("metadata") instanceof Map<?, ?>);
    assertEquals("value_1", ((Map<String, String>) untypedParams.get("metadata")).get("key_1"));
    assertEquals("value_2", ((Map<String, String>) untypedParams.get("metadata")).get("key_2"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testPutMetadata() {
    TransactionUpdateParams transactionUpdateParams =
        TransactionUpdateParams.builder()
            .putMetadata("key_1", "value_1")
            .putMetadata("key_2", "value_2")
            .putMetadata("key_null", null)
            .build();

    Map<String, Object> untypedParams = transactionUpdateParams.toMap();
    assertTrue(untypedParams.get("metadata") instanceof Map<?, ?>);
    assertEquals("value_1", ((Map<String, String>) untypedParams.get("metadata")).get("key_1"));
    assertEquals("value_2", ((Map<String, String>) untypedParams.get("metadata")).get("key_2"));
    assertNull(((Map<String, String>) untypedParams.get("metadata")).get("key_null"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testPutAllMetadata() {
    Map<String, String> metadata1 = ImmutableMap.of("key_1", "value_1");
    Map<String, String> metadata2 = ImmutableMap.of("key_2", "value_2");
    TransactionUpdateParams transactionUpdateParams =
        TransactionUpdateParams.builder()
            .putAllMetadata(metadata1)
            .putAllMetadata(metadata2)
            .build();

    Map<String, Object> untypedParams = transactionUpdateParams.toMap();
    assertTrue(untypedParams.get("metadata") instanceof Map<?, ?>);
    assertEquals("value_1", ((Map<String, String>) untypedParams.get("metadata")).get("key_1"));
    assertEquals("value_2", ((Map<String, String>) untypedParams.get("metadata")).get("key_2"));
  }
}
