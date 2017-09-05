package cn.hwd.springmvc.exception;

/**
 * 自定义异常类（继承Exception类）
 * @author huangwending
 *
 */
public class HelloException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloException(String message) {
		super();
		this.message = message;
	}
	
}
