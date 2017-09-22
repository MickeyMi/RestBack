package pro.mickey.spring.rest.back;

import javax.validation.constraints.NotNull;

public class RestBack {

	@NotNull(message = "请求是否成功:0成功,1其他为失败")
	private Integer code;
	/**
	 * 失败信息
	 */
	private String msg;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
