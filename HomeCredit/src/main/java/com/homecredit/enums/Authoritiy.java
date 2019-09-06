package com.homecredit.enums;

/**
 * @author Nana Febriana
 */

public enum Authoritiy {

	USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

	String authority;

	Authoritiy(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return authority;
	}

}