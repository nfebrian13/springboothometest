package com.homecredit.repository;

import com.homecredit.model.UserDetail;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Nana Febriana
 */

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, Long> {

	@Query(nativeQuery = true, value = "select * from user_detail where user_authentication_id=:username")
	UserDetail findByUsername(@Param("username") String username);
}
