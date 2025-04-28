package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Action_event_shart {
    public static void main(String[] args) {
        final Frame frame = new Frame("按钮共用");
        final Button button1 = new Button("start");
        final Button button2 = new Button("stop");
        //设置按钮自定义显示
        button2.setActionCommand("button-stop");
        final MyAction_listen myActionListen = new MyAction_listen();
        // 多个按钮共用一个监听
        button1.addActionListener(myActionListen);
        button2.addActionListener(myActionListen);
        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.EAST);
        frame.setBounds(200,200,300,300);
        frame.setVisible(true);
        close(frame);
    }
    public static void close(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
// 设置公用的类,调用一个方法
class MyAction_listen implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
//        e.getActionCommand() 获取按钮title
        System.out.println("button:=>"+e.getActionCommand());
        if (e.getActionCommand().equals("start")){

        }

    }
}