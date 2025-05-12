## Scannet(用户交互)

- 可以获取用户的输入,java.util.Scanner是java5的新特性

- ```java
  Scanner s = new Scanner(System.in);
  ```

- 通过Scanner类的next()与nextLine()方法获取输入的字符串,读取前使用hasNext()与hasNextLine()判断是否还有输入的数据.

```java
package net.scanner;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        // 创建一个扫描对象,用于接收键盘数据
        Scanner scanner= new Scanner(System.in);
        System.out.println("使用next方式接收");
        // 判断用户有没有输入字符串
        if (scanner.hasNext()){            // hasNextLine
            // 使用next方式接收
            String str= scanner.next();    //nextLine
            System.out.println("输入的内容为 "+str);
        };
        //凡是属于IO流的类如果不关闭会一直占用资源
        scanner.close();
    }
}
```

```java
package net.scanner;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//从键盘接收数据
        int i =0;
        float f=0.0f;
        System.out.println("输入整数");
        if(scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("输入的整数为"+i);
        }else {
            System.out.println("输入是浮点数");
        }
        System.out.println("输入浮点数");
        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("输入的浮点数为"+f);
        }else {
            System.out.println("输入是整数");
        }
        scanner.close();
    }
}
```

```java
package net.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //输入多个数,求和和平均数,每输入一个数回车确认,
        // 通过输入非数字来结束输入并输出结果
        Scanner scanner=new Scanner(System.in);
        //和
        double sum=0;
        //输入计数器
        int conant=0;
        //通过循环判断是否还有输入,在对每一次进行求和和统计
        while(scanner.hasNextDouble()){
            double x =scanner.nextDouble();
            conant++;
            sum+= x;
        }
        System.out.println("个数的和是:"+sum);
        System.out.println("个数的平均数是:"+(sum/conant));

        scanner.close();
    }
}
```

## 顺序结构

- java的基本结构就是顺序结构,除非特别指明,否则按照顺序一句一句执行.
- 顺序结构是最简单的算法结构
- 语句与语句之间,框与框之间是按从上到下的顺序进行的

```java
package net.order;
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        System.out.println("hello5");
    }
}
```

## 选择结构

- if单选

```java
package net.if_structure;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input word:");
        String s=scanner.nextLine();
        // equals 判断字符串是否相等
        if(s.equals("hellp")){
            System.out.println(s);
        }
        System.out.println("End");
        scanner.close();
    }
}
```

- if双选  if-else

```java
package net.if_structure;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        //考试分数大于60分及格,小于60分不及格.
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入分数");
        double score=scanner.nextDouble();
        if(score>60){
            System.out.println("及格了");
        }else {
            System.out.println("不及格");
        }
        scanner.close();
    }
}
```

- if多选

```java
package net.if_structure;
import java.util.Scanner;
/**
 * 成绩评级程序
 * 功能：根据输入的成绩输出对应的评级
 */
public class Demo03 {
    public static void main(String[] args) {
        // 创建Scanner对象用于接收用户输入
        Scanner scanner = new Scanner(System.in);
                // 提示用户输入成绩
        System.out.print("请输入成绩(0-100)：");
                // 读取用户输入的成绩，使用int类型更符合实际评分场景
        int score = scanner.nextInt();
                /*
         * 成绩评级逻辑：
         * 1. 先判断满分情况
         * 2. 然后按从高到低的顺序判断各分数段
         * 3. 使用>=可以包含边界值，并简化条件判断
         * 4. 最后处理不合法的负分数
         */
        if (score == 100) {
            // 满分特殊处理
            System.out.println("满分");
        } else if (score >= 90) {
            // 90-99分为A级
            System.out.println("A");
        } else if (score >= 80) {
            // 80-89分为B级
            System.out.println("B");
        } else if (score >= 70) {
            // 70-79分为C级
            System.out.println("C");
        } else if (score >= 60) {
            // 60-69分为D级
            System.out.println("D");
        } else if (score >= 0) {
            // 0-59分为不及格
            System.out.println("不及格");
        } else {
            // 处理负数等非法输入
            System.out.println("成绩错误：成绩不能为负数");
        }
        // 关闭Scanner对象释放资源
        scanner.close();
    }
}
```

- 嵌套的if结构

```java
package net.if_structure;
import java.util.Scanner;
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input");
        int x=scanner.nextInt() ;
        if(x>=60){
            if(x>=100){
                System.out.println("满分");
            }
            System.out.println("及格");
        }
        scanner.close();
    }
}
```

- switch多选结构

  - switch case 语句判断一个变量与一系列值中某个值是否相等,每个值称为一个分支.

  - switch 语句中的变量类型可以是

    - byte,short,int或者char

    ```java
    package net.switch_structure;
    public class Demo01 {
        public static void main(String[] args) {
            //case 穿透
            char grade= 'b';
            switch (grade){
                case 'a':
                    System.out.println("优秀");
                    break;
                case 'b':
                    System.out.println("良好");
                    break;
                case 'c':
                    System.out.println("及格");
                    break;
                case 'd':
                    System.out.println("不及格");
                    break;
                default:
                    System.out.println("错误");
            }
        }
    }
    ```

    - 从java SE7开始
    - 支持字符串String类型
    - 同时case标签必须为字符串常量或字母量.

```java
package net.switch_structure;
public class Demo02 {
    public static void main(String[] args) {
        String name= "刘德华";
        switch (name){
            case "刘德华":
                System.out.println("天王");
                break;
            case "张学友":
                System.out.println("歌神");
                break;
            default:
                System.out.println("屌丝");
        }
    }
}
```

## 循环结构

- while

  ```jav
  while(布尔表达式){
  	// 循环内容
  }
  ```

  - 只要布尔表达式为true,循环就会执行

    ```java
    package net.cycle;
    
    /**
     * while循环结构演示类
     * 功能：
     *   1. 输出1-100的数字
     *   2. 计算1-100的累加和
     */
    public class while_Demo {
        public static void main(String[] args) {
            // 示例1：输出1-100的数字
            int i = 1;  // 初始化计数器，从1开始更符合业务需求
            while (i <= 100) {
                System.out.println("当前数字: " + i);
                i++;    // 计数器递增（原代码将i++放在前面会导致先自增后输出，会输出2-101）
            }
    
            // 调用累加方法
            calculateSum();
        }
    
        /**
         * 计算1-100的累加和
         * 修正说明：
         *   1. 原方法缺少i++导致无限循环
         *   2. 输出逻辑优化，只在最后输出结果
         */
        public static void calculateSum() {
            int i = 1;      // 计数器
            int sum = 0;    // 累加器
    
            while (i <= 100) {
                sum += i;   // 累加当前值
                i++;        // 原代码缺少这行会导致无限循环
            }
    
            System.out.println("1-100的累加和: " + sum);  // 最终只输出一次结果
        }
    }
    
    ```

    

- do...while

  -  do...while 先执行在循环

  ```java
  package net.cycle;
  public class do_while {
      public static void main(String[] args) {
          int i=0;
          int sum=0;
          do {
              sum+=i;
              i++;
          }while (i<=100);
          System.out.println("sum="+sum);
          System.out.println(i);
      }
  }
  ```

- for

  - 是一种支持迭代的一种通用结构,是最有效,最灵活的循环结构.

  - 执行的次数是在执行前就确定的,语法格式

    ```java
    for(初始化;布尔表达式;更新){
        //代码语句
    }
    ```

    ```java
    package net.cycle;
    public class for_structure {
        public static void main(String[] args) {
            //  初始化值;  判断; 迭代
            for(int i=1; i<=100;i+=2){
                System.out.println("sum="+i);
            }
            System.out.println("cycle end");
            // for (; ; ) {}
            dome01();
            demo02();
            add99();
        }
        public static void dome01(){
            // 计算0到100之间的奇数和偶数的和
            int oddSum =0;
            int evenSum = 0;
            for (int i = 0; i <= 100; i++) {
                if(i%2!=0){
                    oddSum+=i;
                }else {
                    evenSum+=i;
                }
            }
            System.out.println("odd="+oddSum);
            System.out.println("even="+evenSum);
        }
        public static void demo02(){
            //输出1-1000之间能被5整除的数,并且每行输出3个
            for (int i = 1; i <= 1000; i++) {
                if(i%5==0){
                    System.out.print(i+"\t");
                }
                if(i%(15)==0){
                    System.out.println();
                    //System.out.println("\n");
                }
            }
            System.out.println();
        }
        public static  void add99(){
            //打印9*9乘法表
            for (int j = 1; j <= 9; j++) {
                for (int i = 1; i <= j; i++) {
                    System.out.print(i+"*"+j+"="+(j*i)+("\t"));
                }
                System.out.println();
            }
        }
    }
    ```

  - 增强for循环,主要用于数组或集合的循环,语法如下

  - ```java
    for(声明语句:表达式){
        // 代码句子
    }
    ```

## break & continue

- break (中断,跳出当前循环)

  ```java
  package net.cycle;
  public class break_structure {
      public static void main(String[] args) {
          int i=0;
          while (i<=100){
              i++;
              System.out.println(i);
              if(i==30){
                  break;
              }
          }
          System.out.println("vvv");
      }
  }
  ```

- continue (跳过当前条件,继续循环)

  ```java
  package net.cycle;
  public class continue_structure {
      public static void main(String[] args) {
          int i=0;
          while (i<100){
              i++;
              if(i%10==0){
                  System.out.println("");
                  continue;
              }
              System.out.print(i);
          }
      }
  }
  ```

- goto

  ```java
  package net.cycle;
  public class goto_structure {
      public static void main(String[] args) {
          outer: for (int i=100;i<=150;i++){
              for (int j=2;j<= Math.sqrt(i);j++){
                  if(i%j==0){
                      continue outer;
                  }
             }
              System.out.print(i+" = ");
          }
      }
  }
  ```

## 练习

- 打印三角形

  ```java
  package net.cycle;
  public class test {
      public static void main(String[] args) {
          for (int i = 1; i <= 5; i++) {
              for (int j = 5; j >= i; j--) {
                  System.out.print(" ");
              }
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              for (int j = 1; j < i; j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
      }
  }
  ```

  



 

