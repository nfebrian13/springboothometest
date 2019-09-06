package com.homecredit.repository;

import com.homecredit.model.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nana Febriana
 */

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	Role findByAuthority(String authority);
	
}