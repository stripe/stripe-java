package com.stripe.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLConnection;
import java.util.Random;

import lombok.Cleanup;

public class MultipartProcessor {
  private final String boundary;
  private static final String LINE_BREAK = "\r\n";
  private OutputStream outputStream;
  private PrintWriter writer;

  /**
   * Generates a random MIME multipart boundary.
   *
   * @return boundary value
   */
  public static String getBoundary() {
    Random random = new Random();
    Long positiveRandomLong = Math.abs(random.nextLong());
    return String.valueOf(positiveRandomLong);
  }

  /**
   * Constructs a new multipart body builder.
   */
  public MultipartProcessor(java.net.HttpURLConnection conn, String boundary, String charset)
      throws IOException {
    this.boundary = boundary;

    this.outputStream = conn.getOutputStream();
    this.writer = new PrintWriter(new OutputStreamWriter(outputStream, charset), true);
  }

  /**
   * Adds a form field to the multipart message.
   *
   * @param name field name
   * @param value field value
   */
  public void addFormField(String name, String value) {
    writer.append("--" + boundary).append(LINE_BREAK);
    writer.append("Content-Disposition: form-data; name=\"" + name + "\"")
        .append(LINE_BREAK);
    writer.append(LINE_BREAK);
    writer.append(value).append(LINE_BREAK);
    writer.flush();
  }

  /**
   * Adds a file field to the multipart message.
   *
   * @param name field name
   * @param file File instance
   */
  public void addFileField(String name, File file) throws IOException {
    String fileName = file.getName();
    writer.append("--" + boundary).append(LINE_BREAK);
    writer.append(
        "Content-Disposition: form-data; name=\"" + name
            + "\"; filename=\"" + fileName + "\"").append(
        LINE_BREAK);

    String probableContentType = URLConnection.guessContentTypeFromName(fileName);
    writer.append("Content-Type: " + probableContentType).append(LINE_BREAK);
    writer.append("Content-Transfer-Encoding: binary").append(LINE_BREAK);
    writer.append(LINE_BREAK);
    writer.flush();

    @Cleanup FileInputStream inputStream = new FileInputStream(file);
    byte[] buffer = new byte[4096];
    int bytesRead = -1;
    while ((bytesRead = inputStream.read(buffer)) != -1) {
      outputStream.write(buffer, 0, bytesRead);
    }
    outputStream.flush();

    writer.append(LINE_BREAK);
    writer.flush();
  }

  /**
   * Adds the final boundary to the multipart message and closes streams.
   */
  public void finish() throws IOException {
    writer.append("--" + boundary + "--").append(LINE_BREAK);
    writer.flush();
    writer.close();
    outputStream.flush();
    outputStream.close();
  }
}
