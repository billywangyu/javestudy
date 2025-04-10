package com.base;

public class Demo08 {
    //类变量 static
    static double salary=2500;
    // 属性 : 变量
    // 实例变量:从属于对象;如果不进行初始化,这个类型的默认值
    // 布尔值:默认是false
    // 除了基本类型,其余的都是null
    String name;
    int age;
    // main 方法
    public static void main(String[] args) {
        // 局部变量: 必须声明和初始化值
        int i=10;
        System.out.println(i);
        //变量类型  变量名称=new com.base.Demo08()
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);
        System.out.println(demo08.name);
        //类变量 static
        System.out.println(salary);

    }
    //其他方法
    public  void add(){
        //System.out.println(i);
    }
}
