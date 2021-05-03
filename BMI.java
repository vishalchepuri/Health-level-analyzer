package com.vishal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class BMI extends JFrame {

    BMI() {
        JFrame f = new JFrame();

        JLabel lb1 = new JLabel("Height(in cm):");
        lb1.setBounds(20, 20, 100, 40);
        f.add(lb1);

        JLabel lb2 = new JLabel("Weight(in kg):");
        lb2.setBounds(20, 60, 100, 40);
        f.add(lb2);

        JLabel lbResult = new JLabel("BMI Calculator in JAVA GUI");
        lbResult.setBounds(20, 90, 300, 40);
        f.add(lbResult);


        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        f.add(txtHeight);

        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);
        f.add(txtWeight);

        JButton btn = new JButton("Submit");
        btn.setBounds(20, 130, 300, 40);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());
                height = height*0.01;
                double bmi = weight/(height*height);
                if (bmi < 18.5) {
                    lbResult.setText("underweight - BMI : "+bmi);
                } else if (bmi < 25) {
                    lbResult.setText("normal - BMI : "+bmi);
                } else if (bmi < 30) {
                    lbResult.setText("overweight - BMI : "+bmi);
                } else {
                    lbResult.setText("obese - BMI : "+bmi);
                }
            }
        });

        f.add(btn);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

}