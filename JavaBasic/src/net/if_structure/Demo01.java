package net.if_structure;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input word:");
        String s=scanner.nextLine();
        // equals 判断字符串是否相等
        if(s.equals("hellp")){
            System.out.println(s);
        }
        System.out.println("End");
        scanner.close();
    }
}
