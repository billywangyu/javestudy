package oop.polymorphic;

import oop.Student;
import oop.packaging.Person;
import oop.packaging.Students;
import oop.packaging.Teacher;

public class Instanceofs {
    //object==>string
    //object==>person==>students
    //object==>person==>teacher
    public static void main(String[] args) {
//        System.out.println(x instanceof y); 测试能不能通过编译
        Object object = new Students();
        System.out.println(object instanceof Students);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        Person person = new Students();
        System.out.println(person instanceof Students);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);//false
//        System.out.println(person instanceof String); 报错
//  类型转换     父类     子类
        //  高(父类)              低(子类)  =低转高
        Person students = new Students();
        //students 将这个对象转换为 students 类型
        Students students1 = (Students) students;  //转换
        ((Students) students).test("haha");  //简化写法
        //子类转换成父类  可能丢失自己的本来的一些方法
        Students students2 = new Students();
        students2.test1();
        ((Person) students2).say();
    }
}
