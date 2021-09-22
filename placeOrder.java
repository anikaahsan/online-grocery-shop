
package ahsan.grocery.shop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class placeOrder extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField t1,t2;
    int price;
    JLabel l2,l3;
  
    placeOrder(){
       
        JLabel l1=new JLabel(" quantity");
        l1.setBounds(30,30,80,60);
        l1.setFont(new Font("tahoma",Font.BOLD,15));
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(170,40,110,30);
        add(t1);
        
        
        l3=new JLabel("kg");
        l3.setBounds(285,30,80,60);
        l3.setFont(new Font("tahoma",Font.BOLD,15));
        add(l3);
        
        
         l2=new JLabel("total price");
        l2.setBounds(30,140,110,40);
        l2.setFont(new Font("tahoma",Font.BOLD,15));
        add(l2);
        
        
        t2=new JTextField(10);
        t2.setBounds(170,150,110,30);
        t2.setEditable(false);
        add(t2);
        
        
         b1=new JButton("total");
        b1.setBounds(100,250,110,50);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b1.addActionListener(this);
        
         b2=new JButton("next");
        b2.setBounds(250,250,110,50);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        b2.addActionListener(this);
               
        
        
        setBounds(300,50,450,450);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            
                String x = t1.getText().trim(); 
                int y=Integer.parseInt(x);
                int z=y*10;
                String price=String.valueOf(z);
                                    
                t2.setText(price);
        //String x = t1.getText();
        //int y=Integer.parseInt(x);
        //price=y*15;
        
        //JLabel t2=new JLabel(String.valueOf(price));
        //t2.setBounds(170,150,110,30);
        //add(t2);
        
            
        
        
      
         //new shippingDetails().setVisible(true);
        //this.setVisible(false);  
        
        }
        else if(ae.getSource()==b2){
            new shippingDetails().setVisible(true);
            this.setVisible(false);
        }
        
        
    }
    public static void main(String[] args) {
       new placeOrder();
    }
}


    

