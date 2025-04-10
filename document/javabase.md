## 创建Hello

1. 新建项目，创建后src目录下建立.class文件
2. 快捷首字母输入psvm，sout
3. click run

## 注释

1. 创建空项目（注意大小写）

2. 新建module（模块）添加名称 注意大小写 创建

3. 点击文件菜单,选择项目结构,sdk更改为当前使用的java版本,语言版本对应选择8

4. // 单独设置注释,修改设置文件-编辑器--配色方案--java--修改对应配置

5. /*   注释体 */ 多行注释

6. ```java
   /**
    *  JavaDoc:文档注释
    * @Descriptipn 
    */   
   ```

## 标识符

1. 所有的标识符因该以字母,美元或下划线
2. 首字母之后可以是字母,美元,下划线或数字的任何组合
3. 不可以用保留字
4. 大小写十分敏感

## 数据类型

强类型语言_严格符合规定,所有变量都必须定以后才能使用

1. 基本类型(primitive type)

   - 数值类型    0000.0000 8位=一个字节 1bit=1位 

     - 整数类型  byte//一个字节  short//两个字节    int // 4个字节最常用   32位  long //8个字节要在数字后面加一个L 64位
     - 浮点类型  float //4个字节,数字后面加一个F  double//8个字节
     - 字符类型  char //两个字节,只能赋一个字

     ```java
     public class Demo03 {
         public static void main(String[] args) {
             // 整数拓展:    进制    二进制0b   十进制   八进制0   十六进制0x
             int i = 10;
             int i2 = 010;
             int i3 = 0x10;
             System.out.println(i);
             System.out.println(i2);
             System.out.println(i3);
             System.out.println("==========================================================");
             // 浮点数拓展   float  有限数 离散 舍入误差 大约 接近但不等于   最后不使用浮点数比较
             // double
             float f = 0.1f;
             double d =0.1;
             System.out.println(f==d);
             System.out.println(f);
             System.out.println(d);
             // 字符拓展   字符集的本质还是数字 字符编码 Unicode  '\u0061'   字符转义 \t=tab  \n=换行
             char c1='中';
             char c2 ='a';
             char c3='\u0061';
             System.out.println((int)c2); //强制转换
             System.out.println(c1);
             System.out.println(c3);
             System.out.println("Hello\tWorld");
             System.out.println("Helld\nWorld");
             //boolean 拓展
             boolean flag=true;
             if (flag){
                 
             }
         }
     }
     
     ```

     

   - boolean类型   true false //占一位

2. 引用类型(reference type)   ***String***

   - 类 
   - 接口
   - 数组

## 类型转换 

​	java是强类型语言,所以要运算的时候,需要类型转换.

``` java
低 ----------------------------------------------------> 高
byte, short, char ->  int ->  long -> float -> double
```

运算中,不同类型的数据先转化为同一类型,然后进行运算.

- 强制类型转换

  注意点:  

  1. 不能对布尔值进行转换
  2. 不能把对象类型转换为不相干的类型
  3. 在把高容量转换到低容量的时候,强制转换
  4. 转换的时候可能存在内存溢出,或精度问题.

  ``` java
  public class Demo04 {
      public static void main(String[] args) {
          int i=128;
          byte b=(byte) i ; //内存溢出  byte最大127
          // 强制类型转换 (类型)变量名  高--->低
          double d= i;   //自动转换      低--->高
  
          System.out.println(b);
          System.out.println(d);
          System.out.println("=================================================");
          System.out.println((int)23.7);    //存在内存溢出,或精度问题.
          System.out.println((int)-45.89f);
          System.out.println("=================================================");
          char c='a';
          int s=c+1;
          System.out.println(s);
          System.out.println((char)s);
         // 操作比较大的数的时候,注意溢出问题   JDK  数字之间可以用下划线分割
          int money = 10_0000_0000;
          int years = 20;
          int total = money*years;// -1474836480 计算溢出
          long total1=money*years; // 转换之前已经出现问题,因为默认原始是int
          long total2=money*(long)years;//先转换一个数为long
          System.out.println(total2);
      }
  }
  
  ```

  

- 自动类型转换

## 变量

Java是强类型语言,每个变量都有必须声明其类型.  要包括变量名,变量类型和作用域.

```java
      type varName [=value] [{,varName[=value]}];
     //数据类型  变量名 = 值;  可以使用逗号隔开来声明多个同类型变量.
```

注意事项

- 每个变量都有类型,类型可以是基本类型.也可以是引用类型.
- 变量名必须是合法的标识符
- 变量声明是一条完整的语句,因此每一个声明都必须以分号结束.

```java
public class Demo07 {
    public static void main(String[] args) {
        // int 尽量单独一行,基本类型可忽略
        int a=1 ,b=2,c=3;
        //引用类型
        String name="billy";
        char x='x';
        double pi=3.1415926;
        System.out.println();
    }
}
```

## 变量作用域

- 类变量
- 实例变量
- 局部变量

```java
public class Demo08 {
    //类变量 static
    static double salary=2500;
    // 属性 : 变量
    // 实例变量:从属于对象;如果不进行初始化,这个类型的默认值
    // 布尔值:默认是false
    // 除了基本类型,其余的都是null
    String name;
    int age;
    // main 方法
    public static void main(String[] args) {
        // 局部变量: 必须声明和初始化值
        int i=10;
        System.out.println(i);
        //变量类型  变量名称=new Demo08()
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);
        System.out.println(demo08.name);
        //类变量 static
        System.out.println(salary);
    }
    //其他方法
    public  void add(){
        //System.out.println(i);
    }
}
```

## 常量

常量(Constant):初始化(initialize)后不能在改变的值, 常量名一般使用大写字符.

```java
public class Demo09 {
    // 修饰符,不区分先后顺序   final  static 一样ok
    static final double PI=3.1415926;
    public static void main(String[] args) {
        System.out.println(PI);
    }
}
```

## 变量的命名规则

- 所有变量,方法,类名:见名知意
- 类成员变量:首字母小写和驼峰原则 :monthSalary 除了第一个单词以外,后面的单词首字母大写
- 局部变量:首字母小写和驼峰原则
- 常量:大写字母和下划线: MAX_VALUE
- 类名:首字母大写和驼峰原则:Man,GoodMan
- 方法名:首字母小写和驼峰原则:run(),runRun()

## 包机制

----------------------------------------------------------------------------

## JavaDoc

javadoc命令是用来生成自己API文档的

- 参数信息
  - @author  作者名
  - @version  版本号
  - @since  指明需要最早使用的jdk版本
  - @param  参数名
  - @return  返回值情况
  - @throws  异常抛出情况

```java
javadoc -encoding UTF-8 -charset UTF-8 Doc.java
```



