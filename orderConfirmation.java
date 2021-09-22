
package ahsan.grocery.shop;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class orderConfirmation extends JFrame implements ActionListener{
    
    orderConfirmation(){
    
        JButton l1=new JButton("Order placed");
        l1.setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
        l1.setBounds(100,100,250,80);
        l1.setFont(new Font("tahoma",Font.BOLD,25));
        add(l1);
    JButton b1=new JButton("THANKS FOR ORDERING");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(0,200,450,80);
        b1.setFont(new Font("tahoma",Font.BOLD,25));
        add(b1);
    
    
    setBounds(600,200,450,450);
    setLayout(null);
    setVisible(true);
    getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent e){
        
        
        
    }
    
    public static void main(String args[]){
        new orderConfirmation ();
    }
    }
    
    

