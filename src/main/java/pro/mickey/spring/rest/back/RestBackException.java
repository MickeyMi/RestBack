package pro.mickey.spring.rest.back;

/**
 * 请求数据参数异常
 * 
 * @author Mickey
 *
 */
public class RestBackException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private int errorCode;
	private String errorMsg;

	/**
	 * @param errorCode
	 *            错误CODE值
	 * @param msg
	 *            错误信息
	 */
	public RestBackException(int errorCode, String errorMsg) {
		super("没有注册or扫描ParameterErrorException");
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
