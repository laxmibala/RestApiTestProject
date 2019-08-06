package utilities.customExceptions;

public class PrintErrorMessage {

    public static void print(MyCustomException e) {

        switch (e.getErrorCode()) {
            case ExceptionCode.CODE_402:

                System.out.println(e.getErrorMsg());

                break;

            case ExceptionCode.CODE_403:

                System.out.println(e.getErrorMsg());

                break;

            case ExceptionCode.CODE_200:

                System.out.println(e.getErrorMsg());

                break;
            default:
                break;
        }
    }
}
