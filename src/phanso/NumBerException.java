package phanso;

public class NumBerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumBerException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Lỗi giá trị không hợp lệ không hợp lệ: " + super.getMessage();
	}
}