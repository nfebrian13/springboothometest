package com.homecredit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecredit.dto.ApiResult;
import com.homecredit.service.ModuleService;

@RestController
@RequestMapping("/module")
public class ModuleController {

	@Autowired
	private ModuleService joinQueryService;

	@GetMapping("/user/{id}")
	public ApiResult getDeptEmployeesCrossJoinById(@PathVariable(value = "id") Long id) {
		ApiResult apiResult = new ApiResult();
		try {
			apiResult.setmodules(joinQueryService.fetchModuleListById(id));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return apiResult;
	}
}
