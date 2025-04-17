package oop;

public class parameter {
    public static void main(String[] args) {
        int add= add(4,5);
        System.out.println("sum"+add);
        //值传递分析,调用void(空) 没有返回任何值
        int sum= 5;
        oop.parameter.changer(sum);
        System.out.print(sum);

        //引用传递本质还是值传递
        person person = new person();
        person.name = "billy";
        System.out.println(person.name);
        //将person 传递给了刚定义的chang方法 实际是引用了person类
        chang(person);
        System.out.println(person.name);


    }
    //有形参
    public static int add(int a,int b){
        return a+b;
    }
    //值传递
    public  static void changer(int a){
        a=100;
    }
    //引用传递分析
    public static void chang(person person){
        //person现在是一个对象,person person = new person();--这是一个具体的人,可以改变
        person.name ="刘德华";
    }

}
//定义一个person类,添加一个属性 name
class person{
    String name;
}
