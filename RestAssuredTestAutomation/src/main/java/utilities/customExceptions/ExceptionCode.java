package utilities.customExceptions;

public enum ExceptionCode implements ErrorCodeConstants {

    ACTIVE_USER_FOUND(CODE_200, "Active user found"),
    INVALID_REQUEST(CODE_402, "The request is invalid"),
    INACTIVE_USER(CODE_403, "Inactive user");

    private final int id;
    private final String msg;

    ExceptionCode(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return this.id;
    }

    public String getMsg() {
        return this.msg;
    }
}
