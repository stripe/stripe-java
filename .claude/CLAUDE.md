# stripe-java

## Testing

- Run all tests: `just test`
- Run a single test class: `just test-one com.stripe.net.HttpClientTest`
- Pass extra Gradle args: `just test --tests com.stripe.SomeTest`

## Formatting

- Format: `just format` (uses Spotless via Gradle)
- Format check: `just format-check`

## Key Locations

- HTTP client abstract base (retry logic): `src/main/java/com/stripe/net/HttpClient.java`
- HTTP implementation: `src/main/java/com/stripe/net/HttpURLConnectionClient.java`
- Header management: `src/main/java/com/stripe/net/HttpHeaders.java`
- Request building: `src/main/java/com/stripe/net/StripeRequest.java`
- Authentication: `src/main/java/com/stripe/net/Authenticator.java`, `BearerTokenAuthenticator.java`
- Response getter (request dispatch): `src/main/java/com/stripe/net/LiveStripeResponseGetter.java`
- Main config/version: `src/main/java/com/stripe/Stripe.java`
- Client class: `src/main/java/com/stripe/StripeClient.java`

## Generated Code

- Files containing `File generated from our OpenAPI spec` at the top are generated; do not edit. Similarly, any code block starting with `The beginning of the section generated from our OpenAPI spec` is generated and should not be edited directly.
  - If something in a generated file/range needs to be updated, add a summary of the change to your report but don't attempt to edit it directly.
- Resource model classes under `src/main/java/com/stripe/model/` are largely generated.
- The `net/` package (HTTP client, headers, request/response) is NOT generated.

## Conventions

- Uses Java's built-in `HttpURLConnection` for HTTP
- Requires JDK 17 to build
- Gradle build system
- Work is not complete until `just test` passes

### Comments

- Comments MUST only be used to:
  1. Document a function
  2. Explain the WHY of a piece of code
  3. Explain a particularly complicated piece of code
- Comments NEVER should be used to:
  1. Say what used to be there. That's no longer relevant!
  2. Explain the WHAT of a piece of code (unless it's very non-obvious)

It's ok not to put comments on/in a function if their addition wouldn't meaningfully clarify anything.
