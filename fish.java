
package ahsan.grocery.shop;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

 public class fish extends JFrame implements ActionListener{
     fish(){
         
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ahsan/grocery/shop/grocery/mango.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(300,300,200,200);
        add(l1); 
        
        JButton b1=new JButton("Order now");
        b1.setBounds(300,500,200,50);
        b1.setFont(new Font("tahoma",Font.PLAIN,20));
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        add(b1);
        
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("ahsan/grocery/shop/grocery/apple.jpg"));
        Image i5=i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(800,300,200,200);
        add(l2); 
        
        JButton b2=new JButton("order now");
        b2.setBounds(800,500,200,50);
         b2.setFont(new Font("tahoma",Font.PLAIN,20));
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        add(b2);
        
          ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("ahsan/grocery/shop/grocery/banana.jpg"));
        Image i8=i7.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel l3=new JLabel(i9);
        l3.setBounds(550,300,200,200);
        add(l3); 
        
        JButton b3=new JButton("order now");
        b3.setBounds(550,500,200,50);
         b3.setFont(new Font("tahoma",Font.PLAIN,20));
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.WHITE);
        add(b3);
         
         
         
         setBounds(0,0,1500,810);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         setVisible(true);
         
         
         
     }
     public void actionPerformed(ActionEvent ae){
        
    }

     
      public static void main(String args[]){
        new fish();
        
    }
 }