package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame  implements ActionListener {

    JTextField text;
    JButton Withdrawal, Back;
    String pin;
    Withdrawal(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\ATM 2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 870, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1200,870);
        add(l3);

        JLabel limit=new JLabel("Withdrawal Limit is 10000/- Rs");
        limit.setFont(new Font("System", Font.BOLD, 13));
        limit.setForeground(Color.white);
        limit.setBounds(250, 170, 400, 35);
        l3.add(limit);

        JLabel amt=new JLabel("PLEASE ENTER YOUR AMOUNT");
        amt.setFont(new Font("System", Font.BOLD, 16));
        amt.setForeground(Color.white);
        amt.setBounds(250, 210, 400, 35);
        l3.add(amt);

        text=new JTextField();
        text.setForeground(Color.white);
        text.setBackground(new Color(120, 146, 75));
        text.setBounds(250, 250, 200, 35);
        text.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(text);

        Withdrawal=new JButton("WITHDRAWAL");
        Withdrawal.setBounds(518, 405, 170, 35);
        Withdrawal.setBackground(new Color(120, 146, 75));
        Withdrawal.setForeground(Color.white);
        Withdrawal.setFont(new Font("Raleway", Font.BOLD, 15));
        l3.add(Withdrawal);
        Withdrawal.addActionListener(this);

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

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Withdrawal) {
            try {
                String amount = text.getText();
                Date date = new Date();
                    if (text.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "Please Enter Amount to Withdrawal");
                    else {
                        Conn c = new Conn();
                        ResultSet resultSet = c.statement.executeQuery("select * from BankDeposit where Pin='" + pin + "'");
                        int balance = 0;
                        while (resultSet.next()) {
                            if (resultSet.getString("Type").equals("Deposit")) {
                                balance += Integer.parseInt(resultSet.getString("Amount"));
                            } else {
                                balance -= Integer.parseInt(resultSet.getString("Amount"));
                            }
                        }
                        if (balance < Integer.parseInt(amount)) {
                            JOptionPane.showMessageDialog(null, "Insufficient Balance");
                            return;
                        }
                        c.statement.executeUpdate("insert into BankDeposit values ('" + pin + "','" + date + "', 'Withdrawl', '" + amount + "')");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                        setVisible(false);
                        new main_Class(pin);
                    }

            } catch (Exception E) {

            }
        } else if (e.getSource() == Back) {
            new main_Class(pin);
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Withdrawal("");
    }}

