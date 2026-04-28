// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2ExtendExtensionRunFailedEvent extends Event {
  /** Data for the v2.extend.extension_run.failed event. */
  @SerializedName("data")
  V2ExtendExtensionRunFailedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Details about the error that occurred. */
    @SerializedName("error")
    Errors error;
    /** Details about the extension that failed. */
    @SerializedName("extension")
    Extension extension;
    /** The ID of the extension run that failed. */
    @SerializedName("extension_run_id")
    String extensionRunId;

    public static final class Errors {
      /** URL to the extension run in Workbench for deeper debugging. */
      @SerializedName("debug_url")
      String debugUrl;
      /** Detailed error message. */
      @SerializedName("message")
      String message;
    }

    public static final class Extension {
      /** The extension's unique identifier. */
      @SerializedName("id")
      String id;
      /** The extension method called where the failure occurred. */
      @SerializedName("method")
      String method;
      /** Human-readable name of the extension. */
      @SerializedName("name")
      String name;
      /** Version of the extension that failed. */
      @SerializedName("version")
      String version;
    }
  }
}
