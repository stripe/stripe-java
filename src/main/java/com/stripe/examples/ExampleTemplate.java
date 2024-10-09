package com.stripe.examples;

/**
 * This is a template for defining new examples. It is not intended to be used directly.
 *
 * <p><describe what this example does>
 *
 * <p>In this example, we:
 *
 * <ul>
 *   <li>key step 1
 *   <li>key step 2
 *   <li>...
 * </ul>
 *
 * <p><describe assumptions about the user's stripe account, environment, or configuration; or
 * things to watch out for when running>
 */
public class ExampleTemplate {

  @SuppressWarnings("unused")
  private String apiKey;

  public ExampleTemplate(String apiKey) {
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

    ExampleTemplate example = new ExampleTemplate(apiKey);
    example.doSomethingGreat();
  }
}
