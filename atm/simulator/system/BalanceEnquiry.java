package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel lable2;
    JButton Back;
    String pin;
    BalanceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\ATM 2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 870, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1200,870);
        add(l3);

        JLabel lable1=new JLabel("Your Current Balance is : ");
        lable1.setBounds(300, 250, 400, 35);
        lable1.setFont(new Font("System", Font.BOLD, 16));
        lable1.setForeground(Color.white);
        l3.add(lable1);

        lable2=new JLabel();
        lable2.setBounds(300, 300, 400, 35);
        lable2.setFont(new Font("System", Font.BOLD, 16));
        lable2.setForeground(Color.white);
        l3.add(lable2);

        Back=new JButton("BACK");
        Back.setBounds(518, 450, 170, 35);
        Back.setBackground(new Color(120, 146, 75));
        Back.setForeground(Color.white);
        Back.setFont(new Font("Raleway", Font.BOLD, 15));
        l3.add(Back);
        Back.addActionListener(this);


        setLayout(null);
        setSize(1200,900);
        setLocation(200,0);
        setVisible(true);

        int balance=0;
        try{
            Conn c= new Conn();
            ResultSet resultSet=c.statement.executeQuery("Select * from BankDeposit where Pin='"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        lable2.setText("Rs: "+balance+"/-");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
