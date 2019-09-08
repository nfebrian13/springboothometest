package com.homecredit.repository;

import com.homecredit.model.Module;
import com.homecredit.dto.ModuleDto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Nana Febriana
 */

@Repository
public interface ModuleRepository extends CrudRepository<Module, Long> {

	@Query("SELECT new com.homecredit.dto.ModuleDto(d.moduleName, d.moduleOrder) "
			+ "FROM Module d LEFT JOIN d.userDetail e where e.id = :id order by d.moduleOrder asc")
	List<ModuleDto> fetchModuleListByUserDetailId(@Param("id") Long id);

}

