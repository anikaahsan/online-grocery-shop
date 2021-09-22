
package ahsan.grocery.shop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class shippingDetails extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t1,t2,t3;
    shippingDetails(){
        
        JButton B1=new JButton("shipping address");
        B1.setBounds(0,0,650,100);
        B1.setFont(new Font("tahoma",Font.BOLD,50));
        B1.setBackground(Color.BLUE);
        B1.setForeground(Color.WHITE);
        add(B1);
        
        
        JLabel l1=new JLabel("NAME");
        l1.setBounds(30,120,100,60);
        l1.setFont(new Font("tahoma",Font.BOLD,15));
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(170,120,250,50);
        add(t1);
        
        JLabel l2=new JLabel("PHONE NO.");
        l2.setBounds(30,220,100,60);
        l2.setFont(new Font("tahoma",Font.BOLD,15));
        add(l2);
        
        t2=new JTextField();
        t2.setBounds(170,220,250,50);
        add(t2);
         
        JLabel l3=new JLabel("ADDRESS");
        l3.setBounds(30,320,100,60);
        l3.setFont(new Font("tahoma",Font.BOLD,15));
        add(l3);
        
        t3=new JTextField();
        t3.setBounds(170,320,250,50);
        add(t3);
        
        
        
        
        
        b1=new JButton("proceed to checkout");
        b1.setBounds(10,400,620,60);
        b1.setFont(new Font("tahoma",Font.BOLD,30));
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        add(b1);
        b1.addActionListener( this);
        
        b2=new JButton("Back");
        b2.setBounds(10,480,620,60);
        b2.setFont(new Font("tahoma",Font.BOLD,30));
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        add(b2);
        b2.addActionListener(this);       
        
        
        
        
             
        
        
        
        
       setBounds(300,50,650,650);
       setLayout(null);
       setVisible(true);
       getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
         new orderConfirmation().setVisible(true);
        this.setVisible(false);   
        }
        else if(ae.getSource()==b2){
            new placeOrder().setVisible(true);
             this.setVisible(false); 
        }
    }
    

public static void main(String[] args) {

       new shippingDetails();
}
}










