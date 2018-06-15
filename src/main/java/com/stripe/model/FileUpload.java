package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FileUpload extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String purpose;
  Long size;
  String type;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) String url;

  // <editor-fold desc="url">
  public String getURL() {
    return url;
  }

  public void setURL(String url) {
    this.url = url;
  }
  // </editor-fold>

  public static FileUpload create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static FileUpload create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    RequestOptions options = RequestOptions.builder().setApiKey(apiKey).build();
    return create(params, options);
  }

  public static FileUpload create(Map<String, Object> params,
                  RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return multipartRequest(RequestMethod.POST, classURL(FileUpload.class, Stripe.getUploadBase()),
        params, FileUpload.class, options);
  }

  public static FileUpload retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static FileUpload retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    RequestOptions options = RequestOptions.builder().setApiKey(apiKey).build();
    return retrieve(id, options);
  }

  public static FileUpload retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(FileUpload.class, id, Stripe.getUploadBase()),
        null, FileUpload.class, options);
  }

  public static FileUploadCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static FileUploadCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(FileUpload.class, Stripe.getUploadBase()),
        params, FileUploadCollection.class, options);
  }

  @Deprecated
  public static FileUploadCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static FileUploadCollection all(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static FileUploadCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, options);
  }

}
