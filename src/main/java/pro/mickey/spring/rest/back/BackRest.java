package pro.mickey.spring.rest.back;

import pro.mickey.spring.rest.back.config.BackCodeConfig;

public class BackRest {

	/**
	 * 请求成功返回数据
	 * 
	 * @param result
	 *            返回数据
	 * @return 返回封装
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
	 * @return 返回封装
	 */
	public static RestBack success() {
		RestBack body = new RestBack();
		body.setCode(BackCodeConfig.backSuccess);
		return body;
	}

	/**
	 * @param code
	 *            失败code
	 * @param msg
	 *            失败信息
	 * @return 返回封装
	 */
	public static RestBack error(int code, String msg) {
		RestBack body = new RestBack();
		body.setCode(code);
		body.setMsg(msg);
		return body;
	}
}
