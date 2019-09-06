package com.homecredit.dto;

public class ApiResult {

	protected Object modules = "";

	public ApiResult() {
	}

	public ApiResult(Object modules) {
		this.modules = modules;
	}

	public Object getmodules() {
		return modules;
	}

	public void setmodules(Object modules) {
		this.modules = modules;
	}
}
