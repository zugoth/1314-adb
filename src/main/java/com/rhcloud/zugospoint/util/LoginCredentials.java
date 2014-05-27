package com.rhcloud.zugospoint.util;

public final class LoginCredentials {
	
	private String url;
	
	private String username;

	private String password;
	
	public static final LoginCredentials loginCredentials = new LoginCredentials();
	
	private LoginCredentials(){
		this.url = null;
		this.password = null;
		this.username = null;
	}

	public static String getUrl() {
		return loginCredentials.url;
	}

	public static void setUrl(String url) {
		loginCredentials.url = url;
	}

	public static String getUsername() {
		return loginCredentials.username;
	}

	public static void setUsername(String username) {
		loginCredentials.username = username;
	}

	public static String getPassword() {
		return loginCredentials.password;
	}

	public static void setPassword(String password) {
		loginCredentials.password = password;
	}
	
	

}
