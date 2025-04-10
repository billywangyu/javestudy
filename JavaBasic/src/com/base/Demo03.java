package com.base;

public class Demo03 {
    public static void main(String[] args) {
        // 整数拓展:    进制    二进制0b   十进制   八进制0   十六进制0x
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("==========================================================");
        // 浮点数拓展   float  有限数 离散 舍入误差 大约 接近但不等于   最后不使用浮点数比较
        // double
        float f = 0.1f;
        double d =0.1;
        System.out.println(f==d);
        System.out.println(f);
        System.out.println(d);
        // 字符拓展   字符集的本质还是数字 字符编码 Unicode  '\u0061'   字符转义 \t=tab  \n=换行
        char c1='中';
        char c2 ='a';
        char c3='\u0061';
        System.out.println((int)c2); //强制转换
        System.out.println(c1);
        System.out.println(c3);
        System.out.println("Hello\tWorld");
        System.out.println("Helld\nWorld");
        //boolean 拓展
        boolean flag=true;
        if (flag){

        }
    }
}
