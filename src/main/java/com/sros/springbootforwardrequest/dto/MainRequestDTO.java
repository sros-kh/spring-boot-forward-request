package com.sros.springbootforwardrequest.dto;

import java.util.Map;

public class MainRequestDTO {

	private String serviceId;
	private String step;
	private Map<String, Object> data;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

}