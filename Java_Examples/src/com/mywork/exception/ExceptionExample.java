package com.mywork.exception;

public class ExceptionExample {
    public static void main(String[] args) {
        handleException();

        try {
            throwsException();
        } catch (Exception e) {
            System.out.println("Throws exception :" + e);
        }

        int result = finallyException();
        System.out.println("result: " + result);

        try {
            customException();
        } catch (CustomException e) {
            System.out.println("CustomException :" + e.getMessage());
        }


    }

    private static void handleException() {
        int x = 5;
        int y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Exception :" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void throwsException() throws ArithmeticException {
        int x = 5;
        int y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    private static int finallyException() {
        int x = 5;
        int y = 0;
        int result;
        try {
            result = x / y;
            return result;
        } catch (ArithmeticException e) {
            System.out.println(" Exception :" + e.getMessage());
            result = 0;
        } finally {
            System.out.println("Executing finally block");
        }
        return result;
    }

    private static void customException() throws CustomException {
        int x = 5;
        int y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            throw new CustomException(e.getMessage());
        }
    }
}
