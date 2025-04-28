

## AWT

### Awt 介绍

1. 包含了很多类和接口; GUI

2. 元素:窗口,按钮,文本框

3. java.awt

   |          | 组件 Component                                 |             |              |           |        |
   | :------- | ---------------------------------------------- | ----------- | ------------ | --------- | ------ |
   | button   | <------------------存在在容器中add------------ | ----------- | -----------> | Container |        |
   | TextAtea |                                                | window      |              |           | Panel  |
   | Label    |                                                |             |              |           |        |
   | .....    | Frame                                          |             | Dialog       |           | Applet |

```java
package awt;

import java.awt.*;
public class frame {
    public static void main(String[] args) {
        //Frame,jdk   view src code
        final Frame frame = new Frame("my java first gui");
        //为了窗口显示到桌面,设在可见性
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(800,500);
        // 设置颜色
        frame.setBackground(new Color(242, 126, 126));
        // 设置弹出的初始位置
        frame.setLocation(255,300);
        //set 大小固定
        frame.setResizable(false);
    }
}
```

### 封装Awt

```java
package awt;

import java.awt.*;
public class frames {
    public static void main(String[] args) {
        final Frames frames1 = new Frames(100, 100, 200, 300, Color.blue);
        final Frames frames2 = new Frames(100, 400, 200, 300, Color.red);
        final Frames frames3 = new Frames(400, 100, 200, 300, Color.black);
        final Frames frames4 = new Frames(400, 400, 200, 300, Color.orange);
    }
}
class Frames extends Frame {
    static int id = 0;  //可能存在多个窗口

    public Frames(int x,int y,int w,int h,Color color) throws HeadlessException {
        super("Myframes:"+(++id));
        //为了窗口显示到桌面,设在可见性
        setVisible(true);
        //设置窗口大小 初始位置
        setBounds(x,y,w,h);
        // 设置颜色
        setBackground(color);
        //set 大小固定
        setResizable(false);
    }
}
```

### panel

```java
package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panel {
    public static void main(String[] args) {
        final Frame frame = new Frame();
        // 布局的概念
        final Panel panel = new Panel();

        //frame设置布局
        frame.setLayout(null);
        frame.setBounds(200,200,800,500);
        frame.setResizable(false);
        frame.setVisible(true);
        //set panel layout
        panel.setBounds(50,50,700,400);
        panel.setBackground(new Color(112, 237, 179));
//        panel.setVisible(true);
        //添加panel to frame
        frame.add(panel);
        //监听端口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });
    }
}
```

### 布局管理群

1. flowl布局

```java
package awt;

import java.awt.*;

public class layout {
    public static void main(String[] args) {
        final Frame frame = new Frame();
        //组件--按钮
        final Button button1 = new Button("west");
        final Button button2 = new Button("east");
        final Button button3 = new Button("south");
        final Button button4 = new Button("north");
        //设置flowl布局
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(200,200,600,300);
        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
    }
}
```

1. W.E.S.N.C.布局

```java
package awt;

import java.awt.*;

public class layout {
    public static void main(String[] args) {
        final Frame frame = new Frame("layout");
        //组件--按钮
        final Button button1 = new Button("esst");
        final Button button2 = new Button("west");
        final Button button3 = new Button("south");
        final Button button4 = new Button("north");
        final Button button5 = new Button("center");
        //设置flowl布局
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(200,200,600,300);
        frame.setVisible(true);
        frame.add(button1,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);
        frame.add(button3,BorderLayout.SOUTH);
        frame.add(button4,BorderLayout.NORTH);
        frame.add(button5,BorderLayout.CENTER);
    }
}
```

1. grid

```java
package awt;

import java.awt.*;

public class layout {
    public static void main(String[] args) {
        final Frame frame = new Frame("layout");
        //组件--按钮
        final Button button1 = new Button("esst");
        final Button button2 = new Button("west");
        final Button button3 = new Button("south");
        final Button button4 = new Button("north");
        final Button button5 = new Button("center");
        //设置flowl布局
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));  flowl
        frame.setLayout(new GridLayout(3,2));     //grid
        frame.setBounds(200,200,600,300);
        frame.setVisible(true);
//        frame.add(button1,BorderLayout.EAST);
//        frame.add(button2,BorderLayout.WEST);
//        frame.add(button3,BorderLayout.SOUTH);
//        frame.add(button4,BorderLayout.NORTH);
//        frame.add(button5,BorderLayout.CENTER);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.pack();  //java 函数  自动填充
   }
}
```

### 布局应用 ***按钮布局***

```java
package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class layout_button {
    public static void main(String[] args) {
        final Frame frame = new Frame();
        frame.setBackground(Color.cyan);
        frame.setBounds(200,200,600,300);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
          // 4 panel
        final Panel panel1 = new Panel(new BorderLayout());
        final Panel panel2 = new Panel(new GridLayout(2,1));
        final Panel panel3 = new Panel(new BorderLayout());
        final Panel panel4 = new Panel(new GridLayout(2,2));
         // up
        panel1.add(new Button("a"),BorderLayout.WEST);
        panel1.add(new Button("b"),BorderLayout.EAST);
        panel2.add(new Button("c"));
        panel2.add(new Button("d"));
        panel1.add(panel2,BorderLayout.CENTER);

        //down
        panel3.add(new Button("f"),BorderLayout.WEST);
        panel3.add(new Button("g"),BorderLayout.EAST);
        for (int i = 1; i < 5; i++) {
            panel4.add(new Button("l"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);
        frame.add(panel1);
        frame.add(panel3);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
```

### 事件 event

```java
package awt;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEvent {
    public static void main(String[] args) {
        final Frame frame = new Frame("actionevent");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        final Button button = new Button("aaa");
        // 定义一个事件的类,调用他 继承至ActionListener
        final MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);
        frame.add(button,BorderLayout.WEST);
        frame.setBounds(200,200,300,500);
        frame.setVisible(true);
        windowClose(frame);

    }
    //关闭窗体事件的方法
    public static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
//继承接口文件  生成类 用于添加按钮可调用的方法
class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("hello");
    }
}
```

### 输入框

```java
package awt;

import javafx.geometry.Bounds;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text_field {
    public static void main(String[] args) {
        //启动
        new Mytext();
    }
}
class Mytext extends Frame{
    public Mytext(){
        // 明确使用 java.awt.TextField
        TextField textField = new TextField("");

        // 设置布局（默认BorderLayout）
        add(textField);

        // 设置窗口属性
        setBounds(200,200,300,500);
        setVisible(true);
        final Myfield myfield = new Myfield();

        textField.addActionListener(myfield);
        textField.setEchoChar('*');

    }
}
class Myfield implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        final TextField source = (TextField) e.getSource();
        System.out.println(source.getText());
        source.setText("");
    }
}
```

### 简易计算器 ***组合大于继承***

- oop原则:组合,大于继承!

```java
class A extends B{
    
}
class A{
    public B b;
}
```

```java
package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    public static void main(String[] args) {
        new MyCalc();
    }
}
//计算器界面
class MyCalc extends Frame{
    public MyCalc() throws HeadlessException {
        //3个文本框
        final TextField textField1 = new TextField(10);//字符数
        final TextField textField2 = new TextField(10);
        final TextField textField3 = new TextField(20);
        //一个按钮
        final Button button = new Button("sum");
        //两个标签
        final Label label1 = new Label("+");
        final Label label2 = new Label("=");

        setLayout(new FlowLayout());
        add(textField1);
        add(label1);
        add(textField2);
        add(label2);
        add(button);
        add(textField3);
        setBounds(200,200,300,500);
        setVisible(true);

        button.addActionListener(new MyListen(textField1,textField2,textField3));
    }
}
//事件监听
class MyListen implements ActionListener {
    //获取三个变量
    private TextField textField1,textField2,textField3;
    public MyListen(TextField textField1,TextField textField2,TextField textField3) {
        this.textField1=textField1;
        this.textField2=textField2;
        this.textField3=textField3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //获得加数和被加数
        final int text1 = Integer.parseInt(textField1.getText());//强制转换
        final int text2 = Integer.parseInt(textField2.getText());
        /* 将这个值 加法运算 后放到最后一个框 */
        textField3.setText(String.valueOf(text1+text2));//强制转换
        textField1.setText("");
        textField2.setText("");
    }
}
```

- 使用获取类--面向对象的思想

```java
package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    public static void main(String[] args) {
        new MyCalc();
    }
}
//计算器界面
class MyCalc extends Frame{
    //提取属性
    TextField textField1,textField2,textField3;
    //提取方法
    public MyCalc() throws HeadlessException {
        //3个文本框
        textField1 = new TextField(10);//最大字符数
        textField2 = new TextField(10);
        textField3 = new TextField(20);
        //一个按钮
        final Button button = new Button("sum");
        //两个标签
        final Label label1 = new Label("+");
        final Label label2 = new Label("=");

        setLayout(new FlowLayout());
        add(textField1);
        add(label1);
        add(textField2);
        add(label2);
        add(button);
        add(textField3);
        setBounds(200,200,300,500);
        setVisible(true);

        button.addActionListener(new MyListen(this));//添加自己
    }
}
//事件监听
class MyListen implements ActionListener {
    //获取计算器这个对象,在一个类中组合另外一个类
    MyCalc myCalc =null;

     public MyListen(MyCalc myCalc) {
         this.myCalc=myCalc;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //获得加数和被加数
        final int text1 = Integer.parseInt(myCalc.textField1.getText());
        final int text2 = Integer.parseInt(myCalc.textField2.getText());
//        final int text1 = Integer.parseInt(textField1.getText());//强制转换
//        final int text2 = Integer.parseInt(textField2.getText());
        /* 将这个值 加法运算 后放到最后一个框 */
        myCalc.textField3.setText(String.valueOf(text1+text2));//强制转换
        myCalc.textField1.setText("");
        myCalc.textField2.setText("");
    }
}
```

- 使用内部类---简化代码量

```java
package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    public static void main(String[] args) {
        new MyCalc();
    }
}
//计算器界面
class MyCalc extends Frame{
    //提取属性
    TextField textField1,textField2,textField3;
    //提取方法
    public MyCalc() throws HeadlessException {
        //3个文本框
        textField1 = new TextField(10);//最大字符数
        textField2 = new TextField(10);
        textField3 = new TextField(20);
        //一个按钮
        final Button button = new Button("sum");
        //两个标签
        final Label label1 = new Label("+");
        final Label label2 = new Label("=");

        setLayout(new FlowLayout());
        add(textField1);
        add(label1);
        add(textField2);
        add(label2);
        add(button);
        add(textField3);
        setBounds(200,200,300,500);
        setVisible(true);

        button.addActionListener(new MyListen());//添加自己
    }
    //事件监听   使用内部类--可以直接访问外部类的属性和方法
    private class MyListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //获得加数和被加数
            final int text1 = Integer.parseInt(textField1.getText());
            final int text2 = Integer.parseInt(textField2.getText());
            /* 将这个值 加法运算 后放到最后一个框 */
            textField3.setText(String.valueOf(text1+text2));//强制转换
            textField1.setText("");
            textField2.setText("");
        }
    }
}

```



## Swing



### 

