package com.stripe.credential;

import java.io.FileReader;

import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.SubnodeConfiguration;

/**
 * <h1>SharedCredentialsProvider</h1>
 *
 * <p>Implements CredentialsProvider from ~/.strip/credentials file.
 *
 * @author  Jasper Culong
 * @since   2018-04-03
 *
 */
public class SharedCredentialsProvider implements StripeCredentialsProvider {

  String configurationFile;
  String section;

  /**
   * Fetches configuration from a configuration file.
   * Defaults to ~/.stripe/credentials.
   */
  public SharedCredentialsProvider() {

    this.configurationFile = System.getProperty("user.home") + "/.stripe/credentials";
    this.section = "default";

  }

  /**
   * Fetches configuration from a configuration file.
   * Overriding default to configuration file and section.
   *
   * @param configurationFile configuration file path
   * @param section           section on configuration file
   */
  public SharedCredentialsProvider(String configurationFile, String section) {

    this.configurationFile = configurationFile;
    this.section = section;

  }

  @Override
  public StripeCredentials getCredentials() {

    String apiKey = "";

    try {
      INIConfiguration configuration = new INIConfiguration();
      configuration.read(new FileReader(validateFilePath(this.configurationFile)));
      SubnodeConfiguration section = configuration.getSection(this.section);

      apiKey = section.getString("accountSid");

    } catch (Exception e) {
      e.printStackTrace();
    }
    if (apiKey.isEmpty()) {
      throw new IllegalArgumentException("Unable to set creds from " + this.configurationFile);
    }
    return new StripeCredentials(apiKey);
  }

  private static String validateFilePath(String filePath) {
    if (filePath == null || filePath.equals("")) {
      throw new IllegalArgumentException("Unable to load " + filePath);
    }
    return filePath;
  }
}
