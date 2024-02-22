
import javax.swing.*;
import java.awt.*;

public  class Splash extends JFrame implements Runnable{
    Thread t;

    Splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("powerful-lightning-strikes-on-earths-america-side-and-makes-cracks-on-surface-of-sphere-3d-illustration-PPKK17.jpg"));
        //Image i2i1.getImage().getScaledInstance(730,550, Image.SCALE_DEFAULT);
        //ImageIcon i3-newIcon(i2);

        JLabel image=new JLabel(i1);
        add(image);
        setVisible(true);

        for(int i=1;i<500;i++){
            setSize(i,i);
            setLocation(400,150);
            try{
                Thread.sleep(05);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        t=new Thread(this);
        t.start();}
    // setVisible(true);}
    public void run(){
        try{

            Thread.sleep(5000);
            setVisible(false);
        new LoginFrame();
        }catch(Exception e)
        {
            e.printStackTrace();

        }
    }
    public static void main(String[]args){

        new Splash();

    }

}

//class LoginPanel extends JPanel {
//    LoginPanel() {
//        JLabel usernameLabel = new JLabel("Username:");
//        JTextField usernameField = new JTextField(20);
//        JLabel passwordLabel = new JLabel("Password:");
//        JPasswordField passwordField = new JPasswordField(20);
//
//        setLayout(new GridLayout(2, 2));
//        add(usernameLabel);
//        add(usernameField);
//        add(passwordLabel);
//        add(passwordField);
//    }
//}

//class SplashPanel extends JPanel {
//    SplashPanel() {
//        ImageIcon splashImage = new ImageIcon("splash.png");
//        JLabel imageLabel = new JLabel(splashImage);
//        add(imageLabel);
//    }
//}
//
//class MainFrame extends JFrame {
//    MainFrame() {
//        super("Main Frame");
//        setLayout(new BorderLayout());
//
//        JPanel loginPanel = new LoginPanel();
//        JPanel splashPanel = new SplashPanel();
//
//        add(loginPanel, BorderLayout.CENTER);
//        add(splashPanel, BorderLayout.NORTH);
//
//        setSize(400, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new MainFrame();
//    }
//}

