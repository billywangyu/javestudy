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
