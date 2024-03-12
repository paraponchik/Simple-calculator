package operations;

import javax.swing.*;

public class SumButton extends JButton{
    public SumButton(){
        super("+");
        setBounds(190,70,50, 50);
        addActionListener(e -> JOptionPane.showMessageDialog(null,"Плюсую"));
    }
}
