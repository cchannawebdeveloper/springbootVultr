package com.spring.boot.vultr.model;

public class ResultMessage {
	private String status;
	private String code;
	private String message;
	private String userInput;
	
	public ResultMessage() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultMessage(String status, String code) {
		this.status = status;
		this.code = code;
	}

	public ResultMessage(String status, String code, String message) {
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResultMessage [status=" + status + ", code=" + code + ", message=" + message + "]";
	}
	
	
	
	

}
