package com.homecredit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.homecredit.dto.ApiResult;
import com.homecredit.service.ModuleService;

/**
 * @author Nana Febriana
 */

@RestController
@RequestMapping("/module")
public class ModuleController {

	private static final Logger logger = LogManager.getLogger(ModuleController.class);

	@Autowired
	private ModuleService joinQueryService;

	@GetMapping("/user/{id}")
	public ApiResult getDeptEmployeesCrossJoinById(@PathVariable(value = "id") Long id) {
		
		ApiResult apiResult = new ApiResult();
		
		try {

			if (logger.isDebugEnabled()) {
				logger.debug("Hello ", joinQueryService.fetchModuleListById(id));
				apiResult.setmodules(joinQueryService.fetchModuleListById(id));
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		return apiResult;

	}

}
