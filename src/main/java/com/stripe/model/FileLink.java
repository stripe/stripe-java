package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FileLink extends ApiResource implements MetadataStore<FileLink>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  Boolean expired;
  Long expiresAt;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<File> file;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String url;

  // <editor-fold desc="file">
  public String getFile() {
    return (this.file != null) ? this.file.getId() : null;
  }

  public void setFile(String fileId) {
    this.file = setExpandableFieldId(fileId, this.file);
  }

  public File getFileObject() {
    return (this.file != null) ? this.file.getExpanded() : null;
  }

  public void setFileObject(File file) {
    this.file = new ExpandableField<File>(file.getId(), file);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a file link.
   */
  public static FileLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a file link.
   */
  public static FileLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(FileLink.class), params, FileLink.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all file links.
   */
  public static FileLinkCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all file links.
   */
  public static FileLinkCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(FileLink.class), params, FileLinkCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a file link.
   */
  public static FileLink retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a file link.
   */
  public static FileLink retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a file link.
   */
  public static FileLink retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(FileLink.class, id), params, FileLink.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a file link.
   */
  @Override
  public FileLink update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a file link.
   */
  @Override
  public FileLink update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(FileLink.class, this.id), params, FileLink.class,
        options);
  }
  // </editor-fold>
}
