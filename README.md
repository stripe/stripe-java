# Stripe Java Bindings

You can sign up for a Stripe account at https://stripe.com.

Requirements
============

Java 1.5 and later.

Installation
============

### Maven users

Add this dependency to your project's POM:

    <dependency>
      <groupId>com.stripe</groupId>
      <artifactId>stripe-java</artifactId>
      <version>1.2.7</version>
    </dependency>

### Others

You'll need to manually install the following JARs:

* The Stripe JAR from https://code.stripe.com/stripe-java-latest.jar
* [Google Gson](http://code.google.com/p/google-gson/) from <http://google-gson.googlecode.com/files/google-gson-2.2.2-release.zip>.

Usage
=====

StripeExample.java

    import java.util.HashMap;
    import java.util.Map;

    import com.stripe.Stripe;
    import com.stripe.exception.StripeException;
    import com.stripe.model.Charge;

    public class StripeExample {

        public static void main(String[] args) {
            Stripe.apiKey = "YOUR-SECRET-KEY";
            Map<String, Object> chargeMap = new HashMap<String, Object>();
            chargeMap.put("amount", 100);
            chargeMap.put("currency", "usd");
            Map<String, Object> cardMap = new HashMap<String, Object>();
            cardMap.put("number", "4242424242424242");
            cardMap.put("exp_month", 12);
            cardMap.put("exp_year", 2020);
            chargeMap.put("card", cardMap);
            try {
                Charge charge = Charge.create(chargeMap);
                System.out.println(charge);
            } catch (StripeException e) {
                e.printStackTrace();
            }
        }
    }


See [StripeTest.java](https://github.com/stripe/stripe-java/blob/master/src/test/java/com/stripe/StripeTest.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests, simply run `mvn test`. You can run particular tests by passing `-D test=Class#method` -- for example, `-D test=StripeTest#testPlanCreate`.
