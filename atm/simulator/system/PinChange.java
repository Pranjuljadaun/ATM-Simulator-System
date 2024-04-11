package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PinChange extends JFrame implements ActionListener {
    String pin;
    JButton Change, Back;
    JPasswordField p1,p2;
    PinChange( String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon\\ATM 2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 870, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1200,870);
        add(l3);

        JLabel a1=new JLabel("CHANGE YOUR PIN");
        a1.setFont(new Font("System", Font.BOLD, 18));
        a1.setForeground(Color.white);
        a1.setBounds(360, 150, 400, 35);
        l3.add(a1);

        JLabel a2=new JLabel("ENTER NEW PIN : ");
        a2.setFont(new Font("System", Font.BOLD, 16));
        a2.setForeground(Color.white);
        a2.setBounds(220, 240, 400, 35);
        l3.add(a2);

        p1= new JPasswordField();
        p1.setFont(new Font("System", Font.BOLD, 16));
        p1.setBackground(new Color(120, 146, 75));
        p1.setForeground(Color.white);
        p1.setBounds(400, 240, 200, 30);
        l3.add(p1);


        JLabel a3=new JLabel("RE-ENTER NEW PIN : ");
        a3.setFont(new Font("System", Font.BOLD, 16));
        a3.setForeground(Color.white);
        a3.setBounds(220, 290, 400, 35);
        l3.add(a3);

        p2= new JPasswordField();
        p2.setFont(new Font("System", Font.BOLD, 16));
        p2.setBackground(new Color(120, 146, 75));
        p2.setForeground(Color.white);
        p2.setBounds(400, 290, 200, 30);
        l3.add(p2);


        Change=new JButton("CHANGE");
        Change.setBounds(518, 405, 170, 35);
        Change.setBackground(new Color(120, 146, 75));
        Change.setFont(new Font("Raleway", Font.BOLD, 15));
        Change.setForeground(Color.white);
        Change.addActionListener(this);
        l3.add(Change);

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
        try{
            if (e.getSource() == Change) {
                String newPin = new String(p1.getPassword());
                String confirmPin = new String(p2.getPassword());

                if (newPin.isEmpty() || confirmPin.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Both PIN");
                    return;
                }
                if (!newPin.matches("\\d+") || !confirmPin.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "PIN Should Contain Only Numeric Digits");
                    return;
                }if (newPin.length() != 4 || confirmPin.length() != 4) {
                    JOptionPane.showMessageDialog(null, "PIN Should Be 4 Digits Long");
                    return;
                }
                if (!newPin.equals(confirmPin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN Do Not Match");
                    return;
                }
                Conn c=new Conn();
                String q1="update BankDeposit set pin = '"+newPin+"' where pin='"+pin+"'";
                String q2="update Login set pin = '"+newPin+"' where pin='"+pin+"'";
                String q3="update SignUp set pin = '"+newPin+"' where pin='"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                pin=newPin;
                setVisible(false);
                new main_Class(pin);
            }else if (e.getSource()==Back){
                new main_Class(pin);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PinChange("");
    }
}
