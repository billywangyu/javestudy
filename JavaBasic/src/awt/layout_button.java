package awt;

import java.awt.*;

public class layout_button {
    public static void main(String[] args) {
        final Frame frame = new Frame();
        frame.setBackground(Color.cyan);
        frame.setBounds(200,200,600,300);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
          // 4 panel
        final Panel panel1 = new Panel(new BorderLayout());
        final Panel panel2 = new Panel(new GridLayout(2,1));
        final Panel panel3 = new Panel(new BorderLayout());
        final Panel panel4 = new Panel(new GridLayout(2,2));
         // up
        panel1.add(new Button("a"),BorderLayout.WEST);
        panel1.add(new Button("b"),BorderLayout.EAST);
        panel2.add(new Button("c"));
        panel2.add(new Button("d"));
        panel1.add(panel2,BorderLayout.CENTER);

        //down
        panel3.add(new Button("f"),BorderLayout.WEST);
        panel3.add(new Button("g"),BorderLayout.EAST);
        for (int i = 1; i < 5; i++) {
            panel4.add(new Button("l"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);
        frame.add(panel1);
        frame.add(panel3);
//        frame.pack();












    }
}
