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

### 三大特性

- 封装
- 继承
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