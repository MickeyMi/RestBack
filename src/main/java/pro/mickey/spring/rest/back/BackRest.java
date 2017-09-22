package pro.mickey.spring.rest.back;

import pro.mickey.spring.rest.back.config.BackCodeConfig;

public class BackRest {

	/**
	 * 请求成功
	 * 
	 * @param body
	 * @return
	 */
	public static <T> RestBackObj<T> success(T result) {
		RestBackObj<T> body = new RestBackObj<T>();
		body.setCode(BackCodeConfig.backSuccess);
		body.setResult(result);
		return body;
	}

	/**
	 * 请求成功
	 * 
	 * @param body
	 * @return
	 */
	public static RestBack success() {
		RestBack body = new RestBack();
		body.setCode(BackCodeConfig.backSuccess);
		return body;
	}

	/**
	 * 请求成功
	 * 
	 * @param body
	 * @return
	 */
	public static RestBack error(int code, String msg) {
		RestBack body = new RestBack();
		body.setCode(code);
		body.setMsg(msg);
		return body;
	}
}
