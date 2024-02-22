import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Scanner;

//class s{
//    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==4||j==1&&j<3)
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//}
//class Fibo{
//    public static void main(String[] args) {
//        int n=0,n2=1,n3,i,count=10;
//        System.out.print(n+""+n2);
//        for(i=2;i<count;i++){
//            n3=n+n2;
//            System.out.print(""+n3);
// n=n3;
//        n2=n3;}
//    }
//}
//class Fibo{
//    static int n1=0,n2=1,n3=0;
//    static void printFibo(int count){
//        if(count>0){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(""+n3);
//            printFibo(count-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int count=10;
//        System.out.print(n1+""+n2);
//        printFibo(count-2);
//    }
//}
//class Prime{
//    public static void main(String[] args){
//    int i,m=0,flag=0;
//    int n=3;
//    m=n/2;
//    if(n==0||n==1){
//        System.out.println(n+"is not prime no");
//    }else{
//        for(i=2;i<=m;i++){
//            if(n%i==0){
//                System.out.println(n+"is not prime no");
//                flag=1;
//            break;}
//            }
//        if(flag==0){
//            System.out.println(n+"is prime no");
//        }
//    }
//}}
//class Prime{
//    static void checkPrime(int n){
//        int i,m=0,flag=0;
//        m=n/2;
//        if(n==0||n==1){
//            System.out.println(n+"is not prime number");
//        }else {
//            for(i=2;i<=m;i++){
//                if(n%i==0){
//                    System.out.println(n+"is not prime no");
//                flag=1;
//                break;}
//            }
//            if(flag==0){
//                System.out.println(n+"is not prime");
//        }
//    }
//
//}
//
//    public static void main(String[] args) {
//        checkPrime(1);
//    checkPrime(3);
//    checkPrime(17)
//    ;checkPrime(20);}}
//class Prime{
//    static void checkPrime(int n){
//        int i,m=0,flag=0;
//        m=n/2;
//        if(n==0||n==1){
//            System.out.println(n+"is not prime no");
//        }else {
//            for(i=2;i<=m;i++){
//                if(n%i==0){
//                    System.out.println(n+"is not pirme");
//                flag=1;
//                break;}
//            }
//            if(flag==0){
//                System.out.println(n+"is proem no");
//        }
//    }
//}
//
//    public static void main(String[] args) {
//        checkPrime(2);
//        checkPrime(3);
//        checkPrime(6);
//    }
//    }
//class Palindr{
//    public static void main(String[] args) {
//        int r,sum=0,tmep;
//        int n=454;
//        tmep=n;
//        while (n>0){
//            r=n%10;
//            sum=(sum*10)+r;
//            n=n/10;
//        }
//        if(tmep==sum)
//            System.out.println("plaindrome no");
//    else
//            System.out.println("not plaindorme");}
//}
//class Palindorme{
//    public static void main(String[] args) {
//        String original,revrerse="";
//        Scanner in=new Scanner(System.in);
//        System.out.println("entr string/no");
//        original =in.nextLine();
//        int length=original.length();
//        for(int i=length-1;i>=0;i--)
//            revrerse =revrerse+original.charAt(i);
//        if(original.equals(revrerse))
//            System.out.println("entr no");
//        else
//            System.out.println("enrrt no isntxxx");
//    }
//}
//class Factoria{
//    public static void main(String[] args) {
//        int i,fact=1;
//        int no=54;
//        for(i=1;i<=no;i++){
//            fact=fact*i;
//
//        }
//        System.out.println(no+""+fact);
//    }
//}
//class Fac{
//    static int fac(int n){
//        if(n==0)
//            return 1;
//        else
//            return (n*fac(n-1));
//
//    }
//
//    public static void main(String[] args) {
//        int i,fac=1;
//        int no=4;
//        fac=fac(no);
//        System.out.println(no+"is"+fac);
//    }
//}
//class Armsr{
//    public class Armstorng{
//        static boolean isArmstrong(int n){
//            int temp,digit=0,last=0,sum=0;
//            temp=n;while (temp>0){temp=temp/10;
//                digit++;
//
//        }
//        temp=n;
//            while (temp>0){
//                last=temp%10;
//                sum +=(Math.pow(last,digit));
//                temp=temp/10;
//            }
//            if(n==sum)
//                return true;
//            else
//                return false;
//    }
//
//        public static void main(String[] args) {
//            int num;
//            Scanner sc=new Scanner(System.in);
//            System.out.print("ent no");
//num    =sc.nextInt();
//        if(isArmstrong(num)){
//
//                System.out.println("arm");}
//        else
//                System.out.println("no n");}
//        }
//}
//class LocalDatee{
//    public static void main(String[] args) {
//        LocalDate date1=LocalDate.of(2024,2,12);
//        System.out.println(date1.isLeapYear());
//        LocalDate date2=LocalDate.of(2015,1,24);
//        System.out.println(date2.isLeapYear());
//    }
////}
//class A{
//    int i=20;
//    class S extends A{
//        void drw(){
//            System.out.println(i++);
//        }
//        class W extends A{
//            void drw(){
//                System.out.println(i*8);
//            }
//            class Q extends A{
//                void drw(){
//                    System.out.println(i--);
//                }}
//
//                public static void main(String[] args) {
//                    A s=new A();
//                    Q a=new Q();
//
//                    }
//                }
//            }
//        }
//    }
//}
//class X{
//    int id;
//    String name;
//    X(int i,String n2){
//        id=i;
//        name =n2;}
//        void SHow(){
//        System.out.println(id+""+name);
//    }
//
//
//    public static void main(String[] args) {
//        X a=new X(2,"sw");
//        X s=new X(12,"43");
//        a.SHow();
//        s.SHow();}
//    }
//
//class S{
//    public static void main(String[] args) {
//        char ch1='a';
//        char ch2='b';
//        int ascivalue1=ch1;
//        int ascivalue=ch2;
//        System.out.println(ch1+""+ascivalue1);
//        System.out.println(ch2+""+ascivalue);
//    }
//}
//class Print{
//    public static void main(String[] args) {
//        System.out.println("ent no");
//       Scanner sc=new Scanner(System.in);
//       char ch=sc.next().charAt(0);
//       int  asciivalue =ch;
//        System.out.println(ch+""+asciivalue);
//        //int ch1='a';
//        //int ch2='b';
//        //System.out.println(ch1);
//    }
//}
//class  Ascivalue{
//    public static void main(String[] args) {
//        for(int i=0;i<=25;i++){
//            System.out.println((char)i+"="+i);
//        }
//    }
//}
//class A{
//    public static void main(String[] args) {int k=1;
//        for(int i=1;i<=6;i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (j == 1 ||(( i == 1 || i == 3) && < 5)|| (i>1j == 5 & i <= 2) || i + j == k)
//                    System.out.print(" *");
//
//            } System.out.println();
//                k = k + 2;
//            }
//        }}
//
//class A {
//    public static void main(String[] args) {
//        int k = 1;
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (j == 1 || ((i == 1 || i == 4) && j < 5) || (i > 1 && i < 4 && j == 5) || (i == 4 && j <= 4))
//                    System.out.print("*");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//            k = k + 2;
//        }
//    }
//}
//class B{
//    public static void main(String[] args) {
//        int l=1;
//        for(int i=1;i<=5;i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }   for(int k=1;k<=l;k++){
//
//            System.out.print("*");}
//                l=l+2;
//
//                System.out.println();
//            }}}
//
//class V{
//    public static void main(String[] args) {
//        int a=1;
//        for(int i=1;i<=5;i++){
//            for(int j=5;j>i;j--){
//                System.out.print(" ");
//            }for(int k=1;k<=a;k++) {
//                System.out.print(".");
//            }a=a+2;
//            System.out.println();}
//    }
//}
//class A{
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                if(i==1&&j<3||j==1||i==5&&j<4||i==3||j==2||i==4&&j<5||i==2&&j<4) {
//
//                    System.out.print(".");
//                }else
//                    System.out.print("");
//                }
//            System.out.println();
//            }class B extends A{
//            public static void main(String[] args) {
//                for(int i=1;i<=5;i++){
//                    for(int j=1;j<=5;j++){
//                        if(i==1&&j<3||j==1||i==5&&j<4||j==2||i==4&&j<5||i==2&&j<4) {
//
//                            System.out.print(".");
//                        }else
//                            System.out.print("");
//                    }
//                    System.out.println();
//
//                }
//        }
//}}}
//class S{
//    public static void main(String[] args) {
//    class SS extends S{
//        {
//            System.out.println("cvx");
//        }class X extends S {
//            public void c() {
//                System.out.println("xxxxxxx");
//
//            }
//        }}}    }
//class A{
//    int id;
//    String name;
//A(int i,String n) {
//    id = i;
//    name = n;
//}
//void display() {
//    System.out.println(id + "" + name);
//}}
//class Z{
//    public static void main(String[] args) {
//        A s=new A(12,"aa");
//        A x=new A(32,"s");
//        s.display();
//        x.display();
//    }}
//class A{
//    public static void main(String[] args) {
//        int a=2;int b=2;
//        do{
//
//            System.out.println(a*b);
//        }while (true);
//
//    }
//}
//class Labelna
//{
//    public static void main(String[] args) {
//        JFrame f=new JFrame("label exmaple");
//        JLabel l1,l2;
//        l1=new JLabel("first label");
//        l1.setBounds(50,50,100,30);
//    l2=new JLabel("second la");
//    l2.setBounds(50,100,100,30);
//    f.add(l1);f.add(l2);
//    f.setSize(300,300);
//    f.setLayout(null);
//    f.setVisible(true);}
//}
//class Label extends Frame implements ActionListener{
//    JTextField tf;JLabel l;JButton b;
//    Label(){
//        tf=new JTextField();
//        tf.setBounds(50,50,150,20);
//        l=new JLabel();
//        l.setBounds(50,100,250,20);
//        b=new JButton("find me");
//        b.setBounds(50,100,250,20);
//
//        b.addActionListener(this);
//        add(b);add(tf);add(l);
//        setSize(400,400);
//    setLayout(null);
//    setVisible(true);}
//public void actionPerformed(ActionEvent e){
//        try {
//            String host=tf.getText();
//            String ip=java.net.InetAddress.getByName(host).getHostAddress();
//            l.setText(host+"ss"+ip);
//        }catch (Exception ex){
//            System.out.println(ex);
//}}
//
//    public static void main(String[] args) {
//        new Label();
//    }}
//
//import javax.swing.*;
//        import java.awt.*;
//
//class Logimnn extends JFrame    {
//    JTextField tf;JLabel l;JButton b;
//    Logimnn() {
//        super("Login page");
//
//        // Set the background color of the content pane
//        getContentPane().setBackground(Color.WHITE);
//
//        // Set the default close operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set layout to FlowLayout
//        setLayout(new FlowLayout());
//
//        // Create and add a label for "Username"
//        JLabel lb= new JLabel("Username:");
//        lb.setBounds(300,20,100,20);
//        add(lb);
//    //    setSize(200,1000);
//        JTextField username=new JTextField();
//        username.setBounds(400,200,300,100);
//        add(username);
//setLocationRelativeTo(null);
//        // Create and add a label for "Password"
//        JLabel l = new JLabel("Password:");
//        lb.setBounds(600,40,200,40);
//
//        add(l);
//
//        // Set the size of the frame
//        setSize(300, 300);
//        JLabel login=new JLabel("login in as");
//        login.setBounds(100,100,100,20);
//        add(login);
//        setSize(640,300);
//        setLocation(400,200);
//        setVisible(true);
//
//        // Set the location of the frame on the screen
//        setLocationRelativeTo(null); // Center the frame on the screen
//
//        // Make the frame visible
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        // Create an instance of the Loginn class (i.e., the login page)
//        new Logimnn();
//    }
//}
import javax.swing.*;
        import java.awt.*;

//class LoginFrame extends JFrame {
//    LoginFrame() {
//        super("Login page");
//
//        // Set the background color of the content pane
//        getContentPane().setBackground(Color.WHITE);
//
//        // Set the default close operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set layout to GridLayout with 4 rows and 1 column
//        setLayout(new GridLayout(3, 1));
//
//
//        // Create and add a label for "Username"
//        JLabel usernameLabel = new JLabel("Username:");
//        usernameLabel.setBounds(300,20,100,20);
//        add(usernameLabel);
//
//        // Create and add a text field for username
//        JTextField usernameField = new JTextField(20);
//        add(usernameField);
//
//        // Create and add a label for "Password"
//        JLabel passwordLabel = new JLabel("Password:");
//       // passwordLabel.setBounds(300,60,100,20);
//        add(passwordLabel);
//
//        // Create and add a password field for password
//        JPasswordField passwordField = new JPasswordField(20);
//       // passwordField.setBounds(400,60,150,20);
//        add(passwordField);
//
//        // Create and add a login button
//    //    JButton loginButton = new JButton("Login");
//        //loginButton.setBounds(300,100,100,20);
//    //    add(loginButton);
//Choice login=new Choice();
//login.add("admin");
//login.add("customer");
//login.setBounds(300,200,150,20);
//add(login);
//ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("minions.jpeg"));
//Image i2=i1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
//JButton loginn=new JButton("login",new ImageIcon(i2));
//JButton cancel=new JButton("cncel");
//        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icons8-cancel-48.png"));
//        Image i4=i3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
//        JButton cancl=new JButton("calcll",new ImageIcon(i4));
//
//cancel.setBounds(110,110,100,20);
//add(cancel);
//
//        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("minions.jpeg"));
//        Image i6=i5.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
//        JButton signupp=new JButton("signupp",new ImageIcon(i6));
//
//JButton signup =new JButton("signup");
//signup.setBounds(380,200,100,20);
//add(signup);
//        JButton loxginn=new JButton("login");
//        loginn.setBounds(300,250,100,20);
//        add(loginn);
//        // Set the size of the frame
//        setSize(200, 200);
//
//        // Center the frame on the screen
//        setLocationRelativeTo(null);
//
//        // Make the frame visible
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        // Create an instance of the LoginFrame class (i.e., the login page)
//        new LoginFrame();
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// class LoginFrame extends JFrame implements ActionListener {
//     JButton Login,signup;
//    LoginFrame() {
//        super("Login Page");
//
//        // Set the background color of the content pane
//        getContentPane().setBackground(Color.WHITE);
//
//        // Set the default close operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set layout to GridLayout with 5 rows and 2 columns
//        setLayout(new GridLayout(5, 2, 10, 10));
//
//        // Create and add a label for "Username"
//        JLabel usernameLabel = new JLabel("Username:");
//        add(usernameLabel);
//
//        // Create and add a text field for username
//        JTextField usernameField = new JTextField(20);
//        add(usernameField);
//
//        // Create and add a label for "Password"
//        JLabel passwordLabel = new JLabel("Password:");
//        add(passwordLabel);
//
//        // Create and add a password field for password
//        JPasswordField passwordField = new JPasswordField(20);
//        add(passwordField);
//
//        // Create and add a label for "User Type"
//        JLabel userTypeLabel = new JLabel("User Type:");
//        add(userTypeLabel);
//
//        // Create and add a dropdown for user type
//        Choice login = new Choice();
//        login.add("Admin");
//        login.add("Customer");
//        login.setBounds(330,160,100,20);
//        add(login);
//
//        // Create and add login and signup buttons
//        JButton login = new JButton("Login");
//       login.addActionListener(this);
//
//        add(login);
//
//
//
//         signup = new JButton("Signup");
//
//        signup.addActionListener(this);
//
//        add(signup);
//
//        // Set the size of the frame
//        pack();
//
//        // Center the frame on the screen
//        setLocationRelativeTo(null);
//
//        // Make the frame visible
//        setVisible(true);
//    }
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == Login) {
//
//        } else if (ae.getSource() == signup) {
//setVisible(false);
//new signup();
//        }
//    }
//
//    public static void main(String[] args) {
//        // Create an instance of the LoginFrame class (i.e., the login page)
//        new LoginFrame();
//    }
//}
///
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
//
//class LoginFrame extends JFrame implements ActionListener {
//    JButton loginButton, signupButton;
//
//    LoginFrame() {
//        super("Login Page");
//
//        // Set the background color of the content pane
//        getContentPane().setBackground(Color.WHITE);
//
//        // Set the default close operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set layout to GridLayout with 5 rows and 2 columns
//        setLayout(new GridLayout(5, 2, 10, 10));
//
//        // Create and add a label for "Username"
//        JLabel usernameLabel = new JLabel("Username:");
//        add(usernameLabel);
//
//        // Create and add a text field for username
//        JTextField usernameField = new JTextField(20);
//        add(usernameField);
//
//        // Create and add a label for "Password"
//        JLabel passwordLabel = new JLabel("Password:");
//        add(passwordLabel);
//
//        // Create and add a password field for password
//        JPasswordField passwordField = new JPasswordField(20);
//        add(passwordField);
//
//        // Create and add a label for "User Type"
//        JLabel userTypeLabel = new JLabel("User Type:");
//        add(userTypeLabel);
//
//        // Create and add a dropdown for user type
//        Choice userTypeChoice = new Choice();
//        userTypeChoice.add("Admin");
//        userTypeChoice.add("Customer");
//        add(userTypeChoice);
//
//        // Create and add login and signup buttons
//        loginButton = new JButton("Login");
//        loginButton.addActionListener(this);
//        add(loginButton);
//
//        signupButton = new JButton("Signup");
//        signupButton.addActionListener(this);
//        add(signupButton);
//
//        // Set the size of the frame
//        pack();
//
//        // Center the frame on the screen
//        setLocationRelativeTo(null);
//
//        // Make the frame visible
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == loginButton) {
//            // Handle login button click
//        } else if (ae.getSource() == signupButton) {
//            setVisible(false);
//            new Signup();
//        }
//    }
//
//    public static void main(String[] args) {
//        // Create an instance of the LoginFrame class (i.e., the login page)
//        new LoginFrame();
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginFrame extends JFrame implements ActionListener {
    JButton loginButton, signupButton;

    LoginFrame() {
        super("Login Page");

        // Set the background color of the content pane
        getContentPane().setBackground(Color.WHITE);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout to GridLayout with 5 rows and 2 columns
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create and add a label for "Username"
        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel);

        // Create and add a text field for username
        JTextField usernameField = new JTextField(20);
        add(usernameField);

        // Create and add a label for "Password"
        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        // Create and add a password field for password
        JPasswordField passwordField = new JPasswordField(20);
        add(passwordField);

        // Create and add a label for "User Type"
        JLabel userTypeLabel = new JLabel("User Type:");
        add(userTypeLabel);

        // Create and add a dropdown for user type
        Choice userTypeChoice = new Choice();
        userTypeChoice.add("Admin");
        userTypeChoice.add("Customer");
        add(userTypeChoice);

        // Create and add login and signup buttons
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        signupButton = new JButton("Signup");
        signupButton.addActionListener(this);
        add(signupButton);

        // Set the size of the frame
        pack();

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            // Handle login button click
        } else if (ae.getSource() == signupButton) {
            setVisible(false);
            new signup();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the LoginFrame class (i.e., the login page)
        new LoginFrame();
    }
}
