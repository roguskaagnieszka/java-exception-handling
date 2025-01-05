package exceptions;

public class NullExceptionExample {
    public Integer generateNullException() {
        return null;
    }
}

class ThrowNullException {
    public static void main(String[] args) {
        try {
            NullExceptionExample nullExceptionExample = new NullExceptionExample();
            Integer exampleInteger = nullExceptionExample.generateNullException();
            exampleInteger.toString();
        } catch (NullPointerException exception) {
            System.out.println("The NullPointerException occurred: " + exception);
            System.out.println("Printing stack trace for debugging purposes:");
            exception.printStackTrace();
        }
    }
}