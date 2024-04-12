package atm.simulator.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton male, female, Married, Unmarried, Others;
    JButton next;
    JTextField textName, textFname, textEmail, textAddress,textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran= new Random();
    long form4=(ran.nextLong()% 9000L)+ 1000L;
    String form=" "+Math.abs(form4);
    Signup(){
        super("APPLICATION FORM PAGE 1");
        ImageIcon bank = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank1=bank.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank2= new ImageIcon(bank1);
        JLabel bankimage=new JLabel(bank2);
        bankimage.setBounds(100,30, 100, 100);
        add(bankimage);

        JLabel label2=new JLabel("PAGE 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 15));
        label2.setForeground(Color.black);
        label2.setBounds(730,10, 600, 40);
        add(label2);

        JLabel lable1=new JLabel("Application form no : " + form);
        lable1.setBounds(300, 50, 600, 28);
        lable1.setFont(new Font("Arial", Font.BOLD, 30));
        lable1.setForeground(Color.black);
        add(lable1);

        JLabel label3=new JLabel("Personal Information");
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        label3.setBounds(300, 140, 600, 30);
        label3.setForeground(Color.black);
        add(label3);

        JLabel labelName= new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        labelName.setForeground(Color.black);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14 ));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelFname=new JLabel("Father's Name : ");
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFname.setBounds(100, 240, 400, 30);
        labelFname.setForeground(Color.black);
        add(labelFname);

        textFname=new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel DOB=new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setForeground(Color.black);
        DOB.setBounds(100, 290, 200, 30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(120, 146, 75));
        dateChooser.setBounds(300, 290,400, 30 );
        add(dateChooser);

        JLabel gender=new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 340, 200, 30);
        gender.setForeground(Color.black);
        add(gender);

        male=new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 16));
        male.setBackground(new Color(120, 146, 75));
        male.setBounds(300, 340, 60, 30);
        male.setForeground(Color.black);
        add(male);

        female=new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 16));
        female.setBackground(new Color(120, 146, 75));
        female.setBounds(450, 340, 80, 30);
        female.setForeground(Color.black);
        add(female);

        Others= new JRadioButton("Other");
        Others.setFont(new Font("Raleway", Font.BOLD, 16));
        Others.setBackground(new Color(120, 146, 75));
        Others.setBounds(600, 340, 120, 30);
        Others.setForeground(Color.black);
        add(Others);

        ButtonGroup Bgroup=new ButtonGroup();
        Bgroup.add(male);
        Bgroup.add(female);
        Bgroup.add(Others);

        JLabel Email= new JLabel("Email Address :");
        Email.setFont(new Font("Raleway", Font.BOLD, 20));
        Email.setBounds(100, 390, 400, 30);
        Email.setForeground(Color.black);
        add(Email);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel Mstatus=new JLabel("Marital Status :");
        Mstatus.setFont(new Font("Raleway", Font.BOLD, 20));
        Mstatus.setBounds(100, 440, 400, 30);
        Mstatus.setForeground(Color.black);
        add(Mstatus);

        Married=new JRadioButton("Married");
        Married.setFont(new Font("Raleway", Font.BOLD, 16));
        Married.setBackground(new Color(120, 146, 75));
        Married.setBounds(300, 440, 100, 30);
        Married.setForeground(Color.black);
        add(Married);

        Unmarried= new JRadioButton("Unmarried");
        Unmarried.setFont(new Font("Raleway", Font.BOLD, 16));
        Unmarried.setBackground(new Color(120, 146, 75));
        Unmarried.setBounds(450, 440, 120, 30);
        Unmarried.setForeground(Color.black);
        add(Unmarried);

        ButtonGroup Bgroup2=new ButtonGroup();
        Bgroup2.add(Married);
        Bgroup2.add(Unmarried);

        JLabel Address=new JLabel("Address : ");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 490, 400, 30);
        Address.setForeground(Color.black);
        add(Address);

        textAddress=new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        JLabel City=new JLabel("City :");
        City.setFont(new Font("Raleway", Font.BOLD, 20));
        City.setBounds(100 ,540, 400, 30);
        City.setForeground(Color.black);
        add(City);

        textCity= new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel PIN=new JLabel("Pin Code :");
        PIN.setFont(new Font("Raleway", Font.BOLD, 20));
        PIN.setBounds(100 ,590, 400, 30);
        PIN.setForeground(Color.black);
        add(PIN);

        textPin= new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel State=new JLabel("State :");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100 ,640, 400, 30);
        State.setForeground(Color.black);
        add(State);

        textState= new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next=new JButton("NEXT ");
        next.setFont(new Font("Raleway", Font.BOLD,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 710, 100, 35);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(120, 146, 75));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = form;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (Others.isSelected()) {
            gender = "Other";
        }

        String email = textEmail.getText();
        String marital = "";
        if (Married.isSelected()) {
            marital = "Married";
        } else if (Unmarried.isSelected()) {
            marital = "Unmarried";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            // Validate Date of Birth
            Date dobDate = dateChooser.getDate();
            if (dobDate == null) {
                JOptionPane.showMessageDialog(null, "Please fill all fields");
                return;
            }
            Date currentDate = new Date();
            long ageDifferenceInMillis = currentDate.getTime() - dobDate.getTime();
            long age = ageDifferenceInMillis / (1000L * 60 * 60 * 24 * 365);

            if (textName.getText().equals("") || textFname.getText().equals("") || gender.equals("") || dob.isEmpty() || marital.equals("") || textEmail.getText().equals("") || textAddress.getText().equals("") || textPin.getText().equals("") || textCity.getText().equals("") || textState.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            }else if (age < 18) {
                JOptionPane.showMessageDialog(null, "Age must be 18 above");
            }else if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Email Address");
            }else if (!isNumeric(pincode)) {
                JOptionPane.showMessageDialog(null, "Enter a valid PIN");
            }else {

                Conn c = new Conn();
                String q = "insert into NewUserSignUp values('" + formno + "', '" + name + "', '" + fname + "','" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + pincode + "', '" + state + "')";
                c.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    private boolean isValidEmail(String email) {
        String emailRegex;
        emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    private boolean isNumeric(String str) {
        return str.matches("\\d{6}");
    }
    public static void main(String[] args) {
        new Signup();
    }
}
