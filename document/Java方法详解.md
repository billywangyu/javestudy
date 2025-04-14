## Java方法详解

- 何谓方法

  - ```java
    // 类      对象  方法
       System.out.println()  
    ```

  - 方法是语句的集合,它们在一起执行一个功能.包含于类或对象中,在程序中创建,其他地方调用.

    ```java
    public class Demo01 {
        public static void main(String[] args) {
           int sum= add(2,3);
            System.out.println(sum);
        }
        public static int add(int a,int b){
          return a+b;
        }
    }
    ```

  - 一个方法只能完成一个工作

- 方法的定义及调用

  - 方法类似于其他语言的函数,用来完成特定功能的代码片段

  - ```jave
    // 修饰符 返回值类型  方法名(参数类型 参数名){
    	方法体
    	retutn 返回值
    }
    ```

  - 调用方法:

    ```java
    对象名.方法名(实参列表)
    ```

    两种调用方法

    - 有返回值,方法调用通常被当做一个值

      ```jave
      int larger=max(30,40)
      ```

    - 返回值为空void,方法调用一定是一条语句.

      ```java
      System.out.println("Hello,Kuanshen")
      ```

    - 值传递 和 引用传递

- 方法重载

  - 重载就是在一个类中,有相同的函数名称,但形参不同的函数

  - 重载规则,方法名必须相同,参数列表必须不同,返回值可以相同也可以不同

    ```java
    public class Demo01 {
        public static void main(String[] args) {
           int sum= add(2,3);
           double dsum=add(20.4,34.7);
            System.out.println(sum);
            System.out.println(dsum);
        }
        public static int add(int a,int b){
          return a+b;
        }
        public static double add(double a,double b){
            return a+b;
        }
    }
    ```

- 命令行传参  要靠传递命令行参数给main()函数事项

  ```java
  javac demo01.java
  java demo01 hello this java
  ```

- 可变参数 JDK1.5新增 在指定参数类型后加一个省略号(...),一个方法只能指定一个可变参数

  它必须是方法的最后一个参数,任何普通的参数必须在它之前声明.

  ```java
  public class Demo02 {
      public static void main(String[] args) {
          Demo02 number = new Demo02();
          number.test(1,2,67,234);
      }
      public void test(int... i){
          for (int x=0;x<i.length;x++){
              System.out.println(i[x]);
          }
      }
  }
  ```

- 递归 方法自己调用自己 需要边界条件,

  ```java
  public class Demo03 {
      public static void main(String[] args) {
          Demo03 number= new Demo03();
          number.texst();
      }
      public void texst(){
          texst();
      }
  }
  ```

  