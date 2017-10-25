package com.amd.kenzan.exception;

public class ErrorResponse {

	private Integer errorCode;
	private String reason;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errcode) {
		this.errorCode = errcode;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}