public class voidVector extends Exception {
  private final int errorCode = 1;


  public voidVector(String message) {
     super(message);
  }

  public int getErrorCode() {
    return errorCode;
  }
}
