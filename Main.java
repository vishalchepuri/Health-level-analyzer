package com.vishal;


import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String... args)
    {

        allwindows obj = new allwindows();
    }
}
class allwindows extends JFrame {
    public allwindows()
    {
        JLabel label1 = new JLabel("HEALTH LEVEL ANALYSER");
        label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        label1.setForeground(new Color(0, 0, 250));
        JButton button1 = new JButton("BMI CALCULATOR");
        button1.setBackground(new Color(100, 145, 200));
        JButton button2 = new JButton("HEARTBEAT RANGE CHECKER");
        button2.setBackground(new Color(200, 200, 200));
        JButton button3 = new JButton("BP RANGE CHECKER");
        button3.setBackground(new Color(150, 150, 150));
        JPanel pa = new JPanel();
        BoxLayout boxlayout = new BoxLayout(pa, BoxLayout.Y_AXIS);
        pa.setLayout(boxlayout);
        pa.setBackground(Color.white);
        button1.addActionListener(ae->{
            new BMI();
            dispose();
        });

        button2.addActionListener(ae->{
            new Heartrate();
            dispose();
        });

        button3.addActionListener(ae->{
            new BP();
            dispose();
        });

        pa.add(label1);
        pa.add(button1);
        pa.add(button2);
        pa.add(button3);

        add(pa);
        setLayout(new GridLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}















