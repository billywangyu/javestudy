package oop;
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
        Students students = new Students();

        students.say();
        System.out.println(students.age);

    }

}
