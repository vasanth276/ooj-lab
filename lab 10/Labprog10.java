import java.awt.*;
import java.awt.event.*;
class Division1 extends Frame implements ActionListener{
	Frame f;
    TextField tf1;
    TextField tf2;
    TextField tf3;
    Button b;
    Dialog d1;
    Division1(){
        setSize(300,300);
        setVisible(true);
        setLayout(null);
        //to colse window
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent aew){
                dispose();
            }
        });
        //textfield1 initialization
        tf1 = new TextField("Number1");
        tf1.setBounds(10,30,200,30);
        add(tf1);
        //textfield2 initialization
        tf2 = new TextField("Number2");
        tf2.setBounds(10,70,200,30);
        add(tf2);
        //division button creation
        b = new Button("/");
        b.setBounds(10, 110, 200, 30);
        b.addActionListener(this);
        add(b);
        //textfield3 initialization
        tf3 = new TextField("Output");
        tf3.setBounds(10,150,200,30);
        add(tf3);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String num1=tf1.getText();
            int nu1=Integer.parseInt(num1);
            String num2=tf2.getText();
            int nu2=Integer.parseInt(num2);
            int result = nu1/nu2;
            tf3.setText(Integer.toString(result));
        }
        catch(NumberFormatException e2){
            d1 = new Dialog(f,"error",true);
            Label l = new Label(""+e2);
            d1.add(l);
            d1.setSize(300,50);
            d1.setVisible(true);
            
            
        }
        catch(ArithmeticException e1){
            d1 = new Dialog(f,"error",true);
            Label l = new Label(""+e1);
            d1.add(l);
            d1.setSize(300,50);
            d1.setVisible(true);
            
        }
    }
}
public class Labprog10 {
    public static void main(String[] args) {
        Division1 d = new Division1();
    }
    
}
