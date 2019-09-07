package com.homecredit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.homecredit.dto.ModuleDto;
import com.homecredit.repository.ModuleRepository;

/**
 * @author Nana Febriana
 */

@Component
public class ModuleDAO {

	@Autowired
	private ModuleRepository moduleRepository;

	public List<ModuleDto> fetchModuleListByUserDetailId(Long id) {
		List<ModuleDto> list = moduleRepository.fetchModuleListByUserDetailId(id);
		return list;
	}
}
