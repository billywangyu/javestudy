package oop;

public class Demo01 {

    public static void main(String[] args) {
        //调用静态方法
        Student.say();
        //调用非静态方法   实例化这个类 new  对象类型   对象名=对象值
        final Student student = new Student();
        student.says();

    }

}
