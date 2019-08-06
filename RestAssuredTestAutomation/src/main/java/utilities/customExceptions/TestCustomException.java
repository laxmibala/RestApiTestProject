package utilities.customExceptions;

public class TestCustomException {

    public static void displayMyMessage() {
        throw new MyCustomException(ExceptionCode.INACTIVE_USER);
    }

    public static void main(String[] args) {

// Usage :
        try {
            displayMyMessage();

        } catch (MyCustomException e) {
            e.printStackTrace();
            PrintErrorMessage.print(e);
        }


    }



}
