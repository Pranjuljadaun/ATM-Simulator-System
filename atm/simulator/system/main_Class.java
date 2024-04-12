package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton Deposit, Cash, Fast, MiniS, PinC, Balance, Exit;
    String pin;
    main_Class(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\ATM 2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 870, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1200,870);
        add(l3);

        JLabel text=new JLabel("Please Select Your Transaction");
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD, 18));
        text.setBounds(310, 240, 400, 35);
        l3.add(text);

        Deposit = new JButton("DEPOSIT");
        Deposit.setForeground(Color.white);
        Deposit.setFont(new Font("Raleway", Font.BOLD, 15));
        Deposit.setBounds(205, 315, 170, 35);
        Deposit.setBackground(new Color(120, 146, 75));
        Deposit.addActionListener(this);
        l3.add(Deposit);

        Cash = new JButton("CASH WITHDRAW");
        Cash.setForeground(Color.white);
        Cash.setFont(new Font("Raleway", Font.BOLD, 15));
        Cash.setBounds(518, 315, 170, 35);
        Cash.setBackground(new Color(120, 146, 75));
        Cash.addActionListener(this);
        l3.add(Cash);

        Fast = new JButton("FAST CASH");
        Fast.setForeground(Color.white);
        Fast.setFont(new Font("Raleway", Font.BOLD, 15));
        Fast.setBounds(205, 360, 170, 35);
        Fast.setBackground(new Color(120, 146, 75));
        Fast.addActionListener(this);
        l3.add(Fast);

        MiniS = new JButton("MINI STATEMENT");
        MiniS.setForeground(Color.white);
        MiniS.setFont(new Font("Raleway", Font.BOLD, 15));
        MiniS.setBounds(518, 360, 170, 35);
        MiniS.setBackground(new Color(120, 146, 75));
        MiniS.addActionListener(this);
        l3.add(MiniS);

        PinC = new JButton("PIN CHANGE");
        PinC.setForeground(Color.white);
        PinC.setFont(new Font("Raleway", Font.BOLD, 15));
        PinC.setBounds(205, 405, 170, 35);
        PinC.setBackground(new Color(120, 146, 75));
        PinC.addActionListener(this);
        l3.add(PinC);

        Balance = new JButton("BALANCE ENQUIRY");
        Balance.setForeground(Color.white);
        Balance.setFont(new Font("Raleway", Font.BOLD, 14));
        Balance.setBounds(518, 405, 170, 35);
        Balance.setBackground(new Color(120, 146, 75));
        Balance.addActionListener(this);
        l3.add(Balance);

        Exit = new JButton("EXIT");
        Exit.setForeground(Color.white);
        Exit.setFont(new Font("Raleway", Font.BOLD, 15));
        Exit.setBounds(518, 450, 170, 35);
        Exit.setBackground(new Color(120, 146, 75));
        Exit.addActionListener(this);
        l3.add(Exit);

        setLayout(null);
        setSize(1200,900);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==Deposit){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==Exit) {
            System.exit(0);
            new main_Class(pin);
        } else if ((e.getSource()==Cash)) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource()==Balance) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==Fast) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==PinC){
            new PinChange(pin);
            setVisible(false);
        } else if (e.getSource()==MiniS) {
            setVisible(true);
            new MiniStatement(pin);

        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
