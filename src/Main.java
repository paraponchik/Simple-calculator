import operations.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 350);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //Function

        //First column
        JButton sumButton = new SumButton();
        JButton subButton = new SubtractionButton();
        JButton equalButton = new EqualsButton();
        JButton multiButton = new MultiplicationButton();
        JButton divideButton = new DivideButton();

        frame.add(sumButton);
        frame.add(subButton);
        frame.add(equalButton);
        frame.add(multiButton);
        frame.add(divideButton);

        //Second column
        JButton percentButton = new PersentButton();
        JButton delOneButton = new DelOneButton();
        JButton delAllButton = new DelAllButton();
        JButton lvlButton = new LvlButton();

        frame.add(delOneButton);
        frame.add(delAllButton);
        frame.add(percentButton);
        frame.add(lvlButton);

        //Numbers
        JTextField textField = new JTextField();
        textField.setBounds(10,10,230, 50);
        textField.setEditable(false);

        JButton oneBut = new JButton("1");
        oneBut.setBounds(10,70,50, 50);
        oneBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("1");
            }
        });

        JButton twoBut = new JButton("2");
        twoBut.setBounds(70,70,50, 50);
        JButton threeBut = new JButton("3");
        threeBut.setBounds(130,70,50, 50);
        JButton fourBut = new JButton("4");
        fourBut.setBounds(10,130,50, 50);
        JButton fifeBut = new JButton("5");
        fifeBut.setBounds(70,130,50, 50);
        JButton sixBut = new JButton("6");
        sixBut.setBounds(130,130,50, 50);
        JButton sevenBut = new JButton("7");
        sevenBut.setBounds(10,190,50, 50);
        JButton eightBut = new JButton("8");
        eightBut.setBounds(70,190,50, 50);
        JButton nineBut = new JButton("9");
        nineBut.setBounds(130,190,50, 50);
        JButton zeroBut = new JButton("0");
        zeroBut.setBounds(10,250,110, 50);
        JButton commaBut = new JButton(",");
        commaBut.setBounds(130,250,50, 50);

        frame.add(textField);
        frame.add(oneBut);
        frame.add(twoBut);
        frame.add(threeBut);
        frame.add(fourBut);
        frame.add(fifeBut);
        frame.add(sixBut);
        frame.add(sevenBut);
        frame.add(eightBut);
        frame.add(nineBut);
        frame.add(zeroBut);
        frame.add(commaBut);

        frame.setVisible(true);
    }
}
