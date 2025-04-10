package net.if_structure;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //
        Scanner scanner=new Scanner(System.in);
        /*

         */
        System.out.println();
        double score= scanner.nextDouble();
        if(score==100){
            System.out.println("满分");
        }else if(score>90&&score<100){
            System.out.println("A");
        }else if(score>80&&score<90){
            System.out.println("B");
        }else if(score>70&&score<80){
            System.out.println("C");
        }else if(score>60&&score<70){
            System.out.println("D");
        }else if(score>0&&score<60){
            System.out.println("不及格");
        }else {
            System.out.println("成绩错误");
        }

        scanner.close();
    }
}
