package oop;

public class class_main {
    public static void main(String[] args) {
        //实例化对象
        class_structure class_structure = new class_structure();
        //实例化后返回一个自己的对象
        class_structure.name="萧山劲松小学二年四班";
        class_structure.study();
        class_structure.age=12;
        class_structure class_structure1 = new class_structure();
        class_structure1.name="萧山劲松小学二年三班";
        class_structure1.study();
        constr constr = new constr("xiaoming",30);
        System.out.println(constr.name);
    }
}
