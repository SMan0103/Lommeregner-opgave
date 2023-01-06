import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
public class OpgaveEt implements ActionListener{  
    JTextField tf1;  
    JButton b1,b2;  
    OpgaveEt(){  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);
        
        b1 = new JButton("Slet alt");
        b1.setBounds(75,100,125,50);  
        b2 = new JButton("Slet sistde tegn");
        b2.setBounds(75,150,125,50);
        
        b1.addActionListener(this);  
        b2.addActionListener(this);

        // Font
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        
        
        f.add(tf1); f.add(b1); f.add(b2);
        f.setSize(300,300);  
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
        new OpgaveEt();  
    } 
}  




