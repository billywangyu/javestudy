package awt;
import java.awt.*;
import java.awt.event.*;

public class AWTGraphicsDemo extends Frame {
    public AWTGraphicsDemo() {
        super("Java AWT 绘图");
        setSize(400, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // 画一条红线
        g.setColor(Color.RED);
        g.drawLine(50, 50, 200, 50);

        // 画一个绿色矩形
        g.setColor(Color.GREEN);
        g.drawRect(50, 80, 150, 100);

        // 填充蓝色圆
        g.setColor(Color.BLUE);
        g.fillOval(250, 80, 100, 100);

        // 显示文字
        g.setColor(Color.BLACK);
        g.setFont(new Font("Consolas", Font.BOLD, 16));
        g.drawString("Java AWT 绘图示例", 100, 220);
    }

    public static void main(String[] args) {
        new AWTGraphicsDemo();
    }
}
