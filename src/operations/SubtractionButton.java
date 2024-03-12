package operations;

import javax.swing.*;

public class SubtractionButton extends JButton {
    public SubtractionButton(){
        super("-");
        setBounds(190,130,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Минусую"));
    }
}
