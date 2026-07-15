package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.io.TempDir;

public class TelemetryIdTest extends BaseStripeTest {
  @TempDir Path tempDir;

  @BeforeEach
  public void setUp() {
    TelemetryId.reset();
    TelemetryId.configDirOverride = tempDir;
  }

  @AfterEach
  public void tearDown() {
    TelemetryId.reset();
  }

  @Test
  public void testGetReturnsValidHexString() {
    String id = TelemetryId.get();
    assertNotNull(id);
    assertTrue(
        id.matches("[0-9a-f]{32}"),
        "Expected telemetry_id to be a 32-character lowercase hex string, got: " + id);
  }

  @Test
  public void testGetReturnsCachedValue() {
    String id1 = TelemetryId.get();
    String id2 = TelemetryId.get();
    assertEquals(id1, id2, "Expected TelemetryId.get() to return the same value on repeated calls");
  }

  @Test
  public void testGetPersistsToFile() throws IOException {
    String id = TelemetryId.get();
    assertNotNull(id);

    // Verify the ID was written to the expected file path
    Path filePath = tempDir.resolve("telemetry_id");
    assertTrue(Files.exists(filePath), "Expected telemetry_id file to be created");
    String content = new String(Files.readAllBytes(filePath), "UTF-8").trim();
    assertEquals(id, content);
  }

  @Test
  public void testGetReturnsPersistedValueAfterReset() throws IOException {
    // After reset, calling get() again reads from the same file on disk, so it returns same value
    String id1 = TelemetryId.get();
    assertNotNull(id1);
    TelemetryId.reset();
    TelemetryId.configDirOverride = tempDir;
    String id2 = TelemetryId.get();
    assertEquals(id1, id2, "Expected same ID after reset (reads from persisted file)");
  }

  @Test
  public void testReadsExistingIdFromFile() throws IOException {
    // Pre-populate the file to simulate a previous run having written an ID
    String existingId = "abcdef1234567890abcdef1234567890";
    Path filePath = tempDir.resolve("telemetry_id");
    Files.write(filePath, existingId.getBytes("UTF-8"));

    String id = TelemetryId.get();
    assertEquals(existingId, id);
  }

  @Test
  public void testGetConfigDirReturnsPathContainingStripe() {
    // On any supported platform, the config dir should contain "stripe" (or "Stripe" on Windows)
    Path configDir = TelemetryId.getConfigDir();
    assertTrue(
        configDir == null || configDir.toString().toLowerCase().contains("stripe"),
        "Config dir should be null or contain 'stripe'");
  }

  @Test
  public void testGetConfigDirReturnsNonNull() {
    // On a normal dev machine with a home dir, this should always be non-null
    Path configDir = TelemetryId.getConfigDir();
    assertNotNull(configDir, "getConfigDir() should return non-null when home dir is available");
  }

  @Test
  public void testCreatesDirectoryIfMissing() {
    // Verify that get() creates intermediate directories when the config dir doesn't exist yet
    Path nestedDir = tempDir.resolve("nested").resolve("config");
    TelemetryId.configDirOverride = nestedDir;

    String id = TelemetryId.get();
    assertNotNull(id);
    assertTrue(Files.exists(nestedDir.resolve("telemetry_id")));
  }

  @Test
  public void testGetReturnsNullWhenWriteFails() throws IOException {
    // Place a regular file at the path where the config directory should be.
    // Files.createDirectories will fail because a file already occupies that path,
    // causing resolve() to catch the IOException and return null.
    Path blockerFile = tempDir.resolve("blocker");
    Files.write(blockerFile, new byte[0]);
    // Set the override to a subdirectory of the blocker file — impossible to create
    TelemetryId.configDirOverride = blockerFile.resolve("stripe");

    String id = TelemetryId.get();
    assertNull(id, "Expected get() to return null when the config directory cannot be created");
  }

  @Test
  @DisabledOnOs(OS.WINDOWS)
  public void testGetConfigDirFallsBackToHomeConfig() {
    // Force the XDG override to empty so the fallback branch is always exercised,
    // even if the real XDG_CONFIG_HOME is set in the environment.
    TelemetryId.xdgConfigHomeOverride = "";

    Path configDir = TelemetryId.getConfigDir();
    assertNotNull(configDir, "getConfigDir() should return non-null on a system with a home dir");

    String home = System.getProperty("user.home");
    assertTrue(
        configDir.startsWith(home),
        "Config dir should be rooted under user.home when XDG_CONFIG_HOME is not set");
    assertTrue(
        configDir.toString().endsWith(".config/stripe"),
        "Config dir should end with .config/stripe when XDG_CONFIG_HOME is not set, got: "
            + configDir);
  }

  @Test
  @DisabledOnOs(OS.WINDOWS)
  public void testGetConfigDirRespectsXdgConfigHome() {
    TelemetryId.xdgConfigHomeOverride = "/custom/config";

    Path configDir = TelemetryId.getConfigDir();
    assertNotNull(configDir);
    assertEquals(
        Paths.get("/custom/config", "stripe"),
        configDir,
        "getConfigDir() should use XDG_CONFIG_HOME when set");
  }
}
