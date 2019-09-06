package com.homecredit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.homecredit.dto.ModuleDto;
import com.homecredit.repository.ModuleRepository;

@Component
public class ModuleDAO {

	@Autowired
	private ModuleRepository employeeRepository;

	public List<ModuleDto> fetchModuleListById(Long id) {
		List<ModuleDto> list = employeeRepository.fetchModuleListById(id);
		return list;
	}
}
