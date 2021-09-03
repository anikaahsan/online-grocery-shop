
package ahsan.grocery.shop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class AhsanGroceryShop extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    AhsanGroceryShop(){
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ahsan/grocery/shop/grocery/page1.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500, 810,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        //l1.setBounds(0,0,1500,810);
        add(l1);
        
        JLabel l2=new JLabel("WELCOME TO AHSAN GROCERY SHOP");
        l2.setBounds(400,10,700,60);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l1.add(l2);
        
        JButton b1=new JButton("signup");
        b1.setBounds(1200,200,130,50);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        l1.add(b1);
        
         b1.addActionListener(this);
              
        JButton b2=new JButton("login");
        b2.setBounds(1200,270,130,50);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        l1.add(b2);
        
         b2.addActionListener(this);
        
                
        JButton b3=new JButton("Visit shop");
        b3.setBounds(1200,340,130,50);
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.WHITE);
        l1.add(b3);
        
        b3.addActionListener(this);
                
       
        
        //setLayout(null);
        setBounds(0,0,1500,810);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        new menuPage().setVisible(true);
        this.setVisible(false);
    
    }

    
    public static void main(String[] args) {
       new AhsanGroceryShop();
    }
    
}
