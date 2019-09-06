package com.homecredit.dto.entity.user;

import java.util.List;

/**
 * @author Nana Febriana
 */

public class UserList {

	public List<UserDto> userList;

	public UserList() {
	}

	public UserList(List<UserDto> userList) {
		this.userList = userList;
	}

	public List<UserDto> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDto> userList) {
		this.userList = userList;
	}

}