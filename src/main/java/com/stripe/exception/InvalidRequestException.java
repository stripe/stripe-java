package com.stripe.exception;

public class InvalidRequestException extends StripeException {
	private static final long serialVersionUID = 2L;

	private final String param;

	/**
	 * @deprecated Use new constructor with `code` argument instead.
	 */
	@Deprecated
	// TODO: remove this constructor in next major version bump
	public InvalidRequestException(String message, String param, String requestId, Integer statusCode, Throwable e) {
		this(message, param, requestId, null, statusCode, e);
	}

	public InvalidRequestException(String message, String param, String requestId, String code, Integer statusCode, Throwable e) {
		super(message, requestId, code, statusCode, e);
		this.param = param;
	}

	public String getParam() {
		return param;
	}
}
