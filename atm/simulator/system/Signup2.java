package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    String x="---select option---";
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField PanNo, AadharNo;
    JRadioButton SCyes, SCno, EAyes, EAno;
    JButton submit;
    Signup2(String formno ){

        super("APPLICATION FORM PAGE 2");
        this.formno=formno;

        ImageIcon bank = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank1=bank.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank2= new ImageIcon(bank1);
        JLabel bankimage=new JLabel(bank2);
        bankimage.setBounds(100,20, 100, 100);
        add(bankimage);

        JLabel form=new JLabel("Form no :");
        form.setFont(new Font("Raleway", Font.BOLD, 30));
        form.setBounds(350, 50, 600, 28);
        form.setForeground(Color.black);
        add(form);

        JLabel form1=new JLabel(formno);
        form1.setFont(new Font("Raleway", Font.BOLD, 20));
        form1.setBounds(470,30, 200, 30);
        form1.setForeground(Color.black);
        add(form1);

        JLabel page=new JLabel(" PAGE 2 ");
        page.setFont(new Font("Raleway", Font.BOLD, 15));
        page.setBounds(730,10, 200, 30);
        page.setForeground(Color.black);
        page.setForeground(Color.black);
        add(page);

        JLabel Additional=new JLabel("Additional Details");
        Additional.setFont(new Font("Raleway", Font.BOLD, 20));
        Additional.setBounds(350,100, 600, 40);
        Additional.setForeground(Color.black);
        add(Additional);

        JLabel Religion=new JLabel("Religion :");
        Religion.setFont(new Font("Raleway", Font.BOLD, 18));
        Religion.setBounds(100,150, 100, 30);
        Religion.setForeground(Color.black);
        add(Religion);

        String Religion1[]={"---select option---","Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox=new JComboBox(Religion1);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBackground(new Color(153, 153, 153));
        comboBox.setBounds(350, 150, 320, 30);
        comboBox.setForeground(Color.black);
        add(comboBox);

        JLabel Category=new JLabel("Category :");
        Category.setFont(new Font("Raleway", Font.BOLD, 18));
        Category.setBounds(100,200, 100, 30);
        Category.setForeground(Color.black);
        add(Category);

        String Category1[]={"---select option---", "GENERAL", "OBC", "SC", "ST"};
        comboBox2= new JComboBox(Category1);
        comboBox2.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox2.setBackground(new Color(153, 153, 153));
        comboBox2.setBounds(350, 200, 320, 30);
        comboBox2.setForeground(Color.black);
        add(comboBox2);

        JLabel Income=new JLabel("Income :");
        Income.setFont(new Font("Raleway", Font.BOLD, 18));
        Income.setBounds(100,250, 100, 30);
        Income.setForeground(Color.black);
        add(Income);


        String Income1[]={"---select option---", "0 - 1,00,000 INR", "< 2,00,000 INR", "< 2,50,000 INR", "< 3,00,000 INR","< 4,00,000 INR", "< 5,00,000 INR"};
        comboBox3=new JComboBox(Income1);
        comboBox3.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox3.setBackground(new Color(153, 153, 153));
        comboBox3.setBounds(350, 250, 320, 30);
        comboBox3.setForeground(Color.black);
        add(comboBox3);

        JLabel EQ=new JLabel("Education Qualification :");
        EQ.setFont(new Font("Raleway", Font.BOLD, 18));
        EQ.setBounds(100,300, 250, 30);
        EQ.setForeground(Color.black);
        add(EQ);

        String Education[]={"---select option---", "Matrix", "Intermediate", "Graduate", "Post-Graduate", "Other"};
        comboBox4=new JComboBox(Education);
        comboBox4.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox4.setBackground(new Color(153, 153, 153));
        comboBox4.setBounds(350, 300, 320, 30);
        comboBox4.setForeground(Color.black);
        add(comboBox4);


        JLabel Occupation=new JLabel("Occupation");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        Occupation.setBounds(100,350, 100, 30);
        Occupation.setForeground(Color.black);
        add(Occupation);

        String Ocupation1[]={"---select option---", "Self-Employed", "Student", "Salaried", "Business", "House-Wife", "Retired", "Other"};
        comboBox5=new JComboBox(Ocupation1);
        comboBox5.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox5.setBackground(new Color(153, 153, 153));
        comboBox5.setForeground(Color.black);
        comboBox5.setBounds(350, 350, 320, 30);
        add(comboBox5);

        JLabel PAN=new JLabel("PAN Number :");
        PAN.setFont(new Font("Raleway", Font.BOLD, 18));
        PAN.setBounds(100,400, 250, 30);
        PAN.setForeground(Color.black);
        add(PAN);

        PanNo=new JTextField();
        PanNo.setFont(new Font("Raleway", Font.BOLD,14 ));
        PanNo.setBounds(350, 400, 320, 30);
        add(PanNo);

        JLabel Aadhar=new JLabel("Aadhar Number :");
        Aadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        Aadhar.setBounds(100,450, 250, 30);
        Aadhar.setForeground(Color.black);
        add(Aadhar);
        AadharNo=new JTextField();
        AadharNo.setFont(new Font("Raleway", Font.BOLD,14 ));
        AadharNo.setBounds(350, 450, 320, 30);
        add(AadharNo);

        JLabel Citizen=new JLabel("Senior Citizen :");
        Citizen.setFont(new Font("Raleway", Font.BOLD, 18));
        Citizen.setBounds(100,500, 250, 30);
        Citizen.setForeground(Color.black);
        add(Citizen);
        SCyes=new JRadioButton("Yes");
        SCyes.setFont(new Font("Raleway", Font.BOLD, 18));
        SCyes.setBackground(new Color (153, 153, 153));
        SCyes.setBounds(350, 500, 60, 30);
        SCyes.setForeground(Color.black);
        add(SCyes);
        SCno=new JRadioButton("No");
        SCno.setFont(new Font("Raleway", Font.BOLD, 18));
        SCno.setBackground(new Color (153, 153, 153));
        SCno.setBounds(460, 500, 60, 30);
        SCno.setForeground(Color.black);
        add(SCno);
        ButtonGroup B1=new ButtonGroup();
        B1.add(SCyes);
        B1.add(SCno);

        JLabel EAcc=new JLabel("Existing Account : ");
        EAcc.setFont(new Font("Raleway", Font.BOLD, 18));
        EAcc.setBounds(100,550, 250, 30);
        EAcc.setForeground(Color.black);
        add(EAcc);
        EAyes=new JRadioButton("Yes");
        EAyes.setFont(new Font("Raleway", Font.BOLD, 18));
        EAyes.setBackground(new Color (153, 153, 153));
        EAyes.setBounds(350, 550, 60, 30);
        EAyes.setForeground(Color.black);
        add(EAyes);
        EAno=new JRadioButton("No");
        EAno.setFont(new Font("Raleway", Font.BOLD, 18));
        EAno.setBackground(new Color (153, 153, 153));
        EAno.setBounds(460, 550, 60, 30);
        EAno.setForeground(Color.black);
        add(EAno);
        ButtonGroup B2=new ButtonGroup();
        B2.add(EAyes);
        B2.add(EAno);

        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 18));
        submit.setBackground(Color.white);
        submit.setForeground(Color.BLACK);
        submit.setBounds(570, 640, 100, 30);
        submit.addActionListener(this);
        add(submit);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color (153, 153, 153));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel=(String) comboBox.getSelectedItem();
        String cat=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();

        String pan=PanNo.getText();
        String aadhar=AadharNo.getText();

        String citizen="";
        if(SCyes.isSelected()){
            citizen="Yes";
        } else if (SCno.isSelected()) {
            citizen="No";
        }

        String Eacc="";
        if(EAyes.isSelected()){
            Eacc="Yes";
        } else if (EAno.isSelected()) {
            Eacc="No";
        }

        try{
        if(PanNo.getText().equals("")  || AadharNo.getText().equals("") ||rel.equals(x) || cat.equals(x) || inc.equals(x) || edu.equals(x) || occ.equals(x) || citizen.isEmpty()|| Eacc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all fields");
        }else if (PanNo.getText().length() !=10) {
            JOptionPane.showMessageDialog(null, "Length of Pan card should be 10 alphanumeric");
        } else if (!aadhar.matches("\\d{12}")) {
            JOptionPane.showMessageDialog(null, "Aadhar length should be 12 digit ");
        }else if (EAyes.isSelected()) {
            JOptionPane.showMessageDialog(null, "You already have an existing account.");
        }
        else{
            Conn c1=new Conn();
            String q= "insert into UserSignUp values ('"+formno+"','"+rel+"', '"+cat+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"','"+aadhar+"', '"+citizen+"', '"+Eacc+"')";
            c1.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);
        }}catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
