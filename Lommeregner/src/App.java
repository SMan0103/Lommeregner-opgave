/*import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
public class App implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;  
    App(){  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        

        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50);  
        b3 = new JButton("Slet");
        b3.setBounds(190,200,50,50);
        b4 = new JButton("Slet sistde tegn");
        b4.setBounds(260,200,125,50);
        
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);
        b4.addActionListener(this);

        // Font
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        
        
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  

        
    }         
    public void actionPerformed(ActionEvent e) {  

        int  tekst_length = tf1.getText().length();

        if(e.getSource() == b4){
            tf1.setText(tf1.getText().substring(0, tekst_length - 1));
        }

        if(e.getSource() == b3){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }

        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new App();  
} }  
*/