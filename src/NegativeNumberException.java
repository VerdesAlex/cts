public class NegativeNumberException extends Exception {
    private final int errorCode = 2;

    public NegativeNumberException(String message) {
        super(message);
    }

    public int getErrorCode() {
      return errorCode;
    }
}
