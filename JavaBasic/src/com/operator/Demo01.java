package com.operator;

public class Demo01 {

    public static void main(String[] args) {
        //二元运算符
        //ctrl+d :  复制当前行到下一行.
        int a=10;
        int b=20;
        int c=25;
        int d=25;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a/b); //强制转换,否则为0
    }
    public void add(String[] args){
        long a=123123123123123L;
        int b=123;
        short c=10;
        byte d=8;
        System.out.println(a+b+c+d);//Long
        System.out.println(b+c+d);//Int
        System.out.println(c+d);//Int   不同类型运算后最小类型自动转换为Int
    }


}


