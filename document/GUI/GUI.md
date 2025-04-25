

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

## Swing



### 

