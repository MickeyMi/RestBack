package pro.mickey.spring.rest.back;

public class RestBackObj<T> extends RestBack {

	/**
	 * 返回的具体参数
	 */
	private T result;

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
}
