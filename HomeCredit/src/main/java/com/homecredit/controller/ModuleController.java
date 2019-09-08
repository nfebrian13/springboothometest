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
import com.homecredit.service.UserManagedService;

/**
 * @author Nana Febriana
 */

@RestController
@RequestMapping("/user")
public class ModuleController {

	private static final Logger logger = LogManager
			.getLogger(ModuleController.class);

	@Autowired
	private ModuleService moduleService;
	
	@Autowired
	private UserManagedService userDetailService;

	@GetMapping("/module/{id}")
	public ApiResult getModuleListByUserDetailId(
			@PathVariable(value = "id") Long id) {

		ApiResult apiResult = new ApiResult();

		try {

			if (logger.isDebugEnabled()) {
				logger.debug("Hello ",
						moduleService.fetchModuleListByUserDetailId(id));
				apiResult.setmodules(moduleService
						.fetchModuleListByUserDetailId(id));
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		return apiResult;

	}

}
