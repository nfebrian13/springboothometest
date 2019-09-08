package com.homecredit.dto.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Nana Febriana
 */

@JsonPropertyOrder({ "moduleName", "moduleOrder", "userDetailId" })
public class ModuleRequestDto {

	@JsonIgnore
	private long id;

	private String moduleName;
	private int moduleOrder;
	private Long userDetailId;

	public ModuleRequestDto() {
	}

	public ModuleRequestDto(long id, String moduleName, int moduleOrder,
			Long userDetailId) {
		this.id = id;
		this.moduleName = moduleName;
		this.moduleOrder = moduleOrder;
		this.userDetailId = userDetailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public ModuleRequestDto buildModule() {
		return new ModuleRequestDto(id, moduleName, moduleOrder, userDetailId);
	}
	
	public ModuleRequestDto detail() {
		ModuleRequestDto mdl = new ModuleRequestDto();
		mdl.setModuleName(this.moduleName);
		mdl.setModuleOrder(this.moduleOrder);
		mdl.setUserDetailId(this.userDetailId);
		return mdl;
	}

	
	
}