package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,Back;
    String pin;
    FastCash(String pin){
      this.pin=pin;

      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\ATM 2.jpg"));
      Image i2 = i1.getImage().getScaledInstance(1200, 870, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel l3=new JLabel(i3);
      l3.setBounds(0,0,1200,870);
      add(l3);

        JLabel text=new JLabel("PLEASE SELECT WITHDRAWAL AMOUNT");
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD, 15));
        text.setBounds(300, 250, 400, 35);
        l3.add(text);

      b1=new JButton("Rs. 500");
      b1.setBounds(205, 315, 170, 35);
      b1.setBackground(new Color(120, 146, 75));
      b1.setForeground(Color.white);
      b1.setFont(new Font("Raleway", Font.BOLD, 15));
      b1.addActionListener(this);
      l3.add(b1);

        b2=new JButton("Rs. 1000");
        b2.setBounds(518, 315, 170, 35);
        b2.setBackground(new Color(120, 146, 75));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Raleway", Font.BOLD, 15));
        b2.addActionListener(this);
        l3.add(b2);

        b3=new JButton("Rs. 2000");
        b3.setBounds(205, 360, 170, 35);
        b3.setBackground(new Color(120, 146, 75));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Raleway", Font.BOLD, 15));
      b3.addActionListener(this);
        l3.add(b3);

        b4=new JButton("Rs. 5000");
        b4.setBounds(518, 360, 170, 35);
        b4.setBackground(new Color(120, 146, 75));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Raleway", Font.BOLD, 15));
      b4.addActionListener(this);
        l3.add(b4);

        b5=new JButton("Rs. 10000");
        b5.setBounds(205, 405, 170, 35);
        b5.setBackground(new Color(120, 146, 75));
        b5.setForeground(Color.white);
        b5.setFont(new Font("Raleway", Font.BOLD, 15));
      b5.addActionListener(this);
        l3.add(b5);

        b6=new JButton("Rs. 15000");
        b6.setBounds(518, 405, 170, 35);
        b6.setBackground(new Color(120, 146, 75));
        b6.setForeground(Color.white);
        b6.setFont(new Font("Raleway", Font.BOLD, 15));
      b6.addActionListener(this);
        l3.add(b6);

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
    if(e.getSource()==Back){
      setVisible(false);
      new main_Class(pin);
    }else {
      String amount= ((JButton)e.getSource()).getText().replaceAll("\\D+", "");
      Conn c = new Conn();
      Date date= new Date();
      try{
        ResultSet resultSet= c.statement.executeQuery("select * from BankDeposit where pin = '"+pin+"'");
        int balance =0;
        while(resultSet.next()){
          if (resultSet.getString("type").equals("Deposit")) {
            balance += Integer.parseInt(resultSet.getString("amount"));
          }else {
            balance -= Integer.parseInt(resultSet.getString("amount"));
          }
        }String num="17";
        if (e.getSource()!=Back && balance<Integer.parseInt(amount))
        {
          JOptionPane.showMessageDialog(null, "Insufficient Balance");
          return;
        }
        c.statement.executeUpdate("insert into BankDeposit values ('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
        JOptionPane.showMessageDialog(null, "Rs. " + amount+ " Debited Successfully");
      }catch(Exception E){
        E.printStackTrace();
      }
      setVisible(false);
      new main_Class(pin);
    }

  }

  public static void main(String[] args) {
        new FastCash("");
    }
}
