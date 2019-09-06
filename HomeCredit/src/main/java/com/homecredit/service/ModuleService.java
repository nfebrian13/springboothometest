package com.homecredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecredit.dao.ModuleDAO;
import com.homecredit.dto.ModuleDto;

@Service
public class ModuleService {

	@Autowired
	private ModuleDAO employeeDao;

	public List<ModuleDto> fetchModuleListById(Long id) {
		List<ModuleDto> list = employeeDao.fetchModuleListById(id);
		return list;
	}
}
