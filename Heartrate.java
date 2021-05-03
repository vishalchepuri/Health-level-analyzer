package com.vishal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Heartrate
{

    Heartrate()
    {

        JFrame f = new JFrame();
        
        JLabel label1 = new JLabel("HEAT RATE CALCULATOR in JAVA GUI");
        f.add(label1);

        JLabel label2 = new JLabel("                                          ");
        f.add(label2);

        JLabel lage = new JLabel("Age:");
        f.add(lage);

        JTextField txtage = new JTextField("",10);
        f.add(txtage);


        JLabel lresting = new JLabel("                                           Resting heart rate:");
        f.add(lresting);

        JTextField txtresting = new JTextField("",10);
        f.add(txtresting);

        JLabel llowend = new JLabel("low end heart rate zone:");
        f.add(llowend);

        JTextField txtlowend = new JTextField("",10);
        f.add(txtlowend);

        JLabel lhighend = new JLabel("high end heart rate zone:");
        f.add(lhighend);

        JTextField txthighend = new JTextField("",10);
        f.add(txthighend);



        JLabel label5 = new JLabel("                                      Gender:");
        f.add(label5);


        JRadioButton Male,Female;
        ButtonGroup radioGroup=new ButtonGroup();
        Male=new JRadioButton("Male");
        radioGroup.add(Male);
        Female=new JRadioButton("Female");
        radioGroup.add(Female);

        f.add(Male);
        f.add(Female);

        JLabel label6 = new JLabel("                                   ");
        f.add(label6);


        JButton btn = new JButton("Submit");
        btn.setBounds(20, 130, 300, 40);
        f.add(btn);

        JLabel Result = new JLabel("Result");
        f.add(Result);

        f.setSize(400, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);


        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Female.isSelected()){
                    double age,rhr,minPer,maxPer,hrr,min,max,maxHr;
                    age = Double.parseDouble(txtage.getText());
                    rhr=Double.parseDouble(txtresting.getText());
                    minPer = Double.parseDouble(txtlowend.getText());
                    maxPer = Double.parseDouble(txthighend.getText());
                    maxHr=206-(0.88*age);
                    hrr=(maxHr-rhr);
                    min=hrr*(minPer/100)+rhr;
                    max=hrr*(maxPer/100)+rhr;

                    Result.setText("Target Heart Rate zone is between "+min+" to "+max);
                }
                else if(Male.isSelected()){
                    double age,rhr,minPer,maxPer,hrr,min,max,maxHr;
                    age = Double.parseDouble(txtage.getText());
                    rhr=Double.parseDouble(txtresting.getText());
                    minPer = Double.parseDouble(txtlowend.getText());
                    maxPer = Double.parseDouble(txthighend.getText());
                    maxHr=206.9-(0.67*age);
                    hrr=(maxHr-rhr);
                    min=(hrr*(minPer/100))+rhr;
                    max=(hrr*(maxPer/100))+rhr;
                    Result.setText("Target Heart Rate zone is between "+min+" to "+max);
                }
                else
                {
                    Result.setText("please select gender");
                }
            }
        });
    }
    
}