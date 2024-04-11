package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    String pin;
    JButton Exit;

    MiniStatement(String pin) {
        this.pin = pin;

        JLabel label2 = new JLabel("MINI STATEMENT");
        label2.setFont(new Font("System", Font.BOLD, 20));
        label2.setForeground(new Color(0, 128, 0)); // Dark green
        label2.setBounds(100, 20, 200, 30);
        add(label2);

        JLabel label1 = new JLabel();
        label1.setBounds(20, 120, 360, 260); // to print statement
        add(label1);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 400, 300, 20); // to print total balance
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 80, 400, 30); // to print card no
        label4.setFont(new Font("System", Font.BOLD, 15));
        label4.setForeground(new Color(0, 128, 0)); // Dark green
        add(label4);

        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Login where Pin = '" + pin + "'");

            while (resultSet.next()) {
                    label4.setText("Card Number:  " + resultSet.getString("Card_Number").substring(0,4)+"-XXXX-XXXX-"+ resultSet.getString("Card_Number").substring(12));
            }

            int balance = 0;
            ResultSet resultSet2 = c.statement.executeQuery("select * from BankDeposit where pin = '" + pin + "'");
            while (resultSet2.next()) {
                String date = resultSet2.getString("date");
                String type = resultSet2.getString("type");
                String amount = resultSet2.getString("amount");
                if (date != null && type != null && amount != null) {
                    label1.setText(label1.getText() + "<html>" + date+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"  + type+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"  +amount + "<br><br><html>");
                    if (type.equals("Deposit")) {
                        balance += Integer.parseInt(amount);
                    } else {
                        balance -= Integer.parseInt(amount);
                    }
                }
            }
            label3.setText("Your Total Balance is Rs: " + balance + "/-");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Exit = new JButton("EXIT");
        Exit.setForeground(Color.white);
        Exit.setFont(new Font("Raleway", Font.BOLD, 15));
        Exit.setBounds(150, 450, 100, 30); // Adjusted width
        Exit.setBackground(new Color(76, 175, 80)); // Soft green
        Exit.addActionListener(this);
        add(Exit);

        getContentPane().setBackground(new Color(245, 245, 245)); // Light gray or off-white
        setSize(400, 550);
        setLocation(920, 150);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
