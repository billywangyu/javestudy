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
