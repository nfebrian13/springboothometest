package com.homecredit.dto.entity.user;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Nana Febriana
 */

@JsonPropertyOrder({ "moduleName", "moduleOrder", "userDetailId" })
public class ModuleDto {

	private String moduleName;
	private int moduleOrder;
	private Long userDetailId;

	public ModuleDto() {
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getModuleOrder() {
		return moduleOrder;
	}

	public void setModuleOrder(int moduleOrder) {
		this.moduleOrder = moduleOrder;
	}

	public Long getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(Long userDetailId) {
		this.userDetailId = userDetailId;
	}

}