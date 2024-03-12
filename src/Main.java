import operations.*;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
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

        NumberFormatter formatter = new NumberFormatter();
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);

        //Text view
        JFormattedTextField textField = new JFormattedTextField(formatter);
        textField.setBounds(10,10,230, 50);
        textField.setEditable(false);

        //Function

        //First column
        JButton sumButton = new SumButton();
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = (int) textField.getValue();
                textField.setValue(currentValue + "+");
            }
        });

        JButton subButton = new SubtractionButton();
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "-");
            }
        });


        JButton multiButton = new MultiplicationButton();
        multiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "*");
            }
        });

        JButton divideButton = new DivideButton();
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "/");
            }
        });

        frame.add(sumButton);
        frame.add(subButton);
        frame.add(multiButton);
        frame.add(divideButton);

        //Second column

        JButton percentButton = new PersentButton();
        JButton delOneButton = new DelOneButton();
        JButton delAllButton = new DelAllButton();
        delAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setValue(0);
            }
        });
        JButton lvlButton = new LvlButton();

        JButton equalButton = new EqualsButton();
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = (int) textField.getValue();
                textField.setValue(currentValue);
            }
        });

        frame.add(delOneButton);
        frame.add(delAllButton);
        frame.add(percentButton);
        frame.add(lvlButton);
        frame.add(equalButton);

        //Numbers

        JButton oneBut = new JButton("1");
        oneBut.setBounds(10,70,50, 50);
        oneBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = (int) textField.getValue();
                textField.setValue(currentValue + 1);
            }
        });

        JButton twoBut = new JButton("2");
        twoBut.setBounds(70,70,50, 50);
        twoBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "2");
            }
        });

        JButton threeBut = new JButton("3");
        threeBut.setBounds(130,70,50, 50);
        threeBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "3");
            }
        });

        JButton fourBut = new JButton("4");
        fourBut.setBounds(10,130,50, 50);
        fourBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "4");
            }
        });

        JButton fifeBut = new JButton("5");
        fifeBut.setBounds(70,130,50, 50);
        fifeBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "5");
            }
        });

        JButton sixBut = new JButton("6");
        sixBut.setBounds(130,130,50, 50);
        sixBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "6");
            }
        });

        JButton sevenBut = new JButton("7");
        sevenBut.setBounds(10,190,50, 50);
        sevenBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "7");
            }
        });

        JButton eightBut = new JButton("8");
        eightBut.setBounds(70,190,50, 50);
        eightBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "8");
            }
        });

        JButton nineBut = new JButton("9");
        nineBut.setBounds(130,190,50, 50);
        nineBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "9");
            }
        });

        JButton zeroBut = new JButton("0");
        zeroBut.setBounds(10,250,110, 50);
        zeroBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                textField.setText(currentValue + "0");
            }
        });

        JButton commaBut = new JButton(".");
        commaBut.setBounds(130,250,50, 50);
        commaBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentValue = textField.getText();
                if (currentValue.contains(".")){
                    JOptionPane.showMessageDialog(null, "Хомик! Алэ яки курва файны");
                } else {
                    textField.setText(currentValue + ".");
                }
            }
        });

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
