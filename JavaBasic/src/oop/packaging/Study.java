package oop.packaging;
//类  private  私有
public class Study {
    //属性 --- 名字   年龄   性别  封装是封装类的属性
    private String name;
    private int age;
    private char sex;
    //方法  学习    休息
    //alt+insert  自动生成
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>150 || age<0){  //判断是否合法
            System.out.println("输错了");
        }else {
            this.age = age;
        }
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
