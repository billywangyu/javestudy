## 面向对象编程 OOP

### 面向过程的思想

- 步骤清晰简单,第一步,第二步...
- 面对过程适合处理一些较为简单的问题

### 面向对象的思想

-  物以类聚,分类的思维模式,思考问题首先会解决问题需要那些分类,然后对这些分类进行单独思考.最后,才对某个分类下的细节进行面向过程的思索.
- 面向对象适合处理复杂的问题,适合处理需要多人协作的问题

#### 对于描述负责的事物,为了从宏观上把握,从整体上合理分析,我们需要使用面向对象的思路来分析整个系统.但是,具体到微观操作,任然需要面向过程的思路去处理.

### 面向对象的编程本质就是: ***以类的方式组织代码,以对象的组织(封装)数据.***

### 抽象

- 类就是抽象,对象就是实例

  ```java
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
      }
  }
  ```

  ```java
  package oop;
  //一个项目只有一个main方法  下面创建的类不需要添加main
  public class class_structure {
      //定义属性
      String name;
      int age;
      //定义方法
      public void study(){
          System.out.println(this.name+"的学生");
      }
  }
  ```

### 构造器

创建类自动生成一个和类名相同的没有返回值的空方法,被称为无参构造器

- 和类名相同

- 没有返回值

  ```java
  public class constr {
      String name;
      int age;
      //快捷   alt+insert
      //使用new 关键字,就是调用构造方法
      //无参构造器 用来初始化值
      public constr() {
      }
      //有参构造器 一旦定义了有参构造,必须显示定义无参构造
      public constr(String name, int age) {
          this.name = name;
          this.age = age;
      }
  }
  
  /*
  constr constr = new constr("xiaoming",30); 有参调用
  System.out.println(constr.name);
  */
  ```

### 三大特性

- 封装

  - 该露的露,垓藏得藏 高内聚,低偶和 封装大部分作用于属性. 设置private属性  通过get和set方法.

    可以防止属性被滥用,在get set里加以限制属性的使用.

    ```java
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
    ```

    ```java
    import oop.packaging.Study;
    public class Demo01 {
        public static void main(String[] args) {
                  Study study = new Study();
            study.setName("xxx");
            study.setAge(230);//不合法的赋值
            System.out.println(study.getName());
            System.out.println(study.getAge());
        }
    ```

    

- 继承

  - 通过extends 进行扩展, 子类是父类的扩展.JAVA中只有单继承,没有多继承. 需要使用public修饰符  Ctrl+H 查看继承树, 同理也可以使用private私有,get和set调用.所有的类都继承至object类.

    ```java
    package oop.packaging;
    public class Person {
        String name;
        public int  age =100;
        char sex;
    
        public void say(){
            System.out.println("say a stemstan");
        }
    
    }
    package oop.packaging;
    public class Students extends Person{
        //    Person person = new Person();   也可以
    
    }
    
    package oop.packaging;
    public class Teacher extends Person{
    
    }
    
    
    ```

    ```java
    import oop.packaging.Study;
    
    public class Demo01 {
    
        public static void main(String[] args) {
            Students students = new Students();
    
            students.say();
            System.out.println(students.age);
    ```

    - object类
    
    - super 与 this 用法分析
    
      先调用子类定义的属性 在调用this指定的属性 super调用父类的属性
    
      私有的方法是无法super继承的,先调用父类的无参构造器.
    
      super注意点
    
      - 调用父类的构造方法,必须在构造方法的第一个
    
      - 必须只能出现在子类的方法或者构造方法中
    
      - super和this不能同时调用构造方法
    
        Vs this  
    
        - 代表的对象不同
    
          this 本身调用者这个对象
    
          super 代表父类对象的应用
    
        - 前提
    
          this 没有继承也可以使用
    
          super 只能在继承条件才可以使用
    
        - 构造方法
    
          this() 本类的构造
    
          super() 父类的构造
    
      - 方法重写
    
        

- 多态

### 回顾方法和调用

- 静态方法和非静态方法

  ```java
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
  ```

```java
package oop;
//学生类
public class Student {
    //静态方法
    public static void say(){
        System.out.println("hello,static");
    }
    //非静态方法
    public  void says(){
        System.out.println("hello,non_static");
        //非静态方法,可以调用静态的方法,但是静态方法下不可以调用非静态方法.
        //因为 静态的方法是在创建的时候就建立的和类一起加载的,这时候非静态还没有创建.
        say();
    }
}
```

- 值传递和引用传递

  ```java
  public class parameter {
      public static void main(String[] args) {
          int add= add(4,5);
          System.out.println("sum"+add);
          //值传递分析,调用void(空) 没有返回任何值
          int sum= 5;
          oop.parameter.changer(sum);
          System.out.print(sum);
      }
      //有形参
      public static int add(int a,int b){
          return a+b;
      }
      //值传递
      public  static void changer(int a){
          a=100;
      }
  }
  ```

  ```java
  public class parameter {
      public static void main(String[] args) {
                 //引用传递本质还是值传递
          person person = new person();
          person.name = "billy";
          System.out.println(person.name);
          //将person 传递给了刚定义的chang方法 实际是引用了person类
          chang(person);
          System.out.println(person.name);
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
  ```