import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class signup extends JFrame implements ActionListener {
  //  public static void main(String[] args) {
    JButton create,back;
    Choice accountType;
    JTextField meter_no,jusername,jpassword;
        signup() {
            setSize(700,400);

            setLocation(450,150);

            setBounds(450,150,700,400);
getContentPane().setBackground(Color.white);
setLayout(null);
JPanel panel=new JPanel();
panel.setBounds(30,30,650,300);
panel.setBorder(new TitledBorder(new LineBorder(Color.blue),"Create account",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(3)));
            panel.setLayout(null);
            panel.setForeground(new Color(34,139,34));
            add(panel);
JLabel heading=new JLabel("creating Account");
heading.setBounds(100,50,140,20);
heading.setFont(new Font("tahoma",Font.BOLD,14));
panel.add(heading);
 accountType = new Choice();
accountType.add("admin");
accountType.add("customer");
accountType.setBounds(260,50,150,20);
panel.add(accountType);
            JLabel meter_noo=new JLabel("meter number");
            meter_noo.setBounds(100,90,140,20);
            meter_noo.setForeground(Color.GRAY);
            meter_noo.setFont(new Font("tahoma",Font.BOLD,14));
            panel.add(meter_noo);

              meter_no=new JTextField();
            meter_no.setBounds(260,90,150,20);
              panel.add(meter_no);
            JLabel username=new JLabel("username");
            username.setBounds(110,130,140,20);
            username.setForeground(Color.GRAY);
            username.setFont(new Font("tahoma",Font.BOLD,14));
            panel.add(username);
            jusername=new JTextField();
            jusername.setBounds(260,130,150,20);
            panel.add(jusername);
            JLabel password=new JLabel("password");
            password.setBounds(110,170,140,20);
            password.setForeground(Color.GRAY);
            password.setFont(new Font("tahoma",Font.BOLD,14));
            panel.add(password);
             jpassword=new JTextField();
            jpassword.setBounds(260,180,150,20);
            panel.add(jpassword);
 create=new JButton("create");
create.setBackground(Color.BLACK);
create.setForeground(Color.white);
create.setBounds(200,220,90,30);
create.addActionListener(this);
panel.add(create);
             back=new JButton("back");
            back.setBackground(Color.BLACK);
            back.setForeground(Color.white);
            back.setBounds(300,220,90,30);
            back.addActionListener(this);
            panel.add(back);
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("powerful-lightning-strikes-on-earths-america-side-and-makes-cracks-on-surface-of-sphere-3d-illustration-PPKK17.jpg"));
            Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image =new JLabel(i3);
            image.setBounds(415,30,250,250);
            panel.add(image);


            setVisible(true);}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==create){
        String atype=accountType.getSelectedItem();
        String susername=jusername.getText();
        String spassword=jpassword.getText();
       String smeter=meter_no.getText();

        try{
            conn c=new conn();
            //String query ="insert into login values('"+smeter+"','"+susername+"','"+spassword+"','"+atype+"')";
            String query ="insert into login (meter_no, username, password, user) values('"+smeter+"','"+susername+"','"+spassword+"','"+atype+"')";
          //  String Query ="insert into login values('"+smeter+"','"+susername+"','"+spassword+"','"+atype+"')";
           // String query = "INSERT INTO login (meter_no, username, password, user) VALUES ('"+smeter+"','"+susername+"','"+spassword+"','"+atype+"')";
           // String query = "INSERT INTO login ( meter_no,username, password, user) VALUES ('"+smeter+"','"+susername+"','"+spassword+"','"+atype+"')";

       c.s.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"account created succesfully");
        setVisible(false);
        new LoginFrame();}
        catch (Exception e){
            e.printStackTrace();
        }
    } else if (ae.getSource()==back) {
        setVisible(false);
        new LoginFrame();

    }
}

        public static void main (String[]args){
            new signup();
        }
    }
    //
