package com.homecredit.dto;

public class ModuleDto {

	private String moduleName;
	private int moduleOrder;

	public ModuleDto(String moduleName, int moduleOrder) {
		this.moduleName = moduleName;
		this.moduleOrder = moduleOrder;		
	}
	public String getmoduleName() {
		return moduleName;
	}
	public void setmoduleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getmoduleOrder() {
		return moduleOrder;
	}
	public void setmoduleOrder(int moduleOrder) {
		this.moduleOrder = moduleOrder;
	}
	
	@Override
	public String toString() {
		return "DeptEmpDto [moduleName=" + moduleName + ", moduleOrder=" + moduleOrder + "]";
	}
}
