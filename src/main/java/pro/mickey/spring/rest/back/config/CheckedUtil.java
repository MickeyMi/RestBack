package pro.mickey.spring.rest.back.config;

import java.util.List;
import java.util.Map;

import pro.mickey.spring.rest.back.RestBackException;

public class CheckedUtil {

	/**
	 * 是false抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isFalse(boolean expression, int errorCode, String errorMsg) {
		if (expression == false)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * 是true抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isTrue(boolean expression, int errorCode, String errorMsg) {
		if (expression == true)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * 是false抛出异常 是null 抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isFalseObject(Boolean expression, int errorCode, String errorMsg) {
		if (expression == null || expression == false)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * 是true抛出异常 是null 抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isTrueObject(Boolean expression, int errorCode, String errorMsg) {
		if (expression == null || expression == true)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * 是null抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNull(Object expression, int errorCode, String errorMsg) {
		if (expression == null)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * 不是null抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNotNull(Object expression, int errorCode, String errorMsg) {
		if (expression != null)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * list是null或者小于0抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNullAndSize(List<?> expression, int errorCode, String errorMsg) {
		if (expression == null || expression.size() < 1)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * 数组是null或者小于1抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNullAndSize(Object[] expression, int errorCode, String errorMsg) {
		if (expression == null || expression.length < 1)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * Map是null或者小于0抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNullAndSize(Map<?, ?> expression, int errorCode, String errorMsg) {
		if (expression == null || expression.size() < 1)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * String是null或者是空抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNullAndEmpty(String expression, int errorCode, String errorMsg) {
		if (expression == null || expression.length() < 1)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * String不是null并且不是空抛出异常
	 * 
	 * @param expression
	 *            需要判断的值
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isNotNullAndNotEmpty(String expression, int errorCode, String errorMsg) {
		if (expression != null && expression.length() > 0)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * @param string1
	 *            需要判断的值1
	 * @param string2
	 *            需要判断的值2
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isStringEqualString(String string1, String string2, int errorCode, String errorMsg) {
		if (string1 == null || string2 == null || string1.equals(string2))
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * string1 ！= string2抛出异常
	 *
	 * @param string1
	 *            需要判断的值1
	 * @param string2
	 *            需要判断的值2
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void notStringEqualString(String string1, String string2, int errorCode, String errorMsg) {
		if (string1 == null || string2 == null || !string1.equals(string2))
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * integer == integer2抛出异常
	 * 
	 * @param integer
	 *            需要判断的值1
	 * @param integer2
	 *            需要判断的值2
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isIntEqualInt(int integer, int integer2, int errorCode, String errorMsg) {
		if (integer == integer2)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * integer < min || integer > max，抛出异常
	 * 
	 * @param integer
	 *            需要判断的值1
	 * @param min
	 *            需要判断的值2
	 * @param max
	 *            需要判断的值2
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isIntNotRangeInt(int integer, int min, int max, int errorCode, String errorMsg) {
		if (integer < min || integer > max)
			throw new RestBackException(errorCode, errorMsg);
	}

	/**
	 * integer > integer2抛出异常
	 * 
	 * @param integer
	 *            需要判断的值1
	 * @param integer2
	 *            需要判断的值2
	 * @param errorCode
	 *            失败code
	 * @param errorMsg
	 *            失败信息
	 */
	public static void isIntGTInt(int integer, int integer2, int errorCode, String errorMsg) {
		if (integer > integer2)
			throw new RestBackException(errorCode, errorMsg);
	}
}
