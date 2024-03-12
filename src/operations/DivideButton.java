package operations;

import javax.swing.*;

public class DivideButton extends JButton {
    public DivideButton(){
        super("/");
        setBounds(190,250,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Хомик, яки курва файны"));
    }
}
