package org.example;

public class Main {

    public static final String CONSTANT = "constant";

    public static void main(String[] args) {
        String s = "Hello world!";

        System.out.println(s);

        test();
    }

    static {
        System.out.println("instance initializer");
    }

    /*

    asda

    asd
    as
    d

     */


    private static void test() {
        System.out.println("test");
    }

    private static void test2() {
        System.out.println("test2");
    }


}