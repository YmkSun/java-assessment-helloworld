package com.question5.helloworld.dto;

public class HelloWorldDTO {
	
	private String message;
	
	public HelloWorldDTO() {}

	public HelloWorldDTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
