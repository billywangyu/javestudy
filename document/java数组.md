## 数组概述

- 数组是相同类型数据的有序集合,通过每个数组元素下标来访问它们.

## 数组声明创建

- 首先必须声明数组变量,才能在程序中使用数组,下面是声明数组变量的语法:

  ```java
  dataType[] arrayRefVar;   //首选方法
  dataType arrayRefVar[];   //次选方法,效果相同
  ```

- Java语言使用new操作符来创建数组,语法如下:

  ```java
  dataType[] arrayRefVar new dataType[arraySize];
  ```

- 数组的元素是通过索引访问的,数组索引从0开始.

- 获取数组长度:   

  ```java
  arrays.length
  ```

```java
public class Demo01 {
    public static void main(String[] args) {
        // 变量的类型  变量的名字  =变量的值
        int[]  number;    //arrays define
        int sum=0;
        number = new int[10]; //创建一个数组   存放10个int数据
        for (int i = 1; i <=10; ++i) {
            for (int j = 0; j < 10; j++) {
                number[j] =i;
            }
            System.out.println(sum += number[i-1]);
        }
    }
}
```

## 数组的使用

## 多维数组

## Arrays 类

## 稀疏数组





