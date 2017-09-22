package pro.mickey.spring.rest.back.config;

public class BackCodeConfig {

	/**
	 * 请求成功返回code
	 */
	public static Integer backSuccess = 0;
	/**
	 * hibernate validator 返回Code
	 */
	public static Integer backValidationError = -1;

	/**
	 * @param backSuccess
	 *            设置成功置
	 */
	public void setBackSuccess(Integer backSuccess) {
		BackCodeConfig.backSuccess = backSuccess;
	}

	/**
	 * @param backValidationError
	 *            hibernate validator 错误返回Code
	 */
	public void setBackValidationError(Integer backValidationError) {
		BackCodeConfig.backValidationError = backValidationError;
	}

}
