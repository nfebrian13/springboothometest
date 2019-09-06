package com.homecredit.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.homecredit.model.Role;
import com.homecredit.model.UserDetail;
import com.homecredit.dto.entity.user.AuthenticationDto;
import com.homecredit.dto.entity.user.UserCountDto;
import com.homecredit.dto.entity.user.UserDto;
import com.homecredit.dto.entity.user.UserList;
import com.homecredit.enums.Authoritiy;
import com.homecredit.repository.RoleRepository;
import com.homecredit.repository.UserDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nana Febriana
 */

@Service
public class UserManagedService {
	@Autowired
	private UserDetailRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	public UserCountDto count() {
		return new UserCountDto(userRepository.count());
	}

	public UserList findAllUsers() {
		Iterable<UserDetail> users = userRepository.findAll();

		if (users == null) {
			return new UserList();
		}

		List<UserDto> dtos = new ArrayList<UserDto>();
		for (UserDetail user : users) {
			dtos.add(new UserDto(user));
		}
		return new UserList(dtos);
	}

	public UserDto findById(long id) {
		UserDetail user = userRepository.findOne(id);
		UserDto userDto = null;
		if (user != null) {
			userDto = new UserDto(user);
		}
		return userDto;
	}

	public void saveUser(AuthenticationDto userDto) {
		Set<Role> roles = new HashSet<Role>();
		for (Authoritiy authoritiy : userDto.getAuthorites()) {
			roles.add(roleRepository.findByAuthority(authoritiy.getAuthority()));
		}
		userRepository.save(userDto.buildUser(roles));
	}

	public void updateUser(UserDto currentUser, UserDto user) {
		currentUser.setName(user.getName());
		currentUser.setAge(user.getAge());
		userRepository.save(currentUser.buildUser());
	}

	public void deleteUserById(long id) {
		userRepository.delete(id);
	}

	public UserDto findByUsername(String username) {
		return new UserDto(userRepository.findByUsername(username));
	}

	public void deleteAllUsers() {
		userRepository.deleteAll();
	}
}
