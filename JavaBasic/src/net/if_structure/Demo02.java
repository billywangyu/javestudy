package net.if_structure;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //考试分数大于60分及格,小于60分不及格.
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入分数");
        double score=scanner.nextDouble();
        if(score>60){
            System.out.println("及格了");
        }else {
            System.out.println("不及格");
        }
        scanner.close();
    }
}
