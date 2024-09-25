package com.stripe.examples;

/**
 * To create a new example, clone this file and implement your example.
 *
 * <p>To run from VS Code: 1. make sure the recommended extensions are installed 2. right click on
 * your new file in the Explorer 3. click Run Java or Debug Java 4. witness greatness.
 */
public class NewExample {

  @SuppressWarnings("unused")
  private String apiKey;

  public NewExample(String apiKey) {
    this.apiKey = apiKey;
  }

  @SuppressWarnings("CatchAndPrintStackTrace")
  public void doSomethingGreat() {

    try {
      System.out.println("Hello World");
      // StripeClient client = new StripeClient(this.apiKey);
      // client.v2()....
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String apiKey = "{{API_KEY}}";

    NewExample example = new NewExample(apiKey);
    example.doSomethingGreat();
  }
}
