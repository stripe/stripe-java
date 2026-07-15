package com.stripe.net;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

final class TelemetryId {
  private static volatile String cachedId;
  private static volatile boolean loaded = false;

  // Visible for testing: when non-null, overrides getConfigDir() result.
  static volatile Path configDirOverride;

  // Visible for testing: overrides System.getenv("XDG_CONFIG_HOME") when non-null.
  static volatile String xdgConfigHomeOverride;

  private TelemetryId() {}

  static String get() {
    if (loaded) {
      return cachedId;
    }
    synchronized (TelemetryId.class) {
      if (loaded) {
        return cachedId;
      }
      cachedId = resolve();
      loaded = true;
    }
    return cachedId;
  }

  static Path getConfigDir() {
    String os = System.getProperty("os.name", "").toLowerCase();
    if (os.contains("win")) {
      String appData = System.getenv("APPDATA");
      if (appData == null || appData.isEmpty()) {
        return null;
      }
      return Paths.get(appData, "Stripe");
    }
    String xdg =
        xdgConfigHomeOverride != null ? xdgConfigHomeOverride : System.getenv("XDG_CONFIG_HOME");
    if (xdg != null && !xdg.isEmpty()) {
      return Paths.get(xdg, "stripe");
    }
    String home = System.getProperty("user.home");
    if (home == null || home.isEmpty()) {
      return null;
    }
    return Paths.get(home, ".config", "stripe");
  }

  /**
   * Returns the telemetry ID unless something goes wrong with the file I/O (can't read/write
   * directory, for example)
   */
  private static String resolve() {
    Path configDir = configDirOverride != null ? configDirOverride : getConfigDir();
    if (configDir == null) {
      return null;
    }

    Path filePath = configDir.resolve("telemetry_id");

    try {
      String content = new String(Files.readAllBytes(filePath), "UTF-8").trim();
      if (!content.isEmpty()) {
        return content;
      }
    } catch (IOException e) {
      // File doesn't exist or can't be read
    }

    String newId = UUID.randomUUID().toString().replace("-", "");

    try {
      Files.createDirectories(configDir);
      Files.write(filePath, newId.getBytes("UTF-8"));
    } catch (IOException e) {
      return null;
    }

    return newId;
  }

  // Visible for testing
  static void reset() {
    synchronized (TelemetryId.class) {
      cachedId = null;
      loaded = false;
      configDirOverride = null;
      xdgConfigHomeOverride = null;
    }
  }
}
