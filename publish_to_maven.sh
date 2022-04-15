mvn gpg:sign-and-deploy-file "--batch-mode" \
    -DpomFile=pom-default.xml \
    -Dfile=stripe-java-$(VERSION).jar \
    -Djavadoc="$javadocOption" \
    -Dsources"$sourcesOption" \
    -Dfiles="$filesOption" \
    -Dclassifiers $classifiersOption \
    -Dtypes"$typesOption" \
    -Durl=https://oss.sonatype.org/service/local/staging/deploy/maven2 \
    "-DrepositoryId=ossrh" \
    "--settings=$PSScriptRoot\..\maven.publish.settings.xml"
