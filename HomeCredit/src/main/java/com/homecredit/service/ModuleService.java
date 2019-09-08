package com.homecredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecredit.dto.ModuleDto;
import com.homecredit.repository.ModuleRepository;

/**
 * @author Nana Febriana
 */

@Service
public class ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	public List<ModuleDto> fetchModuleListByUserDetailId(Long id) {
		List<ModuleDto> list = moduleRepository.fetchModuleListByUserDetailId(id);
		return list;
	}
}
