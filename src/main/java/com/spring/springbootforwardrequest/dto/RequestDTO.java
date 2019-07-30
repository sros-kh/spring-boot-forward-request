package com.spring.springbootforwardrequest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestDTO extends MainRequestDTO {

	private String accountId;
	private String cardId;
	private String requestGateWay;
	private String appId;
	private String deviceId;
	private String extRefId;
	private String currentTime;
	private String requestId;
	private String platform;
	private String appVersion;

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getExtRefId() {
		return extRefId;
	}

	public void setExtRefId(String extRefId) {
		this.extRefId = extRefId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRequestGateWay() {
		return requestGateWay;
	}

	public void setRequestGateWay(String requestGateWay) {
		this.requestGateWay = requestGateWay;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getRequestId() {
		if (requestId == null) {
			this.requestId = String.valueOf(System.nanoTime());
		}
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}