package utilities.customExceptions;

public class MyCustomException extends RuntimeException{

        private static final long serialVersionUID = -1307493420921168255L;
        private int errorCode;
        private String errorMsg;

        public MyCustomException(ExceptionCode code) {
            this.errorMsg = code.getMsg();
            this.errorCode = code.getId();
        }

        public int getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

}
