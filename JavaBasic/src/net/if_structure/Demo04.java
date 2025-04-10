package net.if_structure;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input");
        int x=scanner.nextInt() ;
        if(x>=60){
            if(x>=100){
                System.out.println("满分");
            }
            System.out.println("及格");
        }
        scanner.close();
    }
}
