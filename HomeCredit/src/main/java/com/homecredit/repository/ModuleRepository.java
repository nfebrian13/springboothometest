package com.homecredit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecredit.model.Module;
import com.homecredit.dto.ModuleDto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Nana Febriana
 */

public interface ModuleRepository extends JpaRepository<Module, Integer> {

	@Query("SELECT new com.homecredit.dto.ModuleDto(d.moduleName, d.moduleOrder) "
			+ "FROM Module d LEFT JOIN d.userDetail e where e.id = :id order by d.moduleOrder asc")
	List<ModuleDto> fetchModuleListByUserDetailId(@Param("id") Long id);

}

