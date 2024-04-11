package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton saving, current, fd, rda;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submit, cancel;
    String formno;
    Signup3(String formno){
        super("APPLICATION FORM PAGE 3");

        ImageIcon bank = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank1=bank.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank2= new ImageIcon(bank1);
        JLabel bankimage=new JLabel(bank2);
        bankimage.setBounds(105,15, 100, 100);
        add(bankimage);

        this.formno=formno;

        JLabel form=new JLabel("Form No :");
        form.setFont(new Font("Raleway", Font.BOLD, 20));
        form.setBounds(380,30, 200, 30);
        add(form);
        JLabel form1=new JLabel(formno);
        form1.setFont(new Font("Raleway", Font.BOLD, 20));
        form1.setBounds(470,30, 200, 30);
        add(form1);

        JLabel page=new JLabel("PAGE 3");
        page.setFont(new Font("Raleway", Font.PLAIN, 16));
        page.setBounds(600,10, 200, 30);
        add(page);

        JLabel acc=new JLabel("Account Details ");
        acc.setBounds(350,60, 600, 40);
        acc.setFont(new Font("Raleway", Font.BOLD, 25));
        add(acc);

        JLabel acctype=new JLabel("Account Type : ");
        acctype.setBounds(100,140, 200, 30);
        acctype.setFont(new Font("Raleway", Font.BOLD, 18));
        add(acctype);

        saving=new JRadioButton("Saving Account");
        saving.setBounds(100,180, 200, 30);
        saving.setBackground(new Color(215, 252, 252));
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        add(saving);

        fd=new JRadioButton("Fix Deposit Account");
        fd.setBounds(350,180, 200, 30);
        fd.setBackground(new Color(215, 252, 252));
        fd.setFont(new Font("Raleway", Font.BOLD, 16));
        add(fd);

        current=new JRadioButton("Current Account");
        current.setBounds(100,220, 200, 30);
        current.setBackground(new Color(215, 252, 252));
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        add(current);

        rda=new JRadioButton("Recurring Deposit Account");
        rda.setBounds(350,220, 300, 30);
        rda.setBackground(new Color(215, 252, 252));
        rda.setFont(new Font("Raleway", Font.BOLD, 16));
        add(rda);

        ButtonGroup b1=new ButtonGroup();
        b1.add(saving);
        b1.add(fd);
        b1.add(current);
        b1.add(rda);

        JLabel cardno=new JLabel("Card Number :");
        cardno.setFont(new Font("Raleway", Font.BOLD, 18));
        cardno.setBounds(100, 280, 200, 30);
        add(cardno);
        JLabel cardnol=new JLabel("(Your 16-Digit Card Number)");
        cardnol.setFont(new Font("Raleway", Font.BOLD, 12));
        cardnol.setBounds(100, 310, 200, 30);
        add(cardnol);
        JLabel cardno2=new JLabel("XXXX-XXXX-XXXX-XXXX");
        cardno2.setFont(new Font("Raleway", Font.BOLD, 18));
        cardno2.setBounds(330, 280, 250, 30);
        add(cardno2);
        JLabel cardno3=new JLabel("(It Would Appear on ATM Card/Cheque Book and Statement)");
        cardno3.setFont(new Font("Raleway", Font.BOLD, 12));
        cardno3.setBounds(330, 310, 500, 30);
        add(cardno3);

        JLabel pin=new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(100, 350, 200, 30);
        add(pin);
        JLabel pin1=new JLabel("(4-Digit PIN)");
        pin1.setFont(new Font("Raleway", Font.BOLD, 12));
        pin1.setBounds(100, 380, 200, 30);
        add(pin1);
        JLabel pin2=new JLabel("XXXX");
        pin2.setFont(new Font("Raleway", Font.BOLD, 18));
        pin2.setBounds(330, 350, 200, 30);
        add(pin2);

        JLabel service=new JLabel("Services Required :");
        service.setFont(new Font("Raleway", Font.BOLD, 18));
        service.setBounds(100, 430, 200, 30);
        add(service);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 480, 200, 30);
        add(c1);
        c2=new JCheckBox("INTERNET BANKING");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 480, 200, 30);
        add(c2);
        c3=new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 530, 200, 30);
        add(c3);
        c4=new JCheckBox("EMAIL ALERT");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 530, 200, 30);
        add(c4);
        c5=new JCheckBox("CHECK BOOK");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 580, 200, 30);
        add(c5);
        c6=new JCheckBox("E-STATEMENT");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 580, 200, 30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declares that the above details correct to the best of my knowledge.", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 13));
        c7.setBounds(100, 650, 2000, 30);
        add(c7);

        submit=new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel =new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        setSize(850, 800);
        setLocation(400, 20);
        setLayout(null);
        getContentPane().setBackground(new Color(215, 252, 252));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Atype="";
        if(saving.isSelected()){
            Atype="Saving Account";
        } else if (fd.isSelected()) {
            Atype="Fix Deposit Account";
        } else if (current.isSelected()) {
            Atype="Current Account";
        } else if (rda.isSelected()) {
            Atype="Recurring Deposit Account";
        }

        Random ran=new Random();
        long first7=(ran.nextLong()%90000000000000L)+1409963000000000L;
        String cardno=""+ Math.abs(first7);

        long first3=(ran.nextLong()%9000L + 1000l);
        String pin=""+ Math.abs(first3);

        String Sr="";
        if (c1.isSelected()) {
            Sr += "ATM CARD, ";
        }
        if (c2.isSelected()) {
            Sr += "INTERNET BANKING, ";
        }
        if (c3.isSelected()) {
            Sr += "MOBILE BANKING, ";
        }
        if (c4.isSelected()) {
            Sr += "EMAIL ALERT, ";
        }
        if (c5.isSelected()) {
            Sr += "CHECK BOOK, ";
        }
        if (c6.isSelected()) {
            Sr += "E-STATEMENT, ";
        }if (!Sr.isEmpty()) {
            Sr = Sr.substring(0, Sr.length() - 2);
        }
        try {
            if (e.getSource() == submit) {
                if (Atype.equals("") || Sr.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                Conn c1 = new Conn();
                String q1 = "insert into SignUp values('" + formno + "', '" + Atype + "', '" + cardno + "', '" + pin + "', '" + Sr + "')";
                String q2 = "insert into Login values('" + formno + "', '" + cardno + "', '" + pin + "')";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\n Pin: " + pin);
                new Deposit(pin);
                setVisible(false);

            }
        }else if(e.getSource()==cancel){
                System.exit(0);
        }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
