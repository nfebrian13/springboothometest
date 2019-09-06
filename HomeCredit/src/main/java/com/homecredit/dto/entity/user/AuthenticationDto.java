package com.homecredit.dto.entity.user;

import java.util.Set;

import com.homecredit.model.Role;
import com.homecredit.model.UserDetail;
import com.homecredit.enums.Authoritiy;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Nana Febriana
 */

@JsonPropertyOrder({ "name", "age", "username", "password" })
public class AuthenticationDto {

	private String name;

	private int age;

	private String username;
	private String password;
	private Set<Authoritiy> authorites;

	public AuthenticationDto() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Authoritiy> getAuthorites() {
		return authorites;
	}

	public void setAuthorites(Set<Authoritiy> authorites) {
		this.authorites = authorites;
	}

	public UserDetail buildUser(Set<Role> roles) {
		return new UserDetail(name, age, username, password, roles);
	}

	public UserDto detail() {
		UserDto user = new UserDto();
		user.setAge(this.getAge());
		user.setName(this.getName());
		return user;
	}
}