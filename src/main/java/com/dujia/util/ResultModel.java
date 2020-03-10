package com.dujia.util;

import lombok.Data;

/**
 * 封装响应的JSON结果的类
 */
@Data
public class ResultModel {

	static final Integer DEFAULT_CODE = 1000; /** 执行失败自定义状态resultCode */
	private Integer resultCode;
	private String resultMessage;
	private Object resultData;

	public Integer getResultCode() {
		return resultCode;
	}
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public Object getResultData() {
		return resultData;
	}
	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}
	public Integer setResultCodeDefault(){
		return this.resultCode = DEFAULT_CODE;
	}

	public ResultModel() {
	}

	public ResultModel(Integer resultCode, String resultMessage) {
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
	}

	public ResultModel(Integer resultCode, String resultMessage, Object resultData) {
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
		this.resultData = resultData;
	}

	@Override
	public String toString() {
		return "ResultModel{" +
				"resultCode=" + resultCode +
				", resultMessage='" + resultMessage + '\'' +
				", resultData=" + resultData +
				'}';
	}
}
