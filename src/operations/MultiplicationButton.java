package operations;

import javax.swing.*;

public class MultiplicationButton extends JButton {
    public MultiplicationButton(){
        super("*");
        setBounds(190,190,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Курва ракетааааа"));
    }
}
