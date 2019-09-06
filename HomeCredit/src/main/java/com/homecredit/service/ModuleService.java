package com.homecredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecredit.dao.ModuleDAO;
import com.homecredit.dto.ModuleDto;

/**
 * @author Nana Febriana
 */

@Service
public class ModuleService {

	@Autowired
	private ModuleDAO moduleDao;

	public List<ModuleDto> fetchModuleListById(Long id) {
		List<ModuleDto> list = moduleDao.fetchModuleListById(id);
		return list;
	}
}
