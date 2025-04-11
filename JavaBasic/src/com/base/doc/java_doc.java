package com.base.doc;

public class java_doc {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!b: " + !b);

        bitwiseOperations();
        addNumbers();
    }

    /**
     * Bitwise operations.
     */
    public static void bitwiseOperations() {
        System.out.println("\n--- 位运算符演示 ---");
        int A = 60;
        int B = 13;

        System.out.println("A & B: " + (A & B));
        System.out.println("A | B: " + (A | B));
        System.out.println("A ^ B: " + (A ^ B));
        System.out.println("~A: " + (~A));
        System.out.println("2 << 3: " + (2 << 3));
    }

    /**
     * Add numbers.
     */
    public static void addNumbers() {
        System.out.println("\n--- 数字/字符串拼接 ---");
        int a = 10;
        int b = 20;

        System.out.println(" " + (a + b));
        System.out.println((a + b) + "");
    }
}
