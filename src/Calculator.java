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

        sumButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        funcButton[0] = sumButton;
        funcButton[1] = subButton;
        funcButton[2] = mulButton;
        funcButton[3] = divButton;
        funcButton[4] = decButton;
        funcButton[5] = equButton;
        funcButton[6] = delButton;
        funcButton[7] = clrButton;
        funcButton[8] = negButton;

        for(int i =0;i<9;i++) {
            funcButton[i].addActionListener(this);
            funcButton[i].setFocusable(false);
        }

        for(int i =0;i<10;i++) {
            funcButton[i] = new JButton(String.valueOf(i));
            funcButton[i].addActionListener(this);
            funcButton[i].setFocusable(false);
        }

        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(numbButtons[1]);
        panel.add(numbButtons[2]);
        panel.add(numbButtons[3]);
        panel.add(sumButton);
        panel.add(numbButtons[4]);
        panel.add(numbButtons[5]);
        panel.add(numbButtons[6]);
        panel.add(subButton);
        panel.add(numbButtons[7]);
        panel.add(numbButtons[8]);
        panel.add(numbButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numbButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
