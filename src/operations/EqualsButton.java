package operations;

import javax.swing.*;

public class EqualsButton extends JButton {
    public EqualsButton(){
        super("=");
        setBounds(250,250,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"ЕЕееее бади"));
    }
}
