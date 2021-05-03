package com.vishal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BP extends JFrame {

    BP() {
        JFrame f = new JFrame();

        JLabel lb1 = new JLabel("BP(diastolic):");
        lb1.setBounds(20, 20, 100, 40);
        f.add(lb1);

        JLabel lb2 = new JLabel("BP(systolic) :");
        lb2.setBounds(20, 60, 100, 40);
        f.add(lb2);

        JLabel lbResult = new JLabel("Result");
        lbResult.setBounds(20, 90, 300, 40);
        f.add(lbResult);

        JTextField txtdiastolic = new JTextField("");
        txtdiastolic.setBounds(120, 20, 200, 40);
        f.add(txtdiastolic);

        JTextField txtsystolic = new JTextField("");
        txtsystolic.setBounds(120, 60, 200, 40);
        f.add(txtsystolic);

        JButton btn = new JButton("Submit");
        btn.setBounds(20, 130, 300, 40);
        
        
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                int diastolic=Integer.parseInt(txtdiastolic.getText());
                int systolic=Integer.parseInt(txtsystolic.getText());
                int diastolic1 = diastolic;
                int systolic1 = systolic;
                if (diastolic<=80 && systolic<=120) {
                    lbResult.setText("Your Blood pressure is normal");
                } else if (diastolic>80 && systolic>120 && diastolic1<=89 && systolic1<=139) {
                    lbResult.setText("Your Blood pressure is Elevated");
                } else if (diastolic>=90 && systolic>=140) {
                    lbResult.setText("You are having High Blood Pressure (hypertension)");
                } else {
                    lbResult.setText("Entered values or wrong");
                }
            }
        });

        f.add(btn);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}