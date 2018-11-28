package com.stripe;

import com.stripe.model.EphemeralKey;
import com.stripe.model.EphemeralKeyDeserializer;
import com.stripe.model.Event;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.EventRequest;
import com.stripe.model.EventRequestDeserializer;
import com.stripe.model.ExpandableField;
import com.stripe.model.ExpandableFieldDeserializer;
import com.stripe.model.ExpandableFieldSerializer;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.PagingIterable;
import com.stripe.model.PagingIterator;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeCollectionInterface;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;
import com.stripe.model.oauth.DeauthorizedAccount;
import com.stripe.model.oauth.TokenResponse;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;

public class AutogenPreparation {

  /**
   * Remove files in preparation for generated code.
   */
  public static void main(String[] arg) throws IOException {

    Path modelPath = Paths.get("src/main/java/com/stripe/model");
    Class<?>[] classNotToDelete = {
        // Excluded from generation
        Event.class,
        EventRequest.class,
        EventData.class,

        // Ephemeral key has to be manually maintained
        // because it is making request on behalf on its mobile client
        // -- using the client's Stripe-version, and returning raw JSON to the client.
        // The fields defined in this model thus have to always be backward-compatible,
        EphemeralKey.class,
        EphemeralKey.AssociatedObject.class,

        // File has custom logic of making multi-part request
        com.stripe.model.File.class,


        // Oauth
        DeauthorizedAccount.class,
        TokenResponse.class,

        // Dependencies of the excluded classes
        EventDataDeserializer.class,
        EventRequestDeserializer.class,
        EphemeralKeyDeserializer.class,

        ExpandableField.class,
        ExpandableFieldDeserializer.class,
        ExpandableFieldSerializer.class,

        HasId.class,
        MetadataStore.class,
        PagingIterable.class,
        PagingIterator.class,

        StripeCollection.class,
        StripeObject.class,
        StripeCollectionInterface.class,
        StripeRawJsonObject.class,
        StripeRawJsonObjectDeserializer.class
    };


    final Set<String> classToAvoidDelete = new HashSet<>();
    for (Class<?> clazz : classNotToDelete) {
      classToAvoidDelete.add(clazz.getSimpleName() + ".java");
    }

    // Remove classes that will be in conflict
    FileVisitor<Path> fileVisitor = new SimpleFileVisitor<Path>() {
      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (!classToAvoidDelete.contains(file.getFileName().toString())) {
          file.toFile().deleteOnExit();
        }
        return FileVisitResult.CONTINUE;
      }
    };

    Files.walkFileTree(modelPath, fileVisitor);
  }
}
