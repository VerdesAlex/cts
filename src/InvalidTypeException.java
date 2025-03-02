public class InvalidTypeException extends Exception {
    private static int errorCode = 3;

    public InvalidTypeException(String message) {
        super(message);
    }

    public static int getErrorCode() {
        return errorCode;
    }
}
