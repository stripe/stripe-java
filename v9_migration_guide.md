`stripe-java` version 9 drops supports for jdk 7. Majority of users on jdk 8 and above will not be affected. Additionally, this new major version introduces typed parameters and improves event deserialization. Both are breaking backward-compatibility, but only minor migration effort is expected.

## Typed parameters
Currently, API calls rely on untyped parameters and unsafe parameters can be passed. Now, each API call has specific typed parameters with builder-style constructors. 
#### Method overloading
The new methods with typed parameters simply overloads the current method replacing the untyped map object with the typed one. The library now supports both usage.

Current:
```java
  Map<String, Object> untypedParams = new HashMap<>();
  params.put("amount", 100);
  params.put("currency", "usd");
  params.put("source", "card_123");

  Charge charge = Charge.create(untypedParams);
```
New:
```java
  ChargeCreateParams typedParams = ChargeCreateParams.builder()
      .setAmount(100L)
      .setCurrency("usd")
      .setSource("card_123")
      .build();

  Charge charge = Charge.create(typedParams);
```
#### Breaking change due to ambiguous `null` parameters
One breaking change arises from overloading method names. Existing integrations passing `null` to
 the parameters argument will see complier error due to ambiguous types; the compiler does not 
 know whether `null` is a null untyped map, or null typed parameters. You should instead create an 
 empty parameters with either an empty map, or a built typed parameters without any values set.

#### Testing for migration
To ensure safe migration, consider testing equality between your current untyped `Map<String, 
Object>` parameters and the new typed parameters with `toMap()` to get the untyped representation.
```java
  Map<String, Object> untypedParams = getUntypedParams();
  ApiRequestParams typedParams = getTypedParams();
  Map<String, Object> typedParamsAsMap = typedParams.toMap();
  assertEquals(untypedParams, typedParamsAsMap);
```

#### Builder interfaces
* When parameters have nested objects, there are builders for each one via 
`builder()` method. Here, `SkuCreateParams.Inventory` is separately built, and used in setting 
`SkuCreateParams` root-level parameters. Note that nested objects are not shared among parameters
 of different methods. For instance, parameter class to update SKU `SkuUpdateParams` separately has 
 its nested object of `SkuUpdateParams.Inventory` which can differ from that in parameters to create SKU.
```java
  SkuCreateParams.Inventory inventoryParams = SkuCreateParams.Inventory.builder()
      .setQuantity(4L)
      .build();

  SkuCreateParams createParams = SkuCreateParams.builder()
      .setPrice(99L)
      .setCurrency("usd")
      .setInventory(inventoryParams)
      .setProduct("prod_123")
      .build();
  Sku sku = Sku.create(createParams);
``` 


* When parameters require a list or a map, there are similar interfaces to `add` and `addAll` in 
`List<T>`, and `put` and `putAll` in `Map<String, T>`.
```java
  PaymentIntentRetrieveParams typedParams = PaymentIntentRetrieveParams.builder()
      // support both adding individual element or the whole list
      .addExpand("application")
      .addExpand("on_behalf_of")
      .addAllExpand(Arrays.asList("review", "source", "transfer_data.destination"))
      .build();

  CustomerUpdateParams customerUpdateParams = CustomerUpdateParams.builder()
       // support both putting individual entry or the whole map
       .putMetadata("key1", "value1")
       .putAllMetadata(ImmutableMap.of("key2", "value2"))
       .build();
```


* When parameters require enums, there are specific enums for each parameter.
```java
  WebhookEndpointCreateParams createParams = WebhookEndpointCreateParams
      .builder()
      .addEnabledEvent(WebhookEndpointCreateParams.EnabledEvent.CHARGE__SUCCEEDED)
      .setApiVersion(WebhookEndpointCreateParams.ApiVersion.VERSION_2019_03_14)
      .setUrl("https://myEndPoint.com")
      .build();
```


This has been a long-standing [ask](https://github.com/stripe/stripe-java/issues/211) from the community, so we thank you for your patience!

## Event deserialization
* Currently, untyped map `Event#previousAttributes` may contain value `Object[]` to represent a 
list. Now `List<Object>` is the deserialized object for list content. This addresses the [issue](https://github.com/stripe/stripe-java/issues/605).
* Currently, `EventDataObjectDeserializer#getObject` returns `StripeObject` which can be `null` 
when there is API version mismatch between `stripe-java` pinned version `Stripe#API_VERSION` and 
the event version `Event#apiVersion`. Now, with jdk8 and above, `Optional<StripeObject>` is 
returned, and the check method `deserialize` whether deserialization is successful is removed from the public call.

Current:
```java
    Event event = getEventFromWebhookOrEndpoint();
    EventDataObjectDeserializer dataObjectDeserializer = event.getDataObjectDeserializer();
    if (dataObjectDeserializer.deserialize()) {
       StripeObject stripeObject = dataObjectDeserializer.getObject();
    }
```
New:
```java
    Event event = getEventFromWebhookOrEndpoint();
    EventDataObjectDeserializer dataObjectDeserializer = event.getDataObjectDeserializer();
    if (dataObjectDeserializer.getObject().isPresent()) {      
      StripeObject stripeObject = dataObjectDeserializer.getObject().get();
      doSomething(stripeObject);
    } 
```

## Class rename
* `ScheduledQueryRun#Error` is renamed to `ScheduledQueryRun#RunError` to prevent potential ambiguous reference to basic `java.lang.Error`


