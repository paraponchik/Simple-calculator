import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numbButtons = new JButton[10];
    JButton[] funcButton = new JButton[9];
    JButton sumButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton, percentButton, degreeButton;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 380);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);



        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
