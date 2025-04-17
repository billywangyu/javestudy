package oop;

public class constr {
    String name;
    int age;
    //快捷   alt+insert
    //使用new 关键字,就是调用构造方法
    //无参构造器 用来初始化值
    public constr() {
    }
    //有参构造器 一旦定义了有参构造,必须显示定义无参构造
    public constr(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
