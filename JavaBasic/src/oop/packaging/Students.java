package oop.packaging;

public class Students extends Person{
    public Students(){
        super();             //调用父类的构造器,必须要在方法调用的最前面. this页一样,但
        // 只能调用一个this或super之一,不显示调用,其实也是java可以的默认调用.
        // 有参构造器的定义会覆盖无参构造器 调用的时候必须有参调用,如果无参调用会默认调用无参构造
        System.out.println("students无参print");

    }
    //    Person person = new Person();   也可以
    private String name ="哔哩哔哩";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("Students");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
}
