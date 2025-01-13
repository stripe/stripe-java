# NOTE: this file is deprecated and slated for deletion; prefer using the equivalent `just` commands.

.PHONY: update-version codegen-format
update-version:
	@echo "$(VERSION)" > VERSION
	@perl -pi -e 's|badge/maven--central-v[.\d\-\w]+-blue|badge/maven--central-v$(VERSION)-blue|' README.md
	@perl -pi -e 's|https:\/\/search\.maven\.org\/remotecontent\?filepath=com\/stripe\/stripe-java\/[.\d\-\w]+\/stripe-java-[.\d\-\w]+.jar|https://search.maven.org/remotecontent?filepath=com/stripe/stripe-java/$(VERSION)/stripe-java-$(VERSION).jar|' README.md
	@perl -pi -e 's|implementation "com\.stripe:stripe-java:[.\d\-\w]+"|implementation "com.stripe:stripe-java:$(VERSION)"|' README.md
	@perl -pi -e 's|<version>[.\d\-\w]+<\/version>|<version>$(VERSION)</version>|' README.md
	@perl -pi -e 's|VERSION_NAME=[.\d\-\w]+|VERSION_NAME=$(VERSION)|' gradle.properties
	@perl -pi -e 's|public static final String VERSION = "[.\d\-\w]+";|public static final String VERSION = "$(VERSION)";|' src/main/java/com/stripe/Stripe.java

codegen-format:
	./gradlew spotlessApply

test:
	./gradlew test

ci-test:
	./gradlew test
