import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
public class DelEt implements ActionListener{  
    JTextField tf1;  
    JButton b1,b2, bN0, bN1, bN2, bN3, bN4, bN5, bN6, bN7, bN8, bN9;  
    DelEt(){  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);
        tf1.setEditable(false);
        
        b1 = new JButton("SA");
        b1.setBounds(200,100,50,50);  
        b2 = new JButton("SST");
        b2.setBounds(200,150,50,50);

        bN0 = new JButton("0");
        bN0.setBounds(50,100,50,50);
        bN1 = new JButton("1");
        bN1.setBounds(100,100,50,50);
        bN2 = new JButton("2");
        bN2.setBounds(150,100,50,50);
        bN3 = new JButton("3");
        bN3.setBounds(50,150,50,50);
        bN4 = new JButton("4");
        bN4.setBounds(100,150,50,50);
        bN5 = new JButton("5");
        bN5.setBounds(150,150,50,50);
        bN6 = new JButton("6");
        bN6.setBounds(50,200,50,50);
        bN7 = new JButton("7");
        bN7.setBounds(100,200,50,50);
        bN8 = new JButton("8");
        bN8.setBounds(150,200,50,50);
        bN9 = new JButton("9");
        bN9.setBounds(100,250,50,50);


        
        b1.addActionListener(this);  
        b2.addActionListener(this);
        bN0.addActionListener(this);
        bN1.addActionListener(this);
        bN2.addActionListener(this);
        bN3.addActionListener(this);
        bN4.addActionListener(this);
        bN5.addActionListener(this);
        bN6.addActionListener(this);
        bN7.addActionListener(this);
        bN8.addActionListener(this);
        bN9.addActionListener(this);

        // Font
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        
        
        f.add(tf1); f.add(b1); f.add(b2); f.add(bN0); f.add(bN1); f.add(bN2); f.add(bN3); f.add(bN4); f.add(bN5); f.add(bN6); f.add(bN7); f.add(bN8); f.add(bN9);
        f.setSize(300,400);  
        f.setLayout(null);  
        f.setVisible(true);  

        
    }         
    public void actionPerformed(ActionEvent e) {  

        int tekst_length = tf1.getText().length();

        if(e.getSource() == b2){
            tf1.setText(tf1.getText().substring(0, tekst_length - 1));
        }

        if(e.getSource() == b1){
            tf1.setText("");
        }
    }

    public static void main(String[] args) {  
        new DelEt();  
    } 
}  




