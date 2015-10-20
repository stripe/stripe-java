package com.stripe;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class DocumentationTest {

	@Test
	public void testVersionAgreesWithVERSIONFile() throws IOException {
		File versionFile = new File("VERSION").getAbsoluteFile();
		Assert.assertTrue(String.format("Expected VERSION file to exist, but it doesn't. (path is %s).", versionFile.getAbsolutePath()), versionFile.exists());
		Assert.assertTrue(String.format("Expected VERSION to be a file, but it doesn't. (path is %s).", versionFile.getAbsolutePath()), versionFile.isFile());
		BufferedReader reader = new BufferedReader(new FileReader(versionFile));
		String firstLine = reader.readLine();
		Assert.assertEquals(firstLine, Stripe.VERSION);
	}

	private static String formatDateTime() {
		Calendar instance = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = format.format(instance.getTime());
		String result = "=== " + Stripe.VERSION + " " + formattedDate;
		return result;
	}

	@Test
	public void testChangeLogContainsStaticVersion() throws IOException {
		File changelogFile = new File("CHANGELOG").getAbsoluteFile();
		Assert.assertTrue(String.format("Expected CHANGELOG file to exist, but it doesn't. (path is %s).", changelogFile.getAbsolutePath()), changelogFile.exists());
		Assert.assertTrue(String.format("Expected CHANGELOG to be a file, but it doesn't. (path is %s).", changelogFile.getAbsolutePath()), changelogFile.isFile());
		BufferedReader reader = new BufferedReader(new FileReader(changelogFile));
		String expectedLine = formatDateTime();
		String line;
		List<String> closeMatches = new LinkedList<String>();
		while ((line = reader.readLine()) != null) {
			if (line.contains(Stripe.VERSION)) {
				if (Pattern.matches(String.format("^=== %s 20[12][0-9]-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$", Stripe.VERSION), line)) {
					return;
				}
				closeMatches.add(line);
			}
		}
		Assert.fail(String.format("Expected a line of the format '%s' in the CHANGELOG, but didn't find one.%nThe following lines were close, but didn't match exactly:%n'%s'", expectedLine, Joiner.on(", ").join(closeMatches)));
	}

	@Test
	public void testReadMeContainsMavenPomThatMatches() throws IOException {
		// this will be very flaky, but we want to ensure that the readme is correct.
		File readmeFile = new File("README.md").getAbsoluteFile();
		Assert.assertTrue(String.format("Expected README.md file to exist, but it doesn't. (path is %s).", readmeFile.getAbsolutePath()), readmeFile.exists());
		Assert.assertTrue(String.format("Expected README.md to be a file, but it doesn't. (path is %s).", readmeFile.getAbsolutePath()), readmeFile.isFile());
		BufferedReader reader = new BufferedReader(new FileReader(readmeFile));
		int expectedMentionsOfVersion = 2;
		// Currently two places mention the Stripe version: the sample pom and gradle files.
		String line;
		List<String> mentioningLines = new LinkedList<String>();
		while ((line = reader.readLine()) != null) {
			if (line.contains(Stripe.VERSION)) {
				mentioningLines.add(line);
			}
		}
		String message = String.format("Expected %d mentions of the stripe-java version in the Readme, but found %d:%n%s", expectedMentionsOfVersion, mentioningLines.size(), Joiner.on(", ").join(mentioningLines));
		Assert.assertSame(message, expectedMentionsOfVersion, mentioningLines.size());
	}

	@Test
	public void testPomContainsVersionThatMatches() throws IOException {
		// we want to ensure that the pom's version matches the static version.
		File readmeFile = new File("pom.xml").getAbsoluteFile();
		Assert.assertTrue(String.format("Expected pom.xml file to exist, but it doesn't. (path is %s).", readmeFile.getAbsolutePath()), readmeFile.exists());
		Assert.assertTrue(String.format("Expected pom.xml to be a file, but it doesn't. (path is %s).", readmeFile.getAbsolutePath()), readmeFile.isFile());
		BufferedReader reader = new BufferedReader(new FileReader(readmeFile));
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.contains(Stripe.VERSION)) {
				return;
			}
		}
		Assert.fail(String.format("Expected the Stripe.VERSION (%s) to match up with the one listed in the pom.xml file. It wasn't found.", Stripe.VERSION));
	}
}
