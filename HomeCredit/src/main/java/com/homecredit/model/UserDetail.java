package com.homecredit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Nana Febriana
 */

@Entity
public class UserDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_authentication_id")
	private Authentication authentication;

	@OneToMany(targetEntity = Module.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Module> modules;

	public UserDetail() {
	}

	public UserDetail(String name, int age, String username, String password,
			Set<Role> roles) {
		this.name = name;
		this.age = age;
		this.authentication = new Authentication(username, password, roles);
	}

	public UserDetail(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
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

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}