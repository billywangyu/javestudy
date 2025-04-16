package oop;
//学生类
public class Student {
    //静态方法
    public static void say(){
        System.out.println("hello,static");

    }
    //非静态方法
    public  void says(){
        System.out.println("hello,non_static");
        //非静态方法,可以调用静态的方法,但是静态方法下不可以调用非静态方法.
        //因为 静态的方法是在创建的时候就建立的和类一起加载的,这时候非静态还没有创建.
        say();
    }

}
