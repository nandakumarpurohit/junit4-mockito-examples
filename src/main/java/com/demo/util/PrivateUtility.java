package com.demo.util;

public class PrivateUtility {
	
	private String privateMethod(String message) {
		return message;
	}

	public String callPrivateMethod(String message) {
		return privateMethod(message);
	}
}
