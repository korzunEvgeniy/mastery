package com.company.exceptions;

public class ExamplesExceptions {

    public static void main(String[] args) {
        //exceptionExam1();
        exceptionExam2();
        exceptionExam4(1);
        System.out.println(exceptionExam5());
        System.out.println(exceptionExam6());
        System.out.println(exceptionExam7());
    }


    public static void exceptionExam1() {
        System.out.println("Start method 1");
        try {
            if(true) {
                System.out.println("TRY from method 1");
                throw new RuntimeException();
            }
        } catch (NullPointerException e) {
            System.out.println("CATCH from method 1");
        } finally {
            System.out.println("FINALLY from method 1");
        }
        System.out.println("END from method 1");
    }


    public static void exceptionExam2() {
        System.out.println("\nStart method 2");
        try {
            if(true) {
                System.out.println("TRY from method 2");
                throw new NullPointerException();
            }
        } catch (RuntimeException e) {
            System.out.println("CATCH from method 2");
        } finally {
            System.out.println("FINALLY from method 2");
        }
        System.out.println("END from method 2");
    }


//    public static void exceptionExam3() {
//        try {
//            if(true) {
//                System.out.println("TRY from method 3");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {
//            System.out.println("CATCH from method 3");
//        } catch (NullPointerException e) {
//            System.out.println("CATCH from method 3");
//        } finally {
//            System.out.println("FINALLY from method 3");
//        }
//        System.out.println("END from method 3");
//    }


    public static void exceptionExam4(int num) {
        System.out.println("\nStart method 4");
        try {
            if(num == 1) {
                System.out.println("ArithmeticException");
                throw new ArithmeticException();
            } else if(num == 2) {
                System.out.println("NullPointerException");
                throw new NullPointerException();
            }
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("CATCH from method 4");
        } finally {
            System.out.println("FINALLY from method 4");
        }
        System.out.println("END from method 4");
    }


    public static String exceptionExam5() {
        System.out.println("\nStart method 5");
        try {
            if(true) throw new IllegalArgumentException();
            System.out.println("TRY");
            return "try";
        } catch (RuntimeException e) {
            System.out.println("CATCH");
            return "catch";
        } finally {
            System.out.println("FINALLY");
            return "finally";
        }
    }


    public static String exceptionExam6() {
        System.out.println("\nStart method 6");
        String result = "BEGIN";
        try {
            if(true) throw new IllegalArgumentException();
            System.out.println("TRY");
            result = "try";
            //return result;
        } catch (RuntimeException e) {
            System.out.println("CATCH");
            result = "catch";
            return result;
        } finally {
            System.out.println("FINALLY");
            result = "finally";
            System.out.println(result);
        }
        return result;
    }


    public static String exceptionExam7() {
        System.out.println("\nStart method 7");
        String result = "BEGIN";
        try {
            if(true) throw new IllegalArgumentException();
            System.out.println("TRY");
            result = "try";
            return result;
        } catch (RuntimeException e) {
            System.out.println("CATCH");
            try {
                if(true) throw new MyException("Inner block TRY");
            } catch (Exception m) {
                String innerResult = m.getMessage();
                return innerResult;
            }
            result = "catch";
            //return result;
        } finally {
            System.out.println("FINALLY");
            result = "finally";
            System.out.println(result);
        }
        return result;
    }
}
