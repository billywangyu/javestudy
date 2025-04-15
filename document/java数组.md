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

- 内存分析

  - 堆:存放new的对象和数组            
  - 栈:存放基本变量类型      
  - 方法区:可以被所有的线程共享

- 三种初始化

  ```java
  public class Demo02 {
      public static void main(String[] args) {
   1       //静态初始化 创建 +赋值
          int[] a={1,2,3,4,5,6,7,8};
   2      //动态初始化
          int[] number=new int[10];
          number [0] =0;
   3      //默认初始化   为0
          System.out.println(number[1]);
      }
  }
  ```

- 数组的诗歌基本特点

  - 长度是确定的,大小不能改变

  - 元素必须是相同类型,不允许混合

  - 数组中的元素可以是任何数据类型,包括基本类型和引用类型.

  - 数组变量属于引用类型.数组也可以看成是对象,数组中的每个元素相当于该对象的成员变量.

    数组本身就是对象,java中对象是在堆中

- 数组边界

  - 下标的合法区间: [0,length-1]  
  - ArrayIndexOutOfBoundsException:数组下标越界异常

## 数组的使用

- 普通的For循环

- For-Each循环

- 数组作方法入参

- 数组作返回值

  ```java
  package array;
  
  public class for_each {
      public static void main(String[] args) {
          int[] number={1,2,4,7,34,25,54,23,};
          //增强的   JDK1.5 没有下标  只有每个元素的值
          for (int i : number) {
              System.out.println(i);
          }
          printArray(number);
          printArray(reverse(number));
      }
      //打印数组
      public static void printArray(int[] arrays){
          //普通的
          for (int i=0;i< arrays.length;i++){
              System.out.print(arrays[i]+"   ");
          }
      }
      //反转数组
      public static int[] reverse(int[] arrays){
          int[] result= new int[arrays.length];
          for (int i=0,j=arrays.length-1;i<arrays.length;i++,j--){
              result[j] =arrays[i];
          }
          return result;
      }
  }
  ```

## 多维数组

- 可以看成是数组的数组,每一个元素都是一个一维数组.

- 二维数组

  ```java
  int a[][] new int[2][5]
  ```

  以上数组a可以看成一个两行五列的数组

  ```java
  package array;
  /**
   * 多维数组演示类
   * 演示二维数组的基本操作
   */
  public class Multidimensional {  // 类名按照规范首字母大写
      public static void main(String[] args) {
          // 4行2列的二维数组
          /*
             array[0] → 1,2
             array[1] → 2,3
             array[2] → 3,4
             array[3] → 4,5
           */
          int[][] array = {
                  {1, 2},
                  {2, 3},
                  {3, 4},
                  {4, 5}
          };
  
          // 1. 直接访问特定元素
          System.out.println("array[0][0]: " + array[0][0]);  // 输出第一行第一列: 1
          System.out.println("array[0][1]: " + array[0][1]);  // 输出第一行第二列: 2
  
          // 2. 正确的嵌套循环遍历方式
          System.out.println("\n遍历整个二维数组:");
          for (int[] row : array) {         // 外层循环获取每一行（一维数组）
              for (int num : row) {         // 内层循环遍历当前行的每个元素
                  System.out.print(num + " ");
              }
              System.out.println();         // 每行输出后换行
          }
  
          // 3. 传统for循环方式（备选方案）
          System.out.println("\n传统for循环遍历:");
          for (int i = 0; i < array.length; i++) {          // 遍历行
              for (int j = 0; j < array[i].length; j++) {   // 遍历列
                  System.out.print(array[i][j] + " ");
              }
              System.out.println();
          }
      }
  }
  ```

## Arrays 类

- java.util.Arrays

  ```java
  import java.util.Arrays;
  public class Util_arrays {
      public static void main(String[] args) {
          int[] a={3543,454,2223,687,45,24,5666,4,2,75,44,};
          Arrays.sort(a);   // 升序排序
          System.out.println(Arrays.toString(a));
      }
  }
  ```

- 排序

## 稀疏数组 （Sparse Array）

稀疏数组是一种 **压缩存储** 数据结构，主要用于 **优化大量重复数据（尤其是0值）的存储**，比如棋盘、地图、图像等。
 它把二维数组的有效数据（非默认值）存储为 **[行, 列, 值] 的三元组**，大幅减少空间占用。

------

## **📌 1. 稀疏数组的应用场景**

### **典型场景**：

1. **五子棋/围棋棋盘**（大部分位置为空，只需记录落子点）
2. **图像压缩**（比如黑白图片，大量像素为0或255）
3. **地图数据存储**（大部分区域无特殊标记）

### **示例：五子棋盘**

原始二维数组 (`15×15`，共225个数据）：

<TEXT>

```
0 0 0 0 0 ...0 0 1 0 0 ...  // (2,2)=1（黑子）0 0 0 2 0 ...  // (3,3)=2（白子）...
```

如果用稀疏数组存储，只需记录 **非零位置**，(把不同值的元素和行列及值记录在一个小规模的数组中,从而缩小程序的规模)压缩后仅需5行（示例）：

| 行(row) | 列(col) | 值(value) |
| ------- | ------- | --------- |
| 15      | 15      | 2         |
| 2       | 2       | 1         |
| 3       | 3       | 2         |
| ...     |         |           |

------

## **📌 2. 稀疏数组的存储结构**

### **首行固定**：

| row          | col          | value              |
| ------------ | ------------ | ------------------ |
| 原数组总行数 | 原数组总列数 | **有效数据的个数** |

### **后续行**：

| row            | col            | value  |
| -------------- | -------------- | ------ |
| 有效数据的行号 | 有效数据的列号 | 具体值 |

------

```java
package array;

public class Sparse {
    public static void main(String[] args) {
        // 1. 创建原始二维数组（棋盘，0=空，1=黑子，2=白子）
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;
       int counts = 0;
        for (int[] into : chessArr) {
            for (int anInt : into) {
                System.out.print((anInt)+"\t");
                counts+= (anInt != 0)?+1:+0;
            }
            System.out.println();
        }
        System.out.println(counts);
        // 2. 遍历原始数组，统计非零数据个数
        int sum = 0;   //获取有效数的个数
        for (int[] row : chessArr) {
            for (int data : row) {
                if (data != 0) sum++;
            }
        }
        System.out.println("获取有效数的个数:"+sum);

        // 3. 创建稀疏数组（行数=sum+1，固定3列）
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = 11;   // 原数组行数
        sparseArr[0][1] = 11;   // 原数组列数
        sparseArr[0][2] = sum;  // 有效数据个数

        // 4. 填充稀疏数组（存储非零数据）
        int count = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;    // 行
                    sparseArr[count][1] = j;    // 列
                    sparseArr[count][2] = chessArr[i][j]; // 值
                }
            }
        }
        // 5. 打印稀疏数组
        System.out.println("稀疏数组：");
        for (int[] row : sparseArr) {
            System.out.printf("%d\t%d\t%d\n", row[0], row[1], row[2]);
        }
        for (int[] its : sparseArr) {
            for (int anInt : its) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        //还原 先建立新数组
        int [][] re=new int[sparseArr[0][0]][sparseArr[0][1]]; //引用 行,和列
        //填充值  遍历sparse填充新数组
        for (int i = 1; i < sparseArr.length; i++) {
            re[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }
        for (int[] ints : re) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
```



