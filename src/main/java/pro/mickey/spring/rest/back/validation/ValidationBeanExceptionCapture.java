package pro.mickey.spring.rest.back.validation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import pro.mickey.spring.rest.back.BackRest;
import pro.mickey.spring.rest.back.RestBack;
import pro.mickey.spring.rest.back.config.BackCodeConfig;

/**
 * 接口数据验证
 * 
 * @author Mickey
 *
 */
@RestControllerAdvice
public class ValidationBeanExceptionCapture {

	private Map<String, String> all;

	public ValidationBeanExceptionCapture() {
		all = new HashMap<String, String>();
		{// 默认值
			all.put("Null", "必须为NULL");
			all.put("NotNull", "不能为空");
			all.put("AssertTrue", "必须为true");
			all.put("AssertFalse", "必须为false");
			all.put("Min", "必须大于xxxx");
			all.put("Max", "必须小于xxxx");
			all.put("DecimalMin", "必须大于等于xxxx");
			all.put("DecimalMax", "必须小于等于xxxx");
			all.put("Size", "必须在制定的范围内");
			all.put("Digits", "必须是数字，必须在可接受的范围内");
			all.put("Past", "必须是一个过去的日期");
			all.put("Future", "必须是一个将来的日期");

			all.put("Email", "必须是电子邮箱地址");
			all.put("Length", "必须在指定的范围内");
			all.put("NotEmpty", "必须非空");
			all.put("NotBlank", "必须非空");
			all.put("URL", "必须是一个有效的url");
			all.put("CreditCardNumber", "银行卡，信用卡等号码一般都用Luhn计算合法性");
		}
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.OK)
	private RestBack exception(MethodArgumentNotValidException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		String errorMesssage = "参数错误:";
		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			errorMesssage += " AND " + fieldError.getField() + all.get(fieldError.getCode()) + "," + fieldError.getDefaultMessage() + "";
		}
		return BackRest.error(BackCodeConfig.backValidationError, errorMesssage);
	}

}
