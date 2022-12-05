package com.java.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.java.service.UserAuthentication;

public class Tester {
	private static final Log LOGGER = LogFactory.getLog(Tester.class);
	public static void main(String[] args) {
		try {
			UserAuthentication authentication = new UserAuthentication();
			authentication.loginUser("Jon", "Asdf@123");
			LOGGER .info("User has logged in successfully");
		} catch(Exception exception) {
			LOGGER .info(exception.getMessage());
		}
	}
}