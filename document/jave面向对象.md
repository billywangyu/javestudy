## 面向对象编程 OOP

### 面向过程的思想

- 步骤清晰简单,第一步,第二步...
- 面对过程适合处理一些较为简单的问题

### 面向对象的思想

-  物以类聚,分类的思维模式,思考问题首先会解决问题需要那些分类,然后对这些分类进行单独思考.最后,才对某个分类下的细节进行面向过程的思索.
- 面向对象适合处理复杂的问题,适合处理需要多人协作的问题

***对于描述负责的事物,为了从宏观上把握,从整体上合理分析,我们需要使用面向对象的思路来分析整个系统.但是,具体到微观操作,任然需要面向过程的思路去处理.***

**面向对象的编程本质就是: 以类的方式组织代码,以对象的组织(封装)数据.**

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
#### 封装

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

    

####  继承

##### extends

通过extends 进行扩展, 子类是父类的扩展.JAVA中只有单继承,没有多继承. 需要使用public修饰符  Ctrl+H 查看继承树, 同理也可以使用private私有,get和set调用.所有的类都继承至object类.

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

##### Object

##### super and this

super 与 this 用法分析

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

  - 构造方法  先调父类在调用子类

    this() 本类的构造

    super() 父类的构造

```java
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
```

```java
package oop.packaging;

public class Students extends Person{
    public Students(){
        super();             //调用父类的构造器,必须要在方法调用的最前面. this页一样,但
        // 只能调用一个this或super之一,不显示调用,其实也是java可以的默认调用.
        // 有参构造器的定义会覆盖无参构造器 调用的时候必须有参调用,如果无参调用会默认调用无参构造
        System.out.println("students无参print");

    }
    //    Person person = new Person();   也可以
    private String name ="哔哩哔哩";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("Students");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
}
```

```java
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
        //继承测试
        Students students = new Students();
        students.say();
        System.out.println(students.age);
        students.test("youtuber");
        System.out.println("===========================================");
        students.test1();
    }
}
```

##### 方法重写

- 方法重写  ***在子类重写父类方法快捷键 alt+insert***

  重写都是方法的重写 和属性没有关系.   静态方法(static)和非静态方法区别很大;

  只有在非静态的方法调用才可以重写父类的方法; 

  ```java
  package oop.packaging;
  
  public class Rewrite_B {
      public  void test(){
          System.out.println("this B objet");
      }
  }
  
  ====================================================
      package oop.packaging;
  
  public class Rewrite_A extends Rewrite_B{
      public  void test(){
          System.out.println("this A objet");
      }
  }
  ====================================================
     package oop;
  import oop.packaging.Rewrite_A;
  import oop.packaging.Rewrite_B;
  public class Demo01 {
  
      public static void main(String[] args) {
      //静态的方法和非静态的方法区别很大 子类可以重写父类的方法
  
          //方法的调用只和左边的类型定义有关,和构造的调用无关
          Rewrite_A rewriteA = new Rewrite_A();
          rewriteA.test();
          //父类的引用指向了子类
          Rewrite_B rewriteB = new Rewrite_A();
          rewriteB.test();
  ```

  - 需要有继承关系,子类重写父类的方法;

  1. 方法名必须相同
  2. 参数列表列表必须相同
  3. 修饰符:范围可以扩大Max---private --protected--default---private--Min
  4. 抛出的异常:范围,可以被缩小,但不能扩大

  重写的方法体不同,但是名称必须一致    ***主要功能:更改父类的功能***

####  多态

  - 是方法的多态,属性没有
  - 父类和子类,要有类型关联(继承)  错误会报转换异常  ClassCastException
  - 存在条件   
    1. 有继承关系
    2. 父类和子类,都有同样的方法  方法需要重写  
    3. 父类引用指向子类对象

```java
public call Student extends Person{
    publice void run(){
        System.out.print("son");
    }
    public void ect(){
        System.out.print("ect");
    }
}
==================================================
    public static void main(String[] args){
    //一个对象的实际类型是确定
    //new Student();
    //new Person();
    //可以指向的引用类型就不确定了;父类的引用指向子类
    Student s1= new Student();  //Student能调用的是自己或父类的
    Person  s2= new Student();  //Person只能调用自己的
    Object  s3= new Student();
    
    //对象能执行那些方法,主要看对象左边的类型,和右边关系不大!
    s2.run();
    s1.run();
    
    ((Student)s2).ect();//子类重写了父类的方法,执行子类的方法.//强制转换 s2.ect();
    s1.ect();
}
```

##### instanceof

- instanceof (类型转换)  引用类型,判断一个对象是什么类型

  ```java
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
  
      }
  }
  ```

  ```java
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
  ```

  1. 父类引用指向子类的对象
  2. 把子类转换为父类,向上转型
  3. 把父类转换为子类,向下转型,强制转换
  4. 方便方法的调用,减少重复的代码
  
  ### **VS `extends`**
  
  | 关键字       | 用途                   | 是否强制覆盖方法           | 是否支持多实现/继承            |
  | ------------ | ---------------------- | -------------------------- | ------------------------------ |
  | `extends`    | 继承**类**（单继承）   | 不一定（除非是抽象方法）   | ❌ **不支持**（只能继承一个类） |
  | `implements` | 实现**接口**（多实现） | ✅ **必须实现所有抽象方法** | ✔ **支持多个接口**             |

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