package operations;

import javax.swing.*;

public class DelOneButton extends JButton {
    public DelOneButton(){
        super("<-");
        setBounds(250,10,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Пингвин астрияцки"));
    }
}
