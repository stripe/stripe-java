# Changelog

## 16.4.0 - 2019-12-20
* [#921](https://github.com/stripe/stripe-java/pull/921) Add `executives_provided` on `Account`

## 16.3.0 - 2019-12-20
* [#918](https://github.com/stripe/stripe-java/pull/918) Multiple API changes
  * Adds `livemode` and `metadata` to Terminal `Reader` and `Location`
  * Adds `ms` as a valid locale on Checkout `Session`

## 16.2.0 - 2019-12-09
* [#914](https://github.com/stripe/stripe-java/pull/914) Add support for AU BECS Debit on `PaymentMethod`
* [#906](https://github.com/stripe/stripe-java/pull/906) Add documentation for enum values

## 16.1.0 - 2019-12-04
* [#912](https://github.com/stripe/stripe-java/pull/912) Add support for `network` on `Charge` and `funding_method` on `SourceTransaction`

## 16.0.0 - 2019-12-03
* [#910](https://github.com/stripe/stripe-java/pull/910) Use global timeouts in RequestOptions
* [#911](https://github.com/stripe/stripe-java/pull/911) Multiple API changes
  * Pin to API version `2019-12-03`
  * Remove `tax_info` and `tax_info_verification` on `Customer`
  * Remove `cardholder` on Issuing `Card` update
  * Remove `invoice_customer_balance_settings` from `Subscription`

## 15.7.0 - 2019-11-26
* [#908](https://github.com/stripe/stripe-java/pull/908) Add support for Preview endpoint on CreditNote

## 15.6.0 - 2019-11-25
* [#907](https://github.com/stripe/stripe-java/pull/907) Add support for `out_of_band_amount` on `CreditNote` creation

## 15.5.0 - 2019-11-21
* [#905](https://github.com/stripe/stripe-java/pull/905) Add support for `payment_intent` filter when listing `Dispute`s.

## 15.4.0 - 2019-11-18
* [#904](https://github.com/stripe/stripe-java/pull/904) Add support for `violated_authorization_controls` on Issuing `Authorization`

## 15.3.1 - 2019-11-18
* [#903](https://github.com/stripe/stripe-java/pull/903) Serialize null values in all maps
* [#901](https://github.com/stripe/stripe-java/pull/901) Minor code quality fixes
* [#894](https://github.com/stripe/stripe-java/pull/894) Upgrade Gradle and other dependencies

## 15.3.0 - 2019-11-07
* [#890](https://github.com/stripe/stripe-java/pull/890) Multiple API changes
  * Add `company` and `individual` to Issuing `Cardholder`
  * Add `sepa_debit` to `PaymentMethodUpdateParams`
* [#891](https://github.com/stripe/stripe-java/pull/891) Replace Cobertura with JaCoCo

## 15.2.0 - 2019-11-06
* [#889](https://github.com/stripe/stripe-java/pull/889) Multiple API changes:
  * Add `disputed` on `Charge`.
  * Add `payment_intent` on ` Dispute` and `Refund`.
  * Add `payment_intent` when creating a `Refund`.
  * Add `payment_intent` filter when listing `Refund` and `Dispute`.

## 15.1.0 - 2019-11-06
* [#888](https://github.com/stripe/stripe-java/pull/888) Add support for SEPA and iDEAL on `PaymentMethod` and `Mandate`

## 15.0.0 - 2019-11-05
* [#886](https://github.com/stripe/stripe-java/pull/886) Move to the latest API version and add new changes
  * Move to API version `2019-11-05`
  * Add `default_settings` on `SubscritionSchedule`
  * Remove `billing_thresholds`, `collection_method`, `default_payment_method`, `default_source` and `invoice_settings` from `SubscriptionSchedule
  * Add `charge` filter when listing `Dispute`

## 14.5.0 - 2019-11-04
* [#881](https://github.com/stripe/stripe-java/pull/881) Add support for `use_stripe_sdk` on `PaymentIntent` creation and confirmation

## 14.4.1 - 2019-10-30
* [#877](https://github.com/stripe/stripe-java/pull/877) Fix docstring for a parameter to reflect the correct behaviour

## 14.4.0 - 2019-10-30
* [#876](https://github.com/stripe/stripe-java/pull/876) Add support for `invoice_customer_balance_settings` on `Invoice`
* [#873](https://github.com/stripe/stripe-java/pull/873) Suppress unchecked cast warnings in test

## 14.3.0 - 2019-10-25
* [#871](https://github.com/stripe/stripe-java/pull/871) Codegen for openapi d8f9ddf
  * Remove `max_amount` from Issuing `Card`. This is technically a breaking change but only one integration was using this feature which changed a while ago

## 14.2.0 - 2019-10-24
* [#868](https://github.com/stripe/stripe-java/pull/868)
  * Add support for typed parameters in `Event.retrieve` method
* [#867](https://github.com/stripe/stripe-java/pull/867) Contributor Convenant

## 14.1.0 - 2019-10-23
* [#866](https://github.com/stripe/stripe-java/pull/866) Various API changes
  * Add support for `mx_rfc` on `TaxId`
  * Add support for `pending_invoice_item_interval` on  `Subscription` creation and update
  * Add support for `next_pending_invoice_item_invoice` on `Subscription
  * Add support for `installments` which is a feature on `PaymentIntent` and `PaymentMethod` available on MX Stripe accounts. It's also added inside `payment_method_details[card]` on `Charge`
  * Add support for `next_pending_invoice_item_invoice` as a new `Capability`

## 14.0.1 - 2019-10-18
* [#864](https://github.com/stripe/stripe-java/pull/864)
  * Remove `renewal_behavior` on Subscription Schedule model class
  * Remove `renewal_interval` on Subscription Schedule parameter classes
  * The above are technically breaking changes and should have been released with 14.0.0.

## 14.0.0 - 2019-10-18
* [#863](https://github.com/stripe/stripe-java/pull/863) Upgrade to new API version [`2019-10-17`](https://stripe.com/docs/upgrades#2019-10-17)
  * Pin to API version `2019-10-17`
  * Remove `account_balance` from Customer model and parameter classes
  * Remove `billing` from Invoice, Subscription and Subscription Schedule model and parameter classes
  * Remove `start` from Subscription model
  * Remove `renewal_behavior` from Subscription Schedule parameter classes
  * **Note:** This release was missing some breaking changes. Please use 14.0.1 instead.

## 13.3.0 - 2019-10-17
* [#862](https://github.com/stripe/stripe-java/pull/862) [codegen] Update API Resources
  * `requirements` on Issuing `Cardholder`
  * `payment_method_details[au_becs_debit][mandate]` on `Charge`
  * new types of tax id for Customer `TaxId`.
  * `payment_behavior` on `Subscription` creation can now take the value `pending_if_incomplete`.
  * `payment_behavior` on `SubscriptionItem` creation and update is now supported.
  * `subscription_data[trial_from_plan]` is now supported on Checkout `Session` creation.
* [#858](https://github.com/stripe/stripe-java/pull/858) Stop propagating UnsupportedEncodingException

## 13.2.0 - 2019-10-16
* [#861](https://github.com/stripe/stripe-java/pull/861) Add getters to parameters classes

## 13.1.0 - 2019-10-09
* [#854](https://github.com/stripe/stripe-java/pull/854)
  * Add support for `description`, `iin` and `issuer` on `Source.Card`, `Source.CardPresent` and `Source.ThreeDSecure`
  * Add support for `deviceType` on `ReaderListParams`

## 13.0.0 - 2019-10-08
* [#853](https://github.com/stripe/stripe-java/pull/853) Upgrade to new API version [`2019-10-08`](https://stripe.com/docs/upgrades#2019-10-08)

## 12.2.0 - 2019-10-08
* [#852](https://github.com/stripe/stripe-java/pull/852) Setters for string properties in update params now all accept `EmptyParam`
* [#835](https://github.com/stripe/stripe-java/pull/835) Bump dependencies
* [#851](https://github.com/stripe/stripe-java/pull/851) Update `README.md`

## 12.1.0 - 2019-09-27
* [#850](https://github.com/stripe/stripe-java/pull/850) Codegen for openapi 4d4a107
  * Add support for `mandate` on `Charge`.
  * Add support for `reference` on `SourceTransaction`.
  * Add support for `person` on `TokenCreateParams`.
  * Add support for new event types `payment_intent.canceled` and `setup_intent.canceled`
  * Add support for `metadata` on `AuthorizationApproveParams` and `AuthorizationDeclineParams`
  * Add `setMetadata` method on `AuthorizationUpdateParams`
  * Rename `chidrens_and_infants_wear_stores` to `childrens_and_infants_wear_stores`. This is technically a breaking change, but we've chosen to release this as a minor version as the previous name was virtually unused.
* [#849](https://github.com/stripe/stripe-java/pull/849) Add add/addAll support for "emptyable" params
  * Add `addAttribute` and `addAllAttribute` methods to `ProductUpdateParams`
  * Add `addCustomField` and `addAllCustomField` methods to `CustomerCreateParams`, `CustomerUpdateParams`, `InvoiceCreateParams` and `InvoiceUpdateParams`
  * Add `addDefaultTaxRate` and `addAllDefaultTaxRate` methods to `InvoiceUpdateParams`, `SubscriptionCreateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams` and `SubscriptionUpdateParams`
  * Add `addImage` and `addAllImage` methods to `ProductUpdateParams`
  * Add `addItem` and `addAllItem` methods to `OrderReturnOrderParams`
  * Add `addSubscriptionDefaultTaxRate` and `addAllSubscriptionDefaultTaxRate` methods to `InvoiceUpcomingParams`
  * Add `addTaxRate` and `addAllTaxRate` methods to `InvoiceItemUpdateParams`, `InvoiceUpcomingParams`, `SubscriptionCreateParams`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams` and `SubscriptionUpdateParams`

## 12.0.0 - 2019-09-10
* [#844](https://github.com/stripe/stripe-java/pull/844) Update to API version 2019-09-09

## 11.8.0 - 2019-09-09
* [#842](https://github.com/stripe/stripe-java/pull/842)
  * Add support for `company[verification]` on `Account`
  * Add support for `verification[additional_document]` on `Person`

## 11.7.0 - 2019-09-05
* [#827](https://github.com/stripe/stripe-java/pull/827) Switch to new "prettier" codegen
* [#841](https://github.com/stripe/stripe-java/pull/841)
  * Just a trivial comment update

## 11.6.1 - 2019-09-03
* [#839](https://github.com/stripe/stripe-java/pull/839) Deprecate `total_count`

## 11.6.0 - 2019-09-03
* [#838](https://github.com/stripe/stripe-java/pull/838) Support `authentication` on Issuing `Authorization` and `url` on `MerchantData`

## 11.5.1 - 2019-08-30
* [#834](https://github.com/stripe/stripe-java/pull/834) Make `stripeError` transient on `StripeException`

## 11.5.0 - 2019-08-28
* [#833](https://github.com/stripe/stripe-java/pull/833) Add support for `endBehavior` on `SubscriptionSchedule`

## 11.4.0 - 2019-08-28
* [#830](https://github.com/stripe/stripe-java/pull/830) Add support for `pendingVerification` on `Account`, `Person` and `Capability`

## 11.3.0 - 2019-08-23
* [#829](https://github.com/stripe/stripe-java/pull/829)
  * Release support for decimal values on Billing resources such as `Plan` or `InvoiceItem`

## 11.2.0 - 2019-08-21
* [#828](https://github.com/stripe/stripe-java/pull/828)
  * Add support for `schedule` on `Subscription`
  * Add support for `defaultPaymentMethod`, `invoiceSettings`, `collectionMethod` and `billingThresholds` to `SubscriptionSchedule` and its update and create APIs
  * Add support for `mode` and `setupIntent` on Checkout `Session` and its create API
  * Add support for `schedule` and `subscriptionCancelAt` to the `Invoice` Upcoming API
  * Add support for new event types `subscription_schedule.*`

## 11.1.0 - 2019-08-15
* [#826](https://github.com/stripe/stripe-java/pull/826) Add support for `executive` on `Person` create, update and list

## 11.0.0 - 2019-08-14
* [#825](https://github.com/stripe/stripe-java/pull/825) Move to API version [`2019-08-14`](https://stripe.com/docs/upgrades#2019-08-14)
  * Rename `platform_payments` to `transfers` in `Account`
  * Introduce `executive` as a relationship on `Person`

## 10.15.0 - 2019-08-14
* [#824](https://github.com/stripe/stripe-java/pull/824)
  * Add support for `au_becs_debit` sources
  * Add support for `mandate` parameter in source creation and update requests
  * Add support for `amount` in source update requests
  * Add support for `pin` attribute on `issuing.card` objects
  * Add support for `digital_goods_applications` category for Issuing

## 10.14.0 - 2019-08-08
* [#820](https://github.com/stripe/stripe-java/pull/820)
  * Add support for unsetting `receipt_email` on `PaymentIntent`
  * Remove support for `SubscriptionScheduleRevision`. This is technicall a breaking change, but we've chosen to release this as a minor version as this resource and its APIs were virtually unused.

## 10.13.0 - 2019-08-08
* [#819](https://github.com/stripe/stripe-java/pull/819)
  * Add support for `payment_method_details[card][moto]` on `Charge`
  * Add support for `statement_descriptor_suffix` on `Charge` and `PaymentIntent`
  * Add support `subscription_data[application_fee_percent]` on Checkout `Session`
  * Rename `uk_credit_transfer` to `gbp_credit_transfer` on Source. This is technically a breaking change, but we've chosen to release this as a minor version as the previous name was virtually unused.

## 10.12.2 - 2019-08-07
* [#818](https://github.com/stripe/stripe-java/pull/818) Set default timeouts in `RequestOptionsBuilder`

## 10.12.1 - 2019-07-30
* [#812](https://github.com/stripe/stripe-java/pull/812) Fix potential `NullPointerException` when calling `getRawJsonObject()`

## 10.12.0 - 2019-07-22
* [#809](https://github.com/stripe/stripe-java/pull/809)
  * Add support for `statement_descriptor` on `PaymentIntent` capture
  * Add support for unsetting `setup_future_usage` on `PaymentIntent`

## 10.11.0 - 2019-07-19
* [#808](https://github.com/stripe/stripe-java/pull/999)
  * Add `off_session` to `SubscriptionItem` update
  * Add `customer` when listing `CreditNote`
  * Remove `challenge_only` enum value. This is technically a breaking change, but we've chosen to release this as a minor version in light of the fact that this value was virtually unused.

## 10.10.0 - 2019-07-17
* [#806](https://github.com/stripe/stripe-java/pull/806) Add support for `voided_at` on `CreditNote`

## 10.9.1 - 2019-07-16
* [#804](https://github.com/stripe/stripe-java/pull/804) Add support for unsetting metadata keys
* [#805](https://github.com/stripe/stripe-java/pull/805) Bump dependencies

## 10.9.0 - 2019-07-15
* [#802](https://github.com/stripe/stripe-java/pull/802) Add support for `payment_method_options` on `PaymentIntent` and `SetupIntent`

## 10.8.0 - 2019-07-15
* [#801](https://github.com/stripe/stripe-java/pull/801)
  * Add support for `pending_setup_intent` on Subscription
  * Add support for `off_session` on Subscription creation and update and Invoice pay

## 10.7.0 - 2019-07-15
* [#800](https://github.com/stripe/stripe-java/pull/800)
  * Add support for Sources of type `klarna`
  * Add support for `payment_behavior` on Subscription and SubscriptionItem to control their behaviour on creation or update.

## 10.6.0 - 2019-07-12
* [#799](https://github.com/stripe/stripe-java/pull/799) Add `getRawJsonObject()` accessor

## 10.5.0 - 2019-07-09
* [#798](https://github.com/stripe/stripe-java/pull/798)
  * Add support for `transfer_data[amount]` on PaymentIntent
  * Add support for passing `setup_future_usage` on PaymentIntent Update and Confirm APIs
  * Add support for `confirm` and `return_url` on SetupIntent creation
  * Add support for `setup_future_usage` on Checkout Session creation
  * Add support for `subscription_start_date` on the Upcoming Invoice API

## 10.4.0 - 2019-07-01
* [#796](https://github.com/stripe/stripe-java/pull/796)
  * Add support for the `SetupIntent` resource and APIs
  * Add support for `PlatformTaxFee` resource
  * Add `unified_proration` on `InvoiceItem` and `InvoiceLineItem`
  * Add `default_payment_method` and `default_source` to `SubscriptionSchedule`

## 10.3.0 - 2019-06-24
* [#792](https://github.com/stripe/stripe-java/pull/792) Enable request latency telemetry by default

## 10.2.0 - 2019-06-24
* [#794](https://github.com/stripe/stripe-java/pull/794)
  * Add `collection_method` to `Invoice`, `Subscription` and `SubscriptionSchedule`
  * Add `unified_propration` to `InvoiceLineItem`
  * Support unsetting `dob` on an `Account`
  * Removed `native_url` from WeChat `Source`. While technically breaking, this field has never been used

## 10.1.0 - 2019-06-18
* [#789](https://github.com/stripe/stripe-java/pull/789)
  * Add support for SEPA Credit Transfer sources
  * Add support for `CustomerBalanceTransaction` resource and APIs
  * Add `balance` property on `Customer`
  * Add `submitType` property on `checkout.Session`
  * Add `merchantAmount` and `merchantCurrency` properties on `issuing.Transaction`
  * Add `location` property on `terminal.ConnectionToken`

## 10.0.2 - 2019-05-29
* [#784](https://github.com/stripe/stripe-java/pull/784) Make headers access case insensitive

## 10.0.1 - 2019-05-28
* [#783](https://github.com/stripe/stripe-java/pull/783) Fix url-encoding for string id to throw exception on passing null

## 10.0.0 - 2019-05-24
* [#781](https://github.com/stripe/stripe-java/pull/781) Pin library to API version `2019-05-16`

## 9.13.0 - 2019-05-23
* [#780](https://github.com/stripe/stripe-java/pull/780)
  * Add support for new `radar.early_fraud_warning` resource and methods
  * Add new in_gst and no_vat tax ID types
  * Add `spending_limits_currency` attribute and parameter in Issuing resources

## 9.12.0 - 2019-05-14
* [#777](https://github.com/stripe/stripe-java/pull/777)
  * Add support for `Capability`
  * Add enum `off_session` for `PaymentIntentConfirmParams` and `PaymentIntentCreateParams`
  * Add enum `abandoned` for `PaymentIntentCancellationParams`.
  * Add support for `statementDescriptorKana` and `statementDescriptorKanji` in `Account.SettingsPayments`

## 9.11.0 - 2019-05-10
* [#776](https://github.com/stripe/stripe-java/pull/776)
  * Add support for `startDate` in `Subscription`
  * Removed one unsupported enum on `PaymentIntentCancelParams`


## 9.10.0 - 2019-05-06
* [#773](https://github.com/stripe/stripe-java/pull/773)
  * Add support for `extraParams` in all sub-classes of ApiRequestParams their nested classes
  * Add support for webhook event `payment_method.updated`
  * Add support for `payment_intent` filter when listing `Charge`
  * Add support for `legacy_payments` enum `RequestedCapability` in `AccountCreateParams` and `AccountUpdateParams`

## 9.9.0 - 2019-05-03
* [#768](https://github.com/stripe/stripe-java/pull/768)
  * Add support for `customer` filter when listing `PaymentIntent`
  * Add support for `replacement_for` and `replacement_reason` on Issuing `card` creation

## 9.8.0 - 2019-04-29
* [#766](https://github.com/stripe/stripe-java/pull/766) Add support for ACSS debit Sources

## 9.7.0 - 2019-04-24
* [#761](https://github.com/stripe/stripe-java/pull/761) Add support for `TaxRate` resource and APIs

## 9.6.0 - 2019-04-24
* [#756](https://github.com/stripe/stripe-java/pull/756) Fix form-encoding to support `Collection` in untyped params as array. Previously only `List` is form-encoded as array.
* [#755](https://github.com/stripe/stripe-java/pull/755) Add support for `CARD_ISSUING` enum in `RequestedCapability` for Account create/update params.

## 9.5.0 - 2019-04-22
* [#750](https://github.com/stripe/stripe-java/pull/750) Add support for the `TaxId` resource and APIs

## 9.4.0 - 2019-04-18
* [#748](https://github.com/stripe/stripe-java/pull/748)
  * Add support for `address`, `name`, `phone` and `preferredLocales` on `Customer`
  * Add support for the `CreditNote` resource and APIs
  * Add support for account and customer related fields on the `Invoice` resource

## 9.3.0 - 2019-04-16
* [#745](https://github.com/stripe/stripe-java/pull/745) Add support for the Checkout `Session` resource and APIs

## 9.2.0 - 2019-04-15
* [#744](https://github.com/stripe/stripe-java/pull/744)
  * Make `paymentIntent` on `Invoice` expandable instead of full-model
  * Add support for issuing `SpendingLimit` in `Card` and `CardHolder`
  * Add support for fields in `PaymentMethodDetails.Card.ThreeDSecure`

## 9.1.0 - 2019-04-11
* [#737](https://github.com/stripe/stripe-java/pull/737) Fix issue #736 on un-encoded ID in url path
* [#739](https://github.com/stripe/stripe-java/pull/739) Add support for `ConfirmationMethod` in `PaymentIntentCreateParams`, `AuthorizationControls` in cardholders mode/params
* [#735](https://github.com/stripe/stripe-java/pull/735) Fix encoding of nested parameters in multipart requests
* [#734](https://github.com/stripe/stripe-java/pull/734) Upgrade Gradle to 5.3.1

## 9.0.0 - 2019-04-09
* [#700](https://github.com/stripe/stripe-java/pull/700) Major version release. Refer to our [migration guide for v9](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v9) for a list of backward incompatible changes to watch out for.
Pull requests included in this release:
* [#698](https://github.com/stripe/stripe-java/pull/698) Drop support for Java 1.7
* [#723](https://github.com/stripe/stripe-java/pull/723) Use `Optional` for unsafe event data object deserialization
* [#705](https://github.com/stripe/stripe-java/pull/705) Add support for typed parameters, change deserialization of array in `Event#previousAttributes` from `Object[]` to `List<Object>`
* [#729](https://github.com/stripe/stripe-java/pull/729) Add missing Javadoc for non-autogenerated classes (`EphemeralKey`, `Event` and `File`)
* [#730](https://github.com/stripe/stripe-java/pull/730) Add support for typed parameters for non-autogenerated classes (`EphemeralKey`, `Event` and `File`)
* [#702](https://github.com/stripe/stripe-java/pull/702) Dev dependency version upgrades
* [#706](https://github.com/stripe/stripe-java/pull/706) Dev dependency version upgrades (Junit 5)
* [#728](https://github.com/stripe/stripe-java/pull/728) Dev dependency version upgrades
* [#713](https://github.com/stripe/stripe-java/pull/713) Use ErrorProne in builds

## 8.1.0 - 2019-03-25
* [#710](https://github.com/stripe/stripe-java/pull/710) Add support for `PaymentMethod.BillingDetails` on `Charge`.
* [#708](https://github.com/stripe/stripe-java/pull/708) Fix issues reported by `ErrorProne` Nothing major or user visible.

## 8.0.2 - 2019-03-20
* [#704](https://github.com/stripe/stripe-java/pull/704) Fix test compiler error by removing an accidental line

## 8.0.1 - 2019-03-20
* [#701](https://github.com/stripe/stripe-java/pull/701) Fix java doc on deprecated `EventData#getObject` and `Event#getDataObjectDeserializer`

## 8.0.0 - 2019-03-19
* [#662](https://github.com/stripe/stripe-java/pull/662) Major version release. Supports a pinned API version [2019-03-14](https://stripe.com/docs/upgrades#2019-03-14). Refer to our [migration guide for v8](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v8) for API upgrade guide and lists of backwards incompatible changes to watch out for.

## 7.29.0 - 2019-03-18
* [#695](https://github.com/stripe/stripe-java/pull/695) Add support for `payment_intent` on `Charge`.

## 7.28.0 - 2019-03-18
* [#688](https://github.com/stripe/stripe-python/pull/688) Add support for the `PaymentMethod` resource and APIs
* [#691](https://github.com/stripe/stripe-python/pull/691) Add support for deleting a Terminal `Location` and `Reader`

## 7.27.0 - 2019-03-13
* [#689](https://github.com/stripe/stripe-java/pull/689) Add support for `columns` on `ReportRun` and `default_columns` on `ReportType`.

## 7.26.0 - 2019-03-06
* [#686](https://github.com/stripe/stripe-java/pull/686) Add support for `cancel_at` on `Subscription`.

## 7.25.0 - 2019-02-28
* [#684](https://github.com/stripe/stripe-java/pull/684) Add support for `latest_invoice` on `Subscription`.
* [#685](https://github.com/stripe/stripe-java/pull/685) Add `api_version` to the `WebhookEndpoint` resource.

## 7.24.0 - 2019-02-22
* [#681](https://github.com/stripe/stripe-java/pull/681) Add support for `status_transitions` and marked `date` as deprecated on `Invoice`.

## 7.23.0 - 2019-02-19
* [#660](https://github.com/stripe/stripe-java/pull/660) Add support for API version `2019-02-19` and related changes to `Account` and `Person`.

## 7.22.0 - 2019-02-16
* [#678](https://github.com/stripe/stripe-java/pull/678) Add `StripeException.getStripeError()` and `OAuthException.getOauthError()` accessors

## 7.21.0 - 2019-02-12
* [#648](https://github.com/stripe/stripe-java/pull/648) Add support for `transfer_data[destination]` on `Invoice` and `Subscription`.

## 7.20.0 - 2019-02-12
* [#670](https://github.com/stripe/stripe-java/pull/670) Add support for API version `2019-02-11` with changes to Payment Intents
  * `PaymentIntentSourceAction`, `PaymentIntentSourceActionValueAuthorizeWithUrl` and `next_source_action` are now depreacated. Use `PaymentIntent.NextAction`, `PaymentIntent.NextActionRedirectToUrl` and `next_action` instead.
  * `allowed_source_types` is now depreacated. Use `payment_method_types` instead.
* [#673](https://github.com/stripe/stripe-java/pull/673) Add support for `SubscriptionSchedule` and `SubscriptionScheduleRevision`. Also add support for `invoice_settings` on `Customer`.
* [#675](https://github.com/stripe/stripe-java/pull/675) The `customer` property is now expandable on `Invoice`.
* [#677](https://github.com/stripe/stripe-java/pull/677) Add support for `transfer_data[amount]` on `Charge`.

## 7.19.0 - 2019-02-06
* [#661](https://github.com/stripe/stripe-java/pull/661) Add configurable telemetry to gather information on client-side request latency

## 7.18.1 - 2019-02-04
* [#657](https://github.com/stripe/stripe-java/pull/657) Better handling of namespaced resources
* [#665](https://github.com/stripe/stripe-java/pull/665) Configure Gradle signing plugin to use gpg-agent

## 7.18.0 - 2019-01-25
* [#649](https://github.com/stripe/stripe-java/pull/649) Add support for `destination_payment_refund` and `source_refund` on the `Reversal` resource.

## 7.17.0 - 2019-01-17
* [#656](https://github.com/stripe/stripe-java/pull/656) Added `receipt_url` property to `Charge`.

## 7.16.0 - 2019-01-17
* [#653](https://github.com/stripe/stripe-java/pull/653) Add support for `custom_fields` and `footer` on `Invoice`.
* [#655](https://github.com/stripe/stripe-java/pull/655) Add support for billing thresholds.

## 7.15.0 - 2019-01-14
* [#652](https://github.com/stripe/stripe-java/pull/652) Add support for expandable `transfer_data[destination]` on `Charge` and `PaymentIntent`.

## 7.14.0 - 2019-01-11
* [#632](https://github.com/stripe/stripe-java/pull/632) Add support for `transfer_data` and `application_fee_amount` on `Charge` and `transfer_data[destination] on `PaymentIntent`.
* [#647](https://github.com/stripe/stripe-java/pull/647) Add support for deserializing `IssuerFraudRecord` in events.

## 7.13.0 - 2019-01-09
* [#626](https://github.com/stripe/stripe-java/pull/626) Add support for the `AccountLink` APIs.

## 7.12.0 - 2019-01-08
* [#634](https://github.com/stripe/stripe-java/pull/634) Add support for `wallet_provider` on `Issuing.Authorization`.

## 7.11.0 - 2018-12-27
* [#629](https://github.com/stripe/stripe-java/pull/629) Add support for `actionable` and `has_liability_shift` on `IssuerFraudRecord`

## 7.10.0 - 2018-11-28
* [#621](https://github.com/stripe/stripe-java/pull/621) Add missing properties on the `Refund` resource.
* [#623](https://github.com/stripe/stripe-java/pull/623) Add support for the `Review` APIs.

## 7.9.0 - 2018-11-27
* [#614](https://github.com/stripe/stripe-java/pull/614) Add support for `ValueList` and `ValueListItem` for Radar

## 7.8.0 - 2018-11-19
* [#616](https://github.com/stripe/stripe-java/pull/616) Add missing properties to a few resources:
  * Add `default_source` to `Invoice` and `Subscription`
  * Add `livemode` to Subscription
  * Add `metadata` and `subscription` to `SubscriptionItem`

## 7.7.0 - 2018-11-14
* [#615](https://github.com/stripe/stripe-java/pull/615) Add `last_payment_error` to `PaymentIntent`.

## 7.6.0 - 2018-11-09
* [#613](https://github.com/stripe/stripe-java/pull/613) Throw `ApiException` on malformed JSON responses
    - Previously, the library would throw `com.google.gson.JsonSyntaxException` in this case. We've chosen to release this as a minor update because we assume that most users are already catching Stripe exceptions.

## 7.5.0 - 2018-11-08
* [#604](https://github.com/stripe/stripe-java/pull/604) Add new API endpoints for the `Invoice` resource.

## 7.4.0 - 2018-11-08
* [#609](https://github.com/stripe/stripe-java/pull/609) Support new shape of the `PaymentIntent` resource.

## 7.3.0 - 2018-11-07
* [#610](https://github.com/stripe/stripe-java/pull/610) Add `flatAmount` to `Plan.Tier`
* [#611](https://github.com/stripe/stripe-java/pull/611) Add `supportedTransferCountries` to `CountrySpec`
* [#611](https://github.com/stripe/stripe-java/pull/611) Add `supportAddress` to `Account`

## 7.2.0 - 2018-10-31
* [#603](https://github.com/stripe/stripe-java/pull/603) Add support for the `Person` resource
* [#606](https://github.com/stripe/stripe-java/pull/606) Add support for the `WebhookEndpoint` resource

## 7.1.0 - 2018-10-10
* [#602](https://github.com/stripe/stripe-java/pull/602) Adds support for `partnerId` in `setAppInfo()`

## 7.0.0 - 2018-09-24
Major version release. Refer to our [migration guide for v7](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v7) for a list of backwards incompatible changes to watch out for.

Pull requests included in this release:
* [#598](https://github.com/stripe/stripe-java/pull/598) Compatibility with latest API version
* [#593](https://github.com/stripe/stripe-java/pull/593) Replace `FileUpload` class with `File` class
* [#592](https://github.com/stripe/stripe-java/pull/592) Support for terminal endpoints

## 6.12.0 - 2018-09-06
* [#586](https://github.com/stripe/stripe-java/pull/586) Add `invoicePrefix` to `Customer`

## 6.11.0 - 2018-09-05
* [#584](https://github.com/stripe/stripe-java/pull/584) Add support for reporting resources

## 6.10.0 - 2018-09-05
* [#583](https://github.com/stripe/stripe-java/pull/583) Add `exchangeRate` to `BalanceTransaction`

## 6.9.0 - 2018-08-29
* [#580](https://github.com/stripe/stripe-java/pull/580) Add missing attributes to `Account` and `LegalEntity`
* [#581](https://github.com/stripe/stripe-java/pull/581) Add `Topup.cancel()` overload with no arguments

## 6.8.0 - 2018-08-28
* [#577](https://github.com/stripe/stripe-java/pull/577) Update `Customer` and `Plan` models for API version [2018-08-23](https://stripe.com/docs/upgrades#2018-08-23)
* [#579](https://github.com/stripe/stripe-java/pull/579) Add `authorizationCode` to `Charge`

## 6.7.0 - 2018-08-27
* [#575](https://github.com/stripe/stripe-java/pull/575) Remove support for `BitcoinReceiver` write-actions

## 6.6.0 - 2018-08-23
* [#576](https://github.com/stripe/stripe-java/pull/576) Add support for usage record summaries

## 6.5.0 - 2018-08-16
* [#574](https://github.com/stripe/stripe-java/pull/574) Add `unitLabel` to `Product`

## 6.4.0 - 2018-08-14
* [#572](https://github.com/stripe/stripe-java/pull/572) Serialize all arrays/lists with integer-indexed encoding

## 6.3.0 - 2018-08-03
* [#568](https://github.com/stripe/stripe-java/pull/568) Add cancel support for topups
* [#569](https://github.com/stripe/stripe-java/pull/569) Add support for file links

## 6.2.1 - 2018-08-02
* [#567](https://github.com/stripe/stripe-java/pull/567) Use delomboked sources when creating sources JAR

## 6.2.0 - 2018-08-01
* [#565](https://github.com/stripe/stripe-java/pull/565) Add a `retrieve()` method that accepts parameters (e.g. for expansion) to all resource classes
* [#566](https://github.com/stripe/stripe-java/pull/566) Add `object` attribute and accessors to `StripeCollection`

## 6.1.0 - 2018-07-30
* [#561](https://github.com/stripe/stripe-java/pull/561) Add `created` to `Account`

## 6.0.0 - 2018-07-30
Major version release. Refer to our [migration guide for v6](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v6) for a list of backwards incompatible changes to watch out for.

Pull requests included in this release:
* [#532](https://github.com/stripe/stripe-java/pull/532) Remove deprecated methods
* [#534](https://github.com/stripe/stripe-java/pull/534) Only capitalize the first letter of acronyms per Google's style rules
* [#535](https://github.com/stripe/stripe-java/pull/535) Change signatures to throw StripeException
* [#538](https://github.com/stripe/stripe-java/pull/538) Change all integer types to `Long` and all floating point types to `Double`
* [#540](https://github.com/stripe/stripe-java/pull/540) Add support for idempotency errors
* [#541](https://github.com/stripe/stripe-java/pull/541) Minor fixes
* [#547](https://github.com/stripe/stripe-java/pull/547) Move nested objects into inner static classes
* [#553](https://github.com/stripe/stripe-java/pull/553) Remove `Deleted*` models and add `deleted` attribute instead
* [#558](https://github.com/stripe/stripe-java/pull/558) Use `BigDecimal` for floating point values

## 5.53.0 - 2018-07-28
* [#560](https://github.com/stripe/stripe-java/pull/560) Add support for scheduled query runs (`com.stripe.model.sigma.ScheduledQueryRun`) for Sigma

## 5.52.0 - 2018-07-26
* [#556](https://github.com/stripe/stripe-java/pull/556) Add `riskScore` property to `ChargeOutcome`
* [#557](https://github.com/stripe/stripe-java/pull/557) Add support for StripeIssuing

## 5.51.0 - 2018-07-12
* [#551](https://github.com/stripe/stripe-java/pull/551) Add `autoAdvance` property to `Invoice`

## 5.50.0 - 2018-07-11
* [#552](https://github.com/stripe/stripe-java/pull/552) Rename `ApplicationFee` to `ApplicationFeeAmount` on `PaymentIntent`

## 5.49.0 - 2018-07-06
* [#548](https://github.com/stripe/stripe-java/pull/548) Add `subscriptionItem` property to `InvoiceItem` and `InvoiceLineItem`

## 5.48.0 - 2018-07-03
* [#544](https://github.com/stripe/stripe-java/pull/544) Add support for streams when uploading files

## 5.47.0 - 2018-07-02
* [#546](https://github.com/stripe/stripe-java/pull/546) Add `setClientId()` to `RequestOptionsBuilder`

## 5.46.0 - 2018-06-29
* [#543](https://github.com/stripe/stripe-java/pull/543) Add support for payment intents

## 5.45.0 - 2018-06-28
* [#542](https://github.com/stripe/stripe-java/pull/542) Fix `account.application.*` event data deserialization issue

## 5.44.0 - 2018-06-27
* [#539](https://github.com/stripe/stripe-java/pull/539) Add `customerReference` and `shippingFromZip` properties on `ChargeLevel3` model

## 5.43.0 - 2018-06-25
* [#537](https://github.com/stripe/stripe-java/pull/537) Add `level3` property on `Charge` model

## 5.42.0 - 2018-06-19
* [#529](https://github.com/stripe/stripe-java/pull/529) Annotate a lot of methods as deprecated and flagged for removal in the next major release

## 5.41.1 - 2018-06-17
* [#528](https://github.com/stripe/stripe-java/pull/528) Add `name` to `Coupon` model

## 5.41.0 - 2018-06-14
* [#522](https://github.com/stripe/stripe-java/pull/522) Add `amountPaid`, `amountRemaining` and `billingReason` to `Invoice` model

## 5.40.0 - 2018-06-13
* [#521](https://github.com/stripe/stripe-java/pull/521) Add `documentBack` property to `LegalEntity` model

## 5.39.0 - 2018-06-07
* [#515](https://github.com/stripe/stripe-java/pull/515) Add `hosted_invoice_url` and `invoice_pdf` properties to `Invoice` model

## 5.38.0 - 2018-06-06
* [#516](https://github.com/stripe/stripe-java/pull/516) Add `active` property to `Plan` model

## 5.37.0 - 2018-06-06
* [#513](https://github.com/stripe/stripe-java/pull/513) Add `on_behalf_of` property on `Charge` model
* [#512](https://github.com/stripe/stripe-java/pull/512) Fix `update()` methods for `FeeRefund` and `Reversal`
* [#302](https://github.com/stripe/stripe-java/pull/302) The library now uses Project Lombok. All API resource classes now have `equals` and `hashCode` methods.

## 5.36.0 - 2018-05-09
* [#505](https://github.com/stripe/stripe-java/pull/505) Add support for issuer fraud records

## 5.35.1 - 2018-04-06
* [#498](https://github.com/stripe/stripe-java/pull/498) Fix two bugs found by Error Prone

## 5.35.0 - 2018-04-05
* [#462](https://github.com/stripe/stripe-java/pull/462) Add support for flexible billing primitives

## 5.34.1 - 2018-03-23
* [#469](https://github.com/stripe/stripe-java/pull/469) Add support for expanding `product` attribute on `Plan` model

## 5.34.0 - 2018-03-22
* [#459](https://github.com/stripe/stripe-java/pull/459) Add support for passing parameters to `autoPagingIterable()`
* [#466](https://github.com/stripe/stripe-java/pull/466) Fix serialization of null expandable attributes

## 5.33.3 - 2018-03-21
* [#464](https://github.com/stripe/stripe-java/pull/464) Add OSGi headers to manifest file

## 5.33.2 - 2018-02-28
* [#458](https://github.com/stripe/stripe-java/pull/458) Remove deprecation markers from `sourceTransaction` accessors on `Transfer` model

## 5.33.1 - 2018-02-27
* [#457](https://github.com/stripe/stripe-java/pull/457) Add title, version and vendor in JAR manifest file

## 5.33.0 - 2018-02-23
* [#455](https://github.com/stripe/stripe-java/pull/455) Add support for `code` attribute on all Stripe exceptions

## 5.32.0 - 2018-02-21
* [#453](https://github.com/stripe/stripe-java/pull/453) Add support for topups

## 5.31.0 - 2018-02-13
* [#446](https://github.com/stripe/stripe-java/pull/446) Add support for deserializing `source_mandate_notification` objects

## 5.30.0 - 2018-02-13
* [#449](https://github.com/stripe/stripe-java/pull/449) Add `Stripe.setAppInfo()` for passing custom application information in headers

## 5.29.0 - 2018-02-08
* [#447](https://github.com/stripe/stripe-java/pull/447) Update `Plan`, `Product` and `Subscription` models for latest API version

## 5.28.0 - 2018-01-02
* [#439](https://github.com/stripe/stripe-java/pull/439) Upgrade GSON dependency to 2.8.2

## 5.27.0 - 2017-12-22
* [#438](https://github.com/stripe/stripe-java/pull/438) Add support for passing parameters to `SubscriptionItem.delete()`

## 5.26.0 - 2017-12-18
* [#436](https://github.com/stripe/stripe-java/pull/436) Fix bug where `options` were not being plumbed through in an account delete method
* [#436](https://github.com/stripe/stripe-java/pull/436) Add the proper set of overloads for account reject method

## 5.25.0 - 2017-12-06
* [#432](https://github.com/stripe/stripe-java/pull/432) Make charge on `Dispute` expandable

## 5.24.0 - 2017-11-28
* [#421](https://github.com/stripe/stripe-java/pull/421) Expose response objects
* [#427](https://github.com/stripe/stripe-java/pull/427) Add `automatic` property on `Payout` model

## 5.23.1 - 2017-11-09
* [#423](https://github.com/stripe/stripe-java/pull/423) Fix JSON encoding for expandable fields by adding customer encoder

## 5.23.0 - 2017-10-31
* [#419](https://github.com/stripe/stripe-java/pull/419) Support for exchange rate APIs

## 5.22.1 - 2017-10-27
* [#418](https://github.com/stripe/stripe-java/pull/418) Move build and release system from Maven to Gradle

## 5.22.0 - 2017-10-27
* [#417](https://github.com/stripe/stripe-java/pull/417) Support for listing source transactions

## 5.21.0 - 2017-10-09
* [#410](https://github.com/stripe/stripe-java/pull/410) Rename "verification" to "code verification" for sources (should have been unused up to this point)
* [#412](https://github.com/stripe/stripe-java/pull/412) Add support for detaching sources from customers
* Note that some minor versions (5.11 through 5.20) were accidentally skipped for this release. I'm leaving as is to minimize churn, but please don't be alarmed!

## 5.10.0 - 2017-10-04
* Add `failure_reason` field to the source redirect flow model

## 5.9.1 - 2017-10-03
* No longer clobber global value of DNS cache TTL if it has not been set

## 5.9.0 - 2017-09-25
* Support Java 9 (just involves upgrading a few Maven plugins)

## 5.8.0 - 2017-08-31
* Add support for all OAuth actions

## 5.7.1 - 2017-07-11
* Force UTF-8 encoding for webhook signature verification

## 5.7.0 - 2017-07-11
* Use standard library comparison for webhook signature verification

## 5.6.0 - 2017-06-27
* `pay` on invoice can now take parameters

## 5.5.0 - 2017-06-23
* Add support for alternate statement descriptors on charge

## 5.4.0 - 2017-06-19
* Add support for ephemeral keys

## 5.3.0 - 2017-06-14
* Add missing expandable fields on every model

## 5.2.0 - 2017-06-09
* Support for expandable sources in balance transactions

## 5.1.0 - 2017-06-07
* Add `account` field to the event model

## 5.0.0 - 2017-05-31
* Clarify tolerance parameter for webhook signatures is in seconds
* Support expanded request in `Event` model (now with idempotency key)

## 4.9.1 - 2017-05-30
* This release should have been 5.0.0, see notes for that

## 4.9.0 - 2017-05-25
* This release should have been 5.0.0, see notes for that

## 4.8.0 - 2017-05-25
* Add support for account login links

## 4.7.0 - 2017-05-02
* Add `three_d_secure` accessors to `Card` model

## 4.6.0 - 2017-04-28
* Support for checking webhook signatures

## 4.5.0 - 2017-04-28
* Make connect and read timeouts configurable (see README for details)

## 4.4.0 - 2017-04-24
* Add payout properties to `Account` model

## 4.3.0 - 2017-04-12
* Add support for `available_payout_methods` to `Card` model

## 4.2.0 - 2017-04-06
* Add support for payouts; see: https://stripe.com/docs/upgrades#2017-04-06

## 4.1.0 - 2017-04-04
* Make `rule` under `ChargeOutcome` expandable

## 4.0.0 - 2017-03-13
* Dispute on charge becomes expandable field (not expanded by default)
* Charge on order becomes expandable field (not expanded by default)
* Customer on order becomes expandable field (not expanded by default)
* Add missing fields on order: `amountReturned`, `returns`, and `upstreamId`
* Fix type of `OrderReturnCollection` (now actually an order return)

## 3.11.0 - 2017-02-22
* Add new parameters for invoices and subscriptions

## 3.10.2 - 2017-02-21
* Add missing API resources to object deserializer

## 3.10.1 - 2017-02-21
* This release was inadvertently empty. See 3.10.2 for changes.

## 3.10.0 - 2017-02-13
* Deprecated sourced transfers under balance transactions

## 3.9.0 - 2017-02-02
* Add variant of account `delete` that doesn't require parameters

## 3.8.0 - 2017-01-23
* Add `ChargeOutcomeRule` to `ChargeOutcome`

## 3.7.0 - 2017-01-06
* Add `getObject`/`setObject` to a number of models where it was missing
* Add `toJson` method to `StripeObject`

## 3.6.0 - 2017-01-03
* Add non-public `network_reason_code` to `Dispute` model

## 3.5.0 - 2016-12-08
* Add expandable Charge to Invoice

## 3.3.0 - 2016-11-22
* Add retrieve method for 3-D Secure resources

## 3.2.0 - 2016-10-18
* Add `risk_level` attribute to `ChargeOutcome` model

## 3.1.0 - 2016-10-18
* Support for 403 status codes (permission denied)

## 3.0.0 - 2016-10-17
* Change representations of money (e.g. "amounts" or "balances") from `Integer` to `Long`

## 2.10.2 - 2016-10-13
* Fix NullPointerException in SourceDeserializer for bitcoin receivers, and refactor tests.

## 2.10.1 - 2016-10-06
* Fix bug where the Transfer transactions method wasn't using requestCollection

## 2.10.0 - 2016-09-16
* Add support for Apple Pay domains

## 2.9.0 - 2016-09-07
* Add `description`, `iin`, and `issuer` attributes to `Card` model

## 2.8.0 - 2016-08-05
* Add `Source` model (prototype)

## 2.7.0 - 2016-07-12
* Add `ThreeDSecure` model for 3-D secure payments

## 2.6.1 - 2016-06-13
* Fix serialization of `businessURL` and `supportURL` in `Account` model

## 2.6.0 - 2016-05-25
* Add support for returning Relay orders

## 2.5.1 - 2016-05-23
* Give all collection classes access to auto-paginating helpers that work beyond first page

## 2.5.0 - 2016-05-04
* Add `retrieve`, `update`, `create`, `all`, and `delete` methods to the Subscription class

## 2.4.0 - 2016-04-21
* Add many missing fields to many models (see #285 for details)

## 2.3.0 - 2016-04-18
* Add source types to `Money` model under the `Balance` model

## 2.2.0 - 2016-04-12
* Add `Outcome` to the `Charge` model

## 2.1.0 - 2016-04-12
* Deprecate `getUser` and `setUser` on `ApplicationFee`
* Deprecate `getCard` and `setCard` on `Charge`
* Deprecate `getAccount` and `setAccount` on `Transfer`
* Deprecate `getOtherTransfers` and `setOtherTransfers` on `Transfer`
* Deprecate `getSummary` and `setSummary` on `Transfer`

## 2.0.0 - 2016-04-08
* Change `getBusinessUrl` to `getBusinessURL` in `Account` model
* Change `getSupportUrl` to `getSupportURL` in `Account` model
* Change `getUrl` to `getURL` in `Product` model
* Change `setUrl` to `setURL` in `Product` model
* Change `getUrl` to `getURL` in `StripeCollection` model
* Change `setUrl` to `setURL` in `StripeCollection` model
* Remove previously-deprecated `getUrl` in `StripeCollectionAPIResource` model
* Change `getUrl` to `getURL` in `StripeCollectionInterface`

## 1.48.0 - 2016-03-29
* Add accessors for `default_currency` to `CountrySpec` model

## 1.47.0 - 2016-03-21
* Allow request params and options to be overridden for `autoPagingIterable`

## 1.46.0 - 2016-03-15
* Expose creating bank accounts on customer
* Add `reject` action on account

## 1.45.0 - 2016-02-18
* Add `CountrySpec` model for looking up country payment information

## 1.44.0 - 2016-02-11
* Add `businessTaxIdProvided` to `LegalEntity`

## 1.43.0 - 2016-01-26
* Add support for deleting Relay SKUs and products

## 1.42.0 - 2016-01-21
* Add `details_code` to `LegalEntity`
* Add `disabled_reason` to `Verification`

## 1.41.1 - 2016-01-15
* Fix serialization bug in `LegalEntity`'s `ssnLast4Provided`

## 1.41.0 - 2016-01-13
* Add lots of missing fields to Account, Event, and Refund

## 1.40.1 - 2016-01-07
* Fix casting of newer objects to *typed* models

## 1.40.0 - 2015-12-03
* Add missing `ShippingDetails` to `Customer` model

## 1.39.0 - 2015-12-01
* Add a verification routine for external accounts

## 1.38.1 - 2015-11-30
* Fix bug when using lazy-paging collection across multiple pages

## 1.38.0 - 2015-10-27
* Add pagination through the use of calling `AutoPagingIterable()` for a page
* Fix bug where arrays were not being properly encoded when sent to the API
* Fix bug where setting a `List` to `null` wasn't encoding to an empty string (which is required to unset an array)

## 1.37.1 - 2015-10-07
* Bugfix `setTransfer` on `Reversal`

## 1.37.0 - 2015-09-14
* Products, SKUs, and Orders -- https://stripe.com/relay

## 1.36.0 - 2015-09-11
* Add support for new rate limiting responses.

## 1.35.0 - 2015-08-31
* Add `bankAccount` to `Token`

## 1.34.0 - 2015-08-17
* Added `retrieve`, `all`, `update`, `create` methods to `Refund`

## 1.33.0 - 2015-08-03
* Added `retrieve`, `all`, `update` and `close` methods to `Dispute`
* Added `delete` method to managed `Account`s

## 1.32.1 - 2015-07-24
* Added `account` to `ApplicationFee`.

## 1.32.0 - 2015-07-06
* Added `getRequestId` method to `StripeException`.

## 1.31.0 - 2015-06-01
* `ConcretePaymentSource` and the `PaymentSource` interface have been combined into one `ExternalAccount` class
* `PaymentSourceCollection` was renamed `ExternalAccountCollection`
* `Account` now supports `getExternalAccounts`, which allows both `BankAccount` and `Card` attachment.
* `BankAccount`s can now be deleted from `Customer`s (private beta feature) and `Account`s

## 1.30.0 - 2015-05-28
* Add decline_code, charge to CardException

## 1.29.0 - 2015-05-21
* Added tax percent field to subscriptions
* Added tax and tax percent fields to invoices

## 1.28.0 - 2015-05-08
* Added support for Alipay accounts
* Added default source when type is unknown
* Added support dynamicLast4 on Card for Apple Pay integrations

## 1.27.1 - 2015-03-30
* Charge objects now support status

## 1.27.0 - 2015-02-19
* Added support for transfer reversals
* Added support for account creation/updating/retrieval by ID
* Customer objects now support currency
* Added STRIPE-ACCOUNT header options in RequestOptions

## 1.26.0 - 2015-02-19
* Added Update and Delete for Bitcoin Receivers
* Support new API version (2015-02-18) by providing source type properties
  on Customer and Charge in addition to card type properties

## 1.25.1 - 2015-01-23
* Test of new stripe-java release process.

## 1.25.0 - 2015-01-21
* Support making bitcoin charges through BitcoinReceiver source object

## 1.24.1 - 2015-01-05
* Support for fraud reporting methods was added

## 1.24.0 - 2014-12-18
* The ability to post multipart/form-data was added
* Requests can now hit different base endpoints, by passing in `apiBase` when creating URLs
* Support for the file upload endpoints was added. Documentation is available at https://stripe.com/docs/api#file_uploads
* Support for fraud reporting (marking charges as safe or fraudulent) was added

## 1.23.0 - 2014-12-08
* Java 1.5 support dropped. We strongly suggest using newer versions of Java due to runtime, VM, language, and syntax improvements
* Dispute Evidence has been updated to reflect the new version of Dispute evidence format introduced as part of api version 2014-12-08. See https://stripe.com/docs/upgrades#2014-12-08 for details

## 1.22.0 - 2014-12-03
* Convention is to call methods with a RequestOptions object, instead of an API Key directly
* Support setting the stripe version on a per-request level, via the RequestOptions object
* Add shipping and address to the charge object

### Deprecation

* All requests that involve passing the apiKey directly to the method are now deprecated in favor of using RequestOptions instead. Use RequestOptions as follows:

    RequestOptions.builder().setApiKey(apiKey).build()

## 1.21.0 - 2014-11-14
* Created Charge.receiptEmail field
* Created Charge.receiptNumber field

## 1.20.0 - 2014-11-06
* Change chargeEnabled to chargesEnabled
* Change transferEnabled to transfersEnabled
* Add id, currency, status, fingerprint, and defaultForCurrency to BankAccount

## 1.19.1 - 2014-10-02
* Add back explict autoboxing for Google App Engine reflected HTTP method (fixes issue #106)

## 1.19.0 - 2014-09-30
* Add statementDescription field to transfer
* A few non-breaking general cleanups

## 1.18.0 - 2014-08-25
* Added isChargeRefundable and balanceTransactions to Dispute https://stripe.com/docs/upgrades#2014-08-20

## 1.17.0 - 2014-08-19
* Added metadata to Coupons

## 1.16.0 - 2014-07-26
* Application Fee refunds now a list instead of array

## 1.15.1 - 2014-06-25
* Added brand and funding to Card

## 1.15.0 - 2014-06-17
* Added metadata to Refund
* Added metadata to Dispute
* Fixed incorrect return types for certain collection resources

## 1.14.1 - 2014-06-04
* Added metadata to Subscription

## 1.14.0 - 2014-05-28
* Add support for canceling transfers

## 1.13.1 - 2014-05-23
* Fix bug with retrieving lines of upcoming invoice.

## 1.13.0 - 2014-05-21
* Support cards for recipients.

## 1.12.0 - 2014-04-09
* Test SSL certificate against blacklist

## 1.11.0 - 2014-04-07
* Upgrade customer, charge, and coupon collections to new pagination style
* Add missing fields to Account object

## 1.10.0 - 2014-03-28
* Support for newstyle pagination API (https://groups.google.com/a/lists.stripe.com/forum/#!topic/api-announce/29sLxmICA9E)

## 1.9.0 - 2014-03-17
* Support for dynamic statement descriptions
* Preserve original 'threaqd null ids through to requests' behavior

## 1.8.0 - 2014-03-12
* Upgrade Google GSON to 2.2.4
* URL-encode object ids (fixes #62)

## 1.7.2 - 2014-02-27
* Add 'valid' field to coupon

## 1.7.1 - 2014-01-31
* Fix Subscription cancel method call
* Miscellaneous field fixups
    * Discount on Subscription is an expanded Discount, not string
    * Add missing application_fee_percent field on Subscription
    * Add missing application_fee field on Invoice

## 1.7.0 - 2014-01-29
* Add support for multiple subscriptions per customer

## 1.6.5 - 2014-01-22
* Fixed url to refund application fees (fixes #60)
* DRY'd some of the application fee urls

## 1.6.4 - 2014-01-16
* Added metadata to InvoiceItem and InvoiceLineItem (fixes #59)

## 1.6.3 - 2014-01-13
* Support overriding base url (for testing) (user request)
* Add default currency to Account object (fixes #46)
* Add metadata to plan object (thanks, desirable-objects)
* Remove plan from Customer (fixes #42)
* Style improvements (see #30) (thanks, steve-nester-uk)

## 1.6.2 - 2014-01-08
* Fix return type of Coupon.getRedeemBy

## 1.6.1 - 2013-12-02
* Add ApplicationFee API resource

## 1.5.1 - 2013-10-17
* Added field transfer_enabled to Account API object (thanks, kurguzov)

## 1.5.0 - 2013-10-01
* Add support for metadata API

## 1.4.2 - 2013-09-18
* Add support for closing disputes

## 1.4.1 - 2013-09-04
* Fix return type of CustomerCardCollection.retrieve

## 1.4.0 - 2013-09-03
* Tweak card create to align it with docs

## 1.3.2 - 2013-08-30
* Add missing `retrieve` method to `BalanceTransaction`
* Add missing fields to `BalanceTransaction`
    * `id`
    * `fee`
    * `fee_details`
    * `description`
* Add `id` field to `Subscription`

## 1.3.1 - 2013-08-21
* Patch release with missing field, added tests

## 1.3.0 - 2013-08-19
* Add BalanceTransaction API resource
* Add Refund resource
* Resource updates
    * Remove `fee`, `feeDetails` from Transfer and Charge resources
    * Add `balanceTransaction` to Transfer, Charge, and Dispute resources
    * Add `refunds` to Charge resource

## 1.2.8 - 2013-08-12
* Add support for unsetting attributes by updating with a null value. Setting properties to a blank string is now an error.

## 1.2.7 - 2013-07-31
* Enable createCard() to use a token

## 1.2.6 - 2013-07-30
* Add 'createCard' to Customer
* Update card collections bindings
* Parse card objects when receiving customer.card.created events

## 1.2.5 - 2013-07-15
* Add support for new cards API.
    * You will probably need to upgrade the Stripe API version on your account to 2013-07-05 or explicitly specify an API version with com.stripe.Stripe.apiVersion when you switch to this release of the bindings. More information about the relevant changes can be found at https://stripe.com/docs/upgrades#2013-07-05 and http://bit.ly/13miHM8
* Add a StripeRawJsonObject type for deserializing webhook events we don't recognize
* Add a Money class for representing account balances in individual currencies

## 1.2.4 - 2013-06-21
* Add more Balance API resource, and add to deserializer.

## 1.2.3 - 2013-05-7
* Rename BankAccount property `valid` to `validated`

## 1.2.2 - 2013-04-25
* Add more objects to Deserializer

## 1.2.1 - 2013-04-20
* Fix TransferTransaction fee retrieval

## 1.2.0 - 2013-04-11
* Allow Transfers to be creatable
* Add new Recipient resource

## 1.1.18 - 2013-03-19
* Add support for charge capture.

## 1.1.17 - 2013-02-18
* Add ability to deserialize account-related events.
* Add user ID to Event object.

## 1.1.16 - 2013-02-15
* Fix off-by-one error in deserializing events (github issue #27).

## 1.1.15 - 2013-02-01
* List all checked exceptions throws by methods.
* Add support for plan interval count.

## 1.1.14 - 2013-01-15
* Add support for setting Stripe API version override.

## 1.1.13 - 2012-12-29
* Add address_city to card
* Upgrade Google GSON to 2.2.2

## 1.1.12 - 2012-12-24
* Add option to provide custom URL handler

## 1.1.11 - 2012-11-17
* Explict cast to javax.net.ssl.HttpsURLConnection to prevent issues with user imports

## 1.1.10 - 2012-11-15
* Add currency to Invoice resource
* Add amountOff and currency to Coupon resource

## 1.1.9 - 2012-11-08
* Add new Dispute resource
* Add support for updating charge disputes

## 1.1.8 - 2012-10-30
* Add support for creating invoices
* Add support for new Invoice.lines return format

## 1.1.7 - 2012-10-15
* Add quantity to Subscription

## 1.1.6 - 2012-10-15
* Add Fee API resource, add feeDetails to Charge API resource.

## 1.1.5 - 2012-09-26
* Pass query parameters to DELETE-based methods when using Google App Engine (github issue #17)

## 1.1.4 - 2012-08-31
* Add update and pay methods for Invoice resource

## 1.1.3 - 2012-08-15
* Add the Account API resource

## 1.1.2 - 2012-08-06
* Allow specification of API key at the API call level

## 1.1.1 - 2012-05-24
* Use String.length() == 0 instead of String.isEmpty() for compatibility with JDK 1.5 (needed for Android 2.2)

## 1.1.0 - 2012-05-16
* Change type of cvcCheck, addressZipCheck, and addressLine1Check attributes on com.stripe.model.Card; values of those fields will be "pass", "fail", "unchecked", or null (github issue #11)
* Remove code and percentOff attributes from com.stripe.model.Discount. Stripe never returned these values for Discount objects, so they would previously always be null
* Add missing fields to Charge, Coupon, Discount, Event, and Invoice models (github issue #12)
* Include parameters passed to any object's delete method in actual API requests (github issue #10)
* Add new deleteDiscount method to com.stripe.model.Customer
* Switch from using HTTP Basic auth to Bearer auth. (Note: Stripe will support Basic auth for the indefinite future, but recommends Bearer auth when possible going forward)
* Numerous test suite improvements
