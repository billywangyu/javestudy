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

- 命令行传参

- 可变参数

- 递归