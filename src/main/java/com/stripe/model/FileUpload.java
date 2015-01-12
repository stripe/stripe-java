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

public class FileUpload extends APIResource {
	String id;
	Long created;
	Long size;
	String purpose;
	String url;
	String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static FileUpload create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static FileUpload retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
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
		return multipartRequest(RequestMethod.POST, classURL(FileUpload.class, Stripe.UPLOAD_API_BASE),
				params, FileUpload.class, options);
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
		return request(RequestMethod.GET, instanceURL(FileUpload.class, id, Stripe.UPLOAD_API_BASE),
				null, FileUpload.class, options);
	}
	
	public static FileUploadCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, (RequestOptions) null);
	}
	
	@Deprecated
	public static FileUploadCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static FileUploadCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, classURL(FileUpload.class, Stripe.UPLOAD_API_BASE),
				params, FileUploadCollection.class, options);
	}

}
