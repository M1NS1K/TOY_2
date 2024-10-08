package com.springweb.study.exception;

/**
 * 잘못된 요청 오류
 */
public class BadRequestException extends RuntimeException {
	public BadRequestException() {
		super();
	}

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadRequestException(Throwable cause) {
		super(cause);
	}

	protected BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
