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