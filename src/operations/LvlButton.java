package operations;

import javax.swing.*;

public class LvlButton extends JButton {
    public LvlButton(){
        super("^2");
        setBounds(250,190,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Что за бизнес сука!"));
    }
}
