package oop;
import oop.packaging.Rewrite_A;
import oop.packaging.Rewrite_B;
import oop.packaging.Students;
import oop.packaging.Study;

public class Demo01 {

    public static void main(String[] args) {
        //调用静态方法
        Student.say();
        //调用非静态方法   实例化这个类 new  对象类型   对象名=对象值
        final Student student = new Student();
        student.says();
        Study study = new Study();
        study.setName("xxx");
        study.setAge(230);//不合法的赋值
        System.out.println(study.getName());
        System.out.println(study.getAge());
        //继承测试
        Students students = new Students();
        students.say();
        System.out.println(students.age);
        students.test("youtuber");
        System.out.println("===========================================");
        students.test1();
        //静态的方法和非静态的方法区别很大 子类可以重写父类的方法

        //方法的调用只和左边的类型定义有关,和构造的调用无关
        Rewrite_A rewriteA = new Rewrite_A();
        rewriteA.test();
        //父类的引用指向了子类
        Rewrite_B rewriteB = new Rewrite_A();
        rewriteB.test();



    }
}
