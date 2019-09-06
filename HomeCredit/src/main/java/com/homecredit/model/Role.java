package com.homecredit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Nana Febriana
 */

@Entity
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String authority;

	@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	private Set<Authentication> users;

	public Role() {
	}

	public Role(String authority) {
		this.authority = authority;
	}

	public Long getId() {
		return id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Set<Authentication> getUsers() {
		return users;
	}

	public void setUsers(Set<Authentication> users) {
		this.users = users;
	}

	public void addUser(Authentication user) {
		Set<Role> roles = user.getRoles();
		
		if (roles == null) {
			roles = new HashSet<Role>();
			user.setRoles(roles);
		}
		
		roles.add(this);
		
		Set<Authentication> users = this.getUsers();
		
		if (users == null) {
			users = new HashSet<Authentication>();
			this.setUsers(users);
		}
		
		users.add(user);
	}
	
}