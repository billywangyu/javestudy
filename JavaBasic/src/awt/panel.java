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
