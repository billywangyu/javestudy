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
