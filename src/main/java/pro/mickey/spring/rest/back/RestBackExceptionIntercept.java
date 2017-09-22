package pro.mickey.spring.rest.back;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常捕获
 * 
 * @author Mickey
 *
 */
@RestControllerAdvice
public class RestBackExceptionIntercept {

	@ExceptionHandler(RestBackException.class)
	@ResponseStatus(HttpStatus.OK)
	protected RestBack parameterErrorException(RestBackException ex) {
		return BackRest.error(ex.getErrorCode(), ex.getErrorMsg());
	}
}
