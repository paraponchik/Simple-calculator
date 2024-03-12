package operations;

import javax.swing.*;

public class DelAllButton extends JButton {
    public DelAllButton(){
        super("C");
        setBounds(250,70,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"блять милион двесте на балансе"));
    }
}
