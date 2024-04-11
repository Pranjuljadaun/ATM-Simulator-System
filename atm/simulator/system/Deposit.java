package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JButton Deposit,Back;
    JTextField text;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\ATM 2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 870, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1200,870);
        add(l3);

        JLabel amt=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        amt.setFont(new Font("System", Font.BOLD, 16));
        amt.setForeground(Color.white);
        amt.setBounds(250, 200, 400, 35);
        l3.add(amt);

        text=new JTextField();
        text.setForeground(Color.white);
        text.setBackground(new Color(120, 146, 75));
        text.setBounds(250, 250, 200, 35);
        text.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(text);

        Deposit=new JButton("DEPOSIT");
        Deposit.setBounds(518, 405, 170, 35);
        Deposit.setBackground(new Color(120, 146, 75));
        Deposit.setFont(new Font("Raleway", Font.BOLD, 15));
        Deposit.setForeground(Color.white);
        Deposit.addActionListener(this);
        l3.add(Deposit);

        Back=new JButton("BACK");
        Back.setBounds(518, 450, 170, 35);
        Back.setBackground(new Color(120, 146, 75));
        Back.setForeground(Color.white);
        Back.setFont(new Font("Raleway", Font.BOLD, 15));
        Back.addActionListener(this);
        l3.add(Back);


        setLayout(null);
        setSize(1200,900);
        setLocation(200,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = text.getText();
            Date date = new Date();
            if (e.getSource()==Deposit) {
                if (text.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount");
                } else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into BankDeposit values ('" + pin + "', '" + date + "', 'Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs " + amount + "/- Deposit Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            }
            else if (e.getSource()==Back) {
                setVisible(false);
                new main_Class(pin);
            }


        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit( "");
    }
}
