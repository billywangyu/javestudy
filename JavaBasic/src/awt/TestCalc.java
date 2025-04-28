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
