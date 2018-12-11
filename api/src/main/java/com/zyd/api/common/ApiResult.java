package com.zyd.api.common;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {
	private ResultBody e;
	private T rdatas;

	private ApiResult() {
	}

	public ApiResult(Integer e, String message) {
		ResultBody body = new ResultBody(e, message, message);
		this.e = body;
		this.rdatas = null;
	}

	public ApiResult(Integer e, T rdatas) {
		ResultBody body = new ResultBody(e, "", "");
		this.e = body;
		this.rdatas = rdatas;
	}

	public ApiResult(Integer e, String message, T rdatas) {
		ResultBody body = new ResultBody(e, message, message);
		this.e = body;
		this.rdatas = rdatas;
	}

	public ResultBody getE() {
		return e;
	}

	public void setE(ResultBody e) {
		this.e = e;
	}

	public T getRdatas() {
		return rdatas;
	}

	public void setRdatas(T rdatas) {
		this.rdatas = rdatas;
	}

	@Override
	public String toString() {
		return "ApiResult{" +
				"e=" + e +
				", rdatas=" + rdatas +
				'}';
	}

	class ResultBody{
		private Integer errid;
		private String msg;
		private String errorInfo;

		public ResultBody(Integer errid, String msg, String errorInfo) {
			this.errid = errid;
			this.msg = msg;
			this.errorInfo = errorInfo;
		}

		public Integer getErrid() {
			return errid;
		}

		public void setErrid(Integer errid) {
			this.errid = errid;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getErrorInfo() {
			return errorInfo;
		}

		public void setErrorInfo(String errorInfo) {
			this.errorInfo = errorInfo;
		}

		@Override
		public String toString() {
			return "ResultBody{" +
					"errid=" + errid +
					", msg='" + msg + '\'' +
					", errorInfo='" + errorInfo + '\'' +
					'}';
		}
	}
}