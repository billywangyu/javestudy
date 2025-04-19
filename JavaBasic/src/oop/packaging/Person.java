package oop.packaging;

public class Person {

    public Person(){
        System.out.println("person无参print");
    }
    protected String name= "bilibili";
    public int  age =100;
    char sex;

    public void say(){
        System.out.println("say a stemstan");
    }
    public void print(){
        System.out.println("Person");
    }
}
