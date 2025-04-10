package com.base;

public class Demo04 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte) i ; //内存溢出  byte最大127
        // 强制类型转换 (类型)变量名  高--->低
        double d= i;   //自动转换      低--->高

        System.out.println(b);
        System.out.println(d);
        System.out.println("=================================================");
        System.out.println((int)23.7);    //存在内存溢出,或精度问题.
        System.out.println((int)-45.89f);
        System.out.println("=================================================");
        char c='a';
        int s=c+1;
        System.out.println(s);
        System.out.println((char)s);
       // 操作比较大的数的时候,注意溢出问题   JDK  数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;// -1474836480 计算溢出
        long total1=money*years; // 转换之前已经出现问题,因为默认原始是int
        long total2=money*(long)years;//先转换一个数为long
        System.out.println(total2);



    }
}
