package oop.packaging;

public class Students extends Person{
    //    Person person = new Person();   也可以
    private String name ="哔哩哔哩";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
