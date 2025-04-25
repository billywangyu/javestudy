package awt;

import java.awt.*;
public class frames {
    public static void main(String[] args) {
        final Frames frames1 = new Frames(100, 100, 200, 300, Color.blue);
        final Frames frames2 = new Frames(400, 100, 200, 300, Color.red);
        final Frames frames3 = new Frames(700, 100, 200, 300, Color.black);
        final Frames frames4 = new Frames(1000, 100, 200, 300, Color.orange);
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
