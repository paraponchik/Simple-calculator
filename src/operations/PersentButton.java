package operations;

import javax.swing.*;

public class PersentButton extends JButton {
    public PersentButton(){
        super("%");
        setBounds(250,130,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Ыгыг ыгыгыгыгыгыг"));
    }
}
