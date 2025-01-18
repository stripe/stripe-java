set quiet

import? '../sdk-codegen/utils.just'

_default:
    just --list --unsorted

# ⭐ run the whole test suite
[no-exit-message]
test *args:
    ./gradlew test {{ args }}

# run a single test
test-one modelPath: (test "--tests" modelPath)

# ⭐ format all files
[no-exit-message]
format:
    ./gradlew spotlessApply

# check, but don't change, the formatting
[no-exit-message]
format-check:
    ./gradlew spotlessCheck

# called by tooling
[private]
update-version version:
    echo "{{ version }}" > VERSION
    perl -pi -e 's|badge/maven--central-v[.\d\-\w]+-blue|badge/maven--central-v{{ version }}-blue|' README.md
    perl -pi -e 's|https:\/\/search\.maven\.org\/remotecontent\?filepath=com\/stripe\/stripe-java\/[.\d\-\w]+\/stripe-java-[.\d\-\w]+.jar|https://search.maven.org/remotecontent?filepath=com/stripe/stripe-java/{{ version }}/stripe-java-{{ version }}.jar|' README.md
    perl -pi -e 's|implementation "com\.stripe:stripe-java:[.\d\-\w]+"|implementation "com.stripe:stripe-java:{{ version }}"|' README.md
    perl -pi -e 's|<version>[.\d\-\w]+<\/version>|<version>{{ version }}</version>|' README.md
    perl -pi -e 's|VERSION_NAME=[.\d\-\w]+|VERSION_NAME={{ version }}|' gradle.properties
    perl -pi -e 's|public static final String VERSION = "[.\d\-\w]+";|public static final String VERSION = "{{ version }}";|' src/main/java/com/stripe/Stripe.java
