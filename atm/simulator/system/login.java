package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton SignIn, Clear, SignUp;
    login(){
        super("BANK MANAGEMENT SYSTEM");

        label1=new JLabel("WELCOME TO ATM MACHINE");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font( "AvantGarde", Font.BOLD, 20));
        label1.setBounds(465, 70, 450, 40);
        add(label1);

        label2= new JLabel("CARD NO:");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Ralway", Font.BOLD, 17));
        label2.setBounds(380, 155, 375, 30);
        add(label2);

        textField2=new JTextField(15);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        textField2.setBounds(500, 155, 230, 30);
        add(textField2);

        label3=new JLabel("ENTER PIN: ");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Ralway", Font.BOLD, 17));
        label3.setBounds(380, 215, 375, 30);
        add(label3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(500, 215, 230, 30);
        setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        SignIn=new JButton("SIGNIN");
        SignIn.setFont(new Font("Arial", Font.BOLD,17));
        SignIn.setBackground(new Color(117, 117, 117));
        SignIn.setForeground(Color.WHITE);
        SignIn.setBounds(500, 290, 100, 30);
        SignIn.addActionListener(this);
        add(SignIn);

        Clear=new JButton("CLEAR");
        Clear.setFont(new Font("Arial", Font.BOLD, 17));
        Clear.setBackground(new Color(117, 117, 117));
        Clear.setForeground(Color.WHITE);
        Clear.setBounds(630, 290, 100, 30);
        Clear.addActionListener(this);
        add(Clear);

        SignUp=new JButton("OPEN NEW ACCOUNT");
        SignUp.setFont(new Font("Arial", Font.BOLD, 17));
        SignUp.setForeground(Color.WHITE);
        SignUp.setBackground(new Color(117, 117, 117));
        SignUp.setBounds(500,350,230,30);
        SignUp.addActionListener(this);
        add(SignUp);

        ImageIcon backbg=new ImageIcon(ClassLoader.getSystemResource("icon/ATM BG.jpg"));
        Image backbg1=backbg.getImage().getScaledInstance(850, 540, Image.SCALE_DEFAULT);
        ImageIcon backbg2= new ImageIcon(backbg1);
        JLabel backbgimage= new JLabel(backbg2);
        backbgimage.setBounds(0, 0, 850,480);
        add(backbgimage);

        getContentPane().setBackground(new Color(245, 245, 245));
        setSize(850,540);
        setLocation(400, 230);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            if(e.getSource()==SignIn)
            {
                Conn c=new Conn();
                String cardno= textField2.getText();
                String pin= passwordField3.getText();
                String q= "select * from Login where Card_Number = '"+cardno+"' and Pin='"+pin+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Detail Entered");
                }

            } else if (e.getSource()==Clear) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource()==SignUp) {
                new Signup();
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new login();
    }
}
